import java.util.ArrayList;

public class Post{
	
	private String username;
	private long timestamp;
	private int likes;
	private ArrayList<String>comments;
	
	public String  getUserName() {
		return username;
	}
	public void setusername(String username) {
		this.username=username;
	}
	public static void main(String []args) {
		MessagePost mp=new MessagePost();
		mp.setMessage("rdtdfhg");
		mp.printShortSummary();
	}

	
}


 class MessagePost extends Post{
	
	private String message;
	

	public void printShortSummary(){
		String str=getUserName();
		
		System.out.println(message +" "+ str);
		}

	public String getMessage() {
		return message;
	}
	

	public void setMessage(String message) {
		this.message = message;
	}
}

 class PhotoPost extends Post{
	
	private String filename;
	private String caption;
	
}





