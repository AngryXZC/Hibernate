package com.xzc.dao;

import com.xzc.domain.User;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.sql.SQLException;

/**
 * @author xzc
 * @date 2024/10/11 09 38:55
 * @description
 */
public class UserDao {
    public User findUser(User user) throws SQLException {

        //获取session对象
        Session session=HibernateUtils.getCurrentSession();


        String sql="select * from user where username=? and password=?";

        //查询user对象


        NativeQuery query=session.createSQLQuery(sql);
        query.setParameter(1,user.getUsername());
        query.setParameter(2,user.getPassword());
        query.addEntity(User.class);

        User foundUser=(User) query.uniqueResult();
        return foundUser;
    }
    public void addUser(User user) throws SQLException {

        //获取session
        Session session= HibernateUtils.getSession();

        //打开事务
        Transaction transaction = session.beginTransaction();
        //存储user对象
        session.save(user);
        //提交事务
        transaction.commit();
        //关闭资源
        session.close();
    }

    public void deleteUser(){
        Configuration configuration=new Configuration().configure();
        SessionFactory factory=configuration.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        //得到id为402885c99291c6ca019291c6cb890000
        User user= session.get(User.class,"402885c99291c6ca019291c6cb890000");
        session.delete(user);
        transaction.commit();
        session.close();
    }
    public void changeUser(){
        Configuration config=new Configuration().configure();
        SessionFactory sessionFactory= config.buildSessionFactory();;
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        User user= session.get(User.class,"402885c99291c6ca019291c6cb890000");
        user.setName("test");
        session.update(user);
        transaction.commit();
        session.close();
    }
}

