/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Abdallah Ibrahim
 */
public class Seats {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        bus1 b1 = new bus1();
        bus2 b2 = new bus2();
        bus3 b3 = new bus3();
        Customer c = new Customer();
        int choice;
        int en;
        Entering();
        System.out.println("Enter your choice: ");
        en = Integer.parseInt(reader.readLine());
        switch (en) {
            case 1:
                c.SignUP();
                try {
                    File file = new File("customer.txt");
                    FileWriter writer = new FileWriter("customer.txt", true);
                    writer.write("Customer name: " + c.getName() + "\nCustomer password: " + c.getPassword() + "\n\n");
                    writer.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

            case 2:

                try {
                    do {
                        view();
                        System.out.println("Enter your choice: ");
                        choice = Integer.parseInt(reader.readLine());
                        switch (choice) {
                            case 1:
                                System.out.println("\t\t\t#################################################################\n"
                                                +"\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" 
                                                + "\t\t\t$$$$$$$$$$$$$$$$$$$ Our Trips Always For You! $$$$$$$$$$$$$$$$$$$\n"
                                                + "\t\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                                                + "\t\t\t#################################################################\n");
                                System.out.println("============================================================================================================\n"
                                                +  "  *** Destination   |||  The Ticket FARE  ||| Available Seats ||| Start-up - Arrival ||| Starting point ***\n"
                                                + "============================================================================================================");

                                b1.displaySAvaliableSeats();
                                b2.displaySAvaliableSeats();
                                b3.displaySAvaliableSeats();
                                System.out.print("\nEnter any key to continue...");
                                String press = reader.readLine();
                                break;
                            case 2:
                                b1.displayStutofSeat();
                                b2.displayStutofSeat();
                                b3.displayStutofSeat();
                                System.out.print("\nEnter any key to continue...");
                                press = reader.readLine();
                                break;
                            case 3:
                                System.out.println("\nWe have 3 Trips");
                                System.out.println("1. Gaza City Trip");
                                System.out.println("2. Khan Yunis City Trip");
                                System.out.println("3. Rafah City Trip");
                                System.out.println("From which Trip you want to join (1-3): ");
                                int bus = Integer.parseInt(reader.readLine());
                                switch (bus) {
                                    case 1:
                                        b1.reserveSeat();
                                        System.out.print("\nEnter any key to continue...");
                                        press = reader.readLine();
                                        break;
                                    case 2:
                                        b2.reserveSeat();
                                        System.out.print("\nEnter any key to continue...");
                                        press = reader.readLine();
                                        break;
                                    case 3:
                                        b3.reserveSeat();
                                        System.out.print("\nEnter any key to continue...");
                                        press = reader.readLine();
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println("\nWe have 3 Trips");
                                System.out.println("1. Gaza City Trip");
                                System.out.println("2. Khan Yunis City Trip");
                                System.out.println("3. Rafah City Trip");
                                System.out.println("From which Trip you want to Cancel (1-3): ");
                                int delet = Integer.parseInt(reader.readLine());
                                switch (delet) {
                                    case 1:
                                        b1.deldtReversevation();
                                        System.out.print("\nEnter any key to continue...");
                                        press = reader.readLine();
                                        break;
                                    case 2:
                                        b2.deldtReversevation();
                                        System.out.print("\nEnter any key to continue...");
                                        press = reader.readLine();
                                        break;
                                    case 3:
                                        b3.deldtReversevation();
                                        System.out.print("\nEnter any key to continue...");
                                        press = reader.readLine();
                                        break;
                                    default:
                                        System.out.println("Please Enter a Valid Seat between (1-28)..");
                                }
                                break;
                            case 5:
                                System.out.println("\nWe have 3 Trips");
                                System.out.println("1. Gaza City Trip");
                                System.out.println("2. Khan Yunis City Trip");
                                System.out.println("3. Rafah City Trip");
                                System.out.println("From which Trip you had reserved: ");
                                int bill = Integer.parseInt(reader.readLine());
                                switch (bill) {
                                    case 1:
                                        b1.Billing();
                                        break;
                                    case 2:
                                        b2.Billing();
                                        break;
                                    case 3:
                                        b3.Billing();
                                        break;
                                }
                                break;
                            case 6:
                                System.out.println("\nEnter trip number(1-3): ");
                                int ss = Integer.parseInt(reader.readLine());
                                switch (ss) {
                                    case 1:
                                        try {
                                            File file = new File("bus1.txt");
                                            FileWriter writer = new FileWriter("bus1.txt", true);
                                            writer.write("\nName: " + Customer.name + "\nTrip destination: Gaza city." + "\nThe Number Of Seat reserved: " + bus1.getTi() + "\nThe Position of seats are: " + bus1.getArrayReserve()
                                                    + "\nThe billing: " + bus1.getNewBill() + "\nThe money already paid: " + bus1.getToPay() + "\nThe rest of your money= " + bus1.getTherest() + "\n\n" + "--------------------------------\n");
                                            writer.close();
                                            System.out.println("Successfully wrote to the file.");
                                        } catch (IOException e) {
                                            System.out.println("An error occurred.");
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 2:
                                        try {
                                            File file = new File("bus2.txt");
                                            FileWriter writer = new FileWriter(file, true);
                                            writer.write("\nName: " + Customer.name + "\nTrip destination: Khan Yunis city." + "\nThe Number Of Seat reserved: " + bus2.getTi() + "\nThe Position of seats are: " + bus2.getArrayReserve()
                                                    + "\nThe billing: " + bus2.getNewBill() + "\nThe money already paid: " + bus2.getToPay() + "\nThe rest of your money= " + bus2.getTherest() + "\n\n" + "------------------------------");
                                            writer.close();
                                            System.out.println("Successfully wrote to the file.");
                                        } catch (IOException e) {
                                            System.out.println("An error occurred.");
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 3:
                                        try {
                                            File file = new File("bus3.txt");
                                            FileWriter writer = new FileWriter(file, true);
                                            writer.write("\nName: " + Customer.name + "\nTrip destination: Rafah city." + "\nThe Number Of Seat reserved: " + bus3.getTi() + "\nThe Position of seats are: " + bus3.getArrayReserve()
                                                    + "\nThe billing: " + bus3.getNewBill() + "\nThe money already paid: " + bus3.getToPay() + "\nThe rest of your money= " + bus3.getTherest() + "\n\n" + "--------------------------------");
                                            writer.close();
                                            System.out.println("Successfully wrote to the file.");
                                        } catch (IOException e) {
                                            System.out.println("An error occurred.");
                                            e.printStackTrace();
                                        }
                                        break;
                                }
                                break;

                            case 7:
                                System.out.println("\nEnter trip number(1-3): ");
                                int dd = Integer.parseInt(reader.readLine());
                                switch (dd) {
                                    case 1:
                                        try {
                                            File myObj = new File("bus1.txt");
                                            Scanner myReader = new Scanner(myObj);
                                            while (myReader.hasNextLine()) {
                                                String data = myReader.nextLine();
                                                System.out.println(data);
                                            }
                                            myReader.close();
                                        } catch (FileNotFoundException e) {
                                            System.out.println("An error occurred.");
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 2:
                                        try {
                                            File myObj = new File("bus2.txt");
                                            Scanner myReader = new Scanner(myObj);
                                            while (myReader.hasNextLine()) {
                                                String data = myReader.nextLine();
                                                System.out.println(data);
                                            }
                                            myReader.close();
                                        } catch (FileNotFoundException e) {
                                            System.out.println("An error occurred.");
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 3:
                                        try {
                                            File myObj = new File("bus3.txt");
                                            Scanner myReader = new Scanner(myObj);
                                            while (myReader.hasNextLine()) {
                                                String data = myReader.nextLine();
                                                System.out.println(data);
                                            }
                                            myReader.close();
                                        } catch (FileNotFoundException e) {
                                            System.out.println("An error occurred.");
                                            e.printStackTrace();
                                        }
                                        break;
                                }
                                break;
                            case 8:
                                System.out.println("----------------------------------------");
                                System.out.println("| Hope To See Again! Thanks A Million! |");
                                System.out.println("----------------------------------------");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("---------------------------------------------");
                                System.out.println("| Please Enter A Valid Choice between (1-5) |");
                                System.out.println("---------------------------------------------");
                        }
                    } while (choice != 8);
                } catch (Exception e) {
                }
                break;
        }
    }

    public static void view() {
        System.out.println("\n=====================================");
        System.out.println("||     Welcome To Our Program!     ||");
        System.out.println("||  We Hope To Have An Enjoy Trip! ||");
        System.out.println("=====================================\n");
        System.out.println("1. Display Trips information.");
        System.out.println("2. Display Seats Status for All Seats");
        System.out.println("3. Reserve Seats");
        System.out.println("4. Delete Reservation");
        System.out.println("5. Billing");
        System.out.println("6. Save Reservation logs");
        System.out.println("7. Show Reservation History");
        System.out.println("8. Exit");

    }

    public static void Entering() {
        System.out.println("==================================================================");
        System.out.println("|| Welcome To Our Program!                                      ||");
        System.out.println("|| Sign Up To Have to Get a Discount or You Can                 ||");
        System.out.println("|| Enter as a Guest without account but without a Discount Too! ||");
        System.out.println("==================================================================");
        System.out.println("1. SignUp.");
        System.out.println("2. Enter without account.");
        System.out.println("3. Exit");
    }
}
