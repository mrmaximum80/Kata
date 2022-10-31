package calculator;

public class Main {

    private static Operand firstOperand;
    private static Operand secondOperand;
    private static Sign sign;

    public static String calc(String input) {

        input = input.replaceAll(" ", "");  // убираем пробелы
        String result = "";

        sign = getSign(input);     //определяем знак выражения
        if (sign.getSignValue() == "") {
            throw new ArithmeticException("Недопустимое выражение: отсутствует знак арифметической операции!");
        }

        String firstValue = input.substring(0, sign.getSignIndex());
        firstOperand = getOperand(firstValue);

        String secondValue = input.substring(sign.getSignIndex() + 1);
        secondOperand = getOperand(secondValue);

        if (firstOperand.getNumberSystem() == "arabic" && secondOperand.getNumberSystem() == "arabic") {
            result = String.valueOf(result(sign.getSignValue()));
        } else if (firstOperand.getNumberSystem() == "roman" && secondOperand.getNumberSystem() == "roman") {
            int value = result(sign.getSignValue());
            if (value <= 0) {
                throw new ArithmeticException("Недопустимый результат: при операциях с римскими числами допускается только положительный результат!");
            } else result = IntegerConvertor.intToRoman(value);
        } else {
            throw new ArithmeticException("Недопустимое выражение: допускаются операции в одной системе счисления!");
        }
        return result;
    }

    static Sign getSign(String str) {
        // выясняем знак арифметического действия и его индекс
        Sign sgn = new Sign();

        if (str.indexOf('+') >= 0) {
            sgn.setSignIndex(str.indexOf('+'));
            sgn.setSignValue("+");
        } else if (str.indexOf('-') >= 0) {
            sgn.setSignIndex(str.indexOf('-'));
            sgn.setSignValue("-");
        } else if (str.indexOf('/') >= 0) {
            sgn.setSignIndex(str.indexOf('/'));
            sgn.setSignValue("/");
        } else if (str.indexOf('*') >= 0) {
            sgn.setSignIndex(str.indexOf('*'));
            sgn.setSignValue("*");
        } else {
            sgn.setSignIndex(-1);
            sgn.setSignValue("");
        }
        return sgn;
    }


    static Operand getOperand(String str) {

        Operand operand = new Operand();
        switch (str) {
            // Проверяем на арабские цифры
            case "1": {
                operand.setNumber(1);
                operand.setNumberSystem("arabic");
                break;
            }
            case "2": {
                operand.setNumber(2);
                operand.setNumberSystem("arabic");
                break;
            }
            case "3": {
                operand.setNumber(3);
                operand.setNumberSystem("arabic");
                break;
            }
            case "4": {
                operand.setNumber(4);
                operand.setNumberSystem("arabic");
                break;
            }
            case "5": {
                operand.setNumber(5);
                operand.setNumberSystem("arabic");
                break;
            }
            case "6": {
                operand.setNumber(6);
                operand.setNumberSystem("arabic");
                break;
            }
            case "7": {
                operand.setNumber(7);
                operand.setNumberSystem("arabic");
                break;
            }
            case "8": {
                operand.setNumber(8);
                operand.setNumberSystem("arabic");
                break;
            }
            case "9": {
                operand.setNumber(9);
                operand.setNumberSystem("arabic");
                break;
            }
            case "10": {
                operand.setNumber(10);
                operand.setNumberSystem("arabic");
                break;
            }
            // Проверяем на римские цифры
            case "I": {
                operand.setNumber(1);
                operand.setNumberSystem("roman");
                break;
            }
            case "II": {
                operand.setNumber(2);
                operand.setNumberSystem("roman");
                break;
            }
            case "III": {
                operand.setNumber(3);
                operand.setNumberSystem("roman");
                break;
            }
            case "IV": {
                operand.setNumber(4);
                operand.setNumberSystem("roman");
                break;
            }
            case "V": {
                operand.setNumber(5);
                operand.setNumberSystem("roman");
                break;
            }
            case "VI": {
                operand.setNumber(6);
                operand.setNumberSystem("roman");
                break;
            }
            case "VII": {
                operand.setNumber(7);
                operand.setNumberSystem("roman");
                break;
            }
            case "VIII": {
                operand.setNumber(8);
                operand.setNumberSystem("roman");
                break;
            }
            case "IX": {
                operand.setNumber(9);
                operand.setNumberSystem("roman");
                break;
            }
            case "X": {
                operand.setNumber(10);
                operand.setNumberSystem("roman");
                break;
            }
            default:
                throw new IllegalStateException("Недопустимый операнд: " + str);
        }
        return operand;
    }

    static int result(String str) {
        // выполняем соответствующее арифметическое действие в зависмости от знака
        int result = 0;
        switch (str) {
            case "+": {
                result = firstOperand.getNumber() + secondOperand.getNumber();
                break;
            }
            case "-": {
                result = firstOperand.getNumber() - secondOperand.getNumber();
                break;
            }
            case "/": {
                result = firstOperand.getNumber() / secondOperand.getNumber();
                break;
            }
            case "*": {
                result = firstOperand.getNumber() * secondOperand.getNumber();
                break;
            }
        }
        return result;
    }
}

