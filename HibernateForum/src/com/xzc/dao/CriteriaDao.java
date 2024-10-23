package com.xzc.dao;

import com.xzc.domain.User;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @author xzc
 * @date 2024/10/17 04 48:47
 * @description
 */
public class CriteriaDao {
    //基本查询
    public void search(){
        Session session= HibernateUtils.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        ////////
        //操作 select * from user limit 0,1
        CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
        //criteriaQuery-->查询条件（首先要知道查询什么类型的数据）
        CriteriaQuery<User> criteriaQuery=  criteriaBuilder.createQuery(User.class);
        //
        Root<User> from= criteriaQuery.from(User.class);
        criteriaQuery.select(from);
        //执行查询
        List<User> userList=  session.createQuery(criteriaQuery).getResultList();
        System.out.println(userList);
        //User user=(User) query.uniqueResult();//查询一条数据


        transaction.commit();
        session.close();
    }

    //条件查询
    public void search2(){
        Session session= HibernateUtils.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        ////////
        //操作 select * from user limit 0,1
        CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
        //criteriaQuery-->查询条件（首先要知道查询什么类型的数据）
        CriteriaQuery<User> criteriaQuery=  criteriaBuilder.createQuery(User.class);
        //
        Root<User> from= criteriaQuery.from(User.class);
        criteriaQuery.select(from).where(from.get("id").in("402885c99291c6ca019291c6cb890000"));
        //执行查询
        List<User> userList=  session.createQuery(criteriaQuery).getResultList();
        System.out.println(userList);
        //User user=(User) query.uniqueResult();//查询一条数据


        transaction.commit();
        session.close();
    }

    //查询总数
    public void search3(){
        Session session= HibernateUtils.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        ////////
        //操作 select count(*) from user;
        CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
        //criteriaQuery-->查询条件（首先要知道查询什么类型的数据(数据Integer,Long)
        CriteriaQuery<Long> criteriaQuery=  criteriaBuilder.createQuery(Long.class);
        //
        Root<User> from= criteriaQuery.from(User.class);
        criteriaQuery.select(criteriaBuilder.count(from) );
        //执行查询
        Long count =session.createQuery(criteriaQuery).uniqueResult();
        System.out.println(count);
        //User user=(User) query.uniqueResult();//查询一条数据


        transaction.commit();
        session.close();
    }
    //查询名字带有c的总数
    public void search4(){
        Session session= HibernateUtils.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        ////////
        //操作 select count(*) from user where username like %1%;
        CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
        //criteriaQuery-->查询条件（首先要知道查询什么类型的数据(数据Integer,Long)
        CriteriaQuery<Long> criteriaQuery=  criteriaBuilder.createQuery(Long.class);
        //
        Root<User> from= criteriaQuery.from(User.class);
        criteriaQuery.select(criteriaBuilder.count(from)).where(criteriaBuilder.like(from.get("username"),"%c%"));
        //执行查询
        Long count =session.createQuery(criteriaQuery).uniqueResult();
        System.out.println(count);
        //User user=(User) query.uniqueResult();//查询一条数据
        transaction.commit();
        session.close();
    }
}
