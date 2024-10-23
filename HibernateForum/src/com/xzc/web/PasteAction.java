package com.xzc.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xzc.domain.Paste;
import com.xzc.service.PasteService;

import java.util.List;

/**
 * @author xzc
 * @date 2024/10/13 08 50:35
 * @description
 */
public class PasteAction extends ActionSupport {

    public String getAllPaste() throws Exception {
        PasteService pasteService = new PasteService();
        List<Paste> pasteList = pasteService.getAllPaste();
        ActionContext.getContext().put("pasteList",pasteList);

        return  "index";
    }
}
