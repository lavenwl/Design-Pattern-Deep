package proxy.dynamicproxy.gpproxy.client;

import proxy.dynamicproxy.IPerson;
import proxy.dynamicproxy.gpproxy.proxy.GPClassLoader;
import proxy.dynamicproxy.gpproxy.proxy.GPInvocationHandler;
import proxy.dynamicproxy.gpproxy.proxy.GPProxy;

import java.lang.reflect.Method;

public class Meipo implements GPInvocationHandler {

    private Object target;

    public Object getInstance(IPerson target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target, args);
        after();
        return null;
    }

    private void after() {
        System.out.println("之后");
    }

    private void before() {
        System.out.println("之前");
    }
}
