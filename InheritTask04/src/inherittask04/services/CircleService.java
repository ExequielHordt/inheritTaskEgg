/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask04.services;

import inherittask04.entity.Circle;
import inherittask04.interfaces.CalculateForms;

/**
 *
 * @author Exequiel Hordt
 * @version 11 Nov 2022
 */
public class CircleService implements CalculateForms<Circle> {

    @Override
    public double area(Circle circle) {
        return PI * Math.pow(circle.getRadio(), 2);
    }

    @Override
    public double perimeter(Circle circle) {
        return 2 * PI * circle.getDiameter();
    }
}
