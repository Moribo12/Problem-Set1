import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class messageEncryption {

    public static String getEcryptedMessage( String message,int key){
       String ecryptedMessage ="";

       for(int i=0;i <message.length();i++){
          char word =message.charAt(i);
          int ascii = (int) word + key;
          ecryptedMessage +=(char)ascii;
       }
          
        return ecryptedMessage;
    }

    public static String getDecryptedMessage(String message,int key){
      String decryptedMessage ="";
      for(int j=0; j <message.length(); j++){
         char word = message.charAt(j);
         int ascii = (int)word -key;
         decryptedMessage+=(char)ascii;
      }
      return decryptedMessage;
    }

    public static String messageInterface(){
      String messageReceived= "";

      Scanner s =new Scanner(System.in);
      System.out.println("Enter your meassage: ");
      String userInput =s.next();
      
      s.close();

      return messageReceived;
    }


    public static void main(String[]args){
      //String userMeassage=messageInterface();
      
      System.out.println(getEcryptedMessage("moribo", 2));
      System.out.println(getDecryptedMessage("oqtkdq", 2));

   
    }
    
}
