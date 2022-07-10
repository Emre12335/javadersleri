/* kullanıcı girdisi almak */

/* diğer dillerden farklı olarak javada kullanıcı girdisi bir obje tarafından yapılıyor.
Bu obje klavyeye girilen inputları imleç yardımıyla takip ediyor.
 */

/* Yani pythondaki gibi yada C deki scanf gibi satır satır değil bütün ekranı direk olarak algılıyor.*/

package d4;

import java.util.Scanner; /* Bu objeyi yaratmak için bu kütüphaneyi kullanıyoruz.*/
public class d4 {
    public static void main(String[] args){
        /* Baştaki Scanner tipi sondaki Scanner fonksiyon */
        /* new kelimesi javada yeni bir obje yaratırken kullanılıyor. */
        Scanner inputlar = new Scanner(System.in);
        /* Bu yazdığımız obje şuan bütün girdileri okuyabilme potansiyeline sahip */
        /* fakat biz kaç adet input istersek imleç oraya kadar takip edecek */
        /* input isteklerimiz Scanner objesinin yanına next getirerek elde edilir*/
        /* eğer spesifik bir tip istersen nextInt,nextDouble gibi ifadelere ihtiyaç var.*/
        /* örnek isim soyisim yaş alalım */
        String isim = inputlar.next();
        String soyisim = inputlar.next();
        int yas = inputlar.nextInt();
        /* tam üç tane okuduktan sonra durmasının sebebi programdan 3 defa girdi istedik.*/
        System.out.println(isim + " " + soyisim + " " + yas);
        if(inputlar.hasNextInt()){
            System.out.println("Devamında sayı girdin");
        }
        else{
            System.out.println("Devamında sayı girmedin");
        }
        /* ayrıca imleçde ilerde istediğimiz türde ifade olup olmadığını da kontrol edebiliyoruz. */
    }
}

/* Not javada ardışık ifade print etmek için + kullanıyoruz direk */