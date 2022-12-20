import java.awt.*;
import java.awt.event.*;

public class BMI_Calculator {
	static Frame frame=new Frame("BMI Calculator");
	static Label name_lab=new Label("Name");
	static Label height＿lab=new Label("Height");
	static Label weight＿lab=new Label("Weight");
	static Label sex＿lab=new Label("Gender");
	static Label age＿lab=new Label("Age");
	static TextField name_tf=new TextField();
	static TextField height_tf=new TextField();
	static TextField weight_tf=new TextField();
	static CheckboxGroup sex_radio=new CheckboxGroup();
	static Checkbox sex_male=new Checkbox("Male");
	static Checkbox sex_female=new Checkbox("Female");
	static Choice age_chc=new Choice();
	static Label height_unit＿lab=new Label("(cm)");
	static Label weight_unit＿lab=new Label("(kg)");
	static Label result_lab=new Label("");
	static Label info_lab=new Label(""); 
	static Label suggestion_lab=new Label("");
	static Button compute_btn=new Button("Compute BMI");
	static Button exit_btn=new Button("Exit");
	
	public static void main(String args[]) {
		//frame
		frame.setLayout(null);
		frame.setBounds(0,0,360,410);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setBackground(new Color(187, 200, 233));
		//fonts
		Font labelFont=new Font(null,Font.PLAIN,16);
		Font resultFont=new Font(null,Font.BOLD+Font.ITALIC,24);
		//label
		name_lab.setBounds(40,50,60,25);
		name_lab.setFont(labelFont);
		height＿lab.setBounds(40,90,60,25);
		height＿lab.setFont(labelFont);
		weight＿lab.setBounds(40,130,60,25);
		weight＿lab.setFont(labelFont);
		sex＿lab.setBounds(40,170,60,25);
		sex＿lab.setFont(labelFont);
		age＿lab.setBounds(40,210,60,25);
		age＿lab.setFont(labelFont);
		//text field 
		name_tf.setBounds(100,50,150,25);
		height_tf.setBounds(100,90,150,25);
		weight_tf.setBounds(100,130,150,25);
		//checkBox
		sex_male.setBounds(105,170,55,25);
		sex_male.setState(true);
		sex_female.setBounds(167,170,60,25);
		//CheckboxGroup sex_radio=new CheckboxGroup();
		sex_male.setCheckboxGroup(sex_radio);
		sex_female.setCheckboxGroup(sex_radio);
		//choice
		for (int i = 0; i < 99; i++) {
			age_chc.add(Integer.toString(i+1));
		}
		age_chc.setBounds(100,210,100,25);
		//unit label
		height_unit＿lab.setBounds(260,90,60,25);
		weight_unit＿lab.setBounds(260,130,60,25);
		//result label
		result_lab.setBounds(50,250,250,25);
		result_lab.setFont(resultFont);
		result_lab.setForeground(Color.blue);
		result_lab.setAlignment(Label.CENTER);
		info_lab.setBounds(50,290,250,25);
		info_lab.setFont(labelFont);
		info_lab.setAlignment(Label.CENTER);
		suggestion_lab.setBounds(50,310,250,25);
		suggestion_lab.setFont(labelFont);
		suggestion_lab.setAlignment(Label.CENTER);
		//compute and exit button
		compute_btn.setBounds(50,350,110,40);
		compute_btn.addActionListener(new actionListener());
		exit_btn.setBounds(200,350,90,40);
		exit_btn.addActionListener(new actionListener());
		
		frame.add(name_lab);
		frame.add(height＿lab);
		frame.add(weight＿lab);
		frame.add(sex＿lab);
		frame.add(age＿lab);
		frame.add(name_tf);
		frame.add(height_tf);
		frame.add(weight_tf);
		frame.add(sex_male);
		frame.add(sex_female);
		frame.add(age_chc);
		frame.add(height_unit＿lab);
		frame.add(weight_unit＿lab);
		frame.add(result_lab);
		frame.add(info_lab);
		frame.add(suggestion_lab);
		frame.add(compute_btn);
		frame.add(exit_btn);
		frame.setVisible(true);
	}
	static public class actionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Button button=(Button)e.getSource();
			if (button==compute_btn) {
				double height=0;
				double weight=0;
				try {
					height=Double.parseDouble(height_tf.getText());				
				} catch (Exception exception1) {}
				try {
					weight=Double.parseDouble(weight_tf.getText());	
				} catch (Exception exception2) {}
				String nameString=name_tf.getText();
				String ageString=age_chc.getSelectedItem();
				String sexString=sex_radio.getSelectedCheckbox().getLabel();
				String result="";
				String BMIString="";
				String suggestion="";
				//calculate BMI
				double BMI = weight/Math.pow(height/100.0,2);
				BMIString=String.format("BMI:%.2f",BMI);
				if (BMI>1&&BMI<18.5) {
					result="Under weight";
					suggestion="Eat more!";
				}else if(BMI>=18.5&&BMI<24) {
					result="Normal weight";
					suggestion="Great!";
				}else if(BMI>=24&&BMI<27) {
					result="Over weight";
					suggestion="Remember to do exercises!";
				}else if(BMI>=27&&BMI<100){
					result="Obesity";
					suggestion="Go on diet, now!";
				}else {
					BMIString="";
				}

				//compute BMI
				result_lab.setText(result);
				//update labels
				info_lab.setText(String.format("%s(%sy, %s)  %s", nameString, ageString, sexString, BMIString));
				suggestion_lab.setText(suggestion);
			}else if(button==exit_btn){
				System.exit(0);
			}
		}
	}
	
}
