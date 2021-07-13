package com.formation.Collection;


import com.formation.Collection.p1.Members;
import com.formation.Collection.p1.MonFilter;
import com.formation.Collection.p1.Persone;

import javax.xml.stream.StreamFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        ///Exercice 1
      /*    Random random = new Random();
        IntStream intStream = random.ints(6,0, 20);

      intStream.forEach(System.out::println);

        intStream.sorted()
                .forEach(System.out::println);

        intStream.sorted()
                .limit(1)
                .forEach(System.out::println);

       int SumTot = intStream.sorted()
                .filter(val -> val>3)
                .limit(3)
                .sum();
       System.out.println(SumTot);
*/


       ///  Exercice 2

    /*    int[] tab = {-9, 3, -8, 7, -6, 2, -1};
        System.out.println("Les nombres positifs : ");

        afficherPositif(tab, ee -> ee > 0);
        afficherPositifPropose(tab, ee -> ee > 0);

*/
        ///  Exercice 3
      Members members = new Members();
       /* members.apres1991();
        members.nom1995();
         members.orderAvant1990();
         members.orderNomPrenon();
         members.genreLettref();
         members.genreMinuscule();
         members.laPlusJeune();
         members.moyenneSalaires();*/
        members.genreMinuscule();

    }
    public static void  afficherPositif(int[] tabnum,  MonFilter monFilter){
        Arrays.stream(tabnum)
                .filter(monFilter)
                .forEach(System.out::println);
    }

public static void  afficherPositifPropose(int[] tabnum,  IntPredicate monFilter){
    Arrays.stream(tabnum)
          .filter( monFilter)
            .forEach(System.out::println);
}

}
