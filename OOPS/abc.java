
public class abc{
 public static void main(String args[]){
  Pen p1 = new Pen();
  
  p1.setColor("Yellow");
  System.out.println(p1.getColor());
  p1.setTip(5);
  System.out.println(p1.getTip());

 }
}
class Pen {
private String color;
private int tip;


String getColor(){
 return this.color;
}
void setColor(String color) {
 this.color = color;
}

int getTip(){
 return this.tip;
}

 void setTip(int tip) {
 this.tip = tip;
}
}
