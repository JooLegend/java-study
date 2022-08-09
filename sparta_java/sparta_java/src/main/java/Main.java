class ArrayCalculation {

    int[] arr = { 0, 1, 2, 3, 4 };

    public int divide(int denominatorIndex, int numeratorIndex) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        return arr[denominatorIndex] / arr[numeratorIndex];
    }
}

public class Main {
    public static void main(String[] args) throws {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        try{

        } catch (ArithmeticException e, ArrayIndexOutOfBoundsException e) {

        }

        System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));
        try{System.out.println("1 / 0 = " + arrayCalculation.divide(1, 0));}
        catch(Exception e){
            System.out.println("ArithmeticException!!" + e.getMessage());
        }// java.lang.ArithmeticException: "/ by zero"
        try{System.out.println("Try to divide using out of index element = "
                + arrayCalculation.divide(5, 0));}
        catch (Exception e){
            System.out.println("ArrayIndexOutOfBoundsException!!"+e.getMessage());// java.lang.ArrayIndexOutOfBoundsException: 5
        }
    }

}