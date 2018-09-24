							/*            Vaccination Schedule form    */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class id5
{
	
	public static void main(String args[])
	{
		JFrame jf = new JFrame("Vaccination Schedule");
	ImageIcon im1 = new ImageIcon("images//baby5.jpg");
	
		jf.setContentPane(new JLabel(im1));
	jf.setBounds(500,30,1000,700);
	jf.setLayout(null);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	
	Font f2 = new Font("Algerian",Font.BOLD,40);
	Font f1 = new Font("Adobe Caslon Pro",Font.BOLD,20);
		Font f3 = new Font("Algerian",Font.BOLD,25);
	
	JLabel l1 = new JLabel("Vaccination Schedule");
	l1.setFont(f2);
	l1.setBounds(300,10,500,40);
	jf.add(l1);

	JLabel l2 = new JLabel("At Birth");
	l2.setFont(f3);
	l2.setBounds(20,60,150,25);
	jf.add(l2);
	
	JRadioButton rb1 = new JRadioButton("BCG");
	rb1.setFont(f1);
	rb1.setBounds(170,65,100,20);
	jf.add(rb1);

	JRadioButton rb2 = new JRadioButton("OPV");
	rb2.setFont(f1);
	rb2.setBounds(290,65,100,20);
	jf.add(rb2);

	JRadioButton rb3 = new JRadioButton("HEB B*");
	rb3.setFont(f1);
	rb3.setBounds(410,65,100,20);
	jf.add(rb3);


	JLabel l3 = new JLabel("In 6 weeks");
	l3.setFont(f3);
	l3.setBounds(20,90,160,25);
	jf.add(l3);

	JRadioButton rb4 = new JRadioButton("OPV");
	rb4.setFont(f1);
	rb4.setBounds(170,95,100,20);
	jf.add(rb4);

	JRadioButton rb5 = new JRadioButton("DPT*");
	rb5.setFont(f1);
	rb5.setBounds(290,95,100,20);
	jf.add(rb5);

	JRadioButton rb6 = new JRadioButton("HEB B*");
	rb6.setFont(f1);
	rb6.setBounds(410,95,100,20);
	jf.add(rb6);

	JLabel l4 = new JLabel("In 10 weeks");
	l4.setFont(f3);
	l4.setBounds(10,120,200,25);
	jf.add(l4);

	JRadioButton rb7 = new JRadioButton("OPV");
	rb7.setFont(f1);
	rb7.setBounds(170,125,100,20);
	jf.add(rb7);

	JRadioButton rb8 = new JRadioButton("DPT*");
	rb8.setFont(f1);
	rb8.setBounds(290,125,100,20);
	jf.add(rb8);

	JRadioButton rb9 = new JRadioButton("HEB B*");
	rb9.setFont(f1);
	rb9.setBounds(410,125,100,20);
	jf.add(rb9);

	JLabel l5 = new JLabel("In 14 weeks");
	l5.setFont(f3);
	l5.setBounds(10,150,200,25);
	jf.add(l5);

	JRadioButton rb10 = new JRadioButton("IPV");
	rb10.setFont(f1);
	rb10.setBounds(170,155,100,20);
	jf.add(rb10);

	JRadioButton rb11 = new JRadioButton("OPV");
	rb11.setFont(f1);
	rb11.setBounds(290,155,100,20);
	jf.add(rb11);

	JRadioButton rb12 = new JRadioButton("DPT*");
	rb12.setFont(f1);
	rb12.setBounds(410,155,100,20);
	jf.add(rb12);

	JRadioButton rb13 = new JRadioButton("HEP B*");
	rb13.setFont(f1);
	rb13.setBounds(530,155,100,20);
	jf.add(rb13);

	JLabel l6 = new JLabel("In 9-12 MONTH");
	l6.setFont(f3);
	l6.setBounds(10,180,200,25);
	jf.add(l6);

	JRadioButton rb14 = new JRadioButton("MEASLES");
	rb14.setFont(f1);
	rb14.setBounds(210,185,130,20);
	jf.add(rb14);

	JRadioButton rb15 = new JRadioButton("VITAMIN A");
	rb15.setFont(f1);
	rb15.setBounds(350,185,150,20);
	jf.add(rb15);

	JRadioButton rb16 = new JRadioButton("JE**");
	rb16.setFont(f1);
	rb16.setBounds(510,185,60,20);
	jf.add(rb16);
	
	JLabel l7 = new JLabel("In 16-24 MONTH");
	l7.setFont(f3);
	l7.setBounds(10,210,200,25);
	jf.add(l7);

	JRadioButton rb17 = new JRadioButton("MEASLES");
	rb17.setFont(f1);
	rb17.setBounds(210,210,130,20);
	jf.add(rb17);

	JRadioButton rb18 = new JRadioButton("VITAMIN A");
	rb18.setFont(f1);
	rb18.setBounds(350,210,150,20);
	jf.add(rb18);

	JRadioButton rb19 = new JRadioButton("JE**");
	rb19.setFont(f1);
	rb19.setBounds(510,210,60,20);
	jf.add(rb19);
		
	JRadioButton rb20 = new JRadioButton("OPV BOOSTER");
	rb20.setFont(f1);
	rb20.setBounds(580,210,180,20);
	jf.add(rb20);
	
	JRadioButton rb21 = new JRadioButton("DDT BOOSTER");
	rb21.setFont(f1);
	rb21.setBounds(770,210,180,20);
	jf.add(rb21);
	
	JLabel l8 = new JLabel("IN 5-6 YEARS");
	l8.setFont(f3);
	l8.setBounds(10,240,200,25);
	jf.add(l8);

	JRadioButton rb22 = new JRadioButton("DPT BOOSTER");
	rb22.setFont(f1);
	rb22.setBounds(210,240,180,20);
	jf.add(rb22);

	JLabel l9 = new JLabel("IN 10-16 YEARS");
	l9.setFont(f3);
	l9.setBounds(10,270,200,25);
	jf.add(l9);

	JRadioButton rb23 = new JRadioButton("TT(TETANUS TOXOID)");
	rb23.setFont(f1);
	rb23.setBounds(210,270,300,20);
	jf.add(rb23);
	
	JLabel l10 = new JLabel("*In selected states Pentavalent vaccine (Hepatitis B, Diphtheria, Pertussis, Tetanus and Haemophilus influenzae type b) is given instead of DPT and Hep B.");
	l10.setBounds(0,300,1000,20);
	jf.add(l10);
	
	JLabel l11 = new JLabel("-->3rd to 9th doses of Vitamin A are given at 6 monthly intervals to children 2 -5 years old.");
	l11.setBounds(0,320,1000,20);
	jf.add(l11);

	JLabel l12 = new JLabel("**In Japanese Encephalitis (JE) endemic districts.");
	l12.setBounds(0,340,1000,20);
	jf.add(l12);


	JLabel l13 = new JLabel("-->For pregnant women: Give TT-2 or Booster doses before 36 weeks of pregnancy. However, give these even if more than 36 weeks have passed. Give TT to a woman in");
	l13.setBounds(0,360,1000,20);
	jf.add(l13);
	

	JLabel l14 = new JLabel("labour if she has not previously received TT.");
	l14.setBounds(0,380,1000,20);
	jf.add(l14);

	JLabel l15 = new JLabel("-->Ensure Never be Missed");
	l15.setBounds(0,450,1000,40);
	l15.setFont(f2);
	jf.add(l15);

	
	JButton b1 = new JButton("Update Data");
	b1.setBounds(450,550,150,50);
	b1.setFont(f1);
	jf.add(b1);

	JButton b2 = new JButton("Back");
	b2.setBounds(700,550,150,50);
	b2.setFont(f1);
	jf.add(b2);

	JButton b3 = new JButton("Submit Data");
	b3.setBounds(250,550,150,50);
	b3.setFont(f1);
	jf.add(b3);

	

	jf.setVisible(true);

	//button workig code
	

	b1.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	try
	{
	Connection con = getConnection();
	Statement stmt = con.createStatement();
	
		//at birth
		if(rb1.isSelected() && rb2.isSelected() && rb3.isSelected())
		{
		String query1 ="update mother.vacci_data set v1='true' where mname="+"'"+args[0]+"'";
		String query =query1;
	int i =stmt.executeUpdate(query);
		if(i>0)
		{
		JOptionPane.showMessageDialog(null,"Data is Updated");}
		else
		{
		JOptionPane.showMessageDialog(null,"Data is not Updated");
		}

		}
		
		//6 week
		if(rb4.isSelected() && rb5.isSelected() && rb6.isSelected())
		{
		String query1 ="update mother.vacci_data set v2='true' where mname="+"'"+args[0]+"'";
		String query =query1;
	int i =stmt.executeUpdate(query);
		if(i>0)
		{
		JOptionPane.showMessageDialog(null,"Data is Updated");}
		else
		{
		JOptionPane.showMessageDialog(null,"Data is not Updated");
		}
		}
		//10 week
		if(rb7.isSelected() && rb8.isSelected() && rb9.isSelected())
		{
		String query1 ="update mother.vacci_data set v3='true' where mname="+"'"+args[0]+"'";
		String query =query1;
		int i =stmt.executeUpdate(query);
		if(i>0)
		{
		JOptionPane.showMessageDialog(null,"Data is Updated");}
		else
		{
		JOptionPane.showMessageDialog(null,"Data is not Updated");
		}

		}
		// 14 week
		if(rb10.isSelected() && rb11.isSelected() && rb12.isSelected() && rb13.isSelected())
		{
		String query1 ="update mother.vacci_data set v4='true' where mname="+"'"+args[0]+"'";
		String query =query1;	
		int i =stmt.executeUpdate(query);
		if(i>0)
		{
		JOptionPane.showMessageDialog(null,"Data is Updated");}
		else
		{
		JOptionPane.showMessageDialog(null,"Data is not Updated");
		}
		}
		// 9 - 12 month
		if(rb14.isSelected() && rb15.isSelected() && rb16.isSelected())
		{
		String query1 ="update mother.vacci_data set v5='true' where mname="+"'"+args[0]+"'";
		String query =query1;	
		int i =stmt.executeUpdate(query);
		if(i>0)
		{
		JOptionPane.showMessageDialog(null,"Data is Updated");}
		else
		{
		JOptionPane.showMessageDialog(null,"Data is not Updated");
		}

		}
		//16_24 month
		if(rb17.isSelected() && rb18.isSelected() && rb19.isSelected() && rb20.isSelected() && rb21.isSelected())
		{
		String query1 ="update mother.vacci_data set v6='true' where mname="+"'"+args[0]+"'";
		String query =query1;	
		int i =stmt.executeUpdate(query);
		if(i>0)
		{
		JOptionPane.showMessageDialog(null,"Data is Updated");}
		else
		{
		JOptionPane.showMessageDialog(null,"Data is not Updated");
		}

		}
		//5-6 years
		if(rb22.isSelected())
		{
		String query1 ="update mother.vacci_data set v7='true' where mname="+"'"+args[0]+"'";
		String query =query1;
	        int i =stmt.executeUpdate(query);
		if(i>0)
		{
		JOptionPane.showMessageDialog(null,"Data is Updated");}
		else
		{
		JOptionPane.showMessageDialog(null,"Data is not Updated");
		}

		}
		//10 -16 years 
		if(rb23.isSelected())
		{
		String query1 ="update mother.vacci_data set v8='true' where mname="+"'"+args[0]+"'";
		String query =query1;
		int i =stmt.executeUpdate(query);
		if(i>0)
		{
		JOptionPane.showMessageDialog(null,"Data is Updated");}
		else
		{
		JOptionPane.showMessageDialog(null,"Data is not Updated");
		}

		}
		

		
		

	}//end of try
	catch(Exception e12)
	{
	JOptionPane.showMessageDialog(null,e12);

	}
	
	}
	});
	

	b3.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		Connection con = getConnection();
		String query = "insert into vacci_data values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt= con.prepareStatement(query);
		
		stmt.setString(1,args[0]);

		//at birth
		if(rb1.isSelected() && rb2.isSelected() && rb3.isSelected())
		{
		stmt.setString(2,"true");
		}
		else
		{
		stmt.setString(2,"false");
		}
		//6 week
		if(rb4.isSelected() && rb5.isSelected() && rb6.isSelected())
		{
		stmt.setString(3,"true");
		}
		else
		{
		stmt.setString(3,"false");
		}
		//9-12 week
		if(rb7.isSelected() && rb8.isSelected() && rb9.isSelected())
		{
		stmt.setString(4,"true");
		}
		else
		{
		stmt.setString(4,"false");
		}
		//10 week
		if(rb10.isSelected() && rb11.isSelected() && rb12.isSelected() && rb13.isSelected())
		{
		stmt.setString(5,"true");
		}
		else
		{
		stmt.setString(5,"false");
		}
		// 14 wwks
		if(rb14.isSelected() && rb15.isSelected() && rb16.isSelected())
		{
		stmt.setString(6,"true");
		}
		else
		{
		stmt.setString(6,"false");
		}
		//10-24 years
		if(rb17.isSelected() && rb18.isSelected() && rb19.isSelected() && rb20.isSelected() && rb21.isSelected())
		{
		stmt.setString(7,"true");
		}
		else
		{
		stmt.setString(7,"false");
		}
		//10-16
		if(rb22.isSelected())
		{
		stmt.setString(8,"true");
		}
		else
		{
		stmt.setString(8,"false");
		}
		//10 -16  
		if(rb23.isSelected())
		{
		stmt.setString(9,"true");
		}
		else
		{
		stmt.setString(9,"false");
		}

		stmt.setString(10,args[1]);
		
		int i =stmt.executeUpdate();
		if(i>0)
		{
		JOptionPane.showMessageDialog(null,"Data is saved");}
		else
		{
		JOptionPane.showMessageDialog(null,"Data is not saved");
		}
		
		}//end of try
		catch(Exception e1)
		{	

		System.out.println(e1);
		}
		
	}
	});//end b1 coding

	/*rb1.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	 //rb1.setSelected(true);
	JOptionPane.showMessageDialog(null, rb1.isSelected());
	}
	});*/

	b2.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	
	String[] ar = new String[]{args[0]};
	jf.dispose();
	id11.main(ar);
	}
	});	
	}

	public static Connection getConnection() throws Exception
		{
		try
		{
		String url ="jdbc:mysql://localhost:3306/mother?autoReconnect=true&useSSL=false";
		String username="root";
		String password = "aaaa";
		
		Connection conn = DriverManager.getConnection(url,username,password);
		
		return conn;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
		}
}