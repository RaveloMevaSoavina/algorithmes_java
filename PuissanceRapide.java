import static java.lang.Math.floor;
import java.util.ArrayList;

/**
 *
 * @author yt646712
 */
public class PuissanceRapide {
    public static double PuisR(double a, double n){
        if (n != 0){
            if (n % 2 == 0){
                return PuisR(a, floor(n/2)) * PuisR(a, floor(n/2));
            }
            else{
                return PuisR(a, floor(n/2)) * PuisR(a, floor(n/2)) * a;
            }
        }
        else{
            return 1;
        }
    }
    
    public static int PuisR_2 (int a, int n){
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        while(n > 0){
            al.add(n % 2);
            n = n/2;
        }
        
        int nombre = 1;
        for (int i = 0; i < al.size(); i++){
            if (al.get(i) == 1){
                nombre = nombre * nombre * a;
            }
            if (al.get(i) == 0){
                nombre = nombre * nombre;
            }
        }
        
        return nombre;
    }
}
