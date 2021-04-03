public class homework7 {
    public static void main(String[] args) throws InterruptedException {
       // Cat c = new Cat("barsik",15);
        Bowl bowl = new Bowl();
        Cat[] cats = {
                new Cat("Rigiy",20),
                new Cat("Pushok",15),
                new Cat("Fat",30)

        };
        cats[0].setHungry_time(10000);
        cats[1].setHungry_time(15000);
        cats[2].setHungry_time(5000);
        long delta,delta1;
        int count=0;
        delta1=System.currentTimeMillis();
            bowl.put(100);
            while (count<=3) {delta=System.currentTimeMillis();
                for (Cat c : cats){
                    if(delta-c.getFullness_time()>c.getHungry_time()&&c.isFullness()) {
                        c.setFullness(false);
                        c.setFullness_time(0);
                        System.out.println(c.getName()+" is hungry again");
                    }


                    c.eat(bowl);


                }

                if(System.currentTimeMillis()-delta1>15000) {bowl.put(100);delta1=System.currentTimeMillis();count++;}
           Thread.sleep(5000);
                System.out.println("прошло время");
            }





    }
}
