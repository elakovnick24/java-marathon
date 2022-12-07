package day11.task1;

public class Courier implements Worker {
    
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse = new Warehouse();
    private int counterBonus = 0;
    private int counterDelivery = 0;

    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }
    public boolean isPayed() {
        return isPayed;
    }
    
    public Courier(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }
    
    @Override
    public String toString() {
        return "Courier " + "\n" +
                "---> Salary = " + salary + "\n" + 
                "---> BONUS is payed? = " + isPayed;
    }

    @Override
    public void doWork() {
        salary = salary + 80;
        ++counterDelivery;
        warehouse.setCountDeliveredOrders(counterDelivery);  
    }

    @Override
    public void bonus() {
        if(counterBonus >= 1) {
            System.out.println("Bonus was payed alredy");
        } else {
            if(warehouse.getCountDeliveredOrders() < 10000) {
                System.out.println("Bonus unavailable");
            }
    
            if(warehouse.getCountDeliveredOrders() == 10000) {
                salary += 70.000;
                isPayed = true;
                counterBonus++;
            }
        }
    }

}
