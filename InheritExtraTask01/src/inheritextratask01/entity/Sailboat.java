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
public class Sailboat extends Ship {

    private int mastNumber;

    public Sailboat() {
    }

    public Sailboat(int mastNumber, String registration, Double shipLength, Date yearManufacture) {
        super(registration, shipLength, yearManufacture);
        this.mastNumber = mastNumber;
    }

    public int getMastNumber() {
        return mastNumber;
    }

    public void setMastNumber(int mastNumber) {
        this.mastNumber = mastNumber;
    }

    @Override
    public String toString() {
        return "Tipo = Velero. Numero de mastiles: " + mastNumber + ".";
    }

}
