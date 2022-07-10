package d10;
/* Pythondaki init gibi kullanıcıya parantez içinde değer atamak için */
/* Javada constructor adı verilen bir ifade var */
/* Bu, obje yaratılırken girdi girerek objenin yapsınıa karar vermemizi sağlıyor.*/

class Robot{
    public int legs;
    public int arms;
    public int heads;

    /* constructor yaratarak otomatik atama yapabiliyoruz. */
    /* constructor main class ile aynı isimde olmalı
     */
    Robot(int l,int a,int h){
        legs = l;
        arms = a;
        heads = h;
    }
    /* constructorlar da overload yapılabilir*/
    Robot(int legs,int arms){
        this.legs = legs;
        this.arms = arms;
        this.heads = 1;
    }
    /* this eki aynı isimli instance ve local variable var ise instance olduğunu belirtmek için kullanılıyor. */
    public void show_all(){
        System.out.println("legs: "+this.legs+" arms: "+this.arms+" heads: "+this.heads);
    }
}

public class d10 {
    public static void main(String[] args) {
        Robot nr = new Robot(2,2);
        Robot nr2 = new Robot(2,2,5);
        System.out.println("nr");
        nr.show_all();
        System.out.println("nr2");
        nr2.show_all();

    }
}
/* Not static methodlar instancelara erişemiyor.*/
