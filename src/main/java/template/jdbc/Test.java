package template.jdbc;

import java.util.List;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-14 17:21
 */
public class Test {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao(null);
        List<?> result = dao.selectALl();
        System.out.println(result);
    }
}
