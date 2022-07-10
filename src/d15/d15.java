/* Javada dinamik array nasıl oluşturlur onu göreceğiz */
/* Ve methodları göreceğiz.*/
package d15;
import java.util.ArrayList;
import java.util.Collections;


public class d15 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        /* Wrapper class kullanımı zorunlu */
        /* ArrayList<Integer> l1 = new ArrayList<Integer>(); */ /*Bu hata alıyor wrapper class kullanmak zorundayız */
        /* ArrayList<Integer> l2 = {1,2,3,4,5}; bu şekilde de initalize etmek mümkün değil */

        /* eleman eklemek için add kullamıyoruz */
        l1.add(5);
        l1.add(7);
        l1.add(1);
        l1.add(9);
        l1.add(0,1000);
        /* istediğin pozisyona da ekleme yapabilirsin add ile */

        /* Arraylerden farklı olarak arraylistler direk print edilebiliyor*/
        System.out.println(l1);
        /* Arraylistlerin eleman sayısını görmek length değil size kullanılıyor*/
        /* for loop un içinde de size kullanıyoruz */
        for (int i = 0; i < l1.size(); i++) { /* size kullandık */
            /* istediğimiz pozisyondaki elemanı değiştirmek için set kullanıyoruz */
            l1.set(i,i*i); /* i. elemanı i*i ye çeviriyor */
        }
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));}

        /* eleman çıkarmak için remove kullanıyoruz */
        /* javada pop yok bütün çıkarma işlemleri O(n)'de gerçekleşiyor */
        l1.remove(0);
        System.out.println(l1);
        /* Indexof sayesinde istenen elementin indexine ulaşabilirsin arrayde yoksa -1 dönderiyor */
        System.out.println(l1.indexOf(9));
        System.out.println(l1.indexOf(1000));
        l1.add(1,1000);
        /* Sortlama için Collections module'ü kullanmak gerekiyor*/
        Collections.sort(l1);
        System.out.println(l1);
        /* IsEmpty Clear ve clone */
        /* clone listeyi direk kopyalamaya yarıyor*/
        ArrayList<Integer> l2 = (ArrayList<Integer>) l1.clone();
        /* Uyarı alıyor neden aldığını bilmiyorum ama çalışıyor */

        /* Boş olup olmadığını kontrol eder */
        System.out.println(l1.isEmpty());

        /* arrayi temizler */
        l1.clear();
        System.out.println(l1.isEmpty());
    }
}
