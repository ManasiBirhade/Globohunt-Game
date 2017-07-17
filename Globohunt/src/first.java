import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class first extends JFrame 
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel l1,l2;
JButton b1,b2;
public first()
{
Container d=getContentPane();
d.setLayout(null);

l2=new JLabel("GLOBOHUNT");
l2.setFont(new Font("Ravie",Font.BOLD,66));
l2.setBounds(400,110,650,100);
d.add(l2);

b1=new JButton("PLAY");
b1.setFont(new Font("Cooper",Font.BOLD,25));
//b1.setBackground(new Color(0,0,0,0));
//b1.setForeground(new Color(0,0,0,0));

b2=new JButton("QUIT");
b2.setFont(new Font("Cooper",Font.BOLD,25));
//b2.setBackground(new Color(0,0,0,3));
//b2.setForeground(new Color(0,0,0,0));

b1.setBounds(500,300,200,30);
b2.setBounds(500,350,200,30);
d.add(b1);
d.add(b2);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent tt){
new ani3();
}});

b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent tt){
dispose();
}});

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel l1=new JLabel(new ImageIcon(this.getClass().getResource("11.jpg")));
l1.setBounds(0,0,1400,700);
d.add(l1);

setSize(1400,700);
setVisible(true);
}
public static void main(String[] args)
{
new first();
}
}