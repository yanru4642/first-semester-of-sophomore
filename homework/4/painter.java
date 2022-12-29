import java.awt.*;
import java.awt.event.*;

public class painter extends Frame{
	static painter frame = new painter();
	static MenuBar menuBar = new MenuBar();
	static Menu drawMenu = new Menu("Draw");
	static Menu otherMenu = new Menu("Other");
	static MenuItem lineMenuItem = new MenuItem("Line");
	static MenuItem ovalMenuItem = new MenuItem("Oval");
	static MenuItem rectangleMenuItem = new MenuItem("Rectangle");
	static MenuItem moveMenuItem = new MenuItem("Move");
	static MenuItem clearMenuItem = new MenuItem("Erase all");
	static MenuItem exitMenuItem = new MenuItem("Exit");
	static Label statusLabel = new Label("Select a mode");
	enum MODE{NONE, LINE, OVAL, RECT, MOVE};
	static MODE mode = MODE.NONE;
	static MODE lastMode = MODE.NONE;
	static Point P1, P2, PmoveStart, PmoveDist, newPoint1, newPoint2;
	static Point start, distance;
	static Graphics graphics;
	
	public static void main(String[] args) {
		//frame
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setLayout(null);
		frame.setTitle("painter");
		frame.setBounds(0,0,600,450);
		frame.addMouseListener(new MouseAdp());
		frame.addMouseMotionListener(new mouseMotionAdp());
		//menu bar
		menuBar.add(drawMenu);
		menuBar.add(otherMenu);
		drawMenu.add(lineMenuItem);
		lineMenuItem.addActionListener(new actLis());
		drawMenu.add(ovalMenuItem);
		ovalMenuItem.addActionListener(new actLis());
		drawMenu.add(rectangleMenuItem);
		rectangleMenuItem.addActionListener(new actLis());
		otherMenu.add(moveMenuItem);
		moveMenuItem.addActionListener(new actLis());
		otherMenu.add(clearMenuItem);
		clearMenuItem.addActionListener(new actLis());
		otherMenu.add(exitMenuItem);
		exitMenuItem.addActionListener(new actLis());
		//status label
		statusLabel.setBounds(10,50,80,30);
		statusLabel.setBackground(Color.lightGray);
		statusLabel.setFont(new Font("Arial" , Font.PLAIN, 12));
		//points initialization
		start=new Point(0,0);
		distance=new Point(0,0);
		P1=new Point(0,0);
		P2=new Point(0,0);
		newPoint1=new Point(0,0);
		newPoint2=new Point(0,0);
		
		
		frame.add(statusLabel);
		frame.setMenuBar(menuBar);
		frame.setVisible(true);
	}
	
	
	static public class actLis implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			MenuItem menuItem = (MenuItem)e.getSource();
			if (menuItem == lineMenuItem) {
				mode=MODE.LINE;
				statusLabel.setText("Line mode");
				statusLabel.setBounds(10,50,65,30);
				
			}else if (menuItem == ovalMenuItem) {
				mode=MODE.OVAL;
				statusLabel.setText("Oval mode");
				statusLabel.setBounds(10,50,65,30);
			}else if (menuItem == rectangleMenuItem) {
				mode=MODE.RECT;
				statusLabel.setText("Rect mode");
				statusLabel.setBounds(10,50,65,30);

			}else if (menuItem == moveMenuItem) {
				mode=MODE.MOVE;
				statusLabel.setText("Please move");
				statusLabel.setBounds(10,50,75,30);
				
			}else if(menuItem == clearMenuItem)	{
				lastMode=MODE.NONE;
				graphics=frame.getGraphics();
				graphics.clearRect(0, 0, frame.getWidth(), frame.getHeight());
				
			}else if (menuItem == exitMenuItem) {
				frame.dispose();
			}
		}
	}
	
	static public class MouseAdp extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			P1=frame.getMousePosition();
			PmoveStart=new Point(e.getX()-start.x, e.getY()-start.y);
			PmoveDist=new Point(e.getX()-distance.x, e.getY()-distance.y);
		}
		
	}
	
	
	static public class mouseMotionAdp extends MouseMotionAdapter{
		@Override
		public void mouseDragged(MouseEvent e) {
			graphics=frame.getGraphics();
			if(mode == MODE.LINE) {
				P2=e.getPoint();
				start = new Point(P1.x,P1.y);
				distance = new Point(P2.x,P2.y);
				
				frame.update(graphics);
				lastMode=mode;
			}else if(mode == MODE.OVAL) {
				P2=e.getPoint();
				start = new Point(Math.min(P1.x,P2.x),Math.min(P1.y,P2.y));
				distance = new Point(Math.abs(P1.x-P2.x),Math.abs(P1.y-P2.y));
				frame.update(graphics);
				lastMode = mode;
				
			}else if(mode == MODE.RECT) {
				
				P2=e.getPoint();
				start = new Point(Math.min(P1.x,P2.x),Math.min(P1.y,P2.y));
				distance = new Point(Math.abs(P1.x-P2.x),Math.abs(P1.y-P2.y));
				frame.update(graphics);
				lastMode = mode;
				
			}else if(mode == MODE.MOVE) {
				
				newPoint1=new Point(e.getPoint().x-PmoveStart.x,e.getPoint().y-PmoveStart.y);
				
				if(lastMode==MODE.LINE) {
					newPoint2 = new Point(e.getX()-PmoveDist.x,e.getY()-PmoveDist.y);
					frame.update(graphics);
					distance.x=newPoint2.x;
					distance.y=newPoint2.y;
					
				}else if(lastMode==MODE.OVAL) {
					frame.update(graphics);
					
				}else if(lastMode==MODE.RECT) {
					frame.update(graphics);
					
				}
				
				start.x=newPoint1.x;
				start.y=newPoint1.y;
				
			}
			
			
			
			
			
		}
	}
	//override Frame's method
	@Override
	public void paint(Graphics graphics) {
		
		if(mode == MODE.LINE) {
			graphics.setColor(Color.black);
			graphics.drawLine(P1.x,P1.y, P2.x,P2.y);
			
		}else if(mode == MODE.OVAL) {
			graphics.setColor(Color.red);
			graphics.fillOval(start.x, start.y, distance.x, distance.y);
			
		}else if(mode == MODE.RECT) {
			graphics.setColor(Color.yellow);
			graphics.fillRect(start.x, start.y, distance.x, distance.y);
			
		}else if(mode == MODE.MOVE) {
			if(lastMode == MODE.LINE) {
				graphics.setColor(Color.black);
				graphics.drawLine(newPoint1.x, newPoint1.y, newPoint2.x,newPoint2.y );
			}else if(lastMode == MODE.OVAL) {
				graphics.setColor(Color.red);
				graphics.fillOval(newPoint1.x, newPoint1.y, distance.x, distance.y);
			}else if(lastMode == MODE.RECT) {
				graphics.setColor(Color.yellow);
				graphics.fillRect(newPoint1.x, newPoint1.y, distance.x, distance.y);
			}
		}
		
	}
	
	
	
}
