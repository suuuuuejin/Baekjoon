import java.io.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(char c: words.toCharArray()){
            cnt++;
            if(cnt==n){
                System.out.println(c);
            }
        }
        
	}
} 