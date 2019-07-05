package Factory;

public class SmsSender implements Sender {
    @Override public void send() {
        System.out.print("this is SmsSender!");
    }
}
