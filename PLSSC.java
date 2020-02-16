/**
 *
 * @author yt646712
 */
public class PLSSC {    
    public static void display(int[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
    
    
    public static int[] PLSSC_func(int[] seq){
        int[] sseq = new int[seq.length];
        int[] min = new int[seq.length];
        
        //init tab
        min[0] = -1;
        sseq[0] = 0;
        for (int i = 1; i < seq.length; i++){
            min[i] = 9999;
            sseq[i] = 0;
        }
        
        //process (remplissage de sseq
        for (int i = 0; i < seq.length; i++){
            boolean trouver = false;
            int j = 0;
            while (trouver == false && j < seq.length){
                if (seq[i] < min[j]){
                    min[j] = seq[i];
                    sseq[i] = j;
                    trouver = true;
                }
                else{
                    j++;
                }
            }
        }
        
        display(min);
        display(sseq);
        

        int max = sseq[sseq.length -1];
        for (int i = sseq.length-1 ; i >= 0; i--){
            if (sseq[i] > max){
                max = sseq[i];
            }
        }
        System.out.println(max);
        int[] output = new int[max];
        for(int i = sseq.length-1; i >= 0; i--){
            if (sseq[i] == max){
                output[max-1] = seq[i];
                max--;
            }
        }
        
        return output;
    }
}
