package com.company;

import java.lang.annotation.AnnotationFormatError;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(60);
        boss.setBossDefenceType("Kinetic");
        System.out.println();
        System.out.println("Boss health:" + boss.getBossHealth() + "HP  Boss damage:" + boss.getBossDamage() + "  Boss defence type:" + boss.getBossDefenceType());
        System.out.println("___________________________________________________________________");

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i]);
            System.out.println("___________________________________________________________________");
        }
    }

    public static Hero[] createHeroes() {

        Hero hero1 = new Hero(200, 20, "Physical");

        Hero hero2 = new Hero(150, 15);

        Hero hero3 = new Hero(250, 25, "Kinetic");

        Hero hero4 = new Hero(300, 30);

        return new Hero[]{hero1, hero2, hero3, hero4};
    }
}
/*
#ДЗ:
Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля,
в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.
Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
Добавить в класс геттеры и сеттеры для всех полей.
В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
Затем распечатать всю информацию о боссе.
ДЗ на сообразительность:
Добавить метод в классе Main который называется createHeroes,
в теле метода необходимо создать 3х героев с помощью класса Hero,
используя при этом разные варианты конструкторов (либо первый либо второй).
Затем поместить созданные экземпляры героев в массив и
вернуть его с помощью команды return, как возвращаемый результат метода createHeroes.
Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
 */






