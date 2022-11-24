/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritextratask01.List;

/**
 *
 * @author Exequiel Hordt
 * @version 15 Nov 2022
 */
public enum Mooring {
    TROUGHT_BOW(1, "A traves de proa"), SPRIN_BOW(2, "Sprin de proa"), SPRIN_STERN(3, "Sprin de popa"), THROUGHT_STERN(4, "A traves de popa");

    private int code;
    private String name;

    private Mooring(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
