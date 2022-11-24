/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritextratask01.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Exequiel Hordt
 * @version 14 Nov 2022
 */
public class Rent {

    protected String name;
    protected long clientId;
    protected Date startRent;
    protected Date endRent;
    protected String mooringPosition;
    protected Ship ship;

    public Rent() {
    }

    public Rent(String name, long clientId, Date startRent, Date endRent, String mooringPosition, Ship ship) {
        this.name = name;
        this.clientId = clientId;
        this.startRent = startRent;
        this.endRent = endRent;
        this.mooringPosition = mooringPosition;
        this.ship = ship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public Date getStartRent() {
        return startRent;
    }

    public void setStartRent(Date startRent) {
        this.startRent = startRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    public String getMooringPosition() {
        return mooringPosition;
    }

    public void setMooringPosition(String mooringPosition) {
        this.mooringPosition = mooringPosition;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "El cliente " + name + " con DNI " + clientId + " realizo el alquiler del nautico con la siguientes caracteristicas:\n" + ship + " Tipo de amarre: " + mooringPosition + "." + "\nDesde la fecha " + dateFormat.format(startRent) + " hasta el " + dateFormat.format(endRent);
    }

}
