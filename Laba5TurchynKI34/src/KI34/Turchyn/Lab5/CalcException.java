package KI34.Turchyn.Lab5;
/**
 * Class <code>CalcException</code> more precises ArithmeticException
 *
 * @author Pavlo Turchyn
 * @version 1.0
 */

public class CalcException extends ArithmeticException {
    public CalcException() {
    }

    public CalcException(String cause) {
        super(cause);
    }
}
