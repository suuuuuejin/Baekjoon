import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int find_num = Integer.parseInt(br.readLine());
        int result =0;
        for(int i=0; i<count; i++){
            if(find_num == arr[i]) result++;
        }
        System.out.println(result);
		
	}
}