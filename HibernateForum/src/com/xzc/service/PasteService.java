package com.xzc.service;

import com.xzc.dao.PasteDao;
import com.xzc.domain.Paste;

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
}
