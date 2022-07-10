/* Değisken tanimlama */
package d2;

public class d2 {
    /* değiskenleri classın içinde yada main in içinde tanımlayabiliriz. */
    /* main in içinde değil classın içinde tanımlarken mutlaka static ekleyerek değişken tanımlamalıyız.*/
    /* bu classın o değişkene erişebilmesini sağlıyor.*/

    /*Ornek*/
    static String n1 = "Emre";
    /* eger degiskenin degistirilemez olmasını istiyorsan final ekliyorsun */
    static final float PI = 3.14F;
    public static void main(String[] args){
        /* main in içinde yazarken ise public demeye gerek yok o bölgesel olacaktır */
        int nine_var = 9;
        System.out.println(PI);
        System.out.println(n1);
        System.out.println(nine_var);
    }
}
/* Bir sonraki derste javadaki degisken tiplerine bakacagiz */