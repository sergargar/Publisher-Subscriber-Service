package formater;

import javax.xml.ws.Endpoint;

public class FormaterPublisher{
  public static void main(String [] args){
    final String url = "http://localhost:55005/rs";
    System.out.println("Publishing FormaterService at endpoint " +url);
    Endpoint.publish(url,new FormaterService());
  }
}
