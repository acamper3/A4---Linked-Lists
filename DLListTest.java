package linkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DLListTest {

    @Test
    public void testConstructor() {
        DLList<Integer> d= new DLList<>();
        assertEquals("[]", d.toString());
        assertEquals("[]", d.toStringRev());
        assertEquals(0, d.size());
    }

    @Test
    public void testAppendAndToStringRev() {
        DLList<String> dl= new DLList<String>();

        assertEquals("[]", dl.toString());
        dl.append("2110");
        assertEquals("[2110]", dl.toString());
        assertEquals("[2110]", dl.toStringRev());
        assertEquals(1, dl.size());

        dl.append("bruh");
        assertEquals("[2110, bruh]", dl.toString());
        assertEquals("[bruh, 2110]", dl.toStringRev());
        assertEquals(2, dl.size());

    }

    @Test
    public void testPrepend() {
        DLList<String> dl= new DLList<String>();
        dl.prepend("2110");
        assertEquals("[2110]", dl.toString());
        assertEquals("[2110]", dl.toStringRev());
        assertEquals(1, dl.size());

        DLList<String> d2= new DLList<String>();
        d2.prepend("2110");
        d2.prepend("bruh");
        assertEquals("[bruh, 2110]", d2.toString());
        assertEquals("[2110, bruh]", d2.toStringRev());
        assertEquals(2, d2.size());

    }

    @Test
    public void testNode() {
        DLList<Integer> dl= new DLList<Integer>();
        assertEquals("[]", dl.toString());
        assertEquals("[]", dl.toStringRev());
        assertEquals(0, dl.size());

        dl.append(3);
        assertEquals("[3]", dl.toString());
        assertEquals("[3]", dl.toStringRev());
        assertEquals(1, dl.size());

        dl.append(4);
        assertEquals("[3, 4]", dl.toString());
        assertEquals("[4, 3]", dl.toStringRev());
        assertEquals(2, dl.size());

        dl.append(5);
        assertEquals("[3, 4, 5]", dl.toString());
        assertEquals("[5, 4, 3]", dl.toStringRev());
        assertEquals(3, dl.size());

        assertEquals(dl.head(), dl.node(0));
        assertEquals(dl.head().next(), dl.node(1));
        assertEquals(dl.head().next().next(), dl.node(2));

    }

    @Test
    public void testInsertBefore() {
        DLList<Integer> dl= new DLList<Integer>();
        assertEquals("[]", dl.toString());
        assertEquals("[]", dl.toStringRev());
        assertEquals(0, dl.size());

        dl.append(3);
        assertEquals("[3]", dl.toString());
        assertEquals("[3]", dl.toStringRev());
        assertEquals(1, dl.size());

        dl.append(4);
        assertEquals("[3, 4]", dl.toString());
        assertEquals("[4, 3]", dl.toStringRev());
        assertEquals(2, dl.size());

        dl.insertBefore(dl.head().next(), 5);

        assertEquals("[3, 5, 4]", dl.toString());
        assertEquals("[4, 5, 3]", dl.toStringRev());
        assertEquals(3, dl.size());

        dl.insertBefore(dl.tail(), 6);
        assertEquals("[3, 5, 6, 4]", dl.toString());
        assertEquals("[4, 6, 5, 3]", dl.toStringRev());
        assertEquals(4, dl.size());

        dl.insertBefore(dl.head(), 2);
        assertEquals("[2, 3, 5, 6, 4]", dl.toString());
        assertEquals("[4, 6, 5, 3, 2]", dl.toStringRev());
        assertEquals(5, dl.size());

        DLList<String> d2= new DLList<String>();
        assertEquals("[]", d2.toString());
        assertEquals("[]", d2.toStringRev());
        assertEquals(0, d2.size());

        d2.append("bruh");
        assertEquals("[bruh]", d2.toString());
        assertEquals("[bruh]", d2.toStringRev());
        assertEquals(1, d2.size());

        d2.append("Andrew");
        assertEquals("[bruh, Andrew]", d2.toString());
        assertEquals("[Andrew, bruh]", d2.toStringRev());
        assertEquals(2, d2.size());

        d2.insertBefore(d2.head().next(), "jj");
        assertEquals("[bruh, jj, Andrew]", d2.toString());
        assertEquals("[Andrew, jj, bruh]", d2.toStringRev());
        assertEquals(3, d2.size());

        d2.insertBefore(d2.tail().prev(), "3");
        assertEquals("[bruh, 3, jj, Andrew]", d2.toString());
        assertEquals("[Andrew, jj, 3, bruh]", d2.toStringRev());
        assertEquals(4, d2.size());

    }

    @Test
    public void testDelete() {
        DLList<Integer> dl= new DLList<Integer>();
        assertEquals("[]", dl.toString());
        assertEquals("[]", dl.toStringRev());
        assertEquals(0, dl.size());

        dl.append(3);
        assertEquals("[3]", dl.toString());
        assertEquals("[3]", dl.toStringRev());
        assertEquals(1, dl.size());

        dl.append(4);
        assertEquals("[3, 4]", dl.toString());
        assertEquals("[4, 3]", dl.toStringRev());
        assertEquals(2, dl.size());

        dl.delete(dl.head().next());
        assertEquals("[3]", dl.toString());
        assertEquals("[3]", dl.toStringRev());
        assertEquals(1, dl.size());

        DLList<String> d2= new DLList<String>();
        assertEquals("[]", d2.toString());
        assertEquals("[]", d2.toStringRev());
        assertEquals(0, d2.size());

        d2.append("bruh");
        assertEquals("[bruh]", d2.toString());
        assertEquals("[bruh]", d2.toStringRev());
        assertEquals(1, d2.size());

        d2.append("Andrew");
        assertEquals("[bruh, Andrew]", d2.toString());
        assertEquals("[Andrew, bruh]", d2.toStringRev());
        assertEquals(2, d2.size());

        d2.delete(d2.head());
        assertEquals("[Andrew]", d2.toString());
        assertEquals("[Andrew]", d2.toStringRev());
        assertEquals(1, d2.size());

        d2.delete(d2.tail());
        assertEquals("[]", d2.toString());
        assertEquals("[]", d2.toStringRev());
        assertEquals(0, d2.size());

    }

}
