package com.formation.Collection.p1;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Members{
    private  List<Persone> personeList;

    public Members() {
        List<Persone> personeList = new ArrayList<>();
        Path path = Paths.get("file/personnes.txt");
        try (Stream<String> streamlist = Files.lines(path)) {
            streamlist
                  .filter(line->!line.startsWith("PRENOM")  )
                   .map(ligne -> ligne.split(","))
                    .collect(Collectors.toList())
                   .forEach(p-> personeList.add(
                           new Persone(p[0].trim(),
                                   p[1].trim(),
                                   Integer.parseInt(p[2].trim()),
                                   Double.parseDouble(p[3].trim()),
                                   p[4].trim(),
                                   p[5].trim())));
        }
        catch (IOException e) {
            e.printStackTrace();
        }


       /*
        personeList.add(new Persone("Laure", "BARBE", 1994, 2360.50f, "f", "Nantes"));
        personeList.add(new Persone("Aihab", "BETTAIEB", 1991, 2040.90f, "F", "Nantes"));
        personeList.add(new Persone("Aurelien", "DEMOLY", 1993, 2000.0f, "h", "Rennes"));
        personeList.add(new Persone("Tanguy" , "NGUYEN", 1992, 2300.0f, "h", "Lille"));
        personeList.add(new Persone("Laura", "TENET", 1995, 2205.89f, "F", "Lyon"));
        personeList.add(new Persone("Matthieu", "BILLAUD", 1992, 2650.70f, "H", "Paris"));
        personeList.add(new Persone("Martin", "TOGNETTI", 1988, 1980.0f, "h", "Bordeaux"));
        personeList.add(new Persone("Simon", "MAILLARD", 1975, 3022.39f, "H", "Lyon"));
        personeList.add(new Persone("Baptiste", "BLANCHET", 1985, 2380.70f, "A", "Lyon"));
        personeList.add(new Persone("Maria", "JETTAIEB", 1991, 2040.90f, "F", "Nantes"));

        */
        this.personeList=personeList;

    }

    public List<Persone> listPersone(){
        List<Persone> personeList = new ArrayList();

        return personeList;
    }

    public void apres1991(){
        //Lambda
        personeList.stream().filter(p -> p.getAnnee_naissance() >= 1991)
                .forEach(info -> System.out.println(info.toString()));
    }
    public void nom1995(){
        //Lambda
        personeList.stream().filter(p -> p.getAnnee_naissance() == 1995)
                .forEach(info -> System.out.println(info.getNom()));

    }
    public void orderAvant1990(){
        //Lambda
        personeList.stream().filter(p -> p.getAnnee_naissance() <= 1990)
                .sorted(Comparator.comparing(Persone::getNom))
                .forEach(info -> System.out.println(info.getNom()));
    }

    public void orderNomPrenon(){
          personeList.stream()
                    .sorted(Comparator.comparing(Persone::getNom).thenComparing(Persone::getPrenom))
                    .forEach(info -> System.out.println(info.getNom() +" " +info.getPrenom() ));
    }
    public void genreLettref(){
        personeList.stream()
                .filter( p -> p.getGenre() == "F" && p.getNom().substring(0,1).equalsIgnoreCase("j") )
                .forEach(info -> System.out.println(info.toString()));
    }
    public void genreMinuscule(){
       personeList.stream()
              //  .filter( p -> p.getGenre().equalsIgnoreCase("h"))
                .collect(Collectors.toList())
                .forEach(info -> { info.setGenre(info.getGenre().toLowerCase());
                                  System.out.println(info.toString());} );


    }
}
