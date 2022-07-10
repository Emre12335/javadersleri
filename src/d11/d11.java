/* this kelimesinin constructorlar ile bir kullanımı daha var*/
/* Bu ders bunu görüceğiz */
package d11;
class Level{
    private int lvl;
    private int degree;
    Level(int lvl){
        this.lvl = lvl;
        this.degree = 5;
    }
    Level(int lvl1,int degree1){
        this(lvl1); /* constructor overload yaparken bu şekilde tekrardan çağırıp aynı şeyleri birdaha yazamaktam
        kurtulabilirsin */
        this.degree = degree1;
    }
    public void increase_a(){
        this.lvl++;
    }
    public void show_All(){
        System.out.println(lvl);
        System.out.println(degree);
    }
}
public class d11 {
    public static void main(String[] args) {
        Level l1 = new Level(10,10);
        l1.show_All();
        l1.increase_a();
        l1.show_All();

    }
}
