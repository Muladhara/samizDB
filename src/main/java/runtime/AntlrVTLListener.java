package runtime;

import console.ConsoleManager;
import parser.VTLBaseListener;
import parser.VTLParser;
import persistence.DatasetNotFoundException;

public class AntlrVTLListener extends VTLBaseListener {

    private Environment env;

    public AntlrVTLListener(Environment env) {
        this.env = env;
    }

    @Override
    public void exitStatement(VTLParser.StatementContext ctx) {
        Function toAssign = this.env.getResultfunction(ctx.getChild(2).getText());
        if(toAssign==null) {
            ConsoleManager.printMessage("Undefined variable: " + ctx.getChild(2).getText());
        } else {
            Variable v = new Variable(ctx.getChild(0).getText(), this.env.getResultfunction(ctx.getChild(2).getText()));
            this.env.setResultFunction(ctx.getChild(0).getText(), v);
        }
    }

    @Override
    public void exitFunctionCommand(VTLParser.FunctionCommandContext ctx) {
        try {
            Function result = this.env.getResultfunction(ctx.getChild(0).getText());
            if(result==null) {
                ConsoleManager.printMessage("Undefined variable: " + ctx.getChild(0).getText());
            } else {
                ConsoleManager.printMessage(this.env.getResultfunction(ctx.getChild(0).getText()).getDataset().toString());
            }

        } catch (DatasetNotFoundException e) {
            ConsoleManager.printMessage(e.getMessage());
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

}
