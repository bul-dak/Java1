import java.util.Arrays;

public class Ex13_Lotto { //�ζ�	//������ �迭 6�� ����
	//�ʱ�ȭ�� �����Լ� ���ؼ� 1~45 ���̰��� ���� �� ���

	public static void main(String[] args) {
		int[] ball = new int[45]; //45���� �������� �����ϱ� ���� �迭 ����.
		
		for (int i=0;i<ball.length;i++)
			ball[i]=i+1;  //ball[0]�� 1�� ����ȴ�. 

		int tmp = 0; //�� ���� �ٲٴ� �� ����� �ӽú���.
		int j =0;   //������ ���� ������ ����.
		
		//�迭 i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		//0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for (int i=0;i<6;i++) {
			j = (int)(Math.random()*45); //0~44������ ������ ���� ��´�.
			tmp = ball[i];
			ball[i]=ball[j];
			ball[j]=tmp;
		}
		//�迭 ball�� �տ��� ���� 6���� ��Ҹ� ����Ѵ�.
		for(int i=0; i<6;i++)
			System.out.print(ball[i]+",");
	}

}
