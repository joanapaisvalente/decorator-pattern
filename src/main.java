public class main {
    public static void main(String[] args) {

        Beverage firstBeverage = new Expresso();
        printBeverage(firstBeverage);

        Beverage secondBeverage = new DarkRoast();
        secondBeverage = new Mocha(secondBeverage);
        secondBeverage = new Mocha(secondBeverage);
        secondBeverage = new Whip(secondBeverage);
        printBeverage(secondBeverage);

        Beverage thirdBeverage = new HouseBlend();
        thirdBeverage = new Soy(thirdBeverage);
        thirdBeverage = new Mocha(thirdBeverage);
        thirdBeverage = new Whip(thirdBeverage);
        printBeverage(thirdBeverage);
    }

    public static void printBeverage(Beverage beverage) {
        System.out.println(beverage.getDescription() + " which comes to a total of " + beverage.cost() + "$");
    }
}
