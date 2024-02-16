class Calculator {
    Addition a = new Addition();
    Subtraction s = new Subtraction();
    Multiplication m = new Multiplication();
    Division d = new Division();

    void performAddition(int x, int y) {
        a.add(x, y);
    }

    void performSubtraction(int x, int y) {
        s.sub(x, y);
    }

    void performMultiplication(int x, int y) {
        m.mul(x, y);
    }

    void performDivision(int x, int y) {
        d.div(x, y);
    }
}

class Addition {
    int res;

    void add(int x, int y) {
        res = x + y;
        System.out.println("Addition of two numbers = " + res);
    }
}

class Subtraction {
    int res;

    void sub(int x, int y) {
        res = x - y;
        System.out.println("Subtraction of two numbers = " + res);
    }
}

class Multiplication {
    int res;

    void mul(int x, int y) {
        res = x * y;
        System.out.println("Multiplication of two numbers = " + res);
    }
}

class Division {
    int res;

    void div(int x, int y) {
        if (y != 0) {
            res = x / y;
            System.out.println("Division of two numbers = " + res);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

class TestCalculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.performAddition(10, 50);
        c.performSubtraction(15, 4);
        c.performMultiplication(10, 4);
        c.performDivision(40, 2);
    }
}
