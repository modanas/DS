public class MultipleInheritance {
 public static void main(String[] args) {
  Bear b = new Bear();
  b.eatGrass();
  b.eatFlesh();
 }
}
interface Herbivore{
 void eatGrass();
}
interface Carnivores{
void eatFlesh();
}

class Bear implements Herbivore, Carnivores {
 public void eatGrass(){
  System.out.println("Can eat grass");
 }
 public void eatFlesh(){
  System.out.println("Can eat flesh");
 }
}
