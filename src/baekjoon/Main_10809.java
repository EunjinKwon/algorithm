package baekjoon;
import java.io.*;

public class Main_10809 {

	public static void main(String[] args) throws IOException {
		//�� �ܾ�� �� ���ĺ��� ó�� �����ϴ� ��ġ�� ã�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphabet = new int[26];
		String s = br.readLine();
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1; // -1�� �迭 �ʱ�ȭ
		}
		
		for(int i=0; i<s.length(); i++) {
			if(alphabet[s.charAt(i)-'a'] == -1) { //ó�� �����ϴ� ��ġ�̹Ƿ� -1�϶��� ����
				alphabet[s.charAt(i)-'a'] = i; 
			}
		}
		
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i]+ " ");
		}
		

	}

}
