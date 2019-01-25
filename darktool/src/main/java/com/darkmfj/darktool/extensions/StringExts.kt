package com.darkmfj.darktool.extensions

/**
 * String (Y/N) to Bool
 * Y => bool True
 * N => bool False
 */
fun String.convertStringToBool(): Boolean {
    var result = false
    if (this == "Y") {
        result = true
    }

    return result
}


/**
 * Bool to String(Y/N)
 * True => "Y"
 * False => "N"
 */
fun Boolean.convertBoolToString(): String {
    var result = "N"
    if (this) {
        result = "Y"
    }
    return result
}
