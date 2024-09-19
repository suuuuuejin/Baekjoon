import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int diff = 300000;
        int i_num=0,j_num=0,k_num=0;

        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(M-sum>=0 && M-sum<diff){
                        diff = M-sum;
                        i_num = i;
                        j_num = j;
                        k_num = k;
                    } 

                }
            }
        }
    System.out.println(arr[i_num]+arr[j_num]+arr[k_num]);
	}
}