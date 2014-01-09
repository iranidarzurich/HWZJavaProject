package samples;

public class SmsMessage implements Message {
  private final String sendName;
  private final String recipientPhone;
  private final String serviceProvider;

  public SmsMessage(String sendName, String recipientPhone, String serviceProvider) {
    this.sendName = sendName;
    this.recipientPhone = recipientPhone;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public void validate() {
    if ("".equals(sendName) || "".equals(recipientPhone) || "".equals(serviceProvider)) {
      throw new IllegalArgumentException("invalid data");
    }
  }

  @Override
  public void log() {
    System.out.println("Sending " + getClass().getSimpleName() + " to " + recipientPhone);
  }

  @Override
  public void archive() {
    System.out.println(getClass().getSimpleName() + " archived");
  }
}
