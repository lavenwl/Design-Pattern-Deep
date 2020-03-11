package delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 20:49
 */
public class Leader implements IEmployee {

    private Map<String, IEmployee> employee = new HashMap<String, IEmployee>();

    public Leader(){
        employee.put("爬虫", new EmployeeA());
        employee.put("海报", new EmployeeA());
    }

    @Override
    public void doing(String task) {
        if("爬虫".equals(task)) {
            new EmployeeA().doing(task);
        } else if ("海报".equals(task)) {
            new EmployeeB().doing(task);
        }
    }
}
