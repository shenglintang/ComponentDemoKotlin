package com.lin.common

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.launcher.ARouter

open class BaseApplication : Application() {
    //全局唯一的context
    private var application: BaseApplication? = null

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        application = this
    }

    override fun onCreate() {
        super.onCreate()
        initARouter()
    }

    private fun initARouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(application)
    }

    fun getApplication(): BaseApplication? {
        return application
    }
}