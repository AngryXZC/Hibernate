package com.xzc.dao;

import com.xzc.domain.User;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

/**
 * @author xzc
 * @date 2024/10/17 05 27:04
 * @description
 */
public class SQLDao {
    //sql基本查询
    public void fun(){
        Session session=HibernateUtils.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        ////
        String sql="select * from user";
        //创建sql查询对象
        NativeQuery query=session.createSQLQuery(sql);
        //封装数据
        query.addEntity(User.class);

        List<User> list=query.list();

        System.out.println(list);

        transaction.commit();
        session.close();
    }
    //sql条件查询
    public void fun1(){
        Session session=HibernateUtils.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        ////
        String sql="select * from user where name=?0";
        //创建sql查询对象
        NativeQuery query=session.createSQLQuery(sql);

        //封装数据
        query.setParameter(1,"xzc");
        query.addEntity(User.class);

        User user=(User) query.uniqueResult();

        System.out.println(user);

        transaction.commit();
        session.close();
    }

    public void fun3(){
        Session session=HibernateUtils.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        ////
        String sql="select * from user limit ?,?";
        //创建sql查询对象
        NativeQuery query=session.createSQLQuery(sql);

        //封装数据
        query.setParameter(1,0);
        query.setParameter(2,2);
        //自动封装为User对象

        query.addEntity(User.class);

        List<User> user=query.list();

        System.out.println(user);

        transaction.commit();
        session.close();
    }
}
