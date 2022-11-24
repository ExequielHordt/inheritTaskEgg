/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritextratask01.services;

import inheritextratask01.entity.luxuryYacht;

/**
 *
 * @author Exequiel Hordt
 * @version 22 Nov 2022
 */
public class luxuryYacht_Service extends shipService {

    public luxuryYacht createYacht() {
        luxuryYacht yacht = new luxuryYacht();
        super.createShip(yacht);
        System.out.print("Potencia del motor(CV): ");
        yacht.setPowerCV(read.nextInt());
        System.out.print("Numero de camarotes: ");
        yacht.setStateroomNumber(read.nextInt());
        return yacht;
    }

}
