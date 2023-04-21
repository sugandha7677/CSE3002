
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DemoContd {

       public static void main(String[] args) {
          Car c1 = new Car("Honda",1200,15);
          Car c2 = new Car("Suzuki",990,8);
         Car c3 = new Car("Ford",1000,10);
         Car c4 = new Car("Toyota",1200,17);
         Car c5 = new Car("Renault",830,4);
         
          List<Car> cars = Arrays.asList(c1,c2,c3,c4,c5);
          
        Stream<Car> s = cars.stream();
        s.forEach(c -> System.out.println(c) );
        
        System.out.println("++++++++++++++++++");
           
         cars.stream() // return a stream
         .filter(c -> c.getPrice()>6)
         .forEach(t->System.out.println(t));
         
           System.out.println("++++++++++++++++++");
           
          cars.stream()
          .sorted((car1,car2) -> car1.getMake().compareTo(car2.getMake()))
          .forEach(c -> System.out.println(c));

         System.out.println("++++++++++++++++++");
         
         cars.stream()
         .sorted(Comparator.comparing(Car::getEngine))
         .forEach(c -> System.out.println(c));

        System.out.println("++++++++++++++++++");
        
       List<Car> expensiveCars = cars.stream()
       .filter(c -> c.getPrice() > 9)
       .collect(Collectors.toList());
        expensiveCars.forEach( System.out::println);
 
       }
}