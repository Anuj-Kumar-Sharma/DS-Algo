import java.util.*;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.BinaryOperator;

interface TestInterf{
public void sumofvar(int a,int b);
}
interface NewInterf{
public int getlen(String s);
}
interface Fun{
public String convert(String s);
}

class JavaEight{
public static void main(String []args)
{
/*TestInterf sum = (a,b) -> System.out.println(a+b);
sum.sumofvar(3,4);

NewInterf obj = (s) -> s.length();
System.out.println(obj.getlen("naman"));

Fun obj2 = (s) -> s.toUpperCase();
System.out.println(obj2.convert("naman"));


Runnable r = () -> {
for(int i=0;i<10;i++)
{
System.out.println("child thread "+i);
}
};
Thread t = new Thread(r);
t.start();
for(int i=0;i<10;i++)
{
System.out.println("main thread"+i);
}


Predicate<String> pred = s -> s.length() > 10;
System.out.println(pred.test("asdc"));

BiPredicate<Integer,Integer> pred1 = (a,b)-> (a+b)>10;
System.out.println(pred1.test(12,5));



Function<Integer,Integer> fun = a -> a*a;
System.out.println(fun.apply(3));

BiFunction<String,String,Integer> func1 = (a,b) -> (a+b).length();
System.out.println(func1.apply("Hi ","trainees!"));

Function<String,String> f1 = s -> s.toUpperCase();
Function<String,String> f2 = s -> s.substring(0,2);
System.out.println(f1.andThen(f2).apply("tata"));
System.out.println(f1.compose(f2).apply("training session"));


Function<Integer,Integer> f3 = i -> i-2;
Function<Integer,Integer> f4 = i -> i*4;
System.out.println(f3.compose(f4).apply(3)); 

Function<Integer,Integer> f5 = i -> i*4;
Function<Integer,Integer> f6 = i -> i-2;
System.out.println(f5.compose(f6).apply(3)); 


Consumer<Double> con = a -> System.out.println(a/7);
con.accept(50.0);
BiConsumer<String,String> con1 = (a,b) -> System.out.println(a+b);
con1.accept("Naman","Khurpia"); 


Supplier<Date> s = () -> new Date();
System.out.println(s.get());



IntFunction<Integer> fun = a -> a*a;
System.out.println(fun.apply(25));


IntUnaryOperator uo = a -> a+10;
System.out.println(uo.applyAsInt(40));

*/

BinaryOperator<String> binary = (a,b) -> a+b;
System.out.println(binary.apply("Fri"+"day"));

}
}