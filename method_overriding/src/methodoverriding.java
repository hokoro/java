class Shape
{
	public Shape next;			//shape 에  linkedlist 구현
	public Shape() {next =null;}
	public void draw()
	{
		System.out.println("shape");
	}
}

class Line extends Shape
{
	public void draw()
	{
		System.out.println("Line");
	}
}
class Rect extends Shape
{
	public void draw()
	{
		System.out.println("Rect");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Circle");
	}
}
public class methodoverriding {

	static void paint(Shape p)
	{
		p.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape start,last,obj;
		
		start = new Line();		//시작 객체에 Line casting->upcasting
		last = start;			//객체의 꼬리에 start 연결
		obj= new Rect();		//Rect 캐스팅
		last.next =obj;			//line -Rect 를 링크드 리스트 연결
		last = obj;				//last 변경
		obj = new Line();
		last.next = obj;
		last = obj;
		obj= new Circle();
		last.next = obj;
		
		Shape s = start;
		
		while(s!=null)
		{
			s.draw();
			s= s.next;
		}
		
	}

}
