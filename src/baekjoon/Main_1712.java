package baekjoon;
import java.io.*;
import java.util.StringTokenizer;

public class Main_1712 {

	public static void main(String[] args) throws IOException {
		//이익이 발생하는 지점(판매량)을 찾는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); //불변 비용
		int B = Integer.parseInt(st.nextToken()); //가변 비용
		int C = Integer.parseInt(st.nextToken()); //상품 가격
		// 총수입=총비용 -> A+B*n=C*n -> n = A/(C-B) 
		
		if(C-B <= 0) //분모가 0이거나 음수일 때
			System.out.println(-1);
		else
			System.out.println(A/(C-B)+1); // 총수입>총비용이어야 하므로 1을 더해준다. 
		
	}

}
