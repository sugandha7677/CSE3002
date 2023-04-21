
public class LabExperiment3 {

	public static void main(String[] args) {
		
		Undergrad u=new Undergrad();
		u.setName("Raj");
		u.setId("20BCE10111");
		u.setGPA(9);
	    u.setYear(2021);
	    System.out.println(u.toString());
	    
	    Graduate g=new Graduate();
	    g.setName("Mohan");
	    g.setId("16BCE10231");
	    g.setGPA(8.6);
	    g.setThesisTitle("fdhdfgsd");
	    System.out.println(g.toString());
	    
	}

}

class Student1{
	private String  name;
	private String id;
	private double gpa;
	
    String getName(String name) {
		return name;
	}
    double getGPA() {
    	return gpa;
    }
    
    String getId() {
    	return id;
    }
    void setName(String name) {
    	this.name=name;
    }
    
    void setGPA(double d) {
    	this.gpa=d;
    }
    
    void setId(String id) {
    	this.id=id;
    }
    
    public String toString() {
    	return name+"  "+id+"  "+gpa;
    }
}

class Undergrad extends Student1{
	private int year;
	
	void setYear(int year) {
		this.year=year;
	}
	
	int getYear() {
		return year;
	}
	public String toString(){
		return super.toString()+"  "+ year;
	}
	
}

class Graduate extends Student1{
	private String thesisTitle;
	
	void setThesisTitle(String thesisTitle) {
		this.thesisTitle=thesisTitle;
	}
	
	String getThesisTitle(){
		return thesisTitle;
	}
	
	public String toString() {
		return super.toString()+"  "+thesisTitle;
	}
	
}





class PurchaseItem{
	private String name;
	private  double unitPrice;
	
	PurchaseItem(String name,double unitPrice){
		this.name=name;
		this.unitPrice=unitPrice;
	}
	
	public PurchaseItem(){
		this.name="no item";
		this.unitPrice=0;
	}
	
	
	
	
	public double getPrice() {
		return unitPrice;
	}

	 void setPrice(double unitPrice) {
		this.unitPrice=unitPrice;
	}

	 String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	 public String toString() {
			return getName() +" @ "+unitPrice;
		}


}

class WeighedItem extends PurchaseItem{
	private double weight;
	
	public WeighedItem(){
		
	}
	
	public WeighedItem(double weight) {
		
		this.weight=weight;
	}
	
	public double getWeight() {
		
		return weight;
	}
	
	public void setWeight(double weight) {
		
		this.weight=weight;
	}
	 public double getPrice() {
		 
		return (super.getPrice()*weight);
	}
	 
	 public String toString() {
		 
		 return super.toString()+"  "+weight+"Kg"+"  "+getPrice()+"  SR";
	 }
	 
}

class CountedItem extends PurchaseItem{
	private int quantity;
	
	public CountedItem() {
		
	}
	
	public int getQuantity() {
		
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		
		this.quantity=quantity;
	}
	public double getPrice() {
		
		return super.getPrice() *quantity;
	}
	
	 public String toString() {
		 
		 return super.toString()+"  "+quantity+"units"+"  "+getPrice()+"  SR";
	 }
}

