package com.sparta.sortingalgos.view;

import com.sparta.sortingalgos.utils.BeforeAfter;
import com.sparta.sortingalgos.utils.Logging;
import com.sparta.sortingalgos.controller.SortingController;
import com.sparta.sortingalgos.utils.SortingType;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.sparta.sortingalgos.utils.Logging.*;

/**
 * View -> consists of displaying the menu, execution time
 *         and array before and after execution
 */
public class SortingView {

    /**
     * Display menu. First method when main is run
     * Algorithm option choices. Passes control to SortingController
     */
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        int seed = chooseSeed(scanner);


        System.out.print(algoChoice);
        boolean flag = false;
        String choice = scanner.next();
        do {
            try{
                switch(choice){
                    case bubble:
                        System.out.println(bubblesortChosen);
                        SortingController.sortChoice(SortingType.Bubble, seed);
                        flag = true;
                        break;
                    case quick:
                        System.out.println(quicksortChosen);
                        SortingController.sortChoice(SortingType.Quick, seed);
                        flag = true;
                        break;
                    case quit:
                        System.out.println(exit);
                        System.exit(0);
                    default:
                        Logging.logger.warn(unknownOption);
                        choice = scanner.next();
                }

            }catch(InputMismatchException e){
                Logging.logger.warn(invalidInput);
            }
        }while (!flag);
    }

    /**
     * Display the array before and after
     * @param myArray array
     * @param beforeAfter -> BeforeAfter enum class
     */
    public String display(int[] myArray, BeforeAfter beforeAfter){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.print(beforeAfter + ":");
        for(int i : myArray){
            stringBuilder.append(i).append(" ");
        }
        System.out.println("");
        return stringBuilder.toString();
    }

    public String display(List<Integer> myArray, BeforeAfter beforeAfter){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.print(beforeAfter + ":");
        for(int i : myArray){
            stringBuilder.append(i).append(" ");
        }
        System.out.println("");
        return stringBuilder.toString();
    }

    /**
     * Display the execution time of an algorithm
     * @param time
     */
    public void displayTime(float time){
        System.out.printf("%.5f " + "milliseconds", time);
    }

    /**
     * Choose seed number for randomizing
     * @param scanner -> Scanner class
     * @return int
     */
    private int chooseSeed(Scanner scanner) {
        System.out.print("Choose seed number (ex 100): ");
        int seed = 0;
        boolean seedFlag; // initialized to true by default
        do {
            try {
                seedFlag = false;
                seed = scanner.nextInt();
            } catch (InputMismatchException e) {
                String q = scanner.next();
                seedFlag = true;
                if (q.equals(quit)) {
                    Logging.logger.info(exit);
                    System.exit(0);
                }
                Logging.logger.warn(invalidInputTryAgain);
            }
        } while (seedFlag);
        return seed;
    }
}
