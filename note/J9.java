package JAVA.note;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J9 {
    public static void main(String[] args) {
        Set<NoteBook> notebooks = new HashSet<>();
        NoteBook notebook1 = new NoteBook("NB1", 8, 500, "Windows 10", "черный");
        NoteBook notebook2 = new NoteBook("NB2", 16, 1000, "MacOS", "белый");
        NoteBook notebook3 = new NoteBook("NB3", 4, 250, "Linux", "белый");
        NoteBook notebook4 = new NoteBook("NB4", 8, 500, "Windows 10", "белый");
        NoteBook notebook5 = new NoteBook("NB5", 16, 1000, "Windows 10", "черный");

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем HDD");
        System.out.println("3 - Операционная система/OS");
        System.out.println("4 - Цвет");
        int filter = scanner.nextInt();

        int minCriter;
        switch (filter) {
            case 1:
                System.out.println("Введите минимальное значение ОЗУ:");
                minCriter = scanner.nextInt();
                filterByRam(notebooks, minCriter);
                break;
            case 2:
                System.out.println("Введите минимальный объем HDD:");
                minCriter = scanner.nextInt();
                filterByHdd(notebooks, minCriter);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String OsUSE = scanner.next();
                filterByOs(notebooks, OsUSE);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String colorUSE = scanner.next();
                filterByColor(notebooks, colorUSE);
                break;
            default:
                System.out.println("Некорректный выбор критерия");
        }
    }

    public static void filterByRam(Set<NoteBook> notebooks, int minCriter) {
        for (NoteBook notebook : notebooks) {
            if (notebook.getRam() >= minCriter) {
                System.out.println();
                System.out.println("Вам подходит модель " + notebook.getBrand() + " Имеет объем RAM: " + notebook.getRam() + " Gb" );
                System.out.println(notebook);
                System.out.println();
            }
        }
    }

    public static void filterByHdd(Set<NoteBook> notebooks, int minCriter) {
        for (NoteBook notebook : notebooks) {
            if (notebook.getHdd() >= minCriter) {
                System.out.println();
                System.out.println("Вам подходит модель " + notebook.getBrand() + " Имеет объем HDD: " + notebook.getHdd() + " Gb");
                System.out.println(notebook);
                System.out.println();
            }
        }
    }

    public static void filterByOs(Set<NoteBook> notebooks, String OsUSE) {
        for (NoteBook notebook : notebooks) {
            if (notebook.getOs().equalsIgnoreCase(OsUSE)) {
                System.out.println();
                System.out.println("Вам подходит модель " + notebook.getBrand() + " Имеет OS: " + notebook.getOs());
                System.out.println(notebook);
                System.out.println();
            }
        }
    }

    public static void filterByColor(Set<NoteBook> notebooks, String colorUSE) {
        for (NoteBook notebook : notebooks) {
            if (notebook.getColor().equalsIgnoreCase(colorUSE)) {
                System.out.println();
                System.out.println("Вам подходит модель " + notebook.getBrand() + " Имеет нужный цвет: " + notebook.getColor());
                System.out.println(notebook);
                System.out.println();
            }
        }
    }
}
