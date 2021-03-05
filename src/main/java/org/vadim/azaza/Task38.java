package org.vadim.azaza;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();
        String[] keywords = {"lol", "kek", "azaza", "trololo"};
        System.out.println(checkLabels(text, keywords));
    }

    static Label checkLabels(String text, String[] keywords) {
        SpamAnalyzer spam = new SpamAnalyzer(keywords);
        NegativeTextAnalyzer negtext = new NegativeTextAnalyzer();
        TooLongTextAnalyzer longer = new TooLongTextAnalyzer(20);

        if (spam.processText(text) == Label.SPAM)
            return spam.processText(text);
        else if (negtext.processText(text) == Label.NEGATIVE_TEXT)
            return negtext.processText(text);
        else if (longer.processText(text) == Label.TOO_LONG)
            return longer.processText(text);
        else
            return spam.processText(text);
    }
}
