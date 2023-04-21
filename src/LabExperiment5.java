import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;


public class LabExperiment5 {

	public static void main(String[] args) {
		
		
		List<Purchase> p = Arrays.asList(
		new Purchase("BXWE7852", "Cosmetics", 873, 3, "debit"),
		new Purchase("DSFD55874","electronics", 10, 15, "credit"),
		new Purchase("fsdf56522","medicine,",56,56,"debit")
		);
		for(Purchase c: p)
			System.out.println(c);
		
		System.out.println();

		for(Purchase c1:p) {
			if(c1.Price()>50) {
				System.out.println(c1.ItemCode());
			}
			
	    }
		
		System.out.println();
		
		p.stream()
//	.filter(c ->c.PurchaseType()=="debit")
//		.forEach(t->System.out.println(t));
		
		.filter(c1 ->c1.PurchaseType()=="credit")
		.forEach(t->System.out.println(t));
		
		
		System.out.println();
		
		p.stream()
		.sorted(Comparator.comparing(Purchase::Price))
		.sorted(Comparator.comparing(Purchase::Quantity))
		.forEach(t ->System.out.println(t));
		
		

	}
	



}

class Purchase  <Purchase>{
   	 String Item_Code;
	 String Item_Type;
	 int Price;
	int Quantity;
	 String Purchase_Type;
	
	
	
	
	Purchase(String Item_Code,String Item_Type,int Price,int Quantity,
			String Purchase_Type){
		this.Item_Code=Item_Code;

		this.Item_Type=Item_Type;

		this.Price=Price;

		this.Quantity=Quantity;
		
		this.Purchase_Type=Purchase_Type;
		
	}
	
	String ItemCode(){
		return Item_Code;
	}
	
	String ItemType() {
		return Item_Type;
	}
	
	int Price() {
		return Price;
	}
	
	int Quantity() {
		return Quantity;
	}
	
	String PurchaseType() {
		return Purchase_Type;
	}
	
	
	void SetData(String Item_Code,String Item_Type,int Price,int Quantity,
			String Purchase_Type) {
		
		this.Item_Code=Item_Code;

		this.Item_Type=Item_Type;

		this.Price=Price;

		this.Quantity=Quantity;
		
		this.Purchase_Type=Purchase_Type;

	}
		
	 public String toString() {
		return (Item_Code+"  "+Item_Type+"  "+Price+"  "+
	    Quantity+"  "+Purchase_Type);
	}
	
	String itemcode() {
		if(this.Price >50 && this.Purchase_Type=="debit") {
			
			return Item_Code ;
		}
		else {
			return "No such item";
		}
	}

	}
	
	

