package org.vadim.azaza;

interface TextAnalyzer {
    Label processText(String text);
}

enum Label{
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

abstract class KeywordAnalyzer{
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
}

class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    private String[] keywords;

    SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    }

    public Label processText(String text){
        String[] str = getKeywords();
        for(int i = 0; i < str.length; i++) {
            if (text.contains(str[i])) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    protected String[] getKeywords(){
        return keywords;
    }

    protected Label getLabel(){
        return Label.SPAM;
    }
}

class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    private final String [] smiles = {"=(",":|",":("};

    public Label processText(String text){
        String[] str = getKeywords();
        for(int i = 0; i < str.length; i++) {
            if (text.contains(str[i])) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    protected String[] getKeywords(){
        return smiles;
    }

    protected Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }
}

class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;

    TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }

    public Label processText(String text){
        if(text.length() > maxLength)
            return Label.TOO_LONG;
        else
            return Label.OK;
    }

}
