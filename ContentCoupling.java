package assingment2;

public class ContentCoupling {
    public static void main(String[] args) {
        ContentCoupling contentCoupling = new ContentCoupling();
        contentCoupling.setAge(20);
    }
}
public class ContentCoupling {
    private String ageLived;
    public int getAge() {
        return Integer.parseInt(ageLived);
    }
    public void setAge(int age) {
        this.ageLived = String.valueOf(age);
    }
}
/*
---Explanation---
Now, since I have used getter and setter, I changed the data type of variable age and changed its name to ageLived. 
But I do not need to make any changes in Coupling class.
 */
