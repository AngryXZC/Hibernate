package com.xzc.dao;

import com.xzc.domain.User;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


/**
 * @author xzc
 * @date 2024/10/17 03 30:03
 * @description
 */
public class HQLDao {
    //基本查询
    public void search(){
        Session session= HibernateUtils.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        ////////
        //操作
        String hql="from com.xzc.domain.User";
        Query query= session.createQuery(hql);

        List<User> list=query.list(); //查询多条数据
        //User user=(User) query.uniqueResult();//查询一条数据

        System.out.println(list);
        transaction.commit();
        session.close();
    }
}
