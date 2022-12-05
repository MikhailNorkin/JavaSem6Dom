// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

package Tasks;

import java.util.ArrayList;
import java.util.Map;

public class Computer {
    String ozy;
    String capacity;
    String os;
    String color;

    public Computer(String ozy, String capacity, String os, String color){
        this.ozy = ozy;
        this.capacity = capacity;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Есть такой ноутбук: %s,%s,%s,%s",ozy,capacity,os,color);
    }
}
