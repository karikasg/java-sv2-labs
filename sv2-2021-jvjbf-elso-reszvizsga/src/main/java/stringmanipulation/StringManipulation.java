package stringmanipulation;

public class StringManipulation {
     private String str = "";

     public String everyEvenCharacter(String s){
          for (int i=0; i<s.length(); i+=2){
               str = str + s.charAt(i);
          }
          return str;
     }
}
