package com.nekoimi.fastclaw.logger;

import java.time.format.DateTimeFormatter;

/**
 * <p>日志实现</p>
 *
 * @author nekoimi  2022/4/2 11:59
 */
public class LoggerImpl implements Logger {
    /**
     * <p>默认日期时间格式化</p>
     */
    private final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * <p>日志等级</p>
     */
    private final int level;

    /**
     * <p>日志名称</p>
     */
    private final String name;

    /**
     * @param name 日志名称
     */
    public LoggerImpl(String name) {
        this.level = 100;
        this.name = name;
    }

    @Override
    public String format(Level level, String format, Object... args) {
        return null;
    }

    @Override
    public void log(Level level, String format, Object... args) {

    }

    @Override
    public void debug(String format, Object... args) {

    }

    @Override
    public void info(String format, Object... args) {

    }

    @Override
    public void warn(String format, Object... args) {

    }

    @Override
    public void error(String format, Object... args) {

    }

    @Override
    public boolean isEnable(Level level) {
        return false;
    }

    @Override
    public boolean isEnableDebug() {
        return false;
    }

    @Override
    public boolean isEnableInfo() {
        return false;
    }

    @Override
    public boolean isEnableWarn() {
        return false;
    }

    @Override
    public boolean isEnableError() {
        return false;
    }
}
