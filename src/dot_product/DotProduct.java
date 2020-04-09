package dot_product;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Mahedi Hassan
 * 2020-03-24
 */

public class DotProduct {
    public static void main(String [] a){
        getProduct(new int[] {10, 6, -3,-6, -9, 1});
    }

    private static void getProduct(int [] data){
        int posMax1 = 0, posMax2 = 0;
        int negMax1 = 0, negMax2 = 0;
        int tmp;
        for (int i = 0; i < data.length; i++){
            tmp = data[i];
            if (tmp > posMax1){
                posMax2 = posMax1;
                posMax1 = tmp;
            }
            else if (tmp > posMax2){
                posMax2 = tmp;
            }
            if (tmp < negMax1){
                negMax2 = negMax1;
                negMax1 = tmp;
                continue;
            }
            if (tmp < negMax2){
                negMax2 = tmp;
            }
        }
        System.out.println((negMax1 * negMax2 > posMax1 * posMax2) ? negMax1 + ", " + negMax2 : posMax1 +" , "+ posMax2);
    }
}
