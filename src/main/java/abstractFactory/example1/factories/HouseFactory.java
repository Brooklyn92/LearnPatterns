package abstractFactory.example1.factories;

import abstractFactory.example1.roofs.Roof;
import abstractFactory.example1.walls.Wall;
import abstractFactory.example1.windows.Window;

public interface HouseFactory {
    Wall createWall();
    Roof createRoof();

    Window createWindow();
}
