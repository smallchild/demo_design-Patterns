package Factory;

public class FactoryTest {
    public static void main(String str[]){
        SendFactory sendFactory = new SendFactory();
        sendFactory.buildSender("sms").send();
    }
}
