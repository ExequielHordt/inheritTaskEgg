/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask01.service;

import inherittask01.entity.Animal;
import inherittask01.entity.Cat;
import inherittask01.entity.Dog;
import inherittask01.entity.Horse;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Nov 2022
 */
public class feed_Service extends Animal_Service {

    @Override
    public void feed(Animal animal) {
        if (animal.getClass() == Dog.class) {
            System.out.println("El perro " + animal.getName() + " de raza " + animal.getBreed() + " se alimenta de " + animal.getFood());
        }

        if (animal.getClass() == Cat.class) {
            System.out.println("El gato " + animal.getName() + " de raza " + animal.getBreed() + " se alimenta de " + animal.getFood());
        }

        if (animal.getClass() == Horse.class) {
            System.out.println("El caballo " + animal.getName() + " de raza " + animal.getBreed() + " se alimenta de " + animal.getFood());
        }
    }

}
