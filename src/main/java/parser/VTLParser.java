package parser;// Generated from E:/Recovery/Codice SamyDB/samizDB-master - Copia/src/main/antlr4\VTL.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ASSIGN_SYMBOL=8, 
		QUIT_TOKEN=9, GET_TOKEN=10, INTEGER_TOKEN=11, NUMERIC_TOKEN=12, BOOL_TOKEN=13, 
		STRING_TOKEN=14, LIST_BOOL_TOKEN=15, LIST_INTEGER_TOKEN=16, LIST_NUMERIC_TOKEN=17, 
		LIST_STRING_TOKEN=18, SUM_TOKEN=19, DIFFERENCE_TOKEN=20, PRODUCT_TOKEN=21, 
		DIVISION_TOKEN=22, ROUND_TOKEN=23, ABS_TOKEN=24, TRUNC_TOKEN=25, EXP_TOKEN=26, 
		LN_TOKEN=27, LOG_TOKEN=28, POWER_TOKEN=29, NROOT_TOKEN=30, MOD_TOKEN=31, 
		AND_TOKEN=32, OR_TOKEN=33, XOR_TOKEN=34, NOT_TOKEN=35, IN_TOKEN=36, BETWEEN_TOKEN=37, 
		ISNULL_TOKEN=38, MATCH_CHARACTERS_TOKEN=39, MATCH_VALUES_TOKEN=40, LENGTH_TOKEN=41, 
		TRIM_TOKEN=42, UPPER_TOKEN=43, LOWER_TOKEN=44, SUBSTR_TOKEN=45, INDEXOF_TOKEN=46, 
		IF_TOKEN=47, THEN_TOKEN=48, ELSE_TOKEN=49, ELSEIF_TOKEN=50, NVL_TOKEN=51, 
		AGGR_SUM_TOKEN=52, AGGR_AVG_TOKEN=53, AGGR_MEDIAN_TOKEN=54, AGGR_COUNT_TOKEN=55, 
		AGGR_COUNT_DISTINCT_TOKEN=56, AGGR_MIN_TOKEN=57, AGGR_MAX_TOKEN=58, ID=59, 
		DATASET_ID=60, FIELD_SEP=61, URL=62, MONGO_PATH=63, LINUX_PATH=64, WINDOWS_PATH=65;
	public static final int
		RULE_command = 0, RULE_statement = 1, RULE_quitOperator = 2, RULE_function = 3, 
		RULE_pure = 4;
	public static final String[] ruleNames = {
		"command", "statement", "quitOperator", "function", "pure"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'(\"'", "'\")'", "'('", "')'", "','", "'( '", "' )'", "':='", "'QUIT'", 
		"'GET'", null, null, null, null, null, null, null, null, "'+'", "'-'", 
		"'*'", null, "'round'", "'abs'", "'trunc'", "'exp'", "'ln'", "'log'", 
		"'pow'", "'nroot'", "'mod'", "' and '", "' or '", "' xor '", "'not '", 
		"' in '", "' between '", "'isnull'", "'match_characters'", "'match_values'", 
		"'length'", "'trim'", "'upper'", "'lower'", "'substr'", "'indexof'", "'if '", 
		"' then '", "' else '", "' elseif '", "'nvl'", "'sum'", "'avg'", "'median'", 
		"'count'", "'count_distinct'", "'min'", "'max'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ASSIGN_SYMBOL", "QUIT_TOKEN", 
		"GET_TOKEN", "INTEGER_TOKEN", "NUMERIC_TOKEN", "BOOL_TOKEN", "STRING_TOKEN", 
		"LIST_BOOL_TOKEN", "LIST_INTEGER_TOKEN", "LIST_NUMERIC_TOKEN", "LIST_STRING_TOKEN", 
		"SUM_TOKEN", "DIFFERENCE_TOKEN", "PRODUCT_TOKEN", "DIVISION_TOKEN", "ROUND_TOKEN", 
		"ABS_TOKEN", "TRUNC_TOKEN", "EXP_TOKEN", "LN_TOKEN", "LOG_TOKEN", "POWER_TOKEN", 
		"NROOT_TOKEN", "MOD_TOKEN", "AND_TOKEN", "OR_TOKEN", "XOR_TOKEN", "NOT_TOKEN", 
		"IN_TOKEN", "BETWEEN_TOKEN", "ISNULL_TOKEN", "MATCH_CHARACTERS_TOKEN", 
		"MATCH_VALUES_TOKEN", "LENGTH_TOKEN", "TRIM_TOKEN", "UPPER_TOKEN", "LOWER_TOKEN", 
		"SUBSTR_TOKEN", "INDEXOF_TOKEN", "IF_TOKEN", "THEN_TOKEN", "ELSE_TOKEN", 
		"ELSEIF_TOKEN", "NVL_TOKEN", "AGGR_SUM_TOKEN", "AGGR_AVG_TOKEN", "AGGR_MEDIAN_TOKEN", 
		"AGGR_COUNT_TOKEN", "AGGR_COUNT_DISTINCT_TOKEN", "AGGR_MIN_TOKEN", "AGGR_MAX_TOKEN", 
		"ID", "DATASET_ID", "FIELD_SEP", "URL", "MONGO_PATH", "LINUX_PATH", "WINDOWS_PATH"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementCommandContext extends CommandContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterStatementCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitStatementCommand(this);
		}
	}
	public static class PureCommandContext extends CommandContext {
		public PureContext pure() {
			return getRuleContext(PureContext.class,0);
		}
		public PureCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterPureCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitPureCommand(this);
		}
	}
	public static class FunctionCommandContext extends CommandContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterFunctionCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitFunctionCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(13);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new FunctionCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				function(0);
				}
				break;
			case 2:
				_localctx = new StatementCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				statement();
				}
				break;
			case 3:
				_localctx = new PureCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				pure();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VTLParser.ID, 0); }
		public TerminalNode ASSIGN_SYMBOL() { return getToken(VTLParser.ASSIGN_SYMBOL, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(ID);
			setState(16);
			match(ASSIGN_SYMBOL);
			setState(17);
			function(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuitOperatorContext extends ParserRuleContext {
		public TerminalNode QUIT_TOKEN() { return getToken(VTLParser.QUIT_TOKEN, 0); }
		public QuitOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quitOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterQuitOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitQuitOperator(this);
		}
	}

	public final QuitOperatorContext quitOperator() throws RecognitionException {
		QuitOperatorContext _localctx = new QuitOperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_quitOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(QUIT_TOKEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrimScalarOperatorContext extends FunctionContext {
		public TerminalNode TRIM_TOKEN() { return getToken(VTLParser.TRIM_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TrimScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterTrimScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitTrimScalarOperator(this);
		}
	}
	public static class StringContext extends FunctionContext {
		public TerminalNode STRING_TOKEN() { return getToken(VTLParser.STRING_TOKEN, 0); }
		public StringContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitString(this);
		}
	}
	public static class LengthScalarOperatorContext extends FunctionContext {
		public TerminalNode LENGTH_TOKEN() { return getToken(VTLParser.LENGTH_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public LengthScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterLengthScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitLengthScalarOperator(this);
		}
	}
	public static class IsnullScalarOperatorContext extends FunctionContext {
		public TerminalNode ISNULL_TOKEN() { return getToken(VTLParser.ISNULL_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IsnullScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterIsnullScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitIsnullScalarOperator(this);
		}
	}
	public static class RoundScalarOperatorContext extends FunctionContext {
		public TerminalNode ROUND_TOKEN() { return getToken(VTLParser.ROUND_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public RoundScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterRoundScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitRoundScalarOperator(this);
		}
	}
	public static class UppertScalarOperatorContext extends FunctionContext {
		public TerminalNode UPPER_TOKEN() { return getToken(VTLParser.UPPER_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public UppertScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterUppertScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitUppertScalarOperator(this);
		}
	}
	public static class SumScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode SUM_TOKEN() { return getToken(VTLParser.SUM_TOKEN, 0); }
		public SumScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterSumScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitSumScalarOperator(this);
		}
	}
	public static class NvlScalarOperatorContext extends FunctionContext {
		public TerminalNode NVL_TOKEN() { return getToken(VTLParser.NVL_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public NvlScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterNvlScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitNvlScalarOperator(this);
		}
	}
	public static class LnScalarOperatorContext extends FunctionContext {
		public TerminalNode LN_TOKEN() { return getToken(VTLParser.LN_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public LnScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterLnScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitLnScalarOperator(this);
		}
	}
	public static class NrootScalarOperatorContext extends FunctionContext {
		public TerminalNode NROOT_TOKEN() { return getToken(VTLParser.NROOT_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public NrootScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterNrootScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitNrootScalarOperator(this);
		}
	}
	public static class DifferenceScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode DIFFERENCE_TOKEN() { return getToken(VTLParser.DIFFERENCE_TOKEN, 0); }
		public DifferenceScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterDifferenceScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitDifferenceScalarOperator(this);
		}
	}
	public static class OrScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode OR_TOKEN() { return getToken(VTLParser.OR_TOKEN, 0); }
		public OrScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterOrScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitOrScalarOperator(this);
		}
	}
	public static class PowScalarOperatorContext extends FunctionContext {
		public TerminalNode POWER_TOKEN() { return getToken(VTLParser.POWER_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public PowScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterPowScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitPowScalarOperator(this);
		}
	}
	public static class AndScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode AND_TOKEN() { return getToken(VTLParser.AND_TOKEN, 0); }
		public AndScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAndScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAndScalarOperator(this);
		}
	}
	public static class LowerScalarOperatorContext extends FunctionContext {
		public TerminalNode LOWER_TOKEN() { return getToken(VTLParser.LOWER_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public LowerScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterLowerScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitLowerScalarOperator(this);
		}
	}
	public static class IdContext extends FunctionContext {
		public TerminalNode ID() { return getToken(VTLParser.ID, 0); }
		public IdContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitId(this);
		}
	}
	public static class MinusFuncContext extends FunctionContext {
		public TerminalNode DIFFERENCE_TOKEN() { return getToken(VTLParser.DIFFERENCE_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public MinusFuncContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterMinusFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitMinusFunc(this);
		}
	}
	public static class DivisionScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode DIVISION_TOKEN() { return getToken(VTLParser.DIVISION_TOKEN, 0); }
		public DivisionScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterDivisionScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitDivisionScalarOperator(this);
		}
	}
	public static class GetOperatorContext extends FunctionContext {
		public TerminalNode GET_TOKEN() { return getToken(VTLParser.GET_TOKEN, 0); }
		public TerminalNode DATASET_ID() { return getToken(VTLParser.DATASET_ID, 0); }
		public GetOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterGetOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitGetOperator(this);
		}
	}
	public static class MatchCharactersScalarOperatorContext extends FunctionContext {
		public TerminalNode MATCH_CHARACTERS_TOKEN() { return getToken(VTLParser.MATCH_CHARACTERS_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public MatchCharactersScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterMatchCharactersScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitMatchCharactersScalarOperator(this);
		}
	}
	public static class IfelseScalarOperatorContext extends FunctionContext {
		public TerminalNode IF_TOKEN() { return getToken(VTLParser.IF_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> THEN_TOKEN() { return getTokens(VTLParser.THEN_TOKEN); }
		public TerminalNode THEN_TOKEN(int i) {
			return getToken(VTLParser.THEN_TOKEN, i);
		}
		public TerminalNode ELSE_TOKEN() { return getToken(VTLParser.ELSE_TOKEN, 0); }
		public List<TerminalNode> ELSEIF_TOKEN() { return getTokens(VTLParser.ELSEIF_TOKEN); }
		public TerminalNode ELSEIF_TOKEN(int i) {
			return getToken(VTLParser.ELSEIF_TOKEN, i);
		}
		public IfelseScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterIfelseScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitIfelseScalarOperator(this);
		}
	}
	public static class DoubleContext extends FunctionContext {
		public TerminalNode NUMERIC_TOKEN() { return getToken(VTLParser.NUMERIC_TOKEN, 0); }
		public DoubleContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitDouble(this);
		}
	}
	public static class IndexofScalarOperatorContext extends FunctionContext {
		public TerminalNode INDEXOF_TOKEN() { return getToken(VTLParser.INDEXOF_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public IndexofScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterIndexofScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitIndexofScalarOperator(this);
		}
	}
	public static class ModScalarOperatorContext extends FunctionContext {
		public TerminalNode MOD_TOKEN() { return getToken(VTLParser.MOD_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ModScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterModScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitModScalarOperator(this);
		}
	}
	public static class ParFuncContext extends FunctionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ParFuncContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterParFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitParFunc(this);
		}
	}
	public static class BetweenScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode BETWEEN_TOKEN() { return getToken(VTLParser.BETWEEN_TOKEN, 0); }
		public TerminalNode AND_TOKEN() { return getToken(VTLParser.AND_TOKEN, 0); }
		public BetweenScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterBetweenScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitBetweenScalarOperator(this);
		}
	}
	public static class IntContext extends FunctionContext {
		public TerminalNode INTEGER_TOKEN() { return getToken(VTLParser.INTEGER_TOKEN, 0); }
		public IntContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitInt(this);
		}
	}
	public static class XorScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode XOR_TOKEN() { return getToken(VTLParser.XOR_TOKEN, 0); }
		public XorScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterXorScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitXorScalarOperator(this);
		}
	}
	public static class BooleanContext extends FunctionContext {
		public TerminalNode BOOL_TOKEN() { return getToken(VTLParser.BOOL_TOKEN, 0); }
		public BooleanContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitBoolean(this);
		}
	}
	public static class LogScalarOperatorContext extends FunctionContext {
		public TerminalNode LOG_TOKEN() { return getToken(VTLParser.LOG_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public LogScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterLogScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitLogScalarOperator(this);
		}
	}
	public static class SubstrScalarOperatorContext extends FunctionContext {
		public TerminalNode SUBSTR_TOKEN() { return getToken(VTLParser.SUBSTR_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public SubstrScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterSubstrScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitSubstrScalarOperator(this);
		}
	}
	public static class AbsScalarOperatorContext extends FunctionContext {
		public TerminalNode ABS_TOKEN() { return getToken(VTLParser.ABS_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public AbsScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAbsScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAbsScalarOperator(this);
		}
	}
	public static class TruncScalarOperatorContext extends FunctionContext {
		public TerminalNode TRUNC_TOKEN() { return getToken(VTLParser.TRUNC_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TruncScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterTruncScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitTruncScalarOperator(this);
		}
	}
	public static class NotScalarOperatorContext extends FunctionContext {
		public TerminalNode NOT_TOKEN() { return getToken(VTLParser.NOT_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public NotScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterNotScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitNotScalarOperator(this);
		}
	}
	public static class ExpScalarOperatorContext extends FunctionContext {
		public TerminalNode EXP_TOKEN() { return getToken(VTLParser.EXP_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExpScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterExpScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitExpScalarOperator(this);
		}
	}
	public static class ProductScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode PRODUCT_TOKEN() { return getToken(VTLParser.PRODUCT_TOKEN, 0); }
		public ProductScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterProductScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitProductScalarOperator(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		return function(0);
	}

	private FunctionContext function(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionContext _localctx = new FunctionContext(_ctx, _parentState);
		FunctionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_function, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			switch (_input.LA(1)) {
			case DIFFERENCE_TOKEN:
				{
				_localctx = new MinusFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(22);
				match(DIFFERENCE_TOKEN);
				setState(23);
				function(31);
				}
				break;
			case NOT_TOKEN:
				{
				_localctx = new NotScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(NOT_TOKEN);
				setState(25);
				function(15);
				}
				break;
			case BOOL_TOKEN:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(BOOL_TOKEN);
				}
				break;
			case STRING_TOKEN:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(STRING_TOKEN);
				}
				break;
			case GET_TOKEN:
				{
				_localctx = new GetOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(GET_TOKEN);
				setState(29);
				match(T__0);
				setState(30);
				match(DATASET_ID);
				setState(31);
				match(T__1);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(ID);
				}
				break;
			case T__2:
				{
				_localctx = new ParFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(T__2);
				setState(34);
				function(0);
				setState(35);
				match(T__3);
				}
				break;
			case INTEGER_TOKEN:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(INTEGER_TOKEN);
				}
				break;
			case NUMERIC_TOKEN:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(NUMERIC_TOKEN);
				}
				break;
			case ROUND_TOKEN:
				{
				_localctx = new RoundScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(ROUND_TOKEN);
				setState(40);
				match(T__2);
				setState(41);
				function(0);
				setState(42);
				match(T__4);
				setState(43);
				function(0);
				setState(44);
				match(T__3);
				}
				break;
			case ABS_TOKEN:
				{
				_localctx = new AbsScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(ABS_TOKEN);
				setState(47);
				match(T__2);
				setState(48);
				function(0);
				setState(49);
				match(T__3);
				}
				break;
			case TRUNC_TOKEN:
				{
				_localctx = new TruncScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(TRUNC_TOKEN);
				setState(52);
				match(T__2);
				setState(53);
				function(0);
				setState(54);
				match(T__4);
				setState(55);
				function(0);
				setState(56);
				match(T__3);
				}
				break;
			case EXP_TOKEN:
				{
				_localctx = new ExpScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(EXP_TOKEN);
				setState(59);
				match(T__2);
				setState(60);
				function(0);
				setState(61);
				match(T__3);
				}
				break;
			case LN_TOKEN:
				{
				_localctx = new LnScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(LN_TOKEN);
				setState(64);
				match(T__2);
				setState(65);
				function(0);
				setState(66);
				match(T__3);
				}
				break;
			case LOG_TOKEN:
				{
				_localctx = new LogScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(LOG_TOKEN);
				setState(69);
				match(T__2);
				setState(70);
				function(0);
				setState(71);
				match(T__4);
				setState(72);
				function(0);
				setState(73);
				match(T__3);
				}
				break;
			case POWER_TOKEN:
				{
				_localctx = new PowScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(POWER_TOKEN);
				setState(76);
				match(T__2);
				setState(77);
				function(0);
				setState(78);
				match(T__4);
				setState(79);
				function(0);
				setState(80);
				match(T__3);
				}
				break;
			case NROOT_TOKEN:
				{
				_localctx = new NrootScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(NROOT_TOKEN);
				setState(83);
				match(T__2);
				setState(84);
				function(0);
				setState(85);
				match(T__4);
				setState(86);
				function(0);
				setState(87);
				match(T__3);
				}
				break;
			case MOD_TOKEN:
				{
				_localctx = new ModScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(MOD_TOKEN);
				setState(90);
				match(T__2);
				setState(91);
				function(0);
				setState(92);
				match(T__4);
				setState(93);
				function(0);
				setState(94);
				match(T__3);
				}
				break;
			case ISNULL_TOKEN:
				{
				_localctx = new IsnullScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(ISNULL_TOKEN);
				setState(97);
				match(T__2);
				setState(98);
				function(0);
				setState(99);
				match(T__3);
				}
				break;
			case MATCH_CHARACTERS_TOKEN:
				{
				_localctx = new MatchCharactersScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(MATCH_CHARACTERS_TOKEN);
				setState(102);
				match(T__2);
				setState(103);
				function(0);
				setState(104);
				match(T__4);
				setState(105);
				function(0);
				setState(106);
				match(T__3);
				}
				break;
			case IF_TOKEN:
				{
				_localctx = new IfelseScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(IF_TOKEN);
				setState(109);
				function(0);
				setState(110);
				match(THEN_TOKEN);
				setState(111);
				function(0);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF_TOKEN) {
					{
					{
					setState(112);
					match(ELSEIF_TOKEN);
					setState(113);
					function(0);
					setState(114);
					match(THEN_TOKEN);
					setState(115);
					function(0);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(ELSE_TOKEN);
				setState(123);
				function(0);
				}
				break;
			case NVL_TOKEN:
				{
				_localctx = new NvlScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(NVL_TOKEN);
				setState(126);
				match(T__2);
				setState(127);
				function(0);
				setState(128);
				match(T__4);
				setState(129);
				function(0);
				setState(130);
				match(T__3);
				}
				break;
			case LENGTH_TOKEN:
				{
				_localctx = new LengthScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(LENGTH_TOKEN);
				setState(133);
				match(T__5);
				setState(134);
				function(0);
				setState(135);
				match(T__6);
				}
				break;
			case TRIM_TOKEN:
				{
				_localctx = new TrimScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(TRIM_TOKEN);
				setState(138);
				match(T__5);
				setState(139);
				function(0);
				setState(140);
				match(T__6);
				}
				break;
			case UPPER_TOKEN:
				{
				_localctx = new UppertScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(UPPER_TOKEN);
				setState(143);
				match(T__5);
				setState(144);
				function(0);
				setState(145);
				match(T__6);
				}
				break;
			case LOWER_TOKEN:
				{
				_localctx = new LowerScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(LOWER_TOKEN);
				setState(148);
				match(T__5);
				setState(149);
				function(0);
				setState(150);
				match(T__6);
				}
				break;
			case SUBSTR_TOKEN:
				{
				_localctx = new SubstrScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(SUBSTR_TOKEN);
				setState(153);
				match(T__5);
				setState(154);
				function(0);
				setState(155);
				match(T__4);
				setState(156);
				function(0);
				setState(159);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(157);
					match(T__4);
					setState(158);
					function(0);
					}
				}

				setState(161);
				match(T__6);
				}
				break;
			case INDEXOF_TOKEN:
				{
				_localctx = new IndexofScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(INDEXOF_TOKEN);
				setState(164);
				match(T__5);
				setState(165);
				function(0);
				setState(166);
				match(T__4);
				setState(167);
				function(0);
				setState(168);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ProductScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(172);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(173);
						match(PRODUCT_TOKEN);
						setState(174);
						function(31);
						}
						break;
					case 2:
						{
						_localctx = new DivisionScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(175);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(176);
						match(DIVISION_TOKEN);
						setState(177);
						function(30);
						}
						break;
					case 3:
						{
						_localctx = new SumScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(178);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(179);
						match(SUM_TOKEN);
						setState(180);
						function(29);
						}
						break;
					case 4:
						{
						_localctx = new DifferenceScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(181);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(182);
						match(DIFFERENCE_TOKEN);
						setState(183);
						function(28);
						}
						break;
					case 5:
						{
						_localctx = new AndScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(184);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(185);
						match(AND_TOKEN);
						setState(186);
						function(15);
						}
						break;
					case 6:
						{
						_localctx = new OrScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(187);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(188);
						match(OR_TOKEN);
						setState(189);
						function(14);
						}
						break;
					case 7:
						{
						_localctx = new XorScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(190);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(191);
						match(XOR_TOKEN);
						setState(192);
						function(13);
						}
						break;
					case 8:
						{
						_localctx = new BetweenScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(193);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(194);
						match(BETWEEN_TOKEN);
						setState(195);
						function(0);
						setState(196);
						match(AND_TOKEN);
						setState(197);
						function(12);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PureContext extends ParserRuleContext {
		public QuitOperatorContext quitOperator() {
			return getRuleContext(QuitOperatorContext.class,0);
		}
		public PureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterPure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitPure(this);
		}
	}

	public final PureContext pure() throws RecognitionException {
		PureContext _localctx = new PureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			quitOperator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return function_sempred((FunctionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 30);
		case 1:
			return precpred(_ctx, 29);
		case 2:
			return precpred(_ctx, 28);
		case 3:
			return precpred(_ctx, 27);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3C\u00d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\5\2\20\n\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5x\n\5\f\5\16\5{\13\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00a2\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ad\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00ca\n\5\f\5\16\5\u00cd\13\5"+
		"\3\6\3\6\3\6\2\3\b\7\2\4\6\b\n\2\2\u00f2\2\17\3\2\2\2\4\21\3\2\2\2\6\25"+
		"\3\2\2\2\b\u00ac\3\2\2\2\n\u00ce\3\2\2\2\f\20\5\b\5\2\r\20\5\4\3\2\16"+
		"\20\5\n\6\2\17\f\3\2\2\2\17\r\3\2\2\2\17\16\3\2\2\2\20\3\3\2\2\2\21\22"+
		"\7=\2\2\22\23\7\n\2\2\23\24\5\b\5\2\24\5\3\2\2\2\25\26\7\13\2\2\26\7\3"+
		"\2\2\2\27\30\b\5\1\2\30\31\7\26\2\2\31\u00ad\5\b\5!\32\33\7%\2\2\33\u00ad"+
		"\5\b\5\21\34\u00ad\7\17\2\2\35\u00ad\7\20\2\2\36\37\7\f\2\2\37 \7\3\2"+
		"\2 !\7>\2\2!\u00ad\7\4\2\2\"\u00ad\7=\2\2#$\7\5\2\2$%\5\b\5\2%&\7\6\2"+
		"\2&\u00ad\3\2\2\2\'\u00ad\7\r\2\2(\u00ad\7\16\2\2)*\7\31\2\2*+\7\5\2\2"+
		"+,\5\b\5\2,-\7\7\2\2-.\5\b\5\2./\7\6\2\2/\u00ad\3\2\2\2\60\61\7\32\2\2"+
		"\61\62\7\5\2\2\62\63\5\b\5\2\63\64\7\6\2\2\64\u00ad\3\2\2\2\65\66\7\33"+
		"\2\2\66\67\7\5\2\2\678\5\b\5\289\7\7\2\29:\5\b\5\2:;\7\6\2\2;\u00ad\3"+
		"\2\2\2<=\7\34\2\2=>\7\5\2\2>?\5\b\5\2?@\7\6\2\2@\u00ad\3\2\2\2AB\7\35"+
		"\2\2BC\7\5\2\2CD\5\b\5\2DE\7\6\2\2E\u00ad\3\2\2\2FG\7\36\2\2GH\7\5\2\2"+
		"HI\5\b\5\2IJ\7\7\2\2JK\5\b\5\2KL\7\6\2\2L\u00ad\3\2\2\2MN\7\37\2\2NO\7"+
		"\5\2\2OP\5\b\5\2PQ\7\7\2\2QR\5\b\5\2RS\7\6\2\2S\u00ad\3\2\2\2TU\7 \2\2"+
		"UV\7\5\2\2VW\5\b\5\2WX\7\7\2\2XY\5\b\5\2YZ\7\6\2\2Z\u00ad\3\2\2\2[\\\7"+
		"!\2\2\\]\7\5\2\2]^\5\b\5\2^_\7\7\2\2_`\5\b\5\2`a\7\6\2\2a\u00ad\3\2\2"+
		"\2bc\7(\2\2cd\7\5\2\2de\5\b\5\2ef\7\6\2\2f\u00ad\3\2\2\2gh\7)\2\2hi\7"+
		"\5\2\2ij\5\b\5\2jk\7\7\2\2kl\5\b\5\2lm\7\6\2\2m\u00ad\3\2\2\2no\7\61\2"+
		"\2op\5\b\5\2pq\7\62\2\2qy\5\b\5\2rs\7\64\2\2st\5\b\5\2tu\7\62\2\2uv\5"+
		"\b\5\2vx\3\2\2\2wr\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3"+
		"\2\2\2|}\7\63\2\2}~\5\b\5\2~\u00ad\3\2\2\2\177\u0080\7\65\2\2\u0080\u0081"+
		"\7\5\2\2\u0081\u0082\5\b\5\2\u0082\u0083\7\7\2\2\u0083\u0084\5\b\5\2\u0084"+
		"\u0085\7\6\2\2\u0085\u00ad\3\2\2\2\u0086\u0087\7+\2\2\u0087\u0088\7\b"+
		"\2\2\u0088\u0089\5\b\5\2\u0089\u008a\7\t\2\2\u008a\u00ad\3\2\2\2\u008b"+
		"\u008c\7,\2\2\u008c\u008d\7\b\2\2\u008d\u008e\5\b\5\2\u008e\u008f\7\t"+
		"\2\2\u008f\u00ad\3\2\2\2\u0090\u0091\7-\2\2\u0091\u0092\7\b\2\2\u0092"+
		"\u0093\5\b\5\2\u0093\u0094\7\t\2\2\u0094\u00ad\3\2\2\2\u0095\u0096\7."+
		"\2\2\u0096\u0097\7\b\2\2\u0097\u0098\5\b\5\2\u0098\u0099\7\t\2\2\u0099"+
		"\u00ad\3\2\2\2\u009a\u009b\7/\2\2\u009b\u009c\7\b\2\2\u009c\u009d\5\b"+
		"\5\2\u009d\u009e\7\7\2\2\u009e\u00a1\5\b\5\2\u009f\u00a0\7\7\2\2\u00a0"+
		"\u00a2\5\b\5\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00ad\3\2\2\2\u00a5\u00a6\7\60\2\2\u00a6"+
		"\u00a7\7\b\2\2\u00a7\u00a8\5\b\5\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\5\b"+
		"\5\2\u00aa\u00ab\7\t\2\2\u00ab\u00ad\3\2\2\2\u00ac\27\3\2\2\2\u00ac\32"+
		"\3\2\2\2\u00ac\34\3\2\2\2\u00ac\35\3\2\2\2\u00ac\36\3\2\2\2\u00ac\"\3"+
		"\2\2\2\u00ac#\3\2\2\2\u00ac\'\3\2\2\2\u00ac(\3\2\2\2\u00ac)\3\2\2\2\u00ac"+
		"\60\3\2\2\2\u00ac\65\3\2\2\2\u00ac<\3\2\2\2\u00acA\3\2\2\2\u00acF\3\2"+
		"\2\2\u00acM\3\2\2\2\u00acT\3\2\2\2\u00ac[\3\2\2\2\u00acb\3\2\2\2\u00ac"+
		"g\3\2\2\2\u00acn\3\2\2\2\u00ac\177\3\2\2\2\u00ac\u0086\3\2\2\2\u00ac\u008b"+
		"\3\2\2\2\u00ac\u0090\3\2\2\2\u00ac\u0095\3\2\2\2\u00ac\u009a\3\2\2\2\u00ac"+
		"\u00a5\3\2\2\2\u00ad\u00cb\3\2\2\2\u00ae\u00af\f \2\2\u00af\u00b0\7\27"+
		"\2\2\u00b0\u00ca\5\b\5!\u00b1\u00b2\f\37\2\2\u00b2\u00b3\7\30\2\2\u00b3"+
		"\u00ca\5\b\5 \u00b4\u00b5\f\36\2\2\u00b5\u00b6\7\25\2\2\u00b6\u00ca\5"+
		"\b\5\37\u00b7\u00b8\f\35\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00ca\5\b\5\36"+
		"\u00ba\u00bb\f\20\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00ca\5\b\5\21\u00bd\u00be"+
		"\f\17\2\2\u00be\u00bf\7#\2\2\u00bf\u00ca\5\b\5\20\u00c0\u00c1\f\16\2\2"+
		"\u00c1\u00c2\7$\2\2\u00c2\u00ca\5\b\5\17\u00c3\u00c4\f\r\2\2\u00c4\u00c5"+
		"\7\'\2\2\u00c5\u00c6\5\b\5\2\u00c6\u00c7\7\"\2\2\u00c7\u00c8\5\b\5\16"+
		"\u00c8\u00ca\3\2\2\2\u00c9\u00ae\3\2\2\2\u00c9\u00b1\3\2\2\2\u00c9\u00b4"+
		"\3\2\2\2\u00c9\u00b7\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9"+
		"\u00c0\3\2\2\2\u00c9\u00c3\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\t\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf"+
		"\5\6\4\2\u00cf\13\3\2\2\2\b\17y\u00a1\u00ac\u00c9\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}