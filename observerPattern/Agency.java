package observerPattern;
//concrete subject
import java.util.List;
/*import java.util.concurrent.Flow.Subscriber;*/

public class Agency implements AgencySubject{

    private String news;
    /*private Double stockPrice;*/
    private List<Subscriber> subscriberList ;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    /*public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }*/

    @Override
    public void sub(Subscriber subscriber) {
            subscriberList.add(subscriber);
    }

    @Override
    public void unsub(Subscriber subscriber) {
            subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscriber() {
        String output = new String();
        for(Subscriber subscriber : subscriberList){
            output +=  "Hey, " + subscriber.getSubscriberName() + "!\n";
            output +=  "Did you know that " + news +"?\n\n";
        }
        return output;
    }
}
