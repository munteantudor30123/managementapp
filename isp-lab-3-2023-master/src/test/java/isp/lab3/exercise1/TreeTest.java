package isp.lab3.exercise1;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TreeTest {
    @Test
    public void testGrow() {
        Tree myTree = new Tree();
        myTree.grow(5);
        assertEquals(String.valueOf(20), myTree.toString(), "Tree height: 20");
    }
    @Test

    public void testToString() {
        Tree myTree = new Tree();
        myTree.grow(8);
        assertEquals(String.valueOf(23), myTree.toString(), "Tree height: 23");
    }



}
