package samples;

public class PrintMessage implements Message {

  private final String sendername;
  private final String recipientPrint;

  public PrintMessage(String sendername, String recipientPrint) {
    this.sendername = sendername;
    this.recipientPrint = recipientPrint;
  }

  @Override
  public void validate() {
    if ("".equals(sendername) || "".equals(recipientPrint)) {
      throw new IllegalArgumentException("invalid data");
    }
  }

  @Override
  public void log() {
    System.out.println("Sending " + getClass().getSimpleName() + " to " + recipientPrint);
  }

  @Override
  public void archive() {
    System.out.println(getClass().getSimpleName() + " archived");
  }
}
