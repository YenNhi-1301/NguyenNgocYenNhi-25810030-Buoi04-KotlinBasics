// Nguyen Ngoc Yen Nhi - 25810030
fun String.demNguyenAm(): Int {
    var dem = 0

    for (kyTu in this.lowercase()) {
        if (
            kyTu == 'a' ||
            kyTu == 'e' ||
            kyTu == 'i' ||
            kyTu == 'o' ||
            kyTu == 'u'
        ) {
            dem++
        }
    }

    return dem
}

fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) {
        return false
    }

    for (i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }

    return true
}

fun main() {
    val chuoi1 = "Kotlin"
    val chuoi2 = "Lap Trinh"
    val chuoi3 = "OpenAI"

    println("$chuoi1 có ${chuoi1.demNguyenAm()} nguyên âm")
    println("$chuoi2 có ${chuoi2.demNguyenAm()} nguyên âm")
    println("$chuoi3 có ${chuoi3.demNguyenAm()} nguyên âm")

    println()

    val so1 = 7
    val so2 = 10
    val so3 = 13

    println("$so1 là số nguyên tố: ${so1.laSoNguyenTo()}")
    println("$so2 là số nguyên tố: ${so2.laSoNguyenTo()}")
    println("$so3 là số nguyên tố: ${so3.laSoNguyenTo()}")
}