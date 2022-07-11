/* Inheritance in java */
package d16;

class Animal{
    public int try1 = 0;
    public static int count = 0;
    public int legs;
    public int arms;
    public void sound(){
        System.out.println("It gives noises");
    }
    Animal(int legs,int arms){
        this.legs = legs;
        this.arms = arms;
        count++;
    }
}

/* Inheritance yaparken extends kelimesini kullanıyoruz */
class Human extends Animal{
    public int iq;
    Human(int legs,int arms,int iq){
        super(legs,arms); /* super kelimesi parent classı ifade etmek için kullanılıyor*/
        /* Super ile */
        /* 1/ Super ile constructor çağırabiliriz */
        this.iq = iq;
    }
    @Override /* overide demezsen sorun olmaz fakat hatırlatmak için de diyorlar */
    public void sound(){
        super.sound(); /* 2 üstteki  fonksiyonu içerde birdaha çağırdım */
        System.out.println("It speaks");
    }
    public void sound2try(){
        super.sound();
    }
    public void increaseCount(){
        count++;
        super.try1++;
    }
}

class d16{
    public static void main(String[] args) {
        Human n1 = new Human(2,2,100);
        System.out.println(Animal.count); /* static olan ifadelere obje yaratmadan ulaşabiliyoruz*/
        System.out.println(Human.count); /* ayrıca 2 ifade için de ortak bir count var */
        n1.increaseCount();
        System.out.println(Animal.count);
        System.out.println(Human.count);
        n1.sound();
        System.out.println();
        n1.sound2try();
        Animal n2 = new Animal(2,2);
        System.out.println(n2.try1);
    }
}