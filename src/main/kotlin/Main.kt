fun main() {
    val name = "Вася"
    val goOnline = 3133 //cek

    println(name + " был(а) " + agoToText(goOnline))
}

fun agoToText(goOnline:Int): String {
    val stringLine = when (goOnline) {
        in 0..60 -> "только что"
        in 61..60*60 -> minuts(goOnline)
        in 60*60+1..24*60*60 -> hours(goOnline)
        in 24*60*60+1..48*60*60 -> "сегодня"
        in 48*60*60+1..72*60*60 -> "вчера"
        else -> "давно"
    }
    return stringLine
}

fun minuts(goOnline: Int): String {
    val goOnlineMinut = goOnline / 60
    var minut = "$goOnlineMinut минут назад"
    if ((goOnlineMinut % 10) == 1) {
        minut = "$goOnlineMinut минуту назад"
    }
    if (((goOnlineMinut % 10) == 2)||((goOnlineMinut % 10) == 3)||((goOnlineMinut % 10) == 4)) {
        minut = "$goOnlineMinut минуты назад"
    }
    return minut
}

fun hours(goOnline: Int): String {
    val goOnlineHour = goOnline / 3600
    var hour = "$goOnlineHour часов назад"
    if ((goOnlineHour % 10) == 1) {
        hour = "$goOnlineHour час назад"
    }
    if (((goOnlineHour % 10) == 2)||((goOnlineHour % 10) == 3)||((goOnlineHour % 10) == 4)) {
        hour = "$goOnlineHour часа назад"
    }
    return hour
}