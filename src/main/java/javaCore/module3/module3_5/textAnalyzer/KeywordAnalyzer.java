package javaCore.module3.module3_5.textAnalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        for (String t : getKeywords()) {
            if (text.indexOf(t) != -1) {
                return getLabel();
            }
        }
        return Label.OK;
    }

}
