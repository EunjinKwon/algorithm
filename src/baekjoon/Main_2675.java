package baekjoon;
import java.io.*;

public class Main_2675 {

	public static void main(String[] args) throws IOException {
		//�� ���ڸ� �ݺ��Ͽ� ����ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); //�׽�Ʈ ���̽��� ����
		
		for(int i=0; i<T; i++) {
			String[] s = br.readLine().split(" ");
			int R = Integer.parseInt(s[0]); //�� ���ڸ� R���� ���
			
			for(int j=0; j<s[1].length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(s[1].charAt(j));
					}
				}
			System.out.println();
			}
		}
}
