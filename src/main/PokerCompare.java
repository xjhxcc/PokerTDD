package main;

public class PokerCompare {
    public static Poker comparePoker(Poker poker1, Poker poker2) {
        return poker1.getNum() >= poker2.getNum() ? poker1 : poker2;
    }
}
