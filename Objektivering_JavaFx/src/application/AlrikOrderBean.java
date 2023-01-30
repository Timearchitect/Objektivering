package application;

public class AlrikOrderBean {
	public AlrikOrderBean(String orderDate, String region, String rep1, String rep2, String total, String item,
			String unitCost, String units) {
		super();
		OrderDate = orderDate;
		Region = region;
		Rep1 = rep1;
		Rep2 = rep2;
		Total = total;
		Item = item;
		UnitCost = unitCost;
		Units = units;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getRep1() {
		return Rep1;
	}
	public void setRep1(String rep1) {
		Rep1 = rep1;
	}
	public String getRep2() {
		return Rep2;
	}
	public void setRep2(String rep2) {
		Rep2 = rep2;
	}
	public String getTotal() {
		return Total;
	}
	public void setTotal(String total) {
		Total = total;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public String getUnitCost() {
		return UnitCost;
	}
	public void setUnitCost(String unitCost) {
		UnitCost = unitCost;
	}
	public String getUnits() {
		return Units;
	}
	public void setUnits(String units) {
		Units = units;
	}
	String OrderDate;
	String Region;
	String Rep1;
	String Rep2;
	String Total;
	String Item;
	String UnitCost;
	String Units;
}
