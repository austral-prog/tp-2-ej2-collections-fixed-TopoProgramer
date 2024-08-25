package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lists {
    public static Integer indexOf(String color, List<String> colores) {
        for (int i = 0; i < colores.size(); i++) {
            if (Objects.equals(color, colores.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static Integer indexOfByIndex(String color, List<String> colores, Integer indice) {
        for (int i = indice; i < colores.size(); i++) {
            if (Objects.equals(color, colores.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static Integer indexOfEmpty(List<String> colores){
        for (int i = 0; i< colores.size();i++){
            if(Objects.equals(colores.get(i),"")){
                return i;
            }
        }
        return -1;
    }

    public static Integer put(String color, List<String> colores){
        for (int i = 0; i < colores.size(); i++) {
            if (colores.get(i).isEmpty()) {
                colores.add(i,color);
                return i;
            }
        }
        return -1;
    }

    public static Integer remove(String color, List<String> colores){
        int v=0;
        for (int i = 0; i < colores.size(); i++) {
            if (Objects.equals(color, colores.get(i))) {
                colores.remove(i);
                v+=1;
            }
        }
        return v;
    }
}





