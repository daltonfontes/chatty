package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oi, eu sou Chatty. Qual é o seu nome ?");
        String name = scanner.nextLine();

        System.out.println("Olá," + name +"! Em que posso ser útil para você hoje ?");
    }
}