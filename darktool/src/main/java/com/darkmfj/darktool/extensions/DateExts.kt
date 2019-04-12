package com.darkmfj.darktool.extensions

import utils.DateUtils
import java.text.SimpleDateFormat
import java.util.*

fun Date.format(pattern:String):String {
    val sdf = SimpleDateFormat(pattern)
    return sdf.format(this)
}

/**
 * for TimeMillis
 */
fun Long.toDate(): Date {
    return Date(this)
}