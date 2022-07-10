/* Degisken tipleri */
package d3;

public class d3 {

    public static void main(String[] args) {
        /* alttakilerin hepsi signed olarak tanımlı */
        /* 1 byte 8 bit ediyor */
        byte nbyte = 127; /* (-128 to 127) */ /* signed olarak tanımlı 1 byte kadar*/
        System.out.println(nbyte);
        short nshort = 30500; /* (-32768 to 32767 */ /* signed olarak tanımlı 2 byte kadar */
        System.out.println(nshort);
        int nint = 5000000; /* 4 byte kadar */
        System.out.println(nint);
        long nlong = 50000000L; /* long ve float u tanımlarken sonuna L ve F getiriyoruz . /* 8 byte */
        System.out.println(nlong);
        float nfloat = 3.14F; /* 4 byte */
        System.out.println(nfloat);
        double ndouble = 8.245; /* 8 byte */
        System.out.println(ndouble);
        boolean nbool = true;
        System.out.println(nbool);
        char nchar = 'a';
        System.out.println(nchar);
        String nstring = "new string"; /* String */
        System.out.println(nstring);

        /* Ayrıca Bu özel veri tiplerinin classları baş harfi büyük olacak şekilde tam adı yazılıyor */
        /* Veri tiplerinin classları */
        /* Float
           Byte
           Short
           Integer
           Double
           Boolean
           String
           Char
         */
        System.out.println(Float.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        /* String -> Diğer veri tipleri */
        /* Bunun için classın ismini yazıp toString eklememiz lazım */
        String n2st =  Integer.toString(nint);
        System.out.println(n2st);
        String n3st = Float.toString(nfloat);
        System.out.println(n3st);

        /* Diğer veri tipleri -> String */
        /* class ismi.parse... yı kullanıyoruz.*/
        float n3tofloat = Float.parseFloat(n3st);
        int n2toint = Integer.parseInt(n2st);
        System.out.println(n3tofloat);
        System.out.println(n2toint);

        /* Diğer veri tipleri -> Diğer veri tipleri */
        int n3tr = (int)n3tofloat;
        float n2tr = (float) n2toint;
        System.out.println(n3tr);
        System.out.println(n2tr);

    }
}
