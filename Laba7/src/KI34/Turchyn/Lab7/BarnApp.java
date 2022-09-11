/**
 * lab 7 package
 */
package KI34.Turchyn.Lab7;

/**
 * Trash can Application class implements main method for Barn
 * class possibilities demonstration
 * @author Pavlo Turchyn
 * @version 1.0
 */
public class BarnApp
{
    /**
     * @param args param
     */
    public static void main(String[] args) {
        Barn <? super Data> Barn = new Barn <Data>();
        Barn.AddData(new Animal("Pig", 1, 150));
        Barn.AddData(new Grain("Wheat" , 198));
        Barn.AddData(new Grain("Oat" , 68));
        Barn.AddData(new Animal("Chicken" , 1, 5));
        Data res = Barn.findMax();
        System.out.print("The biggest data in barn is: \n");
        res.print();
    }
}
