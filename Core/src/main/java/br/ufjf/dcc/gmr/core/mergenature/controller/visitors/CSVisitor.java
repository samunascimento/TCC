// Generated from CSharpParser.g4 by ANTLR 4.7.1
package br.ufjf.dcc.gmr.core.mergenature.controller.visitors;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.csharp.CSharpParserBaseVisitor;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.csharp.CSharpParser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;

public class CSVisitor extends CSharpParserBaseVisitor<Object> {

    private List<SyntaxStructure> list;
    private boolean warning;

    public List<SyntaxStructure> getList() {
        return list;
    }

    public CSVisitor(boolean warning) {
        list = new ArrayList<>();
        this.warning = warning;
    }

    public void process(ParserRuleContext ctx) {
        //Getting structure type
        String[] aux = Thread.currentThread().getStackTrace()[2].toString().split(".visit");
        aux = aux[aux.length - 1].split("\\(");

        //Adding texte
        String ctxText = ctx.getText().replaceAll(";", ";\n").replaceAll("\\{", "\\{\n").replaceAll("\\}", "\\}\n").replaceAll("\n;", ";");

        //Adding in list
        list.add(new SyntaxStructure(ctx.getStart(), ctx.getStop(), aux[0], ctxText, warning));
    }

    public void process(ParserRuleContext ctx, String outsiderType, String text) {
        //Adding in list
        list.add(new SyntaxStructure(ctx.getStart(), ctx.getStop(), outsiderType, text, warning));
    }

