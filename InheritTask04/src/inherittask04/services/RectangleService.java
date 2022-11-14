/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask04.services;

import inherittask04.entity.Rectangle;
import inherittask04.interfaces.CalculateForms;

/**
 *
 * @author Exequiel Hordt
 * @version 11 Nov 2022
 */
public class RectangleService implements CalculateForms<Rectangle> {

    @Override
    public double area(Rectangle rectangle) {
        return rectangle.getBase() * rectangle.getHeight();
    }

    @Override
    public double perimeter(Rectangle rectangle) {
        return (rectangle.getBase() + rectangle.getHeight()) * 2;
    }

}
