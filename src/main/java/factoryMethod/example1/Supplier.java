package factoryMethod.example1;

import factoryMethod.example1.windows.Window;

public class Supplier {
    public Window createWindow() {
        return new Window() {
            @Override
            public String toString() {
                return "Окно";
            }
            @Override
            public void open() {
                System.out.println("Открыли окно");
            }
        };
    }

    protected void onInstall(Window window) {
        Program.windows.add(window);
    }

    public Window install() {
        Window window = createWindow();
        System.out.printf("Установлено %s\n", window);
        onInstall(window);
        return window;
    }
}
