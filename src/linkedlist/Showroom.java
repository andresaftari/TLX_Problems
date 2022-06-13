package linkedlist;

import java.util.LinkedList;

// generic
public class Showroom<T> {
    public LinkedList<T> listCar = new LinkedList<>();

    public void addFirstCar(T car) {
        listCar.addFirst(car); // ini single & double
    }

    public void addLastCar(T car) {
        listCar.addLast(car); // ini single & double
    }

    public void removeFirstCar() {
        listCar.removeFirst(); // ini single & double
    }

    public void removeLastCar() {
        listCar.removeLast(); // ini single & double
    }

    public void addCar(T car) {
        listCar.add(2, car); // ini double
    }

    public void removeCar() {
        listCar.remove(2); // ini double
    }
}
