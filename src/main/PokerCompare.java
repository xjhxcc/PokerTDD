package main;

import java.util.ArrayList;
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
        changeAllPokersNum(list1, list2);
        sortPoker(list1);
        sortPoker(list2);
        if(isStraight(list1)||isStraight(list2)){
            return isStraight(list1)?list1:list2;
        }
        if (isThreePoker(list1) || isThreePoker(list2)) {
            return isThreePoker(list1)?list1:list2;
        }
        if(isPairPoker(list1)||isPairPoker(list2)){
            return isPairPoker(list1)?list1:list2;
        }
        if(isPairPoker(list1)&&isPairPoker(list2)){
            return getRepeatNum(list1)>getRepeatNum(list2)?list1:list2;
        }
        for(int i = 0;i < list1.size();i++){
           Poker poker1 = list1.get(i);
           Poker poker2 = list2.get(i);
            if(comparePoker(poker1,poker2) != null){
                return comparePoker(poker1,poker2) ==poker1 ? list1:list2;
            }
        }
        return null;
    }

    private static boolean isStraight(List<Poker> list) {
        for(int i = 0;i < list.size() - 1;i++) {
            return list.get(i).getNum() - list.get(i + 1).getNum() == 1 ? true : false;
        }
        return false;
    }

    public static boolean isPairPoker(List<Poker> list){
        char repeatCount = getRepeat(list).get(0);
        return repeatCount==2?true:false;
    }
    public static boolean isThreePoker(List<Poker> list){
        char repeatCount = getRepeat(list).get(0);
        return repeatCount==3?true:false;
    }
    private static Character getRepeatNum(List<Poker> list){
        List<Character> repeatList = getRepeat(list);
        return repeatList.get(1);
    }

    private static List<Character> getRepeat(List<Poker> list) {
        List<Character> repeatList=new ArrayList<Character>();
        char repeatCount = 1;char repeatNum = 0;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).getNum() == list.get(i + 1).getNum()) {
                repeatNum=list.get(i).getNum();
                repeatCount++;
            }
        }
        repeatList.add(repeatCount);
        repeatList.add(repeatNum);
        return repeatList;
    }

    private static void changeAllPokersNum(List<Poker> list1, List<Poker> list2) {
        for(int i = 0;i < list1.size();i++){
            changePokerNum(list1.get(i));
            changePokerNum(list2.get(i));
        }
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
