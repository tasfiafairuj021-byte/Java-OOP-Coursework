public class MagicPotion{
  public String colour;
  public int strength;
  public boolean active;
  public void setDetails(String colour , int strength){
    this.colour = colour;
    this.strength = strength;
  }
  public void activate(){
    if(strength<5){
      active=false;}
      else {
        active=true;}
      if(strength>5){
        System.out.println("Potion is already activated");
      }
       }
    public void describe(){
      System.out.println("potion colour:" + this.colour);
      System.out.println("potion strength:" + this.strength);
      System.out.println("potion is active:" + this.active);
    }
    public void boost(){
   strength+=1;
    }
    public boolean isStrong(){
      if(strength<7){
        return false;
      }
      else{
        return true;
      }
    }
    public void weaken(){
      strength-=1;
    }
  }
