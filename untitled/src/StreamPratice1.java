
import sun.rmi.transport.StreamRemoteCall;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

class StreamPractice1 {

    public static void main(String [] args)
    {
        List <Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        getFirst(list);
     //   list.stream().map(i->i+2).forEach(i->System.out.println(i));

    }
    static void getFirst(  List <Integer> list)
    {

        System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst());
    }

    static void printStack(  List <Integer> list)
    {

        Function<Integer, Integer> fun = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return  integer+2;
            }
        };
        Stream<Integer> s= list.stream();
        Stream<Integer> s1= s.map(fun);

        //s1.forEach(System.out :: print);

        System.out.println("----------------------------------------------");
        BinaryOperator<Integer> bop= new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
      System.out.println( s1.reduce(0,bop));

    }



}
