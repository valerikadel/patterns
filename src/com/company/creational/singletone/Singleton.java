package com.company.creational.singletone;

public class Singleton {
    //единственный экземпляр
    //volatile - для многопоточ., чтобы корректно считывали потоки значение из самой памяти,
    //а не из своего кеша
    private static volatile Singleton instance;
    private String data;//пример поля класса

    //приватный конструктор - т.к. создание происходит только через метод
    private Singleton(String data) {
        this.data = data;
    }

    //создание экземпляра происходит ч/з статик метод
    public static Singleton getInstance(String data) {
        //double check - увеличение времени считывания из самой памяти
        //решение проблемы - запись в кучу значения сингла
        Singleton result = instance;
        if (result == null) {
            //если объекта нет, то блокируем сам класс для взаимодействия
            synchronized (Singleton.class) {
                //снова решение считывания из памяти
                result = instance;
                if (result == null)
                    //создание самого объекта
                    instance = result = new Singleton(data);
            }
        }
        //синглтон
        return result;
    }
}
