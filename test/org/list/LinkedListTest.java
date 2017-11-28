package org.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    LinkedList list;

    @Before
    public void before() {
        list = new LinkedList();
    }

    @Test
    public void WhenCreated_LinkedListHasNoElements() {
        assertEquals(0, list.size());

    }

    @Test
    public void WhenSingleItemInsertedHasSizeOne() {
        list.insert(33);
        assertEquals(1, list.size());
    }

    @Test
    public void WhenItemInsertedHeadEqualsItem() {
        list.insert(42);
        assertEquals(42, list.head());

    }

    @Test
    public void WhenAnotherItemInsertedItIsHead() {
        list.insert(42);
        list.insert(43);
        assertEquals(43, list.head());
    }

    @Test
    public void WhenTwoItemsInsertedSizeIsTwo() {
        list.insert(42);
        list.insert(43);
        assertEquals(2, list.size());
    }




}
