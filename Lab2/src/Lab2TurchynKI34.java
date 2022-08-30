
import java.io.*;
import java.util.*;

/**
 * Клас Lab2TurchynKI34 реалізує програму до лабораторної роботи №2
 *
 * @author Pavlo Turchyn
 * @version 1.0
 * @since version 1.0
 */

public class Lab2TurchynKI34 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args function parameter
     * @throws FileNotFoundException throw about non-existent file
     */


    public static void main(String[] args) throws IOException {
        int arrsize;
        char[][] arr;
        String filler;
        int k = 0;

        File myFile = new File("Lab2TurchynKI34.txt");

        Scanner myScanSys = new Scanner(System.in);
        FileWriter myWriter = new FileWriter(myFile);

        System.out.print("Input size of array: ");
        arrsize = myScanSys.nextInt();
        myScanSys.nextLine();

        System.out.print("Input f of array:");
        filler = myScanSys.nextLine();
        if (filler.length() == 0) {
            System.out.print("\nNo placeholder character entered");
            System.exit(0);
        }
        if (filler.length() > 1) {
            System.out.print("\nToo many placeholder characters");
            System.exit(0);
        }

        arr = new char[(int) arrsize / 2 + 1][];
        int tabs = 0;
        for (int i = 0; i < (int) arrsize / 2 + 1; i++) {
            for (int j = 0; j < tabs; j++) {
                System.out.print("\t");
                myWriter.write("\t");
            }
            arr[i] = new char[(int) arrsize - k];
            for (int n = 0; n < arrsize - k; n++) {
                arr[i][n] = (char) filler.codePointAt(0);;

                System.out.print(arr[i][n] + "\t");
                myWriter.write(arr[i][n] + "\t");
            }
            tabs++;
            System.out.println();
            myWriter.write("\n");
            k += 2;
        }




        myWriter.flush();
        myWriter.close();


    }
}