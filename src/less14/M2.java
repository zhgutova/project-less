package less14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class M2 {
 
   public static void main(String[] args) {
 
    
       final String TEXT = "b1 + n";	//;float b= 130;float c= 110 ; ";
 
       String regex1 = "(\\s+[a-zA-Z]+\\d*\\s*)(\\+)(\\s*\\d+\\s*)"; //нпр X + 10
       String regex2 = "(\\s+\\d+\\s*)(\\+)(\\s*\\d+\\s*)"; // нпр 10 + 15
       String regex3 = "(\\s*\\d+\\s*)(\\+)(\\s*[a-zA-Z]+)"; //нпр 10 + X
       String regex4 = "(\\s*[a-zA-Z]+\\d*\\s*)(\\+)(\\s*[a-zA-Z]+\\d*\\s*)"; //нпр, x + y
       
 
       Pattern pattern1 = Pattern.compile(regex1);
       Matcher matcher1 = pattern1.matcher(TEXT);
 
       Pattern pattern2 = Pattern.compile(regex2);
       Matcher matcher2 = pattern2.matcher(TEXT);
       
       Pattern pattern3 = Pattern.compile(regex3);
       Matcher matcher3 = pattern3.matcher(TEXT);
      /* System.out.println(matcher3.matches());
       System.out.println(matcher3.matches());
       System.out.println(matcher3.find());
       System.out.println(matcher3.find());*/
       
       Pattern pattern4 = Pattern.compile(regex4);
       Matcher matcher4 = pattern4.matcher(TEXT);
       
       //System.out.println(matcher1.find());

       if (matcher1.matches()) {
     //  while (matcher1.find()) {
           System.out.println("все выражение1: " + matcher1.group(0));
           System.out.println("операнд1: " + matcher1.group(1));
           System.out.println("операция: " + matcher1.group(2));
           System.out.println("операнд2: " + matcher1.group(3));      
     //  }
       }
       else if (matcher2.matches()) {
     //  while (matcher2.find()) {
           System.out.println("все выражение2: " + matcher2.group(0));
           System.out.println("операнд1: " + matcher2.group(1));
           System.out.println("операция: " + matcher2.group(2));
           System.out.println("операнд2: " + matcher2.group(3));      
      // }
            }
       else if (matcher3.matches()) {
      // while (matcher3.find()) {
           System.out.println("все выражение3: " + matcher3.group(0));
           System.out.println("операнд1: " + matcher3.group(1));
           System.out.println("операция: " + matcher3.group(2));
           System.out.println("операнд2: " + matcher3.group(3));      
      // }
       }
       else if (matcher4.matches()) {
      // while (matcher4.find()) {
           System.out.println("все выражение4: " + matcher4.group(0));
           System.out.println("операнд1: " + matcher4.group(1));
           System.out.println("операция: " + matcher4.group(2));
           System.out.println("операнд2: " + matcher4.group(3));      
    //   }
       }
   }
}