/* Javada dinamik array nasıl oluşturlur onu göreceğiz */
/* Ve methodları göreceğiz.*/
package d15;

import java.util.ArrayList;


public class d15 {
    public static void printList(ArrayList<Integer> nl){
        System.out.print("[");
        for (int i = 0; i<nl.size()-1;i++) {
            System.out.print(nl.get(i));
            System.out.print(",");
        }
        System.out.print(nl.get(nl.size()-1));
        System.out.println("]");    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        /* Wrapper class kullanımı zorunlu */
        /* ArrayList<Integer> l1 = new ArrayList<Integer>(); */ /*Bu hata alıyor wrapper class kullanmak zorundayız */
        /* ArrayList<Integer> l2 = {1,2,3,4,5}; bu şekilde de initalize etmek mümkün değil */

        /* eleman eklemek için add kullamıyoruz */
        l1.add(5);
        l1.add(7);
        l1.add(1);
        l1.add(9);
        printList(l1);
    }
}
