import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=N; i++){
            if(N % i == 0){
                list.add(i);
            }
        }
        if(K<=list.size()) {
            System.out.println(list.get(K-1));
        }
        else System.out.println(0);
	}
}

