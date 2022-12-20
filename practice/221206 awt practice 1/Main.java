import java.awt.*;

public class Main {
	public static void main(String args[]) {
		Frame frm=new Frame("My first java window");
		Label lab=new Label("Hello java");
		
		frm.setLayout(null);
		frm.setLocation(1500,300); //window位置
		frm.setSize(400,200); //window大小
		frm.setBackground(new Color(142, 168, 195)); //window背景
		
		//lab.setLocation(20, 90); //label位置
		//lab.setSize(100, 40); //label大小
		lab.setBounds(20, 90, 300, 40); //label位置+大小
		lab.setBackground(Color.white); //label背景
		lab.setAlignment(Label.CENTER); //label文字對齊
		lab.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 16)); //label文字字體
		lab.setForeground(new Color(35, 57, 91)); //label文字顏色
		
		frm.add(lab);
		frm.setVisible(true);
	}
}
