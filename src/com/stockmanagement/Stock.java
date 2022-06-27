package com.stockmanagement;
import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no.of stokes; ");
        int noOfStocks = scanner.nextInt();

        String[] nameOfTheStock = new String[noOfStocks];
        int noOfShares[] = new  int[noOfStocks];
        float shareValue[] = new float[noOfStocks];

        for (int i = 0; i <= noOfStocks - 1; i++){
            System.out.println("Enter name of the company:");
            nameOfTheStock[i] = scanner.next();
            System.out.println("Enter no.of shares:");
            noOfShares[i] = scanner.nextInt();
            System.out.println("Enter per share value:");
            shareValue[i] = scanner.nextFloat();
        }
         StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.stockPrinter(nameOfTheStock, noOfShares, shareValue, noOfStocks);
    }
}

