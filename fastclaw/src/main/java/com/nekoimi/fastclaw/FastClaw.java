package com.nekoimi.fastclaw;

import com.nekoimi.fastclaw.logger.Level;
import com.nekoimi.fastclaw.logger.Logger;
import com.nekoimi.fastclaw.logger.LoggerFactory;

/**
 * nekoimi  2022/4/1 15:04
 */
public class FastClaw {
    private static final Logger logger = LoggerFactory.getLogger(FastClaw.class);

    public static void main(String[] args) {
        logger.log(Level.DEBUG, "测{}试 - LOG", "DEBUG");
        logger.debug("测{}试", "DEBUG");
        logger.info("测{}试", "INFO");
        logger.warn("测{}试", "WARN");
        logger.error("测{}试", "ERROR");
    }
}
