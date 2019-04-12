package utils

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View

/**
 * wrap compatible version
 *
 */
object CompatibleUtils {

    @SuppressLint("ObsoleteSdkInt")
    fun setViewBackground(view: View, drawable: Drawable) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            view.background = drawable
        } else {
            view.setBackgroundDrawable(drawable)
        }
    }

}
