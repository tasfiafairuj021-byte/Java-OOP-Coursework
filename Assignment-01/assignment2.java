import java.util.Scanner;

public class assignment2{
  public static void main(String[]args){
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter a string input s1:");
 String s1= sc.nextLine();
 String s2="";
 for(int i=0 ; i<s1.length() ; i++){
  char c =s1.charAt(i);
  char p = (char)((int)c-1);
  s2+=p;
 }
 System.out.println("new String:" + s2);
  }
}
