import java.io.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pl = br.readLine();
        String sb = new StringBuilder(pl).reverse().toString();
        if(pl.equals(sb)) System.out.println(1);
        else System.out.println(0);
       
    }
} 