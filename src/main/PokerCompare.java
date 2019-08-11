package main;

import java.util.Comparator;
import java.util.List;

public class PokerCompare {
    public static Poker comparePoker(Poker poker1, Poker poker2) {
        if(poker1==poker2){
            return null;
        }
        return poker1.getNum() >= poker2.getNum() ? poker1 : poker2;
    }
    public static List<Poker> comparePoker(List<Poker> list1, List<Poker> list2) {
        for(int i = 0;i < list1.size();i++){
            changePokerNum(list1.get(i));
            changePokerNum(list2.get(i));
        }
        sortPoker(list1);
        sortPoker(list2);
        Poker poker1;
        Poker poker2;
        for(int i = 0;i < list1.size();i++){
            poker1 = list1.get(i);
            poker2 = list2.get(i);
            if(comparePoker(poker1,poker2) != null){
                return comparePoker(poker1,poker2) ==poker1 ? list1:list2;
            }
        }
        return null;
    }

    private static void sortPoker(List<Poker> list) {
        list.sort(Comparator.comparingInt(Poker::getNum).reversed());
    }

    private static void changePokerNum(Poker poker){
        switch(poker.getNum()){
            case 'T':
                poker.setNum('A');
                break;
            case 'J':
                poker.setNum('B');
                break;
            case 'Q':
                poker.setNum('C');
                break;
            case 'K':
                poker.setNum('D');
                break;
            case 'A':
                poker.setNum('E');
                break;
        }
    }
}
