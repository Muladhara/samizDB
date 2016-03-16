package runtime;

import console.ConsoleManager;
import parser.VTLBaseListener;
import parser.VTLParser;
import runtime.logicalOperators.AndScalarOperator;
import runtime.logicalOperators.NotScalarOperator;
import runtime.logicalOperators.OrScalarOperator;
import runtime.logicalOperators.XorScalarOperator;
import runtime.mathematicalOperators.*;
import runtime.stringOperators.LengthScalarOperator;

public class AntlrVTLListener extends VTLBaseListener {

    private Environment env;

    public AntlrVTLListener(Environment env) {
        this.env = env;
    }

    @Override
    public void exitStatement(VTLParser.StatementContext ctx) {
        Function toAssign = this.env.getResultfunction(ctx.getChild(2).getText());
        if (toAssign == null) {
            ConsoleManager.printMessage("Undefined variable: " + ctx.getChild(2).getText());
        } else {
            //Variable v = new Variable(ctx.getChild(0).getText(), this.env.getResultfunction(ctx.getChild(2).getText()));
            this.env.setResultFunction(ctx.getChild(0).getText(), this.env.getResultfunction(ctx.getChild(2).getText()));
        }
    }

    @Override
    public void exitFunctionCommand(VTLParser.FunctionCommandContext ctx) {
        {
            Function result = this.env.getResultfunction(ctx.getChild(0).getText());
            if (result == null) {
                ConsoleManager.printMessage("Undefined variable: " + ctx.getChild(0).getText());
            } else {
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
        this.env.setOperand(ctx.getChild(0).getText().substring(1,ctx.getChild(0).getText().length()-1));
    }

    @Override
    public void exitBoolean(VTLParser.BooleanContext ctx) {
        this.env.setOperand(ctx.getChild(0).getText());
    }

    @Override
    public void exitSumScalarOperator(VTLParser.SumScalarOperatorContext ctx) {
        SumScalarOperator sco = new SumScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitDifferenceScalarOperator(VTLParser.DifferenceScalarOperatorContext ctx) {
        DifferenceScalarOperator sco = new DifferenceScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitProductScalarOperator(VTLParser.ProductScalarOperatorContext ctx) {
        ProductScalarOperator sco = new ProductScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitDivisionScalarOperator(VTLParser.DivisionScalarOperatorContext ctx) {
        DivisionScalarOperator sco = new DivisionScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitRoundScalarOperator(VTLParser.RoundScalarOperatorContext ctx) {
        RoundScalarOperator sco = new RoundScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitAbsScalarOperator(VTLParser.AbsScalarOperatorContext ctx) {
        AbsScalarOperator sco = new AbsScalarOperator(this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitTruncScalarOperator(VTLParser.TruncScalarOperatorContext ctx) {
        TruncScalarOperator sco = new TruncScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitExpScalarOperator(VTLParser.ExpScalarOperatorContext ctx) {
        ExpScalarOperator sco = new ExpScalarOperator(this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitLnScalarOperator(VTLParser.LnScalarOperatorContext ctx) {
        LnScalarOperator sco = new LnScalarOperator(this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitLogScalarOperator(VTLParser.LogScalarOperatorContext ctx) {
        LogScalarOperator sco = new LogScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitPowScalarOperator(VTLParser.PowScalarOperatorContext ctx) {
        PowerScalarOperator sco = new PowerScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitNrootScalarOperator(VTLParser.NrootScalarOperatorContext ctx) {
        NrootScalarOperator sco = new NrootScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitModScalarOperator(VTLParser.ModScalarOperatorContext ctx) {
        ModScalarOperator sco = new ModScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitAndScalarOperator(VTLParser.AndScalarOperatorContext ctx) {
        AndScalarOperator sco = new AndScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitXorScalarOperator(VTLParser.XorScalarOperatorContext ctx) {
        XorScalarOperator sco = new XorScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitOrScalarOperator(VTLParser.OrScalarOperatorContext ctx) {
        OrScalarOperator sco = new OrScalarOperator(this.env.getOperand(), this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitNotScalarOperator(VTLParser.NotScalarOperatorContext ctx){
        NotScalarOperator sco = new NotScalarOperator(this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }

    @Override
    public void exitLengthScalarOperator(VTLParser.LengthScalarOperatorContext ctx) {
        LengthScalarOperator sco = new LengthScalarOperator(this.env.getOperand());
        this.env.setOperand(String.valueOf(sco.performOperation()));
        this.env.setResultFunction(ctx.getText(), sco);
    }
}


