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
		RULE_statement = 49, RULE_labeledstatement = 50, RULE_caseexpression = 51, 
		RULE_expressionstatement = 52, RULE_compoundstatement = 53, RULE_statementseq = 54, 
		RULE_selectionstatement = 55, RULE_ifexpression = 56, RULE_switchexpression = 57, 
		RULE_condition = 58, RULE_iterationstatement = 59, RULE_dostatement = 60, 
		RULE_whileexpression = 61, RULE_basicforexpression = 62, RULE_enhancedforexpression = 63, 
		RULE_forinitstatement = 64, RULE_forrangedeclaration = 65, RULE_forrangeinitializer = 66, 
		RULE_jumpstatement = 67, RULE_breakstatement = 68, RULE_continuestatement = 69, 
		RULE_returnstatement = 70, RULE_declarationstatement = 71, RULE_declarationseq = 72, 
		RULE_declaration = 73, RULE_includedeclaration = 74, RULE_blockdeclaration = 75, 
		RULE_aliasdeclaration = 76, RULE_simpledeclaration = 77, RULE_static_assertdeclaration = 78, 
		RULE_emptydeclaration = 79, RULE_attributedeclaration = 80, RULE_declspecifier = 81, 
		RULE_declspecifierseq = 82, RULE_storageclassspecifier = 83, RULE_functionspecifier = 84, 
		RULE_typedefname = 85, RULE_typespecifier = 86, RULE_trailingtypespecifier = 87, 
		RULE_typespecifierseq = 88, RULE_trailingtypespecifierseq = 89, RULE_simpletypespecifier = 90, 
		RULE_thetypename = 91, RULE_decltypespecifier = 92, RULE_elaboratedtypespecifier = 93, 
		RULE_enumname = 94, RULE_enumspecifier = 95, RULE_enumhead = 96, RULE_opaqueenumdeclaration = 97, 
		RULE_enumkey = 98, RULE_enumbase = 99, RULE_enumeratorlist = 100, RULE_enumeratordefinition = 101, 
		RULE_enumerator = 102, RULE_namespacename = 103, RULE_originalnamespacename = 104, 
		RULE_namespacedefinition = 105, RULE_namednamespacedefinition = 106, RULE_originalnamespacedefinition = 107, 
		RULE_extensionnamespacedefinition = 108, RULE_unnamednamespacedefinition = 109, 
		RULE_namespacebody = 110, RULE_namespacealias = 111, RULE_namespacealiasdefinition = 112, 
		RULE_qualifiednamespacespecifier = 113, RULE_usingdeclaration = 114, RULE_usingdirective = 115, 
		RULE_asmdefinition = 116, RULE_linkagespecification = 117, RULE_attributespecifierseq = 118, 
		RULE_attributespecifier = 119, RULE_alignmentspecifier = 120, RULE_attributelist = 121, 
		RULE_attribute = 122, RULE_attributetoken = 123, RULE_attributescopedtoken = 124, 
		RULE_attributenamespace = 125, RULE_attributeargumentclause = 126, RULE_balancedtokenseq = 127, 
		RULE_balancedtoken = 128, RULE_initdeclaratorlist = 129, RULE_initdeclarator = 130, 
		RULE_declarator = 131, RULE_ptrdeclarator = 132, RULE_noptrdeclarator = 133, 
		RULE_parametersandqualifiers = 134, RULE_trailingreturntype = 135, RULE_ptroperator = 136, 
		RULE_cvqualifierseq = 137, RULE_cvqualifier = 138, RULE_refqualifier = 139, 
		RULE_declaratorid = 140, RULE_thetypeid = 141, RULE_abstractdeclarator = 142, 
		RULE_ptrabstractdeclarator = 143, RULE_noptrabstractdeclarator = 144, 
		RULE_abstractpackdeclarator = 145, RULE_noptrabstractpackdeclarator = 146, 
		RULE_parameterdeclarationclause = 147, RULE_parameterdeclarationlist = 148, 
		RULE_parameterdeclaration = 149, RULE_functiondefinition = 150, RULE_functionhead = 151, 
		RULE_functionbody = 152, RULE_initializer = 153, RULE_braceorequalinitializer = 154, 
		RULE_initializerclause = 155, RULE_initializerlist = 156, RULE_bracedinitlist = 157, 
		RULE_classname = 158, RULE_classspecifier = 159, RULE_classhead = 160, 
		RULE_classheadname = 161, RULE_classvirtspecifier = 162, RULE_classkey = 163, 
		RULE_memberspecification = 164, RULE_memberdeclaration = 165, RULE_memberdeclaratorlist = 166, 
		RULE_memberdeclarator = 167, RULE_virtspecifierseq = 168, RULE_virtspecifier = 169, 
		RULE_purespecifier = 170, RULE_baseclause = 171, RULE_basespecifierlist = 172, 
		RULE_basespecifier = 173, RULE_classordecltype = 174, RULE_basetypespecifier = 175, 
		RULE_accessspecifier = 176, RULE_conversionfunctionid = 177, RULE_conversiontypeid = 178, 
		RULE_conversiondeclarator = 179, RULE_ctorinitializer = 180, RULE_meminitializerlist = 181, 
		RULE_meminitializer = 182, RULE_meminitializerid = 183, RULE_operatorfunctionid = 184, 
		RULE_literaloperatorid = 185, RULE_templatedeclaration = 186, RULE_templateparameterlist = 187, 
		RULE_templateparameter = 188, RULE_typeparameter = 189, RULE_simpletemplateid = 190, 
		RULE_templateid = 191, RULE_templatename = 192, RULE_templateargumentlist = 193, 
		RULE_templateargument = 194, RULE_typenamespecifier = 195, RULE_explicitinstantiation = 196, 
		RULE_explicitspecialization = 197, RULE_tryblock = 198, RULE_functiontryblock = 199, 
		RULE_tryblockexpression = 200, RULE_functiontryblockexpression = 201, 
		RULE_handlerseq = 202, RULE_handler = 203, RULE_catchexpression = 204, 
		RULE_exceptiondeclaration = 205, RULE_throwexpression = 206, RULE_exceptionspecification = 207, 
		RULE_dynamicexceptionspecification = 208, RULE_typeidlist = 209, RULE_noexceptspecification = 210, 
		RULE_theoperator = 211, RULE_literal = 212, RULE_booleanliteral = 213, 
		RULE_pointerliteral = 214, RULE_userdefinedliteral = 215;
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
		"statement", "labeledstatement", "caseexpression", "expressionstatement", 
		"compoundstatement", "statementseq", "selectionstatement", "ifexpression", 
		"switchexpression", "condition", "iterationstatement", "dostatement", 
		"whileexpression", "basicforexpression", "enhancedforexpression", "forinitstatement", 
		"forrangedeclaration", "forrangeinitializer", "jumpstatement", "breakstatement", 
		"continuestatement", "returnstatement", "declarationstatement", "declarationseq", 
		"declaration", "includedeclaration", "blockdeclaration", "aliasdeclaration", 
		"simpledeclaration", "static_assertdeclaration", "emptydeclaration", "attributedeclaration", 
		"declspecifier", "declspecifierseq", "storageclassspecifier", "functionspecifier", 
		"typedefname", "typespecifier", "trailingtypespecifier", "typespecifierseq", 
		"trailingtypespecifierseq", "simpletypespecifier", "thetypename", "decltypespecifier", 
		"elaboratedtypespecifier", "enumname", "enumspecifier", "enumhead", "opaqueenumdeclaration", 
		"enumkey", "enumbase", "enumeratorlist", "enumeratordefinition", "enumerator", 
		"namespacename", "originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
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
		"tryblock", "functiontryblock", "tryblockexpression", "functiontryblockexpression", 
		"handlerseq", "handler", "catchexpression", "exceptiondeclaration", "throwexpression", 
		"exceptionspecification", "dynamicexceptionspecification", "typeidlist", 
		"noexceptspecification", "theoperator", "literal", "booleanliteral", "pointerliteral", 
		"userdefinedliteral"
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
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Semi - 130)) | (1L << (Ellipsis - 130)) | (1L << (Identifier - 130)))) != 0)) {
				{
				setState(432);
				declarationseq(0);
				}
			}

			setState(435);
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
			setState(445);
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
				setState(437);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				match(LeftParen);
				setState(440);
				expression(0);
				setState(441);
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
				setState(443);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
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
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
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
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
				match(Tilde);
				setState(456);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				match(Tilde);
				setState(458);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(459);
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
			setState(462);
			nestednamespecifier(0);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(463);
				match(Template);
				}
			}

			setState(466);
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
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(469);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(470);
				thetypename();
				setState(471);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(473);
				namespacename();
				setState(474);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(476);
				decltypespecifier();
				setState(477);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(491);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(481);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(482);
						match(Identifier);
						setState(483);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(484);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(486);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(485);
							match(Template);
							}
						}

						setState(488);
						simpletemplateid();
						setState(489);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(495);
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
			setState(496);
			lambdaintroducer();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(497);
				lambdadeclarator();
				}
			}

			setState(500);
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
			setState(502);
			match(LeftBracket);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (This - 70)) | (1L << (And - 70)) | (1L << (Assign - 70)))) != 0) || _la==Identifier) {
				{
				setState(503);
				lambdacapture();
				}
			}

			setState(506);
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
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				capturedefault();
				setState(511);
				match(Comma);
				setState(512);
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
			setState(516);
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
			setState(519);
			capture();
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(520);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(531);
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
					setState(523);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(524);
					match(Comma);
					setState(525);
					capture();
					setState(527);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(526);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(533);
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
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
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
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(And);
				setState(540);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
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
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(Identifier);
				setState(545);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(And);
				setState(547);
				match(Identifier);
				setState(548);
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
			setState(551);
			match(LeftParen);
			setState(552);
			parameterdeclarationclause();
			setState(553);
			match(RightParen);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(554);
				match(Mutable);
				}
			}

			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(557);
				exceptionspecification();
				}
			}

			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(560);
				attributespecifierseq(0);
				}
			}

			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(563);
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
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(567);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(568);
				simpletypespecifier();
				setState(569);
				match(LeftParen);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(570);
					expressionlist();
					}
				}

				setState(573);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(575);
				typenamespecifier();
				setState(576);
				match(LeftParen);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(577);
					expressionlist();
					}
				}

				setState(580);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(582);
				simpletypespecifier();
				setState(583);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(585);
				typenamespecifier();
				setState(586);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(588);
				match(Dynamic_cast);
				setState(589);
				match(Less);
				setState(590);
				thetypeid();
				setState(591);
				match(Greater);
				setState(592);
				match(LeftParen);
				setState(593);
				expression(0);
				setState(594);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(596);
				match(Static_cast);
				setState(597);
				match(Less);
				setState(598);
				thetypeid();
				setState(599);
				match(Greater);
				setState(600);
				match(LeftParen);
				setState(601);
				expression(0);
				setState(602);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(604);
				match(Reinterpret_cast);
				setState(605);
				match(Less);
				setState(606);
				thetypeid();
				setState(607);
				match(Greater);
				setState(608);
				match(LeftParen);
				setState(609);
				expression(0);
				setState(610);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(612);
				match(Const_cast);
				setState(613);
				match(Less);
				setState(614);
				thetypeid();
				setState(615);
				match(Greater);
				setState(616);
				match(LeftParen);
				setState(617);
				expression(0);
				setState(618);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(620);
				typeidofthetypeid();
				setState(621);
				match(LeftParen);
				setState(622);
				expression(0);
				setState(623);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(625);
				typeidofthetypeid();
				setState(626);
				match(LeftParen);
				setState(627);
				thetypeid();
				setState(628);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(670);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(632);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(633);
						match(LeftBracket);
						setState(634);
						expression(0);
						setState(635);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(637);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(638);
						match(LeftBracket);
						setState(639);
						bracedinitlist();
						setState(640);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(642);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(643);
						match(LeftParen);
						setState(645);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(644);
							expressionlist();
							}
						}

						setState(647);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(648);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(649);
						match(Dot);
						setState(651);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(650);
							match(Template);
							}
						}

						setState(653);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(654);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(655);
						match(Arrow);
						setState(657);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(656);
							match(Template);
							}
						}

						setState(659);
						idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(660);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(661);
						match(Dot);
						setState(662);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(663);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(664);
						match(Arrow);
						setState(665);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(666);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(667);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(668);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(669);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(674);
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
			setState(675);
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
			setState(677);
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
			setState(679);
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
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(681);
					nestednamespecifier(0);
					}
					break;
				}
				setState(684);
				thetypename();
				setState(685);
				match(Doublecolon);
				setState(686);
				match(Tilde);
				setState(687);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				nestednamespecifier(0);
				setState(690);
				match(Template);
				setState(691);
				simpletemplateid();
				setState(692);
				match(Doublecolon);
				setState(693);
				match(Tilde);
				setState(694);
				thetypename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(696);
					nestednamespecifier(0);
					}
				}

				setState(699);
				match(Tilde);
				setState(700);
				thetypename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(701);
				match(Tilde);
				setState(702);
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
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				match(PlusPlus);
				setState(707);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				match(MinusMinus);
				setState(709);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				unaryoperator();
				setState(711);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
				match(Sizeof);
				setState(714);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(715);
				match(Sizeof);
				setState(716);
				match(LeftParen);
				setState(717);
				thetypeid();
				setState(718);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(720);
				match(Sizeof);
				setState(721);
				match(Ellipsis);
				setState(722);
				match(LeftParen);
				setState(723);
				match(Identifier);
				setState(724);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(725);
				match(Alignof);
				setState(726);
				match(LeftParen);
				setState(727);
				thetypeid();
				setState(728);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(730);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(731);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(732);
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
			setState(735);
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
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(737);
					match(Doublecolon);
					}
				}

				setState(740);
				match(New);
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(741);
					newplacement();
					}
				}

				setState(744);
				newtypeid();
				setState(746);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(745);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(748);
					match(Doublecolon);
					}
				}

				setState(751);
				match(New);
				setState(753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(752);
					newplacement();
					}
					break;
				}
				setState(755);
				match(LeftParen);
				setState(756);
				thetypeid();
				setState(757);
				match(RightParen);
				setState(759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(758);
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
			setState(763);
			match(LeftParen);
			setState(764);
			expressionlist();
			setState(765);
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
			setState(767);
			typespecifierseq();
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(768);
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
			setState(776);
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
				setState(771);
				ptroperator();
				setState(773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(772);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
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
			setState(779);
			match(LeftBracket);
			setState(780);
			expression(0);
			setState(781);
			match(RightBracket);
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(782);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(794);
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
					setState(785);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(786);
					match(LeftBracket);
					setState(787);
					constantexpression();
					setState(788);
					match(RightBracket);
					setState(790);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(789);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(796);
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
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				match(LeftParen);
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(798);
					expressionlist();
					}
				}

				setState(801);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
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
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(805);
					match(Doublecolon);
					}
				}

				setState(808);
				match(Delete);
				setState(809);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(810);
					match(Doublecolon);
					}
				}

				setState(813);
				match(Delete);
				setState(814);
				match(LeftBracket);
				setState(815);
				match(RightBracket);
				setState(816);
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
			setState(819);
			match(Noexcept);
			setState(820);
			match(LeftParen);
			setState(821);
			expression(0);
			setState(822);
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
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				realcastexpression();
				setState(826);
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
			setState(830);
			match(LeftParen);
			setState(831);
			thetypeid();
			setState(832);
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
			setState(835);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(845);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(843);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(837);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(838);
						match(DotStar);
						setState(839);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(840);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(841);
						match(ArrowStar);
						setState(842);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(847);
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
			setState(849);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(860);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(851);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(852);
						match(Star);
						setState(853);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(854);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(855);
						match(Div);
						setState(856);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(857);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(858);
						match(Mod);
						setState(859);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(864);
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
			setState(866);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(874);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(868);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(869);
						match(Plus);
						setState(870);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(871);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(872);
						match(Minus);
						setState(873);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(878);
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
			setState(880);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(888);
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
					setState(882);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(883);
					shiftoperator();
					setState(884);
					additiveexpression(0);
					}
					} 
				}
				setState(890);
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
			setState(891);
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
			setState(894);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(908);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(896);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(897);
						match(Less);
						setState(898);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(899);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(900);
						match(Greater);
						setState(901);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(902);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(903);
						match(LessEqual);
						setState(904);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(905);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(906);
						match(GreaterEqual);
						setState(907);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(912);
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
			setState(914);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(922);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(916);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(917);
						match(Equal);
						setState(918);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(919);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(920);
						match(NotEqual);
						setState(921);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(926);
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
			setState(928);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(935);
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
					setState(930);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(931);
					match(And);
					setState(932);
					equalityexpression(0);
					}
					} 
				}
				setState(937);
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
			setState(939);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(946);
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
					setState(941);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(942);
					match(Caret);
					setState(943);
					andexpression(0);
					}
					} 
				}
				setState(948);
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
			setState(950);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(957);
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
					setState(952);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(953);
					match(Or);
					setState(954);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(959);
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
			setState(961);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(969);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(963);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(964);
						match(T__2);
						setState(965);
						inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(966);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(967);
						match(T__3);
						setState(968);
						inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(973);
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
			setState(975);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(983);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(977);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(978);
						match(T__4);
						setState(979);
						logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(980);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(981);
						match(T__5);
						setState(982);
						logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(987);
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
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				logicalorexpression(0);
				setState(990);
				match(Question);
				setState(991);
				expression(0);
				setState(992);
				match(Colon);
				setState(993);
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
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				logicalorexpression(0);
				setState(999);
				assignmentoperator();
				setState(1000);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1002);
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
			setState(1005);
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
			setState(1008);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1015);
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
					setState(1010);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1011);
					match(Comma);
					setState(1012);
					assignmentexpression();
					}
					} 
				}
				setState(1017);
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
			setState(1018);
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
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(1021);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1024);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1025);
					attributespecifierseq(0);
					}
				}

				setState(1028);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1029);
					attributespecifierseq(0);
					}
				}

				setState(1032);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1033);
					attributespecifierseq(0);
					}
				}

				setState(1036);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1037);
					attributespecifierseq(0);
					}
				}

				setState(1040);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1041);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1042);
					attributespecifierseq(0);
					}
				}

				setState(1045);
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
		enterRule(_localctx, 100, RULE_labeledstatement);
		int _la;
		try {
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1048);
					attributespecifierseq(0);
					}
				}

				setState(1051);
				match(Identifier);
				setState(1052);
				match(Colon);
				setState(1053);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1054);
					attributespecifierseq(0);
					}
				}

				setState(1057);
				caseexpression();
				setState(1058);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1060);
					attributespecifierseq(0);
					}
				}

				setState(1063);
				match(Default);
				setState(1064);
				match(Colon);
				setState(1065);
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
		enterRule(_localctx, 102, RULE_caseexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			match(Case);
			setState(1069);
			constantexpression();
			setState(1070);
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
		enterRule(_localctx, 104, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
				{
				setState(1072);
				expression(0);
				}
			}

			setState(1075);
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
		enterRule(_localctx, 106, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(LeftBrace);
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Semi - 130)) | (1L << (Ellipsis - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
				{
				setState(1078);
				statementseq(0);
				}
			}

			setState(1081);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1084);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1090);
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
					setState(1086);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1087);
					statement();
					}
					} 
				}
				setState(1092);
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
		enterRule(_localctx, 110, RULE_selectionstatement);
		try {
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				ifexpression();
				setState(1094);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				ifexpression();
				setState(1097);
				statement();
				setState(1098);
				match(Else);
				setState(1099);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1101);
				switchexpression();
				setState(1102);
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
		enterRule(_localctx, 112, RULE_ifexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(If);
			setState(1107);
			match(LeftParen);
			setState(1108);
			condition();
			setState(1109);
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
		enterRule(_localctx, 114, RULE_switchexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(Switch);
			setState(1112);
			match(LeftParen);
			setState(1113);
			condition();
			setState(1114);
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
		enterRule(_localctx, 116, RULE_condition);
		int _la;
		try {
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1117);
					attributespecifierseq(0);
					}
				}

				setState(1120);
				declspecifierseq();
				setState(1121);
				declarator();
				setState(1122);
				match(Assign);
				setState(1123);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1125);
					attributespecifierseq(0);
					}
				}

				setState(1128);
				declspecifierseq();
				setState(1129);
				declarator();
				setState(1130);
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
		enterRule(_localctx, 118, RULE_iterationstatement);
		try {
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				whileexpression();
				setState(1135);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				dostatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1138);
				enhancedforexpression();
				setState(1139);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1141);
				basicforexpression();
				setState(1142);
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
		enterRule(_localctx, 120, RULE_dostatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(Do);
			setState(1147);
			statement();
			setState(1148);
			whileexpression();
			setState(1149);
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
		enterRule(_localctx, 122, RULE_whileexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(While);
			setState(1152);
			match(LeftParen);
			setState(1153);
			condition();
			setState(1154);
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
		enterRule(_localctx, 124, RULE_basicforexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(For);
			setState(1157);
			match(LeftParen);
			setState(1158);
			forinitstatement();
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
				{
				setState(1159);
				condition();
				}
			}

			setState(1162);
			match(Semi);
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
				{
				setState(1163);
				expression(0);
				}
			}

			setState(1166);
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
		enterRule(_localctx, 126, RULE_enhancedforexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(For);
			setState(1169);
			match(LeftParen);
			setState(1170);
			forrangedeclaration();
			setState(1171);
			match(Colon);
			setState(1172);
			forrangeinitializer();
			setState(1173);
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
		enterRule(_localctx, 128, RULE_forinitstatement);
		try {
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1176);
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
		enterRule(_localctx, 130, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1179);
				attributespecifierseq(0);
				}
			}

			setState(1182);
			declspecifierseq();
			setState(1183);
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
		enterRule(_localctx, 132, RULE_forrangeinitializer);
		try {
			setState(1187);
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
				setState(1185);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
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
		enterRule(_localctx, 134, RULE_jumpstatement);
		try {
			setState(1195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				breakstatement();
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				continuestatement();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(1191);
				returnstatement();
				}
				break;
			case Goto:
				enterOuterAlt(_localctx, 4);
				{
				setState(1192);
				match(Goto);
				setState(1193);
				match(Identifier);
				setState(1194);
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
		enterRule(_localctx, 136, RULE_breakstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(Break);
			setState(1198);
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
		enterRule(_localctx, 138, RULE_continuestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(Continue);
			setState(1201);
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
		enterRule(_localctx, 140, RULE_returnstatement);
		int _la;
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				match(Return);
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(1204);
					expression(0);
					}
				}

				setState(1207);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				match(Return);
				setState(1209);
				bracedinitlist();
				setState(1210);
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
		enterRule(_localctx, 142, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
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
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1217);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1219);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1220);
					declaration();
					}
					} 
				}
				setState(1225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
		enterRule(_localctx, 146, RULE_declaration);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1228);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1229);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1230);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1231);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1232);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1233);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1234);
				attributedeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1235);
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
		enterRule(_localctx, 148, RULE_includedeclaration);
		int _la;
		try {
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				match(T__6);
				setState(1239);
				match(Less);
				setState(1240);
				match(Identifier);
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Dot) {
					{
					setState(1241);
					match(Dot);
					setState(1242);
					match(Identifier);
					}
				}

				setState(1245);
				match(Greater);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				match(T__6);
				setState(1247);
				match(T__7);
				setState(1248);
				match(Identifier);
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Dot) {
					{
					setState(1249);
					match(Dot);
					setState(1250);
					match(Identifier);
					}
				}

				setState(1253);
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
		enterRule(_localctx, 150, RULE_blockdeclaration);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1258);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1259);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1260);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1261);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1262);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1263);
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
		enterRule(_localctx, 152, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(Using);
			setState(1267);
			match(Identifier);
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1268);
				attributespecifierseq(0);
				}
			}

			setState(1271);
			match(Assign);
			setState(1272);
			thetypeid();
			setState(1273);
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
		enterRule(_localctx, 154, RULE_simpledeclaration);
		int _la;
		try {
			setState(1289);
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
				setState(1276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1275);
					declspecifierseq();
					}
					break;
				}
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LeftParen - 86)) | (1L << (Star - 86)) | (1L << (And - 86)) | (1L << (Tilde - 86)) | (1L << (Doublecolon - 86)) | (1L << (Ellipsis - 86)) | (1L << (Identifier - 86)))) != 0)) {
					{
					setState(1278);
					initdeclaratorlist(0);
					}
				}

				setState(1281);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				attributespecifierseq(0);
				setState(1284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1283);
					declspecifierseq();
					}
					break;
				}
				setState(1286);
				initdeclaratorlist(0);
				setState(1287);
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
		enterRule(_localctx, 156, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			match(Static_assert);
			setState(1292);
			match(LeftParen);
			setState(1293);
			constantexpression();
			setState(1294);
			match(Comma);
			setState(1295);
			match(Stringliteral);
			setState(1296);
			match(RightParen);
			setState(1297);
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
		enterRule(_localctx, 158, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
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
		enterRule(_localctx, 160, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			attributespecifierseq(0);
			setState(1302);
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
		enterRule(_localctx, 162, RULE_declspecifier);
		try {
			setState(1310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
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
				setState(1305);
				typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1306);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1307);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1308);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1309);
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
		enterRule(_localctx, 164, RULE_declspecifierseq);
		try {
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312);
				declspecifier();
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1313);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				declspecifier();
				setState(1317);
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
		enterRule(_localctx, 166, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
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
		enterRule(_localctx, 168, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
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
		enterRule(_localctx, 170, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
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
		enterRule(_localctx, 172, RULE_typespecifier);
		try {
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1329);
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
		enterRule(_localctx, 174, RULE_trailingtypespecifier);
		try {
			setState(1336);
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
				setState(1332);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				elaboratedtypespecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1334);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1335);
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
		enterRule(_localctx, 176, RULE_typespecifierseq);
		try {
			setState(1345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				typespecifier();
				setState(1340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1339);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				typespecifier();
				setState(1343);
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
		enterRule(_localctx, 178, RULE_trailingtypespecifierseq);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1347);
				trailingtypespecifier();
				setState(1349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1348);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351);
				trailingtypespecifier();
				setState(1352);
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
		enterRule(_localctx, 180, RULE_simpletypespecifier);
		try {
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1356);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1359);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				nestednamespecifier(0);
				setState(1361);
				match(Template);
				setState(1362);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1364);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1365);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1366);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1367);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1368);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1369);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1370);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1371);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1372);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1373);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1374);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1375);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1376);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1377);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1378);
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
		enterRule(_localctx, 182, RULE_thetypename);
		try {
			setState(1385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1383);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1384);
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
		enterRule(_localctx, 184, RULE_decltypespecifier);
		try {
			setState(1396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				match(Decltype);
				setState(1388);
				match(LeftParen);
				setState(1389);
				expression(0);
				setState(1390);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1392);
				match(Decltype);
				setState(1393);
				match(LeftParen);
				setState(1394);
				match(Auto);
				setState(1395);
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
		enterRule(_localctx, 186, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1398);
				classkey();
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1399);
					attributespecifierseq(0);
					}
				}

				setState(1403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1402);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1405);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1407);
				classkey();
				setState(1408);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1410);
				classkey();
				setState(1411);
				nestednamespecifier(0);
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1412);
					match(Template);
					}
				}

				setState(1415);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1417);
				match(Enum);
				setState(1419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1418);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1421);
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
		enterRule(_localctx, 188, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
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
		enterRule(_localctx, 190, RULE_enumspecifier);
		int _la;
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				enumhead();
				setState(1427);
				match(LeftBrace);
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1428);
					enumeratorlist(0);
					}
				}

				setState(1431);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433);
				enumhead();
				setState(1434);
				match(LeftBrace);
				setState(1435);
				enumeratorlist(0);
				setState(1436);
				match(Comma);
				setState(1437);
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
		enterRule(_localctx, 192, RULE_enumhead);
		int _la;
		try {
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1441);
				enumkey();
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1442);
					attributespecifierseq(0);
					}
				}

				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1445);
					match(Identifier);
					}
				}

				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1448);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1451);
				enumkey();
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1452);
					attributespecifierseq(0);
					}
				}

				setState(1455);
				nestednamespecifier(0);
				setState(1456);
				match(Identifier);
				setState(1458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1457);
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
		enterRule(_localctx, 194, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			enumkey();
			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1463);
				attributespecifierseq(0);
				}
			}

			setState(1466);
			match(Identifier);
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1467);
				enumbase();
				}
			}

			setState(1470);
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
		enterRule(_localctx, 196, RULE_enumkey);
		try {
			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				match(Enum);
				setState(1474);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1475);
				match(Enum);
				setState(1476);
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
		enterRule(_localctx, 198, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			match(Colon);
			setState(1480);
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
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1483);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1485);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1486);
					match(Comma);
					setState(1487);
					enumeratordefinition();
					}
					} 
				}
				setState(1492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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
		enterRule(_localctx, 202, RULE_enumeratordefinition);
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				enumerator();
				setState(1495);
				match(Assign);
				setState(1496);
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
		enterRule(_localctx, 204, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
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
		enterRule(_localctx, 206, RULE_namespacename);
		try {
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1502);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
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
		enterRule(_localctx, 208, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
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
		enterRule(_localctx, 210, RULE_namespacedefinition);
		try {
			setState(1510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1508);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1509);
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
		enterRule(_localctx, 212, RULE_namednamespacedefinition);
		try {
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
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
		enterRule(_localctx, 214, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1516);
				match(Inline);
				}
			}

			setState(1519);
			match(Namespace);
			setState(1520);
			match(Identifier);
			setState(1521);
			match(LeftBrace);
			setState(1522);
			namespacebody();
			setState(1523);
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
		enterRule(_localctx, 216, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1525);
				match(Inline);
				}
			}

			setState(1528);
			match(Namespace);
			setState(1529);
			originalnamespacename();
			setState(1530);
			match(LeftBrace);
			setState(1531);
			namespacebody();
			setState(1532);
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
		enterRule(_localctx, 218, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1534);
				match(Inline);
				}
			}

			setState(1537);
			match(Namespace);
			setState(1538);
			match(LeftBrace);
			setState(1539);
			namespacebody();
			setState(1540);
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
		enterRule(_localctx, 220, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Semi - 130)) | (1L << (Ellipsis - 130)) | (1L << (Identifier - 130)))) != 0)) {
				{
				setState(1542);
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
		enterRule(_localctx, 222, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
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
		enterRule(_localctx, 224, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			match(Namespace);
			setState(1548);
			match(Identifier);
			setState(1549);
			match(Assign);
			setState(1550);
			qualifiednamespacespecifier();
			setState(1551);
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
		enterRule(_localctx, 226, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1553);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1556);
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
		enterRule(_localctx, 228, RULE_usingdeclaration);
		int _la;
		try {
			setState(1571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				match(Using);
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1559);
					match(Typename_);
					}
				}

				setState(1562);
				nestednamespecifier(0);
				setState(1563);
				unqualifiedid();
				setState(1564);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				match(Using);
				setState(1567);
				match(Doublecolon);
				setState(1568);
				unqualifiedid();
				setState(1569);
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
		enterRule(_localctx, 230, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1573);
				attributespecifierseq(0);
				}
			}

			setState(1576);
			match(Using);
			setState(1577);
			match(Namespace);
			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1578);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1581);
			namespacename();
			setState(1582);
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
		enterRule(_localctx, 232, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			match(Asm);
			setState(1585);
			match(LeftParen);
			setState(1586);
			match(Stringliteral);
			setState(1587);
			match(RightParen);
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
		enterRule(_localctx, 234, RULE_linkagespecification);
		int _la;
		try {
			setState(1600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				match(Extern);
				setState(1591);
				match(Stringliteral);
				setState(1592);
				match(LeftBrace);
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Semi - 130)) | (1L << (Ellipsis - 130)) | (1L << (Identifier - 130)))) != 0)) {
					{
					setState(1593);
					declarationseq(0);
					}
				}

				setState(1596);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1597);
				match(Extern);
				setState(1598);
				match(Stringliteral);
				setState(1599);
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
		int _startState = 236;
		enterRecursionRule(_localctx, 236, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1603);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1605);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1606);
					attributespecifier();
					}
					} 
				}
				setState(1611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
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
		enterRule(_localctx, 238, RULE_attributespecifier);
		try {
			setState(1619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				match(LeftBracket);
				setState(1613);
				match(LeftBracket);
				setState(1614);
				attributelist(0);
				setState(1615);
				match(RightBracket);
				setState(1616);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
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
		enterRule(_localctx, 240, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1621);
				match(Alignas);
				setState(1622);
				match(LeftParen);
				setState(1623);
				thetypeid();
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1624);
					match(Ellipsis);
					}
				}

				setState(1627);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1629);
				match(Alignas);
				setState(1630);
				match(LeftParen);
				setState(1631);
				constantexpression();
				setState(1633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1632);
					match(Ellipsis);
					}
				}

				setState(1635);
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
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1640);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1643);
				attribute();
				setState(1644);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1658);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1648);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1649);
						match(Comma);
						setState(1651);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
						case 1:
							{
							setState(1650);
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
						setState(1653);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1654);
						match(Comma);
						setState(1655);
						attribute();
						setState(1656);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1662);
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
		enterRule(_localctx, 244, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			attributetoken();
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1664);
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
		enterRule(_localctx, 246, RULE_attributetoken);
		try {
			setState(1669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1667);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1668);
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
		enterRule(_localctx, 248, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			attributenamespace();
			setState(1672);
			match(Doublecolon);
			setState(1673);
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
		enterRule(_localctx, 250, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
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
		enterRule(_localctx, 252, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			match(LeftParen);
			setState(1678);
			balancedtokenseq(0);
			setState(1679);
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
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1682);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1685);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1686);
					balancedtoken();
					}
					} 
				}
				setState(1691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
		enterRule(_localctx, 256, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1692);
				match(LeftParen);
				setState(1693);
				balancedtokenseq(0);
				setState(1694);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				match(LeftBracket);
				setState(1697);
				balancedtokenseq(0);
				setState(1698);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1700);
				match(LeftBrace);
				setState(1701);
				balancedtokenseq(0);
				setState(1702);
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
				setState(1705); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1704);
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
					setState(1707); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
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
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1712);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1714);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1715);
					match(Comma);
					setState(1716);
					initdeclarator();
					}
					} 
				}
				setState(1721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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
		enterRule(_localctx, 260, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			declarator();
			setState(1724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1723);
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
		enterRule(_localctx, 262, RULE_declarator);
		try {
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1726);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1727);
				noptrdeclarator(0);
				setState(1728);
				parametersandqualifiers();
				setState(1729);
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
		enterRule(_localctx, 264, RULE_ptrdeclarator);
		try {
			setState(1737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1733);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1734);
				ptroperator();
				setState(1735);
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
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1740);
				declaratorid();
				setState(1742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1741);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1744);
				match(LeftParen);
				setState(1745);
				ptrdeclarator();
				setState(1746);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1761);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1750);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1751);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1752);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1753);
						match(LeftBracket);
						setState(1755);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(1754);
							constantexpression();
							}
						}

						setState(1757);
						match(RightBracket);
						setState(1759);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
						case 1:
							{
							setState(1758);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1765);
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
		enterRule(_localctx, 268, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			match(LeftParen);
			setState(1767);
			parameterdeclarationclause();
			setState(1768);
			match(RightParen);
			setState(1770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1769);
				cvqualifierseq();
				}
				break;
			}
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1772);
				refqualifier();
				}
				break;
			}
			setState(1776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1775);
				exceptionspecification();
				}
				break;
			}
			setState(1779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1778);
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
		enterRule(_localctx, 270, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			match(Arrow);
			setState(1782);
			trailingtypespecifierseq();
			setState(1784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1783);
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
		enterRule(_localctx, 272, RULE_ptroperator);
		try {
			setState(1809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1786);
				match(Star);
				setState(1788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1787);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1790);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793);
				match(And);
				setState(1795);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1794);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1797);
				match(T__2);
				setState(1799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1798);
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
				setState(1801);
				nestednamespecifier(0);
				setState(1802);
				match(Star);
				setState(1804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1803);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1806);
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
		enterRule(_localctx, 274, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			cvqualifier();
			setState(1813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1812);
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
		enterRule(_localctx, 276, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
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
		enterRule(_localctx, 278, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
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
		enterRule(_localctx, 280, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1819);
				match(Ellipsis);
				}
			}

			setState(1822);
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
		enterRule(_localctx, 282, RULE_thetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			typespecifierseq();
			setState(1826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1825);
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
		enterRule(_localctx, 284, RULE_abstractdeclarator);
		try {
			setState(1836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1828);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1830);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1829);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1832);
				parametersandqualifiers();
				setState(1833);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1835);
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
		enterRule(_localctx, 286, RULE_ptrabstractdeclarator);
		try {
			setState(1843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
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
				setState(1839);
				ptroperator();
				setState(1841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1840);
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
		int _startState = 288;
		enterRecursionRule(_localctx, 288, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1846);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1847);
				match(LeftBracket);
				setState(1849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(1848);
					constantexpression();
					}
				}

				setState(1851);
				match(RightBracket);
				setState(1853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1852);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1855);
				match(LeftParen);
				setState(1856);
				ptrabstractdeclarator();
				setState(1857);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1874);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1872);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1861);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1862);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1863);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1864);
						match(LeftBracket);
						setState(1866);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(1865);
							constantexpression();
							}
						}

						setState(1868);
						match(RightBracket);
						setState(1870);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
						case 1:
							{
							setState(1869);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
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
		enterRule(_localctx, 290, RULE_abstractpackdeclarator);
		try {
			setState(1881);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1877);
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
				setState(1878);
				ptroperator();
				setState(1879);
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
		int _startState = 292;
		enterRecursionRule(_localctx, 292, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1884);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1899);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1897);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1886);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1887);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1888);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1889);
						match(LeftBracket);
						setState(1891);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
							{
							setState(1890);
							constantexpression();
							}
						}

						setState(1893);
						match(RightBracket);
						setState(1895);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
						case 1:
							{
							setState(1894);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
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
		enterRule(_localctx, 294, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (Alignas - 11)) | (1L << (Auto - 11)) | (1L << (Bool - 11)) | (1L << (Char - 11)) | (1L << (Char16 - 11)) | (1L << (Char32 - 11)) | (1L << (Class - 11)) | (1L << (Const - 11)) | (1L << (Constexpr - 11)) | (1L << (Decltype - 11)) | (1L << (Double - 11)) | (1L << (Enum - 11)) | (1L << (Explicit - 11)) | (1L << (Extern - 11)) | (1L << (Float - 11)) | (1L << (Friend - 11)) | (1L << (Inline - 11)) | (1L << (Int - 11)) | (1L << (Long - 11)) | (1L << (Mutable - 11)) | (1L << (Register - 11)) | (1L << (Short - 11)) | (1L << (Signed - 11)) | (1L << (Static - 11)) | (1L << (Struct - 11)) | (1L << (Thread_local - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Typedef - 75)) | (1L << (Typename_ - 75)) | (1L << (Union - 75)) | (1L << (Unsigned - 75)) | (1L << (Virtual - 75)) | (1L << (Void - 75)) | (1L << (Volatile - 75)) | (1L << (Wchar - 75)) | (1L << (LeftBracket - 75)) | (1L << (Doublecolon - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(1902);
					parameterdeclarationlist(0);
					}
				}

				setState(1906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1905);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1908);
				parameterdeclarationlist(0);
				setState(1909);
				match(Comma);
				setState(1910);
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
		int _startState = 296;
		enterRecursionRule(_localctx, 296, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1915);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1917);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1918);
					match(Comma);
					setState(1919);
					parameterdeclaration();
					}
					} 
				}
				setState(1924);
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
		enterRule(_localctx, 298, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1925);
					attributespecifierseq(0);
					}
				}

				setState(1928);
				declspecifierseq();
				setState(1929);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1931);
					attributespecifierseq(0);
					}
				}

				setState(1934);
				declspecifierseq();
				setState(1935);
				declarator();
				setState(1936);
				match(Assign);
				setState(1937);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1939);
					attributespecifierseq(0);
					}
				}

				setState(1942);
				declspecifierseq();
				setState(1944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1943);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1946);
					attributespecifierseq(0);
					}
				}

				setState(1949);
				declspecifierseq();
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==Decltype || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LeftParen - 86)) | (1L << (LeftBracket - 86)) | (1L << (Star - 86)) | (1L << (And - 86)) | (1L << (Doublecolon - 86)) | (1L << (Ellipsis - 86)) | (1L << (Identifier - 86)))) != 0)) {
					{
					setState(1950);
					abstractdeclarator();
					}
				}

				setState(1953);
				match(Assign);
				setState(1954);
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
		enterRule(_localctx, 300, RULE_functiondefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			functionhead();
			setState(1959);
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
		enterRule(_localctx, 302, RULE_functionhead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1961);
				attributespecifierseq(0);
				}
			}

			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1964);
				declspecifierseq();
				}
				break;
			}
			setState(1967);
			declarator();
			setState(1969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1968);
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
		enterRule(_localctx, 304, RULE_functionbody);
		int _la;
		try {
			setState(1982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1971);
					ctorinitializer();
					}
				}

				setState(1974);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1976);
				match(Assign);
				setState(1977);
				match(Default);
				setState(1978);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1979);
				match(Assign);
				setState(1980);
				match(Delete);
				setState(1981);
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
		enterRule(_localctx, 306, RULE_initializer);
		try {
			setState(1989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				match(LeftParen);
				setState(1986);
				expressionlist();
				setState(1987);
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
		enterRule(_localctx, 308, RULE_braceorequalinitializer);
		try {
			setState(1994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1991);
				match(Assign);
				setState(1992);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1993);
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
		enterRule(_localctx, 310, RULE_initializerclause);
		try {
			setState(1998);
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
				setState(1996);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1997);
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
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2001);
			initializerclause();
			setState(2003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(2002);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(2005);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2006);
					match(Comma);
					setState(2007);
					initializerclause();
					setState(2009);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
					case 1:
						{
						setState(2008);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
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
		enterRule(_localctx, 314, RULE_bracedinitlist);
		int _la;
		try {
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2016);
				match(LeftBrace);
				setState(2017);
				initializerlist(0);
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2018);
					match(Comma);
					}
				}

				setState(2021);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2023);
				match(LeftBrace);
				setState(2024);
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
		enterRule(_localctx, 316, RULE_classname);
		try {
			setState(2029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2027);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2028);
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
		enterRule(_localctx, 318, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			classhead();
			setState(2032);
			match(LeftBrace);
			setState(2034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Colon - 129)) | (1L << (Doublecolon - 129)) | (1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(2033);
				memberspecification();
				}
			}

			setState(2036);
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
		enterRule(_localctx, 320, RULE_classhead);
		int _la;
		try {
			setState(2056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2038);
				classkey();
				setState(2040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2039);
					attributespecifierseq(0);
					}
				}

				setState(2042);
				classheadname();
				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2043);
					classvirtspecifier();
					}
				}

				setState(2047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2046);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2049);
				classkey();
				setState(2051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2050);
					attributespecifierseq(0);
					}
				}

				setState(2054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2053);
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
		enterRule(_localctx, 322, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2058);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2061);
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
		enterRule(_localctx, 324, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
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
		enterRule(_localctx, 326, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
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
		enterRule(_localctx, 328, RULE_memberspecification);
		int _la;
		try {
			setState(2076);
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
				setState(2067);
				memberdeclaration();
				setState(2069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Colon - 129)) | (1L << (Doublecolon - 129)) | (1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(2068);
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
				setState(2071);
				accessspecifier();
				setState(2072);
				match(Colon);
				setState(2074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Colon - 129)) | (1L << (Doublecolon - 129)) | (1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(2073);
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
		enterRule(_localctx, 330, RULE_memberdeclaration);
		int _la;
		try {
			setState(2094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2079);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(2078);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2081);
					declspecifierseq();
					}
					break;
				}
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LeftParen - 86)) | (1L << (LeftBracket - 86)) | (1L << (Star - 86)) | (1L << (And - 86)) | (1L << (Tilde - 86)) | (1L << (Colon - 86)) | (1L << (Doublecolon - 86)) | (1L << (Ellipsis - 86)) | (1L << (Identifier - 86)))) != 0)) {
					{
					setState(2084);
					memberdeclaratorlist(0);
					}
				}

				setState(2087);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2088);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2089);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2090);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2091);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2092);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2093);
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
		int _startState = 332;
		enterRecursionRule(_localctx, 332, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2097);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2099);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2100);
					match(Comma);
					setState(2101);
					memberdeclarator();
					}
					} 
				}
				setState(2106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
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
		enterRule(_localctx, 334, RULE_memberdeclarator);
		int _la;
		try {
			setState(2126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2107);
				declarator();
				setState(2109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2108);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2111);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2114);
				declarator();
				setState(2116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2115);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2118);
					match(Identifier);
					}
				}

				setState(2122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2121);
					attributespecifierseq(0);
					}
				}

				setState(2124);
				match(Colon);
				setState(2125);
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
		int _startState = 336;
		enterRecursionRule(_localctx, 336, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2129);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2131);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2132);
					virtspecifier();
					}
					} 
				}
				setState(2137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
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
		enterRule(_localctx, 338, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
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
		enterRule(_localctx, 340, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
			match(Assign);
			setState(2141);
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
		enterRule(_localctx, 342, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144);
			match(Colon);
			setState(2145);
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
		int _startState = 344;
		enterRecursionRule(_localctx, 344, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2148);
			basespecifier();
			setState(2150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2149);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2152);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2153);
					match(Comma);
					setState(2154);
					basespecifier();
					setState(2156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
					case 1:
						{
						setState(2155);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
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
		enterRule(_localctx, 346, RULE_basespecifier);
		int _la;
		try {
			setState(2184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2163);
					attributespecifierseq(0);
					}
				}

				setState(2166);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2167);
					attributespecifierseq(0);
					}
				}

				setState(2170);
				match(Virtual);
				setState(2172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2171);
					accessspecifier();
					}
				}

				setState(2174);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2175);
					attributespecifierseq(0);
					}
				}

				setState(2178);
				accessspecifier();
				setState(2180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2179);
					match(Virtual);
					}
				}

				setState(2182);
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
		enterRule(_localctx, 348, RULE_classordecltype);
		try {
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2186);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2189);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2190);
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
		enterRule(_localctx, 350, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
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
		enterRule(_localctx, 352, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
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
		enterRule(_localctx, 354, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			match(Operator);
			setState(2198);
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
		enterRule(_localctx, 356, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			typespecifierseq();
			setState(2202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2201);
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
		enterRule(_localctx, 358, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			ptroperator();
			setState(2206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2205);
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
		enterRule(_localctx, 360, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			match(Colon);
			setState(2209);
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
		enterRule(_localctx, 362, RULE_meminitializerlist);
		int _la;
		try {
			setState(2222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2211);
				meminitializer();
				setState(2213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2212);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2215);
				meminitializer();
				setState(2217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2216);
					match(Ellipsis);
					}
				}

				setState(2219);
				match(Comma);
				setState(2220);
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
		enterRule(_localctx, 364, RULE_meminitializer);
		int _la;
		try {
			setState(2234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2224);
				meminitializerid();
				setState(2225);
				match(LeftParen);
				setState(2227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(2226);
					expressionlist();
					}
				}

				setState(2229);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2231);
				meminitializerid();
				setState(2232);
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
		enterRule(_localctx, 366, RULE_meminitializerid);
		try {
			setState(2238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2236);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2237);
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
		enterRule(_localctx, 368, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			match(Operator);
			setState(2241);
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
		enterRule(_localctx, 370, RULE_literaloperatorid);
		try {
			setState(2248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2243);
				match(Operator);
				setState(2244);
				match(Stringliteral);
				setState(2245);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2246);
				match(Operator);
				setState(2247);
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
		enterRule(_localctx, 372, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			match(Template);
			setState(2251);
			match(Less);
			setState(2252);
			templateparameterlist(0);
			setState(2253);
			match(Greater);
			setState(2254);
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
		int _startState = 374;
		enterRecursionRule(_localctx, 374, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2257);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2259);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2260);
					match(Comma);
					setState(2261);
					templateparameter();
					}
					} 
				}
				setState(2266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
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
		enterRule(_localctx, 376, RULE_templateparameter);
		try {
			setState(2269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2267);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2268);
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
		enterRule(_localctx, 378, RULE_typeparameter);
		int _la;
		try {
			setState(2319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2271);
				match(Class);
				setState(2273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2272);
					match(Ellipsis);
					}
					break;
				}
				setState(2276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2275);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2278);
				match(Class);
				setState(2280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2279);
					match(Identifier);
					}
				}

				setState(2282);
				match(Assign);
				setState(2283);
				thetypeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2284);
				match(Typename_);
				setState(2286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2285);
					match(Ellipsis);
					}
					break;
				}
				setState(2289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2288);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2291);
				match(Typename_);
				setState(2293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2292);
					match(Identifier);
					}
				}

				setState(2295);
				match(Assign);
				setState(2296);
				thetypeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2297);
				match(Template);
				setState(2298);
				match(Less);
				setState(2299);
				templateparameterlist(0);
				setState(2300);
				match(Greater);
				setState(2301);
				match(Class);
				setState(2303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2302);
					match(Ellipsis);
					}
					break;
				}
				setState(2306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2305);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2308);
				match(Template);
				setState(2309);
				match(Less);
				setState(2310);
				templateparameterlist(0);
				setState(2311);
				match(Greater);
				setState(2312);
				match(Class);
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2313);
					match(Identifier);
					}
				}

				setState(2316);
				match(Assign);
				setState(2317);
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
		enterRule(_localctx, 380, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2321);
			templatename();
			setState(2322);
			match(Less);
			setState(2324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (Struct - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
				{
				setState(2323);
				templateargumentlist(0);
				}
			}

			setState(2326);
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
		enterRule(_localctx, 382, RULE_templateid);
		int _la;
		try {
			setState(2343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2328);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2329);
				operatorfunctionid();
				setState(2330);
				match(Less);
				setState(2332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (Struct - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(2331);
					templateargumentlist(0);
					}
				}

				setState(2334);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2336);
				literaloperatorid();
				setState(2337);
				match(Less);
				setState(2339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (Struct - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Doublecolon - 130)) | (1L << (Identifier - 130)) | (1L << (Integerliteral - 130)) | (1L << (Characterliteral - 130)) | (1L << (Floatingliteral - 130)) | (1L << (Stringliteral - 130)) | (1L << (Userdefinedintegerliteral - 130)) | (1L << (Userdefinedfloatingliteral - 130)) | (1L << (Userdefinedstringliteral - 130)) | (1L << (Userdefinedcharacterliteral - 130)))) != 0)) {
					{
					setState(2338);
					templateargumentlist(0);
					}
				}

				setState(2341);
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
		enterRule(_localctx, 384, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
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
		int _startState = 386;
		enterRecursionRule(_localctx, 386, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2348);
			templateargument();
			setState(2350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2349);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2352);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2353);
					match(Comma);
					setState(2354);
					templateargument();
					setState(2356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
					case 1:
						{
						setState(2355);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
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
		enterRule(_localctx, 388, RULE_templateargument);
		try {
			setState(2366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2363);
				thetypeid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2364);
				constantexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2365);
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
		enterRule(_localctx, 390, RULE_typenamespecifier);
		int _la;
		try {
			setState(2379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2368);
				match(Typename_);
				setState(2369);
				nestednamespecifier(0);
				setState(2370);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2372);
				match(Typename_);
				setState(2373);
				nestednamespecifier(0);
				setState(2375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2374);
					match(Template);
					}
				}

				setState(2377);
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
		enterRule(_localctx, 392, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2381);
				match(Extern);
				}
			}

			setState(2384);
			match(Template);
			setState(2385);
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
		enterRule(_localctx, 394, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2387);
			match(Template);
			setState(2388);
			match(Less);
			setState(2389);
			match(Greater);
			setState(2390);
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
		enterRule(_localctx, 396, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
			tryblockexpression();
			setState(2393);
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
		enterRule(_localctx, 398, RULE_functiontryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
			functiontryblockexpression();
			setState(2396);
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
		enterRule(_localctx, 400, RULE_tryblockexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			match(Try);
			setState(2399);
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
		enterRule(_localctx, 402, RULE_functiontryblockexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2401);
			match(Try);
			setState(2403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2402);
				ctorinitializer();
				}
			}

			setState(2405);
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
		enterRule(_localctx, 404, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			handler();
			setState(2409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				{
				setState(2408);
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
		enterRule(_localctx, 406, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2411);
			catchexpression();
			setState(2412);
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
		enterRule(_localctx, 408, RULE_catchexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			match(Catch);
			setState(2415);
			match(LeftParen);
			setState(2416);
			exceptiondeclaration();
			setState(2417);
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
		enterRule(_localctx, 410, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2419);
					attributespecifierseq(0);
					}
				}

				setState(2422);
				typespecifierseq();
				setState(2423);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2425);
					attributespecifierseq(0);
					}
				}

				setState(2428);
				typespecifierseq();
				setState(2430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==Decltype || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (LeftParen - 86)) | (1L << (LeftBracket - 86)) | (1L << (Star - 86)) | (1L << (And - 86)) | (1L << (Doublecolon - 86)) | (1L << (Ellipsis - 86)) | (1L << (Identifier - 86)))) != 0)) {
					{
					setState(2429);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2432);
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
		enterRule(_localctx, 412, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2435);
			match(Throw);
			setState(2437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2436);
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
		enterRule(_localctx, 414, RULE_exceptionspecification);
		try {
			setState(2441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2439);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2440);
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
		enterRule(_localctx, 416, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2443);
			match(Throw);
			setState(2444);
			match(LeftParen);
			setState(2446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Auto - 14)) | (1L << (Bool - 14)) | (1L << (Char - 14)) | (1L << (Char16 - 14)) | (1L << (Char32 - 14)) | (1L << (Class - 14)) | (1L << (Const - 14)) | (1L << (Decltype - 14)) | (1L << (Double - 14)) | (1L << (Enum - 14)) | (1L << (Float - 14)) | (1L << (Int - 14)) | (1L << (Long - 14)) | (1L << (Short - 14)) | (1L << (Signed - 14)) | (1L << (Struct - 14)) | (1L << (Typename_ - 14)))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Union - 78)) | (1L << (Unsigned - 78)) | (1L << (Void - 78)) | (1L << (Volatile - 78)) | (1L << (Wchar - 78)) | (1L << (Doublecolon - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				setState(2445);
				typeidlist(0);
				}
			}

			setState(2448);
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
		int _startState = 418;
		enterRecursionRule(_localctx, 418, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2451);
			thetypeid();
			setState(2453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2452);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2455);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2456);
					match(Comma);
					setState(2457);
					thetypeid();
					setState(2459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
					case 1:
						{
						setState(2458);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
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
		enterRule(_localctx, 420, RULE_noexceptspecification);
		try {
			setState(2472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2466);
				match(Noexcept);
				setState(2467);
				match(LeftParen);
				setState(2468);
				constantexpression();
				setState(2469);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2471);
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
		enterRule(_localctx, 422, RULE_theoperator);
		try {
			setState(2525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2474);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2475);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2476);
				match(New);
				setState(2477);
				match(LeftBracket);
				setState(2478);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2479);
				match(Delete);
				setState(2480);
				match(LeftBracket);
				setState(2481);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2482);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2483);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2484);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2485);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2486);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2487);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2488);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2489);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2490);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2491);
				match(T__0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2492);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2493);
				match(Assign);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2494);
				match(Less);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2495);
				match(Greater);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2496);
				match(PlusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2497);
				match(MinusAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2498);
				match(StarAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2499);
				match(DivAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2500);
				match(ModAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2501);
				match(XorAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2502);
				match(AndAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2503);
				match(OrAssign);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2504);
				match(LeftShift);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2505);
				match(RightShift);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2506);
				match(RightShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2507);
				match(LeftShiftAssign);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2508);
				match(Equal);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2509);
				match(NotEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2510);
				match(LessEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2511);
				match(GreaterEqual);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2512);
				match(T__2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2513);
				match(T__3);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2514);
				match(T__4);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2515);
				match(T__5);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2516);
				match(PlusPlus);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2517);
				match(MinusMinus);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2518);
				match(Comma);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2519);
				match(ArrowStar);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2520);
				match(Arrow);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2521);
				match(LeftParen);
				setState(2522);
				match(RightParen);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2523);
				match(LeftBracket);
				setState(2524);
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
		enterRule(_localctx, 424, RULE_literal);
		try {
			setState(2534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2527);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2528);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2529);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2530);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2531);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2532);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2533);
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
		enterRule(_localctx, 426, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2536);
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
		enterRule(_localctx, 428, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
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
		enterRule(_localctx, 430, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540);
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
		case 54:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 72:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 100:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 118:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 121:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 127:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 129:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 133:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 144:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 146:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 148:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 156:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 166:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 168:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 172:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 187:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 193:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 209:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009a\u09f1\4\2\t"+
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
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\3\2\5\2\u01b4"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01c0\n\3\3\4\3\4\5\4"+
		"\u01c4\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01cf\n\5\3\6\3\6\5"+
		"\6\u01d3\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01e2"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u01e9\n\7\3\7\3\7\3\7\7\7\u01ee\n\7\f\7\16"+
		"\7\u01f1\13\7\3\b\3\b\5\b\u01f5\n\b\3\b\3\b\3\t\3\t\5\t\u01fb\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0205\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u020c"+
		"\n\f\3\f\3\f\3\f\3\f\5\f\u0212\n\f\7\f\u0214\n\f\f\f\16\f\u0217\13\f\3"+
		"\r\3\r\5\r\u021b\n\r\3\16\3\16\3\16\3\16\5\16\u0221\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0228\n\17\3\20\3\20\3\20\3\20\5\20\u022e\n\20\3\20\5"+
		"\20\u0231\n\20\3\20\5\20\u0234\n\20\3\20\5\20\u0237\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u023e\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0245\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0279\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0288\n\21\3\21"+
		"\3\21\3\21\3\21\5\21\u028e\n\21\3\21\3\21\3\21\3\21\5\21\u0294\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u02a1\n\21"+
		"\f\21\16\21\u02a4\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25\u02ad"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u02bc\n\25\3\25\3\25\3\25\3\25\5\25\u02c2\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u02e0\n\26"+
		"\3\27\3\27\3\30\5\30\u02e5\n\30\3\30\3\30\5\30\u02e9\n\30\3\30\3\30\5"+
		"\30\u02ed\n\30\3\30\5\30\u02f0\n\30\3\30\3\30\5\30\u02f4\n\30\3\30\3\30"+
		"\3\30\3\30\5\30\u02fa\n\30\5\30\u02fc\n\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\5\32\u0304\n\32\3\33\3\33\5\33\u0308\n\33\3\33\5\33\u030b\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0312\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u0319"+
		"\n\34\7\34\u031b\n\34\f\34\16\34\u031e\13\34\3\35\3\35\5\35\u0322\n\35"+
		"\3\35\3\35\5\35\u0326\n\35\3\36\5\36\u0329\n\36\3\36\3\36\3\36\5\36\u032e"+
		"\n\36\3\36\3\36\3\36\3\36\5\36\u0334\n\36\3\37\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \5 \u033f\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u034e\n\"\f\"\16\"\u0351\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\7#\u035f\n#\f#\16#\u0362\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u036d\n$"+
		"\f$\16$\u0370\13$\3%\3%\3%\3%\3%\3%\3%\7%\u0379\n%\f%\16%\u037c\13%\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u038f"+
		"\n\'\f\'\16\'\u0392\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u039d\n(\f(\16"+
		"(\u03a0\13(\3)\3)\3)\3)\3)\3)\7)\u03a8\n)\f)\16)\u03ab\13)\3*\3*\3*\3"+
		"*\3*\3*\7*\u03b3\n*\f*\16*\u03b6\13*\3+\3+\3+\3+\3+\3+\7+\u03be\n+\f+"+
		"\16+\u03c1\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u03cc\n,\f,\16,\u03cf\13"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u03da\n-\f-\16-\u03dd\13-\3.\3.\3.\3."+
		"\3.\3.\3.\5.\u03e6\n.\3/\3/\3/\3/\3/\3/\5/\u03ee\n/\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\7\61\u03f8\n\61\f\61\16\61\u03fb\13\61\3\62\3\62"+
		"\3\63\3\63\5\63\u0401\n\63\3\63\3\63\5\63\u0405\n\63\3\63\3\63\5\63\u0409"+
		"\n\63\3\63\3\63\5\63\u040d\n\63\3\63\3\63\5\63\u0411\n\63\3\63\3\63\3"+
		"\63\5\63\u0416\n\63\3\63\5\63\u0419\n\63\3\64\5\64\u041c\n\64\3\64\3\64"+
		"\3\64\3\64\5\64\u0422\n\64\3\64\3\64\3\64\3\64\5\64\u0428\n\64\3\64\3"+
		"\64\3\64\5\64\u042d\n\64\3\65\3\65\3\65\3\65\3\66\5\66\u0434\n\66\3\66"+
		"\3\66\3\67\3\67\5\67\u043a\n\67\3\67\3\67\38\38\38\38\38\78\u0443\n8\f"+
		"8\168\u0446\138\39\39\39\39\39\39\39\39\39\39\39\59\u0453\n9\3:\3:\3:"+
		"\3:\3:\3;\3;\3;\3;\3;\3<\3<\5<\u0461\n<\3<\3<\3<\3<\3<\3<\5<\u0469\n<"+
		"\3<\3<\3<\3<\5<\u046f\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u047b\n=\3>"+
		"\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\5@\u048b\n@\3@\3@\5@\u048f\n@"+
		"\3@\3@\3A\3A\3A\3A\3A\3A\3A\3B\3B\5B\u049c\nB\3C\5C\u049f\nC\3C\3C\3C"+
		"\3D\3D\5D\u04a6\nD\3E\3E\3E\3E\3E\3E\5E\u04ae\nE\3F\3F\3F\3G\3G\3G\3H"+
		"\3H\5H\u04b8\nH\3H\3H\3H\3H\3H\5H\u04bf\nH\3I\3I\3J\3J\3J\3J\3J\7J\u04c8"+
		"\nJ\fJ\16J\u04cb\13J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u04d7\nK\3L\3L\3"+
		"L\3L\3L\5L\u04de\nL\3L\3L\3L\3L\3L\3L\5L\u04e6\nL\3L\5L\u04e9\nL\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\5M\u04f3\nM\3N\3N\3N\5N\u04f8\nN\3N\3N\3N\3N\3O\5"+
		"O\u04ff\nO\3O\5O\u0502\nO\3O\3O\3O\5O\u0507\nO\3O\3O\3O\5O\u050c\nO\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3S\3S\5S\u0521\nS\3"+
		"T\3T\5T\u0525\nT\3T\3T\3T\5T\u052a\nT\3U\3U\3V\3V\3W\3W\3X\3X\3X\5X\u0535"+
		"\nX\3Y\3Y\3Y\3Y\5Y\u053b\nY\3Z\3Z\5Z\u053f\nZ\3Z\3Z\3Z\5Z\u0544\nZ\3["+
		"\3[\5[\u0548\n[\3[\3[\3[\5[\u054d\n[\3\\\5\\\u0550\n\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0566"+
		"\n\\\3]\3]\3]\3]\5]\u056c\n]\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0577\n^\3"+
		"_\3_\5_\u057b\n_\3_\5_\u057e\n_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0588\n_\3"+
		"_\3_\3_\3_\5_\u058e\n_\3_\5_\u0591\n_\3`\3`\3a\3a\3a\5a\u0598\na\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\5a\u05a2\na\3b\3b\5b\u05a6\nb\3b\5b\u05a9\nb\3b\5"+
		"b\u05ac\nb\3b\3b\5b\u05b0\nb\3b\3b\3b\5b\u05b5\nb\5b\u05b7\nb\3c\3c\5"+
		"c\u05bb\nc\3c\3c\5c\u05bf\nc\3c\3c\3d\3d\3d\3d\3d\5d\u05c8\nd\3e\3e\3"+
		"e\3f\3f\3f\3f\3f\3f\7f\u05d3\nf\ff\16f\u05d6\13f\3g\3g\3g\3g\3g\5g\u05dd"+
		"\ng\3h\3h\3i\3i\5i\u05e3\ni\3j\3j\3k\3k\5k\u05e9\nk\3l\3l\5l\u05ed\nl"+
		"\3m\5m\u05f0\nm\3m\3m\3m\3m\3m\3m\3n\5n\u05f9\nn\3n\3n\3n\3n\3n\3n\3o"+
		"\5o\u0602\no\3o\3o\3o\3o\3o\3p\5p\u060a\np\3q\3q\3r\3r\3r\3r\3r\3r\3s"+
		"\5s\u0615\ns\3s\3s\3t\3t\5t\u061b\nt\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u0626"+
		"\nt\3u\5u\u0629\nu\3u\3u\3u\5u\u062e\nu\3u\3u\3u\3v\3v\3v\3v\3v\3v\3w"+
		"\3w\3w\3w\5w\u063d\nw\3w\3w\3w\3w\5w\u0643\nw\3x\3x\3x\3x\3x\7x\u064a"+
		"\nx\fx\16x\u064d\13x\3y\3y\3y\3y\3y\3y\3y\5y\u0656\ny\3z\3z\3z\3z\5z\u065c"+
		"\nz\3z\3z\3z\3z\3z\3z\5z\u0664\nz\3z\3z\5z\u0668\nz\3{\3{\5{\u066c\n{"+
		"\3{\3{\3{\5{\u0671\n{\3{\3{\3{\5{\u0676\n{\3{\3{\3{\3{\3{\7{\u067d\n{"+
		"\f{\16{\u0680\13{\3|\3|\5|\u0684\n|\3}\3}\5}\u0688\n}\3~\3~\3~\3~\3\177"+
		"\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\5\u0081\u0696\n"+
		"\u0081\3\u0081\3\u0081\7\u0081\u069a\n\u0081\f\u0081\16\u0081\u069d\13"+
		"\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\6\u0082\u06ac\n\u0082\r\u0082"+
		"\16\u0082\u06ad\5\u0082\u06b0\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\7\u0083\u06b8\n\u0083\f\u0083\16\u0083\u06bb\13\u0083"+
		"\3\u0084\3\u0084\5\u0084\u06bf\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u06c6\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u06cc\n\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u06d1\n\u0087\3\u0087\3"+
		"\u0087\3\u0087\3\u0087\5\u0087\u06d7\n\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\5\u0087\u06de\n\u0087\3\u0087\3\u0087\5\u0087\u06e2\n\u0087"+
		"\7\u0087\u06e4\n\u0087\f\u0087\16\u0087\u06e7\13\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\5\u0088\u06ed\n\u0088\3\u0088\5\u0088\u06f0\n\u0088\3"+
		"\u0088\5\u0088\u06f3\n\u0088\3\u0088\5\u0088\u06f6\n\u0088\3\u0089\3\u0089"+
		"\3\u0089\5\u0089\u06fb\n\u0089\3\u008a\3\u008a\5\u008a\u06ff\n\u008a\3"+
		"\u008a\5\u008a\u0702\n\u008a\3\u008a\3\u008a\5\u008a\u0706\n\u008a\3\u008a"+
		"\3\u008a\5\u008a\u070a\n\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u070f\n"+
		"\u008a\3\u008a\5\u008a\u0712\n\u008a\5\u008a\u0714\n\u008a\3\u008b\3\u008b"+
		"\5\u008b\u0718\n\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\5\u008e"+
		"\u071f\n\u008e\3\u008e\3\u008e\3\u008f\3\u008f\5\u008f\u0725\n\u008f\3"+
		"\u0090\3\u0090\5\u0090\u0729\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5"+
		"\u0090\u072f\n\u0090\3\u0091\3\u0091\3\u0091\5\u0091\u0734\n\u0091\5\u0091"+
		"\u0736\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u073c\n\u0092\3"+
		"\u0092\3\u0092\5\u0092\u0740\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5"+
		"\u0092\u0746\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u074d"+
		"\n\u0092\3\u0092\3\u0092\5\u0092\u0751\n\u0092\7\u0092\u0753\n\u0092\f"+
		"\u0092\16\u0092\u0756\13\u0092\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093"+
		"\u075c\n\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u0766\n\u0094\3\u0094\3\u0094\5\u0094\u076a\n\u0094\7"+
		"\u0094\u076c\n\u0094\f\u0094\16\u0094\u076f\13\u0094\3\u0095\5\u0095\u0772"+
		"\n\u0095\3\u0095\5\u0095\u0775\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u077b\n\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\7\u0096\u0783\n\u0096\f\u0096\16\u0096\u0786\13\u0096\3\u0097\5\u0097"+
		"\u0789\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u078f\n\u0097\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0797\n\u0097\3"+
		"\u0097\3\u0097\5\u0097\u079b\n\u0097\3\u0097\5\u0097\u079e\n\u0097\3\u0097"+
		"\3\u0097\5\u0097\u07a2\n\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u07a7\n"+
		"\u0097\3\u0098\3\u0098\3\u0098\3\u0099\5\u0099\u07ad\n\u0099\3\u0099\5"+
		"\u0099\u07b0\n\u0099\3\u0099\3\u0099\5\u0099\u07b4\n\u0099\3\u009a\5\u009a"+
		"\u07b7\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\5\u009a\u07c1\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\5\u009b\u07c8\n\u009b\3\u009c\3\u009c\3\u009c\5\u009c\u07cd\n\u009c\3"+
		"\u009d\3\u009d\5\u009d\u07d1\n\u009d\3\u009e\3\u009e\3\u009e\5\u009e\u07d6"+
		"\n\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u07dc\n\u009e\7\u009e"+
		"\u07de\n\u009e\f\u009e\16\u009e\u07e1\13\u009e\3\u009f\3\u009f\3\u009f"+
		"\5\u009f\u07e6\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u07ec\n"+
		"\u009f\3\u00a0\3\u00a0\5\u00a0\u07f0\n\u00a0\3\u00a1\3\u00a1\3\u00a1\5"+
		"\u00a1\u07f5\n\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\5\u00a2\u07fb\n\u00a2"+
		"\3\u00a2\3\u00a2\5\u00a2\u07ff\n\u00a2\3\u00a2\5\u00a2\u0802\n\u00a2\3"+
		"\u00a2\3\u00a2\5\u00a2\u0806\n\u00a2\3\u00a2\5\u00a2\u0809\n\u00a2\5\u00a2"+
		"\u080b\n\u00a2\3\u00a3\5\u00a3\u080e\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3"+
		"\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\5\u00a6\u0818\n\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\5\u00a6\u081d\n\u00a6\5\u00a6\u081f\n\u00a6\3\u00a7\5\u00a7"+
		"\u0822\n\u00a7\3\u00a7\5\u00a7\u0825\n\u00a7\3\u00a7\5\u00a7\u0828\n\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0831"+
		"\n\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u0839"+
		"\n\u00a8\f\u00a8\16\u00a8\u083c\13\u00a8\3\u00a9\3\u00a9\5\u00a9\u0840"+
		"\n\u00a9\3\u00a9\5\u00a9\u0843\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u0847\n"+
		"\u00a9\3\u00a9\5\u00a9\u084a\n\u00a9\3\u00a9\5\u00a9\u084d\n\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u0851\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\7\u00aa\u0858\n\u00aa\f\u00aa\16\u00aa\u085b\13\u00aa\3\u00ab\3\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae"+
		"\3\u00ae\5\u00ae\u0869\n\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae"+
		"\u086f\n\u00ae\7\u00ae\u0871\n\u00ae\f\u00ae\16\u00ae\u0874\13\u00ae\3"+
		"\u00af\5\u00af\u0877\n\u00af\3\u00af\3\u00af\5\u00af\u087b\n\u00af\3\u00af"+
		"\3\u00af\5\u00af\u087f\n\u00af\3\u00af\3\u00af\5\u00af\u0883\n\u00af\3"+
		"\u00af\3\u00af\5\u00af\u0887\n\u00af\3\u00af\3\u00af\5\u00af\u088b\n\u00af"+
		"\3\u00b0\5\u00b0\u088e\n\u00b0\3\u00b0\3\u00b0\5\u00b0\u0892\n\u00b0\3"+
		"\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4"+
		"\5\u00b4\u089d\n\u00b4\3\u00b5\3\u00b5\5\u00b5\u08a1\n\u00b5\3\u00b6\3"+
		"\u00b6\3\u00b6\3\u00b7\3\u00b7\5\u00b7\u08a8\n\u00b7\3\u00b7\3\u00b7\5"+
		"\u00b7\u08ac\n\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u08b1\n\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b8\5\u00b8\u08b6\n\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\5\u00b8\u08bd\n\u00b8\3\u00b9\3\u00b9\5\u00b9\u08c1\n\u00b9\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb"+
		"\u08cb\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u08d9\n\u00bd\f\u00bd"+
		"\16\u00bd\u08dc\13\u00bd\3\u00be\3\u00be\5\u00be\u08e0\n\u00be\3\u00bf"+
		"\3\u00bf\5\u00bf\u08e4\n\u00bf\3\u00bf\5\u00bf\u08e7\n\u00bf\3\u00bf\3"+
		"\u00bf\5\u00bf\u08eb\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08f1"+
		"\n\u00bf\3\u00bf\5\u00bf\u08f4\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u08f8\n"+
		"\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\5\u00bf\u0902\n\u00bf\3\u00bf\5\u00bf\u0905\n\u00bf\3\u00bf\3\u00bf\3"+
		"\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u090d\n\u00bf\3\u00bf\3\u00bf\3"+
		"\u00bf\5\u00bf\u0912\n\u00bf\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0917\n\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u091f\n\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0926\n\u00c1\3\u00c1"+
		"\3\u00c1\5\u00c1\u092a\n\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3"+
		"\5\u00c3\u0931\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0937\n"+
		"\u00c3\7\u00c3\u0939\n\u00c3\f\u00c3\16\u00c3\u093c\13\u00c3\3\u00c4\3"+
		"\u00c4\3\u00c4\5\u00c4\u0941\n\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3"+
		"\u00c5\3\u00c5\3\u00c5\5\u00c5\u094a\n\u00c5\3\u00c5\3\u00c5\5\u00c5\u094e"+
		"\n\u00c5\3\u00c6\5\u00c6\u0951\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\5\u00cb\u0966\n\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cc\3\u00cc\5\u00cc\u096c\n\u00cc\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf\5\u00cf\u0977"+
		"\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u097d\n\u00cf\3\u00cf"+
		"\3\u00cf\5\u00cf\u0981\n\u00cf\3\u00cf\5\u00cf\u0984\n\u00cf\3\u00d0\3"+
		"\u00d0\5\u00d0\u0988\n\u00d0\3\u00d1\3\u00d1\5\u00d1\u098c\n\u00d1\3\u00d2"+
		"\3\u00d2\3\u00d2\5\u00d2\u0991\n\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3"+
		"\3\u00d3\5\u00d3\u0998\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3"+
		"\u099e\n\u00d3\7\u00d3\u09a0\n\u00d3\f\u00d3\16\u00d3\u09a3\13\u00d3\3"+
		"\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u09ab\n\u00d4\3"+
		"\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u09e0\n\u00d5"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u09e9"+
		"\n\u00d6\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\2$\f"+
		"\26 \66BDFHLNPRTVX`n\u0092\u00ca\u00ee\u00f4\u0100\u0104\u010c\u0122\u0126"+
		"\u012a\u013a\u014e\u0152\u015a\u0178\u0184\u01a4\u00da\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a"+
		"\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182"+
		"\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a"+
		"\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\2\20"+
		"\4\2ddhh\5\2\3\4^`df\3\2st\5\2hhkruv\7\2\'\'\62\62<<BBII\5\2%%//SS\3\2"+
		"X]\4\2\31\31UU\4\2\5\5dd\5\2\30\30EEPP\4\2))88\3\29;\4\2((KK\3\2\u0093"+
		"\u0096\2\u0b01\2\u01b3\3\2\2\2\4\u01bf\3\2\2\2\6\u01c3\3\2\2\2\b\u01ce"+
		"\3\2\2\2\n\u01d0\3\2\2\2\f\u01e1\3\2\2\2\16\u01f2\3\2\2\2\20\u01f8\3\2"+
		"\2\2\22\u0204\3\2\2\2\24\u0206\3\2\2\2\26\u0208\3\2\2\2\30\u021a\3\2\2"+
		"\2\32\u0220\3\2\2\2\34\u0227\3\2\2\2\36\u0229\3\2\2\2 \u0278\3\2\2\2\""+
		"\u02a5\3\2\2\2$\u02a7\3\2\2\2&\u02a9\3\2\2\2(\u02c1\3\2\2\2*\u02df\3\2"+
		"\2\2,\u02e1\3\2\2\2.\u02fb\3\2\2\2\60\u02fd\3\2\2\2\62\u0301\3\2\2\2\64"+
		"\u030a\3\2\2\2\66\u030c\3\2\2\28\u0325\3\2\2\2:\u0333\3\2\2\2<\u0335\3"+
		"\2\2\2>\u033e\3\2\2\2@\u0340\3\2\2\2B\u0344\3\2\2\2D\u0352\3\2\2\2F\u0363"+
		"\3\2\2\2H\u0371\3\2\2\2J\u037d\3\2\2\2L\u037f\3\2\2\2N\u0393\3\2\2\2P"+
		"\u03a1\3\2\2\2R\u03ac\3\2\2\2T\u03b7\3\2\2\2V\u03c2\3\2\2\2X\u03d0\3\2"+
		"\2\2Z\u03e5\3\2\2\2\\\u03ed\3\2\2\2^\u03ef\3\2\2\2`\u03f1\3\2\2\2b\u03fc"+
		"\3\2\2\2d\u0418\3\2\2\2f\u042c\3\2\2\2h\u042e\3\2\2\2j\u0433\3\2\2\2l"+
		"\u0437\3\2\2\2n\u043d\3\2\2\2p\u0452\3\2\2\2r\u0454\3\2\2\2t\u0459\3\2"+
		"\2\2v\u046e\3\2\2\2x\u047a\3\2\2\2z\u047c\3\2\2\2|\u0481\3\2\2\2~\u0486"+
		"\3\2\2\2\u0080\u0492\3\2\2\2\u0082\u049b\3\2\2\2\u0084\u049e\3\2\2\2\u0086"+
		"\u04a5\3\2\2\2\u0088\u04ad\3\2\2\2\u008a\u04af\3\2\2\2\u008c\u04b2\3\2"+
		"\2\2\u008e\u04be\3\2\2\2\u0090\u04c0\3\2\2\2\u0092\u04c2\3\2\2\2\u0094"+
		"\u04d6\3\2\2\2\u0096\u04e8\3\2\2\2\u0098\u04f2\3\2\2\2\u009a\u04f4\3\2"+
		"\2\2\u009c\u050b\3\2\2\2\u009e\u050d\3\2\2\2\u00a0\u0515\3\2\2\2\u00a2"+
		"\u0517\3\2\2\2\u00a4\u0520\3\2\2\2\u00a6\u0529\3\2\2\2\u00a8\u052b\3\2"+
		"\2\2\u00aa\u052d\3\2\2\2\u00ac\u052f\3\2\2\2\u00ae\u0534\3\2\2\2\u00b0"+
		"\u053a\3\2\2\2\u00b2\u0543\3\2\2\2\u00b4\u054c\3\2\2\2\u00b6\u0565\3\2"+
		"\2\2\u00b8\u056b\3\2\2\2\u00ba\u0576\3\2\2\2\u00bc\u0590\3\2\2\2\u00be"+
		"\u0592\3\2\2\2\u00c0\u05a1\3\2\2\2\u00c2\u05b6\3\2\2\2\u00c4\u05b8\3\2"+
		"\2\2\u00c6\u05c7\3\2\2\2\u00c8\u05c9\3\2\2\2\u00ca\u05cc\3\2\2\2\u00cc"+
		"\u05dc\3\2\2\2\u00ce\u05de\3\2\2\2\u00d0\u05e2\3\2\2\2\u00d2\u05e4\3\2"+
		"\2\2\u00d4\u05e8\3\2\2\2\u00d6\u05ec\3\2\2\2\u00d8\u05ef\3\2\2\2\u00da"+
		"\u05f8\3\2\2\2\u00dc\u0601\3\2\2\2\u00de\u0609\3\2\2\2\u00e0\u060b\3\2"+
		"\2\2\u00e2\u060d\3\2\2\2\u00e4\u0614\3\2\2\2\u00e6\u0625\3\2\2\2\u00e8"+
		"\u0628\3\2\2\2\u00ea\u0632\3\2\2\2\u00ec\u0642\3\2\2\2\u00ee\u0644\3\2"+
		"\2\2\u00f0\u0655\3\2\2\2\u00f2\u0667\3\2\2\2\u00f4\u0670\3\2\2\2\u00f6"+
		"\u0681\3\2\2\2\u00f8\u0687\3\2\2\2\u00fa\u0689\3\2\2\2\u00fc\u068d\3\2"+
		"\2\2\u00fe\u068f\3\2\2\2\u0100\u0693\3\2\2\2\u0102\u06af\3\2\2\2\u0104"+
		"\u06b1\3\2\2\2\u0106\u06bc\3\2\2\2\u0108\u06c5\3\2\2\2\u010a\u06cb\3\2"+
		"\2\2\u010c\u06d6\3\2\2\2\u010e\u06e8\3\2\2\2\u0110\u06f7\3\2\2\2\u0112"+
		"\u0713\3\2\2\2\u0114\u0715\3\2\2\2\u0116\u0719\3\2\2\2\u0118\u071b\3\2"+
		"\2\2\u011a\u071e\3\2\2\2\u011c\u0722\3\2\2\2\u011e\u072e\3\2\2\2\u0120"+
		"\u0735\3\2\2\2\u0122\u0745\3\2\2\2\u0124\u075b\3\2\2\2\u0126\u075d\3\2"+
		"\2\2\u0128\u077a\3\2\2\2\u012a\u077c\3\2\2\2\u012c\u07a6\3\2\2\2\u012e"+
		"\u07a8\3\2\2\2\u0130\u07ac\3\2\2\2\u0132\u07c0\3\2\2\2\u0134\u07c7\3\2"+
		"\2\2\u0136\u07cc\3\2\2\2\u0138\u07d0\3\2\2\2\u013a\u07d2\3\2\2\2\u013c"+
		"\u07eb\3\2\2\2\u013e\u07ef\3\2\2\2\u0140\u07f1\3\2\2\2\u0142\u080a\3\2"+
		"\2\2\u0144\u080d\3\2\2\2\u0146\u0811\3\2\2\2\u0148\u0813\3\2\2\2\u014a"+
		"\u081e\3\2\2\2\u014c\u0830\3\2\2\2\u014e\u0832\3\2\2\2\u0150\u0850\3\2"+
		"\2\2\u0152\u0852\3\2\2\2\u0154\u085c\3\2\2\2\u0156\u085e\3\2\2\2\u0158"+
		"\u0862\3\2\2\2\u015a\u0865\3\2\2\2\u015c\u088a\3\2\2\2\u015e\u0891\3\2"+
		"\2\2\u0160\u0893\3\2\2\2\u0162\u0895\3\2\2\2\u0164\u0897\3\2\2\2\u0166"+
		"\u089a\3\2\2\2\u0168\u089e\3\2\2\2\u016a\u08a2\3\2\2\2\u016c\u08b0\3\2"+
		"\2\2\u016e\u08bc\3\2\2\2\u0170\u08c0\3\2\2\2\u0172\u08c2\3\2\2\2\u0174"+
		"\u08ca\3\2\2\2\u0176\u08cc\3\2\2\2\u0178\u08d2\3\2\2\2\u017a\u08df\3\2"+
		"\2\2\u017c\u0911\3\2\2\2\u017e\u0913\3\2\2\2\u0180\u0929\3\2\2\2\u0182"+
		"\u092b\3\2\2\2\u0184\u092d\3\2\2\2\u0186\u0940\3\2\2\2\u0188\u094d\3\2"+
		"\2\2\u018a\u0950\3\2\2\2\u018c\u0955\3\2\2\2\u018e\u095a\3\2\2\2\u0190"+
		"\u095d\3\2\2\2\u0192\u0960\3\2\2\2\u0194\u0963\3\2\2\2\u0196\u0969\3\2"+
		"\2\2\u0198\u096d\3\2\2\2\u019a\u0970\3\2\2\2\u019c\u0983\3\2\2\2\u019e"+
		"\u0985\3\2\2\2\u01a0\u098b\3\2\2\2\u01a2\u098d\3\2\2\2\u01a4\u0994\3\2"+
		"\2\2\u01a6\u09aa\3\2\2\2\u01a8\u09df\3\2\2\2\u01aa\u09e8\3\2\2\2\u01ac"+
		"\u09ea\3\2\2\2\u01ae\u09ec\3\2\2\2\u01b0\u09ee\3\2\2\2\u01b2\u01b4\5\u0092"+
		"J\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\7\2\2\3\u01b6\3\3\2\2\2\u01b7\u01c0\5\u01aa\u00d6\2\u01b8\u01c0"+
		"\7H\2\2\u01b9\u01ba\7X\2\2\u01ba\u01bb\5`\61\2\u01bb\u01bc\7Y\2\2\u01bc"+
		"\u01c0\3\2\2\2\u01bd\u01c0\5\6\4\2\u01be\u01c0\5\16\b\2\u01bf\u01b7\3"+
		"\2\2\2\u01bf\u01b8\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01be\3\2\2\2\u01c0\5\3\2\2\2\u01c1\u01c4\5\b\5\2\u01c2\u01c4\5\n\6\2"+
		"\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\7\3\2\2\2\u01c5\u01cf\7"+
		"\u0089\2\2\u01c6\u01cf\5\u0172\u00ba\2\u01c7\u01cf\5\u0164\u00b3\2\u01c8"+
		"\u01cf\5\u0174\u00bb\2\u01c9\u01ca\7f\2\2\u01ca\u01cf\5\u013e\u00a0\2"+
		"\u01cb\u01cc\7f\2\2\u01cc\u01cf\5\u00ba^\2\u01cd\u01cf\5\u0180\u00c1\2"+
		"\u01ce\u01c5\3\2\2\2\u01ce\u01c6\3\2\2\2\u01ce\u01c7\3\2\2\2\u01ce\u01c8"+
		"\3\2\2\2\u01ce\u01c9\3\2\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\t\3\2\2\2\u01d0\u01d2\5\f\7\2\u01d1\u01d3\7G\2\2\u01d2\u01d1\3\2\2\2"+
		"\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\5\b\5\2\u01d5\13"+
		"\3\2\2\2\u01d6\u01d7\b\7\1\2\u01d7\u01e2\7\u0084\2\2\u01d8\u01d9\5\u00b8"+
		"]\2\u01d9\u01da\7\u0084\2\2\u01da\u01e2\3\2\2\2\u01db\u01dc\5\u00d0i\2"+
		"\u01dc\u01dd\7\u0084\2\2\u01dd\u01e2\3\2\2\2\u01de\u01df\5\u00ba^\2\u01df"+
		"\u01e0\7\u0084\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01d6\3\2\2\2\u01e1\u01d8"+
		"\3\2\2\2\u01e1\u01db\3\2\2\2\u01e1\u01de\3\2\2\2\u01e2\u01ef\3\2\2\2\u01e3"+
		"\u01e4\f\4\2\2\u01e4\u01e5\7\u0089\2\2\u01e5\u01ee\7\u0084\2\2\u01e6\u01e8"+
		"\f\3\2\2\u01e7\u01e9\7G\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\5\u017e\u00c0\2\u01eb\u01ec\7\u0084\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01e3\3\2\2\2\u01ed\u01e6\3\2\2\2\u01ee\u01f1\3\2"+
		"\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\r\3\2\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f2\u01f4\5\20\t\2\u01f3\u01f5\5\36\20\2\u01f4\u01f3\3\2\2"+
		"\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\5l\67\2\u01f7\17"+
		"\3\2\2\2\u01f8\u01fa\7Z\2\2\u01f9\u01fb\5\22\n\2\u01fa\u01f9\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\7[\2\2\u01fd\21\3\2\2\2"+
		"\u01fe\u0205\5\24\13\2\u01ff\u0205\5\26\f\2\u0200\u0201\5\24\13\2\u0201"+
		"\u0202\7\177\2\2\u0202\u0203\5\26\f\2\u0203\u0205\3\2\2\2\u0204\u01fe"+
		"\3\2\2\2\u0204\u01ff\3\2\2\2\u0204\u0200\3\2\2\2\u0205\23\3\2\2\2\u0206"+
		"\u0207\t\2\2\2\u0207\25\3\2\2\2\u0208\u0209\b\f\1\2\u0209\u020b\5\30\r"+
		"\2\u020a\u020c\7\u0088\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u0215\3\2\2\2\u020d\u020e\f\3\2\2\u020e\u020f\7\177\2\2\u020f\u0211\5"+
		"\30\r\2\u0210\u0212\7\u0088\2\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2"+
		"\2\u0212\u0214\3\2\2\2\u0213\u020d\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213"+
		"\3\2\2\2\u0215\u0216\3\2\2\2\u0216\27\3\2\2\2\u0217\u0215\3\2\2\2\u0218"+
		"\u021b\5\32\16\2\u0219\u021b\5\34\17\2\u021a\u0218\3\2\2\2\u021a\u0219"+
		"\3\2\2\2\u021b\31\3\2\2\2\u021c\u0221\7\u0089\2\2\u021d\u021e\7d\2\2\u021e"+
		"\u0221\7\u0089\2\2\u021f\u0221\7H\2\2\u0220\u021c\3\2\2\2\u0220\u021d"+
		"\3\2\2\2\u0220\u021f\3\2\2\2\u0221\33\3\2\2\2\u0222\u0223\7\u0089\2\2"+
		"\u0223\u0228\5\u0134\u009b\2\u0224\u0225\7d\2\2\u0225\u0226\7\u0089\2"+
		"\2\u0226\u0228\5\u0134\u009b\2\u0227\u0222\3\2\2\2\u0227\u0224\3\2\2\2"+
		"\u0228\35\3\2\2\2\u0229\u022a\7X\2\2\u022a\u022b\5\u0128\u0095\2\u022b"+
		"\u022d\7Y\2\2\u022c\u022e\7\62\2\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022e\u0230\3\2\2\2\u022f\u0231\5\u01a0\u00d1\2\u0230\u022f\3\2\2"+
		"\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0234\5\u00eex\2\u0233"+
		"\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0237\5\u0110"+
		"\u0089\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237\37\3\2\2\2\u0238"+
		"\u0239\b\21\1\2\u0239\u0279\5\4\3\2\u023a\u023b\5\u00b6\\\2\u023b\u023d"+
		"\7X\2\2\u023c\u023e\5&\24\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0240\7Y\2\2\u0240\u0279\3\2\2\2\u0241\u0242\5\u0188"+
		"\u00c5\2\u0242\u0244\7X\2\2\u0243\u0245\5&\24\2\u0244\u0243\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\7Y\2\2\u0247\u0279\3\2"+
		"\2\2\u0248\u0249\5\u00b6\\\2\u0249\u024a\5\u013c\u009f\2\u024a\u0279\3"+
		"\2\2\2\u024b\u024c\5\u0188\u00c5\2\u024c\u024d\5\u013c\u009f\2\u024d\u0279"+
		"\3\2\2\2\u024e\u024f\7\"\2\2\u024f\u0250\7i\2\2\u0250\u0251\5\u011c\u008f"+
		"\2\u0251\u0252\7j\2\2\u0252\u0253\7X\2\2\u0253\u0254\5`\61\2\u0254\u0255"+
		"\7Y\2\2\u0255\u0279\3\2\2\2\u0256\u0257\7D\2\2\u0257\u0258\7i\2\2\u0258"+
		"\u0259\5\u011c\u008f\2\u0259\u025a\7j\2\2\u025a\u025b\7X\2\2\u025b\u025c"+
		"\5`\61\2\u025c\u025d\7Y\2\2\u025d\u0279\3\2\2\2\u025e\u025f\7=\2\2\u025f"+
		"\u0260\7i\2\2\u0260\u0261\5\u011c\u008f\2\u0261\u0262\7j\2\2\u0262\u0263"+
		"\7X\2\2\u0263\u0264\5`\61\2\u0264\u0265\7Y\2\2\u0265\u0279\3\2\2\2\u0266"+
		"\u0267\7\33\2\2\u0267\u0268\7i\2\2\u0268\u0269\5\u011c\u008f\2\u0269\u026a"+
		"\7j\2\2\u026a\u026b\7X\2\2\u026b\u026c\5`\61\2\u026c\u026d\7Y\2\2\u026d"+
		"\u0279\3\2\2\2\u026e\u026f\5$\23\2\u026f\u0270\7X\2\2\u0270\u0271\5`\61"+
		"\2\u0271\u0272\7Y\2\2\u0272\u0279\3\2\2\2\u0273\u0274\5$\23\2\u0274\u0275"+
		"\7X\2\2\u0275\u0276\5\u011c\u008f\2\u0276\u0277\7Y\2\2\u0277\u0279\3\2"+
		"\2\2\u0278\u0238\3\2\2\2\u0278\u023a\3\2\2\2\u0278\u0241\3\2\2\2\u0278"+
		"\u0248\3\2\2\2\u0278\u024b\3\2\2\2\u0278\u024e\3\2\2\2\u0278\u0256\3\2"+
		"\2\2\u0278\u025e\3\2\2\2\u0278\u0266\3\2\2\2\u0278\u026e\3\2\2\2\u0278"+
		"\u0273\3\2\2\2\u0279\u02a2\3\2\2\2\u027a\u027b\f\25\2\2\u027b\u027c\7"+
		"Z\2\2\u027c\u027d\5`\61\2\u027d\u027e\7[\2\2\u027e\u02a1\3\2\2\2\u027f"+
		"\u0280\f\24\2\2\u0280\u0281\7Z\2\2\u0281\u0282\5\u013c\u009f\2\u0282\u0283"+
		"\7[\2\2\u0283\u02a1\3\2\2\2\u0284\u0285\f\23\2\2\u0285\u0287\7X\2\2\u0286"+
		"\u0288\5&\24\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2"+
		"\2\2\u0289\u02a1\7Y\2\2\u028a\u028b\f\16\2\2\u028b\u028d\7\u0086\2\2\u028c"+
		"\u028e\7G\2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u02a1\5\6\4\2\u0290\u0291\f\r\2\2\u0291\u0293\7\u0081\2\2\u0292"+
		"\u0294\7G\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u02a1\5\6\4\2\u0296\u0297\f\f\2\2\u0297\u0298\7\u0086\2\2\u0298"+
		"\u02a1\5(\25\2\u0299\u029a\f\13\2\2\u029a\u029b\7\u0081\2\2\u029b\u02a1"+
		"\5(\25\2\u029c\u029d\f\n\2\2\u029d\u02a1\7}\2\2\u029e\u029f\f\t\2\2\u029f"+
		"\u02a1\7~\2\2\u02a0\u027a\3\2\2\2\u02a0\u027f\3\2\2\2\u02a0\u0284\3\2"+
		"\2\2\u02a0\u028a\3\2\2\2\u02a0\u0290\3\2\2\2\u02a0\u0296\3\2\2\2\u02a0"+
		"\u0299\3\2\2\2\u02a0\u029c\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2"+
		"\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3!\3\2\2\2\u02a4\u02a2"+
		"\3\2\2\2\u02a5\u02a6\7N\2\2\u02a6#\3\2\2\2\u02a7\u02a8\7N\2\2\u02a8%\3"+
		"\2\2\2\u02a9\u02aa\5\u013a\u009e\2\u02aa\'\3\2\2\2\u02ab\u02ad\5\f\7\2"+
		"\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af"+
		"\5\u00b8]\2\u02af\u02b0\7\u0084\2\2\u02b0\u02b1\7f\2\2\u02b1\u02b2\5\u00b8"+
		"]\2\u02b2\u02c2\3\2\2\2\u02b3\u02b4\5\f\7\2\u02b4\u02b5\7G\2\2\u02b5\u02b6"+
		"\5\u017e\u00c0\2\u02b6\u02b7\7\u0084\2\2\u02b7\u02b8\7f\2\2\u02b8\u02b9"+
		"\5\u00b8]\2\u02b9\u02c2\3\2\2\2\u02ba\u02bc\5\f\7\2\u02bb\u02ba\3\2\2"+
		"\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\7f\2\2\u02be\u02c2"+
		"\5\u00b8]\2\u02bf\u02c0\7f\2\2\u02c0\u02c2\5\u00ba^\2\u02c1\u02ac\3\2"+
		"\2\2\u02c1\u02b3\3\2\2\2\u02c1\u02bb\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2"+
		")\3\2\2\2\u02c3\u02e0\5 \21\2\u02c4\u02c5\7}\2\2\u02c5\u02e0\5> \2\u02c6"+
		"\u02c7\7~\2\2\u02c7\u02e0\5> \2\u02c8\u02c9\5,\27\2\u02c9\u02ca\5> \2"+
		"\u02ca\u02e0\3\2\2\2\u02cb\u02cc\7A\2\2\u02cc\u02e0\5*\26\2\u02cd\u02ce"+
		"\7A\2\2\u02ce\u02cf\7X\2\2\u02cf\u02d0\5\u011c\u008f\2\u02d0\u02d1\7Y"+
		"\2\2\u02d1\u02e0\3\2\2\2\u02d2\u02d3\7A\2\2\u02d3\u02d4\7\u0088\2\2\u02d4"+
		"\u02d5\7X\2\2\u02d5\u02d6\7\u0089\2\2\u02d6\u02e0\7Y\2\2\u02d7\u02d8\7"+
		"\16\2\2\u02d8\u02d9\7X\2\2\u02d9\u02da\5\u011c\u008f\2\u02da\u02db\7Y"+
		"\2\2\u02db\u02e0\3\2\2\2\u02dc\u02e0\5<\37\2\u02dd\u02e0\5.\30\2\u02de"+
		"\u02e0\5:\36\2\u02df\u02c3\3\2\2\2\u02df\u02c4\3\2\2\2\u02df\u02c6\3\2"+
		"\2\2\u02df\u02c8\3\2\2\2\u02df\u02cb\3\2\2\2\u02df\u02cd\3\2\2\2\u02df"+
		"\u02d2\3\2\2\2\u02df\u02d7\3\2\2\2\u02df\u02dc\3\2\2\2\u02df\u02dd\3\2"+
		"\2\2\u02df\u02de\3\2\2\2\u02e0+\3\2\2\2\u02e1\u02e2\t\3\2\2\u02e2-\3\2"+
		"\2\2\u02e3\u02e5\7\u0084\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e8\7\64\2\2\u02e7\u02e9\5\60\31\2\u02e8\u02e7"+
		"\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\5\62\32\2"+
		"\u02eb\u02ed\58\35\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02fc"+
		"\3\2\2\2\u02ee\u02f0\7\u0084\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2"+
		"\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\7\64\2\2\u02f2\u02f4\5\60\31\2\u02f3"+
		"\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\7X"+
		"\2\2\u02f6\u02f7\5\u011c\u008f\2\u02f7\u02f9\7Y\2\2\u02f8\u02fa\58\35"+
		"\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02e4"+
		"\3\2\2\2\u02fb\u02ef\3\2\2\2\u02fc/\3\2\2\2\u02fd\u02fe\7X\2\2\u02fe\u02ff"+
		"\5&\24\2\u02ff\u0300\7Y\2\2\u0300\61\3\2\2\2\u0301\u0303\5\u00b2Z\2\u0302"+
		"\u0304\5\64\33\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\63\3\2"+
		"\2\2\u0305\u0307\5\u0112\u008a\2\u0306\u0308\5\64\33\2\u0307\u0306\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u030b\5\66\34\2\u030a"+
		"\u0305\3\2\2\2\u030a\u0309\3\2\2\2\u030b\65\3\2\2\2\u030c\u030d\b\34\1"+
		"\2\u030d\u030e\7Z\2\2\u030e\u030f\5`\61\2\u030f\u0311\7[\2\2\u0310\u0312"+
		"\5\u00eex\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u031c\3\2\2"+
		"\2\u0313\u0314\f\3\2\2\u0314\u0315\7Z\2\2\u0315\u0316\5b\62\2\u0316\u0318"+
		"\7[\2\2\u0317\u0319\5\u00eex\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2"+
		"\u0319\u031b\3\2\2\2\u031a\u0313\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a"+
		"\3\2\2\2\u031c\u031d\3\2\2\2\u031d\67\3\2\2\2\u031e\u031c\3\2\2\2\u031f"+
		"\u0321\7X\2\2\u0320\u0322\5&\24\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0323\3\2\2\2\u0323\u0326\7Y\2\2\u0324\u0326\5\u013c\u009f"+
		"\2\u0325\u031f\3\2\2\2\u0325\u0324\3\2\2\2\u03269\3\2\2\2\u0327\u0329"+
		"\7\u0084\2\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2"+
		"\2\u032a\u032b\7\37\2\2\u032b\u0334\5> \2\u032c\u032e\7\u0084\2\2\u032d"+
		"\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\7\37"+
		"\2\2\u0330\u0331\7Z\2\2\u0331\u0332\7[\2\2\u0332\u0334\5> \2\u0333\u0328"+
		"\3\2\2\2\u0333\u032d\3\2\2\2\u0334;\3\2\2\2\u0335\u0336\7\65\2\2\u0336"+
		"\u0337\7X\2\2\u0337\u0338\5`\61\2\u0338\u0339\7Y\2\2\u0339=\3\2\2\2\u033a"+
		"\u033f\5*\26\2\u033b\u033c\5@!\2\u033c\u033d\5> \2\u033d\u033f\3\2\2\2"+
		"\u033e\u033a\3\2\2\2\u033e\u033b\3\2\2\2\u033f?\3\2\2\2\u0340\u0341\7"+
		"X\2\2\u0341\u0342\5\u011c\u008f\2\u0342\u0343\7Y\2\2\u0343A\3\2\2\2\u0344"+
		"\u0345\b\"\1\2\u0345\u0346\5> \2\u0346\u034f\3\2\2\2\u0347\u0348\f\4\2"+
		"\2\u0348\u0349\7\u0087\2\2\u0349\u034e\5> \2\u034a\u034b\f\3\2\2\u034b"+
		"\u034c\7\u0080\2\2\u034c\u034e\5> \2\u034d\u0347\3\2\2\2\u034d\u034a\3"+
		"\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"C\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0353\b#\1\2\u0353\u0354\5B\"\2\u0354"+
		"\u0360\3\2\2\2\u0355\u0356\f\5\2\2\u0356\u0357\7`\2\2\u0357\u035f\5B\""+
		"\2\u0358\u0359\f\4\2\2\u0359\u035a\7a\2\2\u035a\u035f\5B\"\2\u035b\u035c"+
		"\f\3\2\2\u035c\u035d\7b\2\2\u035d\u035f\5B\"\2\u035e\u0355\3\2\2\2\u035e"+
		"\u0358\3\2\2\2\u035e\u035b\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2"+
		"\2\2\u0360\u0361\3\2\2\2\u0361E\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0364"+
		"\b$\1\2\u0364\u0365\5D#\2\u0365\u036e\3\2\2\2\u0366\u0367\f\4\2\2\u0367"+
		"\u0368\7^\2\2\u0368\u036d\5D#\2\u0369\u036a\f\3\2\2\u036a\u036b\7_\2\2"+
		"\u036b\u036d\5D#\2\u036c\u0366\3\2\2\2\u036c\u0369\3\2\2\2\u036d\u0370"+
		"\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036fG\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0371\u0372\b%\1\2\u0372\u0373\5F$\2\u0373\u037a\3\2\2"+
		"\2\u0374\u0375\f\3\2\2\u0375\u0376\5J&\2\u0376\u0377\5F$\2\u0377\u0379"+
		"\3\2\2\2\u0378\u0374\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037bI\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u037e\t\4\2\2"+
		"\u037eK\3\2\2\2\u037f\u0380\b\'\1\2\u0380\u0381\5H%\2\u0381\u0390\3\2"+
		"\2\2\u0382\u0383\f\6\2\2\u0383\u0384\7i\2\2\u0384\u038f\5H%\2\u0385\u0386"+
		"\f\5\2\2\u0386\u0387\7j\2\2\u0387\u038f\5H%\2\u0388\u0389\f\4\2\2\u0389"+
		"\u038a\7y\2\2\u038a\u038f\5H%\2\u038b\u038c\f\3\2\2\u038c\u038d\7z\2\2"+
		"\u038d\u038f\5H%\2\u038e\u0382\3\2\2\2\u038e\u0385\3\2\2\2\u038e\u0388"+
		"\3\2\2\2\u038e\u038b\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391M\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\b(\1\2\u0394"+
		"\u0395\5L\'\2\u0395\u039e\3\2\2\2\u0396\u0397\f\4\2\2\u0397\u0398\7w\2"+
		"\2\u0398\u039d\5L\'\2\u0399\u039a\f\3\2\2\u039a\u039b\7x\2\2\u039b\u039d"+
		"\5L\'\2\u039c\u0396\3\2\2\2\u039c\u0399\3\2\2\2\u039d\u03a0\3\2\2\2\u039e"+
		"\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039fO\3\2\2\2\u03a0\u039e\3\2\2\2"+
		"\u03a1\u03a2\b)\1\2\u03a2\u03a3\5N(\2\u03a3\u03a9\3\2\2\2\u03a4\u03a5"+
		"\f\3\2\2\u03a5\u03a6\7d\2\2\u03a6\u03a8\5N(\2\u03a7\u03a4\3\2\2\2\u03a8"+
		"\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aaQ\3\2\2\2"+
		"\u03ab\u03a9\3\2\2\2\u03ac\u03ad\b*\1\2\u03ad\u03ae\5P)\2\u03ae\u03b4"+
		"\3\2\2\2\u03af\u03b0\f\3\2\2\u03b0\u03b1\7c\2\2\u03b1\u03b3\5P)\2\u03b2"+
		"\u03af\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2"+
		"\2\2\u03b5S\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03b8\b+\1\2\u03b8\u03b9"+
		"\5R*\2\u03b9\u03bf\3\2\2\2\u03ba\u03bb\f\3\2\2\u03bb\u03bc\7e\2\2\u03bc"+
		"\u03be\5R*\2\u03bd\u03ba\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2\2"+
		"\2\u03bf\u03c0\3\2\2\2\u03c0U\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c2\u03c3"+
		"\b,\1\2\u03c3\u03c4\5T+\2\u03c4\u03cd\3\2\2\2\u03c5\u03c6\f\4\2\2\u03c6"+
		"\u03c7\7\5\2\2\u03c7\u03cc\5T+\2\u03c8\u03c9\f\3\2\2\u03c9\u03ca\7\6\2"+
		"\2\u03ca\u03cc\5T+\2\u03cb\u03c5\3\2\2\2\u03cb\u03c8\3\2\2\2\u03cc\u03cf"+
		"\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ceW\3\2\2\2\u03cf"+
		"\u03cd\3\2\2\2\u03d0\u03d1\b-\1\2\u03d1\u03d2\5V,\2\u03d2\u03db\3\2\2"+
		"\2\u03d3\u03d4\f\4\2\2\u03d4\u03d5\7\7\2\2\u03d5\u03da\5V,\2\u03d6\u03d7"+
		"\f\3\2\2\u03d7\u03d8\7\b\2\2\u03d8\u03da\5V,\2\u03d9\u03d3\3\2\2\2\u03d9"+
		"\u03d6\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dcY\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03e6\5X-\2\u03df\u03e0"+
		"\5X-\2\u03e0\u03e1\7\u0082\2\2\u03e1\u03e2\5`\61\2\u03e2\u03e3\7\u0083"+
		"\2\2\u03e3\u03e4\5\\/\2\u03e4\u03e6\3\2\2\2\u03e5\u03de\3\2\2\2\u03e5"+
		"\u03df\3\2\2\2\u03e6[\3\2\2\2\u03e7\u03ee\5Z.\2\u03e8\u03e9\5X-\2\u03e9"+
		"\u03ea\5^\60\2\u03ea\u03eb\5\u0138\u009d\2\u03eb\u03ee\3\2\2\2\u03ec\u03ee"+
		"\5\u019e\u00d0\2\u03ed\u03e7\3\2\2\2\u03ed\u03e8\3\2\2\2\u03ed\u03ec\3"+
		"\2\2\2\u03ee]\3\2\2\2\u03ef\u03f0\t\5\2\2\u03f0_\3\2\2\2\u03f1\u03f2\b"+
		"\61\1\2\u03f2\u03f3\5\\/\2\u03f3\u03f9\3\2\2\2\u03f4\u03f5\f\3\2\2\u03f5"+
		"\u03f6\7\177\2\2\u03f6\u03f8\5\\/\2\u03f7\u03f4\3\2\2\2\u03f8\u03fb\3"+
		"\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03faa\3\2\2\2\u03fb\u03f9"+
		"\3\2\2\2\u03fc\u03fd\5Z.\2\u03fdc\3\2\2\2\u03fe\u0419\5f\64\2\u03ff\u0401"+
		"\5\u00eex\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2"+
		"\2\u0402\u0419\5j\66\2\u0403\u0405\5\u00eex\2\u0404\u0403\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0419\5l\67\2\u0407\u0409\5\u00ee"+
		"x\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u0419\5p9\2\u040b\u040d\5\u00eex\2\u040c\u040b\3\2\2\2\u040c\u040d\3"+
		"\2\2\2\u040d\u040e\3\2\2\2\u040e\u0419\5x=\2\u040f\u0411\5\u00eex\2\u0410"+
		"\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0419\5\u0088"+
		"E\2\u0413\u0419\5\u0090I\2\u0414\u0416\5\u00eex\2\u0415\u0414\3\2\2\2"+
		"\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0419\5\u018e\u00c8\2\u0418"+
		"\u03fe\3\2\2\2\u0418\u0400\3\2\2\2\u0418\u0404\3\2\2\2\u0418\u0408\3\2"+
		"\2\2\u0418\u040c\3\2\2\2\u0418\u0410\3\2\2\2\u0418\u0413\3\2\2\2\u0418"+
		"\u0415\3\2\2\2\u0419e\3\2\2\2\u041a\u041c\5\u00eex\2\u041b\u041a\3\2\2"+
		"\2\u041b\u041c\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\7\u0089\2\2\u041e"+
		"\u041f\7\u0083\2\2\u041f\u042d\5d\63\2\u0420\u0422\5\u00eex\2\u0421\u0420"+
		"\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\5h\65\2\u0424"+
		"\u0425\5d\63\2\u0425\u042d\3\2\2\2\u0426\u0428\5\u00eex\2\u0427\u0426"+
		"\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\7\36\2\2"+
		"\u042a\u042b\7\u0083\2\2\u042b\u042d\5d\63\2\u042c\u041b\3\2\2\2\u042c"+
		"\u0421\3\2\2\2\u042c\u0427\3\2\2\2\u042dg\3\2\2\2\u042e\u042f\7\23\2\2"+
		"\u042f\u0430\5b\62\2\u0430\u0431\7\u0083\2\2\u0431i\3\2\2\2\u0432\u0434"+
		"\5`\61\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0436\7\u0085\2\2\u0436k\3\2\2\2\u0437\u0439\7\\\2\2\u0438\u043a\5n8"+
		"\2\u0439\u0438\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c"+
		"\7]\2\2\u043cm\3\2\2\2\u043d\u043e\b8\1\2\u043e\u043f\5d\63\2\u043f\u0444"+
		"\3\2\2\2\u0440\u0441\f\3\2\2\u0441\u0443\5d\63\2\u0442\u0440\3\2\2\2\u0443"+
		"\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445o\3\2\2\2"+
		"\u0446\u0444\3\2\2\2\u0447\u0448\5r:\2\u0448\u0449\5d\63\2\u0449\u0453"+
		"\3\2\2\2\u044a\u044b\5r:\2\u044b\u044c\5d\63\2\u044c\u044d\7#\2\2\u044d"+
		"\u044e\5d\63\2\u044e\u0453\3\2\2\2\u044f\u0450\5t;\2\u0450\u0451\5d\63"+
		"\2\u0451\u0453\3\2\2\2\u0452\u0447\3\2\2\2\u0452\u044a\3\2\2\2\u0452\u044f"+
		"\3\2\2\2\u0453q\3\2\2\2\u0454\u0455\7.\2\2\u0455\u0456\7X\2\2\u0456\u0457"+
		"\5v<\2\u0457\u0458\7Y\2\2\u0458s\3\2\2\2\u0459\u045a\7F\2\2\u045a\u045b"+
		"\7X\2\2\u045b\u045c\5v<\2\u045c\u045d\7Y\2\2\u045du\3\2\2\2\u045e\u046f"+
		"\5`\61\2\u045f\u0461\5\u00eex\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2"+
		"\2\u0461\u0462\3\2\2\2\u0462\u0463\5\u00a6T\2\u0463\u0464\5\u0108\u0085"+
		"\2\u0464\u0465\7h\2\2\u0465\u0466\5\u0138\u009d\2\u0466\u046f\3\2\2\2"+
		"\u0467\u0469\5\u00eex\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046b\5\u00a6T\2\u046b\u046c\5\u0108\u0085\2\u046c"+
		"\u046d\5\u013c\u009f\2\u046d\u046f\3\2\2\2\u046e\u045e\3\2\2\2\u046e\u0460"+
		"\3\2\2\2\u046e\u0468\3\2\2\2\u046fw\3\2\2\2\u0470\u0471\5|?\2\u0471\u0472"+
		"\5d\63\2\u0472\u047b\3\2\2\2\u0473\u047b\5z>\2\u0474\u0475\5\u0080A\2"+
		"\u0475\u0476\5d\63\2\u0476\u047b\3\2\2\2\u0477\u0478\5~@\2\u0478\u0479"+
		"\5d\63\2\u0479\u047b\3\2\2\2\u047a\u0470\3\2\2\2\u047a\u0473\3\2\2\2\u047a"+
		"\u0474\3\2\2\2\u047a\u0477\3\2\2\2\u047by\3\2\2\2\u047c\u047d\7 \2\2\u047d"+
		"\u047e\5d\63\2\u047e\u047f\5|?\2\u047f\u0480\7\u0085\2\2\u0480{\3\2\2"+
		"\2\u0481\u0482\7W\2\2\u0482\u0483\7X\2\2\u0483\u0484\5v<\2\u0484\u0485"+
		"\7Y\2\2\u0485}\3\2\2\2\u0486\u0487\7+\2\2\u0487\u0488\7X\2\2\u0488\u048a"+
		"\5\u0082B\2\u0489\u048b\5v<\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2"+
		"\u048b\u048c\3\2\2\2\u048c\u048e\7\u0085\2\2\u048d\u048f\5`\61\2\u048e"+
		"\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\7Y"+
		"\2\2\u0491\177\3\2\2\2\u0492\u0493\7+\2\2\u0493\u0494\7X\2\2\u0494\u0495"+
		"\5\u0084C\2\u0495\u0496\7\u0083\2\2\u0496\u0497\5\u0086D\2\u0497\u0498"+
		"\7Y\2\2\u0498\u0081\3\2\2\2\u0499\u049c\5j\66\2\u049a\u049c\5\u009cO\2"+
		"\u049b\u0499\3\2\2\2\u049b\u049a\3\2\2\2\u049c\u0083\3\2\2\2\u049d\u049f"+
		"\5\u00eex\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\3\2\2"+
		"\2\u04a0\u04a1\5\u00a6T\2\u04a1\u04a2\5\u0108\u0085\2\u04a2\u0085\3\2"+
		"\2\2\u04a3\u04a6\5`\61\2\u04a4\u04a6\5\u013c\u009f\2\u04a5\u04a3\3\2\2"+
		"\2\u04a5\u04a4\3\2\2\2\u04a6\u0087\3\2\2\2\u04a7\u04ae\5\u008aF\2\u04a8"+
		"\u04ae\5\u008cG\2\u04a9\u04ae\5\u008eH\2\u04aa\u04ab\7-\2\2\u04ab\u04ac"+
		"\7\u0089\2\2\u04ac\u04ae\7\u0085\2\2\u04ad\u04a7\3\2\2\2\u04ad\u04a8\3"+
		"\2\2\2\u04ad\u04a9\3\2\2\2\u04ad\u04aa\3\2\2\2\u04ae\u0089\3\2\2\2\u04af"+
		"\u04b0\7\22\2\2\u04b0\u04b1\7\u0085\2\2\u04b1\u008b\3\2\2\2\u04b2\u04b3"+
		"\7\34\2\2\u04b3\u04b4\7\u0085\2\2\u04b4\u008d\3\2\2\2\u04b5\u04b7\7>\2"+
		"\2\u04b6\u04b8\5`\61\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9"+
		"\3\2\2\2\u04b9\u04bf\7\u0085\2\2\u04ba\u04bb\7>\2\2\u04bb\u04bc\5\u013c"+
		"\u009f\2\u04bc\u04bd\7\u0085\2\2\u04bd\u04bf\3\2\2\2\u04be\u04b5\3\2\2"+
		"\2\u04be\u04ba\3\2\2\2\u04bf\u008f\3\2\2\2\u04c0\u04c1\5\u0098M\2\u04c1"+
		"\u0091\3\2\2\2\u04c2\u04c3\bJ\1\2\u04c3\u04c4\5\u0094K\2\u04c4\u04c9\3"+
		"\2\2\2\u04c5\u04c6\f\3\2\2\u04c6\u04c8\5\u0094K\2\u04c7\u04c5\3\2\2\2"+
		"\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u0093"+
		"\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\u04d7\5\u0098M\2\u04cd\u04d7\5\u012e"+
		"\u0098\2\u04ce\u04d7\5\u0176\u00bc\2\u04cf\u04d7\5\u018a\u00c6\2\u04d0"+
		"\u04d7\5\u018c\u00c7\2\u04d1\u04d7\5\u00ecw\2\u04d2\u04d7\5\u00d4k\2\u04d3"+
		"\u04d7\5\u00a0Q\2\u04d4\u04d7\5\u00a2R\2\u04d5\u04d7\5\u0096L\2\u04d6"+
		"\u04cc\3\2\2\2\u04d6\u04cd\3\2\2\2\u04d6\u04ce\3\2\2\2\u04d6\u04cf\3\2"+
		"\2\2\u04d6\u04d0\3\2\2\2\u04d6\u04d1\3\2\2\2\u04d6\u04d2\3\2\2\2\u04d6"+
		"\u04d3\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d5\3\2\2\2\u04d7\u0095\3\2"+
		"\2\2\u04d8\u04d9\7\t\2\2\u04d9\u04da\7i\2\2\u04da\u04dd\7\u0089\2\2\u04db"+
		"\u04dc\7\u0086\2\2\u04dc\u04de\7\u0089\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de"+
		"\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e9\7j\2\2\u04e0\u04e1\7\t\2\2\u04e1"+
		"\u04e2\7\n\2\2\u04e2\u04e5\7\u0089\2\2\u04e3\u04e4\7\u0086\2\2\u04e4\u04e6"+
		"\7\u0089\2\2\u04e5\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2"+
		"\2\u04e7\u04e9\7\n\2\2\u04e8\u04d8\3\2\2\2\u04e8\u04e0\3\2\2\2\u04e9\u0097"+
		"\3\2\2\2\u04ea\u04f3\5\u009cO\2\u04eb\u04f3\5\u00eav\2\u04ec\u04f3\5\u00e2"+
		"r\2\u04ed\u04f3\5\u00e6t\2\u04ee\u04f3\5\u00e8u\2\u04ef\u04f3\5\u009e"+
		"P\2\u04f0\u04f3\5\u009aN\2\u04f1\u04f3\5\u00c4c\2\u04f2\u04ea\3\2\2\2"+
		"\u04f2\u04eb\3\2\2\2\u04f2\u04ec\3\2\2\2\u04f2\u04ed\3\2\2\2\u04f2\u04ee"+
		"\3\2\2\2\u04f2\u04ef\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f1\3\2\2\2\u04f3"+
		"\u0099\3\2\2\2\u04f4\u04f5\7R\2\2\u04f5\u04f7\7\u0089\2\2\u04f6\u04f8"+
		"\5\u00eex\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2"+
		"\2\u04f9\u04fa\7h\2\2\u04fa\u04fb\5\u011c\u008f\2\u04fb\u04fc\7\u0085"+
		"\2\2\u04fc\u009b\3\2\2\2\u04fd\u04ff\5\u00a6T\2\u04fe\u04fd\3\2\2\2\u04fe"+
		"\u04ff\3\2\2\2\u04ff\u0501\3\2\2\2\u0500\u0502\5\u0104\u0083\2\u0501\u0500"+
		"\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u050c\7\u0085\2"+
		"\2\u0504\u0506\5\u00eex\2\u0505\u0507\5\u00a6T\2\u0506\u0505\3\2\2\2\u0506"+
		"\u0507\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\5\u0104\u0083\2\u0509\u050a"+
		"\7\u0085\2\2\u050a\u050c\3\2\2\2\u050b\u04fe\3\2\2\2\u050b\u0504\3\2\2"+
		"\2\u050c\u009d\3\2\2\2\u050d\u050e\7C\2\2\u050e\u050f\7X\2\2\u050f\u0510"+
		"\5b\62\2\u0510\u0511\7\177\2\2\u0511\u0512\7\u0092\2\2\u0512\u0513\7Y"+
		"\2\2\u0513\u0514\7\u0085\2\2\u0514\u009f\3\2\2\2\u0515\u0516\7\u0085\2"+
		"\2\u0516\u00a1\3\2\2\2\u0517\u0518\5\u00eex\2\u0518\u0519\7\u0085\2\2"+
		"\u0519\u00a3\3\2\2\2\u051a\u0521\5\u00a8U\2\u051b\u0521\5\u00aeX\2\u051c"+
		"\u0521\5\u00aaV\2\u051d\u0521\7,\2\2\u051e\u0521\7M\2\2\u051f\u0521\7"+
		"\32\2\2\u0520\u051a\3\2\2\2\u0520\u051b\3\2\2\2\u0520\u051c\3\2\2\2\u0520"+
		"\u051d\3\2\2\2\u0520\u051e\3\2\2\2\u0520\u051f\3\2\2\2\u0521\u00a5\3\2"+
		"\2\2\u0522\u0524\5\u00a4S\2\u0523\u0525\5\u00eex\2\u0524\u0523\3\2\2\2"+
		"\u0524\u0525\3\2\2\2\u0525\u052a\3\2\2\2\u0526\u0527\5\u00a4S\2\u0527"+
		"\u0528\5\u00a6T\2\u0528\u052a\3\2\2\2\u0529\u0522\3\2\2\2\u0529\u0526"+
		"\3\2\2\2\u052a\u00a7\3\2\2\2\u052b\u052c\t\6\2\2\u052c\u00a9\3\2\2\2\u052d"+
		"\u052e\t\7\2\2\u052e\u00ab\3\2\2\2\u052f\u0530\7\u0089\2\2\u0530\u00ad"+
		"\3\2\2\2\u0531\u0535\5\u00b0Y\2\u0532\u0535\5\u0140\u00a1\2\u0533\u0535"+
		"\5\u00c0a\2\u0534\u0531\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0533\3\2\2"+
		"\2\u0535\u00af\3\2\2\2\u0536\u053b\5\u00b6\\\2\u0537\u053b\5\u00bc_\2"+
		"\u0538\u053b\5\u0188\u00c5\2\u0539\u053b\5\u0116\u008c\2\u053a\u0536\3"+
		"\2\2\2\u053a\u0537\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u0539\3\2\2\2\u053b"+
		"\u00b1\3\2\2\2\u053c\u053e\5\u00aeX\2\u053d\u053f\5\u00eex\2\u053e\u053d"+
		"\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0544\3\2\2\2\u0540\u0541\5\u00aeX"+
		"\2\u0541\u0542\5\u00b2Z\2\u0542\u0544\3\2\2\2\u0543\u053c\3\2\2\2\u0543"+
		"\u0540\3\2\2\2\u0544\u00b3\3\2\2\2\u0545\u0547\5\u00b0Y\2\u0546\u0548"+
		"\5\u00eex\2\u0547\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054d\3\2\2"+
		"\2\u0549\u054a\5\u00b0Y\2\u054a\u054b\5\u00b4[\2\u054b\u054d\3\2\2\2\u054c"+
		"\u0545\3\2\2\2\u054c\u0549\3\2\2\2\u054d\u00b5\3\2\2\2\u054e\u0550\5\f"+
		"\7\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2\2\2\u0551"+
		"\u0566\5\u00b8]\2\u0552\u0553\5\f\7\2\u0553\u0554\7G\2\2\u0554\u0555\5"+
		"\u017e\u00c0\2\u0555\u0566\3\2\2\2\u0556\u0566\7\25\2\2\u0557\u0566\7"+
		"\26\2\2\u0558\u0566\7\27\2\2\u0559\u0566\7V\2\2\u055a\u0566\7\21\2\2\u055b"+
		"\u0566\7?\2\2\u055c\u0566\7\60\2\2\u055d\u0566\7\61\2\2\u055e\u0566\7"+
		"@\2\2\u055f\u0566\7Q\2\2\u0560\u0566\7*\2\2\u0561\u0566\7!\2\2\u0562\u0566"+
		"\7T\2\2\u0563\u0566\7\20\2\2\u0564\u0566\5\u00ba^\2\u0565\u054f\3\2\2"+
		"\2\u0565\u0552\3\2\2\2\u0565\u0556\3\2\2\2\u0565\u0557\3\2\2\2\u0565\u0558"+
		"\3\2\2\2\u0565\u0559\3\2\2\2\u0565\u055a\3\2\2\2\u0565\u055b\3\2\2\2\u0565"+
		"\u055c\3\2\2\2\u0565\u055d\3\2\2\2\u0565\u055e\3\2\2\2\u0565\u055f\3\2"+
		"\2\2\u0565\u0560\3\2\2\2\u0565\u0561\3\2\2\2\u0565\u0562\3\2\2\2\u0565"+
		"\u0563\3\2\2\2\u0565\u0564\3\2\2\2\u0566\u00b7\3\2\2\2\u0567\u056c\5\u013e"+
		"\u00a0\2\u0568\u056c\5\u00be`\2\u0569\u056c\5\u00acW\2\u056a\u056c\5\u017e"+
		"\u00c0\2\u056b\u0567\3\2\2\2\u056b\u0568\3\2\2\2\u056b\u0569\3\2\2\2\u056b"+
		"\u056a\3\2\2\2\u056c\u00b9\3\2\2\2\u056d\u056e\7\35\2\2\u056e\u056f\7"+
		"X\2\2\u056f\u0570\5`\61\2\u0570\u0571\7Y\2\2\u0571\u0577\3\2\2\2\u0572"+
		"\u0573\7\35\2\2\u0573\u0574\7X\2\2\u0574\u0575\7\20\2\2\u0575\u0577\7"+
		"Y\2\2\u0576\u056d\3\2\2\2\u0576\u0572\3\2\2\2\u0577\u00bb\3\2\2\2\u0578"+
		"\u057a\5\u0148\u00a5\2\u0579\u057b\5\u00eex\2\u057a\u0579\3\2\2\2\u057a"+
		"\u057b\3\2\2\2\u057b\u057d\3\2\2\2\u057c\u057e\5\f\7\2\u057d\u057c\3\2"+
		"\2\2\u057d\u057e\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\7\u0089\2\2\u0580"+
		"\u0591\3\2\2\2\u0581\u0582\5\u0148\u00a5\2\u0582\u0583\5\u017e\u00c0\2"+
		"\u0583\u0591\3\2\2\2\u0584\u0585\5\u0148\u00a5\2\u0585\u0587\5\f\7\2\u0586"+
		"\u0588\7G\2\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2"+
		"\2\2\u0589\u058a\5\u017e\u00c0\2\u058a\u0591\3\2\2\2\u058b\u058d\7$\2"+
		"\2\u058c\u058e\5\f\7\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f"+
		"\3\2\2\2\u058f\u0591\7\u0089\2\2\u0590\u0578\3\2\2\2\u0590\u0581\3\2\2"+
		"\2\u0590\u0584\3\2\2\2\u0590\u058b\3\2\2\2\u0591\u00bd\3\2\2\2\u0592\u0593"+
		"\7\u0089\2\2\u0593\u00bf\3\2\2\2\u0594\u0595\5\u00c2b\2\u0595\u0597\7"+
		"\\\2\2\u0596\u0598\5\u00caf\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2"+
		"\u0598\u0599\3\2\2\2\u0599\u059a\7]\2\2\u059a\u05a2\3\2\2\2\u059b\u059c"+
		"\5\u00c2b\2\u059c\u059d\7\\\2\2\u059d\u059e\5\u00caf\2\u059e\u059f\7\177"+
		"\2\2\u059f\u05a0\7]\2\2\u05a0\u05a2\3\2\2\2\u05a1\u0594\3\2\2\2\u05a1"+
		"\u059b\3\2\2\2\u05a2\u00c1\3\2\2\2\u05a3\u05a5\5\u00c6d\2\u05a4\u05a6"+
		"\5\u00eex\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\3\2\2"+
		"\2\u05a7\u05a9\7\u0089\2\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9"+
		"\u05ab\3\2\2\2\u05aa\u05ac\5\u00c8e\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac"+
		"\3\2\2\2\u05ac\u05b7\3\2\2\2\u05ad\u05af\5\u00c6d\2\u05ae\u05b0\5\u00ee"+
		"x\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1"+
		"\u05b2\5\f\7\2\u05b2\u05b4\7\u0089\2\2\u05b3\u05b5\5\u00c8e\2\u05b4\u05b3"+
		"\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05a3\3\2\2\2\u05b6"+
		"\u05ad\3\2\2\2\u05b7\u00c3\3\2\2\2\u05b8\u05ba\5\u00c6d\2\u05b9\u05bb"+
		"\5\u00eex\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2"+
		"\2\u05bc\u05be\7\u0089\2\2\u05bd\u05bf\5\u00c8e\2\u05be\u05bd\3\2\2\2"+
		"\u05be\u05bf\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c1\7\u0085\2\2\u05c1"+
		"\u00c5\3\2\2\2\u05c2\u05c8\7$\2\2\u05c3\u05c4\7$\2\2\u05c4\u05c8\7\30"+
		"\2\2\u05c5\u05c6\7$\2\2\u05c6\u05c8\7E\2\2\u05c7\u05c2\3\2\2\2\u05c7\u05c3"+
		"\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8\u00c7\3\2\2\2\u05c9\u05ca\7\u0083\2"+
		"\2\u05ca\u05cb\5\u00b2Z\2\u05cb\u00c9\3\2\2\2\u05cc\u05cd\bf\1\2\u05cd"+
		"\u05ce\5\u00ccg\2\u05ce\u05d4\3\2\2\2\u05cf\u05d0\f\3\2\2\u05d0\u05d1"+
		"\7\177\2\2\u05d1\u05d3\5\u00ccg\2\u05d2\u05cf\3\2\2\2\u05d3\u05d6\3\2"+
		"\2\2\u05d4\u05d2\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u00cb\3\2\2\2\u05d6"+
		"\u05d4\3\2\2\2\u05d7\u05dd\5\u00ceh\2\u05d8\u05d9\5\u00ceh\2\u05d9\u05da"+
		"\7h\2\2\u05da\u05db\5b\62\2\u05db\u05dd\3\2\2\2\u05dc\u05d7\3\2\2\2\u05dc"+
		"\u05d8\3\2\2\2\u05dd\u00cd\3\2\2\2\u05de\u05df\7\u0089\2\2\u05df\u00cf"+
		"\3\2\2\2\u05e0\u05e3\5\u00d2j\2\u05e1\u05e3\5\u00e0q\2\u05e2\u05e0\3\2"+
		"\2\2\u05e2\u05e1\3\2\2\2\u05e3\u00d1\3\2\2\2\u05e4\u05e5\7\u0089\2\2\u05e5"+
		"\u00d3\3\2\2\2\u05e6\u05e9\5\u00d6l\2\u05e7\u05e9\5\u00dco\2\u05e8\u05e6"+
		"\3\2\2\2\u05e8\u05e7\3\2\2\2\u05e9\u00d5\3\2\2\2\u05ea\u05ed\5\u00d8m"+
		"\2\u05eb\u05ed\5\u00dan\2\u05ec\u05ea\3\2\2\2\u05ec\u05eb\3\2\2\2\u05ed"+
		"\u00d7\3\2\2\2\u05ee\u05f0\7/\2\2\u05ef\u05ee\3\2\2\2\u05ef\u05f0\3\2"+
		"\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\7\63\2\2\u05f2\u05f3\7\u0089\2\2"+
		"\u05f3\u05f4\7\\\2\2\u05f4\u05f5\5\u00dep\2\u05f5\u05f6\7]\2\2\u05f6\u00d9"+
		"\3\2\2\2\u05f7\u05f9\7/\2\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9"+
		"\u05fa\3\2\2\2\u05fa\u05fb\7\63\2\2\u05fb\u05fc\5\u00d2j\2\u05fc\u05fd"+
		"\7\\\2\2\u05fd\u05fe\5\u00dep\2\u05fe\u05ff\7]\2\2\u05ff\u00db\3\2\2\2"+
		"\u0600\u0602\7/\2\2\u0601\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603"+
		"\3\2\2\2\u0603\u0604\7\63\2\2\u0604\u0605\7\\\2\2\u0605\u0606\5\u00de"+
		"p\2\u0606\u0607\7]\2\2\u0607\u00dd\3\2\2\2\u0608\u060a\5\u0092J\2\u0609"+
		"\u0608\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u00df\3\2\2\2\u060b\u060c\7\u0089"+
		"\2\2\u060c\u00e1\3\2\2\2\u060d\u060e\7\63\2\2\u060e\u060f\7\u0089\2\2"+
		"\u060f\u0610\7h\2\2\u0610\u0611\5\u00e4s\2\u0611\u0612\7\u0085\2\2\u0612"+
		"\u00e3\3\2\2\2\u0613\u0615\5\f\7\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2"+
		"\2\2\u0615\u0616\3\2\2\2\u0616\u0617\5\u00d0i\2\u0617\u00e5\3\2\2\2\u0618"+
		"\u061a\7R\2\2\u0619\u061b\7O\2\2\u061a\u0619\3\2\2\2\u061a\u061b\3\2\2"+
		"\2\u061b\u061c\3\2\2\2\u061c\u061d\5\f\7\2\u061d\u061e\5\b\5\2\u061e\u061f"+
		"\7\u0085\2\2\u061f\u0626\3\2\2\2\u0620\u0621\7R\2\2\u0621\u0622\7\u0084"+
		"\2\2\u0622\u0623\5\b\5\2\u0623\u0624\7\u0085\2\2\u0624\u0626\3\2\2\2\u0625"+
		"\u0618\3\2\2\2\u0625\u0620\3\2\2\2\u0626\u00e7\3\2\2\2\u0627\u0629\5\u00ee"+
		"x\2\u0628\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\3\2\2\2\u062a"+
		"\u062b\7R\2\2\u062b\u062d\7\63\2\2\u062c\u062e\5\f\7\2\u062d\u062c\3\2"+
		"\2\2\u062d\u062e\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0630\5\u00d0i\2\u0630"+
		"\u0631\7\u0085\2\2\u0631\u00e9\3\2\2\2\u0632\u0633\7\17\2\2\u0633\u0634"+
		"\7X\2\2\u0634\u0635\7\u0092\2\2\u0635\u0636\7Y\2\2\u0636\u0637\7\u0085"+
		"\2\2\u0637\u00eb\3\2\2\2\u0638\u0639\7\'\2\2\u0639\u063a\7\u0092\2\2\u063a"+
		"\u063c\7\\\2\2\u063b\u063d\5\u0092J\2\u063c\u063b\3\2\2\2\u063c\u063d"+
		"\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0643\7]\2\2\u063f\u0640\7\'\2\2\u0640"+
		"\u0641\7\u0092\2\2\u0641\u0643\5\u0094K\2\u0642\u0638\3\2\2\2\u0642\u063f"+
		"\3\2\2\2\u0643\u00ed\3\2\2\2\u0644\u0645\bx\1\2\u0645\u0646\5\u00f0y\2"+
		"\u0646\u064b\3\2\2\2\u0647\u0648\f\3\2\2\u0648\u064a\5\u00f0y\2\u0649"+
		"\u0647\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c\3\2"+
		"\2\2\u064c\u00ef\3\2\2\2\u064d\u064b\3\2\2\2\u064e\u064f\7Z\2\2\u064f"+
		"\u0650\7Z\2\2\u0650\u0651\5\u00f4{\2\u0651\u0652\7[\2\2\u0652\u0653\7"+
		"[\2\2\u0653\u0656\3\2\2\2\u0654\u0656\5\u00f2z\2\u0655\u064e\3\2\2\2\u0655"+
		"\u0654\3\2\2\2\u0656\u00f1\3\2\2\2\u0657\u0658\7\r\2\2\u0658\u0659\7X"+
		"\2\2\u0659\u065b\5\u011c\u008f\2\u065a\u065c\7\u0088\2\2\u065b\u065a\3"+
		"\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\7Y\2\2\u065e"+
		"\u0668\3\2\2\2\u065f\u0660\7\r\2\2\u0660\u0661\7X\2\2\u0661\u0663\5b\62"+
		"\2\u0662\u0664\7\u0088\2\2\u0663\u0662\3\2\2\2\u0663\u0664\3\2\2\2\u0664"+
		"\u0665\3\2\2\2\u0665\u0666\7Y\2\2\u0666\u0668\3\2\2\2\u0667\u0657\3\2"+
		"\2\2\u0667\u065f\3\2\2\2\u0668\u00f3\3\2\2\2\u0669\u066b\b{\1\2\u066a"+
		"\u066c\5\u00f6|\2\u066b\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u0671"+
		"\3\2\2\2\u066d\u066e\5\u00f6|\2\u066e\u066f\7\u0088\2\2\u066f\u0671\3"+
		"\2\2\2\u0670\u0669\3\2\2\2\u0670\u066d\3\2\2\2\u0671\u067e\3\2\2\2\u0672"+
		"\u0673\f\5\2\2\u0673\u0675\7\177\2\2\u0674\u0676\5\u00f6|\2\u0675\u0674"+
		"\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u067d\3\2\2\2\u0677\u0678\f\3\2\2\u0678"+
		"\u0679\7\177\2\2\u0679\u067a\5\u00f6|\2\u067a\u067b\7\u0088\2\2\u067b"+
		"\u067d\3\2\2\2\u067c\u0672\3\2\2\2\u067c\u0677\3\2\2\2\u067d\u0680\3\2"+
		"\2\2\u067e\u067c\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u00f5\3\2\2\2\u0680"+
		"\u067e\3\2\2\2\u0681\u0683\5\u00f8}\2\u0682\u0684\5\u00fe\u0080\2\u0683"+
		"\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u00f7\3\2\2\2\u0685\u0688\7\u0089"+
		"\2\2\u0686\u0688\5\u00fa~\2\u0687\u0685\3\2\2\2\u0687\u0686\3\2\2\2\u0688"+
		"\u00f9\3\2\2\2\u0689\u068a\5\u00fc\177\2\u068a\u068b\7\u0084\2\2\u068b"+
		"\u068c\7\u0089\2\2\u068c\u00fb\3\2\2\2\u068d\u068e\7\u0089\2\2\u068e\u00fd"+
		"\3\2\2\2\u068f\u0690\7X\2\2\u0690\u0691\5\u0100\u0081\2\u0691\u0692\7"+
		"Y\2\2\u0692\u00ff\3\2\2\2\u0693\u0695\b\u0081\1\2\u0694\u0696\5\u0102"+
		"\u0082\2\u0695\u0694\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u069b\3\2\2\2\u0697"+
		"\u0698\f\3\2\2\u0698\u069a\5\u0102\u0082\2\u0699\u0697\3\2\2\2\u069a\u069d"+
		"\3\2\2\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u0101\3\2\2\2\u069d"+
		"\u069b\3\2\2\2\u069e\u069f\7X\2\2\u069f\u06a0\5\u0100\u0081\2\u06a0\u06a1"+
		"\7Y\2\2\u06a1\u06b0\3\2\2\2\u06a2\u06a3\7Z\2\2\u06a3\u06a4\5\u0100\u0081"+
		"\2\u06a4\u06a5\7[\2\2\u06a5\u06b0\3\2\2\2\u06a6\u06a7\7\\\2\2\u06a7\u06a8"+
		"\5\u0100\u0081\2\u06a8\u06a9\7]\2\2\u06a9\u06b0\3\2\2\2\u06aa\u06ac\n"+
		"\b\2\2\u06ab\u06aa\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad"+
		"\u06ae\3\2\2\2\u06ae\u06b0\3\2\2\2\u06af\u069e\3\2\2\2\u06af\u06a2\3\2"+
		"\2\2\u06af\u06a6\3\2\2\2\u06af\u06ab\3\2\2\2\u06b0\u0103\3\2\2\2\u06b1"+
		"\u06b2\b\u0083\1\2\u06b2\u06b3\5\u0106\u0084\2\u06b3\u06b9\3\2\2\2\u06b4"+
		"\u06b5\f\3\2\2\u06b5\u06b6\7\177\2\2\u06b6\u06b8\5\u0106\u0084\2\u06b7"+
		"\u06b4\3\2\2\2\u06b8\u06bb\3\2\2\2\u06b9\u06b7\3\2\2\2\u06b9\u06ba\3\2"+
		"\2\2\u06ba\u0105\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bc\u06be\5\u0108\u0085"+
		"\2\u06bd\u06bf\5\u0134\u009b\2\u06be\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2"+
		"\u06bf\u0107\3\2\2\2\u06c0\u06c6\5\u010a\u0086\2\u06c1\u06c2\5\u010c\u0087"+
		"\2\u06c2\u06c3\5\u010e\u0088\2\u06c3\u06c4\5\u0110\u0089\2\u06c4\u06c6"+
		"\3\2\2\2\u06c5\u06c0\3\2\2\2\u06c5\u06c1\3\2\2\2\u06c6\u0109\3\2\2\2\u06c7"+
		"\u06cc\5\u010c\u0087\2\u06c8\u06c9\5\u0112\u008a\2\u06c9\u06ca\5\u010a"+
		"\u0086\2\u06ca\u06cc\3\2\2\2\u06cb\u06c7\3\2\2\2\u06cb\u06c8\3\2\2\2\u06cc"+
		"\u010b\3\2\2\2\u06cd\u06ce\b\u0087\1\2\u06ce\u06d0\5\u011a\u008e\2\u06cf"+
		"\u06d1\5\u00eex\2\u06d0\u06cf\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d7"+
		"\3\2\2\2\u06d2\u06d3\7X\2\2\u06d3\u06d4\5\u010a\u0086\2\u06d4\u06d5\7"+
		"Y\2\2\u06d5\u06d7\3\2\2\2\u06d6\u06cd\3\2\2\2\u06d6\u06d2\3\2\2\2\u06d7"+
		"\u06e5\3\2\2\2\u06d8\u06d9\f\5\2\2\u06d9\u06e4\5\u010e\u0088\2\u06da\u06db"+
		"\f\4\2\2\u06db\u06dd\7Z\2\2\u06dc\u06de\5b\62\2\u06dd\u06dc\3\2\2\2\u06dd"+
		"\u06de\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e1\7[\2\2\u06e0\u06e2\5\u00ee"+
		"x\2\u06e1\u06e0\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e4\3\2\2\2\u06e3"+
		"\u06d8\3\2\2\2\u06e3\u06da\3\2\2\2\u06e4\u06e7\3\2\2\2\u06e5\u06e3\3\2"+
		"\2\2\u06e5\u06e6\3\2\2\2\u06e6\u010d\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e8"+
		"\u06e9\7X\2\2\u06e9\u06ea\5\u0128\u0095\2\u06ea\u06ec\7Y\2\2\u06eb\u06ed"+
		"\5\u0114\u008b\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ef\3"+
		"\2\2\2\u06ee\u06f0\5\u0118\u008d\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2"+
		"\2\2\u06f0\u06f2\3\2\2\2\u06f1\u06f3\5\u01a0\u00d1\2\u06f2\u06f1\3\2\2"+
		"\2\u06f2\u06f3\3\2\2\2\u06f3\u06f5\3\2\2\2\u06f4\u06f6\5\u00eex\2\u06f5"+
		"\u06f4\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u010f\3\2\2\2\u06f7\u06f8\7\u0081"+
		"\2\2\u06f8\u06fa\5\u00b4[\2\u06f9\u06fb\5\u011e\u0090\2\u06fa\u06f9\3"+
		"\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u0111\3\2\2\2\u06fc\u06fe\7`\2\2\u06fd"+
		"\u06ff\5\u00eex\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0701"+
		"\3\2\2\2\u0700\u0702\5\u0114\u008b\2\u0701\u0700\3\2\2\2\u0701\u0702\3"+
		"\2\2\2\u0702\u0714\3\2\2\2\u0703\u0705\7d\2\2\u0704\u0706\5\u00eex\2\u0705"+
		"\u0704\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0714\3\2\2\2\u0707\u0709\7\5"+
		"\2\2\u0708\u070a\5\u00eex\2\u0709\u0708\3\2\2\2\u0709\u070a\3\2\2\2\u070a"+
		"\u0714\3\2\2\2\u070b\u070c\5\f\7\2\u070c\u070e\7`\2\2\u070d\u070f\5\u00ee"+
		"x\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0711\3\2\2\2\u0710"+
		"\u0712\5\u0114\u008b\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0714"+
		"\3\2\2\2\u0713\u06fc\3\2\2\2\u0713\u0703\3\2\2\2\u0713\u0707\3\2\2\2\u0713"+
		"\u070b\3\2\2\2\u0714\u0113\3\2\2\2\u0715\u0717\5\u0116\u008c\2\u0716\u0718"+
		"\5\u0114\u008b\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u0115\3"+
		"\2\2\2\u0719\u071a\t\t\2\2\u071a\u0117\3\2\2\2\u071b\u071c\t\n\2\2\u071c"+
		"\u0119\3\2\2\2\u071d\u071f\7\u0088\2\2\u071e\u071d\3\2\2\2\u071e\u071f"+
		"\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0721\5\6\4\2\u0721\u011b\3\2\2\2\u0722"+
		"\u0724\5\u00b2Z\2\u0723\u0725\5\u011e\u0090\2\u0724\u0723\3\2\2\2\u0724"+
		"\u0725\3\2\2\2\u0725\u011d\3\2\2\2\u0726\u072f\5\u0120\u0091\2\u0727\u0729"+
		"\5\u0122\u0092\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072a\3"+
		"\2\2\2\u072a\u072b\5\u010e\u0088\2\u072b\u072c\5\u0110\u0089\2\u072c\u072f"+
		"\3\2\2\2\u072d\u072f\5\u0124\u0093\2\u072e\u0726\3\2\2\2\u072e\u0728\3"+
		"\2\2\2\u072e\u072d\3\2\2\2\u072f\u011f\3\2\2\2\u0730\u0736\5\u0122\u0092"+
		"\2\u0731\u0733\5\u0112\u008a\2\u0732\u0734\5\u0120\u0091\2\u0733\u0732"+
		"\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0736\3\2\2\2\u0735\u0730\3\2\2\2\u0735"+
		"\u0731\3\2\2\2\u0736\u0121\3\2\2\2\u0737\u0738\b\u0092\1\2\u0738\u0746"+
		"\5\u010e\u0088\2\u0739\u073b\7Z\2\2\u073a\u073c\5b\62\2\u073b\u073a\3"+
		"\2\2\2\u073b\u073c\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\7[\2\2\u073e"+
		"\u0740\5\u00eex\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0746"+
		"\3\2\2\2\u0741\u0742\7X\2\2\u0742\u0743\5\u0120\u0091\2\u0743\u0744\7"+
		"Y\2\2\u0744\u0746\3\2\2\2\u0745\u0737\3\2\2\2\u0745\u0739\3\2\2\2\u0745"+
		"\u0741\3\2\2\2\u0746\u0754\3\2\2\2\u0747\u0748\f\7\2\2\u0748\u0753\5\u010e"+
		"\u0088\2\u0749\u074a\f\5\2\2\u074a\u074c\7Z\2\2\u074b\u074d\5b\62\2\u074c"+
		"\u074b\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u0750\7["+
		"\2\2\u074f\u0751\5\u00eex\2\u0750\u074f\3\2\2\2\u0750\u0751\3\2\2\2\u0751"+
		"\u0753\3\2\2\2\u0752\u0747\3\2\2\2\u0752\u0749\3\2\2\2\u0753\u0756\3\2"+
		"\2\2\u0754\u0752\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0123\3\2\2\2\u0756"+
		"\u0754\3\2\2\2\u0757\u075c\5\u0126\u0094\2\u0758\u0759\5\u0112\u008a\2"+
		"\u0759\u075a\5\u0124\u0093\2\u075a\u075c\3\2\2\2\u075b\u0757\3\2\2\2\u075b"+
		"\u0758\3\2\2\2\u075c\u0125\3\2\2\2\u075d\u075e\b\u0094\1\2\u075e\u075f"+
		"\7\u0088\2\2\u075f\u076d\3\2\2\2\u0760\u0761\f\5\2\2\u0761\u076c\5\u010e"+
		"\u0088\2\u0762\u0763\f\4\2\2\u0763\u0765\7Z\2\2\u0764\u0766\5b\62\2\u0765"+
		"\u0764\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0769\7["+
		"\2\2\u0768\u076a\5\u00eex\2\u0769\u0768\3\2\2\2\u0769\u076a\3\2\2\2\u076a"+
		"\u076c\3\2\2\2\u076b\u0760\3\2\2\2\u076b\u0762\3\2\2\2\u076c\u076f\3\2"+
		"\2\2\u076d\u076b\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u0127\3\2\2\2\u076f"+
		"\u076d\3\2\2\2\u0770\u0772\5\u012a\u0096\2\u0771\u0770\3\2\2\2\u0771\u0772"+
		"\3\2\2\2\u0772\u0774\3\2\2\2\u0773\u0775\7\u0088\2\2\u0774\u0773\3\2\2"+
		"\2\u0774\u0775\3\2\2\2\u0775\u077b\3\2\2\2\u0776\u0777\5\u012a\u0096\2"+
		"\u0777\u0778\7\177\2\2\u0778\u0779\7\u0088\2\2\u0779\u077b\3\2\2\2\u077a"+
		"\u0771\3\2\2\2\u077a\u0776\3\2\2\2\u077b\u0129\3\2\2\2\u077c\u077d\b\u0096"+
		"\1\2\u077d\u077e\5\u012c\u0097\2\u077e\u0784\3\2\2\2\u077f\u0780\f\3\2"+
		"\2\u0780\u0781\7\177\2\2\u0781\u0783\5\u012c\u0097\2\u0782\u077f\3\2\2"+
		"\2\u0783\u0786\3\2\2\2\u0784\u0782\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u012b"+
		"\3\2\2\2\u0786\u0784\3\2\2\2\u0787\u0789\5\u00eex\2\u0788\u0787\3\2\2"+
		"\2\u0788\u0789\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b\5\u00a6T\2\u078b"+
		"\u078c\5\u0108\u0085\2\u078c\u07a7\3\2\2\2\u078d\u078f\5\u00eex\2\u078e"+
		"\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0791\5\u00a6"+
		"T\2\u0791\u0792\5\u0108\u0085\2\u0792\u0793\7h\2\2\u0793\u0794\5\u0138"+
		"\u009d\2\u0794\u07a7\3\2\2\2\u0795\u0797\5\u00eex\2\u0796\u0795\3\2\2"+
		"\2\u0796\u0797\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u079a\5\u00a6T\2\u0799"+
		"\u079b\5\u011e\u0090\2\u079a\u0799\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u07a7"+
		"\3\2\2\2\u079c\u079e\5\u00eex\2\u079d\u079c\3\2\2\2\u079d\u079e\3\2\2"+
		"\2\u079e\u079f\3\2\2\2\u079f\u07a1\5\u00a6T\2\u07a0\u07a2\5\u011e\u0090"+
		"\2\u07a1\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4"+
		"\7h\2\2\u07a4\u07a5\5\u0138\u009d\2\u07a5\u07a7\3\2\2\2\u07a6\u0788\3"+
		"\2\2\2\u07a6\u078e\3\2\2\2\u07a6\u0796\3\2\2\2\u07a6\u079d\3\2\2\2\u07a7"+
		"\u012d\3\2\2\2\u07a8\u07a9\5\u0130\u0099\2\u07a9\u07aa\5\u0132\u009a\2"+
		"\u07aa\u012f\3\2\2\2\u07ab\u07ad\5\u00eex\2\u07ac\u07ab\3\2\2\2\u07ac"+
		"\u07ad\3\2\2\2\u07ad\u07af\3\2\2\2\u07ae\u07b0\5\u00a6T\2\u07af\u07ae"+
		"\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b3\5\u0108\u0085"+
		"\2\u07b2\u07b4\5\u0152\u00aa\2\u07b3\u07b2\3\2\2\2\u07b3\u07b4\3\2\2\2"+
		"\u07b4\u0131\3\2\2\2\u07b5\u07b7\5\u016a\u00b6\2\u07b6\u07b5\3\2\2\2\u07b6"+
		"\u07b7\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07c1\5l\67\2\u07b9\u07c1\5\u0190"+
		"\u00c9\2\u07ba\u07bb\7h\2\2\u07bb\u07bc\7\36\2\2\u07bc\u07c1\7\u0085\2"+
		"\2\u07bd\u07be\7h\2\2\u07be\u07bf\7\37\2\2\u07bf\u07c1\7\u0085\2\2\u07c0"+
		"\u07b6\3\2\2\2\u07c0\u07b9\3\2\2\2\u07c0\u07ba\3\2\2\2\u07c0\u07bd\3\2"+
		"\2\2\u07c1\u0133\3\2\2\2\u07c2\u07c8\5\u0136\u009c\2\u07c3\u07c4\7X\2"+
		"\2\u07c4\u07c5\5&\24\2\u07c5\u07c6\7Y\2\2\u07c6\u07c8\3\2\2\2\u07c7\u07c2"+
		"\3\2\2\2\u07c7\u07c3\3\2\2\2\u07c8\u0135\3\2\2\2\u07c9\u07ca\7h\2\2\u07ca"+
		"\u07cd\5\u0138\u009d\2\u07cb\u07cd\5\u013c\u009f\2\u07cc\u07c9\3\2\2\2"+
		"\u07cc\u07cb\3\2\2\2\u07cd\u0137\3\2\2\2\u07ce\u07d1\5\\/\2\u07cf\u07d1"+
		"\5\u013c\u009f\2\u07d0\u07ce\3\2\2\2\u07d0\u07cf\3\2\2\2\u07d1\u0139\3"+
		"\2\2\2\u07d2\u07d3\b\u009e\1\2\u07d3\u07d5\5\u0138\u009d\2\u07d4\u07d6"+
		"\7\u0088\2\2\u07d5\u07d4\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u07df\3\2\2"+
		"\2\u07d7\u07d8\f\3\2\2\u07d8\u07d9\7\177\2\2\u07d9\u07db\5\u0138\u009d"+
		"\2\u07da\u07dc\7\u0088\2\2\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc"+
		"\u07de\3\2\2\2\u07dd\u07d7\3\2\2\2\u07de\u07e1\3\2\2\2\u07df\u07dd\3\2"+
		"\2\2\u07df\u07e0\3\2\2\2\u07e0\u013b\3\2\2\2\u07e1\u07df\3\2\2\2\u07e2"+
		"\u07e3\7\\\2\2\u07e3\u07e5\5\u013a\u009e\2\u07e4\u07e6\7\177\2\2\u07e5"+
		"\u07e4\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\7]"+
		"\2\2\u07e8\u07ec\3\2\2\2\u07e9\u07ea\7\\\2\2\u07ea\u07ec\7]\2\2\u07eb"+
		"\u07e2\3\2\2\2\u07eb\u07e9\3\2\2\2\u07ec\u013d\3\2\2\2\u07ed\u07f0\7\u0089"+
		"\2\2\u07ee\u07f0\5\u017e\u00c0\2\u07ef\u07ed\3\2\2\2\u07ef\u07ee\3\2\2"+
		"\2\u07f0\u013f\3\2\2\2\u07f1\u07f2\5\u0142\u00a2\2\u07f2\u07f4\7\\\2\2"+
		"\u07f3\u07f5\5\u014a\u00a6\2\u07f4\u07f3\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5"+
		"\u07f6\3\2\2\2\u07f6\u07f7\7]\2\2\u07f7\u0141\3\2\2\2\u07f8\u07fa\5\u0148"+
		"\u00a5\2\u07f9\u07fb\5\u00eex\2\u07fa\u07f9\3\2\2\2\u07fa\u07fb\3\2\2"+
		"\2\u07fb\u07fc\3\2\2\2\u07fc\u07fe\5\u0144\u00a3\2\u07fd\u07ff\5\u0146"+
		"\u00a4\2\u07fe\u07fd\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0801\3\2\2\2\u0800"+
		"\u0802\5\u0158\u00ad\2\u0801\u0800\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u080b"+
		"\3\2\2\2\u0803\u0805\5\u0148\u00a5\2\u0804\u0806\5\u00eex\2\u0805\u0804"+
		"\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u0808\3\2\2\2\u0807\u0809\5\u0158\u00ad"+
		"\2\u0808\u0807\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080b\3\2\2\2\u080a\u07f8"+
		"\3\2\2\2\u080a\u0803\3\2\2\2\u080b\u0143\3\2\2\2\u080c\u080e\5\f\7\2\u080d"+
		"\u080c\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u080f\3\2\2\2\u080f\u0810\5\u013e"+
		"\u00a0\2\u0810\u0145\3\2\2\2\u0811\u0812\7)\2\2\u0812\u0147\3\2\2\2\u0813"+
		"\u0814\t\13\2\2\u0814\u0149\3\2\2\2\u0815\u0817\5\u014c\u00a7\2\u0816"+
		"\u0818\5\u014a\u00a6\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081f"+
		"\3\2\2\2\u0819\u081a\5\u0162\u00b2\2\u081a\u081c\7\u0083\2\2\u081b\u081d"+
		"\5\u014a\u00a6\2\u081c\u081b\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081f\3"+
		"\2\2\2\u081e\u0815\3\2\2\2\u081e\u0819\3\2\2\2\u081f\u014b\3\2\2\2\u0820"+
		"\u0822\5\u00eex\2\u0821\u0820\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0824"+
		"\3\2\2\2\u0823\u0825\5\u00a6T\2\u0824\u0823\3\2\2\2\u0824\u0825\3\2\2"+
		"\2\u0825\u0827\3\2\2\2\u0826\u0828\5\u014e\u00a8\2\u0827\u0826\3\2\2\2"+
		"\u0827\u0828\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u0831\7\u0085\2\2\u082a"+
		"\u0831\5\u012e\u0098\2\u082b\u0831\5\u00e6t\2\u082c\u0831\5\u009eP\2\u082d"+
		"\u0831\5\u0176\u00bc\2\u082e\u0831\5\u009aN\2\u082f\u0831\5\u00a0Q\2\u0830"+
		"\u0821\3\2\2\2\u0830\u082a\3\2\2\2\u0830\u082b\3\2\2\2\u0830\u082c\3\2"+
		"\2\2\u0830\u082d\3\2\2\2\u0830\u082e\3\2\2\2\u0830\u082f\3\2\2\2\u0831"+
		"\u014d\3\2\2\2\u0832\u0833\b\u00a8\1\2\u0833\u0834\5\u0150\u00a9\2\u0834"+
		"\u083a\3\2\2\2\u0835\u0836\f\3\2\2\u0836\u0837\7\177\2\2\u0837\u0839\5"+
		"\u0150\u00a9\2\u0838\u0835\3\2\2\2\u0839\u083c\3\2\2\2\u083a\u0838\3\2"+
		"\2\2\u083a\u083b\3\2\2\2\u083b\u014f\3\2\2\2\u083c\u083a\3\2\2\2\u083d"+
		"\u083f\5\u0108\u0085\2\u083e\u0840\5\u0152\u00aa\2\u083f\u083e\3\2\2\2"+
		"\u083f\u0840\3\2\2\2\u0840\u0842\3\2\2\2\u0841\u0843\5\u0156\u00ac\2\u0842"+
		"\u0841\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0851\3\2\2\2\u0844\u0846\5\u0108"+
		"\u0085\2\u0845\u0847\5\u0136\u009c\2\u0846\u0845\3\2\2\2\u0846\u0847\3"+
		"\2\2\2\u0847\u0851\3\2\2\2\u0848\u084a\7\u0089\2\2\u0849\u0848\3\2\2\2"+
		"\u0849\u084a\3\2\2\2\u084a\u084c\3\2\2\2\u084b\u084d\5\u00eex\2\u084c"+
		"\u084b\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\7\u0083"+
		"\2\2\u084f\u0851\5b\62\2\u0850\u083d\3\2\2\2\u0850\u0844\3\2\2\2\u0850"+
		"\u0849\3\2\2\2\u0851\u0151\3\2\2\2\u0852\u0853\b\u00aa\1\2\u0853\u0854"+
		"\5\u0154\u00ab\2\u0854\u0859\3\2\2\2\u0855\u0856\f\3\2\2\u0856\u0858\5"+
		"\u0154\u00ab\2\u0857\u0855\3\2\2\2\u0858\u085b\3\2\2\2\u0859\u0857\3\2"+
		"\2\2\u0859\u085a\3\2\2\2\u085a\u0153\3\2\2\2\u085b\u0859\3\2\2\2\u085c"+
		"\u085d\t\f\2\2\u085d\u0155\3\2\2\2\u085e\u085f\7h\2\2\u085f\u0860\7\u008c"+
		"\2\2\u0860\u0861\b\u00ac\1\2\u0861\u0157\3\2\2\2\u0862\u0863\7\u0083\2"+
		"\2\u0863\u0864\5\u015a\u00ae\2\u0864\u0159\3\2\2\2\u0865\u0866\b\u00ae"+
		"\1\2\u0866\u0868\5\u015c\u00af\2\u0867\u0869\7\u0088\2\2\u0868\u0867\3"+
		"\2\2\2\u0868\u0869\3\2\2\2\u0869\u0872\3\2\2\2\u086a\u086b\f\3\2\2\u086b"+
		"\u086c\7\177\2\2\u086c\u086e\5\u015c\u00af\2\u086d\u086f\7\u0088\2\2\u086e"+
		"\u086d\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0871\3\2\2\2\u0870\u086a\3\2"+
		"\2\2\u0871\u0874\3\2\2\2\u0872\u0870\3\2\2\2\u0872\u0873\3\2\2\2\u0873"+
		"\u015b\3\2\2\2\u0874\u0872\3\2\2\2\u0875\u0877\5\u00eex\2\u0876\u0875"+
		"\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u088b\5\u0160\u00b1"+
		"\2\u0879\u087b\5\u00eex\2\u087a\u0879\3\2\2\2\u087a\u087b\3\2\2\2\u087b"+
		"\u087c\3\2\2\2\u087c\u087e\7S\2\2\u087d\u087f\5\u0162\u00b2\2\u087e\u087d"+
		"\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u088b\5\u0160\u00b1"+
		"\2\u0881\u0883\5\u00eex\2\u0882\u0881\3\2\2\2\u0882\u0883\3\2\2\2\u0883"+
		"\u0884\3\2\2\2\u0884\u0886\5\u0162\u00b2\2\u0885\u0887\7S\2\2\u0886\u0885"+
		"\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\5\u0160\u00b1"+
		"\2\u0889\u088b\3\2\2\2\u088a\u0876\3\2\2\2\u088a\u087a\3\2\2\2\u088a\u0882"+
		"\3\2\2\2\u088b\u015d\3\2\2\2\u088c\u088e\5\f\7\2\u088d\u088c\3\2\2\2\u088d"+
		"\u088e\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0892\5\u013e\u00a0\2\u0890\u0892"+
		"\5\u00ba^\2\u0891\u088d\3\2\2\2\u0891\u0890\3\2\2\2\u0892\u015f\3\2\2"+
		"\2\u0893\u0894\5\u015e\u00b0\2\u0894\u0161\3\2\2\2\u0895\u0896\t\r\2\2"+
		"\u0896\u0163\3\2\2\2\u0897\u0898\7\67\2\2\u0898\u0899\5\u0166\u00b4\2"+
		"\u0899\u0165\3\2\2\2\u089a\u089c\5\u00b2Z\2\u089b\u089d\5\u0168\u00b5"+
		"\2\u089c\u089b\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u0167\3\2\2\2\u089e\u08a0"+
		"\5\u0112\u008a\2\u089f\u08a1\5\u0168\u00b5\2\u08a0\u089f\3\2\2\2\u08a0"+
		"\u08a1\3\2\2\2\u08a1\u0169\3\2\2\2\u08a2\u08a3\7\u0083\2\2\u08a3\u08a4"+
		"\5\u016c\u00b7\2\u08a4\u016b\3\2\2\2\u08a5\u08a7\5\u016e\u00b8\2\u08a6"+
		"\u08a8\7\u0088\2\2\u08a7\u08a6\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08b1"+
		"\3\2\2\2\u08a9\u08ab\5\u016e\u00b8\2\u08aa\u08ac\7\u0088\2\2\u08ab\u08aa"+
		"\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08ae\7\177\2\2"+
		"\u08ae\u08af\5\u016c\u00b7\2\u08af\u08b1\3\2\2\2\u08b0\u08a5\3\2\2\2\u08b0"+
		"\u08a9\3\2\2\2\u08b1\u016d\3\2\2\2\u08b2\u08b3\5\u0170\u00b9\2\u08b3\u08b5"+
		"\7X\2\2\u08b4\u08b6\5&\24\2\u08b5\u08b4\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6"+
		"\u08b7\3\2\2\2\u08b7\u08b8\7Y\2\2\u08b8\u08bd\3\2\2\2\u08b9\u08ba\5\u0170"+
		"\u00b9\2\u08ba\u08bb\5\u013c\u009f\2\u08bb\u08bd\3\2\2\2\u08bc\u08b2\3"+
		"\2\2\2\u08bc\u08b9\3\2\2\2\u08bd\u016f\3\2\2\2\u08be\u08c1\5\u015e\u00b0"+
		"\2\u08bf\u08c1\7\u0089\2\2\u08c0\u08be\3\2\2\2\u08c0\u08bf\3\2\2\2\u08c1"+
		"\u0171\3\2\2\2\u08c2\u08c3\7\67\2\2\u08c3\u08c4\5\u01a8\u00d5\2\u08c4"+
		"\u0173\3\2\2\2\u08c5\u08c6\7\67\2\2\u08c6\u08c7\7\u0092\2\2\u08c7\u08cb"+
		"\7\u0089\2\2\u08c8\u08c9\7\67\2\2\u08c9\u08cb\7\u0095\2\2\u08ca\u08c5"+
		"\3\2\2\2\u08ca\u08c8\3\2\2\2\u08cb\u0175\3\2\2\2\u08cc\u08cd\7G\2\2\u08cd"+
		"\u08ce\7i\2\2\u08ce\u08cf\5\u0178\u00bd\2\u08cf\u08d0\7j\2\2\u08d0\u08d1"+
		"\5\u0094K\2\u08d1\u0177\3\2\2\2\u08d2\u08d3\b\u00bd\1\2\u08d3\u08d4\5"+
		"\u017a\u00be\2\u08d4\u08da\3\2\2\2\u08d5\u08d6\f\3\2\2\u08d6\u08d7\7\177"+
		"\2\2\u08d7\u08d9\5\u017a\u00be\2\u08d8\u08d5\3\2\2\2\u08d9\u08dc\3\2\2"+
		"\2\u08da\u08d8\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u0179\3\2\2\2\u08dc\u08da"+
		"\3\2\2\2\u08dd\u08e0\5\u017c\u00bf\2\u08de\u08e0\5\u012c\u0097\2\u08df"+
		"\u08dd\3\2\2\2\u08df\u08de\3\2\2\2\u08e0\u017b\3\2\2\2\u08e1\u08e3\7\30"+
		"\2\2\u08e2\u08e4\7\u0088\2\2\u08e3\u08e2\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4"+
		"\u08e6\3\2\2\2\u08e5\u08e7\7\u0089\2\2\u08e6\u08e5\3\2\2\2\u08e6\u08e7"+
		"\3\2\2\2\u08e7\u0912\3\2\2\2\u08e8\u08ea\7\30\2\2\u08e9\u08eb\7\u0089"+
		"\2\2\u08ea\u08e9\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec"+
		"\u08ed\7h\2\2\u08ed\u0912\5\u011c\u008f\2\u08ee\u08f0\7O\2\2\u08ef\u08f1"+
		"\7\u0088\2\2\u08f0\u08ef\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f3\3\2\2"+
		"\2\u08f2\u08f4\7\u0089\2\2\u08f3\u08f2\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4"+
		"\u0912\3\2\2\2\u08f5\u08f7\7O\2\2\u08f6\u08f8\7\u0089\2\2\u08f7\u08f6"+
		"\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fa\7h\2\2\u08fa"+
		"\u0912\5\u011c\u008f\2\u08fb\u08fc\7G\2\2\u08fc\u08fd\7i\2\2\u08fd\u08fe"+
		"\5\u0178\u00bd\2\u08fe\u08ff\7j\2\2\u08ff\u0901\7\30\2\2\u0900\u0902\7"+
		"\u0088\2\2\u0901\u0900\3\2\2\2\u0901\u0902\3\2\2\2\u0902\u0904\3\2\2\2"+
		"\u0903\u0905\7\u0089\2\2\u0904\u0903\3\2\2\2\u0904\u0905\3\2\2\2\u0905"+
		"\u0912\3\2\2\2\u0906\u0907\7G\2\2\u0907\u0908\7i\2\2\u0908\u0909\5\u0178"+
		"\u00bd\2\u0909\u090a\7j\2\2\u090a\u090c\7\30\2\2\u090b\u090d\7\u0089\2"+
		"\2\u090c\u090b\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u090f"+
		"\7h\2\2\u090f\u0910\5\6\4\2\u0910\u0912\3\2\2\2\u0911\u08e1\3\2\2\2\u0911"+
		"\u08e8\3\2\2\2\u0911\u08ee\3\2\2\2\u0911\u08f5\3\2\2\2\u0911\u08fb\3\2"+
		"\2\2\u0911\u0906\3\2\2\2\u0912\u017d\3\2\2\2\u0913\u0914\5\u0182\u00c2"+
		"\2\u0914\u0916\7i\2\2\u0915\u0917\5\u0184\u00c3\2\u0916\u0915\3\2\2\2"+
		"\u0916\u0917\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u0919\7j\2\2\u0919\u017f"+
		"\3\2\2\2\u091a\u092a\5\u017e\u00c0\2\u091b\u091c\5\u0172\u00ba\2\u091c"+
		"\u091e\7i\2\2\u091d\u091f\5\u0184\u00c3\2\u091e\u091d\3\2\2\2\u091e\u091f"+
		"\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0921\7j\2\2\u0921\u092a\3\2\2\2\u0922"+
		"\u0923\5\u0174\u00bb\2\u0923\u0925\7i\2\2\u0924\u0926\5\u0184\u00c3\2"+
		"\u0925\u0924\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0928"+
		"\7j\2\2\u0928\u092a\3\2\2\2\u0929\u091a\3\2\2\2\u0929\u091b\3\2\2\2\u0929"+
		"\u0922\3\2\2\2\u092a\u0181\3\2\2\2\u092b\u092c\7\u0089\2\2\u092c\u0183"+
		"\3\2\2\2\u092d\u092e\b\u00c3\1\2\u092e\u0930\5\u0186\u00c4\2\u092f\u0931"+
		"\7\u0088\2\2\u0930\u092f\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u093a\3\2\2"+
		"\2\u0932\u0933\f\3\2\2\u0933\u0934\7\177\2\2\u0934\u0936\5\u0186\u00c4"+
		"\2\u0935\u0937\7\u0088\2\2\u0936\u0935\3\2\2\2\u0936\u0937\3\2\2\2\u0937"+
		"\u0939\3\2\2\2\u0938\u0932\3\2\2\2\u0939\u093c\3\2\2\2\u093a\u0938\3\2"+
		"\2\2\u093a\u093b\3\2\2\2\u093b\u0185\3\2\2\2\u093c\u093a\3\2\2\2\u093d"+
		"\u0941\5\u011c\u008f\2\u093e\u0941\5b\62\2\u093f\u0941\5\6\4\2\u0940\u093d"+
		"\3\2\2\2\u0940\u093e\3\2\2\2\u0940\u093f\3\2\2\2\u0941\u0187\3\2\2\2\u0942"+
		"\u0943\7O\2\2\u0943\u0944\5\f\7\2\u0944\u0945\7\u0089\2\2\u0945\u094e"+
		"\3\2\2\2\u0946\u0947\7O\2\2\u0947\u0949\5\f\7\2\u0948\u094a\7G\2\2\u0949"+
		"\u0948\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\5\u017e"+
		"\u00c0\2\u094c\u094e\3\2\2\2\u094d\u0942\3\2\2\2\u094d\u0946\3\2\2\2\u094e"+
		"\u0189\3\2\2\2\u094f\u0951\7\'\2\2\u0950\u094f\3\2\2\2\u0950\u0951\3\2"+
		"\2\2\u0951\u0952\3\2\2\2\u0952\u0953\7G\2\2\u0953\u0954\5\u0094K\2\u0954"+
		"\u018b\3\2\2\2\u0955\u0956\7G\2\2\u0956\u0957\7i\2\2\u0957\u0958\7j\2"+
		"\2\u0958\u0959\5\u0094K\2\u0959\u018d\3\2\2\2\u095a\u095b\5\u0192\u00ca"+
		"\2\u095b\u095c\5\u0196\u00cc\2\u095c\u018f\3\2\2\2\u095d\u095e\5\u0194"+
		"\u00cb\2\u095e\u095f\5\u0196\u00cc\2\u095f\u0191\3\2\2\2\u0960\u0961\7"+
		"L\2\2\u0961\u0962\5l\67\2\u0962\u0193\3\2\2\2\u0963\u0965\7L\2\2\u0964"+
		"\u0966\5\u016a\u00b6\2\u0965\u0964\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0967"+
		"\3\2\2\2\u0967\u0968\5l\67\2\u0968\u0195\3\2\2\2\u0969\u096b\5\u0198\u00cd"+
		"\2\u096a\u096c\5\u0196\u00cc\2\u096b\u096a\3\2\2\2\u096b\u096c\3\2\2\2"+
		"\u096c\u0197\3\2\2\2\u096d\u096e\5\u019a\u00ce\2\u096e\u096f\5l\67\2\u096f"+
		"\u0199\3\2\2\2\u0970\u0971\7\24\2\2\u0971\u0972\7X\2\2\u0972\u0973\5\u019c"+
		"\u00cf\2\u0973\u0974\7Y\2\2\u0974\u019b\3\2\2\2\u0975\u0977\5\u00eex\2"+
		"\u0976\u0975\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979"+
		"\5\u00b2Z\2\u0979\u097a\5\u0108\u0085\2\u097a\u0984\3\2\2\2\u097b\u097d"+
		"\5\u00eex\2\u097c\u097b\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u097e\3\2\2"+
		"\2\u097e\u0980\5\u00b2Z\2\u097f\u0981\5\u011e\u0090\2\u0980\u097f\3\2"+
		"\2\2\u0980\u0981\3\2\2\2\u0981\u0984\3\2\2\2\u0982\u0984\7\u0088\2\2\u0983"+
		"\u0976\3\2\2\2\u0983\u097c\3\2\2\2\u0983\u0982\3\2\2\2\u0984\u019d\3\2"+
		"\2\2\u0985\u0987\7J\2\2\u0986\u0988\5\\/\2\u0987\u0986\3\2\2\2\u0987\u0988"+
		"\3\2\2\2\u0988\u019f\3\2\2\2\u0989\u098c\5\u01a2\u00d2\2\u098a\u098c\5"+
		"\u01a6\u00d4\2\u098b\u0989\3\2\2\2\u098b\u098a\3\2\2\2\u098c\u01a1\3\2"+
		"\2\2\u098d\u098e\7J\2\2\u098e\u0990\7X\2\2\u098f\u0991\5\u01a4\u00d3\2"+
		"\u0990\u098f\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0993"+
		"\7Y\2\2\u0993\u01a3\3\2\2\2\u0994\u0995\b\u00d3\1\2\u0995\u0997\5\u011c"+
		"\u008f\2\u0996\u0998\7\u0088\2\2\u0997\u0996\3\2\2\2\u0997\u0998\3\2\2"+
		"\2\u0998\u09a1\3\2\2\2\u0999\u099a\f\3\2\2\u099a\u099b";
	private static final String _serializedATNSegment1 =
		"\7\177\2\2\u099b\u099d\5\u011c\u008f\2\u099c\u099e\7\u0088\2\2\u099d\u099c"+
		"\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u09a0\3\2\2\2\u099f\u0999\3\2\2\2\u09a0"+
		"\u09a3\3\2\2\2\u09a1\u099f\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u01a5\3\2"+
		"\2\2\u09a3\u09a1\3\2\2\2\u09a4\u09a5\7\65\2\2\u09a5\u09a6\7X\2\2\u09a6"+
		"\u09a7\5b\62\2\u09a7\u09a8\7Y\2\2\u09a8\u09ab\3\2\2\2\u09a9\u09ab\7\65"+
		"\2\2\u09aa\u09a4\3\2\2\2\u09aa\u09a9\3\2\2\2\u09ab\u01a7\3\2\2\2\u09ac"+
		"\u09e0\7\64\2\2\u09ad\u09e0\7\37\2\2\u09ae\u09af\7\64\2\2\u09af\u09b0"+
		"\7Z\2\2\u09b0\u09e0\7[\2\2\u09b1\u09b2\7\37\2\2\u09b2\u09b3\7Z\2\2\u09b3"+
		"\u09e0\7[\2\2\u09b4\u09e0\7^\2\2\u09b5\u09e0\7_\2\2\u09b6\u09e0\7`\2\2"+
		"\u09b7\u09e0\7a\2\2\u09b8\u09e0\7b\2\2\u09b9\u09e0\7c\2\2\u09ba\u09e0"+
		"\7d\2\2\u09bb\u09e0\7e\2\2\u09bc\u09e0\7f\2\2\u09bd\u09e0\7\3\2\2\u09be"+
		"\u09e0\7\4\2\2\u09bf\u09e0\7h\2\2\u09c0\u09e0\7i\2\2\u09c1\u09e0\7j\2"+
		"\2\u09c2\u09e0\7k\2\2\u09c3\u09e0\7l\2\2\u09c4\u09e0\7m\2\2\u09c5\u09e0"+
		"\7n\2\2\u09c6\u09e0\7o\2\2\u09c7\u09e0\7p\2\2\u09c8\u09e0\7q\2\2\u09c9"+
		"\u09e0\7r\2\2\u09ca\u09e0\7s\2\2\u09cb\u09e0\7t\2\2\u09cc\u09e0\7v\2\2"+
		"\u09cd\u09e0\7u\2\2\u09ce\u09e0\7w\2\2\u09cf\u09e0\7x\2\2\u09d0\u09e0"+
		"\7y\2\2\u09d1\u09e0\7z\2\2\u09d2\u09e0\7\5\2\2\u09d3\u09e0\7\6\2\2\u09d4"+
		"\u09e0\7\7\2\2\u09d5\u09e0\7\b\2\2\u09d6\u09e0\7}\2\2\u09d7\u09e0\7~\2"+
		"\2\u09d8\u09e0\7\177\2\2\u09d9\u09e0\7\u0080\2\2\u09da\u09e0\7\u0081\2"+
		"\2\u09db\u09dc\7X\2\2\u09dc\u09e0\7Y\2\2\u09dd\u09de\7Z\2\2\u09de\u09e0"+
		"\7[\2\2\u09df\u09ac\3\2\2\2\u09df\u09ad\3\2\2\2\u09df\u09ae\3\2\2\2\u09df"+
		"\u09b1\3\2\2\2\u09df\u09b4\3\2\2\2\u09df\u09b5\3\2\2\2\u09df\u09b6\3\2"+
		"\2\2\u09df\u09b7\3\2\2\2\u09df\u09b8\3\2\2\2\u09df\u09b9\3\2\2\2\u09df"+
		"\u09ba\3\2\2\2\u09df\u09bb\3\2\2\2\u09df\u09bc\3\2\2\2\u09df\u09bd\3\2"+
		"\2\2\u09df\u09be\3\2\2\2\u09df\u09bf\3\2\2\2\u09df\u09c0\3\2\2\2\u09df"+
		"\u09c1\3\2\2\2\u09df\u09c2\3\2\2\2\u09df\u09c3\3\2\2\2\u09df\u09c4\3\2"+
		"\2\2\u09df\u09c5\3\2\2\2\u09df\u09c6\3\2\2\2\u09df\u09c7\3\2\2\2\u09df"+
		"\u09c8\3\2\2\2\u09df\u09c9\3\2\2\2\u09df\u09ca\3\2\2\2\u09df\u09cb\3\2"+
		"\2\2\u09df\u09cc\3\2\2\2\u09df\u09cd\3\2\2\2\u09df\u09ce\3\2\2\2\u09df"+
		"\u09cf\3\2\2\2\u09df\u09d0\3\2\2\2\u09df\u09d1\3\2\2\2\u09df\u09d2\3\2"+
		"\2\2\u09df\u09d3\3\2\2\2\u09df\u09d4\3\2\2\2\u09df\u09d5\3\2\2\2\u09df"+
		"\u09d6\3\2\2\2\u09df\u09d7\3\2\2\2\u09df\u09d8\3\2\2\2\u09df\u09d9\3\2"+
		"\2\2\u09df\u09da\3\2\2\2\u09df\u09db\3\2\2\2\u09df\u09dd\3\2\2\2\u09e0"+
		"\u01a9\3\2\2\2\u09e1\u09e9\7\u008a\2\2\u09e2\u09e9\7\u0090\2\2\u09e3\u09e9"+
		"\7\u0091\2\2\u09e4\u09e9\7\u0092\2\2\u09e5\u09e9\5\u01ac\u00d7\2\u09e6"+
		"\u09e9\5\u01ae\u00d8\2\u09e7\u09e9\5\u01b0\u00d9\2\u09e8\u09e1\3\2\2\2"+
		"\u09e8\u09e2\3\2\2\2\u09e8\u09e3\3\2\2\2\u09e8\u09e4\3\2\2\2\u09e8\u09e5"+
		"\3\2\2\2\u09e8\u09e6\3\2\2\2\u09e8\u09e7\3\2\2\2\u09e9\u01ab\3\2\2\2\u09ea"+
		"\u09eb\t\16\2\2\u09eb\u01ad\3\2\2\2\u09ec\u09ed\7\66\2\2\u09ed\u01af\3"+
		"\2\2\2\u09ee\u09ef\t\17\2\2\u09ef\u01b1\3\2\2\2\u0142\u01b3\u01bf\u01c3"+
		"\u01ce\u01d2\u01e1\u01e8\u01ed\u01ef\u01f4\u01fa\u0204\u020b\u0211\u0215"+
		"\u021a\u0220\u0227\u022d\u0230\u0233\u0236\u023d\u0244\u0278\u0287\u028d"+
		"\u0293\u02a0\u02a2\u02ac\u02bb\u02c1\u02df\u02e4\u02e8\u02ec\u02ef\u02f3"+
		"\u02f9\u02fb\u0303\u0307\u030a\u0311\u0318\u031c\u0321\u0325\u0328\u032d"+
		"\u0333\u033e\u034d\u034f\u035e\u0360\u036c\u036e\u037a\u038e\u0390\u039c"+
		"\u039e\u03a9\u03b4\u03bf\u03cb\u03cd\u03d9\u03db\u03e5\u03ed\u03f9\u0400"+
		"\u0404\u0408\u040c\u0410\u0415\u0418\u041b\u0421\u0427\u042c\u0433\u0439"+
		"\u0444\u0452\u0460\u0468\u046e\u047a\u048a\u048e\u049b\u049e\u04a5\u04ad"+
		"\u04b7\u04be\u04c9\u04d6\u04dd\u04e5\u04e8\u04f2\u04f7\u04fe\u0501\u0506"+
		"\u050b\u0520\u0524\u0529\u0534\u053a\u053e\u0543\u0547\u054c\u054f\u0565"+
		"\u056b\u0576\u057a\u057d\u0587\u058d\u0590\u0597\u05a1\u05a5\u05a8\u05ab"+
		"\u05af\u05b4\u05b6\u05ba\u05be\u05c7\u05d4\u05dc\u05e2\u05e8\u05ec\u05ef"+
		"\u05f8\u0601\u0609\u0614\u061a\u0625\u0628\u062d\u063c\u0642\u064b\u0655"+
		"\u065b\u0663\u0667\u066b\u0670\u0675\u067c\u067e\u0683\u0687\u0695\u069b"+
		"\u06ad\u06af\u06b9\u06be\u06c5\u06cb\u06d0\u06d6\u06dd\u06e1\u06e3\u06e5"+
		"\u06ec\u06ef\u06f2\u06f5\u06fa\u06fe\u0701\u0705\u0709\u070e\u0711\u0713"+
		"\u0717\u071e\u0724\u0728\u072e\u0733\u0735\u073b\u073f\u0745\u074c\u0750"+
		"\u0752\u0754\u075b\u0765\u0769\u076b\u076d\u0771\u0774\u077a\u0784\u0788"+
		"\u078e\u0796\u079a\u079d\u07a1\u07a6\u07ac\u07af\u07b3\u07b6\u07c0\u07c7"+
		"\u07cc\u07d0\u07d5\u07db\u07df\u07e5\u07eb\u07ef\u07f4\u07fa\u07fe\u0801"+
		"\u0805\u0808\u080a\u080d\u0817\u081c\u081e\u0821\u0824\u0827\u0830\u083a"+
		"\u083f\u0842\u0846\u0849\u084c\u0850\u0859\u0868\u086e\u0872\u0876\u087a"+
		"\u087e\u0882\u0886\u088a\u088d\u0891\u089c\u08a0\u08a7\u08ab\u08b0\u08b5"+
		"\u08bc\u08c0\u08ca\u08da\u08df\u08e3\u08e6\u08ea\u08f0\u08f3\u08f7\u0901"+
		"\u0904\u090c\u0911\u0916\u091e\u0925\u0929\u0930\u0936\u093a\u0940\u0949"+
		"\u094d\u0950\u0965\u096b\u0976\u097c\u0980\u0983\u0987\u098b\u0990\u0997"+
		"\u099d\u09a1\u09aa\u09df\u09e8";
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