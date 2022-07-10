package d9;
/* Bu derste overloading konseptini öğreneceğiz */
/* Bu python veya c gibi dillerde olmayan bir konsept */

/* Aynı isimli fonksiyon yaratabiliyoruz java da */
/* fakat farklı girdi sırasına yada türüne yada sayısına sahip olması gerek */
/* method çağırıldığında java uygun olan methodu seçip otomatik kullanıyor */
class funcs{
    public int sum(int a,int b){
        return a+b;
    }
    /* sayısı değişebilir */
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    /* türü değişebilir */
    public int sum(float a,int b){
        /* javada flaot ile int toplanamıyor otomatik olarak*/
        int n1 = (int)a;
        return n1+b;
    }
    /* girdilerin sırası değişebilir */
    public int sum(int b,float a){
        int n1 = (int)a;
        return n1+b;
    }
    /* fakat girdiler birebir aynıysa farklı türde ifadeler dönderse bile hata alır */
    /*public float sum(int c,int d){
        float n1 = (float)c;
        float n2 = (float)d;
        return n1 + n2;
    }*/
}

class d9{
    public static void main(String[] args) {
        funcs f1 = new funcs();
        System.out.println(f1.sum(5,9));
        System.out.println(f1.sum(5,9.5f));
        System.out.println(f1.sum(5.5f,9));
        System.out.println(f1.sum(5,9,14));
    }
}