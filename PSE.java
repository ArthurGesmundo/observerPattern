package observerPattern;
import java.util.*;
//client
public class PSE {
    public static void main(String[] args){

        Client maria = new Client();
        maria.setClientName("Maria");

        Client juan = new Client();
        juan.setClientName("Juan");

        Client oliver = new Client();
        oliver.setClientName("Oliver");

        //add the clients to the client list
        List<Client> clientList = new ArrayList<>();
        clientList.add(maria);
        clientList.add(juan);
        clientList.add(oliver);

        //create stock and add the list of clients
        Stock stock = new Stock();
        stock.setStockName("Jollibee");
        stock.setStockPrice(237.20);
        stock.setClientList(clientList);

        //notify the clients
        System.out.println("Updates!");
        System.out.println(stock.notifyClient());

        // remove Juan, add Jerry and notify updates
        stock.detach(juan);

        Client jerry = new Client();
        jerry.setClientName("Jerry");
        stock.attach(jerry);

        // here is the updates
        System.out.println("Updates recently!");
        System.out.println(stock.notifyClient());
    }
}
