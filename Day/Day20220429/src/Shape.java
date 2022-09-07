
abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); //������ ������ ����ؼ� ��ȯ�ϴ� �޼���
	
	Point getPosition() {
		return p;
	}	
		
	void setPosition(Point p) {
		this.p= p;
	}
	
}
class Circle extends Shape {
	double r;
	
	public Circle() {} //����Ʈ ������
    
	//Shape s3 = new Circle(5);
	public Circle(double r) {
//		super(new Point(0,0)); ����x
		this.r =r;
	} 
	
	//Shape s2 = new Circle(new Point(10,10),5);
	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}
	
	@Override
	double calcArea() {
		double result = r*r*Math.PI; 
		return result;
		//return Math.PI*r*r; �̷��� �ص���.!
	}
	
}
class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle() {
		this(new Point(0,0),0,0);
	} //����Ʈ������
	
	public Rectangle(double width, double height) {
//		this.width = width;
//		this.height = height;
		this(new Point(0,0),width,height);
		
	
	}
	//Shape r3 = new Rectangle(new Point(100,100)150,50);
	public Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() {
		if(width == height && width*height !=0) {
			return true;
		}
		return false;
	}
	
	@Override
	double calcArea() {
		double result = width*height;
		return result;
	}
}

class Point {
	int x;
	int y;
	
	Point() { //����Ʈ ������
		this(0,0);
	}
	
	Point(int x, int y) { //�Ű����� �ִ� ������
		this.x = x;
		this.y= y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}

	public static void main(String[] args) {
		Shape s = new Circle();
		Shape s2 = new Circle(new Point(10,10),5);
		Shape s3 = new Circle(5);
		System.out.println((int)s2.calcArea());
		
		Shape r = new Rectangle();
		Shape r2 = new Rectangle(150,50);
		Shape r3 = new Rectangle(new Point(100,100),150,50);
		System.out.println(r3.calcArea());
	}
}

