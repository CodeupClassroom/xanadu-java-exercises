package oopLecture;

public class RestaurantDish {

//    public int costInCents;
//    public String nameOfDish;
//    public boolean wouldRecommend;
//    public void eat() {
//        System.out.println("Nom nom nom!");
//    }
//
    public static void main(String[] args) {
//        RestaurantDish dish = new RestaurantDish();
//        dish.costInCents = 3000;
//        dish.nameOfDish = "Pasta";
//        dish.wouldRecommend = true;
//        dish.eat();

        // refactor

        RestaurantDish rd = new RestaurantDish(3000, "Pasta", true);
        System.out.println(rd.getCostInCents());
        rd.setCostInCents(4000);
        System.out.println(rd.getCostInCents());
    }

    // refactor

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void eat() {
        System.out.println("Nom nom nom!");
    }

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}
