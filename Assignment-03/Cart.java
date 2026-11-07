public class Cart{
  public  int cart_num;
  public  int max=3;
  public String [] obj_name =new String[max];
  public double [] obj_price=new double[max];
  public int count=0;
  public double dA;
  public  double Tprice;
  
  
  
  public void create_cart(int cart_num){
    this.cart_num = cart_num;
  }
  public void addItem(String n, double price){
    if(count<max){
      
      obj_name[count]=n;
       obj_price[count]=price;
       Tprice+=price;
      count++;
        System.out.println(n+" added to cart" + this.cart_num);
       System.out.println("You have "+ count +"item(s) in your cart now");
      
  }
    
    else{
      System.out.println("you already have " + max +"item in your cart.");
    }
  }
  
   public void addItem(double price,String n){
    if(count<max){
      
      obj_name[count]=n;
      obj_price[count]=price;
      Tprice+=price;
      count++;
        System.out.println(n+" added to cart" + this.cart_num);
       System.out.println("You have "+ count +"item(s) in your cart now");
      
  }
    
    else{
      System.out.println("you already have " + max +"item in your cart.");
    }
  }
  
  public void giveDiscount(double dA){
    this.dA=dA;
      Tprice-=Tprice*(dA/100);
   
  }
  
  public void cartDetails(){
    System.out.println("your cart(c" + cart_num + ") :");
    for(int i=0 ; i<count ; i++){
      System.out.println(obj_name[i] + "  - " + obj_price[i]);
    }
    
    System.out.println("Discount Applied: " + dA + "%");  
    System.out.println("Total price:" + Tprice);}
}
