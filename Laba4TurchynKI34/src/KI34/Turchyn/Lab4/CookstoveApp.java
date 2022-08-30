/**
 * lab 4 package
 */

package KI34.Turchyn.Lab4;

import java.io.FileNotFoundException;
/**
 * Gun Application class implements main method for Stove class possibilities
 demonstration
 * @author Pavlo Turchyn
 * @version 1.0
 */

public class CookstoveApp {
    /**
     * @param args function parameter
     * @throws FileNotFoundException throw about non-existent file
     */

    public static void main(String[] args) throws  FileNotFoundException {
        GasStove object = new GasStove("Great", 10, true, "Bosch", 50, 70, true, true, 1, 10, 0);
        object.off_onCookstove();
        object.settings();
        object.True_falseOven();
        object.True_falseGasbag();

        object.changeBurner(3);
        object.FireStatusPlus(30);
        object.FireStatusMinus(5);
        object.Condition();
        object.Condition2();
        object.statusCookstove(20);
        object.Clean();

        object.Extract();
        object.dispose();
    }
}
