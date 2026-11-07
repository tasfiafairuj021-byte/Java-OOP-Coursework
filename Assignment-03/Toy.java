public class Toy{
 public String name;
 public int price;
  public String new_name;
 public Toy(String name, int price){
   this.name=name;
   this.price=price;
   System.out.println("A new toy has been made!");
 }
 public void updatePrice(int price){
   this.price=price;
 }
 public void showPrice(){
   System.out.println("price: " + price);
 }
 public void updateName(String n){
   this.new_name =n;
   System.out.println("Changing the old name: "+this.name  );
   System.out.println("new name: "+this.new_name  );
   
 }
}
