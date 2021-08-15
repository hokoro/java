import java.awt.*;
import javax.swing.*;
class NorthPanel extends JPanel{
	public NorthPanel()
	{	
		setOpaque(true);
		setBackground(Color.LIGHT_GRAY);
		JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
		add(new JButton("열기"));	//JPanel 의 멤버 함수로 버튼 생성 함수를 객체를 부를 필요가없음
		add(new JButton("닫기"));
		add(new JButton("나가기"));
		
	}
	
}
class SouthPanel extends JPanel
{
	public SouthPanel()
	{		
		setOpaque(true);
		setBackground(Color.yellow);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Word Input"));
		add(new JTextField(15));
		
		
	}
}
class CenterPanel extends JPanel
{
	public CenterPanel()
	{
		setBackground(Color.white);
		setLayout(null);
		for(int i=0;i<10;i++)
		{
			JLabel j = new JLabel("*");
			int x = (int)(Math.random()*250+10);
			int y = (int)(Math.random()*200+10);
			j.setLocation(x,y);
			j.setSize(20,20);
			j.setForeground(Color.red);
			add(j);	
		}
		//setLayout(new FlowLayout());
		//add(new JButton("Word Input"));
	}
	
}
class MultiPanelFrame extends JFrame
{
	MultiPanelFrame(){
		super("여러개의 패널을 가진 프레임");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container c = getContentPane();
	    c.add(new NorthPanel(),BorderLayout.NORTH);
	    c.add(new SouthPanel(),BorderLayout.SOUTH);
	    c.add(new CenterPanel(),BorderLayout.CENTER);
	    setSize(320,320);
	    setVisible(true);
	    
	}
}





public class MultiPanelApp_20164229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiPanelFrame();
	}

}
