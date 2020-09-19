package com.base

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.hjq.toast.ToastUtils
import okhttp3.OkHttpClient
import org.litepal.LitePal

/**
 * Application  基础类
 */
open class BasicApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //设置debug模式，默认为false，设置为true后，发请求，过滤"RxHttp"能看到请求日志
        ToastUtils.init(this);
        LitePal.initialize(this)//初始化数据库
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        //分包初始化
        MultiDex.install(this)
    }

}