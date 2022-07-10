/* değişken çeşitleri(local-global/class-instance variables) */
/* fonksiyonun içine yazdığımız variable local dışında olan global */
/* static keyword ile yazdığımız variablelar class diğerleri instance variable */
/* 2.konsepte spnraki videolarda daha net bir şekilde girilecek bu video 1. olarak global ve local variablelar için */
package d6;



public class d6 {
    static int global_class_var1 = 0;
    //int global_instance_var1 = 100;
    public static void main(String[] args) {
        /* global_class_var1 i direk olarak çağırıp değiştirebiliriz. */
        System.out.println(global_class_var1);
        global_class_var1 ++;
        /* global olan değişti çünkü direk olarak çağırdık */
        System.out.println(global_class_var1);
        add_to_local_var_with_same_named_global_var();
        /* bu fonksiyon değiştirmedi çünkü aynı isimli local bir değişken oluşturmuş olduk sadece */
        System.out.println(global_class_var1);
        /* aynısını main in içinde de yapmış olsaydık main in içinde 15 diye gözükürdü fakat dışarda yine aynı kalırdı */
    }
    public static void add_to_local_var_with_same_named_global_var(){
        int global_class_var1 = 15;
        System.out.println(global_class_var1);
    }
}
/* instance variablelara başka bir zamanda geçeceğiz.*/
/* ama şimdilik static in ne işe yaradığını ve local-global variable arasındaki farkı anlamış olduk */
