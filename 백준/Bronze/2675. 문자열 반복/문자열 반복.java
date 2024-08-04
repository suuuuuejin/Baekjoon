import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            for(byte b: st.nextToken().getBytes())
                for(int j=0; j<R; j++){
                    System.out.print((char)b);
                }
            
            System.out.println();
        }
	}
} 