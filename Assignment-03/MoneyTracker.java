public class MoneyTracker{
  public String name;
  public double cB=0.0;
  public double lA;
  public double lS;
  public MoneyTracker(){
    System.out.println("A new money tracker has been launched.");
  }
  
  public void createTracker(String name){
    this.name = name;
    cB=1.0;
  }
  public String info(){
    return "Name:" + name + "\n Current Balance:" + cB;
  }
  
  public void income(double in){
    lA=in;
    cB+=in;
    System.out.println("Balance Updated!");
  }
 
  public void expense(double ex){
     
    
    if(cB>=ex){
      lS=ex;
      System.out.println("Balance Updated.");
      cB-=ex;
      if(cB==0){
      System.out.println("You're broke");
    }
    }
    else if(ex>cB){
    System.out.println("Not enough balance.");
    }  
  }
  
  public void showHistory(){
    System.out.println("Last Added : " + lA);
    System.out.println("Last Spent : " + lS);
  }
}
