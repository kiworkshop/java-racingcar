package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class CarGame {
    private String inputString;
    private String[] carNames;
    private int gameNumber;
    private Car[] cars;
    private boolean winnerIsDecided;

    public void getInputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분).");
        this.inputString =  sc.nextLine();
    }

    public void getCarNames() {
        this.carNames = inputString.split(",");
    }

    public void getGameNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        this.gameNumber = sc.nextInt();
    }

    public void makeCars() {
        Car[] cars = new Car[];
    }

    public void getRandomNumbers() {

    }

    public void moveCars() {

    }

    public void printResult() {

    }

    public void printWinner() {

    }


    public void start() {
        getInputString();
        getCarNames();
        makeCars();
        getGameNumber();

        while(!winnerIsDecided) {
            getRandomNumbers();
            moveCars();
            printResult();
        }

        printWinner();
    }

}
