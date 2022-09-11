/**
 * lab 6 package
 */


package KI34.Turchyn.Lab6;

import java.util.Scanner;
import java.io.*;

/**
 * Class <code>App</code> Implements driver for App class
 * @author Pavlo Turchyn
 * @version 1.0
 */
public class App {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        CalcWFio obj = new CalcWFio();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();
        obj.calculate(data);
        System.out.println("Result is: " + obj.getResult());
        obj.writeResTxt("lab6.txt");
        obj.writeResBin("lab6.bin");

        obj.readResBin("lab6.bin");
        System.out.println("Result is: " + obj.getResult());
        obj.readResTxt("lab6.txt");
        System.out.println("Result is: " + obj.getResult());
    }
}

