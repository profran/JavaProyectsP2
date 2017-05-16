package gmail;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class GmailInbox {

    public String pass;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        GmailInbox gmail = new GmailInbox();
        gmail.read();

    }

    public void read() {

        Properties props = new Properties();

        try {
            props.load(new FileInputStream(new File("/home/pii2017/Documents/PII2017/Java/Gmail/src/gmail/smtp.properties")));
            Session session = Session.getDefaultInstance(props, null);

            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", "11xd2xd3xd@gmail.com", "123456789ff");

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_ONLY);
            int messageCount = inbox.getMessageCount();

            System.out.println("Total Messages:- " + messageCount);

            Message[] messages = inbox.getMessages();
            System.out.println("------------------------------");

            for (int i = 0; i < messageCount; i++) {
                System.out.println("Mail Subject:- " + messages[i].);
            }

            inbox.close(true);
            store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
