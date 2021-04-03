public class homework7 {
    public static void main(String[] args) throws InterruptedException {
       // Cat c = new Cat("barsik",15);
        Bowl bowl = new Bowl();
        Cat[] cats = {
                new Cat("Rigiy",20),
                new Cat("Pushok",15),
                new Cat("Fat",30)

        };
        cats[0].setHungry_time(18000); //устанавливаю время через которое кот Rigiy снова голодный...
        cats[1].setHungry_time(15000); //устанавливаю время через которое кот Pushok снова голодный...
        cats[2].setHungry_time(5000);  //устанавливаю время через которое кот Fat снова голодный...
        long delta,delta1;
        int count=0;
        delta1=System.currentTimeMillis();
            bowl.put(100);
            while (count<=3) {delta=System.currentTimeMillis();
                for (Cat c : cats){
//                    if(delta-c.getFullness_time()>c.getHungry_time()&&c.isFullness()) {
//                        c.setFullness(false);
//
//                    }


                    c.eat(bowl);


                }

                if(System.currentTimeMillis()-delta1>15000) {bowl.put(100);delta1=System.currentTimeMillis();count++;}
           Thread.sleep(5000);
                System.out.println("прошло время");
            }





    }
}
