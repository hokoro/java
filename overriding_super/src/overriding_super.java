class Shape
{
	protected String name;
	public void paint()
	{
		draw();
	}
	public void draw()
	{
		System.out.println(name);
	}
}

 class Circle extends Shape
{
	protected String name;
	
	public void draw()
	{
		 name = "Circle";
		 super.name = "shape";	//super class 의 name 이 초기화된
		 super.draw();			//superclass 의 draw 함수 호출
		 System.out.println(name);
	}
}
public class overriding_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Shape b = new Circle();		//upcasting
				b.paint();
	}

}
