/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask02.entity;

import inherittask02.Lists.EnergyConsumption;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Nov 2022
 */
public class Appliance {

    protected Double price;
    protected String colour;
    protected char energyConsumption;
    protected Double weight;

    public Appliance() {
    }

    public Appliance(Double price, String colour, char energyConsumption, Double weight) {
        this.price = price;
        this.colour = colour;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(char energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Appliance{" + "price=" + price + ", colour=" + colour + ", energyConsumption=" + energyConsumption + ", weight=" + weight + '}';
    }

}
