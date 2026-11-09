package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<Integer> num = List.of(10, 2, 5, 20, 40, 60);

        List<Integer> result = num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println(result);

        List<Integer> numbers = List.of(5, 12, 8, 20, 15);

        List<Integer> result2 = numbers.stream().filter(x -> x > 10).collect(Collectors.toList());
        System.out.println(result2);

        List<String> names = List.of("Harsh", "Venu", "Ankita");
        List<String> result3 = names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(result3);

        List<Integer> numbers2 = List.of(5, 12, 5, 20, 12);
        List<Integer> result4 = numbers2.stream().distinct().collect(Collectors.toList());
        System.out.println(result4);

        List<Integer> numbers3 = List.of(10, 20, 10, 30, 20, 40);
        Set<Integer> set = new HashSet<>();
        List<Integer> result5 = numbers3.stream().filter(x -> !set.add(x)).distinct().collect(Collectors.toList());
        System.out.println(result5);

        Optional<Integer> result6 = numbers3.stream().max(Integer::compareTo);
        System.out.println(result6);

        List<Integer> numbers4 = List.of(1, 2, 3, 4, 5);
        int sum = numbers4.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        List<Integer> numbers5 = List.of(10, 20, 10, 30, 20, 10);

        Map<Integer, Long> result7 = numbers5.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(result7);


        List<Integer> numbers9 = List.of(10, 30, 20, 50, 40);

        Optional<Integer> maxSecond = numbers9.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(maxSecond);

        List<String> names2 = List.of("Java", "Spring", "Microservices");
        Optional<String> result_names2 = names2.stream().max(Comparator.comparing(String::length));
        System.out.println(result_names2);

        List<Integer> numbers10 = List.of(5, 2, 8, 1, 3);
        List<Integer> result_numbers10 = numbers10.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result_numbers10);

        class Employee {
            String name;
            String department;

            Employee(String name, String department) {
                this.name = name;
                this.department = department;

            }
        }

        List<Employee>  em = List.of( new Employee("Harsh","IT"),
                new Employee("Harsh","IT"),
                new Employee("Vikas","HR"),
                new Employee("Venu","IT"),
                new Employee("Ankita","HR"));
        Map<String,List<Employee>> result_em = em.stream().collect(Collectors.groupingBy( x ->x.department));
        System.out.println(result_em);


        class Employee2{
            String name;
            Double salary;

            Employee2(String name,Double salary){
                this.name = name;
                this.salary=salary;
            }

        }

        List<Employee2> em2 = List.of(new Employee2("Harsh",80000.00),
               new Employee2("Harsh",80000.00),
                new Employee2("Vikas",70000.00),
                new Employee2("Vinshu",100000.00));

        Optional<Employee2> result_em2 = em2.stream().max(Comparator.comparingDouble(x ->x.salary));
        System.out.println(result_em2);

        class Employee3{
            String name;
            Double salary;
            String department;

            Employee3(String name,Double salary,String department){
                this.name = name;
                this.salary=salary;
                this.department=department;
            }

        }

        List<Employee3> em3 = List.of(new Employee3("Harsh",80000.00,"IT"),
                new Employee3("Venu",60000.00,"IT"),
                new Employee3("Vikas",70000.00,"HR"),
                new Employee3("Vinshu",100000.00,"HR"));

        Map<String,Optional<Employee3>> result_em3 = em3.stream().collect(Collectors.groupingBy( x -> x.department,Collectors.maxBy(Comparator.comparingDouble(x -> x.salary))));
        result_em3.forEach((dep,Emp) -> System.out.println(dep+"->"+Emp.get().name+"->"+Emp.get().salary));
        }
    }

