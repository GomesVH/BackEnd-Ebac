package example.springdata.multistore.customer;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import org.springframework.data.geo.Point;

/**
 * A domain object to capture addresses.
 */
@Getter
@Setter
@RequiredArgsConstructor
@Embeddable
public class Address {

	private Point location;
	private String street;
	private String zipCode;
	
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}