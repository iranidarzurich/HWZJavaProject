package Message;

public class MMS extends Message {

	@Override
	public void createLog() {
		super.createLog();
	}

	public MMS() {
		super();
		this.setMsgType("MMS");
	}

}
