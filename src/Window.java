import javax.swing.JFrame;

public class Window extends JFrame{
	
	//Contrcutor for the Window
	Window() {
		//Instance of Board
		
		this.add(new Board());
		this.setTitle("Snake");//Sets title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Allows to close the window
		this.setResizable(false);//Doesn't allow to resize Window
		this.pack();//Add components into the JFrame and fit inside it
		this.setVisible(true);//Allows whats inside Window to be visible
		this.setLocationRelativeTo(null);// Puts the window on the middle screen
	}
}
