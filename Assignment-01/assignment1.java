import java.util.Scanner;

public class assignment1{
  public static void main (String[]args){
Scanner sc= new Scanner (System.in);
System.out.println("input integer number a:");
int a= sc.nextInt();
System.out.println("input integer number b:");
int b= sc.nextInt();
int pn=0;
for(int i=a ; i<=b ; i++){
  int count=0;
  for(int j=1 ; j<=i ; j++){  
  if (i%j==0){ 
  count++;
}
}  
 if(count==2){
    pn++;
    
  }
}
System.out.println("there are "+ pn + " prime numbers between "+ a +" and " + b);
  }
}
