import lombok.Getter;
import lombok.Setter;

class Exercise6_7 {
	public static void main(String[] args) {
		
		Student1 s = new Student1("�����",1,10,90,100,60); //������ ȣ�� >>�����������
		System.out.println(s.getName());
		System.out.println(s.getTotal());
		
		Student1 s2 = new Student1("������",2,15,50,100,60); //������ ȣ�� >>�����������
		System.out.println(s2.getName());
		System.out.println(s2.getTotal());
		
		Student1 s3 = new Student1("�޽�",2,15); //������ ȣ�� >>�����������
		System.out.println(s3.getName());
		System.out.println(s3.getTotal());
		
		
	}
}


@Getter //@ ==> ������̼�
@Setter

class Student1 {
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	//�Լ� �����ε� : �Ű����� ������ �ٸ����� �����ε��̶�� ��.
	public Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	//�Լ� �����ε� : �Ű����� ������ �ٸ����� �����ε��̶�� ��.
	public Student1(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		
	}
	
	int getTotal() {
		return kor + eng + math;
	}

	double getAverage() {
		return (int)((getTotal()/3.0+0.05)*10)/10.0;
	}
	
}
