public class Bowl {
   private int foodAmount;

    public void put(int amount) {
        foodAmount +=amount;
        System.out.printf("Food put for %d, and %d left\n", amount,this.foodAmount);
    }


    public void decrease(int amount) {
        this.foodAmount -= amount;
        System.out.printf("Food decreased for %d, and %d left\n", amount,this.foodAmount);
    }

//    public void putFoodInto(int amount){
//        foodAmount +=amount;
//        System.out.printf("Food put for %d, and %d left\n", amount,foodAmount);
//    }
//
//    public void decreaseFood(int amount) {
//        this.foodAmount -= amount;
//        System.out.printf("Food decreased for %d, and %d left\n", amount,foodAmount);
//    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
