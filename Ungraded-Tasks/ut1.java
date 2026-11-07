import java.util.Arrays;
import java.util.Scanner;

public class ut1{
  public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of a1:");
int n =sc.nextInt();
int [] a1 = new int [n];
for(int i =0 ; i<n ; i++){
  int input = sc.nextInt();
  a1[i]= input;
}
System.out.println("Enter another number:");
int n1= sc.nextInt();
int match=0;
for (int i=0 ; i<n ;i++){
  if (a1[i]==n1){
    match++;}
}
int j=0;
  int [] a2 = new int [n-match];
  for(int i=0 ; i<a1.length ;i++){
    if(a1[i]!=n1){
      a2[j]=a1[i];
      j++;}
  }
 System.out.println(Arrays.toString(a1));
  System.out.println(Arrays.toString(a2));

  }
}
