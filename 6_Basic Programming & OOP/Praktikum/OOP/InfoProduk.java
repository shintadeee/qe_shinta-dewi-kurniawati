package info.produk;
public class InfoProduk {
    private String name;
    private String description;
    private int price;
    private int stock;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void getInfo() {
        System.out.println(">> INFO PRODUK <<");
        System.out.println("Nama        : " + name);
        System.out.println("Deskripsi   : " + description);
        System.out.println("Harga       : " + price);
        System.out.println("Jumlah Stok : " + stock);
    }
}

