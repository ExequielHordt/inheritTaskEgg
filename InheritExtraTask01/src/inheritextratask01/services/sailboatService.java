/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritextratask01.services;

import inheritextratask01.entity.Sailboat;

/**
 *
 * @author Exequiel Hordt
 * @version 16 Nov 2022
 */
public class sailboatService extends shipService {

    public Sailboat createSailboat() {
        int masts;
        Sailboat sailboat = new Sailboat();
        super.createShip(sailboat);
        System.out.print("Mastiles (Cantidad): ");
        masts = read.nextInt();
        sailboat.setMastNumber(masts);
        return sailboat;

    }
}
