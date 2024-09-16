import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 15000, 10);
        Sales sales = new Sales(laptop);

        // Penjualan produk
        sales.sellProduct(5);

        // Restock produk
        sales.restockProduct(10);

        // Update harga produk
        sales.updateProductPrice(12000);

        // Coba update dengan harga negatif
        sales.updateProductPrice(-5000);
    }
}