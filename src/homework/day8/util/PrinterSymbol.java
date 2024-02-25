package homework.day8.util;

public enum PrinterSymbol{
    COMMA(","),
    SPACE(" "),
    NEW_LINE("\n"),
    DASH("-");

    private String value;

    PrinterSymbol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
