package com.mexicacode.puntoventa.dao;

import java.util.List;

import org.hibernate.Session;

import com.mexicacode.puntoventa.exceptions.DaoException;
import com.mexicacode.puntoventa.hbm.HibernateSessionFactory;
import com.mexicacode.puntoventa.pojos.User;

public class UserDao extends HibernateSessionFactory implements IDao<User>{

	public User find(User t) throws DaoException {
		// TODO Auto-generated method stub
		User userReturn = null;
		Session session = getSessionFactory().openSession();
		String queryStr = "FROM User u WHERE u.username = :username AND u.password = :password";
		User user = (User) session.createQuery(queryStr)
		.setParameter("username", t.getUsername())
		.setParameter("password", t.getPassword()).uniqueResult();
		if(user == null)
			throw new DaoException(System.getProperty("exception.1002"));
		else 
			userReturn = user; 
		session.close();
		return userReturn; 
	} 

	public List<User> getAll() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(User t) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	public void update(User t) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	public void delete(User t) throws DaoException {
		// TODO Auto-generated method stub
		
	}

}
