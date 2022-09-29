package pl.sdacademy.java.basic.exercises.day3.tak9;

class main {
    public static void main(String[] args) {
        OrderItem cukier = new OrderItem("Cukier", 3, 4);
        OrderItem chleb = new OrderItem("Chleb", 1, 3.5);

        Order order = new Order(2);
        order.addItem(cukier);
        order.addItem(chleb);
        order.print();

//        cukier.print();
    }
}
