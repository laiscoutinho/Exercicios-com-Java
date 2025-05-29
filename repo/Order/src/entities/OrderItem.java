package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	//associar produto com o item do pedido
	private Product p;
	
	public OrderItem() {
	}
	public OrderItem(Integer quantity,Double price, Product p) {
		this.quantity = quantity;
		this.price = price;
		this.p = p;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Product getP() {
		return p;
	}


	public void setP(Product p) {
		this.p = p;
	}


	public Double subTotal() {
		return quantity * price;
	}
	@Override
	public String toString() {
		return getP().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
