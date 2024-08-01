import java.io.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String word = br.readLine();
            char start = word.charAt(0);
            char end = word.charAt(word.length()-1);
            System.out.print(start);
            System.out.println(end);
        }
	}
} 