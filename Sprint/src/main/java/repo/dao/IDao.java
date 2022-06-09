package repo.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IDao<T> {
    /**
     * add vao db
     * @param item
     */
    void create(T item) throws SQLException;

    /**
     * lay ra toan bo phan tu trong db
     * @return
     */
    Optional<T> getAll();

    /**
     * cap nhat 1 phan tu trong db
     * @param item
     */
    void update(T item);

    /**
     * xoa 1 phan tu trong db
     * @param item
     */
    void delete(T item);
}
