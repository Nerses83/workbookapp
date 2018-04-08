package com.webbfontaine.workbookapp.service;



import com.webbfontaine.workbookapp.entity.WorkBook;
import com.webbfontaine.workbookapp.exceptions.DatabaseException;
import com.webbfontaine.workbookapp.exceptions.EntityNotFoundException;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Nerses
 * Date: 4/6/18.
 * Time: 12:50 PM.
 * To change this template use File | Settings | File Templates.
 */
public interface WorkBookService {
    void saveWorkBook(WorkBook workBook) throws DatabaseException;
    List<WorkBook> getAllWorkerBook();

    WorkBook getWorkBookById(Integer id);
    void updateWorkBook(WorkBook workBook) throws EntityNotFoundException, DatabaseException;
    void deleteWorkBook(Integer id);
}
