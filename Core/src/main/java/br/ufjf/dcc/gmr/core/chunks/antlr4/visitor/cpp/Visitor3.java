/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.chunks.antlr4.visitor.cpp;

/**
 *
 * @author ketleen
 */
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp.ImportBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp.MethodCallBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp.ParametersBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp.TypeBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp.VariableDeclarationBinding;
import br.ufjf.dcc.gmr.core.chunks.antlr4.binding.cpp.VariableUsageBinding;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14BaseVisitor;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.cpp.CPP14Parser;
import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class Visitor3 extends CPP14BaseVisitor<Object> {

    private String typeString;
    private List<VariableDeclarationBinding> variableDeclaration;
    private List<MethodCallBinding> methodCall;
    private List<VariableUsageBinding> variableUsage;
    private boolean isFunctionInvocation = false;

    public Visitor3() {
        this.typeString = "";
        this.variableDeclaration = new ArrayList<>();
        this.methodCall = new ArrayList<>();
        this.variableUsage = new ArrayList<>();
    }

    public List<VariableDeclarationBinding> getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(List<VariableDeclarationBinding> variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public List<MethodCallBinding> getMethodCall() {
        return methodCall;
    }

    public void setMethodCall(List<MethodCallBinding> methodCallBinding) {
        this.methodCall = methodCallBinding;
    }

    public List<VariableUsageBinding> getVariableUsage() {
        return variableUsage;
    }

    public void setVariableUsage(List<VariableUsageBinding> variableUsage) {
        this.variableUsage = variableUsage;
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

    public boolean containDeclaration(String name) {
        for (int i = 0; i < variableDeclaration.size(); i++) {
            if (variableDeclaration.get(i).getName().contains(name)) {
                return true;
            }
        }
        return false;
    }

//    public List<ParametersBinding> parameters(ParserRuleContext ctx) {
//        List<ParametersBinding> list = new ArrayList<>();
//        String[] s = null;
//
//        if (ctx.getText().contains("(")) {
//            s = ctx.getText().split(",");
//        }
//        System.out.println("=============TESTE============");
//        for (String item : s) {
//            System.out.println(item);
//        }
//        return list;
//    }

    @Override
    public Object visitFunctioninvocation(CPP14Parser.FunctioninvocationContext ctx) {
//            log(ctx);

        if (ctx.getText().contains("->")) {
            int aux = 0;
            if (ctx.getText().contains("(")) {
                for (int i = 0; i < ctx.getChildCount(); i++) {
                    if (ctx.getChild(i) instanceof CPP14Parser.ExpressionlistContext) {
                        MethodCallBinding e = new MethodCallBinding(ctx.getText());
                        methodCall.add(e);
                        System.out.println("Chamada Ponteiro com parametro: " + ctx.getText());

                        aux++;
                    }
                }
                if (aux == 0) {
                    System.out.println("Chamada Ponteiro SEM parametro: " + ctx.getText());
                    MethodCallBinding e = new MethodCallBinding(ctx.getText());
                    methodCall.add(e);
                }
            } else {
                System.out.println("Ponteiro instanciando atributo: " + ctx.getText());
            }
        } else {
            int aux = 0;
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i) instanceof CPP14Parser.ExpressionlistContext) {
                    System.out.println("Chamada com parametro: " + ctx.getText());
                    MethodCallBinding e = new MethodCallBinding(ctx.getText());
                    methodCall.add(e);
                    aux++;
                }
            }
            if (aux == 0) {
                System.out.println("Chamada SEM parametro: " + ctx.getText());
                MethodCallBinding e = new MethodCallBinding(ctx.getText());
                methodCall.add(e);
            }
        }
        isFunctionInvocation = true;
        Object visitChildren = visitChildren(ctx);
        isFunctionInvocation = false;
        return visitChildren;
    }

    @Override
    public Object visitDeclspecifierseq(CPP14Parser.DeclspecifierseqContext ctx) {
//            log(ctx);
        if (!(ctx.getParent() instanceof CPP14Parser.DeclspecifierseqContext)) {
            this.typeString = returnText(ctx);
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitPtrdeclarator(CPP14Parser.PtrdeclaratorContext ctx) {
//            log(ctx);
        if (findParentPointerDeclaration(ctx) || findParentVariableDeclaration(ctx)) {
            if (!(ctx.getParent() instanceof CPP14Parser.PtrdeclaratorContext)) {
                TypeBinding typeS = new TypeBinding(this.typeString);
                VariableDeclarationBinding variavel = new VariableDeclarationBinding(ctx.getText(), typeS);
                if (!containDeclaration(variavel.getName())) {
                    variableDeclaration.add(variavel);
                    System.out.println("Variavel: " + this.typeString + " " + ctx.getText());
                }
            }
        }

        return visitChildren(ctx);
    }

    public boolean findChildPd(ParserRuleContext ctx) {
        return ctx.getText().contains("(");
    }

    public boolean findParentPd(ParserRuleContext ctx) {
        if (ctx.getParent() == null) {
            return false;
        }

        if (ctx.getParent() instanceof CPP14Parser.ParameterdeclarationContext) {
            return true;
        }

        return findParentPd(ctx.getParent());
    }

    @Override
    public Object visitDeclarator(CPP14Parser.DeclaratorContext ctx) {
        //    log(ctx);

//            if(findChildPd(ctx))
//                System.out.println("metodo: "  + this.modifierS + " " + this.typeString  + " " + ctx.getText());
//            else{
//                if(!findParentPd(ctx))
//                    System.out.println("atributo: " +  this.modifierS + " " + this.typeString  + " " + ctx.getText());
//                else
//                    System.out.println("\tparametros: " + this.typeString  + " " + ctx.getText());
//            }
//            
//            this.typeString = "";
        return visitChildren(ctx);
    }

    public boolean findParentPointerDeclaration(ParserRuleContext ctx) {
        if (ctx.getParent() == null) {
            return false;
        }

        if (ctx.getParent() instanceof CPP14Parser.PointerdeclarationContext) {
            return true;
        }

        return findParentPointerDeclaration(ctx.getParent());
    }

    public boolean findParentVariableDeclaration(ParserRuleContext ctx) {
        if (ctx.getParent() == null) {
            return false;
        }

        if (ctx.getParent() instanceof CPP14Parser.VariabledeclarationContext) {
            return true;
        }

        return findParentVariableDeclaration(ctx.getParent());
    }

    public String returnText(CPP14Parser.DeclspecifierseqContext ctx) {
        String specifier = "";

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof CPP14Parser.DeclspecifierContext) {
                specifier += ctx.getChild(i).getText();
            }
            if (ctx.getChild(i) instanceof CPP14Parser.DeclspecifierseqContext) {
                specifier += " " + returnText((CPP14Parser.DeclspecifierseqContext) ctx.getChild(i));
            }
        }

        return specifier;
    }

    @Override
    public Object visitPointerdeclaration(CPP14Parser.PointerdeclarationContext ctx) {
        //           log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacesignature(CPP14Parser.NamespacesignatureContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIfstatement(CPP14Parser.IfstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPseudodestructcaller(CPP14Parser.PseudodestructcallerContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPseudodestructdeclaration(CPP14Parser.PseudodestructdeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariabledeclaration(CPP14Parser.VariabledeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRealassignmentexpression(CPP14Parser.RealassignmentexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDirective(CPP14Parser.DirectiveContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArrayaccess(CPP14Parser.ArrayaccessContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArraydeclaration(CPP14Parser.ArraydeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCatchexpression(CPP14Parser.CatchexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctiontryblockexpression(CPP14Parser.FunctiontryblockexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTryblockexpression(CPP14Parser.TryblockexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitReturnstatement(CPP14Parser.ReturnstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitContinuestatement(CPP14Parser.ContinuestatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBreakstatement(CPP14Parser.BreakstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchexpression(CPP14Parser.SwitchexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIfexpression(CPP14Parser.IfexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCaseexpression(CPP14Parser.CaseexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasicforexpression(CPP14Parser.BasicforexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnhancedforexpression(CPP14Parser.EnhancedforexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDostatement(CPP14Parser.DostatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhileexpression(CPP14Parser.WhileexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRealcastexpression(CPP14Parser.RealcastexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionhead(CPP14Parser.FunctionheadContext ctx) {
        //log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTranslationunit(CPP14Parser.TranslationunitContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryexpression(CPP14Parser.PrimaryexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdexpression(CPP14Parser.IdexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnqualifiedid(CPP14Parser.UnqualifiedidContext ctx) {
        //            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQualifiedid(CPP14Parser.QualifiedidContext ctx) {
//              log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNestednamespecifier(CPP14Parser.NestednamespecifierContext ctx) {
        //          log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaexpression(CPP14Parser.LambdaexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaintroducer(CPP14Parser.LambdaintroducerContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdacapture(CPP14Parser.LambdacaptureContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCapturedefault(CPP14Parser.CapturedefaultContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCapturelist(CPP14Parser.CapturelistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCapture(CPP14Parser.CaptureContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimplecapture(CPP14Parser.SimplecaptureContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitcapture(CPP14Parser.InitcaptureContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdadeclarator(CPP14Parser.LambdadeclaratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPostfixexpression(CPP14Parser.PostfixexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeidofexpr(CPP14Parser.TypeidofexprContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeidofthetypeid(CPP14Parser.TypeidofthetypeidContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressionlist(CPP14Parser.ExpressionlistContext ctx) {
//            log(ctx);

        return visitChildren(ctx);
    }

    @Override
    public Object visitPseudodestructorname(CPP14Parser.PseudodestructornameContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnaryexpression(CPP14Parser.UnaryexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnaryoperator(CPP14Parser.UnaryoperatorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewexpression(CPP14Parser.NewexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewplacement(CPP14Parser.NewplacementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewtypeid(CPP14Parser.NewtypeidContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewdeclarator(CPP14Parser.NewdeclaratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoptrnewdeclarator(CPP14Parser.NoptrnewdeclaratorContext ctx) {
//            log(ctx);

        return visitChildren(ctx);
    }

    @Override
    public Object visitNewinitializer(CPP14Parser.NewinitializerContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeleteexpression(CPP14Parser.DeleteexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoexceptexpression(CPP14Parser.NoexceptexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCastexpression(CPP14Parser.CastexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPmexpression(CPP14Parser.PmexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMultiplicativeexpression(CPP14Parser.MultiplicativeexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAdditiveexpression(CPP14Parser.AdditiveexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitShiftexpression(CPP14Parser.ShiftexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitShiftoperator(CPP14Parser.ShiftoperatorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRelationalexpression(CPP14Parser.RelationalexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEqualityexpression(CPP14Parser.EqualityexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAndexpression(CPP14Parser.AndexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExclusiveorexpression(CPP14Parser.ExclusiveorexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInclusiveorexpression(CPP14Parser.InclusiveorexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLogicalandexpression(CPP14Parser.LogicalandexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLogicalorexpression(CPP14Parser.LogicalorexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConditionalexpression(CPP14Parser.ConditionalexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignmentexpression(CPP14Parser.AssignmentexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignmentoperator(CPP14Parser.AssignmentoperatorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    public void expression(CPP14Parser.ExpressionContext ctx) throws NullPointerException {

        System.out.println(ctx.getText());

        String name;
        if (ctx.expression() != null) {
            name = assigmentExpression(ctx.assignmentexpression());
            if (!containDeclaration(name)) {
                VariableDeclarationBinding variable = new VariableDeclarationBinding();
                variable.setName(name);
                variableDeclaration.add(variable);
                System.out.println("New Variavel: " + name);
            } else {
                VariableUsageBinding variable = new VariableUsageBinding();
                variable.setName(name);
                variable.setCtx(ctx);
                variableUsage.add(variable);

                System.out.println("Variavel: " + name);
            }

            expression(ctx.expression());
        } else {
            CPP14Parser.RealassignmentexpressionContext realassignmentexpression = ctx.assignmentexpression().realassignmentexpression();

            CPP14Parser.MultiplicativeexpressionContext multiplicativeexpression = realassignmentexpression.logicalorexpression().logicalandexpression().inclusiveorexpression().
                    exclusiveorexpression().andexpression().equalityexpression().relationalexpression().shiftexpression()
                    .additiveexpression().multiplicativeexpression();

            if (multiplicativeexpression.multiplicativeexpression() != null) {

                String type = multiplicativeexpression.multiplicativeexpression().getText();
                name = multiplicativeexpression.pmexpression().getText();
                if (!containDeclaration(name)) {
                    TypeBinding tipo = new TypeBinding(type);
                    VariableDeclarationBinding variable = new VariableDeclarationBinding(name, tipo);
                    variableDeclaration.add(variable);
                    System.out.println("Tipo: " + type + "  Variavel: " + name);
                }
            } else {
                name = multiplicativeexpression.pmexpression().getText();
                VariableUsageBinding variable = new VariableUsageBinding();
                variable.setName(name);
                variable.setCtx(ctx);
                variableUsage.add(variable);
                System.out.println("Variavel: " + name);
            }

        }

    }

    public String assigmentExpression(CPP14Parser.AssignmentexpressionContext assignmentexpression) {

        System.out.println(assignmentexpression.getText());
        if (assignmentexpression.conditionalexpression() != null) {
            String text = assignmentexpression.conditionalexpression().getText();
            return text.replace("*", "").replaceAll(" ", "");
        } else if (assignmentexpression.realassignmentexpression() != null) {
            return assignmentexpression.realassignmentexpression().logicalorexpression().logicalandexpression()
                    .inclusiveorexpression().exclusiveorexpression().andexpression().equalityexpression().
                    relationalexpression().shiftexpression().additiveexpression().multiplicativeexpression().
                    pmexpression().castexpression().unaryexpression().castexpression().getText().
                    replaceAll(" ", "");
        } else {
            System.out.println("================================================");
            System.out.println("==================BIG PROBLEM===================");
            System.out.println("================================================");
        }

        return null;
    }

    @Override
    public Object visitExpression(CPP14Parser.ExpressionContext ctx) {
//            log(ctx);
        try {
            expression(ctx);
        } catch (NullPointerException ex) {

        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstantexpression(CPP14Parser.ConstantexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement(CPP14Parser.StatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLabeledstatement(CPP14Parser.LabeledstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressionstatement(CPP14Parser.ExpressionstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCompoundstatement(CPP14Parser.CompoundstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatementseq(CPP14Parser.StatementseqContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSelectionstatement(CPP14Parser.SelectionstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCondition(CPP14Parser.ConditionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIterationstatement(CPP14Parser.IterationstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForinitstatement(CPP14Parser.ForinitstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForrangedeclaration(CPP14Parser.ForrangedeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForrangeinitializer(CPP14Parser.ForrangeinitializerContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitJumpstatement(CPP14Parser.JumpstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclarationstatement(CPP14Parser.DeclarationstatementContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclarationseq(CPP14Parser.DeclarationseqContext ctx) {
        //            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaration(CPP14Parser.DeclarationContext ctx) {
        //           log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlockdeclaration(CPP14Parser.BlockdeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAliasdeclaration(CPP14Parser.AliasdeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpledeclaration(CPP14Parser.SimpledeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatic_assertdeclaration(CPP14Parser.Static_assertdeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEmptydeclaration(CPP14Parser.EmptydeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributedeclaration(CPP14Parser.AttributedeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclspecifier(CPP14Parser.DeclspecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStorageclassspecifier(CPP14Parser.StorageclassspecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionspecifier(CPP14Parser.FunctionspecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypedefname(CPP14Parser.TypedefnameContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypespecifier(CPP14Parser.TypespecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTrailingtypespecifier(CPP14Parser.TrailingtypespecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypespecifierseq(CPP14Parser.TypespecifierseqContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTrailingtypespecifierseq(CPP14Parser.TrailingtypespecifierseqContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpletypespecifier(CPP14Parser.SimpletypespecifierContext ctx) {
//            log(ctx);

//            this.typeString = ctx.getText();
        return visitChildren(ctx);
    }

    @Override
    public Object visitThetypename(CPP14Parser.ThetypenameContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDecltypespecifier(CPP14Parser.DecltypespecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElaboratedtypespecifier(CPP14Parser.ElaboratedtypespecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumname(CPP14Parser.EnumnameContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumspecifier(CPP14Parser.EnumspecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumhead(CPP14Parser.EnumheadContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOpaqueenumdeclaration(CPP14Parser.OpaqueenumdeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumkey(CPP14Parser.EnumkeyContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumbase(CPP14Parser.EnumbaseContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumeratorlist(CPP14Parser.EnumeratorlistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumeratordefinition(CPP14Parser.EnumeratordefinitionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumerator(CPP14Parser.EnumeratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacename(CPP14Parser.NamespacenameContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOriginalnamespacename(CPP14Parser.OriginalnamespacenameContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacedefinition(CPP14Parser.NamespacedefinitionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamednamespacedefinition(CPP14Parser.NamednamespacedefinitionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOriginalnamespacedefinition(CPP14Parser.OriginalnamespacedefinitionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExtensionnamespacedefinition(CPP14Parser.ExtensionnamespacedefinitionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnnamednamespacedefinition(CPP14Parser.UnnamednamespacedefinitionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacebody(CPP14Parser.NamespacebodyContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacealias(CPP14Parser.NamespacealiasContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacealiasdefinition(CPP14Parser.NamespacealiasdefinitionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQualifiednamespacespecifier(CPP14Parser.QualifiednamespacespecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsingdeclaration(CPP14Parser.UsingdeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsingdirective(CPP14Parser.UsingdirectiveContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAsmdefinition(CPP14Parser.AsmdefinitionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLinkagespecification(CPP14Parser.LinkagespecificationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributespecifierseq(CPP14Parser.AttributespecifierseqContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributespecifier(CPP14Parser.AttributespecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAlignmentspecifier(CPP14Parser.AlignmentspecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributelist(CPP14Parser.AttributelistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttribute(CPP14Parser.AttributeContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributetoken(CPP14Parser.AttributetokenContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributescopedtoken(CPP14Parser.AttributescopedtokenContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributenamespace(CPP14Parser.AttributenamespaceContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributeargumentclause(CPP14Parser.AttributeargumentclauseContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBalancedtokenseq(CPP14Parser.BalancedtokenseqContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBalancedtoken(CPP14Parser.BalancedtokenContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitdeclaratorlist(CPP14Parser.InitdeclaratorlistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitdeclarator(CPP14Parser.InitdeclaratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoptrdeclarator(CPP14Parser.NoptrdeclaratorContext ctx) {
//           log(ctx);
        /*int cont = 0;
            for(int i = 0; i < ctx.getChildCount(); i++){
                if(ctx.getChild(i) instanceof CPP14Parser.ParametersandqualifiersContext){
                    System.out.println("metodo: "  + this.modifierS + " " + this.typeString  + " " + ctx.getText());
                    cont++;
                }
            }
            
            if(ctx.getParent() instanceof CPP14Parser.NoptrdeclaratorContext) {
                cont++;
            }
            if(cont == 0) {
                if(!findParentPd(ctx))
                    System.out.println("atributo: " +  this.modifierS + " " + this.typeString  + " " + ctx.getText());
                //else
                    //System.out.println("parametros: " + this.typeString  + " " + ctx.getText());
            }*/

        return visitChildren(ctx);
    }

    @Override
    public Object visitParametersandqualifiers(CPP14Parser.ParametersandqualifiersContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTrailingreturntype(CPP14Parser.TrailingreturntypeContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPtroperator(CPP14Parser.PtroperatorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCvqualifierseq(CPP14Parser.CvqualifierseqContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCvqualifier(CPP14Parser.CvqualifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRefqualifier(CPP14Parser.RefqualifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaratorid(CPP14Parser.DeclaratoridContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThetypeid(CPP14Parser.ThetypeidContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAbstractdeclarator(CPP14Parser.AbstractdeclaratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPtrabstractdeclarator(CPP14Parser.PtrabstractdeclaratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoptrabstractdeclarator(CPP14Parser.NoptrabstractdeclaratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAbstractpackdeclarator(CPP14Parser.AbstractpackdeclaratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoptrabstractpackdeclarator(CPP14Parser.NoptrabstractpackdeclaratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameterdeclarationclause(CPP14Parser.ParameterdeclarationclauseContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameterdeclarationlist(CPP14Parser.ParameterdeclarationlistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameterdeclaration(CPP14Parser.ParameterdeclarationContext ctx) {
//            log(ctx);
        System.out.println("**Parametros:  " + ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctiondefinition(CPP14Parser.FunctiondefinitionContext ctx) {
        //           log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionbody(CPP14Parser.FunctionbodyContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitializer(CPP14Parser.InitializerContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBraceorequalinitializer(CPP14Parser.BraceorequalinitializerContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitializerclause(CPP14Parser.InitializerclauseContext ctx) {
//            log(ctx);
         if(isFunctionInvocation){
             ParametersBinding param = new ParametersBinding();
             param.setName(ctx.getText());
            methodCall.get(methodCall.size()-1).getParameters().add(param);
            System.out.println("**Parametros:  "+ctx.getText());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitializerlist(CPP14Parser.InitializerlistContext ctx) {
//            log(ctx);
     
        return visitChildren(ctx);
    }

    @Override
    public Object visitBracedinitlist(CPP14Parser.BracedinitlistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassname(CPP14Parser.ClassnameContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassspecifier(CPP14Parser.ClassspecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClasshead(CPP14Parser.ClassheadContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassheadname(CPP14Parser.ClassheadnameContext ctx) {
//            log(ctx);        
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassvirtspecifier(CPP14Parser.ClassvirtspecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClasskey(CPP14Parser.ClasskeyContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberspecification(CPP14Parser.MemberspecificationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberdeclaration(CPP14Parser.MemberdeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberdeclaratorlist(CPP14Parser.MemberdeclaratorlistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberdeclarator(CPP14Parser.MemberdeclaratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVirtspecifierseq(CPP14Parser.VirtspecifierseqContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVirtspecifier(CPP14Parser.VirtspecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPurespecifier(CPP14Parser.PurespecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBaseclause(CPP14Parser.BaseclauseContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasespecifierlist(CPP14Parser.BasespecifierlistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasespecifier(CPP14Parser.BasespecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassordecltype(CPP14Parser.ClassordecltypeContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasetypespecifier(CPP14Parser.BasetypespecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAccessspecifier(CPP14Parser.AccessspecifierContext ctx) {
//            log(ctx);

//            this.modifierS = ctx.getText();
        return visitChildren(ctx);
    }

    @Override
    public Object visitConversionfunctionid(CPP14Parser.ConversionfunctionidContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConversiontypeid(CPP14Parser.ConversiontypeidContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConversiondeclarator(CPP14Parser.ConversiondeclaratorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCtorinitializer(CPP14Parser.CtorinitializerContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMeminitializerlist(CPP14Parser.MeminitializerlistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMeminitializer(CPP14Parser.MeminitializerContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMeminitializerid(CPP14Parser.MeminitializeridContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOperatorfunctionid(CPP14Parser.OperatorfunctionidContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLiteraloperatorid(CPP14Parser.LiteraloperatoridContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplatedeclaration(CPP14Parser.TemplatedeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateparameterlist(CPP14Parser.TemplateparameterlistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateparameter(CPP14Parser.TemplateparameterContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeparameter(CPP14Parser.TypeparameterContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpletemplateid(CPP14Parser.SimpletemplateidContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateid(CPP14Parser.TemplateidContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplatename(CPP14Parser.TemplatenameContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateargumentlist(CPP14Parser.TemplateargumentlistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateargument(CPP14Parser.TemplateargumentContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypenamespecifier(CPP14Parser.TypenamespecifierContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExplicitinstantiation(CPP14Parser.ExplicitinstantiationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExplicitspecialization(CPP14Parser.ExplicitspecializationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTryblock(CPP14Parser.TryblockContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctiontryblock(CPP14Parser.FunctiontryblockContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitHandlerseq(CPP14Parser.HandlerseqContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitHandler(CPP14Parser.HandlerContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExceptiondeclaration(CPP14Parser.ExceptiondeclarationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThrowexpression(CPP14Parser.ThrowexpressionContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExceptionspecification(CPP14Parser.ExceptionspecificationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDynamicexceptionspecification(CPP14Parser.DynamicexceptionspecificationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeidlist(CPP14Parser.TypeidlistContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoexceptspecification(CPP14Parser.NoexceptspecificationContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTheoperator(CPP14Parser.TheoperatorContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLiteral(CPP14Parser.LiteralContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBooleanliteral(CPP14Parser.BooleanliteralContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPointerliteral(CPP14Parser.PointerliteralContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUserdefinedliteral(CPP14Parser.UserdefinedliteralContext ctx) {
//            log(ctx);
        return visitChildren(ctx);
    }
}
