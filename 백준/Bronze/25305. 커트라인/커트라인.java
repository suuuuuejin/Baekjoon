import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int prize = Integer.parseInt(st.nextToken());
        int[] students = new int[total];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<total; i++ ){
            students[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(students);
        System.out.println(students[total-prize]);
    }    
}