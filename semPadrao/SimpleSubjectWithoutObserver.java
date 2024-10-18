import comPadrao.ConcreteObserver;

public class SimpleSubjectWithoutObserver {
    private String message;
    private ConcreteObserver observer1;
    private ConcreteObserver observer2;

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    public void setObserver1(ConcreteObserver observer) {
        this.observer1 = observer;
    }

    public void setObserver2(ConcreteObserver observer) {
        this.observer2 = observer;
    }

    public void notifyObservers() {
        if (observer1 != null) {
            observer1.update(message);
        }
        if (observer2 != null) {
            observer2.update(message);
        }
    }

    public static void main(String[] args) {
        SimpleSubjectWithoutObserver subject = new SimpleSubjectWithoutObserver();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        subject.setObserver1(observer1);
        subject.setObserver2(observer2);

        subject.setMessage("First Message");
        subject.setMessage("Second Message");
    }
}