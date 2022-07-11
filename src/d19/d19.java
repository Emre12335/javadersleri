package d19;
/* javada nesne kopyalama işlemi nasıl yapılır onu göstereceğiz */
/* önce classımızı oluşturuoyruz */
public class d19 {
    public static void main(String[] args) {
        NewObject n1 = new NewObject();
        NewObject n2 = new NewObject(100,200,300);
        n1.printall();
        n2.printall();
        n2.copy(n1);
        System.out.println();
        n1.printall();
        n2.printall();

    }
}
