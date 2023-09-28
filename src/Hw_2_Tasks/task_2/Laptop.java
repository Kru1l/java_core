package Hw_2_Tasks.task_2;

public class Laptop extends PC{

    private double display;
    private boolean dwdRom;

    public Laptop() {
    }

    public Laptop(String processor, String videoCard, double display, boolean dwdRom) {
        super(processor, videoCard);
        this.display = display;
        this.dwdRom = dwdRom;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public boolean isDwdRom() {
        return dwdRom;
    }

    public void setDwdRom(boolean dwdRom) {
        this.dwdRom = dwdRom;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "display=" + display +
                ", dwdRom=" + dwdRom +
                "} " + super.toString();
    }
}
