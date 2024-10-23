package com.xzc.dao;

import com.xzc.domain.Paste;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.List;

/**
 * @author xzc
 * @date 2024/10/13 08 55:41
 * @description
 */
public class PasteDao {
    public List<Paste> getAllPaste() throws SQLException {
        // Using Hibernate
        // Get configuration information
        Configuration config = new Configuration().configure();
        // Create SessionFactory object
        SessionFactory sessionFactory = config.buildSessionFactory();
        // Get session
        Session session = sessionFactory.getCurrentSession();

        // Open transaction
        Transaction transaction = session.beginTransaction();
        // Store user object

        List<Paste> pasteList = session.createQuery("FROM Paste", Paste.class).list();
        // Commit transaction
        transaction.commit();
        // Close resources
        session.close();
        return pasteList;
    }

    public void addPaste(Paste paste) {
        Session session= HibernateUtils.getCurrentSession();
        session.save(paste);

    }

    public Paste findPasteById(String pasteid) {
        Session session=HibernateUtils.getCurrentSession();
        return  session.get(Paste.class,pasteid);
    }
}
