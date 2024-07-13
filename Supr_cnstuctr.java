import java.util.Scanner;

class Data {
    protected int a;

    public Data(int w) {
        a = w;
    }

    void cal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}

class Factorial extends Data {
    public Factorial(int w) {
        super(w);
    }

    void cal() {
        int i, num, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextInt();
        for (i = 1; i <= num; i = i + 1) {
            fact = fact * i;
        }
        System.out.println("factorial of " + num + " = " + fact);
        super.cal(); // call method from superclass to check even or odd
        System.out.println("given set is " + a);
    }
}

class Supr_cnstuctr extends Factorial {
    public Supr_cnstuctr(int w) {
        super(w);
    }

    void cal() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("number is prime " + num);
        } else {
            System.out.println("number is not prime " + num);
        }
        super.cal(); // call method from superclass to calculate factorial
    }

    public static void main(String[] args) {
        P_Supr x = new P_Supr(10);
        x.cal(); // call method to check if number is prime or not
    }
}
