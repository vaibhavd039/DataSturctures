public class LambdaPractice {
    public  static void main(String [] args)
    {
        LambadExp exp=(str)->{
            System.out.println(str);
            return 1;
        };
        exp.check("Vaibhav");


    }

}
interface  LambadExp{
    public int check(String str);
}
