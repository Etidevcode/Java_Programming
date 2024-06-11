package dev.lpa;

/**
 *           Files => Editor => General => Gutter Icons => Cocher lambdas
 *
 */
@FunctionalInterface
public interface Operation<T> {
    T operate(T value1, T value2);
}
