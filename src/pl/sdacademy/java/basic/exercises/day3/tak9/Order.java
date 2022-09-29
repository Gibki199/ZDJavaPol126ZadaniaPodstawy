package pl.sdacademy.java.basic.exercises.day3.tak9;

class Order {
    private int currentOrderItemCounter = 0;
    private final int maxOrderItem;
    private final OrderItem[] orderItems;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
    }

    public boolean addItem(OrderItem orderItem) {
        if (!orderItem.isCorrect()) {
            System.out.println("Item is incorrect");
            return false;
        }
        if (currentOrderItemCounter >= maxOrderItem) {
            System.out.println("Order is full");
            return false;
        }
        orderItems[currentOrderItemCounter] = orderItem;
        currentOrderItemCounter++;
        return true;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (OrderItem element : orderItems) {
            totalAmount += element.getAmmount();
        }
        return totalAmount;
    }

    public int getItemsCount() {
        int total = 0;
        for (OrderItem element : orderItems) {
            if (element != null) {
                total += element.getQuantity();
            }
        }
        return total;
    }

    public void print() {
        for (OrderItem element : orderItems) {
            if (element != null) {
                element.print();
            }
        }
        System.out.println("Total amount: " + getTotalAmount());
        System.out.println("Count: " + getItemsCount());
    }
}
