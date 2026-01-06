package br.com.wilsoncf.operations;

import br.com.wilsoncf.exception.UnsupportedMathOperationException;
import br.com.wilsoncf.utils.Tools;

public class MathOperations {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo)/2;
    }

    public Double squareRoot(Double number) {
        return Math.sqrt(number);
    }
}
