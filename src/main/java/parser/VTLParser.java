package parser;// Generated from C:/Users/Roberto/Documents/GitHub/samizDB/src/main/antlr4\VTL.g4 by ANTLR 4.5.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SINGLE_APIX_TOKEN=8, 
		ASSIGN_SYMBOL=9, QUIT_TOKEN=10, GET_TOKEN=11, INTEGER_TOKEN=12, NUMERIC_TOKEN=13, 
		BOOL_TOKEN=14, STRING_TOKEN=15, LIST_BOOL_TOKEN=16, LIST_INTEGER_TOKEN=17, 
		LIST_NUMERIC_TOKEN=18, LIST_STRING_TOKEN=19, PATTERN_TOKEN=20, SUM_TOKEN=21, 
		DIFFERENCE_TOKEN=22, PRODUCT_TOKEN=23, DIVISION_TOKEN=24, PAR_OPEN_TOKEN=25, 
		PAR_CLOSED_TOKEN=26, ROUND_TOKEN=27, ABS_TOKEN=28, TRUNC_TOKEN=29, EXP_TOKEN=30, 
		LN_TOKEN=31, LOG_TOKEN=32, POWER_TOKEN=33, NROOT_TOKEN=34, MOD_TOKEN=35, 
		MAJOR_TOKEN=36, MINOR_TOKEN=37, EQUAL_TOKEN=38, MAJOR_EQUAL_TOKEN=39, 
		MINOR_EQUAL_TOKEN=40, AND_TOKEN=41, OR_TOKEN=42, XOR_TOKEN=43, NOT_TOKEN=44, 
		IN_TOKEN=45, BETWEEN_TOKEN=46, ISNULL_TOKEN=47, MATCH_CHARACTERS_TOKEN=48, 
		MATCH_VALUES_TOKEN=49, LENGTH_TOKEN=50, TRIM_TOKEN=51, UPPER_TOKEN=52, 
		LOWER_TOKEN=53, SUBSTR_TOKEN=54, INDEXOF_TOKEN=55, CONCAT_TOKEN=56, IF_TOKEN=57, 
		THEN_TOKEN=58, ELSE_TOKEN=59, ELSEIF_TOKEN=60, NVL_TOKEN=61, AGGR_SUM_TOKEN=62, 
		AGGR_AVG_TOKEN=63, AGGR_MEDIAN_TOKEN=64, AGGR_COUNT_TOKEN=65, AGGR_COUNT_DISTINCT_TOKEN=66, 
		AGGR_MIN_TOKEN=67, AGGR_MAX_TOKEN=68, ID=69, DATASET_ID=70, FIELD_SEP=71, 
		URL=72, MONGO_PATH=73, LINUX_PATH=74, WINDOWS_PATH=75, CREATE_HIER_TOKEN=76, 
		ASSOCIATION_TOKEN=77, WS=78;
	public static final int
		RULE_command = 0, RULE_statement = 1, RULE_quitOperator = 2, RULE_function = 3, 
		RULE_hierarchy_rule = 4, RULE_pure = 5;
	public static final String[] ruleNames = {
		"command", "statement", "quitOperator", "function", "hierarchy_rule", 
		"pure"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'(\"'", "'\")'", "','", "'group by'", "'='", "';'", "'when'", "'''", 
		"':='", "'QUIT'", "'GET'", null, null, null, null, null, null, null, null, 
		null, "'+'", "'-'", "'*'", null, "'('", "')'", "'round'", "'abs'", "'trunc'", 
		"'exp'", "'ln'", "'log'", "'pow'", "'nroot'", "'mod'", "'>'", "'<'", "'=='", 
		"'>='", "'<='", "' and '", "' or '", "' xor '", "'not '", "' in '", "' between '", 
		"'isnull('", "'match_characters('", "'match_values('", "'length('", "'trim('", 
		"'upper('", "'lower('", "'substr('", "'indexof('", "'concat('", "'if '", 
		"' then '", "' else '", "' elseif '", "'nvl'", "'sum('", "'avg('", "'median('", 
		"'count('", "'count_distinct('", "'min('", "'max('", null, null, null, 
		null, null, null, null, "'create hierarchy_rule '", "''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "SINGLE_APIX_TOKEN", "ASSIGN_SYMBOL", 
		"QUIT_TOKEN", "GET_TOKEN", "INTEGER_TOKEN", "NUMERIC_TOKEN", "BOOL_TOKEN", 
		"STRING_TOKEN", "LIST_BOOL_TOKEN", "LIST_INTEGER_TOKEN", "LIST_NUMERIC_TOKEN", 
		"LIST_STRING_TOKEN", "PATTERN_TOKEN", "SUM_TOKEN", "DIFFERENCE_TOKEN", 
		"PRODUCT_TOKEN", "DIVISION_TOKEN", "PAR_OPEN_TOKEN", "PAR_CLOSED_TOKEN", 
		"ROUND_TOKEN", "ABS_TOKEN", "TRUNC_TOKEN", "EXP_TOKEN", "LN_TOKEN", "LOG_TOKEN", 
		"POWER_TOKEN", "NROOT_TOKEN", "MOD_TOKEN", "MAJOR_TOKEN", "MINOR_TOKEN", 
		"EQUAL_TOKEN", "MAJOR_EQUAL_TOKEN", "MINOR_EQUAL_TOKEN", "AND_TOKEN", 
		"OR_TOKEN", "XOR_TOKEN", "NOT_TOKEN", "IN_TOKEN", "BETWEEN_TOKEN", "ISNULL_TOKEN", 
		"MATCH_CHARACTERS_TOKEN", "MATCH_VALUES_TOKEN", "LENGTH_TOKEN", "TRIM_TOKEN", 
		"UPPER_TOKEN", "LOWER_TOKEN", "SUBSTR_TOKEN", "INDEXOF_TOKEN", "CONCAT_TOKEN", 
		"IF_TOKEN", "THEN_TOKEN", "ELSE_TOKEN", "ELSEIF_TOKEN", "NVL_TOKEN", "AGGR_SUM_TOKEN", 
		"AGGR_AVG_TOKEN", "AGGR_MEDIAN_TOKEN", "AGGR_COUNT_TOKEN", "AGGR_COUNT_DISTINCT_TOKEN", 
		"AGGR_MIN_TOKEN", "AGGR_MAX_TOKEN", "ID", "DATASET_ID", "FIELD_SEP", "URL", 
		"MONGO_PATH", "LINUX_PATH", "WINDOWS_PATH", "CREATE_HIER_TOKEN", "ASSOCIATION_TOKEN", 
		"WS"
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
	public static class HierarchyCommandContext extends CommandContext {
		public Hierarchy_ruleContext hierarchy_rule() {
			return getRuleContext(Hierarchy_ruleContext.class,0);
		}
		public HierarchyCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterHierarchyCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitHierarchyCommand(this);
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
			setState(16);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new FunctionCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				function(0);
				}
				break;
			case 2:
				_localctx = new HierarchyCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				hierarchy_rule();
				}
				break;
			case 3:
				_localctx = new StatementCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				statement();
				}
				break;
			case 4:
				_localctx = new PureCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
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
			setState(18);
			match(ID);
			setState(19);
			match(ASSIGN_SYMBOL);
			setState(20);
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
			setState(22);
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
	public static class ListBoolContext extends FunctionContext {
		public TerminalNode LIST_BOOL_TOKEN() { return getToken(VTLParser.LIST_BOOL_TOKEN, 0); }
		public ListBoolContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterListBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitListBool(this);
		}
	}
	public static class MajorScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode MAJOR_TOKEN() { return getToken(VTLParser.MAJOR_TOKEN, 0); }
		public MajorScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterMajorScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitMajorScalarOperator(this);
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
	public static class MatchCharacterScalarOperatorContext extends FunctionContext {
		public TerminalNode MATCH_CHARACTERS_TOKEN() { return getToken(VTLParser.MATCH_CHARACTERS_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode PATTERN_TOKEN() { return getToken(VTLParser.PATTERN_TOKEN, 0); }
		public MatchCharacterScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterMatchCharacterScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitMatchCharacterScalarOperator(this);
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
	public static class AggrSumContext extends FunctionContext {
		public TerminalNode AGGR_SUM_TOKEN() { return getToken(VTLParser.AGGR_SUM_TOKEN, 0); }
		public List<TerminalNode> ID() { return getTokens(VTLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VTLParser.ID, i);
		}
		public AggrSumContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterAggrSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitAggrSum(this);
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
	public static class ListIntContext extends FunctionContext {
		public TerminalNode LIST_INTEGER_TOKEN() { return getToken(VTLParser.LIST_INTEGER_TOKEN, 0); }
		public ListIntContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterListInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitListInt(this);
		}
	}
	public static class IsNullScalarOperatorContext extends FunctionContext {
		public TerminalNode ISNULL_TOKEN() { return getToken(VTLParser.ISNULL_TOKEN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IsNullScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterIsNullScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitIsNullScalarOperator(this);
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
	public static class MajorEqualScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode MAJOR_EQUAL_TOKEN() { return getToken(VTLParser.MAJOR_EQUAL_TOKEN, 0); }
		public MajorEqualScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterMajorEqualScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitMajorEqualScalarOperator(this);
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
	public static class MinorScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode MINOR_TOKEN() { return getToken(VTLParser.MINOR_TOKEN, 0); }
		public MinorScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterMinorScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitMinorScalarOperator(this);
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
	public static class EqualScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode EQUAL_TOKEN() { return getToken(VTLParser.EQUAL_TOKEN, 0); }
		public EqualScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterEqualScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitEqualScalarOperator(this);
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
		public TerminalNode PAR_CLOSED_TOKEN() { return getToken(VTLParser.PAR_CLOSED_TOKEN, 0); }
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
	public static class PatternContext extends FunctionContext {
		public TerminalNode PATTERN_TOKEN() { return getToken(VTLParser.PATTERN_TOKEN, 0); }
		public PatternContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitPattern(this);
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
	public static class ListNumContext extends FunctionContext {
		public TerminalNode LIST_NUMERIC_TOKEN() { return getToken(VTLParser.LIST_NUMERIC_TOKEN, 0); }
		public ListNumContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterListNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitListNum(this);
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
	public static class MinorEqualScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode MINOR_EQUAL_TOKEN() { return getToken(VTLParser.MINOR_EQUAL_TOKEN, 0); }
		public MinorEqualScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterMinorEqualScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitMinorEqualScalarOperator(this);
		}
	}
	public static class ConcatScalarOperatorContext extends FunctionContext {
		public TerminalNode CONCAT_TOKEN() { return getToken(VTLParser.CONCAT_TOKEN, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ConcatScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterConcatScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitConcatScalarOperator(this);
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
	public static class ListStrContext extends FunctionContext {
		public TerminalNode LIST_STRING_TOKEN() { return getToken(VTLParser.LIST_STRING_TOKEN, 0); }
		public ListStrContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterListStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitListStr(this);
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
	public static class InScalarOperatorContext extends FunctionContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode IN_TOKEN() { return getToken(VTLParser.IN_TOKEN, 0); }
		public InScalarOperatorContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterInScalarOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitInScalarOperator(this);
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
			setState(181);
			switch (_input.LA(1)) {
			case DIFFERENCE_TOKEN:
				{
				_localctx = new MinusFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25);
				match(DIFFERENCE_TOKEN);
				setState(26);
				function(37);
				}
				break;
			case NOT_TOKEN:
				{
				_localctx = new NotScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(NOT_TOKEN);
				setState(28);
				function(18);
				}
				break;
			case BOOL_TOKEN:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(BOOL_TOKEN);
				}
				break;
			case STRING_TOKEN:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(STRING_TOKEN);
				}
				break;
			case INTEGER_TOKEN:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(INTEGER_TOKEN);
				}
				break;
			case NUMERIC_TOKEN:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(NUMERIC_TOKEN);
				}
				break;
			case LIST_BOOL_TOKEN:
				{
				_localctx = new ListBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(LIST_BOOL_TOKEN);
				}
				break;
			case LIST_INTEGER_TOKEN:
				{
				_localctx = new ListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(LIST_INTEGER_TOKEN);
				}
				break;
			case LIST_NUMERIC_TOKEN:
				{
				_localctx = new ListNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(LIST_NUMERIC_TOKEN);
				}
				break;
			case LIST_STRING_TOKEN:
				{
				_localctx = new ListStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(LIST_STRING_TOKEN);
				}
				break;
			case PATTERN_TOKEN:
				{
				_localctx = new PatternContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(PATTERN_TOKEN);
				}
				break;
			case GET_TOKEN:
				{
				_localctx = new GetOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(GET_TOKEN);
				setState(39);
				match(T__0);
				setState(40);
				match(DATASET_ID);
				setState(41);
				match(T__1);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(ID);
				}
				break;
			case PAR_OPEN_TOKEN:
				{
				_localctx = new ParFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(PAR_OPEN_TOKEN);
				setState(44);
				function(0);
				setState(45);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case ROUND_TOKEN:
				{
				_localctx = new RoundScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(ROUND_TOKEN);
				setState(48);
				match(PAR_OPEN_TOKEN);
				setState(49);
				function(0);
				setState(50);
				match(T__2);
				setState(51);
				function(0);
				setState(52);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case ABS_TOKEN:
				{
				_localctx = new AbsScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(ABS_TOKEN);
				setState(55);
				match(PAR_OPEN_TOKEN);
				setState(56);
				function(0);
				setState(57);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case TRUNC_TOKEN:
				{
				_localctx = new TruncScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(TRUNC_TOKEN);
				setState(60);
				match(PAR_OPEN_TOKEN);
				setState(61);
				function(0);
				setState(62);
				match(T__2);
				setState(63);
				function(0);
				setState(64);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case EXP_TOKEN:
				{
				_localctx = new ExpScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(EXP_TOKEN);
				setState(67);
				match(PAR_OPEN_TOKEN);
				setState(68);
				function(0);
				setState(69);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case LN_TOKEN:
				{
				_localctx = new LnScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(LN_TOKEN);
				setState(72);
				match(PAR_OPEN_TOKEN);
				setState(73);
				function(0);
				setState(74);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case LOG_TOKEN:
				{
				_localctx = new LogScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(LOG_TOKEN);
				setState(77);
				match(PAR_OPEN_TOKEN);
				setState(78);
				function(0);
				setState(79);
				match(T__2);
				setState(80);
				function(0);
				setState(81);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case POWER_TOKEN:
				{
				_localctx = new PowScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(POWER_TOKEN);
				setState(84);
				match(PAR_OPEN_TOKEN);
				setState(85);
				function(0);
				setState(86);
				match(T__2);
				setState(87);
				function(0);
				setState(88);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case NROOT_TOKEN:
				{
				_localctx = new NrootScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(NROOT_TOKEN);
				setState(91);
				match(PAR_OPEN_TOKEN);
				setState(92);
				function(0);
				setState(93);
				match(T__2);
				setState(94);
				function(0);
				setState(95);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case MOD_TOKEN:
				{
				_localctx = new ModScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(MOD_TOKEN);
				setState(98);
				match(PAR_OPEN_TOKEN);
				setState(99);
				function(0);
				setState(100);
				match(T__2);
				setState(101);
				function(0);
				setState(102);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case IF_TOKEN:
				{
				_localctx = new IfelseScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(IF_TOKEN);
				setState(105);
				function(0);
				setState(106);
				match(THEN_TOKEN);
				setState(107);
				function(0);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF_TOKEN) {
					{
					{
					setState(108);
					match(ELSEIF_TOKEN);
					setState(109);
					function(0);
					setState(110);
					match(THEN_TOKEN);
					setState(111);
					function(0);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(ELSE_TOKEN);
				setState(119);
				function(0);
				}
				break;
			case NVL_TOKEN:
				{
				_localctx = new NvlScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(NVL_TOKEN);
				setState(122);
				match(PAR_OPEN_TOKEN);
				setState(123);
				function(0);
				setState(124);
				match(T__2);
				setState(125);
				function(0);
				setState(126);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case ISNULL_TOKEN:
				{
				_localctx = new IsNullScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(ISNULL_TOKEN);
				setState(129);
				function(0);
				setState(130);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case MATCH_CHARACTERS_TOKEN:
				{
				_localctx = new MatchCharacterScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(MATCH_CHARACTERS_TOKEN);
				setState(133);
				function(0);
				setState(134);
				match(T__2);
				setState(135);
				match(PATTERN_TOKEN);
				setState(136);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case LENGTH_TOKEN:
				{
				_localctx = new LengthScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(LENGTH_TOKEN);
				setState(139);
				function(0);
				setState(140);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case TRIM_TOKEN:
				{
				_localctx = new TrimScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(TRIM_TOKEN);
				setState(143);
				function(0);
				setState(144);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case UPPER_TOKEN:
				{
				_localctx = new UppertScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(UPPER_TOKEN);
				setState(147);
				function(0);
				setState(148);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case LOWER_TOKEN:
				{
				_localctx = new LowerScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(LOWER_TOKEN);
				setState(151);
				function(0);
				setState(152);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case SUBSTR_TOKEN:
				{
				_localctx = new SubstrScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(SUBSTR_TOKEN);
				setState(155);
				function(0);
				setState(156);
				match(T__2);
				setState(157);
				function(0);
				setState(160);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(158);
					match(T__2);
					setState(159);
					function(0);
					}
				}

				setState(162);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case INDEXOF_TOKEN:
				{
				_localctx = new IndexofScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(INDEXOF_TOKEN);
				setState(165);
				function(0);
				setState(166);
				match(T__2);
				setState(167);
				function(0);
				setState(168);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case CONCAT_TOKEN:
				{
				_localctx = new ConcatScalarOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(CONCAT_TOKEN);
				setState(171);
				function(0);
				setState(172);
				match(T__2);
				setState(173);
				function(0);
				setState(174);
				match(PAR_CLOSED_TOKEN);
				}
				break;
			case AGGR_SUM_TOKEN:
				{
				_localctx = new AggrSumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(AGGR_SUM_TOKEN);
				setState(177);
				match(ID);
				setState(178);
				match(PAR_CLOSED_TOKEN);
				setState(179);
				match(T__3);
				setState(180);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ProductScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(183);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(184);
						match(PRODUCT_TOKEN);
						setState(185);
						function(37);
						}
						break;
					case 2:
						{
						_localctx = new DivisionScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(186);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(187);
						match(DIVISION_TOKEN);
						setState(188);
						function(36);
						}
						break;
					case 3:
						{
						_localctx = new SumScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(189);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(190);
						match(SUM_TOKEN);
						setState(191);
						function(35);
						}
						break;
					case 4:
						{
						_localctx = new DifferenceScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(192);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(193);
						match(DIFFERENCE_TOKEN);
						setState(194);
						function(34);
						}
						break;
					case 5:
						{
						_localctx = new MinorScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(195);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(196);
						match(MINOR_TOKEN);
						setState(197);
						function(24);
						}
						break;
					case 6:
						{
						_localctx = new MajorScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(198);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(199);
						match(MAJOR_TOKEN);
						setState(200);
						function(23);
						}
						break;
					case 7:
						{
						_localctx = new MajorEqualScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(201);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(202);
						match(MAJOR_EQUAL_TOKEN);
						setState(203);
						function(22);
						}
						break;
					case 8:
						{
						_localctx = new MinorEqualScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(204);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(205);
						match(MINOR_EQUAL_TOKEN);
						setState(206);
						function(21);
						}
						break;
					case 9:
						{
						_localctx = new EqualScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(207);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(208);
						match(EQUAL_TOKEN);
						setState(209);
						function(20);
						}
						break;
					case 10:
						{
						_localctx = new AndScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(210);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(211);
						match(AND_TOKEN);
						setState(212);
						function(18);
						}
						break;
					case 11:
						{
						_localctx = new OrScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(213);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(214);
						match(OR_TOKEN);
						setState(215);
						function(17);
						}
						break;
					case 12:
						{
						_localctx = new XorScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(216);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(217);
						match(XOR_TOKEN);
						setState(218);
						function(16);
						}
						break;
					case 13:
						{
						_localctx = new InScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(219);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(220);
						match(IN_TOKEN);
						setState(221);
						function(13);
						}
						break;
					case 14:
						{
						_localctx = new BetweenScalarOperatorContext(new FunctionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_function);
						setState(222);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(223);
						match(BETWEEN_TOKEN);
						setState(224);
						function(0);
						setState(225);
						match(AND_TOKEN);
						setState(226);
						function(12);
						}
						break;
					}
					} 
				}
				setState(232);
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

	public static class Hierarchy_ruleContext extends ParserRuleContext {
		public Hierarchy_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchy_rule; }
	 
		public Hierarchy_ruleContext() { }
		public void copyFrom(Hierarchy_ruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateHierarchyRuleContext extends Hierarchy_ruleContext {
		public TerminalNode CREATE_HIER_TOKEN() { return getToken(VTLParser.CREATE_HIER_TOKEN, 0); }
		public List<TerminalNode> ID() { return getTokens(VTLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VTLParser.ID, i);
		}
		public List<TerminalNode> NUMERIC_TOKEN() { return getTokens(VTLParser.NUMERIC_TOKEN); }
		public TerminalNode NUMERIC_TOKEN(int i) {
			return getToken(VTLParser.NUMERIC_TOKEN, i);
		}
		public List<TerminalNode> INTEGER_TOKEN() { return getTokens(VTLParser.INTEGER_TOKEN); }
		public TerminalNode INTEGER_TOKEN(int i) {
			return getToken(VTLParser.INTEGER_TOKEN, i);
		}
		public CreateHierarchyRuleContext(Hierarchy_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterCreateHierarchyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitCreateHierarchyRule(this);
		}
	}

	public final Hierarchy_ruleContext hierarchy_rule() throws RecognitionException {
		Hierarchy_ruleContext _localctx = new Hierarchy_ruleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hierarchy_rule);
		int _la;
		try {
			_localctx = new CreateHierarchyRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(CREATE_HIER_TOKEN);
			setState(234);
			match(ID);
			setState(235);
			match(PAR_OPEN_TOKEN);
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				match(ID);
				setState(237);
				match(T__4);
				setState(238);
				match(ID);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUM_TOKEN) {
					{
					{
					setState(239);
					match(SUM_TOKEN);
					setState(240);
					match(ID);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(T__5);
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				match(T__6);
				setState(252);
				match(ID);
				setState(253);
				match(T__4);
				setState(254);
				_la = _input.LA(1);
				if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (INTEGER_TOKEN - 12)) | (1L << (NUMERIC_TOKEN - 12)) | (1L << (ID - 12)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(255);
				match(THEN_TOKEN);
				setState(256);
				_la = _input.LA(1);
				if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (INTEGER_TOKEN - 12)) | (1L << (NUMERIC_TOKEN - 12)) | (1L << (ID - 12)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(257);
				match(T__5);
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(262);
			match(PAR_CLOSED_TOKEN);
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
		enterRule(_localctx, 10, RULE_pure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
			return precpred(_ctx, 36);
		case 1:
			return precpred(_ctx, 35);
		case 2:
			return precpred(_ctx, 34);
		case 3:
			return precpred(_ctx, 33);
		case 4:
			return precpred(_ctx, 23);
		case 5:
			return precpred(_ctx, 22);
		case 6:
			return precpred(_ctx, 21);
		case 7:
			return precpred(_ctx, 20);
		case 8:
			return precpred(_ctx, 19);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5t\n\5\f\5\16\5w\13\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00a3\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b8\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5\u00e7\n\5\f\5\16\5\u00ea\13\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u00f4\n\6\f\6\16\6\u00f7\13\6\3\6\6\6\u00fa\n\6\r\6\16\6"+
		"\u00fb\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0105\n\6\r\6\16\6\u0106\3\6\3"+
		"\6\3\7\3\7\3\7\2\3\b\b\2\4\6\b\n\f\2\3\4\2\16\17GG\u013e\2\22\3\2\2\2"+
		"\4\24\3\2\2\2\6\30\3\2\2\2\b\u00b7\3\2\2\2\n\u00eb\3\2\2\2\f\u010a\3\2"+
		"\2\2\16\23\5\b\5\2\17\23\5\n\6\2\20\23\5\4\3\2\21\23\5\f\7\2\22\16\3\2"+
		"\2\2\22\17\3\2\2\2\22\20\3\2\2\2\22\21\3\2\2\2\23\3\3\2\2\2\24\25\7G\2"+
		"\2\25\26\7\13\2\2\26\27\5\b\5\2\27\5\3\2\2\2\30\31\7\f\2\2\31\7\3\2\2"+
		"\2\32\33\b\5\1\2\33\34\7\30\2\2\34\u00b8\5\b\5\'\35\36\7.\2\2\36\u00b8"+
		"\5\b\5\24\37\u00b8\7\20\2\2 \u00b8\7\21\2\2!\u00b8\7\16\2\2\"\u00b8\7"+
		"\17\2\2#\u00b8\7\22\2\2$\u00b8\7\23\2\2%\u00b8\7\24\2\2&\u00b8\7\25\2"+
		"\2\'\u00b8\7\26\2\2()\7\r\2\2)*\7\3\2\2*+\7H\2\2+\u00b8\7\4\2\2,\u00b8"+
		"\7G\2\2-.\7\33\2\2./\5\b\5\2/\60\7\34\2\2\60\u00b8\3\2\2\2\61\62\7\35"+
		"\2\2\62\63\7\33\2\2\63\64\5\b\5\2\64\65\7\5\2\2\65\66\5\b\5\2\66\67\7"+
		"\34\2\2\67\u00b8\3\2\2\289\7\36\2\29:\7\33\2\2:;\5\b\5\2;<\7\34\2\2<\u00b8"+
		"\3\2\2\2=>\7\37\2\2>?\7\33\2\2?@\5\b\5\2@A\7\5\2\2AB\5\b\5\2BC\7\34\2"+
		"\2C\u00b8\3\2\2\2DE\7 \2\2EF\7\33\2\2FG\5\b\5\2GH\7\34\2\2H\u00b8\3\2"+
		"\2\2IJ\7!\2\2JK\7\33\2\2KL\5\b\5\2LM\7\34\2\2M\u00b8\3\2\2\2NO\7\"\2\2"+
		"OP\7\33\2\2PQ\5\b\5\2QR\7\5\2\2RS\5\b\5\2ST\7\34\2\2T\u00b8\3\2\2\2UV"+
		"\7#\2\2VW\7\33\2\2WX\5\b\5\2XY\7\5\2\2YZ\5\b\5\2Z[\7\34\2\2[\u00b8\3\2"+
		"\2\2\\]\7$\2\2]^\7\33\2\2^_\5\b\5\2_`\7\5\2\2`a\5\b\5\2ab\7\34\2\2b\u00b8"+
		"\3\2\2\2cd\7%\2\2de\7\33\2\2ef\5\b\5\2fg\7\5\2\2gh\5\b\5\2hi\7\34\2\2"+
		"i\u00b8\3\2\2\2jk\7;\2\2kl\5\b\5\2lm\7<\2\2mu\5\b\5\2no\7>\2\2op\5\b\5"+
		"\2pq\7<\2\2qr\5\b\5\2rt\3\2\2\2sn\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2vx\3\2\2\2wu\3\2\2\2xy\7=\2\2yz\5\b\5\2z\u00b8\3\2\2\2{|\7?\2\2|}\7"+
		"\33\2\2}~\5\b\5\2~\177\7\5\2\2\177\u0080\5\b\5\2\u0080\u0081\7\34\2\2"+
		"\u0081\u00b8\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084\5\b\5\2\u0084\u0085"+
		"\7\34\2\2\u0085\u00b8\3\2\2\2\u0086\u0087\7\62\2\2\u0087\u0088\5\b\5\2"+
		"\u0088\u0089\7\5\2\2\u0089\u008a\7\26\2\2\u008a\u008b\7\34\2\2\u008b\u00b8"+
		"\3\2\2\2\u008c\u008d\7\64\2\2\u008d\u008e\5\b\5\2\u008e\u008f\7\34\2\2"+
		"\u008f\u00b8\3\2\2\2\u0090\u0091\7\65\2\2\u0091\u0092\5\b\5\2\u0092\u0093"+
		"\7\34\2\2\u0093\u00b8\3\2\2\2\u0094\u0095\7\66\2\2\u0095\u0096\5\b\5\2"+
		"\u0096\u0097\7\34\2\2\u0097\u00b8\3\2\2\2\u0098\u0099\7\67\2\2\u0099\u009a"+
		"\5\b\5\2\u009a\u009b\7\34\2\2\u009b\u00b8\3\2\2\2\u009c\u009d\78\2\2\u009d"+
		"\u009e\5\b\5\2\u009e\u009f\7\5\2\2\u009f\u00a2\5\b\5\2\u00a0\u00a1\7\5"+
		"\2\2\u00a1\u00a3\5\b\5\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\7\34\2\2\u00a5\u00b8\3\2\2\2\u00a6\u00a7\7"+
		"9\2\2\u00a7\u00a8\5\b\5\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\5\b\5\2\u00aa"+
		"\u00ab\7\34\2\2\u00ab\u00b8\3\2\2\2\u00ac\u00ad\7:\2\2\u00ad\u00ae\5\b"+
		"\5\2\u00ae\u00af\7\5\2\2\u00af\u00b0\5\b\5\2\u00b0\u00b1\7\34\2\2\u00b1"+
		"\u00b8\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4\7G\2\2\u00b4\u00b5\7\34"+
		"\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00b8\7G\2\2\u00b7\32\3\2\2\2\u00b7\35"+
		"\3\2\2\2\u00b7\37\3\2\2\2\u00b7 \3\2\2\2\u00b7!\3\2\2\2\u00b7\"\3\2\2"+
		"\2\u00b7#\3\2\2\2\u00b7$\3\2\2\2\u00b7%\3\2\2\2\u00b7&\3\2\2\2\u00b7\'"+
		"\3\2\2\2\u00b7(\3\2\2\2\u00b7,\3\2\2\2\u00b7-\3\2\2\2\u00b7\61\3\2\2\2"+
		"\u00b78\3\2\2\2\u00b7=\3\2\2\2\u00b7D\3\2\2\2\u00b7I\3\2\2\2\u00b7N\3"+
		"\2\2\2\u00b7U\3\2\2\2\u00b7\\\3\2\2\2\u00b7c\3\2\2\2\u00b7j\3\2\2\2\u00b7"+
		"{\3\2\2\2\u00b7\u0082\3\2\2\2\u00b7\u0086\3\2\2\2\u00b7\u008c\3\2\2\2"+
		"\u00b7\u0090\3\2\2\2\u00b7\u0094\3\2\2\2\u00b7\u0098\3\2\2\2\u00b7\u009c"+
		"\3\2\2\2\u00b7\u00a6\3\2\2\2\u00b7\u00ac\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8"+
		"\u00e8\3\2\2\2\u00b9\u00ba\f&\2\2\u00ba\u00bb\7\31\2\2\u00bb\u00e7\5\b"+
		"\5\'\u00bc\u00bd\f%\2\2\u00bd\u00be\7\32\2\2\u00be\u00e7\5\b\5&\u00bf"+
		"\u00c0\f$\2\2\u00c0\u00c1\7\27\2\2\u00c1\u00e7\5\b\5%\u00c2\u00c3\f#\2"+
		"\2\u00c3\u00c4\7\30\2\2\u00c4\u00e7\5\b\5$\u00c5\u00c6\f\31\2\2\u00c6"+
		"\u00c7\7\'\2\2\u00c7\u00e7\5\b\5\32\u00c8\u00c9\f\30\2\2\u00c9\u00ca\7"+
		"&\2\2\u00ca\u00e7\5\b\5\31\u00cb\u00cc\f\27\2\2\u00cc\u00cd\7)\2\2\u00cd"+
		"\u00e7\5\b\5\30\u00ce\u00cf\f\26\2\2\u00cf\u00d0\7*\2\2\u00d0\u00e7\5"+
		"\b\5\27\u00d1\u00d2\f\25\2\2\u00d2\u00d3\7(\2\2\u00d3\u00e7\5\b\5\26\u00d4"+
		"\u00d5\f\23\2\2\u00d5\u00d6\7+\2\2\u00d6\u00e7\5\b\5\24\u00d7\u00d8\f"+
		"\22\2\2\u00d8\u00d9\7,\2\2\u00d9\u00e7\5\b\5\23\u00da\u00db\f\21\2\2\u00db"+
		"\u00dc\7-\2\2\u00dc\u00e7\5\b\5\22\u00dd\u00de\f\16\2\2\u00de\u00df\7"+
		"/\2\2\u00df\u00e7\5\b\5\17\u00e0\u00e1\f\r\2\2\u00e1\u00e2\7\60\2\2\u00e2"+
		"\u00e3\5\b\5\2\u00e3\u00e4\7+\2\2\u00e4\u00e5\5\b\5\16\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00b9\3\2\2\2\u00e6\u00bc\3\2\2\2\u00e6\u00bf\3\2\2\2\u00e6"+
		"\u00c2\3\2\2\2\u00e6\u00c5\3\2\2\2\u00e6\u00c8\3\2\2\2\u00e6\u00cb\3\2"+
		"\2\2\u00e6\u00ce\3\2\2\2\u00e6\u00d1\3\2\2\2\u00e6\u00d4\3\2\2\2\u00e6"+
		"\u00d7\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e0\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\t\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7N\2\2\u00ec\u00ed\7G\2\2\u00ed"+
		"\u00f9\7\33\2\2\u00ee\u00ef\7G\2\2\u00ef\u00f0\7\7\2\2\u00f0\u00f5\7G"+
		"\2\2\u00f1\u00f2\7\27\2\2\u00f2\u00f4\7G\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\7\b\2\2\u00f9\u00ee\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0104\3\2"+
		"\2\2\u00fd\u00fe\7\t\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100\7\7\2\2\u0100"+
		"\u0101\t\2\2\2\u0101\u0102\7<\2\2\u0102\u0103\t\2\2\2\u0103\u0105\7\b"+
		"\2\2\u0104\u00fd\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7\34\2\2\u0109\13\3\2\2"+
		"\2\u010a\u010b\5\6\4\2\u010b\r\3\2\2\2\13\22u\u00a2\u00b7\u00e6\u00e8"+
		"\u00f5\u00fb\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}