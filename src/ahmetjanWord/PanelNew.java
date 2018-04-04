package ahmetjanWord;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PanelNew extends JFrame{
	public PanelNew(){
		this.setTitle("欢迎使用四则运算答题界面");
		this.setSize(860,350);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
	}
}
