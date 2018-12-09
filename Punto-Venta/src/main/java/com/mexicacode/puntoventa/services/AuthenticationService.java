package com.mexicacode.puntoventa.services;

import com.mexicacode.puntoventa.dao.UserDao;
import com.mexicacode.puntoventa.exceptions.DaoException;
import com.mexicacode.puntoventa.pojos.User;

public class AuthenticationService {
	
	private User user;
	private UserDao userDao;
	
	public AuthenticationService() {
		this.userDao = new UserDao();
	}
	
	public Boolean isValidUser(User user) {
		Boolean valueReturn = false;
		User userParam;
		try {
			userParam = userDao.find(user);
			if(userParam != null)
				valueReturn = true;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return valueReturn;
	}
}
