package Message;


public class Print extends Message {
	private String printAttachment;

	// Create Log to console and file
	@Override
	public void createLog() {
		String sentPrint = "\r\nNachricht erfolgreich versendet "
				+ "\r\nDrucker : " + getMsgSender() +"\r\nAnhang: " +getPrintAttachment();
		log();
		logger.info(sentPrint);

	}

	public String getPrintAttachment() {
		return printAttachment;
	}

	public void setPrintAnhang(String printAttachment) {
		this.printAttachment = printAttachment;
	}

}
