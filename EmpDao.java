package com.src.dao;

import java.util.List;
import java.util.Optional;

import com.src.model.Emp;

public interface EmpDao {

	boolean insert(Emp e);

	boolean delete(int eno);

	List<Emp> getAll();

	Optional<Emp> get(int eno);

	boolean update(int eno, Emp e);
}
