package org.example;

import ru.netology.service.CashbackHackService;

public class Main {
    public static void main(String[] args) {
       CashbackHackService service = new CashbackHackService();
       System.out.println("Не хватает " + service.remain(1990));
    }
}