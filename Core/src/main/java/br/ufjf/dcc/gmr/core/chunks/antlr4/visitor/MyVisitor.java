package br.ufjf.dcc.gmr.core.chunks.antlr4.visitor;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.java.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.*;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.RuleContext;

public class MyVisitor extends JavaParserBaseVisitor<Object> {


   

    private List<MethodDeclarationBinding> methodDeclarationBindingList;
    private List<MethodCallBinding> methodCallBidingList;
    private List<VariableBinding> variableBindingList;
    private PackageBinding packageBinding;
    private static List<TypeBinding> typeBindingList = new ArrayList<>();
    private TypeBinding typeBinding;
    private boolean firstAnalysis;
    private boolean secondAnalysis;
       

    public MyVisitor() {
        
        this.packageBinding = new PackageBinding();        
        this.typeBinding = new TypeBinding();
        this.typeBindingList.add(this.typeBinding);  
        this.methodCallBidingList = new ArrayList<>();
        this.methodDeclarationBindingList = new ArrayList<>();
        this.variableBindingList = new ArrayList<>();        
    }
    
    

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
        return super.visitArguments(ctx);
    }

    @Override
    public Object visitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        //log(ctx);
        return super.visitExplicitGenericInvocationSuffix(ctx);
    }

    @Override
    public Object visitSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        //log(ctx);
        return super.visitSuperSuffix(ctx);
    }

    @Override
    public Object visitTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        //log(ctx);
        return super.visitTypeArguments(ctx);
    }

    @Override
    public Object visitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitPrimitiveType(ctx);
    }

    @Override
    public Object visitTypeType(JavaParser.TypeTypeContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitTypeType(ctx);
    }

    @Override
    public Object visitTypeList(JavaParser.TypeListContext ctx) {
        //log(ctx);
        return super.visitTypeList(ctx);
    }

    @Override
    public Object visitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        //log(ctx);
        return super.visitNonWildcardTypeArguments(ctx);
    }

    @Override
    public Object visitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        //log(ctx);
        return super.visitNonWildcardTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public Object visitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        //log(ctx);
        return super.visitTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public Object visitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        //log(ctx);
        return super.visitExplicitGenericInvocation(ctx);
    }

    @Override
    public Object visitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitClassCreatorRest(ctx);
    }

    @Override
    public Object visitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        //log(ctx);
        return super.visitArrayCreatorRest(ctx);
    }

    @Override
    public Object visitInnerCreator(JavaParser.InnerCreatorContext ctx) {
        //log(ctx);
        return super.visitInnerCreator(ctx);
    }

    @Override
    public Object visitCreatedName(JavaParser.CreatedNameContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitCreatedName(ctx);
    }

    @Override
    public Object visitCreator(JavaParser.CreatorContext ctx) {
        //log(ctx);
        return super.visitCreator(ctx);
    }

    @Override
    public Object visitClassType(JavaParser.ClassTypeContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitClassType(ctx);
    }

    @Override
    public Object visitPrimary(JavaParser.PrimaryContext ctx) {
        //log(ctx);
        return super.visitPrimary(ctx);
    }

    @Override
    public Object visitLambdaBody(JavaParser.LambdaBodyContext ctx) {
        //log(ctx);
        return super.visitLambdaBody(ctx);
    }

    @Override
    public Object visitLambdaParameters(JavaParser.LambdaParametersContext ctx) {
        //log(ctx);
        return super.visitLambdaParameters(ctx);
    }

    @Override
    public Object visitLambdaExpression(JavaParser.LambdaExpressionContext ctx) {
        //log(ctx);
        return super.visitLambdaExpression(ctx);
    }

    @Override
    public Object visitExpression(JavaParser.ExpressionContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");

        return super.visitExpression(ctx);
    }

    @Override
    public Object visitMethodCall(JavaParser.MethodCallContext ctx) {
        
        if(!this.secondAnalysis){
            return super.visitMethodCall(ctx);
        }
        
        MethodCallBinding methodCallBinding = new MethodCallBinding();
        VariableBinding variableOrigin = new VariableBinding();
        List<TypeBinding> parameters = new ArrayList<>();

        ParserRuleContext parent = ctx.getParent();

        if (parent != null && parent instanceof JavaParser.ExpressionContext) {
            

            for (int i = 0; i < variableBindingList.size(); i++) {
                if (parent.children.get(0).getText().equals(variableBindingList.get(i).getName())) {
                    variableOrigin.setName(variableBindingList.get(i).getName());
                    variableOrigin.setType(variableBindingList.get(i).getType());
                    break;
                }else{
                    variableOrigin.setName("Not Declared");
                    variableOrigin.setType(null);                  
                    
                }
     
                
                
            }
            methodCallBinding.setVariableOrigin(variableOrigin);
            
           

            methodCallBinding.setVariableOrigin(variableOrigin);
            
        }

        methodCallBinding.setName(ctx.IDENTIFIER().getText());
        methodCallBinding.setCtx(ctx);
        
      
        

        JavaParser.ExpressionListContext expressionList
                = (JavaParser.ExpressionListContext) ctx.expressionList();

        if (expressionList != null) {
            for (ParseTree parseTree : expressionList.children) {
                if (parseTree instanceof JavaParser.ExpressionContext) {
                    TypeBinding parameterTypeBinding = new TypeBinding();
                    //Check
                    parameterTypeBinding.setPackageBinding(packageBinding);

                    JavaParser.ExpressionContext expressionContext = (JavaParser.ExpressionContext) parseTree;

                    /**
                     * TODO: treat expression in expression
                     */
                    if (expressionContext.primary() != null) {

                        JavaParser.PrimaryContext primary = expressionContext.primary();

                        if (primary.literal() != null) {
                            JavaParser.LiteralContext literal = primary.literal();

                            if (literal.BOOL_LITERAL() != null) {
                                
                                parameterTypeBinding.setName("bool");

                            } else if (literal.CHAR_LITERAL() != null) {
                               
                                parameterTypeBinding.setName("char");
                            } else if (literal.NULL_LITERAL() != null) {
                                
                                parameterTypeBinding.setName("null");
                            } else if (literal.STRING_LITERAL() != null) {
                                
                                parameterTypeBinding.setName("String");

                            } else if (literal.integerLiteral() != null) {
                               
                                parameterTypeBinding.setName("int");
                            } else if (literal.floatLiteral() != null) {
                                
                                parameterTypeBinding.setName("float");
                            } else {
                                System.out.println("ERROR: MyVisitor:217=D");
                            }

                        } else {
                            //it is a type 
                            for (int i = 0; i < variableBindingList.size(); i++) {
                                if (expressionContext.primary().getText().equals(variableBindingList.get(i).getName())) {
                                    parameterTypeBinding.setName(variableBindingList.get(i).getType().getName());
                                }
                            }
                        }

//                        if (expressionContext.primary().literal() != null) {
//                            parameterTypeBinding.setIdentifier(expressionContext.primary().literal().getText());
//
//                        }
                        parameters.add(parameterTypeBinding);
                    }

                }

            }
        }
        

        methodCallBinding.setParameters(parameters);
        
          if (!methodCallBinding.getVariableOrigin().getName().equals("Not Declared")) {
                for (MethodDeclarationBinding methodDeclarationBinding : methodCallBinding.getVariableOrigin().getType().getMdbList()) {
                    if(methodCallBinding.getName().equals(methodDeclarationBinding.getName())){
                        methodCallBidingList.add(methodCallBinding);
                    }
                }
            }
        
        
        return super.visitMethodCall(ctx);
    }

    @Override
    public Object visitExpressionList(JavaParser.ExpressionListContext ctx) {
        //log(ctx);
        return super.visitExpressionList(ctx);
    }

    @Override
    public Object visitParExpression(JavaParser.ParExpressionContext ctx) {
        //log(ctx);
        return super.visitParExpression(ctx);
    }

    @Override
    public Object visitEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        //log(ctx);
        return super.visitEnhancedForControl(ctx);
    }

    @Override
    public Object visitForInit(JavaParser.ForInitContext ctx) {
        //log(ctx);
        return super.visitForInit(ctx);
    }

    @Override
    public Object visitForControl(JavaParser.ForControlContext ctx) {
        //log(ctx);
        return super.visitForControl(ctx);
    }

    @Override
    public Object visitSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        //log(ctx);
        return super.visitSwitchLabel(ctx);
    }

    @Override
    public Object visitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        //log(ctx);
        return super.visitSwitchBlockStatementGroup(ctx);
    }

    @Override
    public Object visitResource(JavaParser.ResourceContext ctx) {
        //log(ctx);
        return super.visitResource(ctx);
    }

    @Override
    public Object visitResources(JavaParser.ResourcesContext ctx) {
        //log(ctx);
        return super.visitResources(ctx);
    }

    @Override
    public Object visitResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        //log(ctx);
        return super.visitResourceSpecification(ctx);
    }

    @Override
    public Object visitFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitFinallyBlock(ctx);
    }

    @Override
    public Object visitCatchType(JavaParser.CatchTypeContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitCatchType(ctx);
    }

    @Override
    public Object visitCatchClause(JavaParser.CatchClauseContext ctx) {
        //log(ctx);
        return super.visitCatchClause(ctx);
    }

    @Override
    public Object visitStatement(JavaParser.StatementContext ctx) {
        //log(ctx);
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitLocalTypeDeclaration(JavaParser.LocalTypeDeclarationContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitLocalTypeDeclaration(ctx);
    }

    @Override
    public Object visitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        
        if(!this.secondAnalysis){
           return super.visitLocalVariableDeclaration(ctx);
        }

        VariableBinding variable = new VariableBinding();     
        TypeBinding type = new TypeBinding();
        String name = "";

        if (ctx.typeType().classOrInterfaceType() != null) {
            name= ctx.typeType().classOrInterfaceType().getText();
            for (TypeBinding typeBinding1 : this.typeBindingList) {
                if(ctx.typeType().classOrInterfaceType().getText().equals(typeBinding1.getName())){
                    variable.setType(typeBinding1);
                }
            }

        } else if (ctx.typeType().primitiveType() != null) {
            name= ctx.typeType().primitiveType().getText();
              for (TypeBinding typeBinding1 : this.typeBindingList) {
                if(ctx.typeType().primitiveType().getText().equals(typeBinding1.getName())){
                    variable.setType(typeBinding1);
                }
            }

        }
        if(variable.getType() == null){
            type.setName(name);
            type.setPackageBinding(packageBinding);
            
            variable.setType(type);
        }
        
        System.out.println(variable.getType());
        

        if (ctx.variableDeclarators().variableDeclarator() != null) {
            for (JavaParser.VariableDeclaratorContext variableDeclarator : ctx.variableDeclarators().variableDeclarator()) {
                name = variableDeclarator.variableDeclaratorId().getText();
                variable.setName(name);
            }
        }
        getVariableBindingList().add(variable);

        return super.visitLocalVariableDeclaration(ctx);
    }

    @Override
    public Object visitBlockStatement(JavaParser.BlockStatementContext ctx) {
        //log(ctx);
        return super.visitBlockStatement(ctx);
    }

    @Override
    public Object visitBlock(JavaParser.BlockContext ctx) {
        //log(ctx);
        return super.visitBlock(ctx);
    }

    @Override
    public Object visitDefaultValue(JavaParser.DefaultValueContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitDefaultValue(ctx);
    }

    @Override
    public Object visitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitAnnotationConstantRest(ctx);
    }

    @Override
    public Object visitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        //log(ctx);
        return super.visitAnnotationMethodRest(ctx);
    }

    @Override
    public Object visitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitAnnotationMethodOrConstantRest(ctx);
    }

    @Override
    public Object visitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitAnnotationTypeElementRest(ctx);
    }

    @Override
    public Object visitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitAnnotationTypeElementDeclaration(ctx);
    }

    @Override
    public Object visitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        //log(ctx);
        return super.visitAnnotationTypeBody(ctx);
    }

    @Override
    public Object visitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        //log(ctx);
        return super.visitAnnotationTypeDeclaration(ctx);
    }

    @Override
    public Object visitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitElementValueArrayInitializer(ctx);
    }

    @Override
    public Object visitElementValue(JavaParser.ElementValueContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitElementValue(ctx);
    }

    @Override
    public Object visitElementValuePair(JavaParser.ElementValuePairContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitElementValuePair(ctx);
    }

    @Override
    public Object visitElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitElementValuePairs(ctx);
    }

    @Override
    public Object visitAnnotation(JavaParser.AnnotationContext ctx) {
        //log(ctx);
        return super.visitAnnotation(ctx);
    }

    @Override
    public Object visitFloatLiteral(JavaParser.FloatLiteralContext ctx) {
        //log(ctx);
        return super.visitFloatLiteral(ctx);
    }

    @Override
    public Object visitIntegerLiteral(JavaParser.IntegerLiteralContext ctx) {
        //log(ctx);
        return super.visitIntegerLiteral(ctx);
    }

    @Override
    public Object visitLiteral(JavaParser.LiteralContext ctx) {
        //log(ctx);
        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitQualifiedName(JavaParser.QualifiedNameContext ctx) {
        //log(ctx);
        return super.visitQualifiedName(ctx);
    }

    @Override
    public Object visitLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        //log(ctx);
        return super.visitLastFormalParameter(ctx);
    }

    @Override
    public Object visitFormalParameter(JavaParser.FormalParameterContext ctx) {
        //log(ctx);
        return super.visitFormalParameter(ctx);
    }

    @Override
    public Object visitFormalParameterList(JavaParser.FormalParameterListContext ctx) {
        //log(ctx);
        return super.visitFormalParameterList(ctx);
    }

    @Override
    public Object visitFormalParameters(JavaParser.FormalParametersContext ctx) {
        //log(ctx);
        return super.visitFormalParameters(ctx);
    }

    @Override
    public Object visitQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        //log(ctx);
        return super.visitQualifiedNameList(ctx);
    }

    @Override
    public Object visitTypeArgument(JavaParser.TypeArgumentContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitTypeArgument(ctx);
    }

    @Override
    public Object visitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        //log(ctx);
        return super.visitClassOrInterfaceType(ctx);
    }

    @Override
    public Object visitArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        //log(ctx);
        return super.visitArrayInitializer(ctx);
    }

    @Override
    public Object visitVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        //log(ctx);
        return super.visitVariableInitializer(ctx);
    }

    @Override
    public Object visitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        //log(ctx);
        return super.visitVariableDeclaratorId(ctx);
    }

    @Override
    public Object visitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        //log(ctx);
        return super.visitVariableDeclarator(ctx);
    }

    @Override
    public Object visitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
        //log(ctx);
        return super.visitVariableDeclarators(ctx);
    }

    @Override
    public Object visitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitGenericInterfaceMethodDeclaration(ctx);
    }

    @Override
    public Object visitInterfaceMethodModifier(JavaParser.InterfaceMethodModifierContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitInterfaceMethodModifier(ctx);
    }

    @Override
    public Object visitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        //log(ctx);
        return super.visitInterfaceMethodDeclaration(ctx);
    }

    @Override
    public Object visitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        //log(ctx);
        return super.visitConstantDeclarator(ctx);
    }

    @Override
    public Object visitConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        //log(ctx);
        return super.visitConstDeclaration(ctx);
    }

    @Override
    public Object visitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        //log(ctx);
        return super.visitInterfaceMemberDeclaration(ctx);
    }

    @Override
    public Object visitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        //log(ctx);
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitInterfaceBodyDeclaration(ctx);
    }

    @Override
    public Object visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        
        if(!this.firstAnalysis){
            return super.visitFieldDeclaration(ctx);
        }
        VariableBinding variable = new VariableBinding();
        TypeBinding type = new TypeBinding();    
        
        if (ctx.typeType() != null) {
            
            type.setName(ctx.typeType().getText());
            type.setPackageBinding(packageBinding);
            variable.setType(type);

        }

        for (JavaParser.VariableDeclaratorContext variableDeclarator : ctx.variableDeclarators().variableDeclarator()) {
            if (variableDeclarator.variableDeclaratorId() != null) {
                variable.setName(variableDeclarator.variableDeclaratorId().getText());
            }
        }

        this.getVariableBindingList().add(variable);
        this.typeBinding.addAttributes(variable);
     
        
        
        return super.visitFieldDeclaration(ctx);
    }

    @Override
    public Object visitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        //log(ctx);
        return super.visitConstructorDeclaration(ctx);
    }

    @Override
    public Object visitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        //log(ctx);
        return super.visitGenericConstructorDeclaration(ctx);
    }

    @Override
    public Object visitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        //log(ctx);
        return super.visitGenericMethodDeclaration(ctx);
    }

    @Override
    public Object visitTypeTypeOrVoid(JavaParser.TypeTypeOrVoidContext ctx) {
        //log(ctx);
        return super.visitTypeTypeOrVoid(ctx);
    }

    @Override
    public Object visitMethodBody(JavaParser.MethodBodyContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitMethodBody(ctx);
    }

    @Override
    public Object visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        
        if(!this.firstAnalysis){
            return super.visitMethodDeclaration(ctx);
        }
        
        List<TypeBinding> parameters = new ArrayList<>();
        TypeBinding methodType = new TypeBinding();
        MethodDeclarationBinding mdb = new MethodDeclarationBinding();

        mdb.setPackageBinding(packageBinding);    
        methodType.setPackageBinding(packageBinding);
        mdb.setName(ctx.IDENTIFIER().getText());
        mdb.setCtx(ctx);
        
        ParserRuleContext memberDeclaration = ctx.getParent();
        ParserRuleContext classBodyDeclaration = memberDeclaration.getParent();        
        ParseTree modifier = classBodyDeclaration.getChild(0);        
        mdb.setModifier(modifier.getText());
        
        JavaParser.TypeTypeOrVoidContext TypeOrVoid = (JavaParser.TypeTypeOrVoidContext) ctx.typeTypeOrVoid();
        if(ctx.typeTypeOrVoid().typeType() == null){
            methodType.setName("void");
        }else if( ctx.typeTypeOrVoid().typeType().primitiveType() != null ){
            methodType.setName(ctx.typeTypeOrVoid().typeType().primitiveType().getText());
        }else if( ctx.typeTypeOrVoid().typeType().classOrInterfaceType() != null){
            methodType.setName(ctx.typeTypeOrVoid().typeType().classOrInterfaceType().getText());
        }       
        
        JavaParser.FormalParameterListContext formalParameters = (JavaParser.FormalParameterListContext) ctx.formalParameters().formalParameterList();
        if (ctx.formalParameters().formalParameterList() != null) {
            for (ParseTree parseTree : formalParameters.children) {
                if (parseTree instanceof JavaParser.FormalParameterContext) {
                    JavaParser.FormalParameterContext aux = (JavaParser.FormalParameterContext) parseTree;
                    TypeBinding parameter = new TypeBinding();
                    if (aux.typeType().classOrInterfaceType() != null) {
                        parameter.setName(aux.typeType().classOrInterfaceType().getText());
                    } else if (aux.typeType().primitiveType() != null) {
                        parameter.setName(aux.typeType().primitiveType().getText());
                    }
                    parameters.add(parameter);
                }
            }
        }
        mdb.setTypeBinding(methodType);
        mdb.setParameters(parameters);
        methodDeclarationBindingList.add(mdb);
       
        typeBinding.getMdbList().add(mdb);
        
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public Object visitMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
        //log(ctx);
        return super.visitMemberDeclaration(ctx);
    }

    @Override
    public Object visitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        //log(ctx);
        return super.visitClassBodyDeclaration(ctx);
    }

    @Override
    public Object visitInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitInterfaceBody(ctx);
    }

    @Override
    public Object visitClassBody(JavaParser.ClassBodyContext ctx) {
        //log(ctx);
        return super.visitClassBody(ctx);
    }

    @Override
    public Object visitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        //log(ctx);
        return super.visitInterfaceDeclaration(ctx);
    }

    @Override
    public Object visitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitEnumBodyDeclarations(ctx);
    }

    @Override
    public Object visitEnumConstant(JavaParser.EnumConstantContext ctx) {
        //log(ctx);
        return super.visitEnumConstant(ctx);
    }

    @Override
    public Object visitEnumConstants(JavaParser.EnumConstantsContext ctx) {
        //log(ctx);
        return super.visitEnumConstants(ctx);
    }

    @Override
    public Object visitEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        //log(ctx);
        return super.visitEnumDeclaration(ctx);
    }

    @Override
    public Object visitTypeBound(JavaParser.TypeBoundContext ctx) {
        //log(ctx);
        return super.visitTypeBound(ctx);
    }

    @Override
    public Object visitTypeParameter(JavaParser.TypeParameterContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitTypeParameter(ctx);
    }

    @Override
    public Object visitTypeParameters(JavaParser.TypeParametersContext ctx) {
        //System.out.println("====================================== NAO TRATADO  ======================================");
        return super.visitTypeParameters(ctx);
    }

    @Override
    public Object visitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        //log(ctx);
        typeBinding.setName(ctx.getChild(1).getText());
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public Object visitVariableModifier(JavaParser.VariableModifierContext ctx) {
        //log(ctx);
        return super.visitVariableModifier(ctx);
    }

    @Override
    public Object visitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
        //log(ctx);
        return super.visitClassOrInterfaceModifier(ctx);
    }

    @Override
    public Object visitModifier(JavaParser.ModifierContext ctx) {
        //log(ctx);
        return super.visitModifier(ctx);
    }

    @Override
    public Object visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        //log(ctx);
             
        return super.visitTypeDeclaration(ctx);
    }

    @Override
    public Object visitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        for (ParseTree parserTree : ctx.children) {
            if (parserTree instanceof JavaParser.QualifiedNameContext) {
                packageBinding.setName(parserTree.getText());
            }
        }
        
        Object visitImportDeclaration = super.visitImportDeclaration(ctx);
        return visitImportDeclaration;
    }

    @Override
    public Object visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        for (ParseTree parseTree : ctx.children) {
            if (parseTree instanceof JavaParser.QualifiedNameContext) {
                packageBinding.setName(parseTree.getText());
            }
        }
        
        Object visitPackageDeclaration = super.visitPackageDeclaration(ctx);
        return visitPackageDeclaration;
    }

    @Override
    public Object visitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        //log(ctx);
        return super.visitCompilationUnit(ctx);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected Object defaultResult() {

        return super.defaultResult();
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }
    
    public Object visitFirst(ParseTree tree) {
        this.firstAnalysis = true;
        this.secondAnalysis = false;
        
        return super.visit(tree);
    }
     
     public Object visitSecond(ParseTree tree) {
        this.firstAnalysis = false;
        this.secondAnalysis = true;
        
        return super.visit(tree);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @return the methodCallBidingList
     */
    public List<MethodCallBinding> getMethodCallBiding() {
        return methodCallBidingList;
    }

    /**
     * @return the methodDeclarationBindingList
     */
    public List<MethodDeclarationBinding> getMethodDeclarationBinding() {
        return methodDeclarationBindingList;
    }

    /**
     * @return the packageBinding
     */
    public PackageBinding getPackageBinding() {
        return packageBinding;
    }

    /**
     * @return the typeBinding
     */
    public TypeBinding getTypeBinding() {
        return typeBinding;
    }

    /**
     * @param methodCallBiding the methodCallBidingList to set
     */
    public void setMethodCallBiding(List<MethodCallBinding> methodCallBiding) {
        this.methodCallBidingList = methodCallBiding;
    }

    /**
     * @param methodDeclarationBinding the methodDeclarationBindingList to set
     */
    public void setMethodDeclarationBinding(List<MethodDeclarationBinding> methodDeclarationBinding) {
        this.methodDeclarationBindingList = methodDeclarationBinding;
    }

    /**
     * @param packageBinding the packageBinding to set
     */
    public void setPackageBinding(PackageBinding packageBinding) {
        this.packageBinding = packageBinding;
    }

    /**
     * @param typeBinding the typeBinding to set
     */
    public void setTypeBinding(TypeBinding typeBinding) {
        this.typeBinding = typeBinding;
    }

    /**
     * @return the variableBindingList
     */
    public List<VariableBinding> getVariableBindingList() {
        return variableBindingList;
    }

    /**
     * @param variableBindingList the variableBindingList to set
     */
    public void setVariableBindingList(List<VariableBinding> variableBindingList) {
        this.variableBindingList = variableBindingList;
    }
     /**
     * @return the firstAnalysis
     */
    public boolean isFirstAnalysis() {
        return firstAnalysis;
    }

    /**
     * @param firstAnalysis the firstAnalysis to set
     */
    public void setFirstAnalysis(boolean firstAnalysis) {
        this.firstAnalysis = firstAnalysis;
    }

    /**
     * @return the secondAnalysis
     */
    public boolean isSecondAnalysis() {
        return secondAnalysis;
    }

    /**
     * @param secondAnalysis the secondAnalysis to set
     */
    public void setSecondAnalysis(boolean secondAnalysis) {
        this.secondAnalysis = secondAnalysis;
    }
    
        /**
     * @return the typeBindingList
     */
    public static List<TypeBinding> getTypeBindingList() {
        return typeBindingList;
    }

    /**
     * @param aTypeBindingList the typeBindingList to set
     */
    public static void setTypeBindingList(List<TypeBinding> aTypeBindingList) {
        typeBindingList = aTypeBindingList;
    }

}
