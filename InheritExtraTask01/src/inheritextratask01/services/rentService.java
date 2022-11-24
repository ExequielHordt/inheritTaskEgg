/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritextratask01.services;

import inheritextratask01.List.Mooring;
import inheritextratask01.entity.Motorboat;
import inheritextratask01.entity.Rent;
import inheritextratask01.entity.Sailboat;
import inheritextratask01.entity.Ship;
import inheritextratask01.entity.luxuryYacht;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 15 Nov 2022
 */
public class rentService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Rent> createRent() {
        int personNumber, i, day, month, year;
        long id;
        Date rentDate, endRentDate;
        String name, mooringBoat;
        mooringBoat = "";
        ArrayList<Rent> rentList = new ArrayList<Rent>();
        System.out.println("Alquiler de barcos");
        System.out.println("******************");
        System.out.print("Ingrese el número de personas por alquilar: ");
        personNumber = read.nextInt();
        for (i = 0; i < personNumber; i++) {
            //Variable
            Rent rent = new Rent();
            int random = (int) (Math.random() * 4) + 1;
            //NAME
            System.out.println("Datos de la persona N° " + (i + 1));
            System.out.print("Nombre: ");
            name = read.next();
            rent.setName(name);
            //ID
            System.out.print("DNI: ");
            id = read.nextLong();
            rent.setClientId(id);
            //RENT DATE
            System.out.println("Fecha de Alguiler");
            System.out.println("*****************");
            System.out.print("Dia: ");
            day = read.nextInt();
            System.out.print("Mes: ");
            month = read.nextInt();
            System.out.print("Año: ");
            year = read.nextInt();
            rentDate = new Date(year - 1900, month - 1, day);
            rentDate = myFormat(rentDate);
            rent.setStartRent(rentDate);
            System.out.println("");
            //END RENT
            System.out.println("Fecha de devolucion");
            System.out.println("*******************");
            System.out.print("Dia: ");
            day = read.nextInt();
            System.out.print("Mes: ");
            month = read.nextInt();
            System.out.print("Año: ");
            year = read.nextInt();
            endRentDate = new Date(year - 1900, month - 1, day);
            endRentDate = myFormat(endRentDate);
            rent.setEndRent(endRentDate);
            System.out.println("");
            //MOORING
            for (Mooring mooring : Mooring.values()) {
                if (mooring.getCode() == random) {
                    mooringBoat = mooring.getName();
                }
            }
            rent.setMooringPosition(mooringBoat);
            //BOAT
            rent.setShip(selectBoat());
            rentList.add(rent);
            System.out.println("");
            System.out.println("¡" + rent.getName() + " ha sido agregado/a con exito!");
            System.out.println("");
        }
        return rentList;
    }

    public Ship selectBoat() {
        //Variables
        motorboatService motorboatServ = new motorboatService();
        sailboatService sailboatServ = new sailboatService();
        luxuryYacht_Service yacht_Service = new luxuryYacht_Service();
        String choose;
        //Procedures
        do {
            System.out.print("1)Barco (Normal) 2)Velero (Especial) 3)Barco a motor (Especial) 4)Yate de lujo (Especial)\nOpcion seleccionada: ");
            choose = read.next();
            switch (choose) {
                case "1":
                    String registration;
                    int day,
                     month,
                     year;
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
                    boatManufacture = new Date(year - 1900, month - 1, day);
                    boatManufacture = myFormat(boatManufacture);
                    Ship ship = new Ship(registration, size, boatManufacture);
                    return ship;
                case "2":
                    Sailboat sailboat = sailboatServ.createSailboat();
                    return sailboat;
                case "3":
                    Motorboat motorboat = motorboatServ.createMotorboat();
                    return motorboat;

                case "4":
                    luxuryYacht yacht = yacht_Service.createYacht();
                    return yacht;

                default:
                    System.out.println("La opcion seleccionada es incorrecta. Vuelva a intentarlo");
                    break;

            }

        } while (!choose.equals("1") && !choose.equals("2") && !choose.equals("3") && !choose.equals("4"));

        return null;
    }

    public double calculateRent(Rent rent) {
        int timeDiference, numberOfDays;
        Double finalPrice;
        finalPrice = 0.0;
        if (rent.getShip() instanceof Ship) {
            timeDiference = (int) Math.abs(rent.getEndRent().getTime() - rent.getStartRent().getTime());
            numberOfDays = (int) timeDiference / (1000 * 3600 * 24);
            finalPrice = numberOfDays * (rent.getShip().getShipLength() * 10);
        }

        if (rent.getShip() instanceof Motorboat) {
            timeDiference = (int) Math.abs(rent.getEndRent().getTime() - rent.getStartRent().getTime());
            numberOfDays = (int) timeDiference / (1000 * 3600 * 24);
            Motorboat motorboat = (Motorboat) rent.getShip();
            finalPrice = numberOfDays * (rent.getShip().getShipLength() * 10);
            finalPrice += motorboat.getPowerCV();
        }

        if (rent.getShip() instanceof Sailboat) {
            timeDiference = (int) Math.abs(rent.getEndRent().getTime() - rent.getStartRent().getTime());
            numberOfDays = (int) timeDiference / (1000 * 3600 * 24);
            finalPrice = numberOfDays * (rent.getShip().getShipLength() * 10);
            Sailboat sailboat = (Sailboat) rent.getShip();
            finalPrice += sailboat.getMastNumber();
        }

        if (rent.getShip() instanceof luxuryYacht) {
            timeDiference = (int) Math.abs(rent.getEndRent().getTime() - rent.getStartRent().getTime());
            numberOfDays = (int) timeDiference / (1000 * 3600 * 24);
            finalPrice = numberOfDays * (rent.getShip().getShipLength() * 10);
            luxuryYacht yacht = (luxuryYacht) rent.getShip();
            finalPrice += yacht.getPowerCV() + yacht.getStateroomNumber();
        }
        return finalPrice;
    }

    public void showFinalPrices(ArrayList<Rent> rents) {
        int account;
        account = 0;
        for (Rent rent : rents) {
            System.out.println(rent + "\nPrecio Alquiler: " + calculateRent(rent) + " euros");
            account += 1;
            if (account != rents.size()) {
                System.out.println("***********************");
            } else {
                System.out.println("");
            }

        }
        System.out.println("Fin del programa");
    }

    private Date myFormat(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.format(date);
        return date;
    }
}
