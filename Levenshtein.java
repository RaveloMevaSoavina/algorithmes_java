/**
 *
 * @author yt646712
 */
public class Levenshtein {
    public static int[][] method(String m1, String m2){
        int[][] tab = new int[m1.length()+1][m2.length()+1];
        
        tab[0][0] = 0;
        for (int i = 1; i < m1.length(); i++){
            tab[0][i] = i;
        }
        
        for(int i = 1; i < m2.length(); i++){
            tab[i][0] = i;
        }
        
        for (int i = 1; i < m1.length(); i++){
            for (int j = 1; j < m2.length(); j++){
                int haut = tab[i-1][j] + 1;
                int gauche = tab[i][j-1] + 1;
                int diagonale = m1.charAt(i-1) == m2.charAt(j-1) ? tab[i-1][j-1] : tab[i-1][j-1] + 1;
                tab[i][j] = Math.min(Math.min(haut, gauche), diagonale);
            }
        }
        
        return tab;
    }
    
    public static void chemin(int[][] tab){
        int i = tab.length;
        int j = tab[0].length;
        
        while(i > 0){
            while(j > 0){
                if (tab[i-1][j] < tab[i-1][j-1]){
                    if (tab[i][j-1] < tab[i-1][j-1]){
                        
                        
                    }
                }
            }
        }
    }
}