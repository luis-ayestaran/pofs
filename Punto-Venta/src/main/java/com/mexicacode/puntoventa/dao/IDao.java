package com.mexicacode.puntoventa.dao;

import java.util.List;

import com.mexicacode.puntoventa.exceptions.DaoException;

public interface IDao<T>{
	
	T find(T t) throws DaoException;
	
	List<T> getAll() throws DaoException;
	
	void save(T t) throws DaoException;
	
	void update(T t) throws DaoException;
	
	void delete(T t) throws DaoException;
	
}
