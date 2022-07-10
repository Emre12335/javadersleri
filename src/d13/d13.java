/* Java'da arrayler */
/* Java da da diğer dillerde olduğu gibi array var */
/* ancak javadaki arrayler bir obje */
/* Bu yüzden arrayleri de new eki ile yaratmamız gerekiyor;*/
package d13;

import java.util.Arrays;

public class d13 {
    public static void main(String[] args) {
        String[] cars = new String[3];
        cars[0] = "Volkswagen";
        cars[1] = "Renault";
        cars[2] = "Audi";
        String[] cars2 = {"Volkswagen","Renault","Audi"}; /* BU şekilde direk olarak da initialize edebilirsin*/
        for(String a:cars){
            System.out.println(a);
        }/* bu şekilde de elemanlara erişebiliyoruz.*/
        Arrays.sort(cars2); /* sort methodu ile arrayi sortlayabilirsin */
        for(int i = 0;i < cars.length;i++){
            System.out.println(cars2[i]); /* Bu iki for loop birbirinin aynısı */
        }

    }
}
