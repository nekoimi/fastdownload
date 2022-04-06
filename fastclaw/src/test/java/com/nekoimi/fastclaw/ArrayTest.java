package com.nekoimi.fastclaw;

import com.nekoimi.fastclaw.utils.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * <p></p>
 *
 * @author nekoimi  2022/4/2 14:56
 */
public class ArrayTest {

    @Test
    void testCreate() {
        Assertions.assertArrayEquals(new Integer[1], ArrayUtils.newArray(Integer.class, 1));
        Assertions.assertArrayEquals(new String[1], ArrayUtils.newArray(String.class, 1));
        Assertions.assertArrayEquals(new List[1], ArrayUtils.newArray(List.class, 1));
        Assertions.assertArrayEquals(new Object[1], ArrayUtils.newArray(Object.class, 1));
    }

    @Test
    void testResize() {
        Integer[] integers = new Integer[1];
        Assertions.assertArrayEquals(new Integer[10], ArrayUtils.resize(integers, Integer.class, 9));
    }
}
