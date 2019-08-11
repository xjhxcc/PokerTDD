package main;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PokerCompareTest {
    @Test
    public void should_return_2win_given_AD_and_KD() {
        Poker poker1 = new Poker('Q', 'D');
        Poker poker2 = new Poker('K', 'D');
        PokerCompare pc = new PokerCompare();
        List<Poker> list1 = new ArrayList();
        list1.add(poker1);
        List<Poker> list2 = new ArrayList();
        list2.add(poker2);
        String compare = pc.compare(list1,list2);
        Assert.assertEquals("2win",compare);

    }
}
