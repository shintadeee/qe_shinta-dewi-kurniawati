package info.produk;
public class MainInfoProduk {
    public static void main(String[] args) {
        InfoProduk product = new InfoProduk();
        product.setName("coffee");
        product.setDescription("this is coffee");
        product.setPrice(15000);
        product.setStock(10);

        product.getInfo();
    }
}
