// Nguyen Ngoc Yen Nhi - 25810030
interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}

class HinhVuong(
    val canh: Double
) : CoTheTinhDienTich {

    override fun tinhDienTich(): Double {
        return canh * canh
    }
}

class HinhTron(
    val banKinh: Double
) : CoTheTinhDienTich {

    override fun tinhDienTich(): Double {
        return Math.PI * banKinh * banKinh
    }
}

fun main() {
    val hinhVuong = HinhVuong(5.0)
    val hinhTron = HinhTron(3.0)

    println("Diện tích hình vuông: ${hinhVuong.tinhDienTich()}")
    println("Diện tích hình tròn: ${hinhTron.tinhDienTich()}")
}