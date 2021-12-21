
package javaexample111randomaccessfile;

import java.io.Serializable;


public class Person implements Serializable{
    
    
    public String firstName;
    public StringBuilder secondName;
    public int age;
    public double salary;
    public Integer numberOfChildren;
    public String[] namesArray;
    public int[] intArray;

    public Person() {
        firstName = "Tommy";
        secondName = new StringBuilder("Edward");
        age = 37;
        salary = 24654.8654;
        numberOfChildren = new Integer(5);
        this.namesArray = new String[] {"Ani", "Sam", " Joe"};  
        this.intArray = new int[] {1, 2, 3, 4};
    }
    
    public void ShowInfo()
    {
        try{
            System.out.println(this.firstName);
            System.out.println(this.secondName);
            System.out.println(this.age);
            System.out.println(this.salary);
            System.out.println(this.numberOfChildren);
            System.out.println(StringInOline(this.namesArray));
            System.out.println(IntAsStringInOline(this.intArray));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    
    //==========================================================================
    //==========================================================================
    
    public static void ShowInfoStatic(Person p)
    {
        p.ShowInfo();
    }
    
    //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
    private static String StringInOline(String[] array) {
        StringBuilder str = new StringBuilder(array[0]);
        for (int i = 1; i < array.length; i++) {
            str.append(" " + array[i]);
        }
        return str.toString();
    }
    
    private static String IntAsStringInOline(int[] array) {
        StringBuilder str = new StringBuilder(Integer.toString(array[0]));
        for (int i = 1; i < array.length; i++) {
            str.append(" " + Integer.toString(array[i]));
        }
        return str.toString();
    }
}


