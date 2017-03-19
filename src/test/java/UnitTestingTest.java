import org.hamcrest.core.Is;
import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Henco on 3/18/2017.
 */
public class UnitTestingTest {
    @Test  //2.i Floating point
    public void addFloat() throws Exception
    {
        float x = 6.2f;
        float y = 3.3f;

        float actual = UnitTesting.addFloat(x,y);

        assertThat(actual, Is.is(9.5f));
    }

    @Test  //2.ii Integers
    public void addInt() throws Exception
    {
        int a = 6;
        int b = 3;

        int actual = UnitTesting.addInt(a,b);

        assertThat(actual, Is.is(9));
    }

    @Test //2.iii Object Equality
    public void intEquality() throws Exception
    {
        int a = 10;
        int b = 10;

        boolean expected = true;
        boolean actual = UnitTesting.intEquality(a,b);

        assertEquals(expected,actual);
    }

    UnitTesting pet1, pet2, pet3, pet4, pet5;
    public void petNames()
    {
        pet1 = new UnitTesting("Cat");
        pet2 = new UnitTesting("Dog");
        pet3 = new UnitTesting("Snake");
        pet4 = new UnitTesting("Cat");
       // pet5 = new UnitTesting("");
    }

    @Test //2.iv Object Identity
    public void identify() throws Exception
    {
        assertSame(pet1, pet4);
    }

    @Test //2.v Truth
    public void truth() throws Exception
    {
        int a = 10;
        int b = 10;

        assertTrue(UnitTesting.trueOrFalse(a,b));
    }

    @Test //2.vi False
    public void notTrue() throws Exception
    {
        int a = 10;
        int b = 5;

        assertFalse(UnitTesting.trueOrFalse(a,b));
    }

    @Test //2.vii Nullness
    public void Nullness() throws Exception
    {
        assertNull(pet5);
    }

    @Test //2.viii Non Nullness
    public void nonNullness() throws Exception
    {
        assertNull(pet3);
    }

    @Test //2.ix Failling Test
    public void failingTest() throws Exception
    {
        UnitTesting.failingTest();
    }

    @Test(timeout = 100)//2.x Exceptions 11.Timeouts
    public void timeouts() throws Exception
    {
        UnitTesting.timout();
    }
    //2.xi
    //2.xii

}