package com.zmex.customList;

import com.zmex.customList.list.CustomList;

public class App {

  public static void main(String[] args) {
    CustomList<Double> customList = new CustomList<>();
    for (double i = 0; i < 10; i++) {
      customList.add(i + i / 10);
    }
    System.out.println(customList);

    System.out.println(customList.map(x -> x + 0.3));

    //        Iterator<Double> iterator = customList.iterator();
    //        while (iterator.hasNext()) {
    //            System.out.println(iterator.next());
    //        }

  }
}
