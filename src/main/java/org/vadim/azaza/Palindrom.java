package org.vadim.azaza;

public class Palindrom {
    String str;

    public Palindrom(String str){
        this.str = str;
    }

    public boolean isPalindrom(){
        String bufstr ="";
        str = str.toLowerCase();
        for(int symbol = 0; symbol < str.length(); symbol++){
            if(Character.isLetterOrDigit(str.charAt(symbol)))
                bufstr += str.charAt(symbol);
        }
        for(int left = 0; left < bufstr.length()/2 ;left++){
            if(bufstr.charAt(left) != bufstr.charAt(bufstr.length() - 1 - left))
                return false;
        }
        return true;
    }
}
