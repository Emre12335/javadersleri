/* Son konu polymorphizm ve dynamic polymorphisizm */
/* Polymorphizm aynı aileden olup aynı sınıftan olmayan objelerin(inherit edlimiş ve parent classların)
Overriding edilmiş methodlarının aynı isimle çağırılınca farklı tepkiler vermesidir */
package d20;
import java.util.ArrayList;
import java.util.Scanner;
class Animal{
    public void speak(){
        System.out.println("noises");
    }
}
class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("wauf wauf");
    }
}
class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("meow meow");
    }
}

public class d20 {
    public static Scanner ui1 = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Animal> l1 = new ArrayList<Animal>();
        Animal a1 = new Animal();
        Dog a2 = new Dog();
        Cat a3 = new Cat();

        l1.add(a1);
        l1.add(a2);
        l1.add(a3); /* farklı metotlara sahip oldukları halde çağırılınca yine aynı sı geldi ve onaylandı.*/
        for (Animal a: l1) {
            a.speak();
        }

        /* Başka bir olay da objenin subclassınnı türüne compile aşamasındayken karar verebşiliyoruz*/

        /* örnek yeni bir hayvan objesi yaratalım */


    }
}
