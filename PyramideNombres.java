/**
 *
 * @author yt646712
 */
public class PyramideNombres {
    public static int[][] generateRandomTab(int n){
        int[][] tab = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                tab[i][j] = (int)((25 - 1) * Math.random());
            }
        }
        
        return tab;
    }
    
    public static void display(int[][] tab){
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" "+ tab[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void display_single(int[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }
    }
    
    public static int[][] resolution(int[][] tab){
        int[][] tab2 = new int[tab.length][tab.length];
        for (int i = tab.length-1; i >= 0; i--){
            if (i == tab.length-1){ //cas de recopie de la dernière ligne
                for (int j = 0; j < tab.length; j++){
                    tab2[i][j] = tab[i][j];
                }
            }
            else{
                for (int j = 0; j <= i; j++){
                    tab2[i][j] = tab[i][j] + Math.max(tab2[i+1][j], tab2[i+1][j+1]);
                }
            }
        }
        return tab2;
    }
    
    public static int[] PLC(int[][] tab, int[][] tab_origine){
        int[] output = new int[tab.length];
        output[0] = tab_origine[0][0];
        int j = 0;
        for (int i = 1; i < tab.length; i++){
            if (tab[i][j] > tab[i][j+1]){
                output[i] = tab_origine[i][j];
            }
            else{
                output[i] = tab_origine[i][j+1];
                j++;
            }
        }
        
        return output;
    }
}
