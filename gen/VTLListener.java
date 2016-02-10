// Generated from /Users/luigibellomarini/doc/workspace_bi/VTLEngine/src/main/antlr4/VTL.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VTLParser}.
 */
public interface VTLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code FunctionCommand}
	 * labeled alternative in {@link VTLParser#command}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCommand(VTLParser.FunctionCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCommand}
	 * labeled alternative in {@link VTLParser#command}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCommand(VTLParser.FunctionCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementCommand}
	 * labeled alternative in {@link VTLParser#command}.
	 * @param ctx the parse tree
	 */
	void enterStatementCommand(VTLParser.StatementCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementCommand}
	 * labeled alternative in {@link VTLParser#command}.
	 * @param ctx the parse tree
	 */
	void exitStatementCommand(VTLParser.StatementCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PureCommand}
	 * labeled alternative in {@link VTLParser#command}.
	 * @param ctx the parse tree
	 */
	void enterPureCommand(VTLParser.PureCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PureCommand}
	 * labeled alternative in {@link VTLParser#command}.
	 * @param ctx the parse tree
	 */
	void exitPureCommand(VTLParser.PureCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VTLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VTLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#quitOperator}.
	 * @param ctx the parse tree
	 */
	void enterQuitOperator(VTLParser.QuitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#quitOperator}.
	 * @param ctx the parse tree
	 */
	void exitQuitOperator(VTLParser.QuitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#getOperator}.
	 * @param ctx the parse tree
	 */
	void enterGetOperator(VTLParser.GetOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#getOperator}.
	 * @param ctx the parse tree
	 */
	void exitGetOperator(VTLParser.GetOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(VTLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(VTLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VTLParser#pure}.
	 * @param ctx the parse tree
	 */
	void enterPure(VTLParser.PureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VTLParser#pure}.
	 * @param ctx the parse tree
	 */
	void exitPure(VTLParser.PureContext ctx);
}