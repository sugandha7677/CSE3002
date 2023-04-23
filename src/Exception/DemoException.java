package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoException {
    public static void main(String [] args){
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, k = 0;
        i = 8;
        j = 2;

        int l = 0;
        
        int [] arr = new int [4];

        try{
            l = Integer.parseInt(br.readLine());

            k = i /j;
            System.out.println(k);
            for(int c = 0; c <= 4; c++) arr[c] = c + 1;

            for(int value : arr) System.out.println(value);

        }
        catch(IOException e){
            System.out.println("Input output exception");
        }
        catch(ArithmeticException e){
            System.out.println("Division by 0 not possible");
        }
        // multiple catch with single try
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index bound");
        }
        catch(Exception e){
            System.out.println("Unknown exception");
        }
        // will be called all the time no matter error or not
        finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("not in use");
            }
            
            System.out.println("BYE");
        }
        
    }
}
