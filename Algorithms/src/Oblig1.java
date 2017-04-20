/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilche_000
 */
package oblig1;

import java.util.Arrays;
import java.util.Random;

public class Oblig1 {
    /**
     * @param args the command line arguments
     */
    /*TEMP main metode*/
    public static void main(String[] args) {
        System.out.println("OPPGAVE 5");
        char[] a = {'A','B','C','D','E','F','G'};
        int[] b = {3,7,1,2,36,78,0};
//        rotasjon(a);
//
//        for(int i = 0; i < a.length; i ++){
//            System.out.print(a[i]+" ");
//        }
        System.out.println("Oppgave 6");

        rotasjon(a, 5);
        System.out.println("   ");
        for(int i = 0; i < a.length; i ++){
            System.out.print(a[i]+" ");
        }
        System.out.println(flett("Hello","goGOo"));
        System.out.println(flett("Hellow","How is it", "Pew pwe pew!"));
        skriv(index(b));

    }
    /*Avslutning main metode*/

    /*Oppgave 1 maks metoden som returnerer maks verdi IKKE posisjon!
    Det blir flest ombytninger hvis tilfeldig tabell blir sortert fra største tall til minste
    Og skal bruke minst tid hvis den blir sortert fra laveste tall til størst*/
    public static int maks(int[]a){
        int n = a.length;
        int maksverdi = a[0];
        if(n == 0){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }
        else if (n == 1){
            return a[0];
        }
        for(int i = 1; i <=n-1; i ++){
            if(maksverdi > a[i]){
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
                maksverdi = a[i];
            }
            else {maksverdi = a[i];}
        }
        return maksverdi;
    }
    /*Metoden teller opp antall ombytninger for opp1*/
    public static int ombytninger(int[]a){
        int count = 0;
        int n = a.length;
        if(n == 0){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }
        else if (n == 1){
            return count;
        }
        for(int i = 1; i < n; i++){
            if(a[i-1] > a[i]){
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
                count++;
            }
        }
        return count;
    }
    /*Avslutning av oppgave 1*/

