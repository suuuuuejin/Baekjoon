import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] check_arr = new int[31];
        for(int i=0; i<28; i++){
            int value = Integer.parseInt(br.readLine());
            check_arr[value] = 1;
        }
        for(int i=1; i<=30; i++){
            if(check_arr[i] == 0) System.out.println(i);
        }
		
	}
}