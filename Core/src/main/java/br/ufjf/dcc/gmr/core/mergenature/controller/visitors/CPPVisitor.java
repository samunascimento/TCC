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
    private boolean warning;

    public List<SyntaxStructure> getList() {
        return list;
    }

    public CPPVisitor(boolean warning) {
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

    public void specialProcess(ParserRuleContext ctx, String newType) {

        //Getting structure type
        String[] aux = Thread.currentThread().getStackTrace()[2].toString().split(".visit");
        aux = aux[aux.length - 1].split("\\(");

        //Adding text
        String ctxText = ctx.getText().replaceAll(";", ";\n").replaceAll("\\{", "\\{\n").replaceAll("\\}", "\\}\n").replaceAll("\n;", ";");;
        //Adding in list
        list.add(new SyntaxStructure(ctx.getStart(), ctx.getStop(), newType, ctxText, warning));

    }

    @Override
    public Object visitLiteral(CPP14Parser.LiteralContext ctx) {
        return super.visitLiteral(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTheOperator(CPP14Parser.TheOperatorContext ctx) {
        return super.visitTheOperator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNoeExceptSpecification(CPP14Parser.NoeExceptSpecificationContext ctx) {
        return super.visitNoeExceptSpecification(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypeIdList(CPP14Parser.TypeIdListContext ctx) {
        return super.visitTypeIdList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDynamicExceptionSpecification(CPP14Parser.DynamicExceptionSpecificationContext ctx) {
        return super.visitDynamicExceptionSpecification(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExceptionSpecification(CPP14Parser.ExceptionSpecificationContext ctx) {
        return super.visitExceptionSpecification(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitThrowExpression(CPP14Parser.ThrowExpressionContext ctx) {
        return super.visitThrowExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExceptionDeclaration(CPP14Parser.ExceptionDeclarationContext ctx) {
        return super.visitExceptionDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitHandler(CPP14Parser.HandlerContext ctx) {
        return super.visitHandler(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitHandlerSeq(CPP14Parser.HandlerSeqContext ctx) {
        return super.visitHandlerSeq(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFunctionTryBlock(CPP14Parser.FunctionTryBlockContext ctx) {
        return super.visitFunctionTryBlock(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTryBlock(CPP14Parser.TryBlockContext ctx) {
        return super.visitTryBlock(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExplicitSpecialization(CPP14Parser.ExplicitSpecializationContext ctx) {
        return super.visitExplicitSpecialization(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExplicitInstantiation(CPP14Parser.ExplicitInstantiationContext ctx) {
        return super.visitExplicitInstantiation(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypeNameSpecifier(CPP14Parser.TypeNameSpecifierContext ctx) {
        return super.visitTypeNameSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTemplateArgument(CPP14Parser.TemplateArgumentContext ctx) {
        return super.visitTemplateArgument(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTemplateArgumentList(CPP14Parser.TemplateArgumentListContext ctx) {
        return super.visitTemplateArgumentList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTemplateName(CPP14Parser.TemplateNameContext ctx) {
        return super.visitTemplateName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTemplateId(CPP14Parser.TemplateIdContext ctx) {
        return super.visitTemplateId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSimpleTemplateId(CPP14Parser.SimpleTemplateIdContext ctx) {
        return super.visitSimpleTemplateId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypeParameter(CPP14Parser.TypeParameterContext ctx) {
        return super.visitTypeParameter(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTemplateParameter(CPP14Parser.TemplateParameterContext ctx) {
        return super.visitTemplateParameter(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTemplateparameterList(CPP14Parser.TemplateparameterListContext ctx) {
        return super.visitTemplateparameterList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTemplateDeclaration(CPP14Parser.TemplateDeclarationContext ctx) {
        return super.visitTemplateDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLiteralOperatorId(CPP14Parser.LiteralOperatorIdContext ctx) {
        return super.visitLiteralOperatorId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOperatorFunctionId(CPP14Parser.OperatorFunctionIdContext ctx) {
        return super.visitOperatorFunctionId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMeminitializerid(CPP14Parser.MeminitializeridContext ctx) {
        return super.visitMeminitializerid(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMemInitializer(CPP14Parser.MemInitializerContext ctx) {
        return super.visitMemInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMemInitializerList(CPP14Parser.MemInitializerListContext ctx) {
        return super.visitMemInitializerList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitConstructorInitializer(CPP14Parser.ConstructorInitializerContext ctx) {
        return super.visitConstructorInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitConversionDeclarator(CPP14Parser.ConversionDeclaratorContext ctx) {
        return super.visitConversionDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitConversionTypeId(CPP14Parser.ConversionTypeIdContext ctx) {
        return super.visitConversionTypeId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitConversionFunctionId(CPP14Parser.ConversionFunctionIdContext ctx) {
        return super.visitConversionFunctionId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAccessSpecifier(CPP14Parser.AccessSpecifierContext ctx) {
        return super.visitAccessSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBaseTypeSpecifier(CPP14Parser.BaseTypeSpecifierContext ctx) {
        return super.visitBaseTypeSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitClassOrDeclType(CPP14Parser.ClassOrDeclTypeContext ctx) {
        return super.visitClassOrDeclType(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBaseSpecifier(CPP14Parser.BaseSpecifierContext ctx) {
        return super.visitBaseSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBaseSpecifierList(CPP14Parser.BaseSpecifierListContext ctx) {
        return super.visitBaseSpecifierList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBaseClause(CPP14Parser.BaseClauseContext ctx) {
        return super.visitBaseClause(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitPureSpecifier(CPP14Parser.PureSpecifierContext ctx) {
        return super.visitPureSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitVirtualSpecifier(CPP14Parser.VirtualSpecifierContext ctx) {
        return super.visitVirtualSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitVirtualSpecifierSeq(CPP14Parser.VirtualSpecifierSeqContext ctx) {
        return super.visitVirtualSpecifierSeq(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMemberDeclarator(CPP14Parser.MemberDeclaratorContext ctx) {
        return super.visitMemberDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMemberDeclaratorList(CPP14Parser.MemberDeclaratorListContext ctx) {
        return super.visitMemberDeclaratorList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMemberdeclaration(CPP14Parser.MemberdeclarationContext ctx) {
        return super.visitMemberdeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMemberSpecification(CPP14Parser.MemberSpecificationContext ctx) {
        return super.visitMemberSpecification(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitClassKey(CPP14Parser.ClassKeyContext ctx) {
        return super.visitClassKey(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitClassVirtSpecifier(CPP14Parser.ClassVirtSpecifierContext ctx) {
        return super.visitClassVirtSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitClassHeadName(CPP14Parser.ClassHeadNameContext ctx) {
        return super.visitClassHeadName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitClassHead(CPP14Parser.ClassHeadContext ctx) {
        return super.visitClassHead(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitClassSpecifier(CPP14Parser.ClassSpecifierContext ctx) {
        return super.visitClassSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitClassName(CPP14Parser.ClassNameContext ctx) {
        return super.visitClassName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBracedInitList(CPP14Parser.BracedInitListContext ctx) {
        return super.visitBracedInitList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitializerList(CPP14Parser.InitializerListContext ctx) {
        return super.visitInitializerList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitializerClause(CPP14Parser.InitializerClauseContext ctx) {
        return super.visitInitializerClause(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBraceOrEqualInitializer(CPP14Parser.BraceOrEqualInitializerContext ctx) {
        return super.visitBraceOrEqualInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitializer(CPP14Parser.InitializerContext ctx) {
        return super.visitInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFunctionBody(CPP14Parser.FunctionBodyContext ctx) {
        return super.visitFunctionBody(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFunctionDefinition(CPP14Parser.FunctionDefinitionContext ctx) {
        return super.visitFunctionDefinition(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParameterDeclaration(CPP14Parser.ParameterDeclarationContext ctx) {
        return super.visitParameterDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParameterDeclarationList(CPP14Parser.ParameterDeclarationListContext ctx) {
        return super.visitParameterDeclarationList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParameterDeclarationClause(CPP14Parser.ParameterDeclarationClauseContext ctx) {
        return super.visitParameterDeclarationClause(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNoPointerAbstractPackDeclarator(CPP14Parser.NoPointerAbstractPackDeclaratorContext ctx) {
        return super.visitNoPointerAbstractPackDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAbstractPackDeclarator(CPP14Parser.AbstractPackDeclaratorContext ctx) {
        return super.visitAbstractPackDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNoPointerAbstractDeclarator(CPP14Parser.NoPointerAbstractDeclaratorContext ctx) {
        return super.visitNoPointerAbstractDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitPointerAbstractDeclarator(CPP14Parser.PointerAbstractDeclaratorContext ctx) {
        return super.visitPointerAbstractDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAbstractDeclarator(CPP14Parser.AbstractDeclaratorContext ctx) {
        return super.visitAbstractDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTheTypeId(CPP14Parser.TheTypeIdContext ctx) {
        return super.visitTheTypeId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaratorid(CPP14Parser.DeclaratoridContext ctx) {
        return super.visitDeclaratorid(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitRefqualifier(CPP14Parser.RefqualifierContext ctx) {
        return super.visitRefqualifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCvQualifier(CPP14Parser.CvQualifierContext ctx) {
        return super.visitCvQualifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCvqualifierseq(CPP14Parser.CvqualifierseqContext ctx) {
        return super.visitCvqualifierseq(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitPointerOperator(CPP14Parser.PointerOperatorContext ctx) {
        return super.visitPointerOperator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTrailingReturnType(CPP14Parser.TrailingReturnTypeContext ctx) {
        return super.visitTrailingReturnType(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParametersAndQualifiers(CPP14Parser.ParametersAndQualifiersContext ctx) {
        return super.visitParametersAndQualifiers(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNoPointerDeclarator(CPP14Parser.NoPointerDeclaratorContext ctx) {
        return super.visitNoPointerDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitPointerDeclarator(CPP14Parser.PointerDeclaratorContext ctx) {
        return super.visitPointerDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclarator(CPP14Parser.DeclaratorContext ctx) {
        return super.visitDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitDeclarator(CPP14Parser.InitDeclaratorContext ctx) {
        return super.visitInitDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitDeclaratorList(CPP14Parser.InitDeclaratorListContext ctx) {
        return super.visitInitDeclaratorList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBalancedtoken(CPP14Parser.BalancedtokenContext ctx) {
        return super.visitBalancedtoken(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBalancedTokenSeq(CPP14Parser.BalancedTokenSeqContext ctx) {
        return super.visitBalancedTokenSeq(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAttributeArgumentClause(CPP14Parser.AttributeArgumentClauseContext ctx) {
        return super.visitAttributeArgumentClause(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAttributeNamespace(CPP14Parser.AttributeNamespaceContext ctx) {
        return super.visitAttributeNamespace(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAttribute(CPP14Parser.AttributeContext ctx) {
        return super.visitAttribute(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAttributeList(CPP14Parser.AttributeListContext ctx) {
        return super.visitAttributeList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAlignmentspecifier(CPP14Parser.AlignmentspecifierContext ctx) {
        return super.visitAlignmentspecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAttributeSpecifier(CPP14Parser.AttributeSpecifierContext ctx) {
        return super.visitAttributeSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAttributeSpecifierSeq(CPP14Parser.AttributeSpecifierSeqContext ctx) {
        return super.visitAttributeSpecifierSeq(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLinkageSpecification(CPP14Parser.LinkageSpecificationContext ctx) {
        return super.visitLinkageSpecification(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAsmDefinition(CPP14Parser.AsmDefinitionContext ctx) {
        return super.visitAsmDefinition(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitUsingDirective(CPP14Parser.UsingDirectiveContext ctx) {
        return super.visitUsingDirective(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitUsingDeclaration(CPP14Parser.UsingDeclarationContext ctx) {
        return super.visitUsingDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitQualifiednamespacespecifier(CPP14Parser.QualifiednamespacespecifierContext ctx) {
        return super.visitQualifiednamespacespecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNamespaceAliasDefinition(CPP14Parser.NamespaceAliasDefinitionContext ctx) {
        return super.visitNamespaceAliasDefinition(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNamespaceAlias(CPP14Parser.NamespaceAliasContext ctx) {
        return super.visitNamespaceAlias(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNamespaceDefinition(CPP14Parser.NamespaceDefinitionContext ctx) {
        return super.visitNamespaceDefinition(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOriginalNamespaceName(CPP14Parser.OriginalNamespaceNameContext ctx) {
        return super.visitOriginalNamespaceName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNamespaceName(CPP14Parser.NamespaceNameContext ctx) {
        return super.visitNamespaceName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEnumerator(CPP14Parser.EnumeratorContext ctx) {
        return super.visitEnumerator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEnumeratorDefinition(CPP14Parser.EnumeratorDefinitionContext ctx) {
        return super.visitEnumeratorDefinition(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEnumeratorList(CPP14Parser.EnumeratorListContext ctx) {
        return super.visitEnumeratorList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEnumbase(CPP14Parser.EnumbaseContext ctx) {
        return super.visitEnumbase(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEnumkey(CPP14Parser.EnumkeyContext ctx) {
        return super.visitEnumkey(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOpaqueEnumDeclaration(CPP14Parser.OpaqueEnumDeclarationContext ctx) {
        return super.visitOpaqueEnumDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEnumHead(CPP14Parser.EnumHeadContext ctx) {
        return super.visitEnumHead(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEnumSpecifier(CPP14Parser.EnumSpecifierContext ctx) {
        return super.visitEnumSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEnumName(CPP14Parser.EnumNameContext ctx) {
        return super.visitEnumName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitElaboratedTypeSpecifier(CPP14Parser.ElaboratedTypeSpecifierContext ctx) {
        return super.visitElaboratedTypeSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDecltypeSpecifier(CPP14Parser.DecltypeSpecifierContext ctx) {
        return super.visitDecltypeSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTheTypeName(CPP14Parser.TheTypeNameContext ctx) {
        return super.visitTheTypeName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSimpleTypeSpecifier(CPP14Parser.SimpleTypeSpecifierContext ctx) {
        return super.visitSimpleTypeSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSimpleTypeSignednessModifier(CPP14Parser.SimpleTypeSignednessModifierContext ctx) {
        return super.visitSimpleTypeSignednessModifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSimpleTypeLengthModifier(CPP14Parser.SimpleTypeLengthModifierContext ctx) {
        return super.visitSimpleTypeLengthModifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTrailingTypeSpecifierSeq(CPP14Parser.TrailingTypeSpecifierSeqContext ctx) {
        return super.visitTrailingTypeSpecifierSeq(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypeSpecifierSeq(CPP14Parser.TypeSpecifierSeqContext ctx) {
        return super.visitTypeSpecifierSeq(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTrailingTypeSpecifier(CPP14Parser.TrailingTypeSpecifierContext ctx) {
        return super.visitTrailingTypeSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypeSpecifier(CPP14Parser.TypeSpecifierContext ctx) {
        return super.visitTypeSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypedefName(CPP14Parser.TypedefNameContext ctx) {
        return super.visitTypedefName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFunctionSpecifier(CPP14Parser.FunctionSpecifierContext ctx) {
        return super.visitFunctionSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitStorageClassSpecifier(CPP14Parser.StorageClassSpecifierContext ctx) {
        return super.visitStorageClassSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclSpecifierSeq(CPP14Parser.DeclSpecifierSeqContext ctx) {
        return super.visitDeclSpecifierSeq(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclSpecifier(CPP14Parser.DeclSpecifierContext ctx) {
        return super.visitDeclSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAttributeDeclaration(CPP14Parser.AttributeDeclarationContext ctx) {
        return super.visitAttributeDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEmptyDeclaration(CPP14Parser.EmptyDeclarationContext ctx) {
        return super.visitEmptyDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitStaticAssertDeclaration(CPP14Parser.StaticAssertDeclarationContext ctx) {
        return super.visitStaticAssertDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSimpleDeclaration(CPP14Parser.SimpleDeclarationContext ctx) {
        return super.visitSimpleDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAliasDeclaration(CPP14Parser.AliasDeclarationContext ctx) {
        return super.visitAliasDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBlockDeclaration(CPP14Parser.BlockDeclarationContext ctx) {
        return super.visitBlockDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaration(CPP14Parser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclarationseq(CPP14Parser.DeclarationseqContext ctx) {
        return super.visitDeclarationseq(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclarationStatement(CPP14Parser.DeclarationStatementContext ctx) {
        return super.visitDeclarationStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitJumpStatement(CPP14Parser.JumpStatementContext ctx) {
        return super.visitJumpStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitForRangeInitializer(CPP14Parser.ForRangeInitializerContext ctx) {
        return super.visitForRangeInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitForRangeDeclaration(CPP14Parser.ForRangeDeclarationContext ctx) {
        return super.visitForRangeDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitForInitStatement(CPP14Parser.ForInitStatementContext ctx) {
        return super.visitForInitStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIterationStatement(CPP14Parser.IterationStatementContext ctx) {
        return super.visitIterationStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCondition(CPP14Parser.ConditionContext ctx) {
        return super.visitCondition(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSelectionStatement(CPP14Parser.SelectionStatementContext ctx) {
        return super.visitSelectionStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitStatementSeq(CPP14Parser.StatementSeqContext ctx) {
        return super.visitStatementSeq(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCompoundStatement(CPP14Parser.CompoundStatementContext ctx) {
        return super.visitCompoundStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpressionStatement(CPP14Parser.ExpressionStatementContext ctx) {
        return super.visitExpressionStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLabeledStatement(CPP14Parser.LabeledStatementContext ctx) {
        return super.visitLabeledStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitStatement(CPP14Parser.StatementContext ctx) {
        return super.visitStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitConstantExpression(CPP14Parser.ConstantExpressionContext ctx) {
        return super.visitConstantExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpression(CPP14Parser.ExpressionContext ctx) {
        return super.visitExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAssignmentOperator(CPP14Parser.AssignmentOperatorContext ctx) {
        return super.visitAssignmentOperator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAssignmentExpression(CPP14Parser.AssignmentExpressionContext ctx) {
        return super.visitAssignmentExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitConditionalExpression(CPP14Parser.ConditionalExpressionContext ctx) {
        return super.visitConditionalExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLogicalOrExpression(CPP14Parser.LogicalOrExpressionContext ctx) {
        return super.visitLogicalOrExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLogicalAndExpression(CPP14Parser.LogicalAndExpressionContext ctx) {
        return super.visitLogicalAndExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInclusiveOrExpression(CPP14Parser.InclusiveOrExpressionContext ctx) {
        return super.visitInclusiveOrExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExclusiveOrExpression(CPP14Parser.ExclusiveOrExpressionContext ctx) {
        return super.visitExclusiveOrExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAndExpression(CPP14Parser.AndExpressionContext ctx) {
        return super.visitAndExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEqualityExpression(CPP14Parser.EqualityExpressionContext ctx) {
        return super.visitEqualityExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitRelationalExpression(CPP14Parser.RelationalExpressionContext ctx) {
        return super.visitRelationalExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitShiftOperator(CPP14Parser.ShiftOperatorContext ctx) {
        return super.visitShiftOperator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitShiftExpression(CPP14Parser.ShiftExpressionContext ctx) {
        return super.visitShiftExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAdditiveExpression(CPP14Parser.AdditiveExpressionContext ctx) {
        return super.visitAdditiveExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMultiplicativeExpression(CPP14Parser.MultiplicativeExpressionContext ctx) {
        return super.visitMultiplicativeExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitPointerMemberExpression(CPP14Parser.PointerMemberExpressionContext ctx) {
        return super.visitPointerMemberExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCastExpression(CPP14Parser.CastExpressionContext ctx) {
        return super.visitCastExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNoExceptExpression(CPP14Parser.NoExceptExpressionContext ctx) {
        return super.visitNoExceptExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeleteExpression(CPP14Parser.DeleteExpressionContext ctx) {
        return super.visitDeleteExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNewInitializer(CPP14Parser.NewInitializerContext ctx) {
        return super.visitNewInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNoPointerNewDeclarator(CPP14Parser.NoPointerNewDeclaratorContext ctx) {
        return super.visitNoPointerNewDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNewDeclarator(CPP14Parser.NewDeclaratorContext ctx) {
        return super.visitNewDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNewTypeId(CPP14Parser.NewTypeIdContext ctx) {
        return super.visitNewTypeId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNewPlacement(CPP14Parser.NewPlacementContext ctx) {
        return super.visitNewPlacement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNewExpression(CPP14Parser.NewExpressionContext ctx) {
        return super.visitNewExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitUnaryOperator(CPP14Parser.UnaryOperatorContext ctx) {
        return super.visitUnaryOperator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitUnaryExpression(CPP14Parser.UnaryExpressionContext ctx) {
        return super.visitUnaryExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitPseudoDestructorName(CPP14Parser.PseudoDestructorNameContext ctx) {
        return super.visitPseudoDestructorName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpressionList(CPP14Parser.ExpressionListContext ctx) {
        return super.visitExpressionList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTypeIdOfTheTypeId(CPP14Parser.TypeIdOfTheTypeIdContext ctx) {
        return super.visitTypeIdOfTheTypeId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitPostfixExpression(CPP14Parser.PostfixExpressionContext ctx) {
        return super.visitPostfixExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLambdaDeclarator(CPP14Parser.LambdaDeclaratorContext ctx) {
        return super.visitLambdaDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitcapture(CPP14Parser.InitcaptureContext ctx) {
        return super.visitInitcapture(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSimpleCapture(CPP14Parser.SimpleCaptureContext ctx) {
        return super.visitSimpleCapture(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCapture(CPP14Parser.CaptureContext ctx) {
        return super.visitCapture(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCaptureList(CPP14Parser.CaptureListContext ctx) {
        return super.visitCaptureList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCaptureDefault(CPP14Parser.CaptureDefaultContext ctx) {
        return super.visitCaptureDefault(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLambdaCapture(CPP14Parser.LambdaCaptureContext ctx) {
        return super.visitLambdaCapture(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLambdaIntroducer(CPP14Parser.LambdaIntroducerContext ctx) {
        return super.visitLambdaIntroducer(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLambdaExpression(CPP14Parser.LambdaExpressionContext ctx) {
        return super.visitLambdaExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNestedNameSpecifier(CPP14Parser.NestedNameSpecifierContext ctx) {
        return super.visitNestedNameSpecifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitQualifiedId(CPP14Parser.QualifiedIdContext ctx) {
        return super.visitQualifiedId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitUnqualifiedId(CPP14Parser.UnqualifiedIdContext ctx) {
        return super.visitUnqualifiedId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIdExpression(CPP14Parser.IdExpressionContext ctx) {
        return super.visitIdExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitPrimaryExpression(CPP14Parser.PrimaryExpressionContext ctx) {
        return super.visitPrimaryExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTranslationUnit(CPP14Parser.TranslationUnitContext ctx) {
        return super.visitTranslationUnit(ctx); //To change body of generated methods, choose Tools | Templates.
    }

}
