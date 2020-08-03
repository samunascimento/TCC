package br.ufjf.dcc.gmr.core.conflictanalysis.controller.visitors;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.cpp.CPP14BaseVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.cpp.CPP14Parser;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author luand
 */
public class CPPVisitor extends CPP14BaseVisitor<Object> {

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

    @Override
    public Object visitDirective(CPP14Parser.DirectiveContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }
    
    @Override
    public Object visitFunctioninvocation(CPP14Parser.FunctioninvocationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArrayaccess(CPP14Parser.ArrayaccessContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }
    
    

    @Override
    public Object visitArraydeclaration(CPP14Parser.ArraydeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCatchexpression(CPP14Parser.CatchexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctiontryblockexpression(CPP14Parser.FunctiontryblockexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTryblockexpression(CPP14Parser.TryblockexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitReturnstatement(CPP14Parser.ReturnstatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitContinuestatement(CPP14Parser.ContinuestatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBreakstatement(CPP14Parser.BreakstatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchexpression(CPP14Parser.SwitchexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIfexpression(CPP14Parser.IfexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCaseexpression(CPP14Parser.CaseexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasicforexpression(CPP14Parser.BasicforexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnhancedforexpression(CPP14Parser.EnhancedforexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDostatement(CPP14Parser.DostatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhileexpression(CPP14Parser.WhileexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRealcastexpression(CPP14Parser.RealcastexpressionContext ctx) {
         process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionhead(CPP14Parser.FunctionheadContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIncludedeclaration(CPP14Parser.IncludedeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTranslationunit(CPP14Parser.TranslationunitContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimaryexpression(CPP14Parser.PrimaryexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdexpression(CPP14Parser.IdexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnqualifiedid(CPP14Parser.UnqualifiedidContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQualifiedid(CPP14Parser.QualifiedidContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNestednamespecifier(CPP14Parser.NestednamespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaexpression(CPP14Parser.LambdaexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdaintroducer(CPP14Parser.LambdaintroducerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdacapture(CPP14Parser.LambdacaptureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCapturedefault(CPP14Parser.CapturedefaultContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCapturelist(CPP14Parser.CapturelistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCapture(CPP14Parser.CaptureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimplecapture(CPP14Parser.SimplecaptureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitcapture(CPP14Parser.InitcaptureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLambdadeclarator(CPP14Parser.LambdadeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPostfixexpression(CPP14Parser.PostfixexpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeidofexpr(CPP14Parser.TypeidofexprContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeidofthetypeid(CPP14Parser.TypeidofthetypeidContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressionlist(CPP14Parser.ExpressionlistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPseudodestructorname(CPP14Parser.PseudodestructornameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnaryexpression(CPP14Parser.UnaryexpressionContext ctx) {
     //   process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnaryoperator(CPP14Parser.UnaryoperatorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewexpression(CPP14Parser.NewexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewplacement(CPP14Parser.NewplacementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewtypeid(CPP14Parser.NewtypeidContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewdeclarator(CPP14Parser.NewdeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoptrnewdeclarator(CPP14Parser.NoptrnewdeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNewinitializer(CPP14Parser.NewinitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeleteexpression(CPP14Parser.DeleteexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoexceptexpression(CPP14Parser.NoexceptexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCastexpression(CPP14Parser.CastexpressionContext ctx) {
    //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPmexpression(CPP14Parser.PmexpressionContext ctx) {
    //    process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMultiplicativeexpression(CPP14Parser.MultiplicativeexpressionContext ctx) {
     //   process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAdditiveexpression(CPP14Parser.AdditiveexpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitShiftexpression(CPP14Parser.ShiftexpressionContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitShiftoperator(CPP14Parser.ShiftoperatorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRelationalexpression(CPP14Parser.RelationalexpressionContext ctx) {
    //    process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEqualityexpression(CPP14Parser.EqualityexpressionContext ctx) {
     //   process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAndexpression(CPP14Parser.AndexpressionContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExclusiveorexpression(CPP14Parser.ExclusiveorexpressionContext ctx) {
      //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInclusiveorexpression(CPP14Parser.InclusiveorexpressionContext ctx) {
      //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLogicalandexpression(CPP14Parser.LogicalandexpressionContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLogicalorexpression(CPP14Parser.LogicalorexpressionContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConditionalexpression(CPP14Parser.ConditionalexpressionContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignmentexpression(CPP14Parser.AssignmentexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssignmentoperator(CPP14Parser.AssignmentoperatorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpression(CPP14Parser.ExpressionContext ctx) {
      //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstantexpression(CPP14Parser.ConstantexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement(CPP14Parser.StatementContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLabeledstatement(CPP14Parser.LabeledstatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressionstatement(CPP14Parser.ExpressionstatementContext ctx) {
    //    process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCompoundstatement(CPP14Parser.CompoundstatementContext ctx) {
      //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatementseq(CPP14Parser.StatementseqContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSelectionstatement(CPP14Parser.SelectionstatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCondition(CPP14Parser.ConditionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIterationstatement(CPP14Parser.IterationstatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForinitstatement(CPP14Parser.ForinitstatementContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForrangedeclaration(CPP14Parser.ForrangedeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitForrangeinitializer(CPP14Parser.ForrangeinitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitJumpstatement(CPP14Parser.JumpstatementContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclarationstatement(CPP14Parser.DeclarationstatementContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclarationseq(CPP14Parser.DeclarationseqContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaration(CPP14Parser.DeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlockdeclaration(CPP14Parser.BlockdeclarationContext ctx) {
     //   process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAliasdeclaration(CPP14Parser.AliasdeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpledeclaration(CPP14Parser.SimpledeclarationContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatic_assertdeclaration(CPP14Parser.Static_assertdeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEmptydeclaration(CPP14Parser.EmptydeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributedeclaration(CPP14Parser.AttributedeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclspecifier(CPP14Parser.DeclspecifierContext ctx) {
      //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclspecifierseq(CPP14Parser.DeclspecifierseqContext ctx) {
      //   process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStorageclassspecifier(CPP14Parser.StorageclassspecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionspecifier(CPP14Parser.FunctionspecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypedefname(CPP14Parser.TypedefnameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypespecifier(CPP14Parser.TypespecifierContext ctx) {
//        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTrailingtypespecifier(CPP14Parser.TrailingtypespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypespecifierseq(CPP14Parser.TypespecifierseqContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTrailingtypespecifierseq(CPP14Parser.TrailingtypespecifierseqContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpletypespecifier(CPP14Parser.SimpletypespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThetypename(CPP14Parser.ThetypenameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDecltypespecifier(CPP14Parser.DecltypespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElaboratedtypespecifier(CPP14Parser.ElaboratedtypespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumname(CPP14Parser.EnumnameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumspecifier(CPP14Parser.EnumspecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumhead(CPP14Parser.EnumheadContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOpaqueenumdeclaration(CPP14Parser.OpaqueenumdeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumkey(CPP14Parser.EnumkeyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumbase(CPP14Parser.EnumbaseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumeratorlist(CPP14Parser.EnumeratorlistContext ctx) {
     //   process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumeratordefinition(CPP14Parser.EnumeratordefinitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnumerator(CPP14Parser.EnumeratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacename(CPP14Parser.NamespacenameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOriginalnamespacename(CPP14Parser.OriginalnamespacenameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacedefinition(CPP14Parser.NamespacedefinitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamednamespacedefinition(CPP14Parser.NamednamespacedefinitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOriginalnamespacedefinition(CPP14Parser.OriginalnamespacedefinitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExtensionnamespacedefinition(CPP14Parser.ExtensionnamespacedefinitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnnamednamespacedefinition(CPP14Parser.UnnamednamespacedefinitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacebody(CPP14Parser.NamespacebodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacealias(CPP14Parser.NamespacealiasContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamespacealiasdefinition(CPP14Parser.NamespacealiasdefinitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitQualifiednamespacespecifier(CPP14Parser.QualifiednamespacespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsingdeclaration(CPP14Parser.UsingdeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUsingdirective(CPP14Parser.UsingdirectiveContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAsmdefinition(CPP14Parser.AsmdefinitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLinkagespecification(CPP14Parser.LinkagespecificationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributespecifierseq(CPP14Parser.AttributespecifierseqContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributespecifier(CPP14Parser.AttributespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAlignmentspecifier(CPP14Parser.AlignmentspecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributelist(CPP14Parser.AttributelistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttribute(CPP14Parser.AttributeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributetoken(CPP14Parser.AttributetokenContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributescopedtoken(CPP14Parser.AttributescopedtokenContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributenamespace(CPP14Parser.AttributenamespaceContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttributeargumentclause(CPP14Parser.AttributeargumentclauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBalancedtokenseq(CPP14Parser.BalancedtokenseqContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBalancedtoken(CPP14Parser.BalancedtokenContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitdeclaratorlist(CPP14Parser.InitdeclaratorlistContext ctx) {
     //   process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitdeclarator(CPP14Parser.InitdeclaratorContext ctx) {
      //  process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclarator(CPP14Parser.DeclaratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPtrdeclarator(CPP14Parser.PtrdeclaratorContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoptrdeclarator(CPP14Parser.NoptrdeclaratorContext ctx) {
       // process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParametersandqualifiers(CPP14Parser.ParametersandqualifiersContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTrailingreturntype(CPP14Parser.TrailingreturntypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPtroperator(CPP14Parser.PtroperatorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCvqualifierseq(CPP14Parser.CvqualifierseqContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCvqualifier(CPP14Parser.CvqualifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRefqualifier(CPP14Parser.RefqualifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaratorid(CPP14Parser.DeclaratoridContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThetypeid(CPP14Parser.ThetypeidContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAbstractdeclarator(CPP14Parser.AbstractdeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPtrabstractdeclarator(CPP14Parser.PtrabstractdeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoptrabstractdeclarator(CPP14Parser.NoptrabstractdeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAbstractpackdeclarator(CPP14Parser.AbstractpackdeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoptrabstractpackdeclarator(CPP14Parser.NoptrabstractpackdeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameterdeclarationclause(CPP14Parser.ParameterdeclarationclauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameterdeclarationlist(CPP14Parser.ParameterdeclarationlistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitParameterdeclaration(CPP14Parser.ParameterdeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctiondefinition(CPP14Parser.FunctiondefinitionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionbody(CPP14Parser.FunctionbodyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitializer(CPP14Parser.InitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBraceorequalinitializer(CPP14Parser.BraceorequalinitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitializerclause(CPP14Parser.InitializerclauseContext ctx) {
     //   process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInitializerlist(CPP14Parser.InitializerlistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBracedinitlist(CPP14Parser.BracedinitlistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassname(CPP14Parser.ClassnameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassspecifier(CPP14Parser.ClassspecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClasshead(CPP14Parser.ClassheadContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassheadname(CPP14Parser.ClassheadnameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassvirtspecifier(CPP14Parser.ClassvirtspecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClasskey(CPP14Parser.ClasskeyContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberspecification(CPP14Parser.MemberspecificationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberdeclaration(CPP14Parser.MemberdeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberdeclaratorlist(CPP14Parser.MemberdeclaratorlistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMemberdeclarator(CPP14Parser.MemberdeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVirtspecifierseq(CPP14Parser.VirtspecifierseqContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVirtspecifier(CPP14Parser.VirtspecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPurespecifier(CPP14Parser.PurespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBaseclause(CPP14Parser.BaseclauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasespecifierlist(CPP14Parser.BasespecifierlistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasespecifier(CPP14Parser.BasespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassordecltype(CPP14Parser.ClassordecltypeContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBasetypespecifier(CPP14Parser.BasetypespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAccessspecifier(CPP14Parser.AccessspecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConversionfunctionid(CPP14Parser.ConversionfunctionidContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConversiontypeid(CPP14Parser.ConversiontypeidContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitConversiondeclarator(CPP14Parser.ConversiondeclaratorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCtorinitializer(CPP14Parser.CtorinitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMeminitializerlist(CPP14Parser.MeminitializerlistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMeminitializer(CPP14Parser.MeminitializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitMeminitializerid(CPP14Parser.MeminitializeridContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitOperatorfunctionid(CPP14Parser.OperatorfunctionidContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLiteraloperatorid(CPP14Parser.LiteraloperatoridContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplatedeclaration(CPP14Parser.TemplatedeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateparameterlist(CPP14Parser.TemplateparameterlistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateparameter(CPP14Parser.TemplateparameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeparameter(CPP14Parser.TypeparameterContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimpletemplateid(CPP14Parser.SimpletemplateidContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateid(CPP14Parser.TemplateidContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplatename(CPP14Parser.TemplatenameContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateargumentlist(CPP14Parser.TemplateargumentlistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTemplateargument(CPP14Parser.TemplateargumentContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypenamespecifier(CPP14Parser.TypenamespecifierContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExplicitinstantiation(CPP14Parser.ExplicitinstantiationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExplicitspecialization(CPP14Parser.ExplicitspecializationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTryblock(CPP14Parser.TryblockContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctiontryblock(CPP14Parser.FunctiontryblockContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitHandlerseq(CPP14Parser.HandlerseqContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitHandler(CPP14Parser.HandlerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExceptiondeclaration(CPP14Parser.ExceptiondeclarationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitThrowexpression(CPP14Parser.ThrowexpressionContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExceptionspecification(CPP14Parser.ExceptionspecificationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDynamicexceptionspecification(CPP14Parser.DynamicexceptionspecificationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypeidlist(CPP14Parser.TypeidlistContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNoexceptspecification(CPP14Parser.NoexceptspecificationContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTheoperator(CPP14Parser.TheoperatorContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLiteral(CPP14Parser.LiteralContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBooleanliteral(CPP14Parser.BooleanliteralContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPointerliteral(CPP14Parser.PointerliteralContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitUserdefinedliteral(CPP14Parser.UserdefinedliteralContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

}
