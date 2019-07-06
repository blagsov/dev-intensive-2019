package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {

        val parts: List<String>? = fullName?.split(" ")
        if (fullName == null) {
            val firstName = null
            val lastName = null
            return firstName to lastName
        }
        if (fullName == "") {
            val firstName = null
            val lastName = null
            return firstName to lastName
        }
        if (fullName == " ") {
            val firstName = null
            val lastName = null
            return firstName to lastName
        }


        //  if (fullName == "")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

//        if (lastName == "")
//        {
//            val firstName = parts.getOrNull(0)
//            val lastName = null
//            return firstName to lastName
//
//        }

//        return Pair(firstName,lastName)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " ") = " "
    //{
//
//        val parts: List<String>? = payload.split(divider)
//
//        when (payload) {
//            " " -> "_"
//
//            "а" -> "a"
//
//            "б" -> "b"
//
//
//            "в" -> "v"
//
//
//            "г" -> "g"
//
//
//            "д" -> "d"
//
//
//            "е" -> "e"
//
//
//            "ё" -> "e"
//
//
//            "ж" -> "zh"
//
//
//            "з" -> "z"
//
//
//            "и" -> "i"
//
//
//            "й" -> "i"
//
//            "к" -> "k"
//
//
//            "л" -> "l"
//
//
//            "м" -> "m"
//
//
//            "н" -> "n"
//
//
//            "о" -> "o"
//
//
//            "п" -> "p"
//
//
//            "р" -> "r"
//
//
//            "с" -> "s"
//
//
//            "т" -> "t"
//
//
//            "у" -> "u"
//
//
//            "ф" -> "f"
//
//
//            "х" -> "h"
//
//
//            "ц" -> "c"
//
//
//            "ч" -> "ch"
//
//
//            "ш" -> "sh"
//
//
//            "щ" -> "sh'"
//
//
//            "ъ" -> ""
//
//
//            "ы" -> "i"
//
//
//            "ь" -> ""
//
//
//            "э" -> "e"
//
//
//            "ю" -> "yu"
//
//
//            "я" -> "ya"
//
//            "А" -> "a"
//
//            "Б" -> "b"
//
//
//            "В" -> "v"
//
//
//            "Г" -> "g"
//
//
//            "Д" -> "d"
//
//
//            "Е" -> "e"
//
//
//            "Ё" -> "e"
//
//
//            "Ж" -> "zh"
//
//
//            "З" -> "z"
//
//
//            "И" -> "i"
//
//
//            "Й" -> "i"
//
//            "К" -> "k"
//
//
//            "Л" -> "l"
//
//
//            "М" -> "m"
//
//
//            "Н" -> "n"
//
//
//            "О" -> "o"
//
//
//            "П" -> "p"
//
//
//            "Р" -> "r"
//
//
//            "С" -> "s"
//
//
//            "Т" -> "t"
//
//
//            "У" -> "u"
//
//
//            "Ф" -> "f"
//
//
//            "Х" -> "h"
//
//
//            "Ц" -> "c"
//
//
//            "Ч" -> "ch"
//
//
//            "Ш" -> "sh"
//
//
//            "Щ" -> "sh'"
//
//
//            "Ъ" -> ""
//
//
//            "Ы" -> "i"
//
//
//            "Ь" -> ""
//
//
//            "Э" -> "e"
//
//
//            "Ю" -> "yu"
//
//
//            "Я" -> "ya"
//
//
//
//            else -> "error"
//        }}

    fun toInitials(firstName: String?, lastName: String?) =
        "${firstName?.get(0)}${lastName?.get(0)}"

}





