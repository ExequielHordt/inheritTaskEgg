/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherittask02.Lists;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Nov 2022
 */
public enum Colour {

    WHITE("Blanco"), BLACK("Negro"), RED("Rojo"), BLUE("Azul"), GREY("Gris");

    private String colour;

    private Colour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

}
