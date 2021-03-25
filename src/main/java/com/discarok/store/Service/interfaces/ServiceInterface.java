package com.discarok.store.Service.interfaces;

import java.util.List;

public interface ServiceInterface<T,Id>{
	public T findById(Id id);

	public List<T> findAll();

	public T save(T t);

	public void deleteById(Id id);
}
