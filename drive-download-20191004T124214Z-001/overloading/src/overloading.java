import java.lang.Math;
public class overloading {

	private int radius;
	private String name;
	public overloading()		//클래스 객체의 기본 생성자 : 함수 객체가 선언되면 자동으로 호출됨
	{
		this.radius = 0;			//this를 사용하여 객체 안에있는 멤버 변수 초기화,this 의 사용 1:객체 멤버의 접근 
		this.name = " ";
		
	}
	public overloading(int radius,String name)			//생성자 오버로딩 :매개변수의 타입이랑 갯수가 다르면 오버로딩이 가능하다
	{
		this.radius = radius;
		this.name = name;
	}
	
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading a = new overloading();			//객체 생성 :기본생성자 호출
		overloading b = new overloading(10,"햄버거");
		
		System.out.println(b.getArea());

	}

}
