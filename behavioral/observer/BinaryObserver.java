public class BinaryObserver extends Observer {

    @Override
    public void update() {
        System.out.println("BINARY : "+Integer.toBinaryString(subject.getState()).toUpperCase());
    }

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attached(this);
    }
}
