package Assignment7.Problem3;

import org.junit.*;

import static org.junit.Assert.*;


public class UnitTest {

    Scissors s = new Scissors(15);
    Paper p = new Paper(20);
    Rock r = new Rock(30);

    @Test
    public void setStrength() {
        assertEquals(15,s.strength);
        assertEquals(20,p.strength);
        assertEquals(30,r.strength);
    }

    @Test
    public void rockPaperSissorGame() {
        assertTrue(s.fight(p));
        assertFalse(p.fight(s));
        assertTrue(p.fight(r));
        assertFalse(r.fight(p));
        assertTrue(r.fight(s));
        assertFalse(s.fight(r));
    }
}
