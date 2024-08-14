import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double score_sum = 0;
        double sub_score = 0;
        HashMap<String, Double> map = new HashMap<>();
        map.put("A+",4.5);
        map.put("A0",4.0);
        map.put("B+",3.5);
        map.put("B0",3.0);
        map.put("C+",2.5);
        map.put("C0",2.0);
        map.put("D+",1.5);
        map.put("D0",1.0);
        map.put("F",0.0);
        for(int i=0; i<20; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double score = Double.parseDouble(st.nextToken()); //학점
            String rate = st.nextToken(); //등급
            if(!rate.equals("P")){
                double avg_socre = map.getOrDefault(rate,0.0); //과목평점
                score_sum += score; //학점의 총합
                sub_score += (score * avg_socre); //학점 x 과목평점
            }
        }
        System.out.printf("%.6f\n", sub_score / score_sum);

	}
}