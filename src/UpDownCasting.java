
public class UpDownCasting {

	public static void main(String[] args) {
		
        Animal1 a = new Deer();
        Deer d = (Deer) a;
        d.grazeGrass();

        Deer d2 = new Deer();
        a  = d2;
        a = new Lion();
        eatingStyle(a);
       }
 
	   
	
	
	  static void eatingStyle(Animal1 a)   {
      if(a instanceof Lion) {
           Lion l = (Lion) a; 
           l.chasePrey();
       }
      
      else if(a instanceof Deer)   {
    	   Deer d = (Deer) a;     
    	   d.grazeGrass(); 
      }
        
   }
	  
}

class Animal1 {
	
    public void eat() 	{
    	
           System.out.println("I am eating");
    }
 }

class Lion extends Animal1 {
	
    public  void chasePrey()  {
    	
	 System.out.println("I am chasing the prey" );
	 
      } 
    }

class Deer extends Animal1 {
	
   public void grazeGrass() {
	   
          System.out.println("I am grazing greens");
	} 
   
}

	
