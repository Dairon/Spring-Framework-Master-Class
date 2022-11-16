package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binaraySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        //Implement Sorting Logic
        System.out.println(sortAlgorithm);

        //Search the array
        return 3;
    }




}
