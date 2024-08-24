import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] count = new int[T][4];
        int[] coin = {25, 10, 5, 1}; 
        for(int i=0; i<T; i++){
            int num = Integer.parseInt(br.readLine());
            for(int j = 0; j<4; j++){
                count[i][j] = num / coin[j];
                num = num % coin[j];
            }
        }
        for(int i=0; i<T; i++){
            for(int j=0; j<4; j++){
                System.out.print(count[i][j]+" ");
            }
            System.out.println();
        }
	}
}

