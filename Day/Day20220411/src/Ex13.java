
public class Ex13 { //p.178 4-32

	public static void main(String[] args) {
		//for���� Loop1�̶�� �̸��� �ٿ���.
		Loop1 : for(int i=2;i<=9;i++) {
				for(int j=1;j<=9;j++) {
					if(j==5)
//						break Loop1;  //for i ��
//						break; //for i�� �ݺ� j�� ��
						continue Loop1; // System.out.println();�� �Ѿ�� for i���������� ��.
//						continue; //��� �ݺ����� Ǯ��� ��üfor���� ��������.
				System.out.println(i+"*"+j+"="+i*j);
			}//end of for i
				System.out.println();
		} //end of Loop1
	}

}
