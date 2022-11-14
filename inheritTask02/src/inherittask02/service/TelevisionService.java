/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask02.service;

import inherittask02.entity.Television;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 09 Nov 2022
 */
public class TelevisionService extends ApplianceService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Television createTelevision() {
        //Variables
        Television television = new Television();
        int resolution;
        String answer;
        //Procedures
        super.createAppliance(television);
        System.out.println("Crear Televisior");
        System.out.println("****************");
        System.out.print("Pulgadas: ");
        resolution = read.nextInt();
        System.out.print("El televisor, ¿posee sintonizador(TDT)? Escriba 'Si' o 'No': ");
        answer = read.next();
        television.setResolution(resolution);
        if (answer.equalsIgnoreCase("SI")) {
            television.setTuner(true);
        }
        return television;
    }
    
    public void finalPrice(Television television) {
        super.finalPrice(television);
        if (television.getResolution() > 40) {
            television.setPrice(television.getPrice() * 1.30);
        }
        
        if (television.isTuner()) {
            television.setPrice(television.getPrice() + 500);
        }
    }
}
