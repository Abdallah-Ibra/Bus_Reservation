/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seats;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import seats.Customer;

/**
 *
 * @author Abdallah Ibrahim
 */

public class bus2 {
    public static int numOfSeat = 28;
    public static String[][] ArrayStauts = new String[7][4];
    public static int numSeatForReserved, numSeatForDelete;
    public static ArrayList<String> arrayReserve = new ArrayList<>();
    public static ArrayList<bus2>seatInfo = new ArrayList<bus2>();
    public static double bill=100;
    public static double toPay;
    public static double Therest;
    public static double newBill;
    public static int ti;
    public static double change;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private bus2(String name, Object clone) {
    }

    bus2() {
    }


    public void displaySAvaliableSeats() {
        System.out.println(" 2. Khan Yunis CITY |||    100 Dollar     |||     "+numOfSeat+" Seats    ||| 12:00 - 13:00      ||| Al-Nasser hospital");


    }

    public void displayStutofSeat() {
        System.out.println("\n** The available seats for Khan Yunis City Trip: \n");
        String reserved = Customer.name;
        String numseats = "1";
        int i = 0;
        for (i = 0; i < ArrayStauts.length; i++) {
            for (int j = 0; j <= 3; j++) {
                int intNumSeats = Integer.parseInt(numseats);

                if (arrayReserve.contains(numseats)) {
                    ArrayStauts[i][j] = reserved;
                    System.out.print("[   " + ArrayStauts[i][j] + "   ]");
                } else {
                    ArrayStauts[i][j] = numseats;
                    System.out.print("[\t" + ArrayStauts[i][j] + "\t]");
                }

                intNumSeats++;
                numseats = String.valueOf(intNumSeats);
                if (j == 3) {
                    System.out.println("");
                }

            }
        }
    }

    public void reserveSeat() {
        try {
            System.out.println("You got a chance to join Our Gaza CITY Trip!\nThere are " + numOfSeat + " seats available.");
            System.out.println("\nHow Many Passengers Are You?");
            numSeatForReserved = Integer.parseInt(reader.readLine());
            int i = 1;
            if(numSeatForReserved<=0){
                System.out.println("\nPlease enter a valid number!");
            }else{
            while (i <= numSeatForReserved) {
                System.out.print("\nEnter The number of required seat: ");
                int seatxx = Integer.parseInt(reader.readLine());
                if (seatxx > 0 && seatxx < 29) {
                    String m = String.valueOf(seatxx);
                    if (!arrayReserve.contains(m)) {
                        arrayReserve.add(m);
                        numOfSeat--;
                        i++;
                    }else {
                        System.out.println("\nThe seat is reserved! please choose another seat..");
                    }
                } else {
                    System.out.println("\nEnter a seat number between 1 and 28 only..");
                }
            }
            }
            System.out.println("\nReservation Done Successfully!\nThanks for Your reservation!");
        } catch (Exception e) {

        }
   seatInfo.add(new bus2(Customer.name,arrayReserve.clone()));
    }

    public void deldtReversevation() {
        try {
            if (arrayReserve.isEmpty()) {
                System.out.println("\nYou cannot delete any reservation!(There isn't any reservation)");
            } else {
                System.out.println("\nHow many seat's reservation you want to delet: ");
                int num=Integer.parseInt(reader.readLine());
                for (int i = 0; i < num; i++) {
                System.out.print("\nEnter the seat Number that you want to delete: ");
                numSeatForDelete = Integer.parseInt(reader.readLine());
                if (arrayReserve.contains(numSeatForDelete + "")) {
                    arrayReserve.remove(new String(numSeatForDelete + ""));
                    numOfSeat++;
                } else {
                    System.out.println("\nThis number is not reserved");
                }

             }
            }

        } catch (Exception e) {

        }
           seatInfo.remove(new bus2(Customer.name,arrayReserve.clone()));

    }
    public void Billing() {
        Scanner input = new Scanner(System.in);

        if (Customer.name != null) {
            System.out.println("\nWelcome back " + Customer.name + "!");
            ti = 28 - numOfSeat;
            System.out.println("The Number Of Seat You reserved: " + ti);
            System.out.println("The Positions of seats are: " + arrayReserve.clone());
            System.out.println("You have 20% discount!");
            change = bill * .2;
            newBill = (bill * ti) - change;
            System.out.println("Your value of discount= " + change);
            System.out.println("Your new billing = " + newBill);
            System.out.println("How much you want to pay: ");
            toPay = input.nextDouble();

            if (toPay >= newBill) {
                Therest = toPay - newBill;
                System.out.println("The rest of your money= " + Therest);
            } else {
                System.out.println("\nThis amount less than the require! \n Please check your billing and enter tne correct amount!");
            }

        } else {

            ti = 28 - numOfSeat;
            System.out.println("\nThe Number Of Seat You reserved: " + ti);
            System.out.println("The Position of seats are: " + arrayReserve.clone());

            newBill = bill * ti;
            System.out.println("unfortunately You Couldn't get any Discount because You didn't sign Up!");
            System.out.println("Your billing: " + newBill);
            System.out.println("How much you want to pay: ");
            toPay = input.nextDouble();

            if (toPay >= newBill) {
                double Therest = toPay - newBill;
                System.out.println("The rest of your money= " + Therest);
            } else {
                System.out.println("\nThis amount less than the require! \n Please check your billing and enter tne correct amount!");
                return;
            }

        }
    }

    public static int getNumOfSeat() {
        return numOfSeat;
    }

    public static void setNumOfSeat(int numOfSeat) {
        bus2.numOfSeat = numOfSeat;
    }

    public static String[][] getArrayStauts() {
        return ArrayStauts;
    }

    public static void setArrayStauts(String[][] ArrayStauts) {
        bus2.ArrayStauts = ArrayStauts;
    }

    public static int getNumSeatForReserved() {
        return numSeatForReserved;
    }

    public static void setNumSeatForReserved(int numSeatForReserved) {
        bus2.numSeatForReserved = numSeatForReserved;
    }

    public static int getNumSeatForDelete() {
        return numSeatForDelete;
    }

    public static void setNumSeatForDelete(int numSeatForDelete) {
        bus2.numSeatForDelete = numSeatForDelete;
    }

    public static ArrayList<String> getArrayReserve() {
        return arrayReserve;
    }

    public static void setArrayReserve(ArrayList<String> arrayReserve) {
        bus2.arrayReserve = arrayReserve;
    }

    public static double getBill() {
        return bill;
    }

    public static void setBill(double bill) {
        bus2.bill = bill;
    }

    public static double getToPay() {
        return toPay;
    }

    public static void setToPay(double toPay) {
        bus2.toPay = toPay;
    }

    public static double getTherest() {
        return Therest;
    }

    public static void setTherest(double Therest) {
        bus2.Therest = Therest;
    }

    public static double getNewBill() {
        return newBill;
    }

    public static void setNewBill(double newBill) {
        bus2.newBill = newBill;
    }

    public static int getTi() {
        return ti;
    }

    public static void setTi(int ti) {
        bus2.ti = ti;
    }

    public static double getChange() {
        return change;
    }

    public static void setChange(double change) {
        bus2.change = change;
    }
     }