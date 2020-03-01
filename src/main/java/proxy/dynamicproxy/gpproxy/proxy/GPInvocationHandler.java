package proxy.dynamicproxy.gpproxy.proxy;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-01 21:18
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
