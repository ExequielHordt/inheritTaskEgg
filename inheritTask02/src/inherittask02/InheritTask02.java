/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask02;

import inherittask02.entity.Appliance;
import inherittask02.entity.Television;
import inherittask02.entity.WashingMachine;
import inherittask02.service.ApplianceService;
import inherittask02.service.TelevisionService;
import inherittask02.service.WashingMachine_Service;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Nov 2022
 */
public class InheritTask02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //WashingMachine
        WashingMachine_Service washingMachine_Service = new WashingMachine_Service();
        WashingMachine washingMachine = washingMachine_Service.createWashingMachine();
        System.out.println("");
        System.out.println(washingMachine);
        System.out.println("");
        washingMachine_Service.finalPrice(washingMachine);
        System.out.println("Precio final de la Lavadora");
        System.out.println("***************************");
        System.out.println(washingMachine.getPrice() + " euros");
        //Television
        TelevisionService televisionService = new TelevisionService();
        Television television = televisionService.createTelevision();
        System.out.println("");
        System.out.println(television);
        System.out.println("");
        televisionService.finalPrice(television);
        System.out.println("Precio final del Televisor");
        System.out.println("**************************");
        System.out.println(television.getPrice() + " euros");
    }

}
