package javaCore.module2;

public class PrintTextPerRole {

    public static void main(String[] args) {

        String [] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String [] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder[] rolesText = new StringBuilder[roles.length];
        for (int i = 0; i < roles.length; i++) {
            rolesText[i] = new StringBuilder(roles[i]).append(":").append("\n");
        }

        for (int i = 0; i < textLines.length; i++) {
            for (int j = 0; j < roles.length; j++) {
                if (textLines[i].indexOf(roles[j]) == 0) {
                    rolesText[j].append(i + 1).append(")").append(textLines[i].substring(roles[j].length() + 1)).append("\n");
                    break;
                }
            }
        }
        StringBuilder outText = new StringBuilder();
        for ( StringBuilder texts : rolesText) {
            outText.append(texts).append("\n");
        }
        return outText.toString();
    }
}
