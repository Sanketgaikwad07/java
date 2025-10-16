//import mail.MimeMessage;
//import mail.Session;
//
//import java.util.Properties;
//
//class SendEmail{
//    public static void main(String[] args) {
//        //who recv
//        String recipient="SantoshMule2004@gail.com";
//        //who send
//        String sender="sanketgaikwad1820@gmail.com";
//
//        // host as localhost
//
//        String host="127.0.0.1";
//
//        //system properties
//        Properties mypropertie=System.getProperties();
//
//        //mail server
//        mypropertie.setProperty("smtp.gmail.com",host);
//
//        //seesion obj for get properties
//
//        Session session=Session.getDfaultInstance(mypropertie);
//        try{
//
//            //meassge to obj
//            MimeMessage messge=new MimeMessage(session);
//
//            // adding to sender
//            messge.setForm(new InternetAddress(sender));
//
//            //addting recv
//            Object Message;
//            messge.addrecipient(Message.Recipienttype.To,new InternetAddress(recipient));
//
//
//        }
//    }
//}