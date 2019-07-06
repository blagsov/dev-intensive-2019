package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

fun Date.format(pattern: String = "HH:mm:ss dd.MM.yy"): String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value: Int, units: TimeUnits = TimeUnits.SECOND): Date {
    var time = this.time
    time += when (units) {
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
    }
    this.time = time
    return this
}

fun Date.humanizeDiff(date: Date = Date()) = " "
        //String {
//
//    var sD = ""
//
//
//    if (date < Date().add(0, TimeUnits.SECOND) && date >= Date().add(-1, TimeUnits.SECOND)) {
//        sD = "только что"
//    }
//    if (date > Date().add(-1, TimeUnits.SECOND) && date <Date().add(-45, TimeUnits.SECOND)) {
//        sD = "несколько секунд назад"
//    }
//
//    if (date > Date().add(-45, TimeUnits.SECOND) && date < Date().add(-75, TimeUnits.SECOND)) {
//        sD = "минуту назад"
//    }
//    if (date > Date().add(-75, TimeUnits.SECOND) && date < Date().add(-45, TimeUnits.MINUTE)) {
//        sD = "$value минут назад"
//    }
//    if (date > Date().add(-45, TimeUnits.MINUTE) && date < Date().add(-75, TimeUnits.MINUTE)) {
//        sD = "час назад"
//    }
//    if (date > Date().add(-75, TimeUnits.MINUTE) && date < Date().add(-22, TimeUnits.HOUR)) {
//        sD = "N часов назад"
//    }
//    if (date > Date().add(-22, TimeUnits.HOUR) && date < Date().add(-26, TimeUnits.HOUR)) {
//        sD = "день назад"
//    }
//    if (date < Date().add(-26, TimeUnits.HOUR) && date > Date().add(-360, TimeUnits.DAY)) {
//        sD = "$ дней назад"
 //   }
//if (date > Date().add(-360, TimeUnits.DAY)) {
//        sD = "более года назад"
//    }
  //  return sD
//}

enum class TimeUnits {
    SECOND,
    MINUTE,
    HOUR,
    DAY
}