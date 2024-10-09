import java.io.*;
import java.util.*; 
 
public class Main{
    static int N, M;
    static int[] hasCard;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        for(int i=1; i<=N; i++){
            String str = br.readLine();
            map1.put(str,i);
            map2.put(i, str);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            String value = br.readLine();
            if(Character.isAlphabetic(value.charAt(0))){
                sb.append(map1.get(value));
            }else{
                int int_value = Integer.parseInt(value);
                sb.append(map2.get(int_value));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}