    /*Oppgave 2 - Metoden sorterer verdiene en og en etter hverandre
    */
    public static void sortering(int [] a){
        int n = a.length;
        if(n == 0 || n == 1){
            throw new java.util.NoSuchElementException("Tabellen er tom! Eller er sortert");
        }
        for(int i = 1; i < n; i++){
            if(a[i-1] > a[i] ){
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1]=temp;
            }
        }
    }
    /*Avslutning av oppgave 2*/

    /*Oppgave 3 Metoden skal lage permutasjon av sifre fra 0-5
    og skal ha noe spesiell tilfeller her.(se oppgavetekst)*/
    public static int medlemsnummer(){
        int nummerLengde = 5;
        int [] nummer = new int[5];
        int [] n = {0,0,1,1,2,2,3,3,4,4,5,5};
        Random r = new Random();

        for(int i = 0; i < nummerLengde;){
            int tall = r.nextInt(12);

            while(i == 0 && n[tall] == 0){
                tall = r.nextInt(12);
            }
            if(n[tall] <= 5){
                nummer[i] = n[tall];
                n[tall] =6;
                i++;
            }
        }
        System.out.println(Arrays.toString(nummer));
        return 1;
    }
    /*Avslutning av oppgave 3*/
    /*Oppgave 4*/
    public static int antallUlikeUsortert(int[] a){
        int n = a.length;
        int count = 0;
        int uniq;
        if(n == 0) return 0;
        if( n < 2)  return 1;

        for(int i = 0; i < n; i ++){
            for(int o = i+1; o < n; o++){
                if(a[i] == a[o]){count +=2;}}
        }
        uniq = n-count;
        return uniq;
    }
    /*Avslutning oppgave 4*/
    /*Oppgave 5- rotere elementene til høyre eller til venstre*/
    public static void rotasjon(char[] a){

        int n = a.length;
        if(n == 0 || n == 1) return;

        char temp = a[n-1];

        for(int i = n-2; i >= 0; i--){
            a[i+1] = a[i];
            if(i == 0){
                a[i] = temp;
            }
        }
    }
    /*Avslutning oppgave 5*/

    /*Oppgave 6*/
    public static void rotasjon(char[] a, int k){
        int n = a.length;
        if(n == 0 || n == 1) return;
        if((k %= n)< 0) k+=n;

        char[]b = Arrays.copyOfRange(a, n-k,n);
        for(int i = n-1 ; i >=k; i--) a[i] = a[i-k];
        System.arraycopy(b,0,a,0,k);
    }
    /*Avslutning oppgave 6*/

    /*Oppgave 7 a)*/
    public static String flett(String s, String t){
        StringBuilder resultat = new StringBuilder(s.length() + t.length());
        int i = 0;

        while(i != s.length()+t.length()){
            if(i < s.length()){
                resultat.append(s.charAt(i));
            }
            if(i < t.length()){
                resultat.append(t.charAt(i));
            }
            i++;
        }

        return resultat.toString();
    }
    /*Avslutning oppgave 7 a)*/

    /*Oppgave 7 b)*/
    public static String flett(String... s){
        int lengde = 0;

        for(int i = 0; i < s.length; i ++){ //Finner total lengde av alle string i parameter
            lengde += s[i].length();
        }

        StringBuilder resultat = new StringBuilder(lengde);

        int i = 0;
        while(resultat.length() != lengde){
            for(int u = 0; u < s.length; u ++){
                if(s[u].length() > i){
                    resultat.append(s[u].charAt(i));
                }
            }
            i++;
        }

        return resultat.toString();
    }
    /*Avslutning 7 b)*/

    /*Oppgave 8 a)*/
    public static int[] index (int[]a){
        if ( a.length < 3){
            throw new java.util.NoSuchElementException("Tabellen må ha minst 3 verdier.");
        }

        int[] indeks = {0,1,2};
        int temp;
        if(a[indeks[0]] > a[indeks[1]]) {
            temp = indeks[1];
            indeks[1] = indeks[0];
            indeks[0] = temp;
        }
        if(a[indeks[1]] > a[indeks[2]]){
            temp = indeks[2];
            indeks[2] = indeks[1];
            indeks[1] = temp;
        }
        if(a[indeks[0]] > a[indeks[1]]){
            temp = indeks[1];
            indeks[1] = indeks[0];
            indeks[0] = temp;
        }
        int i = 0;
        while(i < 3){
            System.out.println(indeks[i]);
            i++;
        }

        return indeks;
    }
    /*Oppgave 8 b)*/
    public static int[] tredjeMin(int[]a){
        if(a.length < 3){
            throw new java.util.NoSuchElementException("Tabellen inneholder mindre en 3 verdier.");
        }

        int [] indeks = {0,1,2};
        int minst = 0;
        int nminst = 1;
        int nnminst = 2;

        int minstV = a[minst];
        int nminstV = a[nminst];
        int nnminstV = a[nnminst];

        for(int i = 0; i < a.length; i++){
            if(a[i] > nnminstV){

                if(a[i] > nminstV){

                    if(a[i] > minstV){
                        nnminst = nminst;
                        nnminstV = nminstV;

                        nminst = minst;
                        nminstV = minstV;

                        minst = i;
                        minstV = a[i];
                    }
                }
            }
            else{

            }
        }

        return indeks;
    }
    /*Avslutning av oppgave 8*/

    //Temp
    public static void skriv(Object... a){
        for (Object o : a) System.out.print(o + " ");
    }

    public static void skriv(int[] a, int fra, int til){
        if (fra > til){
            throw new IllegalArgumentException("Interval er ikke gyldig, fra er mindre enn til");
        }
        else if (fra == til){
            throw new IllegalArgumentException("Interval er bare 1 tall");
        }
        String resultat = "";
        for(int i = fra; i < til; i++){
            System.out.print(a[i]);
            if(i < til){
                System.out.print(" ");
            }
        }
    }
    //Temp end
}
