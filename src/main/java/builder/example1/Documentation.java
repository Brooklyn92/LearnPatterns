package builder.example1;

public class Documentation {
    private boolean base = false;
    private boolean building = false;
    private boolean serviceLines = false;
    private boolean finish = false;

    public boolean isBase() {
        return base;
    }
    public void setBase(boolean base) {
        this.base = base;
    }

    public boolean isBuilding() {
        return building;
    }

    public void setBuilding(boolean building) {
        this.building = building;
    }

    public boolean isServiceLines() {
        return serviceLines;
    }

    public void setServiceLines(boolean serviceLines) {
        this.serviceLines = serviceLines;
    }

    public boolean isFinish() {
        return finish;
    }
    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
