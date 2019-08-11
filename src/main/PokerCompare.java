package main;

import java.util.List;

public class PokerCompare {
    public static Poker comparePoker(Poker poker1, Poker poker2) {
        return poker1.getNum() >= poker2.getNum() ? poker1 : poker2;
    }
    public static Poker comparePoker(List<Poker> list1, List<Poker> list2) {
        return null;
    }
}
