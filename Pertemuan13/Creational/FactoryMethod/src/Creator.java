public abstract class Creator {
    public abstract Product createProduct();

    public void anOperation() {
        Product product = createProduct();
        product.use();
    }
}