package assingment2;

public class DataCoupling {
    int numberA = 1;
    int numberB = 10;
    int numberC = 20;
    boolean allNumbersSet = true;
    Printer printer = new Printer();
    public void caller() {
        printer.printNumbers(numberA, numberB);
        printer.printNumberBoolean(numberC, allNumbersSet);
    }
}

public class Printer {
    public void printNumbers(int numberA, int numberB) {
        System.out.println("Number A: " + numberA);
        System.out.println("Number B: " + numberB);
    }
    public void printNumberBoolean(int numberC, boolean allNumbersSet) {
        System.out.println("Number C: " + numberC);
        System.out.println("All Numbers Set? " + allNumbersSet);
    }
}
/*
---Explanation---
    Here, it is visible that four parameters are being passed to print() method.
    We can prevent data coupling here by breaking the print() method into two simpler methods.
 */
