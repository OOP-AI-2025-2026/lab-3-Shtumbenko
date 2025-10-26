package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(10, 20, 15);
        Box cube = new Box(10);
        Box defaultBox = new Box();

        System.out.println("Об'єкт 1: " + box1);
        System.out.println("Об'єкт 2 (куб): " + cube);
        System.out.println("Об'єкт 3 (за замовч.): " + defaultBox);
        System.out.println("------------------------------------");
        System.out.println("Об'єм Об'єкта 1: " + box1.calculateVolume());
        System.out.println("Площа поверхні Об'єкта 1: " + box1.calculateSurfaceArea());
        System.out.println("Об'єм Куба: " + cube.calculateVolume());
        System.out.println("Площа поверхні Куба: " + cube.calculateSurfaceArea());

        Cart cart = new Cart(10);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeById(9L);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        IntStack stack = new IntStack(5);

        System.out.println("Початковий стан: " + stack);
        System.out.println("Чи порожній? " + stack.isEmpty());
        System.out.println("-------------------------");

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Стан: " + stack);

            System.out.println("Верхній елемент (peek): " + stack.peek());

            stack.pop();
            System.out.println("Стан після pop: " + stack);
            System.out.println("Верхній елемент (peek): " + stack.peek());

            stack.push(40);
            stack.push(50);
            stack.push(60);
            System.out.println("Стан: " + stack);
            System.out.println("Чи повний? " + stack.isFull());

            System.out.println("--- Спроба переповнення ---");
            stack.push(70);

        } catch (RuntimeException e) {
            System.err.println("Помилка: " + e.getMessage());
        }

        System.out.println("-------------------------");

        try {
            System.out.println("--- Спроба спустошення ---");
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            System.out.println("Стан: " + stack);
            System.out.println("Чи порожній? " + stack.isEmpty());

            stack.pop();

        } catch (RuntimeException e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}