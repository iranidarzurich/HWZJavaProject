package business_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Attachment extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 2217231798591128412L;
	private JFileChooser chooser;
	private String choosertitle;
	private String name;
	private JTextField attachment;

	public Attachment(JTextField attachment) {
		this.attachment = attachment;
	}

	public void actionPerformed(ActionEvent arg0) {

		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle(this.choosertitle);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

			try {
				File f = new File(chooser.getSelectedFile().getPath());
				this.name = chooser.getName(f);
				this.attachment.setText(this.name);
			} catch (Exception err) {

			}
		} else {
			System.out.println("No Selection ");
		}

	}

}
