package com.nekoimi.fastclaw.downloader;

import com.nekoimi.fastclaw.event.DownloadErrorListener;
import com.nekoimi.fastclaw.event.DownloadSuccessListener;
import com.nekoimi.fastclaw.event.EventManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * nekoimi  2021/4/30 上午11:20
 */
public abstract class AbstractDownloader implements FastClawDownloader {
    private final Logger logger = LoggerFactory.getLogger(AbstractDownloader.class);
    protected EventManager eventManager;
    protected DownloadSuccessListener successListener;
    protected DownloadErrorListener errorListener;

    public AbstractDownloader(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @Override
    public Response download(Request request) {
        return null;
    }

    public void onSuccess(Request request, Response response) {
        try {
            successListener.handle(request, response);
        } catch (Exception ex) {
            logger.error("=== FastClawDownloader::onSuccess === " + ex.getMessage());
        }
    }

    public void onError(Request request) {
        try {
            errorListener.handle(request);
        }catch (Exception ex) {
            logger.error("=== FastClawDownloader::onError === " + ex.getMessage());
        }
    }
}
