public class LazyLoadSingelton {
    public static void main(String [] args)
    {
        ABCnew obj1= ABCnew.getObject();
        ABCnew obj2= ABCnew.getObject();
        System.out.println(obj1.equals(obj2));
    }
}
class ABCnew{
    static  ABCnew obj ;
    private ABCnew()
    {
        System.out.println("Object Created");
    }
    public  static ABCnew  getObject()
    {
        if(obj==null)
            obj= new ABCnew();
        return obj;
    }
}

