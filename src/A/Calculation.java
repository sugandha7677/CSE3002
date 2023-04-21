package A;

public class Calculation {
	
		private int sum(int x,int y) {
			return x+y;
		}
	
		// to make sum visible
		public int addition(int x,int y) {
			return sum(x,y);
		}
		
		protected int multiply(int x,int y) {
			return x*y;
		}
}
