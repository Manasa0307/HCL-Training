package com.src;

public class Mycontroller {
MyService service;

public Mycontroller() {
	super();
}

public Mycontroller(MyService service) {
	super();
	this.service = service;
}

public MyService getService() {
	return service;
}

public void setService(MyService service) {
	this.service = service;
}
public void display()
{
	service.display();
}
}
