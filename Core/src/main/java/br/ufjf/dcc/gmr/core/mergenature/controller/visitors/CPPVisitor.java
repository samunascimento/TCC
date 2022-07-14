package br.ufjf.dcc.gmr.core.mergenature.controller.visitors;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14ParserBaseVisitor;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author luand
 */
public class CPPVisitor extends CPP14ParserBaseVisitor<Object> {

    private List<SyntaxStructure> list;

    public List<SyntaxStructure> getList() {
        return list;
    }

    public CPPVisitor() {
        list = new ArrayList<>();
    }

    public void process(ParserRuleContext ctx) {
        //Getting structure type
        String[] aux = Thread.currentThread().getStackTrace()[2].toString().split(".visit");
        aux = aux[aux.length - 1].split("\\(");

        //Adding texte
        String ctxText = ctx.getText().replaceAll(";", ";\n").replaceAll("\\{", "\\{\n").replaceAll("\\}", "\\}\n").replaceAll("\n;", ";");

        //Adding in list
        list.add(new SyntaxStructure(ctx.getStart(), ctx.getStop(), aux[0], ctxText));
    }

    @Override
    public Object visitConstructorCall(CPP14Parser.ConstructorCallContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionCall(CPP14Parser.FunctionCallContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionSignature(CPP14Parser.FunctionSignatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCatchStatement(CPP14Parser.CatchStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionTryStatement(CPP14Parser.FunctionTryStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTryStatement(CPP14Parser.TryStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCastStatement(CPP14Parser.CastStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimitiveDataTypeCastExpression(CPP14Parser.PrimitiveDataTypeCastExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassCastExpression(CPP14Parser.ClassCastExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchStatement(CPP14Parser.SwitchStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIfStatement(CPP14Parser.IfStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIfBlock(CPP14Parser.IfBlockContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDefaultStatement(CPP14Parser.DefaultStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCaseStatement(CPP14Parser.CaseStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitReturnStatement(CPP14Parser.ReturnStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitContinueStatement(CPP14Parser.ContinueStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBreakStatement(CPP14Parser.BreakStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArrayAccess(CPP14Parser.ArrayAccessContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArrayDeclaration(CPP14Parser.ArrayDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLiteral(CPP14Parser.LiteralContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTheOperator(CPP14Parser.TheOperatorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoeExceptSpecification(CPP14Parser.NoeExceptSpecificationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeIdList(CPP14Parser.TypeIdListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDynamicExceptionSpecification(CPP14Parser.DynamicExceptionSpecificationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExceptionSpecification(CPP14Parser.ExceptionSpecificationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThrowExpression(CPP14Parser.ThrowExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExceptionDeclaration(CPP14Parser.ExceptionDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitHandler(CPP14Parser.HandlerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitHandlerSeq(CPP14Parser.HandlerSeqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionTryBlock(CPP14Parser.FunctionTryBlockContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTryBlock(CPP14Parser.TryBlockContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExplicitSpecialization(CPP14Parser.ExplicitSpecializationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExplicitInstantiation(CPP14Parser.ExplicitInstantiationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeNameSpecifier(CPP14Parser.TypeNameSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateArgument(CPP14Parser.TemplateArgumentContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateArgumentList(CPP14Parser.TemplateArgumentListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateName(CPP14Parser.TemplateNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateId(CPP14Parser.TemplateIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpleTemplateId(CPP14Parser.SimpleTemplateIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeParameter(CPP14Parser.TypeParameterContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateParameter(CPP14Parser.TemplateParameterContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateparameterList(CPP14Parser.TemplateparameterListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateDeclaration(CPP14Parser.TemplateDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLiteralOperatorId(CPP14Parser.LiteralOperatorIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOperatorFunctionId(CPP14Parser.OperatorFunctionIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMeminitializerid(CPP14Parser.MeminitializeridContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemInitializer(CPP14Parser.MemInitializerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemInitializerList(CPP14Parser.MemInitializerListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstructorInitializer(CPP14Parser.ConstructorInitializerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConversionDeclarator(CPP14Parser.ConversionDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConversionTypeId(CPP14Parser.ConversionTypeIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConversionFunctionId(CPP14Parser.ConversionFunctionIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAccessSpecifier(CPP14Parser.AccessSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBaseTypeSpecifier(CPP14Parser.BaseTypeSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassOrDeclType(CPP14Parser.ClassOrDeclTypeContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBaseSpecifier(CPP14Parser.BaseSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBaseSpecifierList(CPP14Parser.BaseSpecifierListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBaseClause(CPP14Parser.BaseClauseContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPureSpecifier(CPP14Parser.PureSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVirtualSpecifier(CPP14Parser.VirtualSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVirtualSpecifierSeq(CPP14Parser.VirtualSpecifierSeqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberDeclarator(CPP14Parser.MemberDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberDeclaratorList(CPP14Parser.MemberDeclaratorListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberdeclaration(CPP14Parser.MemberdeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberSpecification(CPP14Parser.MemberSpecificationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassKey(CPP14Parser.ClassKeyContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassVirtSpecifier(CPP14Parser.ClassVirtSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassHeadName(CPP14Parser.ClassHeadNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassHead(CPP14Parser.ClassHeadContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassSpecifier(CPP14Parser.ClassSpecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassName(CPP14Parser.ClassNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBracedInitList(CPP14Parser.BracedInitListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitializerList(CPP14Parser.InitializerListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitializerClause(CPP14Parser.InitializerClauseContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBraceOrEqualInitializer(CPP14Parser.BraceOrEqualInitializerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitializer(CPP14Parser.InitializerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionBody(CPP14Parser.FunctionBodyContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionDefinition(CPP14Parser.FunctionDefinitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameterDeclaration(CPP14Parser.ParameterDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameterDeclarationList(CPP14Parser.ParameterDeclarationListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameterDeclarationClause(CPP14Parser.ParameterDeclarationClauseContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoPointerAbstractPackDeclarator(CPP14Parser.NoPointerAbstractPackDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAbstractPackDeclarator(CPP14Parser.AbstractPackDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoPointerAbstractDeclarator(CPP14Parser.NoPointerAbstractDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPointerAbstractDeclarator(CPP14Parser.PointerAbstractDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAbstractDeclarator(CPP14Parser.AbstractDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTheTypeId(CPP14Parser.TheTypeIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaratorid(CPP14Parser.DeclaratoridContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRefqualifier(CPP14Parser.RefqualifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCvQualifier(CPP14Parser.CvQualifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCvqualifierseq(CPP14Parser.CvqualifierseqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPointerOperator(CPP14Parser.PointerOperatorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTrailingReturnType(CPP14Parser.TrailingReturnTypeContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParametersAndQualifiers(CPP14Parser.ParametersAndQualifiersContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoPointerDeclarator(CPP14Parser.NoPointerDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPointerDeclarator(CPP14Parser.PointerDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclarator(CPP14Parser.DeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitDeclarator(CPP14Parser.InitDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitDeclaratorList(CPP14Parser.InitDeclaratorListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBalancedtoken(CPP14Parser.BalancedtokenContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBalancedTokenSeq(CPP14Parser.BalancedTokenSeqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributeArgumentClause(CPP14Parser.AttributeArgumentClauseContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributeNamespace(CPP14Parser.AttributeNamespaceContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttribute(CPP14Parser.AttributeContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributeList(CPP14Parser.AttributeListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAlignmentspecifier(CPP14Parser.AlignmentspecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributeSpecifier(CPP14Parser.AttributeSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributeSpecifierSeq(CPP14Parser.AttributeSpecifierSeqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLinkageSpecification(CPP14Parser.LinkageSpecificationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAsmDefinition(CPP14Parser.AsmDefinitionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsingDirective(CPP14Parser.UsingDirectiveContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsingDeclaration(CPP14Parser.UsingDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQualifiednamespacespecifier(CPP14Parser.QualifiednamespacespecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespaceAliasDefinition(CPP14Parser.NamespaceAliasDefinitionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespaceAlias(CPP14Parser.NamespaceAliasContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespaceDefinition(CPP14Parser.NamespaceDefinitionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOriginalNamespaceName(CPP14Parser.OriginalNamespaceNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespaceName(CPP14Parser.NamespaceNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumerator(CPP14Parser.EnumeratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumeratorDefinition(CPP14Parser.EnumeratorDefinitionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumeratorList(CPP14Parser.EnumeratorListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumbase(CPP14Parser.EnumbaseContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumkey(CPP14Parser.EnumkeyContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOpaqueEnumDeclaration(CPP14Parser.OpaqueEnumDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumHead(CPP14Parser.EnumHeadContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumSpecifier(CPP14Parser.EnumSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumName(CPP14Parser.EnumNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElaboratedTypeSpecifier(CPP14Parser.ElaboratedTypeSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDecltypeSpecifier(CPP14Parser.DecltypeSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTheTypeName(CPP14Parser.TheTypeNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpleTypeSpecifier(CPP14Parser.SimpleTypeSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpleTypeSignednessModifier(CPP14Parser.SimpleTypeSignednessModifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpleTypeLengthModifier(CPP14Parser.SimpleTypeLengthModifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTrailingTypeSpecifierSeq(CPP14Parser.TrailingTypeSpecifierSeqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeSpecifierSeq(CPP14Parser.TypeSpecifierSeqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTrailingTypeSpecifier(CPP14Parser.TrailingTypeSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeSpecifier(CPP14Parser.TypeSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypedefName(CPP14Parser.TypedefNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionSpecifier(CPP14Parser.FunctionSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStorageClassSpecifier(CPP14Parser.StorageClassSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclSpecifierSeq(CPP14Parser.DeclSpecifierSeqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclSpecifier(CPP14Parser.DeclSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributeDeclaration(CPP14Parser.AttributeDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEmptyDeclaration(CPP14Parser.EmptyDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssertion(CPP14Parser.AssertionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpleDeclaration(CPP14Parser.SimpleDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAliasDeclaration(CPP14Parser.AliasDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlockDeclaration(CPP14Parser.BlockDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaration(CPP14Parser.DeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclarationseq(CPP14Parser.DeclarationseqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclarationStatement(CPP14Parser.DeclarationStatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitJumpStatement(CPP14Parser.JumpStatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForRangeInitializer(CPP14Parser.ForRangeInitializerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForRangeDeclaration(CPP14Parser.ForRangeDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForInitStatement(CPP14Parser.ForInitStatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIterationStatement(CPP14Parser.IterationStatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCondition(CPP14Parser.ConditionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSelectionStatement(CPP14Parser.SelectionStatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatementSeq(CPP14Parser.StatementSeqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCompoundStatement(CPP14Parser.CompoundStatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressionStatement(CPP14Parser.ExpressionStatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLabeledStatement(CPP14Parser.LabeledStatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement(CPP14Parser.StatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstantExpression(CPP14Parser.ConstantExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpression(CPP14Parser.ExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignmentOperator(CPP14Parser.AssignmentOperatorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignmentExpression(CPP14Parser.AssignmentExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConditionalExpression(CPP14Parser.ConditionalExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLogicalOrExpression(CPP14Parser.LogicalOrExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLogicalAndExpression(CPP14Parser.LogicalAndExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInclusiveOrExpression(CPP14Parser.InclusiveOrExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExclusiveOrExpression(CPP14Parser.ExclusiveOrExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAndExpression(CPP14Parser.AndExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEqualityExpression(CPP14Parser.EqualityExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRelationalExpression(CPP14Parser.RelationalExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitShiftOperator(CPP14Parser.ShiftOperatorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitShiftExpression(CPP14Parser.ShiftExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAdditiveExpression(CPP14Parser.AdditiveExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMultiplicativeExpression(CPP14Parser.MultiplicativeExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPointerMemberExpression(CPP14Parser.PointerMemberExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCastExpression(CPP14Parser.CastExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoExceptExpression(CPP14Parser.NoExceptExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeleteExpression(CPP14Parser.DeleteExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewInitializer(CPP14Parser.NewInitializerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoPointerNewDeclarator(CPP14Parser.NoPointerNewDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewDeclarator(CPP14Parser.NewDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewTypeId(CPP14Parser.NewTypeIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewPlacement(CPP14Parser.NewPlacementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewExpression(CPP14Parser.NewExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnaryOperator(CPP14Parser.UnaryOperatorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnaryExpression(CPP14Parser.UnaryExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPseudoDestructorName(CPP14Parser.PseudoDestructorNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressionList(CPP14Parser.ExpressionListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeIdOfTheTypeId(CPP14Parser.TypeIdOfTheTypeIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPostfixExpression(CPP14Parser.PostfixExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaDeclarator(CPP14Parser.LambdaDeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitcapture(CPP14Parser.InitcaptureContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpleCapture(CPP14Parser.SimpleCaptureContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCapture(CPP14Parser.CaptureContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCaptureList(CPP14Parser.CaptureListContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCaptureDefault(CPP14Parser.CaptureDefaultContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaCapture(CPP14Parser.LambdaCaptureContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaIntroducer(CPP14Parser.LambdaIntroducerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaExpression(CPP14Parser.LambdaExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNestedNameSpecifier(CPP14Parser.NestedNameSpecifierContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQualifiedId(CPP14Parser.QualifiedIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnqualifiedId(CPP14Parser.UnqualifiedIdContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdExpression(CPP14Parser.IdExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryExpression(CPP14Parser.PrimaryExpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTranslationUnit(CPP14Parser.TranslationUnitContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

}
