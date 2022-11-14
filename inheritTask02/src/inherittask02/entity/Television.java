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
public class Television extends Appliance {

    private Integer resolution;
    private boolean tuner = false;

    public Television() {
    }

    public Television(Integer resolution, Double price, String colour, char energyConsumption, Double weight) {
        super(price, colour, energyConsumption, weight);
        this.resolution = resolution;
    }

    public Integer getResolution() {
        return resolution;
    }

    public void setResolution(Integer resolution) {
        this.resolution = resolution;
    }

    public boolean isTuner() {
        return tuner;
    }

    public void setTuner(boolean tuner) {
        this.tuner = tuner;
    }

    @Override
    public String toString() {
        if (tuner) {
            return "Televisor - > [ Precio: " + super.price + " Color: " + super.colour + " Consumo energetico: " + super.energyConsumption + " Peso: " + super.weight + " Pulgadas: " + resolution + " Sintonizador(TDT): Si ]";
        } else {
            return "Televisor - > [ Precio: " + super.price + " Color: " + super.colour + " Consumo energetico: " + super.energyConsumption + " Peso: " + super.weight + " Pulgadas: " + resolution + " Sintonizador(TDT): No ]";
        }

    }

}
