package com.webbfontaine.workbookapp.repository;


import com.webbfontaine.workbookapp.entity.WorkPlace;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: Nerses
 * Date: 4/6/18.
 * Time: 12:45 PM.
 * To change this template use File | Settings | File Templates.
 */
//@Repository
public interface WorkPlaceRepository extends JpaRepository<WorkPlace, Integer> {

//    @Modifying(clearAutomatically = true)
//    @Query("UPDATE cu c SET c.address = :address WHERE c.id = :companyId")
//    int updateAddress(@Param("companyId") int companyId, @Param("address") String address);

//    @Modifying
//    @Query("Update WorkPlace t SET t.current=:isCurrent WHERE t.id=:id")
//    int updateIsCurrent(@Param("isCurrent") boolean isCurrent, @Param("id") Integer id);

//
//    @Transactional
//    @Modifying
//    @Query("UPDATE WorkPlace c SET c.current = :current WHERE c.workBook = :workBook")
//    int updateCurrent(@Param("workBook") WorkBook workBook, @Param("current") boolean current);
//

}
