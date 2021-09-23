package com.cjc.DaoImpl;



import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.DaoI.DaoI;
import com.cjc.model.User;

@Repository
public class DaoImpl implements DaoI{
	
	@Autowired
	SessionFactory sf;

	@Override
	public void saveUser(User u) {

    Session ses=sf.openSession();
    Transaction tx = ses.beginTransaction();
    ses.save(u);
    tx.commit();
    ses.close();
	}

	@Override
	public int loginChcek(String name, String pass) {
		
	
		Session ses=sf.openSession();
		System.out.println("Checking the name and password of user");
		Query query = ses.createQuery("From User where name=:nm and pass =:ps");
		query.setParameter("nm",name);
		query.setParameter("ps",pass);
		System.out.println(query);
		System.out.println("Getting list of all user");
		List<User> list = query.getResultList();
		if(list.isEmpty())
		{
			System.out.println("User is not found");
			
			return 0;
		}
		return 1;
		
	}

	@Override
	public List<User> displayAll() {
		Session ses=sf.openSession();
		System.out.println("In dispaly all method");
		Query<User> query = ses.createQuery("From User");
		List<User> list = query.getResultList();
		
		return list;
	}

}
