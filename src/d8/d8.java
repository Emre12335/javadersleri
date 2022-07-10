package d8;
/* Öncelikle bu ders classların nasıl çalıştığını öğreneceğiz
onları nasıl kullanacağımızı ileriki projelerde daha detaylı olarak öğreneceğiz */

/* Bir dosyanın içinde en fazla 2 tane public class olabilir ama diğer tiplerden istediğin kadar olabilir */


/* Static kullanmadığımız ve main in içinde yazmadığımız ifadeler instance variable */
/* Bunları kullanmak için obje yaratıp  objenin ismi.değişkenin ismi şeklinde çağırmamız gerek */
/* ancak bunlara erişimimiz geçen ders hatırladığımz gibi  */
/* private olan ifadeleri ayarlamak için classın içinde public fonksiyonlar oluşturuyoruz
   bunlar o ifadeye dolaylı olarak ulaşmamızı sağlıyor. */

class example{
    private int first_var;
    public int second_var = 10;

    public void first_var_setter(int fv){
        first_var = fv;
    }
    public void getFirst_var(){
        System.out.println(first_var);
    }

    public int sum_of_two(){
        return first_var + second_var;
    }

}

public class d8{
    public static void main(String[] args) {
        /* yeni obje yaratmak için */
        example n_obj = new example();
        /* first var a direk erişemeyiz */
        /*System.out.println(n_obj.first_var);*/ /* Bunu yazarsan hata alır */ /* fakat getter public idi onunla kullanabiliriz*/
        n_obj.getFirst_var();
        n_obj.first_var_setter(500);
        System.out.println(n_obj.sum_of_two());
    }
}