package parser;// Generated from E:/Recovery/Codice SamyDB/samizDB-master - Copia/src/main/antlr4\VTL.g4 by ANTLR 4.5.1
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ASSIGN_SYMBOL", 
		"QUIT_TOKEN", "GET_TOKEN", "INTEGER_TOKEN", "NUMERIC_TOKEN", "BOOL_TOKEN", 
		"STRING_TOKEN", "LIST_BOOL_TOKEN", "LIST_INTEGER_TOKEN", "LIST_NUMERIC_TOKEN", 
		"LIST_STRING_TOKEN", "SUM_TOKEN", "DIFFERENCE_TOKEN", "PRODUCT_TOKEN", 
		"DIVISION_TOKEN", "ROUND_TOKEN", "ABS_TOKEN", "TRUNC_TOKEN", "EXP_TOKEN", 
		"LN_TOKEN", "LOG_TOKEN", "POWER_TOKEN", "NROOT_TOKEN", "MOD_TOKEN", "AND_TOKEN", 
		"OR_TOKEN", "XOR_TOKEN", "NOT_TOKEN", "IN_TOKEN", "BETWEEN_TOKEN", "ISNULL_TOKEN", 
		"MATCH_CHARACTERS_TOKEN", "MATCH_VALUES_TOKEN", "LENGTH_TOKEN", "TRIM_TOKEN", 
		"UPPER_TOKEN", "LOWER_TOKEN", "SUBSTR_TOKEN", "INDEXOF_TOKEN", "IF_TOKEN", 
		"THEN_TOKEN", "ELSE_TOKEN", "ELSEIF_TOKEN", "NVL_TOKEN", "AGGR_SUM_TOKEN", 
		"AGGR_AVG_TOKEN", "AGGR_MEDIAN_TOKEN", "AGGR_COUNT_TOKEN", "AGGR_COUNT_DISTINCT_TOKEN", 
		"AGGR_MIN_TOKEN", "AGGR_MAX_TOKEN", "ID", "DATASET_ID", "FIELD_SEP", "URL", 
		"MONGO_PATH", "LINUX_PATH", "WINDOWS_PATH"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2C\u0265\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\6\f\u00a5\n\f\r\f\16\f\u00a6\3\r\6\r\u00aa\n\r\r\r"+
		"\16\r\u00ab\3\r\3\r\6\r\u00b0\n\r\r\r\16\r\u00b1\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00c6\n\16\3\17\3\17\6\17\u00ca\n\17\r\17\16\17\u00cb\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d6\n\20\f\20\16\20\u00d9\13\20\3"+
		"\20\3\20\5\20\u00dd\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e5\n\21"+
		"\f\21\16\21\u00e8\13\21\3\21\3\21\5\21\u00ec\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00f4\n\22\f\22\16\22\u00f7\13\22\3\22\3\22\5\22\u00fb"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0103\n\23\f\23\16\23\u0106\13"+
		"\23\3\23\3\23\5\23\u010a\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\7<\u01fb\n<\f<\16<\u01fe\13<\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\5=\u0209\n=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\6?\u021a\n?\r?\16?\u021b\3@\3@\6@\u0220\n@\r@\16@\u0221\3@\3"+
		"@\6@\u0226\n@\r@\16@\u0227\3@\7@\u022b\n@\f@\16@\u022e\13@\3A\3A\7A\u0232"+
		"\nA\fA\16A\u0235\13A\3A\3A\6A\u0239\nA\rA\16A\u023a\7A\u023d\nA\fA\16"+
		"A\u0240\13A\3A\6A\u0243\nA\rA\16A\u0244\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B"+
		"\6B\u0251\nB\rB\16B\u0252\3B\7B\u0256\nB\fB\16B\u0259\13B\3B\6B\u025c"+
		"\nB\rB\16B\u025d\3B\3B\3B\3B\3B\3B\2\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\3\2\n\3\2\62;\5\2\62;C\\c|\5\2C\\aac|\7\2//\62;C\\aac|\7\2/;C\\^^aa"+
		"c|\4\2\61\61^^\3\2C\\\3\2^^\u0284\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0088\3\2\2\2\7\u008b"+
		"\3\2\2\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r\u0091\3\2\2\2\17\u0094\3\2"+
		"\2\2\21\u0097\3\2\2\2\23\u009a\3\2\2\2\25\u009f\3\2\2\2\27\u00a4\3\2\2"+
		"\2\31\u00a9\3\2\2\2\33\u00c5\3\2\2\2\35\u00c7\3\2\2\2\37\u00dc\3\2\2\2"+
		"!\u00eb\3\2\2\2#\u00fa\3\2\2\2%\u0109\3\2\2\2\'\u010b\3\2\2\2)\u010d\3"+
		"\2\2\2+\u010f\3\2\2\2-\u0111\3\2\2\2/\u0113\3\2\2\2\61\u0119\3\2\2\2\63"+
		"\u011d\3\2\2\2\65\u0123\3\2\2\2\67\u0127\3\2\2\29\u012a\3\2\2\2;\u012e"+
		"\3\2\2\2=\u0132\3\2\2\2?\u0138\3\2\2\2A\u013c\3\2\2\2C\u0142\3\2\2\2E"+
		"\u0147\3\2\2\2G\u014d\3\2\2\2I\u0152\3\2\2\2K\u0157\3\2\2\2M\u0161\3\2"+
		"\2\2O\u0168\3\2\2\2Q\u0179\3\2\2\2S\u0186\3\2\2\2U\u018d\3\2\2\2W\u0192"+
		"\3\2\2\2Y\u0198\3\2\2\2[\u019e\3\2\2\2]\u01a5\3\2\2\2_\u01ad\3\2\2\2a"+
		"\u01b1\3\2\2\2c\u01b8\3\2\2\2e\u01bf\3\2\2\2g\u01c8\3\2\2\2i\u01cc\3\2"+
		"\2\2k\u01d0\3\2\2\2m\u01d4\3\2\2\2o\u01db\3\2\2\2q\u01e1\3\2\2\2s\u01f0"+
		"\3\2\2\2u\u01f4\3\2\2\2w\u01f8\3\2\2\2y\u0208\3\2\2\2{\u020a\3\2\2\2}"+
		"\u020c\3\2\2\2\177\u021d\3\2\2\2\u0081\u022f\3\2\2\2\u0083\u024c\3\2\2"+
		"\2\u0085\u0086\7*\2\2\u0086\u0087\7$\2\2\u0087\4\3\2\2\2\u0088\u0089\7"+
		"$\2\2\u0089\u008a\7+\2\2\u008a\6\3\2\2\2\u008b\u008c\7*\2\2\u008c\b\3"+
		"\2\2\2\u008d\u008e\7+\2\2\u008e\n\3\2\2\2\u008f\u0090\7.\2\2\u0090\f\3"+
		"\2\2\2\u0091\u0092\7*\2\2\u0092\u0093\7\"\2\2\u0093\16\3\2\2\2\u0094\u0095"+
		"\7\"\2\2\u0095\u0096\7+\2\2\u0096\20\3\2\2\2\u0097\u0098\7<\2\2\u0098"+
		"\u0099\7?\2\2\u0099\22\3\2\2\2\u009a\u009b\7S\2\2\u009b\u009c\7W\2\2\u009c"+
		"\u009d\7K\2\2\u009d\u009e\7V\2\2\u009e\24\3\2\2\2\u009f\u00a0\7I\2\2\u00a0"+
		"\u00a1\7G\2\2\u00a1\u00a2\7V\2\2\u00a2\26\3\2\2\2\u00a3\u00a5\t\2\2\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\30\3\2\2\2\u00a8\u00aa\t\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\7\60\2\2\u00ae\u00b0\t\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\32\3\2\2"+
		"\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7w\2\2\u00b6\u00c6"+
		"\7g\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00c6\7g\2\2\u00bc\u00bd\7V\2\2\u00bd\u00be\7T\2\2"+
		"\u00be\u00bf\7W\2\2\u00bf\u00c6\7G\2\2\u00c0\u00c1\7H\2\2\u00c1\u00c2"+
		"\7C\2\2\u00c2\u00c3\7N\2\2\u00c3\u00c4\7U\2\2\u00c4\u00c6\7G\2\2\u00c5"+
		"\u00b3\3\2\2\2\u00c5\u00b7\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c0\3\2"+
		"\2\2\u00c6\34\3\2\2\2\u00c7\u00c9\7$\2\2\u00c8\u00ca\t\3\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7]\2\2"+
		"\u00d0\u00dd\7_\2\2\u00d1\u00d2\7]\2\2\u00d2\u00d7\5\33\16\2\u00d3\u00d4"+
		"\7.\2\2\u00d4\u00d6\5\33\16\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00db\7_\2\2\u00db\u00dd\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dc"+
		"\u00d1\3\2\2\2\u00dd \3\2\2\2\u00de\u00df\7]\2\2\u00df\u00ec\7_\2\2\u00e0"+
		"\u00e1\7]\2\2\u00e1\u00e6\5\27\f\2\u00e2\u00e3\7.\2\2\u00e3\u00e5\5\27"+
		"\f\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7_"+
		"\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb\u00e0\3\2\2\2\u00ec"+
		"\"\3\2\2\2\u00ed\u00ee\7]\2\2\u00ee\u00fb\7_\2\2\u00ef\u00f0\7]\2\2\u00f0"+
		"\u00f5\5\31\r\2\u00f1\u00f2\7.\2\2\u00f2\u00f4\5\31\r\2\u00f3\u00f1\3"+
		"\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7_\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00ed\3\2\2\2\u00fa\u00ef\3\2\2\2\u00fb$\3\2\2\2\u00fc\u00fd"+
		"\7]\2\2\u00fd\u010a\7_\2\2\u00fe\u00ff\7]\2\2\u00ff\u0104\5\35\17\2\u0100"+
		"\u0101\7.\2\2\u0101\u0103\5\35\17\2\u0102\u0100\3\2\2\2\u0103\u0106\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\7_\2\2\u0108\u010a\3\2\2\2\u0109\u00fc\3\2"+
		"\2\2\u0109\u00fe\3\2\2\2\u010a&\3\2\2\2\u010b\u010c\7-\2\2\u010c(\3\2"+
		"\2\2\u010d\u010e\7/\2\2\u010e*\3\2\2\2\u010f\u0110\7,\2\2\u0110,\3\2\2"+
		"\2\u0111\u0112\7\61\2\2\u0112.\3\2\2\2\u0113\u0114\7t\2\2\u0114\u0115"+
		"\7q\2\2\u0115\u0116\7w\2\2\u0116\u0117\7p\2\2\u0117\u0118\7f\2\2\u0118"+
		"\60\3\2\2\2\u0119\u011a\7c\2\2\u011a\u011b\7d\2\2\u011b\u011c\7u\2\2\u011c"+
		"\62\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f\7t\2\2\u011f\u0120\7w\2\2\u0120"+
		"\u0121\7p\2\2\u0121\u0122\7e\2\2\u0122\64\3\2\2\2\u0123\u0124\7g\2\2\u0124"+
		"\u0125\7z\2\2\u0125\u0126\7r\2\2\u0126\66\3\2\2\2\u0127\u0128\7n\2\2\u0128"+
		"\u0129\7p\2\2\u01298\3\2\2\2\u012a\u012b\7n\2\2\u012b\u012c\7q\2\2\u012c"+
		"\u012d\7i\2\2\u012d:\3\2\2\2\u012e\u012f\7r\2\2\u012f\u0130\7q\2\2\u0130"+
		"\u0131\7y\2\2\u0131<\3\2\2\2\u0132\u0133\7p\2\2\u0133\u0134\7t\2\2\u0134"+
		"\u0135\7q\2\2\u0135\u0136\7q\2\2\u0136\u0137\7v\2\2\u0137>\3\2\2\2\u0138"+
		"\u0139\7o\2\2\u0139\u013a\7q\2\2\u013a\u013b\7f\2\2\u013b@\3\2\2\2\u013c"+
		"\u013d\7\"\2\2\u013d\u013e\7c\2\2\u013e\u013f\7p\2\2\u013f\u0140\7f\2"+
		"\2\u0140\u0141\7\"\2\2\u0141B\3\2\2\2\u0142\u0143\7\"\2\2\u0143\u0144"+
		"\7q\2\2\u0144\u0145\7t\2\2\u0145\u0146\7\"\2\2\u0146D\3\2\2\2\u0147\u0148"+
		"\7\"\2\2\u0148\u0149\7z\2\2\u0149\u014a\7q\2\2\u014a\u014b\7t\2\2\u014b"+
		"\u014c\7\"\2\2\u014cF\3\2\2\2\u014d\u014e\7p\2\2\u014e\u014f\7q\2\2\u014f"+
		"\u0150\7v\2\2\u0150\u0151\7\"\2\2\u0151H\3\2\2\2\u0152\u0153\7\"\2\2\u0153"+
		"\u0154\7k\2\2\u0154\u0155\7p\2\2\u0155\u0156\7\"\2\2\u0156J\3\2\2\2\u0157"+
		"\u0158\7\"\2\2\u0158\u0159\7d\2\2\u0159\u015a\7g\2\2\u015a\u015b\7v\2"+
		"\2\u015b\u015c\7y\2\2\u015c\u015d\7g\2\2\u015d\u015e\7g\2\2\u015e\u015f"+
		"\7p\2\2\u015f\u0160\7\"\2\2\u0160L\3\2\2\2\u0161\u0162\7k\2\2\u0162\u0163"+
		"\7u\2\2\u0163\u0164\7p\2\2\u0164\u0165\7w\2\2\u0165\u0166\7n\2\2\u0166"+
		"\u0167\7n\2\2\u0167N\3\2\2\2\u0168\u0169\7o\2\2\u0169\u016a\7c\2\2\u016a"+
		"\u016b\7v\2\2\u016b\u016c\7e\2\2\u016c\u016d\7j\2\2\u016d\u016e\7a\2\2"+
		"\u016e\u016f\7e\2\2\u016f\u0170\7j\2\2\u0170\u0171\7c\2\2\u0171\u0172"+
		"\7t\2\2\u0172\u0173\7c\2\2\u0173\u0174\7e\2\2\u0174\u0175\7v\2\2\u0175"+
		"\u0176\7g\2\2\u0176\u0177\7t\2\2\u0177\u0178\7u\2\2\u0178P\3\2\2\2\u0179"+
		"\u017a\7o\2\2\u017a\u017b\7c\2\2\u017b\u017c\7v\2\2\u017c\u017d\7e\2\2"+
		"\u017d\u017e\7j\2\2\u017e\u017f\7a\2\2\u017f\u0180\7x\2\2\u0180\u0181"+
		"\7c\2\2\u0181\u0182\7n\2\2\u0182\u0183\7w\2\2\u0183\u0184\7g\2\2\u0184"+
		"\u0185\7u\2\2\u0185R\3\2\2\2\u0186\u0187\7n\2\2\u0187\u0188\7g\2\2\u0188"+
		"\u0189\7p\2\2\u0189\u018a\7i\2\2\u018a\u018b\7v\2\2\u018b\u018c\7j\2\2"+
		"\u018cT\3\2\2\2\u018d\u018e\7v\2\2\u018e\u018f\7t\2\2\u018f\u0190\7k\2"+
		"\2\u0190\u0191\7o\2\2\u0191V\3\2\2\2\u0192\u0193\7w\2\2\u0193\u0194\7"+
		"r\2\2\u0194\u0195\7r\2\2\u0195\u0196\7g\2\2\u0196\u0197\7t\2\2\u0197X"+
		"\3\2\2\2\u0198\u0199\7n\2\2\u0199\u019a\7q\2\2\u019a\u019b\7y\2\2\u019b"+
		"\u019c\7g\2\2\u019c\u019d\7t\2\2\u019dZ\3\2\2\2\u019e\u019f\7u\2\2\u019f"+
		"\u01a0\7w\2\2\u01a0\u01a1\7d\2\2\u01a1\u01a2\7u\2\2\u01a2\u01a3\7v\2\2"+
		"\u01a3\u01a4\7t\2\2\u01a4\\\3\2\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\7p"+
		"\2\2\u01a7\u01a8\7f\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7z\2\2\u01aa\u01ab"+
		"\7q\2\2\u01ab\u01ac\7h\2\2\u01ac^\3\2\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af"+
		"\7h\2\2\u01af\u01b0\7\"\2\2\u01b0`\3\2\2\2\u01b1\u01b2\7\"\2\2\u01b2\u01b3"+
		"\7v\2\2\u01b3\u01b4\7j\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7p\2\2\u01b6"+
		"\u01b7\7\"\2\2\u01b7b\3\2\2\2\u01b8\u01b9\7\"\2\2\u01b9\u01ba\7g\2\2\u01ba"+
		"\u01bb\7n\2\2\u01bb\u01bc\7u\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7\"\2"+
		"\2\u01bed\3\2\2\2\u01bf\u01c0\7\"\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c2\7"+
		"n\2\2\u01c2\u01c3\7u\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6"+
		"\7h\2\2\u01c6\u01c7\7\"\2\2\u01c7f\3\2\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca"+
		"\7x\2\2\u01ca\u01cb\7n\2\2\u01cbh\3\2\2\2\u01cc\u01cd\7u\2\2\u01cd\u01ce"+
		"\7w\2\2\u01ce\u01cf\7o\2\2\u01cfj\3\2\2\2\u01d0\u01d1\7c\2\2\u01d1\u01d2"+
		"\7x\2\2\u01d2\u01d3\7i\2\2\u01d3l\3\2\2\2\u01d4\u01d5\7o\2\2\u01d5\u01d6"+
		"\7g\2\2\u01d6\u01d7\7f\2\2\u01d7\u01d8\7k\2\2\u01d8\u01d9\7c\2\2\u01d9"+
		"\u01da\7p\2\2\u01dan\3\2\2\2\u01db\u01dc\7e\2\2\u01dc\u01dd\7q\2\2\u01dd"+
		"\u01de\7w\2\2\u01de\u01df\7p\2\2\u01df\u01e0\7v\2\2\u01e0p\3\2\2\2\u01e1"+
		"\u01e2\7e\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e4\7w\2\2\u01e4\u01e5\7p\2\2"+
		"\u01e5\u01e6\7v\2\2\u01e6\u01e7\7a\2\2\u01e7\u01e8\7f\2\2\u01e8\u01e9"+
		"\7k\2\2\u01e9\u01ea\7u\2\2\u01ea\u01eb\7v\2\2\u01eb\u01ec\7k\2\2\u01ec"+
		"\u01ed\7p\2\2\u01ed\u01ee\7e\2\2\u01ee\u01ef\7v\2\2\u01efr\3\2\2\2\u01f0"+
		"\u01f1\7o\2\2\u01f1\u01f2\7k\2\2\u01f2\u01f3\7p\2\2\u01f3t\3\2\2\2\u01f4"+
		"\u01f5\7o\2\2\u01f5\u01f6\7c\2\2\u01f6\u01f7\7z\2\2\u01f7v\3\2\2\2\u01f8"+
		"\u01fc\t\4\2\2\u01f9\u01fb\t\5\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2"+
		"\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fdx\3\2\2\2\u01fe\u01fc"+
		"\3\2\2\2\u01ff\u0209\5w<\2\u0200\u0201\5w<\2\u0201\u0202\5{>\2\u0202\u0203"+
		"\5y=\2\u0203\u0209\3\2\2\2\u0204\u0209\5}?\2\u0205\u0209\5\177@\2\u0206"+
		"\u0209\5\u0081A\2\u0207\u0209\5\u0083B\2\u0208\u01ff\3\2\2\2\u0208\u0200"+
		"\3\2\2\2\u0208\u0204\3\2\2\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0207\3\2\2\2\u0209z\3\2\2\2\u020a\u020b\7\61\2\2\u020b|\3\2\2\2\u020c"+
		"\u020d\7j\2\2\u020d\u020e\7v\2\2\u020e\u020f\7v\2\2\u020f\u0210\7r\2\2"+
		"\u0210\u0211\7<\2\2\u0211\u0212\7\61\2\2\u0212\u0213\7\61\2\2\u0213\u0214"+
		"\7y\2\2\u0214\u0215\7y\2\2\u0215\u0216\7y\2\2\u0216\u0217\7\60\2\2\u0217"+
		"\u0219\3\2\2\2\u0218\u021a\t\6\2\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c~\3\2\2\2\u021d\u021f"+
		"\t\7\2\2\u021e\u0220\t\5\2\2\u021f\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u022c\t\7"+
		"\2\2\u0224\u0226\t\5\2\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\t\7"+
		"\2\2\u022a\u0225\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u0080\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0233\t\7"+
		"\2\2\u0230\u0232\t\5\2\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u023e\3\2\2\2\u0235\u0233\3\2"+
		"\2\2\u0236\u0238\t\7\2\2\u0237\u0239\t\5\2\2\u0238\u0237\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2"+
		"\2\2\u023c\u0236\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\t\5"+
		"\2\2\u0242\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0242\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\7\60\2\2\u0247\u0248\7"+
		"l\2\2\u0248\u0249\7u\2\2\u0249\u024a\7q\2\2\u024a\u024b\7p\2\2\u024b\u0082"+
		"\3\2\2\2\u024c\u024d\t\b\2\2\u024d\u024e\7<\2\2\u024e\u0257\t\t\2\2\u024f"+
		"\u0251\t\5\2\2\u0250\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0250\3\2"+
		"\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\t\t\2\2\u0255"+
		"\u0250\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2"+
		"\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025c\t\5\2\2\u025b"+
		"\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2"+
		"\2\2\u025e\u025f\3\2\2\2\u025f\u0260\7\60\2\2\u0260\u0261\7l\2\2\u0261"+
		"\u0262\7u\2\2\u0262\u0263\7q\2\2\u0263\u0264\7p\2\2\u0264\u0084\3\2\2"+
		"\2\35\2\u00a6\u00ab\u00b1\u00c5\u00cb\u00d7\u00dc\u00e6\u00eb\u00f5\u00fa"+
		"\u0104\u0109\u01fc\u0208\u021b\u0221\u0227\u022c\u0233\u023a\u023e\u0244"+
		"\u0252\u0257\u025d\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}