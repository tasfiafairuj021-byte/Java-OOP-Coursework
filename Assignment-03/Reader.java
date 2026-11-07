public class Reader{
  public String name = "New user";
  public int cap=2 ;
  public int new_cap;
  public String [] bn ;
  public String[] new_bn;
  public int count=0;
   
   public Reader(String name){
     this.name=name;
     System.out.println("A new reader is created!");
     bn = new String[cap];
     }
   
   
   public Reader(String name, int cap){
     this.name= name;
      System.out.println("A new reader is created!");
     this.cap= cap;
      bn = new String[cap];
   }
   
   public void addBook(String n) { 
     if(count<cap){
       bn[count]=n;
       count++;
       
     }
     else{
       System.out.println("No more capacity");
   }
   }

public void readerInfo(){
 System.out.println("Name:" + this.name);
  System.out.println("Capacity:" + this.cap);
  System.out.println("Books:");
  if(count==0){
    System.out.println("No books added yet");}
  else{
    System.out.println("Books:");
    for(int i=0; i<count ; i++){
      
      System.out.println();
      System.out.println("Book "+ (i+1) + ":" + bn[i]);
    }
  }
}
public void updateCapacity(int c){
  this.new_cap=c;
 System.out.println("Capacity has been changed to "+ this.new_cap);
 new_bn = new String[new_cap];
 for(int i=0 ; i< new_cap ;i++){
   if(i<cap){
     new_bn[i]=bn[i];}
  
 }
  bn = new_bn;
   this.cap =new_cap;
   
}
}
