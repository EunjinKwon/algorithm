package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main_10250 {

	public static void main(String[] args) throws IOException {
		//호텔 방 번호의 규칙을 찾아 출력하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken()); //호텔의 층 수
			int W = Integer.parseInt(st.nextToken()); //각 층의 방 수
			int N = Integer.parseInt(st.nextToken()); //N번째 손님
			
			int guestH; //손님이 투숙할 층
			int guestW; //손님이 투숙할 호
			
			if(N % H == 0) { //N이 층수의 배수일 때
				guestH = H * 100;
				guestW = N / H;
			}
				
			else {
				guestH = (N % H) * 100;
				guestW = N / H + 1;
			}
			
			System.out.println(guestH + guestW);
			
			/*아래와 같이 guestH와 guestW의 변수를 만들지 않고 바로 출력할 수도 있다.
			 * 
			 * if(N % H == 0){
			 * System.out.println(H*100 + N/H);
			 * }
			 * else{
			 * System.out.println(((N % H) * 100) + (( N / H ) + 1));
			 *} 
			 *
			 *그리고 StringBuilder을 사용해서 테스트케이스의 결과를 한번에 출력할 수도 있다.
			 */
			
		}
		
	}
		
}
