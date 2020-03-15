package delegate.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 21:10
 */
public class DispatcherServlet extends HttpServlet {
    private Map<String, Method> handlerMapping = new HashMap<String, Method>();

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doDispatch(req, res);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse res) {
        String url = req.getRequestURI();
        Method method = handlerMapping.get(url);
//        Object invoke = method.invoke();
    }


    @Override
    public void init() throws ServletException {
        try {
            handlerMapping.put("/web/getMemberById.json", MemberController.class.getMethod("getMemberById", new Class[]{String.class}));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
