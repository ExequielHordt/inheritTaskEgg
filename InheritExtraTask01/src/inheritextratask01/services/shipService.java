/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritextratask01.services;

import inheritextratask01.entity.Rent;
import inheritextratask01.entity.Ship;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 16/11/2022
 */
public class shipService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void createShip(Ship ship) {
        String registration;
        int day, month, year;
        Double size;
        Date boatManufacture;
        System.out.println("Datos del barco");
        System.out.println("***************");
        System.out.print("Matricula: ");
        registration = read.next();
        System.out.print("Tamaño: ");
        size = read.nextDouble();
        System.out.println("Fecha de fabricacion");
        System.out.println("*******************");
        System.out.print("Dia: ");
        day = read.nextInt();
        System.out.print("Mes: ");
        month = read.nextInt();
        System.out.print("Año: ");
        year = read.nextInt();
        boatManufacture = new Date(year, month, day);
        boatManufacture = myFormat(boatManufacture);
        ship.setRegistration(registration);
        ship.setShipLength(size);
        ship.setYearManufacture(boatManufacture);
    }

    private Date myFormat(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        dateFormat.format(date);
        return date;
    }

}
