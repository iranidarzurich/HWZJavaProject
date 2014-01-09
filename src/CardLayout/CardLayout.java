package CardLayout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.message.saaj.SAAJHeader;

public class CardLayout extends JFrame {
	private static final long serialVersionUID = 1873850796708294858L;
	private Toolkit t;
	private int x = 0, y = 0, width = 800, height = 600;

	// Komponenten
	private JPanel masterContainer;
	private JComboBox combobox;

	public CardLayout() {
		t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		x = (int) ((d.getWidth() - width) / 2);
		y = (int) ((d.getHeight() - height) / 2);

		setTitle("Message");
		setBounds(x, y, width, height);

		// Anwendung schliesst wenn Eigenschaft gesetzt ist
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.initComponent();
		this.initListeners();
		setVisible(true);
	}

	private void initListeners() {
		this.combobox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				CardLayout cl = (CardLayout) masterContainer.getLayout();
				cl.sho
			

			}
		});

	}

	private void initComponent() {
		this.getContentPane().setLayout(new BorderLayout());
		this.masterContainer = new JPanel();
		this.combobox = new JComboBox(new String[] {"container1","container2","container3","container4"});

		this.combobox.setEditable(false);

		this.getContentPane().add(this.combobox, BorderLayout.PAGE_START);
		this.getContentPane().add(this.masterContainer, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new CardLayout();

	}
}
