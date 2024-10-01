// Without arguments and with return value.
public class Calculator3 {
    public static void main(String[] args) {
        Calculator3 casio = new Calculator3();
        int result = casio.add();
        System.out.println(result);
    }

    int add() {
        int num1 = 10, num2 = 20, result;
        result = num1 + num2;
        return result;
    }
}
