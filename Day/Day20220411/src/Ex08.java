
public class Ex08 {

	public static void main(String[] args) {
		//��������, ��������
		int sum = 0;
		int i=1;
				
		for (i=1;i<=100;i++) {
			if(sum>100)
				break;
			sum += i;
		}
		System.out.println("ȸ��Ƚ��: "+i+","+"sum: "+sum);
	}//main�� ��

}
