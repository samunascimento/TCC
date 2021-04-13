// Generated from /home/joao_lima/Git/UFJF/Core/src/main/java/br/ufjf/dcc/gmr/core/mergenature/antlr4/grammars/cpp/CPP14.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPP14Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MultiLineMacro=7, Directive=8, 
		Alignas=9, Alignof=10, Asm=11, Auto=12, Bool=13, Break=14, Case=15, Catch=16, 
		Char=17, Char16=18, Char32=19, Class=20, Const=21, Constexpr=22, Const_cast=23, 
		Continue=24, Decltype=25, Default=26, Delete=27, Do=28, Double=29, Dynamic_cast=30, 
		Else=31, Enum=32, Explicit=33, Export=34, Extern=35, False=36, Final=37, 
		Float=38, For=39, Friend=40, Goto=41, If=42, Inline=43, Int=44, Long=45, 
		Mutable=46, Namespace=47, New=48, Noexcept=49, Nullptr=50, Operator=51, 
		Override=52, Private=53, Protected=54, Public=55, Register=56, Reinterpret_cast=57, 
		Return=58, Short=59, Signed=60, Sizeof=61, Static=62, Static_assert=63, 
		Static_cast=64, Struct=65, Switch=66, Template=67, This=68, Thread_local=69, 
		Throw=70, True=71, Try=72, Typedef=73, Typeid_=74, Typename_=75, Union=76, 
		Unsigned=77, Using=78, Virtual=79, Void=80, Volatile=81, Wchar=82, While=83, 
		LeftParen=84, RightParen=85, LeftBracket=86, RightBracket=87, LeftBrace=88, 
		RightBrace=89, Plus=90, Minus=91, Star=92, Div=93, Mod=94, Caret=95, And=96, 
		Or=97, Tilde=98, Not=99, Assign=100, Less=101, Greater=102, PlusAssign=103, 
		MinusAssign=104, StarAssign=105, DivAssign=106, ModAssign=107, XorAssign=108, 
		AndAssign=109, OrAssign=110, LeftShift=111, RightShift=112, LeftShiftAssign=113, 
		RightShiftAssign=114, Equal=115, NotEqual=116, LessEqual=117, GreaterEqual=118, 
		AndAnd=119, OrOr=120, PlusPlus=121, MinusMinus=122, Comma=123, ArrowStar=124, 
		Arrow=125, Question=126, Colon=127, Doublecolon=128, Semi=129, Dot=130, 
		DotStar=131, Ellipsis=132, Identifier=133, Integerliteral=134, Decimalliteral=135, 
		Octalliteral=136, Hexadecimalliteral=137, Binaryliteral=138, Integersuffix=139, 
		Characterliteral=140, Floatingliteral=141, Stringliteral=142, Userdefinedintegerliteral=143, 
		Userdefinedfloatingliteral=144, Userdefinedstringliteral=145, Userdefinedcharacterliteral=146, 
		Whitespace=147, Newline=148, BlockComment=149, LineComment=150;
	public static final int
		RULE_translationunit = 0, RULE_directive = 1, RULE_primaryexpression = 2, 
		RULE_idexpression = 3, RULE_unqualifiedid = 4, RULE_qualifiedid = 5, RULE_nestednamespecifier = 6, 
		RULE_lambdaexpression = 7, RULE_lambdaintroducer = 8, RULE_lambdacapture = 9, 
		RULE_capturedefault = 10, RULE_capturelist = 11, RULE_capture = 12, RULE_simplecapture = 13, 
		RULE_initcapture = 14, RULE_lambdadeclarator = 15, RULE_postfixexpression = 16, 
		RULE_arrayaccess = 17, RULE_functioninvocation = 18, RULE_typeidofexpr = 19, 
		RULE_typeidofthetypeid = 20, RULE_expressionlist = 21, RULE_pseudodestructorname = 22, 
		RULE_pseudodestructdeclaration = 23, RULE_pseudodestructcaller = 24, RULE_unaryexpression = 25, 
		RULE_unaryoperator = 26, RULE_newexpression = 27, RULE_newplacement = 28, 
		RULE_newtypeid = 29, RULE_newdeclarator = 30, RULE_noptrnewdeclarator = 31, 
		RULE_newinitializer = 32, RULE_deleteexpression = 33, RULE_noexceptexpression = 34, 
		RULE_castexpression = 35, RULE_realcastexpression = 36, RULE_pmexpression = 37, 
		RULE_multiplicativeexpression = 38, RULE_additiveexpression = 39, RULE_shiftexpression = 40, 
		RULE_shiftoperator = 41, RULE_relationalexpression = 42, RULE_equalityexpression = 43, 
		RULE_andexpression = 44, RULE_exclusiveorexpression = 45, RULE_inclusiveorexpression = 46, 
		RULE_logicalandexpression = 47, RULE_logicalorexpression = 48, RULE_conditionalexpression = 49, 
		RULE_assignmentexpression = 50, RULE_realassignmentexpression = 51, RULE_assignmentoperator = 52, 
		RULE_expression = 53, RULE_constantexpression = 54, RULE_statement = 55, 
		RULE_labeledstatement = 56, RULE_caseexpression = 57, RULE_expressionstatement = 58, 
		RULE_compoundstatement = 59, RULE_statementseq = 60, RULE_selectionstatement = 61, 
		RULE_ifstatement = 62, RULE_ifexpression = 63, RULE_switchexpression = 64, 
		RULE_condition = 65, RULE_iterationstatement = 66, RULE_dostatement = 67, 
		RULE_whileexpression = 68, RULE_basicforexpression = 69, RULE_enhancedforexpression = 70, 
		RULE_forinitstatement = 71, RULE_forrangedeclaration = 72, RULE_forrangeinitializer = 73, 
		RULE_jumpstatement = 74, RULE_breakstatement = 75, RULE_continuestatement = 76, 
		RULE_returnstatement = 77, RULE_declarationstatement = 78, RULE_declarationseq = 79, 
		RULE_declaration = 80, RULE_blockdeclaration = 81, RULE_aliasdeclaration = 82, 
		RULE_simpledeclaration = 83, RULE_pointerdeclaration = 84, RULE_variabledeclaration = 85, 
		RULE_static_assertdeclaration = 86, RULE_emptydeclaration = 87, RULE_attributedeclaration = 88, 
		RULE_declspecifier = 89, RULE_declspecifierseq = 90, RULE_storageclassspecifier = 91, 
		RULE_functionspecifier = 92, RULE_typedefname = 93, RULE_typespecifier = 94, 
		RULE_trailingtypespecifier = 95, RULE_typespecifierseq = 96, RULE_trailingtypespecifierseq = 97, 
		RULE_simpletypespecifier = 98, RULE_thetypename = 99, RULE_decltypespecifier = 100, 
		RULE_elaboratedtypespecifier = 101, RULE_enumname = 102, RULE_enumspecifier = 103, 
		RULE_enumhead = 104, RULE_opaqueenumdeclaration = 105, RULE_enumkey = 106, 
		RULE_enumbase = 107, RULE_enumeratorlist = 108, RULE_enumeratordefinition = 109, 
		RULE_enumerator = 110, RULE_namespacename = 111, RULE_originalnamespacename = 112, 
		RULE_namespacedefinition = 113, RULE_namespacesignature = 114, RULE_namednamespacedefinition = 115, 
		RULE_originalnamespacedefinition = 116, RULE_extensionnamespacedefinition = 117, 
		RULE_unnamednamespacedefinition = 118, RULE_namespacebody = 119, RULE_namespacealias = 120, 
		RULE_namespacealiasdefinition = 121, RULE_qualifiednamespacespecifier = 122, 
		RULE_usingdeclaration = 123, RULE_usingdirective = 124, RULE_asmdefinition = 125, 
		RULE_linkagespecification = 126, RULE_attributespecifierseq = 127, RULE_attributespecifier = 128, 
		RULE_alignmentspecifier = 129, RULE_attributelist = 130, RULE_attribute = 131, 
		RULE_attributetoken = 132, RULE_attributescopedtoken = 133, RULE_attributenamespace = 134, 
		RULE_attributeargumentclause = 135, RULE_balancedtokenseq = 136, RULE_balancedtoken = 137, 
		RULE_initdeclaratorlist = 138, RULE_initdeclarator = 139, RULE_declarator = 140, 
		RULE_ptrdeclarator = 141, RULE_noptrdeclarator = 142, RULE_arraydeclaration = 143, 
		RULE_parametersandqualifiers = 144, RULE_trailingreturntype = 145, RULE_ptroperator = 146, 
		RULE_cvqualifierseq = 147, RULE_cvqualifier = 148, RULE_refqualifier = 149, 
		RULE_declaratorid = 150, RULE_thetypeid = 151, RULE_abstractdeclarator = 152, 
		RULE_ptrabstractdeclarator = 153, RULE_noptrabstractdeclarator = 154, 
		RULE_abstractpackdeclarator = 155, RULE_noptrabstractpackdeclarator = 156, 
		RULE_parameterdeclarationclause = 157, RULE_parameterdeclarationlist = 158, 
		RULE_parameterdeclaration = 159, RULE_functiondefinition = 160, RULE_functionhead = 161, 
		RULE_functionbody = 162, RULE_initializer = 163, RULE_braceorequalinitializer = 164, 
		RULE_initializerclause = 165, RULE_initializerlist = 166, RULE_bracedinitlist = 167, 
		RULE_classname = 168, RULE_classspecifier = 169, RULE_classhead = 170, 
		RULE_classheadname = 171, RULE_classvirtspecifier = 172, RULE_classkey = 173, 
		RULE_memberspecification = 174, RULE_memberdeclaration = 175, RULE_memberdeclaratorlist = 176, 
		RULE_memberdeclarator = 177, RULE_virtspecifierseq = 178, RULE_virtspecifier = 179, 
		RULE_purespecifier = 180, RULE_baseclause = 181, RULE_basespecifierlist = 182, 
		RULE_basespecifier = 183, RULE_classordecltype = 184, RULE_basetypespecifier = 185, 
		RULE_accessspecifier = 186, RULE_conversionfunctionid = 187, RULE_conversiontypeid = 188, 
		RULE_conversiondeclarator = 189, RULE_ctorinitializer = 190, RULE_meminitializerlist = 191, 
		RULE_meminitializer = 192, RULE_meminitializerid = 193, RULE_operatorfunctionid = 194, 
		RULE_literaloperatorid = 195, RULE_templatedeclaration = 196, RULE_templateparameterlist = 197, 
		RULE_templateparameter = 198, RULE_typeparameter = 199, RULE_simpletemplateid = 200, 
		RULE_templateid = 201, RULE_templatename = 202, RULE_templateargumentlist = 203, 
		RULE_templateargument = 204, RULE_typenamespecifier = 205, RULE_explicitinstantiation = 206, 
		RULE_explicitspecialization = 207, RULE_tryblock = 208, RULE_functiontryblock = 209, 
		RULE_tryblockexpression = 210, RULE_functiontryblockexpression = 211, 
		RULE_handlerseq = 212, RULE_handler = 213, RULE_catchexpression = 214, 
		RULE_exceptiondeclaration = 215, RULE_throwexpression = 216, RULE_exceptionspecification = 217, 
		RULE_dynamicexceptionspecification = 218, RULE_typeidlist = 219, RULE_noexceptspecification = 220, 
		RULE_theoperator = 221, RULE_literal = 222, RULE_booleanliteral = 223, 
		RULE_pointerliteral = 224, RULE_userdefinedliteral = 225;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationunit", "directive", "primaryexpression", "idexpression", 
			"unqualifiedid", "qualifiedid", "nestednamespecifier", "lambdaexpression", 
			"lambdaintroducer", "lambdacapture", "capturedefault", "capturelist", 
			"capture", "simplecapture", "initcapture", "lambdadeclarator", "postfixexpression", 
			"arrayaccess", "functioninvocation", "typeidofexpr", "typeidofthetypeid", 
			"expressionlist", "pseudodestructorname", "pseudodestructdeclaration", 
			"pseudodestructcaller", "unaryexpression", "unaryoperator", "newexpression", 
			"newplacement", "newtypeid", "newdeclarator", "noptrnewdeclarator", "newinitializer", 
			"deleteexpression", "noexceptexpression", "castexpression", "realcastexpression", 
			"pmexpression", "multiplicativeexpression", "additiveexpression", "shiftexpression", 
			"shiftoperator", "relationalexpression", "equalityexpression", "andexpression", 
			"exclusiveorexpression", "inclusiveorexpression", "logicalandexpression", 
			"logicalorexpression", "conditionalexpression", "assignmentexpression", 
			"realassignmentexpression", "assignmentoperator", "expression", "constantexpression", 
			"statement", "labeledstatement", "caseexpression", "expressionstatement", 
			"compoundstatement", "statementseq", "selectionstatement", "ifstatement", 
			"ifexpression", "switchexpression", "condition", "iterationstatement", 
			"dostatement", "whileexpression", "basicforexpression", "enhancedforexpression", 
			"forinitstatement", "forrangedeclaration", "forrangeinitializer", "jumpstatement", 
			"breakstatement", "continuestatement", "returnstatement", "declarationstatement", 
			"declarationseq", "declaration", "blockdeclaration", "aliasdeclaration", 
			"simpledeclaration", "pointerdeclaration", "variabledeclaration", "static_assertdeclaration", 
			"emptydeclaration", "attributedeclaration", "declspecifier", "declspecifierseq", 
			"storageclassspecifier", "functionspecifier", "typedefname", "typespecifier", 
			"trailingtypespecifier", "typespecifierseq", "trailingtypespecifierseq", 
			"simpletypespecifier", "thetypename", "decltypespecifier", "elaboratedtypespecifier", 
			"enumname", "enumspecifier", "enumhead", "opaqueenumdeclaration", "enumkey", 
			"enumbase", "enumeratorlist", "enumeratordefinition", "enumerator", "namespacename", 
			"originalnamespacename", "namespacedefinition", "namespacesignature", 
			"namednamespacedefinition", "originalnamespacedefinition", "extensionnamespacedefinition", 
			"unnamednamespacedefinition", "namespacebody", "namespacealias", "namespacealiasdefinition", 
			"qualifiednamespacespecifier", "usingdeclaration", "usingdirective", 
			"asmdefinition", "linkagespecification", "attributespecifierseq", "attributespecifier", 
			"alignmentspecifier", "attributelist", "attribute", "attributetoken", 
			"attributescopedtoken", "attributenamespace", "attributeargumentclause", 
			"balancedtokenseq", "balancedtoken", "initdeclaratorlist", "initdeclarator", 
			"declarator", "ptrdeclarator", "noptrdeclarator", "arraydeclaration", 
			"parametersandqualifiers", "trailingreturntype", "ptroperator", "cvqualifierseq", 
			"cvqualifier", "refqualifier", "declaratorid", "thetypeid", "abstractdeclarator", 
			"ptrabstractdeclarator", "noptrabstractdeclarator", "abstractpackdeclarator", 
			"noptrabstractpackdeclarator", "parameterdeclarationclause", "parameterdeclarationlist", 
			"parameterdeclaration", "functiondefinition", "functionhead", "functionbody", 
			"initializer", "braceorequalinitializer", "initializerclause", "initializerlist", 
			"bracedinitlist", "classname", "classspecifier", "classhead", "classheadname", 
			"classvirtspecifier", "classkey", "memberspecification", "memberdeclaration", 
			"memberdeclaratorlist", "memberdeclarator", "virtspecifierseq", "virtspecifier", 
			"purespecifier", "baseclause", "basespecifierlist", "basespecifier", 
			"classordecltype", "basetypespecifier", "accessspecifier", "conversionfunctionid", 
			"conversiontypeid", "conversiondeclarator", "ctorinitializer", "meminitializerlist", 
			"meminitializer", "meminitializerid", "operatorfunctionid", "literaloperatorid", 
			"templatedeclaration", "templateparameterlist", "templateparameter", 
			"typeparameter", "simpletemplateid", "templateid", "templatename", "templateargumentlist", 
			"templateargument", "typenamespecifier", "explicitinstantiation", "explicitspecialization", 
			"tryblock", "functiontryblock", "tryblockexpression", "functiontryblockexpression", 
			"handlerseq", "handler", "catchexpression", "exceptiondeclaration", "throwexpression", 
			"exceptionspecification", "dynamicexceptionspecification", "typeidlist", 
			"noexceptspecification", "theoperator", "literal", "booleanliteral", 
			"pointerliteral", "userdefinedliteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'not'", "'&&'", "'and'", "'||'", "'or'", null, null, "'alignas'", 
			"'alignof'", "'asm'", "'auto'", "'bool'", "'break'", "'case'", "'catch'", 
			"'char'", "'char16_t'", "'char32_t'", "'class'", "'const'", "'constexpr'", 
			"'const_cast'", "'continue'", "'decltype'", "'default'", "'delete'", 
			"'do'", "'double'", "'dynamic_cast'", "'else'", "'enum'", "'explicit'", 
			"'export'", "'extern'", "'false'", "'final'", "'float'", "'for'", "'friend'", 
			"'goto'", "'if'", "'inline'", "'int'", "'long'", "'mutable'", "'namespace'", 
			"'new'", "'noexcept'", "'nullptr'", "'operator'", "'override'", "'private'", 
			"'protected'", "'public'", "'register'", "'reinterpret_cast'", "'return'", 
			"'short'", "'signed'", "'sizeof'", "'static'", "'static_assert'", "'static_cast'", 
			"'struct'", "'switch'", "'template'", "'this'", "'thread_local'", "'throw'", 
			"'true'", "'try'", "'typedef'", "'typeid'", "'typename'", "'union'", 
			"'unsigned'", "'using'", "'virtual'", "'void'", "'volatile'", "'wchar_t'", 
			"'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'^'", "'&'", "'|'", "'~'", null, "'='", "'<'", "'>'", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", 
			"'>>'", "'<<='", "'>>='", "'=='", "'!='", "'<='", "'>='", null, null, 
			"'++'", "'--'", "','", "'->*'", "'->'", "'?'", "':'", "'::'", "';'", 
			"'.'", "'.*'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "MultiLineMacro", "Directive", 
			"Alignas", "Alignof", "Asm", "Auto", "Bool", "Break", "Case", "Catch", 
			"Char", "Char16", "Char32", "Class", "Const", "Constexpr", "Const_cast", 
			"Continue", "Decltype", "Default", "Delete", "Do", "Double", "Dynamic_cast", 
			"Else", "Enum", "Explicit", "Export", "Extern", "False", "Final", "Float", 
			"For", "Friend", "Goto", "If", "Inline", "Int", "Long", "Mutable", "Namespace", 
			"New", "Noexcept", "Nullptr", "Operator", "Override", "Private", "Protected", 
			"Public", "Register", "Reinterpret_cast", "Return", "Short", "Signed", 
			"Sizeof", "Static", "Static_assert", "Static_cast", "Struct", "Switch", 
			"Template", "This", "Thread_local", "Throw", "True", "Try", "Typedef", 
			"Typeid_", "Typename_", "Union", "Unsigned", "Using", "Virtual", "Void", 
			"Volatile", "Wchar", "While", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", 
			"Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", "Less", "Greater", 
			"PlusAssign", "MinusAssign", "StarAssign", "DivAssign", "ModAssign", 
			"XorAssign", "AndAssign", "OrAssign", "LeftShift", "RightShift", "LeftShiftAssign", 
			"RightShiftAssign", "Equal", "NotEqual", "LessEqual", "GreaterEqual", 
			"AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", "ArrowStar", "Arrow", 
			"Question", "Colon", "Doublecolon", "Semi", "Dot", "DotStar", "Ellipsis", 
			"Identifier", "Integerliteral", "Decimalliteral", "Octalliteral", "Hexadecimalliteral", 
			"Binaryliteral", "Integersuffix", "Characterliteral", "Floatingliteral", 
			"Stringliteral", "Userdefinedintegerliteral", "Userdefinedfloatingliteral", 
			"Userdefinedstringliteral", "Userdefinedcharacterliteral", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "CPP14.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPP14Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TranslationunitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPP14Parser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Directive) {
					{
					{
					setState(452);
					directive();
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(460);
				declarationseq(0);
				}
			}

			setState(463);
			match(EOF);
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

	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode Directive() { return getToken(CPP14Parser.Directive, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(Directive);
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

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public LambdaexpressionContext lambdaexpression() {
			return getRuleContext(LambdaexpressionContext.class,0);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primaryexpression);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Nullptr:
			case True:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(LeftParen);
				setState(470);
				expression(0);
				setState(471);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
				lambdaexpression();
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

	public static class IdexpressionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_idexpression);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				qualifiedid();
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

	public static class UnqualifiedidContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public ConversionfunctionidContext conversionfunctionid() {
			return getRuleContext(ConversionfunctionidContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(CPP14Parser.Tilde, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TemplateidContext templateid() {
			return getRuleContext(TemplateidContext.class,0);
		}
		public UnqualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedid; }
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unqualifiedid);
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				match(Tilde);
				setState(486);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(487);
				match(Tilde);
				setState(488);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(489);
				templateid();
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

	public static class QualifiedidContext extends ParserRuleContext {
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public QualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedid; }
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			nestednamespecifier(0);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(493);
				match(Template);
				}
			}

			setState(496);
			unqualifiedid();
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

	public static class NestednamespecifierContext extends ParserRuleContext {
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public ThetypenameContext thetypename() {
			return getRuleContext(ThetypenameContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public NestednamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestednamespecifier; }
	}

	public final NestednamespecifierContext nestednamespecifier() throws RecognitionException {
		return nestednamespecifier(0);
	}

	private NestednamespecifierContext nestednamespecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestednamespecifierContext _localctx = new NestednamespecifierContext(_ctx, _parentState);
		NestednamespecifierContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(499);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(500);
				thetypename();
				setState(501);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(503);
				namespacename();
				setState(504);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(506);
				decltypespecifier();
				setState(507);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(511);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(512);
						match(Identifier);
						setState(513);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(514);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(516);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(515);
							match(Template);
							}
						}

						setState(518);
						simpletemplateid();
						setState(519);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class LambdaexpressionContext extends ParserRuleContext {
		public LambdaintroducerContext lambdaintroducer() {
			return getRuleContext(LambdaintroducerContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public LambdadeclaratorContext lambdadeclarator() {
			return getRuleContext(LambdadeclaratorContext.class,0);
		}
		public LambdaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaexpression; }
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			lambdaintroducer();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(527);
				lambdadeclarator();
				}
			}

			setState(530);
			compoundstatement();
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

	public static class LambdaintroducerContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(LeftBracket);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (This - 68)) | (1L << (And - 68)) | (1L << (Assign - 68)))) != 0) || _la==Identifier) {
				{
				setState(533);
				lambdacapture();
				}
			}

			setState(536);
			match(RightBracket);
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

	public static class LambdacaptureContext extends ParserRuleContext {
		public CapturedefaultContext capturedefault() {
			return getRuleContext(CapturedefaultContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lambdacapture);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				capturedefault();
				setState(541);
				match(Comma);
				setState(542);
				capturelist(0);
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

	public static class CapturedefaultContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CapturelistContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
	}

	public final CapturelistContext capturelist() throws RecognitionException {
		return capturelist(0);
	}

	private CapturelistContext capturelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CapturelistContext _localctx = new CapturelistContext(_ctx, _parentState);
		CapturelistContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(549);
			capture();
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(550);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(553);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(554);
					match(Comma);
					setState(555);
					capture();
					setState(557);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(556);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class CaptureContext extends ParserRuleContext {
		public SimplecaptureContext simplecapture() {
			return getRuleContext(SimplecaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_capture);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				initcapture();
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

	public static class SimplecaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simplecapture);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(And);
				setState(570);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				match(This);
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

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initcapture);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(Identifier);
				setState(575);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(And);
				setState(577);
				match(Identifier);
				setState(578);
				initializer();
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

	public static class LambdadeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public LambdadeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdadeclarator; }
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(LeftParen);
			setState(582);
			parameterdeclarationclause();
			setState(583);
			match(RightParen);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(584);
				match(Mutable);
				}
			}

			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(587);
				exceptionspecification();
				}
			}

			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(590);
				attributespecifierseq(0);
				}
			}

			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(593);
				trailingreturntype();
				}
			}

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

	public static class PostfixexpressionContext extends ParserRuleContext {
		public FunctioninvocationContext functioninvocation() {
			return getRuleContext(FunctioninvocationContext.class,0);
		}
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(CPP14Parser.Dynamic_cast, 0); }
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Static_cast() { return getToken(CPP14Parser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(CPP14Parser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(CPP14Parser.Const_cast, 0); }
		public TypeidofthetypeidContext typeidofthetypeid() {
			return getRuleContext(TypeidofthetypeidContext.class,0);
		}
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CPP14Parser.Dot, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(CPP14Parser.Arrow, 0); }
		public TerminalNode PlusPlus() { return getToken(CPP14Parser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CPP14Parser.MinusMinus, 0); }
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(597);
				functioninvocation();
				}
				break;
			case 2:
				{
				setState(598);
				primaryexpression();
				}
				break;
			case 3:
				{
				setState(599);
				arrayaccess();
				}
				break;
			case 4:
				{
				setState(600);
				simpletypespecifier();
				setState(601);
				match(LeftParen);
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(602);
					expressionlist();
					}
				}

				setState(605);
				match(RightParen);
				}
				break;
			case 5:
				{
				setState(607);
				typenamespecifier();
				setState(608);
				match(LeftParen);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(609);
					expressionlist();
					}
				}

				setState(612);
				match(RightParen);
				}
				break;
			case 6:
				{
				setState(614);
				simpletypespecifier();
				setState(615);
				bracedinitlist();
				}
				break;
			case 7:
				{
				setState(617);
				typenamespecifier();
				setState(618);
				bracedinitlist();
				}
				break;
			case 8:
				{
				setState(620);
				match(Dynamic_cast);
				setState(621);
				match(Less);
				setState(622);
				thetypeid();
				setState(623);
				match(Greater);
				setState(624);
				match(LeftParen);
				setState(625);
				expression(0);
				setState(626);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(628);
				match(Static_cast);
				setState(629);
				match(Less);
				setState(630);
				thetypeid();
				setState(631);
				match(Greater);
				setState(632);
				match(LeftParen);
				setState(633);
				expression(0);
				setState(634);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(636);
				match(Reinterpret_cast);
				setState(637);
				match(Less);
				setState(638);
				thetypeid();
				setState(639);
				match(Greater);
				setState(640);
				match(LeftParen);
				setState(641);
				expression(0);
				setState(642);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(644);
				match(Const_cast);
				setState(645);
				match(Less);
				setState(646);
				thetypeid();
				setState(647);
				match(Greater);
				setState(648);
				match(LeftParen);
				setState(649);
				expression(0);
				setState(650);
				match(RightParen);
				}
				break;
			case 12:
				{
				setState(652);
				typeidofthetypeid();
				setState(653);
				match(LeftParen);
				setState(654);
				expression(0);
				setState(655);
				match(RightParen);
				}
				break;
			case 13:
				{
				setState(657);
				typeidofthetypeid();
				setState(658);
				match(LeftParen);
				setState(659);
				thetypeid();
				setState(660);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(685);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(664);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(665);
						match(LeftBracket);
						setState(666);
						bracedinitlist();
						setState(667);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(669);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(670);
						match(LeftParen);
						setState(672);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
							{
							setState(671);
							expressionlist();
							}
						}

						setState(674);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(675);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(676);
						match(Dot);
						setState(677);
						pseudodestructorname();
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(678);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(679);
						match(Arrow);
						setState(680);
						pseudodestructorname();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(681);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(682);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(683);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(684);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class ArrayaccessContext extends ParserRuleContext {
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(CPP14Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPP14Parser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPP14Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPP14Parser.RightBracket, i);
		}
		public ArrayaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayaccess; }
	}

	public final ArrayaccessContext arrayaccess() throws RecognitionException {
		ArrayaccessContext _localctx = new ArrayaccessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayaccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			primaryexpression();
			setState(697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(691);
					match(LeftBracket);
					setState(692);
					expression(0);
					setState(693);
					match(RightBracket);
					}
					} 
				}
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
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

	public static class FunctioninvocationContext extends ParserRuleContext {
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(CPP14Parser.Dot, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(CPP14Parser.Arrow, 0); }
		public FunctioninvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioninvocation; }
	}

	public final FunctioninvocationContext functioninvocation() throws RecognitionException {
		FunctioninvocationContext _localctx = new FunctioninvocationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functioninvocation);
		int _la;
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				primaryexpression();
				setState(701);
				match(Dot);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(702);
					match(Template);
					}
				}

				setState(705);
				idexpression();
				setState(711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(706);
					match(LeftParen);
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
						{
						setState(707);
						expressionlist();
						}
					}

					setState(710);
					match(RightParen);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				primaryexpression();
				setState(714);
				match(LeftParen);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(715);
					expressionlist();
					}
				}

				setState(718);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				primaryexpression();
				setState(721);
				match(Arrow);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(722);
					match(Template);
					}
				}

				setState(725);
				idexpression();
				setState(731);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(726);
					match(LeftParen);
					setState(728);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
						{
						setState(727);
						expressionlist();
						}
					}

					setState(730);
					match(RightParen);
					}
					break;
				}
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

	public static class TypeidofexprContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(CPP14Parser.Typeid_, 0); }
		public TypeidofexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidofexpr; }
	}

	public final TypeidofexprContext typeidofexpr() throws RecognitionException {
		TypeidofexprContext _localctx = new TypeidofexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeidofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(Typeid_);
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

	public static class TypeidofthetypeidContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(CPP14Parser.Typeid_, 0); }
		public TypeidofthetypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidofthetypeid; }
	}

	public final TypeidofthetypeidContext typeidofthetypeid() throws RecognitionException {
		TypeidofthetypeidContext _localctx = new TypeidofthetypeidContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeidofthetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(Typeid_);
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

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			initializerlist(0);
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

	public static class PseudodestructornameContext extends ParserRuleContext {
		public PseudodestructdeclarationContext pseudodestructdeclaration() {
			return getRuleContext(PseudodestructdeclarationContext.class,0);
		}
		public PseudodestructcallerContext pseudodestructcaller() {
			return getRuleContext(PseudodestructcallerContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pseudodestructorname);
		try {
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				pseudodestructdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				pseudodestructcaller();
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

	public static class PseudodestructdeclarationContext extends ParserRuleContext {
		public List<ThetypenameContext> thetypename() {
			return getRuleContexts(ThetypenameContext.class);
		}
		public ThetypenameContext thetypename(int i) {
			return getRuleContext(ThetypenameContext.class,i);
		}
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public TerminalNode Tilde() { return getToken(CPP14Parser.Tilde, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public PseudodestructdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructdeclaration; }
	}

	public final PseudodestructdeclarationContext pseudodestructdeclaration() throws RecognitionException {
		PseudodestructdeclarationContext _localctx = new PseudodestructdeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pseudodestructdeclaration);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(745);
					nestednamespecifier(0);
					}
					break;
				}
				setState(748);
				thetypename();
				setState(749);
				match(Doublecolon);
				setState(750);
				match(Tilde);
				setState(751);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				nestednamespecifier(0);
				setState(754);
				match(Template);
				setState(755);
				simpletemplateid();
				setState(756);
				match(Doublecolon);
				setState(757);
				match(Tilde);
				setState(758);
				thetypename();
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

	public static class PseudodestructcallerContext extends ParserRuleContext {
		public TerminalNode Tilde() { return getToken(CPP14Parser.Tilde, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ThetypenameContext thetypename() {
			return getRuleContext(ThetypenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public PseudodestructcallerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructcaller; }
	}

	public final PseudodestructcallerContext pseudodestructcaller() throws RecognitionException {
		PseudodestructcallerContext _localctx = new PseudodestructcallerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pseudodestructcaller);
		int _la;
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				match(Tilde);
				setState(763);
				decltypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(764);
					nestednamespecifier(0);
					}
				}

				setState(767);
				match(Tilde);
				setState(768);
				thetypename();
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

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CPP14Parser.PlusPlus, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(CPP14Parser.MinusMinus, 0); }
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP14Parser.Sizeof, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(CPP14Parser.Alignof, 0); }
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryexpression);
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				match(PlusPlus);
				setState(773);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				match(MinusMinus);
				setState(775);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(776);
				unaryoperator();
				setState(777);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(779);
				match(Sizeof);
				setState(780);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(781);
				match(Sizeof);
				setState(782);
				match(LeftParen);
				setState(783);
				thetypeid();
				setState(784);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(786);
				match(Sizeof);
				setState(787);
				match(Ellipsis);
				setState(788);
				match(LeftParen);
				setState(789);
				match(Identifier);
				setState(790);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(791);
				match(Alignof);
				setState(792);
				match(LeftParen);
				setState(793);
				thetypeid();
				setState(794);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(796);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(797);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(798);
				deleteexpression();
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

	public static class UnaryoperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(CPP14Parser.Or, 0); }
		public TerminalNode Star() { return getToken(CPP14Parser.Star, 0); }
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public TerminalNode Plus() { return getToken(CPP14Parser.Plus, 0); }
		public TerminalNode Tilde() { return getToken(CPP14Parser.Tilde, 0); }
		public TerminalNode Minus() { return getToken(CPP14Parser.Minus, 0); }
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Plus - 90)) | (1L << (Minus - 90)) | (1L << (Star - 90)) | (1L << (And - 90)) | (1L << (Or - 90)) | (1L << (Tilde - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class NewexpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public NewtypeidContext newtypeid() {
			return getRuleContext(NewtypeidContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_newexpression);
		int _la;
		try {
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(803);
					match(Doublecolon);
					}
				}

				setState(806);
				match(New);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(807);
					newplacement();
					}
				}

				setState(810);
				newtypeid();
				setState(812);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(811);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(814);
					match(Doublecolon);
					}
				}

				setState(817);
				match(New);
				setState(819);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(818);
					newplacement();
					}
					break;
				}
				setState(821);
				match(LeftParen);
				setState(822);
				thetypeid();
				setState(823);
				match(RightParen);
				setState(825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(824);
					newinitializer();
					}
					break;
				}
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

	public static class NewplacementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(LeftParen);
			setState(830);
			expressionlist();
			setState(831);
			match(RightParen);
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

	public static class NewtypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NewtypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeid; }
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			typespecifierseq();
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(834);
				newdeclarator();
				}
				break;
			}
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

	public static class NewdeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public NewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newdeclarator; }
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_newdeclarator);
		try {
			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				ptroperator();
				setState(839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(838);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				noptrnewdeclarator(0);
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

	public static class NoptrnewdeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrnewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrnewdeclarator; }
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(845);
			match(LeftBracket);
			setState(846);
			expression(0);
			setState(847);
			match(RightBracket);
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(848);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(860);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(851);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(852);
					match(LeftBracket);
					setState(853);
					constantexpression();
					setState(854);
					match(RightBracket);
					setState(856);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(855);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class NewinitializerContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public NewinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newinitializer; }
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_newinitializer);
		int _la;
		try {
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				match(LeftParen);
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(864);
					expressionlist();
					}
				}

				setState(867);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				bracedinitlist();
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

	public static class DeleteexpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_deleteexpression);
		int _la;
		try {
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(871);
					match(Doublecolon);
					}
				}

				setState(874);
				match(Delete);
				setState(875);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(876);
					match(Doublecolon);
					}
				}

				setState(879);
				match(Delete);
				setState(880);
				match(LeftBracket);
				setState(881);
				match(RightBracket);
				setState(882);
				castexpression();
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

	public static class NoexceptexpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(Noexcept);
			setState(886);
			match(LeftParen);
			setState(887);
			expression(0);
			setState(888);
			match(RightParen);
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

	public static class CastexpressionContext extends ParserRuleContext {
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public RealcastexpressionContext realcastexpression() {
			return getRuleContext(RealcastexpressionContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_castexpression);
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				realcastexpression();
				setState(892);
				castexpression();
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

	public static class RealcastexpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public RealcastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realcastexpression; }
	}

	public final RealcastexpressionContext realcastexpression() throws RecognitionException {
		RealcastexpressionContext _localctx = new RealcastexpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_realcastexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(LeftParen);
			setState(897);
			thetypeid();
			setState(898);
			match(RightParen);
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

	public static class PmexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public TerminalNode DotStar() { return getToken(CPP14Parser.DotStar, 0); }
		public TerminalNode ArrowStar() { return getToken(CPP14Parser.ArrowStar, 0); }
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(901);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(909);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(903);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(904);
						match(DotStar);
						setState(905);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(906);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(907);
						match(ArrowStar);
						setState(908);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(CPP14Parser.Star, 0); }
		public TerminalNode Div() { return getToken(CPP14Parser.Div, 0); }
		public TerminalNode Mod() { return getToken(CPP14Parser.Mod, 0); }
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(915);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(928);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(926);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(917);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(918);
						match(Star);
						setState(919);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(920);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(921);
						match(Div);
						setState(922);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(923);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(924);
						match(Mod);
						setState(925);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(CPP14Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CPP14Parser.Minus, 0); }
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(932);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(940);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(934);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(935);
						match(Plus);
						setState(936);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(937);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(938);
						match(Minus);
						setState(939);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public ShiftoperatorContext shiftoperator() {
			return getRuleContext(ShiftoperatorContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(946);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(954);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ShiftexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
					setState(948);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(949);
					shiftoperator();
					setState(950);
					additiveexpression(0);
					}
					} 
				}
				setState(956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class ShiftoperatorContext extends ParserRuleContext {
		public TerminalNode RightShift() { return getToken(CPP14Parser.RightShift, 0); }
		public TerminalNode LeftShift() { return getToken(CPP14Parser.LeftShift, 0); }
		public ShiftoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftoperator; }
	}

	public final ShiftoperatorContext shiftoperator() throws RecognitionException {
		ShiftoperatorContext _localctx = new ShiftoperatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_shiftoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_la = _input.LA(1);
			if ( !(_la==LeftShift || _la==RightShift) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(CPP14Parser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CPP14Parser.GreaterEqual, 0); }
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(960);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(976);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(974);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(962);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(963);
						match(Less);
						setState(964);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(965);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(966);
						match(Greater);
						setState(967);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(968);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(969);
						match(LessEqual);
						setState(970);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(971);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(972);
						match(GreaterEqual);
						setState(973);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(978);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(CPP14Parser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CPP14Parser.NotEqual, 0); }
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(980);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(988);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(982);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(983);
						match(Equal);
						setState(984);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(985);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(986);
						match(NotEqual);
						setState(987);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(994);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1001);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(996);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(997);
					match(And);
					setState(998);
					equalityexpression(0);
					}
					} 
				}
				setState(1003);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(CPP14Parser.Caret, 0); }
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1005);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(1007);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1008);
					match(Caret);
					setState(1009);
					andexpression(0);
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(CPP14Parser.Or, 0); }
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1016);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(1018);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1019);
					match(Or);
					setState(1020);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1027);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1037);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1035);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(1029);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1030);
						match(T__2);
						setState(1031);
						inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(1032);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1033);
						match(T__3);
						setState(1034);
						inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(1039);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1041);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1049);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(1043);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1044);
						match(T__4);
						setState(1045);
						logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(1046);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1047);
						match(T__5);
						setState(1048);
						logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(1053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CPP14Parser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_conditionalexpression);
		try {
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				logicalorexpression(0);
				setState(1056);
				match(Question);
				setState(1057);
				expression(0);
				setState(1058);
				match(Colon);
				setState(1059);
				assignmentexpression();
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

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public RealassignmentexpressionContext realassignmentexpression() {
			return getRuleContext(RealassignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_assignmentexpression);
		try {
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				realassignmentexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
				throwexpression();
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

	public static class RealassignmentexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public RealassignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realassignmentexpression; }
	}

	public final RealassignmentexpressionContext realassignmentexpression() throws RecognitionException {
		RealassignmentexpressionContext _localctx = new RealassignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_realassignmentexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			logicalorexpression(0);
			setState(1069);
			assignmentoperator();
			setState(1070);
			initializerclause();
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

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CPP14Parser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CPP14Parser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CPP14Parser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CPP14Parser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CPP14Parser.MinusAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPP14Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPP14Parser.LeftShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CPP14Parser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CPP14Parser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CPP14Parser.OrAssign, 0); }
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (Assign - 100)) | (1L << (PlusAssign - 100)) | (1L << (MinusAssign - 100)) | (1L << (StarAssign - 100)) | (1L << (DivAssign - 100)) | (1L << (ModAssign - 100)) | (1L << (XorAssign - 100)) | (1L << (AndAssign - 100)) | (1L << (OrAssign - 100)) | (1L << (LeftShiftAssign - 100)) | (1L << (RightShiftAssign - 100)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1075);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1082);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(1077);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1078);
					match(Comma);
					setState(1079);
					assignmentexpression();
					}
					} 
				}
				setState(1084);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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

	public static class ConstantexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConstantexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantexpression; }
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			conditionalexpression();
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
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_statement);
		int _la;
		try {
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1087);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(1088);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1091);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1092);
					attributespecifierseq(0);
					}
				}

				setState(1095);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1096);
					attributespecifierseq(0);
					}
				}

				setState(1099);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1100);
					attributespecifierseq(0);
					}
				}

				setState(1103);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1104);
					attributespecifierseq(0);
					}
				}

				setState(1107);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1108);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1109);
					attributespecifierseq(0);
					}
				}

				setState(1112);
				tryblock();
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

	public static class LabeledstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CaseexpressionContext caseexpression() {
			return getRuleContext(CaseexpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public LabeledstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledstatement; }
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_labeledstatement);
		int _la;
		try {
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1115);
					attributespecifierseq(0);
					}
				}

				setState(1118);
				match(Identifier);
				setState(1119);
				match(Colon);
				setState(1120);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1121);
					attributespecifierseq(0);
					}
				}

				setState(1124);
				caseexpression();
				setState(1125);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1127);
					attributespecifierseq(0);
					}
				}

				setState(1130);
				match(Default);
				setState(1131);
				match(Colon);
				setState(1132);
				statement();
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

	public static class CaseexpressionContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(CPP14Parser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public CaseexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseexpression; }
	}

	public final CaseexpressionContext caseexpression() throws RecognitionException {
		CaseexpressionContext _localctx = new CaseexpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_caseexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(Case);
			setState(1136);
			constantexpression();
			setState(1137);
			match(Colon);
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

	public static class ExpressionstatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1139);
				expression(0);
				}
			}

			setState(1142);
			match(Semi);
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

	public static class CompoundstatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(LeftBrace);
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Semi - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1145);
				statementseq(0);
				}
			}

			setState(1148);
			match(RightBrace);
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

	public static class StatementseqContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1151);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1153);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1154);
					statement();
					}
					} 
				}
				setState(1159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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

	public static class SelectionstatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public SwitchexpressionContext switchexpression() {
			return getRuleContext(SwitchexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_selectionstatement);
		try {
			setState(1164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				ifstatement();
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				switchexpression();
				setState(1162);
				statement();
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

	public static class IfstatementContext extends ParserRuleContext {
		public IfexpressionContext ifexpression() {
			return getRuleContext(IfexpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CPP14Parser.Else, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ifstatement);
		try {
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1166);
				ifexpression();
				setState(1167);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				ifexpression();
				setState(1170);
				statement();
				setState(1171);
				match(Else);
				setState(1172);
				statement();
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

	public static class IfexpressionContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CPP14Parser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public IfexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpression; }
	}

	public final IfexpressionContext ifexpression() throws RecognitionException {
		IfexpressionContext _localctx = new IfexpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_ifexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(If);
			setState(1177);
			match(LeftParen);
			setState(1178);
			condition();
			setState(1179);
			match(RightParen);
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

	public static class SwitchexpressionContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(CPP14Parser.Switch, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public SwitchexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchexpression; }
	}

	public final SwitchexpressionContext switchexpression() throws RecognitionException {
		SwitchexpressionContext _localctx = new SwitchexpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_switchexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(Switch);
			setState(1182);
			match(LeftParen);
			setState(1183);
			condition();
			setState(1184);
			match(RightParen);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_condition);
		int _la;
		try {
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1187);
					attributespecifierseq(0);
					}
				}

				setState(1190);
				declspecifierseq();
				setState(1191);
				declarator();
				setState(1192);
				match(Assign);
				setState(1193);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1195);
					attributespecifierseq(0);
					}
				}

				setState(1198);
				declspecifierseq();
				setState(1199);
				declarator();
				setState(1200);
				bracedinitlist();
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

	public static class IterationstatementContext extends ParserRuleContext {
		public WhileexpressionContext whileexpression() {
			return getRuleContext(WhileexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DostatementContext dostatement() {
			return getRuleContext(DostatementContext.class,0);
		}
		public EnhancedforexpressionContext enhancedforexpression() {
			return getRuleContext(EnhancedforexpressionContext.class,0);
		}
		public BasicforexpressionContext basicforexpression() {
			return getRuleContext(BasicforexpressionContext.class,0);
		}
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_iterationstatement);
		try {
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				whileexpression();
				setState(1205);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				dostatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1208);
				enhancedforexpression();
				setState(1209);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1211);
				basicforexpression();
				setState(1212);
				statement();
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

	public static class DostatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(CPP14Parser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileexpressionContext whileexpression() {
			return getRuleContext(WhileexpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public DostatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dostatement; }
	}

	public final DostatementContext dostatement() throws RecognitionException {
		DostatementContext _localctx = new DostatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_dostatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(Do);
			setState(1217);
			statement();
			setState(1218);
			whileexpression();
			setState(1219);
			match(Semi);
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

	public static class WhileexpressionContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public WhileexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileexpression; }
	}

	public final WhileexpressionContext whileexpression() throws RecognitionException {
		WhileexpressionContext _localctx = new WhileexpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_whileexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			match(While);
			setState(1222);
			match(LeftParen);
			setState(1223);
			condition();
			setState(1224);
			match(RightParen);
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

	public static class BasicforexpressionContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicforexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicforexpression; }
	}

	public final BasicforexpressionContext basicforexpression() throws RecognitionException {
		BasicforexpressionContext _localctx = new BasicforexpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_basicforexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(For);
			setState(1227);
			match(LeftParen);
			setState(1228);
			forinitstatement();
			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1229);
				condition();
				}
			}

			setState(1232);
			match(Semi);
			setState(1234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1233);
				expression(0);
				}
			}

			setState(1236);
			match(RightParen);
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

	public static class EnhancedforexpressionContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public EnhancedforexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedforexpression; }
	}

	public final EnhancedforexpressionContext enhancedforexpression() throws RecognitionException {
		EnhancedforexpressionContext _localctx = new EnhancedforexpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_enhancedforexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(For);
			setState(1239);
			match(LeftParen);
			setState(1240);
			forrangedeclaration();
			setState(1241);
			match(Colon);
			setState(1242);
			forrangeinitializer();
			setState(1243);
			match(RightParen);
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

	public static class ForinitstatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_forinitstatement);
		try {
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				simpledeclaration();
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

	public static class ForrangedeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ForrangedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangedeclaration; }
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1249);
				attributespecifierseq(0);
				}
			}

			setState(1252);
			declspecifierseq();
			setState(1253);
			declarator();
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

	public static class ForrangeinitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ForrangeinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangeinitializer; }
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_forrangeinitializer);
		try {
			setState(1257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
				bracedinitlist();
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

	public static class JumpstatementContext extends ParserRuleContext {
		public BreakstatementContext breakstatement() {
			return getRuleContext(BreakstatementContext.class,0);
		}
		public ContinuestatementContext continuestatement() {
			return getRuleContext(ContinuestatementContext.class,0);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public TerminalNode Goto() { return getToken(CPP14Parser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_jumpstatement);
		try {
			setState(1265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				breakstatement();
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				continuestatement();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(1261);
				returnstatement();
				}
				break;
			case Goto:
				enterOuterAlt(_localctx, 4);
				{
				setState(1262);
				match(Goto);
				setState(1263);
				match(Identifier);
				setState(1264);
				match(Semi);
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

	public static class BreakstatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(CPP14Parser.Break, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public BreakstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakstatement; }
	}

	public final BreakstatementContext breakstatement() throws RecognitionException {
		BreakstatementContext _localctx = new BreakstatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_breakstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(Break);
			setState(1268);
			match(Semi);
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

	public static class ContinuestatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(CPP14Parser.Continue, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public ContinuestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuestatement; }
	}

	public final ContinuestatementContext continuestatement() throws RecognitionException {
		ContinuestatementContext _localctx = new ContinuestatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_continuestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(Continue);
			setState(1271);
			match(Semi);
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

	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(CPP14Parser.Return, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_returnstatement);
		int _la;
		try {
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1273);
				match(Return);
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(1274);
					expression(0);
					}
				}

				setState(1277);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				match(Return);
				setState(1279);
				bracedinitlist();
				setState(1280);
				match(Semi);
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

	public static class DeclarationstatementContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			blockdeclaration();
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

	public static class DeclarationseqContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1287);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1289);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1290);
					declaration();
					}
					} 
				}
				setState(1295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public ExplicitinstantiationContext explicitinstantiation() {
			return getRuleContext(ExplicitinstantiationContext.class,0);
		}
		public ExplicitspecializationContext explicitspecialization() {
			return getRuleContext(ExplicitspecializationContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public NamespacedefinitionContext namespacedefinition() {
			return getRuleContext(NamespacedefinitionContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public AttributedeclarationContext attributedeclaration() {
			return getRuleContext(AttributedeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_declaration);
		try {
			setState(1305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1298);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1299);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1300);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1301);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1302);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1303);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1304);
				attributedeclaration();
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

	public static class BlockdeclarationContext extends ParserRuleContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public AsmdefinitionContext asmdefinition() {
			return getRuleContext(AsmdefinitionContext.class,0);
		}
		public NamespacealiasdefinitionContext namespacealiasdefinition() {
			return getRuleContext(NamespacealiasdefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public OpaqueenumdeclarationContext opaqueenumdeclaration() {
			return getRuleContext(OpaqueenumdeclarationContext.class,0);
		}
		public BlockdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclaration; }
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_blockdeclaration);
		try {
			setState(1315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1307);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1309);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1310);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1311);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1312);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1313);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1314);
				opaqueenumdeclaration();
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

	public static class AliasdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			match(Using);
			setState(1318);
			match(Identifier);
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1319);
				attributespecifierseq(0);
				}
			}

			setState(1322);
			match(Assign);
			setState(1323);
			thetypeid();
			setState(1324);
			match(Semi);
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

	public static class SimpledeclarationContext extends ParserRuleContext {
		public PointerdeclarationContext pointerdeclaration() {
			return getRuleContext(PointerdeclarationContext.class,0);
		}
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_simpledeclaration);
		int _la;
		try {
			setState(1342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				pointerdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327);
				variabledeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1328);
					declspecifierseq();
					}
					break;
				}
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Tilde - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(1331);
					initdeclaratorlist(0);
					}
				}

				setState(1334);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1335);
				attributespecifierseq(0);
				setState(1337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1336);
					declspecifierseq();
					}
					break;
				}
				setState(1339);
				initdeclaratorlist(0);
				setState(1340);
				match(Semi);
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

	public static class PointerdeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PointerdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerdeclaration; }
	}

	public final PointerdeclarationContext pointerdeclaration() throws RecognitionException {
		PointerdeclarationContext _localctx = new PointerdeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_pointerdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			declspecifierseq();
			setState(1345);
			ptrdeclarator();
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

	public static class VariabledeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			declspecifierseq();
			setState(1348);
			initdeclaratorlist(0);
			setState(1349);
			match(Semi);
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

	public static class Static_assertdeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(CPP14Parser.Static_assert, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			match(Static_assert);
			setState(1352);
			match(LeftParen);
			setState(1353);
			constantexpression();
			setState(1354);
			match(Comma);
			setState(1355);
			match(Stringliteral);
			setState(1356);
			match(RightParen);
			setState(1357);
			match(Semi);
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

	public static class EmptydeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(Semi);
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

	public static class AttributedeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			attributespecifierseq(0);
			setState(1362);
			match(Semi);
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

	public static class DeclspecifierContext extends ParserRuleContext {
		public StorageclassspecifierContext storageclassspecifier() {
			return getRuleContext(StorageclassspecifierContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public FunctionspecifierContext functionspecifier() {
			return getRuleContext(FunctionspecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(CPP14Parser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(CPP14Parser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(CPP14Parser.Constexpr, 0); }
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_declspecifier);
		try {
			setState(1370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1364);
				storageclassspecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
				typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1366);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1367);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1368);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1369);
				match(Constexpr);
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

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_declspecifierseq);
		try {
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1372);
				declspecifier();
				setState(1374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1373);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1376);
				declspecifier();
				setState(1377);
				declspecifierseq();
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

	public static class StorageclassspecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(CPP14Parser.Register, 0); }
		public TerminalNode Static() { return getToken(CPP14Parser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(CPP14Parser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public StorageclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageclassspecifier; }
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (Extern - 35)) | (1L << (Mutable - 35)) | (1L << (Register - 35)) | (1L << (Static - 35)) | (1L << (Thread_local - 35)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class FunctionspecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(CPP14Parser.Explicit, 0); }
		public FunctionspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionspecifier; }
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (Explicit - 33)) | (1L << (Inline - 33)) | (1L << (Virtual - 33)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TypedefnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypedefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefname; }
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			match(Identifier);
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

	public static class TypespecifierContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
		}
		public EnumspecifierContext enumspecifier() {
			return getRuleContext(EnumspecifierContext.class,0);
		}
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typespecifier);
		try {
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1389);
				enumspecifier();
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

	public static class TrailingtypespecifierContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ElaboratedtypespecifierContext elaboratedtypespecifier() {
			return getRuleContext(ElaboratedtypespecifierContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public TrailingtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifier; }
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_trailingtypespecifier);
		try {
			setState(1396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1392);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1393);
				elaboratedtypespecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1394);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1395);
				cvqualifier();
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

	public static class TypespecifierseqContext extends ParserRuleContext {
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public TypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifierseq; }
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typespecifierseq);
		try {
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1398);
				typespecifier();
				setState(1400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1399);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				typespecifier();
				setState(1403);
				typespecifierseq();
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

	public static class TrailingtypespecifierseqContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifierseq; }
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_trailingtypespecifierseq);
		try {
			setState(1414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1407);
				trailingtypespecifier();
				setState(1409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1408);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1411);
				trailingtypespecifier();
				setState(1412);
				trailingtypespecifierseq();
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

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public ThetypenameContext thetypename() {
			return getRuleContext(ThetypenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Char() { return getToken(CPP14Parser.Char, 0); }
		public TerminalNode Char16() { return getToken(CPP14Parser.Char16, 0); }
		public TerminalNode Char32() { return getToken(CPP14Parser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(CPP14Parser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(CPP14Parser.Bool, 0); }
		public TerminalNode Short() { return getToken(CPP14Parser.Short, 0); }
		public TerminalNode Int() { return getToken(CPP14Parser.Int, 0); }
		public TerminalNode Long() { return getToken(CPP14Parser.Long, 0); }
		public TerminalNode Signed() { return getToken(CPP14Parser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CPP14Parser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(CPP14Parser.Float, 0); }
		public TerminalNode Double() { return getToken(CPP14Parser.Double, 0); }
		public TerminalNode Void() { return getToken(CPP14Parser.Void, 0); }
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_simpletypespecifier);
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1416);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1419);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				nestednamespecifier(0);
				setState(1421);
				match(Template);
				setState(1422);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1424);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1425);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1426);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1427);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1428);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1429);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1430);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1431);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1432);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1433);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1434);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1435);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1436);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1437);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1438);
				decltypespecifier();
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

	public static class ThetypenameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public TypedefnameContext typedefname() {
			return getRuleContext(TypedefnameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ThetypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thetypename; }
	}

	public final ThetypenameContext thetypename() throws RecognitionException {
		ThetypenameContext _localctx = new ThetypenameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_thetypename);
		try {
			setState(1445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1441);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1443);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1444);
				simpletemplateid();
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

	public static class DecltypespecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(CPP14Parser.Decltype, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_decltypespecifier);
		try {
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				match(Decltype);
				setState(1448);
				match(LeftParen);
				setState(1449);
				expression(0);
				setState(1450);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1452);
				match(Decltype);
				setState(1453);
				match(LeftParen);
				setState(1454);
				match(Auto);
				setState(1455);
				match(RightParen);
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

	public static class ElaboratedtypespecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public ElaboratedtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedtypespecifier; }
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1458);
				classkey();
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1459);
					attributespecifierseq(0);
					}
				}

				setState(1463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1462);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1465);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				classkey();
				setState(1468);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1470);
				classkey();
				setState(1471);
				nestednamespecifier(0);
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1472);
					match(Template);
					}
				}

				setState(1475);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1477);
				match(Enum);
				setState(1479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1478);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1481);
				match(Identifier);
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

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			match(Identifier);
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

	public static class EnumspecifierContext extends ParserRuleContext {
		public EnumheadContext enumhead() {
			return getRuleContext(EnumheadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_enumspecifier);
		int _la;
		try {
			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				enumhead();
				setState(1487);
				match(LeftBrace);
				setState(1489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1488);
					enumeratorlist(0);
					}
				}

				setState(1491);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1493);
				enumhead();
				setState(1494);
				match(LeftBrace);
				setState(1495);
				enumeratorlist(0);
				setState(1496);
				match(Comma);
				setState(1497);
				match(RightBrace);
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

	public static class EnumheadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public EnumheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumhead; }
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_enumhead);
		int _la;
		try {
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1501);
				enumkey();
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1502);
					attributespecifierseq(0);
					}
				}

				setState(1506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1505);
					match(Identifier);
					}
				}

				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1508);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511);
				enumkey();
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1512);
					attributespecifierseq(0);
					}
				}

				setState(1515);
				nestednamespecifier(0);
				setState(1516);
				match(Identifier);
				setState(1518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1517);
					enumbase();
					}
				}

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

	public static class OpaqueenumdeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueenumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueenumdeclaration; }
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			enumkey();
			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1523);
				attributespecifierseq(0);
				}
			}

			setState(1526);
			match(Identifier);
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1527);
				enumbase();
				}
			}

			setState(1530);
			match(Semi);
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

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_enumkey);
		try {
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1533);
				match(Enum);
				setState(1534);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1535);
				match(Enum);
				setState(1536);
				match(Struct);
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

	public static class EnumbaseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(Colon);
			setState(1540);
			typespecifierseq();
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

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratordefinitionContext enumeratordefinition() {
			return getRuleContext(EnumeratordefinitionContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1543);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1545);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1546);
					match(Comma);
					setState(1547);
					enumeratordefinition();
					}
					} 
				}
				setState(1552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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

	public static class EnumeratordefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_enumeratordefinition);
		try {
			setState(1558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1553);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1554);
				enumerator();
				setState(1555);
				match(Assign);
				setState(1556);
				constantexpression();
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

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			match(Identifier);
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

	public static class NamespacenameContext extends ParserRuleContext {
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacealiasContext namespacealias() {
			return getRuleContext(NamespacealiasContext.class,0);
		}
		public NamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacename; }
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_namespacename);
		try {
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				namespacealias();
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

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			match(Identifier);
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

	public static class NamespacedefinitionContext extends ParserRuleContext {
		public NamespacesignatureContext namespacesignature() {
			return getRuleContext(NamespacesignatureContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_namespacedefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			namespacesignature();
			setState(1569);
			match(LeftBrace);
			setState(1570);
			namespacebody();
			setState(1571);
			match(RightBrace);
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

	public static class NamespacesignatureContext extends ParserRuleContext {
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamespacesignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacesignature; }
	}

	public final NamespacesignatureContext namespacesignature() throws RecognitionException {
		NamespacesignatureContext _localctx = new NamespacesignatureContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_namespacesignature);
		try {
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1573);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1574);
				unnamednamespacedefinition();
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

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public OriginalnamespacedefinitionContext originalnamespacedefinition() {
			return getRuleContext(OriginalnamespacedefinitionContext.class,0);
		}
		public ExtensionnamespacedefinitionContext extensionnamespacedefinition() {
			return getRuleContext(ExtensionnamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_namednamespacedefinition);
		try {
			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1577);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1578);
				extensionnamespacedefinition();
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

	public static class OriginalnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1581);
				match(Inline);
				}
			}

			setState(1584);
			match(Namespace);
			setState(1585);
			match(Identifier);
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

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1587);
				match(Inline);
				}
			}

			setState(1590);
			match(Namespace);
			setState(1591);
			originalnamespacename();
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

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1593);
				match(Inline);
				}
			}

			setState(1596);
			match(Namespace);
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

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(1598);
				declarationseq(0);
				}
			}

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

	public static class NamespacealiasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealias; }
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			match(Identifier);
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

	public static class NamespacealiasdefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			match(Namespace);
			setState(1604);
			match(Identifier);
			setState(1605);
			match(Assign);
			setState(1606);
			qualifiednamespacespecifier();
			setState(1607);
			match(Semi);
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

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1609);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1612);
			namespacename();
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

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_usingdeclaration);
		int _la;
		try {
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1614);
				match(Using);
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1615);
					match(Typename_);
					}
				}

				setState(1618);
				nestednamespecifier(0);
				setState(1619);
				unqualifiedid();
				setState(1620);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1622);
				match(Using);
				setState(1623);
				match(Doublecolon);
				setState(1624);
				unqualifiedid();
				setState(1625);
				match(Semi);
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

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1629);
				attributespecifierseq(0);
				}
			}

			setState(1632);
			match(Using);
			setState(1633);
			match(Namespace);
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1634);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1637);
			namespacename();
			setState(1638);
			match(Semi);
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

	public static class AsmdefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(CPP14Parser.Asm, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(Asm);
			setState(1641);
			match(LeftParen);
			setState(1642);
			match(Stringliteral);
			setState(1643);
			match(RightParen);
			setState(1644);
			match(Semi);
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

	public static class LinkagespecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_linkagespecification);
		int _la;
		try {
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646);
				match(Extern);
				setState(1647);
				match(Stringliteral);
				setState(1648);
				match(LeftBrace);
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(1649);
					declarationseq(0);
					}
				}

				setState(1652);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1653);
				match(Extern);
				setState(1654);
				match(Stringliteral);
				setState(1655);
				declaration();
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

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1659);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1661);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1662);
					attributespecifier();
					}
					} 
				}
				setState(1667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
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

	public static class AttributespecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftBracket() { return getTokens(CPP14Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPP14Parser.LeftBracket, i);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPP14Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPP14Parser.RightBracket, i);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_attributespecifier);
		try {
			setState(1675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1668);
				match(LeftBracket);
				setState(1669);
				match(LeftBracket);
				setState(1670);
				attributelist(0);
				setState(1671);
				match(RightBracket);
				setState(1672);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674);
				alignmentspecifier();
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

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CPP14Parser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				match(Alignas);
				setState(1678);
				match(LeftParen);
				setState(1679);
				thetypeid();
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1680);
					match(Ellipsis);
					}
				}

				setState(1683);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1685);
				match(Alignas);
				setState(1686);
				match(LeftParen);
				setState(1687);
				constantexpression();
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1688);
					match(Ellipsis);
					}
				}

				setState(1691);
				match(RightParen);
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

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1696);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1699);
				attribute();
				setState(1700);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1714);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1704);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1705);
						match(Comma);
						setState(1707);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
						case 1:
							{
							setState(1706);
							attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1709);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1710);
						match(Comma);
						setState(1711);
						attribute();
						setState(1712);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
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

	public static class AttributeContext extends ParserRuleContext {
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			attributetoken();
			setState(1721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1720);
				attributeargumentclause();
				}
				break;
			}
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

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_attributetoken);
		try {
			setState(1725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1723);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1724);
				attributescopedtoken();
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

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			attributenamespace();
			setState(1728);
			match(Doublecolon);
			setState(1729);
			match(Identifier);
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

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(Identifier);
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

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			match(LeftParen);
			setState(1734);
			balancedtokenseq(0);
			setState(1735);
			match(RightParen);
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

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1738);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1741);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1742);
					balancedtoken();
					}
					} 
				}
				setState(1747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
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

	public static class BalancedtokenContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CPP14Parser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CPP14Parser.LeftParen, i);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(CPP14Parser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CPP14Parser.RightParen, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(CPP14Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPP14Parser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPP14Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPP14Parser.RightBracket, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(CPP14Parser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(CPP14Parser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(CPP14Parser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(CPP14Parser.RightBrace, i);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1748);
				match(LeftParen);
				setState(1749);
				balancedtokenseq(0);
				setState(1750);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1752);
				match(LeftBracket);
				setState(1753);
				balancedtokenseq(0);
				setState(1754);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1756);
				match(LeftBrace);
				setState(1757);
				balancedtokenseq(0);
				setState(1758);
				match(RightBrace);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case MultiLineMacro:
			case Directive:
			case Alignas:
			case Alignof:
			case Asm:
			case Auto:
			case Bool:
			case Break:
			case Case:
			case Catch:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Const_cast:
			case Continue:
			case Decltype:
			case Default:
			case Delete:
			case Do:
			case Double:
			case Dynamic_cast:
			case Else:
			case Enum:
			case Explicit:
			case Export:
			case Extern:
			case False:
			case Final:
			case Float:
			case For:
			case Friend:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Namespace:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Override:
			case Private:
			case Protected:
			case Public:
			case Register:
			case Reinterpret_cast:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Static_assert:
			case Static_cast:
			case Struct:
			case Switch:
			case Template:
			case This:
			case Thread_local:
			case Throw:
			case True:
			case Try:
			case Typedef:
			case Typeid_:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case While:
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case Caret:
			case And:
			case Or:
			case Tilde:
			case Not:
			case Assign:
			case Less:
			case Greater:
			case PlusAssign:
			case MinusAssign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case XorAssign:
			case AndAssign:
			case OrAssign:
			case LeftShift:
			case RightShift:
			case LeftShiftAssign:
			case RightShiftAssign:
			case Equal:
			case NotEqual:
			case LessEqual:
			case GreaterEqual:
			case AndAnd:
			case OrOr:
			case PlusPlus:
			case MinusMinus:
			case Comma:
			case ArrowStar:
			case Arrow:
			case Question:
			case Colon:
			case Doublecolon:
			case Semi:
			case Dot:
			case DotStar:
			case Ellipsis:
			case Identifier:
			case Integerliteral:
			case Decimalliteral:
			case Octalliteral:
			case Hexadecimalliteral:
			case Binaryliteral:
			case Integersuffix:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1761); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1760);
						_la = _input.LA(1);
						if ( _la <= 0 || (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (RightParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (RightBracket - 84)) | (1L << (LeftBrace - 84)) | (1L << (RightBrace - 84)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1763); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 276;
		enterRecursionRule(_localctx, 276, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1768);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1770);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1771);
					match(Comma);
					setState(1772);
					initdeclarator();
					}
					} 
				}
				setState(1777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
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

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			declarator();
			setState(1780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1779);
				initializer();
				}
				break;
			}
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

	public static class DeclaratorContext extends ParserRuleContext {
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_declarator);
		try {
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1783);
				noptrdeclarator(0);
				setState(1784);
				parametersandqualifiers();
				setState(1785);
				trailingreturntype();
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

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ptrdeclarator);
		try {
			setState(1793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1789);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1790);
				ptroperator();
				setState(1791);
				ptrdeclarator();
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

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ArraydeclarationContext arraydeclaration() {
			return getRuleContext(ArraydeclarationContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 284;
		enterRecursionRule(_localctx, 284, RULE_noptrdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1796);
				declaratorid();
				setState(1798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1797);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1800);
				arraydeclaration();
				setState(1802);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1801);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1804);
				match(LeftParen);
				setState(1805);
				ptrdeclarator();
				setState(1806);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
					setState(1810);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(1811);
					parametersandqualifiers();
					}
					} 
				}
				setState(1816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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

	public static class ArraydeclarationContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(CPP14Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPP14Parser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPP14Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPP14Parser.RightBracket, i);
		}
		public List<ConstantexpressionContext> constantexpression() {
			return getRuleContexts(ConstantexpressionContext.class);
		}
		public ConstantexpressionContext constantexpression(int i) {
			return getRuleContext(ConstantexpressionContext.class,i);
		}
		public ArraydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydeclaration; }
	}

	public final ArraydeclarationContext arraydeclaration() throws RecognitionException {
		ArraydeclarationContext _localctx = new ArraydeclarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_arraydeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			declaratorid();
			setState(1825);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1818);
					match(LeftBracket);
					setState(1820);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
						{
						setState(1819);
						constantexpression();
						}
					}

					setState(1822);
					match(RightBracket);
					}
					} 
				}
				setState(1827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			}
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

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(LeftParen);
			setState(1829);
			parameterdeclarationclause();
			setState(1830);
			match(RightParen);
			setState(1832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1831);
				cvqualifierseq();
				}
				break;
			}
			setState(1835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1834);
				refqualifier();
				}
				break;
			}
			setState(1838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1837);
				exceptionspecification();
				}
				break;
			}
			setState(1841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1840);
				attributespecifierseq(0);
				}
				break;
			}
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

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(CPP14Parser.Arrow, 0); }
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			match(Arrow);
			setState(1844);
			trailingtypespecifierseq();
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1845);
				abstractdeclarator();
				}
				break;
			}
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

	public static class PtroperatorContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(CPP14Parser.Star, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_ptroperator);
		try {
			setState(1871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1848);
				match(Star);
				setState(1850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1849);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1852);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1855);
				match(And);
				setState(1857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1856);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1859);
				match(T__2);
				setState(1861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1860);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case Decltype:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1863);
				nestednamespecifier(0);
				setState(1864);
				match(Star);
				setState(1866);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1865);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1868);
					cvqualifierseq();
					}
					break;
				}
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

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			cvqualifier();
			setState(1875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1874);
				cvqualifierseq();
				}
				break;
			}
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

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CPP14Parser.Const, 0); }
		public TerminalNode Volatile() { return getToken(CPP14Parser.Volatile, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class RefqualifierContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==And) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1881);
				match(Ellipsis);
				}
			}

			setState(1884);
			idexpression();
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

	public static class ThetypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ThetypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thetypeid; }
	}

	public final ThetypeidContext thetypeid() throws RecognitionException {
		ThetypeidContext _localctx = new ThetypeidContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_thetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			typespecifierseq();
			setState(1888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1887);
				abstractdeclarator();
				}
				break;
			}
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

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_abstractdeclarator);
		try {
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1890);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1891);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1894);
				parametersandqualifiers();
				setState(1895);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1897);
				abstractpackdeclarator();
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

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_ptrabstractdeclarator);
		try {
			setState(1905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1900);
				noptrabstractdeclarator(0);
				}
				break;
			case T__2:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1901);
				ptroperator();
				setState(1903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1902);
					ptrabstractdeclarator();
					}
					break;
				}
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

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 308;
		enterRecursionRule(_localctx, 308, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1908);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1909);
				match(LeftBracket);
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(1910);
					constantexpression();
					}
				}

				setState(1913);
				match(RightBracket);
				setState(1915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1914);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1917);
				match(LeftParen);
				setState(1918);
				ptrabstractdeclarator();
				setState(1919);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1936);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1934);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1923);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1924);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1925);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1926);
						match(LeftBracket);
						setState(1928);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
							{
							setState(1927);
							constantexpression();
							}
						}

						setState(1930);
						match(RightBracket);
						setState(1932);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
						case 1:
							{
							setState(1931);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1938);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
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

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_abstractpackdeclarator);
		try {
			setState(1943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1939);
				noptrabstractpackdeclarator(0);
				}
				break;
			case T__2:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1940);
				ptroperator();
				setState(1941);
				abstractpackdeclarator();
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

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1946);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1959);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1948);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1949);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1950);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1951);
						match(LeftBracket);
						setState(1953);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
							{
							setState(1952);
							constantexpression();
							}
						}

						setState(1955);
						match(RightBracket);
						setState(1957);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
						case 1:
							{
							setState(1956);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
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

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (Alignas - 9)) | (1L << (Auto - 9)) | (1L << (Bool - 9)) | (1L << (Char - 9)) | (1L << (Char16 - 9)) | (1L << (Char32 - 9)) | (1L << (Class - 9)) | (1L << (Const - 9)) | (1L << (Constexpr - 9)) | (1L << (Decltype - 9)) | (1L << (Double - 9)) | (1L << (Enum - 9)) | (1L << (Explicit - 9)) | (1L << (Extern - 9)) | (1L << (Float - 9)) | (1L << (Friend - 9)) | (1L << (Inline - 9)) | (1L << (Int - 9)) | (1L << (Long - 9)) | (1L << (Mutable - 9)) | (1L << (Register - 9)) | (1L << (Short - 9)) | (1L << (Signed - 9)) | (1L << (Static - 9)) | (1L << (Struct - 9)) | (1L << (Thread_local - 9)))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Typedef - 73)) | (1L << (Typename_ - 73)) | (1L << (Union - 73)) | (1L << (Unsigned - 73)) | (1L << (Virtual - 73)) | (1L << (Void - 73)) | (1L << (Volatile - 73)) | (1L << (Wchar - 73)) | (1L << (LeftBracket - 73)) | (1L << (Doublecolon - 73)) | (1L << (Identifier - 73)))) != 0)) {
					{
					setState(1964);
					parameterdeclarationlist(0);
					}
				}

				setState(1968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1967);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1970);
				parameterdeclarationlist(0);
				setState(1971);
				match(Comma);
				setState(1972);
				match(Ellipsis);
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

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 316;
		enterRecursionRule(_localctx, 316, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1977);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1979);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1980);
					match(Comma);
					setState(1981);
					parameterdeclaration();
					}
					} 
				}
				setState(1986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
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

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_parameterdeclaration);
		int _la;
		try {
			setState(2018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1987);
					attributespecifierseq(0);
					}
				}

				setState(1990);
				declspecifierseq();
				setState(1991);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1993);
					attributespecifierseq(0);
					}
				}

				setState(1996);
				declspecifierseq();
				setState(1997);
				declarator();
				setState(1998);
				match(Assign);
				setState(1999);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2001);
					attributespecifierseq(0);
					}
				}

				setState(2004);
				declspecifierseq();
				setState(2006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(2005);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2008);
					attributespecifierseq(0);
					}
				}

				setState(2011);
				declspecifierseq();
				setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==Decltype || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(2012);
					abstractdeclarator();
					}
				}

				setState(2015);
				match(Assign);
				setState(2016);
				initializerclause();
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

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public FunctionheadContext functionhead() {
			return getRuleContext(FunctionheadContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_functiondefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			functionhead();
			setState(2021);
			functionbody();
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

	public static class FunctionheadContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public FunctionheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionhead; }
	}

	public final FunctionheadContext functionhead() throws RecognitionException {
		FunctionheadContext _localctx = new FunctionheadContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_functionhead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(2023);
				attributespecifierseq(0);
				}
			}

			setState(2027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(2026);
				declspecifierseq();
				}
				break;
			}
			setState(2029);
			declarator();
			setState(2031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(2030);
				virtspecifierseq(0);
				}
			}

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

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_functionbody);
		int _la;
		try {
			setState(2044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2033);
					ctorinitializer();
					}
				}

				setState(2036);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2038);
				match(Assign);
				setState(2039);
				match(Default);
				setState(2040);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2041);
				match(Assign);
				setState(2042);
				match(Delete);
				setState(2043);
				match(Semi);
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

	public static class InitializerContext extends ParserRuleContext {
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_initializer);
		try {
			setState(2051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2046);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2047);
				match(LeftParen);
				setState(2048);
				expressionlist();
				setState(2049);
				match(RightParen);
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

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_braceorequalinitializer);
		try {
			setState(2056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2053);
				match(Assign);
				setState(2054);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2055);
				bracedinitlist();
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

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_initializerclause);
		try {
			setState(2060);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2058);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2059);
				bracedinitlist();
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

	public static class InitializerlistContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 332;
		enterRecursionRule(_localctx, 332, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2063);
			initializerclause();
			setState(2065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2064);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(2067);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2068);
					match(Comma);
					setState(2069);
					initializerclause();
					setState(2071);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
					case 1:
						{
						setState(2070);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
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

	public static class BracedinitlistContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_bracedinitlist);
		int _la;
		try {
			setState(2087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2078);
				match(LeftBrace);
				setState(2079);
				initializerlist(0);
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2080);
					match(Comma);
					}
				}

				setState(2083);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2085);
				match(LeftBrace);
				setState(2086);
				match(RightBrace);
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

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_classname);
		try {
			setState(2091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2089);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2090);
				simpletemplateid();
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

	public static class ClassspecifierContext extends ParserRuleContext {
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			classhead();
			setState(2094);
			match(LeftBrace);
			setState(2096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Colon - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(2095);
				memberspecification();
				}
			}

			setState(2098);
			match(RightBrace);
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

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_classhead);
		int _la;
		try {
			setState(2118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2100);
				classkey();
				setState(2102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2101);
					attributespecifierseq(0);
					}
				}

				setState(2104);
				classheadname();
				setState(2106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2105);
					classvirtspecifier();
					}
				}

				setState(2109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2108);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2111);
				classkey();
				setState(2113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2112);
					attributespecifierseq(0);
					}
				}

				setState(2116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2115);
					baseclause();
					}
				}

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

	public static class ClassheadnameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2120);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2123);
			classname();
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

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2125);
			match(Final);
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

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public TerminalNode Union() { return getToken(CPP14Parser.Union, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127);
			_la = _input.LA(1);
			if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (Class - 20)) | (1L << (Struct - 20)) | (1L << (Union - 20)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_memberspecification);
		int _la;
		try {
			setState(2138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2129);
				memberdeclaration();
				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Colon - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(2130);
					memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(2133);
				accessspecifier();
				setState(2134);
				match(Colon);
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Colon - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(2135);
					memberspecification();
					}
				}

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

	public static class MemberdeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_memberdeclaration);
		int _la;
		try {
			setState(2156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2140);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2143);
					declspecifierseq();
					}
					break;
				}
				setState(2147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Tilde - 84)) | (1L << (Colon - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(2146);
					memberdeclaratorlist(0);
					}
				}

				setState(2149);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2150);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2151);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2152);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2153);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2154);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2155);
				emptydeclaration();
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

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 352;
		enterRecursionRule(_localctx, 352, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2159);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2161);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2162);
					match(Comma);
					setState(2163);
					memberdeclarator();
					}
					} 
				}
				setState(2168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
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

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_memberdeclarator);
		int _la;
		try {
			setState(2188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2169);
				declarator();
				setState(2171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2170);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2173);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2176);
				declarator();
				setState(2178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2177);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2180);
					match(Identifier);
					}
				}

				setState(2184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2183);
					attributespecifierseq(0);
					}
				}

				setState(2186);
				match(Colon);
				setState(2187);
				constantexpression();
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

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 356;
		enterRecursionRule(_localctx, 356, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2191);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2193);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2194);
					virtspecifier();
					}
					} 
				}
				setState(2199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
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

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(CPP14Parser.Override, 0); }
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Octalliteral() { return getToken(CPP14Parser.Octalliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			match(Assign);
			setState(2203);
			((PurespecifierContext)_localctx).val = match(Octalliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
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

	public static class BaseclauseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			match(Colon);
			setState(2207);
			basespecifierlist(0);
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

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 364;
		enterRecursionRule(_localctx, 364, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2210);
			basespecifier();
			setState(2212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2211);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2214);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2215);
					match(Comma);
					setState(2216);
					basespecifier();
					setState(2218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
					case 1:
						{
						setState(2217);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
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

	public static class BasespecifierContext extends ParserRuleContext {
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_basespecifier);
		int _la;
		try {
			setState(2246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2225);
					attributespecifierseq(0);
					}
				}

				setState(2228);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2229);
					attributespecifierseq(0);
					}
				}

				setState(2232);
				match(Virtual);
				setState(2234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2233);
					accessspecifier();
					}
				}

				setState(2236);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2237);
					attributespecifierseq(0);
					}
				}

				setState(2240);
				accessspecifier();
				setState(2242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2241);
					match(Virtual);
					}
				}

				setState(2244);
				basetypespecifier();
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

	public static class ClassordecltypeContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_classordecltype);
		try {
			setState(2253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2248);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2251);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2252);
				decltypespecifier();
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

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			classordecltype();
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

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(CPP14Parser.Private, 0); }
		public TerminalNode Protected() { return getToken(CPP14Parser.Protected, 0); }
		public TerminalNode Public() { return getToken(CPP14Parser.Public, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ConversionfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public ConversionfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionfunctionid; }
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			match(Operator);
			setState(2260);
			conversiontypeid();
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

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			typespecifierseq();
			setState(2264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2263);
				conversiondeclarator();
				}
				break;
			}
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

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			ptroperator();
			setState(2268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2267);
				conversiondeclarator();
				}
				break;
			}
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

	public static class CtorinitializerContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			match(Colon);
			setState(2271);
			meminitializerlist();
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

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_meminitializerlist);
		int _la;
		try {
			setState(2284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2273);
				meminitializer();
				setState(2275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2274);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2277);
				meminitializer();
				setState(2279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2278);
					match(Ellipsis);
					}
				}

				setState(2281);
				match(Comma);
				setState(2282);
				meminitializerlist();
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

	public static class MeminitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_meminitializer);
		int _la;
		try {
			setState(2296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2286);
				meminitializerid();
				setState(2287);
				match(LeftParen);
				setState(2289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(2288);
					expressionlist();
					}
				}

				setState(2291);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2293);
				meminitializerid();
				setState(2294);
				bracedinitlist();
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

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_meminitializerid);
		try {
			setState(2300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2298);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2299);
				match(Identifier);
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

	public static class OperatorfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public TheoperatorContext theoperator() {
			return getRuleContext(TheoperatorContext.class,0);
		}
		public OperatorfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfunctionid; }
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			match(Operator);
			setState(2303);
			theoperator();
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

	public static class LiteraloperatoridContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public LiteraloperatoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literaloperatorid; }
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_literaloperatorid);
		try {
			setState(2310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2305);
				match(Operator);
				setState(2306);
				match(Stringliteral);
				setState(2307);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2308);
				match(Operator);
				setState(2309);
				match(Userdefinedstringliteral);
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

	public static class TemplatedeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			match(Template);
			setState(2313);
			match(Less);
			setState(2314);
			templateparameterlist(0);
			setState(2315);
			match(Greater);
			setState(2316);
			declaration();
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

	public static class TemplateparameterlistContext extends ParserRuleContext {
		public TemplateparameterContext templateparameter() {
			return getRuleContext(TemplateparameterContext.class,0);
		}
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 394;
		enterRecursionRule(_localctx, 394, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2319);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2321);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2322);
					match(Comma);
					setState(2323);
					templateparameter();
					}
					} 
				}
				setState(2328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
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

	public static class TemplateparameterContext extends ParserRuleContext {
		public TypeparameterContext typeparameter() {
			return getRuleContext(TypeparameterContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public TemplateparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameter; }
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_templateparameter);
		try {
			setState(2331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2329);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2330);
				parameterdeclaration();
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

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_typeparameter);
		int _la;
		try {
			setState(2381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2333);
				match(Class);
				setState(2335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2334);
					match(Ellipsis);
					}
					break;
				}
				setState(2338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2337);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2340);
				match(Class);
				setState(2342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2341);
					match(Identifier);
					}
				}

				setState(2344);
				match(Assign);
				setState(2345);
				thetypeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2346);
				match(Typename_);
				setState(2348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2347);
					match(Ellipsis);
					}
					break;
				}
				setState(2351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2350);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2353);
				match(Typename_);
				setState(2355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2354);
					match(Identifier);
					}
				}

				setState(2357);
				match(Assign);
				setState(2358);
				thetypeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2359);
				match(Template);
				setState(2360);
				match(Less);
				setState(2361);
				templateparameterlist(0);
				setState(2362);
				match(Greater);
				setState(2363);
				match(Class);
				setState(2365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2364);
					match(Ellipsis);
					}
					break;
				}
				setState(2368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2367);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2370);
				match(Template);
				setState(2371);
				match(Less);
				setState(2372);
				templateparameterlist(0);
				setState(2373);
				match(Greater);
				setState(2374);
				match(Class);
				setState(2376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2375);
					match(Identifier);
					}
				}

				setState(2378);
				match(Assign);
				setState(2379);
				idexpression();
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

	public static class SimpletemplateidContext extends ParserRuleContext {
		public TemplatenameContext templatename() {
			return getRuleContext(TemplatenameContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2383);
			templatename();
			setState(2384);
			match(Less);
			setState(2386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(2385);
				templateargumentlist(0);
				}
			}

			setState(2388);
			match(Greater);
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

	public static class TemplateidContext extends ParserRuleContext {
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateid; }
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_templateid);
		int _la;
		try {
			setState(2405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2390);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2391);
				operatorfunctionid();
				setState(2392);
				match(Less);
				setState(2394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(2393);
					templateargumentlist(0);
					}
				}

				setState(2396);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2398);
				literaloperatorid();
				setState(2399);
				match(Less);
				setState(2401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(2400);
					templateargumentlist(0);
					}
				}

				setState(2403);
				match(Greater);
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

	public static class TemplatenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TemplatenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatename; }
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			match(Identifier);
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

	public static class TemplateargumentlistContext extends ParserRuleContext {
		public TemplateargumentContext templateargument() {
			return getRuleContext(TemplateargumentContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 406;
		enterRecursionRule(_localctx, 406, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2410);
			templateargument();
			setState(2412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2411);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2414);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2415);
					match(Comma);
					setState(2416);
					templateargument();
					setState(2418);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						setState(2417);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
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

	public static class TemplateargumentContext extends ParserRuleContext {
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TemplateargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargument; }
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_templateargument);
		try {
			setState(2428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2425);
				thetypeid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2426);
				constantexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2427);
				idexpression();
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

	public static class TypenamespecifierContext extends ParserRuleContext {
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TypenamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenamespecifier; }
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_typenamespecifier);
		int _la;
		try {
			setState(2441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2430);
				match(Typename_);
				setState(2431);
				nestednamespecifier(0);
				setState(2432);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2434);
				match(Typename_);
				setState(2435);
				nestednamespecifier(0);
				setState(2437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2436);
					match(Template);
					}
				}

				setState(2439);
				simpletemplateid();
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

	public static class ExplicitinstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public ExplicitinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitinstantiation; }
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2443);
				match(Extern);
				}
			}

			setState(2446);
			match(Template);
			setState(2447);
			declaration();
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

	public static class ExplicitspecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2449);
			match(Template);
			setState(2450);
			match(Less);
			setState(2451);
			match(Greater);
			setState(2452);
			declaration();
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

	public static class TryblockContext extends ParserRuleContext {
		public TryblockexpressionContext tryblockexpression() {
			return getRuleContext(TryblockexpressionContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			tryblockexpression();
			setState(2455);
			handlerseq();
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

	public static class FunctiontryblockContext extends ParserRuleContext {
		public FunctiontryblockexpressionContext functiontryblockexpression() {
			return getRuleContext(FunctiontryblockexpressionContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_functiontryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			functiontryblockexpression();
			setState(2458);
			handlerseq();
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

	public static class TryblockexpressionContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public TryblockexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblockexpression; }
	}

	public final TryblockexpressionContext tryblockexpression() throws RecognitionException {
		TryblockexpressionContext _localctx = new TryblockexpressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_tryblockexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			match(Try);
			setState(2461);
			compoundstatement();
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

	public static class FunctiontryblockexpressionContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblockexpression; }
	}

	public final FunctiontryblockexpressionContext functiontryblockexpression() throws RecognitionException {
		FunctiontryblockexpressionContext _localctx = new FunctiontryblockexpressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_functiontryblockexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2463);
			match(Try);
			setState(2465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2464);
				ctorinitializer();
				}
			}

			setState(2467);
			compoundstatement();
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

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2469);
			handler();
			setState(2471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2470);
				handlerseq();
				}
				break;
			}
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

	public static class HandlerContext extends ParserRuleContext {
		public CatchexpressionContext catchexpression() {
			return getRuleContext(CatchexpressionContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			catchexpression();
			setState(2474);
			compoundstatement();
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

	public static class CatchexpressionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(CPP14Parser.Catch, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public CatchexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchexpression; }
	}

	public final CatchexpressionContext catchexpression() throws RecognitionException {
		CatchexpressionContext _localctx = new CatchexpressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_catchexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			match(Catch);
			setState(2477);
			match(LeftParen);
			setState(2478);
			exceptiondeclaration();
			setState(2479);
			match(RightParen);
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

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2481);
					attributespecifierseq(0);
					}
				}

				setState(2484);
				typespecifierseq();
				setState(2485);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2487);
					attributespecifierseq(0);
					}
				}

				setState(2490);
				typespecifierseq();
				setState(2492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==Decltype || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(2491);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2494);
				match(Ellipsis);
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

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2497);
			match(Throw);
			setState(2499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2498);
				assignmentexpression();
				}
				break;
			}
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

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_exceptionspecification);
		try {
			setState(2503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2501);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2502);
				noexceptspecification();
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

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2505);
			match(Throw);
			setState(2506);
			match(LeftParen);
			setState(2508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (Auto - 12)) | (1L << (Bool - 12)) | (1L << (Char - 12)) | (1L << (Char16 - 12)) | (1L << (Char32 - 12)) | (1L << (Class - 12)) | (1L << (Const - 12)) | (1L << (Decltype - 12)) | (1L << (Double - 12)) | (1L << (Enum - 12)) | (1L << (Float - 12)) | (1L << (Int - 12)) | (1L << (Long - 12)) | (1L << (Short - 12)) | (1L << (Signed - 12)) | (1L << (Struct - 12)) | (1L << (Typename_ - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Union - 76)) | (1L << (Unsigned - 76)) | (1L << (Void - 76)) | (1L << (Volatile - 76)) | (1L << (Wchar - 76)) | (1L << (Doublecolon - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				setState(2507);
				typeidlist(0);
				}
			}

			setState(2510);
			match(RightParen);
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

	public static class TypeidlistContext extends ParserRuleContext {
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2513);
			thetypeid();
			setState(2515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				{
				setState(2514);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2525);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2517);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2518);
					match(Comma);
					setState(2519);
					thetypeid();
					setState(2521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
					case 1:
						{
						setState(2520);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
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

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_noexceptspecification);
		try {
			setState(2534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2528);
				match(Noexcept);
				setState(2529);
				match(LeftParen);
				setState(2530);
				constantexpression();
				setState(2531);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2533);
				match(Noexcept);
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

	public static class TheoperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public TerminalNode Plus() { return getToken(CPP14Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CPP14Parser.Minus, 0); }
		public TerminalNode Star() { return getToken(CPP14Parser.Star, 0); }
		public TerminalNode Div() { return getToken(CPP14Parser.Div, 0); }
		public TerminalNode Mod() { return getToken(CPP14Parser.Mod, 0); }
		public TerminalNode Caret() { return getToken(CPP14Parser.Caret, 0); }
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public TerminalNode Or() { return getToken(CPP14Parser.Or, 0); }
		public TerminalNode Tilde() { return getToken(CPP14Parser.Tilde, 0); }
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public TerminalNode PlusAssign() { return getToken(CPP14Parser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CPP14Parser.MinusAssign, 0); }
		public TerminalNode StarAssign() { return getToken(CPP14Parser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CPP14Parser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CPP14Parser.ModAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CPP14Parser.XorAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CPP14Parser.AndAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CPP14Parser.OrAssign, 0); }
		public TerminalNode LeftShift() { return getToken(CPP14Parser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(CPP14Parser.RightShift, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPP14Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPP14Parser.LeftShiftAssign, 0); }
		public TerminalNode Equal() { return getToken(CPP14Parser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CPP14Parser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(CPP14Parser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CPP14Parser.GreaterEqual, 0); }
		public TerminalNode PlusPlus() { return getToken(CPP14Parser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CPP14Parser.MinusMinus, 0); }
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public TerminalNode ArrowStar() { return getToken(CPP14Parser.ArrowStar, 0); }
		public TerminalNode Arrow() { return getToken(CPP14Parser.Arrow, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TheoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoperator; }
	}

	public final TheoperatorContext theoperator() throws RecognitionException {
		TheoperatorContext _localctx = new TheoperatorContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_theoperator);
		try {
			setState(2587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2536);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2537);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2538);
				match(New);
				setState(2539);
				match(LeftBracket);
				setState(2540);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2541);
				match(Delete);
				setState(2542);
				match(LeftBracket);
				setState(2543);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2544);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2545);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2546);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2547);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2548);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2549);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2550);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2551);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2552);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2553);
				match(T__0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2554);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2555);
				match(Assign);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2556);
				match(Less);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2557);
				match(Greater);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2558);
				match(PlusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2559);
				match(MinusAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2560);
				match(StarAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2561);
				match(DivAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2562);
				match(ModAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2563);
				match(XorAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2564);
				match(AndAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2565);
				match(OrAssign);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2566);
				match(LeftShift);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2567);
				match(RightShift);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2568);
				match(RightShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2569);
				match(LeftShiftAssign);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2570);
				match(Equal);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2571);
				match(NotEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2572);
				match(LessEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2573);
				match(GreaterEqual);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2574);
				match(T__2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2575);
				match(T__3);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2576);
				match(T__4);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2577);
				match(T__5);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2578);
				match(PlusPlus);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2579);
				match(MinusMinus);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2580);
				match(Comma);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2581);
				match(ArrowStar);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2582);
				match(Arrow);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2583);
				match(LeftParen);
				setState(2584);
				match(RightParen);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2585);
				match(LeftBracket);
				setState(2586);
				match(RightBracket);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(CPP14Parser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(CPP14Parser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(CPP14Parser.Floatingliteral, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_literal);
		try {
			setState(2596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2589);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2590);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2591);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2592);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2593);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2594);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2595);
				userdefinedliteral();
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

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(CPP14Parser.False, 0); }
		public TerminalNode True() { return getToken(CPP14Parser.True, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2598);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(CPP14Parser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2600);
			match(Nullptr);
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

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedintegerliteral() { return getToken(CPP14Parser.Userdefinedintegerliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(CPP14Parser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(CPP14Parser.Userdefinedcharacterliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2602);
			_la = _input.LA(1);
			if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (Userdefinedintegerliteral - 143)) | (1L << (Userdefinedfloatingliteral - 143)) | (1L << (Userdefinedstringliteral - 143)) | (1L << (Userdefinedcharacterliteral - 143)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		case 6:
			return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 11:
			return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 16:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 31:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 37:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 38:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 39:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 40:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 42:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 43:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 44:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 45:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 46:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 47:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 48:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 53:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 60:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 79:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 108:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 127:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 130:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 136:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 138:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 142:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 154:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 156:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 158:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 166:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 176:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 178:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 182:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 197:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 203:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 219:
			return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestednamespecifier_sempred(NestednamespecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean capturelist_sempred(CapturelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 2);
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 2);
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 2);
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 3);
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 5);
		case 42:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 3);
		case 44:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0098\u0a2f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\3\2\7\2\u01c8\n\2\f\2\16\2\u01cb\13\2\5\2\u01cd\n\2\3\2\5\2\u01d0\n\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u01de\n\4\3\5\3\5"+
		"\5\5\u01e2\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01ed\n\6\3\7\3"+
		"\7\5\7\u01f1\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0200\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0207\n\b\3\b\3\b\3\b\7\b\u020c\n"+
		"\b\f\b\16\b\u020f\13\b\3\t\3\t\5\t\u0213\n\t\3\t\3\t\3\n\3\n\5\n\u0219"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0223\n\13\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u022a\n\r\3\r\3\r\3\r\3\r\5\r\u0230\n\r\7\r\u0232\n\r\f\r"+
		"\16\r\u0235\13\r\3\16\3\16\5\16\u0239\n\16\3\17\3\17\3\17\3\17\5\17\u023f"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0246\n\20\3\21\3\21\3\21\3\21\5\21"+
		"\u024c\n\21\3\21\5\21\u024f\n\21\3\21\5\21\u0252\n\21\3\21\5\21\u0255"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u025e\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0265\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0299\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u02a3\n\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u02b0\n\22"+
		"\f\22\16\22\u02b3\13\22\3\23\3\23\3\23\3\23\3\23\7\23\u02ba\n\23\f\23"+
		"\16\23\u02bd\13\23\3\24\3\24\3\24\5\24\u02c2\n\24\3\24\3\24\3\24\5\24"+
		"\u02c7\n\24\3\24\5\24\u02ca\n\24\3\24\3\24\3\24\5\24\u02cf\n\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u02d6\n\24\3\24\3\24\3\24\5\24\u02db\n\24\3\24"+
		"\5\24\u02de\n\24\5\24\u02e0\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\5\30\u02ea\n\30\3\31\5\31\u02ed\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02fb\n\31\3\32\3\32\3\32\5\32\u0300"+
		"\n\32\3\32\3\32\5\32\u0304\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0322\n\33\3\34\3\34\3\35\5\35\u0327"+
		"\n\35\3\35\3\35\5\35\u032b\n\35\3\35\3\35\5\35\u032f\n\35\3\35\5\35\u0332"+
		"\n\35\3\35\3\35\5\35\u0336\n\35\3\35\3\35\3\35\3\35\5\35\u033c\n\35\5"+
		"\35\u033e\n\35\3\36\3\36\3\36\3\36\3\37\3\37\5\37\u0346\n\37\3 \3 \5 "+
		"\u034a\n \3 \5 \u034d\n \3!\3!\3!\3!\3!\5!\u0354\n!\3!\3!\3!\3!\3!\5!"+
		"\u035b\n!\7!\u035d\n!\f!\16!\u0360\13!\3\"\3\"\5\"\u0364\n\"\3\"\3\"\5"+
		"\"\u0368\n\"\3#\5#\u036b\n#\3#\3#\3#\5#\u0370\n#\3#\3#\3#\3#\5#\u0376"+
		"\n#\3$\3$\3$\3$\3$\3%\3%\3%\3%\5%\u0381\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u0390\n\'\f\'\16\'\u0393\13\'\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\7(\u03a1\n(\f(\16(\u03a4\13(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\7)\u03af\n)\f)\16)\u03b2\13)\3*\3*\3*\3*\3*\3*\3*\7*\u03bb\n*"+
		"\f*\16*\u03be\13*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7"+
		",\u03d1\n,\f,\16,\u03d4\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u03df\n-\f-"+
		"\16-\u03e2\13-\3.\3.\3.\3.\3.\3.\7.\u03ea\n.\f.\16.\u03ed\13.\3/\3/\3"+
		"/\3/\3/\3/\7/\u03f5\n/\f/\16/\u03f8\13/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\7\60\u0400\n\60\f\60\16\60\u0403\13\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\7\61\u040e\n\61\f\61\16\61\u0411\13\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u041c\n\62\f\62\16\62\u041f\13\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0428\n\63\3\64\3\64\3\64\5\64"+
		"\u042d\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\7\67\u043b\n\67\f\67\16\67\u043e\13\67\38\38\39\39\59\u0444\n9\39\39"+
		"\59\u0448\n9\39\39\59\u044c\n9\39\39\59\u0450\n9\39\39\59\u0454\n9\39"+
		"\39\39\59\u0459\n9\39\59\u045c\n9\3:\5:\u045f\n:\3:\3:\3:\3:\5:\u0465"+
		"\n:\3:\3:\3:\3:\5:\u046b\n:\3:\3:\3:\5:\u0470\n:\3;\3;\3;\3;\3<\5<\u0477"+
		"\n<\3<\3<\3=\3=\5=\u047d\n=\3=\3=\3>\3>\3>\3>\3>\7>\u0486\n>\f>\16>\u0489"+
		"\13>\3?\3?\3?\3?\5?\u048f\n?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0499\n@\3A\3"+
		"A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\5C\u04a7\nC\3C\3C\3C\3C\3C\3C\5C\u04af"+
		"\nC\3C\3C\3C\3C\5C\u04b5\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u04c1\nD"+
		"\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\5G\u04d1\nG\3G\3G\5G\u04d5"+
		"\nG\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\5I\u04e2\nI\3J\5J\u04e5\nJ\3J\3J"+
		"\3J\3K\3K\5K\u04ec\nK\3L\3L\3L\3L\3L\3L\5L\u04f4\nL\3M\3M\3M\3N\3N\3N"+
		"\3O\3O\5O\u04fe\nO\3O\3O\3O\3O\3O\5O\u0505\nO\3P\3P\3Q\3Q\3Q\3Q\3Q\7Q"+
		"\u050e\nQ\fQ\16Q\u0511\13Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u051c\nR\3S\3"+
		"S\3S\3S\3S\3S\3S\3S\5S\u0526\nS\3T\3T\3T\5T\u052b\nT\3T\3T\3T\3T\3U\3"+
		"U\3U\5U\u0534\nU\3U\5U\u0537\nU\3U\3U\3U\5U\u053c\nU\3U\3U\3U\5U\u0541"+
		"\nU\3V\3V\3V\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Z\3Z\3Z\3[\3["+
		"\3[\3[\3[\3[\5[\u055d\n[\3\\\3\\\5\\\u0561\n\\\3\\\3\\\3\\\5\\\u0566\n"+
		"\\\3]\3]\3^\3^\3_\3_\3`\3`\3`\5`\u0571\n`\3a\3a\3a\3a\5a\u0577\na\3b\3"+
		"b\5b\u057b\nb\3b\3b\3b\5b\u0580\nb\3c\3c\5c\u0584\nc\3c\3c\3c\5c\u0589"+
		"\nc\3d\5d\u058c\nd\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\5d\u05a2\nd\3e\3e\3e\3e\5e\u05a8\ne\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\5f\u05b3\nf\3g\3g\5g\u05b7\ng\3g\5g\u05ba\ng\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\5g\u05c4\ng\3g\3g\3g\3g\5g\u05ca\ng\3g\5g\u05cd\ng\3h\3h\3i\3i\3i"+
		"\5i\u05d4\ni\3i\3i\3i\3i\3i\3i\3i\3i\5i\u05de\ni\3j\3j\5j\u05e2\nj\3j"+
		"\5j\u05e5\nj\3j\5j\u05e8\nj\3j\3j\5j\u05ec\nj\3j\3j\3j\5j\u05f1\nj\5j"+
		"\u05f3\nj\3k\3k\5k\u05f7\nk\3k\3k\5k\u05fb\nk\3k\3k\3l\3l\3l\3l\3l\5l"+
		"\u0604\nl\3m\3m\3m\3n\3n\3n\3n\3n\3n\7n\u060f\nn\fn\16n\u0612\13n\3o\3"+
		"o\3o\3o\3o\5o\u0619\no\3p\3p\3q\3q\5q\u061f\nq\3r\3r\3s\3s\3s\3s\3s\3"+
		"t\3t\5t\u062a\nt\3u\3u\5u\u062e\nu\3v\5v\u0631\nv\3v\3v\3v\3w\5w\u0637"+
		"\nw\3w\3w\3w\3x\5x\u063d\nx\3x\3x\3y\5y\u0642\ny\3z\3z\3{\3{\3{\3{\3{"+
		"\3{\3|\5|\u064d\n|\3|\3|\3}\3}\5}\u0653\n}\3}\3}\3}\3}\3}\3}\3}\3}\3}"+
		"\5}\u065e\n}\3~\5~\u0661\n~\3~\3~\3~\5~\u0666\n~\3~\3~\3~\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0675"+
		"\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u067b\n\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u0682\n\u0081\f\u0081\16\u0081"+
		"\u0685\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u068e\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0694\n"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u069c\n"+
		"\u0083\3\u0083\3\u0083\5\u0083\u06a0\n\u0083\3\u0084\3\u0084\5\u0084\u06a4"+
		"\n\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u06a9\n\u0084\3\u0084\3\u0084"+
		"\3\u0084\5\u0084\u06ae\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\7\u0084\u06b5\n\u0084\f\u0084\16\u0084\u06b8\13\u0084\3\u0085\3\u0085"+
		"\5\u0085\u06bc\n\u0085\3\u0086\3\u0086\5\u0086\u06c0\n\u0086\3\u0087\3"+
		"\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\5\u008a\u06ce\n\u008a\3\u008a\3\u008a\7\u008a\u06d2\n"+
		"\u008a\f\u008a\16\u008a\u06d5\13\u008a\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\6\u008b\u06e4\n\u008b\r\u008b\16\u008b\u06e5\5\u008b\u06e8\n\u008b\3"+
		"\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u06f0\n\u008c\f"+
		"\u008c\16\u008c\u06f3\13\u008c\3\u008d\3\u008d\5\u008d\u06f7\n\u008d\3"+
		"\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u06fe\n\u008e\3\u008f\3"+
		"\u008f\3\u008f\3\u008f\5\u008f\u0704\n\u008f\3\u0090\3\u0090\3\u0090\5"+
		"\u0090\u0709\n\u0090\3\u0090\3\u0090\5\u0090\u070d\n\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u0713\n\u0090\3\u0090\3\u0090\7\u0090\u0717\n"+
		"\u0090\f\u0090\16\u0090\u071a\13\u0090\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u071f\n\u0091\3\u0091\7\u0091\u0722\n\u0091\f\u0091\16\u0091\u0725\13"+
		"\u0091\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u072b\n\u0092\3\u0092\5"+
		"\u0092\u072e\n\u0092\3\u0092\5\u0092\u0731\n\u0092\3\u0092\5\u0092\u0734"+
		"\n\u0092\3\u0093\3\u0093\3\u0093\5\u0093\u0739\n\u0093\3\u0094\3\u0094"+
		"\5\u0094\u073d\n\u0094\3\u0094\5\u0094\u0740\n\u0094\3\u0094\3\u0094\5"+
		"\u0094\u0744\n\u0094\3\u0094\3\u0094\5\u0094\u0748\n\u0094\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u074d\n\u0094\3\u0094\5\u0094\u0750\n\u0094\5\u0094\u0752"+
		"\n\u0094\3\u0095\3\u0095\5\u0095\u0756\n\u0095\3\u0096\3\u0096\3\u0097"+
		"\3\u0097\3\u0098\5\u0098\u075d\n\u0098\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\5\u0099\u0763\n\u0099\3\u009a\3\u009a\5\u009a\u0767\n\u009a\3\u009a\3"+
		"\u009a\3\u009a\3\u009a\5\u009a\u076d\n\u009a\3\u009b\3\u009b\3\u009b\5"+
		"\u009b\u0772\n\u009b\5\u009b\u0774\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\5\u009c\u077a\n\u009c\3\u009c\3\u009c\5\u009c\u077e\n\u009c\3\u009c\3"+
		"\u009c\3\u009c\3\u009c\5\u009c\u0784\n\u009c\3\u009c\3\u009c\3\u009c\3"+
		"\u009c\3\u009c\5\u009c\u078b\n\u009c\3\u009c\3\u009c\5\u009c\u078f\n\u009c"+
		"\7\u009c\u0791\n\u009c\f\u009c\16\u009c\u0794\13\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\5\u009d\u079a\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u07a4\n\u009e\3\u009e\3\u009e"+
		"\5\u009e\u07a8\n\u009e\7\u009e\u07aa\n\u009e\f\u009e\16\u009e\u07ad\13"+
		"\u009e\3\u009f\5\u009f\u07b0\n\u009f\3\u009f\5\u009f\u07b3\n\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\5\u009f\u07b9\n\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u07c1\n\u00a0\f\u00a0\16\u00a0\u07c4"+
		"\13\u00a0\3\u00a1\5\u00a1\u07c7\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\5\u00a1\u07cd\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\5\u00a1\u07d5\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u07d9\n\u00a1\3\u00a1\5"+
		"\u00a1\u07dc\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u07e0\n\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u07e5\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a3\5\u00a3"+
		"\u07eb\n\u00a3\3\u00a3\5\u00a3\u07ee\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u07f2"+
		"\n\u00a3\3\u00a4\5\u00a4\u07f5\n\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u07ff\n\u00a4\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0806\n\u00a5\3\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u080b\n\u00a6\3\u00a7\3\u00a7\5\u00a7\u080f\n\u00a7\3\u00a8\3"+
		"\u00a8\3\u00a8\5\u00a8\u0814\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5"+
		"\u00a8\u081a\n\u00a8\7\u00a8\u081c\n\u00a8\f\u00a8\16\u00a8\u081f\13\u00a8"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0824\n\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u082a\n\u00a9\3\u00aa\3\u00aa\5\u00aa\u082e\n\u00aa\3"+
		"\u00ab\3\u00ab\3\u00ab\5\u00ab\u0833\n\u00ab\3\u00ab\3\u00ab\3\u00ac\3"+
		"\u00ac\5\u00ac\u0839\n\u00ac\3\u00ac\3\u00ac\5\u00ac\u083d\n\u00ac\3\u00ac"+
		"\5\u00ac\u0840\n\u00ac\3\u00ac\3\u00ac\5\u00ac\u0844\n\u00ac\3\u00ac\5"+
		"\u00ac\u0847\n\u00ac\5\u00ac\u0849\n\u00ac\3\u00ad\5\u00ad\u084c\n\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\5\u00b0"+
		"\u0856\n\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u085b\n\u00b0\5\u00b0\u085d"+
		"\n\u00b0\3\u00b1\5\u00b1\u0860\n\u00b1\3\u00b1\5\u00b1\u0863\n\u00b1\3"+
		"\u00b1\5\u00b1\u0866\n\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\5\u00b1\u086f\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3"+
		"\u00b2\3\u00b2\7\u00b2\u0877\n\u00b2\f\u00b2\16\u00b2\u087a\13\u00b2\3"+
		"\u00b3\3\u00b3\5\u00b3\u087e\n\u00b3\3\u00b3\5\u00b3\u0881\n\u00b3\3\u00b3"+
		"\3\u00b3\5\u00b3\u0885\n\u00b3\3\u00b3\5\u00b3\u0888\n\u00b3\3\u00b3\5"+
		"\u00b3\u088b\n\u00b3\3\u00b3\3\u00b3\5\u00b3\u088f\n\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u0896\n\u00b4\f\u00b4\16\u00b4\u0899"+
		"\13\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u08a7\n\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\5\u00b8\u08ad\n\u00b8\7\u00b8\u08af\n\u00b8\f\u00b8\16"+
		"\u00b8\u08b2\13\u00b8\3\u00b9\5\u00b9\u08b5\n\u00b9\3\u00b9\3\u00b9\5"+
		"\u00b9\u08b9\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u08bd\n\u00b9\3\u00b9\3\u00b9"+
		"\5\u00b9\u08c1\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u08c5\n\u00b9\3\u00b9\3"+
		"\u00b9\5\u00b9\u08c9\n\u00b9\3\u00ba\5\u00ba\u08cc\n\u00ba\3\u00ba\3\u00ba"+
		"\5\u00ba\u08d0\n\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00be\3\u00be\5\u00be\u08db\n\u00be\3\u00bf\3\u00bf\5\u00bf"+
		"\u08df\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\5\u00c1\u08e6\n"+
		"\u00c1\3\u00c1\3\u00c1\5\u00c1\u08ea\n\u00c1\3\u00c1\3\u00c1\3\u00c1\5"+
		"\u00c1\u08ef\n\u00c1\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u08f4\n\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u08fb\n\u00c2\3\u00c3\3\u00c3"+
		"\5\u00c3\u08ff\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\5\u00c5\u0909\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\7\u00c7"+
		"\u0917\n\u00c7\f\u00c7\16\u00c7\u091a\13\u00c7\3\u00c8\3\u00c8\5\u00c8"+
		"\u091e\n\u00c8\3\u00c9\3\u00c9\5\u00c9\u0922\n\u00c9\3\u00c9\5\u00c9\u0925"+
		"\n\u00c9\3\u00c9\3\u00c9\5\u00c9\u0929\n\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u092f\n\u00c9\3\u00c9\5\u00c9\u0932\n\u00c9\3\u00c9\3"+
		"\u00c9\5\u00c9\u0936\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\5\u00c9\u0940\n\u00c9\3\u00c9\5\u00c9\u0943\n\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u094b\n\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0950\n\u00c9\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u0955\n\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u095d\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u0964\n\u00cb\3\u00cb\3\u00cb\5\u00cb\u0968\n\u00cb\3\u00cc\3\u00cc\3"+
		"\u00cd\3\u00cd\3\u00cd\5\u00cd\u096f\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\5\u00cd\u0975\n\u00cd\7\u00cd\u0977\n\u00cd\f\u00cd\16\u00cd\u097a"+
		"\13\u00cd\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u097f\n\u00ce\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0988\n\u00cf\3\u00cf"+
		"\3\u00cf\5\u00cf\u098c\n\u00cf\3\u00d0\5\u00d0\u098f\n\u00d0\3\u00d0\3"+
		"\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\5\u00d5\u09a4\n\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\5\u00d6\u09aa\n"+
		"\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d9\5\u00d9\u09b5\n\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9"+
		"\u09bb\n\u00d9\3\u00d9\3\u00d9\5\u00d9\u09bf\n\u00d9\3\u00d9\5\u00d9\u09c2"+
		"\n\u00d9\3\u00da\3\u00da\5\u00da\u09c6\n\u00da\3\u00db\3\u00db\5\u00db"+
		"\u09ca\n\u00db\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u09cf\n\u00dc\3\u00dc\3"+
		"\u00dc\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u09d6\n\u00dd\3\u00dd\3\u00dd\3"+
		"\u00dd\3\u00dd\5\u00dd\u09dc\n\u00dd\7\u00dd\u09de\n\u00dd\f\u00dd\16"+
		"\u00dd\u09e1\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\5\u00de\u09e9\n\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\5\u00df\u0a1e\n\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\5\u00e0\u0a27\n\u00e0\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e3"+
		"\3\u00e3\3\u00e3\2$\16\30\"@LNPRVXZ\\^`blz\u00a0\u00da\u0100\u0106\u0112"+
		"\u0116\u011e\u0136\u013a\u013e\u014e\u0162\u0166\u016e\u018c\u0198\u01b8"+
		"\u00e4\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a"+
		"\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192"+
		"\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa"+
		"\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2"+
		"\u01c4\2\20\4\2bbff\5\2\3\4\\^bd\3\2qr\5\2ffipst\7\2%%\60\60::@@GG\5\2"+
		"##--QQ\3\2V[\4\2\27\27SS\4\2\5\5bb\5\2\26\26CCNN\4\2\'\'\66\66\3\2\67"+
		"9\4\2&&II\3\2\u0091\u0094\2\u0b3d\2\u01cc\3\2\2\2\4\u01d3\3\2\2\2\6\u01dd"+
		"\3\2\2\2\b\u01e1\3\2\2\2\n\u01ec\3\2\2\2\f\u01ee\3\2\2\2\16\u01ff\3\2"+
		"\2\2\20\u0210\3\2\2\2\22\u0216\3\2\2\2\24\u0222\3\2\2\2\26\u0224\3\2\2"+
		"\2\30\u0226\3\2\2\2\32\u0238\3\2\2\2\34\u023e\3\2\2\2\36\u0245\3\2\2\2"+
		" \u0247\3\2\2\2\"\u0298\3\2\2\2$\u02b4\3\2\2\2&\u02df\3\2\2\2(\u02e1\3"+
		"\2\2\2*\u02e3\3\2\2\2,\u02e5\3\2\2\2.\u02e9\3\2\2\2\60\u02fa\3\2\2\2\62"+
		"\u0303\3\2\2\2\64\u0321\3\2\2\2\66\u0323\3\2\2\28\u033d\3\2\2\2:\u033f"+
		"\3\2\2\2<\u0343\3\2\2\2>\u034c\3\2\2\2@\u034e\3\2\2\2B\u0367\3\2\2\2D"+
		"\u0375\3\2\2\2F\u0377\3\2\2\2H\u0380\3\2\2\2J\u0382\3\2\2\2L\u0386\3\2"+
		"\2\2N\u0394\3\2\2\2P\u03a5\3\2\2\2R\u03b3\3\2\2\2T\u03bf\3\2\2\2V\u03c1"+
		"\3\2\2\2X\u03d5\3\2\2\2Z\u03e3\3\2\2\2\\\u03ee\3\2\2\2^\u03f9\3\2\2\2"+
		"`\u0404\3\2\2\2b\u0412\3\2\2\2d\u0427\3\2\2\2f\u042c\3\2\2\2h\u042e\3"+
		"\2\2\2j\u0432\3\2\2\2l\u0434\3\2\2\2n\u043f\3\2\2\2p\u045b\3\2\2\2r\u046f"+
		"\3\2\2\2t\u0471\3\2\2\2v\u0476\3\2\2\2x\u047a\3\2\2\2z\u0480\3\2\2\2|"+
		"\u048e\3\2\2\2~\u0498\3\2\2\2\u0080\u049a\3\2\2\2\u0082\u049f\3\2\2\2"+
		"\u0084\u04b4\3\2\2\2\u0086\u04c0\3\2\2\2\u0088\u04c2\3\2\2\2\u008a\u04c7"+
		"\3\2\2\2\u008c\u04cc\3\2\2\2\u008e\u04d8\3\2\2\2\u0090\u04e1\3\2\2\2\u0092"+
		"\u04e4\3\2\2\2\u0094\u04eb\3\2\2\2\u0096\u04f3\3\2\2\2\u0098\u04f5\3\2"+
		"\2\2\u009a\u04f8\3\2\2\2\u009c\u0504\3\2\2\2\u009e\u0506\3\2\2\2\u00a0"+
		"\u0508\3\2\2\2\u00a2\u051b\3\2\2\2\u00a4\u0525\3\2\2\2\u00a6\u0527\3\2"+
		"\2\2\u00a8\u0540\3\2\2\2\u00aa\u0542\3\2\2\2\u00ac\u0545\3\2\2\2\u00ae"+
		"\u0549\3\2\2\2\u00b0\u0551\3\2\2\2\u00b2\u0553\3\2\2\2\u00b4\u055c\3\2"+
		"\2\2\u00b6\u0565\3\2\2\2\u00b8\u0567\3\2\2\2\u00ba\u0569\3\2\2\2\u00bc"+
		"\u056b\3\2\2\2\u00be\u0570\3\2\2\2\u00c0\u0576\3\2\2\2\u00c2\u057f\3\2"+
		"\2\2\u00c4\u0588\3\2\2\2\u00c6\u05a1\3\2\2\2\u00c8\u05a7\3\2\2\2\u00ca"+
		"\u05b2\3\2\2\2\u00cc\u05cc\3\2\2\2\u00ce\u05ce\3\2\2\2\u00d0\u05dd\3\2"+
		"\2\2\u00d2\u05f2\3\2\2\2\u00d4\u05f4\3\2\2\2\u00d6\u0603\3\2\2\2\u00d8"+
		"\u0605\3\2\2\2\u00da\u0608\3\2\2\2\u00dc\u0618\3\2\2\2\u00de\u061a\3\2"+
		"\2\2\u00e0\u061e\3\2\2\2\u00e2\u0620\3\2\2\2\u00e4\u0622\3\2\2\2\u00e6"+
		"\u0629\3\2\2\2\u00e8\u062d\3\2\2\2\u00ea\u0630\3\2\2\2\u00ec\u0636\3\2"+
		"\2\2\u00ee\u063c\3\2\2\2\u00f0\u0641\3\2\2\2\u00f2\u0643\3\2\2\2\u00f4"+
		"\u0645\3\2\2\2\u00f6\u064c\3\2\2\2\u00f8\u065d\3\2\2\2\u00fa\u0660\3\2"+
		"\2\2\u00fc\u066a\3\2\2\2\u00fe\u067a\3\2\2\2\u0100\u067c\3\2\2\2\u0102"+
		"\u068d\3\2\2\2\u0104\u069f\3\2\2\2\u0106\u06a8\3\2\2\2\u0108\u06b9\3\2"+
		"\2\2\u010a\u06bf\3\2\2\2\u010c\u06c1\3\2\2\2\u010e\u06c5\3\2\2\2\u0110"+
		"\u06c7\3\2\2\2\u0112\u06cb\3\2\2\2\u0114\u06e7\3\2\2\2\u0116\u06e9\3\2"+
		"\2\2\u0118\u06f4\3\2\2\2\u011a\u06fd\3\2\2\2\u011c\u0703\3\2\2\2\u011e"+
		"\u0712\3\2\2\2\u0120\u071b\3\2\2\2\u0122\u0726\3\2\2\2\u0124\u0735\3\2"+
		"\2\2\u0126\u0751\3\2\2\2\u0128\u0753\3\2\2\2\u012a\u0757\3\2\2\2\u012c"+
		"\u0759\3\2\2\2\u012e\u075c\3\2\2\2\u0130\u0760\3\2\2\2\u0132\u076c\3\2"+
		"\2\2\u0134\u0773\3\2\2\2\u0136\u0783\3\2\2\2\u0138\u0799\3\2\2\2\u013a"+
		"\u079b\3\2\2\2\u013c\u07b8\3\2\2\2\u013e\u07ba\3\2\2\2\u0140\u07e4\3\2"+
		"\2\2\u0142\u07e6\3\2\2\2\u0144\u07ea\3\2\2\2\u0146\u07fe\3\2\2\2\u0148"+
		"\u0805\3\2\2\2\u014a\u080a\3\2\2\2\u014c\u080e\3\2\2\2\u014e\u0810\3\2"+
		"\2\2\u0150\u0829\3\2\2\2\u0152\u082d\3\2\2\2\u0154\u082f\3\2\2\2\u0156"+
		"\u0848\3\2\2\2\u0158\u084b\3\2\2\2\u015a\u084f\3\2\2\2\u015c\u0851\3\2"+
		"\2\2\u015e\u085c\3\2\2\2\u0160\u086e\3\2\2\2\u0162\u0870\3\2\2\2\u0164"+
		"\u088e\3\2\2\2\u0166\u0890\3\2\2\2\u0168\u089a\3\2\2\2\u016a\u089c\3\2"+
		"\2\2\u016c\u08a0\3\2\2\2\u016e\u08a3\3\2\2\2\u0170\u08c8\3\2\2\2\u0172"+
		"\u08cf\3\2\2\2\u0174\u08d1\3\2\2\2\u0176\u08d3\3\2\2\2\u0178\u08d5\3\2"+
		"\2\2\u017a\u08d8\3\2\2\2\u017c\u08dc\3\2\2\2\u017e\u08e0\3\2\2\2\u0180"+
		"\u08ee\3\2\2\2\u0182\u08fa\3\2\2\2\u0184\u08fe\3\2\2\2\u0186\u0900\3\2"+
		"\2\2\u0188\u0908\3\2\2\2\u018a\u090a\3\2\2\2\u018c\u0910\3\2\2\2\u018e"+
		"\u091d\3\2\2\2\u0190\u094f\3\2\2\2\u0192\u0951\3\2\2\2\u0194\u0967\3\2"+
		"\2\2\u0196\u0969\3\2\2\2\u0198\u096b\3\2\2\2\u019a\u097e\3\2\2\2\u019c"+
		"\u098b\3\2\2\2\u019e\u098e\3\2\2\2\u01a0\u0993\3\2\2\2\u01a2\u0998\3\2"+
		"\2\2\u01a4\u099b\3\2\2\2\u01a6\u099e\3\2\2\2\u01a8\u09a1\3\2\2\2\u01aa"+
		"\u09a7\3\2\2\2\u01ac\u09ab\3\2\2\2\u01ae\u09ae\3\2\2\2\u01b0\u09c1\3\2"+
		"\2\2\u01b2\u09c3\3\2\2\2\u01b4\u09c9\3\2\2\2\u01b6\u09cb\3\2\2\2\u01b8"+
		"\u09d2\3\2\2\2\u01ba\u09e8\3\2\2\2\u01bc\u0a1d\3\2\2\2\u01be\u0a26\3\2"+
		"\2\2\u01c0\u0a28\3\2\2\2\u01c2\u0a2a\3\2\2\2\u01c4\u0a2c\3\2\2\2\u01c6"+
		"\u01c8\5\4\3\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01c9\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01d0\5\u00a0"+
		"Q\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d2\7\2\2\3\u01d2\3\3\2\2\2\u01d3\u01d4\7\n\2\2\u01d4\5\3\2\2\2\u01d5"+
		"\u01de\5\u01be\u00e0\2\u01d6\u01de\7F\2\2\u01d7\u01d8\7V\2\2\u01d8\u01d9"+
		"\5l\67\2\u01d9\u01da\7W\2\2\u01da\u01de\3\2\2\2\u01db\u01de\5\b\5\2\u01dc"+
		"\u01de\5\20\t\2\u01dd\u01d5\3\2\2\2\u01dd\u01d6\3\2\2\2\u01dd\u01d7\3"+
		"\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de\7\3\2\2\2\u01df\u01e2"+
		"\5\n\6\2\u01e0\u01e2\5\f\7\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\t\3\2\2\2\u01e3\u01ed\7\u0087\2\2\u01e4\u01ed\5\u0186\u00c4\2\u01e5\u01ed"+
		"\5\u0178\u00bd\2\u01e6\u01ed\5\u0188\u00c5\2\u01e7\u01e8\7d\2\2\u01e8"+
		"\u01ed\5\u0152\u00aa\2\u01e9\u01ea\7d\2\2\u01ea\u01ed\5\u00caf\2\u01eb"+
		"\u01ed\5\u0194\u00cb\2\u01ec\u01e3\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ec\u01e5"+
		"\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ec\u01e7\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ec"+
		"\u01eb\3\2\2\2\u01ed\13\3\2\2\2\u01ee\u01f0\5\16\b\2\u01ef\u01f1\7E\2"+
		"\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3"+
		"\5\n\6\2\u01f3\r\3\2\2\2\u01f4\u01f5\b\b\1\2\u01f5\u0200\7\u0082\2\2\u01f6"+
		"\u01f7\5\u00c8e\2\u01f7\u01f8\7\u0082\2\2\u01f8\u0200\3\2\2\2\u01f9\u01fa"+
		"\5\u00e0q\2\u01fa\u01fb\7\u0082\2\2\u01fb\u0200\3\2\2\2\u01fc\u01fd\5"+
		"\u00caf\2\u01fd\u01fe\7\u0082\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f4\3\2"+
		"\2\2\u01ff\u01f6\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200"+
		"\u020d\3\2\2\2\u0201\u0202\f\4\2\2\u0202\u0203\7\u0087\2\2\u0203\u020c"+
		"\7\u0082\2\2\u0204\u0206\f\3\2\2\u0205\u0207\7E\2\2\u0206\u0205\3\2\2"+
		"\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\5\u0192\u00ca\2"+
		"\u0209\u020a\7\u0082\2\2\u020a\u020c\3\2\2\2\u020b\u0201\3\2\2\2\u020b"+
		"\u0204\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\17\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212\5\22\n\2\u0211\u0213"+
		"\5 \21\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0215\5x=\2\u0215\21\3\2\2\2\u0216\u0218\7X\2\2\u0217\u0219\5\24\13\2"+
		"\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b"+
		"\7Y\2\2\u021b\23\3\2\2\2\u021c\u0223\5\26\f\2\u021d\u0223\5\30\r\2\u021e"+
		"\u021f\5\26\f\2\u021f\u0220\7}\2\2\u0220\u0221\5\30\r\2\u0221\u0223\3"+
		"\2\2\2\u0222\u021c\3\2\2\2\u0222\u021d\3\2\2\2\u0222\u021e\3\2\2\2\u0223"+
		"\25\3\2\2\2\u0224\u0225\t\2\2\2\u0225\27\3\2\2\2\u0226\u0227\b\r\1\2\u0227"+
		"\u0229\5\32\16\2\u0228\u022a\7\u0086\2\2\u0229\u0228\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u0233\3\2\2\2\u022b\u022c\f\3\2\2\u022c\u022d\7}\2\2\u022d"+
		"\u022f\5\32\16\2\u022e\u0230\7\u0086\2\2\u022f\u022e\3\2\2\2\u022f\u0230"+
		"\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022b\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\31\3\2\2\2\u0235\u0233\3\2\2"+
		"\2\u0236\u0239\5\34\17\2\u0237\u0239\5\36\20\2\u0238\u0236\3\2\2\2\u0238"+
		"\u0237\3\2\2\2\u0239\33\3\2\2\2\u023a\u023f\7\u0087\2\2\u023b\u023c\7"+
		"b\2\2\u023c\u023f\7\u0087\2\2\u023d\u023f\7F\2\2\u023e\u023a\3\2\2\2\u023e"+
		"\u023b\3\2\2\2\u023e\u023d\3\2\2\2\u023f\35\3\2\2\2\u0240\u0241\7\u0087"+
		"\2\2\u0241\u0246\5\u0148\u00a5\2\u0242\u0243\7b\2\2\u0243\u0244\7\u0087"+
		"\2\2\u0244\u0246\5\u0148\u00a5\2\u0245\u0240\3\2\2\2\u0245\u0242\3\2\2"+
		"\2\u0246\37\3\2\2\2\u0247\u0248\7V\2\2\u0248\u0249\5\u013c\u009f\2\u0249"+
		"\u024b\7W\2\2\u024a\u024c\7\60\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2"+
		"\2\2\u024c\u024e\3\2\2\2\u024d\u024f\5\u01b4\u00db\2\u024e\u024d\3\2\2"+
		"\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u0252\5\u0100\u0081\2"+
		"\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0255"+
		"\5\u0124\u0093\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255!\3\2\2"+
		"\2\u0256\u0257\b\22\1\2\u0257\u0299\5&\24\2\u0258\u0299\5\6\4\2\u0259"+
		"\u0299\5$\23\2\u025a\u025b\5\u00c6d\2\u025b\u025d\7V\2\2\u025c\u025e\5"+
		",\27\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0260\7W\2\2\u0260\u0299\3\2\2\2\u0261\u0262\5\u019c\u00cf\2\u0262\u0264"+
		"\7V\2\2\u0263\u0265\5,\27\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0267\7W\2\2\u0267\u0299\3\2\2\2\u0268\u0269\5\u00c6"+
		"d\2\u0269\u026a\5\u0150\u00a9\2\u026a\u0299\3\2\2\2\u026b\u026c\5\u019c"+
		"\u00cf\2\u026c\u026d\5\u0150\u00a9\2\u026d\u0299\3\2\2\2\u026e\u026f\7"+
		" \2\2\u026f\u0270\7g\2\2\u0270\u0271\5\u0130\u0099\2\u0271\u0272\7h\2"+
		"\2\u0272\u0273\7V\2\2\u0273\u0274\5l\67\2\u0274\u0275\7W\2\2\u0275\u0299"+
		"\3\2\2\2\u0276\u0277\7B\2\2\u0277\u0278\7g\2\2\u0278\u0279\5\u0130\u0099"+
		"\2\u0279\u027a\7h\2\2\u027a\u027b\7V\2\2\u027b\u027c\5l\67\2\u027c\u027d"+
		"\7W\2\2\u027d\u0299\3\2\2\2\u027e\u027f\7;\2\2\u027f\u0280\7g\2\2\u0280"+
		"\u0281\5\u0130\u0099\2\u0281\u0282\7h\2\2\u0282\u0283\7V\2\2\u0283\u0284"+
		"\5l\67\2\u0284\u0285\7W\2\2\u0285\u0299\3\2\2\2\u0286\u0287\7\31\2\2\u0287"+
		"\u0288\7g\2\2\u0288\u0289\5\u0130\u0099\2\u0289\u028a\7h\2\2\u028a\u028b"+
		"\7V\2\2\u028b\u028c\5l\67\2\u028c\u028d\7W\2\2\u028d\u0299\3\2\2\2\u028e"+
		"\u028f\5*\26\2\u028f\u0290\7V\2\2\u0290\u0291\5l\67\2\u0291\u0292\7W\2"+
		"\2\u0292\u0299\3\2\2\2\u0293\u0294\5*\26\2\u0294\u0295\7V\2\2\u0295\u0296"+
		"\5\u0130\u0099\2\u0296\u0297\7W\2\2\u0297\u0299\3\2\2\2\u0298\u0256\3"+
		"\2\2\2\u0298\u0258\3\2\2\2\u0298\u0259\3\2\2\2\u0298\u025a\3\2\2\2\u0298"+
		"\u0261\3\2\2\2\u0298\u0268\3\2\2\2\u0298\u026b\3\2\2\2\u0298\u026e\3\2"+
		"\2\2\u0298\u0276\3\2\2\2\u0298\u027e\3\2\2\2\u0298\u0286\3\2\2\2\u0298"+
		"\u028e\3\2\2\2\u0298\u0293\3\2\2\2\u0299\u02b1\3\2\2\2\u029a\u029b\f\22"+
		"\2\2\u029b\u029c\7X\2\2\u029c\u029d\5\u0150\u00a9\2\u029d\u029e\7Y\2\2"+
		"\u029e\u02b0\3\2\2\2\u029f\u02a0\f\21\2\2\u02a0\u02a2\7V\2\2\u02a1\u02a3"+
		"\5,\27\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02b0\7W\2\2\u02a5\u02a6\f\f\2\2\u02a6\u02a7\7\u0084\2\2\u02a7\u02b0"+
		"\5.\30\2\u02a8\u02a9\f\13\2\2\u02a9\u02aa\7\177\2\2\u02aa\u02b0\5.\30"+
		"\2\u02ab\u02ac\f\n\2\2\u02ac\u02b0\7{\2\2\u02ad\u02ae\f\t\2\2\u02ae\u02b0"+
		"\7|\2\2\u02af\u029a\3\2\2\2\u02af\u029f\3\2\2\2\u02af\u02a5\3\2\2\2\u02af"+
		"\u02a8\3\2\2\2\u02af\u02ab\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b3\3\2"+
		"\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2#\3\2\2\2\u02b3\u02b1"+
		"\3\2\2\2\u02b4\u02bb\5\6\4\2\u02b5\u02b6\7X\2\2\u02b6\u02b7\5l\67\2\u02b7"+
		"\u02b8\7Y\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b5\3\2\2\2\u02ba\u02bd\3\2"+
		"\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc%\3\2\2\2\u02bd\u02bb"+
		"\3\2\2\2\u02be\u02bf\5\6\4\2\u02bf\u02c1\7\u0084\2\2\u02c0\u02c2\7E\2"+
		"\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c9"+
		"\5\b\5\2\u02c4\u02c6\7V\2\2\u02c5\u02c7\5,\27\2\u02c6\u02c5\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ca\7W\2\2\u02c9\u02c4\3\2"+
		"\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02e0\3\2\2\2\u02cb\u02cc\5\6\4\2\u02cc"+
		"\u02ce\7V\2\2\u02cd\u02cf\5,\27\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\7W\2\2\u02d1\u02e0\3\2\2\2\u02d2"+
		"\u02d3\5\6\4\2\u02d3\u02d5\7\177\2\2\u02d4\u02d6\7E\2\2\u02d5\u02d4\3"+
		"\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02dd\5\b\5\2\u02d8"+
		"\u02da\7V\2\2\u02d9\u02db\5,\27\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2"+
		"\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\7W\2\2\u02dd\u02d8\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02be\3\2\2\2\u02df\u02cb\3\2"+
		"\2\2\u02df\u02d2\3\2\2\2\u02e0\'\3\2\2\2\u02e1\u02e2\7L\2\2\u02e2)\3\2"+
		"\2\2\u02e3\u02e4\7L\2\2\u02e4+\3\2\2\2\u02e5\u02e6\5\u014e\u00a8\2\u02e6"+
		"-\3\2\2\2\u02e7\u02ea\5\60\31\2\u02e8\u02ea\5\62\32\2\u02e9\u02e7\3\2"+
		"\2\2\u02e9\u02e8\3\2\2\2\u02ea/\3\2\2\2\u02eb\u02ed\5\16\b\2\u02ec\u02eb"+
		"\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\5\u00c8e"+
		"\2\u02ef\u02f0\7\u0082\2\2\u02f0\u02f1\7d\2\2\u02f1\u02f2\5\u00c8e\2\u02f2"+
		"\u02fb\3\2\2\2\u02f3\u02f4\5\16\b\2\u02f4\u02f5\7E\2\2\u02f5\u02f6\5\u0192"+
		"\u00ca\2\u02f6\u02f7\7\u0082\2\2\u02f7\u02f8\7d\2\2\u02f8\u02f9\5\u00c8"+
		"e\2\u02f9\u02fb\3\2\2\2\u02fa\u02ec\3\2\2\2\u02fa\u02f3\3\2\2\2\u02fb"+
		"\61\3\2\2\2\u02fc\u02fd\7d\2\2\u02fd\u0304\5\u00caf\2\u02fe\u0300\5\16"+
		"\b\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u0302\7d\2\2\u0302\u0304\5\u00c8e\2\u0303\u02fc\3\2\2\2\u0303\u02ff\3"+
		"\2\2\2\u0304\63\3\2\2\2\u0305\u0322\5\"\22\2\u0306\u0307\7{\2\2\u0307"+
		"\u0322\5H%\2\u0308\u0309\7|\2\2\u0309\u0322\5H%\2\u030a\u030b\5\66\34"+
		"\2\u030b\u030c\5H%\2\u030c\u0322\3\2\2\2\u030d\u030e\7?\2\2\u030e\u0322"+
		"\5\64\33\2\u030f\u0310\7?\2\2\u0310\u0311\7V\2\2\u0311\u0312\5\u0130\u0099"+
		"\2\u0312\u0313\7W\2\2\u0313\u0322\3\2\2\2\u0314\u0315\7?\2\2\u0315\u0316"+
		"\7\u0086\2\2\u0316\u0317\7V\2\2\u0317\u0318\7\u0087\2\2\u0318\u0322\7"+
		"W\2\2\u0319\u031a\7\f\2\2\u031a\u031b\7V\2\2\u031b\u031c\5\u0130\u0099"+
		"\2\u031c\u031d\7W\2\2\u031d\u0322\3\2\2\2\u031e\u0322\5F$\2\u031f\u0322"+
		"\58\35\2\u0320\u0322\5D#\2\u0321\u0305\3\2\2\2\u0321\u0306\3\2\2\2\u0321"+
		"\u0308\3\2\2\2\u0321\u030a\3\2\2\2\u0321\u030d\3\2\2\2\u0321\u030f\3\2"+
		"\2\2\u0321\u0314\3\2\2\2\u0321\u0319\3\2\2\2\u0321\u031e\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0321\u0320\3\2\2\2\u0322\65\3\2\2\2\u0323\u0324\t\3\2"+
		"\2\u0324\67\3\2\2\2\u0325\u0327\7\u0082\2\2\u0326\u0325\3\2\2\2\u0326"+
		"\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032a\7\62\2\2\u0329\u032b\5"+
		":\36\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032e\5<\37\2\u032d\u032f\5B\"\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2"+
		"\2\2\u032f\u033e\3\2\2\2\u0330\u0332\7\u0082\2\2\u0331\u0330\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\7\62\2\2\u0334\u0336\5"+
		":\36\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"\u0338\7V\2\2\u0338\u0339\5\u0130\u0099\2\u0339\u033b\7W\2\2\u033a\u033c"+
		"\5B\"\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d"+
		"\u0326\3\2\2\2\u033d\u0331\3\2\2\2\u033e9\3\2\2\2\u033f\u0340\7V\2\2\u0340"+
		"\u0341\5,\27\2\u0341\u0342\7W\2\2\u0342;\3\2\2\2\u0343\u0345\5\u00c2b"+
		"\2\u0344\u0346\5> \2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346=\3"+
		"\2\2\2\u0347\u0349\5\u0126\u0094\2\u0348\u034a\5> \2\u0349\u0348\3\2\2"+
		"\2\u0349\u034a\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u034d\5@!\2\u034c\u0347"+
		"\3\2\2\2\u034c\u034b\3\2\2\2\u034d?\3\2\2\2\u034e\u034f\b!\1\2\u034f\u0350"+
		"\7X\2\2\u0350\u0351\5l\67\2\u0351\u0353\7Y\2\2\u0352\u0354\5\u0100\u0081"+
		"\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u035e\3\2\2\2\u0355\u0356"+
		"\f\3\2\2\u0356\u0357\7X\2\2\u0357\u0358\5n8\2\u0358\u035a\7Y\2\2\u0359"+
		"\u035b\5\u0100\u0081\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d"+
		"\3\2\2\2\u035c\u0355\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e"+
		"\u035f\3\2\2\2\u035fA\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0363\7V\2\2\u0362"+
		"\u0364\5,\27\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2"+
		"\2\2\u0365\u0368\7W\2\2\u0366\u0368\5\u0150\u00a9\2\u0367\u0361\3\2\2"+
		"\2\u0367\u0366\3\2\2\2\u0368C\3\2\2\2\u0369\u036b\7\u0082\2\2\u036a\u0369"+
		"\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\7\35\2\2"+
		"\u036d\u0376\5H%\2\u036e\u0370\7\u0082\2\2\u036f\u036e\3\2\2\2\u036f\u0370"+
		"\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\7\35\2\2\u0372\u0373\7X\2\2\u0373"+
		"\u0374\7Y\2\2\u0374\u0376\5H%\2\u0375\u036a\3\2\2\2\u0375\u036f\3\2\2"+
		"\2\u0376E\3\2\2\2\u0377\u0378\7\63\2\2\u0378\u0379\7V\2\2\u0379\u037a"+
		"\5l\67\2\u037a\u037b\7W\2\2\u037bG\3\2\2\2\u037c\u0381\5\64\33\2\u037d"+
		"\u037e\5J&\2\u037e\u037f\5H%\2\u037f\u0381\3\2\2\2\u0380\u037c\3\2\2\2"+
		"\u0380\u037d\3\2\2\2\u0381I\3\2\2\2\u0382\u0383\7V\2\2\u0383\u0384\5\u0130"+
		"\u0099\2\u0384\u0385\7W\2\2\u0385K\3\2\2\2\u0386\u0387\b\'\1\2\u0387\u0388"+
		"\5H%\2\u0388\u0391\3\2\2\2\u0389\u038a\f\4\2\2\u038a\u038b\7\u0085\2\2"+
		"\u038b\u0390\5H%\2\u038c\u038d\f\3\2\2\u038d\u038e\7~\2\2\u038e\u0390"+
		"\5H%\2\u038f\u0389\3\2\2\2\u038f\u038c\3\2\2\2\u0390\u0393\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392M\3\2\2\2\u0393\u0391\3\2\2\2"+
		"\u0394\u0395\b(\1\2\u0395\u0396\5L\'\2\u0396\u03a2\3\2\2\2\u0397\u0398"+
		"\f\5\2\2\u0398\u0399\7^\2\2\u0399\u03a1\5L\'\2\u039a\u039b\f\4\2\2\u039b"+
		"\u039c\7_\2\2\u039c\u03a1\5L\'\2\u039d\u039e\f\3\2\2\u039e\u039f\7`\2"+
		"\2\u039f\u03a1\5L\'\2\u03a0\u0397\3\2\2\2\u03a0\u039a\3\2\2\2\u03a0\u039d"+
		"\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"O\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\b)\1\2\u03a6\u03a7\5N(\2\u03a7"+
		"\u03b0\3\2\2\2\u03a8\u03a9\f\4\2\2\u03a9\u03aa\7\\\2\2\u03aa\u03af\5N"+
		"(\2\u03ab\u03ac\f\3\2\2\u03ac\u03ad\7]\2\2\u03ad\u03af\5N(\2\u03ae\u03a8"+
		"\3\2\2\2\u03ae\u03ab\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1Q\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b4\b*\1\2\u03b4"+
		"\u03b5\5P)\2\u03b5\u03bc\3\2\2\2\u03b6\u03b7\f\3\2\2\u03b7\u03b8\5T+\2"+
		"\u03b8\u03b9\5P)\2\u03b9\u03bb\3\2\2\2\u03ba\u03b6\3\2\2\2\u03bb\u03be"+
		"\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bdS\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03bf\u03c0\t\4\2\2\u03c0U\3\2\2\2\u03c1\u03c2\b,\1\2\u03c2"+
		"\u03c3\5R*\2\u03c3\u03d2\3\2\2\2\u03c4\u03c5\f\6\2\2\u03c5\u03c6\7g\2"+
		"\2\u03c6\u03d1\5R*\2\u03c7\u03c8\f\5\2\2\u03c8\u03c9\7h\2\2\u03c9\u03d1"+
		"\5R*\2\u03ca\u03cb\f\4\2\2\u03cb\u03cc\7w\2\2\u03cc\u03d1\5R*\2\u03cd"+
		"\u03ce\f\3\2\2\u03ce\u03cf\7x\2\2\u03cf\u03d1\5R*\2\u03d0\u03c4\3\2\2"+
		"\2\u03d0\u03c7\3\2\2\2\u03d0\u03ca\3\2\2\2\u03d0\u03cd\3\2\2\2\u03d1\u03d4"+
		"\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3W\3\2\2\2\u03d4"+
		"\u03d2\3\2\2\2\u03d5\u03d6\b-\1\2\u03d6\u03d7\5V,\2\u03d7\u03e0\3\2\2"+
		"\2\u03d8\u03d9\f\4\2\2\u03d9\u03da\7u\2\2\u03da\u03df\5V,\2\u03db\u03dc"+
		"\f\3\2\2\u03dc\u03dd\7v\2\2\u03dd\u03df\5V,\2\u03de\u03d8\3\2\2\2\u03de"+
		"\u03db\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2"+
		"\2\2\u03e1Y\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3\u03e4\b.\1\2\u03e4\u03e5"+
		"\5X-\2\u03e5\u03eb\3\2\2\2\u03e6\u03e7\f\3\2\2\u03e7\u03e8\7b\2\2\u03e8"+
		"\u03ea\5X-\2\u03e9\u03e6\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2"+
		"\2\u03eb\u03ec\3\2\2\2\u03ec[\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03ef"+
		"\b/\1\2\u03ef\u03f0\5Z.\2\u03f0\u03f6\3\2\2\2\u03f1\u03f2\f\3\2\2\u03f2"+
		"\u03f3\7a\2\2\u03f3\u03f5\5Z.\2\u03f4\u03f1\3\2\2\2\u03f5\u03f8\3\2\2"+
		"\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7]\3\2\2\2\u03f8\u03f6"+
		"\3\2\2\2\u03f9\u03fa\b\60\1\2\u03fa\u03fb\5\\/\2\u03fb\u0401\3\2\2\2\u03fc"+
		"\u03fd\f\3\2\2\u03fd\u03fe\7c\2\2\u03fe\u0400\5\\/\2\u03ff\u03fc\3\2\2"+
		"\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402_"+
		"\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0405\b\61\1\2\u0405\u0406\5^\60\2"+
		"\u0406\u040f\3\2\2\2\u0407\u0408\f\4\2\2\u0408\u0409\7\5\2\2\u0409\u040e"+
		"\5^\60\2\u040a\u040b\f\3\2\2\u040b\u040c\7\6\2\2\u040c\u040e\5^\60\2\u040d"+
		"\u0407\3\2\2\2\u040d\u040a\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2"+
		"\2\2\u040f\u0410\3\2\2\2\u0410a\3\2\2\2\u0411\u040f\3\2\2\2\u0412\u0413"+
		"\b\62\1\2\u0413\u0414\5`\61\2\u0414\u041d\3\2\2\2\u0415\u0416\f\4\2\2"+
		"\u0416\u0417\7\7\2\2\u0417\u041c\5`\61\2\u0418\u0419\f\3\2\2\u0419\u041a"+
		"\7\b\2\2\u041a\u041c\5`\61\2\u041b\u0415\3\2\2\2\u041b\u0418\3\2\2\2\u041c"+
		"\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041ec\3\2\2\2"+
		"\u041f\u041d\3\2\2\2\u0420\u0428\5b\62\2\u0421\u0422\5b\62\2\u0422\u0423"+
		"\7\u0080\2\2\u0423\u0424\5l\67\2\u0424\u0425\7\u0081\2\2\u0425\u0426\5"+
		"f\64\2\u0426\u0428\3\2\2\2\u0427\u0420\3\2\2\2\u0427\u0421\3\2\2\2\u0428"+
		"e\3\2\2\2\u0429\u042d\5d\63\2\u042a\u042d\5h\65\2\u042b\u042d\5\u01b2"+
		"\u00da\2\u042c\u0429\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042b\3\2\2\2\u042d"+
		"g\3\2\2\2\u042e\u042f\5b\62\2\u042f\u0430\5j\66\2\u0430\u0431\5\u014c"+
		"\u00a7\2\u0431i\3\2\2\2\u0432\u0433\t\5\2\2\u0433k\3\2\2\2\u0434\u0435"+
		"\b\67\1\2\u0435\u0436\5f\64\2\u0436\u043c\3\2\2\2\u0437\u0438\f\3\2\2"+
		"\u0438\u0439\7}\2\2\u0439\u043b\5f\64\2\u043a\u0437\3\2\2\2\u043b\u043e"+
		"\3\2\2\2\u043c\u043a\3\2\2\2\u043c\u043d\3\2\2\2\u043dm\3\2\2\2\u043e"+
		"\u043c\3\2\2\2\u043f\u0440\5d\63\2\u0440o\3\2\2\2\u0441\u045c\5r:\2\u0442"+
		"\u0444\5\u0100\u0081\2\u0443\u0442\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u045c\5v<\2\u0446\u0448\5\u0100\u0081\2\u0447\u0446\3\2"+
		"\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u045c\5x=\2\u044a\u044c"+
		"\5\u0100\u0081\2\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3"+
		"\2\2\2\u044d\u045c\5|?\2\u044e\u0450\5\u0100\u0081\2\u044f\u044e\3\2\2"+
		"\2\u044f\u0450\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u045c\5\u0086D\2\u0452"+
		"\u0454\5\u0100\u0081\2\u0453\u0452\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455"+
		"\3\2\2\2\u0455\u045c\5\u0096L\2\u0456\u045c\5\u009eP\2\u0457\u0459\5\u0100"+
		"\u0081\2\u0458\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a"+
		"\u045c\5\u01a2\u00d2\2\u045b\u0441\3\2\2\2\u045b\u0443\3\2\2\2\u045b\u0447"+
		"\3\2\2\2\u045b\u044b\3\2\2\2\u045b\u044f\3\2\2\2\u045b\u0453\3\2\2\2\u045b"+
		"\u0456\3\2\2\2\u045b\u0458\3\2\2\2\u045cq\3\2\2\2\u045d\u045f\5\u0100"+
		"\u0081\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\3\2\2\2\u0460"+
		"\u0461\7\u0087\2\2\u0461\u0462\7\u0081\2\2\u0462\u0470\5p9\2\u0463\u0465"+
		"\5\u0100\u0081\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3"+
		"\2\2\2\u0466\u0467\5t;\2\u0467\u0468\5p9\2\u0468\u0470\3\2\2\2\u0469\u046b"+
		"\5\u0100\u0081\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3"+
		"\2\2\2\u046c\u046d\7\34\2\2\u046d\u046e\7\u0081\2\2\u046e\u0470\5p9\2"+
		"\u046f\u045e\3\2\2\2\u046f\u0464\3\2\2\2\u046f\u046a\3\2\2\2\u0470s\3"+
		"\2\2\2\u0471\u0472\7\21\2\2\u0472\u0473\5n8\2\u0473\u0474\7\u0081\2\2"+
		"\u0474u\3\2\2\2\u0475\u0477\5l\67\2\u0476\u0475\3\2\2\2\u0476\u0477\3"+
		"\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\7\u0083\2\2\u0479w\3\2\2\2\u047a"+
		"\u047c\7Z\2\2\u047b\u047d\5z>\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2"+
		"\2\u047d\u047e\3\2\2\2\u047e\u047f\7[\2\2\u047fy\3\2\2\2\u0480\u0481\b"+
		">\1\2\u0481\u0482\5p9\2\u0482\u0487\3\2\2\2\u0483\u0484\f\3\2\2\u0484"+
		"\u0486\5p9\2\u0485\u0483\3\2\2\2\u0486\u0489\3\2\2\2\u0487\u0485\3\2\2"+
		"\2\u0487\u0488\3\2\2\2\u0488{\3\2\2\2\u0489\u0487\3\2\2\2\u048a\u048f"+
		"\5~@\2\u048b\u048c\5\u0082B\2\u048c\u048d\5p9\2\u048d\u048f\3\2\2\2\u048e"+
		"\u048a\3\2\2\2\u048e\u048b\3\2\2\2\u048f}\3\2\2\2\u0490\u0491\5\u0080"+
		"A\2\u0491\u0492\5p9\2\u0492\u0499\3\2\2\2\u0493\u0494\5\u0080A\2\u0494"+
		"\u0495\5p9\2\u0495\u0496\7!\2\2\u0496\u0497\5p9\2\u0497\u0499\3\2\2\2"+
		"\u0498\u0490\3\2\2\2\u0498\u0493\3\2\2\2\u0499\177\3\2\2\2\u049a\u049b"+
		"\7,\2\2\u049b\u049c\7V\2\2\u049c\u049d\5\u0084C\2\u049d\u049e\7W\2\2\u049e"+
		"\u0081\3\2\2\2\u049f\u04a0\7D\2\2\u04a0\u04a1\7V\2\2\u04a1\u04a2\5\u0084"+
		"C\2\u04a2\u04a3\7W\2\2\u04a3\u0083\3\2\2\2\u04a4\u04b5\5l\67\2\u04a5\u04a7"+
		"\5\u0100\u0081\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\3"+
		"\2\2\2\u04a8\u04a9\5\u00b6\\\2\u04a9\u04aa\5\u011a\u008e\2\u04aa\u04ab"+
		"\7f\2\2\u04ab\u04ac\5\u014c\u00a7\2\u04ac\u04b5\3\2\2\2\u04ad\u04af\5"+
		"\u0100\u0081\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2"+
		"\2\2\u04b0\u04b1\5\u00b6\\\2\u04b1\u04b2\5\u011a\u008e\2\u04b2\u04b3\5"+
		"\u0150\u00a9\2\u04b3\u04b5\3\2\2\2\u04b4\u04a4\3\2\2\2\u04b4\u04a6\3\2"+
		"\2\2\u04b4\u04ae\3\2\2\2\u04b5\u0085\3\2\2\2\u04b6\u04b7\5\u008aF\2\u04b7"+
		"\u04b8\5p9\2\u04b8\u04c1\3\2\2\2\u04b9\u04c1\5\u0088E\2\u04ba\u04bb\5"+
		"\u008eH\2\u04bb\u04bc\5p9\2\u04bc\u04c1\3\2\2\2\u04bd\u04be\5\u008cG\2"+
		"\u04be\u04bf\5p9\2\u04bf\u04c1\3\2\2\2\u04c0\u04b6\3\2\2\2\u04c0\u04b9"+
		"\3\2\2\2\u04c0\u04ba\3\2\2\2\u04c0\u04bd\3\2\2\2\u04c1\u0087\3\2\2\2\u04c2"+
		"\u04c3\7\36\2\2\u04c3\u04c4\5p9\2\u04c4\u04c5\5\u008aF\2\u04c5\u04c6\7"+
		"\u0083\2\2\u04c6\u0089\3\2\2\2\u04c7\u04c8\7U\2\2\u04c8\u04c9\7V\2\2\u04c9"+
		"\u04ca\5\u0084C\2\u04ca\u04cb\7W\2\2\u04cb\u008b\3\2\2\2\u04cc\u04cd\7"+
		")\2\2\u04cd\u04ce\7V\2\2\u04ce\u04d0\5\u0090I\2\u04cf\u04d1\5\u0084C\2"+
		"\u04d0\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4"+
		"\7\u0083\2\2\u04d3\u04d5\5l\67\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2"+
		"\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\7W\2\2\u04d7\u008d\3\2\2\2\u04d8\u04d9"+
		"\7)\2\2\u04d9\u04da\7V\2\2\u04da\u04db\5\u0092J\2\u04db\u04dc\7\u0081"+
		"\2\2\u04dc\u04dd\5\u0094K\2\u04dd\u04de\7W\2\2\u04de\u008f\3\2\2\2\u04df"+
		"\u04e2\5v<\2\u04e0\u04e2\5\u00a8U\2\u04e1\u04df\3\2\2\2\u04e1\u04e0\3"+
		"\2\2\2\u04e2\u0091\3\2\2\2\u04e3\u04e5\5\u0100\u0081\2\u04e4\u04e3\3\2"+
		"\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\5\u00b6\\\2\u04e7"+
		"\u04e8\5\u011a\u008e\2\u04e8\u0093\3\2\2\2\u04e9\u04ec\5l\67\2\u04ea\u04ec"+
		"\5\u0150\u00a9\2\u04eb\u04e9\3\2\2\2\u04eb\u04ea\3\2\2\2\u04ec\u0095\3"+
		"\2\2\2\u04ed\u04f4\5\u0098M\2\u04ee\u04f4\5\u009aN\2\u04ef\u04f4\5\u009c"+
		"O\2\u04f0\u04f1\7+\2\2\u04f1\u04f2\7\u0087\2\2\u04f2\u04f4\7\u0083\2\2"+
		"\u04f3\u04ed\3\2\2\2\u04f3\u04ee\3\2\2\2\u04f3\u04ef\3\2\2\2\u04f3\u04f0"+
		"\3\2\2\2\u04f4\u0097\3\2\2\2\u04f5\u04f6\7\20\2\2\u04f6\u04f7\7\u0083"+
		"\2\2\u04f7\u0099\3\2\2\2\u04f8\u04f9\7\32\2\2\u04f9\u04fa\7\u0083\2\2"+
		"\u04fa\u009b\3\2\2\2\u04fb\u04fd\7<\2\2\u04fc\u04fe\5l\67\2\u04fd\u04fc"+
		"\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0505\7\u0083\2"+
		"\2\u0500\u0501\7<\2\2\u0501\u0502\5\u0150\u00a9\2\u0502\u0503\7\u0083"+
		"\2\2\u0503\u0505\3\2\2\2\u0504\u04fb\3\2\2\2\u0504\u0500\3\2\2\2\u0505"+
		"\u009d\3\2\2\2\u0506\u0507\5\u00a4S\2\u0507\u009f\3\2\2\2\u0508\u0509"+
		"\bQ\1\2\u0509\u050a\5\u00a2R\2\u050a\u050f\3\2\2\2\u050b\u050c\f\3\2\2"+
		"\u050c\u050e\5\u00a2R\2\u050d\u050b\3\2\2\2\u050e\u0511\3\2\2\2\u050f"+
		"\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u00a1\3\2\2\2\u0511\u050f\3\2"+
		"\2\2\u0512\u051c\5\u00a4S\2\u0513\u051c\5\u0142\u00a2\2\u0514\u051c\5"+
		"\u018a\u00c6\2\u0515\u051c\5\u019e\u00d0\2\u0516\u051c\5\u01a0\u00d1\2"+
		"\u0517\u051c\5\u00fe\u0080\2\u0518\u051c\5\u00e4s\2\u0519\u051c\5\u00b0"+
		"Y\2\u051a\u051c\5\u00b2Z\2\u051b\u0512\3\2\2\2\u051b\u0513\3\2\2\2\u051b"+
		"\u0514\3\2\2\2\u051b\u0515\3\2\2\2\u051b\u0516\3\2\2\2\u051b\u0517\3\2"+
		"\2\2\u051b\u0518\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051a\3\2\2\2\u051c"+
		"\u00a3\3\2\2\2\u051d\u0526\5\u00a8U\2\u051e\u0526\5\u00fc\177\2\u051f"+
		"\u0526\5\u00f4{\2\u0520\u0526\5\u00f8}\2\u0521\u0526\5\u00fa~\2\u0522"+
		"\u0526\5\u00aeX\2\u0523\u0526\5\u00a6T\2\u0524\u0526\5\u00d4k\2\u0525"+
		"\u051d\3\2\2\2\u0525\u051e\3\2\2\2\u0525\u051f\3\2\2\2\u0525\u0520\3\2"+
		"\2\2\u0525\u0521\3\2\2\2\u0525\u0522\3\2\2\2\u0525\u0523\3\2\2\2\u0525"+
		"\u0524\3\2\2\2\u0526\u00a5\3\2\2\2\u0527\u0528\7P\2\2\u0528\u052a\7\u0087"+
		"\2\2\u0529\u052b\5\u0100\u0081\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2"+
		"\2\u052b\u052c\3\2\2\2\u052c\u052d\7f\2\2\u052d\u052e\5\u0130\u0099\2"+
		"\u052e\u052f\7\u0083\2\2\u052f\u00a7\3\2\2\2\u0530\u0541\5\u00aaV\2\u0531"+
		"\u0541\5\u00acW\2\u0532\u0534\5\u00b6\\\2\u0533\u0532\3\2\2\2\u0533\u0534"+
		"\3\2\2\2\u0534\u0536\3\2\2\2\u0535\u0537\5\u0116\u008c\2\u0536\u0535\3"+
		"\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0541\7\u0083\2\2"+
		"\u0539\u053b\5\u0100\u0081\2\u053a\u053c\5\u00b6\\\2\u053b\u053a\3\2\2"+
		"\2\u053b\u053c\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\5\u0116\u008c\2"+
		"\u053e\u053f\7\u0083\2\2\u053f\u0541\3\2\2\2\u0540\u0530\3\2\2\2\u0540"+
		"\u0531\3\2\2\2\u0540\u0533\3\2\2\2\u0540\u0539\3\2\2\2\u0541\u00a9\3\2"+
		"\2\2\u0542\u0543\5\u00b6\\\2\u0543\u0544\5\u011c\u008f\2\u0544\u00ab\3"+
		"\2\2\2\u0545\u0546\5\u00b6\\\2\u0546\u0547\5\u0116\u008c\2\u0547\u0548"+
		"\7\u0083\2\2\u0548\u00ad\3\2\2\2\u0549\u054a\7A\2\2\u054a\u054b\7V\2\2"+
		"\u054b\u054c\5n8\2\u054c\u054d\7}\2\2\u054d\u054e\7\u0090\2\2\u054e\u054f"+
		"\7W\2\2\u054f\u0550\7\u0083\2\2\u0550\u00af\3\2\2\2\u0551\u0552\7\u0083"+
		"\2\2\u0552\u00b1\3\2\2\2\u0553\u0554\5\u0100\u0081\2\u0554\u0555\7\u0083"+
		"\2\2\u0555\u00b3\3\2\2\2\u0556\u055d\5\u00b8]\2\u0557\u055d\5\u00be`\2"+
		"\u0558\u055d\5\u00ba^\2\u0559\u055d\7*\2\2\u055a\u055d\7K\2\2\u055b\u055d"+
		"\7\30\2\2\u055c\u0556\3\2\2\2\u055c\u0557\3\2\2\2\u055c\u0558\3\2\2\2"+
		"\u055c\u0559\3\2\2\2\u055c\u055a\3\2\2\2\u055c\u055b\3\2\2\2\u055d\u00b5"+
		"\3\2\2\2\u055e\u0560\5\u00b4[\2\u055f\u0561\5\u0100\u0081\2\u0560\u055f"+
		"\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0566\3\2\2\2\u0562\u0563\5\u00b4["+
		"\2\u0563\u0564\5\u00b6\\\2\u0564\u0566\3\2\2\2\u0565\u055e\3\2\2\2\u0565"+
		"\u0562\3\2\2\2\u0566\u00b7\3\2\2\2\u0567\u0568\t\6\2\2\u0568\u00b9\3\2"+
		"\2\2\u0569\u056a\t\7\2\2\u056a\u00bb\3\2\2\2\u056b\u056c\7\u0087\2\2\u056c"+
		"\u00bd\3\2\2\2\u056d\u0571\5\u00c0a\2\u056e\u0571\5\u0154\u00ab\2\u056f"+
		"\u0571\5\u00d0i\2\u0570\u056d\3\2\2\2\u0570\u056e\3\2\2\2\u0570\u056f"+
		"\3\2\2\2\u0571\u00bf\3\2\2\2\u0572\u0577\5\u00c6d\2\u0573\u0577\5\u00cc"+
		"g\2\u0574\u0577\5\u019c\u00cf\2\u0575\u0577\5\u012a\u0096\2\u0576\u0572"+
		"\3\2\2\2\u0576\u0573\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0575\3\2\2\2\u0577"+
		"\u00c1\3\2\2\2\u0578\u057a\5\u00be`\2\u0579\u057b\5\u0100\u0081\2\u057a"+
		"\u0579\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u0580\3\2\2\2\u057c\u057d\5\u00be"+
		"`\2\u057d\u057e\5\u00c2b\2\u057e\u0580\3\2\2\2\u057f\u0578\3\2\2\2\u057f"+
		"\u057c\3\2\2\2\u0580\u00c3\3\2\2\2\u0581\u0583\5\u00c0a\2\u0582\u0584"+
		"\5\u0100\u0081\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0589\3"+
		"\2\2\2\u0585\u0586\5\u00c0a\2\u0586\u0587\5\u00c4c\2\u0587\u0589\3\2\2"+
		"\2\u0588\u0581\3\2\2\2\u0588\u0585\3\2\2\2\u0589\u00c5\3\2\2\2\u058a\u058c"+
		"\5\16\b\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\3\2\2\2"+
		"\u058d\u05a2\5\u00c8e\2\u058e\u058f\5\16\b\2\u058f\u0590\7E\2\2\u0590"+
		"\u0591\5\u0192\u00ca\2\u0591\u05a2\3\2\2\2\u0592\u05a2\7\23\2\2\u0593"+
		"\u05a2\7\24\2\2\u0594\u05a2\7\25\2\2\u0595\u05a2\7T\2\2\u0596\u05a2\7"+
		"\17\2\2\u0597\u05a2\7=\2\2\u0598\u05a2\7.\2\2\u0599\u05a2\7/\2\2\u059a"+
		"\u05a2\7>\2\2\u059b\u05a2\7O\2\2\u059c\u05a2\7(\2\2\u059d\u05a2\7\37\2"+
		"\2\u059e\u05a2\7R\2\2\u059f\u05a2\7\16\2\2\u05a0\u05a2\5\u00caf\2\u05a1"+
		"\u058b\3\2\2\2\u05a1\u058e\3\2\2\2\u05a1\u0592\3\2\2\2\u05a1\u0593\3\2"+
		"\2\2\u05a1\u0594\3\2\2\2\u05a1\u0595\3\2\2\2\u05a1\u0596\3\2\2\2\u05a1"+
		"\u0597\3\2\2\2\u05a1\u0598\3\2\2\2\u05a1\u0599\3\2\2\2\u05a1\u059a\3\2"+
		"\2\2\u05a1\u059b\3\2\2\2\u05a1\u059c\3\2\2\2\u05a1\u059d\3\2\2\2\u05a1"+
		"\u059e\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a0\3\2\2\2\u05a2\u00c7\3\2"+
		"\2\2\u05a3\u05a8\5\u0152\u00aa\2\u05a4\u05a8\5\u00ceh\2\u05a5\u05a8\5"+
		"\u00bc_\2\u05a6\u05a8\5\u0192\u00ca\2\u05a7\u05a3\3\2\2\2\u05a7\u05a4"+
		"\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a7\u05a6\3\2\2\2\u05a8\u00c9\3\2\2\2\u05a9"+
		"\u05aa\7\33\2\2\u05aa\u05ab\7V\2\2\u05ab\u05ac\5l\67\2\u05ac\u05ad\7W"+
		"\2\2\u05ad\u05b3\3\2\2\2\u05ae\u05af\7\33\2\2\u05af\u05b0\7V\2\2\u05b0"+
		"\u05b1\7\16\2\2\u05b1\u05b3\7W\2\2\u05b2\u05a9\3\2\2\2\u05b2\u05ae\3\2"+
		"\2\2\u05b3\u00cb\3\2\2\2\u05b4\u05b6\5\u015c\u00af\2\u05b5\u05b7\5\u0100"+
		"\u0081\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8"+
		"\u05ba\5\16\b\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\3"+
		"\2\2\2\u05bb\u05bc\7\u0087\2\2\u05bc\u05cd\3\2\2\2\u05bd\u05be\5\u015c"+
		"\u00af\2\u05be\u05bf\5\u0192\u00ca\2\u05bf\u05cd\3\2\2\2\u05c0\u05c1\5"+
		"\u015c\u00af\2\u05c1\u05c3\5\16\b\2\u05c2\u05c4\7E\2\2\u05c3\u05c2\3\2"+
		"\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\5\u0192\u00ca"+
		"\2\u05c6\u05cd\3\2\2\2\u05c7\u05c9\7\"\2\2\u05c8\u05ca\5\16\b\2\u05c9"+
		"\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cd\7\u0087"+
		"\2\2\u05cc\u05b4\3\2\2\2\u05cc\u05bd\3\2\2\2\u05cc\u05c0\3\2\2\2\u05cc"+
		"\u05c7\3\2\2\2\u05cd\u00cd\3\2\2\2\u05ce\u05cf\7\u0087\2\2\u05cf\u00cf"+
		"\3\2\2\2\u05d0\u05d1\5\u00d2j\2\u05d1\u05d3\7Z\2\2\u05d2\u05d4\5\u00da"+
		"n\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5"+
		"\u05d6\7[\2\2\u05d6\u05de\3\2\2\2\u05d7\u05d8\5\u00d2j\2\u05d8\u05d9\7"+
		"Z\2\2\u05d9\u05da\5\u00dan\2\u05da\u05db\7}\2\2\u05db\u05dc\7[\2\2\u05dc"+
		"\u05de\3\2\2\2\u05dd\u05d0\3\2\2\2\u05dd\u05d7\3\2\2\2\u05de\u00d1\3\2"+
		"\2\2\u05df\u05e1\5\u00d6l\2\u05e0\u05e2\5\u0100\u0081\2\u05e1\u05e0\3"+
		"\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e4\3\2\2\2\u05e3\u05e5\7\u0087\2\2"+
		"\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05e8"+
		"\5\u00d8m\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05f3\3\2\2"+
		"\2\u05e9\u05eb\5\u00d6l\2\u05ea\u05ec\5\u0100\u0081\2\u05eb\u05ea\3\2"+
		"\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\5\16\b\2\u05ee"+
		"\u05f0\7\u0087\2\2\u05ef\u05f1\5\u00d8m\2\u05f0\u05ef\3\2\2\2\u05f0\u05f1"+
		"\3\2\2\2\u05f1\u05f3\3\2\2\2\u05f2\u05df\3\2\2\2\u05f2\u05e9\3\2\2\2\u05f3"+
		"\u00d3\3\2\2\2\u05f4\u05f6\5\u00d6l\2\u05f5\u05f7\5\u0100\u0081\2\u05f6"+
		"\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\7\u0087"+
		"\2\2\u05f9\u05fb\5\u00d8m\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u05fc\3\2\2\2\u05fc\u05fd\7\u0083\2\2\u05fd\u00d5\3\2\2\2\u05fe\u0604"+
		"\7\"\2\2\u05ff\u0600\7\"\2\2\u0600\u0604\7\26\2\2\u0601\u0602\7\"\2\2"+
		"\u0602\u0604\7C\2\2\u0603\u05fe\3\2\2\2\u0603\u05ff\3\2\2\2\u0603\u0601"+
		"\3\2\2\2\u0604\u00d7\3\2\2\2\u0605\u0606\7\u0081\2\2\u0606\u0607\5\u00c2"+
		"b\2\u0607\u00d9\3\2\2\2\u0608\u0609\bn\1\2\u0609\u060a\5\u00dco\2\u060a"+
		"\u0610\3\2\2\2\u060b\u060c\f\3\2\2\u060c\u060d\7}\2\2\u060d\u060f\5\u00dc"+
		"o\2\u060e\u060b\3\2\2\2\u060f\u0612\3\2\2\2\u0610\u060e\3\2\2\2\u0610"+
		"\u0611\3\2\2\2\u0611\u00db\3\2\2\2\u0612\u0610\3\2\2\2\u0613\u0619\5\u00de"+
		"p\2\u0614\u0615\5\u00dep\2\u0615\u0616\7f\2\2\u0616\u0617\5n8\2\u0617"+
		"\u0619\3\2\2\2\u0618\u0613\3\2\2\2\u0618\u0614\3\2\2\2\u0619\u00dd\3\2"+
		"\2\2\u061a\u061b\7\u0087\2\2\u061b\u00df\3\2\2\2\u061c\u061f\5\u00e2r"+
		"\2\u061d\u061f\5\u00f2z\2\u061e\u061c\3\2\2\2\u061e\u061d\3\2\2\2\u061f"+
		"\u00e1\3\2\2\2\u0620\u0621\7\u0087\2\2\u0621\u00e3\3\2\2\2\u0622\u0623"+
		"\5\u00e6t\2\u0623\u0624\7Z\2\2\u0624\u0625\5\u00f0y\2\u0625\u0626\7[\2"+
		"\2\u0626\u00e5\3\2\2\2\u0627\u062a\5\u00e8u\2\u0628\u062a\5\u00eex\2\u0629"+
		"\u0627\3\2\2\2\u0629\u0628\3\2\2\2\u062a\u00e7\3\2\2\2\u062b\u062e\5\u00ea"+
		"v\2\u062c\u062e\5\u00ecw\2\u062d\u062b\3\2\2\2\u062d\u062c\3\2\2\2\u062e"+
		"\u00e9\3\2\2\2\u062f\u0631\7-\2\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2"+
		"\2\2\u0631\u0632\3\2\2\2\u0632\u0633\7\61\2\2\u0633\u0634\7\u0087\2\2"+
		"\u0634\u00eb\3\2\2\2\u0635\u0637\7-\2\2\u0636\u0635\3\2\2\2\u0636\u0637"+
		"\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0639\7\61\2\2\u0639\u063a\5\u00e2"+
		"r\2\u063a\u00ed\3\2\2\2\u063b\u063d\7-\2\2\u063c\u063b\3\2\2\2\u063c\u063d"+
		"\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u063f\7\61\2\2\u063f\u00ef\3\2\2\2"+
		"\u0640\u0642\5\u00a0Q\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642"+
		"\u00f1\3\2\2\2\u0643\u0644\7\u0087\2\2\u0644\u00f3\3\2\2\2\u0645\u0646"+
		"\7\61\2\2\u0646\u0647\7\u0087\2\2\u0647\u0648\7f\2\2\u0648\u0649\5\u00f6"+
		"|\2\u0649\u064a\7\u0083\2\2\u064a\u00f5\3\2\2\2\u064b\u064d\5\16\b\2\u064c"+
		"\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\5\u00e0"+
		"q\2\u064f\u00f7\3\2\2\2\u0650\u0652\7P\2\2\u0651\u0653\7M\2\2\u0652\u0651"+
		"\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\5\16\b\2"+
		"\u0655\u0656\5\n\6\2\u0656\u0657\7\u0083\2\2\u0657\u065e\3\2\2\2\u0658"+
		"\u0659\7P\2\2\u0659\u065a\7\u0082\2\2\u065a\u065b\5\n\6\2\u065b\u065c"+
		"\7\u0083\2\2\u065c\u065e\3\2\2\2\u065d\u0650\3\2\2\2\u065d\u0658\3\2\2"+
		"\2\u065e\u00f9\3\2\2\2\u065f\u0661\5\u0100\u0081\2\u0660\u065f\3\2\2\2"+
		"\u0660\u0661\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0663\7P\2\2\u0663\u0665"+
		"\7\61\2\2\u0664\u0666\5\16\b\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2\2"+
		"\u0666\u0667\3\2\2\2\u0667\u0668\5\u00e0q\2\u0668\u0669\7\u0083\2\2\u0669"+
		"\u00fb\3\2\2\2\u066a\u066b\7\r\2\2\u066b\u066c\7V\2\2\u066c\u066d\7\u0090"+
		"\2\2\u066d\u066e\7W\2\2\u066e\u066f\7\u0083\2\2\u066f\u00fd\3\2\2\2\u0670"+
		"\u0671\7%\2\2\u0671\u0672\7\u0090\2\2\u0672\u0674\7Z\2\2\u0673\u0675\5"+
		"\u00a0Q\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\3\2\2\2"+
		"\u0676\u067b\7[\2\2\u0677\u0678\7%\2\2\u0678\u0679\7\u0090\2\2\u0679\u067b"+
		"\5\u00a2R\2\u067a\u0670\3\2\2\2\u067a\u0677\3\2\2\2\u067b\u00ff\3\2\2"+
		"\2\u067c\u067d\b\u0081\1\2\u067d\u067e\5\u0102\u0082\2\u067e\u0683\3\2"+
		"\2\2\u067f\u0680\f\3\2\2\u0680\u0682\5\u0102\u0082\2\u0681\u067f\3\2\2"+
		"\2\u0682\u0685\3\2\2\2\u0683\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0101"+
		"\3\2\2\2\u0685\u0683\3\2\2\2\u0686\u0687\7X\2\2\u0687\u0688\7X\2\2\u0688"+
		"\u0689\5\u0106\u0084\2\u0689\u068a\7Y\2\2\u068a\u068b\7Y\2\2\u068b\u068e"+
		"\3\2\2\2\u068c\u068e\5\u0104\u0083\2\u068d\u0686\3\2\2\2\u068d\u068c\3"+
		"\2\2\2\u068e\u0103\3\2\2\2\u068f\u0690\7\13\2\2\u0690\u0691\7V\2\2\u0691"+
		"\u0693\5\u0130\u0099\2\u0692\u0694\7\u0086\2\2\u0693\u0692\3\2\2\2\u0693"+
		"\u0694\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0696\7W\2\2\u0696\u06a0\3\2"+
		"\2\2\u0697\u0698\7\13\2\2\u0698\u0699\7V\2\2\u0699\u069b\5n8\2\u069a\u069c"+
		"\7\u0086\2\2\u069b\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2"+
		"\2\u069d\u069e\7W\2\2\u069e\u06a0\3\2\2\2\u069f\u068f\3\2\2\2\u069f\u0697"+
		"\3\2\2\2\u06a0\u0105\3\2\2\2\u06a1\u06a3\b\u0084\1\2\u06a2\u06a4\5\u0108"+
		"\u0085\2\u06a3\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a9\3\2\2\2\u06a5"+
		"\u06a6\5\u0108\u0085\2\u06a6\u06a7\7\u0086\2\2\u06a7\u06a9\3\2\2\2\u06a8"+
		"\u06a1\3\2\2\2\u06a8\u06a5\3\2\2\2\u06a9\u06b6\3\2\2\2\u06aa\u06ab\f\5"+
		"\2\2\u06ab\u06ad\7}\2\2\u06ac\u06ae\5\u0108\u0085\2\u06ad\u06ac\3\2\2"+
		"\2\u06ad\u06ae\3\2\2\2\u06ae\u06b5\3\2\2\2\u06af\u06b0\f\3\2\2\u06b0\u06b1"+
		"\7}\2\2\u06b1\u06b2\5\u0108\u0085\2\u06b2\u06b3\7\u0086\2\2\u06b3\u06b5"+
		"\3\2\2\2\u06b4\u06aa\3\2\2\2\u06b4\u06af\3\2\2\2\u06b5\u06b8\3\2\2\2\u06b6"+
		"\u06b4\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u0107\3\2\2\2\u06b8\u06b6\3\2"+
		"\2\2\u06b9\u06bb\5\u010a\u0086\2\u06ba\u06bc\5\u0110\u0089\2\u06bb\u06ba"+
		"\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u0109\3\2\2\2\u06bd\u06c0\7\u0087\2"+
		"\2\u06be\u06c0\5\u010c\u0087\2\u06bf\u06bd\3\2\2\2\u06bf\u06be\3\2\2\2"+
		"\u06c0\u010b\3\2\2\2\u06c1\u06c2\5\u010e\u0088\2\u06c2\u06c3\7\u0082\2"+
		"\2\u06c3\u06c4\7\u0087\2\2\u06c4\u010d\3\2\2\2\u06c5\u06c6\7\u0087\2\2"+
		"\u06c6\u010f\3\2\2\2\u06c7\u06c8\7V\2\2\u06c8\u06c9\5\u0112\u008a\2\u06c9"+
		"\u06ca\7W\2\2\u06ca\u0111\3\2\2\2\u06cb\u06cd\b\u008a\1\2\u06cc\u06ce"+
		"\5\u0114\u008b\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d3\3"+
		"\2\2\2\u06cf\u06d0\f\3\2\2\u06d0\u06d2\5\u0114\u008b\2\u06d1\u06cf\3\2"+
		"\2\2\u06d2\u06d5\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4"+
		"\u0113\3\2\2\2\u06d5\u06d3\3\2\2\2\u06d6\u06d7\7V\2\2\u06d7\u06d8\5\u0112"+
		"\u008a\2\u06d8\u06d9\7W\2\2\u06d9\u06e8\3\2\2\2\u06da\u06db\7X\2\2\u06db"+
		"\u06dc\5\u0112\u008a\2\u06dc\u06dd\7Y\2\2\u06dd\u06e8\3\2\2\2\u06de\u06df"+
		"\7Z\2\2\u06df\u06e0\5\u0112\u008a\2\u06e0\u06e1\7[\2\2\u06e1\u06e8\3\2"+
		"\2\2\u06e2\u06e4\n\b\2\2\u06e3\u06e2\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5"+
		"\u06e3\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e8\3\2\2\2\u06e7\u06d6\3\2"+
		"\2\2\u06e7\u06da\3\2\2\2\u06e7\u06de\3\2\2\2\u06e7\u06e3\3\2\2\2\u06e8"+
		"\u0115\3\2\2\2\u06e9\u06ea\b\u008c\1\2\u06ea\u06eb\5\u0118\u008d\2\u06eb"+
		"\u06f1\3\2\2\2\u06ec\u06ed\f\3\2\2\u06ed\u06ee\7}\2\2\u06ee\u06f0\5\u0118"+
		"\u008d\2\u06ef\u06ec\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1"+
		"\u06f2\3\2\2\2\u06f2\u0117\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f4\u06f6\5\u011a"+
		"\u008e\2\u06f5\u06f7\5\u0148\u00a5\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3"+
		"\2\2\2\u06f7\u0119\3\2\2\2\u06f8\u06fe\5\u011c\u008f\2\u06f9\u06fa\5\u011e"+
		"\u0090\2\u06fa\u06fb\5\u0122\u0092\2\u06fb\u06fc\5\u0124\u0093\2\u06fc"+
		"\u06fe\3\2\2\2\u06fd\u06f8\3\2\2\2\u06fd\u06f9\3\2\2\2\u06fe\u011b\3\2"+
		"\2\2\u06ff\u0704\5\u011e\u0090\2\u0700\u0701\5\u0126\u0094\2\u0701\u0702"+
		"\5\u011c\u008f\2\u0702\u0704\3\2\2\2\u0703\u06ff\3\2\2\2\u0703\u0700\3"+
		"\2\2\2\u0704\u011d\3\2\2\2\u0705\u0706\b\u0090\1\2\u0706\u0708\5\u012e"+
		"\u0098\2\u0707\u0709\5\u0100\u0081\2\u0708\u0707\3\2\2\2\u0708\u0709\3"+
		"\2\2\2\u0709\u0713\3\2\2\2\u070a\u070c\5\u0120\u0091\2\u070b\u070d\5\u0100"+
		"\u0081\2\u070c\u070b\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u0713\3\2\2\2\u070e"+
		"\u070f\7V\2\2\u070f\u0710\5\u011c\u008f\2\u0710\u0711\7W\2\2\u0711\u0713"+
		"\3\2\2\2\u0712\u0705\3\2\2\2\u0712\u070a\3\2\2\2\u0712\u070e\3\2\2\2\u0713"+
		"\u0718\3\2\2\2\u0714\u0715\f\5\2\2\u0715\u0717\5\u0122\u0092\2\u0716\u0714"+
		"\3\2\2\2\u0717\u071a\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0719\3\2\2\2\u0719"+
		"\u011f\3\2\2\2\u071a\u0718\3\2\2\2\u071b\u0723\5\u012e\u0098\2\u071c\u071e"+
		"\7X\2\2\u071d\u071f\5n8\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2\u071f"+
		"\u0720\3\2\2\2\u0720\u0722\7Y\2\2\u0721\u071c\3\2\2\2\u0722\u0725\3\2"+
		"\2\2\u0723\u0721\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0121\3\2\2\2\u0725"+
		"\u0723\3\2\2\2\u0726\u0727\7V\2\2\u0727\u0728\5\u013c\u009f\2\u0728\u072a"+
		"\7W\2\2\u0729\u072b\5\u0128\u0095\2\u072a\u0729\3\2\2\2\u072a\u072b\3"+
		"\2\2\2\u072b\u072d\3\2\2\2\u072c\u072e\5\u012c\u0097\2\u072d\u072c\3\2"+
		"\2\2\u072d\u072e\3\2\2\2\u072e\u0730\3\2\2\2\u072f\u0731\5\u01b4\u00db"+
		"\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0733\3\2\2\2\u0732\u0734"+
		"\5\u0100\u0081\2\u0733\u0732\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0123\3"+
		"\2\2\2\u0735\u0736\7\177\2\2\u0736\u0738\5\u00c4c\2\u0737\u0739\5\u0132"+
		"\u009a\2\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u0125\3\2\2\2\u073a"+
		"\u073c\7^\2\2\u073b\u073d\5\u0100\u0081\2\u073c\u073b\3\2\2\2\u073c\u073d"+
		"\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u0740\5\u0128\u0095\2\u073f\u073e\3"+
		"\2\2\2\u073f\u0740\3\2\2\2\u0740\u0752\3\2\2\2\u0741\u0743\7b\2\2\u0742"+
		"\u0744\5\u0100\u0081\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0752"+
		"\3\2\2\2\u0745\u0747\7\5\2\2\u0746\u0748\5\u0100\u0081\2\u0747\u0746\3"+
		"\2\2\2\u0747\u0748\3\2\2\2\u0748\u0752\3\2\2\2\u0749\u074a\5\16\b\2\u074a"+
		"\u074c\7^\2\2\u074b\u074d\5\u0100\u0081\2\u074c\u074b\3\2\2\2\u074c\u074d"+
		"\3\2\2\2\u074d\u074f\3\2\2\2\u074e\u0750\5\u0128\u0095\2\u074f\u074e\3"+
		"\2\2\2\u074f\u0750\3\2\2\2\u0750\u0752\3\2\2\2\u0751\u073a\3\2\2\2\u0751"+
		"\u0741\3\2\2\2\u0751\u0745\3\2\2\2\u0751\u0749\3\2\2\2\u0752\u0127\3\2"+
		"\2\2\u0753\u0755\5\u012a\u0096\2\u0754\u0756\5\u0128\u0095\2\u0755\u0754"+
		"\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0129\3\2\2\2\u0757\u0758\t\t\2\2\u0758"+
		"\u012b\3\2\2\2\u0759\u075a\t\n\2\2\u075a\u012d\3\2\2\2\u075b\u075d\7\u0086"+
		"\2\2\u075c\u075b\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075e\3\2\2\2\u075e"+
		"\u075f\5\b\5\2\u075f\u012f\3\2\2\2\u0760\u0762\5\u00c2b\2\u0761\u0763"+
		"\5\u0132\u009a\2\u0762\u0761\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0131\3"+
		"\2\2\2\u0764\u076d\5\u0134\u009b\2\u0765\u0767\5\u0136\u009c\2\u0766\u0765"+
		"\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u0769\5\u0122\u0092"+
		"\2\u0769\u076a\5\u0124\u0093\2\u076a\u076d\3\2\2\2\u076b\u076d\5\u0138"+
		"\u009d\2\u076c\u0764\3\2\2\2\u076c\u0766\3\2\2\2\u076c\u076b\3\2\2\2\u076d"+
		"\u0133\3\2\2\2\u076e\u0774\5\u0136\u009c\2\u076f\u0771\5\u0126\u0094\2"+
		"\u0770\u0772\5\u0134\u009b\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2\2\2\u0772"+
		"\u0774\3\2\2\2\u0773\u076e\3\2\2\2\u0773\u076f\3\2\2\2\u0774\u0135\3\2"+
		"\2\2\u0775\u0776\b\u009c\1\2\u0776\u0784\5\u0122\u0092\2\u0777\u0779\7"+
		"X\2\2\u0778\u077a\5n8\2\u0779\u0778\3\2\2\2\u0779\u077a\3\2\2\2\u077a"+
		"\u077b\3\2\2\2\u077b\u077d\7Y\2\2\u077c\u077e\5\u0100\u0081\2\u077d\u077c"+
		"\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u0784\3\2\2\2\u077f\u0780\7V\2\2\u0780"+
		"\u0781\5\u0134\u009b\2\u0781\u0782\7W\2\2\u0782\u0784\3\2\2\2\u0783\u0775"+
		"\3\2\2\2\u0783\u0777\3\2\2\2\u0783\u077f\3\2\2\2\u0784\u0792\3\2\2\2\u0785"+
		"\u0786\f\7\2\2\u0786\u0791\5\u0122\u0092\2\u0787\u0788\f\5\2\2\u0788\u078a"+
		"\7X\2\2\u0789\u078b\5n8\2\u078a\u0789\3\2\2\2\u078a\u078b\3\2\2\2\u078b"+
		"\u078c\3\2\2\2\u078c\u078e\7Y\2\2\u078d\u078f\5\u0100\u0081\2\u078e\u078d"+
		"\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0791\3\2\2\2\u0790\u0785\3\2\2\2\u0790"+
		"\u0787\3\2\2\2\u0791\u0794\3\2\2\2\u0792\u0790\3\2\2\2\u0792\u0793\3\2"+
		"\2\2\u0793\u0137\3\2\2\2\u0794\u0792\3\2\2\2\u0795\u079a\5\u013a\u009e"+
		"\2\u0796\u0797\5\u0126\u0094\2\u0797\u0798\5\u0138\u009d\2\u0798\u079a"+
		"\3\2\2\2\u0799\u0795\3\2\2\2\u0799\u0796\3\2\2\2\u079a\u0139\3\2\2\2\u079b"+
		"\u079c\b\u009e\1\2\u079c\u079d\7\u0086\2\2\u079d\u07ab\3\2\2\2\u079e\u079f"+
		"\f\5\2\2\u079f\u07aa\5\u0122\u0092\2\u07a0\u07a1\f\4\2\2\u07a1\u07a3\7"+
		"X\2\2\u07a2\u07a4\5n8\2\u07a3\u07a2\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4"+
		"\u07a5\3\2\2\2\u07a5\u07a7\7Y\2\2\u07a6\u07a8\5\u0100\u0081\2\u07a7\u07a6"+
		"\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07aa\3\2\2\2\u07a9\u079e\3\2\2\2\u07a9"+
		"\u07a0\3\2\2\2\u07aa\u07ad\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ab\u07ac\3\2"+
		"\2\2\u07ac\u013b\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ae\u07b0\5\u013e\u00a0"+
		"\2\u07af\u07ae\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b2\3\2\2\2\u07b1\u07b3"+
		"\7\u0086\2\2\u07b2\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b9\3\2\2"+
		"\2\u07b4\u07b5\5\u013e\u00a0\2\u07b5\u07b6\7}\2\2\u07b6\u07b7\7\u0086"+
		"\2\2\u07b7\u07b9\3\2\2\2\u07b8\u07af\3\2\2\2\u07b8\u07b4\3\2\2\2\u07b9"+
		"\u013d\3\2\2\2\u07ba\u07bb\b\u00a0\1\2\u07bb\u07bc\5\u0140\u00a1\2\u07bc"+
		"\u07c2\3\2\2\2\u07bd\u07be\f\3\2\2\u07be\u07bf\7}\2\2\u07bf\u07c1\5\u0140"+
		"\u00a1\2\u07c0\u07bd\3\2\2\2\u07c1\u07c4\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c2"+
		"\u07c3\3\2\2\2\u07c3\u013f\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c5\u07c7\5\u0100"+
		"\u0081\2\u07c6\u07c5\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8"+
		"\u07c9\5\u00b6\\\2\u07c9\u07ca\5\u011a\u008e\2\u07ca\u07e5\3\2\2\2\u07cb"+
		"\u07cd\5\u0100\u0081\2\u07cc\u07cb\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07ce"+
		"\3\2\2\2\u07ce\u07cf\5\u00b6\\\2\u07cf\u07d0\5\u011a\u008e\2\u07d0\u07d1"+
		"\7f\2\2\u07d1\u07d2\5\u014c\u00a7\2\u07d2\u07e5\3\2\2\2\u07d3\u07d5\5"+
		"\u0100\u0081\2\u07d4\u07d3\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d6\3\2"+
		"\2\2\u07d6\u07d8\5\u00b6\\\2\u07d7\u07d9\5\u0132\u009a\2\u07d8\u07d7\3"+
		"\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07e5\3\2\2\2\u07da\u07dc\5\u0100\u0081"+
		"\2\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07df"+
		"\5\u00b6\\\2\u07de\u07e0\5\u0132\u009a\2\u07df\u07de\3\2\2\2\u07df\u07e0"+
		"\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\7f\2\2\u07e2\u07e3\5\u014c\u00a7"+
		"\2\u07e3\u07e5\3\2\2\2\u07e4\u07c6\3\2\2\2\u07e4\u07cc\3\2\2\2\u07e4\u07d4"+
		"\3\2\2\2\u07e4\u07db\3\2\2\2\u07e5\u0141\3\2\2\2\u07e6\u07e7\5\u0144\u00a3"+
		"\2\u07e7\u07e8\5\u0146\u00a4\2\u07e8\u0143\3\2\2\2\u07e9\u07eb\5\u0100"+
		"\u0081\2\u07ea\u07e9\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ed\3\2\2\2\u07ec"+
		"\u07ee\5\u00b6\\\2\u07ed\u07ec\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07ef"+
		"\3\2\2\2\u07ef\u07f1\5\u011a\u008e\2\u07f0\u07f2\5\u0166\u00b4\2\u07f1"+
		"\u07f0\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u0145\3\2\2\2\u07f3\u07f5\5\u017e"+
		"\u00c0\2\u07f4\u07f3\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6"+
		"\u07ff\5x=\2\u07f7\u07ff\5\u01a4\u00d3\2\u07f8\u07f9\7f\2\2\u07f9\u07fa"+
		"\7\34\2\2\u07fa\u07ff\7\u0083\2\2\u07fb\u07fc\7f\2\2\u07fc\u07fd\7\35"+
		"\2\2\u07fd\u07ff\7\u0083\2\2\u07fe\u07f4\3\2\2\2\u07fe\u07f7\3\2\2\2\u07fe"+
		"\u07f8\3\2\2\2\u07fe\u07fb\3\2\2\2\u07ff\u0147\3\2\2\2\u0800\u0806\5\u014a"+
		"\u00a6\2\u0801\u0802\7V\2\2\u0802\u0803\5,\27\2\u0803\u0804\7W\2\2\u0804"+
		"\u0806\3\2\2\2\u0805\u0800\3\2\2\2\u0805\u0801\3\2\2\2\u0806\u0149\3\2"+
		"\2\2\u0807\u0808\7f\2\2\u0808\u080b\5\u014c\u00a7\2\u0809\u080b\5\u0150"+
		"\u00a9\2\u080a\u0807\3\2\2\2\u080a\u0809\3\2\2\2\u080b\u014b\3\2\2\2\u080c"+
		"\u080f\5f\64\2\u080d\u080f\5\u0150\u00a9\2\u080e\u080c\3\2\2\2\u080e\u080d"+
		"\3\2\2\2\u080f\u014d\3\2\2\2\u0810\u0811\b\u00a8\1\2\u0811\u0813\5\u014c"+
		"\u00a7\2\u0812\u0814\7\u0086\2\2\u0813\u0812\3\2\2\2\u0813\u0814\3\2\2"+
		"\2\u0814\u081d\3\2\2\2\u0815\u0816\f\3\2\2\u0816\u0817\7}\2\2\u0817\u0819"+
		"\5\u014c\u00a7\2\u0818\u081a\7\u0086\2\2\u0819\u0818\3\2\2\2\u0819\u081a"+
		"\3\2\2\2\u081a\u081c\3\2\2\2\u081b\u0815\3\2\2\2\u081c\u081f\3\2\2\2\u081d"+
		"\u081b\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u014f\3\2\2\2\u081f\u081d\3\2"+
		"\2\2\u0820\u0821\7Z\2\2\u0821\u0823\5\u014e\u00a8\2\u0822\u0824\7}\2\2"+
		"\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0826"+
		"\7[\2\2\u0826\u082a\3\2\2\2\u0827\u0828\7Z\2\2\u0828\u082a\7[\2\2\u0829"+
		"\u0820\3\2\2\2\u0829\u0827\3\2\2\2\u082a\u0151\3\2\2\2\u082b\u082e\7\u0087"+
		"\2\2\u082c\u082e\5\u0192\u00ca\2\u082d\u082b\3\2\2\2\u082d\u082c\3\2\2"+
		"\2\u082e\u0153\3\2\2\2\u082f\u0830\5\u0156\u00ac\2\u0830\u0832\7Z\2\2"+
		"\u0831\u0833\5\u015e\u00b0\2\u0832\u0831\3\2\2\2\u0832\u0833\3\2\2\2\u0833"+
		"\u0834\3\2\2\2\u0834\u0835\7[\2\2\u0835\u0155\3\2\2\2\u0836\u0838\5\u015c"+
		"\u00af\2\u0837\u0839\5\u0100\u0081\2\u0838\u0837\3\2\2\2\u0838\u0839\3"+
		"\2\2\2\u0839\u083a\3\2\2\2\u083a\u083c\5\u0158\u00ad\2\u083b\u083d\5\u015a"+
		"\u00ae\2\u083c\u083b\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083f\3\2\2\2\u083e"+
		"\u0840\5\u016c\u00b7\2\u083f\u083e\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0849"+
		"\3\2\2\2\u0841\u0843\5\u015c\u00af\2\u0842\u0844\5\u0100\u0081\2\u0843"+
		"\u0842\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0846\3\2\2\2\u0845\u0847\5\u016c"+
		"\u00b7\2\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0849\3\2\2\2\u0848"+
		"\u0836\3\2\2\2\u0848\u0841\3\2\2\2\u0849\u0157\3\2\2\2\u084a\u084c\5\16"+
		"\b\2\u084b\u084a\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u084d\3\2\2\2\u084d"+
		"\u084e\5\u0152\u00aa\2\u084e\u0159\3\2\2\2\u084f\u0850\7\'\2\2\u0850\u015b"+
		"\3\2\2\2\u0851\u0852\t\13\2\2\u0852\u015d\3\2\2\2\u0853\u0855\5\u0160"+
		"\u00b1\2\u0854\u0856\5\u015e\u00b0\2\u0855\u0854\3\2\2\2\u0855\u0856\3"+
		"\2\2\2\u0856\u085d\3\2\2\2\u0857\u0858\5\u0176\u00bc\2\u0858\u085a\7\u0081"+
		"\2\2\u0859\u085b\5\u015e\u00b0\2\u085a\u0859\3\2\2\2\u085a\u085b\3\2\2"+
		"\2\u085b\u085d\3\2\2\2\u085c\u0853\3\2\2\2\u085c\u0857\3\2\2\2\u085d\u015f"+
		"\3\2\2\2\u085e\u0860\5\u0100\u0081\2\u085f\u085e\3\2\2\2\u085f\u0860\3"+
		"\2\2\2\u0860\u0862\3\2\2\2\u0861\u0863\5\u00b6\\\2\u0862\u0861\3\2\2\2"+
		"\u0862\u0863\3\2\2\2\u0863\u0865\3\2\2\2\u0864\u0866\5\u0162\u00b2\2\u0865"+
		"\u0864\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u086f\7\u0083"+
		"\2\2\u0868\u086f\5\u0142\u00a2\2\u0869\u086f\5\u00f8}\2\u086a\u086f\5"+
		"\u00aeX\2\u086b\u086f\5\u018a\u00c6\2\u086c\u086f\5\u00a6T\2\u086d\u086f"+
		"\5\u00b0Y\2\u086e\u085f\3\2\2\2\u086e\u0868\3\2\2\2\u086e\u0869\3\2\2"+
		"\2\u086e\u086a\3\2\2\2\u086e\u086b\3\2\2\2\u086e\u086c\3\2\2\2\u086e\u086d"+
		"\3\2\2\2\u086f\u0161\3\2\2\2\u0870\u0871\b\u00b2\1\2\u0871\u0872\5\u0164"+
		"\u00b3\2\u0872\u0878\3\2\2\2\u0873\u0874\f\3\2\2\u0874\u0875\7}\2\2\u0875"+
		"\u0877\5\u0164\u00b3\2\u0876\u0873\3\2\2\2\u0877\u087a\3\2\2\2\u0878\u0876"+
		"\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u0163\3\2\2\2\u087a\u0878\3\2\2\2\u087b"+
		"\u087d\5\u011a\u008e\2\u087c\u087e\5\u0166\u00b4\2\u087d\u087c\3\2\2\2"+
		"\u087d\u087e\3\2\2\2\u087e\u0880\3\2\2\2\u087f\u0881\5\u016a\u00b6\2\u0880"+
		"\u087f\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u088f\3\2\2\2\u0882\u0884\5\u011a"+
		"\u008e\2\u0883\u0885\5\u014a\u00a6\2\u0884\u0883\3\2\2\2\u0884\u0885\3"+
		"\2\2\2\u0885\u088f\3\2\2\2\u0886\u0888\7\u0087\2\2\u0887\u0886\3\2\2\2"+
		"\u0887\u0888\3\2\2\2\u0888\u088a\3\2\2\2\u0889\u088b\5\u0100\u0081\2\u088a"+
		"\u0889\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d\7\u0081"+
		"\2\2\u088d\u088f\5n8\2\u088e\u087b\3\2\2\2\u088e\u0882\3\2\2\2\u088e\u0887"+
		"\3\2\2\2\u088f\u0165\3\2\2\2\u0890\u0891\b\u00b4\1\2\u0891\u0892\5\u0168"+
		"\u00b5\2\u0892\u0897\3\2\2\2\u0893\u0894\f\3\2\2\u0894\u0896\5\u0168\u00b5"+
		"\2\u0895\u0893\3\2\2\2\u0896\u0899\3\2\2\2\u0897\u0895\3\2\2\2\u0897\u0898"+
		"\3\2\2\2\u0898\u0167\3\2\2\2\u0899\u0897\3\2\2\2\u089a\u089b\t\f\2\2\u089b"+
		"\u0169\3\2\2\2\u089c\u089d\7f\2\2\u089d\u089e\7\u008a\2\2\u089e\u089f"+
		"\b\u00b6\1\2\u089f\u016b\3\2\2\2\u08a0\u08a1\7\u0081\2\2\u08a1\u08a2\5"+
		"\u016e\u00b8\2\u08a2\u016d\3\2\2\2\u08a3\u08a4\b\u00b8\1\2\u08a4\u08a6"+
		"\5\u0170\u00b9\2\u08a5\u08a7\7\u0086\2\2\u08a6\u08a5\3\2\2\2\u08a6\u08a7"+
		"\3\2\2\2\u08a7\u08b0\3\2\2\2\u08a8\u08a9\f\3\2\2\u08a9\u08aa\7}\2\2\u08aa"+
		"\u08ac\5\u0170\u00b9\2\u08ab\u08ad\7\u0086\2\2\u08ac\u08ab\3\2\2\2\u08ac"+
		"\u08ad\3\2\2\2\u08ad\u08af\3\2\2\2\u08ae\u08a8\3\2\2\2\u08af\u08b2\3\2"+
		"\2\2\u08b0\u08ae\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u016f\3\2\2\2\u08b2"+
		"\u08b0\3\2\2\2\u08b3\u08b5\5\u0100\u0081\2\u08b4\u08b3\3\2\2\2\u08b4\u08b5"+
		"\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08c9\5\u0174\u00bb\2\u08b7\u08b9\5"+
		"\u0100\u0081\2\u08b8\u08b7\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08ba\3\2"+
		"\2\2\u08ba\u08bc\7Q\2\2\u08bb\u08bd\5\u0176\u00bc\2\u08bc\u08bb\3\2\2"+
		"\2\u08bc\u08bd\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08c9\5\u0174\u00bb\2"+
		"\u08bf\u08c1\5\u0100\u0081\2\u08c0\u08bf\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1"+
		"\u08c2\3\2\2\2\u08c2\u08c4\5\u0176\u00bc\2\u08c3\u08c5\7Q\2\2\u08c4\u08c3"+
		"\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c7\5\u0174\u00bb"+
		"\2\u08c7\u08c9\3\2\2\2\u08c8\u08b4\3\2\2\2\u08c8\u08b8\3\2\2\2\u08c8\u08c0"+
		"\3\2\2\2\u08c9\u0171\3\2\2\2\u08ca\u08cc\5\16\b\2\u08cb\u08ca\3\2\2\2"+
		"\u08cb\u08cc\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08d0\5\u0152\u00aa\2\u08ce"+
		"\u08d0\5\u00caf\2\u08cf\u08cb\3\2\2\2\u08cf\u08ce\3\2\2\2\u08d0\u0173"+
		"\3\2\2\2\u08d1\u08d2\5\u0172\u00ba\2\u08d2\u0175\3\2\2\2\u08d3\u08d4\t"+
		"\r\2\2\u08d4\u0177\3\2\2\2\u08d5\u08d6\7\65\2\2\u08d6\u08d7\5\u017a\u00be"+
		"\2\u08d7\u0179\3\2\2\2\u08d8\u08da\5\u00c2b\2\u08d9\u08db\5\u017c\u00bf"+
		"\2\u08da\u08d9\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u017b\3\2\2\2\u08dc\u08de"+
		"\5\u0126\u0094\2\u08dd\u08df\5\u017c\u00bf\2\u08de\u08dd\3\2\2\2\u08de"+
		"\u08df\3\2\2\2\u08df\u017d\3\2\2\2\u08e0\u08e1\7\u0081\2\2\u08e1\u08e2"+
		"\5\u0180\u00c1\2\u08e2\u017f\3\2\2\2\u08e3\u08e5\5\u0182\u00c2\2\u08e4"+
		"\u08e6\7\u0086\2\2\u08e5\u08e4\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08ef"+
		"\3\2\2\2\u08e7\u08e9\5\u0182\u00c2\2\u08e8\u08ea\7\u0086\2\2\u08e9\u08e8"+
		"\3\2\2\2\u08e9\u08ea\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ec\7}\2\2\u08ec"+
		"\u08ed\5\u0180\u00c1\2\u08ed\u08ef\3\2\2\2\u08ee\u08e3\3\2\2\2\u08ee\u08e7"+
		"\3\2\2\2\u08ef\u0181\3\2\2\2\u08f0\u08f1\5\u0184\u00c3\2\u08f1\u08f3\7"+
		"V\2\2\u08f2\u08f4\5,\27\2\u08f3\u08f2\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4"+
		"\u08f5\3\2\2\2\u08f5\u08f6\7W\2\2\u08f6\u08fb\3\2\2\2\u08f7\u08f8\5\u0184"+
		"\u00c3\2\u08f8\u08f9\5\u0150\u00a9\2\u08f9\u08fb\3\2\2\2\u08fa\u08f0\3"+
		"\2\2\2\u08fa\u08f7\3\2\2\2\u08fb\u0183\3\2\2\2\u08fc\u08ff\5\u0172\u00ba"+
		"\2\u08fd\u08ff\7\u0087\2\2\u08fe\u08fc\3\2\2\2\u08fe\u08fd\3\2\2\2\u08ff"+
		"\u0185\3\2\2\2\u0900\u0901\7\65\2\2\u0901\u0902\5\u01bc\u00df\2\u0902"+
		"\u0187\3\2\2\2\u0903\u0904\7\65\2\2\u0904\u0905\7\u0090\2\2\u0905\u0909"+
		"\7\u0087\2\2\u0906\u0907\7\65\2\2\u0907\u0909\7\u0093\2\2\u0908\u0903"+
		"\3\2\2\2\u0908\u0906\3\2\2\2\u0909\u0189\3\2\2\2\u090a\u090b\7E\2\2\u090b"+
		"\u090c\7g\2\2\u090c\u090d\5\u018c\u00c7\2\u090d\u090e\7h\2\2\u090e\u090f"+
		"\5\u00a2R\2\u090f\u018b\3\2\2\2\u0910\u0911\b\u00c7\1\2\u0911\u0912\5"+
		"\u018e\u00c8\2\u0912\u0918\3\2\2\2\u0913\u0914\f\3\2\2\u0914\u0915\7}"+
		"\2\2\u0915\u0917\5\u018e\u00c8\2\u0916\u0913\3\2\2\2\u0917\u091a\3\2\2"+
		"\2\u0918\u0916\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u018d\3\2\2\2\u091a\u0918"+
		"\3\2\2\2\u091b\u091e\5\u0190\u00c9\2\u091c\u091e\5\u0140\u00a1\2\u091d"+
		"\u091b\3\2\2\2\u091d\u091c\3\2\2\2\u091e\u018f\3\2\2\2\u091f\u0921\7\26"+
		"\2\2\u0920\u0922\7\u0086\2\2\u0921\u0920\3\2\2\2\u0921\u0922\3\2\2\2\u0922"+
		"\u0924\3\2\2\2\u0923\u0925\7\u0087\2\2\u0924\u0923\3\2\2\2\u0924\u0925"+
		"\3\2\2\2\u0925\u0950\3\2\2\2\u0926\u0928\7\26\2\2\u0927\u0929\7\u0087"+
		"\2\2\u0928\u0927\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092a\3\2\2\2\u092a"+
		"\u092b\7f\2\2\u092b\u0950\5\u0130\u0099\2\u092c\u092e\7M\2\2\u092d\u092f"+
		"\7\u0086\2\2\u092e\u092d\3\2\2\2\u092e\u092f\3\2\2\2\u092f\u0931\3\2\2"+
		"\2\u0930\u0932\7\u0087\2\2\u0931\u0930\3\2\2\2\u0931\u0932\3\2\2\2\u0932"+
		"\u0950\3\2\2\2\u0933\u0935\7M\2\2\u0934\u0936\7\u0087\2\2\u0935\u0934"+
		"\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0937\3\2\2\2\u0937\u0938\7f\2\2\u0938"+
		"\u0950\5\u0130\u0099\2\u0939\u093a\7E\2\2\u093a\u093b\7g\2\2\u093b\u093c"+
		"\5\u018c\u00c7\2\u093c\u093d\7h\2\2\u093d\u093f\7\26\2\2\u093e\u0940\7"+
		"\u0086\2\2\u093f\u093e\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0942\3\2\2\2"+
		"\u0941\u0943\7\u0087\2\2\u0942\u0941\3\2\2\2\u0942\u0943\3\2\2\2\u0943"+
		"\u0950\3\2\2\2\u0944\u0945\7E\2\2\u0945\u0946\7g\2\2\u0946\u0947\5\u018c"+
		"\u00c7\2\u0947\u0948\7h\2\2\u0948\u094a\7\26\2\2\u0949\u094b\7\u0087\2"+
		"\2\u094a\u0949\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094d"+
		"\7f\2\2\u094d\u094e\5\b\5\2\u094e\u0950\3\2\2\2\u094f\u091f\3\2\2\2\u094f"+
		"\u0926\3\2\2\2\u094f\u092c\3\2\2\2\u094f\u0933\3\2\2\2\u094f\u0939\3\2"+
		"\2\2\u094f\u0944\3\2\2\2\u0950\u0191\3\2\2\2\u0951\u0952\5\u0196\u00cc"+
		"\2\u0952\u0954\7g\2\2\u0953\u0955\5\u0198\u00cd\2\u0954\u0953\3\2\2\2"+
		"\u0954\u0955\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u0957\7h\2\2\u0957\u0193"+
		"\3\2\2\2\u0958\u0968\5\u0192\u00ca\2\u0959\u095a\5\u0186\u00c4\2\u095a"+
		"\u095c\7g\2\2\u095b\u095d\5\u0198\u00cd\2\u095c\u095b\3\2\2\2\u095c\u095d"+
		"\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u095f\7h\2\2\u095f\u0968\3\2\2\2\u0960"+
		"\u0961\5\u0188\u00c5\2\u0961\u0963\7g\2\2\u0962\u0964\5\u0198\u00cd\2"+
		"\u0963\u0962\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0965\3\2\2\2\u0965\u0966"+
		"\7h\2\2\u0966\u0968\3\2\2\2\u0967\u0958\3\2\2\2\u0967\u0959\3\2\2\2\u0967"+
		"\u0960\3\2\2\2\u0968\u0195\3\2\2\2\u0969\u096a\7\u0087\2\2\u096a\u0197"+
		"\3\2\2\2\u096b\u096c\b\u00cd\1\2\u096c\u096e\5\u019a\u00ce\2\u096d\u096f"+
		"\7\u0086\2\2\u096e\u096d\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0978\3\2\2"+
		"\2\u0970\u0971\f\3\2\2\u0971\u0972\7}\2\2\u0972\u0974\5\u019a\u00ce\2"+
		"\u0973\u0975\7\u0086\2\2\u0974\u0973\3\2\2\2\u0974\u0975\3\2\2\2\u0975"+
		"\u0977\3\2\2\2\u0976\u0970\3\2\2\2\u0977\u097a\3\2\2\2\u0978\u0976\3\2"+
		"\2\2\u0978\u0979\3\2\2\2\u0979\u0199\3\2\2\2\u097a\u0978\3\2\2\2\u097b"+
		"\u097f\5\u0130\u0099\2\u097c\u097f\5n8\2\u097d\u097f\5\b\5\2\u097e\u097b"+
		"\3\2\2\2\u097e\u097c\3\2\2\2\u097e\u097d\3\2\2\2\u097f\u019b\3\2\2\2\u0980"+
		"\u0981\7M\2\2\u0981\u0982\5\16\b\2\u0982\u0983\7\u0087\2\2\u0983\u098c"+
		"\3\2\2\2\u0984\u0985\7M\2\2\u0985\u0987\5\16\b\2\u0986\u0988\7E\2\2\u0987"+
		"\u0986\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098a\5\u0192"+
		"\u00ca\2\u098a\u098c\3\2\2\2\u098b\u0980\3\2\2\2\u098b\u0984\3\2\2\2\u098c"+
		"\u019d\3\2\2\2\u098d\u098f\7%\2\2\u098e\u098d\3\2\2\2\u098e\u098f\3\2"+
		"\2";
	private static final String _serializedATNSegment1 =
		"\2\u098f\u0990\3\2\2\2\u0990\u0991\7E\2\2\u0991\u0992\5\u00a2R\2\u0992"+
		"\u019f\3\2\2\2\u0993\u0994\7E\2\2\u0994\u0995\7g\2\2\u0995\u0996\7h\2"+
		"\2\u0996\u0997\5\u00a2R\2\u0997\u01a1\3\2\2\2\u0998\u0999\5\u01a6\u00d4"+
		"\2\u0999\u099a\5\u01aa\u00d6\2\u099a\u01a3\3\2\2\2\u099b\u099c\5\u01a8"+
		"\u00d5\2\u099c\u099d\5\u01aa\u00d6\2\u099d\u01a5\3\2\2\2\u099e\u099f\7"+
		"J\2\2\u099f\u09a0\5x=\2\u09a0\u01a7\3\2\2\2\u09a1\u09a3\7J\2\2\u09a2\u09a4"+
		"\5\u017e\u00c0\2\u09a3\u09a2\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a5\3"+
		"\2\2\2\u09a5\u09a6\5x=\2\u09a6\u01a9\3\2\2\2\u09a7\u09a9\5\u01ac\u00d7"+
		"\2\u09a8\u09aa\5\u01aa\u00d6\2\u09a9\u09a8\3\2\2\2\u09a9\u09aa\3\2\2\2"+
		"\u09aa\u01ab\3\2\2\2\u09ab\u09ac\5\u01ae\u00d8\2\u09ac\u09ad\5x=\2\u09ad"+
		"\u01ad\3\2\2\2\u09ae\u09af\7\22\2\2\u09af\u09b0\7V\2\2\u09b0\u09b1\5\u01b0"+
		"\u00d9\2\u09b1\u09b2\7W\2\2\u09b2\u01af\3\2\2\2\u09b3\u09b5\5\u0100\u0081"+
		"\2\u09b4\u09b3\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b7"+
		"\5\u00c2b\2\u09b7\u09b8\5\u011a\u008e\2\u09b8\u09c2\3\2\2\2\u09b9\u09bb"+
		"\5\u0100\u0081\2\u09ba\u09b9\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bc\3"+
		"\2\2\2\u09bc\u09be\5\u00c2b\2\u09bd\u09bf\5\u0132\u009a\2\u09be\u09bd"+
		"\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c2\3\2\2\2\u09c0\u09c2\7\u0086\2"+
		"\2\u09c1\u09b4\3\2\2\2\u09c1\u09ba\3\2\2\2\u09c1\u09c0\3\2\2\2\u09c2\u01b1"+
		"\3\2\2\2\u09c3\u09c5\7H\2\2\u09c4\u09c6\5f\64\2\u09c5\u09c4\3\2\2\2\u09c5"+
		"\u09c6\3\2\2\2\u09c6\u01b3\3\2\2\2\u09c7\u09ca\5\u01b6\u00dc\2\u09c8\u09ca"+
		"\5\u01ba\u00de\2\u09c9\u09c7\3\2\2\2\u09c9\u09c8\3\2\2\2\u09ca\u01b5\3"+
		"\2\2\2\u09cb\u09cc\7H\2\2\u09cc\u09ce\7V\2\2\u09cd\u09cf\5\u01b8\u00dd"+
		"\2\u09ce\u09cd\3\2\2\2\u09ce\u09cf\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d1"+
		"\7W\2\2\u09d1\u01b7\3\2\2\2\u09d2\u09d3\b\u00dd\1\2\u09d3\u09d5\5\u0130"+
		"\u0099\2\u09d4\u09d6\7\u0086\2\2\u09d5\u09d4\3\2\2\2\u09d5\u09d6\3\2\2"+
		"\2\u09d6\u09df\3\2\2\2\u09d7\u09d8\f\3\2\2\u09d8\u09d9\7}\2\2\u09d9\u09db"+
		"\5\u0130\u0099\2\u09da\u09dc\7\u0086\2\2\u09db\u09da\3\2\2\2\u09db\u09dc"+
		"\3\2\2\2\u09dc\u09de\3\2\2\2\u09dd\u09d7\3\2\2\2\u09de\u09e1\3\2\2\2\u09df"+
		"\u09dd\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u01b9\3\2\2\2\u09e1\u09df\3\2"+
		"\2\2\u09e2\u09e3\7\63\2\2\u09e3\u09e4\7V\2\2\u09e4\u09e5\5n8\2\u09e5\u09e6"+
		"\7W\2\2\u09e6\u09e9\3\2\2\2\u09e7\u09e9\7\63\2\2\u09e8\u09e2\3\2\2\2\u09e8"+
		"\u09e7\3\2\2\2\u09e9\u01bb\3\2\2\2\u09ea\u0a1e\7\62\2\2\u09eb\u0a1e\7"+
		"\35\2\2\u09ec\u09ed\7\62\2\2\u09ed\u09ee\7X\2\2\u09ee\u0a1e\7Y\2\2\u09ef"+
		"\u09f0\7\35\2\2\u09f0\u09f1\7X\2\2\u09f1\u0a1e\7Y\2\2\u09f2\u0a1e\7\\"+
		"\2\2\u09f3\u0a1e\7]\2\2\u09f4\u0a1e\7^\2\2\u09f5\u0a1e\7_\2\2\u09f6\u0a1e"+
		"\7`\2\2\u09f7\u0a1e\7a\2\2\u09f8\u0a1e\7b\2\2\u09f9\u0a1e\7c\2\2\u09fa"+
		"\u0a1e\7d\2\2\u09fb\u0a1e\7\3\2\2\u09fc\u0a1e\7\4\2\2\u09fd\u0a1e\7f\2"+
		"\2\u09fe\u0a1e\7g\2\2\u09ff\u0a1e\7h\2\2\u0a00\u0a1e\7i\2\2\u0a01\u0a1e"+
		"\7j\2\2\u0a02\u0a1e\7k\2\2\u0a03\u0a1e\7l\2\2\u0a04\u0a1e\7m\2\2\u0a05"+
		"\u0a1e\7n\2\2\u0a06\u0a1e\7o\2\2\u0a07\u0a1e\7p\2\2\u0a08\u0a1e\7q\2\2"+
		"\u0a09\u0a1e\7r\2\2\u0a0a\u0a1e\7t\2\2\u0a0b\u0a1e\7s\2\2\u0a0c\u0a1e"+
		"\7u\2\2\u0a0d\u0a1e\7v\2\2\u0a0e\u0a1e\7w\2\2\u0a0f\u0a1e\7x\2\2\u0a10"+
		"\u0a1e\7\5\2\2\u0a11\u0a1e\7\6\2\2\u0a12\u0a1e\7\7\2\2\u0a13\u0a1e\7\b"+
		"\2\2\u0a14\u0a1e\7{\2\2\u0a15\u0a1e\7|\2\2\u0a16\u0a1e\7}\2\2\u0a17\u0a1e"+
		"\7~\2\2\u0a18\u0a1e\7\177\2\2\u0a19\u0a1a\7V\2\2\u0a1a\u0a1e\7W\2\2\u0a1b"+
		"\u0a1c\7X\2\2\u0a1c\u0a1e\7Y\2\2\u0a1d\u09ea\3\2\2\2\u0a1d\u09eb\3\2\2"+
		"\2\u0a1d\u09ec\3\2\2\2\u0a1d\u09ef\3\2\2\2\u0a1d\u09f2\3\2\2\2\u0a1d\u09f3"+
		"\3\2\2\2\u0a1d\u09f4\3\2\2\2\u0a1d\u09f5\3\2\2\2\u0a1d\u09f6\3\2\2\2\u0a1d"+
		"\u09f7\3\2\2\2\u0a1d\u09f8\3\2\2\2\u0a1d\u09f9\3\2\2\2\u0a1d\u09fa\3\2"+
		"\2\2\u0a1d\u09fb\3\2\2\2\u0a1d\u09fc\3\2\2\2\u0a1d\u09fd\3\2\2\2\u0a1d"+
		"\u09fe\3\2\2\2\u0a1d\u09ff\3\2\2\2\u0a1d\u0a00\3\2\2\2\u0a1d\u0a01\3\2"+
		"\2\2\u0a1d\u0a02\3\2\2\2\u0a1d\u0a03\3\2\2\2\u0a1d\u0a04\3\2\2\2\u0a1d"+
		"\u0a05\3\2\2\2\u0a1d\u0a06\3\2\2\2\u0a1d\u0a07\3\2\2\2\u0a1d\u0a08\3\2"+
		"\2\2\u0a1d\u0a09\3\2\2\2\u0a1d\u0a0a\3\2\2\2\u0a1d\u0a0b\3\2\2\2\u0a1d"+
		"\u0a0c\3\2\2\2\u0a1d\u0a0d\3\2\2\2\u0a1d\u0a0e\3\2\2\2\u0a1d\u0a0f\3\2"+
		"\2\2\u0a1d\u0a10\3\2\2\2\u0a1d\u0a11\3\2\2\2\u0a1d\u0a12\3\2\2\2\u0a1d"+
		"\u0a13\3\2\2\2\u0a1d\u0a14\3\2\2\2\u0a1d\u0a15\3\2\2\2\u0a1d\u0a16\3\2"+
		"\2\2\u0a1d\u0a17\3\2\2\2\u0a1d\u0a18\3\2\2\2\u0a1d\u0a19\3\2\2\2\u0a1d"+
		"\u0a1b\3\2\2\2\u0a1e\u01bd\3\2\2\2\u0a1f\u0a27\7\u0088\2\2\u0a20\u0a27"+
		"\7\u008e\2\2\u0a21\u0a27\7\u008f\2\2\u0a22\u0a27\7\u0090\2\2\u0a23\u0a27"+
		"\5\u01c0\u00e1\2\u0a24\u0a27\5\u01c2\u00e2\2\u0a25\u0a27\5\u01c4\u00e3"+
		"\2\u0a26\u0a1f\3\2\2\2\u0a26\u0a20\3\2\2\2\u0a26\u0a21\3\2\2\2\u0a26\u0a22"+
		"\3\2\2\2\u0a26\u0a23\3\2\2\2\u0a26\u0a24\3\2\2\2\u0a26\u0a25\3\2\2\2\u0a27"+
		"\u01bf\3\2\2\2\u0a28\u0a29\t\16\2\2\u0a29\u01c1\3\2\2\2\u0a2a\u0a2b\7"+
		"\64\2\2\u0a2b\u01c3\3\2\2\2\u0a2c\u0a2d\t\17\2\2\u0a2d\u01c5\3\2\2\2\u014b"+
		"\u01c9\u01cc\u01cf\u01dd\u01e1\u01ec\u01f0\u01ff\u0206\u020b\u020d\u0212"+
		"\u0218\u0222\u0229\u022f\u0233\u0238\u023e\u0245\u024b\u024e\u0251\u0254"+
		"\u025d\u0264\u0298\u02a2\u02af\u02b1\u02bb\u02c1\u02c6\u02c9\u02ce\u02d5"+
		"\u02da\u02dd\u02df\u02e9\u02ec\u02fa\u02ff\u0303\u0321\u0326\u032a\u032e"+
		"\u0331\u0335\u033b\u033d\u0345\u0349\u034c\u0353\u035a\u035e\u0363\u0367"+
		"\u036a\u036f\u0375\u0380\u038f\u0391\u03a0\u03a2\u03ae\u03b0\u03bc\u03d0"+
		"\u03d2\u03de\u03e0\u03eb\u03f6\u0401\u040d\u040f\u041b\u041d\u0427\u042c"+
		"\u043c\u0443\u0447\u044b\u044f\u0453\u0458\u045b\u045e\u0464\u046a\u046f"+
		"\u0476\u047c\u0487\u048e\u0498\u04a6\u04ae\u04b4\u04c0\u04d0\u04d4\u04e1"+
		"\u04e4\u04eb\u04f3\u04fd\u0504\u050f\u051b\u0525\u052a\u0533\u0536\u053b"+
		"\u0540\u055c\u0560\u0565\u0570\u0576\u057a\u057f\u0583\u0588\u058b\u05a1"+
		"\u05a7\u05b2\u05b6\u05b9\u05c3\u05c9\u05cc\u05d3\u05dd\u05e1\u05e4\u05e7"+
		"\u05eb\u05f0\u05f2\u05f6\u05fa\u0603\u0610\u0618\u061e\u0629\u062d\u0630"+
		"\u0636\u063c\u0641\u064c\u0652\u065d\u0660\u0665\u0674\u067a\u0683\u068d"+
		"\u0693\u069b\u069f\u06a3\u06a8\u06ad\u06b4\u06b6\u06bb\u06bf\u06cd\u06d3"+
		"\u06e5\u06e7\u06f1\u06f6\u06fd\u0703\u0708\u070c\u0712\u0718\u071e\u0723"+
		"\u072a\u072d\u0730\u0733\u0738\u073c\u073f\u0743\u0747\u074c\u074f\u0751"+
		"\u0755\u075c\u0762\u0766\u076c\u0771\u0773\u0779\u077d\u0783\u078a\u078e"+
		"\u0790\u0792\u0799\u07a3\u07a7\u07a9\u07ab\u07af\u07b2\u07b8\u07c2\u07c6"+
		"\u07cc\u07d4\u07d8\u07db\u07df\u07e4\u07ea\u07ed\u07f1\u07f4\u07fe\u0805"+
		"\u080a\u080e\u0813\u0819\u081d\u0823\u0829\u082d\u0832\u0838\u083c\u083f"+
		"\u0843\u0846\u0848\u084b\u0855\u085a\u085c\u085f\u0862\u0865\u086e\u0878"+
		"\u087d\u0880\u0884\u0887\u088a\u088e\u0897\u08a6\u08ac\u08b0\u08b4\u08b8"+
		"\u08bc\u08c0\u08c4\u08c8\u08cb\u08cf\u08da\u08de\u08e5\u08e9\u08ee\u08f3"+
		"\u08fa\u08fe\u0908\u0918\u091d\u0921\u0924\u0928\u092e\u0931\u0935\u093f"+
		"\u0942\u094a\u094f\u0954\u095c\u0963\u0967\u096e\u0974\u0978\u097e\u0987"+
		"\u098b\u098e\u09a3\u09a9\u09b4\u09ba\u09be\u09c1\u09c5\u09c9\u09ce\u09d5"+
		"\u09db\u09df\u09e8\u0a1d\u0a26";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}