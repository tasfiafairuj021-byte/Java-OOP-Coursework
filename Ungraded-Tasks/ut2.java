import java.util.Scanner;

public class ut2{
  public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of a1:");
int n =sc.nextInt();
int [] a = new int [n];
for(int i =0 ; i<n ; i++){
  int input = sc.nextInt();
  a[i]= input;
}
int largest=0;
int location =0;
for(int i=0 ; i<n ; i++){
  if (a[i]>largest){
    largest=a[i];
    location =i;
  }
}
System.out.println("Largest number in array a : " +largest +" " + "Index Number:" + " " + location);
int location1 =0;
int Smallest = a[0];
for(int i=1 ; i<n ; i++){
  if (Smallest> a[i]){
    Smallest= a[i];
    location1=i;
    }
}
System.out.println("Smallest number in array a : " +Smallest +" " + "Index Number:" + " " + location1);
  }
}
