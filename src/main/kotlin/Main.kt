fun main() {
    val name = "Вася"
    val goOnline = 555 //cek

    println(name + " был(а) " + agoToText(goOnline))
}

fun agoToText(goOnline:Int): String {
    val stringLine = when (goOnline) {
        in 0..60 -> "только что"
        in 61..60*60 -> minuts(goOnline)
        in 60*60+1..24*60*60 -> "x часов назад"
        in 24*60*60+1..48*60*60 -> "сегодня"
        in 48*60*60+1..72*60*60 -> "вчера"
        else -> "давно"
    }
    return stringLine
}

fun minuts(goOnline: Int): String {
    val minuts = when (goOnline) {
        in 61..120 -> "gg"//21*60+1..1320,

        else -> "jj"
    }
    return minuts
}