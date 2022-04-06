package com.nekoimi.fastclaw;

import com.nekoimi.fastclaw.logger.Logger;
import com.nekoimi.fastclaw.logger.LoggerFactory;

/**
 * nekoimi  2022/4/1 15:04
 */
public class FastClaw {
    private static final Logger logger = LoggerFactory.getLogger(FastClaw.class);

    public static void main(String[] args) {
        logger.debug("测{}试", "AAA");
    }
}
