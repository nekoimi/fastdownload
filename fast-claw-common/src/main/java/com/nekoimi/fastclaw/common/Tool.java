package com.nekoimi.fastclaw.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * nekoimi  2021/4/29 下午5:16
 */
public class Tool {

    private static final Logger logger = LoggerFactory.getLogger(Tool.class);

    public static void hello() {
        System.out.println("Hello");
        logger.warn("------------- Tool::hello -------------");
    }

}
