package baekjoon;
import java.io.*;

public class Main_1316 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		//���ǿ� �´� ���ڿ��� ã�� ����
		int N = Integer.parseInt(br.readLine()); //�ܾ��� ���� N
		int cnt = 0; //�׷� �ܾ��� ����
		
		for(int i=0; i<N; i++) {
			if(check() == true)
				cnt++;
		}
		System.out.println(cnt);

	}
	
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		String s = br.readLine();
		int prev = 0;

		for(int i=0; i<s.length(); i++) {
			int now = s.charAt(i); //���� ����
			
			if(now != prev) { //���� ���ڿ� ���� ���ڰ� �ٸ� ��.�׷� �ܾ �ٲ� ��
				if(check[now - 'a'] == false) {//ó�� ������ �����̸�
					check[now - 'a'] = true; //true�� �ٲ��ش�
					prev = now; //prev�� now�� �������ش٤�
					}
				else {
					return false; //check[now-'a']�� true�̸� �׷�ܾ �ƴ� ����̴�.
					}
				}
			//���� ���ڿ� ���� ���ڰ� ���� ���� continue
			}
		
		return true;
		}

}
