import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);
        DecimalFormat d2f = new DecimalFormat("#.##");
//item 1
        System.out.print("Enter the price of item 1: ");
        double itemOneprice = sc.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        double itemOnequan = sc.nextDouble();
//item 2
        System.out.print("Enter the price of item 2: ");
        double itemTwoprice = sc.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        double itemTwoquan = sc.nextDouble();
//item 3
        System.out.print("Enter the price of item 3: ");
        double itemThreeprice = sc.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        double itemThreequan = sc.nextDouble();
//item totals; subtotal ;tax

        //item totals
        double itemOne = itemOneprice*itemOnequan;
        double itemTwo = itemTwoprice*itemTwoquan;
        double itemThree = itemThreeprice*itemThreequan;

        double subtotal = itemOne + itemTwo + itemThree;
        double tax = subtotal * .055;
        double total = subtotal + tax;
//print
        System.out.println("Subtotal: $" +  d2f.format(subtotal));
        System.out.println("Tax: $" +  d2f.format(tax));
        System.out.println("Total: $" +  d2f.format(total));

    }
}
