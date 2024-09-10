package factoryMethod.example1;

import factoryMethod.example1.windows.PlasticFrameWindow;
import factoryMethod.example1.windows.Window;

public class CompanyA extends Supplier {

    @Override
    public Window createWindow() {
        return new PlasticFrameWindow();
    }
}
