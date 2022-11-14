/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask02.service;

import inherittask02.entity.Appliance;
import inherittask02.entity.WashingMachine;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Nov 2022
 */
public class WashingMachine_Service extends ApplianceService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public WashingMachine createWashingMachine() {
        //Variables
        WashingMachine washingMachine = new WashingMachine();
        Double heaviness;
        //Procedures
        super.createAppliance(washingMachine);
        System.out.println("Crear Lavadora");
        System.out.println("**************");
        System.out.print("Carga: ");
        heaviness = read.nextDouble();
        washingMachine.setHeaviness(heaviness);
        return washingMachine;
    }
    
    public void finalPrice(WashingMachine washingMachine) {
        super.finalPrice(washingMachine);
        if (washingMachine.getHeaviness() > 30) {
            washingMachine.setPrice(washingMachine.getPrice() + 500);
        }
    }
}
