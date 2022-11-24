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
public class luxuryYacht extends Ship {

    private int stateroomNumber;
    private int powerCV;

    public luxuryYacht() {

    }

    public luxuryYacht(int stateroomNumber, int powerCV, String registration, Double shipLength, Date yearManufacture) {
        super(registration, shipLength, yearManufacture);
        this.stateroomNumber = stateroomNumber;
        this.powerCV = powerCV;
    }

    public int getStateroomNumber() {
        return stateroomNumber;
    }

    public void setStateroomNumber(int stateroomNumber) {
        this.stateroomNumber = stateroomNumber;
    }

    public int getPowerCV() {
        return powerCV;
    }

    public void setPowerCV(int powerCV) {
        this.powerCV = powerCV;
    }

    @Override
    public String toString() {
        return "Tipo: Yate de lujo. Numero de camarotes: " + stateroomNumber + ". CV: " + powerCV + ".";
    }

}
