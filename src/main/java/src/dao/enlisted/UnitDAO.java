package src.dao.enlisted;

import src.domainobjects.info.Branch;
import src.domainobjects.info.Career;
import src.domainobjects.enlisted.Unit;
import src.domainobjects.enlisted.UnitRank;

import java.util.List;

public interface UnitDAO {

    List<Unit> findAllOrdered();

    List<Unit> findAllByBranch(Branch branch);

    List<Unit> findAllByCareer(Career career);

    List<Unit> findAllByRank(UnitRank rank);

    List<Unit> findAllStaffOrdered();

    Unit findById(int id);

}
