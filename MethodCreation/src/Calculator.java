//With argument passing and with return value
public class Calculator {
    public static void main(String[] args) {
        Calculator casio = new Calculator();
        //Method Calling
        int result = casio.add(4, 5);
        System.out.println(result);
    }

    //Method Signature
    int add(int num1, int num2) {
//        Method Defination
        int result = num1 + num2;
        return result;
    }
}
