package baekjoon;
import java.io.*;
import java.util.StringTokenizer;

public class Main_2869 {

	public static void main(String[] args) throws IOException {
		//달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int A = Integer.parseInt(st.nextToken()); //달팽이는 낮에 A미터 올라간다.
		int B = Integer.parseInt(st.nextToken()); //밤에 B미터 미끄러진다.
		int V = Integer.parseInt(st.nextToken()); //나무 막대는 V미터이다.
		
		/*답은 맞게 나오지만, 반복문 때문에 시간초과가 나온다.
		 * int day = 1; //걸리는 일 수
		 * int height = 0; //달팽이가 올라간 높이
		 * 
		 * while(true) {
		 * 		height += A; //낮에 올라간다.
		 * 		if(height >= V) //낮에 올라가서 총 높이가 나무 높이보다 크거나 같게 되면
		 * 		break;
		 * 
		 * 		height -= B;//밤에 미끄러진다.
		 * 		day++;
		 * 		}
		 * System.out.println(day);
		 */
		
		int day = (V - B) / (A - B); //낮에 정점에 도착하면 더이상 미끄러지지 않으므로 (V-B)
		
		if((V - B) % (A - B) != 0) //나머지가 있으면 다음 날 낮에 더 올라가야 하므로 day++
			day++;
			
		System.out.println(day);
		
	}

}
