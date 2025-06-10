package ru.netology;

import java.util.*;

public class PhoneBook {
    public static HashMap<String, Long> phoneBook = new HashMap<>();

    public static int add(String name, long number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }

    public static String findByNumber(long number) {
        Optional<String> result = phoneBook.entrySet().stream()
                .filter(n -> n.getValue().equals(number))
                .map(Map.Entry::getKey)
                .findFirst();

        return result.orElse("");
    }
    }
