package application;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class OrderBean {
	private final SimpleStringProperty  orderDate;
	private final SimpleStringProperty  region;
	private final SimpleStringProperty  rep1;
	private final SimpleStringProperty  rep2;
	private final SimpleStringProperty  item;
	private final SimpleLongProperty units;
	private final SimpleStringProperty  unitCost;
	private final SimpleStringProperty  total;
//	private String orderDate;
//	private String region;
//	private String rep1;
//	private String rep2;
//	private String item;
//	private Long units;
//	private String unitCost;
//	private String total;
	   
	public OrderBean(
			String orderDate,
			String region,
			String rep1,
			String rep2,
			String item,
			Long units,
			String unitCost,
			String total) 
	{
		
		super();
		
		this.orderDate  = new SimpleStringProperty(orderDate);
		this.region = new SimpleStringProperty(region);
		this.rep1 = new SimpleStringProperty(rep1);
		this.rep2 = new SimpleStringProperty(rep2);
		this.item = new SimpleStringProperty(item);
		this.units = new SimpleLongProperty(units);
		this.unitCost = new SimpleStringProperty(unitCost);
		this.total =new SimpleStringProperty(total);
//		this.region = region;
//		this.rep1 = rep1;
//		this.rep2 = rep2;
//		this.item = item;
//		this.units = units;
//		this.unitCost = unitCost;
//		this.total = total;
	}	
//	
//	public SimpleStringProperty getOrderDate() {
//		return orderDate;
//	}
//	public void setOrderDate(SimpleStringProperty orderDate) {
//		this.orderDate = orderDate;
//	}
//	public SimpleStringProperty getRegion() {
//		return region;
//	}
//	public void setRegion(SimpleStringProperty region) {
//		this.region = region;
//	}
//	public SimpleStringProperty getRep1() {
//		return rep1;
//	}
//	public void setRep1(SimpleStringProperty rep1) {
//		this.rep1 = rep1;
//	}
//	public SimpleStringProperty getRep2() {
//		return rep2;
//	}
//	public void setRep2(SimpleStringProperty rep2) {
//		this.rep2 = rep2;
//	}
//	public SimpleStringProperty getItem() {
//		return item;
//	}
//	public void setItem(SimpleStringProperty item) {
//		this.item = item;
//	}
//	public SimpleLongProperty getUnits() {
//		return units;
//	}
//	public void setUnits(SimpleLongProperty units) {
//		this.units = units;
//	}
//	public SimpleStringProperty getUnitCost() {
//		return unitCost;
//	}
//	public void setUnitCost(SimpleStringProperty unitCost) {
//		this.unitCost = unitCost;
//	}
//	public SimpleStringProperty getTotal() {
//		return total;
//	}
//	public void setTotal(SimpleStringProperty total) {
//		this.total = total;
//	}
	public String getOrderDate() {
		return orderDate.get();
	}
	public void setOrderDate(String orderDate) {
		this.orderDate.set(orderDate);
	}
	public String getRegion() {
		return region.get();
	}
	public void setRegion(String region) {
		this.region.set(region);
	}
	public String getRep1() {
		return rep1.get();
	}
	public void setRep1(String rep1) {
		this.rep1.set(rep1);
	}
	public String getRep2() {
		return rep2.get();
	}
	public void setRep2(String rep2) {
		this.rep2.set(rep2);
	}
	public String getItem() {
		return item.get();
	}
	public void setItem(String item) {
	this.item.set(item);	
	}
	public Long getUnits() {
		return units.get();
	}
	public void setUnits(Long units) {
		this.units.set(units);
	}
	public String getUnitCost() {
		return unitCost.get();
	}
	public void setUnitCost(String unitCost) {
		this.unitCost.set(unitCost);
	}
	public String getTotal() {
		return total.get();
	}
	public void setTotal(String total) {
		this.total.set(total);
	}
//}
//public String getOrderDate() {
//	return orderDate;
//}
//public void setOrderDate(String orderDate) {
//	this.orderDate = orderDate;
//}
//public String getRegion() {
//	return region;
//}
//public void setRegion(String region) {
//	this.region = region;
//}
//public String getRep1() {
//	return rep1;
//}
//public void setRep1(String rep1) {
//	this.rep1 = rep1;
//}
//public String getRep2() {
//	return rep2;
//}
//public void setRep2(String rep2) {
//	this.rep2 = rep2;
//}
//public String getItem() {
//	return item;
//}
//public void setItem(String item) {
//	this.item = item;
//}
//public Long getUnits() {
//	return units;
//}
//public void setUnits(Long units) {
//	this.units = units;
//}
//public String getUnitCost() {
//	return unitCost;
//}
//public void setUnitCost(String unitCost) {
//	this.unitCost = unitCost;
//}
//public String getTotal() {
//	return total;
//}
//public void setTotal(String total) {
//	this.total = total;
//}
	   
	   
}
