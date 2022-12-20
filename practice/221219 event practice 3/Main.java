import java.awt.*;
import java.awt.event.*;

public class Main {
	static Frame frame=new Frame();
	static Panel panel=new Panel(new GridLayout(0, 3, 0, 0));
	static Choice choice=new Choice();
	static TextArea textArea=new TextArea("12", 5, 3, 1);
	static TextField textField=new TextField("123", 10);
	static Label label=new Label("123");
	
	public static void main(String[] args) {
		//
		frame.setLayout(new FlowLayout());
		frame.setBounds(0,0,400,300);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//
		for (int i = 0; i < 16; i++) {
			Button button=new Button(Integer.toString(i));
			button.addActionListener(new actionListener());
			panel.add(button);
		}
		//
		for (int i = 0; i < 10; i++) {
			choice.add(Integer.toString(i));
		}
		choice.addItemListener(new itemListener());
		//
		textArea.addTextListener(new textListener());
		textField.addTextListener(new textListener());
		
		textArea.addKeyListener(new keyListener());
		textField.addKeyListener(new keyAdapter());
		
		//
		label.setSize(100,30);
		//
		frame.add(panel);
		frame.add(choice);
		frame.add(textArea);
		frame.add(textField);
		frame.add(label);
		frame.setVisible(true);
	}
	static public class actionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Button button=(Button)e.getSource();
			for (int i = 0; i < panel.getComponentCount(); i++) {
				if (button==panel.getComponent(i)) {
					label.setText(Integer.toString(Integer.parseInt(button.getLabel())+1));
				}
			}
		}
		
	}
	static public class itemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			Choice c=(Choice)e.getSource();
			label.setText(c.getSelectedItem());
		}
		
	}
	static public class textListener implements TextListener{

		@Override
		public void textValueChanged(TextEvent e) {
			if (e.getSource()==textField) {
				TextField t =(TextField)e.getSource();
				label.setText(t.getText());
			}else if (e.getSource()==textArea) {
				label.setText(textArea.getText());
			}
		}
		
	}
	static public class keyListener implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyChar()+" is typed");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyChar()+" is pressed");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyChar()+" is released");
		}
		
	}
	static public class keyAdapter extends KeyAdapter{
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyChar()+" is typed");
		}
	}
	
}
