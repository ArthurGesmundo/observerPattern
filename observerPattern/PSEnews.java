package observerPattern;
import java.util.*;
/*import java.util.concurrent.Flow.Subscriber;*/

import observerPattern.Agency;
//client
public class PSEnews {
    public static void main(String[] args){

        Subscriber maria = new Subscriber();
        maria.setSubscriberName("Maria");

        Subscriber juan = new Subscriber();
        juan.setSubscriberName("Juan");

        Subscriber oliver = new Subscriber();
        oliver.setSubscriberName("Oliver");

        //add the clients to the client list
        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(maria);
        subscriberList.add(juan);
        subscriberList.add(oliver);

        //create stock and add the list of clients
        Agency agency = new Agency();
        agency.setNews("Zayn Malik died");
        agency.setSubscriberList(subscriberList);

        //notify the clients
        System.out.println("Breaking News!");
        System.out.println(agency.notifySubscriber());

        // remove Juan, add Jerry and notify updates
        agency.unsub(juan);

        Subscriber jerry = new Subscriber();
        jerry.setSubscriberName("Jerry");
        agency.sub(jerry);

        // here is the updates
        System.out.println("Breaking News!");
        System.out.println(agency.notifySubscriber());
    }
}
