package test;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyJFrame extends JFrame{
	
	
	public static void main(String[] args) {
		new My();
	}
}

class My extends JFrame{
	public My(){
		super("新建一个JFrame窗口");
		Container container = getContentPane();
		JLabel jl = new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		setVisible(true);
		setSize(200, 150);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
