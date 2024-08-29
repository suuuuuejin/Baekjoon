import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == -1) break;
            List<Integer> list = new ArrayList<>();
            for(int i = 1; i<=N; i++){
                if(N % i == 0){
                    list.add(i);
                }
            }
            int sum = 0;
            for(int i=0; i<list.size()-1; i++){
                sum +=list.get(i);
            }
            if(sum == N){
                System.out.print(N+" = ");
                for(int i =0; i<list.size()-1; i++){
                    if(i != list.size()-2){
                        System.out.print(list.get(i) +" + ");
                    }else{
                        System.out.println(list.get(i));
                    }
                }
            }else{
                System.out.println(N+" is NOT perfect.");
            }

        }
        
        
	}
}

