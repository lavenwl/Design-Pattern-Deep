package flyweight.ticket;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-07 20:31
 */
public class Test {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京西", "长沙");
        ticket.showInfo("硬座");

    }
}
