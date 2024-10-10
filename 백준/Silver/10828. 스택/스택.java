import java.io.*;
import java.util.*; 
 
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            switch(command){
                case "push": list.add(num);
                    break;
                case "pop" : sb.append(list.size() == 0 ?-1:list.get(list.size()-1)).append("\n");
                    if(list.size() != 0) list.remove(list.size()-1);
                    break;
                case "size": sb.append(list.size()).append("\n");
                    break;
                case "empty": sb.append(list.size() == 0?1:0).append("\n");
                    break;
                case "top": sb.append(list.size() == 0?-1:list.get(list.size()-1)).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}

