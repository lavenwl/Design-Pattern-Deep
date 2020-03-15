package template.jdbc;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 17:12
 */
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectALl() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
           public Member mapRow(ResultSet rs, int rowNum) throws Exception {
               Member member = new Member();
               member.setUserName(rs.getString("userName"));
               member.setPassword(rs.getString("password"));
               member.setAge(rs.getInt("age"));
               member.setAddr(rs.getString("addr"));
               return member;
            }
         }, null);

    }
}
