import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++){
            sb.append("Case #").append(i+1).append(": ");
            String[] str_arr = br.readLine().split(" ");
            for(int j=str_arr.length-1; j>=0; j--){
                sb.append(str_arr[j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}

