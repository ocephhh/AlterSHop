package Model;

public class HargaPOJO {

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(String hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    String namaProduk, hargaProduk;

    public int getGambarProduk() {
        return gambarProduk;
    }

    public void setGambarProduk(int gambarProduk) {
        this.gambarProduk = gambarProduk;
    }

    int gambarProduk;

    public HargaPOJO( String namaProduk, String hargaProduk, int gambarProduk ){
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.gambarProduk = gambarProduk;
    }
}
