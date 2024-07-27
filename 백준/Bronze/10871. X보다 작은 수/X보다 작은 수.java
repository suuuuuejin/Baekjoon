import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[count];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] < x) sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb.toString());
		
	}
}
