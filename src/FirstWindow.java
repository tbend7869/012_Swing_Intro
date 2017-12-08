import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class FirstWindow extends JFrame{

	
	
	public FirstWindow() {
		super("My computer is Very special!");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.YELLOW);
		
		JPanel p3 = new JPanel(new GridBagLayout() );
		p3.setBackground(Color.BLACK);
		
		JPanel p4 = new JPanel(new GridBagLayout());
		p4.setBackground(Color.GREEN);
		
		JPanel p5 = new JPanel(new GridBagLayout());
		p5.setBackground(Color.RED);
		
		
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.RED);
		
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.YELLOW);
		
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		JButton b5 = new JButton("Button 5");
		JButton b6 = new JButton("Button 6");
		JButton b7 = new JButton("Button 7");
		JButton b8 = new JButton("Button 8");

		
		JCheckBox cb1 = new JCheckBox("Do you LOVE bacon?");
		cb1.setBackground(Color.CYAN);
		
		JCheckBox cb2 = new JCheckBox("Do you LOVE Java?");
		Color myNewColor = new Color (150, 100, 250, 100); //creates your new color
		cb2.setBackground(myNewColor);
		
		JCheckBox cb7 = new JCheckBox("Do you LOVE puppies?");
		cb7.setBackground(Color.GREEN);
		
		
		JCheckBox cb3 = new JCheckBox("Red");
		JCheckBox cb4 = new JCheckBox("Green");
		JCheckBox cb5 = new JCheckBox("Yellow");
		JCheckBox cb6 = new JCheckBox("Blue");
		
		JLabel myLabel = new JLabel("Fancy label!");
		JTextArea myTextArea = new JTextArea("Fancy TextArea!");
		JTextArea myTextField = new JTextArea("Fancy TextArea!");
		
		
		JRadioButton rb1 = new JRadioButton("Pie");
		JRadioButton rb2 = new JRadioButton("Cake");
		JRadioButton rb3 = new JRadioButton("Cupcake");
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15, 15, 15, 15);
		
		
		
		
		
		p1.add(b1);
		p1.add(b2);
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb7);
		//Center 3x3
		gbc.gridx = 0;
		gbc.gridy = 0;
		p3.add(myLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p3.add(myTextArea, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		p3.add(myTextField, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p3.add(b3, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p3.add(b4, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		p3.add(b5, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p3.add(b6, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		p3.add(b7, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		p3.add(b8, gbc);
		
		//WEST 2x2
		gbc.gridx = 0;
		gbc.gridy = 0;
		p5.add(cb3, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p5.add(cb4, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p5.add(cb5, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p5.add(cb6, gbc);
				
		//East 1x3
		gbc.gridx = 0;
		gbc.gridy = 0;
		p4.add(rb1, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p4.add(rb2, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p4.add(rb3, gbc);
		
		
		
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(p3, BorderLayout.CENTER);
		add(p4, BorderLayout.EAST);
		add(p5, BorderLayout.WEST);
		
		setVisible(true);
	} // end of constructor
	
	
	
	
	
	
	
} // end of constructor
