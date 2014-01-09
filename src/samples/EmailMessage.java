package samples;

public class EmailMessage implements Message {

  private final String sendername;
  private final String recipientEmail;

  public EmailMessage(String sendername, String recipientEmail) {
    this.sendername = sendername;
    this.recipientEmail = recipientEmail;
  }

  @Override
  public void validate() {
    if ("".equals(sendername) || "".equals(recipientEmail)) {
      throw new IllegalArgumentException("invalid data");
    }
  }

  @Override
  public void log() {
    System.out.println("Sending " + getClass().getSimpleName() + " to " + recipientEmail);
  }

  @Override
  public void archive() {
    System.out.println(getClass().getSimpleName() + " archived");
  }
}
