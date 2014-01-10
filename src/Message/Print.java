package Message;

public class Print extends Message{

	@Override
	public void sendMessage() {
		System.out.println("Text wird ausgedruckt" + "\n\n" + "Inhalt: "+getMsgText());
		
	}

	
	}


