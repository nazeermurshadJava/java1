package abstractMethod;

public abstract class Car {
    String color;
    int price;
   public  void setColor(String color){
        this.color=color;
    }

  public   void setPrice(int price){
        this.price=price;
    }
    public String getColor(){
       return color;
    }
    public int getPrice(){
       return price;
    }
    abstract void dashBoard();
   abstract void features();
   abstract void engine();


}
