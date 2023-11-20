package homework_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

// Задание

// 📌 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// 📌 Создать множество ноутбуков.
// 📌 Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// 📌 Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// 📌 Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.

public class LaptopSearching {

    public static void main(String[] args) {
        userInterface();
    }

    static Laptop hpPavillion = new Laptop("HP", "Windows 11", 8, 1000, "black");
    static Laptop macbookPro = new Laptop("Apple", "MacOS", 16, 512, "silver");
    static Laptop dell = new Laptop("DELL", "Linux", 4, 256, "white");
    static Laptop lenovo = new Laptop("Lenovo", "Windows 11", 8, 256, "black");
    static Laptop honor = new Laptop("HONOR", "Linux", 16, 1000, "silver");
    static Laptop hpPavillion2 = new Laptop("HP", "Windows 11", 32, 2000, "white");

    static HashSet<Laptop> hashSet = new HashSet<>(Arrays.asList(hpPavillion, macbookPro, dell, lenovo, honor, hpPavillion2));

    public static void searchingProccess(String param) {
        int countSuccessfulSearch = 0;

        for (Laptop el : hashSet) {
            String takeOne = el.getAll().toString();

            if (takeOne.contains(param)) {
                System.out.println(el);
                System.out.println();
                countSuccessfulSearch += 1;
            }
        }

        if (countSuccessfulSearch == 0) System.out.println("По вашему запросу ничего не найдено.");
    }

    public static void searchingNumParameter(int param, int numOperation) {
        int countSuccessfulSearch = 0;

        for (Laptop el : hashSet) {
            switch (numOperation) {
                case 1:
                    if (el.getRam() >= param) {
                        System.out.println(el);
                        System.out.println();
                        countSuccessfulSearch += 1;
                    }
                    break;
                case 2:
                    if (el.getHdd() >= param) {
                        System.out.println(el);
                        System.out.println();
                        countSuccessfulSearch += 1;
                    }
                    break;          
                default:
                    break;
            }      
        }

        if (countSuccessfulSearch == 0) System.out.println("По вашему запросу ничего не найдено.");
    }

    public static void userInterface() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println();
                System.out.println("Выберите критерий для фильтрации или напишите exit для выхода.");
                System.out.println("1. Бренд" + "\n" + "2. OC" + "\n" + "3. ОЗУ" + "\n" + "4. HDD" + "\n" + "5. Цвет" + "\n");
                String userEnter = scanner.nextLine();

                if (userEnter.equals("exit")) break;

                switch (userEnter) {
                    case "1":
                        System.out.println();
                        System.out.println("Выберите критерий для фильтрации или напишите exit для выхода.");
                        System.out.println("1. HP" + "\n" + "2. Apple" + "\n" + "3. Dell" + "\n" + "4.Lenovo" + "\n"
                                + "5.HONOR" + "\n");

                        String userSwitchBrand = scanner.nextLine();

                        switch (userSwitchBrand) {
                            case "1":
                                searchingProccess("HP");
                                break;
                            case "2":
                                searchingProccess("Apple");
                                break;
                            case "3":
                                searchingProccess("DELL");
                                break;
                            case "4":
                                searchingProccess("Lenovo");
                                break;
                            case "5":
                                searchingProccess("HONOR");
                                break;
                            default:
                                break;
                    
                        } break;

                    case "2":
                        System.out.println();
                        System.out.println("Выберите критерий для фильтрации или напишите exit для выхода.");
                        System.out.println("1. Windows" + "\n" + "2. MacOs" + "\n" + "3. Linux" + "\n");

                        String userSwitchOs = scanner.nextLine();

                        switch (userSwitchOs) {
                            case "1":
                                searchingProccess("Windows");
                                break;
                            case "2":
                                searchingProccess("MacOS");
                                break;
                            case "3":
                                searchingProccess("Linux");
                             default:
                                break;              
                        } break;

                    case "3":
                        System.out.println();
                        System.out.println("Выберите критерий для фильтрации или напишите exit для выхода.");
                        System.out.println("1. 4" + "\n" + "2. 8" + "\n" + "3. 16" + "\n" + "4. 32" + "\n");

                        String userSwitchRam = scanner.nextLine();

                        switch (userSwitchRam) {
                            case "1":
                                searchingNumParameter(4,1);
                                break;
                            case "2":
                                searchingNumParameter(8,1);
                                break;
                            case "3":
                                searchingNumParameter(16,1);
                            case "4":
                                searchingNumParameter(32,1);
                            default:
                                break;               
                        } break;

                    case "4":
                        System.out.println();
                        System.out.println("Выберите критерий для фильтрации или напишите exit для выхода.");
                        System.out.println("1. 128" + "\n" + "2. 256" + "\n" + "3. 512" + "\n" + "4. 1000" + "\n"+ "5. 2000" + "\n");

                        String userSwitchHdd = scanner.nextLine();

                        switch (userSwitchHdd) {
                            case "1":
                                searchingNumParameter(128,2);
                                break;
                            case "2":
                                searchingNumParameter(256,2);
                                break;
                            case "3":
                                searchingNumParameter(512,2);
                            case "4":
                                searchingNumParameter(1000,2);
                            case "5":
                                searchingNumParameter(2000,2);
                            default:
                                break;               
                        } break;
                    case "5":
                        System.out.println();
                        System.out.println("Выберите критерий для фильтрации или напишите exit для выхода.");
                        System.out.println("1. Черный" + "\n" + "2. Белый" + "\n" + "3. Серебристый" + "\n" + "4. Красный" + "\n");

                        String userSwitchColor = scanner.nextLine();

                        switch (userSwitchColor) {
                            case "1":
                                searchingProccess("black");
                                break;
                            case "2":
                                searchingProccess("white");
                                break;
                            case "3":
                                searchingProccess("silver");
                                break;
                            case "4":
                                searchingProccess("Красный");
                                break;
                            default:
                                break;               
                        } break;

                    default: break;
                }
            }
        }
    }
}
