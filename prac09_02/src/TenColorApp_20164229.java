import javax.swing.*;			//스윙 컴포넌트 클래스들의 경로명
import java.awt.*; 				//폰트등 그래픽 처리를 하기위해서
class TenColorButtonFrame extends JFrame
{
	TenColorButtonFrame()
	{
		super.setTitle("Ten Color Buttons Frame");		//Jframe 의 타이틀 달기
		setTitle("Ten Color Buttons Frame");				//기존 버튼 프레임의 타이틀 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//원도우를 닫으면 프로그램 종료하도록 설정
		Container c = getContentPane();						//컨테이너 선언
		c.setLayout(new GridLayout(1,10));
		
		JButton btn[]= new JButton[10];
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW,
				Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY }; 
		for(int i=0;i<10;i++)
		{
			btn[i]=new JButton(Integer.toString(i));
			btn[i].setOpaque(true);			//배경색을 보이게 하기위해 불투명으로 초기화
			btn[i].setBackground(color[i]);		//배경색 설정하는 함수
			c.add(btn[i]);
		}
		setSize(500,200);			//프레임의 크기 설정
		setVisible(true);			//프레임 화면을 보이게 설정
		
		
	}
}
public class TenColorApp_20164229 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TenColorButtonFrame();
	}

}
