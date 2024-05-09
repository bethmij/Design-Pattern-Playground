public class HexaObserver extends Observer {

    @Override
    public void update() {
        System.out.println("HEXA : "+Integer.toHexString(subject.getState()).toUpperCase());
    }

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attached(this);
    }
}
