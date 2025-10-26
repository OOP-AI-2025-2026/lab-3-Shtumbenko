package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    Cart(int capacity) {
        this.contents = new Item[capacity];
        this.index = 0;
    }

    public void removeById(long id) {

        if (index == 0)
            return;

        int foundItemIndex = findItemIndexById(id);

        if (foundItemIndex == -1)
            return;

        if (foundItemIndex == index - 1) {
            contents[index - 1] = null;
            index--;
            return;
        }

        shiftArray(foundItemIndex);
    }

    private void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index-1] = null;
        index--;
    }

    private int findItemIndexById(long id) {
        for (int i = 0; i < index; i++) {
            if (contents[i].getId() == id) {
                return i;
            }
        }

        return -1;
    }

    void add(Item item) {
        if (isCartFull())
            return;

        contents[index] = item;
        index++;
    }

    public boolean isCartFull() {
        return index == contents.length;
    }

    public Item[] getContents() {
        return contents;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        Item[] actualItems = Arrays.copyOf(contents, index);
        return "Cart{" +
                "contents=" + Arrays.toString(actualItems) +
                '}' + "\n";
    }
}
