package dz.ansej.gui.common;

import javax.swing.JFrame;

import dz.ansej.gui.auth.Login;

/**
 * 
 * @author lyes kherbiche
 * @author ⴻⵍⵢⴰⵙ ⵅⴻⵔⴱⵉⵛ
 *
 */
@SuppressWarnings("serial")
public class Frame extends JFrame {
	
	public Frame() {
		
		this.setTitle("login");
		this.setSize(400,300);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame ();
		Login login = new Login();
		frame.setContentPane(login);
		
	}

}
