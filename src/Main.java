package project.lab;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main implements ActionListener{
	private JButton ch1, ch2;
	
	public Main() {
	
		JFrame jf = new JFrame();
		jf.setSize(450,450);
		jf.setVisible(true);
		jf.setResizable(false);
		
		
		JPanel jp = new JPanel();
		jf.add(jp);
		jp.setBackground(new Color(3,57,108));		
		
		Icon tictac=new ImageIcon("pic/tictac.png");
		Icon puzzle=new ImageIcon("pic/puzzle.jpg");
		
		JTextField jtf , jtf1, jtf2;
		
		jtf = new JTextField();
		jtf.setBounds(150, 20, 150, 30);
		jtf.setEditable(false);
		
		jtf1 = new JTextField();
		jtf1.setBounds(65, 235, 100, 30);
		jtf1.setEditable(false);
		
		jtf2 = new JTextField();
		jtf2.setBounds(275, 235, 100, 30);
		jtf2.setEditable(false);
		
		
		ch1 = new JButton(tictac);
		ch2 = new JButton(puzzle);
		
		jp.add(jtf);
		jp.add(jtf1);
		jp.add(jtf2);
		jp.add(ch1);
		jp.add(ch2);
	
		jtf.setText("  Welcome to the Game ");
		jtf1.setText("Tic - Tac - Toe");
		jtf2.setText("Picture Puzzle");
		
		jtf.setBackground(new Color(76,157,18));
		jtf1.setBackground(new Color(76,157,18));
		jtf2.setBackground(new Color(76,157,18));
		
		ch1.setBounds(40,80,150,150);
		ch1.setIcon(tictac);
		
		ch2.setBounds(250,80,150,150);
		ch2.setIcon(puzzle);
		

		
		
		
		ch1.addActionListener(this);
		ch2.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==ch2){
			new Picpuzzle();		
		}
		if(e.getSource()==ch1){
			new GUI();	
		
		}
		
	}

}
