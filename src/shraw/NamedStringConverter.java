package shraw;

import javafx.util.StringConverter;

/**
 * String converter для Named классов.
 *
 * @param <T> Тип класса
 */
public final class NamedStringConverter<T extends Named> extends StringConverter<T> {

    @Override
    public String toString(final T named) {
        return named.text();
    }

    @Override
    public T fromString(final String text) {
        throw new UnsupportedOperationException();
    }
}
