import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N1 = Integer.parseInt(br.readLine());
        int N2 = Integer.parseInt(br.readLine());
        int N3 = Integer.parseInt(br.readLine());
        if(N1 == 60 && N2 == 60  && N3 == 60)System.out.println("Equilateral");
        else if(N1+N2+N3 ==180){
            if(N1 == N2 || N2 == N3 || N1 == N3)System.out.println("Isosceles");
            else System.out.println("Scalene");
        }else System.out.println("Error");
	}
}

