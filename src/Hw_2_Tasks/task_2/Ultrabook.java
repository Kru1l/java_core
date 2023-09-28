package Hw_2_Tasks.task_2;

public class Ultrabook extends Laptop {
    private String coldSystem;

    public Ultrabook() {
    }

    public Ultrabook(String processor, String videoCard, double display, boolean dwdRom, String coldSystem) {
        super(processor, videoCard, display, dwdRom);
        this.coldSystem = coldSystem;
    }

    public String getColdSystem() {
        return coldSystem;
    }

    public void setColdSystem(String coldSystem) {
        this.coldSystem = coldSystem;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "coldSystem='" + coldSystem + '\'' +
                "} " + super.toString();
    }
}

