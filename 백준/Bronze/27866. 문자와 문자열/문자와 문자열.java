import java.io.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(words.charAt(n-1));
        
	}
} 
