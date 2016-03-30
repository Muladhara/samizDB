// Generated from C:/Users/Roberto/Documents/GitHub/samizDB/src/main/antlr4\VTL.g4 by ANTLR 4.5.1
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
	 * Enter a parse tree produced by the {@code HierarchyCommand}
	 * labeled alternative in {@link VTLParser#command}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyCommand(VTLParser.HierarchyCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HierarchyCommand}
	 * labeled alternative in {@link VTLParser#command}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyCommand(VTLParser.HierarchyCommandContext ctx);
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
	 * Enter a parse tree produced by the {@code listBool}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterListBool(VTLParser.ListBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listBool}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitListBool(VTLParser.ListBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code majorScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterMajorScalarOperator(VTLParser.MajorScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code majorScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitMajorScalarOperator(VTLParser.MajorScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code roundScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterRoundScalarOperator(VTLParser.RoundScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roundScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitRoundScalarOperator(VTLParser.RoundScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uppertScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterUppertScalarOperator(VTLParser.UppertScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uppertScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitUppertScalarOperator(VTLParser.UppertScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nvlScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterNvlScalarOperator(VTLParser.NvlScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nvlScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitNvlScalarOperator(VTLParser.NvlScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matchCharacterScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterMatchCharacterScalarOperator(VTLParser.MatchCharacterScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matchCharacterScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitMatchCharacterScalarOperator(VTLParser.MatchCharacterScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nrootScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterNrootScalarOperator(VTLParser.NrootScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nrootScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitNrootScalarOperator(VTLParser.NrootScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterPowScalarOperator(VTLParser.PowScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitPowScalarOperator(VTLParser.PowScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterAndScalarOperator(VTLParser.AndScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitAndScalarOperator(VTLParser.AndScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lowerScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterLowerScalarOperator(VTLParser.LowerScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lowerScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitLowerScalarOperator(VTLParser.LowerScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggrSum}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterAggrSum(VTLParser.AggrSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggrSum}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitAggrSum(VTLParser.AggrSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterId(VTLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitId(VTLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterGetOperator(VTLParser.GetOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitGetOperator(VTLParser.GetOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterDouble(VTLParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitDouble(VTLParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listInt}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterListInt(VTLParser.ListIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listInt}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitListInt(VTLParser.ListIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterIsNullScalarOperator(VTLParser.IsNullScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitIsNullScalarOperator(VTLParser.IsNullScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterModScalarOperator(VTLParser.ModScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitModScalarOperator(VTLParser.ModScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parFunc}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterParFunc(VTLParser.ParFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parFunc}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitParFunc(VTLParser.ParFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterBetweenScalarOperator(VTLParser.BetweenScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitBetweenScalarOperator(VTLParser.BetweenScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterXorScalarOperator(VTLParser.XorScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitXorScalarOperator(VTLParser.XorScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substrScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterSubstrScalarOperator(VTLParser.SubstrScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitSubstrScalarOperator(VTLParser.SubstrScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterAbsScalarOperator(VTLParser.AbsScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitAbsScalarOperator(VTLParser.AbsScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code majorEqualScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterMajorEqualScalarOperator(VTLParser.MajorEqualScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code majorEqualScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitMajorEqualScalarOperator(VTLParser.MajorEqualScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterNotScalarOperator(VTLParser.NotScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitNotScalarOperator(VTLParser.NotScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterExpScalarOperator(VTLParser.ExpScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitExpScalarOperator(VTLParser.ExpScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minorScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterMinorScalarOperator(VTLParser.MinorScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minorScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitMinorScalarOperator(VTLParser.MinorScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trimScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterTrimScalarOperator(VTLParser.TrimScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitTrimScalarOperator(VTLParser.TrimScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterEqualScalarOperator(VTLParser.EqualScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitEqualScalarOperator(VTLParser.EqualScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterString(VTLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitString(VTLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterLengthScalarOperator(VTLParser.LengthScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitLengthScalarOperator(VTLParser.LengthScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pattern}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterPattern(VTLParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pattern}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitPattern(VTLParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterSumScalarOperator(VTLParser.SumScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitSumScalarOperator(VTLParser.SumScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listNum}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterListNum(VTLParser.ListNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listNum}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitListNum(VTLParser.ListNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lnScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterLnScalarOperator(VTLParser.LnScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lnScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitLnScalarOperator(VTLParser.LnScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code differenceScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceScalarOperator(VTLParser.DifferenceScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code differenceScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceScalarOperator(VTLParser.DifferenceScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterOrScalarOperator(VTLParser.OrScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitOrScalarOperator(VTLParser.OrScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minorEqualScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterMinorEqualScalarOperator(VTLParser.MinorEqualScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minorEqualScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitMinorEqualScalarOperator(VTLParser.MinorEqualScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterConcatScalarOperator(VTLParser.ConcatScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitConcatScalarOperator(VTLParser.ConcatScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusFunc}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterMinusFunc(VTLParser.MinusFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusFunc}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitMinusFunc(VTLParser.MinusFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterDivisionScalarOperator(VTLParser.DivisionScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitDivisionScalarOperator(VTLParser.DivisionScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelseScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterIfelseScalarOperator(VTLParser.IfelseScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelseScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitIfelseScalarOperator(VTLParser.IfelseScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexofScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterIndexofScalarOperator(VTLParser.IndexofScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexofScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitIndexofScalarOperator(VTLParser.IndexofScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listStr}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterListStr(VTLParser.ListStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listStr}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitListStr(VTLParser.ListStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterInt(VTLParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitInt(VTLParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(VTLParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(VTLParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterLogScalarOperator(VTLParser.LogScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitLogScalarOperator(VTLParser.LogScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterTruncScalarOperator(VTLParser.TruncScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitTruncScalarOperator(VTLParser.TruncScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterInScalarOperator(VTLParser.InScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitInScalarOperator(VTLParser.InScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code productScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterProductScalarOperator(VTLParser.ProductScalarOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code productScalarOperator}
	 * labeled alternative in {@link VTLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitProductScalarOperator(VTLParser.ProductScalarOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createHierarchyRule}
	 * labeled alternative in {@link VTLParser#hierarchy_rule}.
	 * @param ctx the parse tree
	 */
	void enterCreateHierarchyRule(VTLParser.CreateHierarchyRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createHierarchyRule}
	 * labeled alternative in {@link VTLParser#hierarchy_rule}.
	 * @param ctx the parse tree
	 */
	void exitCreateHierarchyRule(VTLParser.CreateHierarchyRuleContext ctx);
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