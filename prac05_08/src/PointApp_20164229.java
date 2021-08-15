class Point
{
	private int x,y;
	public Point(int x,int y) {this.x=x;this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {this.x=x;this.y=y;}
	
}
class PositivePoint extends Point
{
	//실질적인 메소드인 super class 에 메소드를 불러야하기떄문에 
	//super 키워드를 사용하여 superclass 의 생성자나 메소드를 불러야 한다
	public PositivePoint()
	{
		super(0,0);
	}
	public PositivePoint(int x,int y)
	{
		super(x,y);
		if(x<0||y<0)
		super.move(0,0);
	
	}
	public void move(int x,int y)
	{
		if(x>0&&y>0)
		super.move(x, y);	
		else
			return;
	}
	public String toString()
	{
		return "("+getX()+","+getY()+")의 점";
	}
	
	/*실질적인 x,y 의 접근 지정자는 private이기 때문에 접근이 불가능하다
	 * 따라서 생성자 함수나 메소드로 좌표를 초기화 해주어야한다*/
	
	
}
public class PointApp_20164229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p =new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString()+"입니다");
		p.move(-5,5);
		System.out.println(p.toString()+"입니다");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"입니다");
	}

}
