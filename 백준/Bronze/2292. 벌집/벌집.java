import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 1;
        int num = 1;
        while(N > num){
            num += 6 * count++;
            range++;
        }
        System.out.println(range);
	}
}

