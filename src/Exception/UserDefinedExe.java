package Exception;



public class UserDefinedExe {
    public static void main(String [] args) {
        
        int i = 5;
        try {

            if(i < 10){
                throw new MyException("errorrrr");
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
}

class MyException extends Exception {

    public MyException(String msg){
        super(msg); // call constructor of exc. class
    }
}
