// With arguments and without return value.
public class Calculator2 {
    public static void main(String[] args) {
        Calculator2 casio = new Calculator2();
        casio.add(4, 5);
    }

    void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}
