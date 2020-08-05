// Generated from CPP14.g4 by ANTLR 4.7.1
package br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.cpp;
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		RULE_unaryexpression = 23, RULE_unaryoperator = 24, RULE_newexpression = 25, 
		RULE_newplacement = 26, RULE_newtypeid = 27, RULE_newdeclarator = 28, 
		RULE_noptrnewdeclarator = 29, RULE_newinitializer = 30, RULE_deleteexpression = 31, 
		RULE_noexceptexpression = 32, RULE_castexpression = 33, RULE_realcastexpression = 34, 
		RULE_pmexpression = 35, RULE_multiplicativeexpression = 36, RULE_additiveexpression = 37, 
		RULE_shiftexpression = 38, RULE_shiftoperator = 39, RULE_relationalexpression = 40, 
		RULE_equalityexpression = 41, RULE_andexpression = 42, RULE_exclusiveorexpression = 43, 
		RULE_inclusiveorexpression = 44, RULE_logicalandexpression = 45, RULE_logicalorexpression = 46, 
		RULE_conditionalexpression = 47, RULE_assignmentexpression = 48, RULE_realassignmentexpression = 49, 
		RULE_assignmentoperator = 50, RULE_expression = 51, RULE_constantexpression = 52, 
		RULE_statement = 53, RULE_labeledstatement = 54, RULE_caseexpression = 55, 
		RULE_expressionstatement = 56, RULE_compoundstatement = 57, RULE_statementseq = 58, 
		RULE_selectionstatement = 59, RULE_ifexpression = 60, RULE_switchexpression = 61, 
		RULE_condition = 62, RULE_iterationstatement = 63, RULE_dostatement = 64, 
		RULE_whileexpression = 65, RULE_basicforexpression = 66, RULE_enhancedforexpression = 67, 
		RULE_forinitstatement = 68, RULE_forrangedeclaration = 69, RULE_forrangeinitializer = 70, 
		RULE_jumpstatement = 71, RULE_breakstatement = 72, RULE_continuestatement = 73, 
		RULE_returnstatement = 74, RULE_declarationstatement = 75, RULE_declarationseq = 76, 
		RULE_declaration = 77, RULE_blockdeclaration = 78, RULE_aliasdeclaration = 79, 
		RULE_simpledeclaration = 80, RULE_variabledeclaration = 81, RULE_static_assertdeclaration = 82, 
		RULE_emptydeclaration = 83, RULE_attributedeclaration = 84, RULE_declspecifier = 85, 
		RULE_declspecifierseq = 86, RULE_storageclassspecifier = 87, RULE_functionspecifier = 88, 
		RULE_typedefname = 89, RULE_typespecifier = 90, RULE_trailingtypespecifier = 91, 
		RULE_typespecifierseq = 92, RULE_trailingtypespecifierseq = 93, RULE_simpletypespecifier = 94, 
		RULE_thetypename = 95, RULE_decltypespecifier = 96, RULE_elaboratedtypespecifier = 97, 
		RULE_enumname = 98, RULE_enumspecifier = 99, RULE_enumhead = 100, RULE_opaqueenumdeclaration = 101, 
		RULE_enumkey = 102, RULE_enumbase = 103, RULE_enumeratorlist = 104, RULE_enumeratordefinition = 105, 
		RULE_enumerator = 106, RULE_namespacename = 107, RULE_originalnamespacename = 108, 
		RULE_namespacedefinition = 109, RULE_namednamespacedefinition = 110, RULE_originalnamespacedefinition = 111, 
		RULE_extensionnamespacedefinition = 112, RULE_unnamednamespacedefinition = 113, 
		RULE_namespacebody = 114, RULE_namespacealias = 115, RULE_namespacealiasdefinition = 116, 
		RULE_qualifiednamespacespecifier = 117, RULE_usingdeclaration = 118, RULE_usingdirective = 119, 
		RULE_asmdefinition = 120, RULE_linkagespecification = 121, RULE_attributespecifierseq = 122, 
		RULE_attributespecifier = 123, RULE_alignmentspecifier = 124, RULE_attributelist = 125, 
		RULE_attribute = 126, RULE_attributetoken = 127, RULE_attributescopedtoken = 128, 
		RULE_attributenamespace = 129, RULE_attributeargumentclause = 130, RULE_balancedtokenseq = 131, 
		RULE_balancedtoken = 132, RULE_initdeclaratorlist = 133, RULE_initdeclarator = 134, 
		RULE_declarator = 135, RULE_ptrdeclarator = 136, RULE_noptrdeclarator = 137, 
		RULE_arraydeclaration = 138, RULE_parametersandqualifiers = 139, RULE_trailingreturntype = 140, 
		RULE_ptroperator = 141, RULE_cvqualifierseq = 142, RULE_cvqualifier = 143, 
		RULE_refqualifier = 144, RULE_declaratorid = 145, RULE_thetypeid = 146, 
		RULE_abstractdeclarator = 147, RULE_ptrabstractdeclarator = 148, RULE_noptrabstractdeclarator = 149, 
		RULE_abstractpackdeclarator = 150, RULE_noptrabstractpackdeclarator = 151, 
		RULE_parameterdeclarationclause = 152, RULE_parameterdeclarationlist = 153, 
		RULE_parameterdeclaration = 154, RULE_functiondefinition = 155, RULE_functionhead = 156, 
		RULE_functionbody = 157, RULE_initializer = 158, RULE_braceorequalinitializer = 159, 
		RULE_initializerclause = 160, RULE_initializerlist = 161, RULE_bracedinitlist = 162, 
		RULE_classname = 163, RULE_classspecifier = 164, RULE_classhead = 165, 
		RULE_classheadname = 166, RULE_classvirtspecifier = 167, RULE_classkey = 168, 
		RULE_memberspecification = 169, RULE_memberdeclaration = 170, RULE_memberdeclaratorlist = 171, 
		RULE_memberdeclarator = 172, RULE_virtspecifierseq = 173, RULE_virtspecifier = 174, 
		RULE_purespecifier = 175, RULE_baseclause = 176, RULE_basespecifierlist = 177, 
		RULE_basespecifier = 178, RULE_classordecltype = 179, RULE_basetypespecifier = 180, 
		RULE_accessspecifier = 181, RULE_conversionfunctionid = 182, RULE_conversiontypeid = 183, 
		RULE_conversiondeclarator = 184, RULE_ctorinitializer = 185, RULE_meminitializerlist = 186, 
		RULE_meminitializer = 187, RULE_meminitializerid = 188, RULE_operatorfunctionid = 189, 
		RULE_literaloperatorid = 190, RULE_templatedeclaration = 191, RULE_templateparameterlist = 192, 
		RULE_templateparameter = 193, RULE_typeparameter = 194, RULE_simpletemplateid = 195, 
		RULE_templateid = 196, RULE_templatename = 197, RULE_templateargumentlist = 198, 
		RULE_templateargument = 199, RULE_typenamespecifier = 200, RULE_explicitinstantiation = 201, 
		RULE_explicitspecialization = 202, RULE_tryblock = 203, RULE_functiontryblock = 204, 
		RULE_tryblockexpression = 205, RULE_functiontryblockexpression = 206, 
		RULE_handlerseq = 207, RULE_handler = 208, RULE_catchexpression = 209, 
		RULE_exceptiondeclaration = 210, RULE_throwexpression = 211, RULE_exceptionspecification = 212, 
		RULE_dynamicexceptionspecification = 213, RULE_typeidlist = 214, RULE_noexceptspecification = 215, 
		RULE_theoperator = 216, RULE_literal = 217, RULE_booleanliteral = 218, 
		RULE_pointerliteral = 219, RULE_userdefinedliteral = 220;
	public static final String[] ruleNames = {
		"translationunit", "directive", "primaryexpression", "idexpression", "unqualifiedid", 
		"qualifiedid", "nestednamespecifier", "lambdaexpression", "lambdaintroducer", 
		"lambdacapture", "capturedefault", "capturelist", "capture", "simplecapture", 
		"initcapture", "lambdadeclarator", "postfixexpression", "arrayaccess", 
		"functioninvocation", "typeidofexpr", "typeidofthetypeid", "expressionlist", 
		"pseudodestructorname", "unaryexpression", "unaryoperator", "newexpression", 
		"newplacement", "newtypeid", "newdeclarator", "noptrnewdeclarator", "newinitializer", 
		"deleteexpression", "noexceptexpression", "castexpression", "realcastexpression", 
		"pmexpression", "multiplicativeexpression", "additiveexpression", "shiftexpression", 
		"shiftoperator", "relationalexpression", "equalityexpression", "andexpression", 
		"exclusiveorexpression", "inclusiveorexpression", "logicalandexpression", 
		"logicalorexpression", "conditionalexpression", "assignmentexpression", 
		"realassignmentexpression", "assignmentoperator", "expression", "constantexpression", 
		"statement", "labeledstatement", "caseexpression", "expressionstatement", 
		"compoundstatement", "statementseq", "selectionstatement", "ifexpression", 
		"switchexpression", "condition", "iterationstatement", "dostatement", 
		"whileexpression", "basicforexpression", "enhancedforexpression", "forinitstatement", 
		"forrangedeclaration", "forrangeinitializer", "jumpstatement", "breakstatement", 
		"continuestatement", "returnstatement", "declarationstatement", "declarationseq", 
		"declaration", "blockdeclaration", "aliasdeclaration", "simpledeclaration", 
		"variabledeclaration", "static_assertdeclaration", "emptydeclaration", 
		"attributedeclaration", "declspecifier", "declspecifierseq", "storageclassspecifier", 
		"functionspecifier", "typedefname", "typespecifier", "trailingtypespecifier", 
		"typespecifierseq", "trailingtypespecifierseq", "simpletypespecifier", 
		"thetypename", "decltypespecifier", "elaboratedtypespecifier", "enumname", 
		"enumspecifier", "enumhead", "opaqueenumdeclaration", "enumkey", "enumbase", 
		"enumeratorlist", "enumeratordefinition", "enumerator", "namespacename", 
		"originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
		"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
		"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
		"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
		"attributespecifierseq", "attributespecifier", "alignmentspecifier", "attributelist", 
		"attribute", "attributetoken", "attributescopedtoken", "attributenamespace", 
		"attributeargumentclause", "balancedtokenseq", "balancedtoken", "initdeclaratorlist", 
		"initdeclarator", "declarator", "ptrdeclarator", "noptrdeclarator", "arraydeclaration", 
		"parametersandqualifiers", "trailingreturntype", "ptroperator", "cvqualifierseq", 
		"cvqualifier", "refqualifier", "declaratorid", "thetypeid", "abstractdeclarator", 
		"ptrabstractdeclarator", "noptrabstractdeclarator", "abstractpackdeclarator", 
		"noptrabstractpackdeclarator", "parameterdeclarationclause", "parameterdeclarationlist", 
		"parameterdeclaration", "functiondefinition", "functionhead", "functionbody", 
		"initializer", "braceorequalinitializer", "initializerclause", "initializerlist", 
		"bracedinitlist", "classname", "classspecifier", "classhead", "classheadname", 
		"classvirtspecifier", "classkey", "memberspecification", "memberdeclaration", 
		"memberdeclaratorlist", "memberdeclarator", "virtspecifierseq", "virtspecifier", 
		"purespecifier", "baseclause", "basespecifierlist", "basespecifier", "classordecltype", 
		"basetypespecifier", "accessspecifier", "conversionfunctionid", "conversiontypeid", 
		"conversiondeclarator", "ctorinitializer", "meminitializerlist", "meminitializer", 
		"meminitializerid", "operatorfunctionid", "literaloperatorid", "templatedeclaration", 
		"templateparameterlist", "templateparameter", "typeparameter", "simpletemplateid", 
		"templateid", "templatename", "templateargumentlist", "templateargument", 
		"typenamespecifier", "explicitinstantiation", "explicitspecialization", 
		"tryblock", "functiontryblock", "tryblockexpression", "functiontryblockexpression", 
		"handlerseq", "handler", "catchexpression", "exceptiondeclaration", "throwexpression", 
		"exceptionspecification", "dynamicexceptionspecification", "typeidlist", 
		"noexceptspecification", "theoperator", "literal", "booleanliteral", "pointerliteral", 
		"userdefinedliteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'not'", "'&&'", "'and'", "'||'", "'or'", null, null, "'alignas'", 
		"'alignof'", "'asm'", "'auto'", "'bool'", "'break'", "'case'", "'catch'", 
		"'char'", "'char16_t'", "'char32_t'", "'class'", "'const'", "'constexpr'", 
		"'const_cast'", "'continue'", "'decltype'", "'default'", "'delete'", "'do'", 
		"'double'", "'dynamic_cast'", "'else'", "'enum'", "'explicit'", "'export'", 
		"'extern'", "'false'", "'final'", "'float'", "'for'", "'friend'", "'goto'", 
		"'if'", "'inline'", "'int'", "'long'", "'mutable'", "'namespace'", "'new'", 
		"'noexcept'", "'nullptr'", "'operator'", "'override'", "'private'", "'protected'", 
		"'public'", "'register'", "'reinterpret_cast'", "'return'", "'short'", 
		"'signed'", "'sizeof'", "'static'", "'static_assert'", "'static_cast'", 
		"'struct'", "'switch'", "'template'", "'this'", "'thread_local'", "'throw'", 
		"'true'", "'try'", "'typedef'", "'typeid'", "'typename'", "'union'", "'unsigned'", 
		"'using'", "'virtual'", "'void'", "'volatile'", "'wchar_t'", "'while'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'&'", "'|'", "'~'", null, "'='", "'<'", "'>'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", 
		"'<<='", "'>>='", "'=='", "'!='", "'<='", "'>='", null, null, "'++'", 
		"'--'", "','", "'->*'", "'->'", "'?'", "':'", "'::'", "';'", "'.'", "'.*'", 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
		"PlusAssign", "MinusAssign", "StarAssign", "DivAssign", "ModAssign", "XorAssign", 
		"AndAssign", "OrAssign", "LeftShift", "RightShift", "LeftShiftAssign", 
		"RightShiftAssign", "Equal", "NotEqual", "LessEqual", "GreaterEqual", 
		"AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", "ArrowStar", "Arrow", 
		"Question", "Colon", "Doublecolon", "Semi", "Dot", "DotStar", "Ellipsis", 
		"Identifier", "Integerliteral", "Decimalliteral", "Octalliteral", "Hexadecimalliteral", 
		"Binaryliteral", "Integersuffix", "Characterliteral", "Floatingliteral", 
		"Stringliteral", "Userdefinedintegerliteral", "Userdefinedfloatingliteral", 
		"Userdefinedstringliteral", "Userdefinedcharacterliteral", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTranslationunit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTranslationunit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Directive) {
					{
					{
					setState(442);
					directive();
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(450);
				declarationseq(0);
				}
			}

			setState(453);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPrimaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPrimaryexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPrimaryexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primaryexpression);
		try {
			setState(465);
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
				setState(457);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				match(LeftParen);
				setState(460);
				expression(0);
				setState(461);
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
				setState(463);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(464);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIdexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIdexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitIdexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_idexpression);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnqualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnqualifiedid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUnqualifiedid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unqualifiedid);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(475);
				match(Tilde);
				setState(476);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				match(Tilde);
				setState(478);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(479);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterQualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitQualifiedid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitQualifiedid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			nestednamespecifier(0);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(483);
				match(Template);
				}
			}

			setState(486);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNestednamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNestednamespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNestednamespecifier(this);
			else return visitor.visitChildren(this);
		}
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
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(489);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(490);
				thetypename();
				setState(491);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(493);
				namespacename();
				setState(494);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(496);
				decltypespecifier();
				setState(497);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(511);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(501);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(502);
						match(Identifier);
						setState(503);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(504);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(506);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(505);
							match(Template);
							}
						}

						setState(508);
						simpletemplateid();
						setState(509);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(515);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdaexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdaexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLambdaexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			lambdaintroducer();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(517);
				lambdadeclarator();
				}
			}

			setState(520);
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
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdaintroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdaintroducer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLambdaintroducer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(LeftBracket);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (This - 68)) | (1L << (And - 68)) | (1L << (Assign - 68)))) != 0) || _la==Identifier) {
				{
				setState(523);
				lambdacapture();
				}
			}

			setState(526);
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
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdacapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdacapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLambdacapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lambdacapture);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				capturedefault();
				setState(531);
				match(Comma);
				setState(532);
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
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapturedefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapturedefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCapturedefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapturelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapturelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCapturelist(this);
			else return visitor.visitChildren(this);
		}
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
			setState(539);
			capture();
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(540);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(551);
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
					setState(543);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(544);
					match(Comma);
					setState(545);
					capture();
					setState(547);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(546);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(553);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_capture);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
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
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimplecapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimplecapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSimplecapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simplecapture);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				match(And);
				setState(560);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
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
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitcapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitcapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initcapture);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(Identifier);
				setState(565);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(And);
				setState(567);
				match(Identifier);
				setState(568);
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
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdadeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdadeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLambdadeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(LeftParen);
			setState(572);
			parameterdeclarationclause();
			setState(573);
			match(RightParen);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(574);
				match(Mutable);
				}
			}

			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(577);
				exceptionspecification();
				}
			}

			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(580);
				attributespecifierseq(0);
				}
			}

			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(583);
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
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
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
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPostfixexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPostfixexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPostfixexpression(this);
			else return visitor.visitChildren(this);
		}
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
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(587);
				functioninvocation();
				}
				break;
			case 2:
				{
				setState(588);
				primaryexpression();
				}
				break;
			case 3:
				{
				setState(589);
				arrayaccess();
				}
				break;
			case 4:
				{
				setState(590);
				simpletypespecifier();
				setState(591);
				match(LeftParen);
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(592);
					expressionlist();
					}
				}

				setState(595);
				match(RightParen);
				}
				break;
			case 5:
				{
				setState(597);
				typenamespecifier();
				setState(598);
				match(LeftParen);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(599);
					expressionlist();
					}
				}

				setState(602);
				match(RightParen);
				}
				break;
			case 6:
				{
				setState(604);
				simpletypespecifier();
				setState(605);
				bracedinitlist();
				}
				break;
			case 7:
				{
				setState(607);
				typenamespecifier();
				setState(608);
				bracedinitlist();
				}
				break;
			case 8:
				{
				setState(610);
				match(Dynamic_cast);
				setState(611);
				match(Less);
				setState(612);
				thetypeid();
				setState(613);
				match(Greater);
				setState(614);
				match(LeftParen);
				setState(615);
				expression(0);
				setState(616);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(618);
				match(Static_cast);
				setState(619);
				match(Less);
				setState(620);
				thetypeid();
				setState(621);
				match(Greater);
				setState(622);
				match(LeftParen);
				setState(623);
				expression(0);
				setState(624);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(626);
				match(Reinterpret_cast);
				setState(627);
				match(Less);
				setState(628);
				thetypeid();
				setState(629);
				match(Greater);
				setState(630);
				match(LeftParen);
				setState(631);
				expression(0);
				setState(632);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(634);
				match(Const_cast);
				setState(635);
				match(Less);
				setState(636);
				thetypeid();
				setState(637);
				match(Greater);
				setState(638);
				match(LeftParen);
				setState(639);
				expression(0);
				setState(640);
				match(RightParen);
				}
				break;
			case 12:
				{
				setState(642);
				typeidofthetypeid();
				setState(643);
				match(LeftParen);
				setState(644);
				expression(0);
				setState(645);
				match(RightParen);
				}
				break;
			case 13:
				{
				setState(647);
				typeidofthetypeid();
				setState(648);
				match(LeftParen);
				setState(649);
				thetypeid();
				setState(650);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(675);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(654);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(655);
						match(LeftBracket);
						setState(656);
						bracedinitlist();
						setState(657);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(659);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(660);
						match(LeftParen);
						setState(662);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
							{
							setState(661);
							expressionlist();
							}
						}

						setState(664);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(665);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(666);
						match(Dot);
						setState(667);
						pseudodestructorname();
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(668);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(669);
						match(Arrow);
						setState(670);
						pseudodestructorname();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(671);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(672);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(673);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(674);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(679);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayaccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterArrayaccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitArrayaccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitArrayaccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayaccessContext arrayaccess() throws RecognitionException {
		ArrayaccessContext _localctx = new ArrayaccessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayaccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			primaryexpression();
			setState(687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(681);
					match(LeftBracket);
					setState(682);
					expression(0);
					setState(683);
					match(RightBracket);
					}
					} 
				}
				setState(689);
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
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public FunctioninvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioninvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctioninvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctioninvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctioninvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioninvocationContext functioninvocation() throws RecognitionException {
		FunctioninvocationContext _localctx = new FunctioninvocationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functioninvocation);
		int _la;
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				primaryexpression();
				setState(691);
				match(Dot);
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(692);
					match(Template);
					}
				}

				setState(695);
				idexpression();
				setState(701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(696);
					match(LeftParen);
					setState(698);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
						{
						setState(697);
						expressionlist();
						}
					}

					setState(700);
					match(RightParen);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				primaryexpression();
				setState(704);
				match(LeftParen);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(705);
					expressionlist();
					}
				}

				setState(708);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				primaryexpression();
				setState(711);
				match(Arrow);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(712);
					match(Template);
					}
				}

				setState(715);
				idexpression();
				setState(721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(716);
					match(LeftParen);
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
						{
						setState(717);
						expressionlist();
						}
					}

					setState(720);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeidofexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeidofexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypeidofexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidofexprContext typeidofexpr() throws RecognitionException {
		TypeidofexprContext _localctx = new TypeidofexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeidofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeidofthetypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeidofthetypeid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypeidofthetypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidofthetypeidContext typeidofthetypeid() throws RecognitionException {
		TypeidofthetypeidContext _localctx = new TypeidofthetypeidContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeidofthetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExpressionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
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
		public List<ThetypenameContext> thetypename() {
			return getRuleContexts(ThetypenameContext.class);
		}
		public ThetypenameContext thetypename(int i) {
			return getRuleContext(ThetypenameContext.class,i);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPseudodestructorname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPseudodestructorname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPseudodestructorname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pseudodestructorname);
		int _la;
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(731);
					nestednamespecifier(0);
					}
					break;
				}
				setState(734);
				thetypename();
				setState(735);
				match(Doublecolon);
				setState(736);
				match(Tilde);
				setState(737);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				nestednamespecifier(0);
				setState(740);
				match(Template);
				setState(741);
				simpletemplateid();
				setState(742);
				match(Doublecolon);
				setState(743);
				match(Tilde);
				setState(744);
				thetypename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(746);
					nestednamespecifier(0);
					}
				}

				setState(749);
				match(Tilde);
				setState(750);
				thetypename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				match(Tilde);
				setState(752);
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

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP14Parser.Sizeof, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnaryexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUnaryexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryexpression);
		try {
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(PlusPlus);
				setState(757);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				match(MinusMinus);
				setState(759);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(760);
				unaryoperator();
				setState(761);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(763);
				match(Sizeof);
				setState(764);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(765);
				match(Sizeof);
				setState(766);
				match(LeftParen);
				setState(767);
				thetypeid();
				setState(768);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(770);
				match(Sizeof);
				setState(771);
				match(Ellipsis);
				setState(772);
				match(LeftParen);
				setState(773);
				match(Identifier);
				setState(774);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(775);
				match(Alignof);
				setState(776);
				match(LeftParen);
				setState(777);
				thetypeid();
				setState(778);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(780);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(781);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(782);
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
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnaryoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUnaryoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
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
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNewexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newexpression);
		int _la;
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(787);
					match(Doublecolon);
					}
				}

				setState(790);
				match(New);
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(791);
					newplacement();
					}
				}

				setState(794);
				newtypeid();
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(795);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(798);
					match(Doublecolon);
					}
				}

				setState(801);
				match(New);
				setState(803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(802);
					newplacement();
					}
					break;
				}
				setState(805);
				match(LeftParen);
				setState(806);
				thetypeid();
				setState(807);
				match(RightParen);
				setState(809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(808);
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
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewplacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNewplacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(LeftParen);
			setState(814);
			expressionlist();
			setState(815);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewtypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewtypeid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNewtypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			typespecifierseq();
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(818);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNewdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_newdeclarator);
		try {
			setState(826);
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
				setState(821);
				ptroperator();
				setState(823);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(822);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrnewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrnewdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoptrnewdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(829);
			match(LeftBracket);
			setState(830);
			expression(0);
			setState(831);
			match(RightBracket);
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(832);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(844);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(835);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(836);
					match(LeftBracket);
					setState(837);
					constantexpression();
					setState(838);
					match(RightBracket);
					setState(840);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(839);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewinitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNewinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_newinitializer);
		int _la;
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(LeftParen);
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(848);
					expressionlist();
					}
				}

				setState(851);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
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
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeleteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeleteexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeleteexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_deleteexpression);
		int _la;
		try {
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(855);
					match(Doublecolon);
					}
				}

				setState(858);
				match(Delete);
				setState(859);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(860);
					match(Doublecolon);
					}
				}

				setState(863);
				match(Delete);
				setState(864);
				match(LeftBracket);
				setState(865);
				match(RightBracket);
				setState(866);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoexceptexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoexceptexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoexceptexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(Noexcept);
			setState(870);
			match(LeftParen);
			setState(871);
			expression(0);
			setState(872);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCastexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCastexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_castexpression);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				realcastexpression();
				setState(876);
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
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public RealcastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realcastexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRealcastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRealcastexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitRealcastexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealcastexpressionContext realcastexpression() throws RecognitionException {
		RealcastexpressionContext _localctx = new RealcastexpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_realcastexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(LeftParen);
			setState(881);
			thetypeid();
			setState(882);
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
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPmexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPmexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPmexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(885);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(893);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(887);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(888);
						match(DotStar);
						setState(889);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(890);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(891);
						match(ArrowStar);
						setState(892);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMultiplicativeexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMultiplicativeexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMultiplicativeexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(899);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(910);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(901);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(902);
						match(Star);
						setState(903);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(904);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(905);
						match(Div);
						setState(906);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(907);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(908);
						match(Mod);
						setState(909);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(914);
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

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAdditiveexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAdditiveexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(916);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(926);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(924);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(918);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(919);
						match(Plus);
						setState(920);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(921);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(922);
						match(Minus);
						setState(923);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(928);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterShiftexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitShiftexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitShiftexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(930);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(938);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ShiftexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
					setState(932);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(933);
					shiftoperator();
					setState(934);
					additiveexpression(0);
					}
					} 
				}
				setState(940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterShiftoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitShiftoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitShiftoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftoperatorContext shiftoperator() throws RecognitionException {
		ShiftoperatorContext _localctx = new ShiftoperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_shiftoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
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
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRelationalexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitRelationalexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(944);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(958);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(946);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(947);
						match(Less);
						setState(948);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(949);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(950);
						match(Greater);
						setState(951);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(952);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(953);
						match(LessEqual);
						setState(954);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(955);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(956);
						match(GreaterEqual);
						setState(957);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(962);
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

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEqualityexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEqualityexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(964);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(974);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(972);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(966);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(967);
						match(Equal);
						setState(968);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(969);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(970);
						match(NotEqual);
						setState(971);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(976);
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

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAndexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAndexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(978);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(980);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(981);
					match(And);
					setState(982);
					equalityexpression(0);
					}
					} 
				}
				setState(987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExclusiveorexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExclusiveorexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(989);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(996);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(991);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(992);
					match(Caret);
					setState(993);
					andexpression(0);
					}
					} 
				}
				setState(998);
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

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInclusiveorexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInclusiveorexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1000);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1007);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(1002);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1003);
					match(Or);
					setState(1004);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(1009);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLogicalandexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLogicalandexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLogicalandexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1011);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1019);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(1013);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1014);
						match(T__2);
						setState(1015);
						inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(1016);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1017);
						match(T__3);
						setState(1018);
						inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(1023);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLogicalorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLogicalorexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLogicalorexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1025);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1035);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1033);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(1027);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1028);
						match(T__4);
						setState(1029);
						logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(1030);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1031);
						match(T__5);
						setState(1032);
						logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(1037);
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

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConditionalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConditionalexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitConditionalexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_conditionalexpression);
		try {
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				logicalorexpression(0);
				setState(1040);
				match(Question);
				setState(1041);
				expression(0);
				setState(1042);
				match(Colon);
				setState(1043);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAssignmentexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAssignmentexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assignmentexpression);
		try {
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				realassignmentexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1049);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRealassignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRealassignmentexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitRealassignmentexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealassignmentexpressionContext realassignmentexpression() throws RecognitionException {
		RealassignmentexpressionContext _localctx = new RealassignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_realassignmentexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			logicalorexpression(0);
			setState(1053);
			assignmentoperator();
			setState(1054);
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
		public TerminalNode RightShiftAssign() { return getToken(CPP14Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPP14Parser.LeftShiftAssign, 0); }
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAssignmentoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAssignmentoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1059);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1066);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(1061);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1062);
					match(Comma);
					setState(1063);
					assignmentexpression();
					}
					} 
				}
				setState(1068);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConstantexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConstantexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitConstantexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_statement);
		int _la;
		try {
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(1072);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1075);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1076);
					attributespecifierseq(0);
					}
				}

				setState(1079);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1080);
					attributespecifierseq(0);
					}
				}

				setState(1083);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1084);
					attributespecifierseq(0);
					}
				}

				setState(1087);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1088);
					attributespecifierseq(0);
					}
				}

				setState(1091);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1092);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1093);
					attributespecifierseq(0);
					}
				}

				setState(1096);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLabeledstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLabeledstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLabeledstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_labeledstatement);
		int _la;
		try {
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1099);
					attributespecifierseq(0);
					}
				}

				setState(1102);
				match(Identifier);
				setState(1103);
				match(Colon);
				setState(1104);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1105);
					attributespecifierseq(0);
					}
				}

				setState(1108);
				caseexpression();
				setState(1109);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1111);
					attributespecifierseq(0);
					}
				}

				setState(1114);
				match(Default);
				setState(1115);
				match(Colon);
				setState(1116);
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
		public CaseexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCaseexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCaseexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCaseexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseexpressionContext caseexpression() throws RecognitionException {
		CaseexpressionContext _localctx = new CaseexpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_caseexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(Case);
			setState(1120);
			constantexpression();
			setState(1121);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExpressionstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1123);
				expression(0);
				}
			}

			setState(1126);
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
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCompoundstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCompoundstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCompoundstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(LeftBrace);
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Semi - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1129);
				statementseq(0);
				}
			}

			setState(1132);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatementseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatementseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitStatementseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1135);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1137);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1138);
					statement();
					}
					} 
				}
				setState(1143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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
		public SwitchexpressionContext switchexpression() {
			return getRuleContext(SwitchexpressionContext.class,0);
		}
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSelectionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSelectionstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSelectionstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_selectionstatement);
		try {
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				ifexpression();
				setState(1145);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				ifexpression();
				setState(1148);
				statement();
				setState(1149);
				match(Else);
				setState(1150);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				switchexpression();
				setState(1153);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIfexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIfexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitIfexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexpressionContext ifexpression() throws RecognitionException {
		IfexpressionContext _localctx = new IfexpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ifexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			match(If);
			setState(1158);
			match(LeftParen);
			setState(1159);
			condition();
			setState(1160);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SwitchexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSwitchexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSwitchexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSwitchexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchexpressionContext switchexpression() throws RecognitionException {
		SwitchexpressionContext _localctx = new SwitchexpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_switchexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(Switch);
			setState(1163);
			match(LeftParen);
			setState(1164);
			condition();
			setState(1165);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_condition);
		int _la;
		try {
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1168);
					attributespecifierseq(0);
					}
				}

				setState(1171);
				declspecifierseq();
				setState(1172);
				declarator();
				setState(1173);
				match(Assign);
				setState(1174);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1176);
					attributespecifierseq(0);
					}
				}

				setState(1179);
				declspecifierseq();
				setState(1180);
				declarator();
				setState(1181);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIterationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIterationstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitIterationstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_iterationstatement);
		try {
			setState(1195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1185);
				whileexpression();
				setState(1186);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				dostatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1189);
				enhancedforexpression();
				setState(1190);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1192);
				basicforexpression();
				setState(1193);
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
		public DostatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dostatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDostatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDostatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDostatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DostatementContext dostatement() throws RecognitionException {
		DostatementContext _localctx = new DostatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dostatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(Do);
			setState(1198);
			statement();
			setState(1199);
			whileexpression();
			setState(1200);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhileexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterWhileexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitWhileexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitWhileexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileexpressionContext whileexpression() throws RecognitionException {
		WhileexpressionContext _localctx = new WhileexpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_whileexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(While);
			setState(1203);
			match(LeftParen);
			setState(1204);
			condition();
			setState(1205);
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
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasicforexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasicforexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBasicforexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicforexpressionContext basicforexpression() throws RecognitionException {
		BasicforexpressionContext _localctx = new BasicforexpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_basicforexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(For);
			setState(1208);
			match(LeftParen);
			setState(1209);
			forinitstatement();
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1210);
				condition();
				}
			}

			setState(1213);
			match(Semi);
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1214);
				expression(0);
				}
			}

			setState(1217);
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
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
		}
		public EnhancedforexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedforexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnhancedforexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnhancedforexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnhancedforexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedforexpressionContext enhancedforexpression() throws RecognitionException {
		EnhancedforexpressionContext _localctx = new EnhancedforexpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_enhancedforexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(For);
			setState(1220);
			match(LeftParen);
			setState(1221);
			forrangedeclaration();
			setState(1222);
			match(Colon);
			setState(1223);
			forrangeinitializer();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForinitstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForinitstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitForinitstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_forinitstatement);
		try {
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForrangedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForrangedeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitForrangedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1230);
				attributespecifierseq(0);
				}
			}

			setState(1233);
			declspecifierseq();
			setState(1234);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForrangeinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForrangeinitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitForrangeinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_forrangeinitializer);
		try {
			setState(1238);
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
				setState(1236);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
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
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterJumpstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitJumpstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitJumpstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_jumpstatement);
		try {
			setState(1246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240);
				breakstatement();
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				continuestatement();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(1242);
				returnstatement();
				}
				break;
			case Goto:
				enterOuterAlt(_localctx, 4);
				{
				setState(1243);
				match(Goto);
				setState(1244);
				match(Identifier);
				setState(1245);
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
		public BreakstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBreakstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBreakstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBreakstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakstatementContext breakstatement() throws RecognitionException {
		BreakstatementContext _localctx = new BreakstatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_breakstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(Break);
			setState(1249);
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
		public ContinuestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterContinuestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitContinuestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitContinuestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuestatementContext continuestatement() throws RecognitionException {
		ContinuestatementContext _localctx = new ContinuestatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_continuestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(Continue);
			setState(1252);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitReturnstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_returnstatement);
		int _la;
		try {
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1254);
				match(Return);
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(1255);
					expression(0);
					}
				}

				setState(1258);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				match(Return);
				setState(1260);
				bracedinitlist();
				setState(1261);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarationstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclarationstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarationseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclarationseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1268);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1270);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1271);
					declaration();
					}
					} 
				}
				setState(1276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_declaration);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1279);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1280);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1281);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1282);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1283);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1284);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1285);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBlockdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBlockdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBlockdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_blockdeclaration);
		try {
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1290);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1291);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1292);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1293);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1294);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1295);
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
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAliasdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAliasdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAliasdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(Using);
			setState(1299);
			match(Identifier);
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1300);
				attributespecifierseq(0);
				}
			}

			setState(1303);
			match(Assign);
			setState(1304);
			thetypeid();
			setState(1305);
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
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSimpledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_simpledeclaration);
		int _la;
		try {
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1307);
				variabledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1308);
					declspecifierseq();
					}
					break;
				}
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Tilde - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(1311);
					initdeclaratorlist(0);
					}
				}

				setState(1314);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1315);
				attributespecifierseq(0);
				setState(1317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1316);
					declspecifierseq();
					}
					break;
				}
				setState(1319);
				initdeclaratorlist(0);
				setState(1320);
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

	public static class VariabledeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVariabledeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitVariabledeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			declspecifierseq();
			setState(1325);
			initdeclaratorlist(0);
			setState(1326);
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
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatic_assertdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatic_assertdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitStatic_assertdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			match(Static_assert);
			setState(1329);
			match(LeftParen);
			setState(1330);
			constantexpression();
			setState(1331);
			match(Comma);
			setState(1332);
			match(Stringliteral);
			setState(1333);
			match(RightParen);
			setState(1334);
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
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEmptydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEmptydeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEmptydeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
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
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributedeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			attributespecifierseq(0);
			setState(1339);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_declspecifier);
		try {
			setState(1347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1341);
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
				setState(1342);
				typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1343);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1344);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1345);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1346);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclspecifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclspecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_declspecifierseq);
		try {
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1349);
				declspecifier();
				setState(1351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1350);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1353);
				declspecifier();
				setState(1354);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStorageclassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStorageclassspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitStorageclassspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctionspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypedefname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypedefname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypedefname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_typespecifier);
		try {
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1364);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1366);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingtypespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTrailingtypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_trailingtypespecifier);
		try {
			setState(1373);
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
				setState(1369);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1370);
				elaboratedtypespecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1371);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1372);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypespecifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypespecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_typespecifierseq);
		try {
			setState(1382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				typespecifier();
				setState(1377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1376);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1379);
				typespecifier();
				setState(1380);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingtypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingtypespecifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTrailingtypespecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_trailingtypespecifierseq);
		try {
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				trailingtypespecifier();
				setState(1386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1385);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				trailingtypespecifier();
				setState(1389);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpletypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpletypespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSimpletypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_simpletypespecifier);
		try {
			setState(1416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1393);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1396);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				nestednamespecifier(0);
				setState(1398);
				match(Template);
				setState(1399);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1401);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1402);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1403);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1404);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1405);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1406);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1407);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1408);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1409);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1410);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1411);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1412);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1413);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1414);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1415);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterThetypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitThetypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitThetypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThetypenameContext thetypename() throws RecognitionException {
		ThetypenameContext _localctx = new ThetypenameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_thetypename);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1418);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1419);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1421);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDecltypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDecltypespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDecltypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_decltypespecifier);
		try {
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424);
				match(Decltype);
				setState(1425);
				match(LeftParen);
				setState(1426);
				expression(0);
				setState(1427);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				match(Decltype);
				setState(1430);
				match(LeftParen);
				setState(1431);
				match(Auto);
				setState(1432);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterElaboratedtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitElaboratedtypespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitElaboratedtypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				classkey();
				setState(1437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1436);
					attributespecifierseq(0);
					}
				}

				setState(1440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1439);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1442);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1444);
				classkey();
				setState(1445);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1447);
				classkey();
				setState(1448);
				nestednamespecifier(0);
				setState(1450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1449);
					match(Template);
					}
				}

				setState(1452);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1454);
				match(Enum);
				setState(1456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1455);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1458);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
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
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enumspecifier);
		int _la;
		try {
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				enumhead();
				setState(1464);
				match(LeftBrace);
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1465);
					enumeratorlist(0);
					}
				}

				setState(1468);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				enumhead();
				setState(1471);
				match(LeftBrace);
				setState(1472);
				enumeratorlist(0);
				setState(1473);
				match(Comma);
				setState(1474);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumhead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumhead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_enumhead);
		int _la;
		try {
			setState(1497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				enumkey();
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1479);
					attributespecifierseq(0);
					}
				}

				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1482);
					match(Identifier);
					}
				}

				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1485);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				enumkey();
				setState(1490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1489);
					attributespecifierseq(0);
					}
				}

				setState(1492);
				nestednamespecifier(0);
				setState(1493);
				match(Identifier);
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1494);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOpaqueenumdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOpaqueenumdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitOpaqueenumdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			enumkey();
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1500);
				attributespecifierseq(0);
				}
			}

			setState(1503);
			match(Identifier);
			setState(1505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1504);
				enumbase();
				}
			}

			setState(1507);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumkey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumkey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_enumkey);
		try {
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				match(Enum);
				setState(1511);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1512);
				match(Enum);
				setState(1513);
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
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumbase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumbase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			match(Colon);
			setState(1517);
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
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumeratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumeratorlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumeratorlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1520);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1522);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1523);
					match(Comma);
					setState(1524);
					enumeratordefinition();
					}
					} 
				}
				setState(1529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumeratordefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumeratordefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumeratordefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_enumeratordefinition);
		try {
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1531);
				enumerator();
				setState(1532);
				match(Assign);
				setState(1533);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamespacename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_namespacename);
		try {
			setState(1541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOriginalnamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOriginalnamespacename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitOriginalnamespacename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
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
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacedefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_namespacedefinition);
		try {
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1545);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1546);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamednamespacedefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamednamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_namednamespacedefinition);
		try {
			setState(1551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1549);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550);
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
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOriginalnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOriginalnamespacedefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitOriginalnamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1553);
				match(Inline);
				}
			}

			setState(1556);
			match(Namespace);
			setState(1557);
			match(Identifier);
			setState(1558);
			match(LeftBrace);
			setState(1559);
			namespacebody();
			setState(1560);
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

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExtensionnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExtensionnamespacedefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExtensionnamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1562);
				match(Inline);
				}
			}

			setState(1565);
			match(Namespace);
			setState(1566);
			originalnamespacename();
			setState(1567);
			match(LeftBrace);
			setState(1568);
			namespacebody();
			setState(1569);
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

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnnamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnnamednamespacedefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUnnamednamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1571);
				match(Inline);
				}
			}

			setState(1574);
			match(Namespace);
			setState(1575);
			match(LeftBrace);
			setState(1576);
			namespacebody();
			setState(1577);
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

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacebody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamespacebody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(1579);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacealias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacealias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamespacealias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
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
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacealiasdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacealiasdefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNamespacealiasdefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			match(Namespace);
			setState(1585);
			match(Identifier);
			setState(1586);
			match(Assign);
			setState(1587);
			qualifiednamespacespecifier();
			setState(1588);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitQualifiednamespacespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitQualifiednamespacespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1590);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1593);
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
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUsingdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUsingdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUsingdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_usingdeclaration);
		int _la;
		try {
			setState(1608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1595);
				match(Using);
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1596);
					match(Typename_);
					}
				}

				setState(1599);
				nestednamespecifier(0);
				setState(1600);
				unqualifiedid();
				setState(1601);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1603);
				match(Using);
				setState(1604);
				match(Doublecolon);
				setState(1605);
				unqualifiedid();
				setState(1606);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUsingdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUsingdirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUsingdirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1610);
				attributespecifierseq(0);
				}
			}

			setState(1613);
			match(Using);
			setState(1614);
			match(Namespace);
			setState(1616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1615);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1618);
			namespacename();
			setState(1619);
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
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAsmdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAsmdefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAsmdefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			match(Asm);
			setState(1622);
			match(LeftParen);
			setState(1623);
			match(Stringliteral);
			setState(1624);
			match(RightParen);
			setState(1625);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLinkagespecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLinkagespecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLinkagespecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_linkagespecification);
		int _la;
		try {
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				match(Extern);
				setState(1628);
				match(Stringliteral);
				setState(1629);
				match(LeftBrace);
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(1630);
					declarationseq(0);
					}
				}

				setState(1633);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1634);
				match(Extern);
				setState(1635);
				match(Stringliteral);
				setState(1636);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributespecifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributespecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1640);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1642);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1643);
					attributespecifier();
					}
					} 
				}
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
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
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_attributespecifier);
		try {
			setState(1656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1649);
				match(LeftBracket);
				setState(1650);
				match(LeftBracket);
				setState(1651);
				attributelist(0);
				setState(1652);
				match(RightBracket);
				setState(1653);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1655);
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
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAlignmentspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAlignmentspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				match(Alignas);
				setState(1659);
				match(LeftParen);
				setState(1660);
				thetypeid();
				setState(1662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1661);
					match(Ellipsis);
					}
				}

				setState(1664);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1666);
				match(Alignas);
				setState(1667);
				match(LeftParen);
				setState(1668);
				constantexpression();
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1669);
					match(Ellipsis);
					}
				}

				setState(1672);
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
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 250;
		enterRecursionRule(_localctx, 250, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1677);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1680);
				attribute();
				setState(1681);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1695);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1685);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1686);
						match(Comma);
						setState(1688);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1687);
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
						setState(1690);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1691);
						match(Comma);
						setState(1692);
						attribute();
						setState(1693);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			attributetoken();
			setState(1702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1701);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributetoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributetoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributetoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_attributetoken);
		try {
			setState(1706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1704);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1705);
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
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributescopedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributescopedtoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributescopedtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			attributenamespace();
			setState(1709);
			match(Doublecolon);
			setState(1710);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributenamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributenamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributenamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
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
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributeargumentclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributeargumentclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAttributeargumentclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			match(LeftParen);
			setState(1715);
			balancedtokenseq(0);
			setState(1716);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBalancedtokenseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBalancedtokenseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBalancedtokenseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 262;
		enterRecursionRule(_localctx, 262, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1719);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1722);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1723);
					balancedtoken();
					}
					} 
				}
				setState(1728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBalancedtoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBalancedtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				match(LeftParen);
				setState(1730);
				balancedtokenseq(0);
				setState(1731);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				match(LeftBracket);
				setState(1734);
				balancedtokenseq(0);
				setState(1735);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1737);
				match(LeftBrace);
				setState(1738);
				balancedtokenseq(0);
				setState(1739);
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
				setState(1742); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1741);
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
					setState(1744); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
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
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitdeclaratorlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitdeclaratorlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1749);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1751);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1752);
					match(Comma);
					setState(1753);
					initdeclarator();
					}
					} 
				}
				setState(1758);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			declarator();
			setState(1761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1760);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_declarator);
		try {
			setState(1768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1763);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1764);
				noptrdeclarator(0);
				setState(1765);
				parametersandqualifiers();
				setState(1766);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtrdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPtrdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_ptrdeclarator);
		try {
			setState(1774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1771);
				ptroperator();
				setState(1772);
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
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoptrdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_noptrdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1777);
				declaratorid();
				setState(1779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1778);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1781);
				arraydeclaration();
				setState(1783);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1782);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1785);
				match(LeftParen);
				setState(1786);
				ptrdeclarator();
				setState(1787);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
					setState(1791);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(1792);
					parametersandqualifiers();
					}
					} 
				}
				setState(1797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterArraydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitArraydeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitArraydeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydeclarationContext arraydeclaration() throws RecognitionException {
		ArraydeclarationContext _localctx = new ArraydeclarationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_arraydeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			declaratorid();
			setState(1806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1799);
					match(LeftBracket);
					setState(1801);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
						{
						setState(1800);
						constantexpression();
						}
					}

					setState(1803);
					match(RightBracket);
					}
					} 
				}
				setState(1808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
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
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParametersandqualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParametersandqualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitParametersandqualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			match(LeftParen);
			setState(1810);
			parameterdeclarationclause();
			setState(1811);
			match(RightParen);
			setState(1813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1812);
				cvqualifierseq();
				}
				break;
			}
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1815);
				refqualifier();
				}
				break;
			}
			setState(1819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1818);
				exceptionspecification();
				}
				break;
			}
			setState(1822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1821);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingreturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingreturntype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTrailingreturntype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			match(Arrow);
			setState(1825);
			trailingtypespecifierseq();
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1826);
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
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtroperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtroperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPtroperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ptroperator);
		try {
			setState(1852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1829);
				match(Star);
				setState(1831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1830);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1834);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1833);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1836);
				match(And);
				setState(1838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1837);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1840);
				match(T__2);
				setState(1842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1841);
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
				setState(1844);
				nestednamespecifier(0);
				setState(1845);
				match(Star);
				setState(1847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1846);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1849);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCvqualifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCvqualifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			cvqualifier();
			setState(1856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1855);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCvqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCvqualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCvqualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
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
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRefqualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitRefqualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
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
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclaratorid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDeclaratorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1862);
				match(Ellipsis);
				}
			}

			setState(1865);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterThetypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitThetypeid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitThetypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThetypeidContext thetypeid() throws RecognitionException {
		ThetypeidContext _localctx = new ThetypeidContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_thetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			typespecifierseq();
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1868);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAbstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAbstractdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAbstractdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_abstractdeclarator);
		try {
			setState(1879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1871);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1872);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1875);
				parametersandqualifiers();
				setState(1876);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1878);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtrabstractdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPtrabstractdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_ptrabstractdeclarator);
		try {
			setState(1886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1881);
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
				setState(1882);
				ptroperator();
				setState(1884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1883);
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
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrabstractdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoptrabstractdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 298;
		enterRecursionRule(_localctx, 298, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1889);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1890);
				match(LeftBracket);
				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(1891);
					constantexpression();
					}
				}

				setState(1894);
				match(RightBracket);
				setState(1896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1895);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1898);
				match(LeftParen);
				setState(1899);
				ptrabstractdeclarator();
				setState(1900);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1917);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1915);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1904);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1905);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1906);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1907);
						match(LeftBracket);
						setState(1909);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
							{
							setState(1908);
							constantexpression();
							}
						}

						setState(1911);
						match(RightBracket);
						setState(1913);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
						case 1:
							{
							setState(1912);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAbstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAbstractpackdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAbstractpackdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_abstractpackdeclarator);
		try {
			setState(1924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920);
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
				setState(1921);
				ptroperator();
				setState(1922);
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
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrabstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrabstractpackdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoptrabstractpackdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 302;
		enterRecursionRule(_localctx, 302, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1927);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1940);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1929);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1930);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1931);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1932);
						match(LeftBracket);
						setState(1934);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
							{
							setState(1933);
							constantexpression();
							}
						}

						setState(1936);
						match(RightBracket);
						setState(1938);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
						case 1:
							{
							setState(1937);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
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
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclarationclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclarationclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitParameterdeclarationclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (Alignas - 9)) | (1L << (Auto - 9)) | (1L << (Bool - 9)) | (1L << (Char - 9)) | (1L << (Char16 - 9)) | (1L << (Char32 - 9)) | (1L << (Class - 9)) | (1L << (Const - 9)) | (1L << (Constexpr - 9)) | (1L << (Decltype - 9)) | (1L << (Double - 9)) | (1L << (Enum - 9)) | (1L << (Explicit - 9)) | (1L << (Extern - 9)) | (1L << (Float - 9)) | (1L << (Friend - 9)) | (1L << (Inline - 9)) | (1L << (Int - 9)) | (1L << (Long - 9)) | (1L << (Mutable - 9)) | (1L << (Register - 9)) | (1L << (Short - 9)) | (1L << (Signed - 9)) | (1L << (Static - 9)) | (1L << (Struct - 9)) | (1L << (Thread_local - 9)))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Typedef - 73)) | (1L << (Typename_ - 73)) | (1L << (Union - 73)) | (1L << (Unsigned - 73)) | (1L << (Virtual - 73)) | (1L << (Void - 73)) | (1L << (Volatile - 73)) | (1L << (Wchar - 73)) | (1L << (LeftBracket - 73)) | (1L << (Doublecolon - 73)) | (1L << (Identifier - 73)))) != 0)) {
					{
					setState(1945);
					parameterdeclarationlist(0);
					}
				}

				setState(1949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1948);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1951);
				parameterdeclarationlist(0);
				setState(1952);
				match(Comma);
				setState(1953);
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
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclarationlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitParameterdeclarationlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1958);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1965);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1960);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1961);
					match(Comma);
					setState(1962);
					parameterdeclaration();
					}
					} 
				}
				setState(1967);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitParameterdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1968);
					attributespecifierseq(0);
					}
				}

				setState(1971);
				declspecifierseq();
				setState(1972);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1974);
					attributespecifierseq(0);
					}
				}

				setState(1977);
				declspecifierseq();
				setState(1978);
				declarator();
				setState(1979);
				match(Assign);
				setState(1980);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1982);
					attributespecifierseq(0);
					}
				}

				setState(1985);
				declspecifierseq();
				setState(1987);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1986);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1989);
					attributespecifierseq(0);
					}
				}

				setState(1992);
				declspecifierseq();
				setState(1994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==Decltype || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(1993);
					abstractdeclarator();
					}
				}

				setState(1996);
				match(Assign);
				setState(1997);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiondefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctiondefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_functiondefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			functionhead();
			setState(2002);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionhead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctionhead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionheadContext functionhead() throws RecognitionException {
		FunctionheadContext _localctx = new FunctionheadContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_functionhead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(2004);
				attributespecifierseq(0);
				}
			}

			setState(2008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(2007);
				declspecifierseq();
				}
				break;
			}
			setState(2010);
			declarator();
			setState(2012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(2011);
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
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctionbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_functionbody);
		int _la;
		try {
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2014);
					ctorinitializer();
					}
				}

				setState(2017);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2018);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2019);
				match(Assign);
				setState(2020);
				match(Default);
				setState(2021);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2022);
				match(Assign);
				setState(2023);
				match(Delete);
				setState(2024);
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
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_initializer);
		try {
			setState(2032);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2027);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2028);
				match(LeftParen);
				setState(2029);
				expressionlist();
				setState(2030);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBraceorequalinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBraceorequalinitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBraceorequalinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_braceorequalinitializer);
		try {
			setState(2037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2034);
				match(Assign);
				setState(2035);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2036);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializerclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializerclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitializerclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_initializerclause);
		try {
			setState(2041);
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
				setState(2039);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2040);
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
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializerlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitInitializerlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 322;
		enterRecursionRule(_localctx, 322, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2044);
			initializerclause();
			setState(2046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(2045);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(2048);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2049);
					match(Comma);
					setState(2050);
					initializerclause();
					setState(2052);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
					case 1:
						{
						setState(2051);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
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
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBracedinitlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBracedinitlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBracedinitlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_bracedinitlist);
		int _la;
		try {
			setState(2068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2059);
				match(LeftBrace);
				setState(2060);
				initializerlist(0);
				setState(2062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2061);
					match(Comma);
					}
				}

				setState(2064);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2066);
				match(LeftBrace);
				setState(2067);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_classname);
		try {
			setState(2072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2070);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2071);
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
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
			classhead();
			setState(2075);
			match(LeftBrace);
			setState(2077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Colon - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(2076);
				memberspecification();
				}
			}

			setState(2079);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClasshead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClasshead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClasshead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_classhead);
		int _la;
		try {
			setState(2099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2081);
				classkey();
				setState(2083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2082);
					attributespecifierseq(0);
					}
				}

				setState(2085);
				classheadname();
				setState(2087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2086);
					classvirtspecifier();
					}
				}

				setState(2090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2089);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2092);
				classkey();
				setState(2094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2093);
					attributespecifierseq(0);
					}
				}

				setState(2097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2096);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassheadname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassheadname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassheadname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2101);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2104);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassvirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassvirtspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassvirtspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2106);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClasskey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClasskey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClasskey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2108);
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
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberspecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMemberspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_memberspecification);
		int _la;
		try {
			setState(2119);
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
				setState(2110);
				memberdeclaration();
				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Colon - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(2111);
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
				setState(2114);
				accessspecifier();
				setState(2115);
				match(Colon);
				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Colon - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(2116);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMemberdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_memberdeclaration);
		int _la;
		try {
			setState(2137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2121);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2124);
					declspecifierseq();
					}
					break;
				}
				setState(2128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Tilde - 84)) | (1L << (Colon - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(2127);
					memberdeclaratorlist(0);
					}
				}

				setState(2130);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2131);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2132);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2133);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2134);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2135);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2136);
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
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclaratorlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMemberdeclaratorlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 342;
		enterRecursionRule(_localctx, 342, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2140);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2142);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2143);
					match(Comma);
					setState(2144);
					memberdeclarator();
					}
					} 
				}
				setState(2149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMemberdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_memberdeclarator);
		int _la;
		try {
			setState(2169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2150);
				declarator();
				setState(2152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2151);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2154);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2157);
				declarator();
				setState(2159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2158);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2161);
					match(Identifier);
					}
				}

				setState(2165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2164);
					attributespecifierseq(0);
					}
				}

				setState(2167);
				match(Colon);
				setState(2168);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVirtspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVirtspecifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitVirtspecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 346;
		enterRecursionRule(_localctx, 346, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2172);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2174);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2175);
					virtspecifier();
					}
					} 
				}
				setState(2180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVirtspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitVirtspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2181);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPurespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPurespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPurespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			match(Assign);
			setState(2184);
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
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBaseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBaseclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBaseclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			match(Colon);
			setState(2188);
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
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasespecifierlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasespecifierlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBasespecifierlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2191);
			basespecifier();
			setState(2193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(2192);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2196);
					match(Comma);
					setState(2197);
					basespecifier();
					setState(2199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
					case 1:
						{
						setState(2198);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2205);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBasespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_basespecifier);
		int _la;
		try {
			setState(2227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2206);
					attributespecifierseq(0);
					}
				}

				setState(2209);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2210);
					attributespecifierseq(0);
					}
				}

				setState(2213);
				match(Virtual);
				setState(2215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2214);
					accessspecifier();
					}
				}

				setState(2217);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2218);
					attributespecifierseq(0);
					}
				}

				setState(2221);
				accessspecifier();
				setState(2223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2222);
					match(Virtual);
					}
				}

				setState(2225);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassordecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassordecltype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitClassordecltype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_classordecltype);
		try {
			setState(2234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2229);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2232);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2233);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasetypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasetypespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBasetypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAccessspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAccessspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitAccessspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversionfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversionfunctionid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitConversionfunctionid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			match(Operator);
			setState(2241);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversiontypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversiontypeid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitConversiontypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			typespecifierseq();
			setState(2245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2244);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversiondeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversiondeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitConversiondeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
			ptroperator();
			setState(2249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(2248);
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
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCtorinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCtorinitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCtorinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2251);
			match(Colon);
			setState(2252);
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
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializerlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMeminitializerlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_meminitializerlist);
		int _la;
		try {
			setState(2265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2254);
				meminitializer();
				setState(2256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2255);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2258);
				meminitializer();
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2259);
					match(Ellipsis);
					}
				}

				setState(2262);
				match(Comma);
				setState(2263);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMeminitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_meminitializer);
		int _la;
		try {
			setState(2277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2267);
				meminitializerid();
				setState(2268);
				match(LeftParen);
				setState(2270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(2269);
					expressionlist();
					}
				}

				setState(2272);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2274);
				meminitializerid();
				setState(2275);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializerid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitMeminitializerid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_meminitializerid);
		try {
			setState(2281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2279);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2280);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOperatorfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOperatorfunctionid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitOperatorfunctionid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			match(Operator);
			setState(2284);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLiteraloperatorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLiteraloperatorid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLiteraloperatorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_literaloperatorid);
		try {
			setState(2291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2286);
				match(Operator);
				setState(2287);
				match(Stringliteral);
				setState(2288);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2289);
				match(Operator);
				setState(2290);
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
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplatedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplatedeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplatedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			match(Template);
			setState(2294);
			match(Less);
			setState(2295);
			templateparameterlist(0);
			setState(2296);
			match(Greater);
			setState(2297);
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
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateparameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateparameterlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplateparameterlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 384;
		enterRecursionRule(_localctx, 384, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2300);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2302);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2303);
					match(Comma);
					setState(2304);
					templateparameter();
					}
					} 
				}
				setState(2309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplateparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_templateparameter);
		try {
			setState(2312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2310);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2311);
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
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypeparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_typeparameter);
		int _la;
		try {
			setState(2362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2314);
				match(Class);
				setState(2316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2315);
					match(Ellipsis);
					}
					break;
				}
				setState(2319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2318);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2321);
				match(Class);
				setState(2323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2322);
					match(Identifier);
					}
				}

				setState(2325);
				match(Assign);
				setState(2326);
				thetypeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2327);
				match(Typename_);
				setState(2329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2328);
					match(Ellipsis);
					}
					break;
				}
				setState(2332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2331);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2334);
				match(Typename_);
				setState(2336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2335);
					match(Identifier);
					}
				}

				setState(2338);
				match(Assign);
				setState(2339);
				thetypeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2340);
				match(Template);
				setState(2341);
				match(Less);
				setState(2342);
				templateparameterlist(0);
				setState(2343);
				match(Greater);
				setState(2344);
				match(Class);
				setState(2346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2345);
					match(Ellipsis);
					}
					break;
				}
				setState(2349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2348);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2351);
				match(Template);
				setState(2352);
				match(Less);
				setState(2353);
				templateparameterlist(0);
				setState(2354);
				match(Greater);
				setState(2355);
				match(Class);
				setState(2357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2356);
					match(Identifier);
					}
				}

				setState(2359);
				match(Assign);
				setState(2360);
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
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpletemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpletemplateid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitSimpletemplateid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2364);
			templatename();
			setState(2365);
			match(Less);
			setState(2367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(2366);
				templateargumentlist(0);
				}
			}

			setState(2369);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplateid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_templateid);
		int _la;
		try {
			setState(2386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2371);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2372);
				operatorfunctionid();
				setState(2373);
				match(Less);
				setState(2375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(2374);
					templateargumentlist(0);
					}
				}

				setState(2377);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2379);
				literaloperatorid();
				setState(2380);
				match(Less);
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(2381);
					templateargumentlist(0);
					}
				}

				setState(2384);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplatename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplatename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplatename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
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
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateargumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateargumentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplateargumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 396;
		enterRecursionRule(_localctx, 396, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2391);
			templateargument();
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2392);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2395);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2396);
					match(Comma);
					setState(2397);
					templateargument();
					setState(2399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
					case 1:
						{
						setState(2398);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateargument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTemplateargument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_templateargument);
		try {
			setState(2409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2406);
				thetypeid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2407);
				constantexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2408);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypenamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypenamespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypenamespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_typenamespecifier);
		int _la;
		try {
			setState(2422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2411);
				match(Typename_);
				setState(2412);
				nestednamespecifier(0);
				setState(2413);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2415);
				match(Typename_);
				setState(2416);
				nestednamespecifier(0);
				setState(2418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2417);
					match(Template);
					}
				}

				setState(2420);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExplicitinstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExplicitinstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExplicitinstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2424);
				match(Extern);
				}
			}

			setState(2427);
			match(Template);
			setState(2428);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExplicitspecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExplicitspecialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExplicitspecialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2430);
			match(Template);
			setState(2431);
			match(Less);
			setState(2432);
			match(Greater);
			setState(2433);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTryblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTryblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2435);
			tryblockexpression();
			setState(2436);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiontryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiontryblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctiontryblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_functiontryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			functiontryblockexpression();
			setState(2439);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTryblockexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTryblockexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTryblockexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryblockexpressionContext tryblockexpression() throws RecognitionException {
		TryblockexpressionContext _localctx = new TryblockexpressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_tryblockexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			match(Try);
			setState(2442);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiontryblockexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiontryblockexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitFunctiontryblockexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiontryblockexpressionContext functiontryblockexpression() throws RecognitionException {
		FunctiontryblockexpressionContext _localctx = new FunctiontryblockexpressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_functiontryblockexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2444);
			match(Try);
			setState(2446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2445);
				ctorinitializer();
				}
			}

			setState(2448);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterHandlerseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitHandlerseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitHandlerseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			handler();
			setState(2452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				{
				setState(2451);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			catchexpression();
			setState(2455);
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
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public CatchexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCatchexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCatchexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitCatchexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchexpressionContext catchexpression() throws RecognitionException {
		CatchexpressionContext _localctx = new CatchexpressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_catchexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			match(Catch);
			setState(2458);
			match(LeftParen);
			setState(2459);
			exceptiondeclaration();
			setState(2460);
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
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExceptiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExceptiondeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExceptiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2462);
					attributespecifierseq(0);
					}
				}

				setState(2465);
				typespecifierseq();
				setState(2466);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2468);
					attributespecifierseq(0);
					}
				}

				setState(2471);
				typespecifierseq();
				setState(2473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==Decltype || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(2472);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2475);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterThrowexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitThrowexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitThrowexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
			match(Throw);
			setState(2480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(2479);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExceptionspecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitExceptionspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_exceptionspecification);
		try {
			setState(2484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2482);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2483);
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
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDynamicexceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDynamicexceptionspecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitDynamicexceptionspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2486);
			match(Throw);
			setState(2487);
			match(LeftParen);
			setState(2489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (Auto - 12)) | (1L << (Bool - 12)) | (1L << (Char - 12)) | (1L << (Char16 - 12)) | (1L << (Char32 - 12)) | (1L << (Class - 12)) | (1L << (Const - 12)) | (1L << (Decltype - 12)) | (1L << (Double - 12)) | (1L << (Enum - 12)) | (1L << (Float - 12)) | (1L << (Int - 12)) | (1L << (Long - 12)) | (1L << (Short - 12)) | (1L << (Signed - 12)) | (1L << (Struct - 12)) | (1L << (Typename_ - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Union - 76)) | (1L << (Unsigned - 76)) | (1L << (Void - 76)) | (1L << (Volatile - 76)) | (1L << (Wchar - 76)) | (1L << (Doublecolon - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				setState(2488);
				typeidlist(0);
				}
			}

			setState(2491);
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
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeidlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeidlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTypeidlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 428;
		enterRecursionRule(_localctx, 428, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2494);
			thetypeid();
			setState(2496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2495);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2498);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2499);
					match(Comma);
					setState(2500);
					thetypeid();
					setState(2502);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
					case 1:
						{
						setState(2501);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
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
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoexceptspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoexceptspecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitNoexceptspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_noexceptspecification);
		try {
			setState(2515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2509);
				match(Noexcept);
				setState(2510);
				match(LeftParen);
				setState(2511);
				constantexpression();
				setState(2512);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2514);
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
		public TerminalNode LeftShift() { return getToken(CPP14Parser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(CPP14Parser.RightShift, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPP14Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPP14Parser.LeftShiftAssign, 0); }
		public TheoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTheoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTheoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitTheoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheoperatorContext theoperator() throws RecognitionException {
		TheoperatorContext _localctx = new TheoperatorContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_theoperator);
		try {
			setState(2568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2517);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2518);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2519);
				match(New);
				setState(2520);
				match(LeftBracket);
				setState(2521);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2522);
				match(Delete);
				setState(2523);
				match(LeftBracket);
				setState(2524);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2525);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2526);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2527);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2528);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2529);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2530);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2531);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2532);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2533);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2534);
				match(T__0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2535);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2536);
				match(Assign);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2537);
				match(Less);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2538);
				match(Greater);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2539);
				match(PlusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2540);
				match(MinusAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2541);
				match(StarAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2542);
				match(DivAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2543);
				match(ModAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2544);
				match(XorAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2545);
				match(AndAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2546);
				match(OrAssign);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2547);
				match(LeftShift);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2548);
				match(RightShift);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2549);
				match(RightShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2550);
				match(LeftShiftAssign);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2551);
				match(Equal);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2552);
				match(NotEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2553);
				match(LessEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2554);
				match(GreaterEqual);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2555);
				match(T__2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2556);
				match(T__3);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2557);
				match(T__4);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2558);
				match(T__5);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2559);
				match(PlusPlus);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2560);
				match(MinusMinus);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2561);
				match(Comma);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2562);
				match(ArrowStar);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2563);
				match(Arrow);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2564);
				match(LeftParen);
				setState(2565);
				match(RightParen);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2566);
				match(LeftBracket);
				setState(2567);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_literal);
		try {
			setState(2577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2570);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2571);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2572);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2573);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2574);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2575);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2576);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBooleanliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBooleanliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitBooleanliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2579);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPointerliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPointerliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitPointerliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2581);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUserdefinedliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUserdefinedliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitUserdefinedliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2583);
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
		case 29:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 35:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 36:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 37:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 38:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 40:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 41:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 42:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 43:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 44:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 45:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 46:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 51:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 58:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 76:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 104:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 122:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 125:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 131:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 133:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 137:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 149:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 151:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 153:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 161:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 171:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 173:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 177:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 192:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 198:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 214:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0098\u0a1c\4\2\t"+
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
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\3\2\7"+
		"\2\u01be\n\2\f\2\16\2\u01c1\13\2\5\2\u01c3\n\2\3\2\5\2\u01c6\n\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u01d4\n\4\3\5\3\5\5\5\u01d8"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01e3\n\6\3\7\3\7\5\7\u01e7"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01f6\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u01fd\n\b\3\b\3\b\3\b\7\b\u0202\n\b\f\b\16\b"+
		"\u0205\13\b\3\t\3\t\5\t\u0209\n\t\3\t\3\t\3\n\3\n\5\n\u020f\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0219\n\13\3\f\3\f\3\r\3\r\3\r\5"+
		"\r\u0220\n\r\3\r\3\r\3\r\3\r\5\r\u0226\n\r\7\r\u0228\n\r\f\r\16\r\u022b"+
		"\13\r\3\16\3\16\5\16\u022f\n\16\3\17\3\17\3\17\3\17\5\17\u0235\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u023c\n\20\3\21\3\21\3\21\3\21\5\21\u0242"+
		"\n\21\3\21\5\21\u0245\n\21\3\21\5\21\u0248\n\21\3\21\5\21\u024b\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0254\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u025b\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u028f"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0299\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u02a6\n\22\f\22\16"+
		"\22\u02a9\13\22\3\23\3\23\3\23\3\23\3\23\7\23\u02b0\n\23\f\23\16\23\u02b3"+
		"\13\23\3\24\3\24\3\24\5\24\u02b8\n\24\3\24\3\24\3\24\5\24\u02bd\n\24\3"+
		"\24\5\24\u02c0\n\24\3\24\3\24\3\24\5\24\u02c5\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u02cc\n\24\3\24\3\24\3\24\5\24\u02d1\n\24\3\24\5\24\u02d4\n"+
		"\24\5\24\u02d6\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\5\30\u02df\n\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u02ee\n\30\3\30\3\30\3\30\3\30\5\30\u02f4\n\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0312\n\31\3\32"+
		"\3\32\3\33\5\33\u0317\n\33\3\33\3\33\5\33\u031b\n\33\3\33\3\33\5\33\u031f"+
		"\n\33\3\33\5\33\u0322\n\33\3\33\3\33\5\33\u0326\n\33\3\33\3\33\3\33\3"+
		"\33\5\33\u032c\n\33\5\33\u032e\n\33\3\34\3\34\3\34\3\34\3\35\3\35\5\35"+
		"\u0336\n\35\3\36\3\36\5\36\u033a\n\36\3\36\5\36\u033d\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u0344\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u034b\n\37"+
		"\7\37\u034d\n\37\f\37\16\37\u0350\13\37\3 \3 \5 \u0354\n \3 \3 \5 \u0358"+
		"\n \3!\5!\u035b\n!\3!\3!\3!\5!\u0360\n!\3!\3!\3!\3!\5!\u0366\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0371\n#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\7%\u0380\n%\f%\16%\u0383\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\7&\u0391\n&\f&\16&\u0394\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7"+
		"\'\u039f\n\'\f\'\16\'\u03a2\13\'\3(\3(\3(\3(\3(\3(\3(\7(\u03ab\n(\f(\16"+
		"(\u03ae\13(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u03c1"+
		"\n*\f*\16*\u03c4\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u03cf\n+\f+\16+\u03d2"+
		"\13+\3,\3,\3,\3,\3,\3,\7,\u03da\n,\f,\16,\u03dd\13,\3-\3-\3-\3-\3-\3-"+
		"\7-\u03e5\n-\f-\16-\u03e8\13-\3.\3.\3.\3.\3.\3.\7.\u03f0\n.\f.\16.\u03f3"+
		"\13.\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u03fe\n/\f/\16/\u0401\13/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u040c\n\60\f\60\16\60\u040f\13"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0418\n\61\3\62\3\62\3\62"+
		"\5\62\u041d\n\62\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\7\65\u042b\n\65\f\65\16\65\u042e\13\65\3\66\3\66\3\67\3\67\5\67"+
		"\u0434\n\67\3\67\3\67\5\67\u0438\n\67\3\67\3\67\5\67\u043c\n\67\3\67\3"+
		"\67\5\67\u0440\n\67\3\67\3\67\5\67\u0444\n\67\3\67\3\67\3\67\5\67\u0449"+
		"\n\67\3\67\5\67\u044c\n\67\38\58\u044f\n8\38\38\38\38\58\u0455\n8\38\3"+
		"8\38\38\58\u045b\n8\38\38\38\58\u0460\n8\39\39\39\39\3:\5:\u0467\n:\3"+
		":\3:\3;\3;\5;\u046d\n;\3;\3;\3<\3<\3<\3<\3<\7<\u0476\n<\f<\16<\u0479\13"+
		"<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0486\n=\3>\3>\3>\3>\3>\3?\3?\3"+
		"?\3?\3?\3@\3@\5@\u0494\n@\3@\3@\3@\3@\3@\3@\5@\u049c\n@\3@\3@\3@\3@\5"+
		"@\u04a2\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u04ae\nA\3B\3B\3B\3B\3B\3"+
		"C\3C\3C\3C\3C\3D\3D\3D\3D\5D\u04be\nD\3D\3D\5D\u04c2\nD\3D\3D\3E\3E\3"+
		"E\3E\3E\3E\3E\3F\3F\5F\u04cf\nF\3G\5G\u04d2\nG\3G\3G\3G\3H\3H\5H\u04d9"+
		"\nH\3I\3I\3I\3I\3I\3I\5I\u04e1\nI\3J\3J\3J\3K\3K\3K\3L\3L\5L\u04eb\nL"+
		"\3L\3L\3L\3L\3L\5L\u04f2\nL\3M\3M\3N\3N\3N\3N\3N\7N\u04fb\nN\fN\16N\u04fe"+
		"\13N\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0509\nO\3P\3P\3P\3P\3P\3P\3P\3P\5"+
		"P\u0513\nP\3Q\3Q\3Q\5Q\u0518\nQ\3Q\3Q\3Q\3Q\3R\3R\5R\u0520\nR\3R\5R\u0523"+
		"\nR\3R\3R\3R\5R\u0528\nR\3R\3R\3R\5R\u052d\nR\3S\3S\3S\3S\3T\3T\3T\3T"+
		"\3T\3T\3T\3T\3U\3U\3V\3V\3V\3W\3W\3W\3W\3W\3W\5W\u0546\nW\3X\3X\5X\u054a"+
		"\nX\3X\3X\3X\5X\u054f\nX\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3\\\5\\\u055a\n\\\3"+
		"]\3]\3]\3]\5]\u0560\n]\3^\3^\5^\u0564\n^\3^\3^\3^\5^\u0569\n^\3_\3_\5"+
		"_\u056d\n_\3_\3_\3_\5_\u0572\n_\3`\5`\u0575\n`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u058b\n`\3a\3a\3a\3a\5a\u0591"+
		"\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u059c\nb\3c\3c\5c\u05a0\nc\3c\5c\u05a3"+
		"\nc\3c\3c\3c\3c\3c\3c\3c\3c\5c\u05ad\nc\3c\3c\3c\3c\5c\u05b3\nc\3c\5c"+
		"\u05b6\nc\3d\3d\3e\3e\3e\5e\u05bd\ne\3e\3e\3e\3e\3e\3e\3e\3e\5e\u05c7"+
		"\ne\3f\3f\5f\u05cb\nf\3f\5f\u05ce\nf\3f\5f\u05d1\nf\3f\3f\5f\u05d5\nf"+
		"\3f\3f\3f\5f\u05da\nf\5f\u05dc\nf\3g\3g\5g\u05e0\ng\3g\3g\5g\u05e4\ng"+
		"\3g\3g\3h\3h\3h\3h\3h\5h\u05ed\nh\3i\3i\3i\3j\3j\3j\3j\3j\3j\7j\u05f8"+
		"\nj\fj\16j\u05fb\13j\3k\3k\3k\3k\3k\5k\u0602\nk\3l\3l\3m\3m\5m\u0608\n"+
		"m\3n\3n\3o\3o\5o\u060e\no\3p\3p\5p\u0612\np\3q\5q\u0615\nq\3q\3q\3q\3"+
		"q\3q\3q\3r\5r\u061e\nr\3r\3r\3r\3r\3r\3r\3s\5s\u0627\ns\3s\3s\3s\3s\3"+
		"s\3t\5t\u062f\nt\3u\3u\3v\3v\3v\3v\3v\3v\3w\5w\u063a\nw\3w\3w\3x\3x\5"+
		"x\u0640\nx\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u064b\nx\3y\5y\u064e\ny\3y\3"+
		"y\3y\5y\u0653\ny\3y\3y\3y\3z\3z\3z\3z\3z\3z\3{\3{\3{\3{\5{\u0662\n{\3"+
		"{\3{\3{\3{\5{\u0668\n{\3|\3|\3|\3|\3|\7|\u066f\n|\f|\16|\u0672\13|\3}"+
		"\3}\3}\3}\3}\3}\3}\5}\u067b\n}\3~\3~\3~\3~\5~\u0681\n~\3~\3~\3~\3~\3~"+
		"\3~\5~\u0689\n~\3~\3~\5~\u068d\n~\3\177\3\177\5\177\u0691\n\177\3\177"+
		"\3\177\3\177\5\177\u0696\n\177\3\177\3\177\3\177\5\177\u069b\n\177\3\177"+
		"\3\177\3\177\3\177\3\177\7\177\u06a2\n\177\f\177\16\177\u06a5\13\177\3"+
		"\u0080\3\u0080\5\u0080\u06a9\n\u0080\3\u0081\3\u0081\5\u0081\u06ad\n\u0081"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\5\u0085\u06bb\n\u0085\3\u0085\3\u0085\7\u0085"+
		"\u06bf\n\u0085\f\u0085\16\u0085\u06c2\13\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\6\u0086\u06d1\n\u0086\r\u0086\16\u0086\u06d2\5\u0086\u06d5\n"+
		"\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u06dd\n"+
		"\u0087\f\u0087\16\u0087\u06e0\13\u0087\3\u0088\3\u0088\5\u0088\u06e4\n"+
		"\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u06eb\n\u0089\3"+
		"\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u06f1\n\u008a\3\u008b\3\u008b\3"+
		"\u008b\5\u008b\u06f6\n\u008b\3\u008b\3\u008b\5\u008b\u06fa\n\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\5\u008b\u0700\n\u008b\3\u008b\3\u008b\7\u008b"+
		"\u0704\n\u008b\f\u008b\16\u008b\u0707\13\u008b\3\u008c\3\u008c\3\u008c"+
		"\5\u008c\u070c\n\u008c\3\u008c\7\u008c\u070f\n\u008c\f\u008c\16\u008c"+
		"\u0712\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0718\n\u008d"+
		"\3\u008d\5\u008d\u071b\n\u008d\3\u008d\5\u008d\u071e\n\u008d\3\u008d\5"+
		"\u008d\u0721\n\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u0726\n\u008e\3\u008f"+
		"\3\u008f\5\u008f\u072a\n\u008f\3\u008f\5\u008f\u072d\n\u008f\3\u008f\3"+
		"\u008f\5\u008f\u0731\n\u008f\3\u008f\3\u008f\5\u008f\u0735\n\u008f\3\u008f"+
		"\3\u008f\3\u008f\5\u008f\u073a\n\u008f\3\u008f\5\u008f\u073d\n\u008f\5"+
		"\u008f\u073f\n\u008f\3\u0090\3\u0090\5\u0090\u0743\n\u0090\3\u0091\3\u0091"+
		"\3\u0092\3\u0092\3\u0093\5\u0093\u074a\n\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\5\u0094\u0750\n\u0094\3\u0095\3\u0095\5\u0095\u0754\n\u0095\3"+
		"\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u075a\n\u0095\3\u0096\3\u0096\3"+
		"\u0096\5\u0096\u075f\n\u0096\5\u0096\u0761\n\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\5\u0097\u0767\n\u0097\3\u0097\3\u0097\5\u0097\u076b\n\u0097\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0771\n\u0097\3\u0097\3\u0097\3"+
		"\u0097\3\u0097\3\u0097\5\u0097\u0778\n\u0097\3\u0097\3\u0097\5\u0097\u077c"+
		"\n\u0097\7\u0097\u077e\n\u0097\f\u0097\16\u0097\u0781\13\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\5\u0098\u0787\n\u0098\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0791\n\u0099\3\u0099"+
		"\3\u0099\5\u0099\u0795\n\u0099\7\u0099\u0797\n\u0099\f\u0099\16\u0099"+
		"\u079a\13\u0099\3\u009a\5\u009a\u079d\n\u009a\3\u009a\5\u009a\u07a0\n"+
		"\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u07a6\n\u009a\3\u009b\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u07ae\n\u009b\f\u009b\16"+
		"\u009b\u07b1\13\u009b\3\u009c\5\u009c\u07b4\n\u009c\3\u009c\3\u009c\3"+
		"\u009c\3\u009c\5\u009c\u07ba\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3"+
		"\u009c\3\u009c\5\u009c\u07c2\n\u009c\3\u009c\3\u009c\5\u009c\u07c6\n\u009c"+
		"\3\u009c\5\u009c\u07c9\n\u009c\3\u009c\3\u009c\5\u009c\u07cd\n\u009c\3"+
		"\u009c\3\u009c\3\u009c\5\u009c\u07d2\n\u009c\3\u009d\3\u009d\3\u009d\3"+
		"\u009e\5\u009e\u07d8\n\u009e\3\u009e\5\u009e\u07db\n\u009e\3\u009e\3\u009e"+
		"\5\u009e\u07df\n\u009e\3\u009f\5\u009f\u07e2\n\u009f\3\u009f\3\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u07ec\n\u009f\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u07f3\n\u00a0\3\u00a1\3"+
		"\u00a1\3\u00a1\5\u00a1\u07f8\n\u00a1\3\u00a2\3\u00a2\5\u00a2\u07fc\n\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0801\n\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u0807\n\u00a3\7\u00a3\u0809\n\u00a3\f\u00a3\16\u00a3"+
		"\u080c\13\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0811\n\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0817\n\u00a4\3\u00a5\3\u00a5\5\u00a5"+
		"\u081b\n\u00a5\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0820\n\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a7\3\u00a7\5\u00a7\u0826\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u082a"+
		"\n\u00a7\3\u00a7\5\u00a7\u082d\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u0831\n"+
		"\u00a7\3\u00a7\5\u00a7\u0834\n\u00a7\5\u00a7\u0836\n\u00a7\3\u00a8\5\u00a8"+
		"\u0839\n\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\5\u00ab\u0843\n\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0848\n"+
		"\u00ab\5\u00ab\u084a\n\u00ab\3\u00ac\5\u00ac\u084d\n\u00ac\3\u00ac\5\u00ac"+
		"\u0850\n\u00ac\3\u00ac\5\u00ac\u0853\n\u00ac\3\u00ac\3\u00ac\3\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u085c\n\u00ac\3\u00ad\3\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0864\n\u00ad\f\u00ad\16\u00ad"+
		"\u0867\13\u00ad\3\u00ae\3\u00ae\5\u00ae\u086b\n\u00ae\3\u00ae\5\u00ae"+
		"\u086e\n\u00ae\3\u00ae\3\u00ae\5\u00ae\u0872\n\u00ae\3\u00ae\5\u00ae\u0875"+
		"\n\u00ae\3\u00ae\5\u00ae\u0878\n\u00ae\3\u00ae\3\u00ae\5\u00ae\u087c\n"+
		"\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\7\u00af\u0883\n\u00af\f"+
		"\u00af\16\u00af\u0886\13\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0894"+
		"\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u089a\n\u00b3\7\u00b3"+
		"\u089c\n\u00b3\f\u00b3\16\u00b3\u089f\13\u00b3\3\u00b4\5\u00b4\u08a2\n"+
		"\u00b4\3\u00b4\3\u00b4\5\u00b4\u08a6\n\u00b4\3\u00b4\3\u00b4\5\u00b4\u08aa"+
		"\n\u00b4\3\u00b4\3\u00b4\5\u00b4\u08ae\n\u00b4\3\u00b4\3\u00b4\5\u00b4"+
		"\u08b2\n\u00b4\3\u00b4\3\u00b4\5\u00b4\u08b6\n\u00b4\3\u00b5\5\u00b5\u08b9"+
		"\n\u00b5\3\u00b5\3\u00b5\5\u00b5\u08bd\n\u00b5\3\u00b6\3\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\5\u00b9\u08c8\n\u00b9"+
		"\3\u00ba\3\u00ba\5\u00ba\u08cc\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bc"+
		"\3\u00bc\5\u00bc\u08d3\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u08d7\n\u00bc\3"+
		"\u00bc\3\u00bc\3\u00bc\5\u00bc\u08dc\n\u00bc\3\u00bd\3\u00bd\3\u00bd\5"+
		"\u00bd\u08e1\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u08e8"+
		"\n\u00bd\3\u00be\3\u00be\5\u00be\u08ec\n\u00be\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u08f6\n\u00c0\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\7\u00c2\u0904\n\u00c2\f\u00c2\16\u00c2\u0907\13\u00c2"+
		"\3\u00c3\3\u00c3\5\u00c3\u090b\n\u00c3\3\u00c4\3\u00c4\5\u00c4\u090f\n"+
		"\u00c4\3\u00c4\5\u00c4\u0912\n\u00c4\3\u00c4\3\u00c4\5\u00c4\u0916\n\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u091c\n\u00c4\3\u00c4\5\u00c4"+
		"\u091f\n\u00c4\3\u00c4\3\u00c4\5\u00c4\u0923\n\u00c4\3\u00c4\3\u00c4\3"+
		"\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u092d\n\u00c4\3"+
		"\u00c4\5\u00c4\u0930\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3"+
		"\u00c4\5\u00c4\u0938\n\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u093d\n\u00c4"+
		"\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0942\n\u00c5\3\u00c5\3\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u094a\n\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u0951\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u0955\n"+
		"\u00c6\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u095c\n\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0962\n\u00c8\7\u00c8\u0964\n\u00c8"+
		"\f\u00c8\16\u00c8\u0967\13\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u096c"+
		"\n\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u0975\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u0979\n\u00ca\3\u00cb\5\u00cb\u097c"+
		"\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00d0\3\u00d0\5\u00d0\u0991\n\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1"+
		"\5\u00d1\u0997\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d4\5\u00d4\u09a2\n\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\5\u00d4\u09a8\n\u00d4\3\u00d4\3\u00d4\5\u00d4\u09ac\n\u00d4\3"+
		"\u00d4\5\u00d4\u09af\n\u00d4\3\u00d5\3\u00d5\5\u00d5\u09b3\n\u00d5\3\u00d6"+
		"\3\u00d6\5\u00d6\u09b7\n\u00d6\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u09bc\n"+
		"\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u09c3\n\u00d8\3"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u09c9\n\u00d8\7\u00d8\u09cb\n\u00d8"+
		"\f\u00d8\16\u00d8\u09ce\13\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\5\u00d9\u09d6\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\5\u00da\u0a0b\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\5\u00db\u0a14\n\u00db\3\u00dc\3\u00dc\3\u00dd\3\u00dd"+
		"\3\u00de\3\u00de\3\u00de\2$\16\30\"<HJLNRTVXZ\\^hv\u009a\u00d2\u00f6\u00fc"+
		"\u0108\u010c\u0114\u012c\u0130\u0134\u0144\u0158\u015c\u0164\u0182\u018e"+
		"\u01ae\u00df\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"+
		"\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178"+
		"\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190"+
		"\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8"+
		"\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\2\20\4\2bbff\5"+
		"\2\3\4\\^bd\3\2qr\5\2ffipst\7\2%%\60\60::@@GG\5\2##--QQ\3\2V[\4\2\27\27"+
		"SS\4\2\5\5bb\5\2\26\26CCNN\4\2\'\'\66\66\3\2\679\4\2&&II\3\2\u0091\u0094"+
		"\2\u0b2e\2\u01c2\3\2\2\2\4\u01c9\3\2\2\2\6\u01d3\3\2\2\2\b\u01d7\3\2\2"+
		"\2\n\u01e2\3\2\2\2\f\u01e4\3\2\2\2\16\u01f5\3\2\2\2\20\u0206\3\2\2\2\22"+
		"\u020c\3\2\2\2\24\u0218\3\2\2\2\26\u021a\3\2\2\2\30\u021c\3\2\2\2\32\u022e"+
		"\3\2\2\2\34\u0234\3\2\2\2\36\u023b\3\2\2\2 \u023d\3\2\2\2\"\u028e\3\2"+
		"\2\2$\u02aa\3\2\2\2&\u02d5\3\2\2\2(\u02d7\3\2\2\2*\u02d9\3\2\2\2,\u02db"+
		"\3\2\2\2.\u02f3\3\2\2\2\60\u0311\3\2\2\2\62\u0313\3\2\2\2\64\u032d\3\2"+
		"\2\2\66\u032f\3\2\2\28\u0333\3\2\2\2:\u033c\3\2\2\2<\u033e\3\2\2\2>\u0357"+
		"\3\2\2\2@\u0365\3\2\2\2B\u0367\3\2\2\2D\u0370\3\2\2\2F\u0372\3\2\2\2H"+
		"\u0376\3\2\2\2J\u0384\3\2\2\2L\u0395\3\2\2\2N\u03a3\3\2\2\2P\u03af\3\2"+
		"\2\2R\u03b1\3\2\2\2T\u03c5\3\2\2\2V\u03d3\3\2\2\2X\u03de\3\2\2\2Z\u03e9"+
		"\3\2\2\2\\\u03f4\3\2\2\2^\u0402\3\2\2\2`\u0417\3\2\2\2b\u041c\3\2\2\2"+
		"d\u041e\3\2\2\2f\u0422\3\2\2\2h\u0424\3\2\2\2j\u042f\3\2\2\2l\u044b\3"+
		"\2\2\2n\u045f\3\2\2\2p\u0461\3\2\2\2r\u0466\3\2\2\2t\u046a\3\2\2\2v\u0470"+
		"\3\2\2\2x\u0485\3\2\2\2z\u0487\3\2\2\2|\u048c\3\2\2\2~\u04a1\3\2\2\2\u0080"+
		"\u04ad\3\2\2\2\u0082\u04af\3\2\2\2\u0084\u04b4\3\2\2\2\u0086\u04b9\3\2"+
		"\2\2\u0088\u04c5\3\2\2\2\u008a\u04ce\3\2\2\2\u008c\u04d1\3\2\2\2\u008e"+
		"\u04d8\3\2\2\2\u0090\u04e0\3\2\2\2\u0092\u04e2\3\2\2\2\u0094\u04e5\3\2"+
		"\2\2\u0096\u04f1\3\2\2\2\u0098\u04f3\3\2\2\2\u009a\u04f5\3\2\2\2\u009c"+
		"\u0508\3\2\2\2\u009e\u0512\3\2\2\2\u00a0\u0514\3\2\2\2\u00a2\u052c\3\2"+
		"\2\2\u00a4\u052e\3\2\2\2\u00a6\u0532\3\2\2\2\u00a8\u053a\3\2\2\2\u00aa"+
		"\u053c\3\2\2\2\u00ac\u0545\3\2\2\2\u00ae\u054e\3\2\2\2\u00b0\u0550\3\2"+
		"\2\2\u00b2\u0552\3\2\2\2\u00b4\u0554\3\2\2\2\u00b6\u0559\3\2\2\2\u00b8"+
		"\u055f\3\2\2\2\u00ba\u0568\3\2\2\2\u00bc\u0571\3\2\2\2\u00be\u058a\3\2"+
		"\2\2\u00c0\u0590\3\2\2\2\u00c2\u059b\3\2\2\2\u00c4\u05b5\3\2\2\2\u00c6"+
		"\u05b7\3\2\2\2\u00c8\u05c6\3\2\2\2\u00ca\u05db\3\2\2\2\u00cc\u05dd\3\2"+
		"\2\2\u00ce\u05ec\3\2\2\2\u00d0\u05ee\3\2\2\2\u00d2\u05f1\3\2\2\2\u00d4"+
		"\u0601\3\2\2\2\u00d6\u0603\3\2\2\2\u00d8\u0607\3\2\2\2\u00da\u0609\3\2"+
		"\2\2\u00dc\u060d\3\2\2\2\u00de\u0611\3\2\2\2\u00e0\u0614\3\2\2\2\u00e2"+
		"\u061d\3\2\2\2\u00e4\u0626\3\2\2\2\u00e6\u062e\3\2\2\2\u00e8\u0630\3\2"+
		"\2\2\u00ea\u0632\3\2\2\2\u00ec\u0639\3\2\2\2\u00ee\u064a\3\2\2\2\u00f0"+
		"\u064d\3\2\2\2\u00f2\u0657\3\2\2\2\u00f4\u0667\3\2\2\2\u00f6\u0669\3\2"+
		"\2\2\u00f8\u067a\3\2\2\2\u00fa\u068c\3\2\2\2\u00fc\u0695\3\2\2\2\u00fe"+
		"\u06a6\3\2\2\2\u0100\u06ac\3\2\2\2\u0102\u06ae\3\2\2\2\u0104\u06b2\3\2"+
		"\2\2\u0106\u06b4\3\2\2\2\u0108\u06b8\3\2\2\2\u010a\u06d4\3\2\2\2\u010c"+
		"\u06d6\3\2\2\2\u010e\u06e1\3\2\2\2\u0110\u06ea\3\2\2\2\u0112\u06f0\3\2"+
		"\2\2\u0114\u06ff\3\2\2\2\u0116\u0708\3\2\2\2\u0118\u0713\3\2\2\2\u011a"+
		"\u0722\3\2\2\2\u011c\u073e\3\2\2\2\u011e\u0740\3\2\2\2\u0120\u0744\3\2"+
		"\2\2\u0122\u0746\3\2\2\2\u0124\u0749\3\2\2\2\u0126\u074d\3\2\2\2\u0128"+
		"\u0759\3\2\2\2\u012a\u0760\3\2\2\2\u012c\u0770\3\2\2\2\u012e\u0786\3\2"+
		"\2\2\u0130\u0788\3\2\2\2\u0132\u07a5\3\2\2\2\u0134\u07a7\3\2\2\2\u0136"+
		"\u07d1\3\2\2\2\u0138\u07d3\3\2\2\2\u013a\u07d7\3\2\2\2\u013c\u07eb\3\2"+
		"\2\2\u013e\u07f2\3\2\2\2\u0140\u07f7\3\2\2\2\u0142\u07fb\3\2\2\2\u0144"+
		"\u07fd\3\2\2\2\u0146\u0816\3\2\2\2\u0148\u081a\3\2\2\2\u014a\u081c\3\2"+
		"\2\2\u014c\u0835\3\2\2\2\u014e\u0838\3\2\2\2\u0150\u083c\3\2\2\2\u0152"+
		"\u083e\3\2\2\2\u0154\u0849\3\2\2\2\u0156\u085b\3\2\2\2\u0158\u085d\3\2"+
		"\2\2\u015a\u087b\3\2\2\2\u015c\u087d\3\2\2\2\u015e\u0887\3\2\2\2\u0160"+
		"\u0889\3\2\2\2\u0162\u088d\3\2\2\2\u0164\u0890\3\2\2\2\u0166\u08b5\3\2"+
		"\2\2\u0168\u08bc\3\2\2\2\u016a\u08be\3\2\2\2\u016c\u08c0\3\2\2\2\u016e"+
		"\u08c2\3\2\2\2\u0170\u08c5\3\2\2\2\u0172\u08c9\3\2\2\2\u0174\u08cd\3\2"+
		"\2\2\u0176\u08db\3\2\2\2\u0178\u08e7\3\2\2\2\u017a\u08eb\3\2\2\2\u017c"+
		"\u08ed\3\2\2\2\u017e\u08f5\3\2\2\2\u0180\u08f7\3\2\2\2\u0182\u08fd\3\2"+
		"\2\2\u0184\u090a\3\2\2\2\u0186\u093c\3\2\2\2\u0188\u093e\3\2\2\2\u018a"+
		"\u0954\3\2\2\2\u018c\u0956\3\2\2\2\u018e\u0958\3\2\2\2\u0190\u096b\3\2"+
		"\2\2\u0192\u0978\3\2\2\2\u0194\u097b\3\2\2\2\u0196\u0980\3\2\2\2\u0198"+
		"\u0985\3\2\2\2\u019a\u0988\3\2\2\2\u019c\u098b\3\2\2\2\u019e\u098e\3\2"+
		"\2\2\u01a0\u0994\3\2\2\2\u01a2\u0998\3\2\2\2\u01a4\u099b\3\2\2\2\u01a6"+
		"\u09ae\3\2\2\2\u01a8\u09b0\3\2\2\2\u01aa\u09b6\3\2\2\2\u01ac\u09b8\3\2"+
		"\2\2\u01ae\u09bf\3\2\2\2\u01b0\u09d5\3\2\2\2\u01b2\u0a0a\3\2\2\2\u01b4"+
		"\u0a13\3\2\2\2\u01b6\u0a15\3\2\2\2\u01b8\u0a17\3\2\2\2\u01ba\u0a19\3\2"+
		"\2\2\u01bc\u01be\5\4\3\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01c6\5\u009aN\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7"+
		"\3\2\2\2\u01c7\u01c8\7\2\2\3\u01c8\3\3\2\2\2\u01c9\u01ca\7\n\2\2\u01ca"+
		"\5\3\2\2\2\u01cb\u01d4\5\u01b4\u00db\2\u01cc\u01d4\7F\2\2\u01cd\u01ce"+
		"\7V\2\2\u01ce\u01cf\5h\65\2\u01cf\u01d0\7W\2\2\u01d0\u01d4\3\2\2\2\u01d1"+
		"\u01d4\5\b\5\2\u01d2\u01d4\5\20\t\2\u01d3\u01cb\3\2\2\2\u01d3\u01cc\3"+
		"\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\7\3\2\2\2\u01d5\u01d8\5\n\6\2\u01d6\u01d8\5\f\7\2\u01d7\u01d5\3\2\2\2"+
		"\u01d7\u01d6\3\2\2\2\u01d8\t\3\2\2\2\u01d9\u01e3\7\u0087\2\2\u01da\u01e3"+
		"\5\u017c\u00bf\2\u01db\u01e3\5\u016e\u00b8\2\u01dc\u01e3\5\u017e\u00c0"+
		"\2\u01dd\u01de\7d\2\2\u01de\u01e3\5\u0148\u00a5\2\u01df\u01e0\7d\2\2\u01e0"+
		"\u01e3\5\u00c2b\2\u01e1\u01e3\5\u018a\u00c6\2\u01e2\u01d9\3\2\2\2\u01e2"+
		"\u01da\3\2\2\2\u01e2\u01db\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e2\u01dd\3\2"+
		"\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\13\3\2\2\2\u01e4\u01e6"+
		"\5\16\b\2\u01e5\u01e7\7E\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\5\n\6\2\u01e9\r\3\2\2\2\u01ea\u01eb\b\b\1\2"+
		"\u01eb\u01f6\7\u0082\2\2\u01ec\u01ed\5\u00c0a\2\u01ed\u01ee\7\u0082\2"+
		"\2\u01ee\u01f6\3\2\2\2\u01ef\u01f0\5\u00d8m\2\u01f0\u01f1\7\u0082\2\2"+
		"\u01f1\u01f6\3\2\2\2\u01f2\u01f3\5\u00c2b\2\u01f3\u01f4\7\u0082\2\2\u01f4"+
		"\u01f6\3\2\2\2\u01f5\u01ea\3\2\2\2\u01f5\u01ec\3\2\2\2\u01f5\u01ef\3\2"+
		"\2\2\u01f5\u01f2\3\2\2\2\u01f6\u0203\3\2\2\2\u01f7\u01f8\f\4\2\2\u01f8"+
		"\u01f9\7\u0087\2\2\u01f9\u0202\7\u0082\2\2\u01fa\u01fc\f\3\2\2\u01fb\u01fd"+
		"\7E\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\5\u0188\u00c5\2\u01ff\u0200\7\u0082\2\2\u0200\u0202\3\2\2\2\u0201"+
		"\u01f7\3\2\2\2\u0201\u01fa\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204\17\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0208"+
		"\5\22\n\2\u0207\u0209\5 \21\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2"+
		"\u0209\u020a\3\2\2\2\u020a\u020b\5t;\2\u020b\21\3\2\2\2\u020c\u020e\7"+
		"X\2\2\u020d\u020f\5\24\13\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0211\7Y\2\2\u0211\23\3\2\2\2\u0212\u0219\5\26\f"+
		"\2\u0213\u0219\5\30\r\2\u0214\u0215\5\26\f\2\u0215\u0216\7}\2\2\u0216"+
		"\u0217\5\30\r\2\u0217\u0219\3\2\2\2\u0218\u0212\3\2\2\2\u0218\u0213\3"+
		"\2\2\2\u0218\u0214\3\2\2\2\u0219\25\3\2\2\2\u021a\u021b\t\2\2\2\u021b"+
		"\27\3\2\2\2\u021c\u021d\b\r\1\2\u021d\u021f\5\32\16\2\u021e\u0220\7\u0086"+
		"\2\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0229\3\2\2\2\u0221"+
		"\u0222\f\3\2\2\u0222\u0223\7}\2\2\u0223\u0225\5\32\16\2\u0224\u0226\7"+
		"\u0086\2\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2\2\2"+
		"\u0227\u0221\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\31\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022f\5\34\17\2\u022d"+
		"\u022f\5\36\20\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2\2\2\u022f\33\3\2"+
		"\2\2\u0230\u0235\7\u0087\2\2\u0231\u0232\7b\2\2\u0232\u0235\7\u0087\2"+
		"\2\u0233\u0235\7F\2\2\u0234\u0230\3\2\2\2\u0234\u0231\3\2\2\2\u0234\u0233"+
		"\3\2\2\2\u0235\35\3\2\2\2\u0236\u0237\7\u0087\2\2\u0237\u023c\5\u013e"+
		"\u00a0\2\u0238\u0239\7b\2\2\u0239\u023a\7\u0087\2\2\u023a\u023c\5\u013e"+
		"\u00a0\2\u023b\u0236\3\2\2\2\u023b\u0238\3\2\2\2\u023c\37\3\2\2\2\u023d"+
		"\u023e\7V\2\2\u023e\u023f\5\u0132\u009a\2\u023f\u0241\7W\2\2\u0240\u0242"+
		"\7\60\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2"+
		"\u0243\u0245\5\u01aa\u00d6\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0247\3\2\2\2\u0246\u0248\5\u00f6|\2\u0247\u0246\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u024b\5\u011a\u008e\2\u024a\u0249\3"+
		"\2\2\2\u024a\u024b\3\2\2\2\u024b!\3\2\2\2\u024c\u024d\b\22\1\2\u024d\u028f"+
		"\5&\24\2\u024e\u028f\5\6\4\2\u024f\u028f\5$\23\2\u0250\u0251\5\u00be`"+
		"\2\u0251\u0253\7V\2\2\u0252\u0254\5,\27\2\u0253\u0252\3\2\2\2\u0253\u0254"+
		"\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\7W\2\2\u0256\u028f\3\2\2\2\u0257"+
		"\u0258\5\u0192\u00ca\2\u0258\u025a\7V\2\2\u0259\u025b\5,\27\2\u025a\u0259"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\7W\2\2\u025d"+
		"\u028f\3\2\2\2\u025e\u025f\5\u00be`\2\u025f\u0260\5\u0146\u00a4\2\u0260"+
		"\u028f\3\2\2\2\u0261\u0262\5\u0192\u00ca\2\u0262\u0263\5\u0146\u00a4\2"+
		"\u0263\u028f\3\2\2\2\u0264\u0265\7 \2\2\u0265\u0266\7g\2\2\u0266\u0267"+
		"\5\u0126\u0094\2\u0267\u0268\7h\2\2\u0268\u0269\7V\2\2\u0269\u026a\5h"+
		"\65\2\u026a\u026b\7W\2\2\u026b\u028f\3\2\2\2\u026c\u026d\7B\2\2\u026d"+
		"\u026e\7g\2\2\u026e\u026f\5\u0126\u0094\2\u026f\u0270\7h\2\2\u0270\u0271"+
		"\7V\2\2\u0271\u0272\5h\65\2\u0272\u0273\7W\2\2\u0273\u028f\3\2\2\2\u0274"+
		"\u0275\7;\2\2\u0275\u0276\7g\2\2\u0276\u0277\5\u0126\u0094\2\u0277\u0278"+
		"\7h\2\2\u0278\u0279\7V\2\2\u0279\u027a\5h\65\2\u027a\u027b\7W\2\2\u027b"+
		"\u028f\3\2\2\2\u027c\u027d\7\31\2\2\u027d\u027e\7g\2\2\u027e\u027f\5\u0126"+
		"\u0094\2\u027f\u0280\7h\2\2\u0280\u0281\7V\2\2\u0281\u0282\5h\65\2\u0282"+
		"\u0283\7W\2\2\u0283\u028f\3\2\2\2\u0284\u0285\5*\26\2\u0285\u0286\7V\2"+
		"\2\u0286\u0287\5h\65\2\u0287\u0288\7W\2\2\u0288\u028f\3\2\2\2\u0289\u028a"+
		"\5*\26\2\u028a\u028b\7V\2\2\u028b\u028c\5\u0126\u0094\2\u028c\u028d\7"+
		"W\2\2\u028d\u028f\3\2\2\2\u028e\u024c\3\2\2\2\u028e\u024e\3\2\2\2\u028e"+
		"\u024f\3\2\2\2\u028e\u0250\3\2\2\2\u028e\u0257\3\2\2\2\u028e\u025e\3\2"+
		"\2\2\u028e\u0261\3\2\2\2\u028e\u0264\3\2\2\2\u028e\u026c\3\2\2\2\u028e"+
		"\u0274\3\2\2\2\u028e\u027c\3\2\2\2\u028e\u0284\3\2\2\2\u028e\u0289\3\2"+
		"\2\2\u028f\u02a7\3\2\2\2\u0290\u0291\f\22\2\2\u0291\u0292\7X\2\2\u0292"+
		"\u0293\5\u0146\u00a4\2\u0293\u0294\7Y\2\2\u0294\u02a6\3\2\2\2\u0295\u0296"+
		"\f\21\2\2\u0296\u0298\7V\2\2\u0297\u0299\5,\27\2\u0298\u0297\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u02a6\7W\2\2\u029b\u029c\f\f"+
		"\2\2\u029c\u029d\7\u0084\2\2\u029d\u02a6\5.\30\2\u029e\u029f\f\13\2\2"+
		"\u029f\u02a0\7\177\2\2\u02a0\u02a6\5.\30\2\u02a1\u02a2\f\n\2\2\u02a2\u02a6"+
		"\7{\2\2\u02a3\u02a4\f\t\2\2\u02a4\u02a6\7|\2\2\u02a5\u0290\3\2\2\2\u02a5"+
		"\u0295\3\2\2\2\u02a5\u029b\3\2\2\2\u02a5\u029e\3\2\2\2\u02a5\u02a1\3\2"+
		"\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8#\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02b1\5\6\4\2"+
		"\u02ab\u02ac\7X\2\2\u02ac\u02ad\5h\65\2\u02ad\u02ae\7Y\2\2\u02ae\u02b0"+
		"\3\2\2\2\u02af\u02ab\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2%\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\5\6\4\2"+
		"\u02b5\u02b7\7\u0084\2\2\u02b6\u02b8\7E\2\2\u02b7\u02b6\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bf\5\b\5\2\u02ba\u02bc\7V"+
		"\2\2\u02bb\u02bd\5,\27\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02c0\7W\2\2\u02bf\u02ba\3\2\2\2\u02bf\u02c0\3\2"+
		"\2\2\u02c0\u02d6\3\2\2\2\u02c1\u02c2\5\6\4\2\u02c2\u02c4\7V\2\2\u02c3"+
		"\u02c5\5,\27\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c6\u02c7\7W\2\2\u02c7\u02d6\3\2\2\2\u02c8\u02c9\5\6\4\2\u02c9"+
		"\u02cb\7\177\2\2\u02ca\u02cc\7E\2\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3"+
		"\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02d3\5\b\5\2\u02ce\u02d0\7V\2\2\u02cf"+
		"\u02d1\5,\27\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2"+
		"\2\2\u02d2\u02d4\7W\2\2\u02d3\u02ce\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d6\3\2\2\2\u02d5\u02b4\3\2\2\2\u02d5\u02c1\3\2\2\2\u02d5\u02c8\3\2"+
		"\2\2\u02d6\'\3\2\2\2\u02d7\u02d8\7L\2\2\u02d8)\3\2\2\2\u02d9\u02da\7L"+
		"\2\2\u02da+\3\2\2\2\u02db\u02dc\5\u0144\u00a3\2\u02dc-\3\2\2\2\u02dd\u02df"+
		"\5\16\b\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2"+
		"\u02e0\u02e1\5\u00c0a\2\u02e1\u02e2\7\u0082\2\2\u02e2\u02e3\7d\2\2\u02e3"+
		"\u02e4\5\u00c0a\2\u02e4\u02f4\3\2\2\2\u02e5\u02e6\5\16\b\2\u02e6\u02e7"+
		"\7E\2\2\u02e7\u02e8\5\u0188\u00c5\2\u02e8\u02e9\7\u0082\2\2\u02e9\u02ea"+
		"\7d\2\2\u02ea\u02eb\5\u00c0a\2\u02eb\u02f4\3\2\2\2\u02ec\u02ee\5\16\b"+
		"\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0"+
		"\7d\2\2\u02f0\u02f4\5\u00c0a\2\u02f1\u02f2\7d\2\2\u02f2\u02f4\5\u00c2"+
		"b\2\u02f3\u02de\3\2\2\2\u02f3\u02e5\3\2\2\2\u02f3\u02ed\3\2\2\2\u02f3"+
		"\u02f1\3\2\2\2\u02f4/\3\2\2\2\u02f5\u0312\5\"\22\2\u02f6\u02f7\7{\2\2"+
		"\u02f7\u0312\5D#\2\u02f8\u02f9\7|\2\2\u02f9\u0312\5D#\2\u02fa\u02fb\5"+
		"\62\32\2\u02fb\u02fc\5D#\2\u02fc\u0312\3\2\2\2\u02fd\u02fe\7?\2\2\u02fe"+
		"\u0312\5\60\31\2\u02ff\u0300\7?\2\2\u0300\u0301\7V\2\2\u0301\u0302\5\u0126"+
		"\u0094\2\u0302\u0303\7W\2\2\u0303\u0312\3\2\2\2\u0304\u0305\7?\2\2\u0305"+
		"\u0306\7\u0086\2\2\u0306\u0307\7V\2\2\u0307\u0308\7\u0087\2\2\u0308\u0312"+
		"\7W\2\2\u0309\u030a\7\f\2\2\u030a\u030b\7V\2\2\u030b\u030c\5\u0126\u0094"+
		"\2\u030c\u030d\7W\2\2\u030d\u0312\3\2\2\2\u030e\u0312\5B\"\2\u030f\u0312"+
		"\5\64\33\2\u0310\u0312\5@!\2\u0311\u02f5\3\2\2\2\u0311\u02f6\3\2\2\2\u0311"+
		"\u02f8\3\2\2\2\u0311\u02fa\3\2\2\2\u0311\u02fd\3\2\2\2\u0311\u02ff\3\2"+
		"\2\2\u0311\u0304\3\2\2\2\u0311\u0309\3\2\2\2\u0311\u030e\3\2\2\2\u0311"+
		"\u030f\3\2\2\2\u0311\u0310\3\2\2\2\u0312\61\3\2\2\2\u0313\u0314\t\3\2"+
		"\2\u0314\63\3\2\2\2\u0315\u0317\7\u0082\2\2\u0316\u0315\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\7\62\2\2\u0319\u031b\5"+
		"\66\34\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u031e\58\35\2\u031d\u031f\5> \2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2"+
		"\2\u031f\u032e\3\2\2\2\u0320\u0322\7\u0082\2\2\u0321\u0320\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\7\62\2\2\u0324\u0326\5"+
		"\66\34\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0328\7V\2\2\u0328\u0329\5\u0126\u0094\2\u0329\u032b\7W\2\2\u032a\u032c"+
		"\5> \2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032e\3\2\2\2\u032d"+
		"\u0316\3\2\2\2\u032d\u0321\3\2\2\2\u032e\65\3\2\2\2\u032f\u0330\7V\2\2"+
		"\u0330\u0331\5,\27\2\u0331\u0332\7W\2\2\u0332\67\3\2\2\2\u0333\u0335\5"+
		"\u00ba^\2\u0334\u0336\5:\36\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2"+
		"\u03369\3\2\2\2\u0337\u0339\5\u011c\u008f\2\u0338\u033a\5:\36\2\u0339"+
		"\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u033d\5<"+
		"\37\2\u033c\u0337\3\2\2\2\u033c\u033b\3\2\2\2\u033d;\3\2\2\2\u033e\u033f"+
		"\b\37\1\2\u033f\u0340\7X\2\2\u0340\u0341\5h\65\2\u0341\u0343\7Y\2\2\u0342"+
		"\u0344\5\u00f6|\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u034e"+
		"\3\2\2\2\u0345\u0346\f\3\2\2\u0346\u0347\7X\2\2\u0347\u0348\5j\66\2\u0348"+
		"\u034a\7Y\2\2\u0349\u034b\5\u00f6|\2\u034a\u0349\3\2\2\2\u034a\u034b\3"+
		"\2\2\2\u034b\u034d\3\2\2\2\u034c\u0345\3\2\2\2\u034d\u0350\3\2\2\2\u034e"+
		"\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f=\3\2\2\2\u0350\u034e\3\2\2\2"+
		"\u0351\u0353\7V\2\2\u0352\u0354\5,\27\2\u0353\u0352\3\2\2\2\u0353\u0354"+
		"\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0358\7W\2\2\u0356\u0358\5\u0146\u00a4"+
		"\2\u0357\u0351\3\2\2\2\u0357\u0356\3\2\2\2\u0358?\3\2\2\2\u0359\u035b"+
		"\7\u0082\2\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2"+
		"\2\u035c\u035d\7\35\2\2\u035d\u0366\5D#\2\u035e\u0360\7\u0082\2\2\u035f"+
		"\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\7\35"+
		"\2\2\u0362\u0363\7X\2\2\u0363\u0364\7Y\2\2\u0364\u0366\5D#\2\u0365\u035a"+
		"\3\2\2\2\u0365\u035f\3\2\2\2\u0366A\3\2\2\2\u0367\u0368\7\63\2\2\u0368"+
		"\u0369\7V\2\2\u0369\u036a\5h\65\2\u036a\u036b\7W\2\2\u036bC\3\2\2\2\u036c"+
		"\u0371\5\60\31\2\u036d\u036e\5F$\2\u036e\u036f\5D#\2\u036f\u0371\3\2\2"+
		"\2\u0370\u036c\3\2\2\2\u0370\u036d\3\2\2\2\u0371E\3\2\2\2\u0372\u0373"+
		"\7V\2\2\u0373\u0374\5\u0126\u0094\2\u0374\u0375\7W\2\2\u0375G\3\2\2\2"+
		"\u0376\u0377\b%\1\2\u0377\u0378\5D#\2\u0378\u0381\3\2\2\2\u0379\u037a"+
		"\f\4\2\2\u037a\u037b\7\u0085\2\2\u037b\u0380\5D#\2\u037c\u037d\f\3\2\2"+
		"\u037d\u037e\7~\2\2\u037e\u0380\5D#\2\u037f\u0379\3\2\2\2\u037f\u037c"+
		"\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382"+
		"I\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0385\b&\1\2\u0385\u0386\5H%\2\u0386"+
		"\u0392\3\2\2\2\u0387\u0388\f\5\2\2\u0388\u0389\7^\2\2\u0389\u0391\5H%"+
		"\2\u038a\u038b\f\4\2\2\u038b\u038c\7_\2\2\u038c\u0391\5H%\2\u038d\u038e"+
		"\f\3\2\2\u038e\u038f\7`\2\2\u038f\u0391\5H%\2\u0390\u0387\3\2\2\2\u0390"+
		"\u038a\3\2\2\2\u0390\u038d\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2"+
		"\2\2\u0392\u0393\3\2\2\2\u0393K\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0396"+
		"\b\'\1\2\u0396\u0397\5J&\2\u0397\u03a0\3\2\2\2\u0398\u0399\f\4\2\2\u0399"+
		"\u039a\7\\\2\2\u039a\u039f\5J&\2\u039b\u039c\f\3\2\2\u039c\u039d\7]\2"+
		"\2\u039d\u039f\5J&\2\u039e\u0398\3\2\2\2\u039e\u039b\3\2\2\2\u039f\u03a2"+
		"\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1M\3\2\2\2\u03a2"+
		"\u03a0\3\2\2\2\u03a3\u03a4\b(\1\2\u03a4\u03a5\5L\'\2\u03a5\u03ac\3\2\2"+
		"\2\u03a6\u03a7\f\3\2\2\u03a7\u03a8\5P)\2\u03a8\u03a9\5L\'\2\u03a9\u03ab"+
		"\3\2\2\2\u03aa\u03a6\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03adO\3\2\2\2\u03ae\u03ac\3\2\2\2\u03af\u03b0\t\4\2\2"+
		"\u03b0Q\3\2\2\2\u03b1\u03b2\b*\1\2\u03b2\u03b3\5N(\2\u03b3\u03c2\3\2\2"+
		"\2\u03b4\u03b5\f\6\2\2\u03b5\u03b6\7g\2\2\u03b6\u03c1\5N(\2\u03b7\u03b8"+
		"\f\5\2\2\u03b8\u03b9\7h\2\2\u03b9\u03c1\5N(\2\u03ba\u03bb\f\4\2\2\u03bb"+
		"\u03bc\7w\2\2\u03bc\u03c1\5N(\2\u03bd\u03be\f\3\2\2\u03be\u03bf\7x\2\2"+
		"\u03bf\u03c1\5N(\2\u03c0\u03b4\3\2\2\2\u03c0\u03b7\3\2\2\2\u03c0\u03ba"+
		"\3\2\2\2\u03c0\u03bd\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2"+
		"\u03c3\3\2\2\2\u03c3S\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5\u03c6\b+\1\2\u03c6"+
		"\u03c7\5R*\2\u03c7\u03d0\3\2\2\2\u03c8\u03c9\f\4\2\2\u03c9\u03ca\7u\2"+
		"\2\u03ca\u03cf\5R*\2\u03cb\u03cc\f\3\2\2\u03cc\u03cd\7v\2\2\u03cd\u03cf"+
		"\5R*\2\u03ce\u03c8\3\2\2\2\u03ce\u03cb\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0"+
		"\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1U\3\2\2\2\u03d2\u03d0\3\2\2\2"+
		"\u03d3\u03d4\b,\1\2\u03d4\u03d5\5T+\2\u03d5\u03db\3\2\2\2\u03d6\u03d7"+
		"\f\3\2\2\u03d7\u03d8\7b\2\2\u03d8\u03da\5T+\2\u03d9\u03d6\3\2\2\2\u03da"+
		"\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dcW\3\2\2\2"+
		"\u03dd\u03db\3\2\2\2\u03de\u03df\b-\1\2\u03df\u03e0\5V,\2\u03e0\u03e6"+
		"\3\2\2\2\u03e1\u03e2\f\3\2\2\u03e2\u03e3\7a\2\2\u03e3\u03e5\5V,\2\u03e4"+
		"\u03e1\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2"+
		"\2\2\u03e7Y\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03ea\b.\1\2\u03ea\u03eb"+
		"\5X-\2\u03eb\u03f1\3\2\2\2\u03ec\u03ed\f\3\2\2\u03ed\u03ee\7c\2\2\u03ee"+
		"\u03f0\5X-\2\u03ef\u03ec\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2"+
		"\2\u03f1\u03f2\3\2\2\2\u03f2[\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f5"+
		"\b/\1\2\u03f5\u03f6\5Z.\2\u03f6\u03ff\3\2\2\2\u03f7\u03f8\f\4\2\2\u03f8"+
		"\u03f9\7\5\2\2\u03f9\u03fe\5Z.\2\u03fa\u03fb\f\3\2\2\u03fb\u03fc\7\6\2"+
		"\2\u03fc\u03fe\5Z.\2\u03fd\u03f7\3\2\2\2\u03fd\u03fa\3\2\2\2\u03fe\u0401"+
		"\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400]\3\2\2\2\u0401"+
		"\u03ff\3\2\2\2\u0402\u0403\b\60\1\2\u0403\u0404\5\\/\2\u0404\u040d\3\2"+
		"\2\2\u0405\u0406\f\4\2\2\u0406\u0407\7\7\2\2\u0407\u040c\5\\/\2\u0408"+
		"\u0409\f\3\2\2\u0409\u040a\7\b\2\2\u040a\u040c\5\\/\2\u040b\u0405\3\2"+
		"\2\2\u040b\u0408\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d"+
		"\u040e\3\2\2\2\u040e_\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0418\5^\60\2"+
		"\u0411\u0412\5^\60\2\u0412\u0413\7\u0080\2\2\u0413\u0414\5h\65\2\u0414"+
		"\u0415\7\u0081\2\2\u0415\u0416\5b\62\2\u0416\u0418\3\2\2\2\u0417\u0410"+
		"\3\2\2\2\u0417\u0411\3\2\2\2\u0418a\3\2\2\2\u0419\u041d\5`\61\2\u041a"+
		"\u041d\5d\63\2\u041b\u041d\5\u01a8\u00d5\2\u041c\u0419\3\2\2\2\u041c\u041a"+
		"\3\2\2\2\u041c\u041b\3\2\2\2\u041dc\3\2\2\2\u041e\u041f\5^\60\2\u041f"+
		"\u0420\5f\64\2\u0420\u0421\5\u0142\u00a2\2\u0421e\3\2\2\2\u0422\u0423"+
		"\t\5\2\2\u0423g\3\2\2\2\u0424\u0425\b\65\1\2\u0425\u0426\5b\62\2\u0426"+
		"\u042c\3\2\2\2\u0427\u0428\f\3\2\2\u0428\u0429\7}\2\2\u0429\u042b\5b\62"+
		"\2\u042a\u0427\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d"+
		"\3\2\2\2\u042di\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u0430\5`\61\2\u0430"+
		"k\3\2\2\2\u0431\u044c\5n8\2\u0432\u0434\5\u00f6|\2\u0433\u0432\3\2\2\2"+
		"\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u044c\5r:\2\u0436\u0438"+
		"\5\u00f6|\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\3\2\2"+
		"\2\u0439\u044c\5t;\2\u043a\u043c\5\u00f6|\2\u043b\u043a\3\2\2\2\u043b"+
		"\u043c\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u044c\5x=\2\u043e\u0440\5\u00f6"+
		"|\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441"+
		"\u044c\5\u0080A\2\u0442\u0444\5\u00f6|\2\u0443\u0442\3\2\2\2\u0443\u0444"+
		"\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u044c\5\u0090I\2\u0446\u044c\5\u0098"+
		"M\2\u0447\u0449\5\u00f6|\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449"+
		"\u044a\3\2\2\2\u044a\u044c\5\u0198\u00cd\2\u044b\u0431\3\2\2\2\u044b\u0433"+
		"\3\2\2\2\u044b\u0437\3\2\2\2\u044b\u043b\3\2\2\2\u044b\u043f\3\2\2\2\u044b"+
		"\u0443\3\2\2\2\u044b\u0446\3\2\2\2\u044b\u0448\3\2\2\2\u044cm\3\2\2\2"+
		"\u044d\u044f\5\u00f6|\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f"+
		"\u0450\3\2\2\2\u0450\u0451\7\u0087\2\2\u0451\u0452\7\u0081\2\2\u0452\u0460"+
		"\5l\67\2\u0453\u0455\5\u00f6|\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2"+
		"\2\u0455\u0456\3\2\2\2\u0456\u0457\5p9\2\u0457\u0458\5l\67\2\u0458\u0460"+
		"\3\2\2\2\u0459\u045b\5\u00f6|\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2"+
		"\2\u045b\u045c\3\2\2\2\u045c\u045d\7\34\2\2\u045d\u045e\7\u0081\2\2\u045e"+
		"\u0460\5l\67\2\u045f\u044e\3\2\2\2\u045f\u0454\3\2\2\2\u045f\u045a\3\2"+
		"\2\2\u0460o\3\2\2\2\u0461\u0462\7\21\2\2\u0462\u0463\5j\66\2\u0463\u0464"+
		"\7\u0081\2\2\u0464q\3\2\2\2\u0465\u0467\5h\65\2\u0466\u0465\3\2\2\2\u0466"+
		"\u0467\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\7\u0083\2\2\u0469s\3\2"+
		"\2\2\u046a\u046c\7Z\2\2\u046b\u046d\5v<\2\u046c\u046b\3\2\2\2\u046c\u046d"+
		"\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\7[\2\2\u046fu\3\2\2\2\u0470\u0471"+
		"\b<\1\2\u0471\u0472\5l\67\2\u0472\u0477\3\2\2\2\u0473\u0474\f\3\2\2\u0474"+
		"\u0476\5l\67\2\u0475\u0473\3\2\2\2\u0476\u0479\3\2\2\2\u0477\u0475\3\2"+
		"\2\2\u0477\u0478\3\2\2\2\u0478w\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047b"+
		"\5z>\2\u047b\u047c\5l\67\2\u047c\u0486\3\2\2\2\u047d\u047e\5z>\2\u047e"+
		"\u047f\5l\67\2\u047f\u0480\7!\2\2\u0480\u0481\5l\67\2\u0481\u0486\3\2"+
		"\2\2\u0482\u0483\5|?\2\u0483\u0484\5l\67\2\u0484\u0486\3\2\2\2\u0485\u047a"+
		"\3\2\2\2\u0485\u047d\3\2\2\2\u0485\u0482\3\2\2\2\u0486y\3\2\2\2\u0487"+
		"\u0488\7,\2\2\u0488\u0489\7V\2\2\u0489\u048a\5~@\2\u048a\u048b\7W\2\2"+
		"\u048b{\3\2\2\2\u048c\u048d\7D\2\2\u048d\u048e\7V\2\2\u048e\u048f\5~@"+
		"\2\u048f\u0490\7W\2\2\u0490}\3\2\2\2\u0491\u04a2\5h\65\2\u0492\u0494\5"+
		"\u00f6|\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2"+
		"\u0495\u0496\5\u00aeX\2\u0496\u0497\5\u0110\u0089\2\u0497\u0498\7f\2\2"+
		"\u0498\u0499\5\u0142\u00a2\2\u0499\u04a2\3\2\2\2\u049a\u049c\5\u00f6|"+
		"\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e"+
		"\5\u00aeX\2\u049e\u049f\5\u0110\u0089\2\u049f\u04a0\5\u0146\u00a4\2\u04a0"+
		"\u04a2\3\2\2\2\u04a1\u0491\3\2\2\2\u04a1\u0493\3\2\2\2\u04a1\u049b\3\2"+
		"\2\2\u04a2\177\3\2\2\2\u04a3\u04a4\5\u0084C\2\u04a4\u04a5\5l\67\2\u04a5"+
		"\u04ae\3\2\2\2\u04a6\u04ae\5\u0082B\2\u04a7\u04a8\5\u0088E\2\u04a8\u04a9"+
		"\5l\67\2\u04a9\u04ae\3\2\2\2\u04aa\u04ab\5\u0086D\2\u04ab\u04ac\5l\67"+
		"\2\u04ac\u04ae\3\2\2\2\u04ad\u04a3\3\2\2\2\u04ad\u04a6\3\2\2\2\u04ad\u04a7"+
		"\3\2\2\2\u04ad\u04aa\3\2\2\2\u04ae\u0081\3\2\2\2\u04af\u04b0\7\36\2\2"+
		"\u04b0\u04b1\5l\67\2\u04b1\u04b2\5\u0084C\2\u04b2\u04b3\7\u0083\2\2\u04b3"+
		"\u0083\3\2\2\2\u04b4\u04b5\7U\2\2\u04b5\u04b6\7V\2\2\u04b6\u04b7\5~@\2"+
		"\u04b7\u04b8\7W\2\2\u04b8\u0085\3\2\2\2\u04b9\u04ba\7)\2\2\u04ba\u04bb"+
		"\7V\2\2\u04bb\u04bd\5\u008aF\2\u04bc\u04be\5~@\2\u04bd\u04bc\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c1\7\u0083\2\2\u04c0\u04c2"+
		"\5h\65\2\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3"+
		"\u04c4\7W\2\2\u04c4\u0087\3\2\2\2\u04c5\u04c6\7)\2\2\u04c6\u04c7\7V\2"+
		"\2\u04c7\u04c8\5\u008cG\2\u04c8\u04c9\7\u0081\2\2\u04c9\u04ca\5\u008e"+
		"H\2\u04ca\u04cb\7W\2\2\u04cb\u0089\3\2\2\2\u04cc\u04cf\5r:\2\u04cd\u04cf"+
		"\5\u00a2R\2\u04ce\u04cc\3\2\2\2\u04ce\u04cd\3\2\2\2\u04cf\u008b\3\2\2"+
		"\2\u04d0\u04d2\5\u00f6|\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04d3\3\2\2\2\u04d3\u04d4\5\u00aeX\2\u04d4\u04d5\5\u0110\u0089\2\u04d5"+
		"\u008d\3\2\2\2\u04d6\u04d9\5h\65\2\u04d7\u04d9\5\u0146\u00a4\2\u04d8\u04d6"+
		"\3\2\2\2\u04d8\u04d7\3\2\2\2\u04d9\u008f\3\2\2\2\u04da\u04e1\5\u0092J"+
		"\2\u04db\u04e1\5\u0094K\2\u04dc\u04e1\5\u0096L\2\u04dd\u04de\7+\2\2\u04de"+
		"\u04df\7\u0087\2\2\u04df\u04e1\7\u0083\2\2\u04e0\u04da\3\2\2\2\u04e0\u04db"+
		"\3\2\2\2\u04e0\u04dc\3\2\2\2\u04e0\u04dd\3\2\2\2\u04e1\u0091\3\2\2\2\u04e2"+
		"\u04e3\7\20\2\2\u04e3\u04e4\7\u0083\2\2\u04e4\u0093\3\2\2\2\u04e5\u04e6"+
		"\7\32\2\2\u04e6\u04e7\7\u0083\2\2\u04e7\u0095\3\2\2\2\u04e8\u04ea\7<\2"+
		"\2\u04e9\u04eb\5h\65\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec"+
		"\3\2\2\2\u04ec\u04f2\7\u0083\2\2\u04ed\u04ee\7<\2\2\u04ee\u04ef\5\u0146"+
		"\u00a4\2\u04ef\u04f0\7\u0083\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04e8\3\2\2"+
		"\2\u04f1\u04ed\3\2\2\2\u04f2\u0097\3\2\2\2\u04f3\u04f4\5\u009eP\2\u04f4"+
		"\u0099\3\2\2\2\u04f5\u04f6\bN\1\2\u04f6\u04f7\5\u009cO\2\u04f7\u04fc\3"+
		"\2\2\2\u04f8\u04f9\f\3\2\2\u04f9\u04fb\5\u009cO\2\u04fa\u04f8\3\2\2\2"+
		"\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u009b"+
		"\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff\u0509\5\u009eP\2\u0500\u0509\5\u0138"+
		"\u009d\2\u0501\u0509\5\u0180\u00c1\2\u0502\u0509\5\u0194\u00cb\2\u0503"+
		"\u0509\5\u0196\u00cc\2\u0504\u0509\5\u00f4{\2\u0505\u0509\5\u00dco\2\u0506"+
		"\u0509\5\u00a8U\2\u0507\u0509\5\u00aaV\2\u0508\u04ff\3\2\2\2\u0508\u0500"+
		"\3\2\2\2\u0508\u0501\3\2\2\2\u0508\u0502\3\2\2\2\u0508\u0503\3\2\2\2\u0508"+
		"\u0504\3\2\2\2\u0508\u0505\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0507\3\2"+
		"\2\2\u0509\u009d\3\2\2\2\u050a\u0513\5\u00a2R\2\u050b\u0513\5\u00f2z\2"+
		"\u050c\u0513\5\u00eav\2\u050d\u0513\5\u00eex\2\u050e\u0513\5\u00f0y\2"+
		"\u050f\u0513\5\u00a6T\2\u0510\u0513\5\u00a0Q\2\u0511\u0513\5\u00ccg\2"+
		"\u0512\u050a\3\2\2\2\u0512\u050b\3\2\2\2\u0512\u050c\3\2\2\2\u0512\u050d"+
		"\3\2\2\2\u0512\u050e\3\2\2\2\u0512\u050f\3\2\2\2\u0512\u0510\3\2\2\2\u0512"+
		"\u0511\3\2\2\2\u0513\u009f\3\2\2\2\u0514\u0515\7P\2\2\u0515\u0517\7\u0087"+
		"\2\2\u0516\u0518\5\u00f6|\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518"+
		"\u0519\3\2\2\2\u0519\u051a\7f\2\2\u051a\u051b\5\u0126\u0094\2\u051b\u051c"+
		"\7\u0083\2\2\u051c\u00a1\3\2\2\2\u051d\u052d\5\u00a4S\2\u051e\u0520\5"+
		"\u00aeX\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0522\3\2\2\2"+
		"\u0521\u0523\5\u010c\u0087\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0524\3\2\2\2\u0524\u052d\7\u0083\2\2\u0525\u0527\5\u00f6|\2\u0526\u0528"+
		"\5\u00aeX\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\3\2\2"+
		"\2\u0529\u052a\5\u010c\u0087\2\u052a\u052b\7\u0083\2\2\u052b\u052d\3\2"+
		"\2\2\u052c\u051d\3\2\2\2\u052c\u051f\3\2\2\2\u052c\u0525\3\2\2\2\u052d"+
		"\u00a3\3\2\2\2\u052e\u052f\5\u00aeX\2\u052f\u0530\5\u010c\u0087\2\u0530"+
		"\u0531\7\u0083\2\2\u0531\u00a5\3\2\2\2\u0532\u0533\7A\2\2\u0533\u0534"+
		"\7V\2\2\u0534\u0535\5j\66\2\u0535\u0536\7}\2\2\u0536\u0537\7\u0090\2\2"+
		"\u0537\u0538\7W\2\2\u0538\u0539\7\u0083\2\2\u0539\u00a7\3\2\2\2\u053a"+
		"\u053b\7\u0083\2\2\u053b\u00a9\3\2\2\2\u053c\u053d\5\u00f6|\2\u053d\u053e"+
		"\7\u0083\2\2\u053e\u00ab\3\2\2\2\u053f\u0546\5\u00b0Y\2\u0540\u0546\5"+
		"\u00b6\\\2\u0541\u0546\5\u00b2Z\2\u0542\u0546\7*\2\2\u0543\u0546\7K\2"+
		"\2\u0544\u0546\7\30\2\2\u0545\u053f\3\2\2\2\u0545\u0540\3\2\2\2\u0545"+
		"\u0541\3\2\2\2\u0545\u0542\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0544\3\2"+
		"\2\2\u0546\u00ad\3\2\2\2\u0547\u0549\5\u00acW\2\u0548\u054a\5\u00f6|\2"+
		"\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054f\3\2\2\2\u054b\u054c"+
		"\5\u00acW\2\u054c\u054d\5\u00aeX\2\u054d\u054f\3\2\2\2\u054e\u0547\3\2"+
		"\2\2\u054e\u054b\3\2\2\2\u054f\u00af\3\2\2\2\u0550\u0551\t\6\2\2\u0551"+
		"\u00b1\3\2\2\2\u0552\u0553\t\7\2\2\u0553\u00b3\3\2\2\2\u0554\u0555\7\u0087"+
		"\2\2\u0555\u00b5\3\2\2\2\u0556\u055a\5\u00b8]\2\u0557\u055a\5\u014a\u00a6"+
		"\2\u0558\u055a\5\u00c8e\2\u0559\u0556\3\2\2\2\u0559\u0557\3\2\2\2\u0559"+
		"\u0558\3\2\2\2\u055a\u00b7\3\2\2\2\u055b\u0560\5\u00be`\2\u055c\u0560"+
		"\5\u00c4c\2\u055d\u0560\5\u0192\u00ca\2\u055e\u0560\5\u0120\u0091\2\u055f"+
		"\u055b\3\2\2\2\u055f\u055c\3\2\2\2\u055f\u055d\3\2\2\2\u055f\u055e\3\2"+
		"\2\2\u0560\u00b9\3\2\2\2\u0561\u0563\5\u00b6\\\2\u0562\u0564\5\u00f6|"+
		"\2\u0563\u0562\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0569\3\2\2\2\u0565\u0566"+
		"\5\u00b6\\\2\u0566\u0567\5\u00ba^\2\u0567\u0569\3\2\2\2\u0568\u0561\3"+
		"\2\2\2\u0568\u0565\3\2\2\2\u0569\u00bb\3\2\2\2\u056a\u056c\5\u00b8]\2"+
		"\u056b\u056d\5\u00f6|\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d"+
		"\u0572\3\2\2\2\u056e\u056f\5\u00b8]\2\u056f\u0570\5\u00bc_\2\u0570\u0572"+
		"\3\2\2\2\u0571\u056a\3\2\2\2\u0571\u056e\3\2\2\2\u0572\u00bd\3\2\2\2\u0573"+
		"\u0575\5\16\b\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0576\3"+
		"\2\2\2\u0576\u058b\5\u00c0a\2\u0577\u0578\5\16\b\2\u0578\u0579\7E\2\2"+
		"\u0579\u057a\5\u0188\u00c5\2\u057a\u058b\3\2\2\2\u057b\u058b\7\23\2\2"+
		"\u057c\u058b\7\24\2\2\u057d\u058b\7\25\2\2\u057e\u058b\7T\2\2\u057f\u058b"+
		"\7\17\2\2\u0580\u058b\7=\2\2\u0581\u058b\7.\2\2\u0582\u058b\7/\2\2\u0583"+
		"\u058b\7>\2\2\u0584\u058b\7O\2\2\u0585\u058b\7(\2\2\u0586\u058b\7\37\2"+
		"\2\u0587\u058b\7R\2\2\u0588\u058b\7\16\2\2\u0589\u058b\5\u00c2b\2\u058a"+
		"\u0574\3\2\2\2\u058a\u0577\3\2\2\2\u058a\u057b\3\2\2\2\u058a\u057c\3\2"+
		"\2\2\u058a\u057d\3\2\2\2\u058a\u057e\3\2\2\2\u058a\u057f\3\2\2\2\u058a"+
		"\u0580\3\2\2\2\u058a\u0581\3\2\2\2\u058a\u0582\3\2\2\2\u058a\u0583\3\2"+
		"\2\2\u058a\u0584\3\2\2\2\u058a\u0585\3\2\2\2\u058a\u0586\3\2\2\2\u058a"+
		"\u0587\3\2\2\2\u058a\u0588\3\2\2\2\u058a\u0589\3\2\2\2\u058b\u00bf\3\2"+
		"\2\2\u058c\u0591\5\u0148\u00a5\2\u058d\u0591\5\u00c6d\2\u058e\u0591\5"+
		"\u00b4[\2\u058f\u0591\5\u0188\u00c5\2\u0590\u058c\3\2\2\2\u0590\u058d"+
		"\3\2\2\2\u0590\u058e\3\2\2\2\u0590\u058f\3\2\2\2\u0591\u00c1\3\2\2\2\u0592"+
		"\u0593\7\33\2\2\u0593\u0594\7V\2\2\u0594\u0595\5h\65\2\u0595\u0596\7W"+
		"\2\2\u0596\u059c\3\2\2\2\u0597\u0598\7\33\2\2\u0598\u0599\7V\2\2\u0599"+
		"\u059a\7\16\2\2\u059a\u059c\7W\2\2\u059b\u0592\3\2\2\2\u059b\u0597\3\2"+
		"\2\2\u059c\u00c3\3\2\2\2\u059d\u059f\5\u0152\u00aa\2\u059e\u05a0\5\u00f6"+
		"|\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1"+
		"\u05a3\5\16\b\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\3"+
		"\2\2\2\u05a4\u05a5\7\u0087\2\2\u05a5\u05b6\3\2\2\2\u05a6\u05a7\5\u0152"+
		"\u00aa\2\u05a7\u05a8\5\u0188\u00c5\2\u05a8\u05b6\3\2\2\2\u05a9\u05aa\5"+
		"\u0152\u00aa\2\u05aa\u05ac\5\16\b\2\u05ab\u05ad\7E\2\2\u05ac\u05ab\3\2"+
		"\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\5\u0188\u00c5"+
		"\2\u05af\u05b6\3\2\2\2\u05b0\u05b2\7\"\2\2\u05b1\u05b3\5\16\b\2\u05b2"+
		"\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b6\7\u0087"+
		"\2\2\u05b5\u059d\3\2\2\2\u05b5\u05a6\3\2\2\2\u05b5\u05a9\3\2\2\2\u05b5"+
		"\u05b0\3\2\2\2\u05b6\u00c5\3\2\2\2\u05b7\u05b8\7\u0087\2\2\u05b8\u00c7"+
		"\3\2\2\2\u05b9\u05ba\5\u00caf\2\u05ba\u05bc\7Z\2\2\u05bb\u05bd\5\u00d2"+
		"j\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\3\2\2\2\u05be"+
		"\u05bf\7[\2\2\u05bf\u05c7\3\2\2\2\u05c0\u05c1\5\u00caf\2\u05c1\u05c2\7"+
		"Z\2\2\u05c2\u05c3\5\u00d2j\2\u05c3\u05c4\7}\2\2\u05c4\u05c5\7[\2\2\u05c5"+
		"\u05c7\3\2\2\2\u05c6\u05b9\3\2\2\2\u05c6\u05c0\3\2\2\2\u05c7\u00c9\3\2"+
		"\2\2\u05c8\u05ca\5\u00ceh\2\u05c9\u05cb\5\u00f6|\2\u05ca\u05c9\3\2\2\2"+
		"\u05ca\u05cb\3\2\2\2\u05cb\u05cd\3\2\2\2\u05cc\u05ce\7\u0087\2\2\u05cd"+
		"\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05d1\5\u00d0"+
		"i\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05dc\3\2\2\2\u05d2"+
		"\u05d4\5\u00ceh\2\u05d3\u05d5\5\u00f6|\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5"+
		"\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\5\16\b\2\u05d7\u05d9\7\u0087"+
		"\2\2\u05d8\u05da\5\u00d0i\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da"+
		"\u05dc\3\2\2\2\u05db\u05c8\3\2\2\2\u05db\u05d2\3\2\2\2\u05dc\u00cb\3\2"+
		"\2\2\u05dd\u05df\5\u00ceh\2\u05de\u05e0\5\u00f6|\2\u05df\u05de\3\2\2\2"+
		"\u05df\u05e0\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e3\7\u0087\2\2\u05e2"+
		"\u05e4\5\u00d0i\2\u05e3\u05e2\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5"+
		"\3\2\2\2\u05e5\u05e6\7\u0083\2\2\u05e6\u00cd\3\2\2\2\u05e7\u05ed\7\"\2"+
		"\2\u05e8\u05e9\7\"\2\2\u05e9\u05ed\7\26\2\2\u05ea\u05eb\7\"\2\2\u05eb"+
		"\u05ed\7C\2\2\u05ec\u05e7\3\2\2\2\u05ec\u05e8\3\2\2\2\u05ec\u05ea\3\2"+
		"\2\2\u05ed\u00cf\3\2\2\2\u05ee\u05ef\7\u0081\2\2\u05ef\u05f0\5\u00ba^"+
		"\2\u05f0\u00d1\3\2\2\2\u05f1\u05f2\bj\1\2\u05f2\u05f3\5\u00d4k\2\u05f3"+
		"\u05f9\3\2\2\2\u05f4\u05f5\f\3\2\2\u05f5\u05f6\7}\2\2\u05f6\u05f8\5\u00d4"+
		"k\2\u05f7\u05f4\3\2\2\2\u05f8\u05fb\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9"+
		"\u05fa\3\2\2\2\u05fa\u00d3\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fc\u0602\5\u00d6"+
		"l\2\u05fd\u05fe\5\u00d6l\2\u05fe\u05ff\7f\2\2\u05ff\u0600\5j\66\2\u0600"+
		"\u0602\3\2\2\2\u0601\u05fc\3\2\2\2\u0601\u05fd\3\2\2\2\u0602\u00d5\3\2"+
		"\2\2\u0603\u0604\7\u0087\2\2\u0604\u00d7\3\2\2\2\u0605\u0608\5\u00dan"+
		"\2\u0606\u0608\5\u00e8u\2\u0607\u0605\3\2\2\2\u0607\u0606\3\2\2\2\u0608"+
		"\u00d9\3\2\2\2\u0609\u060a\7\u0087\2\2\u060a\u00db\3\2\2\2\u060b\u060e"+
		"\5\u00dep\2\u060c\u060e\5\u00e4s\2\u060d\u060b\3\2\2\2\u060d\u060c\3\2"+
		"\2\2\u060e\u00dd\3\2\2\2\u060f\u0612\5\u00e0q\2\u0610\u0612\5\u00e2r\2"+
		"\u0611\u060f\3\2\2\2\u0611\u0610\3\2\2\2\u0612\u00df\3\2\2\2\u0613\u0615"+
		"\7-\2\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616"+
		"\u0617\7\61\2\2\u0617\u0618\7\u0087\2\2\u0618\u0619\7Z\2\2\u0619\u061a"+
		"\5\u00e6t\2\u061a\u061b\7[\2\2\u061b\u00e1\3\2\2\2\u061c\u061e\7-\2\2"+
		"\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620"+
		"\7\61\2\2\u0620\u0621\5\u00dan\2\u0621\u0622\7Z\2\2\u0622\u0623\5\u00e6"+
		"t\2\u0623\u0624\7[\2\2\u0624\u00e3\3\2\2\2\u0625\u0627\7-\2\2\u0626\u0625"+
		"\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629\7\61\2\2"+
		"\u0629\u062a\7Z\2\2\u062a\u062b\5\u00e6t\2\u062b\u062c\7[\2\2\u062c\u00e5"+
		"\3\2\2\2\u062d\u062f\5\u009aN\2\u062e\u062d\3\2\2\2\u062e\u062f\3\2\2"+
		"\2\u062f\u00e7\3\2\2\2\u0630\u0631\7\u0087\2\2\u0631\u00e9\3\2\2\2\u0632"+
		"\u0633\7\61\2\2\u0633\u0634\7\u0087\2\2\u0634\u0635\7f\2\2\u0635\u0636"+
		"\5\u00ecw\2\u0636\u0637\7\u0083\2\2\u0637\u00eb\3\2\2\2\u0638\u063a\5"+
		"\16\b\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u063c\5\u00d8m\2\u063c\u00ed\3\2\2\2\u063d\u063f\7P\2\2\u063e\u0640\7"+
		"M\2\2\u063f\u063e\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0641\3\2\2\2\u0641"+
		"\u0642\5\16\b\2\u0642\u0643\5\n\6\2\u0643\u0644\7\u0083\2\2\u0644\u064b"+
		"\3\2\2\2\u0645\u0646\7P\2\2\u0646\u0647\7\u0082\2\2\u0647\u0648\5\n\6"+
		"\2\u0648\u0649\7\u0083\2\2\u0649\u064b\3\2\2\2\u064a\u063d\3\2\2\2\u064a"+
		"\u0645\3\2\2\2\u064b\u00ef\3\2\2\2\u064c\u064e\5\u00f6|\2\u064d\u064c"+
		"\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\7P\2\2\u0650"+
		"\u0652\7\61\2\2\u0651\u0653\5\16\b\2\u0652\u0651\3\2\2\2\u0652\u0653\3"+
		"\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\5\u00d8m\2\u0655\u0656\7\u0083"+
		"\2\2\u0656\u00f1\3\2\2\2\u0657\u0658\7\r\2\2\u0658\u0659\7V\2\2\u0659"+
		"\u065a\7\u0090\2\2\u065a\u065b\7W\2\2\u065b\u065c\7\u0083\2\2\u065c\u00f3"+
		"\3\2\2\2\u065d\u065e\7%\2\2\u065e\u065f\7\u0090\2\2\u065f\u0661\7Z\2\2"+
		"\u0660\u0662\5\u009aN\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2\2\u0662"+
		"\u0663\3\2\2\2\u0663\u0668\7[\2\2\u0664\u0665\7%\2\2\u0665\u0666\7\u0090"+
		"\2\2\u0666\u0668\5\u009cO\2\u0667\u065d\3\2\2\2\u0667\u0664\3\2\2\2\u0668"+
		"\u00f5\3\2\2\2\u0669\u066a\b|\1\2\u066a\u066b\5\u00f8}\2\u066b\u0670\3"+
		"\2\2\2\u066c\u066d\f\3\2\2\u066d\u066f\5\u00f8}\2\u066e\u066c\3\2\2\2"+
		"\u066f\u0672\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u00f7"+
		"\3\2\2\2\u0672\u0670\3\2\2\2\u0673\u0674\7X\2\2\u0674\u0675\7X\2\2\u0675"+
		"\u0676\5\u00fc\177\2\u0676\u0677\7Y\2\2\u0677\u0678\7Y\2\2\u0678\u067b"+
		"\3\2\2\2\u0679\u067b\5\u00fa~\2\u067a\u0673\3\2\2\2\u067a\u0679\3\2\2"+
		"\2\u067b\u00f9\3\2\2\2\u067c\u067d\7\13\2\2\u067d\u067e\7V\2\2\u067e\u0680"+
		"\5\u0126\u0094\2\u067f\u0681\7\u0086\2\2\u0680\u067f\3\2\2\2\u0680\u0681"+
		"\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0683\7W\2\2\u0683\u068d\3\2\2\2\u0684"+
		"\u0685\7\13\2\2\u0685\u0686\7V\2\2\u0686\u0688\5j\66\2\u0687\u0689\7\u0086"+
		"\2\2\u0688\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\3\2\2\2\u068a"+
		"\u068b\7W\2\2\u068b\u068d\3\2\2\2\u068c\u067c\3\2\2\2\u068c\u0684\3\2"+
		"\2\2\u068d\u00fb\3\2\2\2\u068e\u0690\b\177\1\2\u068f\u0691\5\u00fe\u0080"+
		"\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0696\3\2\2\2\u0692\u0693"+
		"\5\u00fe\u0080\2\u0693\u0694\7\u0086\2\2\u0694\u0696\3\2\2\2\u0695\u068e"+
		"\3\2\2\2\u0695\u0692\3\2\2\2\u0696\u06a3\3\2\2\2\u0697\u0698\f\5\2\2\u0698"+
		"\u069a\7}\2\2\u0699\u069b\5\u00fe\u0080\2\u069a\u0699\3\2\2\2\u069a\u069b"+
		"\3\2\2\2\u069b\u06a2\3\2\2\2\u069c\u069d\f\3\2\2\u069d\u069e\7}\2\2\u069e"+
		"\u069f\5\u00fe\u0080\2\u069f\u06a0\7\u0086\2\2\u06a0\u06a2\3\2\2\2\u06a1"+
		"\u0697\3\2\2\2\u06a1\u069c\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2"+
		"\2\2\u06a3\u06a4\3\2\2\2\u06a4\u00fd\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6"+
		"\u06a8\5\u0100\u0081\2\u06a7\u06a9\5\u0106\u0084\2\u06a8\u06a7\3\2\2\2"+
		"\u06a8\u06a9\3\2\2\2\u06a9\u00ff\3\2\2\2\u06aa\u06ad\7\u0087\2\2\u06ab"+
		"\u06ad\5\u0102\u0082\2\u06ac\u06aa\3\2\2\2\u06ac\u06ab\3\2\2\2\u06ad\u0101"+
		"\3\2\2\2\u06ae\u06af\5\u0104\u0083\2\u06af\u06b0\7\u0082\2\2\u06b0\u06b1"+
		"\7\u0087\2\2\u06b1\u0103\3\2\2\2\u06b2\u06b3\7\u0087\2\2\u06b3\u0105\3"+
		"\2\2\2\u06b4\u06b5\7V\2\2\u06b5\u06b6\5\u0108\u0085\2\u06b6\u06b7\7W\2"+
		"\2\u06b7\u0107\3\2\2\2\u06b8\u06ba\b\u0085\1\2\u06b9\u06bb\5\u010a\u0086"+
		"\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06c0\3\2\2\2\u06bc\u06bd"+
		"\f\3\2\2\u06bd\u06bf\5\u010a\u0086\2\u06be\u06bc\3\2\2\2\u06bf\u06c2\3"+
		"\2\2\2\u06c0\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u0109\3\2\2\2\u06c2"+
		"\u06c0\3\2\2\2\u06c3\u06c4\7V\2\2\u06c4\u06c5\5\u0108\u0085\2\u06c5\u06c6"+
		"\7W\2\2\u06c6\u06d5\3\2\2\2\u06c7\u06c8\7X\2\2\u06c8\u06c9\5\u0108\u0085"+
		"\2\u06c9\u06ca\7Y\2\2\u06ca\u06d5\3\2\2\2\u06cb\u06cc\7Z\2\2\u06cc\u06cd"+
		"\5\u0108\u0085\2\u06cd\u06ce\7[\2\2\u06ce\u06d5\3\2\2\2\u06cf\u06d1\n"+
		"\b\2\2\u06d0\u06cf\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d0\3\2\2\2\u06d2"+
		"\u06d3\3\2\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06c3\3\2\2\2\u06d4\u06c7\3\2"+
		"\2\2\u06d4\u06cb\3\2\2\2\u06d4\u06d0\3\2\2\2\u06d5\u010b\3\2\2\2\u06d6"+
		"\u06d7\b\u0087\1\2\u06d7\u06d8\5\u010e\u0088\2\u06d8\u06de\3\2\2\2\u06d9"+
		"\u06da\f\3\2\2\u06da\u06db\7}\2\2\u06db\u06dd\5\u010e\u0088\2\u06dc\u06d9"+
		"\3\2\2\2\u06dd\u06e0\3\2\2\2\u06de\u06dc\3\2\2\2\u06de\u06df\3\2\2\2\u06df"+
		"\u010d\3\2\2\2\u06e0\u06de\3\2\2\2\u06e1\u06e3\5\u0110\u0089\2\u06e2\u06e4"+
		"\5\u013e\u00a0\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u010f\3"+
		"\2\2\2\u06e5\u06eb\5\u0112\u008a\2\u06e6\u06e7\5\u0114\u008b\2\u06e7\u06e8"+
		"\5\u0118\u008d\2\u06e8\u06e9\5\u011a\u008e\2\u06e9\u06eb\3\2\2\2\u06ea"+
		"\u06e5\3\2\2\2\u06ea\u06e6\3\2\2\2\u06eb\u0111\3\2\2\2\u06ec\u06f1\5\u0114"+
		"\u008b\2\u06ed\u06ee\5\u011c\u008f\2\u06ee\u06ef\5\u0112\u008a\2\u06ef"+
		"\u06f1\3\2\2\2\u06f0\u06ec\3\2\2\2\u06f0\u06ed\3\2\2\2\u06f1\u0113\3\2"+
		"\2\2\u06f2\u06f3\b\u008b\1\2\u06f3\u06f5\5\u0124\u0093\2\u06f4\u06f6\5"+
		"\u00f6|\2\u06f5\u06f4\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u0700\3\2\2\2"+
		"\u06f7\u06f9\5\u0116\u008c\2\u06f8\u06fa\5\u00f6|\2\u06f9\u06f8\3\2\2"+
		"\2\u06f9\u06fa\3\2\2\2\u06fa\u0700\3\2\2\2\u06fb\u06fc\7V\2\2\u06fc\u06fd"+
		"\5\u0112\u008a\2\u06fd\u06fe\7W\2\2\u06fe\u0700\3\2\2\2\u06ff\u06f2\3"+
		"\2\2\2\u06ff\u06f7\3\2\2\2\u06ff\u06fb\3\2\2\2\u0700\u0705\3\2\2\2\u0701"+
		"\u0702\f\5\2\2\u0702\u0704\5\u0118\u008d\2\u0703\u0701\3\2\2\2\u0704\u0707"+
		"\3\2\2\2\u0705\u0703\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0115\3\2\2\2\u0707"+
		"\u0705\3\2\2\2\u0708\u0710\5\u0124\u0093\2\u0709\u070b\7X\2\2\u070a\u070c"+
		"\5j\66\2\u070b\u070a\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\3\2\2\2\u070d"+
		"\u070f\7Y\2\2\u070e\u0709\3\2\2\2\u070f\u0712\3\2\2\2\u0710\u070e\3\2"+
		"\2\2\u0710\u0711\3\2\2\2\u0711\u0117\3\2\2\2\u0712\u0710\3\2\2\2\u0713"+
		"\u0714\7V\2\2\u0714\u0715\5\u0132\u009a\2\u0715\u0717\7W\2\2\u0716\u0718"+
		"\5\u011e\u0090\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u071a\3"+
		"\2\2\2\u0719\u071b\5\u0122\u0092\2\u071a\u0719\3\2\2\2\u071a\u071b\3\2"+
		"\2\2\u071b\u071d\3\2\2\2\u071c\u071e\5\u01aa\u00d6\2\u071d\u071c\3\2\2"+
		"\2\u071d\u071e\3\2\2\2\u071e\u0720\3\2\2\2\u071f\u0721\5\u00f6|\2\u0720"+
		"\u071f\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0119\3\2\2\2\u0722\u0723\7\177"+
		"\2\2\u0723\u0725\5\u00bc_\2\u0724\u0726\5\u0128\u0095\2\u0725\u0724\3"+
		"\2\2\2\u0725\u0726\3\2\2\2\u0726\u011b\3\2\2\2\u0727\u0729\7^\2\2\u0728"+
		"\u072a\5\u00f6|\2\u0729\u0728\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072c"+
		"\3\2\2\2\u072b\u072d\5\u011e\u0090\2\u072c\u072b\3\2\2\2\u072c\u072d\3"+
		"\2\2\2\u072d\u073f\3\2\2\2\u072e\u0730\7b\2\2\u072f\u0731\5\u00f6|\2\u0730"+
		"\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u073f\3\2\2\2\u0732\u0734\7\5"+
		"\2\2\u0733\u0735\5\u00f6|\2\u0734\u0733\3\2\2\2\u0734\u0735\3\2\2\2\u0735"+
		"\u073f\3\2\2\2\u0736\u0737\5\16\b\2\u0737\u0739\7^\2\2\u0738\u073a\5\u00f6"+
		"|\2\u0739\u0738\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073c\3\2\2\2\u073b"+
		"\u073d\5\u011e\u0090\2\u073c\u073b\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f"+
		"\3\2\2\2\u073e\u0727\3\2\2\2\u073e\u072e\3\2\2\2\u073e\u0732\3\2\2\2\u073e"+
		"\u0736\3\2\2\2\u073f\u011d\3\2\2\2\u0740\u0742\5\u0120\u0091\2\u0741\u0743"+
		"\5\u011e\u0090\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u011f\3"+
		"\2\2\2\u0744\u0745\t\t\2\2\u0745\u0121\3\2\2\2\u0746\u0747\t\n\2\2\u0747"+
		"\u0123\3\2\2\2\u0748\u074a\7\u0086\2\2\u0749\u0748\3\2\2\2\u0749\u074a"+
		"\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074c\5\b\5\2\u074c\u0125\3\2\2\2\u074d"+
		"\u074f\5\u00ba^\2\u074e\u0750\5\u0128\u0095\2\u074f\u074e\3\2\2\2\u074f"+
		"\u0750\3\2\2\2\u0750\u0127\3\2\2\2\u0751\u075a\5\u012a\u0096\2\u0752\u0754"+
		"\5\u012c\u0097\2\u0753\u0752\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\3"+
		"\2\2\2\u0755\u0756\5\u0118\u008d\2\u0756\u0757\5\u011a\u008e\2\u0757\u075a"+
		"\3\2\2\2\u0758\u075a\5\u012e\u0098\2\u0759\u0751\3\2\2\2\u0759\u0753\3"+
		"\2\2\2\u0759\u0758\3\2\2\2\u075a\u0129\3\2\2\2\u075b\u0761\5\u012c\u0097"+
		"\2\u075c\u075e\5\u011c\u008f\2\u075d\u075f\5\u012a\u0096\2\u075e\u075d"+
		"\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0761\3\2\2\2\u0760\u075b\3\2\2\2\u0760"+
		"\u075c\3\2\2\2\u0761\u012b\3\2\2\2\u0762\u0763\b\u0097\1\2\u0763\u0771"+
		"\5\u0118\u008d\2\u0764\u0766\7X\2\2\u0765\u0767\5j\66\2\u0766\u0765\3"+
		"\2\2\2\u0766\u0767\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076a\7Y\2\2\u0769"+
		"\u076b\5\u00f6|\2\u076a\u0769\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u0771"+
		"\3\2\2\2\u076c\u076d\7V\2\2\u076d\u076e\5\u012a\u0096\2\u076e\u076f\7"+
		"W\2\2\u076f\u0771\3\2\2\2\u0770\u0762\3\2\2\2\u0770\u0764\3\2\2\2\u0770"+
		"\u076c\3\2\2\2\u0771\u077f\3\2\2\2\u0772\u0773\f\7\2\2\u0773\u077e\5\u0118"+
		"\u008d\2\u0774\u0775\f\5\2\2\u0775\u0777\7X\2\2\u0776\u0778\5j\66\2\u0777"+
		"\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077b\7Y"+
		"\2\2\u077a\u077c\5\u00f6|\2\u077b\u077a\3\2\2\2\u077b\u077c\3\2\2\2\u077c"+
		"\u077e\3\2\2\2\u077d\u0772\3\2\2\2\u077d\u0774\3\2\2\2\u077e\u0781\3\2"+
		"\2\2\u077f\u077d\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u012d\3\2\2\2\u0781"+
		"\u077f\3\2\2\2\u0782\u0787\5\u0130\u0099\2\u0783\u0784\5\u011c\u008f\2"+
		"\u0784\u0785\5\u012e\u0098\2\u0785\u0787\3\2\2\2\u0786\u0782\3\2\2\2\u0786"+
		"\u0783\3\2\2\2\u0787\u012f\3\2\2\2\u0788\u0789\b\u0099\1\2\u0789\u078a"+
		"\7\u0086\2\2\u078a\u0798\3\2\2\2\u078b\u078c\f\5\2\2\u078c\u0797\5\u0118"+
		"\u008d\2\u078d\u078e\f\4\2\2\u078e\u0790\7X\2\2\u078f\u0791\5j\66\2\u0790"+
		"\u078f\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u0794\7Y"+
		"\2\2\u0793\u0795\5\u00f6|\2\u0794\u0793\3\2\2\2\u0794\u0795\3\2\2\2\u0795"+
		"\u0797\3\2\2\2\u0796\u078b\3\2\2\2\u0796\u078d\3\2\2\2\u0797\u079a\3\2"+
		"\2\2\u0798\u0796\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u0131\3\2\2\2\u079a"+
		"\u0798\3\2\2\2\u079b\u079d\5\u0134\u009b\2\u079c\u079b\3\2\2\2\u079c\u079d"+
		"\3\2\2\2\u079d\u079f\3\2\2\2\u079e\u07a0\7\u0086\2\2\u079f\u079e\3\2\2"+
		"\2\u079f\u07a0\3\2\2\2\u07a0\u07a6\3\2\2\2\u07a1\u07a2\5\u0134\u009b\2"+
		"\u07a2\u07a3\7}\2\2\u07a3\u07a4\7\u0086\2\2\u07a4\u07a6\3\2\2\2\u07a5"+
		"\u079c\3\2\2\2\u07a5\u07a1\3\2\2\2\u07a6\u0133\3\2\2\2\u07a7\u07a8\b\u009b"+
		"\1\2\u07a8\u07a9\5\u0136\u009c\2\u07a9\u07af\3\2\2\2\u07aa\u07ab\f\3\2"+
		"\2\u07ab\u07ac\7}\2\2\u07ac\u07ae\5\u0136\u009c\2\u07ad\u07aa\3\2\2\2"+
		"\u07ae\u07b1\3\2\2\2\u07af\u07ad\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u0135"+
		"\3\2\2\2\u07b1\u07af\3\2\2\2\u07b2\u07b4\5\u00f6|\2\u07b3\u07b2\3\2\2"+
		"\2\u07b3\u07b4\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b6\5\u00aeX\2\u07b6"+
		"\u07b7\5\u0110\u0089\2\u07b7\u07d2\3\2\2\2\u07b8\u07ba\5\u00f6|\2\u07b9"+
		"\u07b8\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bc\5\u00ae"+
		"X\2\u07bc\u07bd\5\u0110\u0089\2\u07bd\u07be\7f\2\2\u07be\u07bf\5\u0142"+
		"\u00a2\2\u07bf\u07d2\3\2\2\2\u07c0\u07c2\5\u00f6|\2\u07c1\u07c0\3\2\2"+
		"\2\u07c1\u07c2\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c5\5\u00aeX\2\u07c4"+
		"\u07c6\5\u0128\u0095\2\u07c5\u07c4\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07d2"+
		"\3\2\2\2\u07c7\u07c9\5\u00f6|\2\u07c8\u07c7\3\2\2\2\u07c8\u07c9\3\2\2"+
		"\2\u07c9\u07ca\3\2\2\2\u07ca\u07cc\5\u00aeX\2\u07cb\u07cd\5\u0128\u0095"+
		"\2\u07cc\u07cb\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u07cf"+
		"\7f\2\2\u07cf\u07d0\5\u0142\u00a2\2\u07d0\u07d2\3\2\2\2\u07d1\u07b3\3"+
		"\2\2\2\u07d1\u07b9\3\2\2\2\u07d1\u07c1\3\2\2\2\u07d1\u07c8\3\2\2\2\u07d2"+
		"\u0137\3\2\2\2\u07d3\u07d4\5\u013a\u009e\2\u07d4\u07d5\5\u013c\u009f\2"+
		"\u07d5\u0139\3\2\2\2\u07d6\u07d8\5\u00f6|\2\u07d7\u07d6\3\2\2\2\u07d7"+
		"\u07d8\3\2\2\2\u07d8\u07da\3\2\2\2\u07d9\u07db\5\u00aeX\2\u07da\u07d9"+
		"\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07de\5\u0110\u0089"+
		"\2\u07dd\u07df\5\u015c\u00af\2\u07de\u07dd\3\2\2\2\u07de\u07df\3\2\2\2"+
		"\u07df\u013b\3\2\2\2\u07e0\u07e2\5\u0174\u00bb\2\u07e1\u07e0\3\2\2\2\u07e1"+
		"\u07e2\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u07ec\5t;\2\u07e4\u07ec\5\u019a"+
		"\u00ce\2\u07e5\u07e6\7f\2\2\u07e6\u07e7\7\34\2\2\u07e7\u07ec\7\u0083\2"+
		"\2\u07e8\u07e9\7f\2\2\u07e9\u07ea\7\35\2\2\u07ea\u07ec\7\u0083\2\2\u07eb"+
		"\u07e1\3\2\2\2\u07eb\u07e4\3\2\2\2\u07eb\u07e5\3\2\2\2\u07eb\u07e8\3\2"+
		"\2\2\u07ec\u013d\3\2\2\2\u07ed\u07f3\5\u0140\u00a1\2\u07ee\u07ef\7V\2"+
		"\2\u07ef\u07f0\5,\27\2\u07f0\u07f1\7W\2\2\u07f1\u07f3\3\2\2\2\u07f2\u07ed"+
		"\3\2\2\2\u07f2\u07ee\3\2\2\2\u07f3\u013f\3\2\2\2\u07f4\u07f5\7f\2\2\u07f5"+
		"\u07f8\5\u0142\u00a2\2\u07f6\u07f8\5\u0146\u00a4\2\u07f7\u07f4\3\2\2\2"+
		"\u07f7\u07f6\3\2\2\2\u07f8\u0141\3\2\2\2\u07f9\u07fc\5b\62\2\u07fa\u07fc"+
		"\5\u0146\u00a4\2\u07fb\u07f9\3\2\2\2\u07fb\u07fa\3\2\2\2\u07fc\u0143\3"+
		"\2\2\2\u07fd\u07fe\b\u00a3\1\2\u07fe\u0800\5\u0142\u00a2\2\u07ff\u0801"+
		"\7\u0086\2\2\u0800\u07ff\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u080a\3\2\2"+
		"\2\u0802\u0803\f\3\2\2\u0803\u0804\7}\2\2\u0804\u0806\5\u0142\u00a2\2"+
		"\u0805\u0807\7\u0086\2\2\u0806\u0805\3\2\2\2\u0806\u0807\3\2\2\2\u0807"+
		"\u0809\3\2\2\2\u0808\u0802\3\2\2\2\u0809\u080c\3\2\2\2\u080a\u0808\3\2"+
		"\2\2\u080a\u080b\3\2\2\2\u080b\u0145\3\2\2\2\u080c\u080a\3\2\2\2\u080d"+
		"\u080e\7Z\2\2\u080e\u0810\5\u0144\u00a3\2\u080f\u0811\7}\2\2\u0810\u080f"+
		"\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0813\7[\2\2\u0813"+
		"\u0817\3\2\2\2\u0814\u0815\7Z\2\2\u0815\u0817\7[\2\2\u0816\u080d\3\2\2"+
		"\2\u0816\u0814\3\2\2\2\u0817\u0147\3\2\2\2\u0818\u081b\7\u0087\2\2\u0819"+
		"\u081b\5\u0188\u00c5\2\u081a\u0818\3\2\2\2\u081a\u0819\3\2\2\2\u081b\u0149"+
		"\3\2\2\2\u081c\u081d\5\u014c\u00a7\2\u081d\u081f\7Z\2\2\u081e\u0820\5"+
		"\u0154\u00ab\2\u081f\u081e\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0821\3\2"+
		"\2\2\u0821\u0822\7[\2\2\u0822\u014b\3\2\2\2\u0823\u0825\5\u0152\u00aa"+
		"\2\u0824\u0826\5\u00f6|\2\u0825\u0824\3\2\2\2\u0825\u0826\3\2\2\2\u0826"+
		"\u0827\3\2\2\2\u0827\u0829\5\u014e\u00a8\2\u0828\u082a\5\u0150\u00a9\2"+
		"\u0829\u0828\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082c\3\2\2\2\u082b\u082d"+
		"\5\u0162\u00b2\2\u082c\u082b\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u0836\3"+
		"\2\2\2\u082e\u0830\5\u0152\u00aa\2\u082f\u0831\5\u00f6|\2\u0830\u082f"+
		"\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u0833\3\2\2\2\u0832\u0834\5\u0162\u00b2"+
		"\2\u0833\u0832\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0836\3\2\2\2\u0835\u0823"+
		"\3\2\2\2\u0835\u082e\3\2\2\2\u0836\u014d\3\2\2\2\u0837\u0839\5\16\b\2"+
		"\u0838\u0837\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083b"+
		"\5\u0148\u00a5\2\u083b\u014f\3\2\2\2\u083c\u083d\7\'\2\2\u083d\u0151\3"+
		"\2\2\2\u083e\u083f\t\13\2\2\u083f\u0153\3\2\2\2\u0840\u0842\5\u0156\u00ac"+
		"\2\u0841\u0843\5\u0154\u00ab\2\u0842\u0841\3\2\2\2\u0842\u0843\3\2\2\2"+
		"\u0843\u084a\3\2\2\2\u0844\u0845\5\u016c\u00b7\2\u0845\u0847\7\u0081\2"+
		"\2\u0846\u0848\5\u0154\u00ab\2\u0847\u0846\3\2\2\2\u0847\u0848\3\2\2\2"+
		"\u0848\u084a\3\2\2\2\u0849\u0840\3\2\2\2\u0849\u0844\3\2\2\2\u084a\u0155"+
		"\3\2\2\2\u084b\u084d\5\u00f6|\2\u084c\u084b\3\2\2\2\u084c\u084d\3\2\2"+
		"\2\u084d\u084f\3\2\2\2\u084e\u0850\5\u00aeX\2\u084f\u084e\3\2\2\2\u084f"+
		"\u0850\3\2\2\2\u0850\u0852\3\2\2\2\u0851\u0853\5\u0158\u00ad\2\u0852\u0851"+
		"\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u085c\7\u0083\2"+
		"\2\u0855\u085c\5\u0138\u009d\2\u0856\u085c\5\u00eex\2\u0857\u085c\5\u00a6"+
		"T\2\u0858\u085c\5\u0180\u00c1\2\u0859\u085c\5\u00a0Q\2\u085a\u085c\5\u00a8"+
		"U\2\u085b\u084c\3\2\2\2\u085b\u0855\3\2\2\2\u085b\u0856\3\2\2\2\u085b"+
		"\u0857\3\2\2\2\u085b\u0858\3\2\2\2\u085b\u0859\3\2\2\2\u085b\u085a\3\2"+
		"\2\2\u085c\u0157\3\2\2\2\u085d\u085e\b\u00ad\1\2\u085e\u085f\5\u015a\u00ae"+
		"\2\u085f\u0865\3\2\2\2\u0860\u0861\f\3\2\2\u0861\u0862\7}\2\2\u0862\u0864"+
		"\5\u015a\u00ae\2\u0863\u0860\3\2\2\2\u0864\u0867\3\2\2\2\u0865\u0863\3"+
		"\2\2\2\u0865\u0866\3\2\2\2\u0866\u0159\3\2\2\2\u0867\u0865\3\2\2\2\u0868"+
		"\u086a\5\u0110\u0089\2\u0869\u086b\5\u015c\u00af\2\u086a\u0869\3\2\2\2"+
		"\u086a\u086b\3\2\2\2\u086b\u086d\3\2\2\2\u086c\u086e\5\u0160\u00b1\2\u086d"+
		"\u086c\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u087c\3\2\2\2\u086f\u0871\5\u0110"+
		"\u0089\2\u0870\u0872\5\u0140\u00a1\2\u0871\u0870\3\2\2\2\u0871\u0872\3"+
		"\2\2\2\u0872\u087c\3\2\2\2\u0873\u0875\7\u0087\2\2\u0874\u0873\3\2\2\2"+
		"\u0874\u0875\3\2\2\2\u0875\u0877\3\2\2\2\u0876\u0878\5\u00f6|\2\u0877"+
		"\u0876\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u087a\7\u0081"+
		"\2\2\u087a\u087c\5j\66\2\u087b\u0868\3\2\2\2\u087b\u086f\3\2\2\2\u087b"+
		"\u0874\3\2\2\2\u087c\u015b\3\2\2\2\u087d\u087e\b\u00af\1\2\u087e\u087f"+
		"\5\u015e\u00b0\2\u087f\u0884\3\2\2\2\u0880\u0881\f\3\2\2\u0881\u0883\5"+
		"\u015e\u00b0\2\u0882\u0880\3\2\2\2\u0883\u0886\3\2\2\2\u0884\u0882\3\2"+
		"\2\2\u0884\u0885\3\2\2\2\u0885\u015d\3\2\2\2\u0886\u0884\3\2\2\2\u0887"+
		"\u0888\t\f\2\2\u0888\u015f\3\2\2\2\u0889\u088a\7f\2\2\u088a\u088b\7\u008a"+
		"\2\2\u088b\u088c\b\u00b1\1\2\u088c\u0161\3\2\2\2\u088d\u088e\7\u0081\2"+
		"\2\u088e\u088f\5\u0164\u00b3\2\u088f\u0163\3\2\2\2\u0890\u0891\b\u00b3"+
		"\1\2\u0891\u0893\5\u0166\u00b4\2\u0892\u0894\7\u0086\2\2\u0893\u0892\3"+
		"\2\2\2\u0893\u0894\3\2\2\2\u0894\u089d\3\2\2\2\u0895\u0896\f\3\2\2\u0896"+
		"\u0897\7}\2\2\u0897\u0899\5\u0166\u00b4\2\u0898\u089a\7\u0086\2\2\u0899"+
		"\u0898\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089c\3\2\2\2\u089b\u0895\3\2"+
		"\2\2\u089c\u089f\3\2\2\2\u089d\u089b\3\2\2\2\u089d\u089e\3\2\2\2\u089e"+
		"\u0165\3\2\2\2\u089f\u089d\3\2\2\2\u08a0\u08a2\5\u00f6|\2\u08a1\u08a0"+
		"\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08b6\5\u016a\u00b6"+
		"\2\u08a4\u08a6\5\u00f6|\2\u08a5\u08a4\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6"+
		"\u08a7\3\2\2\2\u08a7\u08a9\7Q\2\2\u08a8\u08aa\5\u016c\u00b7\2\u08a9\u08a8"+
		"\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08b6\5\u016a\u00b6"+
		"\2\u08ac\u08ae\5\u00f6|\2\u08ad\u08ac\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae"+
		"\u08af\3\2\2\2\u08af\u08b1\5\u016c\u00b7\2\u08b0\u08b2\7Q\2\2\u08b1\u08b0"+
		"\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b4\5\u016a\u00b6"+
		"\2\u08b4\u08b6\3\2\2\2\u08b5\u08a1\3\2\2\2\u08b5\u08a5\3\2\2\2\u08b5\u08ad"+
		"\3\2\2\2\u08b6\u0167\3\2\2\2\u08b7\u08b9\5\16\b\2\u08b8\u08b7\3\2\2\2"+
		"\u08b8\u08b9\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bd\5\u0148\u00a5\2\u08bb"+
		"\u08bd\5\u00c2b\2\u08bc\u08b8\3\2\2\2\u08bc\u08bb\3\2\2\2\u08bd\u0169"+
		"\3\2\2\2\u08be\u08bf\5\u0168\u00b5\2\u08bf\u016b\3\2\2\2\u08c0\u08c1\t"+
		"\r\2\2\u08c1\u016d\3\2\2\2\u08c2\u08c3\7\65\2\2\u08c3\u08c4\5\u0170\u00b9"+
		"\2\u08c4\u016f\3\2\2\2\u08c5\u08c7\5\u00ba^\2\u08c6\u08c8\5\u0172\u00ba"+
		"\2\u08c7\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u0171\3\2\2\2\u08c9\u08cb"+
		"\5\u011c\u008f\2\u08ca\u08cc\5\u0172\u00ba\2\u08cb\u08ca\3\2\2\2\u08cb"+
		"\u08cc\3\2\2\2\u08cc\u0173\3\2\2\2\u08cd\u08ce\7\u0081\2\2\u08ce\u08cf"+
		"\5\u0176\u00bc\2\u08cf\u0175\3\2\2\2\u08d0\u08d2\5\u0178\u00bd\2\u08d1"+
		"\u08d3\7\u0086\2\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08dc"+
		"\3\2\2\2\u08d4\u08d6\5\u0178\u00bd\2\u08d5\u08d7\7\u0086\2\2\u08d6\u08d5"+
		"\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\7}\2\2\u08d9"+
		"\u08da\5\u0176\u00bc\2\u08da\u08dc\3\2\2\2\u08db\u08d0\3\2\2\2\u08db\u08d4"+
		"\3\2\2\2\u08dc\u0177\3\2\2\2\u08dd\u08de\5\u017a\u00be\2\u08de\u08e0\7"+
		"V\2\2\u08df\u08e1\5,\27\2\u08e0\u08df\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1"+
		"\u08e2\3\2\2\2\u08e2\u08e3\7W\2\2\u08e3\u08e8\3\2\2\2\u08e4\u08e5\5\u017a"+
		"\u00be\2\u08e5\u08e6\5\u0146\u00a4\2\u08e6\u08e8\3\2\2\2\u08e7\u08dd\3"+
		"\2\2\2\u08e7\u08e4\3\2\2\2\u08e8\u0179\3\2\2\2\u08e9\u08ec\5\u0168\u00b5"+
		"\2\u08ea\u08ec\7\u0087\2\2\u08eb\u08e9\3\2\2\2\u08eb\u08ea\3\2\2\2\u08ec"+
		"\u017b\3\2\2\2\u08ed\u08ee\7\65\2\2\u08ee\u08ef\5\u01b2\u00da\2\u08ef"+
		"\u017d\3\2\2\2\u08f0\u08f1\7\65\2\2\u08f1\u08f2\7\u0090\2\2\u08f2\u08f6"+
		"\7\u0087\2\2\u08f3\u08f4\7\65\2\2\u08f4\u08f6\7\u0093\2\2\u08f5\u08f0"+
		"\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f6\u017f\3\2\2\2\u08f7\u08f8\7E\2\2\u08f8"+
		"\u08f9\7g\2\2\u08f9\u08fa\5\u0182\u00c2\2\u08fa\u08fb\7h\2\2\u08fb\u08fc"+
		"\5\u009cO\2\u08fc\u0181\3\2\2\2\u08fd\u08fe\b\u00c2\1\2\u08fe\u08ff\5"+
		"\u0184\u00c3\2\u08ff\u0905\3\2\2\2\u0900\u0901\f\3\2\2\u0901\u0902\7}"+
		"\2\2\u0902\u0904\5\u0184\u00c3\2\u0903\u0900\3\2\2\2\u0904\u0907\3\2\2"+
		"\2\u0905\u0903\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0183\3\2\2\2\u0907\u0905"+
		"\3\2\2\2\u0908\u090b\5\u0186\u00c4\2\u0909\u090b\5\u0136\u009c\2\u090a"+
		"\u0908\3\2\2\2\u090a\u0909\3\2\2\2\u090b\u0185\3\2\2\2\u090c\u090e\7\26"+
		"\2\2\u090d\u090f\7\u0086\2\2\u090e\u090d\3\2\2\2\u090e\u090f\3\2\2\2\u090f"+
		"\u0911\3\2\2\2\u0910\u0912\7\u0087\2\2\u0911\u0910\3\2\2\2\u0911\u0912"+
		"\3\2\2\2\u0912\u093d\3\2\2\2\u0913\u0915\7\26\2\2\u0914\u0916\7\u0087"+
		"\2\2\u0915\u0914\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0917\3\2\2\2\u0917"+
		"\u0918\7f\2\2\u0918\u093d\5\u0126\u0094\2\u0919\u091b\7M\2\2\u091a\u091c"+
		"\7\u0086\2\2\u091b\u091a\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u091e\3\2\2"+
		"\2\u091d\u091f\7\u0087\2\2\u091e\u091d\3\2\2\2\u091e\u091f\3\2\2\2\u091f"+
		"\u093d\3\2\2\2\u0920\u0922\7M\2\2\u0921\u0923\7\u0087\2\2\u0922\u0921"+
		"\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0925\7f\2\2\u0925"+
		"\u093d\5\u0126\u0094\2\u0926\u0927\7E\2\2\u0927\u0928\7g\2\2\u0928\u0929"+
		"\5\u0182\u00c2\2\u0929\u092a\7h\2\2\u092a\u092c\7\26\2\2\u092b\u092d\7"+
		"\u0086\2\2\u092c\u092b\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092f\3\2\2\2"+
		"\u092e\u0930\7\u0087\2\2\u092f\u092e\3\2\2\2\u092f\u0930\3\2\2\2\u0930"+
		"\u093d\3\2\2\2\u0931\u0932\7E\2\2\u0932\u0933\7g\2\2\u0933\u0934\5\u0182"+
		"\u00c2\2\u0934\u0935\7h\2\2\u0935\u0937\7\26\2\2\u0936\u0938\7\u0087\2"+
		"\2\u0937\u0936\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093a"+
		"\7f\2\2\u093a\u093b\5\b\5\2\u093b\u093d\3\2\2\2\u093c\u090c\3\2\2\2\u093c"+
		"\u0913\3\2\2\2\u093c\u0919\3\2\2\2\u093c\u0920\3\2\2\2\u093c\u0926\3\2"+
		"\2\2\u093c\u0931\3\2\2\2\u093d\u0187\3\2\2\2\u093e\u093f\5\u018c\u00c7"+
		"\2\u093f\u0941\7g\2\2\u0940\u0942\5\u018e\u00c8\2\u0941\u0940\3\2\2\2"+
		"\u0941\u0942\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0944\7h\2\2\u0944\u0189"+
		"\3\2\2\2\u0945\u0955\5\u0188\u00c5\2\u0946\u0947\5\u017c\u00bf\2\u0947"+
		"\u0949\7g\2\2\u0948\u094a\5\u018e\u00c8\2\u0949\u0948\3\2\2\2\u0949\u094a"+
		"\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\7h\2\2\u094c\u0955\3\2\2\2\u094d"+
		"\u094e\5\u017e\u00c0\2\u094e\u0950\7g\2\2\u094f\u0951\5\u018e\u00c8\2"+
		"\u0950\u094f\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0953"+
		"\7h\2\2\u0953\u0955\3\2\2\2\u0954\u0945\3\2\2\2\u0954\u0946\3\2\2\2\u0954"+
		"\u094d\3\2\2\2\u0955\u018b\3\2\2\2\u0956\u0957\7\u0087\2\2\u0957\u018d"+
		"\3\2\2\2\u0958\u0959\b\u00c8\1\2\u0959\u095b\5\u0190\u00c9\2\u095a\u095c"+
		"\7\u0086\2\2\u095b\u095a\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u0965\3\2\2"+
		"\2\u095d\u095e\f\3\2\2\u095e\u095f\7}\2\2\u095f\u0961\5\u0190\u00c9\2"+
		"\u0960\u0962\7\u0086\2\2\u0961\u0960\3\2\2\2\u0961\u0962\3\2\2\2\u0962"+
		"\u0964\3\2\2\2\u0963\u095d\3\2\2\2\u0964\u0967\3\2\2\2\u0965\u0963\3\2"+
		"\2\2\u0965\u0966\3\2\2\2\u0966\u018f\3\2\2\2\u0967\u0965\3\2\2\2\u0968"+
		"\u096c\5\u0126\u0094\2\u0969\u096c\5j\66\2\u096a\u096c\5\b\5\2\u096b\u0968"+
		"\3\2\2\2\u096b\u0969\3\2\2\2\u096b\u096a\3\2\2\2\u096c\u0191\3\2\2\2\u096d"+
		"\u096e\7M\2\2\u096e\u096f\5\16\b\2\u096f\u0970\7\u0087\2\2\u0970\u0979"+
		"\3\2\2\2\u0971\u0972\7M\2\2\u0972\u0974\5\16\b\2\u0973\u0975\7E\2\2\u0974"+
		"\u0973\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0977\5\u0188"+
		"\u00c5\2\u0977\u0979\3\2\2\2\u0978\u096d\3\2\2\2\u0978\u0971\3\2\2\2\u0979"+
		"\u0193\3\2\2\2\u097a\u097c\7%\2\2\u097b\u097a\3\2\2\2\u097b\u097c\3\2"+
		"\2\2\u097c\u097d\3\2\2\2\u097d\u097e\7E\2\2\u097e\u097f\5\u009cO\2\u097f"+
		"\u0195\3\2\2\2\u0980\u0981\7E\2\2\u0981\u0982\7g\2\2\u0982\u0983\7h\2"+
		"\2\u0983\u0984\5\u009cO\2\u0984\u0197\3\2\2\2\u0985\u0986\5\u019c\u00cf"+
		"\2\u0986\u0987\5\u01a0\u00d1\2\u0987\u0199\3\2\2\2\u0988\u0989\5\u019e"+
		"\u00d0\2\u0989\u098a\5\u01a0\u00d1\2\u098a\u019b\3\2\2\2\u098b\u098c\7"+
		"J\2\2\u098c\u098d\5t;\2\u098d\u019d\3\2\2\2\u098e\u0990\7J\2\2\u098f\u0991"+
		"\5\u0174\u00bb\2\u0990\u098f\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0992\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u0992\u0993\5t;\2\u0993\u019f\3\2\2\2\u0994\u0996\5\u01a2\u00d2"+
		"\2\u0995\u0997\5\u01a0\u00d1\2\u0996\u0995\3\2\2\2\u0996\u0997\3\2\2\2"+
		"\u0997\u01a1\3\2\2\2\u0998\u0999\5\u01a4\u00d3\2\u0999\u099a\5t;\2\u099a"+
		"\u01a3\3\2\2\2\u099b\u099c\7\22\2\2\u099c\u099d\7V\2\2\u099d\u099e\5\u01a6"+
		"\u00d4\2\u099e\u099f\7W\2\2\u099f\u01a5\3\2\2\2\u09a0\u09a2\5\u00f6|\2"+
		"\u09a1\u09a0\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4"+
		"\5\u00ba^\2\u09a4\u09a5\5\u0110\u0089\2\u09a5\u09af\3\2\2\2\u09a6\u09a8"+
		"\5\u00f6|\2\u09a7\u09a6\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a9\3\2\2"+
		"\2\u09a9\u09ab\5\u00ba^\2\u09aa\u09ac\5\u0128\u0095\2\u09ab\u09aa\3\2"+
		"\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09af\3\2\2\2\u09ad\u09af\7\u0086\2\2\u09ae"+
		"\u09a1\3\2\2\2\u09ae\u09a7\3\2\2\2\u09ae\u09ad\3\2\2\2\u09af\u01a7\3\2"+
		"\2\2\u09b0\u09b2\7H\2\2\u09b1\u09b3\5b\62\2\u09b2\u09b1\3\2\2\2\u09b2"+
		"\u09b3\3\2\2\2\u09b3\u01a9\3\2\2\2\u09b4\u09b7\5\u01ac\u00d7\2\u09b5\u09b7"+
		"\5\u01b0\u00d9\2\u09b6\u09b4\3\2\2\2\u09b6\u09b5\3\2\2\2\u09b7\u01ab\3"+
		"\2\2\2\u09b8\u09b9\7H\2\2\u09b9\u09bb\7V\2\2\u09ba\u09bc\5\u01ae\u00d8"+
		"\2\u09bb\u09ba\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be"+
		"\7W\2\2\u09be\u01ad\3\2\2\2\u09bf\u09c0\b\u00d8\1\2\u09c0\u09c2\5\u0126"+
		"\u0094\2\u09c1\u09c3\7\u0086\2\2\u09c2\u09c1\3\2\2\2\u09c2\u09c3\3\2\2"+
		"\2\u09c3\u09cc\3\2\2\2\u09c4\u09c5\f\3\2\2\u09c5\u09c6\7}\2\2\u09c6\u09c8"+
		"\5\u0126\u0094\2\u09c7\u09c9\7\u0086\2\2\u09c8\u09c7\3\2\2\2\u09c8\u09c9"+
		"\3\2\2\2\u09c9\u09cb\3\2\2\2\u09ca\u09c4\3\2\2\2\u09cb\u09ce\3\2\2\2\u09cc"+
		"\u09ca\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u01af\3\2\2\2\u09ce\u09cc\3\2"+
		"\2\2\u09cf\u09d0\7\63\2\2\u09d0\u09d1\7V\2\2\u09d1\u09d2\5j\66\2\u09d2"+
		"\u09d3\7W\2\2\u09d3\u09d6\3\2\2\2\u09d4\u09d6\7\63\2\2\u09d5\u09cf\3\2"+
		"\2\2\u09d5\u09d4\3\2\2\2\u09d6\u01b1\3\2\2\2\u09d7\u0a0b\7\62\2\2\u09d8"+
		"\u0a0b\7\35\2\2\u09d9\u09da\7\62\2\2\u09da\u09db\7X\2\2\u09db\u0a0b\7"+
		"Y\2\2\u09dc\u09dd\7\35\2\2\u09dd\u09de\7X\2\2\u09de\u0a0b\7Y\2\2\u09df"+
		"\u0a0b\7\\\2\2\u09e0\u0a0b\7]\2\2\u09e1\u0a0b\7^\2\2\u09e2\u0a0b\7_\2"+
		"\2\u09e3\u0a0b\7`\2\2\u09e4\u0a0b\7a\2\2\u09e5\u0a0b\7b\2\2\u09e6\u0a0b"+
		"\7c\2\2\u09e7\u0a0b\7d\2\2\u09e8\u0a0b\7\3\2\2\u09e9\u0a0b\7\4\2\2\u09ea"+
		"\u0a0b\7f\2\2\u09eb\u0a0b\7g\2\2\u09ec\u0a0b\7h\2\2\u09ed\u0a0b\7i\2\2"+
		"\u09ee\u0a0b\7j\2\2\u09ef\u0a0b\7k\2\2\u09f0\u0a0b\7l\2\2\u09f1\u0a0b"+
		"\7m\2\2\u09f2\u0a0b\7n\2\2\u09f3\u0a0b\7o\2\2\u09f4\u0a0b\7p\2\2\u09f5"+
		"\u0a0b\7q\2\2\u09f6\u0a0b\7r\2\2\u09f7\u0a0b\7t\2\2\u09f8\u0a0b\7s\2\2"+
		"\u09f9\u0a0b\7u\2\2\u09fa\u0a0b\7v\2\2\u09fb\u0a0b\7w\2\2\u09fc\u0a0b"+
		"\7x\2\2\u09fd\u0a0b\7\5\2\2\u09fe\u0a0b\7\6\2\2\u09ff\u0a0b\7\7\2\2\u0a00"+
		"\u0a0b\7\b\2\2\u0a01\u0a0b\7{\2\2\u0a02\u0a0b\7|\2\2\u0a03\u0a0b\7}\2"+
		"\2\u0a04\u0a0b\7~\2\2\u0a05\u0a0b\7\177\2\2\u0a06\u0a07\7V\2\2\u0a07\u0a0b"+
		"\7W\2\2\u0a08\u0a09\7X\2\2\u0a09\u0a0b\7Y\2\2\u0a0a\u09d7\3\2\2\2\u0a0a"+
		"\u09d8\3\2\2\2\u0a0a\u09d9\3\2\2\2\u0a0a\u09dc\3\2\2\2\u0a0a\u09df\3\2"+
		"\2\2\u0a0a\u09e0\3\2\2\2\u0a0a\u09e1\3\2\2\2\u0a0a\u09e2\3\2\2\2\u0a0a"+
		"\u09e3\3\2\2\2\u0a0a\u09e4\3\2\2\2\u0a0a\u09e5\3\2\2\2\u0a0a\u09e6\3\2"+
		"\2\2\u0a0a\u09e7\3\2\2\2\u0a0a\u09e8\3\2\2\2\u0a0a\u09e9\3\2\2\2\u0a0a"+
		"\u09ea\3\2\2\2\u0a0a\u09eb\3\2\2\2\u0a0a\u09ec\3\2\2\2\u0a0a\u09ed\3\2"+
		"\2\2\u0a0a\u09ee\3\2\2\2\u0a0a\u09ef\3\2\2\2\u0a0a\u09f0\3\2\2\2\u0a0a"+
		"\u09f1\3\2\2\2\u0a0a\u09f2\3\2\2\2\u0a0a\u09f3\3\2\2\2\u0a0a\u09f4\3\2"+
		"\2\2\u0a0a\u09f5\3\2\2\2\u0a0a\u09f6\3\2\2\2\u0a0a\u09f7\3\2\2\2\u0a0a"+
		"\u09f8\3\2\2\2\u0a0a\u09f9\3\2\2\2\u0a0a\u09fa\3\2\2\2\u0a0a\u09fb\3\2"+
		"\2\2\u0a0a\u09fc\3\2\2\2\u0a0a\u09fd\3\2\2\2\u0a0a\u09fe\3\2\2\2\u0a0a"+
		"\u09ff\3\2\2\2\u0a0a\u0a00\3\2\2\2\u0a0a\u0a01\3\2\2\2\u0a0a\u0a02\3\2"+
		"\2\2\u0a0a\u0a03\3\2\2\2\u0a0a\u0a04\3\2\2\2\u0a0a\u0a05\3\2\2\2\u0a0a"+
		"\u0a06\3\2\2\2\u0a0a\u0a08\3\2\2\2\u0a0b\u01b3\3\2\2\2\u0a0c\u0a14\7\u0088"+
		"\2\2\u0a0d\u0a14\7\u008e\2\2\u0a0e\u0a14\7\u008f\2\2\u0a0f\u0a14\7\u0090"+
		"\2\2\u0a10\u0a14\5\u01b6\u00dc\2\u0a11\u0a14\5\u01b8\u00dd\2\u0a12\u0a14"+
		"\5\u01ba\u00de\2\u0a13\u0a0c\3\2\2\2\u0a13\u0a0d\3\2\2\2\u0a13\u0a0e\3"+
		"\2\2\2\u0a13\u0a0f\3\2\2\2\u0a13\u0a10\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a13"+
		"\u0a12\3\2\2\2\u0a14\u01b5\3\2\2\2\u0a15\u0a16\t\16\2\2\u0a16\u01b7\3"+
		"\2\2\2\u0a17\u0a18\7\64\2\2\u0a18\u01b9\3\2\2\2\u0a19\u0a1a\t\17\2\2\u0a1a"+
		"\u01bb\3\2\2\2\u0148\u01bf\u01c2\u01c5\u01d3\u01d7\u01e2\u01e6\u01f5\u01fc"+
		"\u0201\u0203\u0208\u020e\u0218\u021f\u0225\u0229\u022e\u0234\u023b\u0241"+
		"\u0244\u0247\u024a\u0253\u025a\u028e\u0298\u02a5\u02a7\u02b1\u02b7\u02bc"+
		"\u02bf\u02c4\u02cb\u02d0\u02d3\u02d5\u02de\u02ed\u02f3\u0311\u0316\u031a"+
		"\u031e\u0321\u0325\u032b\u032d\u0335\u0339\u033c\u0343\u034a\u034e\u0353"+
		"\u0357\u035a\u035f\u0365\u0370\u037f\u0381\u0390\u0392\u039e\u03a0\u03ac"+
		"\u03c0\u03c2\u03ce\u03d0\u03db\u03e6\u03f1\u03fd\u03ff\u040b\u040d\u0417"+
		"\u041c\u042c\u0433\u0437\u043b\u043f\u0443\u0448\u044b\u044e\u0454\u045a"+
		"\u045f\u0466\u046c\u0477\u0485\u0493\u049b\u04a1\u04ad\u04bd\u04c1\u04ce"+
		"\u04d1\u04d8\u04e0\u04ea\u04f1\u04fc\u0508\u0512\u0517\u051f\u0522\u0527"+
		"\u052c\u0545\u0549\u054e\u0559\u055f\u0563\u0568\u056c\u0571\u0574\u058a"+
		"\u0590\u059b\u059f\u05a2\u05ac\u05b2\u05b5\u05bc\u05c6\u05ca\u05cd\u05d0"+
		"\u05d4\u05d9\u05db\u05df\u05e3\u05ec\u05f9\u0601\u0607\u060d\u0611\u0614"+
		"\u061d\u0626\u062e\u0639\u063f\u064a\u064d\u0652\u0661\u0667\u0670\u067a"+
		"\u0680\u0688\u068c\u0690\u0695\u069a\u06a1\u06a3\u06a8\u06ac\u06ba\u06c0"+
		"\u06d2\u06d4\u06de\u06e3\u06ea\u06f0\u06f5\u06f9\u06ff\u0705\u070b\u0710"+
		"\u0717\u071a\u071d\u0720\u0725\u0729\u072c\u0730\u0734\u0739\u073c\u073e"+
		"\u0742\u0749\u074f\u0753\u0759\u075e\u0760\u0766\u076a\u0770\u0777\u077b"+
		"\u077d\u077f\u0786\u0790\u0794\u0796\u0798\u079c\u079f\u07a5\u07af\u07b3"+
		"\u07b9\u07c1\u07c5\u07c8\u07cc\u07d1\u07d7\u07da\u07de\u07e1\u07eb\u07f2"+
		"\u07f7\u07fb\u0800\u0806\u080a\u0810\u0816\u081a\u081f\u0825\u0829\u082c"+
		"\u0830\u0833\u0835\u0838\u0842\u0847\u0849\u084c\u084f\u0852\u085b\u0865"+
		"\u086a\u086d\u0871\u0874\u0877\u087b\u0884\u0893\u0899\u089d\u08a1\u08a5"+
		"\u08a9\u08ad\u08b1\u08b5\u08b8\u08bc\u08c7\u08cb\u08d2\u08d6\u08db\u08e0"+
		"\u08e7\u08eb\u08f5\u0905\u090a\u090e\u0911\u0915\u091b\u091e\u0922\u092c"+
		"\u092f\u0937\u093c\u0941\u0949\u0950\u0954\u095b\u0961\u0965\u096b\u0974"+
		"\u0978\u097b\u0990\u0996\u09a1\u09a7\u09ab\u09ae\u09b2\u09b6\u09bb\u09c2"+
		"\u09c8\u09cc\u09d5\u0a0a\u0a13";
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