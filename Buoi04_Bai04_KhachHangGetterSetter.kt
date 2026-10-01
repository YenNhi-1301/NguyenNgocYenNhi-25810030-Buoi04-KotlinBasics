// Nguyen Ngoc Yen Nhi - 25810030
class KhachHang(
    var ho: String,
    var ten: String
) {
    var hoTen: String
        get() {
            return "$ho $ten"
        }
        set(value) {
            val parts = value.trim().split(" ", limit = 2)
            ho = parts[0]
            ten = parts[1]
        }
}

fun main() {
    val khachHang = KhachHang("Nguyen", "Nhi")

    println("Họ tên ban đầu: ${khachHang.hoTen}")

    khachHang.hoTen = "Nguyen Ngoc Yen Nhi"

    println("Họ tên sau khi đổi: ${khachHang.hoTen}")
    println("Họ: ${khachHang.ho}")
    println("Tên: ${khachHang.ten}")
}