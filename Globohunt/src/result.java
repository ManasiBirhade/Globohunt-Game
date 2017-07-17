import javax.swing.*;
class result extends JFrame
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JLabel l1;
public result()
{
l1=new JLabel(new ImageIcon(this.getClass().getResource("winn.jpg")));
getContentPane().add(l1);
setSize(1300,1390);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}
