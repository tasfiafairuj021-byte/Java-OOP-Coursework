import java.util.Scanner;

public class Assignment3{
  public static void main (String[]args){
Scanner sc = new Scanner (System.in);
System.out.println("input the size of an array a:");
int n = sc.nextInt();
int [] a = new int [n];
for(int i=0 ; i<n ;i++){
 int input=sc.nextInt();
 a[i]=input;
}
for(int i=0 ; i<n ; i++){
int e = a[i];
int count=0;
boolean found = false;
for(int k=0 ; k<i ;k++){
  if(a[k]==e){
    found = true;
    break;
  }
}
if(found==false){
for(int j=i ; j<n ; j++){
int f = a[j];
if(e==f){
  count++;
}
}

System.out.println(e + " - " + count +" times.");
}
}
  }
}
