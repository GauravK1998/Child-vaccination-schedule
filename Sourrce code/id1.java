                                      /** login page */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class id1 
{
	
	public static void main(String args[]) throws Exception
	{
	
	JFrame f = new JFrame("Login Form");
	
	f.setBounds(500,30,1000,700);
	f.setVisible(true);
	f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//f.getContentPane().setBackground(Color.cyan);
	
	

	Font f1 = new Font("Adobe Caslon Pro",Font.BOLD,25);
	Font f2 = new Font("Algerian",Font.BOLD,50);
	
	ImageIcon im1 = new ImageIcon("images//id2.png");
	
	JLabel l6 = new JLabel("Mission InderDhanush");
	JLabel l7 = new JLabel("2018");	
	l6.setFont(f2);
	l7.setFont(f2);
	JLabel l1 = new JLabel("USERNAME");
	JLabel l2 = new JLabel("PASSWORD");
	JLabel l3 = new JLabel("------------------------------------------------------------------------------------------------");
	JLabel l4 = new JLabel("------------------------------------------------------------------------------------------------");
	JLabel l5 = new JLabel("New Entry Registered Here!!!--->");
	JLabel l8 = new JLabel();
	l8.setIcon(im1);
		
	l1.setFont(f1);
	l2.setFont(f1);
	l3.setFont(f1);
	l4.setFont(f1);
	l5.setFont(f1);

	JTextField t1= new JTextField();
	t1.setFont(f1);
	  	t1.setBounds(650,330,180,30);    
     		t1.setToolTipText("Enter your UserName");  
	JPasswordField p1 = new JPasswordField();
		p1.setBounds(650,380,180,30);
		p1.setToolTipText("Enter your Password");
		p1.setFont(f1);

	JButton b1 = new JButton("Login");
		b1.setFont(f1);
	JButton b2 =  new JButton("Reset");
		b2.setFont(f1);	
	JButton b3 = new JButton("Click Here");
		b3.setFont(f1);		
			
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(p1);
		f.add(b1);
		f.add(b2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(b3);
		f.add(l6);
		f.add(l7);
		f.add(l8);


			
		
		//BUTTON WORKING CODE
		 b1.addActionListener(new ActionListener()
	{  
	    public void actionPerformed(ActionEvent e)
		{ 
		 
		try
		{
			
			Connection con = getConnection();
			//JOptionPane.showMessageDialog(null,con);
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM mother.user_data";
			ResultSet rs = stmt.executeQuery(sql);
		
			String g1=t1.getText();
			String g2=p1.getText();
			
			while(rs.next())
			{ 
			String user = rs.getString("username");
			String pass = rs.getString("password");
		
			if(g1.equals(user)&&g2.equals(pass))
			{
			JOptionPane.showMessageDialog(f,"Successfully logined");
			String[] argu = new String[]{user};
			f.dispose();
			id4.main(argu);
			break;
			}
			
			}//end of while
			
			String x1 = String.valueOf(rs.next());	
			if(x1.equals("false"))
			JOptionPane.showMessageDialog(f,"Wrong username and password");
			con.close();
		
		}//END OF TRY BLOCK
		catch(Exception e1)
		{
			System.out.println(e1); }
    		}
		
			  
    	});
	
	b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			t1.setText("");
			p1.setText("");
		}
	}
	)  ;
	
	b3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String[] argu = new String[]{"133"};
			try{
			f.dispose();
			id2.main(argu);}
			catch(Exception e4)
			{}
			
		}
	}
	)  ;
	

	l1.setBounds(200,330,200,30);
	t1.setBounds(450,330,300,40);
	
	l2.setBounds(200,380,200,30);
	p1.setBounds(450,380,300,40);
	
	b1.setBounds(390,430,120,40);
	b2.setBounds(530,430,120,40);
	
	l3.setBounds(0,320,1000,5);	
	l4.setBounds(0,480,1000,5);
	l5.setBounds(150,510,420,30);
	l6.setBounds(170,20,700,50);
	l7.setBounds(410,80,150,50);
	l8.setBounds(300,130,305,182);
	
	b3.setBounds(570,510,200,40);
	
	
	}
	public static Connection getConnection() throws Exception
	{
	try
	{
		String url="jdbc:mysql://localhost:3306/mother?autoReconnect=true&useSSL=false";
		String username="root";
		String password = "aaaa";
		
		Connection conn = DriverManager.getConnection(url,username,password);
		//JOptionPane.showMessageDialog(null,conn);
		return conn;
	}
	catch(Exception e)
	{
		System.out.print(e);
	}
	return null;
	}
}