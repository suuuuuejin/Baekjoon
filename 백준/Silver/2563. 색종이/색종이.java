import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] visit = new int[101][101];
        int result = 0;
        st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
		for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j<(x+10); j++){
                for(int k = y; k<(y+10); k++){
                    if(visit[j][k] != 1){
                        visit[j][k] = 1;
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
	}
}

