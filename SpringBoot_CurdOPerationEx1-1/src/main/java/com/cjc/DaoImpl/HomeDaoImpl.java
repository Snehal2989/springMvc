package com.cjc.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.Dao.HomeDaoI;
import com.cjc.model.User;

@Repository
public class HomeDaoImpl implements HomeDaoI {

	@Autowired
	SessionFactory sf;

	@Override
	public void saveUser(User u) {

		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(u);
		tx.commit();
		ses.close();
	}

	@Override
	public int loginCheck(String name, String pass) {
		Session ses = sf.openSession();
		System.out.println("Checking the name and password of user");
		Query query = ses.createQuery("From User where name=:nm and pass =:ps");
		query.setParameter("nm", name);
		query.setParameter("ps", pass);
		System.out.println(query);
		System.out.println("Getting list of all user");
		List<User> list = query.getResultList();
		if (list.isEmpty()) {
			System.out.println("User is not found");

			return 0;
		}
		return 1;

	}

	@Override
	public List<User> dispalyAll() {
		Session ses = sf.openSession();
		System.out.println("In dispaly all method");
		Query<User> query = ses.createQuery("From User");
		List<User> list = query.getResultList();

		return list;
	}

	@Override
	public int deleteUser(int uid) {
		System.out.println(":Lets delete the  user");
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		User user1 = ses.get(User.class, uid);
		if(user1!=null)
		{
		   ses.delete(user1);
		   tx.commit();
		   return 1;
		}
		return 0;
	}

	@Override
	public User editUser(int uid) {
		Session ses = sf.openSession();
		
		return ses.get(User.class, uid);
		 
	}

	@Override
	public void updateUser(User u) {
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.saveOrUpdate(u);
		tx.commit();
		
	}

}
