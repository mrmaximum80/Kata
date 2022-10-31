package calculator;

class Operand {
    private int number;             // число от 1 до 10
    private String numberSystem;    // система счисления "arabic" или "roman"


    public int getNumber() {
        return number;
    }

    public String getNumberSystem() {
        return numberSystem;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumberSystem(String numberSystem) {
        this.numberSystem = numberSystem;
    }

}
