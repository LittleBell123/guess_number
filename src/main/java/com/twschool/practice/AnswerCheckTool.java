package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class AnswerCheckTool {
    List<String> answer;
    List<String> input;
    int ANum;
    int BNum;


    public AnswerCheckTool( List<String> answer,  List<String> input){
        this.answer = answer;
        this.input = input;
    }

    public String printResult() {
        checkNumber();
        return String.valueOf(ANum) + "A" + String.valueOf(BNum) + "B";
    }

    private void checkNumber() {
        for (int i = 0 ; i < input.size(); i++ ) {
            if(answer.contains(input.get(i))){
                if (answer.get(i).equals(input.get(i))){
                   ANum++;
                } else {
                    BNum++;
                }
            }
        }
     }
}
