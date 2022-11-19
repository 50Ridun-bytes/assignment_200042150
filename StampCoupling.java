package assingment2;

public class StampCouplingA {
    private int[] array = {1, 2, 3, 4, 5};
    StampCouplingC c = new StampCouplingC();
    StampCouplingB b = new StampCouplingB();
    public void start() {
        b.callB(array, c);
    }
}

public class StampCouplingB {
    public void callB(int[] array, StampCouplingC c ) {
        System.out.println("Array length: " + array.length);
        System.out.println("Name: " + c.getName());
    }
}

public class StampCouplingC {
    private String name = "Ridun";
    public String getName() {
        return name;
    }
}
/*
 --- Explanation ---
    Here StampCouplingA class is sending array and object c as parameters to StampCouplingB class. 
    But StampCouplingB class is using the length of the array and the getName() method of class StampCouplingC. 
    This is stamp coupling. This can be eliminated by passing only the necessary primitive types in the function call.
 */

