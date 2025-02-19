package decorator.example6;

public class BakingProgram {
    public static void main(String[] args) {
//        Baking baking = new Cake();
//        baking.about();
//        baking = new Cream(baking);
//        baking.about();
//        baking = new Chocolate(baking);
//        baking.about();
        Baking baking = new Cream(new Chocolate(new Cake()));
        baking.about();
    }
}
