package jp.co.u_idea2.batch.common.util;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;

import java.io.IOException;

public class SendGridUtil {

    public void sendMail(String from, String to, String cc, String bcc, String subject, String content) throws Exception{
        if (null == from || null == to){
            throw new Exception("From and To must exists.");
        }
        Email fromSend = new Email(from);
        Email ccSend, bccSend;
        String subjectSend = "Hello World from the SendGrid Java Library!";
        if (null!= subject) subjectSend=subject;
        Email toSend = new Email(to);
        Content contentSend = new Content("text/plain", "Hello, Email!");
        if (null!= content) contentSend.setValue(content);
        Mail mail = new Mail();
        mail.setSubject(subjectSend);
        mail.setFrom(fromSend);
        mail.setReplyTo(fromSend);
        mail.addContent(contentSend);
        Personalization personalization = new Personalization();
        if (null!= cc) {
            ccSend = new Email(cc);
            personalization.addCc(ccSend);
        }
        if (null!= bcc) {
            bccSend = new Email(bcc);
            personalization.addBcc(bccSend);
        }
        personalization.addTo(toSend);
        mail.addPersonalization(personalization);
        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            throw ex;
        }
    }
}
