package org.vadim.lambda;

import java.util.stream.*;
import java.util.*;
import static java.util.stream.Collectors.toList;

public class LambdaExercises {
    public static void main(String[] args){
        Stream<Integer> lol = Stream.of(4,7,6,4,5,8);
        System.out.println(addUp(lol));

        Artist beatles = new Artist("The Beatles", List.of("John Lennon","Paul McCartney","Ringo Starr","George Harrison"),"Liverpool");
        Artist pf = new Artist("Pink Floyd", List.of("Syd Barrett","Roger Waters","David Gilmour","Nick Mason","Richard Wright"),"Liverpool");
        System.out.println(getNamesAndOrigin(beatles));

        List<Artist> artistList = new ArrayList<>();
        artistList.add(beatles);
        artistList.add(pf);
        System.out.println(getArtistWithMoreThanFourMembers(artistList));
    }

    public static int addUp(Stream<Integer> strm){
        return strm.reduce(0,(accum, element) -> accum + element);
    }

    public static List<String> getNamesAndOrigin(Artist artist){
        return Stream.of(artist.getMembers(), List.of(artist.getOrigin()))
                .flatMap(element->element.stream())
                .collect(toList());
    }

    public static List<Artist> getArtistWithMoreThanFourMembers(List<Artist> artistList){
        return artistList.stream()
                .filter(artist->artist.getMembers().size() > 4)
                .collect(toList());
    }
}
