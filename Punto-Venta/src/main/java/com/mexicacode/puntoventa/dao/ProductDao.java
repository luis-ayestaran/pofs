package com.mexicacode.puntoventa.dao;

import java.util.List;

import javax.persistence.RollbackException;

import org.hibernate.Session;

import com.mexicacode.puntoventa.exceptions.DaoException;
import com.mexicacode.puntoventa.hbm.HibernateSessionFactory;
import com.mexicacode.puntoventa.pojos.Product;


/**
 * Esta clase permite el acceso a datos de la entidad Producto
 * 
 * @author Ricardo Mangoré
 * @version 0.0.1
 */
public class ProductDao extends HibernateSessionFactory implements IDao<Product>{
	
	/**
	 * Busca un producto por su ID
	 * 
	 * @version 0.0.1
	 * @param product
	 * @throws DaoException 
	 */
	public Product find(Product product) throws DaoException {
		Session session = getSessionFactory().openSession();
		String strQuery = "SELECT p.id FROM Product p WHERE p.id = :id";
		Long idProduct = (Long) session.createQuery(strQuery).setParameter("id", product.getId()).uniqueResult();
		if(idProduct == null)
			throw new DaoException("The entity was not foud");
		else
			product.setId(idProduct);
		session.close();
		return product; 
	}

	public List<Product> getAll() {
		Session session = getSessionFactory().openSession();
		List<Product> productList = session.createQuery("from Product").list();
		session.close();
		return productList;
	}

	public void save(Product t) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Long id = (Long) session.save(t);
		t.setId(id);
		try {
			session.getTransaction().commit();
			session.close();
		}catch(IllegalStateException e1) {
			e1.getStackTrace();
			throw e1;
		}catch(RollbackException e2) {
			e2.getStackTrace();
			throw e2;
		}finally{
			session.close();
		}
	}

	public void update(Product t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Product t) {
		// TODO Auto-generated method stub
		
	}
	
}
