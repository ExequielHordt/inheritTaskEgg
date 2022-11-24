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
public class Ship {

    protected String registration;
    protected Double shipLength;
    protected Date yearManufacture;

    public Ship() {
    }

    public Ship(String registration, Double shipLength, Date yearManufacture) {
        this.registration = registration;
        this.shipLength = shipLength;
        this.yearManufacture = yearManufacture;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Double getShipLength() {
        return shipLength;
    }

    public void setShipLength(Double shipLength) {
        this.shipLength = shipLength;
    }

    public Date getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(Date yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    @Override
    public String toString() {
        return "Tipo: Barco normal.";
    }

}
