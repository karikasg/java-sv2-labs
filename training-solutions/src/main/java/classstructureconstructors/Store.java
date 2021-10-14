package classstructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        this.stock = 0;
    }

    public void store(int store) {
        stock += store;
    }

    public void dispatch(int dispatch) {
        stock -= dispatch;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

}
