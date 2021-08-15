
class Rectangle
{
	private int x,y,width,heigth;
	public Rectangle(int x,int y,int width,int heigth)
	{
		this.x =x;
		this.y =y;
		this.width = width;
		this.heigth = heigth;
	}
	public void show()
	{
		System.out.println("x값"+x+"y값"+y);
		System.out.println("사각형의 넓이의"+width+'*'+heigth);
	}
	public int square()
	{
		return this.width*this.heigth;
		
	}
	public boolean contains(Rectangle r)
	{
		return ((x<=r.x&&y<=r.y)&&(x+width>r.x+r.width&&y+heigth>r.y+r.heigth))? true:false;
	}
	
}
public class RectangleApp_20164229 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Rectangle r =new Rectangle(2,2,8,7);
		Rectangle s =new Rectangle(5,5,6,6);
		Rectangle t =new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은"+s.square());
		if(t.contains(r)) 
			System.out.println("t는 r에 포함합니다");
		if(t.contains(s)) 
			System.out.println("t는 s에 포함합니다");

	}
	}


