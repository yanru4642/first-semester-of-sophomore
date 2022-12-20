import java.awt.*;
import java.awt.event.*;

public class Main{
	static Frame frm=new Frame("hi");
	static Button b1=new Button("yellow");
	static Button b2=new Button("Close");
	
	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setBounds(50, 50, 200, 200);
		
		b1.addActionListener(new ActLis());
		b1.setBounds(0, 50, 100, 40);
		
		b2.addActionListener(new ActLis());
		b2.setBounds(0, 100, 100, 40);
		
		frm.add(b1);
		frm.add(b2);
		frm.setVisible(true);
	}
	static class ActLis implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Button btn = (Button)e.getSource();
			if (b1==btn) {
				frm.setBackground(Color.yellow);	
			}else if (b2==btn) {
				System.exit(0);
			}
			
		}
		
	}
	
}
