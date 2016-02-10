// Generated from /Users/luigibellomarini/doc/workspace_bi/VTLEngine/src/main/antlr4/VTL.g4 by ANTLR 4.5.1
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
		T__0=1, T__1=2, ASSIGN_SYMBOL=3, QUIT_TOKEN=4, GET_TOKEN=5, ID=6, DATASET_ID=7, 
		FIELD_SEP=8;
	public static final int
		RULE_command = 0, RULE_statement = 1, RULE_quitOperator = 2, RULE_getOperator = 3, 
		RULE_function = 4, RULE_pure = 5;
	public static final String[] ruleNames = {
		"command", "statement", "quitOperator", "getOperator", "function", "pure"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'(\"'", "'\")'", "':='", "'QUIT'", "'GET'", null, null, "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ASSIGN_SYMBOL", "QUIT_TOKEN", "GET_TOKEN", "ID", "DATASET_ID", 
		"FIELD_SEP"
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
			setState(15);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new FunctionCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				function();
				}
				break;
			case 2:
				_localctx = new StatementCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				statement();
				}
				break;
			case 3:
				_localctx = new PureCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
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
			setState(17);
			match(ID);
			setState(18);
			match(ASSIGN_SYMBOL);
			setState(19);
			function();
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
			setState(21);
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

	public static class GetOperatorContext extends ParserRuleContext {
		public TerminalNode GET_TOKEN() { return getToken(VTLParser.GET_TOKEN, 0); }
		public TerminalNode DATASET_ID() { return getToken(VTLParser.DATASET_ID, 0); }
		public GetOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterGetOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitGetOperator(this);
		}
	}

	public final GetOperatorContext getOperator() throws RecognitionException {
		GetOperatorContext _localctx = new GetOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_getOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(GET_TOKEN);
			setState(24);
			match(T__0);
			setState(25);
			match(DATASET_ID);
			setState(26);
			match(T__1);
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
		public GetOperatorContext getOperator() {
			return getRuleContext(GetOperatorContext.class,0);
		}
		public TerminalNode ID() { return getToken(VTLParser.ID, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VTLListener ) ((VTLListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			setState(31);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case GET_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				getOperator();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(33);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\5\2\22\n\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\"\n\6\3\7\3\7\3\7\2\2"+
		"\b\2\4\6\b\n\f\2\2#\2\21\3\2\2\2\4\23\3\2\2\2\6\27\3\2\2\2\b\31\3\2\2"+
		"\2\n!\3\2\2\2\f#\3\2\2\2\16\22\5\n\6\2\17\22\5\4\3\2\20\22\5\f\7\2\21"+
		"\16\3\2\2\2\21\17\3\2\2\2\21\20\3\2\2\2\22\3\3\2\2\2\23\24\7\b\2\2\24"+
		"\25\7\5\2\2\25\26\5\n\6\2\26\5\3\2\2\2\27\30\7\6\2\2\30\7\3\2\2\2\31\32"+
		"\7\7\2\2\32\33\7\3\2\2\33\34\7\t\2\2\34\35\7\4\2\2\35\t\3\2\2\2\36\"\3"+
		"\2\2\2\37\"\5\b\5\2 \"\7\b\2\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"\13"+
		"\3\2\2\2#$\5\6\4\2$\r\3\2\2\2\4\21!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}