import lombok.Getter;
import lombok.Setter;

class Exercise6_8 {
	public static void main(String[] args) {
		
		Student2 s = new Student2();
		
		s.setName("ȫ�浿");
		s.setBan(1);
		s.setNo(1);
		s.setKor(100);
		s.setEng(60);
		s.setMath(76);
		
		System.out.println("�̸� : "+s.getName());
		System.out.println("���� : "+s.getTotal());
		System.out.println("��� : "+s.getAverage());
	}

}


class Student2 {
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	double getAverage() {
		return (int)((getTotal()/3.0+0.05)*10)/10.0;
	}
	
}
