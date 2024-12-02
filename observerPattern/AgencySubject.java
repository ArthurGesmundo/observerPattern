package observerPattern;

/*import java.util.concurrent.Flow.Subscriber;*/

//subject
public interface AgencySubject {
  public void sub(Subscriber subscriber);
  public void unsub(Subscriber subscriber);
  public String notifySubscriber();

}
