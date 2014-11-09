package matrix;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


public class samkod extends JFrame {
	JButton vse;
	JLabel l1;
	JTextField a1, a2, a3, b1, b2, b3, c1, c2, c3, rez;
	String a;
	int i, b,c,d,f,g,k,r,z, y, w;
	eHandler handler = new eHandler();
	
	public samkod(String a) {
		super (a);
		setLayout(new FlowLayout());
		vse = new JButton("Посчитать");
		
		a1 = new JTextField(3);
		b1 = new JTextField(3);
		c1 = new JTextField(3);
		a2 = new JTextField(3);
		b2 = new JTextField(3);
		c2 = new JTextField(3);
		a3 = new JTextField(3);
		b3 = new JTextField(3);
		c3 = new JTextField(3);
		l1 = new JLabel("");
		
		add(a1);
		add(b1);
		add(c1);
		add(a2);
		add(b2);
		add(c2);
		add(a3);
		add(b3);
		add(c3);
		add(vse);
		add(l1);
		vse.addActionListener(handler);
}		
		public class eHandler implements ActionListener {		
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==vse){               
					int i = Integer.parseInt(a1.getText());
					int b = Integer.parseInt(a2.getText());
					int c = Integer.parseInt(a3.getText());
					int d = Integer.parseInt(b1.getText());
					int z = Integer.parseInt(b2.getText());
					int f = Integer.parseInt(b3.getText());
					int g = Integer.parseInt(c1.getText());
					int k = Integer.parseInt(c2.getText());
					int r = Integer.parseInt(c3.getText());
					
					y =  i*z*r+d*k*c+b*f*g-c*z*g-b*d*r-f*k*i;
					a = "Ответ: " + y;
					l1.setText(a);
					
				}	
		}		
	}
}	
