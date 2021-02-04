package baekjoon;
import java.io.*;
import java.util.StringTokenizer;

public class Main_2869 {

	public static void main(String[] args) throws IOException {
		//�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int A = Integer.parseInt(st.nextToken()); //�����̴� ���� A���� �ö󰣴�.
		int B = Integer.parseInt(st.nextToken()); //�㿡 B���� �̲�������.
		int V = Integer.parseInt(st.nextToken()); //���� ����� V�����̴�.
		
		/*���� �°� ��������, �ݺ��� ������ �ð��ʰ��� ���´�.
		 * int day = 1; //�ɸ��� �� ��
		 * int height = 0; //�����̰� �ö� ����
		 * 
		 * while(true) {
		 * 		height += A; //���� �ö󰣴�.
		 * 		if(height >= V) //���� �ö󰡼� �� ���̰� ���� ���̺��� ũ�ų� ���� �Ǹ�
		 * 		break;
		 * 
		 * 		height -= B;//�㿡 �̲�������.
		 * 		day++;
		 * 		}
		 * System.out.println(day);
		 */
		
		int day = (V - B) / (A - B); //���� ������ �����ϸ� ���̻� �̲������� �����Ƿ� (V-B)
		
		if((V - B) % (A - B) != 0) //�������� ������ ���� �� ���� �� �ö󰡾� �ϹǷ� day++
			day++;
			
		System.out.println(day);
		
	}

}
