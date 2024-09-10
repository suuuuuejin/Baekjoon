import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int[] n = new int[3];
            for(int i = 0; i<3; i++){
                n[i] = Integer.parseInt(st.nextToken());
            }
            if(n[0] == 0 && n[1] ==0 && n[2] == 0) break;
            
            Arrays.sort(n);

            if(n[2]>= n[0]+n[1]) System.out.println("Invalid");
            else if(n[0] == n[1] && n[1] == n[2]) System.out.println("Equilateral");
            else if(n[0] == n[1]|| n[1] == n[2]) System.out.println("Isosceles");
            else System.out.println("Scalene");
        
        }
        
	}
}

