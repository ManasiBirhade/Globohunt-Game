import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ani3 extends JFrame
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Timer t1,t2,t3,t4,t5,t6,t7;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
JButton b1;
//static String audiofile="kalimba.mp3";
int y1=0,y2=0,y3=0,y4=0,y5=0;
int x=1000;
int cnt=60;
Player p=null;
public ani3()
{
Container d=getContentPane();
d.setLayout(null);
l13=new JLabel("Timer:");
l13.setFont(new Font("Courier",Font.BOLD,30));
l9=new JLabel("",JLabel.CENTER);
l10=new JLabel("GLOBOHUNT");
l10.setFont(new Font("Ravie",Font.BOLD,66));
l1=new JLabel(new ImageIcon(this.getClass().getResource("1.png")));
l2=new JLabel(new ImageIcon(this.getClass().getResource("2.png")));
l3=new JLabel(new ImageIcon(this.getClass().getResource("3.png")));
l4=new JLabel(new ImageIcon(this.getClass().getResource("4.png")));
l5=new JLabel(new ImageIcon(this.getClass().getResource("5.png")));
l6=new JLabel(new ImageIcon(this.getClass().getResource("7.png")));
l8=new JLabel(new ImageIcon(this.getClass().getResource("8.png")));
//try
//{
//File f=new File(audiofile);
//if(p!=null) p.stop();
//p=Manager.createRealizedPlayer(f.toURI().toURL());
//p.start();
//}catch(Exception ee){}
t7=new Timer(1000,new timechange());
t7.start();
l11=new JLabel("Score:");
l11.setFont(new Font("Courier",Font.BOLD,30));
l12=new JLabel("Target: 30");
l12.setFont(new Font("Courier",Font.BOLD,30));
l7=new JLabel("0");
l7.setFont(new Font("Courier",Font.BOLD,30));
b1=new JButton(new ImageIcon(this.getClass().getResource("6.png")));
l9.setFont(new Font("Courier",Font.BOLD,30));
l7.setBounds(1180,100,80,100);
l11.setBounds(1050,100,140,100);
l12.setBounds(1050,150,200,100);
l10.setBounds(400,20,650,100);
l1.setBounds(10,10,50,50);
l2.setBounds(100,10,50,50);
l3.setBounds(50,10,50,65);
l4.setBounds(55,10,50,65);
l5.setBounds(60,10,50,65);       
l6.setBounds(1000,300,60,75);      //bullet

//b1.setBackground(new Color(0,0,0,0));
//b1.setForeground(new Color(0,0,0,0));
//this.add(b1);
//this.setBackground(new Color(0,0,0,0));
b1.setBounds(1000,300,400,200);
l13.setBounds(950,550,150,40);
l9.setBounds(1000,550,200,40);
t1=new Timer(15,new demo1());
t2=new Timer(20,new demo2());
t3=new Timer(30,new demo3());
t4=new Timer(10,new demo4());
t5=new Timer(25,new demo5());
t6=new Timer(10,new demo6());

t1.start();
t2.start();
t3.start();
t4.start();
t5.start();

d.add(l1);
d.add(l2);
d.add(l3);
d.add(l4);
d.add(l5);
d.add(l6);
d.add(l7);
d.add(l8);
d.add(b1);
d.add(l9);
d.add(l10);
d.add(l11);
d.add(l12);
d.add(l13);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent tt){
x=1000;

l1.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
l2.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
l3.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
l4.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
l5.setIcon(new ImageIcon(this.getClass().getResource("5.png")));

t6.start();
}});
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel lll=new JLabel(new ImageIcon(this.getClass().getResource("10.png")));
lll.setBounds(0,0,1400,800);
d.add(lll);
setSize(1400,800);
setVisible(true);
}

class timechange implements ActionListener
{
public void actionPerformed(ActionEvent tt)
{
cnt--;
l9.setText(cnt+"");
if(cnt==0)
{
t7.stop();
//JOptionPane.showMessageDialog(null,"Game Is Over","MyProj",2);
new result1();
dispose();


cnt=60;
l7.setText("0");
t7.start();
}
}
}
class demo1 implements ActionListener
{
public void actionPerformed(ActionEvent tt)
{
y1=y1+5;
if(y1>=800)
y1=10;
l1.setBounds(75,y1,50,65);
}
}

class demo2 implements ActionListener
{
public void actionPerformed(ActionEvent tt)
{
y2=y2+5;
if(y2>=800)
y2=10;
l2.setBounds(10,y2,50,65);
}
}

class demo3 implements ActionListener
{
public void actionPerformed(ActionEvent tt)
{
y3=y3+5;
if(y3>=800)
y3=10;
l3.setBounds(95,y3,50,65);
}
}
class demo4 implements ActionListener
{
public void actionPerformed(ActionEvent tt)
{
y4=y4+5;
if(y4>=800)
y4=10;
l4.setBounds(140,y4,50,65);
}
}
class demo5 implements ActionListener
{
public void actionPerformed(ActionEvent tt)
{
y5=y5+5;
if(y5>=800)
y5=10;
l5.setBounds(170,y5,50,65);
}
}
class demo6 implements ActionListener
{
public void actionPerformed(ActionEvent tt)
{

x=x-10;
if(x<=190){
if(300==y1)
{
l1.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
//l7=new JLabel(new ImageIcon(this.getClass().getResource("7.png")));

l7.setText((Integer.parseInt(l7.getText().trim())+1)+"");
}
else
{
if(300==y2)
{
l2.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
//l7=new JLabel(new ImageIcon(this.getClass().getResource("7.png")));

l7.setText((Integer.parseInt(l7.getText().trim())+1)+"");
}
if(300==y3)
{
l3.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
//l7=new JLabel(new ImageIcon(this.getClass().getResource("7.png")));

l7.setText((Integer.parseInt(l7.getText().trim())+1)+"");
}
if(300==y4)
{
l4.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
//l7=new JLabel(new ImageIcon(this.getClass().getResource("7.png")));

l7.setText((Integer.parseInt(l7.getText().trim())+1)+"");
}else{
if(300==y5)
{
l5.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
//l7=new JLabel(new ImageIcon(this.getClass().getResource("7.png")));

l7.setText((Integer.parseInt(l7.getText().trim())+1)+"");
}}}}	
if(Integer.parseInt(l7.getText())==30)
{
t7.stop();
new result();
dispose();
return;
}
if(x<=-100)
t6.stop();
l6.setBounds(x,300,60,75);
}}

public static void main(String[] args)
{
new ani3();
}
}