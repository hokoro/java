
class Circle
{
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x,int y,int radius)
	{
		this.x = x;
		this.y = y;
		this.radius =radius;
	}
	public String toString()
	{
		return "Circle("+x+","+y+")"+"radius값:"+radius+")";
	}
	
	public boolean equals(Object obj)
	{
		Circle c = (Circle)obj; //다운캐스팅
		if(x==c.x && y==c.y)
		return true;
		else
		return false;
		
	}
	
}
public class CircleApp_20164229 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a: " +a);
		System.out.println("원 b: " +b);
		if(a.equals(b))
			System.out.println("같은원 ");
		else
			System.out.println("서로 다른 원");
	}

}
