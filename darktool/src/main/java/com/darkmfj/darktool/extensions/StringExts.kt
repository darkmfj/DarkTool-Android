package com.darkmfj.darktool.extensions

/**
 * String (Y/N) to Bool
 * @return Y => bool True ; N => bool False
 *
 */
fun String.convertStringToBool(): Boolean {
    var result = false
    if (this.toUpperCase() == "Y") {
        result = true
    }

    return result
}


/**
 * Bool to String(Y/N)
 * @return True => "Y" ; False => "N"
 */
fun Boolean.convertBoolToString(): String {
    var result = "N"
    if (this) {
        result = "Y"
    }
    return result
}

/**
 * Convert byte to human can easy understand
 * ref: https://stackoverflow.com/questions/3758606/how-to-convert-byte-size-into-human-readable-format-in-java
 */
fun Long.toReadableByteCount(si: Boolean = false) : String {
    val unit = if (si) 1000 else 1024
    return if (this < unit.toLong()) {
        "$this B"
    } else {
        val exp = (Math.log(this.toDouble()) / Math.log(unit.toDouble())).toInt()
        val pre = (if (si) "kMGTPE" else "KMGTPE")[exp - 1] + if (si) "" else "i"
        String.format("%.1f %sB", this.toDouble() / Math.pow(unit.toDouble(), exp.toDouble()), pre)
    }
}

