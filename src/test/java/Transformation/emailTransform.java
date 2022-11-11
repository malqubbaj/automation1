package Transformation;


import io.cucumber.cucumberexpressions.Transformer;


public class emailTransform implements Transformer<String> {

    @Override
    public String transform(String userName){

        return userName.concat("mq.com");
    }
}
