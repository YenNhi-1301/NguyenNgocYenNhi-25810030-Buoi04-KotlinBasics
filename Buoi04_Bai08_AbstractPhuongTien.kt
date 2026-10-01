// Nguyen Ngoc Yen Nhi - 25810030
abstract class PhuongTienDiChuyen(
    val ten: String
) {
    abstract fun tocDoToiDa(): Int

    fun moTa() {
        println("Phương tiện: $ten")
        println("Tốc độ tối đa: ${tocDoToiDa()} km/h")
    }
}

class XeMay(ten: String) : PhuongTienDiChuyen(ten) {
    override fun tocDoToiDa(): Int {
        return 100
    }
}

class OTo(ten: String) : PhuongTienDiChuyen(ten) {
    override fun tocDoToiDa(): Int {
        return 150
    }
}

fun main() {
    val xeMay = XeMay("Xe máy Honda")
    val oTo = OTo("Ô tô Toyota")

    xeMay.moTa()
    println()

    oTo.moTa()
}