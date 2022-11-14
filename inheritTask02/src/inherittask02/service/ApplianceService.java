/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask02.service;

import inherittask02.Lists.Colour;
import inherittask02.Lists.EnergyConsumption;
import inherittask02.entity.Appliance;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Nov 2022
 */
public abstract class ApplianceService {

    private char verifyEnergyConsumption(char letter) {
        boolean flagAux;
        flagAux = false;
        for (EnergyConsumption energyConsumption : EnergyConsumption.values()) {
            if (energyConsumption.getLetter() == letter) {
                flagAux = true;
            }
        }

        if (flagAux == false) {
            letter = 'F';
        }
        return letter;

    }

    private String verifyColour(String colour) {
        boolean flagAux;
        flagAux = false;

        for (Colour colourAux : Colour.values()) {
            if (colourAux.getColour().equalsIgnoreCase(colour)) {
                flagAux = true;
            }
        }

        if (flagAux == false) {
            colour = "Blanco";
        }

        return colour;
    }

    protected void createAppliance(Appliance appliance) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Double weight;
        String colour;
        char letter;
        System.out.println("Crear Electrodomestico");
        System.out.println("**********************");
        do {
            System.out.print("Peso: ");
            weight = read.nextDouble();
            if (weight < 1) {
                System.out.println("El peso ingresado NO es correcto. Intentelo de nuevo");
            }
        } while (weight < 1);

        System.out.print("Color: ");
        colour = read.next();
        System.out.print("Letra: ");
        letter = Character.toUpperCase(read.next().charAt(0));
        colour = verifyColour(colour);
        letter = verifyEnergyConsumption(letter);
        appliance.setPrice(1000d);
        appliance.setColour(colour);
        appliance.setEnergyConsumption(letter);
        appliance.setWeight(weight);
    }

    protected void finalPrice(Appliance appliance) {
        switch (appliance.getEnergyConsumption()) {
            case 'A':
                appliance.setPrice(appliance.getPrice() + 1000);
                break;
            case 'B':
                appliance.setPrice(appliance.getPrice() + 800);
                break;
            case 'C':
                appliance.setPrice(appliance.getPrice() + 600);
                break;
            case 'D':
                appliance.setPrice(appliance.getPrice() + 500);
                break;
            case 'E':
                appliance.setPrice(appliance.getPrice() + 300);
                break;
            case 'F':
                appliance.setPrice(appliance.getPrice() + 100);
                break;
        }

        if (appliance.getWeight() >= 1 && appliance.getWeight() <= 19) {
            appliance.setPrice(appliance.getPrice() + 100);
        } else if (appliance.getWeight() >= 20 && appliance.getWeight() <= 49) {
            appliance.setPrice(appliance.getPrice() + 500);
        } else if (appliance.getWeight() >= 50 && appliance.getWeight() <= 79) {
            appliance.setPrice(appliance.getPrice() + 800);
        } else {
            appliance.setPrice(appliance.getPrice() + 1000);
        }
    }
}
