// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map.
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    
    // public static void getComputers(ArrayList data, Map db){
    //     System.out.println(db.get(1));
    //     System.out.println();
    //     if (db.containsKey(1)) {
    //         for (int i = data.size()-1 ; i >=0 ; i--) {
    //             Computer comp = new Computer();
    //             data.get(1);
    //             System.out.println((data.get(1)));
    //             if (data.get(i).equals(db.get(1))){
    //                 db.remove(i);
    //             }
    //         }
    //     }
        // for (Object object : data) {
        //     System.out.println(object);
        // }

    //}

    public static void main(String[] args) {
        ArrayList<Computer> data = new ArrayList<Computer>();
        Computer computer1 = new Computer("8", "1", "Windows", "White");
        data.add(computer1);
        Computer computer2 = new Computer("16", "1", "Windows", "White");
        data.add(computer2);
        Computer computer3 = new Computer("16", "1", "Linux", "Black");
        data.add(computer3);

        Map<Integer, String> db = new HashMap<>();
        
        System.out.println("Введите цифру, сколько вы хотите ввести критерие для отбора:");    
        
        Scanner Sc = new Scanner(System.in);
        int sum = Sc.nextInt();
        Scanner Sk = new Scanner(System.in);
        int k = 0;
        while (k < sum) {
            System.out.println("Выберете какие именно критерии вы хотитет отобрать: ");        
            System.out.println("1 - ОЗУ");
            System.out.println("2 - объем жесткого диска");
            System.out.println("3 - операционная система");
            System.out.println("4 - цвет корпуса");
            int setting = Sc.nextInt();
            System.out.println("Выберете значение критерия:");
            String value = Sk.nextLine();
            db.put(setting, value);
            k = k + 1;
        }

        if (db.containsKey(1)) {
            System.out.println(db.get(1));
            for (int i = data.size()-1 ; i >=0 ; i--) {
                if (data.get(i).ozy.equals(db.get(1))){}
                else{data.remove(i);}
            }
        } 
        
        if (db.containsKey(2)) {
            System.out.println(db.get(1));
            for (int i = data.size()-1 ; i >=0 ; i--) {
                if (data.get(i).capacity.equals(db.get(2))){}
                else{data.remove(i);}
            }
        } 
        
        if (db.containsKey(3)) {
            System.out.println(db.get(1));
            for (int i = data.size()-1 ; i >=0 ; i--) {
                if (data.get(i).os.equals(db.get(3))){}
                else{data.remove(i);}
            }
        } 

        if (db.containsKey(4)) {
            System.out.println(db.get(1));
            for (int i = data.size()-1 ; i >=0 ; i--) {
                if (data.get(i).color.equals(db.get(4))){}
                else{data.remove(i);}
            }
        }

        for (Object object : data) {
             System.out.println(object.toString());
        }            

    }
}