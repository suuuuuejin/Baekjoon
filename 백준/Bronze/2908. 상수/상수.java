import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String args[]) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        // int A = Integer.parseInt(st.nextToken());
        // int B = Integer.parseInt(st.nextToken());
        String a = st.nextToken();
        String b = st.nextToken();
        String a_reverse = "";
        String b_reverse = "";
        for(int i=a.length()-1; i>=0; i--){
            a_reverse+=a.charAt(i);
        }
        for(int i=b.length()-1; i>=0; i--){
            b_reverse+=b.charAt(i);
        }
        int A = Integer.parseInt(a_reverse);
        int B = Integer.parseInt(b_reverse);
        if(A>B) System.out.print(A);
        else System.out.print(B);
	}
} 