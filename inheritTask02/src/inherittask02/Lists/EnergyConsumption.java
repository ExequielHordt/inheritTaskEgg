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
public enum EnergyConsumption {
    A('A'), B('B'), C('C'), D('D'), E('E'), F('F');

    private char letter;

    private EnergyConsumption(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }
}
