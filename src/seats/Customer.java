/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seats;

import java.util.Scanner;

/**
 *
 * @author Abdallah Ibrahim
 */
public class Customer {

    public static String name = "  Guest  ";
    public static String Namee[] = new String[28];
    public static String Password;

    public void SignUP() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the name: ");
        name = input.nextLine();
        Namee[i] = name;
        System.out.println("Enter the password: ");
        String password = input.next();
        Password = password;
        i++;
        System.out.println("You creat an account successfully!");
        System.out.println("Welcome " + name + "! We Hope You Have More Fun!\n");

    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Customer.name = name;
    }

    public static void setName(String[] Name) {
        Customer.Namee = Name;
    }

    public static String[] getNamee() {
        return Namee;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        Customer.Password = Password;
    }

}
