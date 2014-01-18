package Message;


public class Print extends Message {
	private String printAnhang;

	// Create Log to console and file
	@Override
	public void createLog() {
		String sentPrint = "\nNachricht erfolgreich versendet "
				+ "\nDrucker : " + getMsgAbsender();
		log();
		logger.info(sentPrint);

	}

	public String getPrintAnhang() {
		return printAnhang;
	}

	public void setPrintAnhang(String printAnhang) {
		this.printAnhang = printAnhang;
	}

}
