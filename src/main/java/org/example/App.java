package org.example;

import org.example.dao.CityDao;
import org.example.dao.CityDaoImpl;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        CityDaoImpl cityDao = new CityDaoImpl();
        System.out.println(cityDao.getAllCountry());
        System.out.println(cityDao.getAllCity());
        System.out.println(cityDao.getAllMayor());
while (true){
        choose(cityDao);
}
    }

    private static void choose(CityDaoImpl cityDao) throws Exception {
        System.out.println();
        System.out.println("Выберите один из вариантов");
        System.out.println();
        System.out.println("1 поиск города по id");
        System.out.println("2 поиск стран по id");
        System.out.println("3 поиск Мэра по id");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Введите id города");
                int b = scanner.nextInt();
                if (b < 6) {
                    cityDao.findByIdCity(b);
                } else {
                    System.out.println("в списке нет такого id");
                }


                break;
            case 2:
                System.out.println("Введите id Страны");
                int c = scanner.nextInt();
                if (c < 6) {
                    cityDao.findByIdCoutry(c);
                } else {
                    System.out.println("в списке нет такого id");
                }
                break;
            case 3:
                System.out.println("Введите id Мэра");
                int d = scanner.nextInt();
                if (d < 6) {
                    cityDao.findByIdMayor(d);
                } else {
                    System.out.println("в списке нет такого id");
                }
                break;
            default:
                throw new Exception("Таких вариантов нет,выберите один из 3 ");
        }

    }
}
