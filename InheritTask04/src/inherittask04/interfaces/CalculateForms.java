/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask04.interfaces;

import inherittask04.entity.Circle;

/**
 *
 * @author Exequiel Hordt
 * @version 10 Nov 2022
 */
public interface CalculateForms<Form> {

    public final double PI = 3.14;

    public double area(Form form);

    public double perimeter(Form form);
    
}
