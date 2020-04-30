public class SynchronizedMethod  {
    public static void main(String [] args)
    {
        Table t= new Table();
        Runnable r1 = ()->{
            try {
                t.printTable(5);
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        };

        Runnable r2= ()->{
            try {
                t.printTable(10);
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        };

        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);
        t1.start();
        t2.start();

    }

}

class Table
{
    public synchronized void  printTable(int x )  throws  InterruptedException
    {
        for(int i=1;i<6;i++)
        {
            System.out.println(x*i);
//            Thread.sleep(1000);


        }
    }

}

