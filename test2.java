class test2 {
    private int sum;
    private double dSum;
    private String strSum;

    // Constructor 1: Adding two integers
    public test2(int a, int b) {
        this.sum = a + b;
    }

    // Constructor 2: Adding three doubles
    public test2(double a, double b, double c) {
        this.dSum = a + b + c;
    }

    // Constructor 3: Concatenating two strings
    public test2(String a, String b) {
        this.strSum = a + b;
    }

    public void displayResult() {
        if (strSum != null) {
            System.out.println("Concatenated String: " + strSum);
        } else if (dSum != 0) {
            System.out.println("Sum of doubles: " + dSum);
        } else {
            System.out.println("Sum of integers: " + sum);
        }
    }

    public static void main(String[] args) {
        test2 add1 = new test2(10, 20);
        add1.displayResult();

        test2 add2 = new test2(5.5, 6.5, 7.5);
        add2.displayResult();

        test2 add3 = new test2("Hello", " World");
        add3.displayResult();
    }
}
