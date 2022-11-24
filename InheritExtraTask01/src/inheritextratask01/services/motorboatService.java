/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritextratask01.services;

import inheritextratask01.entity.Motorboat;

/**
 *
 * @author Exequiel Hordt
 * @version 16 Nov 2022
 */
public class motorboatService extends shipService {

    public Motorboat createMotorboat() {
        Motorboat motorboat = new Motorboat();
        super.createShip(motorboat);
        System.out.print("Ingrese la potencia del motor(CV): ");
        motorboat.setPowerCV(read.nextInt());
        return motorboat;
    }

    public long finalPrice(long price, Motorboat motorboat) {
        return price + motorboat.getPowerCV();
    }

}
