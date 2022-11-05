package javaCore.module3.module3_5.textAnalyzer;

public class Runner {

    public static void main(String[] args) {

        String a = "Бренд Infinix активно взялся за российский рынок на волне ухода A-брендов. " +
                "Полки уже заставлены смартфонами линеек Infinix Hot, Smart, Note. " +
                "До редакции Hi-Tech Mail.ru наконец добрался первый «инфиникс» — Note 12 Pro. " +
                "С новым процессором Helio G99, камерой 108 Мп и 8/256 ГБ памяти. :(" +
                "Стоит меньше 20 тысяч рублей — и за такие характеристики звучит многообещающе. " +
                "Давайте знакомиться.";

        String [] keywords = {"хуй", "жопа", "язык"};
        SpamAnalyzer spam = new SpamAnalyzer(keywords);
        NegativeTextAnalyzer negative = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tooLong = new TooLongTextAnalyzer(10000);

        TextAnalyzer[] analyzers = {spam, negative, tooLong};

        Runner r = new Runner();
        System.out.println(r.checkLabels(analyzers, a).toString());



    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                return analyzer.processText(text);
            }
        }
        return Label.OK;
    }

}
