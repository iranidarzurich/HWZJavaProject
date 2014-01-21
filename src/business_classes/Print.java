package MultiChanelBasicCalsses;

public class Print extends Message {
	private String printAttachment;
	private String Printername;

	public String getPrintAttachment() {
		return printAttachment;
	}

	public void setPrintAttachmnet(String printAttachment) {
		this.printAttachment = printAttachment;
	}

	public String getPrintername() {
		return Printername;
	}

	public void setPrintername(String printername) {
		Printername = printername;
	}

	// Create Log to console and file
	@Override
	public void createLog() {
		String sentPrint = "\r\nNachricht erfolgreich versendet "
				+ "\r\nDrucker : " + getPrintername() + "\r\nAnhang: "
				+ getPrintAttachment() + "\r\n";
		log();
		logger.info(sentPrint);
	}

}
