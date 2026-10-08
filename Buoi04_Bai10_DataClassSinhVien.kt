// Nguyen Ngoc Yen Nhi - 25810030
data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val diemTrungBinh: Double
)

fun main() {
    val sv1 = SinhVien(
        "25810030",
        "Nguyen Ngoc Yen Nhi",
        8.5
    )

    val sv2 = SinhVien(
        "25810030",
        "Nguyen Ngoc Yen Nhi",
        8.5
    )

    println("Object thứ nhất:")
    println(sv1)

    println()

    println("So sánh hai object:")
    println(sv1 == sv2)

    println()

    val sv3 = sv1.copy(
        diemTrungBinh = 9.0
    )

    println("Object tạo từ copy:")
    println(sv3)
}