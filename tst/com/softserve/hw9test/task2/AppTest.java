package com.softserve.hw9test.task2;

import com.softserve.hw9.task2.App;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AppTest {
    static Map<String, String > personMap = new HashMap<>();
    @Test
    public void TestFindMembersSameName() {
        initialization();
        Map<String, String> expected = new HashMap<>();
        expected.put("DeBour", "Ronald");
        expected.put("Koeman", "Ronald");
        Assert.assertEquals(expected, App.findMembersSameName(personMap));
    }

    @Test
    public void TestRemovePerson() {
        initialization();
        Map<String, String> expected = new HashMap<>();
        expected.put("Messi", "Lionel");
        expected.put("Ronaldo", "Christiano");
        expected.put("Shevchenko", "Andriy");
        expected.put("VanBasten", "Marko");
        expected.put("Zidane", "Zinedine");
        expected.put("Pirlo", "Andrea");
        expected.put("Levandovski", "Robert");
        expected.put("Beckham", "David");
        Assert.assertEquals(expected, App.removePerson(personMap, "Ronald"));
    }




    public static void initialization() {
        personMap.put("Messi", "Lionel");
        personMap.put("Ronaldo", "Christiano");
        personMap.put("DeBour", "Ronald");
        personMap.put("Koeman", "Ronald");
        personMap.put("Shevchenko", "Andriy");
        personMap.put("VanBasten", "Marko");
        personMap.put("Zidane", "Zinedine");
        personMap.put("Pirlo", "Andrea");
        personMap.put("Levandovski", "Robert");
        personMap.put("Beckham", "David");
    }
}
