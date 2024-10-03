package abstractFactory.example1.factories;

import abstractFactory.example1.roofs.Roof;
import abstractFactory.example1.roofs.TileRoof;
import abstractFactory.example1.walls.BrickWall;
import abstractFactory.example1.walls.Wall;
import abstractFactory.example1.windows.PlasticFrameWindow;
import abstractFactory.example1.windows.Window;

public class StoneHouseFactory implements HouseFactory {
    @Override
    public Wall createWall() {
        return new BrickWall();
    }

    @Override
    public Roof createRoof() {
        return new TileRoof();
    }

    @Override
    public Window createWindow() {
        return new PlasticFrameWindow();
    }
}
