package ru.itmo.java.basics.pr2;

public enum Color {
    BLACK("Черный", 123),
    WHITE("", 0);



    private final String description;
    private final int code;

    Color(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
}



