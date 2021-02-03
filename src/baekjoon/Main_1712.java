package baekjoon;
import java.io.*;
import java.util.StringTokenizer;

public class Main_1712 {

	public static void main(String[] args) throws IOException {
		//������ �߻��ϴ� ����(�Ǹŷ�)�� ã�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); //�Һ� ���
		int B = Integer.parseInt(st.nextToken()); //���� ���
		int C = Integer.parseInt(st.nextToken()); //��ǰ ����
		// �Ѽ���=�Ѻ�� -> A+B*n=C*n -> n = A/(C-B) 
		
		if(C-B <= 0) //�и� 0�̰ų� ������ ��
			System.out.println(-1);
		else
			System.out.println(A/(C-B)+1); // �Ѽ���>�Ѻ���̾�� �ϹǷ� 1�� �����ش�. 
		
	}

}
