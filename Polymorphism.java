class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (2 args): " + calc.add(5, 10));
        System.out.println("Sum (3 args): " + calc.add(5, 10, 15));
    }
}

//Output
// sum (2 args): 15
// Sum (3 args): 30