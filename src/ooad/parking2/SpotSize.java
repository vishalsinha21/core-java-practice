package ooad.parking2;

import java.util.stream.Stream;

public enum SpotSize {
    SMALL, COMPACT, LARGE;

    public boolean isOneOf(SpotSize... spotSizes) {
        return Stream.of(spotSizes)
                .filter(spotSize -> this == spotSize)
                .findFirst()
                .isPresent();
    }
}
