import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ClickPracticeFrame extends JFrame

{

	ClickPracticeFrame()

	{

		setTitle("클릭 연습용으로 응용프로그램");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Container c = getContentPane();

		c.setLayout(null);

		JLabel la = new JLabel("C");

		la.setSize(20,20);

		la.setLocation(100, 100);

		

		la.addMouseListener(new MyMouseAdapter());

		c.add(la);

		c.setSize(300,300);

		c.setVisible(true);

	}

	

	 class MyMouseAdapter extends MouseAdapter

	{

		public void mousePressed(MouseEvent e)	//label 의이벤트를

		{

			JLabel la = (JLabel)e.getSource();

			Container c = la.getParent();

			int xBound = c.getWidth() - la.getWidth();

			int yBound = c.getHeight()-la.getHeight();

			int x = (int)(Math.random()*xBound);

			int y = (int)(Math.random()*yBound);

			

			la.setLocation(x,y);

		}

	}

 

}

 

 

public class ClickApp_20164229 {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		new ClickPracticeFrame();

	}

 

}