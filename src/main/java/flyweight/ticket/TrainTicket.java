package flyweight.ticket;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-07 20:26
 */
public class TrainTicket implements ITicket {

    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
//        this.price = new Integer();
    }
}
