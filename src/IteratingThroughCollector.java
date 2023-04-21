import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.Iterator;

public class IteratingThroughCollector {

	public static void main(String[] args) {
			Motorcycle yamaha=new Motorcycle("Yamaha",55000,100);
			Motorcycle bajaj=new Motorcycle("Bajaj",48000,15);
			Motorcycle honda=new Motorcycle("Honda",55000,100);
			Motorcycle herohonda=new Motorcycle("Herohonda",55000,100);
		
	
		List<Motorcycle> cycles=Arrays.asList(yamaha,bajaj,honda,herohonda);
	
	    for(Iterator<Motorcycle>) it =cycles.iterator();it.hasNext();)
        {
        	Motorcycle mc=it.next();
        	System.out.println("Make: "+mc.getMake());
	
         }
	    for(Motorcycle mc:cycles)
	    	System.out.println("Price: "+mc.getPrice());
	    	
	    cycles.forEach(new Consumer<Motorcycle>()  // interface method
	    {
	    	public void accept(Motorcycle mc) // abstract method
	    	{
	    		System.out.println("Engine Capacity: "+ mc.getEngine());
	    	}
	     }
	    ); // indicates end of function
	
	    cycles.forEach( mc -> System.out.println("Engine Capacity:" +mc.getEngine())
	    		);
	
	
	
	
	
	
	}

}
