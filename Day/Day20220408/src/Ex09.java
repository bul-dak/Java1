
public class Ex09 { //1+(-2)+3+(-4)+...�� ���������� ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.

	public static void main(String[] args) {
		int sum =0;
		int i=0;
		int sign = 1;
		int tmp;
		
		for (i=1; true; i++, sign = -sign) { //sign = 1,-1,1,-1,....

			tmp = i*sign;
			//System.out.println(tmp);
			
			sum += tmp;
			
			if(sum>=100)
				break;
		}
		
		System.out.println("i: " +i + " tmp:" + tmp +" sum: "+sum);
	} //main�� ��

}
