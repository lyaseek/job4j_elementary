package ru.job4j.collection;


import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("ivanov@yandex.ru", "Ivan Ivanov");
        map.put("petrov@yandex.ru", "Petr Petor");
        map.put("sidorov@yandex.ru", "Stephan Sidorov");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }
    }

}
