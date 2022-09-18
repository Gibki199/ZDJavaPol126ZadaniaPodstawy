package pl.sdacademy.java.basic.exercises.day2;

import java.util.Objects;

class Task15 {
    public static void main(String[] args) {
     String[] firstArray = {"Ala", null, "kota"};
     String[] secondArray = {"Ala", null, "kota"};

        System.out.println(areEqual(firstArray, secondArray));
    }

    private static boolean areEqual(String[] firstArray, String[] secondArray) {
        /*
        1. czy rozmiar obu tablic jest taki sam
         */
        if(firstArray.length == secondArray.length) {
            for(int i = 0; i < firstArray.length; i++) {
                String elementFromFirstArray = firstArray[i];
                String elementFromSecondArray = secondArray[i];
                if(elementFromFirstArray == null && elementFromSecondArray == null){
                    continue;
                }
//                if(!elementFromFirstArray.equals(elementFromSecondArray)) {
//                if(elementFromFirstArray == null || (!elementFromFirstArray.equals(elementFromSecondArray))){
                if(!Objects.equals(elementFromFirstArray, elementFromSecondArray)) {
                    return false;
                }

            }
            return true;
        }

        return false;
    }
}
