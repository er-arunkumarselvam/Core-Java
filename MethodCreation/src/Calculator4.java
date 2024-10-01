// Without arguments and without return value
public class Calculator4 {
    public static void main(String[] args) {
        Calculator4 casio = new Calculator4();
        casio.add();
    }

    void add() {
        int num1 = 10, num2 = 20, result;
        result = num1 + num2;
        System.out.println(result);
    }
}
