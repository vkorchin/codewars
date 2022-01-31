package faberge;

import io.qameta.allure.Epic;
import io.qameta.allure.Step;

import java.math.BigInteger;
import java.util.Random;

import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.valueOf;
import static org.junit.Assert.*;

public class FabergeTest {
    private static void test(int a, int b, int shouldBe) {
        assertEquals(valueOf(shouldBe), Faberge.height(valueOf(a), valueOf(b)));
    }

    private static void test(String a, String b, String shouldBe) {
        Faberge.setNumber(0L);
        assertEquals(new BigInteger(shouldBe), Faberge.height(new BigInteger(a), new BigInteger(b)));
        System.out.println(a + " " + b + " " + Faberge.getNumber());
    }

    @org.junit.Test
    @Epic(value = "Фаберже")
    @Step("Простые тесты Фаберже")
    public void basicTests() throws Exception {
        test(1, 51, 51);
        test(2, 1, 1);
        test(4, 17, 3213);
        test(16, 19, 524096);
        test(23, 19, 524287);
        test(2, 13, 91);
    }

    @org.junit.Test
    @Epic(value = "Фаберже")
    @Step("Сложные тесты Фаберже")
    public void advancedTests() throws Exception {
        test("13", "550", "60113767426276772744951355");
//        test("271", "550", "1410385042520538326622498273346382708200418583791594039531058458108130216985983794998105636900856496701928202738750818606797013840207721579523618137220278767326000095");
//        test("531", "550", "3685510180489786476798393145496356338786055879312930105836138965083617346086082863365358130056307390177215209990980317284932211552658342317904346433026688858140133147");
        test("477", "10000", "3685510180489786476798393145496356338786055879312930105836138965083617346086082863365358130056307390177215209990980317284932211552658342317904346433026688858140133147");
    }
}
