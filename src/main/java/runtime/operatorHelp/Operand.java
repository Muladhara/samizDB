package runtime.operatorHelp;

import console.ConsoleManager;
import org.antlr.v4.runtime.tree.ParseTree;
import runtime.Environment;
import parser.VTLParser;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roberto on 04/03/2016.
 */
public class Operand {
/*
    public static String getOperands(ParseTree leftChild, ParseTree rightChild, String s, Environment env) {
        String a = checkValue(leftChild, env);
        String b = checkValue(rightChild, env);
        String operand_1 = "-";
        String operand_2 = "-";
        VTLParser.FunctionContext previousContext;
        VTLParser.FunctionContext superclass = new VTLParser.FunctionContext();

        if(leftChild!= null && superclass.getClass().isAssignableFrom(leftChild.getClass()) && !isType(leftChild) ){
            previousContext = (VTLParser.FunctionContext) leftChild;
            if(env.getResultfunction(previousContext.getText())!= null)
                operand_1 = operand_1 +  env.getResultfunction(previousContext.getText()).performOperation().toString();
            else
                ConsoleManager.printMessage("Variable not assigned yet: " + previousContext.getText());
        }
        else{
            if(a != null){
                operand_1 = operand_1 + a;
            }
            else{
                if(leftChild != null)
                    operand_1 = operand_1 + getOperands(leftChild.getChild(0), leftChild.getChild(2), s, env);
            }
        }


        if(rightChild!= null && superclass.getClass().isAssignableFrom(rightChild.getClass()) && !isType(rightChild) ){
            previousContext = (VTLParser.FunctionContext) rightChild;
            if(env.getResultfunction(previousContext.getText())!= null)
                operand_2 = operand_2 +  env.getResultfunction(previousContext.getText()).performOperation().toString();
            else
                ConsoleManager.printMessage("Variable not assigned yet: " + previousContext.getText());
        }
        else{
            if(b != null){
                operand_2 = operand_2 +  b;
            }
            else{
                if(rightChild != null)
                    operand_2 = operand_2 + getOperands(rightChild.getChild(0), rightChild.getChild(2), s, env);
            }
        }

        return s+operand_1+operand_2;
    }

    public static String checkValue(ParseTree value, Environment env){
        if(value == null)
            return null;

        Pattern numeric = Pattern.compile("[0-9]+(\\.[0-9]+)?");
        Pattern string = Pattern.compile("\"[A-Za-z0-9]+\"");
        Pattern variable = Pattern.compile("[A-Za-z0-9]+");
        Pattern bool = Pattern.compile("true|false|TRUE|FALSE");
        Pattern functionString = Pattern.compile("\\[.+]");
        Matcher isNumeric = numeric.matcher(value.toString());
        Matcher isVariable = variable.matcher(value.toString());
        Matcher isBool = bool.matcher(value.toString());
        Matcher previousFunc = functionString.matcher(value.toString());
        Matcher isString = string.matcher(value.toString());

        if(previousFunc.find())
            return null;

        if(isNumeric.find()|isBool.find()| isString.find())
            return value.toString();

        if(isVariable.find())
            return env.getResultfunction(value.toString()).performOperation().toString();

        return null;
    }

    public static String[] getOperandsFromString(String result){
        Pattern numeric = Pattern.compile("[0-9]+(\\.[0-9]+)?");
        String[] resultComp = result.split("-");
        String[] operands = new String[2];
        int i = 0;
        for(String part : resultComp){
            Matcher isNumeric = numeric.matcher(part);
            if(isNumeric.find()){
                operands[i] = part;
                i++;
            }
        }
        return operands;
    }

    public static String[] getBoolOperandsFromString(String result){
        Pattern bool = Pattern.compile("true|false|TRUE|FALSE");
        String[] resultComp = result.split("-");
        String[] operands = new String[2];
        int i = 0;
        for(String part : resultComp){
            Matcher isNumeric = bool.matcher(part);
            if(isNumeric.find()){
                operands[i] = part;
                i++;
            }
        }
        return operands;
    }

    public static String[] getStringOperandsFromString(String result){
        Pattern bool = Pattern.compile("\"[A-Za-z0-9]+\"");
        String[] resultComp = result.split("-");
        String[] operands = new String[1];
        int i = 0;
        for(String part : resultComp){
            Matcher isNumeric = bool.matcher(part);
            if(isNumeric.find()){
                operands[i] = part.substring(1,part.length()-1);
                i++;
            }
        }
        return operands;
    }

    public static boolean isType(ParseTree a){
        VTLParser.FunctionContext function;
        function = (VTLParser.FunctionContext) a;
        List<VTLParser.FunctionContext> listOfType = setListOfType();
        Iterator<VTLParser.FunctionContext> i = listOfType.iterator();
        while(i.hasNext()){
            VTLParser.FunctionContext entry = i.next();
            if(function.getClass().equals(entry.getClass())){
                return true;
            }
        }
        return false;
    }

    public static List<VTLParser.FunctionContext> setListOfType(){
        VTLParser.IntContext intParameter = new VTLParser.IntContext();
        VTLParser.DoubleContext doubleParameter = new VTLParser.DoubleContext();
        VTLParser.StringContext stringParameter = new VTLParser.StringContext();
        VTLParser.BooleanContext booleanParameter = new VTLParser.BooleanContext();
        List<VTLParser.FunctionContext> list = new LinkedList<VTLParser.FunctionContext>();
        list.add(intParameter);list.add(doubleParameter);list.add(stringParameter);list.add(booleanParameter);
        return list;
    }
    */
}
