public class Main {

    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

        /*kitchen.getDisWasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);

        kitchen.getDisWasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();*/

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();


    }
}
