package ru.job4j.oop;

import ru.job4j.condition.DummyBot;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String s = "meal";
        System.out.println(dummyDic.engToRus(s));
    }
}
