import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
 
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
 
		String[][] arr = new String[N][2];
        StringTokenizer st;
		for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, (s1, s2) -> {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		);
 
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			sb.append(arr[i][0]+" "+arr[i][1]+"\n");
		}
		System.out.println(sb);
	}
 
}