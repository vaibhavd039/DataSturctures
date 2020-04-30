public class LazySingelton {
    public static void main(String [] args)
    {
        ABC obj1= ABC.getObject();
        ABC obj2= ABC.getObject();
        System.out.println(obj1.equals(obj2));
    }
}
class ABC{
    static  ABC obj= new ABC() ;
    private ABC()
    {
System.out.println("Object Created");
    }
    public  static ABC  getObject()
    {
return obj;
    }
}

