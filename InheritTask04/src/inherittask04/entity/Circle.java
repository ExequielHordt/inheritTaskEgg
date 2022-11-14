/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask04.entity;

/**
 *
 * @author Exequiel Hordt
 * @version 10 Nov 2022
 */
public class Circle extends Form {

    private Double radio;
    private Double diameter;

    public Circle() {
    }

    public Circle(Double radio, Double diameter) {
        this.radio = radio;
        this.diameter = diameter;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

}
