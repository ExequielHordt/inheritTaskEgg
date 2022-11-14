/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask02.service;

import inherittask02.entity.Appliance;
import inherittask02.entity.Television;
import inherittask02.entity.WashingMachine;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 10 Nov 2022
 */
public class MainService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        //Variables
        ArrayList<Appliance> applianceList = new ArrayList<Appliance>();
        WashingMachine_Service washingMachine_Service = new WashingMachine_Service();
        TelevisionService televisionService = new TelevisionService();
        String answer;
        boolean flag = false;
        double totalPrice = 0;
        //Procedures
        System.out.println("Lista de Electrodomesticos");
        System.out.println("**************************");
        do {
            System.out.print("Elija una opcion:\nA)Agregar Lavadora\nB)Agregar Televisor\nC)Mostrar Precios\nD)Calcular Precio Final\nE)Salir\nOpcion seleccionada: ");
            answer = read.next().toLowerCase();
            switch (answer) {
                case "a":
                    if (applianceList.size() != 4) {
                        System.out.println("Lavadora");
                        System.out.println("********");
                        WashingMachine washingMachine = washingMachine_Service.createWashingMachine();
                        washingMachine_Service.finalPrice(washingMachine);
                        applianceList.add(washingMachine);
                        System.out.println("¡Se ha agregado con exito!");
                        flag = true;
                    } else {
                        System.out.println("Lista completa");
                    }
                    System.out.println("");
                    break;
                case "b":
                    if (applianceList.size() != 4) {
                        System.out.println("Televisor");
                        System.out.println("*********");
                        Television television = televisionService.createTelevision();
                        televisionService.finalPrice(television);
                        applianceList.add(television);
                        System.out.println("¡Se ha agregado con exito!");
                        flag = true;
                    } else {
                        System.out.println("Lista completa");
                    }

                    System.out.println("");
                    break;
                case "c":
                    int counter_WM,
                     counter_T;
                    counter_WM = 1;
                    counter_T = 1;
                    if (flag == true) {
                        System.out.println("Precios");
                        System.out.println("*******");
                        for (Appliance appliance : applianceList) {
                            if (appliance.getClass() == WashingMachine.class) {
                                System.out.println("Lavadora " + counter_WM + ". Precio: " + appliance.getPrice() + " euros");
                                counter_WM += 1;
                            } else {
                                System.out.println("Televisor " + counter_T + ". Precio: " + appliance.getPrice() + " euros");
                                counter_T += +1;
                            }

                        }
                    } else {
                        System.out.println("Primero debe agregar al menos un electrodomestico");
                    }
                    counter_T = 0;
                    counter_WM = 0;
                    System.out.println("");
                    break;
                case "d":
                    if (flag == true) {
                        System.out.println("Calcular Precio Final");
                        System.out.println("*********************");
                        for (Appliance appliance : applianceList) {
                            totalPrice += appliance.getPrice();
                        }
                        System.out.println("Precio final calculado");
                        answer = "si";
                    } else {
                        System.out.println("Primero debe agregar al menos un electrodomestico");
                    }

                    System.out.println("");
                    break;
                case "e":
                    System.out.print("¿Desea salir? (Si/No): ");
                    answer = read.next();
                    System.out.println("");
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta. Vuelva a intentarlo.");
                    System.out.println("");
                    break;
            }

        } while (!answer.equalsIgnoreCase("si"));

        if (totalPrice != 0) {
            System.out.println("El precio final de los electrodomesticos es: " + totalPrice + " euros");
        }
        System.out.println("Fin del programa");
    }
}
