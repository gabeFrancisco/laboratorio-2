package listas.estaticas;

import listas.exceptions.OverflowException;
import listas.exceptions.UnderflowException;

public class StaticList<E> implements List<E> {
    protected E[] elements;
    int numElements;

    public StaticList(int maxSize) {
        this.elements = (E[]) new Object[maxSize];
        numElements = 0;
    }

    @Override
    public int numElements() {
        return numElements;
    }

    @Override
    public boolean isEmpty() {
        if (numElements == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (numElements == elements.length) {
            return true;
        }
        return false;
    }

    @Override
    public void insert(E element, int pos) {
        if (isFull()) {
            throw new OverflowException();
        }

        if (pos < 0 || pos >= numElements) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = numElements - 1; i >= pos; i--) {
            elements[i + 1] = elements[i];
        }

        elements[pos] = element;
        numElements++;
    }

    @Override
    public E remove(int pos) {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            throw new UnderflowException();
        }

        if (pos < 0 || pos >= numElements) {
            throw new OverflowException();
        }

        E element = elements[pos];
        for (int i = pos; i < numElements - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[numElements - 1] = null;
        numElements--;

        return element;

    }

    @Override
    public E get(int pos) {
        if (pos < 0 || pos >= numElements) {
            throw new IndexOutOfBoundsException();
        }

        return elements[pos];
    }

    @Override
    public int search(E element) {
        for (int i = 0; i < numElements; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }

        return -1;
    }

}
