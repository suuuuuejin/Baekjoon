import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        int index = 1;
        for(int i=2; i<=9; i++){
            int value = Integer.parseInt(br.readLine());
            if(value > max) {
                max = value;
                index = i;
        }
    }
        System.out.println(max+"\n"+index);
		
	}
}