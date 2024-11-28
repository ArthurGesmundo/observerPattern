package observerPattern;
//subject
public interface StockSubject {
  public void attach(Client client);
  public void detach(Client client);
  public String notifyClient();

}
