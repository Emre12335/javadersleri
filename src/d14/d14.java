package d14;

import java.util.Arrays;

/* 2D arrays */
public class d14 {
    public static void main(String[] args) {
        char[][] ar1 = new char[3][3];
        for (int i = 0; i < ar1.length;i++){ /* ar1 arraylerin arrayi olduğu için onun uzunluğu taşıdığı array sayısı*/
            for (int i2 = 0; i2 < ar1[i].length;i2++){ /* BU şekilde atama yapılabilir */
                ar1[i][i2] = '_';
            }
        }
        for (int i = 0; i < ar1.length;i++){ /* ar1 arraylerin arrayi olduğu için onun uzunluğu taşıdığı array sayısı*/
            /* BU şekilde atama yapılabilir */
            Arrays.fill(ar1[i], '_'); /* arraysfill yöntemi kullanılarak da bu atama yapılabilr */
        }
        System.out.println(Arrays.deepToString(ar1));
    }
}
