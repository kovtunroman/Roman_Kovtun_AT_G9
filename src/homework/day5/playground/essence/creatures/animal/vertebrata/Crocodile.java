package homework.day5.playground.essence.creatures.animal.vertebrata;

import homework.day5.playground.essence.creatures.Crawlable;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int weight, String name){
        super(weight, name);
    }
    public Crocodile(String name, int weight, int mass) {
        super(name, weight, mass);
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units", getClass().getSimpleName(), getName(), direction, distance).println();
        System.out.println("wr-wr-wrr-r..");
    }
}
