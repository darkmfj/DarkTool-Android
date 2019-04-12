package utils

import com.darkmfj.darktool.extensions.format
import java.util.*

class CheckDateFormatItem {
    val formaT_YYYYMMDD_HHMMSS: String
    val formaT_YYYYMMDD: String
    val formaT_HHMM: String
    val formaT_HHMMSS: String
    val formaT_DIS_YYYYMMDD_HHMMSS: String
    val formaT_DIS_YYYYMMDD: String
    val formaT_YYYYMM: String
    val date: java.util.Date

    init {
        val currentDate = Date()
        this.date = currentDate

        this.formaT_YYYYMMDD_HHMMSS = currentDate.format(DateUtils.FORMAT_YYYYMMDD_HHMMSS)
        this.formaT_YYYYMMDD = currentDate.format(DateUtils.FORMAT_YYYYMMDD)
        this.formaT_YYYYMM = currentDate.format(DateUtils.FORMAT_YYYYMM)
        this.formaT_HHMM = currentDate.format(DateUtils.FORMAT_HHMM)
        this.formaT_HHMMSS = currentDate.format(DateUtils.FORMAT_HHMMSS)
        this.formaT_DIS_YYYYMMDD_HHMMSS = currentDate.format(DateUtils.FORMAT_DIS_YYYYMMDD_HHMMSS)
        this.formaT_DIS_YYYYMMDD = currentDate.format(DateUtils.FORMAT_DIS_YYYYMMDD)

    }
}

