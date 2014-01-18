package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class crtAct extends JFrame implements ActionListener  {
	//public JTextField disObj;
	private JFileChooser chooser;
	private String choosertitle;
	String iname;
	private JTextField disObj;
	
	public crtAct(JTextField dObj){
		disObj=dObj;		
	}
	
	public void actionPerformed(ActionEvent arg0) {

		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle(this.choosertitle);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		//
		// disable the "All files" option.
		//
		chooser.setAcceptAllFileFilterUsed(false);
		//
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			// String iname=FilenameUtils.getBaseName(openFile.getName());
			try {
				File f = new File(chooser.getSelectedFile().getPath());
				// String iname=chooser.getName();
				// String fileName = chooser.getName().substring(0,
				// chooser.getName().lastIndexOf("."));
				this.iname = chooser.getName(f);
				disObj.setText(this.iname);
			} catch (Exception err) {
				// err.printStackTrace();
			}
		} else {
			System.out.println("No Selection ");
		}

	}

}
