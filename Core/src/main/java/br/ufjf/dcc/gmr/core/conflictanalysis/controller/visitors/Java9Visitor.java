package br.ufjf.dcc.gmr.core.conflictanalysis.controller.visitors;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java9.Java9BaseVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java9.Java9Parser;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author Gleiph,João e Luan
 */
public class Java9Visitor extends Java9BaseVisitor<Object> {

    private List<SyntaxStructure> list;
    private boolean warning;

    public List<SyntaxStructure> getList() {
        return list;
    }

    public Java9Visitor(boolean warning) {
        list = new ArrayList<>();
        this.warning = warning;
    }

    public void process(ParserRuleContext ctx) {

        //Getting structure type
        String[] aux = Thread.currentThread().getStackTrace()[2].toString().split(".visit");
        aux = aux[aux.length - 1].split("\\(");

        //Adding text
        String ctxText = ctx.getText().replaceAll(";", ";\n").replaceAll("\\{", "\\{\n").replaceAll("\\}", "\\}\n").replaceAll("\n;", ";");

        //Adding in list
        list.add(new SyntaxStructure(ctx.getStart(), ctx.getStop(), aux[0], ctxText, warning));

    }

    @Override
    public Object visitCaseLine(Java9Parser.CaseLineContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCatchExpression(Java9Parser.CatchExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhileExpression(Java9Parser.WhileExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchExpression(Java9Parser.SwitchExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIfExpression(Java9Parser.IfExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnhancedForExpression(Java9Parser.EnhancedForExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasicForExpression(Java9Parser.BasicForExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodSignature(Java9Parser.MethodSignatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNormalInterfaceSignature(Java9Parser.NormalInterfaceSignatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumSignature(Java9Parser.EnumSignatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNormalClassSignature(Java9Parser.NormalClassSignatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLiteral(Java9Parser.LiteralContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimitiveType(Java9Parser.PrimitiveTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNumericType(Java9Parser.NumericTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIntegralType(Java9Parser.IntegralTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFloatingPointType(Java9Parser.FloatingPointTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitReferenceType(Java9Parser.ReferenceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassOrInterfaceType(Java9Parser.ClassOrInterfaceTypeContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassType(Java9Parser.ClassTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassType_lf_classOrInterfaceType(Java9Parser.ClassType_lf_classOrInterfaceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassType_lfno_classOrInterfaceType(Java9Parser.ClassType_lfno_classOrInterfaceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterfaceType(Java9Parser.InterfaceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterfaceType_lf_classOrInterfaceType(Java9Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterfaceType_lfno_classOrInterfaceType(Java9Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeVariable(Java9Parser.TypeVariableContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArrayType(Java9Parser.ArrayTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDims(Java9Parser.DimsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeParameter(Java9Parser.TypeParameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeParameterModifier(Java9Parser.TypeParameterModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeBound(Java9Parser.TypeBoundContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAdditionalBound(Java9Parser.AdditionalBoundContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeArguments(Java9Parser.TypeArgumentsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeArgumentList(Java9Parser.TypeArgumentListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeArgument(Java9Parser.TypeArgumentContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWildcard(Java9Parser.WildcardContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWildcardBounds(Java9Parser.WildcardBoundsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitModuleName(Java9Parser.ModuleNameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPackageName(Java9Parser.PackageNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeName(Java9Parser.TypeNameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPackageOrTypeName(Java9Parser.PackageOrTypeNameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressionName(Java9Parser.ExpressionNameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodName(Java9Parser.MethodNameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAmbiguousName(Java9Parser.AmbiguousNameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCompilationUnit(Java9Parser.CompilationUnitContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOrdinaryCompilation(Java9Parser.OrdinaryCompilationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitModularCompilation(Java9Parser.ModularCompilationContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPackageDeclaration(Java9Parser.PackageDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPackageModifier(Java9Parser.PackageModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitImportDeclaration(Java9Parser.ImportDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSingleTypeImportDeclaration(Java9Parser.SingleTypeImportDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeImportOnDemandDeclaration(Java9Parser.TypeImportOnDemandDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSingleStaticImportDeclaration(Java9Parser.SingleStaticImportDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStaticImportOnDemandDeclaration(Java9Parser.StaticImportOnDemandDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeDeclaration(Java9Parser.TypeDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitModuleDeclaration(Java9Parser.ModuleDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitModuleDirective(Java9Parser.ModuleDirectiveContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRequiresModifier(Java9Parser.RequiresModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassDeclaration(Java9Parser.ClassDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNormalClassDeclaration(Java9Parser.NormalClassDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassModifier(Java9Parser.ClassModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeParameters(Java9Parser.TypeParametersContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeParameterList(Java9Parser.TypeParameterListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSuperclass(Java9Parser.SuperclassContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSuperinterfaces(Java9Parser.SuperinterfacesContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterfaceTypeList(Java9Parser.InterfaceTypeListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassBody(Java9Parser.ClassBodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassBodyDeclaration(Java9Parser.ClassBodyDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassMemberDeclaration(Java9Parser.ClassMemberDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFieldDeclaration(Java9Parser.FieldDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFieldModifier(Java9Parser.FieldModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariableDeclaratorList(Java9Parser.VariableDeclaratorListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariableDeclarator(Java9Parser.VariableDeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariableDeclaratorId(Java9Parser.VariableDeclaratorIdContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariableInitializer(Java9Parser.VariableInitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannType(Java9Parser.UnannTypeContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannPrimitiveType(Java9Parser.UnannPrimitiveTypeContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannReferenceType(Java9Parser.UnannReferenceTypeContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannClassOrInterfaceType(Java9Parser.UnannClassOrInterfaceTypeContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannClassType(Java9Parser.UnannClassTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannClassType_lf_unannClassOrInterfaceType(Java9Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannClassType_lfno_unannClassOrInterfaceType(Java9Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannInterfaceType(Java9Parser.UnannInterfaceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannInterfaceType_lf_unannClassOrInterfaceType(Java9Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java9Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannTypeVariable(Java9Parser.UnannTypeVariableContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnannArrayType(Java9Parser.UnannArrayTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodDeclaration(Java9Parser.MethodDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodModifier(Java9Parser.MethodModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodHeader(Java9Parser.MethodHeaderContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitResult(Java9Parser.ResultContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodDeclarator(Java9Parser.MethodDeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFormalParameterList(Java9Parser.FormalParameterListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFormalParameters(Java9Parser.FormalParametersContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFormalParameter(Java9Parser.FormalParameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariableModifier(Java9Parser.VariableModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLastFormalParameter(Java9Parser.LastFormalParameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitReceiverParameter(Java9Parser.ReceiverParameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThrows_(Java9Parser.Throws_Context ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExceptionTypeList(Java9Parser.ExceptionTypeListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExceptionType(Java9Parser.ExceptionTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodBody(Java9Parser.MethodBodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInstanceInitializer(Java9Parser.InstanceInitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStaticInitializer(Java9Parser.StaticInitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstructorDeclaration(Java9Parser.ConstructorDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstructorModifier(Java9Parser.ConstructorModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstructorDeclarator(Java9Parser.ConstructorDeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpleTypeName(Java9Parser.SimpleTypeNameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstructorBody(Java9Parser.ConstructorBodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExplicitConstructorInvocation(Java9Parser.ExplicitConstructorInvocationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumDeclaration(Java9Parser.EnumDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumBody(Java9Parser.EnumBodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumConstantList(Java9Parser.EnumConstantListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumConstant(Java9Parser.EnumConstantContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumConstantModifier(Java9Parser.EnumConstantModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumBodyDeclarations(Java9Parser.EnumBodyDeclarationsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterfaceDeclaration(Java9Parser.InterfaceDeclarationContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNormalInterfaceDeclaration(Java9Parser.NormalInterfaceDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterfaceModifier(Java9Parser.InterfaceModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExtendsInterfaces(Java9Parser.ExtendsInterfacesContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterfaceBody(Java9Parser.InterfaceBodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterfaceMemberDeclaration(Java9Parser.InterfaceMemberDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstantDeclaration(Java9Parser.ConstantDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstantModifier(Java9Parser.ConstantModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterfaceMethodDeclaration(Java9Parser.InterfaceMethodDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInterfaceMethodModifier(Java9Parser.InterfaceMethodModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnnotationTypeDeclaration(Java9Parser.AnnotationTypeDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnnotationTypeBody(Java9Parser.AnnotationTypeBodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnnotationTypeMemberDeclaration(Java9Parser.AnnotationTypeMemberDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnnotationTypeElementDeclaration(Java9Parser.AnnotationTypeElementDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnnotationTypeElementModifier(Java9Parser.AnnotationTypeElementModifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDefaultValue(Java9Parser.DefaultValueContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAnnotation(Java9Parser.AnnotationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNormalAnnotation(Java9Parser.NormalAnnotationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElementValuePairList(Java9Parser.ElementValuePairListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElementValuePair(Java9Parser.ElementValuePairContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElementValue(Java9Parser.ElementValueContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElementValueArrayInitializer(Java9Parser.ElementValueArrayInitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElementValueList(Java9Parser.ElementValueListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMarkerAnnotation(Java9Parser.MarkerAnnotationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSingleElementAnnotation(Java9Parser.SingleElementAnnotationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArrayInitializer(Java9Parser.ArrayInitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariableInitializerList(Java9Parser.VariableInitializerListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlock(Java9Parser.BlockContext ctx) {
//        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlockStatements(Java9Parser.BlockStatementsContext ctx) {
//        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlockStatement(Java9Parser.BlockStatementContext ctx) {
//        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocalVariableDeclarationStatement(Java9Parser.LocalVariableDeclarationStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocalVariableDeclaration(Java9Parser.LocalVariableDeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement(Java9Parser.StatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatementNoShortIf(Java9Parser.StatementNoShortIfContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatementWithoutTrailingSubstatement(Java9Parser.StatementWithoutTrailingSubstatementContext ctx) {
//        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEmptyStatement(Java9Parser.EmptyStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLabeledStatement(Java9Parser.LabeledStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLabeledStatementNoShortIf(Java9Parser.LabeledStatementNoShortIfContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressionStatement(Java9Parser.ExpressionStatementContext ctx) {
//        process(ctx); 
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatementExpression(Java9Parser.StatementExpressionContext ctx) {
//        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIfThenStatement(Java9Parser.IfThenStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIfThenElseStatement(Java9Parser.IfThenElseStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIfThenElseStatementNoShortIf(Java9Parser.IfThenElseStatementNoShortIfContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssertStatement(Java9Parser.AssertStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchStatement(Java9Parser.SwitchStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchBlock(Java9Parser.SwitchBlockContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchBlockStatementGroup(Java9Parser.SwitchBlockStatementGroupContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchLabels(Java9Parser.SwitchLabelsContext ctx) {
        // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchLabel(Java9Parser.SwitchLabelContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumConstantName(Java9Parser.EnumConstantNameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhileStatement(Java9Parser.WhileStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhileStatementNoShortIf(Java9Parser.WhileStatementNoShortIfContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDoStatement(Java9Parser.DoStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForStatement(Java9Parser.ForStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForStatementNoShortIf(Java9Parser.ForStatementNoShortIfContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasicForStatement(Java9Parser.BasicForStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasicForStatementNoShortIf(Java9Parser.BasicForStatementNoShortIfContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForInit(Java9Parser.ForInitContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForUpdate(Java9Parser.ForUpdateContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatementExpressionList(Java9Parser.StatementExpressionListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnhancedForStatement(Java9Parser.EnhancedForStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnhancedForStatementNoShortIf(Java9Parser.EnhancedForStatementNoShortIfContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBreakStatement(Java9Parser.BreakStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitContinueStatement(Java9Parser.ContinueStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitReturnStatement(Java9Parser.ReturnStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThrowStatement(Java9Parser.ThrowStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSynchronizedStatement(Java9Parser.SynchronizedStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTryStatement(Java9Parser.TryStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCatches(Java9Parser.CatchesContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCatchClause(Java9Parser.CatchClauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCatchFormalParameter(Java9Parser.CatchFormalParameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCatchType(Java9Parser.CatchTypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFinally_(Java9Parser.Finally_Context ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTryWithResourcesStatement(Java9Parser.TryWithResourcesStatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitResourceSpecification(Java9Parser.ResourceSpecificationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitResourceList(Java9Parser.ResourceListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitResource(Java9Parser.ResourceContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariableAccess(Java9Parser.VariableAccessContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimary(Java9Parser.PrimaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray(Java9Parser.PrimaryNoNewArrayContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lf_arrayAccess(Java9Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lfno_arrayAccess(Java9Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lf_primary(Java9Parser.PrimaryNoNewArray_lf_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java9Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java9Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lfno_primary(Java9Parser.PrimaryNoNewArray_lfno_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java9Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java9Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassLiteral(Java9Parser.ClassLiteralContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassInstanceCreationExpression(Java9Parser.ClassInstanceCreationExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassInstanceCreationExpression_lf_primary(Java9Parser.ClassInstanceCreationExpression_lf_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassInstanceCreationExpression_lfno_primary(Java9Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeArgumentsOrDiamond(Java9Parser.TypeArgumentsOrDiamondContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFieldAccess(Java9Parser.FieldAccessContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFieldAccess_lf_primary(Java9Parser.FieldAccess_lf_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFieldAccess_lfno_primary(Java9Parser.FieldAccess_lfno_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArrayAccess(Java9Parser.ArrayAccessContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArrayAccess_lf_primary(Java9Parser.ArrayAccess_lf_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArrayAccess_lfno_primary(Java9Parser.ArrayAccess_lfno_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodInvocation(Java9Parser.MethodInvocationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodInvocation_lf_primary(Java9Parser.MethodInvocation_lf_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodInvocation_lfno_primary(Java9Parser.MethodInvocation_lfno_primaryContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArgumentList(Java9Parser.ArgumentListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodReference(Java9Parser.MethodReferenceContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodReference_lf_primary(Java9Parser.MethodReference_lf_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodReference_lfno_primary(Java9Parser.MethodReference_lfno_primaryContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArrayCreationExpression(Java9Parser.ArrayCreationExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDimExprs(Java9Parser.DimExprsContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDimExpr(Java9Parser.DimExprContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstantExpression(Java9Parser.ConstantExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpression(Java9Parser.ExpressionContext ctx) {
//        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaExpression(Java9Parser.LambdaExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaParameters(Java9Parser.LambdaParametersContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInferredFormalParameterList(Java9Parser.InferredFormalParameterListContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaBody(Java9Parser.LambdaBodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignmentExpression(Java9Parser.AssignmentExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignment(Java9Parser.AssignmentContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLeftHandSide(Java9Parser.LeftHandSideContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignmentOperator(Java9Parser.AssignmentOperatorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConditionalExpression(Java9Parser.ConditionalExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConditionalOrExpression(Java9Parser.ConditionalOrExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConditionalAndExpression(Java9Parser.ConditionalAndExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInclusiveOrExpression(Java9Parser.InclusiveOrExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExclusiveOrExpression(Java9Parser.ExclusiveOrExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAndExpression(Java9Parser.AndExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEqualityExpression(Java9Parser.EqualityExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRelationalExpression(Java9Parser.RelationalExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitShiftExpression(Java9Parser.ShiftExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAdditiveExpression(Java9Parser.AdditiveExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMultiplicativeExpression(Java9Parser.MultiplicativeExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnaryExpression(Java9Parser.UnaryExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPreIncrementExpression(Java9Parser.PreIncrementExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPreDecrementExpression(Java9Parser.PreDecrementExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnaryExpressionNotPlusMinus(Java9Parser.UnaryExpressionNotPlusMinusContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPostfixExpression(Java9Parser.PostfixExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPostIncrementExpression(Java9Parser.PostIncrementExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPostIncrementExpression_lf_postfixExpression(Java9Parser.PostIncrementExpression_lf_postfixExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPostDecrementExpression(Java9Parser.PostDecrementExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPostDecrementExpression_lf_postfixExpression(Java9Parser.PostDecrementExpression_lf_postfixExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCastExpression(Java9Parser.CastExpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdentifier(Java9Parser.IdentifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

}
