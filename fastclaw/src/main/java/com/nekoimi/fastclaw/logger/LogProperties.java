package com.nekoimi.fastclaw.logger;

import com.nekoimi.fastclaw.config.BaseConfigProperties;

/**
 * <p>日志配置</p>
 *
 * @author nekoimi  2022/4/6 9:27
 */
public class LogProperties extends BaseConfigProperties {

    /**
     * <p>日志等级</p>
     */
    private Level level;

    /**
     * <p>日志适配器配置</p>
     */
    private String adapter;

    /**
     * <p>单例</p>
     */
    private static class SingletonHolder {
        public static LogProperties instance = new LogProperties();
    }

    public static LogProperties getInstance() {
        return SingletonHolder.instance;
    }

    static {
        // 初始化配置文件
        LogProperties.getInstance().initialization();
    }

    @Override
    protected String configPath() {
        return "/log.properties";
    }


    @Override
    public void initialization() {
        super.initialization();
        // 初始化配置
        this.level = Level.of(getStr("logger.level"));
        this.adapter = getStr("logger.adapter");
    }

    public Level getLevel() {
        return level;
    }

    public String getAdapter() {
        return adapter;
    }
}
