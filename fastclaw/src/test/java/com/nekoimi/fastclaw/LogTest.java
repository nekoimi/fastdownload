package com.nekoimi.fastclaw;

import com.nekoimi.fastclaw.logger.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p></p>
 *
 * @author nekoimi  2022/4/2 14:54
 */
public class LogTest {

    @Test
    void testFormat() {
        Log log = new Log("这{}是 {}一{} 段!he {} llo@测试 - {} 文,本: {} 后缀.xxx");
    }

    @Test
    void testFormatArgs() {
        Log log = new Log("hello, {}");
        Assertions.assertEquals("hello, world", log.format("world"));
    }
}
