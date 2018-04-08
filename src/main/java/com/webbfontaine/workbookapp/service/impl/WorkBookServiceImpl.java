package com.webbfontaine.workbookapp.service.impl;


import com.webbfontaine.workbookapp.entity.WorkBook;
import com.webbfontaine.workbookapp.exceptions.DatabaseException;
import com.webbfontaine.workbookapp.exceptions.EntityNotFoundException;
import com.webbfontaine.workbookapp.repository.WorkBookRepository;
import com.webbfontaine.workbookapp.service.WorkBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Nerses
 * Date: 4/6/18.
 * Time: 12:51 PM.
 * To change this template use File | Settings | File Templates.
 */
@Service
public class WorkBookServiceImpl implements WorkBookService {


    WorkBookRepository workBookRepository;
    @Autowired
    public void setWorkBookRepository(WorkBookRepository workBookRepository) {
        this.workBookRepository = workBookRepository;
    }

    @Override
    public void saveWorkBook(WorkBook workBook) throws DatabaseException{
        try {
            workBookRepository.save(workBook);
        } catch (Exception e){
            throw new DatabaseException();
        }

    }

    @Override
    public List<WorkBook> getAllWorkerBook() {
        return workBookRepository.findAll();
    }

    @Override
    public WorkBook getWorkBookById(Integer id) {
        return workBookRepository.findOne(id);
    }

    @Override
    public void updateWorkBook(WorkBook workBook) throws EntityNotFoundException, DatabaseException {
        if (!workBookRepository.exists(workBook.getId())) {
            throw new EntityNotFoundException();
        }
        try {
            workBookRepository.save(workBook);
        } catch (Exception e){
            throw new DatabaseException();
        }

    }

    @Override
    public void deleteWorkBook(Integer id) {
        workBookRepository.delete(id);
    }
}
