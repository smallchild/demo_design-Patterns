package Factory;

import Factory.MailSender;
import Factory.Sender;

public class SendFactory {

    public Sender buildSender(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

    public Sender buildMail(){
        return new MailSender();
    }

    public Sender buildSms(){
        return new SmsSender();
    }
}
