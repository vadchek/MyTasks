package org.vadim.lambda;

import java.util.*;

public class Artist {
    private String name;
    private List<String> members;
    private String origin;

    public Artist(String name, List<String> members, String origin){
        this.name = name;
        this.members = members;
        this.origin = origin;
    }

    public String getName(){
        return name;
    }

    public List<String> getMembers() {
        return members;
    }

    public String getOrigin() {
        return origin;
    }

    public String toString(){
        return name;
    }
}
