package Calculator;

class Sign {

    private String signValue;       // знак математической операции
    private int signIndex;          // индекс знака в строке для разделения операндов

    public String getSignValue() {
        return signValue;
    }

    public void setSignValue(String signValue) {
        this.signValue = signValue;
    }

    public int getSignIndex() {
        return signIndex;
    }

    public void setSignIndex(int signIndex) {
        this.signIndex = signIndex;
    }
}
