package br.ufjf.dcc.gmr.core.mergenature.controller.visitors;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java.JavaParserBaseVisitor;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
/**
 *
 * @author joao
 */
public class JavaVisitor extends JavaParserBaseVisitor<Object> {

    private List<SyntaxStructure> list;
    private boolean warning;
    

    public List<SyntaxStructure> getList() {
        return list;
    }
    
    public JavaVisitor(boolean warning){
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

    @Override
    public Object visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        process(ctx);
        return super.visitPackageDeclaration(ctx);
    }

    @Override
    public Object visitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        process(ctx);
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public Object visitArguments(JavaParser.ArgumentsContext ctx) {
        process(ctx);

        return super.visitArguments(ctx);
    }

    @Override
    public Object visitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        process(ctx);
        return super.visitExplicitGenericInvocationSuffix(ctx);
    }

    @Override
    public Object visitSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        process(ctx);
        return super.visitSuperSuffix(ctx);
    }

    @Override
    public Object visitTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        process(ctx);
        return super.visitTypeArguments(ctx);
    }

    @Override
    public Object visitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
//        process(ctx);
        return super.visitPrimitiveType(ctx);
    }

    @Override
    public Object visitTypeType(JavaParser.TypeTypeContext ctx) {
//        process(ctx);
        return super.visitTypeType(ctx);
    }

    @Override
    public Object visitTypeList(JavaParser.TypeListContext ctx) {
        process(ctx);
        return super.visitTypeList(ctx);
    }

    @Override
    public Object visitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        process(ctx);
        return super.visitNonWildcardTypeArguments(ctx);
    }

    @Override
    public Object visitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        process(ctx);
        return super.visitNonWildcardTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public Object visitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        process(ctx);
        return super.visitTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public Object visitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        process(ctx);
        return super.visitExplicitGenericInvocation(ctx);
    }

    @Override
    public Object visitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
