package factoryMethod.example1;

import factoryMethod.example1.windows.Window;
import factoryMethod.example1.windows.WoodFrameWindow;

public class CompanyB extends Supplier {

    @Override
    public Window createWindow() {
        return new WoodFrameWindow();
    }
}
