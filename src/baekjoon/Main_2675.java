package baekjoon;
import java.io.*;

public class Main_2675 {

	public static void main(String[] args) throws IOException {
		//각 문자를 반복하여 출력하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); //테스트 케이스의 개수
		
		for(int i=0; i<T; i++) {
			String[] s = br.readLine().split(" ");
			int R = Integer.parseInt(s[0]); //각 문자를 R번씩 출력
			
			for(int j=0; j<s[1].length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(s[1].charAt(j));
					}
				}
			System.out.println();
			}
		}
}
