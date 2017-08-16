package com.tms.Dao.impl;


import com.tms.Dao.UserDao;
import com.tms.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class UserDaoImpl implements UserDao {
    public void addAdmin(User user) {
        SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
        org.hibernate.Session s = sf.openSession();
        s.beginTransaction();
        s.save(user);

        s.getTransaction().commit();
        s.close();

    }
}
