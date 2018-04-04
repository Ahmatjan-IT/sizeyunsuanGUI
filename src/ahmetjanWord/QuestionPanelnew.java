package ahmetjanWord;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
@SuppressWarnings("serial")
public class QuestionPanelnew extends JFrame{
	JPanel jp1,jp2,jp3;
	JButton ok,endQuestion;
	JLabel timesLabel;
	JTextField times;
	JPanel[] question;
	JLabel[] questionLabel;
	JTextField[] questionText;
	SetAQuestion saq;
	ArrayList<Topic> al;
	public package ahmetjanWord;
	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	@SuppressWarnings("serial")
	public class QuestionPanel extends JFrame{
		JPanel jp1,jp2,jp3;
		JButton ok,endQuestion;
		JLabel timesLabel;
		JTextField times;
		JPanel[] question;
		JLabel[] questionLabel;
		JTextField[] questionText;
		SetAQuestion saq;
		ArrayList<Topic> al;
		public QuestionPanel(){
			init();
			addPanel();
			addAction();
			this.setTitle("欢迎使用四则运算答题界面");
			this.setSize(860,350);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			this.setResizable(false);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new BorderLayout());
		}
		
		private void addPanel(){
			for(int i=0;i<25;i++){
				question[i].add(questionLabel[i]);
				question[i].add(questionText[i]);
				jp2.add(question[i]);
			}
			jp1.add(timesLabel);
			jp1.add(times);
			jp1.add(ok);
			jp3.add(endQuestion);
			this.add(jp1,BorderLayout.NORTH);
			this.add(jp2, BorderLayout.CENTER);
			this.add(jp3, BorderLayout.SOUTH);
		}
		
		private void init(){
			jp1=new JPanel();
			jp2=new JPanel();
			jp3=new JPanel();
			saq=new SetAQuestion();
			ok=new JButton("开始答题");
			timesLabel=new JLabel("答对题目数量");
			endQuestion=new JButton("提交");
			endQuestion.setEnabled(false);
			times=new JTextField(6);
			times.setEnabled(false);
			jp2.setLayout(new GridLayout(5, 5));
			question=new JPanel[25];
			questionLabel=new JLabel[25];
			questionText=new JTextField[25];
			for(int i=0;i<25;i++){
				question[i]=new JPanel();
				question[i].setLayout(new FlowLayout(FlowLayout.RIGHT));
				questionLabel[i]=new JLabel("? * ? = ");
				questionText[i]=new JTextField(4);
			}
		}
		private void addAction(){
			ok.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					saq.setAQuestion(25);
					al=saq.getQuestion();
					for(int i=0;i<25;i++){
						questionLabel[i].setText(al.get(i).getTopic());
						questionText[i].setText("");
					}
					ok.setEnabled(false);
					endQuestion.setEnabled(true);
				}
			});
			endQuestion.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int result=0;
					for(int i=0;i<25;i++){
						int questionResult=Integer.parseInt(questionText[i].getText());
						if(questionResult==al.get(i).getResult()){
							result++;
						}
					}
					times.setText(String.valueOf(result));
					
					endQuestion.setEnabled(false);
					ok.setEnabled(true);
					ok.setText("再来一次");
				}
				
			});
		}
	}
(){
		init();
		addPanel();
		addAction();
		this.setTitle("欢迎使用四则运算答题界面");
		this.setSize(860,350);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
	}
	
	private void addPanel(){
		for(int i=0;i<25;i++){
			question[i].add(questionLabel[i]);
			question[i].add(questionText[i]);
			jp2.add(question[i]);
		}
		jp1.add(timesLabel);
		jp1.add(times);
		jp1.add(ok);
		jp3.add(endQuestion);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2, BorderLayout.CENTER);
		this.add(jp3, BorderLayout.SOUTH);
	}
	
	private void init(){
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		saq=new SetAQuestion();
		ok=new JButton("开始答题");
		timesLabel=new JLabel("答对题目数量");
		endQuestion=new JButton("提交");
		endQuestion.setEnabled(false);
		times=new JTextField(6);
		times.setEnabled(false);
		jp2.setLayout(new GridLayout(5, 5));
		question=new JPanel[25];
		questionLabel=new JLabel[25];
		questionText=new JTextField[25];
		for(int i=0;i<25;i++){
			question[i]=new JPanel();
			question[i].setLayout(new FlowLayout(FlowLayout.RIGHT));
			questionLabel[i]=new JLabel("? * ? = ");
			questionText[i]=new JTextField(4);
		}
	}
	private void addAction(){
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saq.setAQuestion(25);
				al=saq.getQuestion();
				for(int i=0;i<25;i++){
					questionLabel[i].setText(al.get(i).getTopic());
					questionText[i].setText("");
				}
				ok.setEnabled(false);
				endQuestion.setEnabled(true);
			}
		});
		endQuestion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result=0;
				for(int i=0;i<25;i++){
					int questionResult=Integer.parseInt(questionText[i].getText());
					if(questionResult==al.get(i).getResult()){
						result++;
					}
				}
				times.setText(String.valueOf(result));
				
				endQuestion.setEnabled(false);
				ok.setEnabled(true);
				ok.setText("再来一次");
			}
			
		});
	}
}
