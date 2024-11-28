package observerPattern;
//concreteO
public class Client implements ClientObserver{

    private String clientName;


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void updateStock(Stock stock) {
        

    }
}
