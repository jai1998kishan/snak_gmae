import javax.swing.JFrame;

public class GameFrame extends JFrame {
	GameFrame(){
		
//		GamePanel panel=new GamePanel();
		
//		this.add(panel);
		
		//or we can also do that this: would also work as same
		
	this.add(new GamePanel());
	this.setTitle("Snake");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.pack();
	this.setVisible(true);
	this.setLocationRelativeTo(null);
		
	}

}
