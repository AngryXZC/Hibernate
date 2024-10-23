package com.xzc.service;

import com.xzc.dao.PasteDao;
import com.xzc.domain.Paste;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;

/**
 * @author xzc
 * @date 2024/10/13 08 53:11
 * @description
 */
public class PasteService {
    public List<Paste> getAllPaste() throws SQLException {
        PasteDao pasteDao = new PasteDao();
        return pasteDao.getAllPaste();
    }

    public void addPaste(Paste paste) {
        PasteDao pasteDao=new PasteDao();
        Transaction transaction= HibernateUtils.getCurrentSession().beginTransaction();
        try
        {
            pasteDao.addPaste(paste);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }
    }

    public Paste findPasteById(String pasteid) {
        PasteDao pasteDao=new PasteDao();
        Transaction beginTransaction=HibernateUtils.getCurrentSession().beginTransaction();
        Paste paste=null;
        try {
            paste=pasteDao.findPasteById(pasteid);
            beginTransaction.commit();
        }catch (Exception e){
            beginTransaction.rollback();
        }

        return paste;
    }
}
