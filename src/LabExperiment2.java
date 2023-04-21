
//"java"."lang"Object";
public class LabExperiment2 {

	public static void main(String[] args) {
		
		TimeSpan t1=new TimeSpan(4,71);
		System.out.println(t1.getHours());	
		System.out.println(t1.getMinutes());
		
		
		t1.add(2,70);
		t1.getTotalHours();
		System.out.println(t1.toString());
		
		t1.add(18, 2);
		t1.getTotalHours();
		System.out.println(t1.toString());
	}

}


 class TimeSpan{
	
	private int hours;
	private int minutes;
	
	public TimeSpan(int hours,int minutes) {
		this.hours=hours;
		this.minutes=minutes;
	}
	
	public int getHours() {
		
		if(minutes>=60) {
		TimeUpdation(hours,minutes);
		}
		return hours;
	}
	
	 public void TimeUpdation(int hours,int minutes) {
			
			   			this.hours+=minutes/60;
			   			this.minutes=minutes%60;
           //             System.out.println("TimeUpdation "  );
           //             System.out.println("new time is: "+this.hours+ " "+this.minutes);
	}

	
	public int getMinutes() {
		if(minutes>=60) {
			
		TimeUpdation(hours,minutes);
		}
		
		return minutes;
		
	}
	
	
	public void add(int new_hours,int new_minutes) {
		
		
		hours+=new_hours;
		minutes+=new_minutes;
//		 System.out.println("Add "  );
//		  System.out.println("new time is: "+this.hours+ " "+this.minutes);
		if(minutes>=60) {
		         TimeUpdation(hours,minutes);

		}
		
		
	}
	
	public void  getTotalHours() {
		
		System.out.println(this.hours+"."+this.minutes);
	}
	
	public String toString() {
		return hours+"h"+minutes+"m";
		
	
	}
}


