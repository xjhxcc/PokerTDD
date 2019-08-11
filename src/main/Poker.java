package main;

public class Poker {
    private char num;
    private char type;

    public Poker(char num, char type) {
        this.num = num;
        this.type = type;
    }

    public char getNum() {
        return num;
    }

    public void setNum(char num) {
        this.num = num;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
