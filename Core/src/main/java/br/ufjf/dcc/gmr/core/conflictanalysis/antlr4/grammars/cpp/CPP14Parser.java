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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, MultiLineMacro=9, 
		Directive=10, Alignas=11, Alignof=12, Asm=13, Auto=14, Bool=15, Break=16, 
		Case=17, Catch=18, Char=19, Char16=20, Char32=21, Class=22, Const=23, 
		Constexpr=24, Const_cast=25, Continue=26, Decltype=27, Default=28, Delete=29, 
		Do=30, Double=31, Dynamic_cast=32, Else=33, Enum=34, Explicit=35, Export=36, 
		Extern=37, False=38, Final=39, Float=40, For=41, Friend=42, Goto=43, If=44, 
		Inline=45, Int=46, Long=47, Mutable=48, Namespace=49, New=50, Noexcept=51, 
		Nullptr=52, Operator=53, Override=54, Private=55, Protected=56, Public=57, 
		Register=58, Reinterpret_cast=59, Return=60, Short=61, Signed=62, Sizeof=63, 
		Static=64, Static_assert=65, Static_cast=66, Struct=67, Switch=68, Template=69, 
		This=70, Thread_local=71, Throw=72, True=73, Try=74, Typedef=75, Typeid_=76, 
		Typename_=77, Union=78, Unsigned=79, Using=80, Virtual=81, Void=82, Volatile=83, 
		Wchar=84, While=85, LeftParen=86, RightParen=87, LeftBracket=88, RightBracket=89, 
		LeftBrace=90, RightBrace=91, Plus=92, Minus=93, Star=94, Div=95, Mod=96, 
		Caret=97, And=98, Or=99, Tilde=100, Not=101, Assign=102, Less=103, Greater=104, 
		PlusAssign=105, MinusAssign=106, StarAssign=107, DivAssign=108, ModAssign=109, 
		XorAssign=110, AndAssign=111, OrAssign=112, LeftShift=113, RightShift=114, 
		LeftShiftAssign=115, RightShiftAssign=116, Equal=117, NotEqual=118, LessEqual=119, 
		GreaterEqual=120, AndAnd=121, OrOr=122, PlusPlus=123, MinusMinus=124, 
		Comma=125, ArrowStar=126, Arrow=127, Question=128, Colon=129, Doublecolon=130, 
		Semi=131, Dot=132, DotStar=133, Ellipsis=134, Identifier=135, Integerliteral=136, 
		Decimalliteral=137, Octalliteral=138, Hexadecimalliteral=139, Binaryliteral=140, 
		Integersuffix=141, Characterliteral=142, Floatingliteral=143, Stringliteral=144, 
		Userdefinedintegerliteral=145, Userdefinedfloatingliteral=146, Userdefinedstringliteral=147, 
		Userdefinedcharacterliteral=148, Whitespace=149, Newline=150, BlockComment=151, 
		LineComment=152;
	public static final int
		RULE_translationunit = 0, RULE_primaryexpression = 1, RULE_idexpression = 2, 
		RULE_unqualifiedid = 3, RULE_qualifiedid = 4, RULE_nestednamespecifier = 5, 
		RULE_lambdaexpression = 6, RULE_lambdaintroducer = 7, RULE_lambdacapture = 8, 
		RULE_capturedefault = 9, RULE_capturelist = 10, RULE_capture = 11, RULE_simplecapture = 12, 
		RULE_initcapture = 13, RULE_lambdadeclarator = 14, RULE_postfixexpression = 15, 
		RULE_typeidofexpr = 16, RULE_typeidofthetypeid = 17, RULE_expressionlist = 18, 
		RULE_pseudodestructorname = 19, RULE_unaryexpression = 20, RULE_unaryoperator = 21, 
		RULE_newexpression = 22, RULE_newplacement = 23, RULE_newtypeid = 24, 
		RULE_newdeclarator = 25, RULE_noptrnewdeclarator = 26, RULE_newinitializer = 27, 
		RULE_deleteexpression = 28, RULE_noexceptexpression = 29, RULE_castexpression = 30, 
		RULE_realcastexpression = 31, RULE_pmexpression = 32, RULE_multiplicativeexpression = 33, 
		RULE_additiveexpression = 34, RULE_shiftexpression = 35, RULE_shiftoperator = 36, 
		RULE_relationalexpression = 37, RULE_equalityexpression = 38, RULE_andexpression = 39, 
		RULE_exclusiveorexpression = 40, RULE_inclusiveorexpression = 41, RULE_logicalandexpression = 42, 
		RULE_logicalorexpression = 43, RULE_conditionalexpression = 44, RULE_assignmentexpression = 45, 
		RULE_assignmentoperator = 46, RULE_expression = 47, RULE_constantexpression = 48, 
		RULE_statement = 49, RULE_labeledstatement = 50, RULE_expressionstatement = 51, 
		RULE_compoundstatement = 52, RULE_statementseq = 53, RULE_selectionstatement = 54, 
		RULE_condition = 55, RULE_iterationstatement = 56, RULE_forinitstatement = 57, 
		RULE_forrangedeclaration = 58, RULE_forrangeinitializer = 59, RULE_jumpstatement = 60, 
		RULE_declarationstatement = 61, RULE_declarationseq = 62, RULE_declaration = 63, 
		RULE_includedeclaration = 64, RULE_blockdeclaration = 65, RULE_aliasdeclaration = 66, 
		RULE_simpledeclaration = 67, RULE_static_assertdeclaration = 68, RULE_emptydeclaration = 69, 
		RULE_attributedeclaration = 70, RULE_declspecifier = 71, RULE_declspecifierseq = 72, 
		RULE_storageclassspecifier = 73, RULE_functionspecifier = 74, RULE_typedefname = 75, 
		RULE_typespecifier = 76, RULE_trailingtypespecifier = 77, RULE_typespecifierseq = 78, 
		RULE_trailingtypespecifierseq = 79, RULE_simpletypespecifier = 80, RULE_thetypename = 81, 
		RULE_decltypespecifier = 82, RULE_elaboratedtypespecifier = 83, RULE_enumname = 84, 
		RULE_enumspecifier = 85, RULE_enumhead = 86, RULE_opaqueenumdeclaration = 87, 
		RULE_enumkey = 88, RULE_enumbase = 89, RULE_enumeratorlist = 90, RULE_enumeratordefinition = 91, 
		RULE_enumerator = 92, RULE_namespacename = 93, RULE_originalnamespacename = 94, 
		RULE_namespacedefinition = 95, RULE_namednamespacedefinition = 96, RULE_originalnamespacedefinition = 97, 
		RULE_extensionnamespacedefinition = 98, RULE_unnamednamespacedefinition = 99, 
		RULE_namespacebody = 100, RULE_namespacealias = 101, RULE_namespacealiasdefinition = 102, 
		RULE_qualifiednamespacespecifier = 103, RULE_usingdeclaration = 104, RULE_usingdirective = 105, 
		RULE_asmdefinition = 106, RULE_linkagespecification = 107, RULE_attributespecifierseq = 108, 
		RULE_attributespecifier = 109, RULE_alignmentspecifier = 110, RULE_attributelist = 111, 
		RULE_attribute = 112, RULE_attributetoken = 113, RULE_attributescopedtoken = 114, 
		RULE_attributenamespace = 115, RULE_attributeargumentclause = 116, RULE_balancedtokenseq = 117, 
		RULE_balancedtoken = 118, RULE_initdeclaratorlist = 119, RULE_initdeclarator = 120, 
		RULE_declarator = 121, RULE_ptrdeclarator = 122, RULE_noptrdeclarator = 123, 
		RULE_parametersandqualifiers = 124, RULE_trailingreturntype = 125, RULE_ptroperator = 126, 
		RULE_cvqualifierseq = 127, RULE_cvqualifier = 128, RULE_refqualifier = 129, 
		RULE_declaratorid = 130, RULE_thetypeid = 131, RULE_abstractdeclarator = 132, 
		RULE_ptrabstractdeclarator = 133, RULE_noptrabstractdeclarator = 134, 
		RULE_abstractpackdeclarator = 135, RULE_noptrabstractpackdeclarator = 136, 
		RULE_parameterdeclarationclause = 137, RULE_parameterdeclarationlist = 138, 
		RULE_parameterdeclaration = 139, RULE_functiondefinition = 140, RULE_functionhead = 141, 
		RULE_functionbody = 142, RULE_initializer = 143, RULE_braceorequalinitializer = 144, 
		RULE_initializerclause = 145, RULE_initializerlist = 146, RULE_bracedinitlist = 147, 
		RULE_classname = 148, RULE_classspecifier = 149, RULE_classhead = 150, 
		RULE_classheadname = 151, RULE_classvirtspecifier = 152, RULE_classkey = 153, 
		RULE_memberspecification = 154, RULE_memberdeclaration = 155, RULE_memberdeclaratorlist = 156, 
		RULE_memberdeclarator = 157, RULE_virtspecifierseq = 158, RULE_virtspecifier = 159, 
		RULE_purespecifier = 160, RULE_baseclause = 161, RULE_basespecifierlist = 162, 
		RULE_basespecifier = 163, RULE_classordecltype = 164, RULE_basetypespecifier = 165, 
		RULE_accessspecifier = 166, RULE_conversionfunctionid = 167, RULE_conversiontypeid = 168, 
		RULE_conversiondeclarator = 169, RULE_ctorinitializer = 170, RULE_meminitializerlist = 171, 
		RULE_meminitializer = 172, RULE_meminitializerid = 173, RULE_operatorfunctionid = 174, 
		RULE_literaloperatorid = 175, RULE_templatedeclaration = 176, RULE_templateparameterlist = 177, 
		RULE_templateparameter = 178, RULE_typeparameter = 179, RULE_simpletemplateid = 180, 
		RULE_templateid = 181, RULE_templatename = 182, RULE_templateargumentlist = 183, 
		RULE_templateargument = 184, RULE_typenamespecifier = 185, RULE_explicitinstantiation = 186, 
		RULE_explicitspecialization = 187, RULE_tryblock = 188, RULE_functiontryblock = 189, 
		RULE_handlerseq = 190, RULE_handler = 191, RULE_exceptiondeclaration = 192, 
		RULE_throwexpression = 193, RULE_exceptionspecification = 194, RULE_dynamicexceptionspecification = 195, 
		RULE_typeidlist = 196, RULE_noexceptspecification = 197, RULE_theoperator = 198, 
		RULE_literal = 199, RULE_booleanliteral = 200, RULE_pointerliteral = 201, 
		RULE_userdefinedliteral = 202;
	public static final String[] ruleNames = {
		"translationunit", "primaryexpression", "idexpression", "unqualifiedid", 
		"qualifiedid", "nestednamespecifier", "lambdaexpression", "lambdaintroducer", 
		"lambdacapture", "capturedefault", "capturelist", "capture", "simplecapture", 
		"initcapture", "lambdadeclarator", "postfixexpression", "typeidofexpr", 
		"typeidofthetypeid", "expressionlist", "pseudodestructorname", "unaryexpression", 
		"unaryoperator", "newexpression", "newplacement", "newtypeid", "newdeclarator", 
		"noptrnewdeclarator", "newinitializer", "deleteexpression", "noexceptexpression", 
		"castexpression", "realcastexpression", "pmexpression", "multiplicativeexpression", 
		"additiveexpression", "shiftexpression", "shiftoperator", "relationalexpression", 
		"equalityexpression", "andexpression", "exclusiveorexpression", "inclusiveorexpression", 
		"logicalandexpression", "logicalorexpression", "conditionalexpression", 
		"assignmentexpression", "assignmentoperator", "expression", "constantexpression", 
		"statement", "labeledstatement", "expressionstatement", "compoundstatement", 
		"statementseq", "selectionstatement", "condition", "iterationstatement", 
		"forinitstatement", "forrangedeclaration", "forrangeinitializer", "jumpstatement", 
		"declarationstatement", "declarationseq", "declaration", "includedeclaration", 
		"blockdeclaration", "aliasdeclaration", "simpledeclaration", "static_assertdeclaration", 
		"emptydeclaration", "attributedeclaration", "declspecifier", "declspecifierseq", 
		"storageclassspecifier", "functionspecifier", "typedefname", "typespecifier", 
		"trailingtypespecifier", "typespecifierseq", "trailingtypespecifierseq", 
		"simpletypespecifier", "thetypename", "decltypespecifier", "elaboratedtypespecifier", 
		"enumname", "enumspecifier", "enumhead", "opaqueenumdeclaration", "enumkey", 
		"enumbase", "enumeratorlist", "enumeratordefinition", "enumerator", "namespacename", 
		"originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
		"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
		"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
		"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
		"attributespecifierseq", "attributespecifier", "alignmentspecifier", "attributelist", 
		"attribute", "attributetoken", "attributescopedtoken", "attributenamespace", 
		"attributeargumentclause", "balancedtokenseq", "balancedtoken", "initdeclaratorlist", 
		"initdeclarator", "declarator", "ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", 
		"trailingreturntype", "ptroperator", "cvqualifierseq", "cvqualifier", 
		"refqualifier", "declaratorid", "thetypeid", "abstractdeclarator", "ptrabstractdeclarator", 
		"noptrabstractdeclarator", "abstractpackdeclarator", "noptrabstractpackdeclarator", 
		"parameterdeclarationclause", "parameterdeclarationlist", "parameterdeclaration", 
		"functiondefinition", "functionhead", "functionbody", "initializer", "braceorequalinitializer", 
		"initializerclause", "initializerlist", "bracedinitlist", "classname", 
		"classspecifier", "classhead", "classheadname", "classvirtspecifier", 
		"classkey", "memberspecification", "memberdeclaration", "memberdeclaratorlist", 
		"memberdeclarator", "virtspecifierseq", "virtspecifier", "purespecifier", 
		"baseclause", "basespecifierlist", "basespecifier", "classordecltype", 
		"basetypespecifier", "accessspecifier", "conversionfunctionid", "conversiontypeid", 
		"conversiondeclarator", "ctorinitializer", "meminitializerlist", "meminitializer", 
		"meminitializerid", "operatorfunctionid", "literaloperatorid", "templatedeclaration", 
		"templateparameterlist", "templateparameter", "typeparameter", "simpletemplateid", 
		"templateid", "templatename", "templateargumentlist", "templateargument", 
		"typenamespecifier", "explicitinstantiation", "explicitspecialization", 
		"tryblock", "functiontryblock", "handlerseq", "handler", "exceptiondeclaration", 
		"throwexpression", "exceptionspecification", "dynamicexceptionspecification", 
		"typeidlist", "noexceptspecification", "theoperator", "literal", "booleanliteral", 
		"pointerliteral", "userdefinedliteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'not'", "'&&'", "'and'", "'||'", "'or'", "'include'", "'\"'", 
		null, null, "'alignas'", "'alignof'", "'asm'", "'auto'", "'bool'", "'break'", 
		"'case'", "'catch'", "'char'", "'char16_t'", "'char32_t'", "'class'", 
		"'const'", "'constexpr'", "'const_cast'", "'continue'", "'decltype'", 
		"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
		"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
		"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
		"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
		"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
		"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'static_assert'", "'static_cast'", "'struct'", "'switch'", "'template'", 
		"'this'", "'thread_local'", "'throw'", "'true'", "'try'", "'typedef'", 
		"'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", "'virtual'", 
		"'void'", "'volatile'", "'wchar_t'", "'while'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
		"'~'", null, "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'^='", "'&='", "'|='", "'<<'", "'>>'", "'<<='", "'>>='", "'=='", "'!='", 
		"'<='", "'>='", null, null, "'++'", "'--'", "','", "'->*'", "'->'", "'?'", 
		"':'", "'::'", "';'", "'.'", "'.*'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "MultiLineMacro", 
		"Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", "Break", "Case", 
		"Catch", "Char", "Char16", "Char32", "Class", "Const", "Constexpr", "Const_cast", 
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
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Semi - 130)) | (1L << (Ellipsis - 130)) | (1L << (Identifier - 130)))) != 0)) {
				{
				setState(406);
				declarationseq(0);
				}
			}

			setState(409);
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
		enterRule(_localctx, 2, RULE_primaryexpression);
		try {
			setState(419);
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
				setState(411);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(LeftParen);
				setState(414);
				expression(0);
				setState(415);
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
				setState(417);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
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
		enterRule(_localctx, 4, RULE_idexpression);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
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
		enterRule(_localctx, 6, RULE_unqualifiedid);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				match(Tilde);
				setState(430);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(431);
				match(Tilde);
				setState(432);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(433);
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
		enterRule(_localctx, 8, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			nestednamespecifier(0);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(437);
				match(Template);
				}
			}

			setState(440);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(443);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(444);
				thetypename();
				setState(445);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(447);
				namespacename();
				setState(448);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(450);
				decltypespecifier();
				setState(451);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(465);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(455);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(456);
						match(Identifier);
						setState(457);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(458);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(460);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(459);
							match(Template);
							}
						}

						setState(462);
						simpletemplateid();
						setState(463);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 12, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			lambdaintroducer();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(471);
				lambdadeclarator();
				}
			}

			setState(474);
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
		enterRule(_localctx, 14, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(LeftBracket);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (This - 70)) | (1L << (And - 70)) | (1L << (Assign - 70)))) != 0) || _la==Identifier) {
				{
				setState(477);
				lambdacapture();
				}
			}

			setState(480);
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
		enterRule(_localctx, 16, RULE_lambdacapture);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				capturedefault();
				setState(485);
				match(Comma);
				setState(486);
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
		enterRule(_localctx, 18, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(493);
			capture();
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(494);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(497);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(498);
					match(Comma);
					setState(499);
					capture();
					setState(501);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(500);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
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
		enterRule(_localctx, 24, RULE_simplecapture);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(And);
				setState(514);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
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
		enterRule(_localctx, 26, RULE_initcapture);
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(Identifier);
				setState(519);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(And);
				setState(521);
				match(Identifier);
				setState(522);
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
		enterRule(_localctx, 28, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(LeftParen);
			setState(526);
			parameterdeclarationclause();
			setState(527);
			match(RightParen);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(528);
				match(Mutable);
				}
			}

			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(531);
				exceptionspecification();
				}
			}

			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(534);
				attributespecifierseq(0);
				}
			}

			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(537);
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
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
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
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(541);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(542);
				simpletypespecifier();
				setState(543);
				match(LeftParen);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(544);
					expressionlist();
					}
				}

				setState(547);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(549);
				typenamespecifier();
				setState(550);
				match(LeftParen);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(551);
					expressionlist();
					}
				}

				setState(554);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(556);
				simpletypespecifier();
				setState(557);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(559);
				typenamespecifier();
				setState(560);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(562);
				match(Dynamic_cast);
				setState(563);
				match(Less);
				setState(564);
				thetypeid();
				setState(565);
				match(Greater);
				setState(566);
				match(LeftParen);
				setState(567);
				expression(0);
				setState(568);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(570);
				match(Static_cast);
				setState(571);
				match(Less);
				setState(572);
				thetypeid();
				setState(573);
				match(Greater);
				setState(574);
				match(LeftParen);
				setState(575);
				expression(0);
				setState(576);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(578);
				match(Reinterpret_cast);
				setState(579);
				match(Less);
				setState(580);
				thetypeid();
				setState(581);
				match(Greater);
				setState(582);
				match(LeftParen);
				setState(583);
				expression(0);
				setState(584);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(586);
				match(Const_cast);
				setState(587);
				match(Less);
				setState(588);
				thetypeid();
				setState(589);
				match(Greater);
				setState(590);
				match(LeftParen);
				setState(591);
				expression(0);
				setState(592);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(594);
				typeidofthetypeid();
				setState(595);
				match(LeftParen);
				setState(596);
				expression(0);
				setState(597);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(599);
				typeidofthetypeid();
				setState(600);
				match(LeftParen);
				setState(601);
				thetypeid();
				setState(602);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(644);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(606);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(607);
						match(LeftBracket);
						setState(608);
						expression(0);
						setState(609);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(611);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(612);
						match(LeftBracket);
						setState(613);
						bracedinitlist();
						setState(614);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(616);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(617);
						match(LeftParen);
						setState(619);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(618);
							expressionlist();
							}
						}

						setState(621);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(622);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(623);
						match(Dot);
						setState(625);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(624);
							match(Template);
							}
						}

						setState(627);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(628);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(629);
						match(Arrow);
						setState(631);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(630);
							match(Template);
							}
						}

						setState(633);
						idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(634);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(635);
						match(Dot);
						setState(636);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(637);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(638);
						match(Arrow);
						setState(639);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(640);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(641);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(642);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(643);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(648);
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
		enterRule(_localctx, 32, RULE_typeidofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
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
		enterRule(_localctx, 34, RULE_typeidofthetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
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
		enterRule(_localctx, 36, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
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
		enterRule(_localctx, 38, RULE_pseudodestructorname);
		int _la;
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(655);
					nestednamespecifier(0);
					}
					break;
				}
				setState(658);
				thetypename();
				setState(659);
				match(Doublecolon);
				setState(660);
				match(Tilde);
				setState(661);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				nestednamespecifier(0);
				setState(664);
				match(Template);
				setState(665);
				simpletemplateid();
				setState(666);
				match(Doublecolon);
				setState(667);
				match(Tilde);
				setState(668);
				thetypename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(670);
					nestednamespecifier(0);
					}
				}

				setState(673);
				match(Tilde);
				setState(674);
				thetypename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(675);
				match(Tilde);
				setState(676);
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
		enterRule(_localctx, 40, RULE_unaryexpression);
		try {
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(PlusPlus);
				setState(681);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				match(MinusMinus);
				setState(683);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(684);
				unaryoperator();
				setState(685);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(687);
				match(Sizeof);
				setState(688);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(689);
				match(Sizeof);
				setState(690);
				match(LeftParen);
				setState(691);
				thetypeid();
				setState(692);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(694);
				match(Sizeof);
				setState(695);
				match(Ellipsis);
				setState(696);
				match(LeftParen);
				setState(697);
				match(Identifier);
				setState(698);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(699);
				match(Alignof);
				setState(700);
				match(LeftParen);
				setState(701);
				thetypeid();
				setState(702);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(704);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(705);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(706);
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
		enterRule(_localctx, 42, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (Plus - 92)) | (1L << (Minus - 92)) | (1L << (Star - 92)) | (1L << (And - 92)) | (1L << (Or - 92)) | (1L << (Tilde - 92)))) != 0)) ) {
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
		enterRule(_localctx, 44, RULE_newexpression);
		int _la;
		try {
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(711);
					match(Doublecolon);
					}
				}

				setState(714);
				match(New);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(715);
					newplacement();
					}
				}

				setState(718);
				newtypeid();
				setState(720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(719);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(722);
					match(Doublecolon);
					}
				}

				setState(725);
				match(New);
				setState(727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(726);
					newplacement();
					}
					break;
				}
				setState(729);
				match(LeftParen);
				setState(730);
				thetypeid();
				setState(731);
				match(RightParen);
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(732);
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
		enterRule(_localctx, 46, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(LeftParen);
			setState(738);
			expressionlist();
			setState(739);
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
		enterRule(_localctx, 48, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			typespecifierseq();
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(742);
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
		enterRule(_localctx, 50, RULE_newdeclarator);
		try {
			setState(750);
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
				setState(745);
				ptroperator();
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(746);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(753);
			match(LeftBracket);
			setState(754);
			expression(0);
			setState(755);
			match(RightBracket);
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(756);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(759);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(760);
					match(LeftBracket);
					setState(761);
					constantexpression();
					setState(762);
					match(RightBracket);
					setState(764);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(763);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 54, RULE_newinitializer);
		int _la;
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				match(LeftParen);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(772);
					expressionlist();
					}
				}

				setState(775);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
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
		enterRule(_localctx, 56, RULE_deleteexpression);
		int _la;
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(779);
					match(Doublecolon);
					}
				}

				setState(782);
				match(Delete);
				setState(783);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(784);
					match(Doublecolon);
					}
				}

				setState(787);
				match(Delete);
				setState(788);
				match(LeftBracket);
				setState(789);
				match(RightBracket);
				setState(790);
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
		enterRule(_localctx, 58, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(Noexcept);
			setState(794);
			match(LeftParen);
			setState(795);
			expression(0);
			setState(796);
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
		enterRule(_localctx, 60, RULE_castexpression);
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				realcastexpression();
				setState(800);
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
		enterRule(_localctx, 62, RULE_realcastexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(LeftParen);
			setState(805);
			thetypeid();
			setState(806);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(809);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(817);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(811);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(812);
						match(DotStar);
						setState(813);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(814);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(815);
						match(ArrowStar);
						setState(816);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(823);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(834);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(825);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(826);
						match(Star);
						setState(827);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(828);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(829);
						match(Div);
						setState(830);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(831);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(832);
						match(Mod);
						setState(833);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(840);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(848);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(842);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(843);
						match(Plus);
						setState(844);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(845);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(846);
						match(Minus);
						setState(847);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(854);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ShiftexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
					setState(856);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(857);
					shiftoperator();
					setState(858);
					additiveexpression(0);
					}
					} 
				}
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 72, RULE_shiftoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(868);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(882);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(870);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(871);
						match(Less);
						setState(872);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(873);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(874);
						match(Greater);
						setState(875);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(876);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(877);
						match(LessEqual);
						setState(878);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(879);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(880);
						match(GreaterEqual);
						setState(881);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(888);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(896);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(890);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(891);
						match(Equal);
						setState(892);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(893);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(894);
						match(NotEqual);
						setState(895);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(900);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(902);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(904);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(905);
					match(And);
					setState(906);
					equalityexpression(0);
					}
					} 
				}
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(913);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(915);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(916);
					match(Caret);
					setState(917);
					andexpression(0);
					}
					} 
				}
				setState(922);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(924);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(926);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(927);
					match(Or);
					setState(928);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(935);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(943);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(937);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(938);
						match(T__2);
						setState(939);
						inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(940);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(941);
						match(T__3);
						setState(942);
						inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(947);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(949);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(959);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(957);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(951);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(952);
						match(T__4);
						setState(953);
						logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(954);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(955);
						match(T__5);
						setState(956);
						logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(961);
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
		enterRule(_localctx, 88, RULE_conditionalexpression);
		try {
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				logicalorexpression(0);
				setState(964);
				match(Question);
				setState(965);
				expression(0);
				setState(966);
				match(Colon);
				setState(967);
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
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
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
		enterRule(_localctx, 90, RULE_assignmentexpression);
		try {
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
				logicalorexpression(0);
				setState(973);
				assignmentoperator();
				setState(974);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(976);
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
		enterRule(_localctx, 92, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Assign - 102)) | (1L << (PlusAssign - 102)) | (1L << (MinusAssign - 102)) | (1L << (StarAssign - 102)) | (1L << (DivAssign - 102)) | (1L << (ModAssign - 102)) | (1L << (XorAssign - 102)) | (1L << (AndAssign - 102)) | (1L << (OrAssign - 102)) | (1L << (LeftShiftAssign - 102)) | (1L << (RightShiftAssign - 102)))) != 0)) ) {
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(982);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(984);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(985);
					match(Comma);
					setState(986);
					assignmentexpression();
					}
					} 
				}
				setState(991);
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
		enterRule(_localctx, 96, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
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
		enterRule(_localctx, 98, RULE_statement);
		int _la;
		try {
			setState(1020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(995);
					attributespecifierseq(0);
					}
					break;
				}
				setState(998);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(999);
					attributespecifierseq(0);
					}
				}

				setState(1002);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1003);
					attributespecifierseq(0);
					}
				}

				setState(1006);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1007);
					attributespecifierseq(0);
					}
				}

				setState(1010);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1011);
					attributespecifierseq(0);
					}
				}

				setState(1014);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1015);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1016);
					attributespecifierseq(0);
					}
				}

				setState(1019);
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
		public TerminalNode Case() { return getToken(CPP14Parser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
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
		enterRule(_localctx, 100, RULE_labeledstatement);
		int _la;
		try {
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1022);
					attributespecifierseq(0);
					}
				}

				setState(1025);
				match(Identifier);
				setState(1026);
				match(Colon);
				setState(1027);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1028);
					attributespecifierseq(0);
					}
				}

				setState(1031);
				match(Case);
				setState(1032);
				constantexpression();
				setState(1033);
				match(Colon);
				setState(1034);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1036);
					attributespecifierseq(0);
					}
				}

				setState(1039);
				match(Default);
				setState(1040);
				match(Colon);
				setState(1041);
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
		enterRule(_localctx, 102, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
				{
				setState(1044);
				expression(0);
				}
			}

			setState(1047);
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
		enterRule(_localctx, 104, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(LeftBrace);
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Semi - 130)) | (1L << (Ellipsis - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
				{
				setState(1050);
				statementseq(0);
				}
			}

			setState(1053);
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1056);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1062);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1058);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1059);
					statement();
					}
					} 
				}
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		public TerminalNode If() { return getToken(CPP14Parser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CPP14Parser.Else, 0); }
		public TerminalNode Switch() { return getToken(CPP14Parser.Switch, 0); }
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
		enterRule(_localctx, 108, RULE_selectionstatement);
		try {
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				match(If);
				setState(1066);
				match(LeftParen);
				setState(1067);
				condition();
				setState(1068);
				match(RightParen);
				setState(1069);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				match(If);
				setState(1072);
				match(LeftParen);
				setState(1073);
				condition();
				setState(1074);
				match(RightParen);
				setState(1075);
				statement();
				setState(1076);
				match(Else);
				setState(1077);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				match(Switch);
				setState(1080);
				match(LeftParen);
				setState(1081);
				condition();
				setState(1082);
				match(RightParen);
				setState(1083);
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
		enterRule(_localctx, 110, RULE_condition);
		int _la;
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1087);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				declspecifierseq();
				setState(1092);
				declarator();
				setState(1093);
				match(Assign);
				setState(1094);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				declspecifierseq();
				setState(1100);
				declarator();
				setState(1101);
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
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CPP14Parser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
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
		enterRule(_localctx, 112, RULE_iterationstatement);
		int _la;
		try {
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				match(While);
				setState(1106);
				match(LeftParen);
				setState(1107);
				condition();
				setState(1108);
				match(RightParen);
				setState(1109);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				match(Do);
				setState(1112);
				statement();
				setState(1113);
				match(While);
				setState(1114);
				match(LeftParen);
				setState(1115);
				expression(0);
				setState(1116);
				match(RightParen);
				setState(1117);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1119);
				match(For);
				setState(1120);
				match(LeftParen);
				setState(1121);
				forinitstatement();
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(1122);
					condition();
					}
				}

				setState(1125);
				match(Semi);
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(1126);
					expression(0);
					}
				}

				setState(1129);
				match(RightParen);
				setState(1130);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1132);
				match(For);
				setState(1133);
				match(LeftParen);
				setState(1134);
				forrangedeclaration();
				setState(1135);
				match(Colon);
				setState(1136);
				forrangeinitializer();
				setState(1137);
				match(RightParen);
				setState(1138);
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
		enterRule(_localctx, 114, RULE_forinitstatement);
		try {
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1143);
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
		enterRule(_localctx, 116, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1146);
				attributespecifierseq(0);
				}
			}

			setState(1149);
			declspecifierseq();
			setState(1150);
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
		enterRule(_localctx, 118, RULE_forrangeinitializer);
		try {
			setState(1154);
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
				setState(1152);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
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
		public TerminalNode Break() { return getToken(CPP14Parser.Break, 0); }
		public TerminalNode Continue() { return getToken(CPP14Parser.Continue, 0); }
		public TerminalNode Return() { return getToken(CPP14Parser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
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
		enterRule(_localctx, 120, RULE_jumpstatement);
		int _la;
		try {
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				match(Break);
				setState(1157);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				match(Continue);
				setState(1159);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1160);
				match(Return);
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(1161);
					expression(0);
					}
				}

				setState(1164);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1165);
				match(Return);
				setState(1166);
				bracedinitlist();
				setState(1167);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1169);
				match(Goto);
				setState(1170);
				match(Identifier);
				setState(1171);
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
		enterRule(_localctx, 122, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1177);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1179);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1180);
					declaration();
					}
					} 
				}
				setState(1185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
		public IncludedeclarationContext includedeclaration() {
			return getRuleContext(IncludedeclarationContext.class,0);
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
		enterRule(_localctx, 126, RULE_declaration);
		try {
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1189);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1190);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1191);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1192);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1193);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1194);
				attributedeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1195);
				includedeclaration();
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

	public static class IncludedeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(CPP14Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CPP14Parser.Identifier, i);
		}
		public IncludedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIncludedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIncludedeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPP14Visitor ) return ((CPP14Visitor<? extends T>)visitor).visitIncludedeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludedeclarationContext includedeclaration() throws RecognitionException {
		IncludedeclarationContext _localctx = new IncludedeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_includedeclaration);
		int _la;
		try {
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				match(T__6);
				setState(1199);
				match(Less);
				setState(1200);
				match(Identifier);
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Dot) {
					{
					setState(1201);
					match(Dot);
					setState(1202);
					match(Identifier);
					}
				}

				setState(1205);
				match(Greater);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				match(T__6);
				setState(1207);
				match(T__7);
				setState(1208);
				match(Identifier);
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Dot) {
					{
					setState(1209);
					match(Dot);
					setState(1210);
					match(Identifier);
					}
				}

				setState(1213);
				match(T__7);
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
		enterRule(_localctx, 130, RULE_blockdeclaration);
		try {
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1218);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1219);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1220);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1221);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1222);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1223);
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
		enterRule(_localctx, 132, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(Using);
			setState(1227);
			match(Identifier);
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1228);
				attributespecifierseq(0);
				}
			}

			setState(1231);
			match(Assign);
			setState(1232);
			thetypeid();
			setState(1233);
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
		enterRule(_localctx, 134, RULE_simpledeclaration);
		int _la;
		try {
			setState(1249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
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
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1235);
					declspecifierseq();
					}
					break;
				}
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LeftParen - 86)) | (1L << (Star - 86)) | (1L << (And - 86)) | (1L << (Tilde - 86)) | (1L << (Doublecolon - 86)) | (1L << (Ellipsis - 86)) | (1L << (Identifier - 86)))) != 0)) {
					{
					setState(1238);
					initdeclaratorlist(0);
					}
				}

				setState(1241);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
				attributespecifierseq(0);
				setState(1244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1243);
					declspecifierseq();
					}
					break;
				}
				setState(1246);
				initdeclaratorlist(0);
				setState(1247);
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
		enterRule(_localctx, 136, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(Static_assert);
			setState(1252);
			match(LeftParen);
			setState(1253);
			constantexpression();
			setState(1254);
			match(Comma);
			setState(1255);
			match(Stringliteral);
			setState(1256);
			match(RightParen);
			setState(1257);
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
		enterRule(_localctx, 138, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
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
		enterRule(_localctx, 140, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			attributespecifierseq(0);
			setState(1262);
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
		enterRule(_localctx, 142, RULE_declspecifier);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
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
				setState(1265);
				typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1267);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1268);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1269);
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
		enterRule(_localctx, 144, RULE_declspecifierseq);
		try {
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				declspecifier();
				setState(1274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1273);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				declspecifier();
				setState(1277);
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
		enterRule(_localctx, 146, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Extern - 37)) | (1L << (Mutable - 37)) | (1L << (Register - 37)) | (1L << (Static - 37)) | (1L << (Thread_local - 37)))) != 0)) ) {
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
		enterRule(_localctx, 148, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (Explicit - 35)) | (1L << (Inline - 35)) | (1L << (Virtual - 35)))) != 0)) ) {
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
		enterRule(_localctx, 150, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
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
		enterRule(_localctx, 152, RULE_typespecifier);
		try {
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1289);
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
		enterRule(_localctx, 154, RULE_trailingtypespecifier);
		try {
			setState(1296);
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
				setState(1292);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				elaboratedtypespecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1294);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1295);
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
		enterRule(_localctx, 156, RULE_typespecifierseq);
		try {
			setState(1305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				typespecifier();
				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1299);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302);
				typespecifier();
				setState(1303);
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
		enterRule(_localctx, 158, RULE_trailingtypespecifierseq);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1307);
				trailingtypespecifier();
				setState(1309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1308);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				trailingtypespecifier();
				setState(1312);
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
		enterRule(_localctx, 160, RULE_simpletypespecifier);
		try {
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1316);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1319);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				nestednamespecifier(0);
				setState(1321);
				match(Template);
				setState(1322);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1324);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1325);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1326);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1327);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1328);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1329);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1330);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1331);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1332);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1333);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1334);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1335);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1336);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1337);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1338);
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
		enterRule(_localctx, 162, RULE_thetypename);
		try {
			setState(1345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1341);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1343);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1344);
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
		enterRule(_localctx, 164, RULE_decltypespecifier);
		try {
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1347);
				match(Decltype);
				setState(1348);
				match(LeftParen);
				setState(1349);
				expression(0);
				setState(1350);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1352);
				match(Decltype);
				setState(1353);
				match(LeftParen);
				setState(1354);
				match(Auto);
				setState(1355);
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
		enterRule(_localctx, 166, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1358);
				classkey();
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1359);
					attributespecifierseq(0);
					}
				}

				setState(1363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1362);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1365);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1367);
				classkey();
				setState(1368);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1370);
				classkey();
				setState(1371);
				nestednamespecifier(0);
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1372);
					match(Template);
					}
				}

				setState(1375);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1377);
				match(Enum);
				setState(1379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1378);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1381);
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
		enterRule(_localctx, 168, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
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
		enterRule(_localctx, 170, RULE_enumspecifier);
		int _la;
		try {
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1386);
				enumhead();
				setState(1387);
				match(LeftBrace);
				setState(1389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1388);
					enumeratorlist(0);
					}
				}

				setState(1391);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1393);
				enumhead();
				setState(1394);
				match(LeftBrace);
				setState(1395);
				enumeratorlist(0);
				setState(1396);
				match(Comma);
				setState(1397);
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
		enterRule(_localctx, 172, RULE_enumhead);
		int _la;
		try {
			setState(1420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				enumkey();
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1402);
					attributespecifierseq(0);
					}
				}

				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1405);
					match(Identifier);
					}
				}

				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1408);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1411);
				enumkey();
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1412);
					attributespecifierseq(0);
					}
				}

				setState(1415);
				nestednamespecifier(0);
				setState(1416);
				match(Identifier);
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1417);
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
		enterRule(_localctx, 174, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			enumkey();
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1423);
				attributespecifierseq(0);
				}
			}

			setState(1426);
			match(Identifier);
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1427);
				enumbase();
				}
			}

			setState(1430);
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
		enterRule(_localctx, 176, RULE_enumkey);
		try {
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433);
				match(Enum);
				setState(1434);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1435);
				match(Enum);
				setState(1436);
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
		enterRule(_localctx, 178, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			match(Colon);
			setState(1440);
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
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1443);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1445);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1446);
					match(Comma);
					setState(1447);
					enumeratordefinition();
					}
					} 
				}
				setState(1452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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
		enterRule(_localctx, 182, RULE_enumeratordefinition);
		try {
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1453);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1454);
				enumerator();
				setState(1455);
				match(Assign);
				setState(1456);
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
		enterRule(_localctx, 184, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
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
		enterRule(_localctx, 186, RULE_namespacename);
		try {
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1463);
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
		enterRule(_localctx, 188, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
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
		enterRule(_localctx, 190, RULE_namespacedefinition);
		try {
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1468);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1469);
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
		enterRule(_localctx, 192, RULE_namednamespacedefinition);
		try {
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
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
		enterRule(_localctx, 194, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1476);
				match(Inline);
				}
			}

			setState(1479);
			match(Namespace);
			setState(1480);
			match(Identifier);
			setState(1481);
			match(LeftBrace);
			setState(1482);
			namespacebody();
			setState(1483);
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
		enterRule(_localctx, 196, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1485);
				match(Inline);
				}
			}

			setState(1488);
			match(Namespace);
			setState(1489);
			originalnamespacename();
			setState(1490);
			match(LeftBrace);
			setState(1491);
			namespacebody();
			setState(1492);
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
		enterRule(_localctx, 198, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1494);
				match(Inline);
				}
			}

			setState(1497);
			match(Namespace);
			setState(1498);
			match(LeftBrace);
			setState(1499);
			namespacebody();
			setState(1500);
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
		enterRule(_localctx, 200, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Semi - 130)) | (1L << (Ellipsis - 130)) | (1L << (Identifier - 130)))) != 0)) {
				{
				setState(1502);
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
		enterRule(_localctx, 202, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
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
		enterRule(_localctx, 204, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(Namespace);
			setState(1508);
			match(Identifier);
			setState(1509);
			match(Assign);
			setState(1510);
			qualifiednamespacespecifier();
			setState(1511);
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
		enterRule(_localctx, 206, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1513);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1516);
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
		enterRule(_localctx, 208, RULE_usingdeclaration);
		int _la;
		try {
			setState(1531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1518);
				match(Using);
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1519);
					match(Typename_);
					}
				}

				setState(1522);
				nestednamespecifier(0);
				setState(1523);
				unqualifiedid();
				setState(1524);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				match(Using);
				setState(1527);
				match(Doublecolon);
				setState(1528);
				unqualifiedid();
				setState(1529);
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
		enterRule(_localctx, 210, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1533);
				attributespecifierseq(0);
				}
			}

			setState(1536);
			match(Using);
			setState(1537);
			match(Namespace);
			setState(1539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1538);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1541);
			namespacename();
			setState(1542);
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
		enterRule(_localctx, 212, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			match(Asm);
			setState(1545);
			match(LeftParen);
			setState(1546);
			match(Stringliteral);
			setState(1547);
			match(RightParen);
			setState(1548);
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
		enterRule(_localctx, 214, RULE_linkagespecification);
		int _la;
		try {
			setState(1560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1550);
				match(Extern);
				setState(1551);
				match(Stringliteral);
				setState(1552);
				match(LeftBrace);
				setState(1554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Semi - 130)) | (1L << (Ellipsis - 130)) | (1L << (Identifier - 130)))) != 0)) {
					{
					setState(1553);
					declarationseq(0);
					}
				}

				setState(1556);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1557);
				match(Extern);
				setState(1558);
				match(Stringliteral);
				setState(1559);
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
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1563);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1565);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1566);
					attributespecifier();
					}
					} 
				}
				setState(1571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
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
		enterRule(_localctx, 218, RULE_attributespecifier);
		try {
			setState(1579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1572);
				match(LeftBracket);
				setState(1573);
				match(LeftBracket);
				setState(1574);
				attributelist(0);
				setState(1575);
				match(RightBracket);
				setState(1576);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1578);
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
		enterRule(_localctx, 220, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581);
				match(Alignas);
				setState(1582);
				match(LeftParen);
				setState(1583);
				thetypeid();
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1584);
					match(Ellipsis);
					}
				}

				setState(1587);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
				match(Alignas);
				setState(1590);
				match(LeftParen);
				setState(1591);
				constantexpression();
				setState(1593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1592);
					match(Ellipsis);
					}
				}

				setState(1595);
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
		int _startState = 222;
		enterRecursionRule(_localctx, 222, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1600);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1603);
				attribute();
				setState(1604);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1618);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1608);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1609);
						match(Comma);
						setState(1611);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
						case 1:
							{
							setState(1610);
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
						setState(1613);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1614);
						match(Comma);
						setState(1615);
						attribute();
						setState(1616);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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
		enterRule(_localctx, 224, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			attributetoken();
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1624);
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
		enterRule(_localctx, 226, RULE_attributetoken);
		try {
			setState(1629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
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
		enterRule(_localctx, 228, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			attributenamespace();
			setState(1632);
			match(Doublecolon);
			setState(1633);
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
		enterRule(_localctx, 230, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
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
		enterRule(_localctx, 232, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(LeftParen);
			setState(1638);
			balancedtokenseq(0);
			setState(1639);
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
		int _startState = 234;
		enterRecursionRule(_localctx, 234, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1642);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1645);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1646);
					balancedtoken();
					}
					} 
				}
				setState(1651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
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
		enterRule(_localctx, 236, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				match(LeftParen);
				setState(1653);
				balancedtokenseq(0);
				setState(1654);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				match(LeftBracket);
				setState(1657);
				balancedtokenseq(0);
				setState(1658);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1660);
				match(LeftBrace);
				setState(1661);
				balancedtokenseq(0);
				setState(1662);
				match(RightBrace);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
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
				setState(1665); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1664);
						_la = _input.LA(1);
						if ( _la <= 0 || (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LeftParen - 86)) | (1L << (RightParen - 86)) | (1L << (LeftBracket - 86)) | (1L << (RightBracket - 86)) | (1L << (LeftBrace - 86)) | (1L << (RightBrace - 86)))) != 0)) ) {
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
					setState(1667); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
		int _startState = 238;
		enterRecursionRule(_localctx, 238, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1672);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1674);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1675);
					match(Comma);
					setState(1676);
					initdeclarator();
					}
					} 
				}
				setState(1681);
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
		enterRule(_localctx, 240, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			declarator();
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1683);
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
		enterRule(_localctx, 242, RULE_declarator);
		try {
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1686);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1687);
				noptrdeclarator(0);
				setState(1688);
				parametersandqualifiers();
				setState(1689);
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
		enterRule(_localctx, 244, RULE_ptrdeclarator);
		try {
			setState(1697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1694);
				ptroperator();
				setState(1695);
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
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
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
		int _startState = 246;
		enterRecursionRule(_localctx, 246, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1700);
				declaratorid();
				setState(1702);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1701);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1704);
				match(LeftParen);
				setState(1705);
				ptrdeclarator();
				setState(1706);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1723);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1721);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1710);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1711);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1712);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1713);
						match(LeftBracket);
						setState(1715);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(1714);
							constantexpression();
							}
						}

						setState(1717);
						match(RightBracket);
						setState(1719);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
						case 1:
							{
							setState(1718);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
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
		enterRule(_localctx, 248, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			match(LeftParen);
			setState(1727);
			parameterdeclarationclause();
			setState(1728);
			match(RightParen);
			setState(1730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1729);
				cvqualifierseq();
				}
				break;
			}
			setState(1733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1732);
				refqualifier();
				}
				break;
			}
			setState(1736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1735);
				exceptionspecification();
				}
				break;
			}
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1738);
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
		enterRule(_localctx, 250, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			match(Arrow);
			setState(1742);
			trailingtypespecifierseq();
			setState(1744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1743);
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
		enterRule(_localctx, 252, RULE_ptroperator);
		try {
			setState(1769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1746);
				match(Star);
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1747);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1750);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1753);
				match(And);
				setState(1755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1754);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1757);
				match(T__2);
				setState(1759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1758);
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
				setState(1761);
				nestednamespecifier(0);
				setState(1762);
				match(Star);
				setState(1764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1763);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1766);
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
		enterRule(_localctx, 254, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			cvqualifier();
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1772);
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
		enterRule(_localctx, 256, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
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
		enterRule(_localctx, 258, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
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
		enterRule(_localctx, 260, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1779);
				match(Ellipsis);
				}
			}

			setState(1782);
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
		enterRule(_localctx, 262, RULE_thetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			typespecifierseq();
			setState(1786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1785);
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
		enterRule(_localctx, 264, RULE_abstractdeclarator);
		try {
			setState(1796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1788);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1790);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1789);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1792);
				parametersandqualifiers();
				setState(1793);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1795);
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
		enterRule(_localctx, 266, RULE_ptrabstractdeclarator);
		try {
			setState(1803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1798);
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
				setState(1799);
				ptroperator();
				setState(1801);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1800);
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
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1806);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1807);
				match(LeftBracket);
				setState(1809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(1808);
					constantexpression();
					}
				}

				setState(1811);
				match(RightBracket);
				setState(1813);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1812);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1815);
				match(LeftParen);
				setState(1816);
				ptrabstractdeclarator();
				setState(1817);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1832);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1821);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1822);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1823);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1824);
						match(LeftBracket);
						setState(1826);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(1825);
							constantexpression();
							}
						}

						setState(1828);
						match(RightBracket);
						setState(1830);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
						case 1:
							{
							setState(1829);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
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
		enterRule(_localctx, 270, RULE_abstractpackdeclarator);
		try {
			setState(1841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1837);
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
				setState(1838);
				ptroperator();
				setState(1839);
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
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1844);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1857);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1846);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1847);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1848);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1849);
						match(LeftBracket);
						setState(1851);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(1850);
							constantexpression();
							}
						}

						setState(1853);
						match(RightBracket);
						setState(1855);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
						case 1:
							{
							setState(1854);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
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
		enterRule(_localctx, 274, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (Alignas - 11)) | (1L << (Auto - 11)) | (1L << (Bool - 11)) | (1L << (Char - 11)) | (1L << (Char16 - 11)) | (1L << (Char32 - 11)) | (1L << (Class - 11)) | (1L << (Const - 11)) | (1L << (Constexpr - 11)) | (1L << (Decltype - 11)) | (1L << (Double - 11)) | (1L << (Enum - 11)) | (1L << (Explicit - 11)) | (1L << (Extern - 11)) | (1L << (Float - 11)) | (1L << (Friend - 11)) | (1L << (Inline - 11)) | (1L << (Int - 11)) | (1L << (Long - 11)) | (1L << (Mutable - 11)) | (1L << (Register - 11)) | (1L << (Short - 11)) | (1L << (Signed - 11)) | (1L << (Static - 11)) | (1L << (Struct - 11)) | (1L << (Thread_local - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Typedef - 75)) | (1L << (Typename_ - 75)) | (1L << (Union - 75)) | (1L << (Unsigned - 75)) | (1L << (Virtual - 75)) | (1L << (Void - 75)) | (1L << (Volatile - 75)) | (1L << (Wchar - 75)) | (1L << (LeftBracket - 75)) | (1L << (Doublecolon - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(1862);
					parameterdeclarationlist(0);
					}
				}

				setState(1866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1865);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1868);
				parameterdeclarationlist(0);
				setState(1869);
				match(Comma);
				setState(1870);
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
		int _startState = 276;
		enterRecursionRule(_localctx, 276, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1875);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1877);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1878);
					match(Comma);
					setState(1879);
					parameterdeclaration();
					}
					} 
				}
				setState(1884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
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
		enterRule(_localctx, 278, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1885);
					attributespecifierseq(0);
					}
				}

				setState(1888);
				declspecifierseq();
				setState(1889);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1891);
					attributespecifierseq(0);
					}
				}

				setState(1894);
				declspecifierseq();
				setState(1895);
				declarator();
				setState(1896);
				match(Assign);
				setState(1897);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1899);
					attributespecifierseq(0);
					}
				}

				setState(1902);
				declspecifierseq();
				setState(1904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1903);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1906);
					attributespecifierseq(0);
					}
				}

				setState(1909);
				declspecifierseq();
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==Decltype || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LeftParen - 86)) | (1L << (LeftBracket - 86)) | (1L << (Star - 86)) | (1L << (And - 86)) | (1L << (Doublecolon - 86)) | (1L << (Ellipsis - 86)) | (1L << (Identifier - 86)))) != 0)) {
					{
					setState(1910);
					abstractdeclarator();
					}
				}

				setState(1913);
				match(Assign);
				setState(1914);
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
		enterRule(_localctx, 280, RULE_functiondefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			functionhead();
			setState(1919);
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
		enterRule(_localctx, 282, RULE_functionhead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1921);
				attributespecifierseq(0);
				}
			}

			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1924);
				declspecifierseq();
				}
				break;
			}
			setState(1927);
			declarator();
			setState(1929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1928);
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
		enterRule(_localctx, 284, RULE_functionbody);
		int _la;
		try {
			setState(1942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1931);
					ctorinitializer();
					}
				}

				setState(1934);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1935);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1936);
				match(Assign);
				setState(1937);
				match(Default);
				setState(1938);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1939);
				match(Assign);
				setState(1940);
				match(Delete);
				setState(1941);
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
		enterRule(_localctx, 286, RULE_initializer);
		try {
			setState(1949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1944);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1945);
				match(LeftParen);
				setState(1946);
				expressionlist();
				setState(1947);
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
		enterRule(_localctx, 288, RULE_braceorequalinitializer);
		try {
			setState(1954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1951);
				match(Assign);
				setState(1952);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1953);
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
		enterRule(_localctx, 290, RULE_initializerclause);
		try {
			setState(1958);
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
				setState(1956);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1957);
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
		int _startState = 292;
		enterRecursionRule(_localctx, 292, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1961);
			initializerclause();
			setState(1963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1962);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(1965);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1966);
					match(Comma);
					setState(1967);
					initializerclause();
					setState(1969);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
					case 1:
						{
						setState(1968);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(1975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
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
		enterRule(_localctx, 294, RULE_bracedinitlist);
		int _la;
		try {
			setState(1985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1976);
				match(LeftBrace);
				setState(1977);
				initializerlist(0);
				setState(1979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1978);
					match(Comma);
					}
				}

				setState(1981);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1983);
				match(LeftBrace);
				setState(1984);
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
		enterRule(_localctx, 296, RULE_classname);
		try {
			setState(1989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1987);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1988);
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
		enterRule(_localctx, 298, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			classhead();
			setState(1992);
			match(LeftBrace);
			setState(1994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Colon - 129)) | (1L << (Doublecolon - 129)) | (1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(1993);
				memberspecification();
				}
			}

			setState(1996);
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
		enterRule(_localctx, 300, RULE_classhead);
		int _la;
		try {
			setState(2016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1998);
				classkey();
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1999);
					attributespecifierseq(0);
					}
				}

				setState(2002);
				classheadname();
				setState(2004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2003);
					classvirtspecifier();
					}
				}

				setState(2007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2006);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2009);
				classkey();
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2010);
					attributespecifierseq(0);
					}
				}

				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2013);
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
		enterRule(_localctx, 302, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2018);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2021);
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
		enterRule(_localctx, 304, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
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
		enterRule(_localctx, 306, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2025);
			_la = _input.LA(1);
			if ( !(((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (Class - 22)) | (1L << (Struct - 22)) | (1L << (Union - 22)))) != 0)) ) {
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
		enterRule(_localctx, 308, RULE_memberspecification);
		int _la;
		try {
			setState(2036);
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
				setState(2027);
				memberdeclaration();
				setState(2029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Colon - 129)) | (1L << (Doublecolon - 129)) | (1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(2028);
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
				setState(2031);
				accessspecifier();
				setState(2032);
				match(Colon);
				setState(2034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Colon - 129)) | (1L << (Doublecolon - 129)) | (1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(2033);
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
		enterRule(_localctx, 310, RULE_memberdeclaration);
		int _la;
		try {
			setState(2054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2039);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2038);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2042);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(2041);
					declspecifierseq();
					}
					break;
				}
				setState(2045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LeftParen - 86)) | (1L << (LeftBracket - 86)) | (1L << (Star - 86)) | (1L << (And - 86)) | (1L << (Tilde - 86)) | (1L << (Colon - 86)) | (1L << (Doublecolon - 86)) | (1L << (Ellipsis - 86)) | (1L << (Identifier - 86)))) != 0)) {
					{
					setState(2044);
					memberdeclaratorlist(0);
					}
				}

				setState(2047);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2048);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2049);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2050);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2051);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2052);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2053);
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
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2057);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2059);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2060);
					match(Comma);
					setState(2061);
					memberdeclarator();
					}
					} 
				}
				setState(2066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
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
		enterRule(_localctx, 314, RULE_memberdeclarator);
		int _la;
		try {
			setState(2086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2067);
				declarator();
				setState(2069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(2068);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2072);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2071);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2074);
				declarator();
				setState(2076);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2075);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2078);
					match(Identifier);
					}
				}

				setState(2082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2081);
					attributespecifierseq(0);
					}
				}

				setState(2084);
				match(Colon);
				setState(2085);
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
		int _startState = 316;
		enterRecursionRule(_localctx, 316, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2089);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2095);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2091);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2092);
					virtspecifier();
					}
					} 
				}
				setState(2097);
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
		enterRule(_localctx, 318, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2098);
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
		enterRule(_localctx, 320, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2100);
			match(Assign);
			setState(2101);
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
		enterRule(_localctx, 322, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			match(Colon);
			setState(2105);
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
		int _startState = 324;
		enterRecursionRule(_localctx, 324, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2108);
			basespecifier();
			setState(2110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2109);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2112);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2113);
					match(Comma);
					setState(2114);
					basespecifier();
					setState(2116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
					case 1:
						{
						setState(2115);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2122);
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
		enterRule(_localctx, 326, RULE_basespecifier);
		int _la;
		try {
			setState(2144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2123);
					attributespecifierseq(0);
					}
				}

				setState(2126);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2127);
					attributespecifierseq(0);
					}
				}

				setState(2130);
				match(Virtual);
				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2131);
					accessspecifier();
					}
				}

				setState(2134);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2135);
					attributespecifierseq(0);
					}
				}

				setState(2138);
				accessspecifier();
				setState(2140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2139);
					match(Virtual);
					}
				}

				setState(2142);
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
		enterRule(_localctx, 328, RULE_classordecltype);
		try {
			setState(2151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2146);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2149);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2150);
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
		enterRule(_localctx, 330, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
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
		enterRule(_localctx, 332, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
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
		enterRule(_localctx, 334, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			match(Operator);
			setState(2158);
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
		enterRule(_localctx, 336, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
			typespecifierseq();
			setState(2162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2161);
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
		enterRule(_localctx, 338, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2164);
			ptroperator();
			setState(2166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2165);
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
		enterRule(_localctx, 340, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			match(Colon);
			setState(2169);
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
		enterRule(_localctx, 342, RULE_meminitializerlist);
		int _la;
		try {
			setState(2182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2171);
				meminitializer();
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2172);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2175);
				meminitializer();
				setState(2177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2176);
					match(Ellipsis);
					}
				}

				setState(2179);
				match(Comma);
				setState(2180);
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
		enterRule(_localctx, 344, RULE_meminitializer);
		int _la;
		try {
			setState(2194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2184);
				meminitializerid();
				setState(2185);
				match(LeftParen);
				setState(2187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(2186);
					expressionlist();
					}
				}

				setState(2189);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2191);
				meminitializerid();
				setState(2192);
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
		enterRule(_localctx, 346, RULE_meminitializerid);
		try {
			setState(2198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2196);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2197);
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
		enterRule(_localctx, 348, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			match(Operator);
			setState(2201);
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
		enterRule(_localctx, 350, RULE_literaloperatorid);
		try {
			setState(2208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2203);
				match(Operator);
				setState(2204);
				match(Stringliteral);
				setState(2205);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2206);
				match(Operator);
				setState(2207);
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
		enterRule(_localctx, 352, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			match(Template);
			setState(2211);
			match(Less);
			setState(2212);
			templateparameterlist(0);
			setState(2213);
			match(Greater);
			setState(2214);
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
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2217);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2219);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2220);
					match(Comma);
					setState(2221);
					templateparameter();
					}
					} 
				}
				setState(2226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
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
		enterRule(_localctx, 356, RULE_templateparameter);
		try {
			setState(2229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2227);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2228);
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
		enterRule(_localctx, 358, RULE_typeparameter);
		int _la;
		try {
			setState(2279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2231);
				match(Class);
				setState(2233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2232);
					match(Ellipsis);
					}
					break;
				}
				setState(2236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2235);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2238);
				match(Class);
				setState(2240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2239);
					match(Identifier);
					}
				}

				setState(2242);
				match(Assign);
				setState(2243);
				thetypeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2244);
				match(Typename_);
				setState(2246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2245);
					match(Ellipsis);
					}
					break;
				}
				setState(2249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2248);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2251);
				match(Typename_);
				setState(2253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2252);
					match(Identifier);
					}
				}

				setState(2255);
				match(Assign);
				setState(2256);
				thetypeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2257);
				match(Template);
				setState(2258);
				match(Less);
				setState(2259);
				templateparameterlist(0);
				setState(2260);
				match(Greater);
				setState(2261);
				match(Class);
				setState(2263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2262);
					match(Ellipsis);
					}
					break;
				}
				setState(2266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2265);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2268);
				match(Template);
				setState(2269);
				match(Less);
				setState(2270);
				templateparameterlist(0);
				setState(2271);
				match(Greater);
				setState(2272);
				match(Class);
				setState(2274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2273);
					match(Identifier);
					}
				}

				setState(2276);
				match(Assign);
				setState(2277);
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
		enterRule(_localctx, 360, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			templatename();
			setState(2282);
			match(Less);
			setState(2284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (Struct - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
				{
				setState(2283);
				templateargumentlist(0);
				}
			}

			setState(2286);
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
		enterRule(_localctx, 362, RULE_templateid);
		int _la;
		try {
			setState(2303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2288);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2289);
				operatorfunctionid();
				setState(2290);
				match(Less);
				setState(2292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (Struct - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(2291);
					templateargumentlist(0);
					}
				}

				setState(2294);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2296);
				literaloperatorid();
				setState(2297);
				match(Less);
				setState(2299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (Struct - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(2298);
					templateargumentlist(0);
					}
				}

				setState(2301);
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
		enterRule(_localctx, 364, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2305);
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
		int _startState = 366;
		enterRecursionRule(_localctx, 366, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2308);
			templateargument();
			setState(2310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2309);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2312);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2313);
					match(Comma);
					setState(2314);
					templateargument();
					setState(2316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
					case 1:
						{
						setState(2315);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
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
		enterRule(_localctx, 368, RULE_templateargument);
		try {
			setState(2326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2323);
				thetypeid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2324);
				constantexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2325);
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
		enterRule(_localctx, 370, RULE_typenamespecifier);
		int _la;
		try {
			setState(2339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2328);
				match(Typename_);
				setState(2329);
				nestednamespecifier(0);
				setState(2330);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2332);
				match(Typename_);
				setState(2333);
				nestednamespecifier(0);
				setState(2335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2334);
					match(Template);
					}
				}

				setState(2337);
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
		enterRule(_localctx, 372, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2341);
				match(Extern);
				}
			}

			setState(2344);
			match(Template);
			setState(2345);
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
		enterRule(_localctx, 374, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(Template);
			setState(2348);
			match(Less);
			setState(2349);
			match(Greater);
			setState(2350);
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
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
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
		enterRule(_localctx, 376, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2352);
			match(Try);
			setState(2353);
			compoundstatement();
			setState(2354);
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
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
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
		enterRule(_localctx, 378, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			match(Try);
			setState(2358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2357);
				ctorinitializer();
				}
			}

			setState(2360);
			compoundstatement();
			setState(2361);
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
		enterRule(_localctx, 380, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			handler();
			setState(2365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				{
				setState(2364);
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
		public TerminalNode Catch() { return getToken(CPP14Parser.Catch, 0); }
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
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
		enterRule(_localctx, 382, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			match(Catch);
			setState(2368);
			match(LeftParen);
			setState(2369);
			exceptiondeclaration();
			setState(2370);
			match(RightParen);
			setState(2371);
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
		enterRule(_localctx, 384, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2373);
					attributespecifierseq(0);
					}
				}

				setState(2376);
				typespecifierseq();
				setState(2377);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2379);
					attributespecifierseq(0);
					}
				}

				setState(2382);
				typespecifierseq();
				setState(2384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==Decltype || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LeftParen - 86)) | (1L << (LeftBracket - 86)) | (1L << (Star - 86)) | (1L << (And - 86)) | (1L << (Doublecolon - 86)) | (1L << (Ellipsis - 86)) | (1L << (Identifier - 86)))) != 0)) {
					{
					setState(2383);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2386);
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
		enterRule(_localctx, 386, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2389);
			match(Throw);
			setState(2391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2390);
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
		enterRule(_localctx, 388, RULE_exceptionspecification);
		try {
			setState(2395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2393);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2394);
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
		enterRule(_localctx, 390, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			match(Throw);
			setState(2398);
			match(LeftParen);
			setState(2400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Auto - 14)) | (1L << (Bool - 14)) | (1L << (Char - 14)) | (1L << (Char16 - 14)) | (1L << (Char32 - 14)) | (1L << (Class - 14)) | (1L << (Const - 14)) | (1L << (Decltype - 14)) | (1L << (Double - 14)) | (1L << (Enum - 14)) | (1L << (Float - 14)) | (1L << (Int - 14)) | (1L << (Long - 14)) | (1L << (Short - 14)) | (1L << (Signed - 14)) | (1L << (Struct - 14)) | (1L << (Typename_ - 14)))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Union - 78)) | (1L << (Unsigned - 78)) | (1L << (Void - 78)) | (1L << (Volatile - 78)) | (1L << (Wchar - 78)) | (1L << (Doublecolon - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				setState(2399);
				typeidlist(0);
				}
			}

			setState(2402);
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
		int _startState = 392;
		enterRecursionRule(_localctx, 392, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2405);
			thetypeid();
			setState(2407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				{
				setState(2406);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2409);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2410);
					match(Comma);
					setState(2411);
					thetypeid();
					setState(2413);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						setState(2412);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
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
		enterRule(_localctx, 394, RULE_noexceptspecification);
		try {
			setState(2426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2420);
				match(Noexcept);
				setState(2421);
				match(LeftParen);
				setState(2422);
				constantexpression();
				setState(2423);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2425);
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
		enterRule(_localctx, 396, RULE_theoperator);
		try {
			setState(2479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2428);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2429);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2430);
				match(New);
				setState(2431);
				match(LeftBracket);
				setState(2432);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2433);
				match(Delete);
				setState(2434);
				match(LeftBracket);
				setState(2435);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2436);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2437);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2438);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2439);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2440);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2441);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2442);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2443);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2444);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2445);
				match(T__0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2446);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2447);
				match(Assign);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2448);
				match(Less);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2449);
				match(Greater);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2450);
				match(PlusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2451);
				match(MinusAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2452);
				match(StarAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2453);
				match(DivAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2454);
				match(ModAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2455);
				match(XorAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2456);
				match(AndAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2457);
				match(OrAssign);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2458);
				match(LeftShift);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2459);
				match(RightShift);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2460);
				match(RightShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2461);
				match(LeftShiftAssign);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2462);
				match(Equal);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2463);
				match(NotEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2464);
				match(LessEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2465);
				match(GreaterEqual);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2466);
				match(T__2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2467);
				match(T__3);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2468);
				match(T__4);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2469);
				match(T__5);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2470);
				match(PlusPlus);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2471);
				match(MinusMinus);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2472);
				match(Comma);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2473);
				match(ArrowStar);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2474);
				match(Arrow);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2475);
				match(LeftParen);
				setState(2476);
				match(RightParen);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2477);
				match(LeftBracket);
				setState(2478);
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
		enterRule(_localctx, 398, RULE_literal);
		try {
			setState(2488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2481);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2482);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2483);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2484);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2485);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2486);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2487);
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
		enterRule(_localctx, 400, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
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
		enterRule(_localctx, 402, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2492);
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
		enterRule(_localctx, 404, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2494);
			_la = _input.LA(1);
			if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (Userdefinedintegerliteral - 145)) | (1L << (Userdefinedfloatingliteral - 145)) | (1L << (Userdefinedstringliteral - 145)) | (1L << (Userdefinedcharacterliteral - 145)))) != 0)) ) {
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
		case 5:
			return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 10:
			return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 15:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 26:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 32:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 33:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 34:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 35:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 37:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 38:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 39:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 40:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 41:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 42:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 43:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 47:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 53:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 62:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 90:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 108:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 111:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 117:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 119:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 123:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 134:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 136:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 138:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 146:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 156:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 158:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 162:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 177:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 183:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 196:
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
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 4);
		case 22:
			return precpred(_ctx, 3);
		case 23:
			return precpred(_ctx, 2);
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 2);
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 2);
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 2);
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 3);
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 3);
		case 44:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 5);
		case 46:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 3);
		case 48:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009a\u09c3\4\2\t"+
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
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\3\2\5"+
		"\2\u019a\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01a6\n\3\3\4"+
		"\3\4\5\4\u01aa\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01b5\n\5\3"+
		"\6\3\6\5\6\u01b9\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u01c8\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u01cf\n\7\3\7\3\7\3\7\7\7\u01d4"+
		"\n\7\f\7\16\7\u01d7\13\7\3\b\3\b\5\b\u01db\n\b\3\b\3\b\3\t\3\t\5\t\u01e1"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01eb\n\n\3\13\3\13\3\f\3\f\3"+
		"\f\5\f\u01f2\n\f\3\f\3\f\3\f\3\f\5\f\u01f8\n\f\7\f\u01fa\n\f\f\f\16\f"+
		"\u01fd\13\f\3\r\3\r\5\r\u0201\n\r\3\16\3\16\3\16\3\16\5\16\u0207\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u020e\n\17\3\20\3\20\3\20\3\20\5\20\u0214"+
		"\n\20\3\20\5\20\u0217\n\20\3\20\5\20\u021a\n\20\3\20\5\20\u021d\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u0224\n\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u022b\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u025f\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u026e"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u0274\n\21\3\21\3\21\3\21\3\21\5\21\u027a"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0287"+
		"\n\21\f\21\16\21\u028a\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25\u0293"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u02a2\n\25\3\25\3\25\3\25\3\25\5\25\u02a8\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u02c6\n\26"+
		"\3\27\3\27\3\30\5\30\u02cb\n\30\3\30\3\30\5\30\u02cf\n\30\3\30\3\30\5"+
		"\30\u02d3\n\30\3\30\5\30\u02d6\n\30\3\30\3\30\5\30\u02da\n\30\3\30\3\30"+
		"\3\30\3\30\5\30\u02e0\n\30\5\30\u02e2\n\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\5\32\u02ea\n\32\3\33\3\33\5\33\u02ee\n\33\3\33\5\33\u02f1\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u02f8\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u02ff"+
		"\n\34\7\34\u0301\n\34\f\34\16\34\u0304\13\34\3\35\3\35\5\35\u0308\n\35"+
		"\3\35\3\35\5\35\u030c\n\35\3\36\5\36\u030f\n\36\3\36\3\36\3\36\5\36\u0314"+
		"\n\36\3\36\3\36\3\36\3\36\5\36\u031a\n\36\3\37\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \5 \u0325\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u0334\n\"\f\"\16\"\u0337\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\7#\u0345\n#\f#\16#\u0348\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0353\n$"+
		"\f$\16$\u0356\13$\3%\3%\3%\3%\3%\3%\3%\7%\u035f\n%\f%\16%\u0362\13%\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0375"+
		"\n\'\f\'\16\'\u0378\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0383\n(\f(\16"+
		"(\u0386\13(\3)\3)\3)\3)\3)\3)\7)\u038e\n)\f)\16)\u0391\13)\3*\3*\3*\3"+
		"*\3*\3*\7*\u0399\n*\f*\16*\u039c\13*\3+\3+\3+\3+\3+\3+\7+\u03a4\n+\f+"+
		"\16+\u03a7\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u03b2\n,\f,\16,\u03b5\13"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u03c0\n-\f-\16-\u03c3\13-\3.\3.\3.\3."+
		"\3.\3.\3.\5.\u03cc\n.\3/\3/\3/\3/\3/\3/\5/\u03d4\n/\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\7\61\u03de\n\61\f\61\16\61\u03e1\13\61\3\62\3\62"+
		"\3\63\3\63\5\63\u03e7\n\63\3\63\3\63\5\63\u03eb\n\63\3\63\3\63\5\63\u03ef"+
		"\n\63\3\63\3\63\5\63\u03f3\n\63\3\63\3\63\5\63\u03f7\n\63\3\63\3\63\3"+
		"\63\5\63\u03fc\n\63\3\63\5\63\u03ff\n\63\3\64\5\64\u0402\n\64\3\64\3\64"+
		"\3\64\3\64\5\64\u0408\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0410\n"+
		"\64\3\64\3\64\3\64\5\64\u0415\n\64\3\65\5\65\u0418\n\65\3\65\3\65\3\66"+
		"\3\66\5\66\u041e\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\7\67\u0427\n"+
		"\67\f\67\16\67\u042a\13\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\58\u0440\n8\39\39\59\u0444\n9\39\39\39\39\39\39\59\u044c"+
		"\n9\39\39\39\39\59\u0452\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\5:\u0466\n:\3:\3:\5:\u046a\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\5:\u0477\n:\3;\3;\5;\u047b\n;\3<\5<\u047e\n<\3<\3<\3<\3=\3=\5="+
		"\u0485\n=\3>\3>\3>\3>\3>\3>\5>\u048d\n>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0497"+
		"\n>\3?\3?\3@\3@\3@\3@\3@\7@\u04a0\n@\f@\16@\u04a3\13@\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\5A\u04af\nA\3B\3B\3B\3B\3B\5B\u04b6\nB\3B\3B\3B\3B\3B\3"+
		"B\5B\u04be\nB\3B\5B\u04c1\nB\3C\3C\3C\3C\3C\3C\3C\3C\5C\u04cb\nC\3D\3"+
		"D\3D\5D\u04d0\nD\3D\3D\3D\3D\3E\5E\u04d7\nE\3E\5E\u04da\nE\3E\3E\3E\5"+
		"E\u04df\nE\3E\3E\3E\5E\u04e4\nE\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3H\3H\3"+
		"H\3I\3I\3I\3I\3I\3I\5I\u04f9\nI\3J\3J\5J\u04fd\nJ\3J\3J\3J\5J\u0502\n"+
		"J\3K\3K\3L\3L\3M\3M\3N\3N\3N\5N\u050d\nN\3O\3O\3O\3O\5O\u0513\nO\3P\3"+
		"P\5P\u0517\nP\3P\3P\3P\5P\u051c\nP\3Q\3Q\5Q\u0520\nQ\3Q\3Q\3Q\5Q\u0525"+
		"\nQ\3R\5R\u0528\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\5R\u053e\nR\3S\3S\3S\3S\5S\u0544\nS\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\5T\u054f\nT\3U\3U\5U\u0553\nU\3U\5U\u0556\nU\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\5U\u0560\nU\3U\3U\3U\3U\5U\u0566\nU\3U\5U\u0569\nU\3V\3V\3W\3W\3W"+
		"\5W\u0570\nW\3W\3W\3W\3W\3W\3W\3W\3W\5W\u057a\nW\3X\3X\5X\u057e\nX\3X"+
		"\5X\u0581\nX\3X\5X\u0584\nX\3X\3X\5X\u0588\nX\3X\3X\3X\5X\u058d\nX\5X"+
		"\u058f\nX\3Y\3Y\5Y\u0593\nY\3Y\3Y\5Y\u0597\nY\3Y\3Y\3Z\3Z\3Z\3Z\3Z\5Z"+
		"\u05a0\nZ\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u05ab\n\\\f\\\16\\\u05ae"+
		"\13\\\3]\3]\3]\3]\3]\5]\u05b5\n]\3^\3^\3_\3_\5_\u05bb\n_\3`\3`\3a\3a\5"+
		"a\u05c1\na\3b\3b\5b\u05c5\nb\3c\5c\u05c8\nc\3c\3c\3c\3c\3c\3c\3d\5d\u05d1"+
		"\nd\3d\3d\3d\3d\3d\3d\3e\5e\u05da\ne\3e\3e\3e\3e\3e\3f\5f\u05e2\nf\3g"+
		"\3g\3h\3h\3h\3h\3h\3h\3i\5i\u05ed\ni\3i\3i\3j\3j\5j\u05f3\nj\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\5j\u05fe\nj\3k\5k\u0601\nk\3k\3k\3k\5k\u0606\nk\3k"+
		"\3k\3k\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\5m\u0615\nm\3m\3m\3m\3m\5m\u061b"+
		"\nm\3n\3n\3n\3n\3n\7n\u0622\nn\fn\16n\u0625\13n\3o\3o\3o\3o\3o\3o\3o\5"+
		"o\u062e\no\3p\3p\3p\3p\5p\u0634\np\3p\3p\3p\3p\3p\3p\5p\u063c\np\3p\3"+
		"p\5p\u0640\np\3q\3q\5q\u0644\nq\3q\3q\3q\5q\u0649\nq\3q\3q\3q\5q\u064e"+
		"\nq\3q\3q\3q\3q\3q\7q\u0655\nq\fq\16q\u0658\13q\3r\3r\5r\u065c\nr\3s\3"+
		"s\5s\u0660\ns\3t\3t\3t\3t\3u\3u\3v\3v\3v\3v\3w\3w\5w\u066e\nw\3w\3w\7"+
		"w\u0672\nw\fw\16w\u0675\13w\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\6x"+
		"\u0684\nx\rx\16x\u0685\5x\u0688\nx\3y\3y\3y\3y\3y\3y\7y\u0690\ny\fy\16"+
		"y\u0693\13y\3z\3z\5z\u0697\nz\3{\3{\3{\3{\3{\5{\u069e\n{\3|\3|\3|\3|\5"+
		"|\u06a4\n|\3}\3}\3}\5}\u06a9\n}\3}\3}\3}\3}\5}\u06af\n}\3}\3}\3}\3}\3"+
		"}\5}\u06b6\n}\3}\3}\5}\u06ba\n}\7}\u06bc\n}\f}\16}\u06bf\13}\3~\3~\3~"+
		"\3~\5~\u06c5\n~\3~\5~\u06c8\n~\3~\5~\u06cb\n~\3~\5~\u06ce\n~\3\177\3\177"+
		"\3\177\5\177\u06d3\n\177\3\u0080\3\u0080\5\u0080\u06d7\n\u0080\3\u0080"+
		"\5\u0080\u06da\n\u0080\3\u0080\3\u0080\5\u0080\u06de\n\u0080\3\u0080\3"+
		"\u0080\5\u0080\u06e2\n\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u06e7\n\u0080"+
		"\3\u0080\5\u0080\u06ea\n\u0080\5\u0080\u06ec\n\u0080\3\u0081\3\u0081\5"+
		"\u0081\u06f0\n\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\5\u0084\u06f7"+
		"\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085\u06fd\n\u0085\3\u0086"+
		"\3\u0086\5\u0086\u0701\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u0707\n\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u070c\n\u0087\5\u0087\u070e"+
		"\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0714\n\u0088\3\u0088"+
		"\3\u0088\5\u0088\u0718\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088"+
		"\u071e\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0725\n"+
		"\u0088\3\u0088\3\u0088\5\u0088\u0729\n\u0088\7\u0088\u072b\n\u0088\f\u0088"+
		"\16\u0088\u072e\13\u0088\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0734"+
		"\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\5\u008a\u073e\n\u008a\3\u008a\3\u008a\5\u008a\u0742\n\u008a\7\u008a\u0744"+
		"\n\u008a\f\u008a\16\u008a\u0747\13\u008a\3\u008b\5\u008b\u074a\n\u008b"+
		"\3\u008b\5\u008b\u074d\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u0753\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c"+
		"\u075b\n\u008c\f\u008c\16\u008c\u075e\13\u008c\3\u008d\5\u008d\u0761\n"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0767\n\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u076f\n\u008d\3\u008d\3"+
		"\u008d\5\u008d\u0773\n\u008d\3\u008d\5\u008d\u0776\n\u008d\3\u008d\3\u008d"+
		"\5\u008d\u077a\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u077f\n\u008d\3"+
		"\u008e\3\u008e\3\u008e\3\u008f\5\u008f\u0785\n\u008f\3\u008f\5\u008f\u0788"+
		"\n\u008f\3\u008f\3\u008f\5\u008f\u078c\n\u008f\3\u0090\5\u0090\u078f\n"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\5\u0090\u0799\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u07a0\n\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u07a5\n\u0092\3\u0093\3"+
		"\u0093\5\u0093\u07a9\n\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u07ae\n\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u07b4\n\u0094\7\u0094\u07b6\n"+
		"\u0094\f\u0094\16\u0094\u07b9\13\u0094\3\u0095\3\u0095\3\u0095\5\u0095"+
		"\u07be\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u07c4\n\u0095\3"+
		"\u0096\3\u0096\5\u0096\u07c8\n\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u07cd"+
		"\n\u0097\3\u0097\3\u0097\3\u0098\3\u0098\5\u0098\u07d3\n\u0098\3\u0098"+
		"\3\u0098\5\u0098\u07d7\n\u0098\3\u0098\5\u0098\u07da\n\u0098\3\u0098\3"+
		"\u0098\5\u0098\u07de\n\u0098\3\u0098\5\u0098\u07e1\n\u0098\5\u0098\u07e3"+
		"\n\u0098\3\u0099\5\u0099\u07e6\n\u0099\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009c\3\u009c\5\u009c\u07f0\n\u009c\3\u009c\3\u009c"+
		"\3\u009c\5\u009c\u07f5\n\u009c\5\u009c\u07f7\n\u009c\3\u009d\5\u009d\u07fa"+
		"\n\u009d\3\u009d\5\u009d\u07fd\n\u009d\3\u009d\5\u009d\u0800\n\u009d\3"+
		"\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u0809\n"+
		"\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u0811\n"+
		"\u009e\f\u009e\16\u009e\u0814\13\u009e\3\u009f\3\u009f\5\u009f\u0818\n"+
		"\u009f\3\u009f\5\u009f\u081b\n\u009f\3\u009f\3\u009f\5\u009f\u081f\n\u009f"+
		"\3\u009f\5\u009f\u0822\n\u009f\3\u009f\5\u009f\u0825\n\u009f\3\u009f\3"+
		"\u009f\5\u009f\u0829\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7"+
		"\u00a0\u0830\n\u00a0\f\u00a0\16\u00a0\u0833\13\u00a0\3\u00a1\3\u00a1\3"+
		"\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a4\5\u00a4\u0841\n\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u0847\n\u00a4\7\u00a4\u0849\n\u00a4\f\u00a4\16\u00a4\u084c\13\u00a4\3"+
		"\u00a5\5\u00a5\u084f\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u0853\n\u00a5\3\u00a5"+
		"\3\u00a5\5\u00a5\u0857\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u085b\n\u00a5\3"+
		"\u00a5\3\u00a5\5\u00a5\u085f\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u0863\n\u00a5"+
		"\3\u00a6\5\u00a6\u0866\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u086a\n\u00a6\3"+
		"\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa"+
		"\5\u00aa\u0875\n\u00aa\3\u00ab\3\u00ab\5\u00ab\u0879\n\u00ab\3\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ad\3\u00ad\5\u00ad\u0880\n\u00ad\3\u00ad\3\u00ad\5"+
		"\u00ad\u0884\n\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0889\n\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\5\u00ae\u088e\n\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\5\u00ae\u0895\n\u00ae\3\u00af\3\u00af\5\u00af\u0899\n\u00af\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1"+
		"\u08a3\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u08b1\n\u00b3\f\u00b3"+
		"\16\u00b3\u08b4\13\u00b3\3\u00b4\3\u00b4\5\u00b4\u08b8\n\u00b4\3\u00b5"+
		"\3\u00b5\5\u00b5\u08bc\n\u00b5\3\u00b5\5\u00b5\u08bf\n\u00b5\3\u00b5\3"+
		"\u00b5\5\u00b5\u08c3\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u08c9"+
		"\n\u00b5\3\u00b5\5\u00b5\u08cc\n\u00b5\3\u00b5\3\u00b5\5\u00b5\u08d0\n"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\5\u00b5\u08da\n\u00b5\3\u00b5\5\u00b5\u08dd\n\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u08e5\n\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\5\u00b5\u08ea\n\u00b5\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u08ef\n\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u08f7\n\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u08fe\n\u00b7\3\u00b7"+
		"\3\u00b7\5\u00b7\u0902\n\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9"+
		"\5\u00b9\u0909\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u090f\n"+
		"\u00b9\7\u00b9\u0911\n\u00b9\f\u00b9\16\u00b9\u0914\13\u00b9\3\u00ba\3"+
		"\u00ba\3\u00ba\5\u00ba\u0919\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3"+
		"\u00bb\3\u00bb\3\u00bb\5\u00bb\u0922\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u0926"+
		"\n\u00bb\3\u00bc\5\u00bc\u0929\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00bf"+
		"\3\u00bf\5\u00bf\u0939\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0"+
		"\5\u00c0\u0940\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c2\5\u00c2\u0949\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2"+
		"\u094f\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u0953\n\u00c2\3\u00c2\5\u00c2\u0956"+
		"\n\u00c2\3\u00c3\3\u00c3\5\u00c3\u095a\n\u00c3\3\u00c4\3\u00c4\5\u00c4"+
		"\u095e\n\u00c4\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0963\n\u00c5\3\u00c5\3"+
		"\u00c5\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u096a\n\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\5\u00c6\u0970\n\u00c6\7\u00c6\u0972\n\u00c6\f\u00c6\16"+
		"\u00c6\u0975\13\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\5\u00c7\u097d\n\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\5\u00c8\u09b2\n\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u09bb\n\u00c9\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cc"+
		"\3\u00cc\3\u00cc\2$\f\26 \66BDFHLNPRTVX`l~\u00b6\u00da\u00e0\u00ec\u00f0"+
		"\u00f8\u010e\u0112\u0116\u0126\u013a\u013e\u0146\u0164\u0170\u018a\u00cd"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194"+
		"\u0196\2\20\4\2ddhh\5\2\3\4^`df\3\2st\5\2hhkruv\7\2\'\'\62\62<<BBII\5"+
		"\2%%//SS\3\2X]\4\2\31\31UU\4\2\5\5dd\5\2\30\30EEPP\4\2))88\3\29;\4\2("+
		"(KK\3\2\u0093\u0096\2\u0ae0\2\u0199\3\2\2\2\4\u01a5\3\2\2\2\6\u01a9\3"+
		"\2\2\2\b\u01b4\3\2\2\2\n\u01b6\3\2\2\2\f\u01c7\3\2\2\2\16\u01d8\3\2\2"+
		"\2\20\u01de\3\2\2\2\22\u01ea\3\2\2\2\24\u01ec\3\2\2\2\26\u01ee\3\2\2\2"+
		"\30\u0200\3\2\2\2\32\u0206\3\2\2\2\34\u020d\3\2\2\2\36\u020f\3\2\2\2 "+
		"\u025e\3\2\2\2\"\u028b\3\2\2\2$\u028d\3\2\2\2&\u028f\3\2\2\2(\u02a7\3"+
		"\2\2\2*\u02c5\3\2\2\2,\u02c7\3\2\2\2.\u02e1\3\2\2\2\60\u02e3\3\2\2\2\62"+
		"\u02e7\3\2\2\2\64\u02f0\3\2\2\2\66\u02f2\3\2\2\28\u030b\3\2\2\2:\u0319"+
		"\3\2\2\2<\u031b\3\2\2\2>\u0324\3\2\2\2@\u0326\3\2\2\2B\u032a\3\2\2\2D"+
		"\u0338\3\2\2\2F\u0349\3\2\2\2H\u0357\3\2\2\2J\u0363\3\2\2\2L\u0365\3\2"+
		"\2\2N\u0379\3\2\2\2P\u0387\3\2\2\2R\u0392\3\2\2\2T\u039d\3\2\2\2V\u03a8"+
		"\3\2\2\2X\u03b6\3\2\2\2Z\u03cb\3\2\2\2\\\u03d3\3\2\2\2^\u03d5\3\2\2\2"+
		"`\u03d7\3\2\2\2b\u03e2\3\2\2\2d\u03fe\3\2\2\2f\u0414\3\2\2\2h\u0417\3"+
		"\2\2\2j\u041b\3\2\2\2l\u0421\3\2\2\2n\u043f\3\2\2\2p\u0451\3\2\2\2r\u0476"+
		"\3\2\2\2t\u047a\3\2\2\2v\u047d\3\2\2\2x\u0484\3\2\2\2z\u0496\3\2\2\2|"+
		"\u0498\3\2\2\2~\u049a\3\2\2\2\u0080\u04ae\3\2\2\2\u0082\u04c0\3\2\2\2"+
		"\u0084\u04ca\3\2\2\2\u0086\u04cc\3\2\2\2\u0088\u04e3\3\2\2\2\u008a\u04e5"+
		"\3\2\2\2\u008c\u04ed\3\2\2\2\u008e\u04ef\3\2\2\2\u0090\u04f8\3\2\2\2\u0092"+
		"\u0501\3\2\2\2\u0094\u0503\3\2\2\2\u0096\u0505\3\2\2\2\u0098\u0507\3\2"+
		"\2\2\u009a\u050c\3\2\2\2\u009c\u0512\3\2\2\2\u009e\u051b\3\2\2\2\u00a0"+
		"\u0524\3\2\2\2\u00a2\u053d\3\2\2\2\u00a4\u0543\3\2\2\2\u00a6\u054e\3\2"+
		"\2\2\u00a8\u0568\3\2\2\2\u00aa\u056a\3\2\2\2\u00ac\u0579\3\2\2\2\u00ae"+
		"\u058e\3\2\2\2\u00b0\u0590\3\2\2\2\u00b2\u059f\3\2\2\2\u00b4\u05a1\3\2"+
		"\2\2\u00b6\u05a4\3\2\2\2\u00b8\u05b4\3\2\2\2\u00ba\u05b6\3\2\2\2\u00bc"+
		"\u05ba\3\2\2\2\u00be\u05bc\3\2\2\2\u00c0\u05c0\3\2\2\2\u00c2\u05c4\3\2"+
		"\2\2\u00c4\u05c7\3\2\2\2\u00c6\u05d0\3\2\2\2\u00c8\u05d9\3\2\2\2\u00ca"+
		"\u05e1\3\2\2\2\u00cc\u05e3\3\2\2\2\u00ce\u05e5\3\2\2\2\u00d0\u05ec\3\2"+
		"\2\2\u00d2\u05fd\3\2\2\2\u00d4\u0600\3\2\2\2\u00d6\u060a\3\2\2\2\u00d8"+
		"\u061a\3\2\2\2\u00da\u061c\3\2\2\2\u00dc\u062d\3\2\2\2\u00de\u063f\3\2"+
		"\2\2\u00e0\u0648\3\2\2\2\u00e2\u0659\3\2\2\2\u00e4\u065f\3\2\2\2\u00e6"+
		"\u0661\3\2\2\2\u00e8\u0665\3\2\2\2\u00ea\u0667\3\2\2\2\u00ec\u066b\3\2"+
		"\2\2\u00ee\u0687\3\2\2\2\u00f0\u0689\3\2\2\2\u00f2\u0694\3\2\2\2\u00f4"+
		"\u069d\3\2\2\2\u00f6\u06a3\3\2\2\2\u00f8\u06ae\3\2\2\2\u00fa\u06c0\3\2"+
		"\2\2\u00fc\u06cf\3\2\2\2\u00fe\u06eb\3\2\2\2\u0100\u06ed\3\2\2\2\u0102"+
		"\u06f1\3\2\2\2\u0104\u06f3\3\2\2\2\u0106\u06f6\3\2\2\2\u0108\u06fa\3\2"+
		"\2\2\u010a\u0706\3\2\2\2\u010c\u070d\3\2\2\2\u010e\u071d\3\2\2\2\u0110"+
		"\u0733\3\2\2\2\u0112\u0735\3\2\2\2\u0114\u0752\3\2\2\2\u0116\u0754\3\2"+
		"\2\2\u0118\u077e\3\2\2\2\u011a\u0780\3\2\2\2\u011c\u0784\3\2\2\2\u011e"+
		"\u0798\3\2\2\2\u0120\u079f\3\2\2\2\u0122\u07a4\3\2\2\2\u0124\u07a8\3\2"+
		"\2\2\u0126\u07aa\3\2\2\2\u0128\u07c3\3\2\2\2\u012a\u07c7\3\2\2\2\u012c"+
		"\u07c9\3\2\2\2\u012e\u07e2\3\2\2\2\u0130\u07e5\3\2\2\2\u0132\u07e9\3\2"+
		"\2\2\u0134\u07eb\3\2\2\2\u0136\u07f6\3\2\2\2\u0138\u0808\3\2\2\2\u013a"+
		"\u080a\3\2\2\2\u013c\u0828\3\2\2\2\u013e\u082a\3\2\2\2\u0140\u0834\3\2"+
		"\2\2\u0142\u0836\3\2\2\2\u0144\u083a\3\2\2\2\u0146\u083d\3\2\2\2\u0148"+
		"\u0862\3\2\2\2\u014a\u0869\3\2\2\2\u014c\u086b\3\2\2\2\u014e\u086d\3\2"+
		"\2\2\u0150\u086f\3\2\2\2\u0152\u0872\3\2\2\2\u0154\u0876\3\2\2\2\u0156"+
		"\u087a\3\2\2\2\u0158\u0888\3\2\2\2\u015a\u0894\3\2\2\2\u015c\u0898\3\2"+
		"\2\2\u015e\u089a\3\2\2\2\u0160\u08a2\3\2\2\2\u0162\u08a4\3\2\2\2\u0164"+
		"\u08aa\3\2\2\2\u0166\u08b7\3\2\2\2\u0168\u08e9\3\2\2\2\u016a\u08eb\3\2"+
		"\2\2\u016c\u0901\3\2\2\2\u016e\u0903\3\2\2\2\u0170\u0905\3\2\2\2\u0172"+
		"\u0918\3\2\2\2\u0174\u0925\3\2\2\2\u0176\u0928\3\2\2\2\u0178\u092d\3\2"+
		"\2\2\u017a\u0932\3\2\2\2\u017c\u0936\3\2\2\2\u017e\u093d\3\2\2\2\u0180"+
		"\u0941\3\2\2\2\u0182\u0955\3\2\2\2\u0184\u0957\3\2\2\2\u0186\u095d\3\2"+
		"\2\2\u0188\u095f\3\2\2\2\u018a\u0966\3\2\2\2\u018c\u097c\3\2\2\2\u018e"+
		"\u09b1\3\2\2\2\u0190\u09ba\3\2\2\2\u0192\u09bc\3\2\2\2\u0194\u09be\3\2"+
		"\2\2\u0196\u09c0\3\2\2\2\u0198\u019a\5~@\2\u0199\u0198\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7\2\2\3\u019c\3\3\2\2\2\u019d"+
		"\u01a6\5\u0190\u00c9\2\u019e\u01a6\7H\2\2\u019f\u01a0\7X\2\2\u01a0\u01a1"+
		"\5`\61\2\u01a1\u01a2\7Y\2\2\u01a2\u01a6\3\2\2\2\u01a3\u01a6\5\6\4\2\u01a4"+
		"\u01a6\5\16\b\2\u01a5\u019d\3\2\2\2\u01a5\u019e\3\2\2\2\u01a5\u019f\3"+
		"\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\5\3\2\2\2\u01a7\u01aa"+
		"\5\b\5\2\u01a8\u01aa\5\n\6\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"\7\3\2\2\2\u01ab\u01b5\7\u0089\2\2\u01ac\u01b5\5\u015e\u00b0\2\u01ad\u01b5"+
		"\5\u0150\u00a9\2\u01ae\u01b5\5\u0160\u00b1\2\u01af\u01b0\7f\2\2\u01b0"+
		"\u01b5\5\u012a\u0096\2\u01b1\u01b2\7f\2\2\u01b2\u01b5\5\u00a6T\2\u01b3"+
		"\u01b5\5\u016c\u00b7\2\u01b4\u01ab\3\2\2\2\u01b4\u01ac\3\2\2\2\u01b4\u01ad"+
		"\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01af\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b5\t\3\2\2\2\u01b6\u01b8\5\f\7\2\u01b7\u01b9\7G\2\2"+
		"\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb"+
		"\5\b\5\2\u01bb\13\3\2\2\2\u01bc\u01bd\b\7\1\2\u01bd\u01c8\7\u0084\2\2"+
		"\u01be\u01bf\5\u00a4S\2\u01bf\u01c0\7\u0084\2\2\u01c0\u01c8\3\2\2\2\u01c1"+
		"\u01c2\5\u00bc_\2\u01c2\u01c3\7\u0084\2\2\u01c3\u01c8\3\2\2\2\u01c4\u01c5"+
		"\5\u00a6T\2\u01c5\u01c6\7\u0084\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01bc\3"+
		"\2\2\2\u01c7\u01be\3\2\2\2\u01c7\u01c1\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c8"+
		"\u01d5\3\2\2\2\u01c9\u01ca\f\4\2\2\u01ca\u01cb\7\u0089\2\2\u01cb\u01d4"+
		"\7\u0084\2\2\u01cc\u01ce\f\3\2\2\u01cd\u01cf\7G\2\2\u01ce\u01cd\3\2\2"+
		"\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\5\u016a\u00b6\2"+
		"\u01d1\u01d2\7\u0084\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01c9\3\2\2\2\u01d3"+
		"\u01cc\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\r\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01da\5\20\t\2\u01d9\u01db"+
		"\5\36\20\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2"+
		"\u01dc\u01dd\5j\66\2\u01dd\17\3\2\2\2\u01de\u01e0\7Z\2\2\u01df\u01e1\5"+
		"\22\n\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\7[\2\2\u01e3\21\3\2\2\2\u01e4\u01eb\5\24\13\2\u01e5\u01eb\5\26"+
		"\f\2\u01e6\u01e7\5\24\13\2\u01e7\u01e8\7\177\2\2\u01e8\u01e9\5\26\f\2"+
		"\u01e9\u01eb\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea\u01e5\3\2\2\2\u01ea\u01e6"+
		"\3\2\2\2\u01eb\23\3\2\2\2\u01ec\u01ed\t\2\2\2\u01ed\25\3\2\2\2\u01ee\u01ef"+
		"\b\f\1\2\u01ef\u01f1\5\30\r\2\u01f0\u01f2\7\u0088\2\2\u01f1\u01f0\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01fb\3\2\2\2\u01f3\u01f4\f\3\2\2\u01f4"+
		"\u01f5\7\177\2\2\u01f5\u01f7\5\30\r\2\u01f6\u01f8\7\u0088\2\2\u01f7\u01f6"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f3\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\27\3\2\2"+
		"\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\5\32\16\2\u01ff\u0201\5\34\17\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\31\3\2\2\2\u0202\u0207\7\u0089"+
		"\2\2\u0203\u0204\7d\2\2\u0204\u0207\7\u0089\2\2\u0205\u0207\7H\2\2\u0206"+
		"\u0202\3\2\2\2\u0206\u0203\3\2\2\2\u0206\u0205\3\2\2\2\u0207\33\3\2\2"+
		"\2\u0208\u0209\7\u0089\2\2\u0209\u020e\5\u0120\u0091\2\u020a\u020b\7d"+
		"\2\2\u020b\u020c\7\u0089\2\2\u020c\u020e\5\u0120\u0091\2\u020d\u0208\3"+
		"\2\2\2\u020d\u020a\3\2\2\2\u020e\35\3\2\2\2\u020f\u0210\7X\2\2\u0210\u0211"+
		"\5\u0114\u008b\2\u0211\u0213\7Y\2\2\u0212\u0214\7\62\2\2\u0213\u0212\3"+
		"\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0217\5\u0186\u00c4"+
		"\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u021a"+
		"\5\u00dan\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2"+
		"\2\u021b\u021d\5\u00fc\177\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\37\3\2\2\2\u021e\u021f\b\21\1\2\u021f\u025f\5\4\3\2\u0220\u0221\5\u00a2"+
		"R\2\u0221\u0223\7X\2\2\u0222\u0224\5&\24\2\u0223\u0222\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7Y\2\2\u0226\u025f\3\2\2\2\u0227"+
		"\u0228\5\u0174\u00bb\2\u0228\u022a\7X\2\2\u0229\u022b\5&\24\2\u022a\u0229"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7Y\2\2\u022d"+
		"\u025f\3\2\2\2\u022e\u022f\5\u00a2R\2\u022f\u0230\5\u0128\u0095\2\u0230"+
		"\u025f\3\2\2\2\u0231\u0232\5\u0174\u00bb\2\u0232\u0233\5\u0128\u0095\2"+
		"\u0233\u025f\3\2\2\2\u0234\u0235\7\"\2\2\u0235\u0236\7i\2\2\u0236\u0237"+
		"\5\u0108\u0085\2\u0237\u0238\7j\2\2\u0238\u0239\7X\2\2\u0239\u023a\5`"+
		"\61\2\u023a\u023b\7Y\2\2\u023b\u025f\3\2\2\2\u023c\u023d\7D\2\2\u023d"+
		"\u023e\7i\2\2\u023e\u023f\5\u0108\u0085\2\u023f\u0240\7j\2\2\u0240\u0241"+
		"\7X\2\2\u0241\u0242\5`\61\2\u0242\u0243\7Y\2\2\u0243\u025f\3\2\2\2\u0244"+
		"\u0245\7=\2\2\u0245\u0246\7i\2\2\u0246\u0247\5\u0108\u0085\2\u0247\u0248"+
		"\7j\2\2\u0248\u0249\7X\2\2\u0249\u024a\5`\61\2\u024a\u024b\7Y\2\2\u024b"+
		"\u025f\3\2\2\2\u024c\u024d\7\33\2\2\u024d\u024e\7i\2\2\u024e\u024f\5\u0108"+
		"\u0085\2\u024f\u0250\7j\2\2\u0250\u0251\7X\2\2\u0251\u0252\5`\61\2\u0252"+
		"\u0253\7Y\2\2\u0253\u025f\3\2\2\2\u0254\u0255\5$\23\2\u0255\u0256\7X\2"+
		"\2\u0256\u0257\5`\61\2\u0257\u0258\7Y\2\2\u0258\u025f\3\2\2\2\u0259\u025a"+
		"\5$\23\2\u025a\u025b\7X\2\2\u025b\u025c\5\u0108\u0085\2\u025c\u025d\7"+
		"Y\2\2\u025d\u025f\3\2\2\2\u025e\u021e\3\2\2\2\u025e\u0220\3\2\2\2\u025e"+
		"\u0227\3\2\2\2\u025e\u022e\3\2\2\2\u025e\u0231\3\2\2\2\u025e\u0234\3\2"+
		"\2\2\u025e\u023c\3\2\2\2\u025e\u0244\3\2\2\2\u025e\u024c\3\2\2\2\u025e"+
		"\u0254\3\2\2\2\u025e\u0259\3\2\2\2\u025f\u0288\3\2\2\2\u0260\u0261\f\25"+
		"\2\2\u0261\u0262\7Z\2\2\u0262\u0263\5`\61\2\u0263\u0264\7[\2\2\u0264\u0287"+
		"\3\2\2\2\u0265\u0266\f\24\2\2\u0266\u0267\7Z\2\2\u0267\u0268\5\u0128\u0095"+
		"\2\u0268\u0269\7[\2\2\u0269\u0287\3\2\2\2\u026a\u026b\f\23\2\2\u026b\u026d"+
		"\7X\2\2\u026c\u026e\5&\24\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026f\u0287\7Y\2\2\u0270\u0271\f\16\2\2\u0271\u0273\7\u0086"+
		"\2\2\u0272\u0274\7G\2\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0287\5\6\4\2\u0276\u0277\f\r\2\2\u0277\u0279\7\u0081"+
		"\2\2\u0278\u027a\7G\2\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u0287\5\6\4\2\u027c\u027d\f\f\2\2\u027d\u027e\7\u0086"+
		"\2\2\u027e\u0287\5(\25\2\u027f\u0280\f\13\2\2\u0280\u0281\7\u0081\2\2"+
		"\u0281\u0287\5(\25\2\u0282\u0283\f\n\2\2\u0283\u0287\7}\2\2\u0284\u0285"+
		"\f\t\2\2\u0285\u0287\7~\2\2\u0286\u0260\3\2\2\2\u0286\u0265\3\2\2\2\u0286"+
		"\u026a\3\2\2\2\u0286\u0270\3\2\2\2\u0286\u0276\3\2\2\2\u0286\u027c\3\2"+
		"\2\2\u0286\u027f\3\2\2\2\u0286\u0282\3\2\2\2\u0286\u0284\3\2\2\2\u0287"+
		"\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289!\3\2\2\2"+
		"\u028a\u0288\3\2\2\2\u028b\u028c\7N\2\2\u028c#\3\2\2\2\u028d\u028e\7N"+
		"\2\2\u028e%\3\2\2\2\u028f\u0290\5\u0126\u0094\2\u0290\'\3\2\2\2\u0291"+
		"\u0293\5\f\7\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0295\5\u00a4S\2\u0295\u0296\7\u0084\2\2\u0296\u0297\7f\2\2"+
		"\u0297\u0298\5\u00a4S\2\u0298\u02a8\3\2\2\2\u0299\u029a\5\f\7\2\u029a"+
		"\u029b\7G\2\2\u029b\u029c\5\u016a\u00b6\2\u029c\u029d\7\u0084\2\2\u029d"+
		"\u029e\7f\2\2\u029e\u029f\5\u00a4S\2\u029f\u02a8\3\2\2\2\u02a0\u02a2\5"+
		"\f\7\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a4\7f\2\2\u02a4\u02a8\5\u00a4S\2\u02a5\u02a6\7f\2\2\u02a6\u02a8\5"+
		"\u00a6T\2\u02a7\u0292\3\2\2\2\u02a7\u0299\3\2\2\2\u02a7\u02a1\3\2\2\2"+
		"\u02a7\u02a5\3\2\2\2\u02a8)\3\2\2\2\u02a9\u02c6\5 \21\2\u02aa\u02ab\7"+
		"}\2\2\u02ab\u02c6\5> \2\u02ac\u02ad\7~\2\2\u02ad\u02c6\5> \2\u02ae\u02af"+
		"\5,\27\2\u02af\u02b0\5> \2\u02b0\u02c6\3\2\2\2\u02b1\u02b2\7A\2\2\u02b2"+
		"\u02c6\5*\26\2\u02b3\u02b4\7A\2\2\u02b4\u02b5\7X\2\2\u02b5\u02b6\5\u0108"+
		"\u0085\2\u02b6\u02b7\7Y\2\2\u02b7\u02c6\3\2\2\2\u02b8\u02b9\7A\2\2\u02b9"+
		"\u02ba\7\u0088\2\2\u02ba\u02bb\7X\2\2\u02bb\u02bc\7\u0089\2\2\u02bc\u02c6"+
		"\7Y\2\2\u02bd\u02be\7\16\2\2\u02be\u02bf\7X\2\2\u02bf\u02c0\5\u0108\u0085"+
		"\2\u02c0\u02c1\7Y\2\2\u02c1\u02c6\3\2\2\2\u02c2\u02c6\5<\37\2\u02c3\u02c6"+
		"\5.\30\2\u02c4\u02c6\5:\36\2\u02c5\u02a9\3\2\2\2\u02c5\u02aa\3\2\2\2\u02c5"+
		"\u02ac\3\2\2\2\u02c5\u02ae\3\2\2\2\u02c5\u02b1\3\2\2\2\u02c5\u02b3\3\2"+
		"\2\2\u02c5\u02b8\3\2\2\2\u02c5\u02bd\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6+\3\2\2\2\u02c7\u02c8\t\3\2\2"+
		"\u02c8-\3\2\2\2\u02c9\u02cb\7\u0084\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\7\64\2\2\u02cd\u02cf\5\60\31"+
		"\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2"+
		"\5\62\32\2\u02d1\u02d3\58\35\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2"+
		"\u02d3\u02e2\3\2\2\2\u02d4\u02d6\7\u0084\2\2\u02d5\u02d4\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\7\64\2\2\u02d8\u02da\5"+
		"\60\31\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02dc\7X\2\2\u02dc\u02dd\5\u0108\u0085\2\u02dd\u02df\7Y\2\2\u02de\u02e0"+
		"\58\35\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1"+
		"\u02ca\3\2\2\2\u02e1\u02d5\3\2\2\2\u02e2/\3\2\2\2\u02e3\u02e4\7X\2\2\u02e4"+
		"\u02e5\5&\24\2\u02e5\u02e6\7Y\2\2\u02e6\61\3\2\2\2\u02e7\u02e9\5\u009e"+
		"P\2\u02e8\u02ea\5\64\33\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\63\3\2\2\2\u02eb\u02ed\5\u00fe\u0080\2\u02ec\u02ee\5\64\33\2\u02ed\u02ec"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02f1\5\66\34\2"+
		"\u02f0\u02eb\3\2\2\2\u02f0\u02ef\3\2\2\2\u02f1\65\3\2\2\2\u02f2\u02f3"+
		"\b\34\1\2\u02f3\u02f4\7Z\2\2\u02f4\u02f5\5`\61\2\u02f5\u02f7\7[\2\2\u02f6"+
		"\u02f8\5\u00dan\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u0302"+
		"\3\2\2\2\u02f9\u02fa\f\3\2\2\u02fa\u02fb\7Z\2\2\u02fb\u02fc\5b\62\2\u02fc"+
		"\u02fe\7[\2\2\u02fd\u02ff\5\u00dan\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3"+
		"\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02f9\3\2\2\2\u0301\u0304\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\67\3\2\2\2\u0304\u0302\3\2\2"+
		"\2\u0305\u0307\7X\2\2\u0306\u0308\5&\24\2\u0307\u0306\3\2\2\2\u0307\u0308"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030c\7Y\2\2\u030a\u030c\5\u0128\u0095"+
		"\2\u030b\u0305\3\2\2\2\u030b\u030a\3\2\2\2\u030c9\3\2\2\2\u030d\u030f"+
		"\7\u0084\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2"+
		"\2\u0310\u0311\7\37\2\2\u0311\u031a\5> \2\u0312\u0314\7\u0084\2\2\u0313"+
		"\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\7\37"+
		"\2\2\u0316\u0317\7Z\2\2\u0317\u0318\7[\2\2\u0318\u031a\5> \2\u0319\u030e"+
		"\3\2\2\2\u0319\u0313\3\2\2\2\u031a;\3\2\2\2\u031b\u031c\7\65\2\2\u031c"+
		"\u031d\7X\2\2\u031d\u031e\5`\61\2\u031e\u031f\7Y\2\2\u031f=\3\2\2\2\u0320"+
		"\u0325\5*\26\2\u0321\u0322\5@!\2\u0322\u0323\5> \2\u0323\u0325\3\2\2\2"+
		"\u0324\u0320\3\2\2\2\u0324\u0321\3\2\2\2\u0325?\3\2\2\2\u0326\u0327\7"+
		"X\2\2\u0327\u0328\5\u0108\u0085\2\u0328\u0329\7Y\2\2\u0329A\3\2\2\2\u032a"+
		"\u032b\b\"\1\2\u032b\u032c\5> \2\u032c\u0335\3\2\2\2\u032d\u032e\f\4\2"+
		"\2\u032e\u032f\7\u0087\2\2\u032f\u0334\5> \2\u0330\u0331\f\3\2\2\u0331"+
		"\u0332\7\u0080\2\2\u0332\u0334\5> \2\u0333\u032d\3\2\2\2\u0333\u0330\3"+
		"\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"C\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0339\b#\1\2\u0339\u033a\5B\"\2\u033a"+
		"\u0346\3\2\2\2\u033b\u033c\f\5\2\2\u033c\u033d\7`\2\2\u033d\u0345\5B\""+
		"\2\u033e\u033f\f\4\2\2\u033f\u0340\7a\2\2\u0340\u0345\5B\"\2\u0341\u0342"+
		"\f\3\2\2\u0342\u0343\7b\2\2\u0343\u0345\5B\"\2\u0344\u033b\3\2\2\2\u0344"+
		"\u033e\3\2\2\2\u0344\u0341\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2"+
		"\2\2\u0346\u0347\3\2\2\2\u0347E\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u034a"+
		"\b$\1\2\u034a\u034b\5D#\2\u034b\u0354\3\2\2\2\u034c\u034d\f\4\2\2\u034d"+
		"\u034e\7^\2\2\u034e\u0353\5D#\2\u034f\u0350\f\3\2\2\u0350\u0351\7_\2\2"+
		"\u0351\u0353\5D#\2\u0352\u034c\3\2\2\2\u0352\u034f\3\2\2\2\u0353\u0356"+
		"\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355G\3\2\2\2\u0356"+
		"\u0354\3\2\2\2\u0357\u0358\b%\1\2\u0358\u0359\5F$\2\u0359\u0360\3\2\2"+
		"\2\u035a\u035b\f\3\2\2\u035b\u035c\5J&\2\u035c\u035d\5F$\2\u035d\u035f"+
		"\3\2\2\2\u035e\u035a\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361I\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0364\t\4\2\2"+
		"\u0364K\3\2\2\2\u0365\u0366\b\'\1\2\u0366\u0367\5H%\2\u0367\u0376\3\2"+
		"\2\2\u0368\u0369\f\6\2\2\u0369\u036a\7i\2\2\u036a\u0375\5H%\2\u036b\u036c"+
		"\f\5\2\2\u036c\u036d\7j\2\2\u036d\u0375\5H%\2\u036e\u036f\f\4\2\2\u036f"+
		"\u0370\7y\2\2\u0370\u0375\5H%\2\u0371\u0372\f\3\2\2\u0372\u0373\7z\2\2"+
		"\u0373\u0375\5H%\2\u0374\u0368\3\2\2\2\u0374\u036b\3\2\2\2\u0374\u036e"+
		"\3\2\2\2\u0374\u0371\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377M\3\2\2\2\u0378\u0376\3\2\2\2\u0379\u037a\b(\1\2\u037a"+
		"\u037b\5L\'\2\u037b\u0384\3\2\2\2\u037c\u037d\f\4\2\2\u037d\u037e\7w\2"+
		"\2\u037e\u0383\5L\'\2\u037f\u0380\f\3\2\2\u0380\u0381\7x\2\2\u0381\u0383"+
		"\5L\'\2\u0382\u037c\3\2\2\2\u0382\u037f\3\2\2\2\u0383\u0386\3\2\2\2\u0384"+
		"\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385O\3\2\2\2\u0386\u0384\3\2\2\2"+
		"\u0387\u0388\b)\1\2\u0388\u0389\5N(\2\u0389\u038f\3\2\2\2\u038a\u038b"+
		"\f\3\2\2\u038b\u038c\7d\2\2\u038c\u038e\5N(\2\u038d\u038a\3\2\2\2\u038e"+
		"\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390Q\3\2\2\2"+
		"\u0391\u038f\3\2\2\2\u0392\u0393\b*\1\2\u0393\u0394\5P)\2\u0394\u039a"+
		"\3\2\2\2\u0395\u0396\f\3\2\2\u0396\u0397\7c\2\2\u0397\u0399\5P)\2\u0398"+
		"\u0395\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2"+
		"\2\2\u039bS\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e\b+\1\2\u039e\u039f"+
		"\5R*\2\u039f\u03a5\3\2\2\2\u03a0\u03a1\f\3\2\2\u03a1\u03a2\7e\2\2\u03a2"+
		"\u03a4\5R*\2\u03a3\u03a0\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2"+
		"\2\u03a5\u03a6\3\2\2\2\u03a6U\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03a9"+
		"\b,\1\2\u03a9\u03aa\5T+\2\u03aa\u03b3\3\2\2\2\u03ab\u03ac\f\4\2\2\u03ac"+
		"\u03ad\7\5\2\2\u03ad\u03b2\5T+\2\u03ae\u03af\f\3\2\2\u03af\u03b0\7\6\2"+
		"\2\u03b0\u03b2\5T+\2\u03b1\u03ab\3\2\2\2\u03b1\u03ae\3\2\2\2\u03b2\u03b5"+
		"\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4W\3\2\2\2\u03b5"+
		"\u03b3\3\2\2\2\u03b6\u03b7\b-\1\2\u03b7\u03b8\5V,\2\u03b8\u03c1\3\2\2"+
		"\2\u03b9\u03ba\f\4\2\2\u03ba\u03bb\7\7\2\2\u03bb\u03c0\5V,\2\u03bc\u03bd"+
		"\f\3\2\2\u03bd\u03be\7\b\2\2\u03be\u03c0\5V,\2\u03bf\u03b9\3\2\2\2\u03bf"+
		"\u03bc\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2"+
		"\2\2\u03c2Y\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03cc\5X-\2\u03c5\u03c6"+
		"\5X-\2\u03c6\u03c7\7\u0082\2\2\u03c7\u03c8\5`\61\2\u03c8\u03c9\7\u0083"+
		"\2\2\u03c9\u03ca\5\\/\2\u03ca\u03cc\3\2\2\2\u03cb\u03c4\3\2\2\2\u03cb"+
		"\u03c5\3\2\2\2\u03cc[\3\2\2\2\u03cd\u03d4\5Z.\2\u03ce\u03cf\5X-\2\u03cf"+
		"\u03d0\5^\60\2\u03d0\u03d1\5\u0124\u0093\2\u03d1\u03d4\3\2\2\2\u03d2\u03d4"+
		"\5\u0184\u00c3\2\u03d3\u03cd\3\2\2\2\u03d3\u03ce\3\2\2\2\u03d3\u03d2\3"+
		"\2\2\2\u03d4]\3\2\2\2\u03d5\u03d6\t\5\2\2\u03d6_\3\2\2\2\u03d7\u03d8\b"+
		"\61\1\2\u03d8\u03d9\5\\/\2\u03d9\u03df\3\2\2\2\u03da\u03db\f\3\2\2\u03db"+
		"\u03dc\7\177\2\2\u03dc\u03de\5\\/\2\u03dd\u03da\3\2\2\2\u03de\u03e1\3"+
		"\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0a\3\2\2\2\u03e1\u03df"+
		"\3\2\2\2\u03e2\u03e3\5Z.\2\u03e3c\3\2\2\2\u03e4\u03ff\5f\64\2\u03e5\u03e7"+
		"\5\u00dan\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\3\2\2"+
		"\2\u03e8\u03ff\5h\65\2\u03e9\u03eb\5\u00dan\2\u03ea\u03e9\3\2\2\2\u03ea"+
		"\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ff\5j\66\2\u03ed\u03ef\5\u00da"+
		"n\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0"+
		"\u03ff\5n8\2\u03f1\u03f3\5\u00dan\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3"+
		"\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03ff\5r:\2\u03f5\u03f7\5\u00dan\2\u03f6"+
		"\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03ff\5z"+
		">\2\u03f9\u03ff\5|?\2\u03fa\u03fc\5\u00dan\2\u03fb\u03fa\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\5\u017a\u00be\2\u03fe\u03e4"+
		"\3\2\2\2\u03fe\u03e6\3\2\2\2\u03fe\u03ea\3\2\2\2\u03fe\u03ee\3\2\2\2\u03fe"+
		"\u03f2\3\2\2\2\u03fe\u03f6\3\2\2\2\u03fe\u03f9\3\2\2\2\u03fe\u03fb\3\2"+
		"\2\2\u03ffe\3\2\2\2\u0400\u0402\5\u00dan\2\u0401\u0400\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\7\u0089\2\2\u0404\u0405\7\u0083"+
		"\2\2\u0405\u0415\5d\63\2\u0406\u0408\5\u00dan\2\u0407\u0406\3\2\2\2\u0407"+
		"\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\7\23\2\2\u040a\u040b\5"+
		"b\62\2\u040b\u040c\7\u0083\2\2\u040c\u040d\5d\63\2\u040d\u0415\3\2\2\2"+
		"\u040e\u0410\5\u00dan\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"\u0411\3\2\2\2\u0411\u0412\7\36\2\2\u0412\u0413\7\u0083\2\2\u0413\u0415"+
		"\5d\63\2\u0414\u0401\3\2\2\2\u0414\u0407\3\2\2\2\u0414\u040f\3\2\2\2\u0415"+
		"g\3\2\2\2\u0416\u0418\5`\61\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2"+
		"\u0418\u0419\3\2\2\2\u0419\u041a\7\u0085\2\2\u041ai\3\2\2\2\u041b\u041d"+
		"\7\\\2\2\u041c\u041e\5l\67\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0420\7]\2\2\u0420k\3\2\2\2\u0421\u0422\b\67\1\2"+
		"\u0422\u0423\5d\63\2\u0423\u0428\3\2\2\2\u0424\u0425\f\3\2\2\u0425\u0427"+
		"\5d\63\2\u0426\u0424\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428"+
		"\u0429\3\2\2\2\u0429m\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u042c\7.\2\2\u042c"+
		"\u042d\7X\2\2\u042d\u042e\5p9\2\u042e\u042f\7Y\2\2\u042f\u0430\5d\63\2"+
		"\u0430\u0440\3\2\2\2\u0431\u0432\7.\2\2\u0432\u0433\7X\2\2\u0433\u0434"+
		"\5p9\2\u0434\u0435\7Y\2\2\u0435\u0436\5d\63\2\u0436\u0437\7#\2\2\u0437"+
		"\u0438\5d\63\2\u0438\u0440\3\2\2\2\u0439\u043a\7F\2\2\u043a\u043b\7X\2"+
		"\2\u043b\u043c\5p9\2\u043c\u043d\7Y\2\2\u043d\u043e\5d\63\2\u043e\u0440"+
		"\3\2\2\2\u043f\u042b\3\2\2\2\u043f\u0431\3\2\2\2\u043f\u0439\3\2\2\2\u0440"+
		"o\3\2\2\2\u0441\u0452\5`\61\2\u0442\u0444\5\u00dan\2\u0443\u0442\3\2\2"+
		"\2\u0443\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\5\u0092J\2\u0446"+
		"\u0447\5\u00f4{\2\u0447\u0448\7h\2\2\u0448\u0449\5\u0124\u0093\2\u0449"+
		"\u0452\3\2\2\2\u044a\u044c\5\u00dan\2\u044b\u044a\3\2\2\2\u044b\u044c"+
		"\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\5\u0092J\2\u044e\u044f\5\u00f4"+
		"{\2\u044f\u0450\5\u0128\u0095\2\u0450\u0452\3\2\2\2\u0451\u0441\3\2\2"+
		"\2\u0451\u0443\3\2\2\2\u0451\u044b\3\2\2\2\u0452q\3\2\2\2\u0453\u0454"+
		"\7W\2\2\u0454\u0455\7X\2\2\u0455\u0456\5p9\2\u0456\u0457\7Y\2\2\u0457"+
		"\u0458\5d\63\2\u0458\u0477\3\2\2\2\u0459\u045a\7 \2\2\u045a\u045b\5d\63"+
		"\2\u045b\u045c\7W\2\2\u045c\u045d\7X\2\2\u045d\u045e\5`\61\2\u045e\u045f"+
		"\7Y\2\2\u045f\u0460\7\u0085\2\2\u0460\u0477\3\2\2\2\u0461\u0462\7+\2\2"+
		"\u0462\u0463\7X\2\2\u0463\u0465\5t;\2\u0464\u0466\5p9\2\u0465\u0464\3"+
		"\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0469\7\u0085\2\2"+
		"\u0468\u046a\5`\61\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u046c\7Y\2\2\u046c\u046d\5d\63\2\u046d\u0477\3\2\2\2\u046e"+
		"\u046f\7+\2\2\u046f\u0470\7X\2\2\u0470\u0471\5v<\2\u0471\u0472\7\u0083"+
		"\2\2\u0472\u0473\5x=\2\u0473\u0474\7Y\2\2\u0474\u0475\5d\63\2\u0475\u0477"+
		"\3\2\2\2\u0476\u0453\3\2\2\2\u0476\u0459\3\2\2\2\u0476\u0461\3\2\2\2\u0476"+
		"\u046e\3\2\2\2\u0477s\3\2\2\2\u0478\u047b\5h\65\2\u0479\u047b\5\u0088"+
		"E\2\u047a\u0478\3\2\2\2\u047a\u0479\3\2\2\2\u047bu\3\2\2\2\u047c\u047e"+
		"\5\u00dan\2\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2"+
		"\2\u047f\u0480\5\u0092J\2\u0480\u0481\5\u00f4{\2\u0481w\3\2\2\2\u0482"+
		"\u0485\5`\61\2\u0483\u0485\5\u0128\u0095\2\u0484\u0482\3\2\2\2\u0484\u0483"+
		"\3\2\2\2\u0485y\3\2\2\2\u0486\u0487\7\22\2\2\u0487\u0497\7\u0085\2\2\u0488"+
		"\u0489\7\34\2\2\u0489\u0497\7\u0085\2\2\u048a\u048c\7>\2\2\u048b\u048d"+
		"\5`\61\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e"+
		"\u0497\7\u0085\2\2\u048f\u0490\7>\2\2\u0490\u0491\5\u0128\u0095\2\u0491"+
		"\u0492\7\u0085\2\2\u0492\u0497\3\2\2\2\u0493\u0494\7-\2\2\u0494\u0495"+
		"\7\u0089\2\2\u0495\u0497\7\u0085\2\2\u0496\u0486\3\2\2\2\u0496\u0488\3"+
		"\2\2\2\u0496\u048a\3\2\2\2\u0496\u048f\3\2\2\2\u0496\u0493\3\2\2\2\u0497"+
		"{\3\2\2\2\u0498\u0499\5\u0084C\2\u0499}\3\2\2\2\u049a\u049b\b@\1\2\u049b"+
		"\u049c\5\u0080A\2\u049c\u04a1\3\2\2\2\u049d\u049e\f\3\2\2\u049e\u04a0"+
		"\5\u0080A\2\u049f\u049d\3\2\2\2\u04a0\u04a3\3\2\2\2\u04a1\u049f\3\2\2"+
		"\2\u04a1\u04a2\3\2\2\2\u04a2\177\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a4\u04af"+
		"\5\u0084C\2\u04a5\u04af\5\u011a\u008e\2\u04a6\u04af\5\u0162\u00b2\2\u04a7"+
		"\u04af\5\u0176\u00bc\2\u04a8\u04af\5\u0178\u00bd\2\u04a9\u04af\5\u00d8"+
		"m\2\u04aa\u04af\5\u00c0a\2\u04ab\u04af\5\u008cG\2\u04ac\u04af\5\u008e"+
		"H\2\u04ad\u04af\5\u0082B\2\u04ae\u04a4\3\2\2\2\u04ae\u04a5\3\2\2\2\u04ae"+
		"\u04a6\3\2\2\2\u04ae\u04a7\3\2\2\2\u04ae\u04a8\3\2\2\2\u04ae\u04a9\3\2"+
		"\2\2\u04ae\u04aa\3\2\2\2\u04ae\u04ab\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae"+
		"\u04ad\3\2\2\2\u04af\u0081\3\2\2\2\u04b0\u04b1\7\t\2\2\u04b1\u04b2\7i"+
		"\2\2\u04b2\u04b5\7\u0089\2\2\u04b3\u04b4\7\u0086\2\2\u04b4\u04b6\7\u0089"+
		"\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7"+
		"\u04c1\7j\2\2\u04b8\u04b9\7\t\2\2\u04b9\u04ba\7\n\2\2\u04ba\u04bd\7\u0089"+
		"\2\2\u04bb\u04bc\7\u0086\2\2\u04bc\u04be\7\u0089\2\2\u04bd\u04bb\3\2\2"+
		"\2\u04bd\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c1\7\n\2\2\u04c0\u04b0"+
		"\3\2\2\2\u04c0\u04b8\3\2\2\2\u04c1\u0083\3\2\2\2\u04c2\u04cb\5\u0088E"+
		"\2\u04c3\u04cb\5\u00d6l\2\u04c4\u04cb\5\u00ceh\2\u04c5\u04cb\5\u00d2j"+
		"\2\u04c6\u04cb\5\u00d4k\2\u04c7\u04cb\5\u008aF\2\u04c8\u04cb\5\u0086D"+
		"\2\u04c9\u04cb\5\u00b0Y\2\u04ca\u04c2\3\2\2\2\u04ca\u04c3\3\2\2\2\u04ca"+
		"\u04c4\3\2\2\2\u04ca\u04c5\3\2\2\2\u04ca\u04c6\3\2\2\2\u04ca\u04c7\3\2"+
		"\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04c9\3\2\2\2\u04cb\u0085\3\2\2\2\u04cc"+
		"\u04cd\7R\2\2\u04cd\u04cf\7\u0089\2\2\u04ce\u04d0\5\u00dan\2\u04cf\u04ce"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\7h\2\2\u04d2"+
		"\u04d3\5\u0108\u0085\2\u04d3\u04d4\7\u0085\2\2\u04d4\u0087\3\2\2\2\u04d5"+
		"\u04d7\5\u0092J\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9"+
		"\3\2\2\2\u04d8\u04da\5\u00f0y\2\u04d9\u04d8\3\2\2\2\u04d9\u04da\3\2\2"+
		"\2\u04da\u04db\3\2\2\2\u04db\u04e4\7\u0085\2\2\u04dc\u04de\5\u00dan\2"+
		"\u04dd\u04df\5\u0092J\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df"+
		"\u04e0\3\2\2\2\u04e0\u04e1\5\u00f0y\2\u04e1\u04e2\7\u0085\2\2\u04e2\u04e4"+
		"\3\2\2\2\u04e3\u04d6\3\2\2\2\u04e3\u04dc\3\2\2\2\u04e4\u0089\3\2\2\2\u04e5"+
		"\u04e6\7C\2\2\u04e6\u04e7\7X\2\2\u04e7\u04e8\5b\62\2\u04e8\u04e9\7\177"+
		"\2\2\u04e9\u04ea\7\u0092\2\2\u04ea\u04eb\7Y\2\2\u04eb\u04ec\7\u0085\2"+
		"\2\u04ec\u008b\3\2\2\2\u04ed\u04ee\7\u0085\2\2\u04ee\u008d\3\2\2\2\u04ef"+
		"\u04f0\5\u00dan\2\u04f0\u04f1\7\u0085\2\2\u04f1\u008f\3\2\2\2\u04f2\u04f9"+
		"\5\u0094K\2\u04f3\u04f9\5\u009aN\2\u04f4\u04f9\5\u0096L\2\u04f5\u04f9"+
		"\7,\2\2\u04f6\u04f9\7M\2\2\u04f7\u04f9\7\32\2\2\u04f8\u04f2\3\2\2\2\u04f8"+
		"\u04f3\3\2\2\2\u04f8\u04f4\3\2\2\2\u04f8\u04f5\3\2\2\2\u04f8\u04f6\3\2"+
		"\2\2\u04f8\u04f7\3\2\2\2\u04f9\u0091\3\2\2\2\u04fa\u04fc\5\u0090I\2\u04fb"+
		"\u04fd\5\u00dan\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0502"+
		"\3\2\2\2\u04fe\u04ff\5\u0090I\2\u04ff\u0500\5\u0092J\2\u0500\u0502\3\2"+
		"\2\2\u0501\u04fa\3\2\2\2\u0501\u04fe\3\2\2\2\u0502\u0093\3\2\2\2\u0503"+
		"\u0504\t\6\2\2\u0504\u0095\3\2\2\2\u0505\u0506\t\7\2\2\u0506\u0097\3\2"+
		"\2\2\u0507\u0508\7\u0089\2\2\u0508\u0099\3\2\2\2\u0509\u050d\5\u009cO"+
		"\2\u050a\u050d\5\u012c\u0097\2\u050b\u050d\5\u00acW\2\u050c\u0509\3\2"+
		"\2\2\u050c\u050a\3\2\2\2\u050c\u050b\3\2\2\2\u050d\u009b\3\2\2\2\u050e"+
		"\u0513\5\u00a2R\2\u050f\u0513\5\u00a8U\2\u0510\u0513\5\u0174\u00bb\2\u0511"+
		"\u0513\5\u0102\u0082\2\u0512\u050e\3\2\2\2\u0512\u050f\3\2\2\2\u0512\u0510"+
		"\3\2\2\2\u0512\u0511\3\2\2\2\u0513\u009d\3\2\2\2\u0514\u0516\5\u009aN"+
		"\2\u0515\u0517\5\u00dan\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517"+
		"\u051c\3\2\2\2\u0518\u0519\5\u009aN\2\u0519\u051a\5\u009eP\2\u051a\u051c"+
		"\3\2\2\2\u051b\u0514\3\2\2\2\u051b\u0518\3\2\2\2\u051c\u009f\3\2\2\2\u051d"+
		"\u051f\5\u009cO\2\u051e\u0520\5\u00dan\2\u051f\u051e\3\2\2\2\u051f\u0520"+
		"\3\2\2\2\u0520\u0525\3\2\2\2\u0521\u0522\5\u009cO\2\u0522\u0523\5\u00a0"+
		"Q\2\u0523\u0525\3\2\2\2\u0524\u051d\3\2\2\2\u0524\u0521\3\2\2\2\u0525"+
		"\u00a1\3\2\2\2\u0526\u0528\5\f\7\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2"+
		"\2\2\u0528\u0529\3\2\2\2\u0529\u053e\5\u00a4S\2\u052a\u052b\5\f\7\2\u052b"+
		"\u052c\7G\2\2\u052c\u052d\5\u016a\u00b6\2\u052d\u053e\3\2\2\2\u052e\u053e"+
		"\7\25\2\2\u052f\u053e\7\26\2\2\u0530\u053e\7\27\2\2\u0531\u053e\7V\2\2"+
		"\u0532\u053e\7\21\2\2\u0533\u053e\7?\2\2\u0534\u053e\7\60\2\2\u0535\u053e"+
		"\7\61\2\2\u0536\u053e\7@\2\2\u0537\u053e\7Q\2\2\u0538\u053e\7*\2\2\u0539"+
		"\u053e\7!\2\2\u053a\u053e\7T\2\2\u053b\u053e\7\20\2\2\u053c\u053e\5\u00a6"+
		"T\2\u053d\u0527\3\2\2\2\u053d\u052a\3\2\2\2\u053d\u052e\3\2\2\2\u053d"+
		"\u052f\3\2\2\2\u053d\u0530\3\2\2\2\u053d\u0531\3\2\2\2\u053d\u0532\3\2"+
		"\2\2\u053d\u0533\3\2\2\2\u053d\u0534\3\2\2\2\u053d\u0535\3\2\2\2\u053d"+
		"\u0536\3\2\2\2\u053d\u0537\3\2\2\2\u053d\u0538\3\2\2\2\u053d\u0539\3\2"+
		"\2\2\u053d\u053a\3\2\2\2\u053d\u053b\3\2\2\2\u053d\u053c\3\2\2\2\u053e"+
		"\u00a3\3\2\2\2\u053f\u0544\5\u012a\u0096\2\u0540\u0544\5\u00aaV\2\u0541"+
		"\u0544\5\u0098M\2\u0542\u0544\5\u016a\u00b6\2\u0543\u053f\3\2\2\2\u0543"+
		"\u0540\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0542\3\2\2\2\u0544\u00a5\3\2"+
		"\2\2\u0545\u0546\7\35\2\2\u0546\u0547\7X\2\2\u0547\u0548\5`\61\2\u0548"+
		"\u0549\7Y\2\2\u0549\u054f\3\2\2\2\u054a\u054b\7\35\2\2\u054b\u054c\7X"+
		"\2\2\u054c\u054d\7\20\2\2\u054d\u054f\7Y\2\2\u054e\u0545\3\2\2\2\u054e"+
		"\u054a\3\2\2\2\u054f\u00a7\3\2\2\2\u0550\u0552\5\u0134\u009b\2\u0551\u0553"+
		"\5\u00dan\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0555\3\2\2"+
		"\2\u0554\u0556\5\f\7\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557"+
		"\3\2\2\2\u0557\u0558\7\u0089\2\2\u0558\u0569\3\2\2\2\u0559\u055a\5\u0134"+
		"\u009b\2\u055a\u055b\5\u016a\u00b6\2\u055b\u0569\3\2\2\2\u055c\u055d\5"+
		"\u0134\u009b\2\u055d\u055f\5\f\7\2\u055e\u0560\7G\2\2\u055f\u055e\3\2"+
		"\2\2\u055f\u0560\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\5\u016a\u00b6"+
		"\2\u0562\u0569\3\2\2\2\u0563\u0565\7$\2\2\u0564\u0566\5\f\7\2\u0565\u0564"+
		"\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\7\u0089\2"+
		"\2\u0568\u0550\3\2\2\2\u0568\u0559\3\2\2\2\u0568\u055c\3\2\2\2\u0568\u0563"+
		"\3\2\2\2\u0569\u00a9\3\2\2\2\u056a\u056b\7\u0089\2\2\u056b\u00ab\3\2\2"+
		"\2\u056c\u056d\5\u00aeX\2\u056d\u056f\7\\\2\2\u056e\u0570\5\u00b6\\\2"+
		"\u056f\u056e\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572"+
		"\7]\2\2\u0572\u057a\3\2\2\2\u0573\u0574\5\u00aeX\2\u0574\u0575\7\\\2\2"+
		"\u0575\u0576\5\u00b6\\\2\u0576\u0577\7\177\2\2\u0577\u0578\7]\2\2\u0578"+
		"\u057a\3\2\2\2\u0579\u056c\3\2\2\2\u0579\u0573\3\2\2\2\u057a\u00ad\3\2"+
		"\2\2\u057b\u057d\5\u00b2Z\2\u057c\u057e\5\u00dan\2\u057d\u057c\3\2\2\2"+
		"\u057d\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u0581\7\u0089\2\2\u0580"+
		"\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0583\3\2\2\2\u0582\u0584\5\u00b4"+
		"[\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u058f\3\2\2\2\u0585"+
		"\u0587\5\u00b2Z\2\u0586\u0588\5\u00dan\2\u0587\u0586\3\2\2\2\u0587\u0588"+
		"\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\5\f\7\2\u058a\u058c\7\u0089\2"+
		"\2\u058b\u058d\5\u00b4[\2\u058c\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d"+
		"\u058f\3\2\2\2\u058e\u057b\3\2\2\2\u058e\u0585\3\2\2\2\u058f\u00af\3\2"+
		"\2\2\u0590\u0592\5\u00b2Z\2\u0591\u0593\5\u00dan\2\u0592\u0591\3\2\2\2"+
		"\u0592\u0593\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\7\u0089\2\2\u0595"+
		"\u0597\5\u00b4[\2\u0596\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598"+
		"\3\2\2\2\u0598\u0599\7\u0085\2\2\u0599\u00b1\3\2\2\2\u059a\u05a0\7$\2"+
		"\2\u059b\u059c\7$\2\2\u059c\u05a0\7\30\2\2\u059d\u059e\7$\2\2\u059e\u05a0"+
		"\7E\2\2\u059f\u059a\3\2\2\2\u059f\u059b\3\2\2\2\u059f\u059d\3\2\2\2\u05a0"+
		"\u00b3\3\2\2\2\u05a1\u05a2\7\u0083\2\2\u05a2\u05a3\5\u009eP\2\u05a3\u00b5"+
		"\3\2\2\2\u05a4\u05a5\b\\\1\2\u05a5\u05a6\5\u00b8]\2\u05a6\u05ac\3\2\2"+
		"\2\u05a7\u05a8\f\3\2\2\u05a8\u05a9\7\177\2\2\u05a9\u05ab\5\u00b8]\2\u05aa"+
		"\u05a7\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2"+
		"\2\2\u05ad\u00b7\3\2\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b5\5\u00ba^\2\u05b0"+
		"\u05b1\5\u00ba^\2\u05b1\u05b2\7h\2\2\u05b2\u05b3\5b\62\2\u05b3\u05b5\3"+
		"\2\2\2\u05b4\u05af\3\2\2\2\u05b4\u05b0\3\2\2\2\u05b5\u00b9\3\2\2\2\u05b6"+
		"\u05b7\7\u0089\2\2\u05b7\u00bb\3\2\2\2\u05b8\u05bb\5\u00be`\2\u05b9\u05bb"+
		"\5\u00ccg\2\u05ba\u05b8\3\2\2\2\u05ba\u05b9\3\2\2\2\u05bb\u00bd\3\2\2"+
		"\2\u05bc\u05bd\7\u0089\2\2\u05bd\u00bf\3\2\2\2\u05be\u05c1\5\u00c2b\2"+
		"\u05bf\u05c1\5\u00c8e\2\u05c0\u05be\3\2\2\2\u05c0\u05bf\3\2\2\2\u05c1"+
		"\u00c1\3\2\2\2\u05c2\u05c5\5\u00c4c\2\u05c3\u05c5\5\u00c6d\2\u05c4\u05c2"+
		"\3\2\2\2\u05c4\u05c3\3\2\2\2\u05c5\u00c3\3\2\2\2\u05c6\u05c8\7/\2\2\u05c7"+
		"\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\7\63"+
		"\2\2\u05ca\u05cb\7\u0089\2\2\u05cb\u05cc\7\\\2\2\u05cc\u05cd\5\u00caf"+
		"\2\u05cd\u05ce\7]\2\2\u05ce\u00c5\3\2\2\2\u05cf\u05d1\7/\2\2\u05d0\u05cf"+
		"\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\7\63\2\2"+
		"\u05d3\u05d4\5\u00be`\2\u05d4\u05d5\7\\\2\2\u05d5\u05d6\5\u00caf\2\u05d6"+
		"\u05d7\7]\2\2\u05d7\u00c7\3\2\2\2\u05d8\u05da\7/\2\2\u05d9\u05d8\3\2\2"+
		"\2\u05d9\u05da\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\7\63\2\2\u05dc"+
		"\u05dd\7\\\2\2\u05dd\u05de\5\u00caf\2\u05de\u05df\7]\2\2\u05df\u00c9\3"+
		"\2\2\2\u05e0\u05e2\5~@\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u00cb\3\2\2\2\u05e3\u05e4\7\u0089\2\2\u05e4\u00cd\3\2\2\2\u05e5\u05e6"+
		"\7\63\2\2\u05e6\u05e7\7\u0089\2\2\u05e7\u05e8\7h\2\2\u05e8\u05e9\5\u00d0"+
		"i\2\u05e9\u05ea\7\u0085\2\2\u05ea\u00cf\3\2\2\2\u05eb\u05ed\5\f\7\2\u05ec"+
		"\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\5\u00bc"+
		"_\2\u05ef\u00d1\3\2\2\2\u05f0\u05f2\7R\2\2\u05f1\u05f3\7O\2\2\u05f2\u05f1"+
		"\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5\5\f\7\2\u05f5"+
		"\u05f6\5\b\5\2\u05f6\u05f7\7\u0085\2\2\u05f7\u05fe\3\2\2\2\u05f8\u05f9"+
		"\7R\2\2\u05f9\u05fa\7\u0084\2\2\u05fa\u05fb\5\b\5\2\u05fb\u05fc\7\u0085"+
		"\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05f0\3\2\2\2\u05fd\u05f8\3\2\2\2\u05fe"+
		"\u00d3\3\2\2\2\u05ff\u0601\5\u00dan\2\u0600\u05ff\3\2\2\2\u0600\u0601"+
		"\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\7R\2\2\u0603\u0605\7\63\2\2\u0604"+
		"\u0606\5\f\7\2\u0605\u0604\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\3\2"+
		"\2\2\u0607\u0608\5\u00bc_\2\u0608\u0609\7\u0085\2\2\u0609\u00d5\3\2\2"+
		"\2\u060a\u060b\7\17\2\2\u060b\u060c\7X\2\2\u060c\u060d\7\u0092\2\2\u060d"+
		"\u060e\7Y\2\2\u060e\u060f\7\u0085\2\2\u060f\u00d7\3\2\2\2\u0610\u0611"+
		"\7\'\2\2\u0611\u0612\7\u0092\2\2\u0612\u0614\7\\\2\2\u0613\u0615\5~@\2"+
		"\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u061b"+
		"\7]\2\2\u0617\u0618\7\'\2\2\u0618\u0619\7\u0092\2\2\u0619\u061b\5\u0080"+
		"A\2\u061a\u0610\3\2\2\2\u061a\u0617\3\2\2\2\u061b\u00d9\3\2\2\2\u061c"+
		"\u061d\bn\1\2\u061d\u061e\5\u00dco\2\u061e\u0623\3\2\2\2\u061f\u0620\f"+
		"\3\2\2\u0620\u0622\5\u00dco\2\u0621\u061f\3\2\2\2\u0622\u0625\3\2\2\2"+
		"\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u00db\3\2\2\2\u0625\u0623"+
		"\3\2\2\2\u0626\u0627\7Z\2\2\u0627\u0628\7Z\2\2\u0628\u0629\5\u00e0q\2"+
		"\u0629\u062a\7[\2\2\u062a\u062b\7[\2\2\u062b\u062e\3\2\2\2\u062c\u062e"+
		"\5\u00dep\2\u062d\u0626\3\2\2\2\u062d\u062c\3\2\2\2\u062e\u00dd\3\2\2"+
		"\2\u062f\u0630\7\r\2\2\u0630\u0631\7X\2\2\u0631\u0633\5\u0108\u0085\2"+
		"\u0632\u0634\7\u0088\2\2\u0633\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634"+
		"\u0635\3\2\2\2\u0635\u0636\7Y\2\2\u0636\u0640\3\2\2\2\u0637\u0638\7\r"+
		"\2\2\u0638\u0639\7X\2\2\u0639\u063b\5b\62\2\u063a\u063c\7\u0088\2\2\u063b"+
		"\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063e\7Y"+
		"\2\2\u063e\u0640\3\2\2\2\u063f\u062f\3\2\2\2\u063f\u0637\3\2\2\2\u0640"+
		"\u00df\3\2\2\2\u0641\u0643\bq\1\2\u0642\u0644\5\u00e2r\2\u0643\u0642\3"+
		"\2\2\2\u0643\u0644\3\2\2\2\u0644\u0649\3\2\2\2\u0645\u0646\5\u00e2r\2"+
		"\u0646\u0647\7\u0088\2\2\u0647\u0649\3\2\2\2\u0648\u0641\3\2\2\2\u0648"+
		"\u0645\3\2\2\2\u0649\u0656\3\2\2\2\u064a\u064b\f\5\2\2\u064b\u064d\7\177"+
		"\2\2\u064c\u064e\5\u00e2r\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e"+
		"\u0655\3\2\2\2\u064f\u0650\f\3\2\2\u0650\u0651\7\177\2\2\u0651\u0652\5"+
		"\u00e2r\2\u0652\u0653\7\u0088\2\2\u0653\u0655\3\2\2\2\u0654\u064a\3\2"+
		"\2\2\u0654\u064f\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654\3\2\2\2\u0656"+
		"\u0657\3\2\2\2\u0657\u00e1\3\2\2\2\u0658\u0656\3\2\2\2\u0659\u065b\5\u00e4"+
		"s\2\u065a\u065c\5\u00eav\2\u065b\u065a\3\2\2\2\u065b\u065c\3\2\2\2\u065c"+
		"\u00e3\3\2\2\2\u065d\u0660\7\u0089\2\2\u065e\u0660\5\u00e6t\2\u065f\u065d"+
		"\3\2\2\2\u065f\u065e\3\2\2\2\u0660\u00e5\3\2\2\2\u0661\u0662\5\u00e8u"+
		"\2\u0662\u0663\7\u0084\2\2\u0663\u0664\7\u0089\2\2\u0664\u00e7\3\2\2\2"+
		"\u0665\u0666\7\u0089\2\2\u0666\u00e9\3\2\2\2\u0667\u0668\7X\2\2\u0668"+
		"\u0669\5\u00ecw\2\u0669\u066a\7Y\2\2\u066a\u00eb\3\2\2\2\u066b\u066d\b"+
		"w\1\2\u066c\u066e\5\u00eex\2\u066d\u066c\3\2\2\2\u066d\u066e\3\2\2\2\u066e"+
		"\u0673\3\2\2\2\u066f\u0670\f\3\2\2\u0670\u0672\5\u00eex\2\u0671\u066f"+
		"\3\2\2\2\u0672\u0675\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674"+
		"\u00ed\3\2\2\2\u0675\u0673\3\2\2\2\u0676\u0677\7X\2\2\u0677\u0678\5\u00ec"+
		"w\2\u0678\u0679\7Y\2\2\u0679\u0688\3\2\2\2\u067a\u067b\7Z\2\2\u067b\u067c"+
		"\5\u00ecw\2\u067c\u067d\7[\2\2\u067d\u0688\3\2\2\2\u067e\u067f\7\\\2\2"+
		"\u067f\u0680\5\u00ecw\2\u0680\u0681\7]\2\2\u0681\u0688\3\2\2\2\u0682\u0684"+
		"\n\b\2\2\u0683\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0683\3\2\2\2\u0685"+
		"\u0686\3\2\2\2\u0686\u0688\3\2\2\2\u0687\u0676\3\2\2\2\u0687\u067a\3\2"+
		"\2\2\u0687\u067e\3\2\2\2\u0687\u0683\3\2\2\2\u0688\u00ef\3\2\2\2\u0689"+
		"\u068a\by\1\2\u068a\u068b\5\u00f2z\2\u068b\u0691\3\2\2\2\u068c\u068d\f"+
		"\3\2\2\u068d\u068e\7\177\2\2\u068e\u0690\5\u00f2z\2\u068f\u068c\3\2\2"+
		"\2\u0690\u0693\3\2\2\2\u0691\u068f\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u00f1"+
		"\3\2\2\2\u0693\u0691\3\2\2\2\u0694\u0696\5\u00f4{\2\u0695\u0697\5\u0120"+
		"\u0091\2\u0696\u0695\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u00f3\3\2\2\2\u0698"+
		"\u069e\5\u00f6|\2\u0699\u069a\5\u00f8}\2\u069a\u069b\5\u00fa~\2\u069b"+
		"\u069c\5\u00fc\177\2\u069c\u069e\3\2\2\2\u069d\u0698\3\2\2\2\u069d\u0699"+
		"\3\2\2\2\u069e\u00f5\3\2\2\2\u069f\u06a4\5\u00f8}\2\u06a0\u06a1\5\u00fe"+
		"\u0080\2\u06a1\u06a2\5\u00f6|\2\u06a2\u06a4\3\2\2\2\u06a3\u069f\3\2\2"+
		"\2\u06a3\u06a0\3\2\2\2\u06a4\u00f7\3\2\2\2\u06a5\u06a6\b}\1\2\u06a6\u06a8"+
		"\5\u0106\u0084\2\u06a7\u06a9\5\u00dan\2\u06a8\u06a7\3\2\2\2\u06a8\u06a9"+
		"\3\2\2\2\u06a9\u06af\3\2\2\2\u06aa\u06ab\7X\2\2\u06ab\u06ac\5\u00f6|\2"+
		"\u06ac\u06ad\7Y\2\2\u06ad\u06af\3\2\2\2\u06ae\u06a5\3\2\2\2\u06ae\u06aa"+
		"\3\2\2\2\u06af\u06bd\3\2\2\2\u06b0\u06b1\f\5\2\2\u06b1\u06bc\5\u00fa~"+
		"\2\u06b2\u06b3\f\4\2\2\u06b3\u06b5\7Z\2\2\u06b4\u06b6\5b\62\2\u06b5\u06b4"+
		"\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b9\7[\2\2\u06b8"+
		"\u06ba\5\u00dan\2\u06b9\u06b8\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bc"+
		"\3\2\2\2\u06bb\u06b0\3\2\2\2\u06bb\u06b2\3\2\2\2\u06bc\u06bf\3\2\2\2\u06bd"+
		"\u06bb\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u00f9\3\2\2\2\u06bf\u06bd\3\2"+
		"\2\2\u06c0\u06c1\7X\2\2\u06c1\u06c2\5\u0114\u008b\2\u06c2\u06c4\7Y\2\2"+
		"\u06c3\u06c5\5\u0100\u0081\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5"+
		"\u06c7\3\2\2\2\u06c6\u06c8\5\u0104\u0083\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8"+
		"\3\2\2\2\u06c8\u06ca\3\2\2\2\u06c9\u06cb\5\u0186\u00c4\2\u06ca\u06c9\3"+
		"\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cd\3\2\2\2\u06cc\u06ce\5\u00dan\2"+
		"\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u00fb\3\2\2\2\u06cf\u06d0"+
		"\7\u0081\2\2\u06d0\u06d2\5\u00a0Q\2\u06d1\u06d3\5\u010a\u0086\2\u06d2"+
		"\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u00fd\3\2\2\2\u06d4\u06d6\7`"+
		"\2\2\u06d5\u06d7\5\u00dan\2\u06d6\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7"+
		"\u06d9\3\2\2\2\u06d8\u06da\5\u0100\u0081\2\u06d9\u06d8\3\2\2\2\u06d9\u06da"+
		"\3\2\2\2\u06da\u06ec\3\2\2\2\u06db\u06dd\7d\2\2\u06dc\u06de\5\u00dan\2"+
		"\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06ec\3\2\2\2\u06df\u06e1"+
		"\7\5\2\2\u06e0\u06e2\5\u00dan\2\u06e1\u06e0\3\2\2\2\u06e1\u06e2\3\2\2"+
		"\2\u06e2\u06ec\3\2\2\2\u06e3\u06e4\5\f\7\2\u06e4\u06e6\7`\2\2\u06e5\u06e7"+
		"\5\u00dan\2\u06e6\u06e5\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\3\2\2"+
		"\2\u06e8\u06ea\5\u0100\u0081\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2"+
		"\u06ea\u06ec\3\2\2\2\u06eb\u06d4\3\2\2\2\u06eb\u06db\3\2\2\2\u06eb\u06df"+
		"\3\2\2\2\u06eb\u06e3\3\2\2\2\u06ec\u00ff\3\2\2\2\u06ed\u06ef\5\u0102\u0082"+
		"\2\u06ee\u06f0\5\u0100\u0081\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2"+
		"\u06f0\u0101\3\2\2\2\u06f1\u06f2\t\t\2\2\u06f2\u0103\3\2\2\2\u06f3\u06f4"+
		"\t\n\2\2\u06f4\u0105\3\2\2\2\u06f5\u06f7\7\u0088\2\2\u06f6\u06f5\3\2\2"+
		"\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\5\6\4\2\u06f9\u0107"+
		"\3\2\2\2\u06fa\u06fc\5\u009eP\2\u06fb\u06fd\5\u010a\u0086\2\u06fc\u06fb"+
		"\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u0109\3\2\2\2\u06fe\u0707\5\u010c\u0087"+
		"\2\u06ff\u0701\5\u010e\u0088\2\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2\2"+
		"\u0701\u0702\3\2\2\2\u0702\u0703\5\u00fa~\2\u0703\u0704\5\u00fc\177\2"+
		"\u0704\u0707\3\2\2\2\u0705\u0707\5\u0110\u0089\2\u0706\u06fe\3\2\2\2\u0706"+
		"\u0700\3\2\2\2\u0706\u0705\3\2\2\2\u0707\u010b\3\2\2\2\u0708\u070e\5\u010e"+
		"\u0088\2\u0709\u070b\5\u00fe\u0080\2\u070a\u070c\5\u010c\u0087\2\u070b"+
		"\u070a\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070e\3\2\2\2\u070d\u0708\3\2"+
		"\2\2\u070d\u0709\3\2\2\2\u070e\u010d\3\2\2\2\u070f\u0710\b\u0088\1\2\u0710"+
		"\u071e\5\u00fa~\2\u0711\u0713\7Z\2\2\u0712\u0714\5b\62\2\u0713\u0712\3"+
		"\2\2\2\u0713\u0714\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0717\7[\2\2\u0716"+
		"\u0718\5\u00dan\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u071e"+
		"\3\2\2\2\u0719\u071a\7X\2\2\u071a\u071b\5\u010c\u0087\2\u071b\u071c\7"+
		"Y\2\2\u071c\u071e\3\2\2\2\u071d\u070f\3\2\2\2\u071d\u0711\3\2\2\2\u071d"+
		"\u0719\3\2\2\2\u071e\u072c\3\2\2\2\u071f\u0720\f\7\2\2\u0720\u072b\5\u00fa"+
		"~\2\u0721\u0722\f\5\2\2\u0722\u0724\7Z\2\2\u0723\u0725\5b\62\2\u0724\u0723"+
		"\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0728\7[\2\2\u0727"+
		"\u0729\5\u00dan\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072b"+
		"\3\2\2\2\u072a\u071f\3\2\2\2\u072a\u0721\3\2\2\2\u072b\u072e\3\2\2\2\u072c"+
		"\u072a\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u010f\3\2\2\2\u072e\u072c\3\2"+
		"\2\2\u072f\u0734\5\u0112\u008a\2\u0730\u0731\5\u00fe\u0080\2\u0731\u0732"+
		"\5\u0110\u0089\2\u0732\u0734\3\2\2\2\u0733\u072f\3\2\2\2\u0733\u0730\3"+
		"\2\2\2\u0734\u0111\3\2\2\2\u0735\u0736\b\u008a\1\2\u0736\u0737\7\u0088"+
		"\2\2\u0737\u0745\3\2\2\2\u0738\u0739\f\5\2\2\u0739\u0744\5\u00fa~\2\u073a"+
		"\u073b\f\4\2\2\u073b\u073d\7Z\2\2\u073c\u073e\5b\62\2\u073d\u073c\3\2"+
		"\2\2\u073d\u073e\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0741\7[\2\2\u0740"+
		"\u0742\5\u00dan\2\u0741\u0740\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0744"+
		"\3\2\2\2\u0743\u0738\3\2\2\2\u0743\u073a\3\2\2\2\u0744\u0747\3\2\2\2\u0745"+
		"\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0113\3\2\2\2\u0747\u0745\3\2"+
		"\2\2\u0748\u074a\5\u0116\u008c\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2"+
		"\2\u074a\u074c\3\2\2\2\u074b\u074d\7\u0088\2\2\u074c\u074b\3\2\2\2\u074c"+
		"\u074d\3\2\2\2\u074d\u0753\3\2\2\2\u074e\u074f\5\u0116\u008c\2\u074f\u0750"+
		"\7\177\2\2\u0750\u0751\7\u0088\2\2\u0751\u0753\3\2\2\2\u0752\u0749\3\2"+
		"\2\2\u0752\u074e\3\2\2\2\u0753\u0115\3\2\2\2\u0754\u0755\b\u008c\1\2\u0755"+
		"\u0756\5\u0118\u008d\2\u0756\u075c\3\2\2\2\u0757\u0758\f\3\2\2\u0758\u0759"+
		"\7\177\2\2\u0759\u075b\5\u0118\u008d\2\u075a\u0757\3\2\2\2\u075b\u075e"+
		"\3\2\2\2\u075c\u075a\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u0117\3\2\2\2\u075e"+
		"\u075c\3\2\2\2\u075f\u0761\5\u00dan\2\u0760\u075f\3\2\2\2\u0760\u0761"+
		"\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0763\5\u0092J\2\u0763\u0764\5\u00f4"+
		"{\2\u0764\u077f\3\2\2\2\u0765\u0767\5\u00dan\2\u0766\u0765\3\2\2\2\u0766"+
		"\u0767\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u0769\5\u0092J\2\u0769\u076a"+
		"\5\u00f4{\2\u076a\u076b\7h\2\2\u076b\u076c\5\u0124\u0093\2\u076c\u077f"+
		"\3\2\2\2\u076d\u076f\5\u00dan\2\u076e\u076d\3\2\2\2\u076e\u076f\3\2\2"+
		"\2\u076f\u0770\3\2\2\2\u0770\u0772\5\u0092J\2\u0771\u0773\5\u010a\u0086"+
		"\2\u0772\u0771\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u077f\3\2\2\2\u0774\u0776"+
		"\5\u00dan\2\u0775\u0774\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\3\2\2"+
		"\2\u0777\u0779\5\u0092J\2\u0778\u077a\5\u010a\u0086\2\u0779\u0778\3\2"+
		"\2\2\u0779\u077a\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077c\7h\2\2\u077c"+
		"\u077d\5\u0124\u0093\2\u077d\u077f\3\2\2\2\u077e\u0760\3\2\2\2\u077e\u0766"+
		"\3\2\2\2\u077e\u076e\3\2\2\2\u077e\u0775\3\2\2\2\u077f\u0119\3\2\2\2\u0780"+
		"\u0781\5\u011c\u008f\2\u0781\u0782\5\u011e\u0090\2\u0782\u011b\3\2\2\2"+
		"\u0783\u0785\5\u00dan\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785"+
		"\u0787\3\2\2\2\u0786\u0788\5\u0092J\2\u0787\u0786\3\2\2\2\u0787\u0788"+
		"\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078b\5\u00f4{\2\u078a\u078c\5\u013e"+
		"\u00a0\2\u078b\u078a\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u011d\3\2\2\2\u078d"+
		"\u078f\5\u0156\u00ac\2\u078e\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790"+
		"\3\2\2\2\u0790\u0799\5j\66\2\u0791\u0799\5\u017c\u00bf\2\u0792\u0793\7"+
		"h\2\2\u0793\u0794\7\36\2\2\u0794\u0799\7\u0085\2\2\u0795\u0796\7h\2\2"+
		"\u0796\u0797\7\37\2\2\u0797\u0799\7\u0085\2\2\u0798\u078e\3\2\2\2\u0798"+
		"\u0791\3\2\2\2\u0798\u0792\3\2\2\2\u0798\u0795\3\2\2\2\u0799\u011f\3\2"+
		"\2\2\u079a\u07a0\5\u0122\u0092\2\u079b\u079c\7X\2\2\u079c\u079d\5&\24"+
		"\2\u079d\u079e\7Y\2\2\u079e\u07a0\3\2\2\2\u079f\u079a\3\2\2\2\u079f\u079b"+
		"\3\2\2\2\u07a0\u0121\3\2\2\2\u07a1\u07a2\7h\2\2\u07a2\u07a5\5\u0124\u0093"+
		"\2\u07a3\u07a5\5\u0128\u0095\2\u07a4\u07a1\3\2\2\2\u07a4\u07a3\3\2\2\2"+
		"\u07a5\u0123\3\2\2\2\u07a6\u07a9\5\\/\2\u07a7\u07a9\5\u0128\u0095\2\u07a8"+
		"\u07a6\3\2\2\2\u07a8\u07a7\3\2\2\2\u07a9\u0125\3\2\2\2\u07aa\u07ab\b\u0094"+
		"\1\2\u07ab\u07ad\5\u0124\u0093\2\u07ac\u07ae\7\u0088\2\2\u07ad\u07ac\3"+
		"\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b7\3\2\2\2\u07af\u07b0\f\3\2\2\u07b0"+
		"\u07b1\7\177\2\2\u07b1\u07b3\5\u0124\u0093\2\u07b2\u07b4\7\u0088\2\2\u07b3"+
		"\u07b2\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b6\3\2\2\2\u07b5\u07af\3\2"+
		"\2\2\u07b6\u07b9\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8"+
		"\u0127\3\2\2\2\u07b9\u07b7\3\2\2\2\u07ba\u07bb\7\\\2\2\u07bb\u07bd\5\u0126"+
		"\u0094\2\u07bc\u07be\7\177\2\2\u07bd\u07bc\3\2\2\2\u07bd\u07be\3\2\2\2"+
		"\u07be\u07bf\3\2\2\2\u07bf\u07c0\7]\2\2\u07c0\u07c4\3\2\2\2\u07c1\u07c2"+
		"\7\\\2\2\u07c2\u07c4\7]\2\2\u07c3\u07ba\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c4"+
		"\u0129\3\2\2\2\u07c5\u07c8\7\u0089\2\2\u07c6\u07c8\5\u016a\u00b6\2\u07c7"+
		"\u07c5\3\2\2\2\u07c7\u07c6\3\2\2\2\u07c8\u012b\3\2\2\2\u07c9\u07ca\5\u012e"+
		"\u0098\2\u07ca\u07cc\7\\\2\2\u07cb\u07cd\5\u0136\u009c\2\u07cc\u07cb\3"+
		"\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u07cf\7]\2\2\u07cf"+
		"\u012d\3\2\2\2\u07d0\u07d2\5\u0134\u009b\2\u07d1\u07d3\5\u00dan\2\u07d2"+
		"\u07d1\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d6\5\u0130"+
		"\u0099\2\u07d5\u07d7\5\u0132\u009a\2\u07d6\u07d5\3\2\2\2\u07d6\u07d7\3"+
		"\2\2\2\u07d7\u07d9\3\2\2\2\u07d8\u07da\5\u0144\u00a3\2\u07d9\u07d8\3\2"+
		"\2\2\u07d9\u07da\3\2\2\2\u07da\u07e3\3\2\2\2\u07db\u07dd\5\u0134\u009b"+
		"\2\u07dc\u07de\5\u00dan\2\u07dd\u07dc\3\2\2\2\u07dd\u07de\3\2\2\2\u07de"+
		"\u07e0\3\2\2\2\u07df\u07e1\5\u0144\u00a3\2\u07e0\u07df\3\2\2\2\u07e0\u07e1"+
		"\3\2\2\2\u07e1\u07e3\3\2\2\2\u07e2\u07d0\3\2\2\2\u07e2\u07db\3\2\2\2\u07e3"+
		"\u012f\3\2\2\2\u07e4\u07e6\5\f\7\2\u07e5\u07e4\3\2\2\2\u07e5\u07e6\3\2"+
		"\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\5\u012a\u0096\2\u07e8\u0131\3\2\2"+
		"\2\u07e9\u07ea\7)\2\2\u07ea\u0133\3\2\2\2\u07eb\u07ec\t\13\2\2\u07ec\u0135"+
		"\3\2\2\2\u07ed\u07ef\5\u0138\u009d\2\u07ee\u07f0\5\u0136\u009c\2\u07ef"+
		"\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f7\3\2\2\2\u07f1\u07f2\5\u014e"+
		"\u00a8\2\u07f2\u07f4\7\u0083\2\2\u07f3\u07f5\5\u0136\u009c\2\u07f4\u07f3"+
		"\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f7\3\2\2\2\u07f6\u07ed\3\2\2\2\u07f6"+
		"\u07f1\3\2\2\2\u07f7\u0137\3\2\2\2\u07f8\u07fa\5\u00dan\2\u07f9\u07f8"+
		"\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fc\3\2\2\2\u07fb\u07fd\5\u0092J"+
		"\2\u07fc\u07fb\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07ff\3\2\2\2\u07fe\u0800"+
		"\5\u013a\u009e\2\u07ff\u07fe\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0801\3"+
		"\2\2\2\u0801\u0809\7\u0085\2\2\u0802\u0809\5\u011a\u008e\2\u0803\u0809"+
		"\5\u00d2j\2\u0804\u0809\5\u008aF\2\u0805\u0809\5\u0162\u00b2\2\u0806\u0809"+
		"\5\u0086D\2\u0807\u0809\5\u008cG\2\u0808\u07f9\3\2\2\2\u0808\u0802\3\2"+
		"\2\2\u0808\u0803\3\2\2\2\u0808\u0804\3\2\2\2\u0808\u0805\3\2\2\2\u0808"+
		"\u0806\3\2\2\2\u0808\u0807\3\2\2\2\u0809\u0139\3\2\2\2\u080a\u080b\b\u009e"+
		"\1\2\u080b\u080c\5\u013c\u009f\2\u080c\u0812\3\2\2\2\u080d\u080e\f\3\2"+
		"\2\u080e\u080f\7\177\2\2\u080f\u0811\5\u013c\u009f\2\u0810\u080d\3\2\2"+
		"\2\u0811\u0814\3\2\2\2\u0812\u0810\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u013b"+
		"\3\2\2\2\u0814\u0812\3\2\2\2\u0815\u0817\5\u00f4{\2\u0816\u0818\5\u013e"+
		"\u00a0\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081a\3\2\2\2\u0819"+
		"\u081b\5\u0142\u00a2\2\u081a\u0819\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u0829"+
		"\3\2\2\2\u081c\u081e\5\u00f4{\2\u081d\u081f\5\u0122\u0092\2\u081e\u081d"+
		"\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0829\3\2\2\2\u0820\u0822\7\u0089\2"+
		"\2\u0821\u0820\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0824\3\2\2\2\u0823\u0825"+
		"\5\u00dan\2\u0824\u0823\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0826\3\2\2"+
		"\2\u0826\u0827\7\u0083\2\2\u0827\u0829\5b\62\2\u0828\u0815\3\2\2\2\u0828"+
		"\u081c\3\2\2\2\u0828\u0821\3\2\2\2\u0829\u013d\3\2\2\2\u082a\u082b\b\u00a0"+
		"\1\2\u082b\u082c\5\u0140\u00a1\2\u082c\u0831\3\2\2\2\u082d\u082e\f\3\2"+
		"\2\u082e\u0830\5\u0140\u00a1\2\u082f\u082d\3\2\2\2\u0830\u0833\3\2\2\2"+
		"\u0831\u082f\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u013f\3\2\2\2\u0833\u0831"+
		"\3\2\2\2\u0834\u0835\t\f\2\2\u0835\u0141\3\2\2\2\u0836\u0837\7h\2\2\u0837"+
		"\u0838\7\u008c\2\2\u0838\u0839\b\u00a2\1\2\u0839\u0143\3\2\2\2\u083a\u083b"+
		"\7\u0083\2\2\u083b\u083c\5\u0146\u00a4\2\u083c\u0145\3\2\2\2\u083d\u083e"+
		"\b\u00a4\1\2\u083e\u0840\5\u0148\u00a5\2\u083f\u0841\7\u0088\2\2\u0840"+
		"\u083f\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u084a\3\2\2\2\u0842\u0843\f\3"+
		"\2\2\u0843\u0844\7\177\2\2\u0844\u0846\5\u0148\u00a5\2\u0845\u0847\7\u0088"+
		"\2\2\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0849\3\2\2\2\u0848"+
		"\u0842\3\2\2\2\u0849\u084c\3\2\2\2\u084a\u0848\3\2\2\2\u084a\u084b\3\2"+
		"\2\2\u084b\u0147\3\2\2\2\u084c\u084a\3\2\2\2\u084d\u084f\5\u00dan\2\u084e"+
		"\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0863\5\u014c"+
		"\u00a7\2\u0851\u0853\5\u00dan\2\u0852\u0851\3\2\2\2\u0852\u0853\3\2\2"+
		"\2\u0853\u0854\3\2\2\2\u0854\u0856\7S\2\2\u0855\u0857\5\u014e\u00a8\2"+
		"\u0856\u0855\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u0863"+
		"\5\u014c\u00a7\2\u0859\u085b\5\u00dan\2\u085a\u0859\3\2\2\2\u085a\u085b"+
		"\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085e\5\u014e\u00a8\2\u085d\u085f\7"+
		"S\2\2\u085e\u085d\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0860\3\2\2\2\u0860"+
		"\u0861\5\u014c\u00a7\2\u0861\u0863\3\2\2\2\u0862\u084e\3\2\2\2\u0862\u0852"+
		"\3\2\2\2\u0862\u085a\3\2\2\2\u0863\u0149\3\2\2\2\u0864\u0866\5\f\7\2\u0865"+
		"\u0864\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u086a\5\u012a"+
		"\u0096\2\u0868\u086a\5\u00a6T\2\u0869\u0865\3\2\2\2\u0869\u0868\3\2\2"+
		"\2\u086a\u014b\3\2\2\2\u086b\u086c\5\u014a\u00a6\2\u086c\u014d\3\2\2\2"+
		"\u086d\u086e\t\r\2\2\u086e\u014f\3\2\2\2\u086f\u0870\7\67\2\2\u0870\u0871"+
		"\5\u0152\u00aa\2\u0871\u0151\3\2\2\2\u0872\u0874\5\u009eP\2\u0873\u0875"+
		"\5\u0154\u00ab\2\u0874\u0873\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0153\3"+
		"\2\2\2\u0876\u0878\5\u00fe\u0080\2\u0877\u0879\5\u0154\u00ab\2\u0878\u0877"+
		"\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u0155\3\2\2\2\u087a\u087b\7\u0083\2"+
		"\2\u087b\u087c\5\u0158\u00ad\2\u087c\u0157\3\2\2\2\u087d\u087f\5\u015a"+
		"\u00ae\2\u087e\u0880\7\u0088\2\2\u087f\u087e\3\2\2\2\u087f\u0880\3\2\2"+
		"\2\u0880\u0889\3\2\2\2\u0881\u0883\5\u015a\u00ae\2\u0882\u0884\7\u0088"+
		"\2\2\u0883\u0882\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0885\3\2\2\2\u0885"+
		"\u0886\7\177\2\2\u0886\u0887\5\u0158\u00ad\2\u0887\u0889\3\2\2\2\u0888"+
		"\u087d\3\2\2\2\u0888\u0881\3\2\2\2\u0889\u0159\3\2\2\2\u088a\u088b\5\u015c"+
		"\u00af\2\u088b\u088d\7X\2\2\u088c\u088e\5&\24\2\u088d\u088c\3\2\2\2\u088d"+
		"\u088e\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0890\7Y\2\2\u0890\u0895\3\2"+
		"\2\2\u0891\u0892\5\u015c\u00af\2\u0892\u0893\5\u0128\u0095\2\u0893\u0895"+
		"\3\2\2\2\u0894\u088a\3\2\2\2\u0894\u0891\3\2\2\2\u0895\u015b\3\2\2\2\u0896"+
		"\u0899\5\u014a\u00a6\2\u0897\u0899\7\u0089\2\2\u0898\u0896\3\2\2\2\u0898"+
		"\u0897\3\2\2\2\u0899\u015d\3\2\2\2\u089a\u089b\7\67\2\2\u089b\u089c\5"+
		"\u018e\u00c8\2\u089c\u015f\3\2\2\2\u089d\u089e\7\67\2\2\u089e\u089f\7"+
		"\u0092\2\2\u089f\u08a3\7\u0089\2\2\u08a0\u08a1\7\67\2\2\u08a1\u08a3\7"+
		"\u0095\2\2\u08a2\u089d\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a3\u0161\3\2\2\2"+
		"\u08a4\u08a5\7G\2\2\u08a5\u08a6\7i\2\2\u08a6\u08a7\5\u0164\u00b3\2\u08a7"+
		"\u08a8\7j\2\2\u08a8\u08a9\5\u0080A\2\u08a9\u0163\3\2\2\2\u08aa\u08ab\b"+
		"\u00b3\1\2\u08ab\u08ac\5\u0166\u00b4\2\u08ac\u08b2\3\2\2\2\u08ad\u08ae"+
		"\f\3\2\2\u08ae\u08af\7\177\2\2\u08af\u08b1\5\u0166\u00b4\2\u08b0\u08ad"+
		"\3\2\2\2\u08b1\u08b4\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3"+
		"\u0165\3\2\2\2\u08b4\u08b2\3\2\2\2\u08b5\u08b8\5\u0168\u00b5\2\u08b6\u08b8"+
		"\5\u0118\u008d\2\u08b7\u08b5\3\2\2\2\u08b7\u08b6\3\2\2\2\u08b8\u0167\3"+
		"\2\2\2\u08b9\u08bb\7\30\2\2\u08ba\u08bc\7\u0088\2\2\u08bb\u08ba\3\2\2"+
		"\2\u08bb\u08bc\3\2\2\2\u08bc\u08be\3\2\2\2\u08bd\u08bf\7\u0089\2\2\u08be"+
		"\u08bd\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08ea\3\2\2\2\u08c0\u08c2\7\30"+
		"\2\2\u08c1\u08c3\7\u0089\2\2\u08c2\u08c1\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3"+
		"\u08c4\3\2\2\2\u08c4\u08c5\7h\2\2\u08c5\u08ea\5\u0108\u0085\2\u08c6\u08c8"+
		"\7O\2\2\u08c7\u08c9\7\u0088\2\2\u08c8\u08c7\3\2\2\2\u08c8\u08c9\3\2\2"+
		"\2\u08c9\u08cb\3\2\2\2\u08ca\u08cc\7\u0089\2\2\u08cb\u08ca\3\2\2\2\u08cb"+
		"\u08cc\3\2\2\2\u08cc\u08ea\3\2\2\2\u08cd\u08cf\7O\2\2\u08ce\u08d0\7\u0089"+
		"\2\2\u08cf\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1"+
		"\u08d2\7h\2\2\u08d2\u08ea\5\u0108\u0085\2\u08d3\u08d4\7G\2\2\u08d4\u08d5"+
		"\7i\2\2\u08d5\u08d6\5\u0164\u00b3\2\u08d6\u08d7\7j\2\2\u08d7\u08d9\7\30"+
		"\2\2\u08d8\u08da\7\u0088\2\2\u08d9\u08d8\3\2\2\2\u08d9\u08da\3\2\2\2\u08da"+
		"\u08dc\3\2\2\2\u08db\u08dd\7\u0089\2\2\u08dc\u08db\3\2\2\2\u08dc\u08dd"+
		"\3\2\2\2\u08dd\u08ea\3\2\2\2\u08de\u08df\7G\2\2\u08df\u08e0\7i\2\2\u08e0"+
		"\u08e1\5\u0164\u00b3\2\u08e1\u08e2\7j\2\2\u08e2\u08e4\7\30\2\2\u08e3\u08e5"+
		"\7\u0089\2\2\u08e4\u08e3\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e6\3\2\2"+
		"\2\u08e6\u08e7\7h\2\2\u08e7\u08e8\5\6\4\2\u08e8\u08ea\3\2\2\2\u08e9\u08b9"+
		"\3\2\2\2\u08e9\u08c0\3\2\2\2\u08e9\u08c6\3\2\2\2\u08e9\u08cd\3\2\2\2\u08e9"+
		"\u08d3\3\2\2\2\u08e9\u08de\3\2\2\2\u08ea\u0169\3\2\2\2\u08eb\u08ec\5\u016e"+
		"\u00b8\2\u08ec\u08ee\7i\2\2\u08ed\u08ef\5\u0170\u00b9\2\u08ee\u08ed\3"+
		"\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f1\7j\2\2\u08f1"+
		"\u016b\3\2\2\2\u08f2\u0902\5\u016a\u00b6\2\u08f3\u08f4\5\u015e\u00b0\2"+
		"\u08f4\u08f6\7i\2\2\u08f5\u08f7\5\u0170\u00b9\2\u08f6\u08f5\3\2\2\2\u08f6"+
		"\u08f7\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u08f9\7j\2\2\u08f9\u0902\3\2"+
		"\2\2\u08fa\u08fb\5\u0160\u00b1\2\u08fb\u08fd\7i\2\2\u08fc\u08fe\5\u0170"+
		"\u00b9\2\u08fd\u08fc\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff"+
		"\u0900\7j\2\2\u0900\u0902\3\2\2\2\u0901\u08f2\3\2\2\2\u0901\u08f3\3\2"+
		"\2\2\u0901\u08fa\3\2\2\2\u0902\u016d\3\2\2\2\u0903\u0904\7\u0089\2\2\u0904"+
		"\u016f\3\2\2\2\u0905\u0906\b\u00b9\1\2\u0906\u0908\5\u0172\u00ba\2\u0907"+
		"\u0909\7\u0088\2\2\u0908\u0907\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u0912"+
		"\3\2\2\2\u090a\u090b\f\3\2\2\u090b\u090c\7\177\2\2\u090c\u090e\5\u0172"+
		"\u00ba\2\u090d\u090f\7\u0088\2\2\u090e\u090d\3\2\2\2\u090e\u090f\3\2\2"+
		"\2\u090f\u0911\3\2\2\2\u0910\u090a\3\2\2\2\u0911\u0914\3\2\2\2\u0912\u0910"+
		"\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0171\3\2\2\2\u0914\u0912\3\2\2\2\u0915"+
		"\u0919\5\u0108\u0085\2\u0916\u0919\5b\62\2\u0917\u0919\5\6\4\2\u0918\u0915"+
		"\3\2\2\2\u0918\u0916\3\2\2\2\u0918\u0917\3\2\2\2\u0919\u0173\3\2\2\2\u091a"+
		"\u091b\7O\2\2\u091b\u091c\5\f\7\2\u091c\u091d\7\u0089\2\2\u091d\u0926"+
		"\3\2\2\2\u091e\u091f\7O\2\2\u091f\u0921\5\f\7\2\u0920\u0922\7G\2\2\u0921"+
		"\u0920\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\5\u016a"+
		"\u00b6\2\u0924\u0926\3\2\2\2\u0925\u091a\3\2\2\2\u0925\u091e\3\2\2\2\u0926"+
		"\u0175\3\2\2\2\u0927\u0929\7\'\2\2\u0928\u0927\3\2\2\2\u0928\u0929\3\2"+
		"\2\2\u0929\u092a\3\2\2\2\u092a\u092b\7G\2\2\u092b\u092c\5\u0080A\2\u092c"+
		"\u0177\3\2\2\2\u092d\u092e\7G\2\2\u092e\u092f\7i\2\2\u092f\u0930\7j\2"+
		"\2\u0930\u0931\5\u0080A\2\u0931\u0179\3\2\2\2\u0932\u0933\7L\2\2\u0933"+
		"\u0934\5j\66\2\u0934\u0935\5\u017e\u00c0\2\u0935\u017b\3\2\2\2\u0936\u0938"+
		"\7L\2\2\u0937\u0939\5\u0156\u00ac\2\u0938\u0937\3\2\2\2\u0938\u0939\3"+
		"\2\2\2\u0939\u093a\3\2\2\2\u093a\u093b\5j\66\2\u093b\u093c\5\u017e\u00c0"+
		"\2\u093c\u017d\3\2\2\2\u093d\u093f\5\u0180\u00c1\2\u093e\u0940\5\u017e"+
		"\u00c0\2\u093f\u093e\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u017f\3\2\2\2\u0941"+
		"\u0942\7\24\2\2\u0942\u0943\7X\2\2\u0943\u0944\5\u0182\u00c2\2\u0944\u0945"+
		"\7Y\2\2\u0945\u0946\5j\66\2\u0946\u0181\3\2\2\2\u0947\u0949\5\u00dan\2"+
		"\u0948\u0947\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b"+
		"\5\u009eP\2\u094b\u094c\5\u00f4{\2\u094c\u0956\3\2\2\2\u094d\u094f\5\u00da"+
		"n\2\u094e\u094d\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\3\2\2\2\u0950"+
		"\u0952\5\u009eP\2\u0951\u0953\5\u010a\u0086\2\u0952\u0951\3\2\2\2\u0952"+
		"\u0953\3\2\2\2\u0953\u0956\3\2\2\2\u0954\u0956\7\u0088\2\2\u0955\u0948"+
		"\3\2\2\2\u0955\u094e\3\2\2\2\u0955\u0954\3\2\2\2\u0956\u0183\3\2\2\2\u0957"+
		"\u0959\7J\2\2\u0958\u095a\5\\/\2\u0959\u0958\3\2\2\2\u0959\u095a\3\2\2"+
		"\2\u095a\u0185\3\2\2\2\u095b\u095e\5\u0188\u00c5\2\u095c\u095e\5\u018c"+
		"\u00c7\2\u095d\u095b\3\2\2\2\u095d\u095c\3\2\2\2\u095e\u0187\3\2\2\2\u095f"+
		"\u0960\7J\2\2\u0960\u0962\7X\2\2\u0961\u0963\5\u018a\u00c6\2\u0962\u0961"+
		"\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0965\7Y\2\2\u0965"+
		"\u0189\3\2\2\2\u0966\u0967\b\u00c6\1\2\u0967\u0969\5\u0108\u0085\2\u0968"+
		"\u096a\7\u0088\2\2\u0969\u0968\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u0973"+
		"\3\2\2\2\u096b\u096c\f\3\2\2\u096c\u096d\7\177\2\2\u096d\u096f\5\u0108"+
		"\u0085\2\u096e\u0970\7\u0088\2\2\u096f\u096e\3\2\2\2\u096f\u0970\3\2\2"+
		"\2\u0970\u0972\3\2\2\2\u0971\u096b\3\2\2\2\u0972\u0975\3\2\2\2\u0973\u0971"+
		"\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u018b\3\2\2\2\u0975\u0973\3\2\2\2\u0976"+
		"\u0977\7\65\2\2\u0977\u0978\7X\2\2\u0978\u0979\5b\62\2\u0979\u097a\7Y"+
		"\2\2\u097a\u097d\3\2\2\2\u097b\u097d\7\65\2\2\u097c\u0976\3\2\2\2\u097c"+
		"\u097b\3\2\2\2\u097d\u018d\3\2\2\2\u097e\u09b2\7\64\2\2\u097f\u09b2\7"+
		"\37\2\2\u0980\u0981\7\64\2\2\u0981\u0982\7Z\2\2\u0982\u09b2\7[\2\2\u0983"+
		"\u0984\7\37\2\2\u0984\u0985\7Z\2\2\u0985\u09b2\7[\2\2\u0986\u09b2\7^\2"+
		"\2\u0987\u09b2\7_\2\2\u0988\u09b2\7`\2\2\u0989\u09b2\7a\2\2\u098a\u09b2"+
		"\7b\2\2\u098b\u09b2\7c\2\2\u098c\u09b2\7d\2\2\u098d\u09b2\7e\2\2\u098e"+
		"\u09b2\7f\2\2\u098f\u09b2\7\3\2\2\u0990\u09b2\7\4\2\2\u0991\u09b2\7h\2"+
		"\2\u0992\u09b2\7i\2\2\u0993\u09b2\7j\2\2\u0994\u09b2\7k\2\2\u0995\u09b2"+
		"\7l\2\2\u0996\u09b2\7m\2\2\u0997\u09b2\7n\2\2\u0998\u09b2\7o\2\2\u0999"+
		"\u09b2\7p\2\2\u099a\u09b2\7q\2\2\u099b\u09b2\7r\2\2";
	private static final String _serializedATNSegment1 =
		"\u099c\u09b2\7s\2\2\u099d\u09b2\7t\2\2\u099e\u09b2\7v\2\2\u099f\u09b2"+
		"\7u\2\2\u09a0\u09b2\7w\2\2\u09a1\u09b2\7x\2\2\u09a2\u09b2\7y\2\2\u09a3"+
		"\u09b2\7z\2\2\u09a4\u09b2\7\5\2\2\u09a5\u09b2\7\6\2\2\u09a6\u09b2\7\7"+
		"\2\2\u09a7\u09b2\7\b\2\2\u09a8\u09b2\7}\2\2\u09a9\u09b2\7~\2\2\u09aa\u09b2"+
		"\7\177\2\2\u09ab\u09b2\7\u0080\2\2\u09ac\u09b2\7\u0081\2\2\u09ad\u09ae"+
		"\7X\2\2\u09ae\u09b2\7Y\2\2\u09af\u09b0\7Z\2\2\u09b0\u09b2\7[\2\2\u09b1"+
		"\u097e\3\2\2\2\u09b1\u097f\3\2\2\2\u09b1\u0980\3\2\2\2\u09b1\u0983\3\2"+
		"\2\2\u09b1\u0986\3\2\2\2\u09b1\u0987\3\2\2\2\u09b1\u0988\3\2\2\2\u09b1"+
		"\u0989\3\2\2\2\u09b1\u098a\3\2\2\2\u09b1\u098b\3\2\2\2\u09b1\u098c\3\2"+
		"\2\2\u09b1\u098d\3\2\2\2\u09b1\u098e\3\2\2\2\u09b1\u098f\3\2\2\2\u09b1"+
		"\u0990\3\2\2\2\u09b1\u0991\3\2\2\2\u09b1\u0992\3\2\2\2\u09b1\u0993\3\2"+
		"\2\2\u09b1\u0994\3\2\2\2\u09b1\u0995\3\2\2\2\u09b1\u0996\3\2\2\2\u09b1"+
		"\u0997\3\2\2\2\u09b1\u0998\3\2\2\2\u09b1\u0999\3\2\2\2\u09b1\u099a\3\2"+
		"\2\2\u09b1\u099b\3\2\2\2\u09b1\u099c\3\2\2\2\u09b1\u099d\3\2\2\2\u09b1"+
		"\u099e\3\2\2\2\u09b1\u099f\3\2\2\2\u09b1\u09a0\3\2\2\2\u09b1\u09a1\3\2"+
		"\2\2\u09b1\u09a2\3\2\2\2\u09b1\u09a3\3\2\2\2\u09b1\u09a4\3\2\2\2\u09b1"+
		"\u09a5\3\2\2\2\u09b1\u09a6\3\2\2\2\u09b1\u09a7\3\2\2\2\u09b1\u09a8\3\2"+
		"\2\2\u09b1\u09a9\3\2\2\2\u09b1\u09aa\3\2\2\2\u09b1\u09ab\3\2\2\2\u09b1"+
		"\u09ac\3\2\2\2\u09b1\u09ad\3\2\2\2\u09b1\u09af\3\2\2\2\u09b2\u018f\3\2"+
		"\2\2\u09b3\u09bb\7\u008a\2\2\u09b4\u09bb\7\u0090\2\2\u09b5\u09bb\7\u0091"+
		"\2\2\u09b6\u09bb\7\u0092\2\2\u09b7\u09bb\5\u0192\u00ca\2\u09b8\u09bb\5"+
		"\u0194\u00cb\2\u09b9\u09bb\5\u0196\u00cc\2\u09ba\u09b3\3\2\2\2\u09ba\u09b4"+
		"\3\2\2\2\u09ba\u09b5\3\2\2\2\u09ba\u09b6\3\2\2\2\u09ba\u09b7\3\2\2\2\u09ba"+
		"\u09b8\3\2\2\2\u09ba\u09b9\3\2\2\2\u09bb\u0191\3\2\2\2\u09bc\u09bd\t\16"+
		"\2\2\u09bd\u0193\3\2\2\2\u09be\u09bf\7\66\2\2\u09bf\u0195\3\2\2\2\u09c0"+
		"\u09c1\t\17\2\2\u09c1\u0197\3\2\2\2\u0141\u0199\u01a5\u01a9\u01b4\u01b8"+
		"\u01c7\u01ce\u01d3\u01d5\u01da\u01e0\u01ea\u01f1\u01f7\u01fb\u0200\u0206"+
		"\u020d\u0213\u0216\u0219\u021c\u0223\u022a\u025e\u026d\u0273\u0279\u0286"+
		"\u0288\u0292\u02a1\u02a7\u02c5\u02ca\u02ce\u02d2\u02d5\u02d9\u02df\u02e1"+
		"\u02e9\u02ed\u02f0\u02f7\u02fe\u0302\u0307\u030b\u030e\u0313\u0319\u0324"+
		"\u0333\u0335\u0344\u0346\u0352\u0354\u0360\u0374\u0376\u0382\u0384\u038f"+
		"\u039a\u03a5\u03b1\u03b3\u03bf\u03c1\u03cb\u03d3\u03df\u03e6\u03ea\u03ee"+
		"\u03f2\u03f6\u03fb\u03fe\u0401\u0407\u040f\u0414\u0417\u041d\u0428\u043f"+
		"\u0443\u044b\u0451\u0465\u0469\u0476\u047a\u047d\u0484\u048c\u0496\u04a1"+
		"\u04ae\u04b5\u04bd\u04c0\u04ca\u04cf\u04d6\u04d9\u04de\u04e3\u04f8\u04fc"+
		"\u0501\u050c\u0512\u0516\u051b\u051f\u0524\u0527\u053d\u0543\u054e\u0552"+
		"\u0555\u055f\u0565\u0568\u056f\u0579\u057d\u0580\u0583\u0587\u058c\u058e"+
		"\u0592\u0596\u059f\u05ac\u05b4\u05ba\u05c0\u05c4\u05c7\u05d0\u05d9\u05e1"+
		"\u05ec\u05f2\u05fd\u0600\u0605\u0614\u061a\u0623\u062d\u0633\u063b\u063f"+
		"\u0643\u0648\u064d\u0654\u0656\u065b\u065f\u066d\u0673\u0685\u0687\u0691"+
		"\u0696\u069d\u06a3\u06a8\u06ae\u06b5\u06b9\u06bb\u06bd\u06c4\u06c7\u06ca"+
		"\u06cd\u06d2\u06d6\u06d9\u06dd\u06e1\u06e6\u06e9\u06eb\u06ef\u06f6\u06fc"+
		"\u0700\u0706\u070b\u070d\u0713\u0717\u071d\u0724\u0728\u072a\u072c\u0733"+
		"\u073d\u0741\u0743\u0745\u0749\u074c\u0752\u075c\u0760\u0766\u076e\u0772"+
		"\u0775\u0779\u077e\u0784\u0787\u078b\u078e\u0798\u079f\u07a4\u07a8\u07ad"+
		"\u07b3\u07b7\u07bd\u07c3\u07c7\u07cc\u07d2\u07d6\u07d9\u07dd\u07e0\u07e2"+
		"\u07e5\u07ef\u07f4\u07f6\u07f9\u07fc\u07ff\u0808\u0812\u0817\u081a\u081e"+
		"\u0821\u0824\u0828\u0831\u0840\u0846\u084a\u084e\u0852\u0856\u085a\u085e"+
		"\u0862\u0865\u0869\u0874\u0878\u087f\u0883\u0888\u088d\u0894\u0898\u08a2"+
		"\u08b2\u08b7\u08bb\u08be\u08c2\u08c8\u08cb\u08cf\u08d9\u08dc\u08e4\u08e9"+
		"\u08ee\u08f6\u08fd\u0901\u0908\u090e\u0912\u0918\u0921\u0925\u0928\u0938"+
		"\u093f\u0948\u094e\u0952\u0955\u0959\u095d\u0962\u0969\u096f\u0973\u097c"+
		"\u09b1\u09ba";
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