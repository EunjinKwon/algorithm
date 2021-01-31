package baekjoon;
import java.io.*;

public class Main_1157 {

	public static void main(String[] args) throws IOException {
		//�־��� �ܾ�� ���� ���� ���� ���ĺ��� ����ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphabet = new int[26]; //���ĺ� ������ �����ϴ� �迭
		String s = br.readLine(); //�ܾ� �Է�
		s = s.toUpperCase(); //�ܾ �빮�ڷ� ����

		for(int i=0; i<s.length(); i++) {
			alphabet[s.charAt(i)-'A']++; //i��° ���ĺ� ���� �迭�� +1
		}
		
		int max = -1;
		char answer = '?'; //���� ���� ���� ���ĺ��� ����
				
		for(int i=0; i<alphabet.length; i++) {
			if(max < alphabet[i]) {
				max = alphabet[i];
				answer = (char) (i + 'A');
			}
			else if(max == alphabet[i]) {
				answer = '?'; //���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� '?'���� �ٽ� �Ҵ�
			}
		}
		
		System.out.println(answer);
		
		

	}

}
