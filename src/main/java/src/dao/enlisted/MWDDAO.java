package src.dao.enlisted;

import src.domainobjects.info.Branch;
import src.domainobjects.info.Career;
import src.domainobjects.enlisted.MWD;
import src.domainobjects.enlisted.MWDRank;

import java.util.List;

public interface MWDDAO {

    List<MWD> findAllOrdered();

    List<MWD> findAllByBranch(Branch branch);

    List<MWD> findAllByCareer(Career career);

    List<MWD> findAllByRank(MWDRank rank);

    List<MWD> findAllStaffOrdered();

    MWD findById(int id);

}
