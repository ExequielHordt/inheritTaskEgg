/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritextratask01.entity;

import java.util.Date;

/**
 *
 * @author Exequiel Hordt
 * @version 14 Nov 2022
 */
public class Motorboat extends Ship {

    private int powerCV;

    public Motorboat() {
    }

    public Motorboat(int powerCV, String registration, Double shipLength, Date yearManufacture) {
        super(registration, shipLength, yearManufacture);
        this.powerCV = powerCV;
    }

    public int getPowerCV() {
        return powerCV;
    }

    public void setPowerCV(int powerCV) {
        this.powerCV = powerCV;
    }

    @Override
    public String toString() {
        return "Tipo: Barco a motor. CV: " + powerCV + ".";
    }

}
