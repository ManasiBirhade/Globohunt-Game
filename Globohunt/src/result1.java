import javax.swing.*;
class result1 extends JFrame
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel l1;
public result1()
{
l1=new JLabel(new ImageIcon(this.getClass().getResource("loss.jpg")));
getContentPane().add(l1);
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}
