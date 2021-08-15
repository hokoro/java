import java.util.Scanner;
import java.lang.Math;
class Circle
{
	private double x,y;
	private int radius;
	public Circle(double x,double y,int radius)
	{
		this.x =x;
		this.y=y;
		this.radius =radius;
	}
	public void show()
	{
		System.out.println("("+this.x+","+this.y+")"+this.radius);
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
}
public class CircleManager_20164229 {

	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		
		for(int i=0; i<c.length;i++)
		{
			System.out.print("x,y,radius>>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		int biggestindex =0;
        
		for(int i=0;i<c.length;i++)
		{
			c[i].show();
			if(c[biggestindex].getArea()<c[i].getArea())
			{
				biggestindex = i;
			}
			
		}
		System.out.println("가장 면적이 큰원은>>");
		c[biggestindex].show();
		scanner.close();
		
	}

} 
