package template.jdbc;

import java.sql.ResultSet;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 16:43
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
