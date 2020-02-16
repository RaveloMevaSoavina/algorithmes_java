import static java.lang.Math.sqrt;

/**
 *
 * @author yt646712
 */

public class CribleErastho {
    public static int[] method(int n){
        int[] tab = new int[n];
        
        for (int i = 2; i < tab.length; i++){
            tab[i] = i;
        }
        
        
        for (int i = 2; i < sqrt(n); i++){
            while(tab[i] ==0  && i <= sqrt(n) ){
                i++;
            }
            for (int j = 2 * i; j < n; j += i){
                tab[j] = 0;
            }
        }
        
        System.out.println("Bravo tu as tes nombres premiers :");
        return tab;
    }
}
