package proxy.dynamicproxy.jdkproxy;

import proxy.staticproxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 20:38
 */
public class Meipo implements InvocationHandler {

    private IPerson target;

    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();

        return new Proxy.newProxyInstance(clazz.getClassLoader(), [], clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target.args);
        after();
    }

    private void after() {
        System.out.println("开始后");
    }

    private void before() {
        System.out.println("开始前");
    }
}
