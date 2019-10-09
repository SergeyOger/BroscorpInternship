package com.zmex.customList;

import com.zmex.customList.list.CustomList;

public class App {

    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomList<>();
        for (int i = 0; i < 10; i++) {
            customList.add(i);
        }
        System.out.println(customList);

        CustomList<Double> intSet = customList.map(x -> x + 0.3);

        System.out.println(intSet);



    }

}
