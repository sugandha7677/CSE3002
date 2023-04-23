package Exception;

public class Forcefully {
    public static void main(String [] args){
        int i = 2;
        int j = 8;

        int k = 0;
        try {
            k = i + j;
            if(k < 10){
                throw new ArithmeticException();
            }
            System.out.println(k);
        }
        catch(Exception e ) {
            System.out.println(e);
        }
    }
}
