import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaforEach {
    public static void main(String [] args)
    {
        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");
        Consumer cu= str->System.out.println(str);
        list.forEach(cu);
    }


}
