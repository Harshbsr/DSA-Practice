package lambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class LambdaAndStreamDemo {

    public static List<String> sortByName(List l){
        return l.stream().sorted().toList();

    }
    public static List<String> sortByLength(List l){
        return l.stream().sorted((s1,s2)->s1.toString().length()-s2.toString().length()).toList();

    }

    public static List<String> upperCase(List l){
        return l.stream().map(x -> x.toString().toUpperCase()).toList();

    }

    public static List<Integer> printNo(List l){
        return l.stream().filter( x ->(Integer) x%2==0).toList();

    }

    public static void main(String[] args){
        List<String> names = Arrays.asList("John", "Alice", "Bob", "David");
        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14, 17);
        System.out.println(sortByName(names));
        System.out.println(sortByLength(names));
        System.out.println(upperCase(names));
        System.out.println(printNo(numbers));
    }

}
