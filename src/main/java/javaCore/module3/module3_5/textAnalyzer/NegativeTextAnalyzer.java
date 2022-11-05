package javaCore.module3.module3_5.textAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] keywords = {":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
