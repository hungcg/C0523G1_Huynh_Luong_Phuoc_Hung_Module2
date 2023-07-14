package ss10_dsa.excercise;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {//khởi tạo mảng
        if (capacity > 0) {
            element = new Object[capacity];
            System.out.println("Congratulate to make the Array success with size : " + element.length);
        } else {
            System.out.println("Parameter Input Error");
        }
    }

    public void ensureCapacity(int minCapacity) {//method tăng kích thước mảng
        if (minCapacity >= 0) {
            int newsize = minCapacity + this.element.length;
            element = Arrays.copyOf(element, newsize);
            System.out.println("Increase success Array with size: " + element.length);
        } else {
            System.out.println("minCapacity" + minCapacity);
        }
    }

    public int size() {
        return this.size;
    }

    public int length() {
        return element.length;
    }

    public E get(int index) {//method trả về phần tử tại vị trí index
        return (E) element[index];
    }

    public boolean add(E e) {//method thêm phần tử vào cuối mảng (trong đó e là phần tử muốn thêm vào)
        if (size == element.length) {
            ensureCapacity(1);
        }
        element[size] = e;
        size++;
        return true;
    }

    public void add(E e, int index) {//thêm phần tử tại vị trí index
        if (index > element.length) {
            System.out.println("Index Error");
        } else if (element.length == index + 1) {
            ensureCapacity(1);
        }
        if (element[index] == null) {
            element[index] = e;
            size++;

        } else {
            if (size == element.length) {
                ensureCapacity(1);
            }
            System.arraycopy(element, index, element, index + 1, size - index);
            element[index] = e;
            size++;
        }
    }

    public E remove(int index) {//xóa phần tử tại vị trí index
        if (index < 0 || index > element.length) {
            System.out.println("Error " + index);
        }
        E elements = (E) element[index];
        for (int i = 0; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return elements;
    }

    public MyList<E> clone() {//sao chép mảng
        MyList<E> v = new MyList<>();
        v.element = Arrays.copyOf(element, size);
        v.size = size;
        return v;
    }

    public int indexOf(Object e) {//tìm vị trí phần tử
        for (int i = 0; i < size; i++) {
            if (e.equals(element[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E e) {//tìm phần tử có trong mảng
        return this.indexOf(e) >= 0;
    }
}

