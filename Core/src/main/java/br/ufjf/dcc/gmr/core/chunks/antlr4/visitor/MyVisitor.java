package br.ufjf.dcc.gmr.core.chunks.antlr4.visitor;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParser;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.JavaParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor extends JavaParserBaseVisitor<Object> {
    
    public static void log(ParserRuleContext ctx) {
        Token start = ctx.getStart();
        Token stop = ctx.getStop();
        System.out.println(Thread.currentThread().getStackTrace()[2].toString()
                + " \n\tLine begin= " + start.getLine()
                + " \n\tLine end =" + stop.getLine()
                + " \n\tColumn begin =" + (start.getCharPositionInLine() + 1) + " - " + (start.getCharPositionInLine() + start.getText().length())
                + " \n\tColumn end =" + (stop.getCharPositionInLine() + 1) + " - " + (stop.getCharPositionInLine() + stop.getText().length())
                + "\n\tText:"
                + "\n\t\t" + ctx.getText()
                + "\n\n"
        );
    }
    
    @Override
    public Object visitArguments(JavaParser.ArgumentsContext ctx) {
        //log(ctx);
        return super.visitArguments(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        //log(ctx);
        return super.visitExplicitGenericInvocationSuffix(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        //log(ctx);
        return super.visitSuperSuffix(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        //log(ctx);
        return super.visitTypeArguments(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
        //log(ctx);
        return super.visitPrimitiveType(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTypeType(JavaParser.TypeTypeContext ctx) {
        //log(ctx);
        return super.visitTypeType(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTypeList(JavaParser.TypeListContext ctx) {
        //log(ctx);
        return super.visitTypeList(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        //log(ctx);
        return super.visitNonWildcardTypeArguments(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        //log(ctx);
        return super.visitNonWildcardTypeArgumentsOrDiamond(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        //log(ctx);
        return super.visitTypeArgumentsOrDiamond(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        //log(ctx);
        return super.visitExplicitGenericInvocation(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
        //log(ctx);
        return super.visitClassCreatorRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        //log(ctx);
        return super.visitArrayCreatorRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitInnerCreator(JavaParser.InnerCreatorContext ctx) {
        //log(ctx);
        return super.visitInnerCreator(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitCreatedName(JavaParser.CreatedNameContext ctx) {
        //log(ctx);
        return super.visitCreatedName(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitCreator(JavaParser.CreatorContext ctx) {
        //log(ctx);
        return super.visitCreator(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitClassType(JavaParser.ClassTypeContext ctx) {
        //log(ctx);
        return super.visitClassType(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitPrimary(JavaParser.PrimaryContext ctx) {
        //log(ctx);
        return super.visitPrimary(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitLambdaBody(JavaParser.LambdaBodyContext ctx) {
        //log(ctx);
        return super.visitLambdaBody(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitLambdaParameters(JavaParser.LambdaParametersContext ctx) {
        //log(ctx);
        return super.visitLambdaParameters(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitLambdaExpression(JavaParser.LambdaExpressionContext ctx) {
        //log(ctx);
        return super.visitLambdaExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitExpression(JavaParser.ExpressionContext ctx) {
        //log(ctx);
        return super.visitExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitMethodCall(JavaParser.MethodCallContext ctx) {
        //log(ctx);
        return super.visitMethodCall(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitExpressionList(JavaParser.ExpressionListContext ctx) {
        //log(ctx);
        return super.visitExpressionList(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitParExpression(JavaParser.ParExpressionContext ctx) {
        //log(ctx);
        return super.visitParExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        //log(ctx);
        return super.visitEnhancedForControl(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitForInit(JavaParser.ForInitContext ctx) {
        //log(ctx);
        return super.visitForInit(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitForControl(JavaParser.ForControlContext ctx) {
        //log(ctx);
        return super.visitForControl(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        //log(ctx);
        return super.visitSwitchLabel(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        //log(ctx);
        return super.visitSwitchBlockStatementGroup(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitResource(JavaParser.ResourceContext ctx) {
        //log(ctx);
        return super.visitResource(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitResources(JavaParser.ResourcesContext ctx) {
        //log(ctx);
        return super.visitResources(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        //log(ctx);
        return super.visitResourceSpecification(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        //log(ctx);
        return super.visitFinallyBlock(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitCatchType(JavaParser.CatchTypeContext ctx) {
        //log(ctx);
        return super.visitCatchType(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitCatchClause(JavaParser.CatchClauseContext ctx) {
        //log(ctx);
        return super.visitCatchClause(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitStatement(JavaParser.StatementContext ctx) {
        //log(ctx);
        return super.visitStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitLocalTypeDeclaration(JavaParser.LocalTypeDeclarationContext ctx) {
        //log(ctx);
        return super.visitLocalTypeDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        //log(ctx);
        return super.visitLocalVariableDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitBlockStatement(JavaParser.BlockStatementContext ctx) {
        //log(ctx);
        return super.visitBlockStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitBlock(JavaParser.BlockContext ctx) {
        //log(ctx);
        return super.visitBlock(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitDefaultValue(JavaParser.DefaultValueContext ctx) {
        //log(ctx);
        return super.visitDefaultValue(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        //log(ctx);
        return super.visitAnnotationConstantRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        //log(ctx);
        return super.visitAnnotationMethodRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        //log(ctx);
        return super.visitAnnotationMethodOrConstantRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        //log(ctx);
        return super.visitAnnotationTypeElementRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        //log(ctx);
        return super.visitAnnotationTypeElementDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        //log(ctx);
        return super.visitAnnotationTypeBody(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        //log(ctx);
        return super.visitAnnotationTypeDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        //log(ctx);
        return super.visitElementValueArrayInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitElementValue(JavaParser.ElementValueContext ctx) {
        //log(ctx);
        return super.visitElementValue(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitElementValuePair(JavaParser.ElementValuePairContext ctx) {
        //log(ctx);
        return super.visitElementValuePair(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        //log(ctx);
        return super.visitElementValuePairs(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitAnnotation(JavaParser.AnnotationContext ctx) {
        //log(ctx);
        return super.visitAnnotation(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitFloatLiteral(JavaParser.FloatLiteralContext ctx) {
        //log(ctx);
        return super.visitFloatLiteral(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitIntegerLiteral(JavaParser.IntegerLiteralContext ctx) {
        //log(ctx);
        return super.visitIntegerLiteral(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitLiteral(JavaParser.LiteralContext ctx) {
        //log(ctx);
        return super.visitLiteral(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitQualifiedName(JavaParser.QualifiedNameContext ctx) {
        //log(ctx);
        return super.visitQualifiedName(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        //log(ctx);
        return super.visitLastFormalParameter(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitFormalParameter(JavaParser.FormalParameterContext ctx) {
        //log(ctx);
        return super.visitFormalParameter(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitFormalParameterList(JavaParser.FormalParameterListContext ctx) {
        //log(ctx);
        return super.visitFormalParameterList(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitFormalParameters(JavaParser.FormalParametersContext ctx) {
        //log(ctx);
        return super.visitFormalParameters(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        //log(ctx);
        return super.visitQualifiedNameList(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTypeArgument(JavaParser.TypeArgumentContext ctx) {
        //log(ctx);
        return super.visitTypeArgument(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        //log(ctx);
        return super.visitClassOrInterfaceType(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        //log(ctx);
        return super.visitArrayInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        //log(ctx);
        return super.visitVariableInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        //log(ctx);
        return super.visitVariableDeclaratorId(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        //log(ctx);
        return super.visitVariableDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
        //log(ctx);
        return super.visitVariableDeclarators(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        //log(ctx);
        return super.visitGenericInterfaceMethodDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitInterfaceMethodModifier(JavaParser.InterfaceMethodModifierContext ctx) {
        //log(ctx);
        return super.visitInterfaceMethodModifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        //log(ctx);
        return super.visitInterfaceMethodDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        //log(ctx);
        return super.visitConstantDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        //log(ctx);
        return super.visitConstDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        //log(ctx);
        return super.visitInterfaceMemberDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        //log(ctx);
        return super.visitInterfaceBodyDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        //log(ctx);
        return super.visitFieldDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        //log(ctx);
        return super.visitConstructorDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        //log(ctx);
        return super.visitGenericConstructorDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        //log(ctx);
        return super.visitGenericMethodDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTypeTypeOrVoid(JavaParser.TypeTypeOrVoidContext ctx) {
        //log(ctx);
        return super.visitTypeTypeOrVoid(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitMethodBody(JavaParser.MethodBodyContext ctx) {
        //log(ctx);
        return super.visitMethodBody(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        //log(ctx);
        return super.visitMethodDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
        //log(ctx);
        return super.visitMemberDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        //log(ctx);
        return super.visitClassBodyDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        //log(ctx);
        return super.visitInterfaceBody(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitClassBody(JavaParser.ClassBodyContext ctx) {
        //log(ctx);
        return super.visitClassBody(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        //log(ctx);
        return super.visitInterfaceDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        //log(ctx);
        return super.visitEnumBodyDeclarations(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitEnumConstant(JavaParser.EnumConstantContext ctx) {
        //log(ctx);
        return super.visitEnumConstant(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitEnumConstants(JavaParser.EnumConstantsContext ctx) {
        //log(ctx);
        return super.visitEnumConstants(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        //log(ctx);
        return super.visitEnumDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTypeBound(JavaParser.TypeBoundContext ctx) {
        //log(ctx);
        return super.visitTypeBound(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTypeParameter(JavaParser.TypeParameterContext ctx) {
        //log(ctx);
        return super.visitTypeParameter(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTypeParameters(JavaParser.TypeParametersContext ctx) {
        //log(ctx);
        return super.visitTypeParameters(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        //log(ctx);
        return super.visitClassDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitVariableModifier(JavaParser.VariableModifierContext ctx) {
        //log(ctx);
        return super.visitVariableModifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
        //log(ctx);
        return super.visitClassOrInterfaceModifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitModifier(JavaParser.ModifierContext ctx) {
        //log(ctx);
        return super.visitModifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        //log(ctx);
        return super.visitTypeDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        //log(ctx);
        return super.visitImportDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        //log(ctx);
        return super.visitPackageDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        //log(ctx);
        return super.visitCompilationUnit(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected Object defaultResult() {
        
        return super.defaultResult(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
