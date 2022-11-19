ackage assingment2;

import java.util.Scanner;

public class ControlCouplingA {
    public void method() {
    CouplingExample couplingExample = new CouplingExample();
        couplingExample.methodA("A");
    }
}

public class CouplingExample {
    public void methodA(String arg) {
        if (args[0].equals("A")) {
            PrintA printA = new PrintA();
            printA.print();
        } else {
            PrintB printB = new PrintB();
            printB.print();
        }
    }
}
/*
--- Explanation ---
    Here, ControlCouplingA is controlling the execution flow of CouplingExample class. 
    There are many ways in which control coupling can be avoided. 
    One way is using Factory design pattern. This can be used along with Delegate design pattern to effectively rule out control coupling.
 */
