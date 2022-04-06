package main.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MirrorArrayTest {

    @Test
    void test_isMirrorArray() {
        assertFalse(MirrorArray.isMirrorArray(new int[0]));
        assertFalse(MirrorArray.isMirrorArray(new int[]{1, 2}));
        assertFalse(MirrorArray.isMirrorArray(new int[]{1, 1, 2}));
        assertFalse(MirrorArray.isMirrorArray(new int[]{1, 4, 1, 1}));
        assertFalse(MirrorArray.isMirrorArray(new int[]{1, 2, 2, 3, 5, 5, 4, 3, 2, 2, 1}));

        assertTrue(MirrorArray.isMirrorArray(new int[]{1}));
        assertTrue(MirrorArray.isMirrorArray(new int[]{1, 1}));
        assertTrue(MirrorArray.isMirrorArray(new int[]{1, 2, 3, 2, 1}));
        assertTrue(MirrorArray.isMirrorArray(new int[]{1, 2, 2, 3, 4, 5, 5, 4, 3, 2, 2, 1}));
    }

}