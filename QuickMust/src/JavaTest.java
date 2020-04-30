import java.io.IOException;

public class JavaTest implements  Inter {
    public static void method()
    {
        System.out.println("subclass static method flow");
    }


    public static void main(String args[]){
        Inter obj=new JavaTest();
        obj.defmethod();
        System.out.println("normal flow");
    }
}
interface  Inter {
    static  void intermethod()
    {
        System.out.println("inter static method flow");
    }
    default  void defmethod()
    {
        System.out.println("default method flow");
    }

}

class Mother {
     static void method()
    {
        System.out.println("static method flow");
    }

}
