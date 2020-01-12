
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;//小球横坐标
	double y=100;//小球纵坐标
	boolean right=true;//方向
	//画窗口
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		
		
		if(right) {
			x=x+10;
		}else {
			x=x-10;
		}
		
		if(x>856-40-30) {//856是窗口长度，40是边框长度，30是小球直径
			right=false;	
		}
		
		if(x<40) {
			right=true;
		}
		
	}
	
	
	//窗口加载
	void launchFrame(){
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//重画窗口,每秒画25次
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//40ms,  1s=1000ms ,大约1s画25次
			}catch(Exception e) {
				e.printStackTrace();
			}
				}
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is my first project!");
		BallGame game=new BallGame();
		game.launchFrame();
	}

}
