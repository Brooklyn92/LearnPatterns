package factoryMethod.example9;

public abstract class ItemGenerator {

    public void openReward() {
        // ... other code ...
        GameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract GameItem createItem();
}
