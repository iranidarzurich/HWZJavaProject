package Message;

public class Print extends Message {
	private String printAttachment;
	private String Printername;

	// Create Log to console and file
	@Override
	public void createLog() {
		String sentPrint = "\r\nNachricht erfolgreich versendet "
				+ "\r\nDrucker : " + getMsgSender() + "\r\nAnhang: "
				+ getPrintAttachment() + "\r\n";
		log();
		logger.info(sentPrint);

	}

	public String getPrintAttachment() {
		return printAttachment;
	}

	public void setPrintAnhang(String printAttachment) {
		this.printAttachment = printAttachment;
	}

	public String getPrintername() {
		return Printername;
	}

	public void setPrintername(String printername) {
		Printername = printername;
	}

}
