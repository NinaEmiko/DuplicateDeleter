package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] intArray = Arrays.stream(this.array)
                .filter(num -> Collections.frequency(Arrays.asList(this.array), num) < maxNumberOfDuplications)
                .toArray(String[]::new);
        return intArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] intArray = Arrays.stream(this.array)
                .filter(num -> Collections.frequency(Arrays.asList(this.array), num) != exactNumberOfDuplications)
                .toArray(String[]::new);
        return intArray;
    }
}
