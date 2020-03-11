package delegate.simple;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 20:50
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String task) {
        System.out.println("我做编程， 我是员工A, 在做" + task);
    }
}
