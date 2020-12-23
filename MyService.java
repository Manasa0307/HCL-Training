package com.src;

public class MyService {
MyDao dao;

public MyService() {
	super();
}

public MyService(MyDao dao) {
	super();
	this.dao = dao;
}

public MyDao getDao() {
	return dao;
}

public void setDao(MyDao dao) {
	this.dao = dao;
}
public void display()
{
	dao.display();
}
}
