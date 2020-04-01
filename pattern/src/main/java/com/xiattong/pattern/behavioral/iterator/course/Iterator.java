package com.xiattong.pattern.behavioral.iterator.course;

/**
 * Created by Tom.
 */
public interface Iterator<E> {
    E next();
    boolean hasNext();
}
