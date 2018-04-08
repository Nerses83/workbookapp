package com.webbfontaine.workbookapp.repository;


import com.webbfontaine.workbookapp.entity.WorkBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Nerses
 * Date: 4/6/18.
 * Time: 12:45 PM.
 * To change this template use File | Settings | File Templates.
 */
//@Repository
//public interface WorkBookRepository extends JpaRepository<WorkBook, Integer>{
//
//}

@Repository
public interface WorkBookRepository extends JpaRepository<WorkBook, Integer> {

}

//public interface NoteRepository extends JpaRepository<Note, Integer> {
//
//    List<Note> findAllByOrderByDateAsc();
//    List<Note> findAllByOrderByDateDesc();
//}
