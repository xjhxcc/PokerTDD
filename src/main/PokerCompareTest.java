package main;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerCompareTest {
    @Test
    public void should_return_poker2_given_AD_and_KD() {
        //given
        Poker poker1 = new Poker('2', 'D');
        Poker poker2 = new Poker('3', 'D');
        //when
        Poker result = PokerCompare.comparePoker(poker1,poker2);
        //then
        Assert.assertEquals(poker2,result);

    }
    @Test
    public void should_return_poker1_given_3D4H_and_5H6D() {
        //given
        Poker poker1 = new Poker('3', 'D');
        Poker poker2 = new Poker('4', 'H');
        Poker poker3 = new Poker('5', 'H');
        Poker poker4 = new Poker('6', 'D');
        List<Poker> list1=Arrays.asList(poker1,poker2);
        List<Poker> list2=Arrays.asList(poker3,poker4);
        //when
        Poker result = PokerCompare.comparePoker(list1,list2);
        //then
        Assert.assertEquals(poker2,result);

    }

}
