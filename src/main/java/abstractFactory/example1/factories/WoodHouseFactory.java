package abstractFactory.example1.factories;

import abstractFactory.example1.roofs.Roof;
import abstractFactory.example1.roofs.WoodRoof;
import abstractFactory.example1.walls.Wall;
import abstractFactory.example1.walls.WoodWall;
import abstractFactory.example1.windows.Window;
import abstractFactory.example1.windows.WoodFrameWindow;

public class WoodHouseFactory implements HouseFactory {
    @Override
    public Wall createWall() {
        return new WoodWall();
    }

    @Override
    public Roof createRoof() {
        return new WoodRoof();
    }

    @Override
    public Window createWindow() {
        return new WoodFrameWindow();
    }
}