//        process(ctx);
        return super.visitClassCreatorRest(ctx);
    }

    @Override
    public Object visitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        process(ctx);
        return super.visitArrayCreatorRest(ctx);
    }

    @Override
    public Object visitInnerCreator(JavaParser.InnerCreatorContext ctx) {
        process(ctx);
        return super.visitInnerCreator(ctx);
    }

    @Override
    public Object visitCreatedName(JavaParser.CreatedNameContext ctx) {
//        process(ctx);
        return super.visitCreatedName(ctx);
    }

    @Override
    public Object visitCreator(JavaParser.CreatorContext ctx) {
        process(ctx);
        return super.visitCreator(ctx);
    }

    @Override
    public Object visitClassType(JavaParser.ClassTypeContext ctx) {
        process(ctx);
        return super.visitClassType(ctx);
    }

    @Override
    public Object visitPrimary(JavaParser.PrimaryContext ctx) {
//        process(ctx);
        return super.visitPrimary(ctx);
    }

    @Override
    public Object visitLambdaBody(JavaParser.LambdaBodyContext ctx) {
        process(ctx);
        return super.visitLambdaBody(ctx);
    }

    @Override
    public Object visitLambdaParameters(JavaParser.LambdaParametersContext ctx) {
        process(ctx);
        return super.visitLambdaParameters(ctx);
    }

    @Override
    public Object visitLambdaExpression(JavaParser.LambdaExpressionContext ctx) {
        process(ctx);
        return super.visitLambdaExpression(ctx);
    }

    @Override
    public Object visitExpression(JavaParser.ExpressionContext ctx) {
//        process(ctx);
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitMethodCall(JavaParser.MethodCallContext ctx) {
        process(ctx);
        return super.visitMethodCall(ctx);
    }

    @Override
    public Object visitExpressionList(JavaParser.ExpressionListContext ctx) {
//        process(ctx);
        return super.visitExpressionList(ctx);
    }

    @Override
    public Object visitParExpression(JavaParser.ParExpressionContext ctx) {
        process(ctx);
        return super.visitParExpression(ctx);
    }

    @Override
    public Object visitEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        process(ctx);
        return super.visitEnhancedForControl(ctx);
    }

    @Override
    public Object visitForInit(JavaParser.ForInitContext ctx) {
        process(ctx);
        return super.visitForInit(ctx);
    }

    @Override
    public Object visitForControl(JavaParser.ForControlContext ctx) {
        process(ctx);
        return super.visitForControl(ctx);
    }

    @Override
    public Object visitSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        process(ctx);
        return super.visitSwitchLabel(ctx);
    }

    @Override
    public Object visitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        process(ctx);
        return super.visitSwitchBlockStatementGroup(ctx);
    }

    @Override
    public Object visitResource(JavaParser.ResourceContext ctx) {
        process(ctx);
        return super.visitResource(ctx);
    }

    @Override
    public Object visitResources(JavaParser.ResourcesContext ctx) {
        process(ctx);
        return super.visitResources(ctx);
    }

    @Override
    public Object visitResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        process(ctx);
        return super.visitResourceSpecification(ctx);
    }

    @Override
    public Object visitFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        process(ctx);
        return super.visitFinallyBlock(ctx);
    }

    @Override
    public Object visitCatchType(JavaParser.CatchTypeContext ctx) {
        process(ctx);
        return super.visitCatchType(ctx);
    }

    @Override
    public Object visitCatchClause(JavaParser.CatchClauseContext ctx) {
        process(ctx);
        return super.visitCatchClause(ctx);
    }

    @Override
    public Object visitStatement(JavaParser.StatementContext ctx) {
//        process(ctx);
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitLocalTypeDeclaration(JavaParser.LocalTypeDeclarationContext ctx) {
        process(ctx);
        return super.visitLocalTypeDeclaration(ctx);
    }

  @Override
    public Object visitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        process(ctx);
        return super.visitLocalVariableDeclaration(ctx);
    }
    @Override
    public Object visitBlockStatement(JavaParser.BlockStatementContext ctx) {
//        process(ctx);
        return super.visitBlockStatement(ctx);
    }

    @Override
    public Object visitBlock(JavaParser.BlockContext ctx) {
//        process(ctx);
        return super.visitBlock(ctx);
    }

    @Override
    public Object visitDefaultValue(JavaParser.DefaultValueContext ctx) {
        process(ctx);
        return super.visitDefaultValue(ctx);
    }

    @Override
    public Object visitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        process(ctx);
        return super.visitAnnotationConstantRest(ctx);
    }

    @Override
    public Object visitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        process(ctx);
        return super.visitAnnotationMethodRest(ctx);
    }

    @Override
    public Object visitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        process(ctx);
        return super.visitAnnotationMethodOrConstantRest(ctx);
    }

    @Override
    public Object visitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        process(ctx);
        return super.visitAnnotationTypeElementRest(ctx);
    }

    @Override
    public Object visitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        process(ctx);
        return super.visitAnnotationTypeElementDeclaration(ctx);
    }

    @Override
    public Object visitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        process(ctx);
        return super.visitAnnotationTypeBody(ctx);
    }

    @Override
    public Object visitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        process(ctx);
        return super.visitAnnotationTypeDeclaration(ctx);
    }

    @Override
    public Object visitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        process(ctx);
        return super.visitElementValueArrayInitializer(ctx);
    }

    @Override
    public Object visitElementValue(JavaParser.ElementValueContext ctx) {
        process(ctx);
        return super.visitElementValue(ctx);
    }

    @Override
    public Object visitElementValuePair(JavaParser.ElementValuePairContext ctx) {
        process(ctx);
        return super.visitElementValuePair(ctx);
    }

    @Override
    public Object visitElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        process(ctx);
        return super.visitElementValuePairs(ctx);
    }

    @Override
    public Object visitAnnotation(JavaParser.AnnotationContext ctx) {
        process(ctx);
        return super.visitAnnotation(ctx);
    }

    @Override
    public Object visitFloatLiteral(JavaParser.FloatLiteralContext ctx) {
//        process(ctx);
        return super.visitFloatLiteral(ctx);
    }

    @Override
    public Object visitIntegerLiteral(JavaParser.IntegerLiteralContext ctx) {
//        process(ctx);
        return super.visitIntegerLiteral(ctx);
    }

    @Override
    public Object visitLiteral(JavaParser.LiteralContext ctx) {
//        process(ctx);
        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitQualifiedName(JavaParser.QualifiedNameContext ctx) {
//        process(ctx);
        return super.visitQualifiedName(ctx);
    }

    @Override
    public Object visitLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        process(ctx);
        return super.visitLastFormalParameter(ctx);
    }

    @Override
    public Object visitFormalParameter(JavaParser.FormalParameterContext ctx) {
        process(ctx);
        return super.visitFormalParameter(ctx);
    }

    @Override
    public Object visitFormalParameterList(JavaParser.FormalParameterListContext ctx) {
//        process(ctx);
        return super.visitFormalParameterList(ctx);
    }

    @Override
    public Object visitFormalParameters(JavaParser.FormalParametersContext ctx) {
//        process(ctx);
        return super.visitFormalParameters(ctx);
    }

    @Override
    public Object visitQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        process(ctx);
        return super.visitQualifiedNameList(ctx);
    }

    @Override
    public Object visitTypeArgument(JavaParser.TypeArgumentContext ctx) {
        process(ctx);
        return super.visitTypeArgument(ctx);
    }

    @Override
    public Object visitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
