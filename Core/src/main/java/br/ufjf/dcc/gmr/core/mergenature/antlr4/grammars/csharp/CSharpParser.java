// Generated from CSharpParser.g4 by ANTLR 4.7.1
package br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.csharp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSharpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_ORDER_MARK=1, SINGLE_LINE_DOC_COMMENT=2, EMPTY_DELIMITED_DOC_COMMENT=3, 
		DELIMITED_DOC_COMMENT=4, SINGLE_LINE_COMMENT=5, DELIMITED_COMMENT=6, WHITESPACES=7, 
		SHARP=8, ABSTRACT=9, ADD=10, ALIAS=11, ARGLIST=12, AS=13, ASCENDING=14, 
		ASYNC=15, AWAIT=16, BASE=17, BOOL=18, BREAK=19, BY=20, BYTE=21, CASE=22, 
		CATCH=23, CHAR=24, CHECKED=25, CLASS=26, CONST=27, CONTINUE=28, DECIMAL=29, 
		DEFAULT=30, DELEGATE=31, DESCENDING=32, DO=33, DOUBLE=34, DYNAMIC=35, 
		ELSE=36, ENUM=37, EQUALS=38, EVENT=39, EXPLICIT=40, EXTERN=41, FALSE=42, 
		FINALLY=43, FIXED=44, FLOAT=45, FOR=46, FOREACH=47, FROM=48, GET=49, GOTO=50, 
		GROUP=51, IF=52, IMPLICIT=53, IN=54, INT=55, INTERFACE=56, INTERNAL=57, 
		INTO=58, IS=59, JOIN=60, LET=61, LOCK=62, LONG=63, NAMEOF=64, NAMESPACE=65, 
		NEW=66, NULL=67, OBJECT=68, ON=69, OPERATOR=70, ORDERBY=71, OUT=72, OVERRIDE=73, 
		PARAMS=74, PARTIAL=75, PRIVATE=76, PROTECTED=77, PUBLIC=78, READONLY=79, 
		REF=80, REMOVE=81, RETURN=82, SBYTE=83, SEALED=84, SELECT=85, SET=86, 
		SHORT=87, SIZEOF=88, STACKALLOC=89, STATIC=90, STRING=91, STRUCT=92, SWITCH=93, 
		THIS=94, THROW=95, TRUE=96, TRY=97, TYPEOF=98, UINT=99, ULONG=100, UNCHECKED=101, 
		UNMANAGED=102, UNSAFE=103, USHORT=104, USING=105, VAR=106, VIRTUAL=107, 
		VOID=108, VOLATILE=109, WHEN=110, WHERE=111, WHILE=112, YIELD=113, IDENTIFIER=114, 
		LITERAL_ACCESS=115, INTEGER_LITERAL=116, HEX_INTEGER_LITERAL=117, BIN_INTEGER_LITERAL=118, 
		REAL_LITERAL=119, CHARACTER_LITERAL=120, REGULAR_STRING=121, VERBATIUM_STRING=122, 
		INTERPOLATED_REGULAR_STRING_START=123, INTERPOLATED_VERBATIUM_STRING_START=124, 
		OPEN_BRACE=125, CLOSE_BRACE=126, OPEN_BRACKET=127, CLOSE_BRACKET=128, 
		OPEN_PARENS=129, CLOSE_PARENS=130, DOT=131, COMMA=132, COLON=133, SEMICOLON=134, 
		PLUS=135, MINUS=136, STAR=137, DIV=138, PERCENT=139, AMP=140, BITWISE_OR=141, 
		CARET=142, BANG=143, TILDE=144, ASSIGNMENT=145, LT=146, GT=147, INTERR=148, 
		DOUBLE_COLON=149, OP_COALESCING=150, OP_INC=151, OP_DEC=152, OP_AND=153, 
		OP_OR=154, OP_PTR=155, OP_EQ=156, OP_NE=157, OP_LE=158, OP_GE=159, OP_ADD_ASSIGNMENT=160, 
		OP_SUB_ASSIGNMENT=161, OP_MULT_ASSIGNMENT=162, OP_DIV_ASSIGNMENT=163, 
		OP_MOD_ASSIGNMENT=164, OP_AND_ASSIGNMENT=165, OP_OR_ASSIGNMENT=166, OP_XOR_ASSIGNMENT=167, 
		OP_LEFT_SHIFT=168, OP_LEFT_SHIFT_ASSIGNMENT=169, OP_COALESCING_ASSIGNMENT=170, 
		OP_RANGE=171, DOUBLE_CURLY_INSIDE=172, OPEN_BRACE_INSIDE=173, REGULAR_CHAR_INSIDE=174, 
		VERBATIUM_DOUBLE_QUOTE_INSIDE=175, DOUBLE_QUOTE_INSIDE=176, REGULAR_STRING_INSIDE=177, 
		VERBATIUM_INSIDE_STRING=178, CLOSE_BRACE_INSIDE=179, FORMAT_STRING=180, 
		DIRECTIVE_WHITESPACES=181, DIGITS=182, DEFINE=183, UNDEF=184, ELIF=185, 
		ENDIF=186, LINE=187, ERROR=188, WARNING=189, REGION=190, ENDREGION=191, 
		PRAGMA=192, NULLABLE=193, DIRECTIVE_HIDDEN=194, CONDITIONAL_SYMBOL=195, 
		DIRECTIVE_NEW_LINE=196, TEXT=197, DOUBLE_CURLY_CLOSE_INSIDE=198;
	public static final int
		RULE_compilation_unit = 0, RULE_namespace_or_type_name = 1, RULE_type_ = 2, 
		RULE_base_type = 3, RULE_tuple_type = 4, RULE_tuple_element = 5, RULE_simple_type = 6, 
		RULE_numeric_type = 7, RULE_integral_type = 8, RULE_floating_point_type = 9, 
		RULE_class_type = 10, RULE_type_argument_list = 11, RULE_argument_list = 12, 
		RULE_argument = 13, RULE_expression = 14, RULE_non_assignment_expression = 15, 
		RULE_assignment = 16, RULE_assignment_operator = 17, RULE_conditional_expression = 18, 
		RULE_null_coalescing_expression = 19, RULE_conditional_or_expression = 20, 
		RULE_conditional_and_expression = 21, RULE_inclusive_or_expression = 22, 
		RULE_exclusive_or_expression = 23, RULE_and_expression = 24, RULE_equality_expression = 25, 
		RULE_relational_expression = 26, RULE_shift_expression = 27, RULE_additive_expression = 28, 
		RULE_multiplicative_expression = 29, RULE_switch_expression = 30, RULE_switch_expression_arms = 31, 
		RULE_switch_expression_arm = 32, RULE_range_expression = 33, RULE_cast = 34, 
		RULE_unary_expression = 35, RULE_primary_expression = 36, RULE_primary_expression_start = 37, 
		RULE_throwable_expression = 38, RULE_throw_expression = 39, RULE_member_access = 40, 
		RULE_bracket_expression = 41, RULE_indexer_argument = 42, RULE_predefined_type = 43, 
		RULE_expression_list = 44, RULE_object_or_collection_initializer = 45, 
		RULE_object_initializer = 46, RULE_member_initializer_list = 47, RULE_member_initializer = 48, 
		RULE_initializer_value = 49, RULE_collection_initializer = 50, RULE_element_initializer = 51, 
		RULE_anonymous_object_initializer = 52, RULE_member_declarator_list = 53, 
		RULE_member_declarator = 54, RULE_unbound_type_name = 55, RULE_generic_dimension_specifier = 56, 
		RULE_isType = 57, RULE_isTypePatternArms = 58, RULE_isTypePatternArm = 59, 
		RULE_lambda_expression = 60, RULE_anonymous_function_signature = 61, RULE_explicit_anonymous_function_parameter_list = 62, 
		RULE_explicit_anonymous_function_parameter = 63, RULE_implicit_anonymous_function_parameter_list = 64, 
		RULE_anonymous_function_body = 65, RULE_query_expression = 66, RULE_from_clause = 67, 
		RULE_query_body = 68, RULE_query_body_clause = 69, RULE_let_clause = 70, 
		RULE_where_clause = 71, RULE_combined_join_clause = 72, RULE_orderby_clause = 73, 
		RULE_ordering = 74, RULE_select_or_group_clause = 75, RULE_query_continuation = 76, 
		RULE_statement = 77, RULE_declarationStatement = 78, RULE_local_function_declaration = 79, 
		RULE_local_function_header = 80, RULE_local_function_modifiers = 81, RULE_local_function_body = 82, 
		RULE_labeled_Statement = 83, RULE_embedded_statement = 84, RULE_if_expression = 85, 
		RULE_if_Statement = 86, RULE_switch_expressions = 87, RULE_switchStatement = 88, 
		RULE_selection_statements = 89, RULE_iteration_statements = 90, RULE_while_expression = 91, 
		RULE_whileStatement = 92, RULE_doStatement = 93, RULE_for_expression = 94, 
		RULE_forStatement = 95, RULE_foreach_expression = 96, RULE_foreachStatement = 97, 
		RULE_altered_jump_statements = 98, RULE_try_expression = 99, RULE_tryStatement = 100, 
		RULE_simple_embedded_statement = 101, RULE_block = 102, RULE_local_variable_declaration = 103, 
		RULE_local_variable_type = 104, RULE_local_variable_declarator = 105, 
		RULE_local_variable_initializer = 106, RULE_local_constant_declaration = 107, 
		RULE_if_body = 108, RULE_switch_section = 109, RULE_switch_label = 110, 
		RULE_case_guard = 111, RULE_statement_list = 112, RULE_for_initializer = 113, 
		RULE_for_iterator = 114, RULE_catch_clauses = 115, RULE_specific_catch_clause = 116, 
		RULE_specific_catch_clause_no_block = 117, RULE_general_catch_clause = 118, 
		RULE_exception_filter = 119, RULE_finally_clause = 120, RULE_resource_acquisition = 121, 
		RULE_namespace_declaration = 122, RULE_qualified_identifier = 123, RULE_namespace_body = 124, 
		RULE_extern_alias_directives = 125, RULE_extern_alias_directive = 126, 
		RULE_using_directives = 127, RULE_using_directive = 128, RULE_namespace_member_declarations = 129, 
		RULE_namespace_member_declaration = 130, RULE_type_declaration = 131, 
		RULE_qualified_alias_member = 132, RULE_type_parameter_list = 133, RULE_type_parameter = 134, 
		RULE_class_base = 135, RULE_interface_type_list = 136, RULE_type_parameter_constraints_clauses = 137, 
		RULE_type_parameter_constraints_clause = 138, RULE_type_parameter_constraints = 139, 
		RULE_primary_constraint = 140, RULE_secondary_constraints = 141, RULE_constructor_constraint = 142, 
		RULE_class_body = 143, RULE_class_member_declarations = 144, RULE_class_member_declaration = 145, 
		RULE_all_member_modifiers = 146, RULE_all_member_modifier = 147, RULE_common_member_declaration = 148, 
		RULE_typed_member_declaration = 149, RULE_constant_declarators = 150, 
		RULE_constant_declarator = 151, RULE_variable_declarators = 152, RULE_variable_declarator = 153, 
		RULE_variable_initializer = 154, RULE_return_type = 155, RULE_member_name = 156, 
		RULE_method_body = 157, RULE_formal_parameter_list = 158, RULE_fixed_parameters = 159, 
		RULE_fixed_parameter = 160, RULE_parameter_modifier = 161, RULE_parameter_array = 162, 
		RULE_accessor_declarations = 163, RULE_get_accessor_declaration = 164, 
		RULE_set_accessor_declaration = 165, RULE_accessor_modifier = 166, RULE_accessor_body = 167, 
		RULE_event_accessor_declarations = 168, RULE_add_accessor_declaration = 169, 
		RULE_remove_accessor_declaration = 170, RULE_overloadable_operator = 171, 
		RULE_conversion_operator_declarator = 172, RULE_constructor_initializer = 173, 
		RULE_body = 174, RULE_struct_interfaces = 175, RULE_struct_body = 176, 
		RULE_struct_member_declaration = 177, RULE_array_type = 178, RULE_rank_specifier = 179, 
		RULE_array_initializer = 180, RULE_variant_type_parameter_list = 181, 
		RULE_variant_type_parameter = 182, RULE_variance_annotation = 183, RULE_interface_signature = 184, 
		RULE_interface_base = 185, RULE_interface_body = 186, RULE_interface_member_declaration = 187, 
		RULE_interface_accessors = 188, RULE_enum_base = 189, RULE_enum_body = 190, 
		RULE_enum_member_declaration = 191, RULE_enum_signature = 192, RULE_global_attribute_section = 193, 
		RULE_global_attribute_target = 194, RULE_attributes = 195, RULE_attribute_section = 196, 
		RULE_attribute_target = 197, RULE_attribute_list = 198, RULE_attribute = 199, 
		RULE_attribute_argument = 200, RULE_pointer_type = 201, RULE_fixed_pointer_declarators = 202, 
		RULE_fixed_pointer_declarator = 203, RULE_fixed_pointer_initializer = 204, 
		RULE_fixed_size_buffer_declarator = 205, RULE_stackalloc_initializer = 206, 
		RULE_right_arrow = 207, RULE_right_shift = 208, RULE_right_shift_assignment = 209, 
		RULE_literal = 210, RULE_boolean_literal = 211, RULE_string_literal = 212, 
		RULE_interpolated_regular_string = 213, RULE_interpolated_verbatium_string = 214, 
		RULE_interpolated_regular_string_part = 215, RULE_interpolated_verbatium_string_part = 216, 
		RULE_interpolated_string_expression = 217, RULE_keyword = 218, RULE_class_members = 219, 
		RULE_class_definition = 220, RULE_class_signature = 221, RULE_struct_definition = 222, 
		RULE_interface_definition = 223, RULE_enum_definition = 224, RULE_delegate_definition = 225, 
		RULE_event_declaration = 226, RULE_field_declaration = 227, RULE_property_declaration = 228, 
		RULE_constant_declaration = 229, RULE_indexer_declaration = 230, RULE_destructor_definition = 231, 
		RULE_constructor_declaration = 232, RULE_method_expressions = 233, RULE_method_declaration = 234, 
		RULE_method_signature = 235, RULE_method_member_name = 236, RULE_operator_declaration = 237, 
		RULE_arg_declaration = 238, RULE_method_invocation = 239, RULE_object_creation_expression = 240, 
		RULE_identifier = 241;
	public static final String[] ruleNames = {
		"compilation_unit", "namespace_or_type_name", "type_", "base_type", "tuple_type", 
		"tuple_element", "simple_type", "numeric_type", "integral_type", "floating_point_type", 
		"class_type", "type_argument_list", "argument_list", "argument", "expression", 
		"non_assignment_expression", "assignment", "assignment_operator", "conditional_expression", 
		"null_coalescing_expression", "conditional_or_expression", "conditional_and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "and_expression", 
		"equality_expression", "relational_expression", "shift_expression", "additive_expression", 
		"multiplicative_expression", "switch_expression", "switch_expression_arms", 
		"switch_expression_arm", "range_expression", "cast", "unary_expression", 
		"primary_expression", "primary_expression_start", "throwable_expression", 
		"throw_expression", "member_access", "bracket_expression", "indexer_argument", 
		"predefined_type", "expression_list", "object_or_collection_initializer", 
		"object_initializer", "member_initializer_list", "member_initializer", 
		"initializer_value", "collection_initializer", "element_initializer", 
		"anonymous_object_initializer", "member_declarator_list", "member_declarator", 
		"unbound_type_name", "generic_dimension_specifier", "isType", "isTypePatternArms", 
		"isTypePatternArm", "lambda_expression", "anonymous_function_signature", 
		"explicit_anonymous_function_parameter_list", "explicit_anonymous_function_parameter", 
		"implicit_anonymous_function_parameter_list", "anonymous_function_body", 
		"query_expression", "from_clause", "query_body", "query_body_clause", 
		"let_clause", "where_clause", "combined_join_clause", "orderby_clause", 
		"ordering", "select_or_group_clause", "query_continuation", "statement", 
		"declarationStatement", "local_function_declaration", "local_function_header", 
		"local_function_modifiers", "local_function_body", "labeled_Statement", 
		"embedded_statement", "if_expression", "if_Statement", "switch_expressions", 
		"switchStatement", "selection_statements", "iteration_statements", "while_expression", 
		"whileStatement", "doStatement", "for_expression", "forStatement", "foreach_expression", 
		"foreachStatement", "altered_jump_statements", "try_expression", "tryStatement", 
		"simple_embedded_statement", "block", "local_variable_declaration", "local_variable_type", 
		"local_variable_declarator", "local_variable_initializer", "local_constant_declaration", 
		"if_body", "switch_section", "switch_label", "case_guard", "statement_list", 
		"for_initializer", "for_iterator", "catch_clauses", "specific_catch_clause", 
		"specific_catch_clause_no_block", "general_catch_clause", "exception_filter", 
		"finally_clause", "resource_acquisition", "namespace_declaration", "qualified_identifier", 
		"namespace_body", "extern_alias_directives", "extern_alias_directive", 
		"using_directives", "using_directive", "namespace_member_declarations", 
		"namespace_member_declaration", "type_declaration", "qualified_alias_member", 
		"type_parameter_list", "type_parameter", "class_base", "interface_type_list", 
		"type_parameter_constraints_clauses", "type_parameter_constraints_clause", 
		"type_parameter_constraints", "primary_constraint", "secondary_constraints", 
		"constructor_constraint", "class_body", "class_member_declarations", "class_member_declaration", 
		"all_member_modifiers", "all_member_modifier", "common_member_declaration", 
		"typed_member_declaration", "constant_declarators", "constant_declarator", 
		"variable_declarators", "variable_declarator", "variable_initializer", 
		"return_type", "member_name", "method_body", "formal_parameter_list", 
		"fixed_parameters", "fixed_parameter", "parameter_modifier", "parameter_array", 
		"accessor_declarations", "get_accessor_declaration", "set_accessor_declaration", 
		"accessor_modifier", "accessor_body", "event_accessor_declarations", "add_accessor_declaration", 
		"remove_accessor_declaration", "overloadable_operator", "conversion_operator_declarator", 
		"constructor_initializer", "body", "struct_interfaces", "struct_body", 
		"struct_member_declaration", "array_type", "rank_specifier", "array_initializer", 
		"variant_type_parameter_list", "variant_type_parameter", "variance_annotation", 
		"interface_signature", "interface_base", "interface_body", "interface_member_declaration", 
		"interface_accessors", "enum_base", "enum_body", "enum_member_declaration", 
		"enum_signature", "global_attribute_section", "global_attribute_target", 
		"attributes", "attribute_section", "attribute_target", "attribute_list", 
		"attribute", "attribute_argument", "pointer_type", "fixed_pointer_declarators", 
		"fixed_pointer_declarator", "fixed_pointer_initializer", "fixed_size_buffer_declarator", 
		"stackalloc_initializer", "right_arrow", "right_shift", "right_shift_assignment", 
		"literal", "boolean_literal", "string_literal", "interpolated_regular_string", 
		"interpolated_verbatium_string", "interpolated_regular_string_part", "interpolated_verbatium_string_part", 
		"interpolated_string_expression", "keyword", "class_members", "class_definition", 
		"class_signature", "struct_definition", "interface_definition", "enum_definition", 
		"delegate_definition", "event_declaration", "field_declaration", "property_declaration", 
		"constant_declaration", "indexer_declaration", "destructor_definition", 
		"constructor_declaration", "method_expressions", "method_declaration", 
		"method_signature", "method_member_name", "operator_declaration", "arg_declaration", 
		"method_invocation", "object_creation_expression", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u00EF\u00BB\u00BF'", null, "'/***/'", null, null, null, null, 
		"'#'", "'abstract'", "'add'", "'alias'", "'__arglist'", "'as'", "'ascending'", 
		"'async'", "'await'", "'base'", "'bool'", "'break'", "'by'", "'byte'", 
		"'case'", "'catch'", "'char'", "'checked'", "'class'", "'const'", "'continue'", 
		"'decimal'", "'default'", "'delegate'", "'descending'", "'do'", "'double'", 
		"'dynamic'", "'else'", "'enum'", "'equals'", "'event'", "'explicit'", 
		"'extern'", "'false'", "'finally'", "'fixed'", "'float'", "'for'", "'foreach'", 
		"'from'", "'get'", "'goto'", "'group'", "'if'", "'implicit'", "'in'", 
		"'int'", "'interface'", "'internal'", "'into'", "'is'", "'join'", "'let'", 
		"'lock'", "'long'", "'nameof'", "'namespace'", "'new'", "'null'", "'object'", 
		"'on'", "'operator'", "'orderby'", "'out'", "'override'", "'params'", 
		"'partial'", "'private'", "'protected'", "'public'", "'readonly'", "'ref'", 
		"'remove'", "'return'", "'sbyte'", "'sealed'", "'select'", "'set'", "'short'", 
		"'sizeof'", "'stackalloc'", "'static'", "'string'", "'struct'", "'switch'", 
		"'this'", "'throw'", "'true'", "'try'", "'typeof'", "'uint'", "'ulong'", 
		"'unchecked'", "'unmanaged'", "'unsafe'", "'ushort'", "'using'", "'var'", 
		"'virtual'", "'void'", "'volatile'", "'when'", "'where'", "'while'", "'yield'", 
		null, null, null, null, null, null, null, null, null, null, null, "'{'", 
		"'}'", "'['", "']'", "'('", "')'", "'.'", "','", "':'", "';'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", "'~'", "'='", 
		"'<'", "'>'", "'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", "'||'", "'->'", 
		"'=='", "'!='", "'<='", "'>='", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'&='", "'|='", "'^='", "'<<'", "'<<='", "'??='", "'..'", "'{{'", null, 
		null, null, null, null, null, null, null, null, null, "'define'", "'undef'", 
		"'elif'", "'endif'", "'line'", null, null, null, null, null, null, "'hidden'", 
		null, null, null, "'}}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BYTE_ORDER_MARK", "SINGLE_LINE_DOC_COMMENT", "EMPTY_DELIMITED_DOC_COMMENT", 
		"DELIMITED_DOC_COMMENT", "SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", "WHITESPACES", 
		"SHARP", "ABSTRACT", "ADD", "ALIAS", "ARGLIST", "AS", "ASCENDING", "ASYNC", 
		"AWAIT", "BASE", "BOOL", "BREAK", "BY", "BYTE", "CASE", "CATCH", "CHAR", 
		"CHECKED", "CLASS", "CONST", "CONTINUE", "DECIMAL", "DEFAULT", "DELEGATE", 
		"DESCENDING", "DO", "DOUBLE", "DYNAMIC", "ELSE", "ENUM", "EQUALS", "EVENT", 
		"EXPLICIT", "EXTERN", "FALSE", "FINALLY", "FIXED", "FLOAT", "FOR", "FOREACH", 
		"FROM", "GET", "GOTO", "GROUP", "IF", "IMPLICIT", "IN", "INT", "INTERFACE", 
		"INTERNAL", "INTO", "IS", "JOIN", "LET", "LOCK", "LONG", "NAMEOF", "NAMESPACE", 
		"NEW", "NULL", "OBJECT", "ON", "OPERATOR", "ORDERBY", "OUT", "OVERRIDE", 
		"PARAMS", "PARTIAL", "PRIVATE", "PROTECTED", "PUBLIC", "READONLY", "REF", 
		"REMOVE", "RETURN", "SBYTE", "SEALED", "SELECT", "SET", "SHORT", "SIZEOF", 
		"STACKALLOC", "STATIC", "STRING", "STRUCT", "SWITCH", "THIS", "THROW", 
		"TRUE", "TRY", "TYPEOF", "UINT", "ULONG", "UNCHECKED", "UNMANAGED", "UNSAFE", 
		"USHORT", "USING", "VAR", "VIRTUAL", "VOID", "VOLATILE", "WHEN", "WHERE", 
		"WHILE", "YIELD", "IDENTIFIER", "LITERAL_ACCESS", "INTEGER_LITERAL", "HEX_INTEGER_LITERAL", 
		"BIN_INTEGER_LITERAL", "REAL_LITERAL", "CHARACTER_LITERAL", "REGULAR_STRING", 
		"VERBATIUM_STRING", "INTERPOLATED_REGULAR_STRING_START", "INTERPOLATED_VERBATIUM_STRING_START", 
		"OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENS", 
		"CLOSE_PARENS", "DOT", "COMMA", "COLON", "SEMICOLON", "PLUS", "MINUS", 
		"STAR", "DIV", "PERCENT", "AMP", "BITWISE_OR", "CARET", "BANG", "TILDE", 
		"ASSIGNMENT", "LT", "GT", "INTERR", "DOUBLE_COLON", "OP_COALESCING", "OP_INC", 
		"OP_DEC", "OP_AND", "OP_OR", "OP_PTR", "OP_EQ", "OP_NE", "OP_LE", "OP_GE", 
		"OP_ADD_ASSIGNMENT", "OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", "OP_DIV_ASSIGNMENT", 
		"OP_MOD_ASSIGNMENT", "OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", "OP_XOR_ASSIGNMENT", 
		"OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT", "OP_COALESCING_ASSIGNMENT", 
		"OP_RANGE", "DOUBLE_CURLY_INSIDE", "OPEN_BRACE_INSIDE", "REGULAR_CHAR_INSIDE", 
		"VERBATIUM_DOUBLE_QUOTE_INSIDE", "DOUBLE_QUOTE_INSIDE", "REGULAR_STRING_INSIDE", 
		"VERBATIUM_INSIDE_STRING", "CLOSE_BRACE_INSIDE", "FORMAT_STRING", "DIRECTIVE_WHITESPACES", 
		"DIGITS", "DEFINE", "UNDEF", "ELIF", "ENDIF", "LINE", "ERROR", "WARNING", 
		"REGION", "ENDREGION", "PRAGMA", "NULLABLE", "DIRECTIVE_HIDDEN", "CONDITIONAL_SYMBOL", 
		"DIRECTIVE_NEW_LINE", "TEXT", "DOUBLE_CURLY_CLOSE_INSIDE"
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
	public String getGrammarFileName() { return "CSharpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSharpParser.EOF, 0); }
		public TerminalNode BYTE_ORDER_MARK() { return getToken(CSharpParser.BYTE_ORDER_MARK, 0); }
		public Extern_alias_directivesContext extern_alias_directives() {
			return getRuleContext(Extern_alias_directivesContext.class,0);
		}
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public List<Global_attribute_sectionContext> global_attribute_section() {
			return getRuleContexts(Global_attribute_sectionContext.class);
		}
		public Global_attribute_sectionContext global_attribute_section(int i) {
			return getRuleContext(Global_attribute_sectionContext.class,i);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCompilation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(484);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(487);
				extern_alias_directives();
				}
				break;
			}
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(490);
				using_directives();
				}
			}

			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493);
					global_attribute_section();
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NAMESPACE - 65)) | (1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REF - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (STRUCT - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0)) {
				{
				setState(499);
				namespace_member_declarations();
				}
			}

			setState(502);
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

	public static class Namespace_or_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Namespace_or_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_or_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_or_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_or_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNamespace_or_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_or_type_nameContext namespace_or_type_name() throws RecognitionException {
		Namespace_or_type_nameContext _localctx = new Namespace_or_type_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespace_or_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(504);
				identifier();
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(505);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(508);
				qualified_alias_member();
				}
				break;
			}
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					match(DOT);
					setState(512);
					identifier();
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(513);
						type_argument_list();
						}
						break;
					}
					}
					} 
				}
				setState(520);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			base_type();
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(525);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INTERR:
						{
						setState(522);
						match(INTERR);
						}
						break;
					case OPEN_BRACKET:
						{
						setState(523);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(524);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(529);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Base_typeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_base_type);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				simple_type();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case UNMANAGED:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				class_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				match(VOID);
				setState(533);
				match(STAR);
				}
				break;
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				tuple_type();
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

	public static class Tuple_typeContext extends ParserRuleContext {
		public List<Tuple_elementContext> tuple_element() {
			return getRuleContexts(Tuple_elementContext.class);
		}
		public Tuple_elementContext tuple_element(int i) {
			return getRuleContext(Tuple_elementContext.class,i);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTuple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(OPEN_PARENS);
			setState(538);
			tuple_element();
			setState(541); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(539);
				match(COMMA);
				setState(540);
				tuple_element();
				}
				}
				setState(543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(545);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_elementContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Tuple_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTuple_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTuple_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTuple_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_elementContext tuple_element() throws RecognitionException {
		Tuple_elementContext _localctx = new Tuple_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tuple_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			type_();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(548);
				identifier();
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

	public static class Simple_typeContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSimple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSimple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSimple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simple_type);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				numeric_type();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(BOOL);
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

	public static class Numeric_typeContext extends ParserRuleContext {
		public Integral_typeContext integral_type() {
			return getRuleContext(Integral_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNumeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNumeric_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNumeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeric_type);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				integral_type();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				floating_point_type();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				match(DECIMAL);
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

	public static class Integral_typeContext extends ParserRuleContext {
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public Integral_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIntegral_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIntegral_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIntegral_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integral_typeContext integral_type() throws RecognitionException {
		Integral_typeContext _localctx = new Integral_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_integral_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (SBYTE - 83)) | (1L << (SHORT - 83)) | (1L << (UINT - 83)) | (1L << (ULONG - 83)) | (1L << (USHORT - 83)))) != 0)) ) {
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

	public static class Floating_point_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public Floating_point_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFloating_point_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFloating_point_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFloating_point_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Floating_point_typeContext floating_point_type() throws RecognitionException {
		Floating_point_typeContext _localctx = new Floating_point_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
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

	public static class Class_typeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_type);
		try {
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				namespace_or_type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(OBJECT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				match(DYNAMIC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(567);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_argument_listContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public Type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_argument_listContext type_argument_list() throws RecognitionException {
		Type_argument_listContext _localctx = new Type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(LT);
			setState(571);
			type_();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(572);
				match(COMMA);
				setState(573);
				type_();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			argument();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(582);
				match(COMMA);
				setState(583);
				argument();
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArgumentContext extends ParserRuleContext {
		public Token refout;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(589);
				identifier();
				setState(590);
				match(COLON);
				}
				break;
			}
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(594);
				((ArgumentContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IN - 54)) | (1L << (OUT - 54)) | (1L << (REF - 54)))) != 0)) ) {
					((ArgumentContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(597);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(598);
				type_();
				}
				break;
			}
			setState(601);
			expression();
			}
		}
		catch (RecognitionException re) {
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				non_assignment_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				match(REF);
				setState(606);
				non_assignment_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_assignment_expressionContext extends ParserRuleContext {
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Non_assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNon_assignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNon_assignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNon_assignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_assignment_expressionContext non_assignment_expression() throws RecognitionException {
		Non_assignment_expressionContext _localctx = new Non_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_non_assignment_expression);
		try {
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				lambda_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				query_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				conditional_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				unary_expression();
				setState(615);
				assignment_operator();
				setState(616);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				unary_expression();
				setState(619);
				match(OP_COALESCING_ASSIGNMENT);
				setState(620);
				throwable_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Right_shift_assignmentContext right_shift_assignment() {
			return getRuleContext(Right_shift_assignmentContext.class,0);
		}
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_operator);
		try {
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				match(ASSIGNMENT);
				}
				break;
			case OP_ADD_ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(OP_ADD_ASSIGNMENT);
				}
				break;
			case OP_SUB_ASSIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
				match(OP_SUB_ASSIGNMENT);
				}
				break;
			case OP_MULT_ASSIGNMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(627);
				match(OP_MULT_ASSIGNMENT);
				}
				break;
			case OP_DIV_ASSIGNMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(628);
				match(OP_DIV_ASSIGNMENT);
				}
				break;
			case OP_MOD_ASSIGNMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(629);
				match(OP_MOD_ASSIGNMENT);
				}
				break;
			case OP_AND_ASSIGNMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(630);
				match(OP_AND_ASSIGNMENT);
				}
				break;
			case OP_OR_ASSIGNMENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(631);
				match(OP_OR_ASSIGNMENT);
				}
				break;
			case OP_XOR_ASSIGNMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(632);
				match(OP_XOR_ASSIGNMENT);
				}
				break;
			case OP_LEFT_SHIFT_ASSIGNMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(633);
				match(OP_LEFT_SHIFT_ASSIGNMENT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 11);
				{
				setState(634);
				right_shift_assignment();
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public List<Throwable_expressionContext> throwable_expression() {
			return getRuleContexts(Throwable_expressionContext.class);
		}
		public Throwable_expressionContext throwable_expression(int i) {
			return getRuleContext(Throwable_expressionContext.class,i);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			null_coalescing_expression();
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(638);
				match(INTERR);
				setState(639);
				throwable_expression();
				setState(640);
				match(COLON);
				setState(641);
				throwable_expression();
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

	public static class Null_coalescing_expressionContext extends ParserRuleContext {
		public Conditional_or_expressionContext conditional_or_expression() {
			return getRuleContext(Conditional_or_expressionContext.class,0);
		}
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public Throw_expressionContext throw_expression() {
			return getRuleContext(Throw_expressionContext.class,0);
		}
		public Null_coalescing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_coalescing_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNull_coalescing_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNull_coalescing_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNull_coalescing_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_coalescing_expressionContext null_coalescing_expression() throws RecognitionException {
		Null_coalescing_expressionContext _localctx = new Null_coalescing_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_null_coalescing_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			conditional_or_expression();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COALESCING) {
				{
				setState(646);
				match(OP_COALESCING);
				setState(649);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BASE:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case CHECKED:
				case DECIMAL:
				case DEFAULT:
				case DELEGATE:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FALSE:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case NEW:
				case NULL:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case SIZEOF:
				case STRING:
				case THIS:
				case TRUE:
				case TYPEOF:
				case UINT:
				case ULONG:
				case UNCHECKED:
				case UNMANAGED:
				case USHORT:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
				case LITERAL_ACCESS:
				case INTEGER_LITERAL:
				case HEX_INTEGER_LITERAL:
				case BIN_INTEGER_LITERAL:
				case REAL_LITERAL:
				case CHARACTER_LITERAL:
				case REGULAR_STRING:
				case VERBATIUM_STRING:
				case INTERPOLATED_REGULAR_STRING_START:
				case INTERPOLATED_VERBATIUM_STRING_START:
				case OPEN_PARENS:
				case PLUS:
				case MINUS:
				case STAR:
				case AMP:
				case CARET:
				case BANG:
				case TILDE:
				case OP_INC:
				case OP_DEC:
				case OP_RANGE:
					{
					setState(647);
					null_coalescing_expression();
					}
					break;
				case THROW:
					{
					setState(648);
					throw_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class Conditional_or_expressionContext extends ParserRuleContext {
		public List<Conditional_and_expressionContext> conditional_and_expression() {
			return getRuleContexts(Conditional_and_expressionContext.class);
		}
		public Conditional_and_expressionContext conditional_and_expression(int i) {
			return getRuleContext(Conditional_and_expressionContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(CSharpParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(CSharpParser.OP_OR, i);
		}
		public Conditional_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConditional_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConditional_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConditional_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_or_expressionContext conditional_or_expression() throws RecognitionException {
		Conditional_or_expressionContext _localctx = new Conditional_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditional_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			conditional_and_expression();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(654);
				match(OP_OR);
				setState(655);
				conditional_and_expression();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Conditional_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(CSharpParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(CSharpParser.OP_AND, i);
		}
		public Conditional_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConditional_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConditional_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConditional_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_and_expressionContext conditional_and_expression() throws RecognitionException {
		Conditional_and_expressionContext _localctx = new Conditional_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditional_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			inclusive_or_expression();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(662);
				match(OP_AND);
				setState(663);
				inclusive_or_expression();
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			exclusive_or_expression();
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITWISE_OR) {
				{
				{
				setState(670);
				match(BITWISE_OR);
				setState(671);
				exclusive_or_expression();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			and_expression();
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(678);
					match(CARET);
					setState(679);
					and_expression();
					}
					} 
				}
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			equality_expression();
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(686);
					match(AMP);
					setState(687);
					equality_expression();
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(CSharpParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(CSharpParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(CSharpParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(CSharpParser.OP_NE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			relational_expression();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_EQ || _la==OP_NE) {
				{
				{
				setState(694);
				_la = _input.LA(1);
				if ( !(_la==OP_EQ || _la==OP_NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(695);
				relational_expression();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> IS() { return getTokens(CSharpParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(CSharpParser.IS, i);
		}
		public List<IsTypeContext> isType() {
			return getRuleContexts(IsTypeContext.class);
		}
		public IsTypeContext isType(int i) {
			return getRuleContext(IsTypeContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(CSharpParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(CSharpParser.AS, i);
		}
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			shift_expression();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AS || _la==IS || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (LT - 146)) | (1L << (GT - 146)) | (1L << (OP_LE - 146)) | (1L << (OP_GE - 146)))) != 0)) {
				{
				setState(708);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case GT:
				case OP_LE:
				case OP_GE:
					{
					setState(702);
					_la = _input.LA(1);
					if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (LT - 146)) | (1L << (GT - 146)) | (1L << (OP_LE - 146)) | (1L << (OP_GE - 146)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(703);
					shift_expression();
					}
					break;
				case IS:
					{
					setState(704);
					match(IS);
					setState(705);
					isType();
					}
					break;
				case AS:
					{
					setState(706);
					match(AS);
					setState(707);
					type_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<Right_shiftContext> right_shift() {
			return getRuleContexts(Right_shiftContext.class);
		}
		public Right_shiftContext right_shift(int i) {
			return getRuleContext(Right_shiftContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			additive_expression();
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(716);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OP_LEFT_SHIFT:
						{
						setState(714);
						match(OP_LEFT_SHIFT);
						}
						break;
					case GT:
						{
						setState(715);
						right_shift();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(718);
					additive_expression();
					}
					} 
				}
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			multiplicative_expression();
			setState(729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(725);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(726);
					multiplicative_expression();
					}
					} 
				}
				setState(731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Switch_expressionContext> switch_expression() {
			return getRuleContexts(Switch_expressionContext.class);
		}
		public Switch_expressionContext switch_expression(int i) {
			return getRuleContext(Switch_expressionContext.class,i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiplicative_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			switch_expression();
			setState(737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(733);
					_la = _input.LA(1);
					if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (STAR - 137)) | (1L << (DIV - 137)) | (1L << (PERCENT - 137)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(734);
					switch_expression();
					}
					} 
				}
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class Switch_expressionContext extends ParserRuleContext {
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public Switch_expression_armsContext switch_expression_arms() {
			return getRuleContext(Switch_expression_armsContext.class,0);
		}
		public Switch_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitch_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitch_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSwitch_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_expressionContext switch_expression() throws RecognitionException {
		Switch_expressionContext _localctx = new Switch_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switch_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			range_expression();
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SWITCH) {
				{
				setState(741);
				match(SWITCH);
				setState(742);
				match(OPEN_BRACE);
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(743);
					switch_expression_arms();
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(744);
						match(COMMA);
						}
					}

					}
				}

				setState(749);
				match(CLOSE_BRACE);
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

	public static class Switch_expression_armsContext extends ParserRuleContext {
		public List<Switch_expression_armContext> switch_expression_arm() {
			return getRuleContexts(Switch_expression_armContext.class);
		}
		public Switch_expression_armContext switch_expression_arm(int i) {
			return getRuleContext(Switch_expression_armContext.class,i);
		}
		public Switch_expression_armsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression_arms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitch_expression_arms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitch_expression_arms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSwitch_expression_arms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_expression_armsContext switch_expression_arms() throws RecognitionException {
		Switch_expression_armsContext _localctx = new Switch_expression_armsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switch_expression_arms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			switch_expression_arm();
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(753);
					match(COMMA);
					setState(754);
					switch_expression_arm();
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class Switch_expression_armContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public Case_guardContext case_guard() {
			return getRuleContext(Case_guardContext.class,0);
		}
		public Switch_expression_armContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression_arm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitch_expression_arm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitch_expression_arm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSwitch_expression_arm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_expression_armContext switch_expression_arm() throws RecognitionException {
		Switch_expression_armContext _localctx = new Switch_expression_armContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switch_expression_arm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			expression();
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(761);
				case_guard();
				}
			}

			setState(764);
			right_arrow();
			setState(765);
			throwable_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public TerminalNode OP_RANGE() { return getToken(CSharpParser.OP_RANGE, 0); }
		public Range_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRange_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRange_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRange_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_expressionContext range_expression() throws RecognitionException {
		Range_expressionContext _localctx = new Range_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_range_expression);
		int _la;
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				unary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)))) != 0)) {
					{
					setState(768);
					unary_expression();
					}
				}

				setState(771);
				match(OP_RANGE);
				setState(773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(772);
					unary_expression();
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

	public static class CastContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(OPEN_PARENS);
			setState(778);
			type_();
			setState(779);
			match(CLOSE_PARENS);
			setState(780);
			unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unary_expression);
		try {
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				match(PLUS);
				setState(784);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(785);
				match(MINUS);
				setState(786);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(787);
				match(BANG);
				setState(788);
				unary_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(789);
				match(TILDE);
				setState(790);
				unary_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(791);
				match(OP_INC);
				setState(792);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(793);
				match(OP_DEC);
				setState(794);
				unary_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(795);
				cast();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(796);
				match(AWAIT);
				setState(797);
				unary_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(798);
				match(AMP);
				setState(799);
				unary_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(800);
				match(STAR);
				setState(801);
				unary_expression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(802);
				match(CARET);
				setState(803);
				unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expression_startContext pe;
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public List<Bracket_expressionContext> bracket_expression() {
			return getRuleContexts(Bracket_expressionContext.class);
		}
		public Bracket_expressionContext bracket_expression(int i) {
			return getRuleContext(Bracket_expressionContext.class,i);
		}
		public List<Member_accessContext> member_access() {
			return getRuleContexts(Member_accessContext.class);
		}
		public Member_accessContext member_access(int i) {
			return getRuleContext(Member_accessContext.class,i);
		}
		public List<Method_invocationContext> method_invocation() {
			return getRuleContexts(Method_invocationContext.class);
		}
		public Method_invocationContext method_invocation(int i) {
			return getRuleContext(Method_invocationContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primary_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			((Primary_expressionContext)_localctx).pe = primary_expression_start();
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(807);
				match(BANG);
				}
				break;
			}
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(810);
					bracket_expression();
					}
					} 
				}
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(816);
				match(BANG);
				}
				break;
			}
			setState(841);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(825);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
					case INTERR:
						{
						setState(819);
						member_access();
						}
						break;
					case OPEN_PARENS:
						{
						setState(820);
						method_invocation();
						}
						break;
					case OP_INC:
						{
						setState(821);
						match(OP_INC);
						}
						break;
					case OP_DEC:
						{
						setState(822);
						match(OP_DEC);
						}
						break;
					case OP_PTR:
						{
						setState(823);
						match(OP_PTR);
						setState(824);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(828);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(827);
						match(BANG);
						}
						break;
					}
					}
					setState(833);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(830);
							bracket_expression();
							}
							} 
						}
						setState(835);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					}
					setState(837);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(836);
						match(BANG);
						}
						break;
					}
					}
					} 
				}
				setState(843);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expression_startContext extends ParserRuleContext {
		public Primary_expression_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression_start; }
	 
		public Primary_expression_startContext() { }
		public void copyFrom(Primary_expression_startContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode LITERAL_ACCESS() { return getToken(CSharpParser.LITERAL_ACCESS, 0); }
		public LiteralAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLiteralAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLiteralAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLiteralAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefaultValueExpressionContext extends Primary_expression_startContext {
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public DefaultValueExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDefaultValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDefaultValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitDefaultValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public BaseAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBaseAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBaseAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBaseAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode SIZEOF() { return getToken(CSharpParser.SIZEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public SizeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSizeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSizeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSizeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionsContext extends Primary_expression_startContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public ParenthesisExpressionsContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterParenthesisExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitParenthesisExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitParenthesisExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisReferenceExpressionContext extends Primary_expression_startContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public ThisReferenceExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterThisReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitThisReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitThisReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectCreationExpressionContext extends Primary_expression_startContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Anonymous_object_initializerContext anonymous_object_initializer() {
			return getRuleContext(Anonymous_object_initializerContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Object_creation_expressionContext object_creation_expression() {
			return getRuleContext(Object_creation_expressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ObjectCreationExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObjectCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObjectCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitObjectCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonymousMethodExpressionContext extends Primary_expression_startContext {
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public AnonymousMethodExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymousMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymousMethodExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAnonymousMethodExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode TYPEOF() { return getToken(CSharpParser.TYPEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Unbound_type_nameContext unbound_type_name() {
			return getRuleContext(Unbound_type_nameContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TypeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TupleExpressionContext extends Primary_expression_startContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TupleExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public UncheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUncheckedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUncheckedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUncheckedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleNameExpressionContext extends Primary_expression_startContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public SimpleNameExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSimpleNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSimpleNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSimpleNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberAccessExpressionContext extends Primary_expression_startContext {
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public MemberAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMemberAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMemberAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public CheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCheckedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCheckedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCheckedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends Primary_expression_startContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameofExpressionContext extends Primary_expression_startContext {
		public TerminalNode NAMEOF() { return getToken(CSharpParser.NAMEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public NameofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNameofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNameofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNameofExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expression_startContext primary_expression_start() throws RecognitionException {
		Primary_expression_startContext _localctx = new Primary_expression_startContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primary_expression_start);
		int _la;
		try {
			int _alt;
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				literal();
				}
				break;
			case 2:
				_localctx = new SimpleNameExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				identifier();
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(846);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ParenthesisExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(849);
				match(OPEN_PARENS);
				setState(850);
				expression();
				setState(851);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(853);
				predefined_type();
				}
				break;
			case 5:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(854);
				qualified_alias_member();
				}
				break;
			case 6:
				_localctx = new LiteralAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(855);
				match(LITERAL_ACCESS);
				}
				break;
			case 7:
				_localctx = new ThisReferenceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(856);
				match(THIS);
				}
				break;
			case 8:
				_localctx = new BaseAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(857);
				match(BASE);
				setState(867);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(858);
					match(DOT);
					setState(859);
					identifier();
					setState(861);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(860);
						type_argument_list();
						}
						break;
					}
					}
					break;
				case OPEN_BRACKET:
					{
					setState(863);
					match(OPEN_BRACKET);
					setState(864);
					expression_list();
					setState(865);
					match(CLOSE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				_localctx = new ObjectCreationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(869);
				match(NEW);
				setState(898);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case UINT:
				case ULONG:
				case UNMANAGED:
				case USHORT:
				case VAR:
				case VOID:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
				case OPEN_PARENS:
					{
					setState(870);
					type_();
					setState(892);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(871);
						object_creation_expression();
						}
						break;
					case 2:
						{
						setState(872);
						object_or_collection_initializer();
						}
						break;
					case 3:
						{
						setState(873);
						match(OPEN_BRACKET);
						setState(874);
						expression_list();
						setState(875);
						match(CLOSE_BRACKET);
						setState(879);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(876);
								rank_specifier();
								}
								} 
							}
							setState(881);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
						}
						setState(883);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OPEN_BRACE) {
							{
							setState(882);
							array_initializer();
							}
						}

						}
						break;
					case 4:
						{
						setState(886); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(885);
							rank_specifier();
							}
							}
							setState(888); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==OPEN_BRACKET );
						setState(890);
						array_initializer();
						}
						break;
					}
					}
					break;
				case OPEN_BRACE:
					{
					setState(894);
					anonymous_object_initializer();
					}
					break;
				case OPEN_BRACKET:
					{
					setState(895);
					rank_specifier();
					setState(896);
					array_initializer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				_localctx = new TupleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(900);
				match(OPEN_PARENS);
				setState(901);
				argument();
				setState(904); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(902);
					match(COMMA);
					setState(903);
					argument();
					}
					}
					setState(906); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(908);
				match(CLOSE_PARENS);
				}
				break;
			case 11:
				_localctx = new TypeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(910);
				match(TYPEOF);
				setState(911);
				match(OPEN_PARENS);
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(912);
					unbound_type_name();
					}
					break;
				case 2:
					{
					setState(913);
					type_();
					}
					break;
				case 3:
					{
					setState(914);
					match(VOID);
					}
					break;
				}
				setState(917);
				match(CLOSE_PARENS);
				}
				break;
			case 12:
				_localctx = new CheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(918);
				match(CHECKED);
				setState(919);
				match(OPEN_PARENS);
				setState(920);
				expression();
				setState(921);
				match(CLOSE_PARENS);
				}
				break;
			case 13:
				_localctx = new UncheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(923);
				match(UNCHECKED);
				setState(924);
				match(OPEN_PARENS);
				setState(925);
				expression();
				setState(926);
				match(CLOSE_PARENS);
				}
				break;
			case 14:
				_localctx = new DefaultValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(928);
				match(DEFAULT);
				setState(933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(929);
					match(OPEN_PARENS);
					setState(930);
					type_();
					setState(931);
					match(CLOSE_PARENS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new AnonymousMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(935);
					match(ASYNC);
					}
				}

				setState(938);
				match(DELEGATE);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENS) {
					{
					setState(939);
					match(OPEN_PARENS);
					setState(941);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PARTIAL - 75)) | (1L << (REF - 75)) | (1L << (REMOVE - 75)) | (1L << (SBYTE - 75)) | (1L << (SELECT - 75)) | (1L << (SET - 75)) | (1L << (SHORT - 75)) | (1L << (STRING - 75)) | (1L << (UINT - 75)) | (1L << (ULONG - 75)) | (1L << (UNMANAGED - 75)) | (1L << (USHORT - 75)) | (1L << (VAR - 75)) | (1L << (VOID - 75)) | (1L << (WHEN - 75)) | (1L << (WHERE - 75)) | (1L << (YIELD - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (OPEN_PARENS - 75)))) != 0)) {
						{
						setState(940);
						explicit_anonymous_function_parameter_list();
						}
					}

					setState(943);
					match(CLOSE_PARENS);
					}
				}

				setState(946);
				block();
				}
				break;
			case 16:
				_localctx = new SizeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(947);
				match(SIZEOF);
				setState(948);
				match(OPEN_PARENS);
				setState(949);
				type_();
				setState(950);
				match(CLOSE_PARENS);
				}
				break;
			case 17:
				_localctx = new NameofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(952);
				match(NAMEOF);
				setState(953);
				match(OPEN_PARENS);
				setState(959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(954);
						identifier();
						setState(955);
						match(DOT);
						}
						} 
					}
					setState(961);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(962);
				identifier();
				setState(963);
				match(CLOSE_PARENS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throwable_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_expressionContext throw_expression() {
			return getRuleContext(Throw_expressionContext.class,0);
		}
		public Throwable_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwable_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterThrowable_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitThrowable_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitThrowable_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throwable_expressionContext throwable_expression() throws RecognitionException {
		Throwable_expressionContext _localctx = new Throwable_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_throwable_expression);
		try {
			setState(969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				expression();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				throw_expression();
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

	public static class Throw_expressionContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterThrow_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitThrow_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitThrow_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throw_expressionContext throw_expression() throws RecognitionException {
		Throw_expressionContext _localctx = new Throw_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_throw_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(THROW);
			setState(972);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_accessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_member_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(974);
				match(INTERR);
				}
			}

			setState(977);
			match(DOT);
			setState(978);
			identifier();
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(979);
				type_argument_list();
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

	public static class Bracket_expressionContext extends ParserRuleContext {
		public List<Indexer_argumentContext> indexer_argument() {
			return getRuleContexts(Indexer_argumentContext.class);
		}
		public Indexer_argumentContext indexer_argument(int i) {
			return getRuleContext(Indexer_argumentContext.class,i);
		}
		public Bracket_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBracket_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBracket_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBracket_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket_expressionContext bracket_expression() throws RecognitionException {
		Bracket_expressionContext _localctx = new Bracket_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bracket_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(982);
				match(INTERR);
				}
			}

			setState(985);
			match(OPEN_BRACKET);
			setState(986);
			indexer_argument();
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(987);
				match(COMMA);
				setState(988);
				indexer_argument();
				}
				}
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(994);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexer_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Indexer_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIndexer_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIndexer_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIndexer_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexer_argumentContext indexer_argument() throws RecognitionException {
		Indexer_argumentContext _localctx = new Indexer_argumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_indexer_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(996);
				identifier();
				setState(997);
				match(COLON);
				}
				break;
			}
			setState(1001);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predefined_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPredefined_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPredefined_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitPredefined_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_predefined_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (OBJECT - 68)) | (1L << (SBYTE - 68)) | (1L << (SHORT - 68)) | (1L << (STRING - 68)) | (1L << (UINT - 68)) | (1L << (ULONG - 68)) | (1L << (USHORT - 68)))) != 0)) ) {
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			expression();
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1006);
				match(COMMA);
				setState(1007);
				expression();
				}
				}
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Object_or_collection_initializerContext extends ParserRuleContext {
		public Object_initializerContext object_initializer() {
			return getRuleContext(Object_initializerContext.class,0);
		}
		public Collection_initializerContext collection_initializer() {
			return getRuleContext(Collection_initializerContext.class,0);
		}
		public Object_or_collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_or_collection_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObject_or_collection_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObject_or_collection_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitObject_or_collection_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_or_collection_initializerContext object_or_collection_initializer() throws RecognitionException {
		Object_or_collection_initializerContext _localctx = new Object_or_collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_object_or_collection_initializer);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				object_initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				collection_initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_initializer_listContext member_initializer_list() {
			return getRuleContext(Member_initializer_listContext.class,0);
		}
		public Object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObject_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObject_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitObject_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_initializerContext object_initializer() throws RecognitionException {
		Object_initializerContext _localctx = new Object_initializerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(OPEN_BRACE);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0)) {
				{
				setState(1018);
				member_initializer_list();
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1019);
					match(COMMA);
					}
				}

				}
			}

			setState(1024);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializer_listContext extends ParserRuleContext {
		public List<Member_initializerContext> member_initializer() {
			return getRuleContexts(Member_initializerContext.class);
		}
		public Member_initializerContext member_initializer(int i) {
			return getRuleContext(Member_initializerContext.class,i);
		}
		public Member_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_initializer_listContext member_initializer_list() throws RecognitionException {
		Member_initializer_listContext _localctx = new Member_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_member_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			member_initializer();
			setState(1031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1027);
					match(COMMA);
					setState(1028);
					member_initializer();
					}
					} 
				}
				setState(1033);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializerContext extends ParserRuleContext {
		public Initializer_valueContext initializer_value() {
			return getRuleContext(Initializer_valueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Member_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_initializerContext member_initializer() throws RecognitionException {
		Member_initializerContext _localctx = new Member_initializerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_member_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case UNMANAGED:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(1034);
				identifier();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(1035);
				match(OPEN_BRACKET);
				setState(1036);
				expression();
				setState(1037);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1041);
			match(ASSIGNMENT);
			setState(1042);
			initializer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Initializer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInitializer_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInitializer_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInitializer_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_valueContext initializer_value() throws RecognitionException {
		Initializer_valueContext _localctx = new Initializer_valueContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_initializer_value);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				object_or_collection_initializer();
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

	public static class Collection_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public List<Element_initializerContext> element_initializer() {
			return getRuleContexts(Element_initializerContext.class);
		}
		public Element_initializerContext element_initializer(int i) {
			return getRuleContext(Element_initializerContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCollection_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCollection_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCollection_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_initializerContext collection_initializer() throws RecognitionException {
		Collection_initializerContext _localctx = new Collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_collection_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(OPEN_BRACE);
			setState(1049);
			element_initializer();
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1050);
					match(COMMA);
					setState(1051);
					element_initializer();
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1057);
				match(COMMA);
				}
			}

			setState(1060);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_initializerContext extends ParserRuleContext {
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Element_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterElement_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitElement_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitElement_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_initializerContext element_initializer() throws RecognitionException {
		Element_initializerContext _localctx = new Element_initializerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_element_initializer);
		try {
			setState(1067);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				non_assignment_expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				match(OPEN_BRACE);
				setState(1064);
				expression_list();
				setState(1065);
				match(CLOSE_BRACE);
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

	public static class Anonymous_object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_declarator_listContext member_declarator_list() {
			return getRuleContext(Member_declarator_listContext.class,0);
		}
		public Anonymous_object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_object_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymous_object_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymous_object_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAnonymous_object_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_object_initializerContext anonymous_object_initializer() throws RecognitionException {
		Anonymous_object_initializerContext _localctx = new Anonymous_object_initializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_anonymous_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(OPEN_BRACE);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BASE - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (CHECKED - 10)) | (1L << (DECIMAL - 10)) | (1L << (DEFAULT - 10)) | (1L << (DELEGATE - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FALSE - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (NEW - 10)) | (1L << (NULL - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PARTIAL - 75)) | (1L << (REMOVE - 75)) | (1L << (SBYTE - 75)) | (1L << (SELECT - 75)) | (1L << (SET - 75)) | (1L << (SHORT - 75)) | (1L << (SIZEOF - 75)) | (1L << (STRING - 75)) | (1L << (THIS - 75)) | (1L << (TRUE - 75)) | (1L << (TYPEOF - 75)) | (1L << (UINT - 75)) | (1L << (ULONG - 75)) | (1L << (UNCHECKED - 75)) | (1L << (UNMANAGED - 75)) | (1L << (USHORT - 75)) | (1L << (VAR - 75)) | (1L << (WHEN - 75)) | (1L << (WHERE - 75)) | (1L << (YIELD - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (LITERAL_ACCESS - 75)) | (1L << (INTEGER_LITERAL - 75)) | (1L << (HEX_INTEGER_LITERAL - 75)) | (1L << (BIN_INTEGER_LITERAL - 75)) | (1L << (REAL_LITERAL - 75)) | (1L << (CHARACTER_LITERAL - 75)) | (1L << (REGULAR_STRING - 75)) | (1L << (VERBATIUM_STRING - 75)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 75)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 75)) | (1L << (OPEN_PARENS - 75)))) != 0)) {
				{
				setState(1070);
				member_declarator_list();
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1071);
					match(COMMA);
					}
				}

				}
			}

			setState(1076);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_declarator_listContext extends ParserRuleContext {
		public List<Member_declaratorContext> member_declarator() {
			return getRuleContexts(Member_declaratorContext.class);
		}
		public Member_declaratorContext member_declarator(int i) {
			return getRuleContext(Member_declaratorContext.class,i);
		}
		public Member_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declarator_listContext member_declarator_list() throws RecognitionException {
		Member_declarator_listContext _localctx = new Member_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_member_declarator_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			member_declarator();
			setState(1083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1079);
					match(COMMA);
					setState(1080);
					member_declarator();
					}
					} 
				}
				setState(1085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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

	public static class Member_declaratorContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Member_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declaratorContext member_declarator() throws RecognitionException {
		Member_declaratorContext _localctx = new Member_declaratorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_member_declarator);
		try {
			setState(1091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1087);
				identifier();
				setState(1088);
				match(ASSIGNMENT);
				setState(1089);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unbound_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Generic_dimension_specifierContext> generic_dimension_specifier() {
			return getRuleContexts(Generic_dimension_specifierContext.class);
		}
		public Generic_dimension_specifierContext generic_dimension_specifier(int i) {
			return getRuleContext(Generic_dimension_specifierContext.class,i);
		}
		public Unbound_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbound_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUnbound_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUnbound_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUnbound_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unbound_type_nameContext unbound_type_name() throws RecognitionException {
		Unbound_type_nameContext _localctx = new Unbound_type_nameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unbound_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			identifier();
			setState(1102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_PARENS:
			case DOT:
			case LT:
				{
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1094);
					generic_dimension_specifier();
					}
				}

				}
				break;
			case DOUBLE_COLON:
				{
				setState(1097);
				match(DOUBLE_COLON);
				setState(1098);
				identifier();
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1099);
					generic_dimension_specifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1104);
				match(DOT);
				setState(1105);
				identifier();
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1106);
					generic_dimension_specifier();
					}
				}

				}
				}
				setState(1113);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Generic_dimension_specifierContext extends ParserRuleContext {
		public Generic_dimension_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_dimension_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGeneric_dimension_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGeneric_dimension_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGeneric_dimension_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_dimension_specifierContext generic_dimension_specifier() throws RecognitionException {
		Generic_dimension_specifierContext _localctx = new Generic_dimension_specifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_generic_dimension_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(LT);
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1115);
				match(COMMA);
				}
				}
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1121);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsTypeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public IsTypePatternArmsContext isTypePatternArms() {
			return getRuleContext(IsTypePatternArmsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIsType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIsType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsTypeContext isType() throws RecognitionException {
		IsTypeContext _localctx = new IsTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_isType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			base_type();
			setState(1128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1126);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(1124);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(1125);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1131);
				match(INTERR);
				}
				break;
			}
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(1134);
				isTypePatternArms();
				}
			}

			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1137);
				identifier();
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

	public static class IsTypePatternArmsContext extends ParserRuleContext {
		public List<IsTypePatternArmContext> isTypePatternArm() {
			return getRuleContexts(IsTypePatternArmContext.class);
		}
		public IsTypePatternArmContext isTypePatternArm(int i) {
			return getRuleContext(IsTypePatternArmContext.class,i);
		}
		public IsTypePatternArmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isTypePatternArms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIsTypePatternArms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIsTypePatternArms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIsTypePatternArms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsTypePatternArmsContext isTypePatternArms() throws RecognitionException {
		IsTypePatternArmsContext _localctx = new IsTypePatternArmsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_isTypePatternArms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			match(OPEN_BRACE);
			setState(1141);
			isTypePatternArm();
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1142);
				match(COMMA);
				setState(1143);
				isTypePatternArm();
				}
				}
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1149);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsTypePatternArmContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsTypePatternArmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isTypePatternArm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIsTypePatternArm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIsTypePatternArm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIsTypePatternArm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsTypePatternArmContext isTypePatternArm() throws RecognitionException {
		IsTypePatternArmContext _localctx = new IsTypePatternArmContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_isTypePatternArm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			identifier();
			setState(1152);
			match(COLON);
			setState(1153);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_expressionContext extends ParserRuleContext {
		public Anonymous_function_signatureContext anonymous_function_signature() {
			return getRuleContext(Anonymous_function_signatureContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Anonymous_function_bodyContext anonymous_function_body() {
			return getRuleContext(Anonymous_function_bodyContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLambda_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLambda_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLambda_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_lambda_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1155);
				match(ASYNC);
				}
				break;
			}
			setState(1158);
			anonymous_function_signature();
			setState(1159);
			right_arrow();
			setState(1160);
			anonymous_function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_function_signatureContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() {
			return getRuleContext(Implicit_anonymous_function_parameter_listContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Anonymous_function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymous_function_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymous_function_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAnonymous_function_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_function_signatureContext anonymous_function_signature() throws RecognitionException {
		Anonymous_function_signatureContext _localctx = new Anonymous_function_signatureContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_anonymous_function_signature);
		try {
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				match(OPEN_PARENS);
				setState(1163);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164);
				match(OPEN_PARENS);
				setState(1165);
				explicit_anonymous_function_parameter_list();
				setState(1166);
				match(CLOSE_PARENS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1168);
				match(OPEN_PARENS);
				setState(1169);
				implicit_anonymous_function_parameter_list();
				setState(1170);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1172);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<Explicit_anonymous_function_parameterContext> explicit_anonymous_function_parameter() {
			return getRuleContexts(Explicit_anonymous_function_parameterContext.class);
		}
		public Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter(int i) {
			return getRuleContext(Explicit_anonymous_function_parameterContext.class,i);
		}
		public Explicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExplicit_anonymous_function_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExplicit_anonymous_function_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExplicit_anonymous_function_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() throws RecognitionException {
		Explicit_anonymous_function_parameter_listContext _localctx = new Explicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_explicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			explicit_anonymous_function_parameter();
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1176);
				match(COMMA);
				setState(1177);
				explicit_anonymous_function_parameter();
				}
				}
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Explicit_anonymous_function_parameterContext extends ParserRuleContext {
		public Token refout;
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public Explicit_anonymous_function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExplicit_anonymous_function_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExplicit_anonymous_function_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExplicit_anonymous_function_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter() throws RecognitionException {
		Explicit_anonymous_function_parameterContext _localctx = new Explicit_anonymous_function_parameterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_explicit_anonymous_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IN - 54)) | (1L << (OUT - 54)) | (1L << (REF - 54)))) != 0)) {
				{
				setState(1183);
				((Explicit_anonymous_function_parameterContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IN - 54)) | (1L << (OUT - 54)) | (1L << (REF - 54)))) != 0)) ) {
					((Explicit_anonymous_function_parameterContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1186);
			type_();
			setState(1187);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Implicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_anonymous_function_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterImplicit_anonymous_function_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitImplicit_anonymous_function_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitImplicit_anonymous_function_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() throws RecognitionException {
		Implicit_anonymous_function_parameter_listContext _localctx = new Implicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_implicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			identifier();
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1190);
				match(COMMA);
				setState(1191);
				identifier();
				}
				}
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Anonymous_function_bodyContext extends ParserRuleContext {
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Anonymous_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymous_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymous_function_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAnonymous_function_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_function_bodyContext anonymous_function_body() throws RecognitionException {
		Anonymous_function_bodyContext _localctx = new Anonymous_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_anonymous_function_body);
		try {
			setState(1199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case THROW:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				throwable_expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1198);
				block();
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

	public static class Query_expressionContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQuery_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_query_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			from_clause();
			setState(1202);
			query_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(FROM);
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1205);
				type_();
				}
				break;
			}
			setState(1208);
			identifier();
			setState(1209);
			match(IN);
			setState(1210);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_bodyContext extends ParserRuleContext {
		public Select_or_group_clauseContext select_or_group_clause() {
			return getRuleContext(Select_or_group_clauseContext.class,0);
		}
		public List<Query_body_clauseContext> query_body_clause() {
			return getRuleContexts(Query_body_clauseContext.class);
		}
		public Query_body_clauseContext query_body_clause(int i) {
			return getRuleContext(Query_body_clauseContext.class,i);
		}
		public Query_continuationContext query_continuation() {
			return getRuleContext(Query_continuationContext.class,0);
		}
		public Query_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQuery_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_bodyContext query_body() throws RecognitionException {
		Query_bodyContext _localctx = new Query_bodyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_query_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (FROM - 48)) | (1L << (JOIN - 48)) | (1L << (LET - 48)) | (1L << (ORDERBY - 48)) | (1L << (WHERE - 48)))) != 0)) {
				{
				{
				setState(1212);
				query_body_clause();
				}
				}
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1218);
			select_or_group_clause();
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1219);
				query_continuation();
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

	public static class Query_body_clauseContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Let_clauseContext let_clause() {
			return getRuleContext(Let_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Combined_join_clauseContext combined_join_clause() {
			return getRuleContext(Combined_join_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Query_body_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_body_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_body_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQuery_body_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_body_clauseContext query_body_clause() throws RecognitionException {
		Query_body_clauseContext _localctx = new Query_body_clauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_query_body_clause);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				from_clause();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223);
				let_clause();
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1224);
				where_clause();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1225);
				combined_join_clause();
				}
				break;
			case ORDERBY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1226);
				orderby_clause();
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

	public static class Let_clauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Let_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_clauseContext let_clause() throws RecognitionException {
		Let_clauseContext _localctx = new Let_clauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_let_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(LET);
			setState(1230);
			identifier();
			setState(1231);
			match(ASSIGNMENT);
			setState(1232);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(WHERE);
			setState(1235);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Combined_join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ON() { return getToken(CSharpParser.ON, 0); }
		public TerminalNode EQUALS() { return getToken(CSharpParser.EQUALS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public Combined_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCombined_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCombined_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCombined_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Combined_join_clauseContext combined_join_clause() throws RecognitionException {
		Combined_join_clauseContext _localctx = new Combined_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_combined_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(JOIN);
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1238);
				type_();
				}
				break;
			}
			setState(1241);
			identifier();
			setState(1242);
			match(IN);
			setState(1243);
			expression();
			setState(1244);
			match(ON);
			setState(1245);
			expression();
			setState(1246);
			match(EQUALS);
			setState(1247);
			expression();
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1248);
				match(INTO);
				setState(1249);
				identifier();
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

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(CSharpParser.ORDERBY, 0); }
		public List<OrderingContext> ordering() {
			return getRuleContexts(OrderingContext.class);
		}
		public OrderingContext ordering(int i) {
			return getRuleContext(OrderingContext.class,i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOrderby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOrderby_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitOrderby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(ORDERBY);
			setState(1253);
			ordering();
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1254);
				match(COMMA);
				setState(1255);
				ordering();
				}
				}
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OrderingContext extends ParserRuleContext {
		public Token dir;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASCENDING() { return getToken(CSharpParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(CSharpParser.DESCENDING, 0); }
		public OrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitOrdering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderingContext ordering() throws RecognitionException {
		OrderingContext _localctx = new OrderingContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			expression();
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASCENDING || _la==DESCENDING) {
				{
				setState(1262);
				((OrderingContext)_localctx).dir = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASCENDING || _la==DESCENDING) ) {
					((OrderingContext)_localctx).dir = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Select_or_group_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(CSharpParser.SELECT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(CSharpParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(CSharpParser.BY, 0); }
		public Select_or_group_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_group_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSelect_or_group_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSelect_or_group_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSelect_or_group_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_group_clauseContext select_or_group_clause() throws RecognitionException {
		Select_or_group_clauseContext _localctx = new Select_or_group_clauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_select_or_group_clause);
		try {
			setState(1272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1265);
				match(SELECT);
				setState(1266);
				expression();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				match(GROUP);
				setState(1268);
				expression();
				setState(1269);
				match(BY);
				setState(1270);
				expression();
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

	public static class Query_continuationContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_continuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_continuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_continuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQuery_continuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_continuationContext query_continuation() throws RecognitionException {
		Query_continuationContext _localctx = new Query_continuationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_query_continuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			match(INTO);
			setState(1275);
			identifier();
			setState(1276);
			query_body();
			}
		}
		catch (RecognitionException re) {
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
		public Labeled_StatementContext labeled_Statement() {
			return getRuleContext(Labeled_StatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_statement);
		try {
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				labeled_Statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279);
				declarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1280);
				embedded_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public Local_constant_declarationContext local_constant_declaration() {
			return getRuleContext(Local_constant_declarationContext.class,0);
		}
		public Local_function_declarationContext local_function_declaration() {
			return getRuleContext(Local_function_declarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_declarationStatement);
		try {
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283);
				local_variable_declaration();
				setState(1284);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				local_constant_declaration();
				setState(1287);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1289);
				local_function_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_function_declarationContext extends ParserRuleContext {
		public Local_function_headerContext local_function_header() {
			return getRuleContext(Local_function_headerContext.class,0);
		}
		public Local_function_bodyContext local_function_body() {
			return getRuleContext(Local_function_bodyContext.class,0);
		}
		public Local_function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_function_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_function_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_function_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_function_declarationContext local_function_declaration() throws RecognitionException {
		Local_function_declarationContext _localctx = new Local_function_declarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_local_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			local_function_header();
			setState(1293);
			local_function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_function_headerContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Local_function_modifiersContext local_function_modifiers() {
			return getRuleContext(Local_function_modifiersContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Local_function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_function_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_function_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_function_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_function_headerContext local_function_header() throws RecognitionException {
		Local_function_headerContext _localctx = new Local_function_headerContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_local_function_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1295);
				local_function_modifiers();
				}
				break;
			}
			setState(1298);
			return_type();
			setState(1299);
			identifier();
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1300);
				type_parameter_list();
				}
			}

			setState(1303);
			match(OPEN_PARENS);
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
				{
				setState(1304);
				formal_parameter_list();
				}
			}

			setState(1307);
			match(CLOSE_PARENS);
			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1308);
				type_parameter_constraints_clauses();
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

	public static class Local_function_modifiersContext extends ParserRuleContext {
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public Local_function_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_function_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_function_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_function_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_function_modifiersContext local_function_modifiers() throws RecognitionException {
		Local_function_modifiersContext _localctx = new Local_function_modifiersContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_local_function_modifiers);
		int _la;
		try {
			setState(1317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASYNC:
			case UNSAFE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==UNSAFE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(1312);
					match(STATIC);
					}
				}

				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				match(STATIC);
				setState(1316);
				_la = _input.LA(1);
				if ( !(_la==ASYNC || _la==UNSAFE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class Local_function_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public Local_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_function_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_function_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_function_bodyContext local_function_body() throws RecognitionException {
		Local_function_bodyContext _localctx = new Local_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_local_function_body);
		try {
			setState(1324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1319);
				block();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				right_arrow();
				setState(1321);
				throwable_expression();
				setState(1322);
				match(SEMICOLON);
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

	public static class Labeled_StatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLabeled_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLabeled_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLabeled_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_StatementContext labeled_Statement() throws RecognitionException {
		Labeled_StatementContext _localctx = new Labeled_StatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_labeled_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			identifier();
			setState(1327);
			match(COLON);
			setState(1328);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Embedded_statementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public Selection_statementsContext selection_statements() {
			return getRuleContext(Selection_statementsContext.class,0);
		}
		public Iteration_statementsContext iteration_statements() {
			return getRuleContext(Iteration_statementsContext.class,0);
		}
		public Altered_jump_statementsContext altered_jump_statements() {
			return getRuleContext(Altered_jump_statementsContext.class,0);
		}
		public Embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embedded_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEmbedded_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEmbedded_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEmbedded_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Embedded_statementContext embedded_statement() throws RecognitionException {
		Embedded_statementContext _localctx = new Embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_embedded_statement);
		try {
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1330);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1331);
				simple_embedded_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1332);
				selection_statements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1333);
				iteration_statements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1334);
				altered_jump_statements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_expressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			match(IF);
			setState(1338);
			match(OPEN_PARENS);
			setState(1339);
			expression();
			setState(1340);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_StatementContext extends ParserRuleContext {
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public List<If_bodyContext> if_body() {
			return getRuleContexts(If_bodyContext.class);
		}
		public If_bodyContext if_body(int i) {
			return getRuleContext(If_bodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public If_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIf_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIf_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIf_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_StatementContext if_Statement() throws RecognitionException {
		If_StatementContext _localctx = new If_StatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_if_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			if_expression();
			setState(1343);
			if_body();
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1344);
				match(ELSE);
				setState(1345);
				if_body();
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

	public static class Switch_expressionsContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Switch_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitch_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitch_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSwitch_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_expressionsContext switch_expressions() throws RecognitionException {
		Switch_expressionsContext _localctx = new Switch_expressionsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_switch_expressions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(SWITCH);
			setState(1349);
			match(OPEN_PARENS);
			setState(1350);
			expression();
			setState(1351);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public Switch_expressionsContext switch_expressions() {
			return getRuleContext(Switch_expressionsContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Switch_sectionContext> switch_section() {
			return getRuleContexts(Switch_sectionContext.class);
		}
		public Switch_sectionContext switch_section(int i) {
			return getRuleContext(Switch_sectionContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			switch_expressions();
			setState(1354);
			match(OPEN_BRACE);
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1355);
				switch_section();
				}
				}
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1361);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_statementsContext extends ParserRuleContext {
		public If_StatementContext if_Statement() {
			return getRuleContext(If_StatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public Selection_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSelection_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSelection_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSelection_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementsContext selection_statements() throws RecognitionException {
		Selection_statementsContext _localctx = new Selection_statementsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_selection_statements);
		try {
			setState(1365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1363);
				if_Statement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1364);
				switchStatement();
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

	public static class Iteration_statementsContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public Iteration_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIteration_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIteration_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIteration_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementsContext iteration_statements() throws RecognitionException {
		Iteration_statementsContext _localctx = new Iteration_statementsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_iteration_statements);
		try {
			setState(1371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				whileStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368);
				doStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1369);
				forStatement();
				}
				break;
			case AWAIT:
			case FOREACH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1370);
				foreachStatement();
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

	public static class While_expressionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public While_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterWhile_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitWhile_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitWhile_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_expressionContext while_expression() throws RecognitionException {
		While_expressionContext _localctx = new While_expressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_while_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			match(WHILE);
			setState(1374);
			match(OPEN_PARENS);
			setState(1375);
			expression();
			setState(1376);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public While_expressionContext while_expression() {
			return getRuleContext(While_expressionContext.class,0);
		}
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			while_expression();
			setState(1379);
			embedded_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(DO);
			setState(1382);
			embedded_statement();
			setState(1383);
			match(WHILE);
			setState(1384);
			match(OPEN_PARENS);
			setState(1385);
			expression();
			setState(1386);
			match(CLOSE_PARENS);
			setState(1387);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_expressionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public For_initializerContext for_initializer() {
			return getRuleContext(For_initializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_iteratorContext for_iterator() {
			return getRuleContext(For_iteratorContext.class,0);
		}
		public For_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_expressionContext for_expression() throws RecognitionException {
		For_expressionContext _localctx = new For_expressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_for_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			match(FOR);
			setState(1390);
			match(OPEN_PARENS);
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FIXED) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (USING - 64)) | (1L << (VAR - 64)) | (1L << (VOID - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(1391);
				for_initializer();
				}
			}

			setState(1394);
			match(SEMICOLON);
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(1395);
				expression();
				}
			}

			setState(1398);
			match(SEMICOLON);
			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(1399);
				for_iterator();
				}
			}

			setState(1402);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public For_expressionContext for_expression() {
			return getRuleContext(For_expressionContext.class,0);
		}
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			for_expression();
			setState(1405);
			embedded_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_expressionContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public Foreach_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterForeach_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitForeach_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitForeach_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_expressionContext foreach_expression() throws RecognitionException {
		Foreach_expressionContext _localctx = new Foreach_expressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_foreach_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(1407);
				match(AWAIT);
				}
			}

			setState(1410);
			match(FOREACH);
			setState(1411);
			match(OPEN_PARENS);
			setState(1412);
			local_variable_type();
			setState(1413);
			identifier();
			setState(1414);
			match(IN);
			setState(1415);
			expression();
			setState(1416);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public Foreach_expressionContext foreach_expression() {
			return getRuleContext(Foreach_expressionContext.class,0);
		}
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			foreach_expression();
			setState(1419);
			embedded_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Altered_jump_statementsContext extends ParserRuleContext {
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public Altered_jump_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altered_jump_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAltered_jump_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAltered_jump_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAltered_jump_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Altered_jump_statementsContext altered_jump_statements() throws RecognitionException {
		Altered_jump_statementsContext _localctx = new Altered_jump_statementsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_altered_jump_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			tryStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_expressionContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public Try_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTry_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTry_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTry_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_expressionContext try_expression() throws RecognitionException {
		Try_expressionContext _localctx = new Try_expressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_try_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(TRY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public Try_expressionContext try_expression() {
			return getRuleContext(Try_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			try_expression();
			setState(1426);
			block();
			setState(1432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATCH:
				{
				setState(1427);
				catch_clauses();
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1428);
					finally_clause();
					}
				}

				}
				break;
			case FINALLY:
				{
				setState(1431);
				finally_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Simple_embedded_statementContext extends ParserRuleContext {
		public Simple_embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_embedded_statement; }
	 
		public Simple_embedded_statementContext() { }
		public void copyFrom(Simple_embedded_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCheckedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCheckedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCheckedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowStatementContext extends Simple_embedded_statementContext {
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TheEmptyStatementContext extends Simple_embedded_statementContext {
		public TheEmptyStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTheEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTheEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTheEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsafeStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UnsafeStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUnsafeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUnsafeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUnsafeStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatementContext extends Simple_embedded_statementContext {
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public BreakStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends Simple_embedded_statementContext {
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode GOTO() { return getToken(CSharpParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public GotoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FixedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Fixed_pointer_declaratorsContext fixed_pointer_declarators() {
			return getRuleContext(Fixed_pointer_declaratorsContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public FixedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUncheckedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUncheckedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUncheckedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStatementContext extends Simple_embedded_statementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public ContinueStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UsingStatementContext extends Simple_embedded_statementContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Resource_acquisitionContext resource_acquisition() {
			return getRuleContext(Resource_acquisitionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public UsingStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUsingStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LockStatementContext extends Simple_embedded_statementContext {
		public TerminalNode LOCK() { return getToken(CSharpParser.LOCK, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public LockStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YieldStatementContext extends Simple_embedded_statementContext {
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public YieldStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterYieldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitYieldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitYieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_embedded_statementContext simple_embedded_statement() throws RecognitionException {
		Simple_embedded_statementContext _localctx = new Simple_embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_simple_embedded_statement);
		int _la;
		try {
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				_localctx = new TheEmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				expression();
				setState(1436);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1438);
				match(BREAK);
				setState(1439);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1440);
				match(CONTINUE);
				setState(1441);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1442);
				match(GOTO);
				setState(1447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SELECT:
				case SET:
				case UNMANAGED:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(1443);
					identifier();
					}
					break;
				case CASE:
					{
					setState(1444);
					match(CASE);
					setState(1445);
					expression();
					}
					break;
				case DEFAULT:
					{
					setState(1446);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1449);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1450);
				match(RETURN);
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(1451);
					expression();
					}
				}

				setState(1454);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1455);
				match(THROW);
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(1456);
					expression();
					}
				}

				setState(1459);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new CheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1460);
				match(CHECKED);
				setState(1461);
				block();
				}
				break;
			case 9:
				_localctx = new UncheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1462);
				match(UNCHECKED);
				setState(1463);
				block();
				}
				break;
			case 10:
				_localctx = new LockStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1464);
				match(LOCK);
				setState(1465);
				match(OPEN_PARENS);
				setState(1466);
				expression();
				setState(1467);
				match(CLOSE_PARENS);
				setState(1468);
				embedded_statement();
				}
				break;
			case 11:
				_localctx = new UsingStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1470);
				match(USING);
				setState(1471);
				match(OPEN_PARENS);
				setState(1472);
				resource_acquisition();
				setState(1473);
				match(CLOSE_PARENS);
				setState(1474);
				embedded_statement();
				}
				break;
			case 12:
				_localctx = new YieldStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1476);
				match(YIELD);
				setState(1480);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(1477);
					match(RETURN);
					setState(1478);
					expression();
					}
					break;
				case BREAK:
					{
					setState(1479);
					match(BREAK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1482);
				match(SEMICOLON);
				}
				break;
			case 13:
				_localctx = new UnsafeStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1483);
				match(UNSAFE);
				setState(1484);
				block();
				}
				break;
			case 14:
				_localctx = new FixedStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1485);
				match(FIXED);
				setState(1486);
				match(OPEN_PARENS);
				setState(1487);
				pointer_type();
				setState(1488);
				fixed_pointer_declarators();
				setState(1489);
				match(CLOSE_PARENS);
				setState(1490);
				embedded_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(OPEN_BRACE);
			setState(1496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DO) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << FROM) | (1L << GET) | (1L << GOTO) | (1L << GROUP) | (1L << IF) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LOCK) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (RETURN - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (SWITCH - 64)) | (1L << (THIS - 64)) | (1L << (THROW - 64)) | (1L << (TRUE - 64)) | (1L << (TRY - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (USING - 64)) | (1L << (VAR - 64)) | (1L << (VOID - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (WHILE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)) | (1L << (OPEN_BRACE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (SEMICOLON - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(1495);
				statement_list();
				}
			}

			setState(1498);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declarationContext extends ParserRuleContext {
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public List<Local_variable_declaratorContext> local_variable_declarator() {
			return getRuleContexts(Local_variable_declaratorContext.class);
		}
		public Local_variable_declaratorContext local_variable_declarator(int i) {
			return getRuleContext(Local_variable_declaratorContext.class,i);
		}
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Fixed_pointer_declaratorsContext fixed_pointer_declarators() {
			return getRuleContext(Fixed_pointer_declaratorsContext.class,0);
		}
		public Local_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_declarationContext local_variable_declaration() throws RecognitionException {
		Local_variable_declarationContext _localctx = new Local_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_local_variable_declaration);
		int _la;
		try {
			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case USING:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1500);
					match(USING);
					}
					break;
				case 2:
					{
					setState(1501);
					match(REF);
					}
					break;
				case 3:
					{
					setState(1502);
					match(REF);
					setState(1503);
					match(READONLY);
					}
					break;
				}
				setState(1506);
				local_variable_type();
				setState(1507);
				local_variable_declarator();
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1508);
					match(COMMA);
					setState(1509);
					local_variable_declarator();
					}
					}
					setState(1514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FIXED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1515);
				match(FIXED);
				setState(1516);
				pointer_type();
				setState(1517);
				fixed_pointer_declarators();
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

	public static class Local_variable_typeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Local_variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_variable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_typeContext local_variable_type() throws RecognitionException {
		Local_variable_typeContext _localctx = new Local_variable_typeContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_local_variable_type);
		try {
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				type_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Local_variable_initializerContext local_variable_initializer() {
			return getRuleContext(Local_variable_initializerContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public Local_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_variable_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_declaratorContext local_variable_declarator() throws RecognitionException {
		Local_variable_declaratorContext _localctx = new Local_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_local_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			identifier();
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1526);
				match(ASSIGNMENT);
				setState(1528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1527);
					match(REF);
					}
					break;
				}
				setState(1530);
				local_variable_initializer();
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

	public static class Local_variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Stackalloc_initializerContext stackalloc_initializer() {
			return getRuleContext(Stackalloc_initializerContext.class,0);
		}
		public Local_variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_variable_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_initializerContext local_variable_initializer() throws RecognitionException {
		Local_variable_initializerContext _localctx = new Local_variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_local_variable_initializer);
		try {
			setState(1536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				array_initializer();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1535);
				stackalloc_initializer();
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

	public static class Local_constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public Local_constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_constant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_constant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_constant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_constant_declarationContext local_constant_declaration() throws RecognitionException {
		Local_constant_declarationContext _localctx = new Local_constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_local_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			match(CONST);
			setState(1539);
			type_();
			setState(1540);
			constant_declarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIf_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIf_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_if_body);
		try {
			setState(1544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542);
				block();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case THROW:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543);
				simple_embedded_statement();
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

	public static class Switch_sectionContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public Switch_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitch_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitch_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSwitch_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_sectionContext switch_section() throws RecognitionException {
		Switch_sectionContext _localctx = new Switch_sectionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_switch_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1547); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1546);
					switch_label();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1549); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1551);
			statement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_guardContext case_guard() {
			return getRuleContext(Case_guardContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public Switch_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitch_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitch_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSwitch_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_labelContext switch_label() throws RecognitionException {
		Switch_labelContext _localctx = new Switch_labelContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_switch_label);
		int _la;
		try {
			setState(1562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1553);
				match(CASE);
				setState(1554);
				expression();
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(1555);
					case_guard();
					}
				}

				setState(1558);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1560);
				match(DEFAULT);
				setState(1561);
				match(COLON);
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

	public static class Case_guardContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_guardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCase_guard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCase_guard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCase_guard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_guardContext case_guard() throws RecognitionException {
		Case_guardContext _localctx = new Case_guardContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_case_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			match(WHEN);
			setState(1565);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1568); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1567);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1570); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initializerContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFor_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFor_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initializerContext for_initializer() throws RecognitionException {
		For_initializerContext _localctx = new For_initializerContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_for_initializer);
		int _la;
		try {
			setState(1581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1572);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
				expression();
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1574);
					match(COMMA);
					setState(1575);
					expression();
					}
					}
					setState(1580);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class For_iteratorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_iteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFor_iterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFor_iterator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFor_iterator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_iteratorContext for_iterator() throws RecognitionException {
		For_iteratorContext _localctx = new For_iteratorContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_for_iterator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			expression();
			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1584);
				match(COMMA);
				setState(1585);
				expression();
				}
				}
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Catch_clausesContext extends ParserRuleContext {
		public List<Specific_catch_clauseContext> specific_catch_clause() {
			return getRuleContexts(Specific_catch_clauseContext.class);
		}
		public Specific_catch_clauseContext specific_catch_clause(int i) {
			return getRuleContext(Specific_catch_clauseContext.class,i);
		}
		public General_catch_clauseContext general_catch_clause() {
			return getRuleContext(General_catch_clauseContext.class,0);
		}
		public Specific_catch_clause_no_blockContext specific_catch_clause_no_block() {
			return getRuleContext(Specific_catch_clause_no_blockContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCatch_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCatch_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCatch_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_catch_clauses);
		int _la;
		try {
			int _alt;
			setState(1603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1591);
				specific_catch_clause();
				setState(1595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1592);
						specific_catch_clause();
						}
						} 
					}
					setState(1597);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1598);
					general_catch_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
				general_catch_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1602);
				specific_catch_clause_no_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specific_catch_clauseContext extends ParserRuleContext {
		public Specific_catch_clause_no_blockContext specific_catch_clause_no_block() {
			return getRuleContext(Specific_catch_clause_no_blockContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public Specific_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specific_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSpecific_catch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSpecific_catch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSpecific_catch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specific_catch_clauseContext specific_catch_clause() throws RecognitionException {
		Specific_catch_clauseContext _localctx = new Specific_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_specific_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			specific_catch_clause_no_block();
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1606);
				exception_filter();
				}
			}

			setState(1609);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specific_catch_clause_no_blockContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Specific_catch_clause_no_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specific_catch_clause_no_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSpecific_catch_clause_no_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSpecific_catch_clause_no_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSpecific_catch_clause_no_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specific_catch_clause_no_blockContext specific_catch_clause_no_block() throws RecognitionException {
		Specific_catch_clause_no_blockContext _localctx = new Specific_catch_clause_no_blockContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_specific_catch_clause_no_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			match(CATCH);
			setState(1612);
			match(OPEN_PARENS);
			setState(1613);
			class_type();
			setState(1615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(1614);
				identifier();
				}
			}

			setState(1617);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public General_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGeneral_catch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGeneral_catch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGeneral_catch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final General_catch_clauseContext general_catch_clause() throws RecognitionException {
		General_catch_clauseContext _localctx = new General_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_general_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			match(CATCH);
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1620);
				exception_filter();
				}
			}

			setState(1623);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_filterContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Exception_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterException_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitException_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitException_filter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_filterContext exception_filter() throws RecognitionException {
		Exception_filterContext _localctx = new Exception_filterContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_exception_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			match(WHEN);
			setState(1626);
			match(OPEN_PARENS);
			setState(1627);
			expression();
			setState(1628);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_clauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFinally_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFinally_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFinally_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_clauseContext finally_clause() throws RecognitionException {
		Finally_clauseContext _localctx = new Finally_clauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(FINALLY);
			setState(1632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1631);
				block();
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

	public static class Resource_acquisitionContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Resource_acquisitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_acquisition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterResource_acquisition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitResource_acquisition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitResource_acquisition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_acquisitionContext resource_acquisition() throws RecognitionException {
		Resource_acquisitionContext _localctx = new Resource_acquisitionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_resource_acquisition);
		try {
			setState(1636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1635);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_declarationContext extends ParserRuleContext {
		public Qualified_identifierContext qi;
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public Namespace_bodyContext namespace_body() {
			return getRuleContext(Namespace_bodyContext.class,0);
		}
		public Qualified_identifierContext qualified_identifier() {
			return getRuleContext(Qualified_identifierContext.class,0);
		}
		public Namespace_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNamespace_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_declarationContext namespace_declaration() throws RecognitionException {
		Namespace_declarationContext _localctx = new Namespace_declarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_namespace_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			match(NAMESPACE);
			setState(1639);
			((Namespace_declarationContext)_localctx).qi = qualified_identifier();
			setState(1640);
			namespace_body();
			setState(1642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1641);
				match(SEMICOLON);
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

	public static class Qualified_identifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Qualified_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQualified_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQualified_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQualified_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_identifierContext qualified_identifier() throws RecognitionException {
		Qualified_identifierContext _localctx = new Qualified_identifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_qualified_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			identifier();
			setState(1649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1645);
				match(DOT);
				setState(1646);
				identifier();
				}
				}
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Namespace_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Extern_alias_directivesContext extern_alias_directives() {
			return getRuleContext(Extern_alias_directivesContext.class,0);
		}
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Namespace_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNamespace_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_bodyContext namespace_body() throws RecognitionException {
		Namespace_bodyContext _localctx = new Namespace_bodyContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_namespace_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			match(OPEN_BRACE);
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1653);
				extern_alias_directives();
				}
				break;
			}
			setState(1657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1656);
				using_directives();
				}
			}

			setState(1660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NAMESPACE - 65)) | (1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REF - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (STRUCT - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0)) {
				{
				setState(1659);
				namespace_member_declarations();
				}
			}

			setState(1662);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extern_alias_directivesContext extends ParserRuleContext {
		public List<Extern_alias_directiveContext> extern_alias_directive() {
			return getRuleContexts(Extern_alias_directiveContext.class);
		}
		public Extern_alias_directiveContext extern_alias_directive(int i) {
			return getRuleContext(Extern_alias_directiveContext.class,i);
		}
		public Extern_alias_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_alias_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExtern_alias_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExtern_alias_directives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExtern_alias_directives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extern_alias_directivesContext extern_alias_directives() throws RecognitionException {
		Extern_alias_directivesContext _localctx = new Extern_alias_directivesContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_extern_alias_directives);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
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
					extern_alias_directive();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1667); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extern_alias_directiveContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode ALIAS() { return getToken(CSharpParser.ALIAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Extern_alias_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_alias_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExtern_alias_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExtern_alias_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExtern_alias_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extern_alias_directiveContext extern_alias_directive() throws RecognitionException {
		Extern_alias_directiveContext _localctx = new Extern_alias_directiveContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_extern_alias_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			match(EXTERN);
			setState(1670);
			match(ALIAS);
			setState(1671);
			identifier();
			setState(1672);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directivesContext extends ParserRuleContext {
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public Using_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsing_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsing_directives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUsing_directives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_directivesContext using_directives() throws RecognitionException {
		Using_directivesContext _localctx = new Using_directivesContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_using_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1674);
				using_directive();
				}
				}
				setState(1677); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directiveContext extends ParserRuleContext {
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
	 
		public Using_directiveContext() { }
		public void copyFrom(Using_directiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UsingAliasDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public UsingAliasDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingAliasDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingAliasDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUsingAliasDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UsingNamespaceDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public UsingNamespaceDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingNamespaceDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingNamespaceDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUsingNamespaceDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UsingStaticDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public UsingStaticDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingStaticDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingStaticDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUsingStaticDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_using_directive);
		try {
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				_localctx = new UsingAliasDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1679);
				match(USING);
				setState(1680);
				identifier();
				setState(1681);
				match(ASSIGNMENT);
				setState(1682);
				namespace_or_type_name();
				setState(1683);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new UsingNamespaceDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1685);
				match(USING);
				setState(1686);
				namespace_or_type_name();
				setState(1687);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new UsingStaticDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1689);
				match(USING);
				setState(1690);
				match(STATIC);
				setState(1691);
				namespace_or_type_name();
				setState(1692);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationsContext extends ParserRuleContext {
		public List<Namespace_member_declarationContext> namespace_member_declaration() {
			return getRuleContexts(Namespace_member_declarationContext.class);
		}
		public Namespace_member_declarationContext namespace_member_declaration(int i) {
			return getRuleContext(Namespace_member_declarationContext.class,i);
		}
		public Namespace_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_member_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNamespace_member_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_member_declarationsContext namespace_member_declarations() throws RecognitionException {
		Namespace_member_declarationsContext _localctx = new Namespace_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_namespace_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1696);
				namespace_member_declaration();
				}
				}
				setState(1699); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NAMESPACE - 65)) | (1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REF - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (STRUCT - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)) | (1L << (OPEN_BRACKET - 65)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationContext extends ParserRuleContext {
		public Namespace_declarationContext namespace_declaration() {
			return getRuleContext(Namespace_declarationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Namespace_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNamespace_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_member_declarationContext namespace_member_declaration() throws RecognitionException {
		Namespace_member_declarationContext _localctx = new Namespace_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_namespace_member_declaration);
		try {
			setState(1703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701);
				namespace_declaration();
				}
				break;
			case ABSTRACT:
			case ASYNC:
			case CLASS:
			case DELEGATE:
			case ENUM:
			case EXTERN:
			case INTERFACE:
			case INTERNAL:
			case NEW:
			case OVERRIDE:
			case PARTIAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case REF:
			case SEALED:
			case STATIC:
			case STRUCT:
			case UNSAFE:
			case VIRTUAL:
			case VOLATILE:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1702);
				type_declaration();
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

	public static class Type_declarationContext extends ParserRuleContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1705);
				attributes();
				}
			}

			setState(1709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1708);
				all_member_modifiers();
				}
				break;
			}
			setState(1716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1711);
				class_definition();
				}
				break;
			case READONLY:
			case REF:
			case STRUCT:
				{
				setState(1712);
				struct_definition();
				}
				break;
			case INTERFACE:
				{
				setState(1713);
				interface_definition();
				}
				break;
			case ENUM:
				{
				setState(1714);
				enum_definition();
				}
				break;
			case DELEGATE:
				{
				setState(1715);
				delegate_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Qualified_alias_memberContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Qualified_alias_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_alias_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQualified_alias_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQualified_alias_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQualified_alias_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_alias_memberContext qualified_alias_member() throws RecognitionException {
		Qualified_alias_memberContext _localctx = new Qualified_alias_memberContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_qualified_alias_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			identifier();
			setState(1719);
			match(DOUBLE_COLON);
			setState(1720);
			identifier();
			setState(1722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1721);
				type_argument_list();
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

	public static class Type_parameter_listContext extends ParserRuleContext {
		public List<Type_parameterContext> type_parameter() {
			return getRuleContexts(Type_parameterContext.class);
		}
		public Type_parameterContext type_parameter(int i) {
			return getRuleContext(Type_parameterContext.class,i);
		}
		public Type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameter_listContext type_parameter_list() throws RecognitionException {
		Type_parameter_listContext _localctx = new Type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			match(LT);
			setState(1725);
			type_parameter();
			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1726);
				match(COMMA);
				setState(1727);
				type_parameter();
				}
				}
				setState(1732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1733);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1735);
				attributes();
				}
			}

			setState(1738);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_baseContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Class_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_baseContext class_base() throws RecognitionException {
		Class_baseContext _localctx = new Class_baseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_class_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			match(COLON);
			setState(1741);
			class_type();
			setState(1746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1742);
				match(COMMA);
				setState(1743);
				namespace_or_type_name();
				}
				}
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Interface_type_listContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Interface_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_type_listContext interface_type_list() throws RecognitionException {
		Interface_type_listContext _localctx = new Interface_type_listContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_interface_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			namespace_or_type_name();
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1750);
				match(COMMA);
				setState(1751);
				namespace_or_type_name();
				}
				}
				setState(1756);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Type_parameter_constraints_clausesContext extends ParserRuleContext {
		public List<Type_parameter_constraints_clauseContext> type_parameter_constraints_clause() {
			return getRuleContexts(Type_parameter_constraints_clauseContext.class);
		}
		public Type_parameter_constraints_clauseContext type_parameter_constraints_clause(int i) {
			return getRuleContext(Type_parameter_constraints_clauseContext.class,i);
		}
		public Type_parameter_constraints_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_constraints_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_constraints_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_parameter_constraints_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() throws RecognitionException {
		Type_parameter_constraints_clausesContext _localctx = new Type_parameter_constraints_clausesContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_type_parameter_constraints_clauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1758); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1757);
					type_parameter_constraints_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1760); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraints_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_parameter_constraintsContext type_parameter_constraints() {
			return getRuleContext(Type_parameter_constraintsContext.class,0);
		}
		public Type_parameter_constraints_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_constraints_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_constraints_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_parameter_constraints_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameter_constraints_clauseContext type_parameter_constraints_clause() throws RecognitionException {
		Type_parameter_constraints_clauseContext _localctx = new Type_parameter_constraints_clauseContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_type_parameter_constraints_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			match(WHERE);
			setState(1763);
			identifier();
			setState(1764);
			match(COLON);
			setState(1765);
			type_parameter_constraints();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraintsContext extends ParserRuleContext {
		public Constructor_constraintContext constructor_constraint() {
			return getRuleContext(Constructor_constraintContext.class,0);
		}
		public Primary_constraintContext primary_constraint() {
			return getRuleContext(Primary_constraintContext.class,0);
		}
		public Secondary_constraintsContext secondary_constraints() {
			return getRuleContext(Secondary_constraintsContext.class,0);
		}
		public Type_parameter_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_constraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_constraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_parameter_constraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameter_constraintsContext type_parameter_constraints() throws RecognitionException {
		Type_parameter_constraintsContext _localctx = new Type_parameter_constraintsContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_type_parameter_constraints);
		int _la;
		try {
			setState(1777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1767);
				constructor_constraint();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case CLASS:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case STRUCT:
			case UNMANAGED:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1768);
				primary_constraint();
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1769);
					match(COMMA);
					setState(1770);
					secondary_constraints();
					}
					break;
				}
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1773);
					match(COMMA);
					setState(1774);
					constructor_constraint();
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

	public static class Primary_constraintContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public TerminalNode UNMANAGED() { return getToken(CSharpParser.UNMANAGED, 0); }
		public Primary_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPrimary_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPrimary_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitPrimary_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_constraintContext primary_constraint() throws RecognitionException {
		Primary_constraintContext _localctx = new Primary_constraintContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_primary_constraint);
		int _la;
		try {
			setState(1786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1779);
				class_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1780);
				match(CLASS);
				setState(1782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERR) {
					{
					setState(1781);
					match(INTERR);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1784);
				match(STRUCT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1785);
				match(UNMANAGED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Secondary_constraintsContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Secondary_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSecondary_constraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSecondary_constraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSecondary_constraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Secondary_constraintsContext secondary_constraints() throws RecognitionException {
		Secondary_constraintsContext _localctx = new Secondary_constraintsContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_secondary_constraints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			namespace_or_type_name();
			setState(1793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1789);
					match(COMMA);
					setState(1790);
					namespace_or_type_name();
					}
					} 
				}
				setState(1795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
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

	public static class Constructor_constraintContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Constructor_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstructor_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstructor_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstructor_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_constraintContext constructor_constraint() throws RecognitionException {
		Constructor_constraintContext _localctx = new Constructor_constraintContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_constructor_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			match(NEW);
			setState(1797);
			match(OPEN_PARENS);
			setState(1798);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Class_member_declarationsContext class_member_declarations() {
			return getRuleContext(Class_member_declarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			match(OPEN_BRACE);
			setState(1802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SEALED - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCT - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNMANAGED - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) || _la==OPEN_PARENS || _la==TILDE) {
				{
				setState(1801);
				class_member_declarations();
				}
			}

			setState(1804);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationsContext extends ParserRuleContext {
		public List<Class_member_declarationContext> class_member_declaration() {
			return getRuleContexts(Class_member_declarationContext.class);
		}
		public Class_member_declarationContext class_member_declaration(int i) {
			return getRuleContext(Class_member_declarationContext.class,i);
		}
		public Class_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_member_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_member_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_member_declarationsContext class_member_declarations() throws RecognitionException {
		Class_member_declarationsContext _localctx = new Class_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_class_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1806);
				class_member_declaration();
				}
				}
				setState(1809); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SEALED - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCT - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNMANAGED - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) || _la==OPEN_PARENS || _la==TILDE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public Destructor_definitionContext destructor_definition() {
			return getRuleContext(Destructor_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Class_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_member_declarationContext class_member_declaration() throws RecognitionException {
		Class_member_declarationContext _localctx = new Class_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_class_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1811);
				attributes();
				}
			}

			setState(1815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1814);
				all_member_modifiers();
				}
				break;
			}
			setState(1819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case READONLY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case OPEN_PARENS:
				{
				setState(1817);
				common_member_declaration();
				}
				break;
			case TILDE:
				{
				setState(1818);
				destructor_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class All_member_modifiersContext extends ParserRuleContext {
		public List<All_member_modifierContext> all_member_modifier() {
			return getRuleContexts(All_member_modifierContext.class);
		}
		public All_member_modifierContext all_member_modifier(int i) {
			return getRuleContext(All_member_modifierContext.class,i);
		}
		public All_member_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAll_member_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAll_member_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAll_member_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_member_modifiersContext all_member_modifiers() throws RecognitionException {
		All_member_modifiersContext _localctx = new All_member_modifiersContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_all_member_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1822); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1821);
					all_member_modifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1824); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_member_modifierContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode VOLATILE() { return getToken(CSharpParser.VOLATILE, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public All_member_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAll_member_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAll_member_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAll_member_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_member_modifierContext all_member_modifier() throws RecognitionException {
		All_member_modifierContext _localctx = new All_member_modifierContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_all_member_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << EXTERN) | (1L << INTERNAL))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NEW - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PARTIAL - 66)) | (1L << (PRIVATE - 66)) | (1L << (PROTECTED - 66)) | (1L << (PUBLIC - 66)) | (1L << (READONLY - 66)) | (1L << (SEALED - 66)) | (1L << (STATIC - 66)) | (1L << (UNSAFE - 66)) | (1L << (VIRTUAL - 66)) | (1L << (VOLATILE - 66)))) != 0)) ) {
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

	public static class Common_member_declarationContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Typed_member_declarationContext typed_member_declaration() {
			return getRuleContext(Typed_member_declarationContext.class,0);
		}
		public Event_declarationContext event_declaration() {
			return getRuleContext(Event_declarationContext.class,0);
		}
		public Conversion_operator_declaratorContext conversion_operator_declarator() {
			return getRuleContext(Conversion_operator_declaratorContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Class_membersContext class_members() {
			return getRuleContext(Class_membersContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public Common_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCommon_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCommon_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCommon_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_member_declarationContext common_member_declaration() throws RecognitionException {
		Common_member_declarationContext _localctx = new Common_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_common_member_declaration);
		try {
			setState(1847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1828);
				constant_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1829);
				typed_member_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1830);
				event_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1831);
				conversion_operator_declarator();
				setState(1837);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACE:
				case SEMICOLON:
					{
					setState(1832);
					body();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1833);
					right_arrow();
					setState(1834);
					throwable_expression();
					setState(1835);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1839);
				constructor_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1840);
				match(VOID);
				setState(1841);
				method_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1842);
				class_members();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1843);
				struct_definition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1844);
				interface_definition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1845);
				enum_definition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1846);
				delegate_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typed_member_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public Indexer_declarationContext indexer_declaration() {
			return getRuleContext(Indexer_declarationContext.class,0);
		}
		public Method_expressionsContext method_expressions() {
			return getRuleContext(Method_expressionsContext.class,0);
		}
		public Property_declarationContext property_declaration() {
			return getRuleContext(Property_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public Typed_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTyped_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTyped_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTyped_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_member_declarationContext typed_member_declaration() throws RecognitionException {
		Typed_member_declarationContext _localctx = new Typed_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_typed_member_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1849);
				match(REF);
				}
				break;
			case 2:
				{
				setState(1850);
				match(READONLY);
				setState(1851);
				match(REF);
				}
				break;
			case 3:
				{
				setState(1852);
				match(REF);
				setState(1853);
				match(READONLY);
				}
				break;
			}
			setState(1856);
			type_();
			setState(1866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1857);
				namespace_or_type_name();
				setState(1858);
				match(DOT);
				setState(1859);
				indexer_declaration();
				}
				break;
			case 2:
				{
				setState(1861);
				method_expressions();
				}
				break;
			case 3:
				{
				setState(1862);
				property_declaration();
				}
				break;
			case 4:
				{
				setState(1863);
				indexer_declaration();
				}
				break;
			case 5:
				{
				setState(1864);
				operator_declaration();
				}
				break;
			case 6:
				{
				setState(1865);
				field_declaration();
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

	public static class Constant_declaratorsContext extends ParserRuleContext {
		public List<Constant_declaratorContext> constant_declarator() {
			return getRuleContexts(Constant_declaratorContext.class);
		}
		public Constant_declaratorContext constant_declarator(int i) {
			return getRuleContext(Constant_declaratorContext.class,i);
		}
		public Constant_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstant_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstant_declarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstant_declarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declaratorsContext constant_declarators() throws RecognitionException {
		Constant_declaratorsContext _localctx = new Constant_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_constant_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			constant_declarator();
			setState(1873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1869);
				match(COMMA);
				setState(1870);
				constant_declarator();
				}
				}
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Constant_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstant_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstant_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstant_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declaratorContext constant_declarator() throws RecognitionException {
		Constant_declaratorContext _localctx = new Constant_declaratorContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_constant_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			identifier();
			setState(1877);
			match(ASSIGNMENT);
			setState(1878);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaratorsContext extends ParserRuleContext {
		public List<Variable_declaratorContext> variable_declarator() {
			return getRuleContexts(Variable_declaratorContext.class);
		}
		public Variable_declaratorContext variable_declarator(int i) {
			return getRuleContext(Variable_declaratorContext.class,i);
		}
		public Variable_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariable_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariable_declarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariable_declarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaratorsContext variable_declarators() throws RecognitionException {
		Variable_declaratorsContext _localctx = new Variable_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			variable_declarator();
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1881);
				match(COMMA);
				setState(1882);
				variable_declarator();
				}
				}
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariable_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariable_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaratorContext variable_declarator() throws RecognitionException {
		Variable_declaratorContext _localctx = new Variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			identifier();
			setState(1891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1889);
				match(ASSIGNMENT);
				setState(1890);
				variable_initializer();
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

	public static class Variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariable_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariable_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariable_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_initializerContext variable_initializer() throws RecognitionException {
		Variable_initializerContext _localctx = new Variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_variable_initializer);
		try {
			setState(1895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1893);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1894);
				array_initializer();
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

	public static class Return_typeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_return_type);
		try {
			setState(1899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1897);
				type_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1898);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_nameContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			namespace_or_type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMethod_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_method_body);
		try {
			setState(1905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1903);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1904);
				match(SEMICOLON);
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

	public static class Formal_parameter_listContext extends ParserRuleContext {
		public Parameter_arrayContext parameter_array() {
			return getRuleContext(Parameter_arrayContext.class,0);
		}
		public Fixed_parametersContext fixed_parameters() {
			return getRuleContext(Fixed_parametersContext.class,0);
		}
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFormal_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFormal_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFormal_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_formal_parameter_list);
		int _la;
		try {
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1907);
				parameter_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1908);
				fixed_parameters();
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1909);
					match(COMMA);
					setState(1910);
					parameter_array();
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

	public static class Fixed_parametersContext extends ParserRuleContext {
		public List<Fixed_parameterContext> fixed_parameter() {
			return getRuleContexts(Fixed_parameterContext.class);
		}
		public Fixed_parameterContext fixed_parameter(int i) {
			return getRuleContext(Fixed_parameterContext.class,i);
		}
		public Fixed_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_parametersContext fixed_parameters() throws RecognitionException {
		Fixed_parametersContext _localctx = new Fixed_parametersContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_fixed_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			fixed_parameter();
			setState(1920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1916);
					match(COMMA);
					setState(1917);
					fixed_parameter();
					}
					} 
				}
				setState(1922);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_parameterContext extends ParserRuleContext {
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_modifierContext parameter_modifier() {
			return getRuleContext(Parameter_modifierContext.class,0);
		}
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public Fixed_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_parameterContext fixed_parameter() throws RecognitionException {
		Fixed_parameterContext _localctx = new Fixed_parameterContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_fixed_parameter);
		int _la;
		try {
			setState(1931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1923);
					attributes();
					}
				}

				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IN - 54)) | (1L << (OUT - 54)) | (1L << (REF - 54)) | (1L << (THIS - 54)))) != 0)) {
					{
					setState(1926);
					parameter_modifier();
					}
				}

				setState(1929);
				arg_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1930);
				match(ARGLIST);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_modifierContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Parameter_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterParameter_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitParameter_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitParameter_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_modifierContext parameter_modifier() throws RecognitionException {
		Parameter_modifierContext _localctx = new Parameter_modifierContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_parameter_modifier);
		try {
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1933);
				match(REF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1934);
				match(OUT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1935);
				match(IN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1936);
				match(REF);
				setState(1937);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1938);
				match(IN);
				setState(1939);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1940);
				match(THIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_arrayContext extends ParserRuleContext {
		public TerminalNode PARAMS() { return getToken(CSharpParser.PARAMS, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterParameter_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitParameter_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitParameter_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_arrayContext parameter_array() throws RecognitionException {
		Parameter_arrayContext _localctx = new Parameter_arrayContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_parameter_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1943);
				attributes();
				}
			}

			setState(1946);
			match(PARAMS);
			setState(1947);
			array_type();
			setState(1948);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_declarationsContext extends ParserRuleContext {
		public AttributesContext attrs;
		public Accessor_modifierContext mods;
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext set_accessor_declaration() {
			return getRuleContext(Set_accessor_declarationContext.class,0);
		}
		public Get_accessor_declarationContext get_accessor_declaration() {
			return getRuleContext(Get_accessor_declarationContext.class,0);
		}
		public Accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAccessor_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAccessor_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAccessor_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accessor_declarationsContext accessor_declarations() throws RecognitionException {
		Accessor_declarationsContext _localctx = new Accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1950);
				((Accessor_declarationsContext)_localctx).attrs = attributes();
				}
			}

			setState(1954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (INTERNAL - 57)) | (1L << (PRIVATE - 57)) | (1L << (PROTECTED - 57)))) != 0)) {
				{
				setState(1953);
				((Accessor_declarationsContext)_localctx).mods = accessor_modifier();
				}
			}

			setState(1966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(1956);
				match(GET);
				setState(1957);
				accessor_body();
				setState(1959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERNAL || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PRIVATE - 76)) | (1L << (PROTECTED - 76)) | (1L << (SET - 76)) | (1L << (OPEN_BRACKET - 76)))) != 0)) {
					{
					setState(1958);
					set_accessor_declaration();
					}
				}

				}
				break;
			case SET:
				{
				setState(1961);
				match(SET);
				setState(1962);
				accessor_body();
				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==INTERNAL || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PRIVATE - 76)) | (1L << (PROTECTED - 76)) | (1L << (OPEN_BRACKET - 76)))) != 0)) {
					{
					setState(1963);
					get_accessor_declaration();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Get_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Get_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGet_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGet_accessor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGet_accessor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_accessor_declarationContext get_accessor_declaration() throws RecognitionException {
		Get_accessor_declarationContext _localctx = new Get_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_get_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1968);
				attributes();
				}
			}

			setState(1972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (INTERNAL - 57)) | (1L << (PRIVATE - 57)) | (1L << (PROTECTED - 57)))) != 0)) {
				{
				setState(1971);
				accessor_modifier();
				}
			}

			setState(1974);
			match(GET);
			setState(1975);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSet_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSet_accessor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSet_accessor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_accessor_declarationContext set_accessor_declaration() throws RecognitionException {
		Set_accessor_declarationContext _localctx = new Set_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_set_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1977);
				attributes();
				}
			}

			setState(1981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (INTERNAL - 57)) | (1L << (PRIVATE - 57)) | (1L << (PROTECTED - 57)))) != 0)) {
				{
				setState(1980);
				accessor_modifier();
				}
			}

			setState(1983);
			match(SET);
			setState(1984);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_modifierContext extends ParserRuleContext {
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public Accessor_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAccessor_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAccessor_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAccessor_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accessor_modifierContext accessor_modifier() throws RecognitionException {
		Accessor_modifierContext _localctx = new Accessor_modifierContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_accessor_modifier);
		try {
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1986);
				match(PROTECTED);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1987);
				match(INTERNAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1988);
				match(PRIVATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1989);
				match(PROTECTED);
				setState(1990);
				match(INTERNAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1991);
				match(INTERNAL);
				setState(1992);
				match(PROTECTED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Accessor_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAccessor_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAccessor_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAccessor_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accessor_bodyContext accessor_body() throws RecognitionException {
		Accessor_bodyContext _localctx = new Accessor_bodyContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_accessor_body);
		try {
			setState(1997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1995);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1996);
				match(SEMICOLON);
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

	public static class Event_accessor_declarationsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Remove_accessor_declarationContext remove_accessor_declaration() {
			return getRuleContext(Remove_accessor_declarationContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public Add_accessor_declarationContext add_accessor_declaration() {
			return getRuleContext(Add_accessor_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Event_accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_accessor_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEvent_accessor_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEvent_accessor_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEvent_accessor_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_accessor_declarationsContext event_accessor_declarations() throws RecognitionException {
		Event_accessor_declarationsContext _localctx = new Event_accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_event_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1999);
				attributes();
				}
			}

			setState(2010);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(2002);
				match(ADD);
				setState(2003);
				block();
				setState(2004);
				remove_accessor_declaration();
				}
				break;
			case REMOVE:
				{
				setState(2006);
				match(REMOVE);
				setState(2007);
				block();
				setState(2008);
				add_accessor_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Add_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Add_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAdd_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAdd_accessor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAdd_accessor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_accessor_declarationContext add_accessor_declaration() throws RecognitionException {
		Add_accessor_declarationContext _localctx = new Add_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_add_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2012);
				attributes();
				}
			}

			setState(2015);
			match(ADD);
			setState(2016);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Remove_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Remove_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRemove_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRemove_accessor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRemove_accessor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Remove_accessor_declarationContext remove_accessor_declaration() throws RecognitionException {
		Remove_accessor_declarationContext _localctx = new Remove_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_remove_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2018);
				attributes();
				}
			}

			setState(2021);
			match(REMOVE);
			setState(2022);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Overloadable_operatorContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public Right_shiftContext right_shift() {
			return getRuleContext(Right_shiftContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(CSharpParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(CSharpParser.OP_NE, 0); }
		public Overloadable_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overloadable_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOverloadable_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOverloadable_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitOverloadable_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Overloadable_operatorContext overloadable_operator() throws RecognitionException {
		Overloadable_operatorContext _localctx = new Overloadable_operatorContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_overloadable_operator);
		try {
			setState(2046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2024);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2025);
				match(MINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2026);
				match(BANG);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2027);
				match(TILDE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2028);
				match(OP_INC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2029);
				match(OP_DEC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2030);
				match(TRUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2031);
				match(FALSE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2032);
				match(STAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2033);
				match(DIV);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2034);
				match(PERCENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2035);
				match(AMP);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2036);
				match(BITWISE_OR);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2037);
				match(CARET);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2038);
				match(OP_LEFT_SHIFT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2039);
				right_shift();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2040);
				match(OP_EQ);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2041);
				match(OP_NE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2042);
				match(GT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2043);
				match(LT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2044);
				match(OP_GE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2045);
				match(OP_LE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conversion_operator_declaratorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode IMPLICIT() { return getToken(CSharpParser.IMPLICIT, 0); }
		public TerminalNode EXPLICIT() { return getToken(CSharpParser.EXPLICIT, 0); }
		public Conversion_operator_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion_operator_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConversion_operator_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConversion_operator_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConversion_operator_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conversion_operator_declaratorContext conversion_operator_declarator() throws RecognitionException {
		Conversion_operator_declaratorContext _localctx = new Conversion_operator_declaratorContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_conversion_operator_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			_la = _input.LA(1);
			if ( !(_la==EXPLICIT || _la==IMPLICIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2049);
			match(OPERATOR);
			setState(2050);
			type_();
			setState(2051);
			match(OPEN_PARENS);
			setState(2052);
			arg_declaration();
			setState(2053);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Constructor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstructor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstructor_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstructor_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_initializerContext constructor_initializer() throws RecognitionException {
		Constructor_initializerContext _localctx = new Constructor_initializerContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_constructor_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			match(COLON);
			setState(2056);
			_la = _input.LA(1);
			if ( !(_la==BASE || _la==THIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2057);
			match(OPEN_PARENS);
			setState(2059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (OUT - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (VOID - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(2058);
				argument_list();
				}
			}

			setState(2061);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_body);
		try {
			setState(2065);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2063);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(2064);
				match(SEMICOLON);
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

	public static class Struct_interfacesContext extends ParserRuleContext {
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Struct_interfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_interfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_interfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_interfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStruct_interfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_interfacesContext struct_interfaces() throws RecognitionException {
		Struct_interfacesContext _localctx = new Struct_interfacesContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_struct_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			match(COLON);
			setState(2068);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Struct_member_declarationContext> struct_member_declaration() {
			return getRuleContexts(Struct_member_declarationContext.class);
		}
		public Struct_member_declarationContext struct_member_declaration(int i) {
			return getRuleContext(Struct_member_declarationContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			match(OPEN_BRACE);
			setState(2074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (ABSTRACT - 9)) | (1L << (ADD - 9)) | (1L << (ALIAS - 9)) | (1L << (ARGLIST - 9)) | (1L << (ASCENDING - 9)) | (1L << (ASYNC - 9)) | (1L << (AWAIT - 9)) | (1L << (BOOL - 9)) | (1L << (BY - 9)) | (1L << (BYTE - 9)) | (1L << (CHAR - 9)) | (1L << (CLASS - 9)) | (1L << (CONST - 9)) | (1L << (DECIMAL - 9)) | (1L << (DELEGATE - 9)) | (1L << (DESCENDING - 9)) | (1L << (DOUBLE - 9)) | (1L << (DYNAMIC - 9)) | (1L << (ENUM - 9)) | (1L << (EQUALS - 9)) | (1L << (EVENT - 9)) | (1L << (EXPLICIT - 9)) | (1L << (EXTERN - 9)) | (1L << (FIXED - 9)) | (1L << (FLOAT - 9)) | (1L << (FROM - 9)) | (1L << (GET - 9)) | (1L << (GROUP - 9)) | (1L << (IMPLICIT - 9)) | (1L << (INT - 9)) | (1L << (INTERFACE - 9)) | (1L << (INTERNAL - 9)) | (1L << (INTO - 9)) | (1L << (JOIN - 9)) | (1L << (LET - 9)) | (1L << (LONG - 9)) | (1L << (NAMEOF - 9)) | (1L << (NEW - 9)) | (1L << (OBJECT - 9)) | (1L << (ON - 9)) | (1L << (ORDERBY - 9)))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (OVERRIDE - 73)) | (1L << (PARTIAL - 73)) | (1L << (PRIVATE - 73)) | (1L << (PROTECTED - 73)) | (1L << (PUBLIC - 73)) | (1L << (READONLY - 73)) | (1L << (REF - 73)) | (1L << (REMOVE - 73)) | (1L << (SBYTE - 73)) | (1L << (SEALED - 73)) | (1L << (SELECT - 73)) | (1L << (SET - 73)) | (1L << (SHORT - 73)) | (1L << (STATIC - 73)) | (1L << (STRING - 73)) | (1L << (STRUCT - 73)) | (1L << (UINT - 73)) | (1L << (ULONG - 73)) | (1L << (UNMANAGED - 73)) | (1L << (UNSAFE - 73)) | (1L << (USHORT - 73)) | (1L << (VAR - 73)) | (1L << (VIRTUAL - 73)) | (1L << (VOID - 73)) | (1L << (VOLATILE - 73)) | (1L << (WHEN - 73)) | (1L << (WHERE - 73)) | (1L << (YIELD - 73)) | (1L << (IDENTIFIER - 73)) | (1L << (OPEN_BRACKET - 73)) | (1L << (OPEN_PARENS - 73)))) != 0)) {
				{
				{
				setState(2071);
				struct_member_declaration();
				}
				}
				setState(2076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2077);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public List<Fixed_size_buffer_declaratorContext> fixed_size_buffer_declarator() {
			return getRuleContexts(Fixed_size_buffer_declaratorContext.class);
		}
		public Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator(int i) {
			return getRuleContext(Fixed_size_buffer_declaratorContext.class,i);
		}
		public Struct_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStruct_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_member_declarationContext struct_member_declaration() throws RecognitionException {
		Struct_member_declarationContext _localctx = new Struct_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_struct_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2079);
				attributes();
				}
			}

			setState(2083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(2082);
				all_member_modifiers();
				}
				break;
			}
			setState(2095);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case READONLY:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case OPEN_PARENS:
				{
				setState(2085);
				common_member_declaration();
				}
				break;
			case FIXED:
				{
				setState(2086);
				match(FIXED);
				setState(2087);
				type_();
				setState(2089); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2088);
					fixed_size_buffer_declarator();
					}
					}
					setState(2091); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
				setState(2093);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Array_typeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			base_type();
			setState(2105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR || _la==INTERR) {
					{
					{
					setState(2098);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==INTERR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(2103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2104);
				rank_specifier();
				}
				}
				setState(2107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (OPEN_BRACKET - 127)) | (1L << (STAR - 127)) | (1L << (INTERR - 127)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rank_specifierContext extends ParserRuleContext {
		public Rank_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRank_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRank_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRank_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rank_specifierContext rank_specifier() throws RecognitionException {
		Rank_specifierContext _localctx = new Rank_specifierContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_rank_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2109);
			match(OPEN_BRACKET);
			setState(2113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2110);
				match(COMMA);
				}
				}
				setState(2115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2116);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Variable_initializerContext> variable_initializer() {
			return getRuleContexts(Variable_initializerContext.class);
		}
		public Variable_initializerContext variable_initializer(int i) {
			return getRuleContext(Variable_initializerContext.class,i);
		}
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArray_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArray_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitArray_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_array_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2118);
			match(OPEN_BRACE);
			setState(2130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)) | (1L << (OPEN_BRACE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(2119);
				variable_initializer();
				setState(2124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2120);
						match(COMMA);
						setState(2121);
						variable_initializer();
						}
						} 
					}
					setState(2126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
				}
				setState(2128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2127);
					match(COMMA);
					}
				}

				}
			}

			setState(2132);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_type_parameter_listContext extends ParserRuleContext {
		public List<Variant_type_parameterContext> variant_type_parameter() {
			return getRuleContexts(Variant_type_parameterContext.class);
		}
		public Variant_type_parameterContext variant_type_parameter(int i) {
			return getRuleContext(Variant_type_parameterContext.class,i);
		}
		public Variant_type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariant_type_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariant_type_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariant_type_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variant_type_parameter_listContext variant_type_parameter_list() throws RecognitionException {
		Variant_type_parameter_listContext _localctx = new Variant_type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_variant_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2134);
			match(LT);
			setState(2135);
			variant_type_parameter();
			setState(2140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2136);
				match(COMMA);
				setState(2137);
				variant_type_parameter();
				}
				}
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2143);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Variance_annotationContext variance_annotation() {
			return getRuleContext(Variance_annotationContext.class,0);
		}
		public Variant_type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariant_type_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariant_type_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariant_type_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variant_type_parameterContext variant_type_parameter() throws RecognitionException {
		Variant_type_parameterContext _localctx = new Variant_type_parameterContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_variant_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2145);
				attributes();
				}
			}

			setState(2149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT) {
				{
				setState(2148);
				variance_annotation();
				}
			}

			setState(2151);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variance_annotationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public Variance_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariance_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariance_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariance_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variance_annotationContext variance_annotation() throws RecognitionException {
		Variance_annotationContext _localctx = new Variance_annotationContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_variance_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
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

	public static class Interface_signatureContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Interface_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_signatureContext interface_signature() throws RecognitionException {
		Interface_signatureContext _localctx = new Interface_signatureContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_interface_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			match(INTERFACE);
			setState(2156);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_baseContext extends ParserRuleContext {
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Interface_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_baseContext interface_base() throws RecognitionException {
		Interface_baseContext _localctx = new Interface_baseContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_interface_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2158);
			match(COLON);
			setState(2159);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Interface_member_declarationContext> interface_member_declaration() {
			return getRuleContexts(Interface_member_declarationContext.class);
		}
		public Interface_member_declarationContext interface_member_declaration(int i) {
			return getRuleContext(Interface_member_declarationContext.class,i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2161);
			match(OPEN_BRACE);
			setState(2165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (EVENT - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (NEW - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PARTIAL - 75)) | (1L << (READONLY - 75)) | (1L << (REF - 75)) | (1L << (REMOVE - 75)) | (1L << (SBYTE - 75)) | (1L << (SELECT - 75)) | (1L << (SET - 75)) | (1L << (SHORT - 75)) | (1L << (STRING - 75)) | (1L << (UINT - 75)) | (1L << (ULONG - 75)) | (1L << (UNMANAGED - 75)) | (1L << (UNSAFE - 75)) | (1L << (USHORT - 75)) | (1L << (VAR - 75)) | (1L << (VOID - 75)) | (1L << (WHEN - 75)) | (1L << (WHERE - 75)) | (1L << (YIELD - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (OPEN_BRACKET - 75)) | (1L << (OPEN_PARENS - 75)))) != 0)) {
				{
				{
				setState(2162);
				interface_member_declaration();
				}
				}
				setState(2167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2168);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_member_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Interface_accessorsContext interface_accessors() {
			return getRuleContext(Interface_accessorsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Interface_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_member_declarationContext interface_member_declaration() throws RecognitionException {
		Interface_member_declarationContext _localctx = new Interface_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_interface_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2170);
				attributes();
				}
			}

			setState(2174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(2173);
				match(NEW);
				}
			}

			setState(2239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(2177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(2176);
					match(UNSAFE);
					}
				}

				setState(2184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2179);
					match(REF);
					}
					break;
				case 2:
					{
					setState(2180);
					match(REF);
					setState(2181);
					match(READONLY);
					}
					break;
				case 3:
					{
					setState(2182);
					match(READONLY);
					setState(2183);
					match(REF);
					}
					break;
				}
				setState(2186);
				type_();
				setState(2214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2187);
					identifier();
					setState(2189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2188);
						type_parameter_list();
						}
					}

					setState(2191);
					match(OPEN_PARENS);
					setState(2193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
						{
						setState(2192);
						formal_parameter_list();
						}
					}

					setState(2195);
					match(CLOSE_PARENS);
					setState(2197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(2196);
						type_parameter_constraints_clauses();
						}
					}

					setState(2199);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(2201);
					identifier();
					setState(2202);
					match(OPEN_BRACE);
					setState(2203);
					interface_accessors();
					setState(2204);
					match(CLOSE_BRACE);
					}
					break;
				case 3:
					{
					setState(2206);
					match(THIS);
					setState(2207);
					match(OPEN_BRACKET);
					setState(2208);
					formal_parameter_list();
					setState(2209);
					match(CLOSE_BRACKET);
					setState(2210);
					match(OPEN_BRACE);
					setState(2211);
					interface_accessors();
					setState(2212);
					match(CLOSE_BRACE);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(2216);
					match(UNSAFE);
					}
				}

				setState(2219);
				match(VOID);
				setState(2220);
				identifier();
				setState(2222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2221);
					type_parameter_list();
					}
				}

				setState(2224);
				match(OPEN_PARENS);
				setState(2226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
					{
					setState(2225);
					formal_parameter_list();
					}
				}

				setState(2228);
				match(CLOSE_PARENS);
				setState(2230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(2229);
					type_parameter_constraints_clauses();
					}
				}

				setState(2232);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				setState(2234);
				match(EVENT);
				setState(2235);
				type_();
				setState(2236);
				identifier();
				setState(2237);
				match(SEMICOLON);
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

	public static class Interface_accessorsContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public Interface_accessorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_accessors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_accessors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_accessors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_accessors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_accessorsContext interface_accessors() throws RecognitionException {
		Interface_accessorsContext _localctx = new Interface_accessorsContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_interface_accessors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2241);
				attributes();
				}
			}

			setState(2262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(2244);
				match(GET);
				setState(2245);
				match(SEMICOLON);
				setState(2251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET || _la==OPEN_BRACKET) {
					{
					setState(2247);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(2246);
						attributes();
						}
					}

					setState(2249);
					match(SET);
					setState(2250);
					match(SEMICOLON);
					}
				}

				}
				break;
			case SET:
				{
				setState(2253);
				match(SET);
				setState(2254);
				match(SEMICOLON);
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==OPEN_BRACKET) {
					{
					setState(2256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(2255);
						attributes();
						}
					}

					setState(2258);
					match(GET);
					setState(2259);
					match(SEMICOLON);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Enum_baseContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Enum_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEnum_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_baseContext enum_base() throws RecognitionException {
		Enum_baseContext _localctx = new Enum_baseContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_enum_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2264);
			match(COLON);
			setState(2265);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Enum_member_declarationContext> enum_member_declaration() {
			return getRuleContexts(Enum_member_declarationContext.class);
		}
		public Enum_member_declarationContext enum_member_declaration(int i) {
			return getRuleContext(Enum_member_declarationContext.class,i);
		}
		public Enum_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEnum_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_bodyContext enum_body() throws RecognitionException {
		Enum_bodyContext _localctx = new Enum_bodyContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_enum_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
			match(OPEN_BRACE);
			setState(2279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0)) {
				{
				setState(2268);
				enum_member_declaration();
				setState(2273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2269);
						match(COMMA);
						setState(2270);
						enum_member_declaration();
						}
						} 
					}
					setState(2275);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
				}
				setState(2277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2276);
					match(COMMA);
					}
				}

				}
			}

			setState(2281);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_member_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Enum_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEnum_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_member_declarationContext enum_member_declaration() throws RecognitionException {
		Enum_member_declarationContext _localctx = new Enum_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_enum_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(2283);
				attributes();
				}
			}

			setState(2286);
			identifier();
			setState(2289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(2287);
				match(ASSIGNMENT);
				setState(2288);
				expression();
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

	public static class Enum_signatureContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(CSharpParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEnum_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_signatureContext enum_signature() throws RecognitionException {
		Enum_signatureContext _localctx = new Enum_signatureContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_enum_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			match(ENUM);
			setState(2292);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_attribute_sectionContext extends ParserRuleContext {
		public Global_attribute_targetContext global_attribute_target() {
			return getRuleContext(Global_attribute_targetContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Global_attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGlobal_attribute_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGlobal_attribute_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGlobal_attribute_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_attribute_sectionContext global_attribute_section() throws RecognitionException {
		Global_attribute_sectionContext _localctx = new Global_attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_global_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			match(OPEN_BRACKET);
			setState(2295);
			global_attribute_target();
			setState(2296);
			match(COLON);
			setState(2297);
			attribute_list();
			setState(2299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2298);
				match(COMMA);
				}
			}

			setState(2301);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Global_attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGlobal_attribute_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGlobal_attribute_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGlobal_attribute_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_attribute_targetContext global_attribute_target() throws RecognitionException {
		Global_attribute_targetContext _localctx = new Global_attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_global_attribute_target);
		try {
			setState(2305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2303);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2304);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<Attribute_sectionContext> attribute_section() {
			return getRuleContexts(Attribute_sectionContext.class);
		}
		public Attribute_sectionContext attribute_section(int i) {
			return getRuleContext(Attribute_sectionContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2307);
				attribute_section();
				}
				}
				setState(2310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_sectionContext extends ParserRuleContext {
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Attribute_targetContext attribute_target() {
			return getRuleContext(Attribute_targetContext.class,0);
		}
		public Attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttribute_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_sectionContext attribute_section() throws RecognitionException {
		Attribute_sectionContext _localctx = new Attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			match(OPEN_BRACKET);
			setState(2316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2313);
				attribute_target();
				setState(2314);
				match(COLON);
				}
				break;
			}
			setState(2318);
			attribute_list();
			setState(2320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2319);
				match(COMMA);
				}
			}

			setState(2322);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttribute_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_targetContext attribute_target() throws RecognitionException {
		Attribute_targetContext _localctx = new Attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_attribute_target);
		try {
			setState(2326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2324);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2325);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttribute_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_attribute_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			attribute();
			setState(2333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2329);
					match(COMMA);
					setState(2330);
					attribute();
					}
					} 
				}
				setState(2335);
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
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<Attribute_argumentContext> attribute_argument() {
			return getRuleContexts(Attribute_argumentContext.class);
		}
		public Attribute_argumentContext attribute_argument(int i) {
			return getRuleContext(Attribute_argumentContext.class,i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
			namespace_or_type_name();
			setState(2349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(2337);
				match(OPEN_PARENS);
				setState(2346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(2338);
					attribute_argument();
					setState(2343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2339);
						match(COMMA);
						setState(2340);
						attribute_argument();
						}
						}
						setState(2345);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2348);
				match(CLOSE_PARENS);
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

	public static class Attribute_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttribute_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_argumentContext attribute_argument() throws RecognitionException {
		Attribute_argumentContext _localctx = new Attribute_argumentContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_attribute_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2351);
				identifier();
				setState(2352);
				match(COLON);
				}
				break;
			}
			setState(2356);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pointer_typeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Pointer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPointer_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPointer_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitPointer_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_typeContext pointer_type() throws RecognitionException {
		Pointer_typeContext _localctx = new Pointer_typeContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_pointer_type);
		int _la;
		try {
			setState(2373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SBYTE:
				case SHORT:
				case UINT:
				case ULONG:
				case USHORT:
					{
					setState(2358);
					simple_type();
					}
					break;
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SELECT:
				case SET:
				case STRING:
				case UNMANAGED:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(2359);
					class_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKET || _la==INTERR) {
					{
					setState(2364);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(2362);
						rank_specifier();
						}
						break;
					case INTERR:
						{
						setState(2363);
						match(INTERR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2369);
				match(STAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2371);
				match(VOID);
				setState(2372);
				match(STAR);
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

	public static class Fixed_pointer_declaratorsContext extends ParserRuleContext {
		public List<Fixed_pointer_declaratorContext> fixed_pointer_declarator() {
			return getRuleContexts(Fixed_pointer_declaratorContext.class);
		}
		public Fixed_pointer_declaratorContext fixed_pointer_declarator(int i) {
			return getRuleContext(Fixed_pointer_declaratorContext.class,i);
		}
		public Fixed_pointer_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_pointer_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_pointer_declarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_pointer_declarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_pointer_declaratorsContext fixed_pointer_declarators() throws RecognitionException {
		Fixed_pointer_declaratorsContext _localctx = new Fixed_pointer_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_fixed_pointer_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2375);
			fixed_pointer_declarator();
			setState(2380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2376);
				match(COMMA);
				setState(2377);
				fixed_pointer_declarator();
				}
				}
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Fixed_pointer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Fixed_pointer_initializerContext fixed_pointer_initializer() {
			return getRuleContext(Fixed_pointer_initializerContext.class,0);
		}
		public Fixed_pointer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_pointer_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_pointer_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_pointer_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_pointer_declaratorContext fixed_pointer_declarator() throws RecognitionException {
		Fixed_pointer_declaratorContext _localctx = new Fixed_pointer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_fixed_pointer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2383);
			identifier();
			setState(2384);
			match(ASSIGNMENT);
			setState(2385);
			fixed_pointer_initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Stackalloc_initializerContext stackalloc_initializer() {
			return getRuleContext(Stackalloc_initializerContext.class,0);
		}
		public Fixed_pointer_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_pointer_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_pointer_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_pointer_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_pointer_initializerContext fixed_pointer_initializer() throws RecognitionException {
		Fixed_pointer_initializerContext _localctx = new Fixed_pointer_initializerContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_fixed_pointer_initializer);
		try {
			setState(2392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2387);
					match(AMP);
					}
					break;
				}
				setState(2390);
				expression();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2391);
				stackalloc_initializer();
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

	public static class Fixed_size_buffer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Fixed_size_buffer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_size_buffer_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_size_buffer_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_size_buffer_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_size_buffer_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator() throws RecognitionException {
		Fixed_size_buffer_declaratorContext _localctx = new Fixed_size_buffer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_fixed_size_buffer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			identifier();
			setState(2395);
			match(OPEN_BRACKET);
			setState(2396);
			expression();
			setState(2397);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stackalloc_initializerContext extends ParserRuleContext {
		public TerminalNode STACKALLOC() { return getToken(CSharpParser.STACKALLOC, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Stackalloc_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackalloc_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStackalloc_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStackalloc_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStackalloc_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stackalloc_initializerContext stackalloc_initializer() throws RecognitionException {
		Stackalloc_initializerContext _localctx = new Stackalloc_initializerContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_stackalloc_initializer);
		int _la;
		try {
			int _alt;
			setState(2428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2399);
				match(STACKALLOC);
				setState(2400);
				type_();
				setState(2401);
				match(OPEN_BRACKET);
				setState(2402);
				expression();
				setState(2403);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2405);
				match(STACKALLOC);
				setState(2407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PARTIAL - 75)) | (1L << (REMOVE - 75)) | (1L << (SBYTE - 75)) | (1L << (SELECT - 75)) | (1L << (SET - 75)) | (1L << (SHORT - 75)) | (1L << (STRING - 75)) | (1L << (UINT - 75)) | (1L << (ULONG - 75)) | (1L << (UNMANAGED - 75)) | (1L << (USHORT - 75)) | (1L << (VAR - 75)) | (1L << (VOID - 75)) | (1L << (WHEN - 75)) | (1L << (WHERE - 75)) | (1L << (YIELD - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (OPEN_PARENS - 75)))) != 0)) {
					{
					setState(2406);
					type_();
					}
				}

				setState(2409);
				match(OPEN_BRACKET);
				setState(2411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
					{
					setState(2410);
					expression();
					}
				}

				setState(2413);
				match(CLOSE_BRACKET);
				setState(2414);
				match(OPEN_BRACE);
				setState(2415);
				expression();
				setState(2420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2416);
						match(COMMA);
						setState(2417);
						expression();
						}
						} 
					}
					setState(2422);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
				}
				setState(2424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2423);
					match(COMMA);
					}
				}

				setState(2426);
				match(CLOSE_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_arrowContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public Right_arrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRight_arrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRight_arrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRight_arrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_arrowContext right_arrow() throws RecognitionException {
		Right_arrowContext _localctx = new Right_arrowContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_right_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2430);
			((Right_arrowContext)_localctx).first = match(ASSIGNMENT);
			setState(2431);
			((Right_arrowContext)_localctx).second = match(GT);
			setState(2432);
			if (!((((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shiftContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public Right_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRight_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRight_shift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRight_shift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_shiftContext right_shift() throws RecognitionException {
		Right_shiftContext _localctx = new Right_shiftContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			((Right_shiftContext)_localctx).first = match(GT);
			setState(2435);
			((Right_shiftContext)_localctx).second = match(GT);
			setState(2436);
			if (!((((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shift_assignmentContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public Right_shift_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRight_shift_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRight_shift_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRight_shift_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_shift_assignmentContext right_shift_assignment() throws RecognitionException {
		Right_shift_assignmentContext _localctx = new Right_shift_assignmentContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_right_shift_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			((Right_shift_assignmentContext)_localctx).first = match(GT);
			setState(2439);
			((Right_shift_assignmentContext)_localctx).second = match(OP_GE);
			setState(2440);
			if (!((((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
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
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(CSharpParser.INTEGER_LITERAL, 0); }
		public TerminalNode HEX_INTEGER_LITERAL() { return getToken(CSharpParser.HEX_INTEGER_LITERAL, 0); }
		public TerminalNode BIN_INTEGER_LITERAL() { return getToken(CSharpParser.BIN_INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(CSharpParser.REAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(CSharpParser.CHARACTER_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(CSharpParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_literal);
		try {
			setState(2450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2442);
				boolean_literal();
				}
				break;
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2443);
				string_literal();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2444);
				match(INTEGER_LITERAL);
				}
				break;
			case HEX_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2445);
				match(HEX_INTEGER_LITERAL);
				}
				break;
			case BIN_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2446);
				match(BIN_INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2447);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(2448);
				match(CHARACTER_LITERAL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2449);
				match(NULL);
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class String_literalContext extends ParserRuleContext {
		public Interpolated_regular_stringContext interpolated_regular_string() {
			return getRuleContext(Interpolated_regular_stringContext.class,0);
		}
		public Interpolated_verbatium_stringContext interpolated_verbatium_string() {
			return getRuleContext(Interpolated_verbatium_stringContext.class,0);
		}
		public TerminalNode REGULAR_STRING() { return getToken(CSharpParser.REGULAR_STRING, 0); }
		public TerminalNode VERBATIUM_STRING() { return getToken(CSharpParser.VERBATIUM_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_string_literal);
		try {
			setState(2458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(2454);
				interpolated_regular_string();
				}
				break;
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2455);
				interpolated_verbatium_string();
				}
				break;
			case REGULAR_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(2456);
				match(REGULAR_STRING);
				}
				break;
			case VERBATIUM_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2457);
				match(VERBATIUM_STRING);
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

	public static class Interpolated_regular_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_REGULAR_STRING_START() { return getToken(CSharpParser.INTERPOLATED_REGULAR_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_regular_string_partContext> interpolated_regular_string_part() {
			return getRuleContexts(Interpolated_regular_string_partContext.class);
		}
		public Interpolated_regular_string_partContext interpolated_regular_string_part(int i) {
			return getRuleContext(Interpolated_regular_string_partContext.class,i);
		}
		public Interpolated_regular_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_regular_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_regular_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterpolated_regular_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_regular_stringContext interpolated_regular_string() throws RecognitionException {
		Interpolated_regular_stringContext _localctx = new Interpolated_regular_stringContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_interpolated_regular_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			match(INTERPOLATED_REGULAR_STRING_START);
			setState(2464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)) | (1L << (DOUBLE_CURLY_INSIDE - 129)) | (1L << (REGULAR_CHAR_INSIDE - 129)) | (1L << (REGULAR_STRING_INSIDE - 129)))) != 0)) {
				{
				{
				setState(2461);
				interpolated_regular_string_part();
				}
				}
				setState(2466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2467);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_verbatium_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_VERBATIUM_STRING_START() { return getToken(CSharpParser.INTERPOLATED_VERBATIUM_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_verbatium_string_partContext> interpolated_verbatium_string_part() {
			return getRuleContexts(Interpolated_verbatium_string_partContext.class);
		}
		public Interpolated_verbatium_string_partContext interpolated_verbatium_string_part(int i) {
			return getRuleContext(Interpolated_verbatium_string_partContext.class,i);
		}
		public Interpolated_verbatium_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_verbatium_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_verbatium_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterpolated_verbatium_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_verbatium_stringContext interpolated_verbatium_string() throws RecognitionException {
		Interpolated_verbatium_stringContext _localctx = new Interpolated_verbatium_stringContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_interpolated_verbatium_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2469);
			match(INTERPOLATED_VERBATIUM_STRING_START);
			setState(2473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)) | (1L << (DOUBLE_CURLY_INSIDE - 129)) | (1L << (VERBATIUM_DOUBLE_QUOTE_INSIDE - 129)) | (1L << (VERBATIUM_INSIDE_STRING - 129)))) != 0)) {
				{
				{
				setState(2470);
				interpolated_verbatium_string_part();
				}
				}
				setState(2475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2476);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_regular_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(CSharpParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode REGULAR_CHAR_INSIDE() { return getToken(CSharpParser.REGULAR_CHAR_INSIDE, 0); }
		public TerminalNode REGULAR_STRING_INSIDE() { return getToken(CSharpParser.REGULAR_STRING_INSIDE, 0); }
		public Interpolated_regular_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_regular_string_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_regular_string_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterpolated_regular_string_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_regular_string_partContext interpolated_regular_string_part() throws RecognitionException {
		Interpolated_regular_string_partContext _localctx = new Interpolated_regular_string_partContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_interpolated_regular_string_part);
		try {
			setState(2482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2478);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2479);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case REGULAR_CHAR_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2480);
				match(REGULAR_CHAR_INSIDE);
				}
				break;
			case REGULAR_STRING_INSIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2481);
				match(REGULAR_STRING_INSIDE);
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

	public static class Interpolated_verbatium_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(CSharpParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode VERBATIUM_DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.VERBATIUM_DOUBLE_QUOTE_INSIDE, 0); }
		public TerminalNode VERBATIUM_INSIDE_STRING() { return getToken(CSharpParser.VERBATIUM_INSIDE_STRING, 0); }
		public Interpolated_verbatium_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_verbatium_string_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_verbatium_string_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterpolated_verbatium_string_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_verbatium_string_partContext interpolated_verbatium_string_part() throws RecognitionException {
		Interpolated_verbatium_string_partContext _localctx = new Interpolated_verbatium_string_partContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_interpolated_verbatium_string_part);
		try {
			setState(2488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REF:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNMANAGED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case CARET:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
			case OP_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2484);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2485);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case VERBATIUM_DOUBLE_QUOTE_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2486);
				match(VERBATIUM_DOUBLE_QUOTE_INSIDE);
				}
				break;
			case VERBATIUM_INSIDE_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2487);
				match(VERBATIUM_INSIDE_STRING);
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

	public static class Interpolated_string_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> FORMAT_STRING() { return getTokens(CSharpParser.FORMAT_STRING); }
		public TerminalNode FORMAT_STRING(int i) {
			return getToken(CSharpParser.FORMAT_STRING, i);
		}
		public Interpolated_string_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_string_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_string_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterpolated_string_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_string_expressionContext interpolated_string_expression() throws RecognitionException {
		Interpolated_string_expressionContext _localctx = new Interpolated_string_expressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_interpolated_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			expression();
			setState(2495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2491);
				match(COMMA);
				setState(2492);
				expression();
				}
				}
				setState(2497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2498);
				match(COLON);
				setState(2500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2499);
					match(FORMAT_STRING);
					}
					}
					setState(2502); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FORMAT_STRING );
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode AS() { return getToken(CSharpParser.AS, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(CSharpParser.ENUM, 0); }
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public TerminalNode EXPLICIT() { return getToken(CSharpParser.EXPLICIT, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode GOTO() { return getToken(CSharpParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode IMPLICIT() { return getToken(CSharpParser.IMPLICIT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode IS() { return getToken(CSharpParser.IS, 0); }
		public TerminalNode LOCK() { return getToken(CSharpParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode NULL() { return getToken(CSharpParser.NULL, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode PARAMS() { return getToken(CSharpParser.PARAMS, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode SIZEOF() { return getToken(CSharpParser.SIZEOF, 0); }
		public TerminalNode STACKALLOC() { return getToken(CSharpParser.STACKALLOC, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public TerminalNode TYPEOF() { return getToken(CSharpParser.TYPEOF, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public TerminalNode UNMANAGED() { return getToken(CSharpParser.UNMANAGED, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TerminalNode VOLATILE() { return getToken(CSharpParser.VOLATILE, 0); }
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << AS) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CASE) | (1L << CATCH) | (1L << CHAR) | (1L << CHECKED) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DO) | (1L << DOUBLE) | (1L << ELSE) | (1L << ENUM) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FALSE) | (1L << FINALLY) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << GOTO) | (1L << IF) | (1L << IMPLICIT) | (1L << IN) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << IS) | (1L << LOCK) | (1L << LONG))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NAMESPACE - 65)) | (1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (OPERATOR - 65)) | (1L << (OUT - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARAMS - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REF - 65)) | (1L << (RETURN - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STACKALLOC - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (SWITCH - 65)) | (1L << (THIS - 65)) | (1L << (THROW - 65)) | (1L << (TRUE - 65)) | (1L << (TRY - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (UNMANAGED - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (USING - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHILE - 65)))) != 0)) ) {
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

	public static class Class_membersContext extends ParserRuleContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Class_signatureContext class_signature() {
			return getRuleContext(Class_signatureContext.class,0);
		}
		public Class_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_membersContext class_members() throws RecognitionException {
		Class_membersContext _localctx = new Class_membersContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_class_members);
		try {
			setState(2510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2508);
				class_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2509);
				class_signature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_definitionContext extends ParserRuleContext {
		public Class_signatureContext class_signature() {
			return getRuleContext(Class_signatureContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			class_signature();
			setState(2513);
			class_body();
			setState(2515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2514);
				match(SEMICOLON);
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

	public static class Class_signatureContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Class_baseContext class_base() {
			return getRuleContext(Class_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Class_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_signatureContext class_signature() throws RecognitionException {
		Class_signatureContext _localctx = new Class_signatureContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_class_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2517);
			match(CLASS);
			setState(2518);
			identifier();
			setState(2520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2519);
				type_parameter_list();
				}
			}

			setState(2523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2522);
				class_base();
				}
			}

			setState(2526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				{
				setState(2525);
				type_parameter_constraints_clauses();
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

	public static class Struct_definitionContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Struct_interfacesContext struct_interfaces() {
			return getRuleContext(Struct_interfacesContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public Struct_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStruct_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_definitionContext struct_definition() throws RecognitionException {
		Struct_definitionContext _localctx = new Struct_definitionContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_struct_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY || _la==REF) {
				{
				setState(2528);
				_la = _input.LA(1);
				if ( !(_la==READONLY || _la==REF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2531);
			match(STRUCT);
			setState(2532);
			identifier();
			setState(2534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2533);
				type_parameter_list();
				}
			}

			setState(2537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2536);
				struct_interfaces();
				}
			}

			setState(2540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2539);
				type_parameter_constraints_clauses();
				}
			}

			setState(2542);
			struct_body();
			setState(2544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2543);
				match(SEMICOLON);
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

	public static class Interface_definitionContext extends ParserRuleContext {
		public Interface_signatureContext interface_signature() {
			return getRuleContext(Interface_signatureContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Interface_baseContext interface_base() {
			return getRuleContext(Interface_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Interface_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_definitionContext interface_definition() throws RecognitionException {
		Interface_definitionContext _localctx = new Interface_definitionContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_interface_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2546);
			interface_signature();
			setState(2548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2547);
				variant_type_parameter_list();
				}
			}

			setState(2551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2550);
				interface_base();
				}
			}

			setState(2554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2553);
				type_parameter_constraints_clauses();
				}
			}

			setState(2556);
			class_body();
			setState(2558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2557);
				match(SEMICOLON);
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

	public static class Enum_definitionContext extends ParserRuleContext {
		public Enum_signatureContext enum_signature() {
			return getRuleContext(Enum_signatureContext.class,0);
		}
		public Enum_bodyContext enum_body() {
			return getRuleContext(Enum_bodyContext.class,0);
		}
		public Enum_baseContext enum_base() {
			return getRuleContext(Enum_baseContext.class,0);
		}
		public Enum_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEnum_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_definitionContext enum_definition() throws RecognitionException {
		Enum_definitionContext _localctx = new Enum_definitionContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_enum_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			enum_signature();
			setState(2562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2561);
				enum_base();
				}
			}

			setState(2564);
			enum_body();
			setState(2566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2565);
				match(SEMICOLON);
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

	public static class Delegate_definitionContext extends ParserRuleContext {
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Delegate_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegate_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDelegate_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDelegate_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitDelegate_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delegate_definitionContext delegate_definition() throws RecognitionException {
		Delegate_definitionContext _localctx = new Delegate_definitionContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_delegate_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			match(DELEGATE);
			setState(2569);
			return_type();
			setState(2570);
			identifier();
			setState(2572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2571);
				variant_type_parameter_list();
				}
			}

			setState(2574);
			match(OPEN_PARENS);
			setState(2576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
				{
				setState(2575);
				formal_parameter_list();
				}
			}

			setState(2578);
			match(CLOSE_PARENS);
			setState(2580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2579);
				type_parameter_constraints_clauses();
				}
			}

			setState(2582);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_declarationContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Event_accessor_declarationsContext event_accessor_declarations() {
			return getRuleContext(Event_accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Event_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEvent_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEvent_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEvent_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_declarationContext event_declaration() throws RecognitionException {
		Event_declarationContext _localctx = new Event_declarationContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_event_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			match(EVENT);
			setState(2585);
			type_();
			setState(2594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2586);
				variable_declarators();
				setState(2587);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(2589);
				member_name();
				setState(2590);
				match(OPEN_BRACE);
				setState(2591);
				event_accessor_declarations();
				setState(2592);
				match(CLOSE_BRACE);
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

	public static class Field_declarationContext extends ParserRuleContext {
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterField_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitField_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitField_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2596);
			variable_declarators();
			setState(2597);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_declarationContext extends ParserRuleContext {
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterProperty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitProperty_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitProperty_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
			member_name();
			setState(2613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2600);
				match(OPEN_BRACE);
				setState(2601);
				accessor_declarations();
				setState(2602);
				match(CLOSE_BRACE);
				setState(2607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(2603);
					match(ASSIGNMENT);
					setState(2604);
					variable_initializer();
					setState(2605);
					match(SEMICOLON);
					}
				}

				}
				break;
			case ASSIGNMENT:
				{
				setState(2609);
				right_arrow();
				setState(2610);
				throwable_expression();
				setState(2611);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2615);
			match(CONST);
			setState(2616);
			type_();
			setState(2617);
			constant_declarators();
			setState(2618);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexer_declarationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public Indexer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIndexer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIndexer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIndexer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexer_declarationContext indexer_declaration() throws RecognitionException {
		Indexer_declarationContext _localctx = new Indexer_declarationContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_indexer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2620);
			match(THIS);
			setState(2621);
			match(OPEN_BRACKET);
			setState(2622);
			formal_parameter_list();
			setState(2623);
			match(CLOSE_BRACKET);
			setState(2632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2624);
				match(OPEN_BRACE);
				setState(2625);
				accessor_declarations();
				setState(2626);
				match(CLOSE_BRACE);
				}
				break;
			case ASSIGNMENT:
				{
				setState(2628);
				right_arrow();
				setState(2629);
				throwable_expression();
				setState(2630);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Destructor_definitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Destructor_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructor_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDestructor_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDestructor_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitDestructor_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destructor_definitionContext destructor_definition() throws RecognitionException {
		Destructor_definitionContext _localctx = new Destructor_definitionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_destructor_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2634);
			match(TILDE);
			setState(2635);
			identifier();
			setState(2636);
			match(OPEN_PARENS);
			setState(2637);
			match(CLOSE_PARENS);
			setState(2638);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Constructor_initializerContext constructor_initializer() {
			return getRuleContext(Constructor_initializerContext.class,0);
		}
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstructor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstructor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstructor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2640);
			identifier();
			setState(2641);
			match(OPEN_PARENS);
			setState(2643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
				{
				setState(2642);
				formal_parameter_list();
				}
			}

			setState(2645);
			match(CLOSE_PARENS);
			setState(2647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2646);
				constructor_initializer();
				}
			}

			setState(2649);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_expressionsContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Method_signatureContext method_signature() {
			return getRuleContext(Method_signatureContext.class,0);
		}
		public Method_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMethod_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_expressionsContext method_expressions() throws RecognitionException {
		Method_expressionsContext _localctx = new Method_expressionsContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_method_expressions);
		try {
			setState(2653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2651);
				method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2652);
				method_signature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Method_signatureContext method_signature() {
			return getRuleContext(Method_signatureContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			method_signature();
			setState(2657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2656);
				type_parameter_constraints_clauses();
				}
			}

			setState(2664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2659);
				method_body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2660);
				right_arrow();
				setState(2661);
				throwable_expression();
				setState(2662);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Method_signatureContext extends ParserRuleContext {
		public Method_member_nameContext method_member_name() {
			return getRuleContext(Method_member_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Method_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMethod_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_signatureContext method_signature() throws RecognitionException {
		Method_signatureContext _localctx = new Method_signatureContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_method_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
			method_member_name();
			setState(2668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2667);
				type_parameter_list();
				}
			}

			setState(2670);
			match(OPEN_PARENS);
			setState(2672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADD - 10)) | (1L << (ALIAS - 10)) | (1L << (ARGLIST - 10)) | (1L << (ASCENDING - 10)) | (1L << (ASYNC - 10)) | (1L << (AWAIT - 10)) | (1L << (BOOL - 10)) | (1L << (BY - 10)) | (1L << (BYTE - 10)) | (1L << (CHAR - 10)) | (1L << (DECIMAL - 10)) | (1L << (DESCENDING - 10)) | (1L << (DOUBLE - 10)) | (1L << (DYNAMIC - 10)) | (1L << (EQUALS - 10)) | (1L << (FLOAT - 10)) | (1L << (FROM - 10)) | (1L << (GET - 10)) | (1L << (GROUP - 10)) | (1L << (IN - 10)) | (1L << (INT - 10)) | (1L << (INTO - 10)) | (1L << (JOIN - 10)) | (1L << (LET - 10)) | (1L << (LONG - 10)) | (1L << (NAMEOF - 10)) | (1L << (OBJECT - 10)) | (1L << (ON - 10)) | (1L << (ORDERBY - 10)) | (1L << (OUT - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (PARAMS - 74)) | (1L << (PARTIAL - 74)) | (1L << (REF - 74)) | (1L << (REMOVE - 74)) | (1L << (SBYTE - 74)) | (1L << (SELECT - 74)) | (1L << (SET - 74)) | (1L << (SHORT - 74)) | (1L << (STRING - 74)) | (1L << (THIS - 74)) | (1L << (UINT - 74)) | (1L << (ULONG - 74)) | (1L << (UNMANAGED - 74)) | (1L << (USHORT - 74)) | (1L << (VAR - 74)) | (1L << (VOID - 74)) | (1L << (WHEN - 74)) | (1L << (WHERE - 74)) | (1L << (YIELD - 74)) | (1L << (IDENTIFIER - 74)) | (1L << (OPEN_BRACKET - 74)) | (1L << (OPEN_PARENS - 74)))) != 0)) {
				{
				setState(2671);
				formal_parameter_list();
				}
			}

			setState(2674);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_member_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Method_member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_member_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_member_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMethod_member_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_member_nameContext method_member_name() throws RecognitionException {
		Method_member_nameContext _localctx = new Method_member_nameContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_method_member_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				{
				setState(2676);
				identifier();
				}
				break;
			case 2:
				{
				setState(2677);
				identifier();
				setState(2678);
				match(DOUBLE_COLON);
				setState(2679);
				identifier();
				}
				break;
			}
			setState(2690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2684);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2683);
						type_argument_list();
						}
					}

					setState(2686);
					match(DOT);
					setState(2687);
					identifier();
					}
					} 
				}
				setState(2692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
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

	public static class Operator_declarationContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public Overloadable_operatorContext overloadable_operator() {
			return getRuleContext(Overloadable_operatorContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<Arg_declarationContext> arg_declaration() {
			return getRuleContexts(Arg_declarationContext.class);
		}
		public Arg_declarationContext arg_declaration(int i) {
			return getRuleContext(Arg_declarationContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Throwable_expressionContext throwable_expression() {
			return getRuleContext(Throwable_expressionContext.class,0);
		}
		public List<TerminalNode> IN() { return getTokens(CSharpParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(CSharpParser.IN, i);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOperator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOperator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitOperator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_operator_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2693);
			match(OPERATOR);
			setState(2694);
			overloadable_operator();
			setState(2695);
			match(OPEN_PARENS);
			setState(2697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(2696);
				match(IN);
				}
			}

			setState(2699);
			arg_declaration();
			setState(2705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2700);
				match(COMMA);
				setState(2702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(2701);
					match(IN);
					}
				}

				setState(2704);
				arg_declaration();
				}
			}

			setState(2707);
			match(CLOSE_PARENS);
			setState(2713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2708);
				body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2709);
				right_arrow();
				setState(2710);
				throwable_expression();
				setState(2711);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Arg_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arg_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArg_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArg_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitArg_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_declarationContext arg_declaration() throws RecognitionException {
		Arg_declarationContext _localctx = new Arg_declarationContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_arg_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2715);
			type_();
			setState(2716);
			identifier();
			setState(2719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(2717);
				match(ASSIGNMENT);
				setState(2718);
				expression();
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

	public static class Method_invocationContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMethod_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_invocationContext method_invocation() throws RecognitionException {
		Method_invocationContext _localctx = new Method_invocationContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2721);
			match(OPEN_PARENS);
			setState(2723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (OUT - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (VOID - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(2722);
				argument_list();
				}
			}

			setState(2725);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_creation_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Object_creation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_creation_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObject_creation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObject_creation_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitObject_creation_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_creation_expressionContext object_creation_expression() throws RecognitionException {
		Object_creation_expressionContext _localctx = new Object_creation_expressionContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_object_creation_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2727);
			match(OPEN_PARENS);
			setState(2729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (OUT - 64)) | (1L << (PARTIAL - 64)) | (1L << (REF - 64)) | (1L << (REMOVE - 64)) | (1L << (SBYTE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STRING - 64)) | (1L << (THIS - 64)) | (1L << (TRUE - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNMANAGED - 64)) | (1L << (USHORT - 64)) | (1L << (VAR - 64)) | (1L << (VOID - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (LITERAL_ACCESS - 64)) | (1L << (INTEGER_LITERAL - 64)) | (1L << (HEX_INTEGER_LITERAL - 64)) | (1L << (BIN_INTEGER_LITERAL - 64)) | (1L << (REAL_LITERAL - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (REGULAR_STRING - 64)) | (1L << (VERBATIUM_STRING - 64)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 64)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPEN_PARENS - 129)) | (1L << (PLUS - 129)) | (1L << (MINUS - 129)) | (1L << (STAR - 129)) | (1L << (AMP - 129)) | (1L << (CARET - 129)) | (1L << (BANG - 129)) | (1L << (TILDE - 129)) | (1L << (OP_INC - 129)) | (1L << (OP_DEC - 129)) | (1L << (OP_RANGE - 129)))) != 0)) {
				{
				setState(2728);
				argument_list();
				}
			}

			setState(2731);
			match(CLOSE_PARENS);
			setState(2733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(2732);
				object_or_collection_initializer();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CSharpParser.IDENTIFIER, 0); }
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public TerminalNode ALIAS() { return getToken(CSharpParser.ALIAS, 0); }
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public TerminalNode ASCENDING() { return getToken(CSharpParser.ASCENDING, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public TerminalNode BY() { return getToken(CSharpParser.BY, 0); }
		public TerminalNode DESCENDING() { return getToken(CSharpParser.DESCENDING, 0); }
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public TerminalNode EQUALS() { return getToken(CSharpParser.EQUALS, 0); }
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public TerminalNode GROUP() { return getToken(CSharpParser.GROUP, 0); }
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public TerminalNode NAMEOF() { return getToken(CSharpParser.NAMEOF, 0); }
		public TerminalNode ON() { return getToken(CSharpParser.ON, 0); }
		public TerminalNode ORDERBY() { return getToken(CSharpParser.ORDERBY, 0); }
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public TerminalNode SELECT() { return getToken(CSharpParser.SELECT, 0); }
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public TerminalNode UNMANAGED() { return getToken(CSharpParser.UNMANAGED, 0); }
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2735);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMEOF - 64)) | (1L << (ON - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTIAL - 64)) | (1L << (REMOVE - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (UNMANAGED - 64)) | (1L << (VAR - 64)) | (1L << (WHEN - 64)) | (1L << (WHERE - 64)) | (1L << (YIELD - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) ) {
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
		case 207:
			return right_arrow_sempred((Right_arrowContext)_localctx, predIndex);
		case 208:
			return right_shift_sempred((Right_shiftContext)_localctx, predIndex);
		case 209:
			return right_shift_assignment_sempred((Right_shift_assignmentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean right_arrow_sempred(Right_arrowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return (((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_sempred(Right_shiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return (((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_assignment_sempred(Right_shift_assignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return (((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c8\u0ab4\4\2\t"+
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
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\3\2\5\2\u01e8\n\2\3\2\5\2\u01eb"+
		"\n\2\3\2\5\2\u01ee\n\2\3\2\7\2\u01f1\n\2\f\2\16\2\u01f4\13\2\3\2\5\2\u01f7"+
		"\n\2\3\2\3\2\3\3\3\3\5\3\u01fd\n\3\3\3\5\3\u0200\n\3\3\3\3\3\3\3\5\3\u0205"+
		"\n\3\7\3\u0207\n\3\f\3\16\3\u020a\13\3\3\4\3\4\3\4\3\4\7\4\u0210\n\4\f"+
		"\4\16\4\u0213\13\4\3\5\3\5\3\5\3\5\3\5\5\5\u021a\n\5\3\6\3\6\3\6\3\6\6"+
		"\6\u0220\n\6\r\6\16\6\u0221\3\6\3\6\3\7\3\7\5\7\u0228\n\7\3\b\3\b\5\b"+
		"\u022c\n\b\3\t\3\t\3\t\5\t\u0231\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\f\u023b\n\f\3\r\3\r\3\r\3\r\7\r\u0241\n\r\f\r\16\r\u0244\13\r\3\r\3"+
		"\r\3\16\3\16\3\16\7\16\u024b\n\16\f\16\16\16\u024e\13\16\3\17\3\17\3\17"+
		"\5\17\u0253\n\17\3\17\5\17\u0256\n\17\3\17\3\17\5\17\u025a\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\5\20\u0262\n\20\3\21\3\21\3\21\5\21\u0267\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0271\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u027e\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0286\n\24\3\25\3\25\3\25\3\25\5\25\u028c\n\25\5"+
		"\25\u028e\n\25\3\26\3\26\3\26\7\26\u0293\n\26\f\26\16\26\u0296\13\26\3"+
		"\27\3\27\3\27\7\27\u029b\n\27\f\27\16\27\u029e\13\27\3\30\3\30\3\30\7"+
		"\30\u02a3\n\30\f\30\16\30\u02a6\13\30\3\31\3\31\3\31\7\31\u02ab\n\31\f"+
		"\31\16\31\u02ae\13\31\3\32\3\32\3\32\7\32\u02b3\n\32\f\32\16\32\u02b6"+
		"\13\32\3\33\3\33\3\33\7\33\u02bb\n\33\f\33\16\33\u02be\13\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u02c7\n\34\f\34\16\34\u02ca\13\34\3\35"+
		"\3\35\3\35\5\35\u02cf\n\35\3\35\7\35\u02d2\n\35\f\35\16\35\u02d5\13\35"+
		"\3\36\3\36\3\36\7\36\u02da\n\36\f\36\16\36\u02dd\13\36\3\37\3\37\3\37"+
		"\7\37\u02e2\n\37\f\37\16\37\u02e5\13\37\3 \3 \3 \3 \3 \5 \u02ec\n \5 "+
		"\u02ee\n \3 \5 \u02f1\n \3!\3!\3!\7!\u02f6\n!\f!\16!\u02f9\13!\3\"\3\""+
		"\5\"\u02fd\n\"\3\"\3\"\3\"\3#\3#\5#\u0304\n#\3#\3#\5#\u0308\n#\5#\u030a"+
		"\n#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\5%\u0327\n%\3&\3&\5&\u032b\n&\3&\7&\u032e\n&\f&\16&\u0331"+
		"\13&\3&\5&\u0334\n&\3&\3&\3&\3&\3&\3&\5&\u033c\n&\3&\5&\u033f\n&\3&\7"+
		"&\u0342\n&\f&\16&\u0345\13&\3&\5&\u0348\n&\7&\u034a\n&\f&\16&\u034d\13"+
		"&\3\'\3\'\3\'\5\'\u0352\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u0360\n\'\3\'\3\'\3\'\3\'\5\'\u0366\n\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\7\'\u0370\n\'\f\'\16\'\u0373\13\'\3\'\5\'\u0376\n\'\3\'\6"+
		"\'\u0379\n\'\r\'\16\'\u037a\3\'\3\'\5\'\u037f\n\'\3\'\3\'\3\'\3\'\5\'"+
		"\u0385\n\'\3\'\3\'\3\'\3\'\6\'\u038b\n\'\r\'\16\'\u038c\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u0396\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u03a8\n\'\3\'\5\'\u03ab\n\'\3\'\3\'\3\'\5\'"+
		"\u03b0\n\'\3\'\5\'\u03b3\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\7\'\u03c0\n\'\f\'\16\'\u03c3\13\'\3\'\3\'\3\'\5\'\u03c8\n\'\3(\3(\5"+
		"(\u03cc\n(\3)\3)\3)\3*\5*\u03d2\n*\3*\3*\3*\5*\u03d7\n*\3+\5+\u03da\n"+
		"+\3+\3+\3+\3+\7+\u03e0\n+\f+\16+\u03e3\13+\3+\3+\3,\3,\3,\5,\u03ea\n,"+
		"\3,\3,\3-\3-\3.\3.\3.\7.\u03f3\n.\f.\16.\u03f6\13.\3/\3/\5/\u03fa\n/\3"+
		"\60\3\60\3\60\5\60\u03ff\n\60\5\60\u0401\n\60\3\60\3\60\3\61\3\61\3\61"+
		"\7\61\u0408\n\61\f\61\16\61\u040b\13\61\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u0412\n\62\3\62\3\62\3\62\3\63\3\63\5\63\u0419\n\63\3\64\3\64\3\64\3"+
		"\64\7\64\u041f\n\64\f\64\16\64\u0422\13\64\3\64\5\64\u0425\n\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\5\65\u042e\n\65\3\66\3\66\3\66\5\66\u0433"+
		"\n\66\5\66\u0435\n\66\3\66\3\66\3\67\3\67\3\67\7\67\u043c\n\67\f\67\16"+
		"\67\u043f\13\67\38\38\38\38\38\58\u0446\n8\39\39\59\u044a\n9\39\39\39"+
		"\59\u044f\n9\59\u0451\n9\39\39\39\59\u0456\n9\79\u0458\n9\f9\169\u045b"+
		"\139\3:\3:\7:\u045f\n:\f:\16:\u0462\13:\3:\3:\3;\3;\3;\7;\u0469\n;\f;"+
		"\16;\u046c\13;\3;\5;\u046f\n;\3;\5;\u0472\n;\3;\5;\u0475\n;\3<\3<\3<\3"+
		"<\7<\u047b\n<\f<\16<\u047e\13<\3<\3<\3=\3=\3=\3=\3>\5>\u0487\n>\3>\3>"+
		"\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0498\n?\3@\3@\3@\7@\u049d"+
		"\n@\f@\16@\u04a0\13@\3A\5A\u04a3\nA\3A\3A\3A\3B\3B\3B\7B\u04ab\nB\fB\16"+
		"B\u04ae\13B\3C\3C\5C\u04b2\nC\3D\3D\3D\3E\3E\5E\u04b9\nE\3E\3E\3E\3E\3"+
		"F\7F\u04c0\nF\fF\16F\u04c3\13F\3F\3F\5F\u04c7\nF\3G\3G\3G\3G\3G\5G\u04ce"+
		"\nG\3H\3H\3H\3H\3H\3I\3I\3I\3J\3J\5J\u04da\nJ\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\5J\u04e5\nJ\3K\3K\3K\3K\7K\u04eb\nK\fK\16K\u04ee\13K\3L\3L\5L\u04f2"+
		"\nL\3M\3M\3M\3M\3M\3M\3M\5M\u04fb\nM\3N\3N\3N\3N\3O\3O\3O\5O\u0504\nO"+
		"\3P\3P\3P\3P\3P\3P\3P\5P\u050d\nP\3Q\3Q\3Q\3R\5R\u0513\nR\3R\3R\3R\5R"+
		"\u0518\nR\3R\3R\5R\u051c\nR\3R\3R\5R\u0520\nR\3S\3S\5S\u0524\nS\3S\3S"+
		"\5S\u0528\nS\3T\3T\3T\3T\3T\5T\u052f\nT\3U\3U\3U\3U\3V\3V\3V\3V\3V\5V"+
		"\u053a\nV\3W\3W\3W\3W\3W\3X\3X\3X\3X\5X\u0545\nX\3Y\3Y\3Y\3Y\3Y\3Z\3Z"+
		"\3Z\7Z\u054f\nZ\fZ\16Z\u0552\13Z\3Z\3Z\3[\3[\5[\u0558\n[\3\\\3\\\3\\\3"+
		"\\\5\\\u055e\n\\\3]\3]\3]\3]\3]\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3`\3"+
		"`\3`\5`\u0573\n`\3`\3`\5`\u0577\n`\3`\3`\5`\u057b\n`\3`\3`\3a\3a\3a\3"+
		"b\5b\u0583\nb\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3d\3d\3e\3e\3f\3f\3f\3"+
		"f\5f\u0598\nf\3f\5f\u059b\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5"+
		"g\u05aa\ng\3g\3g\3g\5g\u05af\ng\3g\3g\3g\5g\u05b4\ng\3g\3g\3g\3g\3g\3"+
		"g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u05cb\ng\3g\3g\3g\3"+
		"g\3g\3g\3g\3g\3g\3g\5g\u05d7\ng\3h\3h\5h\u05db\nh\3h\3h\3i\3i\3i\3i\5"+
		"i\u05e3\ni\3i\3i\3i\3i\7i\u05e9\ni\fi\16i\u05ec\13i\3i\3i\3i\3i\5i\u05f2"+
		"\ni\3j\3j\5j\u05f6\nj\3k\3k\3k\5k\u05fb\nk\3k\5k\u05fe\nk\3l\3l\3l\5l"+
		"\u0603\nl\3m\3m\3m\3m\3n\3n\5n\u060b\nn\3o\6o\u060e\no\ro\16o\u060f\3"+
		"o\3o\3p\3p\3p\5p\u0617\np\3p\3p\3p\3p\5p\u061d\np\3q\3q\3q\3r\6r\u0623"+
		"\nr\rr\16r\u0624\3s\3s\3s\3s\7s\u062b\ns\fs\16s\u062e\13s\5s\u0630\ns"+
		"\3t\3t\3t\7t\u0635\nt\ft\16t\u0638\13t\3u\3u\7u\u063c\nu\fu\16u\u063f"+
		"\13u\3u\5u\u0642\nu\3u\3u\5u\u0646\nu\3v\3v\5v\u064a\nv\3v\3v\3w\3w\3"+
		"w\3w\5w\u0652\nw\3w\3w\3x\3x\5x\u0658\nx\3x\3x\3y\3y\3y\3y\3y\3z\3z\5"+
		"z\u0663\nz\3{\3{\5{\u0667\n{\3|\3|\3|\3|\5|\u066d\n|\3}\3}\3}\7}\u0672"+
		"\n}\f}\16}\u0675\13}\3~\3~\5~\u0679\n~\3~\5~\u067c\n~\3~\5~\u067f\n~\3"+
		"~\3~\3\177\6\177\u0684\n\177\r\177\16\177\u0685\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0081\6\u0081\u068e\n\u0081\r\u0081\16\u0081\u068f"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u06a1\n\u0082"+
		"\3\u0083\6\u0083\u06a4\n\u0083\r\u0083\16\u0083\u06a5\3\u0084\3\u0084"+
		"\5\u0084\u06aa\n\u0084\3\u0085\5\u0085\u06ad\n\u0085\3\u0085\5\u0085\u06b0"+
		"\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u06b7\n\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u06bd\n\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\7\u0087\u06c3\n\u0087\f\u0087\16\u0087\u06c6\13\u0087"+
		"\3\u0087\3\u0087\3\u0088\5\u0088\u06cb\n\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\7\u0089\u06d3\n\u0089\f\u0089\16\u0089\u06d6"+
		"\13\u0089\3\u008a\3\u008a\3\u008a\7\u008a\u06db\n\u008a\f\u008a\16\u008a"+
		"\u06de\13\u008a\3\u008b\6\u008b\u06e1\n\u008b\r\u008b\16\u008b\u06e2\3"+
		"\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u06ee\n\u008d\3\u008d\3\u008d\5\u008d\u06f2\n\u008d\5\u008d\u06f4"+
		"\n\u008d\3\u008e\3\u008e\3\u008e\5\u008e\u06f9\n\u008e\3\u008e\3\u008e"+
		"\5\u008e\u06fd\n\u008e\3\u008f\3\u008f\3\u008f\7\u008f\u0702\n\u008f\f"+
		"\u008f\16\u008f\u0705\13\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\5\u0091\u070d\n\u0091\3\u0091\3\u0091\3\u0092\6\u0092\u0712\n"+
		"\u0092\r\u0092\16\u0092\u0713\3\u0093\5\u0093\u0717\n\u0093\3\u0093\5"+
		"\u0093\u071a\n\u0093\3\u0093\3\u0093\5\u0093\u071e\n\u0093\3\u0094\6\u0094"+
		"\u0721\n\u0094\r\u0094\16\u0094\u0722\3\u0095\3\u0095\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0730"+
		"\n\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u073a\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097"+
		"\u0741\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\5\u0097\u074d\n\u0097\3\u0098\3\u0098\3\u0098"+
		"\7\u0098\u0752\n\u0098\f\u0098\16\u0098\u0755\13\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\7\u009a\u075e\n\u009a\f\u009a"+
		"\16\u009a\u0761\13\u009a\3\u009b\3\u009b\3\u009b\5\u009b\u0766\n\u009b"+
		"\3\u009c\3\u009c\5\u009c\u076a\n\u009c\3\u009d\3\u009d\5\u009d\u076e\n"+
		"\u009d\3\u009e\3\u009e\3\u009f\3\u009f\5\u009f\u0774\n\u009f\3\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\5\u00a0\u077a\n\u00a0\5\u00a0\u077c\n\u00a0\3\u00a1"+
		"\3\u00a1\3\u00a1\7\u00a1\u0781\n\u00a1\f\u00a1\16\u00a1\u0784\13\u00a1"+
		"\3\u00a2\5\u00a2\u0787\n\u00a2\3\u00a2\5\u00a2\u078a\n\u00a2\3\u00a2\3"+
		"\u00a2\5\u00a2\u078e\n\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a3\5\u00a3\u0798\n\u00a3\3\u00a4\5\u00a4\u079b\n\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\5\u00a5\u07a2\n\u00a5\3\u00a5"+
		"\5\u00a5\u07a5\n\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u07aa\n\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\5\u00a5\u07af\n\u00a5\5\u00a5\u07b1\n\u00a5\3\u00a6"+
		"\5\u00a6\u07b4\n\u00a6\3\u00a6\5\u00a6\u07b7\n\u00a6\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a7\5\u00a7\u07bd\n\u00a7\3\u00a7\5\u00a7\u07c0\n\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\5\u00a8\u07cc\n\u00a8\3\u00a9\3\u00a9\5\u00a9\u07d0\n\u00a9\3\u00aa\5"+
		"\u00aa\u07d3\n\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3"+
		"\u00aa\3\u00aa\5\u00aa\u07dd\n\u00aa\3\u00ab\5\u00ab\u07e0\n\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ac\5\u00ac\u07e6\n\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0801\n\u00ad\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\5\u00af\u080e\n\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\5\u00b0\u0814\n"+
		"\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\7\u00b2\u081b\n\u00b2\f"+
		"\u00b2\16\u00b2\u081e\13\u00b2\3\u00b2\3\u00b2\3\u00b3\5\u00b3\u0823\n"+
		"\u00b3\3\u00b3\5\u00b3\u0826\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\6"+
		"\u00b3\u082c\n\u00b3\r\u00b3\16\u00b3\u082d\3\u00b3\3\u00b3\5\u00b3\u0832"+
		"\n\u00b3\3\u00b4\3\u00b4\7\u00b4\u0836\n\u00b4\f\u00b4\16\u00b4\u0839"+
		"\13\u00b4\3\u00b4\6\u00b4\u083c\n\u00b4\r\u00b4\16\u00b4\u083d\3\u00b5"+
		"\3\u00b5\7\u00b5\u0842\n\u00b5\f\u00b5\16\u00b5\u0845\13\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u084d\n\u00b6\f\u00b6"+
		"\16\u00b6\u0850\13\u00b6\3\u00b6\5\u00b6\u0853\n\u00b6\5\u00b6\u0855\n"+
		"\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u085d\n"+
		"\u00b7\f\u00b7\16\u00b7\u0860\13\u00b7\3\u00b7\3\u00b7\3\u00b8\5\u00b8"+
		"\u0865\n\u00b8\3\u00b8\5\u00b8\u0868\n\u00b8\3\u00b8\3\u00b8\3\u00b9\3"+
		"\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc"+
		"\7\u00bc\u0876\n\u00bc\f\u00bc\16\u00bc\u0879\13\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bd\5\u00bd\u087e\n\u00bd\3\u00bd\5\u00bd\u0881\n\u00bd\3\u00bd\5"+
		"\u00bd\u0884\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u088b"+
		"\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0890\n\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0894\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0898\n\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u08a9\n\u00bd\3\u00bd"+
		"\5\u00bd\u08ac\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u08b1\n\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u08b5\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u08b9\n\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u08c2"+
		"\n\u00bd\3\u00be\5\u00be\u08c5\n\u00be\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u08ca\n\u00be\3\u00be\3\u00be\5\u00be\u08ce\n\u00be\3\u00be\3\u00be\3"+
		"\u00be\5\u00be\u08d3\n\u00be\3\u00be\3\u00be\5\u00be\u08d7\n\u00be\5\u00be"+
		"\u08d9\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\7\u00c0\u08e2\n\u00c0\f\u00c0\16\u00c0\u08e5\13\u00c0\3\u00c0\5\u00c0"+
		"\u08e8\n\u00c0\5\u00c0\u08ea\n\u00c0\3\u00c0\3\u00c0\3\u00c1\5\u00c1\u08ef"+
		"\n\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u08f4\n\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u08fe\n\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c4\3\u00c4\5\u00c4\u0904\n\u00c4\3\u00c5\6\u00c5"+
		"\u0907\n\u00c5\r\u00c5\16\u00c5\u0908\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u090f\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u0913\n\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c7\3\u00c7\5\u00c7\u0919\n\u00c7\3\u00c8\3\u00c8\3\u00c8\7"+
		"\u00c8\u091e\n\u00c8\f\u00c8\16\u00c8\u0921\13\u00c8\3\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\7\u00c9\u0928\n\u00c9\f\u00c9\16\u00c9\u092b\13"+
		"\u00c9\5\u00c9\u092d\n\u00c9\3\u00c9\5\u00c9\u0930\n\u00c9\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u0935\n\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\5\u00cb"+
		"\u093b\n\u00cb\3\u00cb\3\u00cb\7\u00cb\u093f\n\u00cb\f\u00cb\16\u00cb"+
		"\u0942\13\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0948\n\u00cb"+
		"\3\u00cc\3\u00cc\3\u00cc\7\u00cc\u094d\n\u00cc\f\u00cc\16\u00cc\u0950"+
		"\13\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\5\u00ce\u0957\n\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u095b\n\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\5\u00d0\u096a\n\u00d0\3\u00d0\3\u00d0\5\u00d0\u096e\n\u00d0\3\u00d0\3"+
		"\u00d0\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0975\n\u00d0\f\u00d0\16\u00d0"+
		"\u0978\13\u00d0\3\u00d0\5\u00d0\u097b\n\u00d0\3\u00d0\3\u00d0\5\u00d0"+
		"\u097f\n\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0995\n\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u099d\n\u00d6\3\u00d7\3\u00d7"+
		"\7\u00d7\u09a1\n\u00d7\f\u00d7\16\u00d7\u09a4\13\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d8\3\u00d8\7\u00d8\u09aa\n\u00d8\f\u00d8\16\u00d8\u09ad\13\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u09b5\n\u00d9"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u09bb\n\u00da\3\u00db\3\u00db"+
		"\3\u00db\7\u00db\u09c0\n\u00db\f\u00db\16\u00db\u09c3\13\u00db\3\u00db"+
		"\3\u00db\6\u00db\u09c7\n\u00db\r\u00db\16\u00db\u09c8\5\u00db\u09cb\n"+
		"\u00db\3\u00dc\3\u00dc\3\u00dd\3\u00dd\5\u00dd\u09d1\n\u00dd\3\u00de\3"+
		"\u00de\3\u00de\5\u00de\u09d6\n\u00de\3\u00df\3\u00df\3\u00df\5\u00df\u09db"+
		"\n\u00df\3\u00df\5\u00df\u09de\n\u00df\3\u00df\5\u00df\u09e1\n\u00df\3"+
		"\u00e0\5\u00e0\u09e4\n\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u09e9\n\u00e0"+
		"\3\u00e0\5\u00e0\u09ec\n\u00e0\3\u00e0\5\u00e0\u09ef\n\u00e0\3\u00e0\3"+
		"\u00e0\5\u00e0\u09f3\n\u00e0\3\u00e1\3\u00e1\5\u00e1\u09f7\n\u00e1\3\u00e1"+
		"\5\u00e1\u09fa\n\u00e1\3\u00e1\5\u00e1\u09fd\n\u00e1\3\u00e1\3\u00e1\5"+
		"\u00e1\u0a01\n\u00e1\3\u00e2\3\u00e2\5\u00e2\u0a05\n\u00e2\3\u00e2\3\u00e2"+
		"\5\u00e2\u0a09\n\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a0f\n"+
		"\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a13\n\u00e3\3\u00e3\3\u00e3\5\u00e3\u0a17"+
		"\n\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u0a25\n\u00e4\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\5\u00e6\u0a32\n\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0a38\n"+
		"\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\5\u00e8\u0a4b\n\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0a56\n\u00ea\3\u00ea\3\u00ea\5\u00ea"+
		"\u0a5a\n\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\5\u00eb\u0a60\n\u00eb\3"+
		"\u00ec\3\u00ec\5\u00ec\u0a64\n\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3"+
		"\u00ec\5\u00ec\u0a6b\n\u00ec\3\u00ed\3\u00ed\5\u00ed\u0a6f\n\u00ed\3\u00ed"+
		"\3\u00ed\5\u00ed\u0a73\n\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\5\u00ee\u0a7c\n\u00ee\3\u00ee\5\u00ee\u0a7f\n\u00ee\3"+
		"\u00ee\3\u00ee\7\u00ee\u0a83\n\u00ee\f\u00ee\16\u00ee\u0a86\13\u00ee\3"+
		"\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0a8c\n\u00ef\3\u00ef\3\u00ef\3"+
		"\u00ef\5\u00ef\u0a91\n\u00ef\3\u00ef\5\u00ef\u0a94\n\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0a9c\n\u00ef\3\u00f0\3\u00f0"+
		"\3\u00f0\3\u00f0\5\u00f0\u0aa2\n\u00f0\3\u00f1\3\u00f1\5\u00f1\u0aa6\n"+
		"\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2\5\u00f2\u0aac\n\u00f2\3\u00f2\3"+
		"\u00f2\5\u00f2\u0ab0\n\u00f2\3\u00f3\3\u00f3\3\u00f3\2\2\u00f4\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0"+
		"\u01e2\u01e4\2\25\n\2\27\27\32\3299AAUUYYefjj\4\2$$//\5\288JJRR\3\2\u009e"+
		"\u009f\4\2\u0094\u0095\u00a0\u00a1\3\2\u0089\u008a\3\2\u008b\u008d\20"+
		"\2\24\24\27\27\32\32\37\37$$//99AAFFUUYY]]efjj\4\2\20\20\"\"\4\2\21\21"+
		"ii\16\2\13\13\21\21++;;DDKKMQVV\\\\iimmoo\4\2**\67\67\4\2\23\23``\4\2"+
		"\u008b\u008b\u0096\u0096\4\288JJ\4\2,,bb\25\2\13\13\17\17\23\25\27!#$"+
		"&\')\61\64\64\66;==@ACFHHJLNRTVYkmorr\3\2QR\26\2\f\16\20\22\26\26\"\""+
		"%%((\62\63\65\65<<>?BBGGIIMMSSWXhhllpqst\2\u0bae\2\u01e7\3\2\2\2\4\u01ff"+
		"\3\2\2\2\6\u020b\3\2\2\2\b\u0219\3\2\2\2\n\u021b\3\2\2\2\f\u0225\3\2\2"+
		"\2\16\u022b\3\2\2\2\20\u0230\3\2\2\2\22\u0232\3\2\2\2\24\u0234\3\2\2\2"+
		"\26\u023a\3\2\2\2\30\u023c\3\2\2\2\32\u0247\3\2\2\2\34\u0252\3\2\2\2\36"+
		"\u0261\3\2\2\2 \u0266\3\2\2\2\"\u0270\3\2\2\2$\u027d\3\2\2\2&\u027f\3"+
		"\2\2\2(\u0287\3\2\2\2*\u028f\3\2\2\2,\u0297\3\2\2\2.\u029f\3\2\2\2\60"+
		"\u02a7\3\2\2\2\62\u02af\3\2\2\2\64\u02b7\3\2\2\2\66\u02bf\3\2\2\28\u02cb"+
		"\3\2\2\2:\u02d6\3\2\2\2<\u02de\3\2\2\2>\u02e6\3\2\2\2@\u02f2\3\2\2\2B"+
		"\u02fa\3\2\2\2D\u0309\3\2\2\2F\u030b\3\2\2\2H\u0326\3\2\2\2J\u0328\3\2"+
		"\2\2L\u03c7\3\2\2\2N\u03cb\3\2\2\2P\u03cd\3\2\2\2R\u03d1\3\2\2\2T\u03d9"+
		"\3\2\2\2V\u03e9\3\2\2\2X\u03ed\3\2\2\2Z\u03ef\3\2\2\2\\\u03f9\3\2\2\2"+
		"^\u03fb\3\2\2\2`\u0404\3\2\2\2b\u0411\3\2\2\2d\u0418\3\2\2\2f\u041a\3"+
		"\2\2\2h\u042d\3\2\2\2j\u042f\3\2\2\2l\u0438\3\2\2\2n\u0445\3\2\2\2p\u0447"+
		"\3\2\2\2r\u045c\3\2\2\2t\u0465\3\2\2\2v\u0476\3\2\2\2x\u0481\3\2\2\2z"+
		"\u0486\3\2\2\2|\u0497\3\2\2\2~\u0499\3\2\2\2\u0080\u04a2\3\2\2\2\u0082"+
		"\u04a7\3\2\2\2\u0084\u04b1\3\2\2\2\u0086\u04b3\3\2\2\2\u0088\u04b6\3\2"+
		"\2\2\u008a\u04c1\3\2\2\2\u008c\u04cd\3\2\2\2\u008e\u04cf\3\2\2\2\u0090"+
		"\u04d4\3\2\2\2\u0092\u04d7\3\2\2\2\u0094\u04e6\3\2\2\2\u0096\u04ef\3\2"+
		"\2\2\u0098\u04fa\3\2\2\2\u009a\u04fc\3\2\2\2\u009c\u0503\3\2\2\2\u009e"+
		"\u050c\3\2\2\2\u00a0\u050e\3\2\2\2\u00a2\u0512\3\2\2\2\u00a4\u0527\3\2"+
		"\2\2\u00a6\u052e\3\2\2\2\u00a8\u0530\3\2\2\2\u00aa\u0539\3\2\2\2\u00ac"+
		"\u053b\3\2\2\2\u00ae\u0540\3\2\2\2\u00b0\u0546\3\2\2\2\u00b2\u054b\3\2"+
		"\2\2\u00b4\u0557\3\2\2\2\u00b6\u055d\3\2\2\2\u00b8\u055f\3\2\2\2\u00ba"+
		"\u0564\3\2\2\2\u00bc\u0567\3\2\2\2\u00be\u056f\3\2\2\2\u00c0\u057e\3\2"+
		"\2\2\u00c2\u0582\3\2\2\2\u00c4\u058c\3\2\2\2\u00c6\u058f\3\2\2\2\u00c8"+
		"\u0591\3\2\2\2\u00ca\u0593\3\2\2\2\u00cc\u05d6\3\2\2\2\u00ce\u05d8\3\2"+
		"\2\2\u00d0\u05f1\3\2\2\2\u00d2\u05f5\3\2\2\2\u00d4\u05f7\3\2\2\2\u00d6"+
		"\u0602\3\2\2\2\u00d8\u0604\3\2\2\2\u00da\u060a\3\2\2\2\u00dc\u060d\3\2"+
		"\2\2\u00de\u061c\3\2\2\2\u00e0\u061e\3\2\2\2\u00e2\u0622\3\2\2\2\u00e4"+
		"\u062f\3\2\2\2\u00e6\u0631\3\2\2\2\u00e8\u0645\3\2\2\2\u00ea\u0647\3\2"+
		"\2\2\u00ec\u064d\3\2\2\2\u00ee\u0655\3\2\2\2\u00f0\u065b\3\2\2\2\u00f2"+
		"\u0660\3\2\2\2\u00f4\u0666\3\2\2\2\u00f6\u0668\3\2\2\2\u00f8\u066e\3\2"+
		"\2\2\u00fa\u0676\3\2\2\2\u00fc\u0683\3\2\2\2\u00fe\u0687\3\2\2\2\u0100"+
		"\u068d\3\2\2\2\u0102\u06a0\3\2\2\2\u0104\u06a3\3\2\2\2\u0106\u06a9\3\2"+
		"\2\2\u0108\u06ac\3\2\2\2\u010a\u06b8\3\2\2\2\u010c\u06be\3\2\2\2\u010e"+
		"\u06ca\3\2\2\2\u0110\u06ce\3\2\2\2\u0112\u06d7\3\2\2\2\u0114\u06e0\3\2"+
		"\2\2\u0116\u06e4\3\2\2\2\u0118\u06f3\3\2\2\2\u011a\u06fc\3\2\2\2\u011c"+
		"\u06fe\3\2\2\2\u011e\u0706\3\2\2\2\u0120\u070a\3\2\2\2\u0122\u0711\3\2"+
		"\2\2\u0124\u0716\3\2\2\2\u0126\u0720\3\2\2\2\u0128\u0724\3\2\2\2\u012a"+
		"\u0739\3\2\2\2\u012c\u0740\3\2\2\2\u012e\u074e\3\2\2\2\u0130\u0756\3\2"+
		"\2\2\u0132\u075a\3\2\2\2\u0134\u0762\3\2\2\2\u0136\u0769\3\2\2\2\u0138"+
		"\u076d\3\2\2\2\u013a\u076f\3\2\2\2\u013c\u0773\3\2\2\2\u013e\u077b\3\2"+
		"\2\2\u0140\u077d\3\2\2\2\u0142\u078d\3\2\2\2\u0144\u0797\3\2\2\2\u0146"+
		"\u079a\3\2\2\2\u0148\u07a1\3\2\2\2\u014a\u07b3\3\2\2\2\u014c\u07bc\3\2"+
		"\2\2\u014e\u07cb\3\2\2\2\u0150\u07cf\3\2\2\2\u0152\u07d2\3\2\2\2\u0154"+
		"\u07df\3\2\2\2\u0156\u07e5\3\2\2\2\u0158\u0800\3\2\2\2\u015a\u0802\3\2"+
		"\2\2\u015c\u0809\3\2\2\2\u015e\u0813\3\2\2\2\u0160\u0815\3\2\2\2\u0162"+
		"\u0818\3\2\2\2\u0164\u0822\3\2\2\2\u0166\u0833\3\2\2\2\u0168\u083f\3\2"+
		"\2\2\u016a\u0848\3\2\2\2\u016c\u0858\3\2\2\2\u016e\u0864\3\2\2\2\u0170"+
		"\u086b\3\2\2\2\u0172\u086d\3\2\2\2\u0174\u0870\3\2\2\2\u0176\u0873\3\2"+
		"\2\2\u0178\u087d\3\2\2\2\u017a\u08c4\3\2\2\2\u017c\u08da\3\2\2\2\u017e"+
		"\u08dd\3\2\2\2\u0180\u08ee\3\2\2\2\u0182\u08f5\3\2\2\2\u0184\u08f8\3\2"+
		"\2\2\u0186\u0903\3\2\2\2\u0188\u0906\3\2\2\2\u018a\u090a\3\2\2\2\u018c"+
		"\u0918\3\2\2\2\u018e\u091a\3\2\2\2\u0190\u0922\3\2\2\2\u0192\u0934\3\2"+
		"\2\2\u0194\u0947\3\2\2\2\u0196\u0949\3\2\2\2\u0198\u0951\3\2\2\2\u019a"+
		"\u095a\3\2\2\2\u019c\u095c\3\2\2\2\u019e\u097e\3\2\2\2\u01a0\u0980\3\2"+
		"\2\2\u01a2\u0984\3\2\2\2\u01a4\u0988\3\2\2\2\u01a6\u0994\3\2\2\2\u01a8"+
		"\u0996\3\2\2\2\u01aa\u099c\3\2\2\2\u01ac\u099e\3\2\2\2\u01ae\u09a7\3\2"+
		"\2\2\u01b0\u09b4\3\2\2\2\u01b2\u09ba\3\2\2\2\u01b4\u09bc\3\2\2\2\u01b6"+
		"\u09cc\3\2\2\2\u01b8\u09d0\3\2\2\2\u01ba\u09d2\3\2\2\2\u01bc\u09d7\3\2"+
		"\2\2\u01be\u09e3\3\2\2\2\u01c0\u09f4\3\2\2\2\u01c2\u0a02\3\2\2\2\u01c4"+
		"\u0a0a\3\2\2\2\u01c6\u0a1a\3\2\2\2\u01c8\u0a26\3\2\2\2\u01ca\u0a29\3\2"+
		"\2\2\u01cc\u0a39\3\2\2\2\u01ce\u0a3e\3\2\2\2\u01d0\u0a4c\3\2\2\2\u01d2"+
		"\u0a52\3\2\2\2\u01d4\u0a5f\3\2\2\2\u01d6\u0a61\3\2\2\2\u01d8\u0a6c\3\2"+
		"\2\2\u01da\u0a7b\3\2\2\2\u01dc\u0a87\3\2\2\2\u01de\u0a9d\3\2\2\2\u01e0"+
		"\u0aa3\3\2\2\2\u01e2\u0aa9\3\2\2\2\u01e4\u0ab1\3\2\2\2\u01e6\u01e8\7\3"+
		"\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01eb\5\u00fc\177\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed"+
		"\3\2\2\2\u01ec\u01ee\5\u0100\u0081\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3"+
		"\2\2\2\u01ee\u01f2\3\2\2\2\u01ef\u01f1\5\u0184\u00c3\2\u01f0\u01ef\3\2"+
		"\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7\5\u0104\u0083\2\u01f6\u01f5"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\7\2\2\3\u01f9"+
		"\3\3\2\2\2\u01fa\u01fc\5\u01e4\u00f3\2\u01fb\u01fd\5\30\r\2\u01fc\u01fb"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u0200\5\u010a\u0086"+
		"\2\u01ff\u01fa\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0208\3\2\2\2\u0201\u0202"+
		"\7\u0085\2\2\u0202\u0204\5\u01e4\u00f3\2\u0203\u0205\5\30\r\2\u0204\u0203"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0201\3\2\2\2\u0207"+
		"\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\5\3\2\2\2"+
		"\u020a\u0208\3\2\2\2\u020b\u0211\5\b\5\2\u020c\u0210\7\u0096\2\2\u020d"+
		"\u0210\5\u0168\u00b5\2\u020e\u0210\7\u008b\2\2\u020f\u020c\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\7\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u021a"+
		"\5\16\b\2\u0215\u021a\5\26\f\2\u0216\u0217\7n\2\2\u0217\u021a\7\u008b"+
		"\2\2\u0218\u021a\5\n\6\2\u0219\u0214\3\2\2\2\u0219\u0215\3\2\2\2\u0219"+
		"\u0216\3\2\2\2\u0219\u0218\3\2\2\2\u021a\t\3\2\2\2\u021b\u021c\7\u0083"+
		"\2\2\u021c\u021f\5\f\7\2\u021d\u021e\7\u0086\2\2\u021e\u0220\5\f\7\2\u021f"+
		"\u021d\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0224\7\u0084\2\2\u0224\13\3\2\2\2\u0225"+
		"\u0227\5\6\4\2\u0226\u0228\5\u01e4\u00f3\2\u0227\u0226\3\2\2\2\u0227\u0228"+
		"\3\2\2\2\u0228\r\3\2\2\2\u0229\u022c\5\20\t\2\u022a\u022c\7\24\2\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022c\17\3\2\2\2\u022d\u0231\5\22\n"+
		"\2\u022e\u0231\5\24\13\2\u022f\u0231\7\37\2\2\u0230\u022d\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231\21\3\2\2\2\u0232\u0233\t\2\2"+
		"\2\u0233\23\3\2\2\2\u0234\u0235\t\3\2\2\u0235\25\3\2\2\2\u0236\u023b\5"+
		"\4\3\2\u0237\u023b\7F\2\2\u0238\u023b\7%\2\2\u0239\u023b\7]\2\2\u023a"+
		"\u0236\3\2\2\2\u023a\u0237\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2"+
		"\2\2\u023b\27\3\2\2\2\u023c\u023d\7\u0094\2\2\u023d\u0242\5\6\4\2\u023e"+
		"\u023f\7\u0086\2\2\u023f\u0241\5\6\4\2\u0240\u023e\3\2\2\2\u0241\u0244"+
		"\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0245\u0246\7\u0095\2\2\u0246\31\3\2\2\2\u0247\u024c\5"+
		"\34\17\2\u0248\u0249\7\u0086\2\2\u0249\u024b\5\34\17\2\u024a\u0248\3\2"+
		"\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\33\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\5\u01e4\u00f3\2\u0250\u0251"+
		"\7\u0087\2\2\u0251\u0253\3\2\2\2\u0252\u024f\3\2\2\2\u0252\u0253\3\2\2"+
		"\2\u0253\u0255\3\2\2\2\u0254\u0256\t\4\2\2\u0255\u0254\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u025a\7l\2\2\u0258\u025a\5\6\4\2\u0259"+
		"\u0257\3\2\2\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2"+
		"\2\2\u025b\u025c\5\36\20\2\u025c\35\3\2\2\2\u025d\u0262\5\"\22\2\u025e"+
		"\u0262\5 \21\2\u025f\u0260\7R\2\2\u0260\u0262\5 \21\2\u0261\u025d\3\2"+
		"\2\2\u0261\u025e\3\2\2\2\u0261\u025f\3\2\2\2\u0262\37\3\2\2\2\u0263\u0267"+
		"\5z>\2\u0264\u0267\5\u0086D\2\u0265\u0267\5&\24\2\u0266\u0263\3\2\2\2"+
		"\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267!\3\2\2\2\u0268\u0269\5"+
		"H%\2\u0269\u026a\5$\23\2\u026a\u026b\5\36\20\2\u026b\u0271\3\2\2\2\u026c"+
		"\u026d\5H%\2\u026d\u026e\7\u00ac\2\2\u026e\u026f\5N(\2\u026f\u0271\3\2"+
		"\2\2\u0270\u0268\3\2\2\2\u0270\u026c\3\2\2\2\u0271#\3\2\2\2\u0272\u027e"+
		"\7\u0093\2\2\u0273\u027e\7\u00a2\2\2\u0274\u027e\7\u00a3\2\2\u0275\u027e"+
		"\7\u00a4\2\2\u0276\u027e\7\u00a5\2\2\u0277\u027e\7\u00a6\2\2\u0278\u027e"+
		"\7\u00a7\2\2\u0279\u027e\7\u00a8\2\2\u027a\u027e\7\u00a9\2\2\u027b\u027e"+
		"\7\u00ab\2\2\u027c\u027e\5\u01a4\u00d3\2\u027d\u0272\3\2\2\2\u027d\u0273"+
		"\3\2\2\2\u027d\u0274\3\2\2\2\u027d\u0275\3\2\2\2\u027d\u0276\3\2\2\2\u027d"+
		"\u0277\3\2\2\2\u027d\u0278\3\2\2\2\u027d\u0279\3\2\2\2\u027d\u027a\3\2"+
		"\2\2\u027d\u027b\3\2\2\2\u027d\u027c\3\2\2\2\u027e%\3\2\2\2\u027f\u0285"+
		"\5(\25\2\u0280\u0281\7\u0096\2\2\u0281\u0282\5N(\2\u0282\u0283\7\u0087"+
		"\2\2\u0283\u0284\5N(\2\u0284\u0286\3\2\2\2\u0285\u0280\3\2\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\'\3\2\2\2\u0287\u028d\5*\26\2\u0288\u028b\7\u0098\2\2\u0289"+
		"\u028c\5(\25\2\u028a\u028c\5P)\2\u028b\u0289\3\2\2\2\u028b\u028a\3\2\2"+
		"\2\u028c\u028e\3\2\2\2\u028d\u0288\3\2\2\2\u028d\u028e\3\2\2\2\u028e)"+
		"\3\2\2\2\u028f\u0294\5,\27\2\u0290\u0291\7\u009c\2\2\u0291\u0293\5,\27"+
		"\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295"+
		"\3\2\2\2\u0295+\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u029c\5.\30\2\u0298"+
		"\u0299\7\u009b\2\2\u0299\u029b\5.\30\2\u029a\u0298\3\2\2\2\u029b\u029e"+
		"\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d-\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029f\u02a4\5\60\31\2\u02a0\u02a1\7\u008f\2\2\u02a1\u02a3"+
		"\5\60\31\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2"+
		"\u02a4\u02a5\3\2\2\2\u02a5/\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02ac\5"+
		"\62\32\2\u02a8\u02a9\7\u0090\2\2\u02a9\u02ab\5\62\32\2\u02aa\u02a8\3\2"+
		"\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\61\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b4\5\64\33\2\u02b0\u02b1\7\u008e"+
		"\2\2\u02b1\u02b3\5\64\33\2\u02b2\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\63\3\2\2\2\u02b6\u02b4\3\2\2"+
		"\2\u02b7\u02bc\5\66\34\2\u02b8\u02b9\t\5\2\2\u02b9\u02bb\5\66\34\2\u02ba"+
		"\u02b8\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2"+
		"\2\2\u02bd\65\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c8\58\35\2\u02c0\u02c1"+
		"\t\6\2\2\u02c1\u02c7\58\35\2\u02c2\u02c3\7=\2\2\u02c3\u02c7\5t;\2\u02c4"+
		"\u02c5\7\17\2\2\u02c5\u02c7\5\6\4\2\u02c6\u02c0\3\2\2\2\u02c6\u02c2\3"+
		"\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9\67\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02d3\5:\36"+
		"\2\u02cc\u02cf\7\u00aa\2\2\u02cd\u02cf\5\u01a2\u00d2\2\u02ce\u02cc\3\2"+
		"\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\5:\36\2\u02d1"+
		"\u02ce\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d49\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02db\5<\37\2\u02d7\u02d8"+
		"\t\7\2\2\u02d8\u02da\5<\37\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2\2\2\u02db"+
		"\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc;\3\2\2\2\u02dd\u02db\3\2\2\2"+
		"\u02de\u02e3\5> \2\u02df\u02e0\t\b\2\2\u02e0\u02e2\5> \2\u02e1\u02df\3"+
		"\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"=\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02f0\5D#\2\u02e7\u02e8\7_\2\2\u02e8"+
		"\u02ed\7\177\2\2\u02e9\u02eb\5@!\2\u02ea\u02ec\7\u0086\2\2\u02eb\u02ea"+
		"\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ed"+
		"\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\7\u0080\2\2\u02f0\u02e7"+
		"\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1?\3\2\2\2\u02f2\u02f7\5B\"\2\u02f3\u02f4"+
		"\7\u0086\2\2\u02f4\u02f6\5B\"\2\u02f5\u02f3\3\2\2\2\u02f6\u02f9\3\2\2"+
		"\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8A\3\2\2\2\u02f9\u02f7"+
		"\3\2\2\2\u02fa\u02fc\5\36\20\2\u02fb\u02fd\5\u00e0q\2\u02fc\u02fb\3\2"+
		"\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\5\u01a0\u00d1"+
		"\2\u02ff\u0300\5N(\2\u0300C\3\2\2\2\u0301\u030a\5H%\2\u0302\u0304\5H%"+
		"\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307"+
		"\7\u00ad\2\2\u0306\u0308\5H%\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2"+
		"\u0308\u030a\3\2\2\2\u0309\u0301\3\2\2\2\u0309\u0303\3\2\2\2\u030aE\3"+
		"\2\2\2\u030b\u030c\7\u0083\2\2\u030c\u030d\5\6\4\2\u030d\u030e\7\u0084"+
		"\2\2\u030e\u030f\5H%\2\u030fG\3\2\2\2\u0310\u0327\5J&\2\u0311\u0312\7"+
		"\u0089\2\2\u0312\u0327\5H%\2\u0313\u0314\7\u008a\2\2\u0314\u0327\5H%\2"+
		"\u0315\u0316\7\u0091\2\2\u0316\u0327\5H%\2\u0317\u0318\7\u0092\2\2\u0318"+
		"\u0327\5H%\2\u0319\u031a\7\u0099\2\2\u031a\u0327\5H%\2\u031b\u031c\7\u009a"+
		"\2\2\u031c\u0327\5H%\2\u031d\u0327\5F$\2\u031e\u031f\7\22\2\2\u031f\u0327"+
		"\5H%\2\u0320\u0321\7\u008e\2\2\u0321\u0327\5H%\2\u0322\u0323\7\u008b\2"+
		"\2\u0323\u0327\5H%\2\u0324\u0325\7\u0090\2\2\u0325\u0327\5H%\2\u0326\u0310"+
		"\3\2\2\2\u0326\u0311\3\2\2\2\u0326\u0313\3\2\2\2\u0326\u0315\3\2\2\2\u0326"+
		"\u0317\3\2\2\2\u0326\u0319\3\2\2\2\u0326\u031b\3\2\2\2\u0326\u031d\3\2"+
		"\2\2\u0326\u031e\3\2\2\2\u0326\u0320\3\2\2\2\u0326\u0322\3\2\2\2\u0326"+
		"\u0324\3\2\2\2\u0327I\3\2\2\2\u0328\u032a\5L\'\2\u0329\u032b\7\u0091\2"+
		"\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032f\3\2\2\2\u032c\u032e"+
		"\5T+\2\u032d\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0334\7\u0091"+
		"\2\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u034b\3\2\2\2\u0335"+
		"\u033c\5R*\2\u0336\u033c\5\u01e0\u00f1\2\u0337\u033c\7\u0099\2\2\u0338"+
		"\u033c\7\u009a\2\2\u0339\u033a\7\u009d\2\2\u033a\u033c\5\u01e4\u00f3\2"+
		"\u033b\u0335\3\2\2\2\u033b\u0336\3\2\2\2\u033b\u0337\3\2\2\2\u033b\u0338"+
		"\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u033f\7\u0091\2"+
		"\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0343\3\2\2\2\u0340\u0342"+
		"\5T+\2\u0341\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0348\7\u0091"+
		"\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034a\3\2\2\2\u0349"+
		"\u033b\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2"+
		"\2\2\u034cK\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u03c8\5\u01a6\u00d4\2\u034f"+
		"\u0351\5\u01e4\u00f3\2\u0350\u0352\5\30\r\2\u0351\u0350\3\2\2\2\u0351"+
		"\u0352\3\2\2\2\u0352\u03c8\3\2\2\2\u0353\u0354\7\u0083\2\2\u0354\u0355"+
		"\5\36\20\2\u0355\u0356\7\u0084\2\2\u0356\u03c8\3\2\2\2\u0357\u03c8\5X"+
		"-\2\u0358\u03c8\5\u010a\u0086\2\u0359\u03c8\7u\2\2\u035a\u03c8\7`\2\2"+
		"\u035b\u0365\7\23\2\2\u035c\u035d\7\u0085\2\2\u035d\u035f\5\u01e4\u00f3"+
		"\2\u035e\u0360\5\30\r\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0366\3\2\2\2\u0361\u0362\7\u0081\2\2\u0362\u0363\5Z.\2\u0363\u0364\7"+
		"\u0082\2\2\u0364\u0366\3\2\2\2\u0365\u035c\3\2\2\2\u0365\u0361\3\2\2\2"+
		"\u0366\u03c8\3\2\2\2\u0367\u0384\7D\2\2\u0368\u037e\5\6\4\2\u0369\u037f"+
		"\5\u01e2\u00f2\2\u036a\u037f\5\\/\2\u036b\u036c\7\u0081\2\2\u036c\u036d"+
		"\5Z.\2\u036d\u0371\7\u0082\2\2\u036e\u0370\5\u0168\u00b5\2\u036f\u036e"+
		"\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0374\u0376\5\u016a\u00b6\2\u0375\u0374"+
		"\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u037f\3\2\2\2\u0377\u0379\5\u0168\u00b5"+
		"\2\u0378\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b"+
		"\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\5\u016a\u00b6\2\u037d\u037f\3"+
		"\2\2\2\u037e\u0369\3\2\2\2\u037e\u036a\3\2\2\2\u037e\u036b\3\2\2\2\u037e"+
		"\u0378\3\2\2\2\u037f\u0385\3\2\2\2\u0380\u0385\5j\66\2\u0381\u0382\5\u0168"+
		"\u00b5\2\u0382\u0383\5\u016a\u00b6\2\u0383\u0385\3\2\2\2\u0384\u0368\3"+
		"\2\2\2\u0384\u0380\3\2\2\2\u0384\u0381\3\2\2\2\u0385\u03c8\3\2\2\2\u0386"+
		"\u0387\7\u0083\2\2\u0387\u038a\5\34\17\2\u0388\u0389\7\u0086\2\2\u0389"+
		"\u038b\5\34\17\2\u038a\u0388\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038a\3"+
		"\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\7\u0084\2\2"+
		"\u038f\u03c8\3\2\2\2\u0390\u0391\7d\2\2\u0391\u0395\7\u0083\2\2\u0392"+
		"\u0396\5p9\2\u0393\u0396\5\6\4\2\u0394\u0396\7n\2\2\u0395\u0392\3\2\2"+
		"\2\u0395\u0393\3\2\2\2\u0395\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u03c8"+
		"\7\u0084\2\2\u0398\u0399\7\33\2\2\u0399\u039a\7\u0083\2\2\u039a\u039b"+
		"\5\36\20\2\u039b\u039c\7\u0084\2\2\u039c\u03c8\3\2\2\2\u039d\u039e\7g"+
		"\2\2\u039e\u039f\7\u0083\2\2\u039f\u03a0\5\36\20\2\u03a0\u03a1\7\u0084"+
		"\2\2\u03a1\u03c8\3\2\2\2\u03a2\u03a7\7 \2\2\u03a3\u03a4\7\u0083\2\2\u03a4"+
		"\u03a5\5\6\4\2\u03a5\u03a6\7\u0084\2\2\u03a6\u03a8\3\2\2\2\u03a7\u03a3"+
		"\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03c8\3\2\2\2\u03a9\u03ab\7\21\2\2"+
		"\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b2"+
		"\7!\2\2\u03ad\u03af\7\u0083\2\2\u03ae\u03b0\5~@\2\u03af\u03ae\3\2\2\2"+
		"\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\7\u0084\2\2\u03b2"+
		"\u03ad\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03c8\5\u00ce"+
		"h\2\u03b5\u03b6\7Z\2\2\u03b6\u03b7\7\u0083\2\2\u03b7\u03b8\5\6\4\2\u03b8"+
		"\u03b9\7\u0084\2\2\u03b9\u03c8\3\2\2\2\u03ba\u03bb\7B\2\2\u03bb\u03c1"+
		"\7\u0083\2\2\u03bc\u03bd\5\u01e4\u00f3\2\u03bd\u03be\7\u0085\2\2\u03be"+
		"\u03c0\3\2\2\2\u03bf\u03bc\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2"+
		"\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4"+
		"\u03c5\5\u01e4\u00f3\2\u03c5\u03c6\7\u0084\2\2\u03c6\u03c8\3\2\2\2\u03c7"+
		"\u034e\3\2\2\2\u03c7\u034f\3\2\2\2\u03c7\u0353\3\2\2\2\u03c7\u0357\3\2"+
		"\2\2\u03c7\u0358\3\2\2\2\u03c7\u0359\3\2\2\2\u03c7\u035a\3\2\2\2\u03c7"+
		"\u035b\3\2\2\2\u03c7\u0367\3\2\2\2\u03c7\u0386\3\2\2\2\u03c7\u0390\3\2"+
		"\2\2\u03c7\u0398\3\2\2\2\u03c7\u039d\3\2\2\2\u03c7\u03a2\3\2\2\2\u03c7"+
		"\u03aa\3\2\2\2\u03c7\u03b5\3\2\2\2\u03c7\u03ba\3\2\2\2\u03c8M\3\2\2\2"+
		"\u03c9\u03cc\5\36\20\2\u03ca\u03cc\5P)\2\u03cb\u03c9\3\2\2\2\u03cb\u03ca"+
		"\3\2\2\2\u03ccO\3\2\2\2\u03cd\u03ce\7a\2\2\u03ce\u03cf\5\36\20\2\u03cf"+
		"Q\3\2\2\2\u03d0\u03d2\7\u0096\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2"+
		"\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\7\u0085\2\2\u03d4\u03d6\5\u01e4\u00f3"+
		"\2\u03d5\u03d7\5\30\r\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7"+
		"S\3\2\2\2\u03d8\u03da\7\u0096\2\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2"+
		"\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\7\u0081\2\2\u03dc\u03e1\5V,\2\u03dd"+
		"\u03de\7\u0086\2\2\u03de\u03e0\5V,\2\u03df\u03dd\3\2\2\2\u03e0\u03e3\3"+
		"\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4\3\2\2\2\u03e3"+
		"\u03e1\3\2\2\2\u03e4\u03e5\7\u0082\2\2\u03e5U\3\2\2\2\u03e6\u03e7\5\u01e4"+
		"\u00f3\2\u03e7\u03e8\7\u0087\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e6\3\2\2"+
		"\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\5\36\20\2\u03ec"+
		"W\3\2\2\2\u03ed\u03ee\t\t\2\2\u03eeY\3\2\2\2\u03ef\u03f4\5\36\20\2\u03f0"+
		"\u03f1\7\u0086\2\2\u03f1\u03f3\5\36\20\2\u03f2\u03f0\3\2\2\2\u03f3\u03f6"+
		"\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5[\3\2\2\2\u03f6"+
		"\u03f4\3\2\2\2\u03f7\u03fa\5^\60\2\u03f8\u03fa\5f\64\2\u03f9\u03f7\3\2"+
		"\2\2\u03f9\u03f8\3\2\2\2\u03fa]\3\2\2\2\u03fb\u0400\7\177\2\2\u03fc\u03fe"+
		"\5`\61\2\u03fd\u03ff\7\u0086\2\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2"+
		"\2\u03ff\u0401\3\2\2\2\u0400\u03fc\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0403\7\u0080\2\2\u0403_\3\2\2\2\u0404\u0409\5b\62\2\u0405"+
		"\u0406\7\u0086\2\2\u0406\u0408\5b\62\2\u0407\u0405\3\2\2\2\u0408\u040b"+
		"\3\2\2\2\u0409\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040aa\3\2\2\2\u040b"+
		"\u0409\3\2\2\2\u040c\u0412\5\u01e4\u00f3\2\u040d\u040e\7\u0081\2\2\u040e"+
		"\u040f\5\36\20\2\u040f\u0410\7\u0082\2\2\u0410\u0412\3\2\2\2\u0411\u040c"+
		"\3\2\2\2\u0411\u040d\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0414\7\u0093\2"+
		"\2\u0414\u0415\5d\63\2\u0415c\3\2\2\2\u0416\u0419\5\36\20\2\u0417\u0419"+
		"\5\\/\2\u0418\u0416\3\2\2\2\u0418\u0417\3\2\2\2\u0419e\3\2\2\2\u041a\u041b"+
		"\7\177\2\2\u041b\u0420\5h\65\2\u041c\u041d\7\u0086\2\2\u041d\u041f\5h"+
		"\65\2\u041e\u041c\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420"+
		"\u0421\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u0425\7\u0086"+
		"\2\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426"+
		"\u0427\7\u0080\2\2\u0427g\3\2\2\2\u0428\u042e\5 \21\2\u0429\u042a\7\177"+
		"\2\2\u042a\u042b\5Z.\2\u042b\u042c\7\u0080\2\2\u042c\u042e\3\2\2\2\u042d"+
		"\u0428\3\2\2\2\u042d\u0429\3\2\2\2\u042ei\3\2\2\2\u042f\u0434\7\177\2"+
		"\2\u0430\u0432\5l\67\2\u0431\u0433\7\u0086\2\2\u0432\u0431\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u0435\3\2\2\2\u0434\u0430\3\2\2\2\u0434\u0435\3\2"+
		"\2\2\u0435\u0436\3\2\2\2\u0436\u0437\7\u0080\2\2\u0437k\3\2\2\2\u0438"+
		"\u043d\5n8\2\u0439\u043a\7\u0086\2\2\u043a\u043c\5n8\2\u043b\u0439\3\2"+
		"\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"m\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0446\5J&\2\u0441\u0442\5\u01e4\u00f3"+
		"\2\u0442\u0443\7\u0093\2\2\u0443\u0444\5\36\20\2\u0444\u0446\3\2\2\2\u0445"+
		"\u0440\3\2\2\2\u0445\u0441\3\2\2\2\u0446o\3\2\2\2\u0447\u0450\5\u01e4"+
		"\u00f3\2\u0448\u044a\5r:\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"\u0451\3\2\2\2\u044b\u044c\7\u0097\2\2\u044c\u044e\5\u01e4\u00f3\2\u044d"+
		"\u044f\5r:\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0451\3\2\2"+
		"\2\u0450\u0449\3\2\2\2\u0450\u044b\3\2\2\2\u0451\u0459\3\2\2\2\u0452\u0453"+
		"\7\u0085\2\2\u0453\u0455\5\u01e4\u00f3\2\u0454\u0456\5r:\2\u0455\u0454"+
		"\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0458\3\2\2\2\u0457\u0452\3\2\2\2\u0458"+
		"\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045aq\3\2\2\2"+
		"\u045b\u0459\3\2\2\2\u045c\u0460\7\u0094\2\2\u045d\u045f\7\u0086\2\2\u045e"+
		"\u045d\3\2\2\2\u045f\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2"+
		"\2\2\u0461\u0463\3\2\2\2\u0462\u0460\3\2\2\2\u0463\u0464\7\u0095\2\2\u0464"+
		"s\3\2\2\2\u0465\u046a\5\b\5\2\u0466\u0469\5\u0168\u00b5\2\u0467\u0469"+
		"\7\u008b\2\2\u0468\u0466\3\2\2\2\u0468\u0467\3\2\2\2\u0469\u046c\3\2\2"+
		"\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046a"+
		"\3\2\2\2\u046d\u046f\7\u0096\2\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2"+
		"\2\u046f\u0471\3\2\2\2\u0470\u0472\5v<\2\u0471\u0470\3\2\2\2\u0471\u0472"+
		"\3\2\2\2\u0472\u0474\3\2\2\2\u0473\u0475\5\u01e4\u00f3\2\u0474\u0473\3"+
		"\2\2\2\u0474\u0475\3\2\2\2\u0475u\3\2\2\2\u0476\u0477\7\177\2\2\u0477"+
		"\u047c\5x=\2\u0478\u0479\7\u0086\2\2\u0479\u047b\5x=\2\u047a\u0478\3\2"+
		"\2\2\u047b\u047e\3\2\2\2\u047c\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d"+
		"\u047f\3\2\2\2\u047e\u047c\3\2\2\2\u047f\u0480\7\u0080\2\2\u0480w\3\2"+
		"\2\2\u0481\u0482\5\u01e4\u00f3\2\u0482\u0483\7\u0087\2\2\u0483\u0484\5"+
		"\36\20\2\u0484y\3\2\2\2\u0485\u0487\7\21\2\2\u0486\u0485\3\2\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\5|?\2\u0489\u048a\5\u01a0"+
		"\u00d1\2\u048a\u048b\5\u0084C\2\u048b{\3\2\2\2\u048c\u048d\7\u0083\2\2"+
		"\u048d\u0498\7\u0084\2\2\u048e\u048f\7\u0083\2\2\u048f\u0490\5~@\2\u0490"+
		"\u0491\7\u0084\2\2\u0491\u0498\3\2\2\2\u0492\u0493\7\u0083\2\2\u0493\u0494"+
		"\5\u0082B\2\u0494\u0495\7\u0084\2\2\u0495\u0498\3\2\2\2\u0496\u0498\5"+
		"\u01e4\u00f3\2\u0497\u048c\3\2\2\2\u0497\u048e\3\2\2\2\u0497\u0492\3\2"+
		"\2\2\u0497\u0496\3\2\2\2\u0498}\3\2\2\2\u0499\u049e\5\u0080A\2\u049a\u049b"+
		"\7\u0086\2\2\u049b\u049d\5\u0080A\2\u049c\u049a\3\2\2\2\u049d\u04a0\3"+
		"\2\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\177\3\2\2\2\u04a0"+
		"\u049e\3\2\2\2\u04a1\u04a3\t\4\2\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2"+
		"\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\5\6\4\2\u04a5\u04a6\5\u01e4\u00f3"+
		"\2\u04a6\u0081\3\2\2\2\u04a7\u04ac\5\u01e4\u00f3\2\u04a8\u04a9\7\u0086"+
		"\2\2\u04a9\u04ab\5\u01e4\u00f3\2\u04aa\u04a8\3\2\2\2\u04ab\u04ae\3\2\2"+
		"\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u0083\3\2\2\2\u04ae\u04ac"+
		"\3\2\2\2\u04af\u04b2\5N(\2\u04b0\u04b2\5\u00ceh\2\u04b1\u04af\3\2\2\2"+
		"\u04b1\u04b0\3\2\2\2\u04b2\u0085\3\2\2\2\u04b3\u04b4\5\u0088E\2\u04b4"+
		"\u04b5\5\u008aF\2\u04b5\u0087\3\2\2\2\u04b6\u04b8\7\62\2\2\u04b7\u04b9"+
		"\5\6\4\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba"+
		"\u04bb\5\u01e4\u00f3\2\u04bb\u04bc\78\2\2\u04bc\u04bd\5\36\20\2\u04bd"+
		"\u0089\3\2\2\2\u04be\u04c0\5\u008cG\2\u04bf\u04be\3\2\2\2\u04c0\u04c3"+
		"\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3"+
		"\u04c1\3\2\2\2\u04c4\u04c6\5\u0098M\2\u04c5\u04c7\5\u009aN\2\u04c6\u04c5"+
		"\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u008b\3\2\2\2\u04c8\u04ce\5\u0088E"+
		"\2\u04c9\u04ce\5\u008eH\2\u04ca\u04ce\5\u0090I\2\u04cb\u04ce\5\u0092J"+
		"\2\u04cc\u04ce\5\u0094K\2\u04cd\u04c8\3\2\2\2\u04cd\u04c9\3\2\2\2\u04cd"+
		"\u04ca\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04cc\3\2\2\2\u04ce\u008d\3\2"+
		"\2\2\u04cf\u04d0\7?\2\2\u04d0\u04d1\5\u01e4\u00f3\2\u04d1\u04d2\7\u0093"+
		"\2\2\u04d2\u04d3\5\36\20\2\u04d3\u008f\3\2\2\2\u04d4\u04d5\7q\2\2\u04d5"+
		"\u04d6\5\36\20\2\u04d6\u0091\3\2\2\2\u04d7\u04d9\7>\2\2\u04d8\u04da\5"+
		"\6\4\2\u04d9\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04dc\5\u01e4\u00f3\2\u04dc\u04dd\78\2\2\u04dd\u04de\5\36\20\2\u04de"+
		"\u04df\7G\2\2\u04df\u04e0\5\36\20\2\u04e0\u04e1\7(\2\2\u04e1\u04e4\5\36"+
		"\20\2\u04e2\u04e3\7<\2\2\u04e3\u04e5\5\u01e4\u00f3\2\u04e4\u04e2\3\2\2"+
		"\2\u04e4\u04e5\3\2\2\2\u04e5\u0093\3\2\2\2\u04e6\u04e7\7I\2\2\u04e7\u04ec"+
		"\5\u0096L\2\u04e8\u04e9\7\u0086\2\2\u04e9\u04eb\5\u0096L\2\u04ea\u04e8"+
		"\3\2\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u0095\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f1\5\36\20\2\u04f0\u04f2\t"+
		"\n\2\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u0097\3\2\2\2\u04f3"+
		"\u04f4\7W\2\2\u04f4\u04fb\5\36\20\2\u04f5\u04f6\7\65\2\2\u04f6\u04f7\5"+
		"\36\20\2\u04f7\u04f8\7\26\2\2\u04f8\u04f9\5\36\20\2\u04f9\u04fb\3\2\2"+
		"\2\u04fa\u04f3\3\2\2\2\u04fa\u04f5\3\2\2\2\u04fb\u0099\3\2\2\2\u04fc\u04fd"+
		"\7<\2\2\u04fd\u04fe\5\u01e4\u00f3\2\u04fe\u04ff\5\u008aF\2\u04ff\u009b"+
		"\3\2\2\2\u0500\u0504\5\u00a8U\2\u0501\u0504\5\u009eP\2\u0502\u0504\5\u00aa"+
		"V\2\u0503\u0500\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0502\3\2\2\2\u0504"+
		"\u009d\3\2\2\2\u0505\u0506\5\u00d0i\2\u0506\u0507\7\u0088\2\2\u0507\u050d"+
		"\3\2\2\2\u0508\u0509\5\u00d8m\2\u0509\u050a\7\u0088\2\2\u050a\u050d\3"+
		"\2\2\2\u050b\u050d\5\u00a0Q\2\u050c\u0505\3\2\2\2\u050c\u0508\3\2\2\2"+
		"\u050c\u050b\3\2\2\2\u050d\u009f\3\2\2\2\u050e\u050f\5\u00a2R\2\u050f"+
		"\u0510\5\u00a6T\2\u0510\u00a1\3\2\2\2\u0511\u0513\5\u00a4S\2\u0512\u0511"+
		"\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\5\u0138\u009d"+
		"\2\u0515\u0517\5\u01e4\u00f3\2\u0516\u0518\5\u010c\u0087\2\u0517\u0516"+
		"\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051b\7\u0083\2"+
		"\2\u051a\u051c\5\u013e\u00a0\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2"+
		"\u051c\u051d\3\2\2\2\u051d\u051f\7\u0084\2\2\u051e\u0520\5\u0114\u008b"+
		"\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u00a3\3\2\2\2\u0521\u0523"+
		"\t\13\2\2\u0522\u0524\7\\\2\2\u0523\u0522\3\2\2\2\u0523\u0524\3\2\2\2"+
		"\u0524\u0528\3\2\2\2\u0525\u0526\7\\\2\2\u0526\u0528\t\13\2\2\u0527\u0521"+
		"\3\2\2\2\u0527\u0525\3\2\2\2\u0528\u00a5\3\2\2\2\u0529\u052f\5\u00ceh"+
		"\2\u052a\u052b\5\u01a0\u00d1\2\u052b\u052c\5N(\2\u052c\u052d\7\u0088\2"+
		"\2\u052d\u052f\3\2\2\2\u052e\u0529\3\2\2\2\u052e\u052a\3\2\2\2\u052f\u00a7"+
		"\3\2\2\2\u0530\u0531\5\u01e4\u00f3\2\u0531\u0532\7\u0087\2\2\u0532\u0533"+
		"\5\u009cO\2\u0533\u00a9\3\2\2\2\u0534\u053a\5\u00ceh\2\u0535\u053a\5\u00cc"+
		"g\2\u0536\u053a\5\u00b4[\2\u0537\u053a\5\u00b6\\\2\u0538\u053a\5\u00c6"+
		"d\2\u0539\u0534\3\2\2\2\u0539\u0535\3\2\2\2\u0539\u0536\3\2\2\2\u0539"+
		"\u0537\3\2\2\2\u0539\u0538\3\2\2\2\u053a\u00ab\3\2\2\2\u053b\u053c\7\66"+
		"\2\2\u053c\u053d\7\u0083\2\2\u053d\u053e\5\36\20\2\u053e\u053f\7\u0084"+
		"\2\2\u053f\u00ad\3\2\2\2\u0540\u0541\5\u00acW\2\u0541\u0544\5\u00dan\2"+
		"\u0542\u0543\7&\2\2\u0543\u0545\5\u00dan\2\u0544\u0542\3\2\2\2\u0544\u0545"+
		"\3\2\2\2\u0545\u00af\3\2\2\2\u0546\u0547\7_\2\2\u0547\u0548\7\u0083\2"+
		"\2\u0548\u0549\5\36\20\2\u0549\u054a\7\u0084\2\2\u054a\u00b1\3\2\2\2\u054b"+
		"\u054c\5\u00b0Y\2\u054c\u0550\7\177\2\2\u054d\u054f\5\u00dco\2\u054e\u054d"+
		"\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551"+
		"\u0553\3\2\2\2\u0552\u0550\3\2\2\2\u0553\u0554\7\u0080\2\2\u0554\u00b3"+
		"\3\2\2\2\u0555\u0558\5\u00aeX\2\u0556\u0558\5\u00b2Z\2\u0557\u0555\3\2"+
		"\2\2\u0557\u0556\3\2\2\2\u0558\u00b5\3\2\2\2\u0559\u055e\5\u00ba^\2\u055a"+
		"\u055e\5\u00bc_\2\u055b\u055e\5\u00c0a\2\u055c\u055e\5\u00c4c\2\u055d"+
		"\u0559\3\2\2\2\u055d\u055a\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055c\3\2"+
		"\2\2\u055e\u00b7\3\2\2\2\u055f\u0560\7r\2\2\u0560\u0561\7\u0083\2\2\u0561"+
		"\u0562\5\36\20\2\u0562\u0563\7\u0084\2\2\u0563\u00b9\3\2\2\2\u0564\u0565"+
		"\5\u00b8]\2\u0565\u0566\5\u00aaV\2\u0566\u00bb\3\2\2\2\u0567\u0568\7#"+
		"\2\2\u0568\u0569\5\u00aaV\2\u0569\u056a\7r\2\2\u056a\u056b\7\u0083\2\2"+
		"\u056b\u056c\5\36\20\2\u056c\u056d\7\u0084\2\2\u056d\u056e\7\u0088\2\2"+
		"\u056e\u00bd\3\2\2\2\u056f\u0570\7\60\2\2\u0570\u0572\7\u0083\2\2\u0571"+
		"\u0573\5\u00e4s\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574"+
		"\3\2\2\2\u0574\u0576\7\u0088\2\2\u0575\u0577\5\36\20\2\u0576\u0575\3\2"+
		"\2\2\u0576\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057a\7\u0088\2\2\u0579"+
		"\u057b\5\u00e6t\2\u057a\u0579\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c"+
		"\3\2\2\2\u057c\u057d\7\u0084\2\2\u057d\u00bf\3\2\2\2\u057e\u057f\5\u00be"+
		"`\2\u057f\u0580\5\u00aaV\2\u0580\u00c1\3\2\2\2\u0581\u0583\7\22\2\2\u0582"+
		"\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585\7\61"+
		"\2\2\u0585\u0586\7\u0083\2\2\u0586\u0587\5\u00d2j\2\u0587\u0588\5\u01e4"+
		"\u00f3\2\u0588\u0589\78\2\2\u0589\u058a\5\36\20\2\u058a\u058b\7\u0084"+
		"\2\2\u058b\u00c3\3\2\2\2\u058c\u058d\5\u00c2b\2\u058d\u058e\5\u00aaV\2"+
		"\u058e\u00c5\3\2\2\2\u058f\u0590\5\u00caf\2\u0590\u00c7\3\2\2\2\u0591"+
		"\u0592\7c\2\2\u0592\u00c9\3\2\2\2\u0593\u0594\5\u00c8e\2\u0594\u059a\5"+
		"\u00ceh\2\u0595\u0597\5\u00e8u\2\u0596\u0598\5\u00f2z\2\u0597\u0596\3"+
		"\2\2\2\u0597\u0598\3\2\2\2\u0598\u059b\3\2\2\2\u0599\u059b\5\u00f2z\2"+
		"\u059a\u0595\3\2\2\2\u059a\u0599\3\2\2\2\u059b\u00cb\3\2\2\2\u059c\u05d7"+
		"\7\u0088\2\2\u059d\u059e\5\36\20\2\u059e\u059f\7\u0088\2\2\u059f\u05d7"+
		"\3\2\2\2\u05a0\u05a1\7\25\2\2\u05a1\u05d7\7\u0088\2\2\u05a2\u05a3\7\36"+
		"\2\2\u05a3\u05d7\7\u0088\2\2\u05a4\u05a9\7\64\2\2\u05a5\u05aa\5\u01e4"+
		"\u00f3\2\u05a6\u05a7\7\30\2\2\u05a7\u05aa\5\36\20\2\u05a8\u05aa\7 \2\2"+
		"\u05a9\u05a5\3\2\2\2\u05a9\u05a6\3\2\2\2\u05a9\u05a8\3\2\2\2\u05aa\u05ab"+
		"\3\2\2\2\u05ab\u05d7\7\u0088\2\2\u05ac\u05ae\7T\2\2\u05ad\u05af\5\36\20"+
		"\2\u05ae\u05ad\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05d7"+
		"\7\u0088\2\2\u05b1\u05b3\7a\2\2\u05b2\u05b4\5\36\20\2\u05b3\u05b2\3\2"+
		"\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05d7\7\u0088\2\2\u05b6"+
		"\u05b7\7\33\2\2\u05b7\u05d7\5\u00ceh\2\u05b8\u05b9\7g\2\2\u05b9\u05d7"+
		"\5\u00ceh\2\u05ba\u05bb\7@\2\2\u05bb\u05bc\7\u0083\2\2\u05bc\u05bd\5\36"+
		"\20\2\u05bd\u05be\7\u0084\2\2\u05be\u05bf\5\u00aaV\2\u05bf\u05d7\3\2\2"+
		"\2\u05c0\u05c1\7k\2\2\u05c1\u05c2\7\u0083\2\2\u05c2\u05c3\5\u00f4{\2\u05c3"+
		"\u05c4\7\u0084\2\2\u05c4\u05c5\5\u00aaV\2\u05c5\u05d7\3\2\2\2\u05c6\u05ca"+
		"\7s\2\2\u05c7\u05c8\7T\2\2\u05c8\u05cb\5\36\20\2\u05c9\u05cb\7\25\2\2"+
		"\u05ca\u05c7\3\2\2\2\u05ca\u05c9\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05d7"+
		"\7\u0088\2\2\u05cd\u05ce\7i\2\2\u05ce\u05d7\5\u00ceh\2\u05cf\u05d0\7."+
		"\2\2\u05d0\u05d1\7\u0083\2\2\u05d1\u05d2\5\u0194\u00cb\2\u05d2\u05d3\5"+
		"\u0196\u00cc\2\u05d3\u05d4\7\u0084\2\2\u05d4\u05d5\5\u00aaV\2\u05d5\u05d7"+
		"\3\2\2\2\u05d6\u059c\3\2\2\2\u05d6\u059d\3\2\2\2\u05d6\u05a0\3\2\2\2\u05d6"+
		"\u05a2\3\2\2\2\u05d6\u05a4\3\2\2\2\u05d6\u05ac\3\2\2\2\u05d6\u05b1\3\2"+
		"\2\2\u05d6\u05b6\3\2\2\2\u05d6\u05b8\3\2\2\2\u05d6\u05ba\3\2\2\2\u05d6"+
		"\u05c0\3\2\2\2\u05d6\u05c6\3\2\2\2\u05d6\u05cd\3\2\2\2\u05d6\u05cf\3\2"+
		"\2\2\u05d7\u00cd\3\2\2\2\u05d8\u05da\7\177\2\2\u05d9\u05db\5\u00e2r\2"+
		"\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05dd"+
		"\7\u0080\2\2\u05dd\u00cf\3\2\2\2\u05de\u05e3\7k\2\2\u05df\u05e3\7R\2\2"+
		"\u05e0\u05e1\7R\2\2\u05e1\u05e3\7Q\2\2\u05e2\u05de\3\2\2\2\u05e2\u05df"+
		"\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4"+
		"\u05e5\5\u00d2j\2\u05e5\u05ea\5\u00d4k\2\u05e6\u05e7\7\u0086\2\2\u05e7"+
		"\u05e9\5\u00d4k\2\u05e8\u05e6\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8"+
		"\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05f2\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed"+
		"\u05ee\7.\2\2\u05ee\u05ef\5\u0194\u00cb\2\u05ef\u05f0\5\u0196\u00cc\2"+
		"\u05f0\u05f2\3\2\2\2\u05f1\u05e2\3\2\2\2\u05f1\u05ed\3\2\2\2\u05f2\u00d1"+
		"\3\2\2\2\u05f3\u05f6\7l\2\2\u05f4\u05f6\5\6\4\2\u05f5\u05f3\3\2\2\2\u05f5"+
		"\u05f4\3\2\2\2\u05f6\u00d3\3\2\2\2\u05f7\u05fd\5\u01e4\u00f3\2\u05f8\u05fa"+
		"\7\u0093\2\2\u05f9\u05fb\7R\2\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2"+
		"\2\u05fb\u05fc\3\2\2\2\u05fc\u05fe\5\u00d6l\2\u05fd\u05f8\3\2\2\2\u05fd"+
		"\u05fe\3\2\2\2\u05fe\u00d5\3\2\2\2\u05ff\u0603\5\36\20\2\u0600\u0603\5"+
		"\u016a\u00b6\2\u0601\u0603\5\u019e\u00d0\2\u0602\u05ff\3\2\2\2\u0602\u0600"+
		"\3\2\2\2\u0602\u0601\3\2\2\2\u0603\u00d7\3\2\2\2\u0604\u0605\7\35\2\2"+
		"\u0605\u0606\5\6\4\2\u0606\u0607\5\u012e\u0098\2\u0607\u00d9\3\2\2\2\u0608"+
		"\u060b\5\u00ceh\2\u0609\u060b\5\u00ccg\2\u060a\u0608\3\2\2\2\u060a\u0609"+
		"\3\2\2\2\u060b\u00db\3\2\2\2\u060c\u060e\5\u00dep\2\u060d\u060c\3\2\2"+
		"\2\u060e\u060f\3\2\2\2\u060f\u060d\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611"+
		"\3\2\2\2\u0611\u0612\5\u00e2r\2\u0612\u00dd\3\2\2\2\u0613\u0614\7\30\2"+
		"\2\u0614\u0616\5\36\20\2\u0615\u0617\5\u00e0q\2\u0616\u0615\3\2\2\2\u0616"+
		"\u0617\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\7\u0087\2\2\u0619\u061d"+
		"\3\2\2\2\u061a\u061b\7 \2\2\u061b\u061d\7\u0087\2\2\u061c\u0613\3\2\2"+
		"\2\u061c\u061a\3\2\2\2\u061d\u00df\3\2\2\2\u061e\u061f\7p\2\2\u061f\u0620"+
		"\5\36\20\2\u0620\u00e1\3\2\2\2\u0621\u0623\5\u009cO\2\u0622\u0621\3\2"+
		"\2\2\u0623\u0624\3\2\2\2\u0624\u0622\3\2\2\2\u0624\u0625\3\2\2\2\u0625"+
		"\u00e3\3\2\2\2\u0626\u0630\5\u00d0i\2\u0627\u062c\5\36\20\2\u0628\u0629"+
		"\7\u0086\2\2\u0629\u062b\5\36\20\2\u062a\u0628\3\2\2\2\u062b\u062e\3\2"+
		"\2\2\u062c\u062a\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u0630\3\2\2\2\u062e"+
		"\u062c\3\2\2\2\u062f\u0626\3\2\2\2\u062f\u0627\3\2\2\2\u0630\u00e5\3\2"+
		"\2\2\u0631\u0636\5\36\20\2\u0632\u0633\7\u0086\2\2\u0633\u0635\5\36\20"+
		"\2\u0634\u0632\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0636\u0637"+
		"\3\2\2\2\u0637\u00e7\3\2\2\2\u0638\u0636\3\2\2\2\u0639\u063d\5\u00eav"+
		"\2\u063a\u063c\5\u00eav\2\u063b\u063a\3\2\2\2\u063c\u063f\3\2\2\2\u063d"+
		"\u063b\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0641\3\2\2\2\u063f\u063d\3\2"+
		"\2\2\u0640\u0642\5\u00eex\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642"+
		"\u0646\3\2\2\2\u0643\u0646\5\u00eex\2\u0644\u0646\5\u00ecw\2\u0645\u0639"+
		"\3\2\2\2\u0645\u0643\3\2\2\2\u0645\u0644\3\2\2\2\u0646\u00e9\3\2\2\2\u0647"+
		"\u0649\5\u00ecw\2\u0648\u064a\5\u00f0y\2\u0649\u0648\3\2\2\2\u0649\u064a"+
		"\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064c\5\u00ceh\2\u064c\u00eb\3\2\2"+
		"\2\u064d\u064e\7\31\2\2\u064e\u064f\7\u0083\2\2\u064f\u0651\5\26\f\2\u0650"+
		"\u0652\5\u01e4\u00f3\2\u0651\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653"+
		"\3\2\2\2\u0653\u0654\7\u0084\2\2\u0654\u00ed\3\2\2\2\u0655\u0657\7\31"+
		"\2\2\u0656\u0658\5\u00f0y\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2\2\u0658"+
		"\u0659\3\2\2\2\u0659\u065a\5\u00ceh\2\u065a\u00ef\3\2\2\2\u065b\u065c"+
		"\7p\2\2\u065c\u065d\7\u0083\2\2\u065d\u065e\5\36\20\2\u065e\u065f\7\u0084"+
		"\2\2\u065f\u00f1\3\2\2\2\u0660\u0662\7-\2\2\u0661\u0663\5\u00ceh\2\u0662"+
		"\u0661\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u00f3\3\2\2\2\u0664\u0667\5\u00d0"+
		"i\2\u0665\u0667\5\36\20\2\u0666\u0664\3\2\2\2\u0666\u0665\3\2\2\2\u0667"+
		"\u00f5\3\2\2\2\u0668\u0669\7C\2\2\u0669\u066a\5\u00f8}\2\u066a\u066c\5"+
		"\u00fa~\2\u066b\u066d\7\u0088\2\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2"+
		"\2\2\u066d\u00f7\3\2\2\2\u066e\u0673\5\u01e4\u00f3\2\u066f\u0670\7\u0085"+
		"\2\2\u0670\u0672\5\u01e4\u00f3\2\u0671\u066f\3\2\2\2\u0672\u0675\3\2\2"+
		"\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u00f9\3\2\2\2\u0675\u0673"+
		"\3\2\2\2\u0676\u0678\7\177\2\2\u0677\u0679\5\u00fc\177\2\u0678\u0677\3"+
		"\2\2\2\u0678\u0679\3\2\2\2\u0679\u067b\3\2\2\2\u067a\u067c\5\u0100\u0081"+
		"\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\3\2\2\2\u067d\u067f"+
		"\5\u0104\u0083\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\3"+
		"\2\2\2\u0680\u0681\7\u0080\2\2\u0681\u00fb\3\2\2\2\u0682\u0684\5\u00fe"+
		"\u0080\2\u0683\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0683\3\2\2\2\u0685"+
		"\u0686\3\2\2\2\u0686\u00fd\3\2\2\2\u0687\u0688\7+\2\2\u0688\u0689\7\r"+
		"\2\2\u0689\u068a\5\u01e4\u00f3\2\u068a\u068b\7\u0088\2\2\u068b\u00ff\3"+
		"\2\2\2\u068c\u068e\5\u0102\u0082\2\u068d\u068c\3\2\2\2\u068e\u068f\3\2"+
		"\2\2\u068f\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0101\3\2\2\2\u0691"+
		"\u0692\7k\2\2\u0692\u0693\5\u01e4\u00f3\2\u0693\u0694\7\u0093\2\2\u0694"+
		"\u0695\5\4\3\2\u0695\u0696\7\u0088\2\2\u0696\u06a1\3\2\2\2\u0697\u0698"+
		"\7k\2\2\u0698\u0699\5\4\3\2\u0699\u069a\7\u0088\2\2\u069a\u06a1\3\2\2"+
		"\2\u069b\u069c\7k\2\2\u069c\u069d\7\\\2\2\u069d\u069e\5\4\3\2\u069e\u069f"+
		"\7\u0088\2\2\u069f\u06a1\3\2\2\2\u06a0\u0691\3\2\2\2\u06a0\u0697\3\2\2"+
		"\2\u06a0\u069b\3\2\2\2\u06a1\u0103\3\2\2\2\u06a2\u06a4\5\u0106\u0084\2"+
		"\u06a3\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a5\u06a6"+
		"\3\2\2\2\u06a6\u0105\3\2\2\2\u06a7\u06aa\5\u00f6|\2\u06a8\u06aa\5\u0108"+
		"\u0085\2\u06a9\u06a7\3\2\2\2\u06a9\u06a8\3\2\2\2\u06aa\u0107\3\2\2\2\u06ab"+
		"\u06ad\5\u0188\u00c5\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06af"+
		"\3\2\2\2\u06ae\u06b0\5\u0126\u0094\2\u06af\u06ae\3\2\2\2\u06af\u06b0\3"+
		"\2\2\2\u06b0\u06b6\3\2\2\2\u06b1\u06b7\5\u01ba\u00de\2\u06b2\u06b7\5\u01be"+
		"\u00e0\2\u06b3\u06b7\5\u01c0\u00e1\2\u06b4\u06b7\5\u01c2\u00e2\2\u06b5"+
		"\u06b7\5\u01c4\u00e3\2\u06b6\u06b1\3\2\2\2\u06b6\u06b2\3\2\2\2\u06b6\u06b3"+
		"\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b6\u06b5\3\2\2\2\u06b7\u0109\3\2\2\2\u06b8"+
		"\u06b9\5\u01e4\u00f3\2\u06b9\u06ba\7\u0097\2\2\u06ba\u06bc\5\u01e4\u00f3"+
		"\2\u06bb\u06bd\5\30\r\2\u06bc\u06bb\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd"+
		"\u010b\3\2\2\2\u06be\u06bf\7\u0094\2\2\u06bf\u06c4\5\u010e\u0088\2\u06c0"+
		"\u06c1\7\u0086\2\2\u06c1\u06c3\5\u010e\u0088\2\u06c2\u06c0\3\2\2\2\u06c3"+
		"\u06c6\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c7\3\2"+
		"\2\2\u06c6\u06c4\3\2\2\2\u06c7\u06c8\7\u0095\2\2\u06c8\u010d\3\2\2\2\u06c9"+
		"\u06cb\5\u0188\u00c5\2\u06ca\u06c9\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cc"+
		"\3\2\2\2\u06cc\u06cd\5\u01e4\u00f3\2\u06cd\u010f\3\2\2\2\u06ce\u06cf\7"+
		"\u0087\2\2\u06cf\u06d4\5\26\f\2\u06d0\u06d1\7\u0086\2\2\u06d1\u06d3\5"+
		"\4\3\2\u06d2\u06d0\3\2\2\2\u06d3\u06d6\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d4"+
		"\u06d5\3\2\2\2\u06d5\u0111\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d7\u06dc\5\4"+
		"\3\2\u06d8\u06d9\7\u0086\2\2\u06d9\u06db\5\4\3\2\u06da\u06d8\3\2\2\2\u06db"+
		"\u06de\3\2\2\2\u06dc\u06da\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u0113\3\2"+
		"\2\2\u06de\u06dc\3\2\2\2\u06df\u06e1\5\u0116\u008c\2\u06e0\u06df\3\2\2"+
		"\2\u06e1\u06e2\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u0115"+
		"\3\2\2\2\u06e4\u06e5\7q\2\2\u06e5\u06e6\5\u01e4\u00f3\2\u06e6\u06e7\7"+
		"\u0087\2\2\u06e7\u06e8\5\u0118\u008d\2\u06e8\u0117\3\2\2\2\u06e9\u06f4"+
		"\5\u011e\u0090\2\u06ea\u06ed\5\u011a\u008e\2\u06eb\u06ec\7\u0086\2\2\u06ec"+
		"\u06ee\5\u011c\u008f\2\u06ed\u06eb\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f1"+
		"\3\2\2\2\u06ef\u06f0\7\u0086\2\2\u06f0\u06f2\5\u011e\u0090\2\u06f1\u06ef"+
		"\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06e9\3\2\2\2\u06f3"+
		"\u06ea\3\2\2\2\u06f4\u0119\3\2\2\2\u06f5\u06fd\5\26\f\2\u06f6\u06f8\7"+
		"\34\2\2\u06f7\u06f9\7\u0096\2\2\u06f8\u06f7\3\2\2\2\u06f8\u06f9\3\2\2"+
		"\2\u06f9\u06fd\3\2\2\2\u06fa\u06fd\7^\2\2\u06fb\u06fd\7h\2\2\u06fc\u06f5"+
		"\3\2\2\2\u06fc\u06f6\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fc\u06fb\3\2\2\2\u06fd"+
		"\u011b\3\2\2\2\u06fe\u0703\5\4\3\2\u06ff\u0700\7\u0086\2\2\u0700\u0702"+
		"\5\4\3\2\u0701\u06ff\3\2\2\2\u0702\u0705\3\2\2\2\u0703\u0701\3\2\2\2\u0703"+
		"\u0704\3\2\2\2\u0704\u011d\3\2\2\2\u0705\u0703\3\2\2\2\u0706\u0707\7D"+
		"\2\2\u0707\u0708\7\u0083\2\2\u0708\u0709\7\u0084\2\2\u0709\u011f\3\2\2"+
		"\2\u070a\u070c\7\177\2\2\u070b\u070d\5\u0122\u0092\2\u070c\u070b\3\2\2"+
		"\2\u070c\u070d\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\7\u0080\2\2\u070f"+
		"\u0121\3\2\2\2\u0710\u0712\5\u0124\u0093\2\u0711\u0710\3\2\2\2\u0712\u0713"+
		"\3\2\2\2\u0713\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0123\3\2\2\2\u0715"+
		"\u0717\5\u0188\u00c5\2\u0716\u0715\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u0719"+
		"\3\2\2\2\u0718\u071a\5\u0126\u0094\2\u0719\u0718\3\2\2\2\u0719\u071a\3"+
		"\2\2\2\u071a\u071d\3\2\2\2\u071b\u071e\5\u012a\u0096\2\u071c\u071e\5\u01d0"+
		"\u00e9\2\u071d\u071b\3\2\2\2\u071d\u071c\3\2\2\2\u071e\u0125\3\2\2\2\u071f"+
		"\u0721\5\u0128\u0095\2\u0720\u071f\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0720"+
		"\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0127\3\2\2\2\u0724\u0725\t\f\2\2\u0725"+
		"\u0129\3\2\2\2\u0726\u073a\5\u01cc\u00e7\2\u0727\u073a\5\u012c\u0097\2"+
		"\u0728\u073a\5\u01c6\u00e4\2\u0729\u072f\5\u015a\u00ae\2\u072a\u0730\5"+
		"\u015e\u00b0\2\u072b\u072c\5\u01a0\u00d1\2\u072c\u072d\5N(\2\u072d\u072e"+
		"\7\u0088\2\2\u072e\u0730\3\2\2\2\u072f\u072a\3\2\2\2\u072f\u072b\3\2\2"+
		"\2\u0730\u073a\3\2\2\2\u0731\u073a\5\u01d2\u00ea\2\u0732\u0733\7n\2\2"+
		"\u0733\u073a\5\u01d6\u00ec\2\u0734\u073a\5\u01b8\u00dd\2\u0735\u073a\5"+
		"\u01be\u00e0\2\u0736\u073a\5\u01c0\u00e1\2\u0737\u073a\5\u01c2\u00e2\2"+
		"\u0738\u073a\5\u01c4\u00e3\2\u0739\u0726\3\2\2\2\u0739\u0727\3\2\2\2\u0739"+
		"\u0728\3\2\2\2\u0739\u0729\3\2\2\2\u0739\u0731\3\2\2\2\u0739\u0732\3\2"+
		"\2\2\u0739\u0734\3\2\2\2\u0739\u0735\3\2\2\2\u0739\u0736\3\2\2\2\u0739"+
		"\u0737\3\2\2\2\u0739\u0738\3\2\2\2\u073a\u012b\3\2\2\2\u073b\u0741\7R"+
		"\2\2\u073c\u073d\7Q\2\2\u073d\u0741\7R\2\2\u073e\u073f\7R\2\2\u073f\u0741"+
		"\7Q\2\2\u0740\u073b\3\2\2\2\u0740\u073c\3\2\2\2\u0740\u073e\3\2\2\2\u0740"+
		"\u0741\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u074c\5\6\4\2\u0743\u0744\5\4"+
		"\3\2\u0744\u0745\7\u0085\2\2\u0745\u0746\5\u01ce\u00e8\2\u0746\u074d\3"+
		"\2\2\2\u0747\u074d\5\u01d4\u00eb\2\u0748\u074d\5\u01ca\u00e6\2\u0749\u074d"+
		"\5\u01ce\u00e8\2\u074a\u074d\5\u01dc\u00ef\2\u074b\u074d\5\u01c8\u00e5"+
		"\2\u074c\u0743\3\2\2\2\u074c\u0747\3\2\2\2\u074c\u0748\3\2\2\2\u074c\u0749"+
		"\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074b\3\2\2\2\u074d\u012d\3\2\2\2\u074e"+
		"\u0753\5\u0130\u0099\2\u074f\u0750\7\u0086\2\2\u0750\u0752\5\u0130\u0099"+
		"\2\u0751\u074f\3\2\2\2\u0752\u0755\3\2\2\2\u0753\u0751\3\2\2\2\u0753\u0754"+
		"\3\2\2\2\u0754\u012f\3\2\2\2\u0755\u0753\3\2\2\2\u0756\u0757\5\u01e4\u00f3"+
		"\2\u0757\u0758\7\u0093\2\2\u0758\u0759\5\36\20\2\u0759\u0131\3\2\2\2\u075a"+
		"\u075f\5\u0134\u009b\2\u075b\u075c\7\u0086\2\2\u075c\u075e\5\u0134\u009b"+
		"\2\u075d\u075b\3\2\2\2\u075e\u0761\3\2\2\2\u075f\u075d\3\2\2\2\u075f\u0760"+
		"\3\2\2\2\u0760\u0133\3\2\2\2\u0761\u075f\3\2\2\2\u0762\u0765\5\u01e4\u00f3"+
		"\2\u0763\u0764\7\u0093\2\2\u0764\u0766\5\u0136\u009c\2\u0765\u0763\3\2"+
		"\2\2\u0765\u0766\3\2\2\2\u0766\u0135\3\2\2\2\u0767\u076a\5\36\20\2\u0768"+
		"\u076a\5\u016a\u00b6\2\u0769\u0767\3\2\2\2\u0769\u0768\3\2\2\2\u076a\u0137"+
		"\3\2\2\2\u076b\u076e\5\6\4\2\u076c\u076e\7n\2\2\u076d\u076b\3\2\2\2\u076d"+
		"\u076c\3\2\2\2\u076e\u0139\3\2\2\2\u076f\u0770\5\4\3\2\u0770\u013b\3\2"+
		"\2\2\u0771\u0774\5\u00ceh\2\u0772\u0774\7\u0088\2\2\u0773\u0771\3\2\2"+
		"\2\u0773\u0772\3\2\2\2\u0774\u013d\3\2\2\2\u0775\u077c\5\u0146\u00a4\2"+
		"\u0776\u0779\5\u0140\u00a1\2\u0777\u0778\7\u0086\2\2\u0778\u077a\5\u0146"+
		"\u00a4\2\u0779\u0777\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077c\3\2\2\2\u077b"+
		"\u0775\3\2\2\2\u077b\u0776\3\2\2\2\u077c\u013f\3\2\2\2\u077d\u0782\5\u0142"+
		"\u00a2\2\u077e\u077f\7\u0086\2\2\u077f\u0781\5\u0142\u00a2\2\u0780\u077e"+
		"\3\2\2\2\u0781\u0784\3\2\2\2\u0782\u0780\3\2\2\2\u0782\u0783\3\2\2\2\u0783"+
		"\u0141\3\2\2\2\u0784\u0782\3\2\2\2\u0785\u0787\5\u0188\u00c5\2\u0786\u0785"+
		"\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0789\3\2\2\2\u0788\u078a\5\u0144\u00a3"+
		"\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u078e"+
		"\5\u01de\u00f0\2\u078c\u078e\7\16\2\2\u078d\u0786\3\2\2\2\u078d\u078c"+
		"\3\2\2\2\u078e\u0143\3\2\2\2\u078f\u0798\7R\2\2\u0790\u0798\7J\2\2\u0791"+
		"\u0798\78\2\2\u0792\u0793\7R\2\2\u0793\u0798\7`\2\2\u0794\u0795\78\2\2"+
		"\u0795\u0798\7`\2\2\u0796\u0798\7`\2\2\u0797\u078f\3\2\2\2\u0797\u0790"+
		"\3\2\2\2\u0797\u0791\3\2\2\2\u0797\u0792\3\2\2\2\u0797\u0794\3\2\2\2\u0797"+
		"\u0796\3\2\2\2\u0798\u0145\3\2\2\2\u0799\u079b\5\u0188\u00c5\2\u079a\u0799"+
		"\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079d\7L\2\2\u079d"+
		"\u079e\5\u0166\u00b4\2\u079e\u079f\5\u01e4\u00f3\2\u079f\u0147\3\2\2\2"+
		"\u07a0\u07a2\5\u0188\u00c5\2\u07a1\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2"+
		"\u07a4\3\2\2\2\u07a3\u07a5\5\u014e\u00a8\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5"+
		"\3\2\2\2\u07a5\u07b0\3\2\2\2\u07a6\u07a7\7\63\2\2\u07a7\u07a9\5\u0150"+
		"\u00a9\2\u07a8\u07aa\5\u014c\u00a7\2\u07a9\u07a8\3\2\2\2\u07a9\u07aa\3"+
		"\2\2\2\u07aa\u07b1\3\2\2\2\u07ab\u07ac\7X\2\2\u07ac\u07ae\5\u0150\u00a9"+
		"\2\u07ad\u07af\5\u014a\u00a6\2\u07ae\u07ad\3\2\2\2\u07ae\u07af\3\2\2\2"+
		"\u07af\u07b1\3\2\2\2\u07b0\u07a6\3\2\2\2\u07b0\u07ab\3\2\2\2\u07b1\u0149"+
		"\3\2\2\2\u07b2\u07b4\5\u0188\u00c5\2\u07b3\u07b2\3\2\2\2\u07b3\u07b4\3"+
		"\2\2\2\u07b4\u07b6\3\2\2\2\u07b5\u07b7\5\u014e\u00a8\2\u07b6\u07b5\3\2"+
		"\2\2\u07b6\u07b7\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07b9\7\63\2\2\u07b9"+
		"\u07ba\5\u0150\u00a9\2\u07ba\u014b\3\2\2\2\u07bb\u07bd\5\u0188\u00c5\2"+
		"\u07bc\u07bb\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07bf\3\2\2\2\u07be\u07c0"+
		"\5\u014e\u00a8\2\u07bf\u07be\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u07c1\3"+
		"\2\2\2\u07c1\u07c2\7X\2\2\u07c2\u07c3\5\u0150\u00a9\2\u07c3\u014d\3\2"+
		"\2\2\u07c4\u07cc\7O\2\2\u07c5\u07cc\7;\2\2\u07c6\u07cc\7N\2\2\u07c7\u07c8"+
		"\7O\2\2\u07c8\u07cc\7;\2\2\u07c9\u07ca\7;\2\2\u07ca\u07cc\7O\2\2\u07cb"+
		"\u07c4\3\2\2\2\u07cb\u07c5\3\2\2\2\u07cb\u07c6\3\2\2\2\u07cb\u07c7\3\2"+
		"\2\2\u07cb\u07c9\3\2\2\2\u07cc\u014f\3\2\2\2\u07cd\u07d0\5\u00ceh\2\u07ce"+
		"\u07d0\7\u0088\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07ce\3\2\2\2\u07d0\u0151"+
		"\3\2\2\2\u07d1\u07d3\5\u0188\u00c5\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3"+
		"\2\2\2\u07d3\u07dc\3\2\2\2\u07d4\u07d5\7\f\2\2\u07d5\u07d6\5\u00ceh\2"+
		"\u07d6\u07d7\5\u0156\u00ac\2\u07d7\u07dd\3\2\2\2\u07d8\u07d9\7S\2\2\u07d9"+
		"\u07da\5\u00ceh\2\u07da\u07db\5\u0154\u00ab\2\u07db\u07dd\3\2\2\2\u07dc"+
		"\u07d4\3\2\2\2\u07dc\u07d8\3\2\2\2\u07dd\u0153\3\2\2\2\u07de\u07e0\5\u0188"+
		"\u00c5\2\u07df\u07de\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1"+
		"\u07e2\7\f\2\2\u07e2\u07e3\5\u00ceh\2\u07e3\u0155\3\2\2\2\u07e4\u07e6"+
		"\5\u0188\u00c5\2\u07e5\u07e4\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\3"+
		"\2\2\2\u07e7\u07e8\7S\2\2\u07e8\u07e9\5\u00ceh\2\u07e9\u0157\3\2\2\2\u07ea"+
		"\u0801\7\u0089\2\2\u07eb\u0801\7\u008a\2\2\u07ec\u0801\7\u0091\2\2\u07ed"+
		"\u0801\7\u0092\2\2\u07ee\u0801\7\u0099\2\2\u07ef\u0801\7\u009a\2\2\u07f0"+
		"\u0801\7b\2\2\u07f1\u0801\7,\2\2\u07f2\u0801\7\u008b\2\2\u07f3\u0801\7"+
		"\u008c\2\2\u07f4\u0801\7\u008d\2\2\u07f5\u0801\7\u008e\2\2\u07f6\u0801"+
		"\7\u008f\2\2\u07f7\u0801\7\u0090\2\2\u07f8\u0801\7\u00aa\2\2\u07f9\u0801"+
		"\5\u01a2\u00d2\2\u07fa\u0801\7\u009e\2\2\u07fb\u0801\7\u009f\2\2\u07fc"+
		"\u0801\7\u0095\2\2\u07fd\u0801\7\u0094\2\2\u07fe\u0801\7\u00a1\2\2\u07ff"+
		"\u0801\7\u00a0\2\2\u0800\u07ea\3\2\2\2\u0800\u07eb\3\2\2\2\u0800\u07ec"+
		"\3\2\2\2\u0800\u07ed\3\2\2\2\u0800\u07ee\3\2\2\2\u0800\u07ef\3\2\2\2\u0800"+
		"\u07f0\3\2\2\2\u0800\u07f1\3\2\2\2\u0800\u07f2\3\2\2\2\u0800\u07f3\3\2"+
		"\2\2\u0800\u07f4\3\2\2\2\u0800\u07f5\3\2\2\2\u0800\u07f6\3\2\2\2\u0800"+
		"\u07f7\3\2\2\2\u0800\u07f8\3\2\2\2\u0800\u07f9\3\2\2\2\u0800\u07fa\3\2"+
		"\2\2\u0800\u07fb\3\2\2\2\u0800\u07fc\3\2\2\2\u0800\u07fd\3\2\2\2\u0800"+
		"\u07fe\3\2\2\2\u0800\u07ff\3\2\2\2\u0801\u0159\3\2\2\2\u0802\u0803\t\r"+
		"\2\2\u0803\u0804\7H\2\2\u0804\u0805\5\6\4\2\u0805\u0806\7\u0083\2\2\u0806"+
		"\u0807\5\u01de\u00f0\2\u0807\u0808\7\u0084\2\2\u0808\u015b\3\2\2\2\u0809"+
		"\u080a\7\u0087\2\2\u080a\u080b\t\16\2\2\u080b\u080d\7\u0083\2\2\u080c"+
		"\u080e\5\32\16\2\u080d\u080c\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u080f\3"+
		"\2\2\2\u080f\u0810\7\u0084\2\2\u0810\u015d\3\2\2\2\u0811\u0814\5\u00ce"+
		"h\2\u0812\u0814\7\u0088\2\2\u0813\u0811\3\2\2\2\u0813\u0812\3\2\2\2\u0814"+
		"\u015f\3\2\2\2\u0815\u0816\7\u0087\2\2\u0816\u0817\5\u0112\u008a\2\u0817"+
		"\u0161\3\2\2\2\u0818\u081c\7\177\2\2\u0819\u081b\5\u0164\u00b3\2\u081a"+
		"\u0819\3\2\2\2\u081b\u081e\3\2\2\2\u081c\u081a\3\2\2\2\u081c\u081d\3\2"+
		"\2\2\u081d\u081f\3\2\2\2\u081e\u081c\3\2\2\2\u081f\u0820\7\u0080\2\2\u0820"+
		"\u0163\3\2\2\2\u0821\u0823\5\u0188\u00c5\2\u0822\u0821\3\2\2\2\u0822\u0823"+
		"\3\2\2\2\u0823\u0825\3\2\2\2\u0824\u0826\5\u0126\u0094\2\u0825\u0824\3"+
		"\2\2\2\u0825\u0826\3\2\2\2\u0826\u0831\3\2\2\2\u0827\u0832\5\u012a\u0096"+
		"\2\u0828\u0829\7.\2\2\u0829\u082b\5\6\4\2\u082a\u082c\5\u019c\u00cf\2"+
		"\u082b\u082a\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u082b\3\2\2\2\u082d\u082e"+
		"\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0830\7\u0088\2\2\u0830\u0832\3\2\2"+
		"\2\u0831\u0827\3\2\2\2\u0831\u0828\3\2\2\2\u0832\u0165\3\2\2\2\u0833\u083b"+
		"\5\b\5\2\u0834\u0836\t\17\2\2\u0835\u0834\3\2\2\2\u0836\u0839\3\2\2\2"+
		"\u0837\u0835\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u083a\3\2\2\2\u0839\u0837"+
		"\3\2\2\2\u083a\u083c\5\u0168\u00b5\2\u083b\u0837\3\2\2\2\u083c\u083d\3"+
		"\2\2\2\u083d\u083b\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u0167\3\2\2\2\u083f"+
		"\u0843\7\u0081\2\2\u0840\u0842\7\u0086\2\2\u0841\u0840\3\2\2\2\u0842\u0845"+
		"\3\2\2\2\u0843\u0841\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0846\3\2\2\2\u0845"+
		"\u0843\3\2\2\2\u0846\u0847\7\u0082\2\2\u0847\u0169\3\2\2\2\u0848\u0854"+
		"\7\177\2\2\u0849\u084e\5\u0136\u009c\2\u084a\u084b\7\u0086\2\2\u084b\u084d"+
		"\5\u0136\u009c\2\u084c\u084a\3\2\2\2\u084d\u0850\3\2\2\2\u084e\u084c\3"+
		"\2\2\2\u084e\u084f\3\2\2\2\u084f\u0852\3\2\2\2\u0850\u084e\3\2\2\2\u0851"+
		"\u0853\7\u0086\2\2\u0852\u0851\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0855"+
		"\3\2\2\2\u0854\u0849\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856\3\2\2\2\u0856"+
		"\u0857\7\u0080\2\2\u0857\u016b\3\2\2\2\u0858\u0859\7\u0094\2\2\u0859\u085e"+
		"\5\u016e\u00b8\2\u085a\u085b\7\u0086\2\2\u085b\u085d\5\u016e\u00b8\2\u085c"+
		"\u085a\3\2\2\2\u085d\u0860\3\2\2\2\u085e\u085c\3\2\2\2\u085e\u085f\3\2"+
		"\2\2\u085f\u0861\3\2\2\2\u0860\u085e\3\2\2\2\u0861\u0862\7\u0095\2\2\u0862"+
		"\u016d\3\2\2\2\u0863\u0865\5\u0188\u00c5\2\u0864\u0863\3\2\2\2\u0864\u0865"+
		"\3\2\2\2\u0865\u0867\3\2\2\2\u0866\u0868\5\u0170\u00b9\2\u0867\u0866\3"+
		"\2\2\2\u0867\u0868\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086a\5\u01e4\u00f3"+
		"\2\u086a\u016f\3\2\2\2\u086b\u086c\t\20\2\2\u086c\u0171\3\2\2\2\u086d"+
		"\u086e\7:\2\2\u086e\u086f\5\u01e4\u00f3\2\u086f\u0173\3\2\2\2\u0870\u0871"+
		"\7\u0087\2\2\u0871\u0872\5\u0112\u008a\2\u0872\u0175\3\2\2\2\u0873\u0877"+
		"\7\177\2\2\u0874\u0876\5\u0178\u00bd\2\u0875\u0874\3\2\2\2\u0876\u0879"+
		"\3\2\2\2\u0877\u0875\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u087a\3\2\2\2\u0879"+
		"\u0877\3\2\2\2\u087a\u087b\7\u0080\2\2\u087b\u0177\3\2\2\2\u087c\u087e"+
		"\5\u0188\u00c5\2\u087d\u087c\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u0880\3"+
		"\2\2\2\u087f\u0881\7D\2\2\u0880\u087f\3\2\2\2\u0880\u0881\3\2\2\2\u0881"+
		"\u08c1\3\2\2\2\u0882\u0884\7i\2\2\u0883\u0882\3\2\2\2\u0883\u0884\3\2"+
		"\2\2\u0884\u088a\3\2\2\2\u0885\u088b\7R\2\2\u0886\u0887\7R\2\2\u0887\u088b"+
		"\7Q\2\2\u0888\u0889\7Q\2\2\u0889\u088b\7R\2\2\u088a\u0885\3\2\2\2\u088a"+
		"\u0886\3\2\2\2\u088a\u0888\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088c\3\2"+
		"\2\2\u088c\u08a8\5\6\4\2\u088d\u088f\5\u01e4\u00f3\2\u088e\u0890\5\u010c"+
		"\u0087\2\u088f\u088e\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0891\3\2\2\2\u0891"+
		"\u0893\7\u0083\2\2\u0892\u0894\5\u013e\u00a0\2\u0893\u0892\3\2\2\2\u0893"+
		"\u0894\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0897\7\u0084\2\2\u0896\u0898"+
		"\5\u0114\u008b\2\u0897\u0896\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u0899\3"+
		"\2\2\2\u0899\u089a\7\u0088\2\2\u089a\u08a9\3\2\2\2\u089b\u089c\5\u01e4"+
		"\u00f3\2\u089c\u089d\7\177\2\2\u089d\u089e\5\u017a\u00be\2\u089e\u089f"+
		"\7\u0080\2\2\u089f\u08a9\3\2\2\2\u08a0\u08a1\7`\2\2\u08a1\u08a2\7\u0081"+
		"\2\2\u08a2\u08a3\5\u013e\u00a0\2\u08a3\u08a4\7\u0082\2\2\u08a4\u08a5\7"+
		"\177\2\2\u08a5\u08a6\5\u017a\u00be\2\u08a6\u08a7\7\u0080\2\2\u08a7\u08a9"+
		"\3\2\2\2\u08a8\u088d\3\2\2\2\u08a8\u089b\3\2\2\2\u08a8\u08a0\3\2\2\2\u08a9"+
		"\u08c2\3\2\2\2\u08aa\u08ac\7i\2\2\u08ab\u08aa\3\2\2\2\u08ab\u08ac\3\2"+
		"\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08ae\7n\2\2\u08ae\u08b0\5\u01e4\u00f3"+
		"\2\u08af\u08b1\5\u010c\u0087\2\u08b0\u08af\3\2\2\2\u08b0\u08b1\3\2\2\2"+
		"\u08b1\u08b2\3\2\2\2\u08b2\u08b4\7\u0083\2\2\u08b3\u08b5\5\u013e\u00a0"+
		"\2\u08b4\u08b3\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b8"+
		"\7\u0084\2\2\u08b7\u08b9\5\u0114\u008b\2\u08b8\u08b7\3\2\2\2\u08b8\u08b9"+
		"\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bb\7\u0088\2\2\u08bb\u08c2\3\2\2"+
		"\2\u08bc\u08bd\7)\2\2\u08bd\u08be\5\6\4\2\u08be\u08bf\5\u01e4\u00f3\2"+
		"\u08bf\u08c0\7\u0088\2\2\u08c0\u08c2\3\2\2\2\u08c1\u0883\3\2\2\2\u08c1"+
		"\u08ab\3\2\2\2\u08c1\u08bc\3\2\2\2\u08c2\u0179\3\2\2\2\u08c3\u08c5\5\u0188"+
		"\u00c5\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08d8\3\2\2\2\u08c6"+
		"\u08c7\7\63\2\2\u08c7\u08cd\7\u0088\2\2\u08c8\u08ca\5\u0188\u00c5\2\u08c9"+
		"\u08c8\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08cc\7X"+
		"\2\2\u08cc\u08ce\7\u0088\2\2\u08cd\u08c9\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce"+
		"\u08d9\3\2\2\2\u08cf\u08d0\7X\2\2\u08d0\u08d6\7\u0088\2\2\u08d1\u08d3"+
		"\5\u0188\u00c5\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08d4\3"+
		"\2\2\2\u08d4\u08d5\7\63\2\2\u08d5\u08d7\7\u0088\2\2\u08d6\u08d2\3\2\2"+
		"\2\u08d6\u08d7\3\2\2\2\u08d7\u08d9\3\2\2\2\u08d8\u08c6\3\2\2\2\u08d8\u08cf"+
		"\3\2\2\2\u08d9\u017b\3\2\2\2\u08da\u08db\7\u0087\2\2\u08db\u08dc\5\6\4"+
		"\2\u08dc\u017d\3\2\2\2\u08dd\u08e9\7\177\2\2\u08de\u08e3\5\u0180\u00c1"+
		"\2\u08df\u08e0\7\u0086\2\2\u08e0\u08e2\5\u0180\u00c1\2\u08e1\u08df\3\2"+
		"\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4"+
		"\u08e7\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6\u08e8\7\u0086\2\2\u08e7\u08e6"+
		"\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08ea\3\2\2\2\u08e9\u08de\3\2\2\2\u08e9"+
		"\u08ea\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ec\7\u0080\2\2\u08ec\u017f"+
		"\3\2\2\2\u08ed\u08ef\5\u0188\u00c5\2\u08ee\u08ed\3\2\2\2\u08ee\u08ef\3"+
		"\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f3\5\u01e4\u00f3\2\u08f1\u08f2\7\u0093"+
		"\2\2\u08f2\u08f4\5\36\20\2\u08f3\u08f1\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4"+
		"\u0181\3\2\2\2\u08f5\u08f6\7\'\2\2\u08f6\u08f7\5\u01e4\u00f3\2\u08f7\u0183"+
		"\3\2\2\2\u08f8\u08f9\7\u0081\2\2\u08f9\u08fa\5\u0186\u00c4\2\u08fa\u08fb"+
		"\7\u0087\2\2\u08fb\u08fd\5\u018e\u00c8\2\u08fc\u08fe\7\u0086\2\2\u08fd"+
		"\u08fc\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0900\7\u0082"+
		"\2\2\u0900\u0185\3\2\2\2\u0901\u0904\5\u01b6\u00dc\2\u0902\u0904\5\u01e4"+
		"\u00f3\2\u0903\u0901\3\2\2\2\u0903\u0902\3\2\2\2\u0904\u0187\3\2\2\2\u0905"+
		"\u0907\5\u018a\u00c6\2\u0906\u0905\3\2\2\2\u0907\u0908\3\2\2\2\u0908\u0906"+
		"\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u0189\3\2\2\2\u090a\u090e\7\u0081\2"+
		"\2\u090b\u090c\5\u018c\u00c7\2\u090c\u090d\7\u0087\2\2\u090d\u090f\3\2"+
		"\2\2\u090e\u090b\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0910\3\2\2\2\u0910"+
		"\u0912\5\u018e\u00c8\2\u0911\u0913\7\u0086\2\2\u0912\u0911\3\2\2\2\u0912"+
		"\u0913\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0915\7\u0082\2\2\u0915\u018b"+
		"\3\2\2\2\u0916\u0919\5\u01b6\u00dc\2\u0917\u0919\5\u01e4\u00f3\2\u0918"+
		"\u0916\3\2\2\2\u0918\u0917\3\2\2\2\u0919\u018d\3\2\2\2\u091a\u091f\5\u0190"+
		"\u00c9\2\u091b\u091c\7\u0086\2\2\u091c\u091e\5\u0190\u00c9\2\u091d\u091b"+
		"\3\2\2\2\u091e\u0921\3\2\2\2\u091f\u091d\3\2\2\2\u091f\u0920\3\2\2\2\u0920"+
		"\u018f\3\2\2\2\u0921\u091f\3\2\2\2\u0922\u092f\5\4\3\2\u0923\u092c\7\u0083"+
		"\2\2\u0924\u0929\5\u0192\u00ca\2\u0925\u0926\7\u0086\2\2\u0926\u0928\5"+
		"\u0192\u00ca\2\u0927\u0925\3\2\2\2\u0928\u092b\3\2\2\2\u0929\u0927\3\2"+
		"\2\2\u0929\u092a\3\2\2\2\u092a\u092d\3\2\2\2\u092b\u0929\3\2\2\2\u092c"+
		"\u0924\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u0930\7\u0084"+
		"\2\2\u092f\u0923\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0191\3\2\2\2\u0931"+
		"\u0932\5\u01e4\u00f3\2\u0932\u0933\7\u0087\2\2\u0933\u0935\3\2\2\2\u0934"+
		"\u0931\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0937\5\36"+
		"\20\2\u0937\u0193\3\2\2\2\u0938\u093b\5\16\b\2\u0939\u093b\5\26\f\2\u093a"+
		"\u0938\3\2\2\2\u093a\u0939\3\2\2\2\u093b\u0940\3\2\2\2\u093c\u093f\5\u0168"+
		"\u00b5\2\u093d\u093f\7\u0096\2\2\u093e\u093c\3\2\2\2\u093e\u093d\3\2\2"+
		"\2\u093f\u0942\3\2\2\2\u0940\u093e\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0943"+
		"\3\2\2\2\u0942\u0940\3\2\2\2\u0943\u0944\7\u008b\2\2\u0944\u0948\3\2\2"+
		"\2\u0945\u0946\7n\2\2\u0946\u0948\7\u008b\2\2\u0947\u093a\3\2\2\2\u0947"+
		"\u0945\3\2\2\2\u0948\u0195\3\2\2\2\u0949\u094e\5\u0198\u00cd\2\u094a\u094b"+
		"\7\u0086\2\2\u094b\u094d\5\u0198\u00cd\2\u094c\u094a\3\2\2\2\u094d\u0950"+
		"\3\2\2\2\u094e\u094c\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0197\3\2\2\2\u0950"+
		"\u094e\3\2\2\2\u0951\u0952\5\u01e4\u00f3\2\u0952\u0953\7\u0093\2\2\u0953"+
		"\u0954\5\u019a\u00ce\2\u0954\u0199\3\2\2\2\u0955\u0957\7\u008e\2\2\u0956"+
		"\u0955\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u095b\5\36"+
		"\20\2\u0959\u095b\5\u019e\u00d0\2\u095a";
	private static final String _serializedATNSegment1 =
		"\u0956\3\2\2\2\u095a\u0959\3\2\2\2\u095b\u019b\3\2\2\2\u095c\u095d\5\u01e4"+
		"\u00f3\2\u095d\u095e\7\u0081\2\2\u095e\u095f\5\36\20\2\u095f\u0960\7\u0082"+
		"\2\2\u0960\u019d\3\2\2\2\u0961\u0962\7[\2\2\u0962\u0963\5\6\4\2\u0963"+
		"\u0964\7\u0081\2\2\u0964\u0965\5\36\20\2\u0965\u0966\7\u0082\2\2\u0966"+
		"\u097f\3\2\2\2\u0967\u0969\7[\2\2\u0968\u096a\5\6\4\2\u0969\u0968\3\2"+
		"\2\2\u0969\u096a\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u096d\7\u0081\2\2\u096c"+
		"\u096e\5\36\20\2\u096d\u096c\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u096f\3"+
		"\2\2\2\u096f\u0970\7\u0082\2\2\u0970\u0971\7\177\2\2\u0971\u0976\5\36"+
		"\20\2\u0972\u0973\7\u0086\2\2\u0973\u0975\5\36\20\2\u0974\u0972\3\2\2"+
		"\2\u0975\u0978\3\2\2\2\u0976\u0974\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u097a"+
		"\3\2\2\2\u0978\u0976\3\2\2\2\u0979\u097b\7\u0086\2\2\u097a\u0979\3\2\2"+
		"\2\u097a\u097b\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097d\7\u0080\2\2\u097d"+
		"\u097f\3\2\2\2\u097e\u0961\3\2\2\2\u097e\u0967\3\2\2\2\u097f\u019f\3\2"+
		"\2\2\u0980\u0981\7\u0093\2\2\u0981\u0982\7\u0095\2\2\u0982\u0983\6\u00d1"+
		"\2\3\u0983\u01a1\3\2\2\2\u0984\u0985\7\u0095\2\2\u0985\u0986\7\u0095\2"+
		"\2\u0986\u0987\6\u00d2\3\3\u0987\u01a3\3\2\2\2\u0988\u0989\7\u0095\2\2"+
		"\u0989\u098a\7\u00a1\2\2\u098a\u098b\6\u00d3\4\3\u098b\u01a5\3\2\2\2\u098c"+
		"\u0995\5\u01a8\u00d5\2\u098d\u0995\5\u01aa\u00d6\2\u098e\u0995\7v\2\2"+
		"\u098f\u0995\7w\2\2\u0990\u0995\7x\2\2\u0991\u0995\7y\2\2\u0992\u0995"+
		"\7z\2\2\u0993\u0995\7E\2\2\u0994\u098c\3\2\2\2\u0994\u098d\3\2\2\2\u0994"+
		"\u098e\3\2\2\2\u0994\u098f\3\2\2\2\u0994\u0990\3\2\2\2\u0994\u0991\3\2"+
		"\2\2\u0994\u0992\3\2\2\2\u0994\u0993\3\2\2\2\u0995\u01a7\3\2\2\2\u0996"+
		"\u0997\t\21\2\2\u0997\u01a9\3\2\2\2\u0998\u099d\5\u01ac\u00d7\2\u0999"+
		"\u099d\5\u01ae\u00d8\2\u099a\u099d\7{\2\2\u099b\u099d\7|\2\2\u099c\u0998"+
		"\3\2\2\2\u099c\u0999\3\2\2\2\u099c\u099a\3\2\2\2\u099c\u099b\3\2\2\2\u099d"+
		"\u01ab\3\2\2\2\u099e\u09a2\7}\2\2\u099f\u09a1\5\u01b0\u00d9\2\u09a0\u099f"+
		"\3\2\2\2\u09a1\u09a4\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3"+
		"\u09a5\3\2\2\2\u09a4\u09a2\3\2\2\2\u09a5\u09a6\7\u00b2\2\2\u09a6\u01ad"+
		"\3\2\2\2\u09a7\u09ab\7~\2\2\u09a8\u09aa\5\u01b2\u00da\2\u09a9\u09a8\3"+
		"\2\2\2\u09aa\u09ad\3\2\2\2\u09ab\u09a9\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac"+
		"\u09ae\3\2\2\2\u09ad\u09ab\3\2\2\2\u09ae\u09af\7\u00b2\2\2\u09af\u01af"+
		"\3\2\2\2\u09b0\u09b5\5\u01b4\u00db\2\u09b1\u09b5\7\u00ae\2\2\u09b2\u09b5"+
		"\7\u00b0\2\2\u09b3\u09b5\7\u00b3\2\2\u09b4\u09b0\3\2\2\2\u09b4\u09b1\3"+
		"\2\2\2\u09b4\u09b2\3\2\2\2\u09b4\u09b3\3\2\2\2\u09b5\u01b1\3\2\2\2\u09b6"+
		"\u09bb\5\u01b4\u00db\2\u09b7\u09bb\7\u00ae\2\2\u09b8\u09bb\7\u00b1\2\2"+
		"\u09b9\u09bb\7\u00b4\2\2\u09ba\u09b6\3\2\2\2\u09ba\u09b7\3\2\2\2\u09ba"+
		"\u09b8\3\2\2\2\u09ba\u09b9\3\2\2\2\u09bb\u01b3\3\2\2\2\u09bc\u09c1\5\36"+
		"\20\2\u09bd\u09be\7\u0086\2\2\u09be\u09c0\5\36\20\2\u09bf\u09bd\3\2\2"+
		"\2\u09c0\u09c3\3\2\2\2\u09c1\u09bf\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09ca"+
		"\3\2\2\2\u09c3\u09c1\3\2\2\2\u09c4\u09c6\7\u0087\2\2\u09c5\u09c7\7\u00b6"+
		"\2\2\u09c6\u09c5\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09c6\3\2\2\2\u09c8"+
		"\u09c9\3\2\2\2\u09c9\u09cb\3\2\2\2\u09ca\u09c4\3\2\2\2\u09ca\u09cb\3\2"+
		"\2\2\u09cb\u01b5\3\2\2\2\u09cc\u09cd\t\22\2\2\u09cd\u01b7\3\2\2\2\u09ce"+
		"\u09d1\5\u01ba\u00de\2\u09cf\u09d1\5\u01bc\u00df\2\u09d0\u09ce\3\2\2\2"+
		"\u09d0\u09cf\3\2\2\2\u09d1\u01b9\3\2\2\2\u09d2\u09d3\5\u01bc\u00df\2\u09d3"+
		"\u09d5\5\u0120\u0091\2\u09d4\u09d6\7\u0088\2\2\u09d5\u09d4\3\2\2\2\u09d5"+
		"\u09d6\3\2\2\2\u09d6\u01bb\3\2\2\2\u09d7\u09d8\7\34\2\2\u09d8\u09da\5"+
		"\u01e4\u00f3\2\u09d9\u09db\5\u010c\u0087\2\u09da\u09d9\3\2\2\2\u09da\u09db"+
		"\3\2\2\2\u09db\u09dd\3\2\2\2\u09dc\u09de\5\u0110\u0089\2\u09dd\u09dc\3"+
		"\2\2\2\u09dd\u09de\3\2\2\2\u09de\u09e0\3\2\2\2\u09df\u09e1\5\u0114\u008b"+
		"\2\u09e0\u09df\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u01bd\3\2\2\2\u09e2\u09e4"+
		"\t\23\2\2\u09e3\u09e2\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09e5\3\2\2\2"+
		"\u09e5\u09e6\7^\2\2\u09e6\u09e8\5\u01e4\u00f3\2\u09e7\u09e9\5\u010c\u0087"+
		"\2\u09e8\u09e7\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09eb\3\2\2\2\u09ea\u09ec"+
		"\5\u0160\u00b1\2\u09eb\u09ea\3\2\2\2\u09eb\u09ec\3\2\2\2\u09ec\u09ee\3"+
		"\2\2\2\u09ed\u09ef\5\u0114\u008b\2\u09ee\u09ed\3\2\2\2\u09ee\u09ef\3\2"+
		"\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f2\5\u0162\u00b2\2\u09f1\u09f3\7\u0088"+
		"\2\2\u09f2\u09f1\3\2\2\2\u09f2\u09f3\3\2\2\2\u09f3\u01bf\3\2\2\2\u09f4"+
		"\u09f6\5\u0172\u00ba\2\u09f5\u09f7\5\u016c\u00b7\2\u09f6\u09f5\3\2\2\2"+
		"\u09f6\u09f7\3\2\2\2\u09f7\u09f9\3\2\2\2\u09f8\u09fa\5\u0174\u00bb\2\u09f9"+
		"\u09f8\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fc\3\2\2\2\u09fb\u09fd\5\u0114"+
		"\u008b\2\u09fc\u09fb\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u09fe\3\2\2\2\u09fe"+
		"\u0a00\5\u0120\u0091\2\u09ff\u0a01\7\u0088\2\2\u0a00\u09ff\3\2\2\2\u0a00"+
		"\u0a01\3\2\2\2\u0a01\u01c1\3\2\2\2\u0a02\u0a04\5\u0182\u00c2\2\u0a03\u0a05"+
		"\5\u017c\u00bf\2\u0a04\u0a03\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a06\3"+
		"\2\2\2\u0a06\u0a08\5\u017e\u00c0\2\u0a07\u0a09\7\u0088\2\2\u0a08\u0a07"+
		"\3\2\2\2\u0a08\u0a09\3\2\2\2\u0a09\u01c3\3\2\2\2\u0a0a\u0a0b\7!\2\2\u0a0b"+
		"\u0a0c\5\u0138\u009d\2\u0a0c\u0a0e\5\u01e4\u00f3\2\u0a0d\u0a0f\5\u016c"+
		"\u00b7\2\u0a0e\u0a0d\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10"+
		"\u0a12\7\u0083\2\2\u0a11\u0a13\5\u013e\u00a0\2\u0a12\u0a11\3\2\2\2\u0a12"+
		"\u0a13\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14\u0a16\7\u0084\2\2\u0a15\u0a17"+
		"\5\u0114\u008b\2\u0a16\u0a15\3\2\2\2\u0a16\u0a17\3\2\2\2\u0a17\u0a18\3"+
		"\2\2\2\u0a18\u0a19\7\u0088\2\2\u0a19\u01c5\3\2\2\2\u0a1a\u0a1b\7)\2\2"+
		"\u0a1b\u0a24\5\6\4\2\u0a1c\u0a1d\5\u0132\u009a\2\u0a1d\u0a1e\7\u0088\2"+
		"\2\u0a1e\u0a25\3\2\2\2\u0a1f\u0a20\5\u013a\u009e\2\u0a20\u0a21\7\177\2"+
		"\2\u0a21\u0a22\5\u0152\u00aa\2\u0a22\u0a23\7\u0080\2\2\u0a23\u0a25\3\2"+
		"\2\2\u0a24\u0a1c\3\2\2\2\u0a24\u0a1f\3\2\2\2\u0a25\u01c7\3\2\2\2\u0a26"+
		"\u0a27\5\u0132\u009a\2\u0a27\u0a28\7\u0088\2\2\u0a28\u01c9\3\2\2\2\u0a29"+
		"\u0a37\5\u013a\u009e\2\u0a2a\u0a2b\7\177\2\2\u0a2b\u0a2c\5\u0148\u00a5"+
		"\2\u0a2c\u0a31\7\u0080\2\2\u0a2d\u0a2e\7\u0093\2\2\u0a2e\u0a2f\5\u0136"+
		"\u009c\2\u0a2f\u0a30\7\u0088\2\2\u0a30\u0a32\3\2\2\2\u0a31\u0a2d\3\2\2"+
		"\2\u0a31\u0a32\3\2\2\2\u0a32\u0a38\3\2\2\2\u0a33\u0a34\5\u01a0\u00d1\2"+
		"\u0a34\u0a35\5N(\2\u0a35\u0a36\7\u0088\2\2\u0a36\u0a38\3\2\2\2\u0a37\u0a2a"+
		"\3\2\2\2\u0a37\u0a33\3\2\2\2\u0a38\u01cb\3\2\2\2\u0a39\u0a3a\7\35\2\2"+
		"\u0a3a\u0a3b\5\6\4\2\u0a3b\u0a3c\5\u012e\u0098\2\u0a3c\u0a3d\7\u0088\2"+
		"\2\u0a3d\u01cd\3\2\2\2\u0a3e\u0a3f\7`\2\2\u0a3f\u0a40\7\u0081\2\2\u0a40"+
		"\u0a41\5\u013e\u00a0\2\u0a41\u0a4a\7\u0082\2\2\u0a42\u0a43\7\177\2\2\u0a43"+
		"\u0a44\5\u0148\u00a5\2\u0a44\u0a45\7\u0080\2\2\u0a45\u0a4b\3\2\2\2\u0a46"+
		"\u0a47\5\u01a0\u00d1\2\u0a47\u0a48\5N(\2\u0a48\u0a49\7\u0088\2\2\u0a49"+
		"\u0a4b\3\2\2\2\u0a4a\u0a42\3\2\2\2\u0a4a\u0a46\3\2\2\2\u0a4b\u01cf\3\2"+
		"\2\2\u0a4c\u0a4d\7\u0092\2\2\u0a4d\u0a4e\5\u01e4\u00f3\2\u0a4e\u0a4f\7"+
		"\u0083\2\2\u0a4f\u0a50\7\u0084\2\2\u0a50\u0a51\5\u015e\u00b0\2\u0a51\u01d1"+
		"\3\2\2\2\u0a52\u0a53\5\u01e4\u00f3\2\u0a53\u0a55\7\u0083\2\2\u0a54\u0a56"+
		"\5\u013e\u00a0\2\u0a55\u0a54\3\2\2\2\u0a55\u0a56\3\2\2\2\u0a56\u0a57\3"+
		"\2\2\2\u0a57\u0a59\7\u0084\2\2\u0a58\u0a5a\5\u015c\u00af\2\u0a59\u0a58"+
		"\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b\u0a5c\5\u015e\u00b0"+
		"\2\u0a5c\u01d3\3\2\2\2\u0a5d\u0a60\5\u01d6\u00ec\2\u0a5e\u0a60\5\u01d8"+
		"\u00ed\2\u0a5f\u0a5d\3\2\2\2\u0a5f\u0a5e\3\2\2\2\u0a60\u01d5\3\2\2\2\u0a61"+
		"\u0a63\5\u01d8\u00ed\2\u0a62\u0a64\5\u0114\u008b\2\u0a63\u0a62\3\2\2\2"+
		"\u0a63\u0a64\3\2\2\2\u0a64\u0a6a\3\2\2\2\u0a65\u0a6b\5\u013c\u009f\2\u0a66"+
		"\u0a67\5\u01a0\u00d1\2\u0a67\u0a68\5N(\2\u0a68\u0a69\7\u0088\2\2\u0a69"+
		"\u0a6b\3\2\2\2\u0a6a\u0a65\3\2\2\2\u0a6a\u0a66\3\2\2\2\u0a6b\u01d7\3\2"+
		"\2\2\u0a6c\u0a6e\5\u01da\u00ee\2\u0a6d\u0a6f\5\u010c\u0087\2\u0a6e\u0a6d"+
		"\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a72\7\u0083\2"+
		"\2\u0a71\u0a73\5\u013e\u00a0\2\u0a72\u0a71\3\2\2\2\u0a72\u0a73\3\2\2\2"+
		"\u0a73\u0a74\3\2\2\2\u0a74\u0a75\7\u0084\2\2\u0a75\u01d9\3\2\2\2\u0a76"+
		"\u0a7c\5\u01e4\u00f3\2\u0a77\u0a78\5\u01e4\u00f3\2\u0a78\u0a79\7\u0097"+
		"\2\2\u0a79\u0a7a\5\u01e4\u00f3\2\u0a7a\u0a7c\3\2\2\2\u0a7b\u0a76\3\2\2"+
		"\2\u0a7b\u0a77\3\2\2\2\u0a7c\u0a84\3\2\2\2\u0a7d\u0a7f\5\30\r\2\u0a7e"+
		"\u0a7d\3\2\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a81\7\u0085"+
		"\2\2\u0a81\u0a83\5\u01e4\u00f3\2\u0a82\u0a7e\3\2\2\2\u0a83\u0a86\3\2\2"+
		"\2\u0a84\u0a82\3\2\2\2\u0a84\u0a85\3\2\2\2\u0a85\u01db\3\2\2\2\u0a86\u0a84"+
		"\3\2\2\2\u0a87\u0a88\7H\2\2\u0a88\u0a89\5\u0158\u00ad\2\u0a89\u0a8b\7"+
		"\u0083\2\2\u0a8a\u0a8c\78\2\2\u0a8b\u0a8a\3\2\2\2\u0a8b\u0a8c\3\2\2\2"+
		"\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a93\5\u01de\u00f0\2\u0a8e\u0a90\7\u0086\2"+
		"\2\u0a8f\u0a91\78\2\2\u0a90\u0a8f\3\2\2\2\u0a90\u0a91\3\2\2\2\u0a91\u0a92"+
		"\3\2\2\2\u0a92\u0a94\5\u01de\u00f0\2\u0a93\u0a8e\3\2\2\2\u0a93\u0a94\3"+
		"\2\2\2\u0a94\u0a95\3\2\2\2\u0a95\u0a9b\7\u0084\2\2\u0a96\u0a9c\5\u015e"+
		"\u00b0\2\u0a97\u0a98\5\u01a0\u00d1\2\u0a98\u0a99\5N(\2\u0a99\u0a9a\7\u0088"+
		"\2\2\u0a9a\u0a9c\3\2\2\2\u0a9b\u0a96\3\2\2\2\u0a9b\u0a97\3\2\2\2\u0a9c"+
		"\u01dd\3\2\2\2\u0a9d\u0a9e\5\6\4\2\u0a9e\u0aa1\5\u01e4\u00f3\2\u0a9f\u0aa0"+
		"\7\u0093\2\2\u0aa0\u0aa2\5\36\20\2\u0aa1\u0a9f\3\2\2\2\u0aa1\u0aa2\3\2"+
		"\2\2\u0aa2\u01df\3\2\2\2\u0aa3\u0aa5\7\u0083\2\2\u0aa4\u0aa6\5\32\16\2"+
		"\u0aa5\u0aa4\3\2\2\2\u0aa5\u0aa6\3\2\2\2\u0aa6\u0aa7\3\2\2\2\u0aa7\u0aa8"+
		"\7\u0084\2\2\u0aa8\u01e1\3\2\2\2\u0aa9\u0aab\7\u0083\2\2\u0aaa\u0aac\5"+
		"\32\16\2\u0aab\u0aaa\3\2\2\2\u0aab\u0aac\3\2\2\2\u0aac\u0aad\3\2\2\2\u0aad"+
		"\u0aaf\7\u0084\2\2\u0aae\u0ab0\5\\/\2\u0aaf\u0aae\3\2\2\2\u0aaf\u0ab0"+
		"\3\2\2\2\u0ab0\u01e3\3\2\2\2\u0ab1\u0ab2\t\24\2\2\u0ab2\u01e5\3\2\2\2"+
		"\u015f\u01e7\u01ea\u01ed\u01f2\u01f6\u01fc\u01ff\u0204\u0208\u020f\u0211"+
		"\u0219\u0221\u0227\u022b\u0230\u023a\u0242\u024c\u0252\u0255\u0259\u0261"+
		"\u0266\u0270\u027d\u0285\u028b\u028d\u0294\u029c\u02a4\u02ac\u02b4\u02bc"+
		"\u02c6\u02c8\u02ce\u02d3\u02db\u02e3\u02eb\u02ed\u02f0\u02f7\u02fc\u0303"+
		"\u0307\u0309\u0326\u032a\u032f\u0333\u033b\u033e\u0343\u0347\u034b\u0351"+
		"\u035f\u0365\u0371\u0375\u037a\u037e\u0384\u038c\u0395\u03a7\u03aa\u03af"+
		"\u03b2\u03c1\u03c7\u03cb\u03d1\u03d6\u03d9\u03e1\u03e9\u03f4\u03f9\u03fe"+
		"\u0400\u0409\u0411\u0418\u0420\u0424\u042d\u0432\u0434\u043d\u0445\u0449"+
		"\u044e\u0450\u0455\u0459\u0460\u0468\u046a\u046e\u0471\u0474\u047c\u0486"+
		"\u0497\u049e\u04a2\u04ac\u04b1\u04b8\u04c1\u04c6\u04cd\u04d9\u04e4\u04ec"+
		"\u04f1\u04fa\u0503\u050c\u0512\u0517\u051b\u051f\u0523\u0527\u052e\u0539"+
		"\u0544\u0550\u0557\u055d\u0572\u0576\u057a\u0582\u0597\u059a\u05a9\u05ae"+
		"\u05b3\u05ca\u05d6\u05da\u05e2\u05ea\u05f1\u05f5\u05fa\u05fd\u0602\u060a"+
		"\u060f\u0616\u061c\u0624\u062c\u062f\u0636\u063d\u0641\u0645\u0649\u0651"+
		"\u0657\u0662\u0666\u066c\u0673\u0678\u067b\u067e\u0685\u068f\u06a0\u06a5"+
		"\u06a9\u06ac\u06af\u06b6\u06bc\u06c4\u06ca\u06d4\u06dc\u06e2\u06ed\u06f1"+
		"\u06f3\u06f8\u06fc\u0703\u070c\u0713\u0716\u0719\u071d\u0722\u072f\u0739"+
		"\u0740\u074c\u0753\u075f\u0765\u0769\u076d\u0773\u0779\u077b\u0782\u0786"+
		"\u0789\u078d\u0797\u079a\u07a1\u07a4\u07a9\u07ae\u07b0\u07b3\u07b6\u07bc"+
		"\u07bf\u07cb\u07cf\u07d2\u07dc\u07df\u07e5\u0800\u080d\u0813\u081c\u0822"+
		"\u0825\u082d\u0831\u0837\u083d\u0843\u084e\u0852\u0854\u085e\u0864\u0867"+
		"\u0877\u087d\u0880\u0883\u088a\u088f\u0893\u0897\u08a8\u08ab\u08b0\u08b4"+
		"\u08b8\u08c1\u08c4\u08c9\u08cd\u08d2\u08d6\u08d8\u08e3\u08e7\u08e9\u08ee"+
		"\u08f3\u08fd\u0903\u0908\u090e\u0912\u0918\u091f\u0929\u092c\u092f\u0934"+
		"\u093a\u093e\u0940\u0947\u094e\u0956\u095a\u0969\u096d\u0976\u097a\u097e"+
		"\u0994\u099c\u09a2\u09ab\u09b4\u09ba\u09c1\u09c8\u09ca\u09d0\u09d5\u09da"+
		"\u09dd\u09e0\u09e3\u09e8\u09eb\u09ee\u09f2\u09f6\u09f9\u09fc\u0a00\u0a04"+
		"\u0a08\u0a0e\u0a12\u0a16\u0a24\u0a31\u0a37\u0a4a\u0a55\u0a59\u0a5f\u0a63"+
		"\u0a6a\u0a6e\u0a72\u0a7b\u0a7e\u0a84\u0a8b\u0a90\u0a93\u0a9b\u0aa1\u0aa5"+
		"\u0aab\u0aaf";
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