package observerPattern;
//concrete subject
import java.util.List;

public class Stock implements StockSubject{

    private String stockName;
    private Double stockPrice;
    private List<Client> clientList ;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public void attach(Client client) {
            clientList.add(client);
    }

    @Override
    public void detach(Client client) {
          clientList.remove(client);
    }

    @Override
    public String notifyClient() {
        String output = new String();
        for(Client client : clientList){
            output +=  "Hey, " + client.getClientName() + "!\n";
            output += stockName + " has a current price of " + stockPrice +"!\n\n";
        }
        return output;
    }
}
