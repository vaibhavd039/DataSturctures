public class FunctionalExample {
    public static void main(String [] args)
    {
        ItestFunctionalInterface in=()->
            {
                System.out.println("Hello");
            };

in.show();


    }



    interface  ItestFunctionalInterface
    {
        public void show();
    }


}
