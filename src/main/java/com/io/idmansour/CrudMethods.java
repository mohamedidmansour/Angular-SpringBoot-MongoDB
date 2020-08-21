package com.io.idmansour;

import java.util.List;

public interface CrudMethods<T> {
	public T save(T obj);
	public List<T> findAll();
	public void delete(String id);
}
