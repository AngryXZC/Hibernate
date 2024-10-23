package com.xzc.service;

import com.xzc.dao.AnswerDao;
import com.xzc.domain.Answer;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Transaction;

/**
 * @author xzc
 * @date 2024/10/22 09 01:03
 * @description
 */
public class AnswerService {
    public void addAnswer(Answer answer) {

        Transaction beginTransaction= HibernateUtils.getCurrentSession().beginTransaction();

        AnswerDao answerDao=new AnswerDao();

        try {
            answerDao.addAnswer(answer);
            beginTransaction.commit();
        }catch (Exception e){
            beginTransaction.rollback();
        }

    }
}
