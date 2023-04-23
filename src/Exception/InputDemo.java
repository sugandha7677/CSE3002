package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

// how use try with resources
public class InputDemo {

    // suppressing the error
    public static void main(String [] args) throws Exception, SQLException{
        
        BufferedReader br= null;
        
        try {
            String str = "";
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = "";
            str = br.readLine();
        }

    }
}
