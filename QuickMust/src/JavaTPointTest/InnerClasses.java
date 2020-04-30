package JavaTPointTest;

public class InnerClasses {
    private  int x=10;
    class Outer{
        private  void print()
        {
            System.out.println(x);
        }

    }

    public staticl void main(String [] args)
    {
        InnerClasses ic= new InnerClasses();
        Outer out= ic. new Outer();
        out.print();
    }

}
