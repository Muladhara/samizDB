package runtime;

import console.ConsoleManager;
import model.Dataset;
import org.apache.commons.lang3.math.NumberUtils;
import parser.VTLBaseListener;
import parser.VTLParser;
import runtime.Hierarchy.Condition;
import runtime.Hierarchy.HierarchyRule;
import runtime.conditionalOperators.IfScalarOperator;
import runtime.conditionalOperators.NvlScalarOperator;
import runtime.logicalOperators.AndScalarOperator;
import runtime.logicalOperators.NotScalarOperator;
import runtime.logicalOperators.OrScalarOperator;
import runtime.logicalOperators.XorScalarOperator;
import runtime.mathematicalOperators.*;
import runtime.stringOperators.InvalidOperandException;
import runtime.stringOperators.LengthScalarOperator;
import runtime.validationOperators.BetweenScalarOperator;
import runtime.validationOperators.InScalarOperator;
import runtime.validationOperators.MatchCharactersScalarOperator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class AntlrVTLListener extends VTLBaseListener {

    private Environment env;

    public AntlrVTLListener(Environment env) {
        this.env = env;
    }

    @Override
    public void exitStatement(VTLParser.StatementContext ctx) {
        Function toAssign = this.env.getResultfunction(ctx.getChild(2).getText());
        if (toAssign != null) {
            //Variable v = new Variable(ctx.getChild(0).getText(), this.env.getResultfunction(ctx.getChild(2).getText()));
            this.env.setResultFunction(ctx.getChild(0).getText(), this.env.getResultfunction(ctx.getChild(2).getText()));
        }
    }

    @Override
    public void exitFunctionCommand(VTLParser.FunctionCommandContext ctx) {
        {
            Function result = this.env.getResultfunction(ctx.getChild(0).getText());
            this.env.clearOperands();
            if (result!=null) {
                if(this.env.getResultfunction(ctx.getChild(0).getText()).performOperation()!= null)
                    ConsoleManager.printMessage(this.env.getResultfunction(ctx.getChild(0).getText()).performOperation().toString());
                else
                    ConsoleManager.printMessage("Cannot perform operation");
            }

        }
    }

    @Override
    public void enterQuitOperator(VTLParser.QuitOperatorContext ctx) {
        System.exit(0);
    }

    @Override
    public void enterGetOperator(VTLParser.GetOperatorContext ctx) {
        GetOperator go = new GetOperator(ctx.getChild(2).toString());
        this.env.setResultFunction(ctx.getText(), go);
    }

    @Override
    public void exitParFunc(VTLParser.ParFuncContext ctx) {
        this.env.setResultFunction(ctx.getText(), this.env.getResultfunction(ctx.getChild(1).getText()));
    }

    @Override
    public void exitMinusFunc(VTLParser.MinusFuncContext ctx) {
        String s = '-' + this.env.getOperand();
        this.env.setOperand(s);
    }

    @Override
    public void exitInt(VTLParser.IntContext ctx) {
        this.env.setOperand(ctx.getChild(0).getText());
    }

    @Override
    public void exitDouble(VTLParser.DoubleContext ctx) {
        this.env.setOperand(ctx.getChild(0).getText());
    }

    @Override
    public void exitString(VTLParser.StringContext ctx) {
        this.env.setOperand(ctx.getChild(0).getText());
    }

    @Override
    public void exitId(VTLParser.IdContext ctx) {
        if(this.env.getResultfunction(ctx.getChild(0).getText())!= null){
            this.env.setOperand(this.env.getResultfunction(ctx.getChild(0).getText()).performOperation().toString());
        }
        else{
            ConsoleManager.printMessage("Undefined variable: "+ctx.getChild(0).getText());
        }
    }

    @Override
    public void exitBoolean(VTLParser.BooleanContext ctx) {
        this.env.setOperand(ctx.getChild(0).getText());
    }

    @Override
    public void exitListInt(VTLParser.ListIntContext ctx){
        this.env.setOperand(ctx.getChild(0).getText());
    }
    @Override
    public void exitListNum(VTLParser.ListNumContext ctx){
        this.env.setOperand(ctx.getChild(0).getText());
    }
    @Override
    public void exitListStr(VTLParser.ListStrContext ctx){
        this.env.setOperand(ctx.getChild(0).getText());
    }
    @Override
    public void exitListBool(VTLParser.ListBoolContext ctx){
        this.env.setOperand(ctx.getChild(0).getText());
    }
    /*
    @Override
    public void exitPattern(VTLParser.PatternContext ctx){
        this.env.setOperand(ctx.getChild(0).getText());
    }
    */

    @Override
    public void exitSumScalarOperator(VTLParser.SumScalarOperatorContext ctx)  {
        String op1 = this.env.getOperand();String op2 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) && NumberUtils.isNumber(op2)) {
            SumScalarOperator sco = new SumScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitDifferenceScalarOperator(VTLParser.DifferenceScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();String op2 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) && NumberUtils.isNumber(op2)) {
            DifferenceScalarOperator sco = new DifferenceScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitProductScalarOperator(VTLParser.ProductScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();String op2 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) && NumberUtils.isNumber(op2)) {
            ProductScalarOperator sco = new ProductScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitDivisionScalarOperator(VTLParser.DivisionScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();String op2 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) && NumberUtils.isNumber(op2)) {
            DivisionScalarOperator sco = new DivisionScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitRoundScalarOperator(VTLParser.RoundScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();String op2 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) && NumberUtils.isNumber(op2)) {
            RoundScalarOperator sco = new RoundScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitAbsScalarOperator(VTLParser.AbsScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) ) {
            AbsScalarOperator sco = new AbsScalarOperator(op1);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitTruncScalarOperator(VTLParser.TruncScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();String op2 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) && NumberUtils.isNumber(op2)) {
            TruncScalarOperator sco = new TruncScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitExpScalarOperator(VTLParser.ExpScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();
        if(NumberUtils.isNumber(op1)) {
            ExpScalarOperator sco = new ExpScalarOperator(op1);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitLnScalarOperator(VTLParser.LnScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) ) {
            LnScalarOperator sco = new LnScalarOperator(op1);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitLogScalarOperator(VTLParser.LogScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();String op2 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) && NumberUtils.isNumber(op2)) {
            LogScalarOperator sco = new LogScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitPowScalarOperator(VTLParser.PowScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();String op2 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) && NumberUtils.isNumber(op2)) {
            PowerScalarOperator sco = new PowerScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitNrootScalarOperator(VTLParser.NrootScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();String op2 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) && NumberUtils.isNumber(op2)) {
            NrootScalarOperator sco = new NrootScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitModScalarOperator(VTLParser.ModScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();String op2 = this.env.getOperand();
        if(NumberUtils.isNumber(op1) && NumberUtils.isNumber(op2)) {
            ModScalarOperator sco = new ModScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitAndScalarOperator(VTLParser.AndScalarOperatorContext ctx) {
        String op1 = this.env.getOperand(); String op2 = this.env.getOperand();
        if(op1!=null && op2!=null){
            if(((op1.equalsIgnoreCase("false")) || op1.equalsIgnoreCase("true")) && ((op2.equalsIgnoreCase("false")) || op2.equalsIgnoreCase("true"))){
                AndScalarOperator sco = new AndScalarOperator(op1, op2);
                this.env.setOperand(String.valueOf(sco.performOperation()));
                this.env.setResultFunction(ctx.getText(), sco);
            }
        }
        else
            ConsoleManager.printMessage("Not a boolean expression");
    }

    @Override
    public void exitXorScalarOperator(VTLParser.XorScalarOperatorContext ctx) {
        String op1 = this.env.getOperand(); String op2 = this.env.getOperand();
        if(op1!=null && op2!=null){
            if(((op1.equalsIgnoreCase("false")) || op1.equalsIgnoreCase("true")) && ((op2.equalsIgnoreCase("false")) || op2.equalsIgnoreCase("true"))){
                XorScalarOperator sco = new XorScalarOperator(op1, op2);
                this.env.setOperand(String.valueOf(sco.performOperation()));
                this.env.setResultFunction(ctx.getText(), sco);
            }
        }
        else
            ConsoleManager.printMessage("Not a boolean expression");
    }

    @Override
    public void exitOrScalarOperator(VTLParser.OrScalarOperatorContext ctx) {
        String op1 = this.env.getOperand(); String op2 = this.env.getOperand();
        if(op1!=null && op2!=null){
            if(((op1.equalsIgnoreCase("false")) || op1.equalsIgnoreCase("true")) && ((op2.equalsIgnoreCase("false")) || op2.equalsIgnoreCase("true"))){
                OrScalarOperator sco = new OrScalarOperator(op1, op2);
                this.env.setOperand(String.valueOf(sco.performOperation()));
                this.env.setResultFunction(ctx.getText(), sco);
            }
        }
        else
            ConsoleManager.printMessage("Not a boolean expression");
    }

    @Override
    public void exitNotScalarOperator(VTLParser.NotScalarOperatorContext ctx){
        String op1 = this.env.getOperand();
        if(op1!=null){
            if((op1.equalsIgnoreCase("false")) || op1.equalsIgnoreCase("true")){
                NotScalarOperator sco = new NotScalarOperator(op1);
                this.env.setOperand(String.valueOf(sco.performOperation()));
                this.env.setResultFunction(ctx.getText(), sco);
            }
        }
        else
            ConsoleManager.printMessage("Not a boolean expression");
    }


    @Override
    public void exitLengthScalarOperator(VTLParser.LengthScalarOperatorContext ctx) {
        String op1 = this.env.getOperand();
        if(op1 != null && op1.charAt(0)=='"' && op1.charAt(op1.length()-1)=='"'){
            LengthScalarOperator sco = new LengthScalarOperator(op1);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
        else
            ConsoleManager.printMessage("String malformed");
    }

    @Override
    public void exitIfelseScalarOperator(VTLParser.IfelseScalarOperatorContext ctx){
        LinkedList<String> listCond = new LinkedList<>();
        String op = this.env.getOperand();
        while(op!=null){
            listCond.addFirst(op);
            op = this.env.getOperand();
        }
        IfScalarOperator sco = new IfScalarOperator(listCond);
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitNvlScalarOperator(VTLParser.NvlScalarOperatorContext ctx){
        String op1 = this.env.getOperand(); String op2 = this.env.getOperand();
        if(op1!=null && op2!=null){
            NvlScalarOperator sco = new NvlScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitInScalarOperator(VTLParser.InScalarOperatorContext ctx){
        String op1 = this.env.getOperand();
        if(op1.charAt(0)!='[' && op1.charAt(op1.length()-1)!=']')
            ConsoleManager.printMessage("Unvalid List");
        else{
            String op2 = this.env.getOperand();
            if(op1!=null && op2!=null){
                InScalarOperator sco = new InScalarOperator(op1,op2);
                this.env.setOperand(String.valueOf(sco.performOperation()));
                this.env.setResultFunction(ctx.getText(), sco);
            }
        }
    }


    @Override
    public void exitBetweenScalarOperator(VTLParser.BetweenScalarOperatorContext ctx){
        String op1 = this.env.getOperand(); String op2 = this.env.getOperand(); String op3 = this.env.getOperand();
        if(op1!=null && op2!=null && op3 != null){
            BetweenScalarOperator sco = new BetweenScalarOperator(op1, op2, op3);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
        else
            ConsoleManager.printMessage("Missing values");
    }

    @Override
    public void exitMatchCharacterScalarOperator(VTLParser.MatchCharacterScalarOperatorContext ctx){
        String op1 = this.env.getOperand(); String op2 = ctx.getChild(3).getText();
        if(op1!=null && op2!=null){
            MatchCharactersScalarOperator sco = new MatchCharactersScalarOperator(op1, op2);
            this.env.setOperand(String.valueOf(sco.performOperation()));
            this.env.setResultFunction(ctx.getText(), sco);
        }
    }

    @Override
    public void exitAggrSum(VTLParser.AggrSumContext ctx){
        LinkedList<String> ids = new LinkedList<>();
        if(this.env.getResultfunction(ctx.getChild(1).getText())!=null){
            Dataset d = (Dataset) this.env.getResultfunction(ctx.getChild(1).getText()).performOperation();
        }
        String op = this.env.getOperand();
        while(op!=null){
            ids.addFirst(op);
            op = this.env.getOperand();
        }


    }


    @Override
    public void exitCreateHierarchyRule(VTLParser.CreateHierarchyRuleContext ctx){
        Map<String, LinkedList<String>> map  = new HashMap<>();;
        LinkedList<Condition> conditions = new LinkedList<>();
        LinkedList<String> components;
        String maps_to = null;
        int i = 2;

        while(ctx.getChild(i)!=null && !ctx.getChild(i).getText().equals("when")){
            maps_to = ctx.getChild(i).getText();
            i++;
            if(ctx.getChild(i).getText().equals("=")){
                i++;
                components = new LinkedList<>();
                while(!(ctx.getChild(i).getText().equals(";"))){
                    if(!ctx.getChild(i).getText().equals("+"))
                        components.addFirst(ctx.getChild(i).getText());
                    i++;
                }
                i++;
                map.put(maps_to, components);
            }
        }

        String operator = null;
        String id = null;
        String value = null;
        String cond = null;
        i++;
                while(ctx.getChild(i)!=null){
                    id = ctx.getChild(i).getText();
                    i++;
                    operator = ctx.getChild(i).getText();
                    i++;
                    cond = ctx.getChild(i).getText();
                    i = i+2;
                    value = ctx.getChild(i).getText();
                    Condition c = new Condition(id, operator,cond, value);
                    conditions.addFirst(c);
                    i = i+3;
                }


        HierarchyRule hrl = new HierarchyRule(map,conditions);
        System.out.println("hierarchy_rule " + ctx.getChild(2).getText() + "\n");
        System.out.println(hrl.toString());
        this.env.setRule(ctx.getChild(2).getText(), hrl);
    }
}


