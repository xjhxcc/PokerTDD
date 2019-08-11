package main;

import org.junit.Assert;
import org.junit.Test;
public class PokerCompareTest {
    @Test
    public void should_return_2win_given_AD_and_KD() {
        //given
        Poker poker1 = new Poker('2', 'D');
        Poker poker2 = new Poker('3', 'D');
        //when
        Poker result = PokerCompare.comparePoker(poker1,poker2);
        //then
        Assert.assertEquals(poker2,result);

    }
}
