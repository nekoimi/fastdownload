package com.nekoimi.fastclaw.event;

import com.nekoimi.fastclaw.downloader.Request;
import com.nekoimi.fastclaw.downloader.Response;

/**
 * nekoimi  2021/5/6 上午9:13
 */
public interface DownloadSuccessListener {
    void handle(Request request, Response response);
}
