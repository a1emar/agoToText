fun main() {
    val name = "Вася"
    val goOnline = 555 //cek

    println(name + " был(а) " + agoToText(goOnline))
}

fun agoToText(goOnline:Int) {
    when (goOnline) {
        in 0..60 -> "только что"
    }
}
