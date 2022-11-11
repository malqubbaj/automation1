package Transformation;

import io.cucumber.cucumberexpressions.Transformer;


public class salaryCountTransformer implements Transformer<Integer> {

    @Override
    public Integer transform(String salary){
        return salary.length();

    }
}
