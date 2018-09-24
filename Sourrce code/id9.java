										/* About */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class id9
{
	public static void main(String args[])
	{
	JFrame jf = new JFrame("About");
	jf.setBounds(500,30,1000,700);
	jf.setLayout(null);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ImageIcon im2 = new ImageIcon("images//id2.png");
	ImageIcon im1 = new ImageIcon("images//baby5.jpg");
	jf.setContentPane(new JLabel(im1));

		Font f1 = new Font("Algerian",Font.BOLD,50);
	
		JLabel l1 = new JLabel("Misson inderdhanush 2018");
		l1.setFont(f1);
		jf.add(l1);
		l1.setBounds(200,50,800,30);

		JLabel l2 = new JLabel(im2);
		jf.add(l2);
		l2.setBounds(0,0,300,200);

		JLabel l3 = new JLabel("overview:-");
		jf.add(l3);
		l3.setFont(new Font("Algerian",Font.BOLD,25));
		l3.setBounds(10,205,200,25);

		JLabel l4 = new JLabel("1.Full immunization against preventable childhood diseases is the");

		jf.add(l4);
		l4.setFont(new Font("Algerian",Font.BOLD,25));
		l4.setBounds(10,235,1000,25);

		JLabel l5 = new JLabel("right of every child.");
		jf.add(l5);
		l5.setFont(new Font("Algerian",Font.BOLD,25));
		l5.setBounds(10,260,1000,25);

		JLabel l6 = new JLabel("2.the Government of India launched the Universal Immunization");
		jf.add(l6);
		l6.setFont(new Font("Algerian",Font.BOLD,25));
		l6.setBounds(10,285,1000,25);

		
		JLabel l7 = new JLabel("Program (UIP) in 1985, one of the largest health programs of its");
		jf.add(l7);
		l7.setFont(new Font("Algerian",Font.BOLD,25));
		l7.setBounds(10,310,1000,25);

		JLabel l8 = new JLabel("kind in the world.");
		jf.add(l8);
		l8.setFont(new Font("Algerian",Font.BOLD,25));
		l8.setBounds(10,335,1000,25);

		JLabel l9 = new JLabel("3.Mission Indradhanush will ensure that all children under the age ");
		jf.add(l9);
		l9.setFont(new Font("Algerian",Font.BOLD,25));
		l9.setBounds(10,360,1000,25);

		JLabel l10 = new JLabel("of two years and pregnant women are fully immunized with all");
		jf.add(l10);
		l10.setFont(new Font("Algerian",Font.BOLD,25));
		l10.setBounds(10,385,1000,25);


		JLabel l11 = new JLabel("available vaccines.");
		jf.add(l11);
		l11.setFont(new Font("Algerian",Font.BOLD,25));
		l11.setBounds(10,410,1000,25);
		
		JButton b1 = new JButton("Back");
		jf.add(b1);
		b1.setFont(new Font("Algerian",Font.BOLD,25));
		b1.setBounds(400,480,130,40);

		b1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		String ar[] = new String[]{args[0]};
		jf.dispose();
		id4.main(ar);	
			
		}
		});
		
		

	

	jf.setVisible(true);
	}
}