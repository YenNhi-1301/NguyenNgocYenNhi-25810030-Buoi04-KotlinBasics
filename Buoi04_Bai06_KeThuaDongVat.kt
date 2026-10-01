// Nguyen Ngoc Yen Nhi - 25810030
open class DongVat(
    val ten: String
) {
    open fun keu() {
        println("Động vật kêu")
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu() {
        println("Gâu gâu")
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu() {
        println("Meo meo")
    }
}

fun main() {
    val danhSach = listOf(
        Cho("Milu"),
        Meo("Mimi")
    )

    for (dongVat in danhSach) {
        println("Tên: ${dongVat.ten}")
        dongVat.keu()
    }
}