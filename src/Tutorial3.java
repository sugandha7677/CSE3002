
public class Tutorial3 {

	public static void main(String[]args) {
	//	AbstractHouse h=new CommonHouse();
	//	h.build();
		
		CommonHouse c= new CommonHouse();
		
		HouseDirector hd=new HouseDirector(c);
		
		House house=hd.construHouse();
		
		
		System.out.println("        ++++++++++++");
		HighHouse h=new HighHouse();	
		HouseDirector hd1=new HouseDirector(h);
		House house1=hd1.construHouse();
	
	}
	
	
}


// abstract class AbstractHouse{
//	
//	public abstract void buildWalls();
//	public abstract void buildDoors();
//	public abstract void buildWindows();
//	public abstract void buildRoof();
//	public abstract void buildGarage();
//	
//	public void build() {
//		buildWalls();
//		buildDoors();
//		buildWindows();
//		buildRoof();
//		buildGarage();
//	}
//	
//}
//
//
//
// class CommonHouse extends AbstractHouse{
//	
//	public void buildWalls() {
//		System.out.println("Building house in ordinary houses");
//	}
//	
//	public void buildDoors() {
//		System.out.println("Building doors in ordinary houses");
//	}
//	
//	public void buildWindows() {
//		System.out.println("Building windows in ordinary houses");
//	}
//	
//	public void buildRoof() {
//		System.out.println("Building Roofs in ordinary houses");
//	}
//	
//	public void buildGarage() {
//		System.out.println("Building Garage in ordinary houses");
//	}
//}
//

 class House{
	private String base;
	private String wall;
	private String window;
	private String roof;
	private String garage;
	
	public void setBase(String base) {
		this.base=base;
	}
	
	public String getWall() {
		return wall;
	}
	
	public void setWall(String wall) {
		this.wall = wall;
	}
	
	public String getRoofed() {
		return roof;
	}
	
	public void setRoofed(String roof) {
		this.roof = roof;
	}
}
 
 abstract class HouseBuilder{
	 
	 protected House house=new House();
	 
	 public abstract void buildWalls();
		public abstract void buildDoors();
		public abstract void buildWindows();
		public abstract void buildRoof();
		public abstract void buildGarage();
		
		public House buildHouse() {
			return house;
		}
 }
 
  class CommonHouse extends HouseBuilder{

	

		
		public void buildWalls() {
			
			System.out.println(" Common house wall 4 ");
		}

		
		public void buildRoof() {
		
			System.out.println(" Common house roof ");
		}

		public void buildDoors() {
			
			System.out.println(" common house door 1 ");
		}
		
		public void buildWindows() {
			System.out.println(" common house window 2");
		}
		
		public void buildGarage() {
			System.out.println(" common house garage 1");
		}


		
	}
  
 class HighHouse extends HouseBuilder{
	 
	 public void buildWalls() {
		 
		 System.out.println(" 50 m high building");
	 }
	 
	 public void buildDoors() {
		 
		 System.out.println(" 9f high door");

	 }
	 
	 public void buildWindows() {
		 
		 System.out.println(" 3ft  high window");

	 }
	 
	 public void buildGarage() {
		 System.out.println(" 20 x 20  garage");

	 }
	 
	 public void buildRoof() {
		 System.out.println(" transparent roof ");

	 }
 }
 
 
class HouseDirector {
		private HouseBuilder houseBuilder = null;
		
		
		public HouseDirector(HouseBuilder houseBuilder) {
			this.houseBuilder = houseBuilder;
		}

				public void setHouseDirector(HouseBuilder houseBuilder) {
			this.houseBuilder = houseBuilder;
		}
		
			public House construHouse() {
			houseBuilder.buildWindows();
			houseBuilder.buildWalls();
			houseBuilder.buildDoors();
			houseBuilder.buildRoof();
			houseBuilder.buildGarage();
			return houseBuilder.buildHouse();
		}
		
}



// class Director{
//	
//	builder:Builder
//	Director(builder)
//	changeBuilder(builder)
//	make(type)
//	
//	builder.reset()
//	if(type=="simple") {
//		builder.buildStepA()
//	}else {
//		builder.buildStepB()
//		builder.buildStepZ()
//	}
//	
//	
//}
//
//interface Builder extends Director {
//	
//	String result;//:Product1
//	
//	void reset();
//	void buildStepA();
//	void buildStepB();
//	void buildStepZ();
//	
//	
//}
//
//class ConcreteBuilder1 implements Builder
//{
//	result:product1
//	reset();
//	buildStepA();
//	buildStepB();
//	buildStepZ();
//	getResult();
//	Product1
//	
//	
//}
//
//class ConcreteBuilder2 implements Builder{
//	result :product 2
//	reset() {
//		result=new Product2();
//	}
//	buildStepA();
//	buildStepB(){
//		result.setFeatureB();
//	}
//	buildStepZ();
//	getResult(){
//		return this.result;
//	}
//	Product1
//}
