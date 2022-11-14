/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask04;

import inherittask04.entity.Circle;
import inherittask04.entity.Rectangle;
import inherittask04.services.CircleService;
import inherittask04.services.RectangleService;

/**
 *
 * @author Exequiel Hordt
 */
public class InheritTask04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircleService circleService = new CircleService();
        RectangleService rectangleService = new RectangleService();
        Circle circle = new Circle(10d, 10d);
        Rectangle rectangle = new Rectangle(18d, 12d);
        System.out.println("Circulo");
        System.out.println("*******");
        System.out.println("Area: " + circleService.area(circle));
        System.out.println("Perimetro: " + circleService.perimeter(circle));
        System.out.println("");
        System.out.println("Rectangulo");
        System.out.println("**********");
        System.out.println("Area: " + rectangleService.area(rectangle));
        System.out.println("Perimetro: " + rectangleService.perimeter(rectangle));
        System.out.println("");
    }

}
