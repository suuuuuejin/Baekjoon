import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            for(int j=i; j<num-1; j++){
                sb.append(" ");
            }
            for(int k =0; k<i+1; k++){

                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
		
	}
}
