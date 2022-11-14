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
public class Rectangle extends Form {

    private Double base;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

}
