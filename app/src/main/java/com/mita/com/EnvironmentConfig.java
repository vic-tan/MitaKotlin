package com.mita.com;

import com.xiaomai.environmentswitcher.annotation.Environment;
import com.xiaomai.environmentswitcher.annotation.Module;

/**
 * 此类是用来做正式环境还测试之前切换
 */
public class EnvironmentConfig {


    static {

    }

    /**
     * 整个应用程序环境
     */
    @Module
    private class App {

        @Environment(url = "https://videoline.cqkegemo.cn", isRelease = true)
        private String pro;

        @Environment(url = "http://mitanew.cqkegemo.cn")
        private String dev;

    }


}
