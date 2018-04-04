package ahmetjanWord;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyPanel extends JFrame{
	JLabel name,pass,kong;
	JTextField nameText,passText;
	JPanel jp1,jp2;
	JButton ok,quit;
	public MyPanel(){
		init();
		addAction();
		this.setTitle("»¶Ó­µÇÂ½");
		this.setSize(600,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(2,1));
		
	}
	
	private void init(){
		name=new JLabel("ÐÕÃû");
		pass=new JLabel("ÃÜÂë");
		kong=new JLabel("     ");
		nameText=new JTextField(20);
		passText=new JTextField(20);
		jp1=new JPanel();
		jp2=new JPanel();
		ok=new JButton("µÇÂ½");
		quit=new JButton("ÍË³ö");
		addFrame();
	}
	
	private void hideFrame(){
		this.setVisible(false);
	}
	
	private void addFrame(){
		jp1.add(name);
		jp1.add(nameText);
		jp1.add(kong);
		jp1.add(pass);
		jp1.add(passText);
		jp2.add(ok);
		jp2.add(quit);
		this.add(jp1);
		this.add(jp2);
	}
	
	private void addAction(){
		quit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=nameText.getText().toString();
				String pass=passText.getText().toString();
				if(name.equals("admin")&&pass.equals("admin")){
					hideFrame();
					new QuestionPanel();
				}
			}
		});
	}
}
