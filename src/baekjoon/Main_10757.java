package baekjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_10757 {

	public static void main(String[] args) throws IOException {
		//ū �� A+B
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//long���� �Ѿ�� �ſ� ū ���� ���ؼ� BigInteger Ŭ������ ����Ѵ�.
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B);
		
		System.out.println(A.toString());
		

	}

}
