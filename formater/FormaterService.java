package formater;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.regex.*;
import java.io.*;
import com.dataaccess.webservicesserver.*;
import java.math.BigInteger;


@WebService
  public class FormaterService{

    @WebMethod
      public String format(String line){
  	    line = line.trim().replaceAll(" +", " ");
        String response=null;
        Integer number_;
        Integer text=0;
        BigInteger number;
        NumberConversion service = new NumberConversion();
        NumberConversionSoapType port = service.getNumberConversionSoap();

         Pattern p=Pattern.compile("\\d+");
         Matcher m = p.matcher(line);
         while(m.find()) {
           number_=Integer.valueOf(m.group());
           number=BigInteger.valueOf(number_);
           response=port.numberToWords(number);
           response=response.substring(0,(response.length()-1));
           line=line.replaceAll(m.group(),m.group()+" ("+response+")");
         }

        return line;
      }


  }
