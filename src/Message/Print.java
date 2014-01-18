package Message;


public class Print extends Message {
	private String printAttachment;

	// Create Log to console and file
	@Override
	public void createLog() {
		String sentPrint = "\nNachricht erfolgreich versendet "
				+ "\nDrucker : " + getMsgSender() +"\nAnhang: " +getPrintAttachment();
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
