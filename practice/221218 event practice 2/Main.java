import java.awt.*;
import java.awt.event.*;

public class Main {
	static Frame frame=new Frame("checkbox");
	static Checkbox c1=new Checkbox("Bold");
	static Checkbox c2=new Checkbox("Italic");
	static Checkbox c3=new Checkbox("gray");
	static Checkbox c4=new Checkbox("green");
	static Label lb=new Label();
	
	public static void main(String[] args) {
		frame.setBounds(0,500,400,300);
		frame.setLayout(null);
		
		c1.setBounds(0,50,100,20);
		c1.setState(true);
		c2.setBounds(0,100,100,20);
		CheckboxGroup radio=new CheckboxGroup();
		c3.setCheckboxGroup(radio);
		c3.setBounds(0,150,100,20);
		c4.setCheckboxGroup(radio);
		c4.setBounds(0,200,100,20);
		lb.setBounds(0,250,100,20);
		
		c1.addItemListener(new ItemLis());
		c2.addItemListener(new ItemLis());
		c3.addItemListener(new ItemLis());
		c4.addItemListener(new ItemLis());
		frame.add(c1);
		frame.add(c2);
		frame.add(c3);
		frame.add(c4);
		frame.add(lb);
		frame.setVisible(true);
	}
	
	static class ItemLis implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			Checkbox chk=(Checkbox)e.getSource();
			lb.setFont(lb.getFont().deriveFont(0));
			
			if(c1.getState()&&c2.getState()) {
				lb.setText("Bold+Italic");
				lb.setFont(lb.getFont().deriveFont(Font.BOLD+Font.ITALIC));
			}else if (c1.getState()) {
				lb.setText("Bold");
				lb.setFont(lb.getFont().deriveFont(Font.BOLD));
			}else if(c2.getState()) {
				lb.setText("Italic");
				lb.setFont(lb.getFont().deriveFont(Font.ITALIC));
			}
			
			if (chk==c3) {
				lb.setText(chk.getLabel());
				frame.setBackground(Color.gray);
			}else if(chk==c4) {
				lb.setText(chk.getLabel());
				frame.setBackground(Color.green);
			}
			
		}	
	}
	
}