//        process(ctx);
        return super.visitClassOrInterfaceType(ctx);
    }

    @Override
    public Object visitArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        process(ctx);
        return super.visitArrayInitializer(ctx);
    }

    @Override
    public Object visitVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        process(ctx);
        return super.visitVariableInitializer(ctx);
    }

    @Override
    public Object visitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
//        process(ctx);
        return super.visitVariableDeclaratorId(ctx);
    }

    @Override
    public Object visitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
//        process(ctx);
        return super.visitVariableDeclarator(ctx);
    }

    @Override
    public Object visitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
//        process(ctx);
        return super.visitVariableDeclarators(ctx);
    }

    @Override
    public Object visitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        process(ctx);
        return super.visitGenericInterfaceMethodDeclaration(ctx);
    }

    @Override
    public Object visitInterfaceMethodModifier(JavaParser.InterfaceMethodModifierContext ctx) {
        process(ctx);
        return super.visitInterfaceMethodModifier(ctx);
    }

    @Override
    public Object visitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        process(ctx);
        return super.visitInterfaceMethodDeclaration(ctx);
    }

    @Override
    public Object visitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        process(ctx);
        return super.visitConstantDeclarator(ctx);
    }

    @Override
    public Object visitConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        process(ctx);
        return super.visitConstDeclaration(ctx);
    }

    @Override
    public Object visitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        process(ctx);
        return super.visitInterfaceMemberDeclaration(ctx);
    }

    @Override
    public Object visitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        process(ctx);
        return super.visitInterfaceBodyDeclaration(ctx);
    }

    @Override
    public Object visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        process(ctx);
        return super.visitFieldDeclaration(ctx);
    }

    @Override
    public Object visitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        process(ctx);
        return super.visitConstructorDeclaration(ctx);
    }

    @Override
    public Object visitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        process(ctx);
        return super.visitGenericConstructorDeclaration(ctx);
    }

    @Override
    public Object visitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        process(ctx);
        return super.visitGenericMethodDeclaration(ctx);
    }

    @Override
    public Object visitTypeTypeOrVoid(JavaParser.TypeTypeOrVoidContext ctx) {
//        process(ctx);
        return super.visitTypeTypeOrVoid(ctx);
    }

    @Override
    public Object visitMethodBody(JavaParser.MethodBodyContext ctx) {
//        process(ctx);
        return super.visitMethodBody(ctx);
    }

    @Override
    public Object visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        process(ctx);
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public Object visitMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
//        process(ctx);
        return super.visitMemberDeclaration(ctx);
    }

    @Override
    public Object visitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
//        process(ctx);
        return super.visitClassBodyDeclaration(ctx);
    }

    @Override
    public Object visitInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        process(ctx);
        return super.visitInterfaceBody(ctx);
    }

    @Override
    public Object visitClassBody(JavaParser.ClassBodyContext ctx) {
//        process(ctx);
        return super.visitClassBody(ctx);
    }

    @Override
    public Object visitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        process(ctx);
        return super.visitInterfaceDeclaration(ctx);
    }

    @Override
    public Object visitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        process(ctx);
        return super.visitEnumBodyDeclarations(ctx);
    }

    @Override
    public Object visitEnumConstant(JavaParser.EnumConstantContext ctx) {
        process(ctx);
        return super.visitEnumConstant(ctx);
    }

    @Override
    public Object visitEnumConstants(JavaParser.EnumConstantsContext ctx) {
        process(ctx);
        return super.visitEnumConstants(ctx);
    }

    @Override
    public Object visitEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        process(ctx);
        return super.visitEnumDeclaration(ctx);
    }

    @Override
    public Object visitTypeBound(JavaParser.TypeBoundContext ctx) {
        process(ctx);
        return super.visitTypeBound(ctx);
    }

    @Override
    public Object visitTypeParameter(JavaParser.TypeParameterContext ctx) {
        process(ctx);
        return super.visitTypeParameter(ctx);
    }

    @Override
    public Object visitTypeParameters(JavaParser.TypeParametersContext ctx) {
        process(ctx);
        return super.visitTypeParameters(ctx);
    }

    @Override
    public Object visitVariableModifier(JavaParser.VariableModifierContext ctx) {
        process(ctx);
        return super.visitVariableModifier(ctx);
    }

    @Override
    public Object visitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
//        process(ctx);
        return super.visitClassOrInterfaceModifier(ctx);
    }

    @Override
    public Object visitModifier(JavaParser.ModifierContext ctx) {
//        process(ctx);
        return super.visitModifier(ctx);
    }

    @Override
    public Object visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
//        process(ctx);
        return super.visitTypeDeclaration(ctx);
    }

    @Override
    public Object visitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        process(ctx);
        return super.visitImportDeclaration(ctx);
    }

    @Override
    public Object visitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
//        process(ctx);
        return super.visitCompilationUnit(ctx);
    }

}
