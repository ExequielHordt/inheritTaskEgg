/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritextratask01;

import inheritextratask01.entity.Rent;
import inheritextratask01.services.rentService;
import java.util.ArrayList;

/**
 *
 * @author Exequiel Hordt
 * @version 14 Nov 2022
 */
public class InheritExtraTask01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rentService service = new rentService();
        ArrayList<Rent> rents = service.createRent();
        service.showFinalPrices(rents);
        System.out.println("");
    }

}
