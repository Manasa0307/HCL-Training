package com.src;

public class Address {
private int hno;
private String streetname;
private String landmark;
public Address() {
	super();
}
public Address(int hno, String streetname, String landmark) {
	super();
	this.hno = hno;
	this.streetname = streetname;
	this.landmark = landmark;
}
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getStreetname() {
	return streetname;
}
public void setStreetname(String streetname) {
	this.streetname = streetname;
}
public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}

}
