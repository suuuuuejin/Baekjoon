import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[] utilities = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            utilities[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(maxUtilityForLastPerson(N, utilities));
    }
    
    public static int maxUtilityForLastPerson(int N, int[] utilities) {
        int totalSum = 0;
        for (int util : utilities) {
            totalSum += util;
        }

        boolean[][] dp = new boolean[totalSum + 1][totalSum + 1];
        dp[0][0] = true;
        
        for (int i = 1; i <= N; i++) {
            for (int x = totalSum; x >= 0; x--) {
                for (int y = totalSum - x; y >= 0; y--) {
                    if (x - utilities[i - 1] >= 0) {
                        dp[x][y] |= dp[x - utilities[i - 1]][y];
                    }
                    if (y - utilities[i - 1] >= 0) {
                        dp[x][y] |= dp[x][y - utilities[i - 1]];
                    }
                }
            }
        }

        int answer = 0;
        for (int i = 0; i <= totalSum; i++) {
            for (int j = 0; j <= i; j++) {
                int last = totalSum - i - j;
                if (dp[i][j] && j >= last) {
                    answer = Math.max(answer, last);
                }
            }
        }

        return answer;
    }
}
