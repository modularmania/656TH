package src.dao.enlisted;

import jakarta.persistence.TypedQuery;
import src.domainobjects.info.Branch;
import src.domainobjects.info.Career;
import src.domainobjects.enlisted.Unit;
import src.domainobjects.enlisted.UnitRank;

import java.util.List;

public class ImplUnitDAO implements UnitDAO {

    @Override
    public List<Unit> findAllOrdered() {
        final String sql = """
            FROM Unit unit
            ORDER BY unit.name ASC""";

        final TypedQuery<Unit> query = entityManager.createQuery(sql, Unit.class);
        return query.getResultList();
    }

    @Override
    public List<Unit> findAllByBranch(Branch branch) {
        final String sql = """
            FROM Unit unit
            WHERE unit.branch = :branch""";

        final TypedQuery<Unit> query = entityManager.createQuery(sql, Unit.class);

        query.setParameter("branch", branch);

        return query.getResultList();
    }

    @Override
    public List<Unit> findAllByCareer(Career career) {
        final String sql = """
            FROM Unit unit
            WHERE unit.career = :career""";

        final TypedQuery<Unit> query = entityManager.createQuery(sql, Unit.class);

        query.setParameter("career", career);

        return query.getResultList();
    }

    @Override
    public List<Unit> findAllByRank(UnitRank rank) {
        final String sql = """
            FROM Unit unit
            WHERE unit.rank = :rank""";

        final TypedQuery<Unit> query = entityManager.createQuery(sql, Unit.class);

        query.setParameter("rank", rank);

        return query.getResultList();
    }

    @Override
    public List<Unit> findAllStaffOrdered() {
        final String sql = """
            FROM Unit unit
            WHERE unit.isStaff = 1
            ORDER BY unit.name ASC""";

        final TypedQuery<Unit> query = entityManager.createQuery(sql, Unit.class);

        return query.getResultList();
    }

    @Override
    public Unit findById(int id) {
        final String sql = """
            FROM Unit unit
            WHERE unit.id = :id""";

        final TypedQuery<Unit> query = entityManager.createQuery(sql, Unit.class);

        query.setParameter("id", id);

        return query.getSingleResult();
    }
}
