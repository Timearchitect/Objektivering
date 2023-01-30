package application;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class OrderBean {
	private final SimpleStringProperty  OrderDate;
	private final SimpleStringProperty  Region;
	private final SimpleStringProperty  Rep1;
	private final SimpleStringProperty  Rep2;
	private final SimpleStringProperty  Item;
	private final SimpleLongProperty Units;
	private final SimpleStringProperty  UnitCost;
	private final SimpleStringProperty  Total;
//	private String OrderDate;
//	private String Region;
//	private String Rep1;
//	private String Rep2;
//	private String Item;
//	private Long Units;
//	private String UnitCost;
//	private String Total;
	   
	public OrderBean(
			String OrderDate,
			String Region,
			String Rep1,
			String Rep2,
			String Item,
			Long Units,
			String UnitCost,
			String Total) 
	{
		
		super();
		
		this.OrderDate  = new SimpleStringProperty(this,OrderDate);
		this.Region = new SimpleStringProperty(this,Region);
		this.Rep1 = new SimpleStringProperty(this,Rep1);
		this.Rep2 = new SimpleStringProperty(this,Rep2);
		this.Item = new SimpleStringProperty(this,Item);
		this.Units = new SimpleLongProperty(Units);
		this.UnitCost = new SimpleStringProperty(this,UnitCost);
		this.Total =new SimpleStringProperty(this,Total);
//		this.OrderDate = OrderDate;
//		this.Region = Region;
//		this.Rep1 = Rep1;
//		this.Rep2 = Rep2;
//		this.Item = Item;
//		this.Units = Units;
//		this.UnitCost = UnitCost;
//		this.Total = Total;
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
		return OrderDate.get();
	}
	public void setOrderDate(String orderDate) {
		this.OrderDate.set(orderDate);
	}
	public String getRegion() {
		return Region.get();
	}
	public void setRegion(String region) {
		this.Region.set(region);
	}
	public String getRep1() {
		return Rep1.get();
	}
	public void setRep1(String rep1) {
		this.Rep1.set(rep1);
	}
	public String getRep2() {
		return Rep2.get();
	}
	public void setRep2(String rep2) {
		this.Rep2.set(rep2);
	}
	public String getItem() {
		return Item.get();
	}
	public void setItem(String item) {
		this.Item.set(item);	
	}
	public Long getUnits() {
		return Units.get();
	}
	public void setUnits(Long units) {
		this.Units.set(units);
	}
	public String getUnitCost() {
		return UnitCost.get();
	}
	public void setUnitCost(String unitCost) {
		this.UnitCost.set(unitCost);
	}
	public String getTotal() {
		return Total.get();
	}
	public void setTotal(String total) {
		this.Total.set(total);
	}
	
//	public String getOrderDate() {
//		return OrderDate;
//	}
//	public void setOrderDate(String orderDate) {
//		this.OrderDate=orderDate;
//	}
//	public String getRegion() {
//		return Region;
//	}
//	public void setRegion(String region) {
//		this.Region=region;
//	}
//	public String getRep1() {
//		return Rep1;
//	}
//	public void setRep1(String rep1) {
//		this.Rep1=rep1;
//	}
//	public String getRep2() {
//		return Rep2;
//	}
//	public void setRep2(String rep2) {
//		this.Rep2=rep2;
//	}
//	public String getItem() {
//		return Item;
//	}
//	public void setItem(String item) {
//		this.Item=item;	
//	}
//	public Long getUnits() {
//		return Units;
//	}
//	public void setUnits(Long units) {
//		this.Units=units;
//	}
//	public String getUnitCost() {
//		return UnitCost;
//	}
//	public void setUnitCost(String unitCost) {
//		this.UnitCost=unitCost;
//	}
//	public String getTotal() {
//		return Total;
//	}
//	public void setTotal(String total) {
//		this.Total=total;
//	}
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
