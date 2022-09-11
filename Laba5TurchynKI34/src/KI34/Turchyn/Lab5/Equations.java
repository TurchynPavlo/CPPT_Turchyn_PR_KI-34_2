package KI34.Turchyn.Lab5;
/**
 * Class <code>Equations</code> implements method for ctg(8x)/x expression
 * calculation
 *
 * @author Pavlo Turchyn
 * @version 1.0
 */

public class Equations {
    /**
     * Method calculates the ctg(8x)/x expression
     *
     * @param x Angle in degrees
     * @throws CalcException
     */


    public double calculate(double x) throws CalcException {
        double y, radCtg;
        radCtg = 8 * x * Math.PI / 180.0;
        try {
            y = (1.0 / Math.tan(radCtg) / x);

            // Якщо результат не є числом, то генеруємо виключення
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY ||
                    y == Double.POSITIVE_INFINITY || x % 180 == 0 || x == 0 || (8 * x) % 180.0 == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
            // створимо виключення вищого рівня з поясненням причини
            // виникнення помилки
            if (radCtg % Math.PI / x == 0.000000000)
                throw new CalcException("Exception reason: Illegal value of X for cotangent calculation");
            else if(x == 0)
                throw new CalcException("Exception reason: X = 0");
            else if (x == 45 || (8 * x) % 180.0 == 0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }

        return y;
    }
}
