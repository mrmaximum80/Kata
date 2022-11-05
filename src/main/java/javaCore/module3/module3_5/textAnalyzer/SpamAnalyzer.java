package javaCore.module3.module3_5.textAnalyzer;

public class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] spam) {
        this.keywords = spam;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
