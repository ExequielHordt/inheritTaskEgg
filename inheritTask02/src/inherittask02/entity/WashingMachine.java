/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask02.entity;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Nov 2022
 */
public class WashingMachine extends Appliance {

    private Double heaviness;

    public WashingMachine() {
    }

    public WashingMachine(Double heaviness, Double price, String colour, char energyConsumption, Double weight) {
        super(price, colour, energyConsumption, weight);
        this.heaviness = heaviness;
    }

    public Double getHeaviness() {
        return heaviness;
    }

    public void setHeaviness(Double heaviness) {
        this.heaviness = heaviness;
    }

    @Override
    public String toString() {
        return "Lavadora - > [ Precio: " + super.price + " Color: " + super.colour + " Consumo energetico: " + super.energyConsumption + " Peso: " + super.weight + " Carga: " + heaviness + " ]";
    }

}
