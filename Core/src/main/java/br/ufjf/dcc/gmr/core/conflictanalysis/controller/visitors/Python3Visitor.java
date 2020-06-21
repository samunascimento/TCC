/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.conflictanalysis.controller.visitors;

import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.python3.Python3BaseVisitor;
import br.ufjf.dcc.gmr.core.conflictanalysis.antlr4.grammars.python3.Python3Parser;
import br.ufjf.dcc.gmr.core.conflictanalysis.model.SyntaxStructure;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author luand
 */
public class Python3Visitor extends Python3BaseVisitor<Object> {

    private List<SyntaxStructure> list;
    private boolean warning;

    public List<SyntaxStructure> getList() {
        return list;  
    }

    public Python3Visitor(boolean warning) {
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
        list.add(new SyntaxStructure(ctx.getStart(), ctx.getStop(), aux[0],ctxText,warning));
    }

    @Override
    public Object visitSingle_input(Python3Parser.Single_inputContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitFile_input(Python3Parser.File_inputContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitEval_input(Python3Parser.Eval_inputContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitDecorator(Python3Parser.DecoratorContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitDecorators(Python3Parser.DecoratorsContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitDecorated(Python3Parser.DecoratedContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitAsync_funcdef(Python3Parser.Async_funcdefContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitFuncdef(Python3Parser.FuncdefContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitParameters(Python3Parser.ParametersContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitTypedargslist(Python3Parser.TypedargslistContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitTfpdef(Python3Parser.TfpdefContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitVarargslist(Python3Parser.VarargslistContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitVfpdef(Python3Parser.VfpdefContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitStmt(Python3Parser.StmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitSimple_stmt(Python3Parser.Simple_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitSmall_stmt(Python3Parser.Small_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitExpr_stmt(Python3Parser.Expr_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitAnnassign(Python3Parser.AnnassignContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitTestlist_star_expr(Python3Parser.Testlist_star_exprContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitAugassign(Python3Parser.AugassignContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitDel_stmt(Python3Parser.Del_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitPass_stmt(Python3Parser.Pass_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitFlow_stmt(Python3Parser.Flow_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitBreak_stmt(Python3Parser.Break_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitContinue_stmt(Python3Parser.Continue_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitReturn_stmt(Python3Parser.Return_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitYield_stmt(Python3Parser.Yield_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitRaise_stmt(Python3Parser.Raise_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitImport_stmt(Python3Parser.Import_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitImport_name(Python3Parser.Import_nameContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitImport_from(Python3Parser.Import_fromContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitImport_as_name(Python3Parser.Import_as_nameContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitDotted_as_name(Python3Parser.Dotted_as_nameContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitImport_as_names(Python3Parser.Import_as_namesContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitDotted_as_names(Python3Parser.Dotted_as_namesContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitDotted_name(Python3Parser.Dotted_nameContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitGlobal_stmt(Python3Parser.Global_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitNonlocal_stmt(Python3Parser.Nonlocal_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitAssert_stmt(Python3Parser.Assert_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitCompound_stmt(Python3Parser.Compound_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitAsync_stmt(Python3Parser.Async_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitIf_stmt(Python3Parser.If_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitWhile_stmt(Python3Parser.While_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitFor_stmt(Python3Parser.For_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitTry_stmt(Python3Parser.Try_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitWith_stmt(Python3Parser.With_stmtContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitWith_item(Python3Parser.With_itemContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitExcept_clause(Python3Parser.Except_clauseContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitSuite(Python3Parser.SuiteContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitTest(Python3Parser.TestContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitTest_nocond(Python3Parser.Test_nocondContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitLambdef(Python3Parser.LambdefContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitLambdef_nocond(Python3Parser.Lambdef_nocondContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitOr_test(Python3Parser.Or_testContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitAnd_test(Python3Parser.And_testContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitNot_test(Python3Parser.Not_testContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitComparison(Python3Parser.ComparisonContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitComp_op(Python3Parser.Comp_opContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitStar_expr(Python3Parser.Star_exprContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitExpr(Python3Parser.ExprContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitXor_expr(Python3Parser.Xor_exprContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitAnd_expr(Python3Parser.And_exprContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitShift_expr(Python3Parser.Shift_exprContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitArith_expr(Python3Parser.Arith_exprContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitTerm(Python3Parser.TermContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitFactor(Python3Parser.FactorContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitPower(Python3Parser.PowerContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitAtom_expr(Python3Parser.Atom_exprContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitAtom(Python3Parser.AtomContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitTestlist_comp(Python3Parser.Testlist_compContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitTrailer(Python3Parser.TrailerContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitSubscriptlist(Python3Parser.SubscriptlistContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitSubscript(Python3Parser.SubscriptContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitSliceop(Python3Parser.SliceopContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitExprlist(Python3Parser.ExprlistContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitTestlist(Python3Parser.TestlistContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitDictorsetmaker(Python3Parser.DictorsetmakerContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitClassdef(Python3Parser.ClassdefContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitArglist(Python3Parser.ArglistContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitArgument(Python3Parser.ArgumentContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitComp_iter(Python3Parser.Comp_iterContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitComp_for(Python3Parser.Comp_forContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitComp_if(Python3Parser.Comp_ifContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitEncoding_decl(Python3Parser.Encoding_declContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitYield_expr(Python3Parser.Yield_exprContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitYield_arg(Python3Parser.Yield_argContext ctx) {
        process(ctx);
        return super.visitChildren(ctx);
    }

}
