package Message;

public class Print extends Message{

	@Override
	public void createLog() {
		System.out.println("Text wird ausgedruckt" + "\n\n" + "Inhalt: "+getMsgText());
		
	}

	
	}


