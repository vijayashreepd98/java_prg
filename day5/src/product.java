import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class product implements Serializable,Comparable<product> {

	private String name;
	private Integer quantity,id,price;
	public product()
	{}
	public product(Integer id,String name, Integer quantity, Integer price)
	{
	this.id=id;
	this.name=name;
	this.quantity=quantity;
	this.price=price;

	}
	public String toString()
	{
		return id+"";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int compareTo(product arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
