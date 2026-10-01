// Nguyen Ngoc Yen Nhi - 25810030
class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    val sanPham1 = SanPham("Bút", 5000.0, 10)
    val sanPham2 = SanPham(
        tenSanPham = "Vở",
        gia = 10000.0
    )

    println("Sản phẩm 1:")
    println("Tên: ${sanPham1.tenSanPham}")
    println("Giá: ${sanPham1.gia}")
    println("Số lượng tồn kho: ${sanPham1.soLuongTonKho}")

    println()

    println("Sản phẩm 2:")
    println("Tên: ${sanPham2.tenSanPham}")
    println("Giá: ${sanPham2.gia}")
    println("Số lượng tồn kho: ${sanPham2.soLuongTonKho}")
}