//create an abstract class 'Bank' with an abstract method 'getBalance'.$100,$150,$200 are deposited in banks A,B,C respectively.'Bank_A''Bank_B''Bank_C' are subclass of class Bank, each having a method named 'getBalanced'.call this method by creating an object of each of the three class
abstract class Bank {
    abstract int getBalance();
}

// Bank_A subclass of Bank
class Bank_A extends Bank {
    private int balance = 100;

    int getBalance() {
        return balance;
    }
}

// Bank_B subclass of Bank
class Bank_B extends Bank {
    private int balance = 150;

    int getBalance() {
        return balance;
    }
}

// Bank_C subclass of Bank
class Bank_C extends Bank {
    private int balance = 200;

    int getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Bank_A bankA = new Bank_A();
        Bank_B bankB = new Bank_B();
        Bank_C bankC = new Bank_C();

        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}

