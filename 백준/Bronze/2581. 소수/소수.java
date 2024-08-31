import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 10000;
        for(int i=M; i<=N; i++){
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0) {
                    cnt++;
                    if(cnt == 3) break;
                }
            }
            if(cnt == 2){
                sum += i;
                if(min > i){
                    min = i;
                }
            }
        }
        if(sum != 0){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
	}
}

