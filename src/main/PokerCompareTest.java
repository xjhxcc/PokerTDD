package main;

import org.junit.Assert;
import org.junit.Test;
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
    public void should_return_list2_given_3D4H_and_5H6D() {
        //given
        Poker poker1 = new Poker('3', 'D');
        Poker poker2 = new Poker('4', 'H');
        Poker poker3 = new Poker('5', 'H');
        Poker poker4 = new Poker('6', 'D');
        List<Poker> list1=Arrays.asList(poker1,poker2);
        List<Poker> list2=Arrays.asList(poker3,poker4);
        //when
        List<Poker> result = PokerCompare.comparePoker(list1,list2);
        //then
        Assert.assertEquals(list2,result);

    }
    @Test
    public void  should_return_list2_given_2D3H4H5S6D_AND_4D5H6S7D8D(){
        //given
        Poker poker1 = new Poker('2', 'D');
        Poker poker2 = new Poker('3', 'H');
        Poker poker3 = new Poker('4', 'H');
        Poker poker4 = new Poker('5', 'S');
        Poker poker5 = new Poker('6', 'D');
        List<Poker> list1=Arrays.asList(poker1,poker2,poker3,poker4,poker5);
        Poker poker6 = new Poker('4', 'D');
        Poker poker7 = new Poker('5', 'H');
        Poker poker8 = new Poker('6', 'S');
        Poker poker9 = new Poker('7', 'D');
        Poker poker10 = new Poker('8', 'D');
        List<Poker> list2=Arrays.asList(poker6,poker7,poker8,poker9,poker10);
       //when
        List<Poker> result = PokerCompare.comparePoker(list1,list2);
        //then
        Assert.assertEquals(list2,result);
    }
    @Test
    public void  should_return_list2_given_AD3H4H5S6D_AND_KD5H6S7D8D(){
        //given
        Poker poker1 = new Poker('A', 'D');
        Poker poker2 = new Poker('3', 'H');
        Poker poker3 = new Poker('4', 'H');
        Poker poker4 = new Poker('5', 'S');
        Poker poker5 = new Poker('6', 'D');
        List<Poker> list1=Arrays.asList(poker1,poker2,poker3,poker4,poker5);
        Poker poker6 = new Poker('K', 'D');
        Poker poker7 = new Poker('5', 'H');
        Poker poker8 = new Poker('6', 'S');
        Poker poker9 = new Poker('7', 'D');
        Poker poker10 = new Poker('8', 'D');
        List<Poker> list2=Arrays.asList(poker6,poker7,poker8,poker9,poker10);
        //when
        List<Poker> result = PokerCompare.comparePoker(list1,list2);
        //then
        Assert.assertEquals(list1,result);
    }
    @Test
    public void should_return_list2_given_23k95_4423Q(){

        Poker poker1 = new Poker('2', 'H');
        Poker poker2 = new Poker('3', 'D');
        Poker poker3 = new Poker('K', 'H');
        Poker poker4 = new Poker('9', 'S');
        Poker poker5 = new Poker('5', 'S');
        List<Poker> list1=Arrays.asList(poker1,poker2,poker3,poker4,poker5);
        Poker poker6 = new Poker('4', 'S');
        Poker poker7 = new Poker('4', 'D');
        Poker poker8 = new Poker('2', 'S');
        Poker poker9 = new Poker('3', 'C');
        Poker poker10 = new Poker('Q', 'C');
        List<Poker> list2=Arrays.asList(poker6,poker7,poker8,poker9,poker10);
        //when
        List<Poker> result = PokerCompare.comparePoker(list1,list2);
        //then
        Assert.assertEquals(list2,result);

    }
    @Test
    public void testIsPairPoker(){
        Poker poker6 = new Poker('4', 'S');
        Poker poker7 = new Poker('4', 'D');
        Poker poker8 = new Poker('2', 'S');
        Poker poker9 = new Poker('3', 'C');
        Poker poker10 = new Poker('Q', 'C');
        List<Poker> list2=Arrays.asList(poker6,poker7,poker8,poker9,poker10);
        boolean pairPoker = PokerCompare.isPairPoker(Arrays.asList(poker6, poker7, poker8, poker9, poker10));
        Assert.assertEquals(true,pairPoker);
    }

}
