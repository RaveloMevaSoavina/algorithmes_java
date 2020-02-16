public class Main 
{
    public static void main(String[] args)
    {
        int[] tabb = CribleErastho.method( 100 );
        for (int i = 0; i < tabb.length; i++){
            if (tabb[i] != 0){
                System.out.print(tabb[i] + " ");
                System.out.println();
            }
        }

        System.out.println(Fibo.FibonacciRecursive(4));
        System.out.println(Fibo.FibonacciIterative(4));
        System.out.println(Fibo.FibonacciNbOr(4.0));

        String m1 = "NICHE";
        String m2 = "CHIEN";
        
        System.out.println(Levenshtein.method(m1, m2));

        int[] sequence = {3, 5, 6, 1, 4, 2, 7, 4, 9 , 6, 8, 5};
        int[] result = PLSSC.PLSSC_func(sequence);
        PLSSC.display(result);

        System.out.println(PuissanceRapide.PuisR(22, 5));
        System.out.println(PuissanceRapide.PuisR_2(22, 5));


        int[][] tab = PyramideNombres.generateRandomTab(10);
        PyramideNombres.display(tab);
        System.out.println();
        int[][] tab2 = PyramideNombres.resolution(tab);
        PyramideNombres.display(tab2);
        
        int[] tab3 = PyramideNombres.PLC(tab2, tab);
        System.out.println();
        PyramideNombres.display_single(tab3);
        System.out.println();
    }
}