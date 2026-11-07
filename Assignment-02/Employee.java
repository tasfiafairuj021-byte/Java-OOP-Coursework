public class Employee{
  public String Name;
  public double Salary =30000;
  public  String Desiganation = "junior";
  public double tax; 
  public void newEmployee(String Name){
    this.Name=Name;
  }
  public void displayInfo(){
    System.out.println("Employee name:" + this.Name);
    System.out.println("Employee salary:" + this. Salary);
    System.out.println("Employee Desiganation:" + this.Desiganation);
  }
  public void calculateTax(){
    if(Salary>50000){
      tax=Salary*(30.0/100);
      System.out.println(this.Name + "tax amount is:" + tax +"tk");
    }
    else if(Salary>30000){
      tax=Salary*(10.0/100);
      System.out.println(this.Name + "tax amount is:" + tax +"tk");
    } 
    
    else{
      System.out.println(this.Name +"does not need to pay tax");
    }
  }
    
    public void promoteEmployee(String Desiganation){
      this. Desiganation =  Desiganation ;
      if ( Desiganation.equals("manager")){
      Salary=Salary+ 75000;
    }
      
      else if ( Desiganation.equals("lead")){
      Salary=Salary+ 50000;
    }
       else if ( Desiganation.equals("senior")){
      Salary=Salary+ 25000;
     
    }
    }
  }
