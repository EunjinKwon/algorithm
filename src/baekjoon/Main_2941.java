package baekjoon;
import java.io.*;

public class Main_2941 {

	public static void main(String[] args) throws IOException {
		//ũ�ξ�Ƽ�� ���ĺ��� ������ ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int cnt = 0; //���ĺ��� ����
		int len = s.length();
		
		for(int i=0; i<len; i++) {
			
			char ch = s.charAt(i);
						
			if(ch == 'c' && i < len - 1) { //c=�̰ų� c-�� ��
				if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-')
					i++; // =�̳� -������ �� �ܾ��̹Ƿ� i�� 1����
				}
			else if(ch == 'd' && i < len - 1) {
				if(s.charAt(i+1) == '-') //d-�� ��
					i++;
				else if(s.charAt(i+1) == 'z' && i < len - 2) { //dz= �� �� 
					if(s.charAt(i+2) == '=')
						i += 2;
				}
			}
			else if(ch == 'l' && i < len - 1) {
				if(s.charAt(i+1) == 'j')
					i++;
			}
			else if(ch == 'n' && i < len - 1) {
				if(s.charAt(i+1) == 'j')
					i++;
			}
			else if(ch == 's' && i < len - 1) {
				if(s.charAt(i+1) == '=')
					i++;
			}
			else if(ch == 'z' && i < len - 1) {
				if(s.charAt(i+1) == '=')
					i++;
			}
			//���� �ش����� ������ ���� �ϳ��� �� �ܾ �ش�
			cnt++; //�ܾ� ���� ����
			
		}
		System.out.println(cnt);

	}

}
