import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cat2 {

	public static void main(String[] args) {
	
		Nutrition n1=new Nutrition("finger",72.0,7.3,1.3,328,3.6);
		Nutrition n2=new Nutrition("kodo",65.9,8.3,1.4,309,9.0);
		Nutrition n3=new Nutrition("little",67.0,7.7,4.7,341,341);
		Nutrition n4=new Nutrition("barnyard",65.5,6.2,2.2,307,9.8);
		Nutrition n5=new Nutrition("sorghum",72.6,10.4,1.9,349,1.6);
		Nutrition n6=new Nutrition("pearl",67.5,11.6,5.0,361,1.2);
		
		List<Nutrition> N=Arrays.asList(n1,n2,n3,n4,n5,n6);
		List<Nutrition>lowfat= N.stream()
				.filter(c->c.getfat()<3)
				.collect(Collectors.toList())
		        .forEach(System.out::println);
		
		N.stream()
		collection.sort(lowfat.getenergy())
		.forEach(t ->System.out.println(t));

	}

}

public class Nutrition  <Nutrition>{
	String type;
	double C;
	double P;
	double F;
	int energy;
	double CB;
	
	Nutrition(String t,double c,double p,double f,int e,double cb){
		type=t;
		C=c;
		P=p;
		F=f;
		energy=e;
		CB=cb;
	}
	
	double getcarbo() {
		return C;
	}
	
	double getprotein() {
		return P;
	}
	double getfat() {
		return F;
	}
	int getenergy() {
		return energy;
	}
	double getcb() {
		return CB;
	}


	
}
