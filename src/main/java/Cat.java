public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    private long fullness_time;
    private long hungry_time;



    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness=false;


    }

    public long getHungry_time() {
        return hungry_time;
    }

    public void setHungry_time(long hungry_time) {
        this.hungry_time = hungry_time;
    }

    public void eat (Bowl bowl){
        if (this.isFullness()&&System.currentTimeMillis()-this.getFullness_time()>hungry_time) {
            this.setFullness(false);
            this.setFullness_time(0);
            System.out.println(this.getName()+" is hungry again");
        }
        else if (this.isFullness()) {
            System.out.printf("Сat %s is not hungry\n",this.name);
        }

        if(bowl.getFoodAmount()>=appetite&&!this.isFullness()) {
            bowl.decrease(appetite);
            this.setFullness(true);
            this.setFullness_time(System.currentTimeMillis());
            System.out.printf("Cat %s ate some food\n", this.name);
            System.out.printf("Cat %s is Fullness(объелся)\n",this.name);
        }
        else if (!this.isFullness()) System.out.printf("bowl for %s appetite doesn't have the right amount of food\n",this.name);
        }

    public long getFullness_time() {
        return fullness_time;
    }

    public void setFullness_time(long fullness_time) {
        this.fullness_time = fullness_time;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }
}
