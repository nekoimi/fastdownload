package com.nekoimi.fastclaw.event;

import com.nekoimi.fastclaw.downloader.Request;

/**
 * nekoimi  2021/5/6 上午9:14
 */
public interface DownloadErrorListener {
    void handle(Request request);
}
