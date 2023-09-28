package Hw_2_Tasks.task_2;

public class Workstation extends Laptop{
    private String workSpace;

    public Workstation() {}

    public Workstation(String processor, String videoCard, double display, boolean dwdRom, String workSpace) {
        super(processor, videoCard, display, dwdRom);
        this.workSpace = workSpace;
    }

    public String getWorkSpace() {
        return workSpace;
    }

    public void setWorkSpace(String workSpace) {
        this.workSpace = workSpace;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "workSpace='" + workSpace + '\'' +
                "} " + super.toString();
    }
}


