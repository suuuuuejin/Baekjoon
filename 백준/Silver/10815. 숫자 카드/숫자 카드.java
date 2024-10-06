import java.io.*;
import java.util.*;
 
 
public class Main{
    static int N, M;
    static int[] hasCard;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        hasCard = new int[N];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            hasCard[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(hasCard);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<M; i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(num)).append(" ");
        }
        System.out.println(sb);
    }
    public static int binarySearch(int num){
        int left = 0;
        int right = N-1;

        while(left <= right){
            int middle = (right + left) / 2;
            int middleValue = hasCard[middle];
            if(middleValue > num){
                right = middle-1;
            }else if(middleValue < num){
                left = middle+1;
            }else{
                return 1;
            }
        }
        return 0;
    }
}