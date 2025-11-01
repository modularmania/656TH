package src.dao.enlisted;

import jakarta.persistence.TypedQuery;
import src.domainobjects.info.Branch;
import src.domainobjects.info.Career;
import src.domainobjects.enlisted.MWD;
import src.domainobjects.enlisted.MWDRank;

import java.util.List;

public class ImplMWDDAO implements MWDDAO {

    @Override
    public List<MWD> findAllOrdered() {
        final String sql = """
            FROM MWD mwd
            ORDER BY mwd.name ASC""";

        final TypedQuery<MWD> query = entityManager.createQuery(sql, MWD.class);
        return query.getResultList();
    }

    @Override
    public List<MWD> findAllByBranch(Branch branch) {
        final String sql = """
            FROM MWD mwd
            WHERE mwd.branch = :branch""";

        final TypedQuery<MWD> query = entityManager.createQuery(sql, MWD.class);

        query.setParameter("branch", branch);

        return query.getResultList();
    }

    @Override
    public List<MWD> findAllByCareer(Career career) {
        final String sql = """
            FROM MWD mwd
            WHERE mwd.career = :career""";

        final TypedQuery<MWD> query = entityManager.createQuery(sql, MWD.class);

        query.setParameter("career", career);

        return query.getResultList();
    }

    @Override
    public List<MWD> findAllByRank(MWDRank rank) {
        final String sql = """
            FROM MWD mwd
            WHERE mwd.rank = :rank""";

        final TypedQuery<MWD> query = entityManager.createQuery(sql, MWD.class);

        query.setParameter("rank", rank);

        return query.getResultList();
    }

    @Override
    public List<MWD> findAllStaffOrdered() {
        final String sql = """
            FROM MWD mwd
            WHERE mwd.isStaff = 1
            ORDER BY mwd.name ASC""";

        final TypedQuery<MWD> query = entityManager.createQuery(sql, MWD.class);

        return query.getResultList();
    }

    @Override
    public MWD findById(int id) {
        final String sql = """
            FROM MWD mwd
            WHERE mwd.id = :id""";

        final TypedQuery<MWD> query = entityManager.createQuery(sql, MWD.class);

        query.setParameter("id", id);

        return query.getSingleResult();
    }
}
