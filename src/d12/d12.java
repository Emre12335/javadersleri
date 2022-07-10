package d12;

import javax.naming.directory.AttributeInUseException;
import java.util.Scanner;

/* javada exception handling pythondakine benzer şekilde yapılıyor tek farkı Except yerine catch kullanlıyor*/
/* diğer her şey birebir aynı örnek bir program yazalım */
public class d12 {
    public static Scanner ui = new Scanner(System.in);
    public static void main(String[] args) {
        try {
        int a = ui.nextInt();
        int b = ui.nextInt();
        System.out.println(a/b);
        /* istersen direk kendin de error attırabilirsin */
        /*throw new AttributeInUseException("Böyle birşey attırdım");*/
        }
        catch (ArithmeticException var1){System.out.println("aritmetik hata");} /* variable yazmak zorunlu */
        catch(Exception var2){System.out.println("hata var nerde bilmiyoz.");}
        finally {
            System.out.println("Program bitti");

        }
    }
}
/* exception tiplerine sonra bakabilirsin */
