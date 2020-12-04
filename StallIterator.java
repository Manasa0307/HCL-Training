package com.src;

public class StallIterator {
	String name;
	String detail;
	String type;
	String ownername;
	public StallIterator() {
		super();
	}
	public StallIterator(String name, String detail, String type, String ownername) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownername = ownername;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	@Override
	public String toString() {
		return "" + name + "   " + detail +    "  "  + type +  "      "  + ownername;
	}
	

}
