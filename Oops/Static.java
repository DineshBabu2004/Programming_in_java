package Oops;

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
       System.out.println(s1.schoolName); ;
     
   
    }
}

class Student{
    String name;
    int rollNo;
    static final String schoolName = " TMHS";
}
