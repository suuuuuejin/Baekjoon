import java.io.*;
import java.util.*; 
 
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<>();

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
                case "pop" : System.out.println(list.size() == 0 ?-1:list.get(list.size()-1));
                    if(list.size() != 0) list.remove(list.size()-1);
                    break;
                case "size": System.out.println(list.size());
                    break;
                case "empty": System.out.println(list.size() == 0?1:0);
                    break;
                case "top": System.out.println(list.size() == 0?-1:list.get(list.size()-1));
                    break;
            }
        }
    }
}
