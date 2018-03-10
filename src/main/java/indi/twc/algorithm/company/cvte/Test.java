package indi.twc.algorithm.company.cvte;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Method[] methods1 = student.getClass().getDeclaredMethods();
        for ( Method method1 : methods1) {
            System.out.println("method name :"+method1.getName());
        }
    }

}

class Student extends  Person {

    public void StudentName(){

    }

    protected void StudentAge(){

    }

    private void StudentAddress(){

    }
}
class Person {

    public void name_Persion(){

    }

    protected void age_Persion(){

    }

    private void address_Persion(){

    }
}
