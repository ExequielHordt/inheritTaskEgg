/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask01;

import inherittask01.entity.Animal;
import inherittask01.entity.Cat;
import inherittask01.entity.Dog;
import inherittask01.entity.Horse;
import inherittask01.service.Animal_Service;
import inherittask01.service.feed_Service;

/**
 *
 * @author Exequiel Hordt
 * @version 02 Nov 2022
 */
public class InheritTask01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Animal dog_1 = new Dog("Stich", "Filetes", 15, "Doberman");
        Animal dog_2 = new Dog("Teddy", "Croquetas", 10, "Chihuahua");
        Animal cat = new Cat("Pelusa", "Galletas", 15, "Siamés");
        Animal horse = new Horse("Spark", "Pasto", 25, "Fino");
        Animal_Service animalService = new feed_Service();
        //Procedures
        System.out.println("Perros");
        System.out.println("******");
        animalService.feed(dog_1);
        animalService.feed(dog_2);
        System.out.println("");

        System.out.println("Gato");
        System.out.println("****");
        animalService.feed(cat);
        System.out.println("");

        System.out.println("Caballo");
        System.out.println("*******");
        animalService.feed(horse);
        System.out.println("");
    }

}
