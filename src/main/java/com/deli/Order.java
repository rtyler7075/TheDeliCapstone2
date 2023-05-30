package com.deli;

<<<<<<< HEAD
import java.util.ArrayList;

class Order {

    private String customerName;
    private List<Item> items;
    private double totalPrice;
    private static int orderNumber = 1;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.totalPrice = 0;
        orderNumber = orderNumber++;
    }

    public void addItem(Item item) {
        this.items.add(item);
        this.totalPrice += item.getPrice();
    }

    public void removeItem(Item item) {
        this.items.remove(item);
        this.totalPrice -= item.getPrice();
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", items=" + items +
                ", totalPrice=" + totalPrice +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
=======
//class Order {
//
//    private String customerName;
//    private List<Item> items;
//    private double totalPrice;
//    private static int orderNumber = 1;
//
//    public Order(String customerName) {
//        this.customerName = customerName;
//        this.items = new ArrayList<>();
//        this.totalPrice = 0;
//        this.orderNumber = orderNumber++;
//    }
//
//    public void addItem(Item item) {
//        this.items.add(item);
//        this.totalPrice += item.getPrice();
//    }
//
//    public void removeItem(Item item) {
//        this.items.remove(item);
//        this.totalPrice -= item.getPrice();
//    }
//
//    public double getTotalPrice() {
//        return this.totalPrice;
//    }
//
//    public String toString() {
//        return "Order{" +
//                "customerName='" + customerName + '\'' +
//                ", items=" + items +
//                ", totalPrice=" + totalPrice +
//                ", orderNumber=" + orderNumber +
//                '}';
//    }
//}
>>>>>>> 56a589ccf5ff8dea8b6ab8caf09734136a3ee437
