package parser;// Generated from C:/Users/Roberto/Documents/GitHub/samizDB/src/main/antlr4\VTL.g4 by ANTLR 4.5.1
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "SINGLE_APIX_TOKEN", 
		"ASSIGN_SYMBOL", "QUIT_TOKEN", "GET_TOKEN", "INTEGER_TOKEN", "NUMERIC_TOKEN", 
		"BOOL_TOKEN", "STRING_TOKEN", "LIST_BOOL_TOKEN", "LIST_INTEGER_TOKEN", 
		"LIST_NUMERIC_TOKEN", "LIST_STRING_TOKEN", "PATTERN_TOKEN", "SUM_TOKEN", 
		"DIFFERENCE_TOKEN", "PRODUCT_TOKEN", "DIVISION_TOKEN", "PAR_OPEN_TOKEN", 
		"PAR_CLOSED_TOKEN", "ROUND_TOKEN", "ABS_TOKEN", "TRUNC_TOKEN", "EXP_TOKEN", 
		"LN_TOKEN", "LOG_TOKEN", "POWER_TOKEN", "NROOT_TOKEN", "MOD_TOKEN", "MAJOR_TOKEN", 
		"MINOR_TOKEN", "EQUAL_TOKEN", "MAJOR_EQUAL_TOKEN", "MINOR_EQUAL_TOKEN", 
		"AND_TOKEN", "OR_TOKEN", "XOR_TOKEN", "NOT_TOKEN", "IN_TOKEN", "BETWEEN_TOKEN", 
		"ISNULL_TOKEN", "MATCH_CHARACTERS_TOKEN", "MATCH_VALUES_TOKEN", "LENGTH_TOKEN", 
		"TRIM_TOKEN", "UPPER_TOKEN", "LOWER_TOKEN", "SUBSTR_TOKEN", "INDEXOF_TOKEN", 
		"CONCAT_TOKEN", "IF_TOKEN", "THEN_TOKEN", "ELSE_TOKEN", "ELSEIF_TOKEN", 
		"NVL_TOKEN", "AGGR_SUM_TOKEN", "AGGR_AVG_TOKEN", "AGGR_MEDIAN_TOKEN", 
		"AGGR_COUNT_TOKEN", "AGGR_COUNT_DISTINCT_TOKEN", "AGGR_MIN_TOKEN", "AGGR_MAX_TOKEN", 
		"ID", "DATASET_ID", "FIELD_SEP", "URL", "MONGO_PATH", "LINUX_PATH", "WINDOWS_PATH", 
		"CREATE_HIER_TOKEN", "ASSOCIATION_TOKEN", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2P\u02f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\6\r\u00c9\n\r\r\r\16\r\u00ca\3\16\6\16\u00ce\n\16\r\16\16\16\u00cf\3"+
		"\16\3\16\6\16\u00d4\n\16\r\16\16\16\u00d5\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ea"+
		"\n\17\3\20\3\20\6\20\u00ee\n\20\r\20\16\20\u00ef\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u00fc\n\21\f\21\16\21\u00ff\13\21\3"+
		"\21\3\21\5\21\u0103\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u010d\n\22\f\22\16\22\u0110\13\22\3\22\3\22\5\22\u0114\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u011e\n\23\f\23\16\23\u0121\13\23"+
		"\3\23\3\23\5\23\u0125\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u012f\n\24\f\24\16\24\u0132\13\24\3\24\3\24\5\24\u0136\n\24\3\25\3\25"+
		"\7\25\u013a\n\25\f\25\16\25\u013d\13\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\3"+
		"8\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3"+
		"<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3"+
		"F\7F\u0259\nF\fF\16F\u025c\13F\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0267\nG"+
		"\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\6I\u0278\nI\rI\16I\u0279"+
		"\3J\3J\6J\u027e\nJ\rJ\16J\u027f\3J\3J\6J\u0284\nJ\rJ\16J\u0285\3J\7J\u0289"+
		"\nJ\fJ\16J\u028c\13J\3K\3K\7K\u0290\nK\fK\16K\u0293\13K\3K\3K\6K\u0297"+
		"\nK\rK\16K\u0298\7K\u029b\nK\fK\16K\u029e\13K\3K\6K\u02a1\nK\rK\16K\u02a2"+
		"\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\6L\u02af\nL\rL\16L\u02b0\3L\7L\u02b4\n"+
		"L\fL\16L\u02b7\13L\3L\6L\u02ba\nL\rL\16L\u02bb\3L\3L\3L\3L\3L\3L\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3"+
		"O\6O\u02dd\nO\rO\16O\u02de\3O\6O\u02e2\nO\rO\16O\u02e3\3O\6O\u02e7\nO"+
		"\rO\16O\u02e8\3O\6O\u02ec\nO\rO\16O\u02ed\5O\u02f0\nO\3O\3O\3\u013b\2"+
		"P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\3\2\n\3\2\62"+
		";\5\2\62;C\\c|\5\2C\\aac|\7\2//\62;C\\aac|\7\2/;C\\^^aac|\4\2\61\61^^"+
		"\3\2C\\\3\2^^\u0319\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\3\u009f\3\2\2\2\5\u00a2\3\2\2\2\7\u00a5\3\2\2\2\t\u00a7\3\2\2"+
		"\2\13\u00b0\3\2\2\2\r\u00b2\3\2\2\2\17\u00b4\3\2\2\2\21\u00b9\3\2\2\2"+
		"\23\u00bb\3\2\2\2\25\u00be\3\2\2\2\27\u00c3\3\2\2\2\31\u00c8\3\2\2\2\33"+
		"\u00cd\3\2\2\2\35\u00e9\3\2\2\2\37\u00eb\3\2\2\2!\u0102\3\2\2\2#\u0113"+
		"\3\2\2\2%\u0124\3\2\2\2\'\u0135\3\2\2\2)\u0137\3\2\2\2+\u0140\3\2\2\2"+
		"-\u0142\3\2\2\2/\u0144\3\2\2\2\61\u0146\3\2\2\2\63\u0148\3\2\2\2\65\u014a"+
		"\3\2\2\2\67\u014c\3\2\2\29\u0152\3\2\2\2;\u0156\3\2\2\2=\u015c\3\2\2\2"+
		"?\u0160\3\2\2\2A\u0163\3\2\2\2C\u0167\3\2\2\2E\u016b\3\2\2\2G\u0171\3"+
		"\2\2\2I\u0175\3\2\2\2K\u0177\3\2\2\2M\u0179\3\2\2\2O\u017c\3\2\2\2Q\u017f"+
		"\3\2\2\2S\u0182\3\2\2\2U\u0188\3\2\2\2W\u018d\3\2\2\2Y\u0193\3\2\2\2["+
		"\u0198\3\2\2\2]\u019d\3\2\2\2_\u01a7\3\2\2\2a\u01af\3\2\2\2c\u01c1\3\2"+
		"\2\2e\u01cf\3\2\2\2g\u01d7\3\2\2\2i\u01dd\3\2\2\2k\u01e4\3\2\2\2m\u01eb"+
		"\3\2\2\2o\u01f3\3\2\2\2q\u01fc\3\2\2\2s\u0204\3\2\2\2u\u0208\3\2\2\2w"+
		"\u020f\3\2\2\2y\u0216\3\2\2\2{\u021f\3\2\2\2}\u0223\3\2\2\2\177\u0228"+
		"\3\2\2\2\u0081\u022d\3\2\2\2\u0083\u0235\3\2\2\2\u0085\u023c\3\2\2\2\u0087"+
		"\u024c\3\2\2\2\u0089\u0251\3\2\2\2\u008b\u0256\3\2\2\2\u008d\u0266\3\2"+
		"\2\2\u008f\u0268\3\2\2\2\u0091\u026a\3\2\2\2\u0093\u027b\3\2\2\2\u0095"+
		"\u028d\3\2\2\2\u0097\u02aa\3\2\2\2\u0099\u02c3\3\2\2\2\u009b\u02da\3\2"+
		"\2\2\u009d\u02ef\3\2\2\2\u009f\u00a0\7*\2\2\u00a0\u00a1\7$\2\2\u00a1\4"+
		"\3\2\2\2\u00a2\u00a3\7$\2\2\u00a3\u00a4\7+\2\2\u00a4\6\3\2\2\2\u00a5\u00a6"+
		"\7.\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7i\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa"+
		"\7q\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7\"\2\2\u00ad"+
		"\u00ae\7d\2\2\u00ae\u00af\7{\2\2\u00af\n\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1"+
		"\f\3\2\2\2\u00b2\u00b3\7=\2\2\u00b3\16\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5"+
		"\u00b6\7j\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7p\2\2\u00b8\20\3\2\2\2\u00b9"+
		"\u00ba\7)\2\2\u00ba\22\3\2\2\2\u00bb\u00bc\7<\2\2\u00bc\u00bd\7?\2\2\u00bd"+
		"\24\3\2\2\2\u00be\u00bf\7S\2\2\u00bf\u00c0\7W\2\2\u00c0\u00c1\7K\2\2\u00c1"+
		"\u00c2\7V\2\2\u00c2\26\3\2\2\2\u00c3\u00c4\7I\2\2\u00c4\u00c5\7G\2\2\u00c5"+
		"\u00c6\7V\2\2\u00c6\30\3\2\2\2\u00c7\u00c9\t\2\2\2\u00c8\u00c7\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\32"+
		"\3\2\2\2\u00cc\u00ce\t\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\7\60"+
		"\2\2\u00d2\u00d4\t\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\34\3\2\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\u00d9\7t\2\2\u00d9\u00da\7w\2\2\u00da\u00ea\7g\2\2\u00db\u00dc"+
		"\7h\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7u\2\2\u00df"+
		"\u00ea\7g\2\2\u00e0\u00e1\7V\2\2\u00e1\u00e2\7T\2\2\u00e2\u00e3\7W\2\2"+
		"\u00e3\u00ea\7G\2\2\u00e4\u00e5\7H\2\2\u00e5\u00e6\7C\2\2\u00e6\u00e7"+
		"\7N\2\2\u00e7\u00e8\7U\2\2\u00e8\u00ea\7G\2\2\u00e9\u00d7\3\2\2\2\u00e9"+
		"\u00db\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e4\3\2\2\2\u00ea\36\3\2\2"+
		"\2\u00eb\u00ed\7$\2\2\u00ec\u00ee\t\3\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\7$\2\2\u00f2 \3\2\2\2\u00f3\u00f4\7]\2\2\u00f4\u0103\7_\2\2\u00f5"+
		"\u00f6\7]\2\2\u00f6\u00fd\5\35\17\2\u00f7\u00f8\7.\2\2\u00f8\u00f9\7\""+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\5\35\17\2\u00fb\u00f7\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7_\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00f3\3\2\2\2\u0102\u00f5\3\2\2\2\u0103\"\3\2\2\2\u0104\u0105\7]\2\2"+
		"\u0105\u0114\7_\2\2\u0106\u0107\7]\2\2\u0107\u010e\5\31\r\2\u0108\u0109"+
		"\7.\2\2\u0109\u010a\7\"\2\2\u010a\u010b\3\2\2\2\u010b\u010d\5\31\r\2\u010c"+
		"\u0108\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7_\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0104\3\2\2\2\u0113\u0106\3\2\2\2\u0114$\3\2\2\2"+
		"\u0115\u0116\7]\2\2\u0116\u0125\7_\2\2\u0117\u0118\7]\2\2\u0118\u011f"+
		"\5\33\16\2\u0119\u011a\7.\2\2\u011a\u011b\7\"\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011e\5\33\16\2\u011d\u0119\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0123\7_\2\2\u0123\u0125\3\2\2\2\u0124\u0115\3\2\2\2\u0124\u0117\3\2"+
		"\2\2\u0125&\3\2\2\2\u0126\u0127\7]\2\2\u0127\u0136\7_\2\2\u0128\u0129"+
		"\7]\2\2\u0129\u0130\5\37\20\2\u012a\u012b\7.\2\2\u012b\u012c\7\"\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\5\37\20\2\u012e\u012a\3\2\2\2\u012f\u0132\3"+
		"\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0134\7_\2\2\u0134\u0136\3\2\2\2\u0135\u0126\3\2"+
		"\2\2\u0135\u0128\3\2\2\2\u0136(\3\2\2\2\u0137\u013b\5\21\t\2\u0138\u013a"+
		"\13\2\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f"+
		"\5\21\t\2\u013f*\3\2\2\2\u0140\u0141\7-\2\2\u0141,\3\2\2\2\u0142\u0143"+
		"\7/\2\2\u0143.\3\2\2\2\u0144\u0145\7,\2\2\u0145\60\3\2\2\2\u0146\u0147"+
		"\7\61\2\2\u0147\62\3\2\2\2\u0148\u0149\7*\2\2\u0149\64\3\2\2\2\u014a\u014b"+
		"\7+\2\2\u014b\66\3\2\2\2\u014c\u014d\7t\2\2\u014d\u014e\7q\2\2\u014e\u014f"+
		"\7w\2\2\u014f\u0150\7p\2\2\u0150\u0151\7f\2\2\u01518\3\2\2\2\u0152\u0153"+
		"\7c\2\2\u0153\u0154\7d\2\2\u0154\u0155\7u\2\2\u0155:\3\2\2\2\u0156\u0157"+
		"\7v\2\2\u0157\u0158\7t\2\2\u0158\u0159\7w\2\2\u0159\u015a\7p\2\2\u015a"+
		"\u015b\7e\2\2\u015b<\3\2\2\2\u015c\u015d\7g\2\2\u015d\u015e\7z\2\2\u015e"+
		"\u015f\7r\2\2\u015f>\3\2\2\2\u0160\u0161\7n\2\2\u0161\u0162\7p\2\2\u0162"+
		"@\3\2\2\2\u0163\u0164\7n\2\2\u0164\u0165\7q\2\2\u0165\u0166\7i\2\2\u0166"+
		"B\3\2\2\2\u0167\u0168\7r\2\2\u0168\u0169\7q\2\2\u0169\u016a\7y\2\2\u016a"+
		"D\3\2\2\2\u016b\u016c\7p\2\2\u016c\u016d\7t\2\2\u016d\u016e\7q\2\2\u016e"+
		"\u016f\7q\2\2\u016f\u0170\7v\2\2\u0170F\3\2\2\2\u0171\u0172\7o\2\2\u0172"+
		"\u0173\7q\2\2\u0173\u0174\7f\2\2\u0174H\3\2\2\2\u0175\u0176\7@\2\2\u0176"+
		"J\3\2\2\2\u0177\u0178\7>\2\2\u0178L\3\2\2\2\u0179\u017a\7?\2\2\u017a\u017b"+
		"\7?\2\2\u017bN\3\2\2\2\u017c\u017d\7@\2\2\u017d\u017e\7?\2\2\u017eP\3"+
		"\2\2\2\u017f\u0180\7>\2\2\u0180\u0181\7?\2\2\u0181R\3\2\2\2\u0182\u0183"+
		"\7\"\2\2\u0183\u0184\7c\2\2\u0184\u0185\7p\2\2\u0185\u0186\7f\2\2\u0186"+
		"\u0187\7\"\2\2\u0187T\3\2\2\2\u0188\u0189\7\"\2\2\u0189\u018a\7q\2\2\u018a"+
		"\u018b\7t\2\2\u018b\u018c\7\"\2\2\u018cV\3\2\2\2\u018d\u018e\7\"\2\2\u018e"+
		"\u018f\7z\2\2\u018f\u0190\7q\2\2\u0190\u0191\7t\2\2\u0191\u0192\7\"\2"+
		"\2\u0192X\3\2\2\2\u0193\u0194\7p\2\2\u0194\u0195\7q\2\2\u0195\u0196\7"+
		"v\2\2\u0196\u0197\7\"\2\2\u0197Z\3\2\2\2\u0198\u0199\7\"\2\2\u0199\u019a"+
		"\7k\2\2\u019a\u019b\7p\2\2\u019b\u019c\7\"\2\2\u019c\\\3\2\2\2\u019d\u019e"+
		"\7\"\2\2\u019e\u019f\7d\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7v\2\2\u01a1"+
		"\u01a2\7y\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7p\2\2"+
		"\u01a5\u01a6\7\"\2\2\u01a6^\3\2\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7u"+
		"\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7w\2\2\u01ab\u01ac\7n\2\2\u01ac\u01ad"+
		"\7n\2\2\u01ad\u01ae\7*\2\2\u01ae`\3\2\2\2\u01af\u01b0\7o\2\2\u01b0\u01b1"+
		"\7c\2\2\u01b1\u01b2\7v\2\2\u01b2\u01b3\7e\2\2\u01b3\u01b4\7j\2\2\u01b4"+
		"\u01b5\7a\2\2\u01b5\u01b6\7e\2\2\u01b6\u01b7\7j\2\2\u01b7\u01b8\7c\2\2"+
		"\u01b8\u01b9\7t\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc"+
		"\7v\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7t\2\2\u01be\u01bf\7u\2\2\u01bf"+
		"\u01c0\7*\2\2\u01c0b\3\2\2\2\u01c1\u01c2\7o\2\2\u01c2\u01c3\7c\2\2\u01c3"+
		"\u01c4\7v\2\2\u01c4\u01c5\7e\2\2\u01c5\u01c6\7j\2\2\u01c6\u01c7\7a\2\2"+
		"\u01c7\u01c8\7x\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7n\2\2\u01ca\u01cb"+
		"\7w\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7u\2\2\u01cd\u01ce\7*\2\2\u01ce"+
		"d\3\2\2\2\u01cf\u01d0\7n\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7p\2\2\u01d2"+
		"\u01d3\7i\2\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7j\2\2\u01d5\u01d6\7*\2\2"+
		"\u01d6f\3\2\2\2\u01d7\u01d8\7v\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7k\2"+
		"\2\u01da\u01db\7o\2\2\u01db\u01dc\7*\2\2\u01dch\3\2\2\2\u01dd\u01de\7"+
		"w\2\2\u01de\u01df\7r\2\2\u01df\u01e0\7r\2\2\u01e0\u01e1\7g\2\2\u01e1\u01e2"+
		"\7t\2\2\u01e2\u01e3\7*\2\2\u01e3j\3\2\2\2\u01e4\u01e5\7n\2\2\u01e5\u01e6"+
		"\7q\2\2\u01e6\u01e7\7y\2\2\u01e7\u01e8\7g\2\2\u01e8\u01e9\7t\2\2\u01e9"+
		"\u01ea\7*\2\2\u01eal\3\2\2\2\u01eb\u01ec\7u\2\2\u01ec\u01ed\7w\2\2\u01ed"+
		"\u01ee\7d\2\2\u01ee\u01ef\7u\2\2\u01ef\u01f0\7v\2\2\u01f0\u01f1\7t\2\2"+
		"\u01f1\u01f2\7*\2\2\u01f2n\3\2\2\2\u01f3\u01f4\7k\2\2\u01f4\u01f5\7p\2"+
		"\2\u01f5\u01f6\7f\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7z\2\2\u01f8\u01f9"+
		"\7q\2\2\u01f9\u01fa\7h\2\2\u01fa\u01fb\7*\2\2\u01fbp\3\2\2\2\u01fc\u01fd"+
		"\7e\2\2\u01fd\u01fe\7q\2\2\u01fe\u01ff\7p\2\2\u01ff\u0200\7e\2\2\u0200"+
		"\u0201\7c\2\2\u0201\u0202\7v\2\2\u0202\u0203\7*\2\2\u0203r\3\2\2\2\u0204"+
		"\u0205\7k\2\2\u0205\u0206\7h\2\2\u0206\u0207\7\"\2\2\u0207t\3\2\2\2\u0208"+
		"\u0209\7\"\2\2\u0209\u020a\7v\2\2\u020a\u020b\7j\2\2\u020b\u020c\7g\2"+
		"\2\u020c\u020d\7p\2\2\u020d\u020e\7\"\2\2\u020ev\3\2\2\2\u020f\u0210\7"+
		"\"\2\2\u0210\u0211\7g\2\2\u0211\u0212\7n\2\2\u0212\u0213\7u\2\2\u0213"+
		"\u0214\7g\2\2\u0214\u0215\7\"\2\2\u0215x\3\2\2\2\u0216\u0217\7\"\2\2\u0217"+
		"\u0218\7g\2\2\u0218\u0219\7n\2\2\u0219\u021a\7u\2\2\u021a\u021b\7g\2\2"+
		"\u021b\u021c\7k\2\2\u021c\u021d\7h\2\2\u021d\u021e\7\"\2\2\u021ez\3\2"+
		"\2\2\u021f\u0220\7p\2\2\u0220\u0221\7x\2\2\u0221\u0222\7n\2\2\u0222|\3"+
		"\2\2\2\u0223\u0224\7u\2\2\u0224\u0225\7w\2\2\u0225\u0226\7o\2\2\u0226"+
		"\u0227\7*\2\2\u0227~\3\2\2\2\u0228\u0229\7c\2\2\u0229\u022a\7x\2\2\u022a"+
		"\u022b\7i\2\2\u022b\u022c\7*\2\2\u022c\u0080\3\2\2\2\u022d\u022e\7o\2"+
		"\2\u022e\u022f\7g\2\2\u022f\u0230\7f\2\2\u0230\u0231\7k\2\2\u0231\u0232"+
		"\7c\2\2\u0232\u0233\7p\2\2\u0233\u0234\7*\2\2\u0234\u0082\3\2\2\2\u0235"+
		"\u0236\7e\2\2\u0236\u0237\7q\2\2\u0237\u0238\7w\2\2\u0238\u0239\7p\2\2"+
		"\u0239\u023a\7v\2\2\u023a\u023b\7*\2\2\u023b\u0084\3\2\2\2\u023c\u023d"+
		"\7e\2\2\u023d\u023e\7q\2\2\u023e\u023f\7w\2\2\u023f\u0240\7p\2\2\u0240"+
		"\u0241\7v\2\2\u0241\u0242\7a\2\2\u0242\u0243\7f\2\2\u0243\u0244\7k\2\2"+
		"\u0244\u0245\7u\2\2\u0245\u0246\7v\2\2\u0246\u0247\7k\2\2\u0247\u0248"+
		"\7p\2\2\u0248\u0249\7e\2\2\u0249\u024a\7v\2\2\u024a\u024b\7*\2\2\u024b"+
		"\u0086\3\2\2\2\u024c\u024d\7o\2\2\u024d\u024e\7k\2\2\u024e\u024f\7p\2"+
		"\2\u024f\u0250\7*\2\2\u0250\u0088\3\2\2\2\u0251\u0252\7o\2\2\u0252\u0253"+
		"\7c\2\2\u0253\u0254\7z\2\2\u0254\u0255\7*\2\2\u0255\u008a\3\2\2\2\u0256"+
		"\u025a\t\4\2\2\u0257\u0259\t\5\2\2\u0258\u0257\3\2\2\2\u0259\u025c\3\2"+
		"\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u008c\3\2\2\2\u025c"+
		"\u025a\3\2\2\2\u025d\u0267\5\u008bF\2\u025e\u025f\5\u008bF\2\u025f\u0260"+
		"\5\u008fH\2\u0260\u0261\5\u008dG\2\u0261\u0267\3\2\2\2\u0262\u0267\5\u0091"+
		"I\2\u0263\u0267\5\u0093J\2\u0264\u0267\5\u0095K\2\u0265\u0267\5\u0097"+
		"L\2\u0266\u025d\3\2\2\2\u0266\u025e\3\2\2\2\u0266\u0262\3\2\2\2\u0266"+
		"\u0263\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267\u008e\3\2"+
		"\2\2\u0268\u0269\7\61\2\2\u0269\u0090\3\2\2\2\u026a\u026b\7j\2\2\u026b"+
		"\u026c\7v\2\2\u026c\u026d\7v\2\2\u026d\u026e\7r\2\2\u026e\u026f\7<\2\2"+
		"\u026f\u0270\7\61\2\2\u0270\u0271\7\61\2\2\u0271\u0272\7y\2\2\u0272\u0273"+
		"\7y\2\2\u0273\u0274\7y\2\2\u0274\u0275\7\60\2\2\u0275\u0277\3\2\2\2\u0276"+
		"\u0278\t\6\2\2\u0277\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u0277\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027a\u0092\3\2\2\2\u027b\u027d\t\7\2\2\u027c"+
		"\u027e\t\5\2\2\u027d\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u028a\t\7\2\2\u0282"+
		"\u0284\t\5\2\2\u0283\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2"+
		"\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\t\7\2\2\u0288"+
		"\u0283\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2"+
		"\2\2\u028b\u0094\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u0291\t\7\2\2\u028e"+
		"\u0290\t\5\2\2\u028f\u028e\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2"+
		"\2\2\u0291\u0292\3\2\2\2\u0292\u029c\3\2\2\2\u0293\u0291\3\2\2\2\u0294"+
		"\u0296\t\7\2\2\u0295\u0297\t\5\2\2\u0296\u0295\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a"+
		"\u0294\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2"+
		"\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a1\t\5\2\2\u02a0"+
		"\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\7\60\2\2\u02a5\u02a6\7l\2\2\u02a6"+
		"\u02a7\7u\2\2\u02a7\u02a8\7q\2\2\u02a8\u02a9\7p\2\2\u02a9\u0096\3\2\2"+
		"\2\u02aa\u02ab\t\b\2\2\u02ab\u02ac\7<\2\2\u02ac\u02b5\t\t\2\2\u02ad\u02af"+
		"\t\5\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\t\t\2\2\u02b3\u02ae\3\2"+
		"\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02ba\t\5\2\2\u02b9\u02b8\3\2"+
		"\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02be\7\60\2\2\u02be\u02bf\7l\2\2\u02bf\u02c0\7u"+
		"\2\2\u02c0\u02c1\7q\2\2\u02c1\u02c2\7p\2\2\u02c2\u0098\3\2\2\2\u02c3\u02c4"+
		"\7e\2\2\u02c4\u02c5\7t\2\2\u02c5\u02c6\7g\2\2\u02c6\u02c7\7c\2\2\u02c7"+
		"\u02c8\7v\2\2\u02c8\u02c9\7g\2\2\u02c9\u02ca\7\"\2\2\u02ca\u02cb\7j\2"+
		"\2\u02cb\u02cc\7k\2\2\u02cc\u02cd\7g\2\2\u02cd\u02ce\7t\2\2\u02ce\u02cf"+
		"\7c\2\2\u02cf\u02d0\7t\2\2\u02d0\u02d1\7e\2\2\u02d1\u02d2\7j\2\2\u02d2"+
		"\u02d3\7{\2\2\u02d3\u02d4\7a\2\2\u02d4\u02d5\7t\2\2\u02d5\u02d6\7w\2\2"+
		"\u02d6\u02d7\7n\2\2\u02d7\u02d8\7g\2\2\u02d8\u02d9\7\"\2\2\u02d9\u009a"+
		"\3\2\2\2\u02db\u02dd\7\"\2\2\u02dc\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02f0\3\2\2\2\u02e0\u02e2\7\13"+
		"\2\2\u02e1\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02f0\3\2\2\2\u02e5\u02e7\7\17\2\2\u02e6\u02e5\3"+
		"\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02f0\3\2\2\2\u02ea\u02ec\7\f\2\2\u02eb\u02ea\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef"+
		"\u02dc\3\2\2\2\u02ef\u02e1\3\2\2\2\u02ef\u02e6\3\2\2\2\u02ef\u02eb\3\2"+
		"\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\bO\2\2\u02f2\u009e\3\2\2\2#\2\u00ca"+
		"\u00cf\u00d5\u00e9\u00ef\u00fd\u0102\u010e\u0113\u011f\u0124\u0130\u0135"+
		"\u013b\u025a\u0266\u0279\u027f\u0285\u028a\u0291\u0298\u029c\u02a2\u02b0"+
		"\u02b5\u02bb\u02de\u02e3\u02e8\u02ed\u02ef\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}