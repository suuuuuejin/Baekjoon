import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = 0;
        int[] arr = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
    
        for(int i = 0; i<9; i++){
            if(arr[i] > max) {
                max = arr[i];
                index = i+1;
        }
    }
        System.out.println(max+"\n"+index);
		
	}
}