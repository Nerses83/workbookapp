package com.webbfontaine.workbookapp.service;

;

import com.webbfontaine.workbookapp.entity.WorkBook;
import com.webbfontaine.workbookapp.entity.WorkPlace;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Nerses
 * Date: 4/6/18.
 * Time: 12:50 PM.
 * To change this template use File | Settings | File Templates.
 */
public interface WorkPlaceService {
    void saveWorkPlace(WorkPlace workPlace);
    void deleteWorkPlace(Integer id);
    void updateIsCurrent(WorkBook workbook);
    void test();

    WorkPlace getWorkPlaceById(Integer id);
    void updateWorkPlace(Set<WorkPlace> workPlaces, WorkPlace workPlace);
}
