package example.springdata.multistore.shop;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import org.springframework.data.annotation.PersistenceConstructor;


@Data
//@RequiredArgsConstructor(onConstructor = @__(@PersistenceConstructor))
public class LineItem {

	private final String caption;
	private final double price;

	int quantity = 1;
	
	public LineItem(String caption, double price) {
		this.caption = caption;
		this.price = price;
	}

	public LineItem(String caption, double price, int quantity) {
		this(caption, price);
		this.quantity = quantity;
	}
}