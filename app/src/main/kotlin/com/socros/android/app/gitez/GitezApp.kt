package com.socros.android.app.gitez

import android.app.Application
import com.socros.android.lib.tim.Tim

class GitezApp : Application() {

	init {
		Tim.init(BuildConfig.DEBUG)
	}

}