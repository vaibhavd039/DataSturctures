public class ThreadLamba {
    public static void main(String []  args)
    {
        Runnable r= ()->{
            System.out.println("Hello thread");
        };
        Thread t= new Thread(r);
        t.start();

    }

}
