import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout.Alignment;

public class Calculator {
	public static void main(String args[]) {
		Frame frm=new Frame("Calculator");
		Label num_lab=new Label("0.  ", Label.RIGHT); //number label
		Label txt_lab=new Label("DSG Calculator",Label.CENTER); //text label
		Panel num_pnl=new Panel(new GridLayout(4,3,0,0)); //number panel, 0,0為邊際寬度
		Panel op1_pnl=new Panel(new GridLayout(4,1,0,0)); //operator1 panel
		Panel op2_pnl=new Panel(new GridLayout(2,1,0,0)); //operator2 panel
		
		
		frm.setLayout(null);
		frm.setLocation(400,300); //window位置
		frm.setSize(400,300); //window大小
		frm.setBackground(new Color(190, 233, 232)); //window背景
		//number label
		num_lab.setBounds(5, 50, 250, 40);
		num_lab.setBackground(new Color(98, 182, 203));
		num_lab.setFont(new Font("Arial", Font.PLAIN,18));
		num_lab.setForeground(Color.WHITE);
		//text label
		txt_lab.setBounds(270, 50, 120, 40);
		txt_lab.setFont(new Font("Arial", Font.ITALIC+Font.BOLD, 16));
		txt_lab.setForeground(new Color(57, 91, 80));
		//number panel
		num_pnl.setBounds(5, 100, 180, 160);
		for (int i=0;i<9;i++) {
			num_pnl.add(new Button(Integer.toString(i+1)));
		}
		num_pnl.add(new Button("0"));
		num_pnl.add(new Button("."));
		num_pnl.setFont(new Font("Arial", Font.PLAIN, 16));
		num_pnl.setForeground(Color.BLACK);
		//operator1 panel
		op1_pnl.setBounds(200, 100, 60, 160);
		op1_pnl.add(new Button("+"));
		op1_pnl.add(new Button("-"));
		op1_pnl.add(new Button("×"));
		op1_pnl.add(new Button("/"));
		Font f=new Font("Arial",Font.BOLD,16);
		op1_pnl.setFont(f);
		op1_pnl.setForeground(new Color(43, 111, 232));
		//operator2 panel
		op2_pnl.setBounds(270, 100, 120, 160);
		op2_pnl.add(new Button("="));
		op2_pnl.add(new Button("Clear"));
		op2_pnl.setFont(new Font("Arial", Font.BOLD, 20));
		op2_pnl.setForeground(new Color(247, 147, 161));
		
		frm.add(txt_lab);
		frm.add(num_lab);
		frm.add(num_pnl);
		frm.add(op1_pnl);
		frm.add(op2_pnl);
		frm.setVisible(true);
	}
}
