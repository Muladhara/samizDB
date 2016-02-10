// Generated from /Users/luigibellomarini/doc/workspace_bi/VTLEngine/src/main/antlr4/VTL.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VTLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ASSIGN_SYMBOL=3, QUIT_TOKEN=4, GET_TOKEN=5, ID=6, DATASET_ID=7, 
		FIELD_SEP=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ASSIGN_SYMBOL", "QUIT_TOKEN", "GET_TOKEN", "ID", "DATASET_ID", 
		"FIELD_SEP"
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


	public VTLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\65\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7"+
		"(\n\7\f\7\16\7+\13\7\3\b\3\b\3\b\3\b\3\b\5\b\62\n\b\3\t\3\t\2\2\n\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\4\4\2C\\c|\5\2\62;C\\c|\66\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\26\3\2\2\2\7\31\3\2\2\2\t\34\3\2"+
		"\2\2\13!\3\2\2\2\r%\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23\24\7*\2\2\24"+
		"\25\7$\2\2\25\4\3\2\2\2\26\27\7$\2\2\27\30\7+\2\2\30\6\3\2\2\2\31\32\7"+
		"<\2\2\32\33\7?\2\2\33\b\3\2\2\2\34\35\7S\2\2\35\36\7W\2\2\36\37\7K\2\2"+
		"\37 \7V\2\2 \n\3\2\2\2!\"\7I\2\2\"#\7G\2\2#$\7V\2\2$\f\3\2\2\2%)\t\2\2"+
		"\2&(\t\3\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\16\3\2\2\2+)\3"+
		"\2\2\2,\62\5\r\7\2-.\5\r\7\2./\5\21\t\2/\60\5\17\b\2\60\62\3\2\2\2\61"+
		",\3\2\2\2\61-\3\2\2\2\62\20\3\2\2\2\63\64\7\61\2\2\64\22\3\2\2\2\5\2)"+
		"\61\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}