    @Override
    public Object visitCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitType_(CSharpParser.Type_Context ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBase_type(CSharpParser.Base_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTuple_type(CSharpParser.Tuple_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTuple_element(CSharpParser.Tuple_elementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimple_type(CSharpParser.Simple_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNumeric_type(CSharpParser.Numeric_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIntegral_type(CSharpParser.Integral_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFloating_point_type(CSharpParser.Floating_point_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClass_type(CSharpParser.Class_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitType_argument_list(CSharpParser.Type_argument_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArgument_list(CSharpParser.Argument_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArgument(CSharpParser.ArgumentContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpression(CSharpParser.ExpressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNon_assignment_expression(CSharpParser.Non_assignment_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignment(CSharpParser.AssignmentContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignment_operator(CSharpParser.Assignment_operatorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConditional_expression(CSharpParser.Conditional_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnd_expression(CSharpParser.And_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEquality_expression(CSharpParser.Equality_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRelational_expression(CSharpParser.Relational_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitShift_expression(CSharpParser.Shift_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAdditive_expression(CSharpParser.Additive_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx) {
        //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitch_expression(CSharpParser.Switch_expressionContext ctx) {
        //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitch_expression_arms(CSharpParser.Switch_expression_armsContext ctx) {
        //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitch_expression_arm(CSharpParser.Switch_expression_armContext ctx) {
        //   process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRange_expression(CSharpParser.Range_expressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnary_expression(CSharpParser.Unary_expressionContext ctx) {
        //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimary_expression(CSharpParser.Primary_expressionContext ctx) {
        //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLiteralExpression(CSharpParser.LiteralExpressionContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpleNameExpression(CSharpParser.SimpleNameExpressionContext ctx) {
        //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParenthesisExpressions(CSharpParser.ParenthesisExpressionsContext ctx) {
        //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberAccessExpression(CSharpParser.MemberAccessExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLiteralAccessExpression(CSharpParser.LiteralAccessExpressionContext ctx) {
        //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThisReferenceExpression(CSharpParser.ThisReferenceExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBaseAccessExpression(CSharpParser.BaseAccessExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitObjectCreationExpression(CSharpParser.ObjectCreationExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTupleExpression(CSharpParser.TupleExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeofExpression(CSharpParser.TypeofExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCheckedExpression(CSharpParser.CheckedExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUncheckedExpression(CSharpParser.UncheckedExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDefaultValueExpression(CSharpParser.DefaultValueExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnonymousMethodExpression(CSharpParser.AnonymousMethodExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSizeofExpression(CSharpParser.SizeofExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNameofExpression(CSharpParser.NameofExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThrowable_expression(CSharpParser.Throwable_expressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThrow_expression(CSharpParser.Throw_expressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMember_access(CSharpParser.Member_accessContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBracket_expression(CSharpParser.Bracket_expressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIndexer_argument(CSharpParser.Indexer_argumentContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPredefined_type(CSharpParser.Predefined_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpression_list(CSharpParser.Expression_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitObject_or_collection_initializer(CSharpParser.Object_or_collection_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitObject_initializer(CSharpParser.Object_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMember_initializer_list(CSharpParser.Member_initializer_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMember_initializer(CSharpParser.Member_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitializer_value(CSharpParser.Initializer_valueContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCollection_initializer(CSharpParser.Collection_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElement_initializer(CSharpParser.Element_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnonymous_object_initializer(CSharpParser.Anonymous_object_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMember_declarator_list(CSharpParser.Member_declarator_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMember_declarator(CSharpParser.Member_declaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnbound_type_name(CSharpParser.Unbound_type_nameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitGeneric_dimension_specifier(CSharpParser.Generic_dimension_specifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIsType(CSharpParser.IsTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIsTypePatternArms(CSharpParser.IsTypePatternArmsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIsTypePatternArm(CSharpParser.IsTypePatternArmContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambda_expression(CSharpParser.Lambda_expressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnonymous_function_signature(CSharpParser.Anonymous_function_signatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExplicit_anonymous_function_parameter_list(CSharpParser.Explicit_anonymous_function_parameter_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExplicit_anonymous_function_parameter(CSharpParser.Explicit_anonymous_function_parameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitImplicit_anonymous_function_parameter_list(CSharpParser.Implicit_anonymous_function_parameter_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnonymous_function_body(CSharpParser.Anonymous_function_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQuery_expression(CSharpParser.Query_expressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFrom_clause(CSharpParser.From_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQuery_body(CSharpParser.Query_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQuery_body_clause(CSharpParser.Query_body_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLet_clause(CSharpParser.Let_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhere_clause(CSharpParser.Where_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCombined_join_clause(CSharpParser.Combined_join_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOrderby_clause(CSharpParser.Orderby_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOrdering(CSharpParser.OrderingContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSelect_or_group_clause(CSharpParser.Select_or_group_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQuery_continuation(CSharpParser.Query_continuationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement(CSharpParser.StatementContext ctx) {
        //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclarationStatement(CSharpParser.DeclarationStatementContext ctx) {
        //   process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocal_function_declaration(CSharpParser.Local_function_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocal_function_header(CSharpParser.Local_function_headerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocal_function_modifiers(CSharpParser.Local_function_modifiersContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocal_function_body(CSharpParser.Local_function_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLabeled_Statement(CSharpParser.Labeled_StatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEmbedded_statement(CSharpParser.Embedded_statementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTheEmptyStatement(CSharpParser.TheEmptyStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressionStatement(CSharpParser.ExpressionStatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIfStatement(CSharpParser.IfStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchStatement(CSharpParser.SwitchStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhileStatement(CSharpParser.WhileStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDoStatement(CSharpParser.DoStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForStatement(CSharpParser.ForStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForeachStatement(CSharpParser.ForeachStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBreakStatement(CSharpParser.BreakStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitContinueStatement(CSharpParser.ContinueStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitGotoStatement(CSharpParser.GotoStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitReturnStatement(CSharpParser.ReturnStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThrowStatement(CSharpParser.ThrowStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTryStatement(CSharpParser.TryStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCheckedStatement(CSharpParser.CheckedStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUncheckedStatement(CSharpParser.UncheckedStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLockStatement(CSharpParser.LockStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsingStatement(CSharpParser.UsingStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitYieldStatement(CSharpParser.YieldStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnsafeStatement(CSharpParser.UnsafeStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFixedStatement(CSharpParser.FixedStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlock(CSharpParser.BlockContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocal_variable_type(CSharpParser.Local_variable_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocal_variable_initializer(CSharpParser.Local_variable_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocal_constant_declaration(CSharpParser.Local_constant_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIf_body(CSharpParser.If_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitch_section(CSharpParser.Switch_sectionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitch_label(CSharpParser.Switch_labelContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCase_guard(CSharpParser.Case_guardContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement_list(CSharpParser.Statement_listContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_initializer(CSharpParser.For_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_iterator(CSharpParser.For_iteratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCatch_clauses(CSharpParser.Catch_clausesContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSpecific_catch_clause(CSharpParser.Specific_catch_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitGeneral_catch_clause(CSharpParser.General_catch_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitException_filter(CSharpParser.Exception_filterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFinally_clause(CSharpParser.Finally_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitResource_acquisition(CSharpParser.Resource_acquisitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespace_declaration(CSharpParser.Namespace_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQualified_identifier(CSharpParser.Qualified_identifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespace_body(CSharpParser.Namespace_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExtern_alias_directives(CSharpParser.Extern_alias_directivesContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExtern_alias_directive(CSharpParser.Extern_alias_directiveContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsing_directives(CSharpParser.Using_directivesContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsingAliasDirective(CSharpParser.UsingAliasDirectiveContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsingNamespaceDirective(CSharpParser.UsingNamespaceDirectiveContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsingStaticDirective(CSharpParser.UsingStaticDirectiveContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitType_declaration(CSharpParser.Type_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQualified_alias_member(CSharpParser.Qualified_alias_memberContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitType_parameter_list(CSharpParser.Type_parameter_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitType_parameter(CSharpParser.Type_parameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClass_base(CSharpParser.Class_baseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterface_type_list(CSharpParser.Interface_type_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitType_parameter_constraints_clauses(CSharpParser.Type_parameter_constraints_clausesContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitType_parameter_constraints_clause(CSharpParser.Type_parameter_constraints_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitType_parameter_constraints(CSharpParser.Type_parameter_constraintsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimary_constraint(CSharpParser.Primary_constraintContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSecondary_constraints(CSharpParser.Secondary_constraintsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstructor_constraint(CSharpParser.Constructor_constraintContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClass_body(CSharpParser.Class_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClass_member_declaration(CSharpParser.Class_member_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAll_member_modifier(CSharpParser.All_member_modifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTyped_member_declaration(CSharpParser.Typed_member_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstant_declarators(CSharpParser.Constant_declaratorsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstant_declarator(CSharpParser.Constant_declaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable_declarators(CSharpParser.Variable_declaratorsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable_declarator(CSharpParser.Variable_declaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable_initializer(CSharpParser.Variable_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitReturn_type(CSharpParser.Return_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMember_name(CSharpParser.Member_nameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethod_body(CSharpParser.Method_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFormal_parameter_list(CSharpParser.Formal_parameter_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFixed_parameters(CSharpParser.Fixed_parametersContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFixed_parameter(CSharpParser.Fixed_parameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameter_modifier(CSharpParser.Parameter_modifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameter_array(CSharpParser.Parameter_arrayContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAccessor_declarations(CSharpParser.Accessor_declarationsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitGet_accessor_declaration(CSharpParser.Get_accessor_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSet_accessor_declaration(CSharpParser.Set_accessor_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAccessor_modifier(CSharpParser.Accessor_modifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAccessor_body(CSharpParser.Accessor_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEvent_accessor_declarations(CSharpParser.Event_accessor_declarationsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAdd_accessor_declaration(CSharpParser.Add_accessor_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRemove_accessor_declaration(CSharpParser.Remove_accessor_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOverloadable_operator(CSharpParser.Overloadable_operatorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConversion_operator_declarator(CSharpParser.Conversion_operator_declaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstructor_initializer(CSharpParser.Constructor_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBody(CSharpParser.BodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStruct_interfaces(CSharpParser.Struct_interfacesContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStruct_body(CSharpParser.Struct_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStruct_member_declaration(CSharpParser.Struct_member_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArray_type(CSharpParser.Array_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRank_specifier(CSharpParser.Rank_specifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArray_initializer(CSharpParser.Array_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariant_type_parameter_list(CSharpParser.Variant_type_parameter_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariant_type_parameter(CSharpParser.Variant_type_parameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariance_annotation(CSharpParser.Variance_annotationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterface_base(CSharpParser.Interface_baseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterface_body(CSharpParser.Interface_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterface_accessors(CSharpParser.Interface_accessorsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnum_base(CSharpParser.Enum_baseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnum_body(CSharpParser.Enum_bodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnum_member_declaration(CSharpParser.Enum_member_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitGlobal_attribute_section(CSharpParser.Global_attribute_sectionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitGlobal_attribute_target(CSharpParser.Global_attribute_targetContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributes(CSharpParser.AttributesContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttribute_section(CSharpParser.Attribute_sectionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttribute_target(CSharpParser.Attribute_targetContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttribute_list(CSharpParser.Attribute_listContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttribute(CSharpParser.AttributeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttribute_argument(CSharpParser.Attribute_argumentContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPointer_type(CSharpParser.Pointer_typeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFixed_pointer_declarators(CSharpParser.Fixed_pointer_declaratorsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFixed_pointer_declarator(CSharpParser.Fixed_pointer_declaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFixed_pointer_initializer(CSharpParser.Fixed_pointer_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFixed_size_buffer_declarator(CSharpParser.Fixed_size_buffer_declaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStackalloc_initializer(CSharpParser.Stackalloc_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRight_arrow(CSharpParser.Right_arrowContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRight_shift(CSharpParser.Right_shiftContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRight_shift_assignment(CSharpParser.Right_shift_assignmentContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLiteral(CSharpParser.LiteralContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBoolean_literal(CSharpParser.Boolean_literalContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitString_literal(CSharpParser.String_literalContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterpolated_regular_string(CSharpParser.Interpolated_regular_stringContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterpolated_verbatium_string(CSharpParser.Interpolated_verbatium_stringContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterpolated_regular_string_part(CSharpParser.Interpolated_regular_string_partContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterpolated_verbatium_string_part(CSharpParser.Interpolated_verbatium_string_partContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterpolated_string_expression(CSharpParser.Interpolated_string_expressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitKeyword(CSharpParser.KeywordContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClass_definition(CSharpParser.Class_definitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStruct_definition(CSharpParser.Struct_definitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterface_definition(CSharpParser.Interface_definitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnum_definition(CSharpParser.Enum_definitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDelegate_definition(CSharpParser.Delegate_definitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEvent_declaration(CSharpParser.Event_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitField_declaration(CSharpParser.Field_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitProperty_declaration(CSharpParser.Property_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstant_declaration(CSharpParser.Constant_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIndexer_declaration(CSharpParser.Indexer_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDestructor_definition(CSharpParser.Destructor_definitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstructor_declaration(CSharpParser.Constructor_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethod_declaration(CSharpParser.Method_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethod_member_name(CSharpParser.Method_member_nameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOperator_declaration(CSharpParser.Operator_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArg_declaration(CSharpParser.Arg_declarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethod_invocation(CSharpParser.Method_invocationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitObject_creation_expression(CSharpParser.Object_creation_expressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdentifier(CSharpParser.IdentifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethod_signature(CSharpParser.Method_signatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_(CSharpParser.For_Context ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDo_(CSharpParser.Do_Context ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhile_(CSharpParser.While_Context ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitch_(CSharpParser.Switch_Context ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIf_(CSharpParser.If_Context ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterface_signature(CSharpParser.Interface_signatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

}
