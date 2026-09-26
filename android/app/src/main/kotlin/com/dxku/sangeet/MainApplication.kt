package com.dxku.sangeet

import android.app.Application
import com.dxku.sangeet.widget.MusicWidgetManager

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MusicWidgetManager.initialize(this)
    }
}
