package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyJDialog extends JDialog {
	public  MyJDialog() {
		super(new MyFrame(),"第一个JDialog窗体", true);
		Container container = getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setSize(100, 100);
	}
	
	public static void main(String[] args) {
		new MyJDialog();
	}
} 
class MyFrame extends JFrame{
	public MyFrame() {
		super("新建一个JFrame窗口");
		Container container = getContentPane();
		JLabel jl = new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		setVisible(true);
		setSize(200, 150);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JButton bl = new JButton("弹出对话框");
		bl.setBounds(10,10,100,21);
		bl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MyJDialog().setVisible(true);
			}
		});
		container.add(bl);
	}
}
