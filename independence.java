package assingment2;

import java.util.Scanner;

public class independence {
    public class person
    {
        String name;
        int age;
        String designation;

        public void Find_aiminlife()
        {
            String aiminlife;
            Scanner sc= new Scanner(System.in);
            aiminlife = sc.nextLine();
            System.out.println("My aim in life is "+ aiminlife);
        }
    }

    public class laptop
    {
        String model;
        int price;
        int number_of_months_of_warranty;

        public void Find_BatteryHealth()
        {
            String batteryhealth;
            Scanner sc= new Scanner(System.in);
            health = sc.nextLine();
            System.out.println("Battery health is "+ batteryhealth);
        }

    }
    /* --- Explanation --- */
    /* There exist two classes in the independence class. Both of them are independent class because none of them
     depend on another one.
     */
}
