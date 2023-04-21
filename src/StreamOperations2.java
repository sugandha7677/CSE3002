import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperations2 {

	public static void main(String[] args) {
		
		Car c1 = new Car("Toyoto",1200,18,Car.Type.SUV);
		Car c2 = new Car("Honda", 1000, 10, Car.Type.SEDAN);
		Car c3 = new Car("Hundai",1150,11,Car.Type.HATCHBACK);
		Car c4 = new Car("Renault",1100,13,Car.Type.SUV);
		Car c5 = new Car("Hundai", 850, 8, Car.Type.HATCHBACK);
		Car c6 = new Car("Toyota", 1000,10,Car.Type.SEDAN);
		
		List<Car> myCars = Arrays.asList(c1,c2,c3,c4,c5,c6);
		
		List<Car> hatchbacks = myCars.stream() //Stream<Car>
		.filter(c -> c.getEngine() >= 1000) //Stream<Car>
		.filter(c -> c.getType()==Car.Type.HATCHBACK)//Stream<Car>
		.collect(Collectors.toList());
		
		// hatchbacks.forEach(System.out::println);
		Map<Boolean,List<Car>> isSUV = myCars.stream()
				
		.collect(Collectors.partitioningBy(c -> c.getType()==Car.Type.SUV));
		
		List<Car> suvs = isSUV.get(true);
		List<Car> nonSuv = isSUV.get(false);
		
		//suvs.forEach(System.out::println);
		//nonSuv.forEach(System.out::println);
		Map<Car.Type, List<Car>> carTypes = myCars.stream()
		.collect(Collectors.groupingBy(Car::getType));
		
		List<Car> suv = carTypes.get(Car.Type.SUV);
		List<Car> sedans = carTypes.get(Car.Type.SEDAN);
		List<Car> hatch = carTypes.get(Car.Type.HATCHBACK);
		sedans.forEach(System.out::println);

	}

}
