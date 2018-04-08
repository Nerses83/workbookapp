package com.webbfontaine.workbookapp.controllers;


import com.webbfontaine.workbookapp.entity.WorkBook;
import com.webbfontaine.workbookapp.service.WorkBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Nerses
 * Date: 4/6/18.
 * Time: 2:09 PM.
 * To change this template use File | Settings | File Templates.
 */

@RestController
public class WorkBookRestController {

    @Autowired
    WorkBookService workBookService;

    @GetMapping("/rest/books")
    public List<WorkBook> list(Model model) {
        List<WorkBook> workBookList = workBookService.getAllWorkerBook();
        return workBookList;
    }


    @GetMapping("/rest/books/{id}")
    public WorkBook edit(@PathVariable Integer id, Model model) {
        WorkBook workBook = workBookService.getWorkBookById(id);
        return workBook;
    }
}
