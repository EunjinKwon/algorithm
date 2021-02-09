package baekjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_10757 {

	public static void main(String[] args) throws IOException {
		//큰 수 A+B
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//long형이 넘어가는 매우 큰 수에 대해서 BigInteger 클래스를 사용한다.
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B);
		
		System.out.println(A.toString());
		

	}

}
