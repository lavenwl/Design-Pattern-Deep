package flyweight.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-07 20:28
 */
public class TicketFactory {
    private static Map<String, ITicket> pool = new ConcurrentHashMap<String, ITicket>();

//    public static ITicket queryTicket(String from, String to) {
//        String key = from + "->" + to;
//
//        if (pool.containsKey(key)) {
//            System.out.println("使用缓存" + key);
//            return pool.get(key);
//        }
//
//        System.out.println("首次查询， 创建对象");
//
//    }
}
