package runtime;

import model.ComponentType;

import java.util.List;

public class Variable {

    private String name;
    private Function function;



    public Variable(String name, Function function) {
        this.function = function;
        this.name = name;
    }


    public Function getFunction(){
        return this.function;
    }

    public String getName(){
        return this.name;
    }

    /*
    @Override
    public Dataset getDataset() throws DatasetNotFoundException {
        return this.function.getDataset();
    }
    */
    /*
    @Override
    public  Object performOperation() {
        return this.function.performOperation();
    }
    */

    //Runnable r= () -> this.function.performOperation();






    /*
    public  void execute(Function f){
        this.function.performOpeation();
    }
    */


}
