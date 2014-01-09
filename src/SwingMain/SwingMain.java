package SwingMain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingMain extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1354355750561110232L;

	private Toolkit t;
	private int x=0,y=0 ,width=800,height=600;
	
	//Komponenten
	private JMenuBar menubar1;
	
	private JMenu menubar1_menu1;
	private JMenu menubar1_menu2;
	private JMenu menubar1_menu3;
	
	private JMenuItem menubar1_menu1_menuitem1;
	private JMenuItem menubar1_menu1_menuitem2;
	private JMenuItem menubar1_menu1_menuitem3;

	private JMenuItem menubar1_menu2_menuitem1;
	private JMenuItem menubar1_menu2_menuitem2;
	private JMenuItem menubar1_menu2_menuitem3;
	
	private JMenuItem menubar1_menu3_menuitem1;
	private JMenuItem menubar1_menu3_menuitem2;
	private JMenuItem menubar1_menu3_menuitem3;
	
	private JButton button;
	private JTextArea textArea1;
	private JTextArea textArea2;
	
	private JPanel 	container;
	
	
	
	private JButton container_button1;
	private JButton container_button2;
	private JButton container_button3;
	
	public SwingMain() {
		t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		x = (int) ((d.getWidth()-width) / 2);
		y = (int) ((d.getHeight()- height) /2);
		
		setTitle("Message");
		setBounds(x,y, width, height);

		
		
		

		// Anwendung schliesst wenn Eigenschaft gesetzt ist
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initComponent();
		this.initListeners();
		setVisible(true);
	}
	
	private void initComponent(){
		this.getContentPane().setLayout(new BorderLayout(5,5));
		// Container
		
		this.container = new JPanel();
		BoxLayout box = new BoxLayout(this.container,BoxLayout.Y_AXIS);
		
		
		this.container_button1 = new JButton("Button 1");
		this.container_button2 = new JButton("Button 2");
		this.container_button3 = new JButton("Button 3");
		
		//JMenu inkl. Menu & MenuItems
		this.menubar1 = new JMenuBar();
		
		this.menubar1_menu1 = new JMenu("Menu 1");
		this.menubar1_menu2 = new JMenu("Menu 2");
		this.menubar1_menu3 = new JMenu("Menu 3");
		
		this.menubar1_menu1_menuitem1= new JMenuItem("MenuItem1/1");
		this.menubar1_menu1_menuitem2= new JMenuItem("MenuItem1/2");
		this.menubar1_menu1_menuitem3= new JMenuItem("MenuItem1/3");
		
		this.menubar1_menu2_menuitem1= new JMenuItem("MenuItem2/1");
		this.menubar1_menu2_menuitem2= new JMenuItem("MenuItem2/2");
		this.menubar1_menu2_menuitem3= new JMenuItem("MenuItem2/3");
		
		this.menubar1_menu3_menuitem1= new JMenuItem("MenuItem3/1");
		this.menubar1_menu3_menuitem2= new JMenuItem("MenuItem3/2");
		this.menubar1_menu3_menuitem3= new JMenuItem("MenuItem3/3");
		
		this.menubar1_menu1.add(this.menubar1_menu1_menuitem1);
		this.menubar1_menu1.add(this.menubar1_menu1_menuitem2);
		this.menubar1_menu1.add(this.menubar1_menu1_menuitem3);
		
		this.menubar1_menu2.add(this.menubar1_menu2_menuitem1);
		this.menubar1_menu2.add(this.menubar1_menu2_menuitem2);
		this.menubar1_menu2.add(this.menubar1_menu2_menuitem3);
		
		this.menubar1_menu3.add(this.menubar1_menu3_menuitem1);
		this.menubar1_menu3.add(this.menubar1_menu3_menuitem2);
		this.menubar1_menu3.add(this.menubar1_menu3_menuitem3);
		
		
		
		this.menubar1.add(this.menubar1_menu1);
		this.menubar1.add(this.menubar1_menu2);
		this.menubar1.add(this.menubar1_menu3);
		
		
		this.setJMenuBar(this.menubar1);
		
		// Button
		this.button= new JButton("Mein Button");
		this.button.setBounds(10, 10, 100, 20);
		
		this.getContentPane().add(button,BorderLayout.PAGE_START);
		
		//TextArea
		this.textArea1= new JTextArea();
		this.textArea1.setBounds(1,1,1,1);
		this.textArea1.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
		
		this.getContentPane().add(this.textArea1, BorderLayout.CENTER);
		
		this.textArea2= new JTextArea();
		this.textArea2.setBounds(1,1, 1,1);
		this.textArea2.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
		
		this.getContentPane().add(this.textArea2, BorderLayout.EAST);
		
	
		
		this.container.add(this.container_button1);
		this.container.add(this.container_button2);
		this.container.add(this.container_button3);
		
		this.getContentPane().add(this.container, BorderLayout.LINE_END);
		
	}
	private void initListeners(){
		this.menubar1_menu3_menuitem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "message");
				
			}
		});
	}
	public static void main(String[] args) {
		new SwingMain();
	}
}
