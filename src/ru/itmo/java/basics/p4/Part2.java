package ru.itmo.java.basics.p4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part2 {
    public void enterResult() {
           System.out.println("Введите длину массива");
            Scanner sc = new Scanner(System.in);
            int lengthArray = sc.nextInt();
            System.out.println("Array length: " + lengthArray);
            System.out.println("Введите числа своего массива");
            int[] numbers = new int[lengthArray];
            for (int i = 0; i < lengthArray; i++) {
                numbers[i] = sc.nextInt();
            }
            sc.close();
            System.out.println("Result: " + Arrays.toString(numbers));


            if (!arraySorted(numbers)) {
                System.out.println("Please, try again");
            } else {
                System.out.println("OK");
            }

            int[] numbers2 = changeNumbersLastFirst(numbers);
            System.out.println("Array 1: " + Arrays.toString(numbers));
            System.out.println("Array 2: " + Arrays.toString(numbers2));


            int num = getFirstUniqueNumber(numbers);
            System.out.println("Первое уникальное число в Array 1 такое: " + num);


        }
        private static int[] getRandomNumbersArray(int[] nums) {
            Random random = new Random();

            int[] randomNums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                randomNums[i] = random.nextInt(100);
            }
            return randomNums;
        }


        private static int getFirstUniqueNumber(int[] array) {
            int result = array[0];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j] && i != j) {
                        break;
                    } else if (j == array.length - 1) {
                        return array[i];
                    }
                }
            }
            return result;
        }


        private static int[] changeNumbersLastFirst(int[] numbers) {
            int[] numbersLastFirst = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                numbersLastFirst[i] = numbers[i];
            }
            int temp = numbersLastFirst[0];
            numbersLastFirst[0] = numbersLastFirst[numbers.length - 1];
            numbersLastFirst[numbers.length - 1] = temp;
            return numbersLastFirst;
        }


        private static boolean arraySorted(int[] nums) {
            if (nums.length == 1) {
                return true;
            } else {
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] > nums[i + 1]) {
                        return false;
                    }
                }
                return true;
            }
    }

}
