/*
Longest Collatz sequence

Problem 14
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class EulerProject14 {
    public static void main(String[] args){

        long [] tab = new long[1000000];
        tab[0] = 0;
        tab[1] = 1;


//---------------------------
        for (int i = 2; i < tab.length; i++) {
            long lengthChain = 1;
            long k = i;
            while (k != 1){
                if(k%2 == 0){
                    k /= 2;
                } else {
                    k = 3*k + 1;
                }
                lengthChain++;
            }
            tab[i] = lengthChain;
        }
//------------------------------
        long maxChain = 0;
        for (int i = 0; i < tab.length; i++) {
            if (maxChain < tab[i]) maxChain = tab[i];
        }
        long indexMaxChain = 0;
        for (int i = 0; i < tab.length; i++) {
            if (maxChain == tab[i]) indexMaxChain = i;
        }
//--------------
     System.out.println(indexMaxChain + " produces the longest chain.");
    }
}
