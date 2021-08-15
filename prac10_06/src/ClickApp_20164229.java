import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ClickPracticeFrame extends JFrame
{
	public ClickPracticeFrame()
	{
		super("클릭 연습 용 응용프로그램 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("C");
		la.setLocation(100,100);
		la.setSize(20,20);
		
		la.addMouseListener(new MyMouseAdapter());
		
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		
	}
	class MyMouseAdapter extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			JLabel la = (JLabel)e.getSource();
			Container c = la.getParent();
			int xBound = c.getWidth()-la.getWidth();
			int yBound = c.getHeight()-la.getHeight();
			int x = (int)(Math.random()*xBound);
			int y = (int)(Math.random()*yBound);
			c.setLocation(x, y);
			
		}
	}
}
public class ClickApp_20164229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickPracticeFrame();
	}

}
