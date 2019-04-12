package utils

import java.util.*

class DateUtils {

    companion object {

        /**
         * yyyyMMdd
         * EX: 20191130
         */
        const val FORMAT_YYYYMMDD = "yyyyMMdd"

        /**
         * yyyyMM
         * EX: 201911
         */
        const val FORMAT_YYYYMM = "yyyyMM"

        /**
         * yyyyMMdd HHmmss
         * EX: 20191130 235959
         */
        const val FORMAT_YYYYMMDD_HHMMSS = "yyyyMMdd HHmmss"

        /**
         * HHmmss
         * EX: 235959
         */
        const val FORMAT_HHMMSS = "HHmmss"

        /**
         * HHmm
         * EX: 2359
         */
        const val FORMAT_HHMM = "HHmm"

        /**
         * yyyy/MM/dd
         * EX: 2019/11/30
         */
        const val FORMAT_DIS_YYYYMMDD = "yyyy/MM/dd"

        /**
         * yyyy/MM/dd HH:mm:ss
         * EX: 2019/11/30 23:59:59
         */
        const val FORMAT_DIS_YYYYMMDD_HHMMSS = "yyyy/MM/dd HH:mm:ss"

        /**
         * HH:mm:ss
         * EX: 23:59:59
         */
        const val FORMAT_DIS_HHMMSS = "HH:mm:ss"


        /**
         * HH:mm
         * EX: 23:59
         *
         */
        const val FORMAT_DIS_HHMM = "HH:mm"

        /**
         * just return new Date ...
         */
        fun GetCurrentDate(): Date {
            return Date()
        }

    }


}