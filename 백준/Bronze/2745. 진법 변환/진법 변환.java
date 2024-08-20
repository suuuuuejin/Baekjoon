import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int num = Integer.parseInt(st.nextToken());
        int result = 0;
        int index = 0;
        for(int i=str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            int n = 0;
            if(c>='0' && c<='9'){
                n = c - '0';
            }else{
                n = c - 55;
            }
            result += n * (Math.pow(num,index++));
        }
       System.out.println(result);
	}
}

