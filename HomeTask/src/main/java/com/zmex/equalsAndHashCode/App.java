package com.zmex.equalsAndHashCode;

import com.zmex.equalsAndHashCode.account.Account;
import com.zmex.equalsAndHashCode.user.User;

import java.util.HashSet;
import java.util.Set;

public class App {

  public static void main(String[] args) {
    User user = new User("Jon");
    System.out.println(user.hashCode());
    User user2 = new User("Jon");
    System.out.println(user2.hashCode());
  }

  private static void showValuesDistribution() {
    long positiveValues;
    long negativeValues;
    Set<User> users = new HashSet<User>();
    for (int i = 0; i < 1_000_000; i++) {
      User user =
          new User(
              ("first name" + i),
              ("first name" + i),
              ("first name" + i),
              ("first name" + i),
              ("first name" + i));
      users.add(user);
    }
    positiveValues = users.stream().filter(x -> x.hashCode() > 0).count();
    negativeValues = users.stream().filter(x -> x.hashCode() < 0).count();
    System.out.println(
        "Positive hashCode count = "
            + positiveValues
            + " Negative hashCode count = "
            + negativeValues
            + " All obgects  = "
            + users.size());

    long positiveValues1;
    long negativeValues1;
    Set<Account> accounts = new HashSet<>();
    for (int i = 0; i < 1_000_000; i++) {
      Account account = new Account(("Type " + i), ("Name " + i), ("Owner " + i));
      accounts.add(account);
    }
    positiveValues1 = accounts.stream().filter(x -> x.hashCode() > 0).count();
    negativeValues1 = accounts.stream().filter(x -> x.hashCode() < 0).count();
    System.out.println(
        "Positive hashCode count = "
            + positiveValues1
            + " Negative hashCode count = "
            + negativeValues1
            + " All obgects  = "
            + accounts.size());
  }
}
