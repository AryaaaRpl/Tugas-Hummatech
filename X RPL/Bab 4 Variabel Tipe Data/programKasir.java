public class programKasir {
    public static void main(String[] args) {
        final String Nama_Toko = "Toko Yanto";
        final int Harga_Pokok = 80000;
        final int Harga_Promo = Harga_Pokok - 10000;
        final int Harga_Reseller = Harga_Pokok - 20000;

        System.out.println("Nama Toko: " + Nama_Toko);
        System.out.println("Harga Pokok: " + Harga_Pokok);
        System.out.println("Harga Promo: " + Harga_Promo);
        System.out.println("Harga Reseller: " + Harga_Reseller);
    }
}