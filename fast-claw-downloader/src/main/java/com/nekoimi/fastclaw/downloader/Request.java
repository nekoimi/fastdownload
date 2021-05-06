package com.nekoimi.fastclaw.downloader;

/**
 * nekoimi  2021/4/30 上午10:57
 */
public interface Request {
    /**
     * 累计重试次数
     * @return
     */
    int getRetryCount();
}
