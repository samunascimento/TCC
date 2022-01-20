package br.ufjf.dcc.gmr.core.mergenature.controller.visitors;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.SyntaxStructure;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.python3.PythonParser;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.python3.PythonParserBaseVisitor;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author João Pedro Lima
 */
public class PythonVisitor extends PythonParserBaseVisitor<Object> {

    private List<SyntaxStructure> list;

    public List<SyntaxStructure> getList() {
        return list;
    }

    public PythonVisitor() {
        list = new ArrayList<>();
    }

    public void process(ParserRuleContext ctx) {
        //Getting structure type
        String[] aux = Thread.currentThread().getStackTrace()[2].toString().split(".visit");
        aux = aux[aux.length - 1].split("\\(");

        //Adding text
        String ctxText = ctx.getText().replaceAll(";", ";\n").replaceAll("\\{", "\\{\n").replaceAll("\\}", "\\}\n").replaceAll("\n;", ";");

        //Adding in list
        list.add(
                new SyntaxStructure(ctx.getStart(), ctx.getStop(), aux[0], ctxText));

    }

    @Override
    public Object visitArray_initializer(PythonParser.Array_initializerContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArray(PythonParser.ArrayContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRoot(PythonParser.RootContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSingle_input(PythonParser.Single_inputContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFile_input(PythonParser.File_inputContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunction_call(PythonParser.Function_callContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitEval_input(PythonParser.Eval_inputContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStmt(PythonParser.StmtContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIf_stmt(PythonParser.If_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhile_stmt(PythonParser.While_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_stmt(PythonParser.For_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTry_stmt(PythonParser.Try_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWith_stmt(PythonParser.With_stmtContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClass_or_func_def_stmt(PythonParser.Class_or_func_def_stmtContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSuite(PythonParser.SuiteContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDecorator(PythonParser.DecoratorContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElif_clause(PythonParser.Elif_clauseContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitElse_clause(PythonParser.Else_clauseContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFinally_clause(PythonParser.Finally_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWith_item(PythonParser.With_itemContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExcept_clause(PythonParser.Except_clauseContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClassdef(PythonParser.ClassdefContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFuncdef(PythonParser.FuncdefContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTypedargslist(PythonParser.TypedargslistContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArgs(PythonParser.ArgsContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitKwargs(PythonParser.KwargsContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDef_parameters(PythonParser.Def_parametersContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDef_parameter(PythonParser.Def_parameterContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNamed_parameter(PythonParser.Named_parameterContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSimple_stmt(PythonParser.Simple_stmtContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpr_stmt(PythonParser.Expr_stmtContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrint_stmt(PythonParser.Print_stmtContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDel_stmt(PythonParser.Del_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitPass_stmt(PythonParser.Pass_stmtContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitBreak_stmt(PythonParser.Break_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitContinue_stmt(PythonParser.Continue_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitReturn_stmt(PythonParser.Return_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitRaise_stmt(PythonParser.Raise_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitYield_stmt(PythonParser.Yield_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitImport_stmt(PythonParser.Import_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFrom_stmt(PythonParser.From_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitGlobal_stmt(PythonParser.Global_stmtContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExec_stmt(PythonParser.Exec_stmtContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssert_stmt(PythonParser.Assert_stmtContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTestlist_star_expr(PythonParser.Testlist_star_exprContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStar_expr(PythonParser.Star_exprContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssign_part(PythonParser.Assign_partContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprlist(PythonParser.ExprlistContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitImport_as_names(PythonParser.Import_as_namesContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitImport_as_name(PythonParser.Import_as_nameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDotted_as_names(PythonParser.Dotted_as_namesContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDotted_as_name(PythonParser.Dotted_as_nameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTest(PythonParser.TestContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVarargslist(PythonParser.VarargslistContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVardef_parameters(PythonParser.Vardef_parametersContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVardef_parameter(PythonParser.Vardef_parameterContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVarargs(PythonParser.VarargsContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVarkwargs(PythonParser.VarkwargsContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLogical_test(PythonParser.Logical_testContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitComparison(PythonParser.ComparisonContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpr(PythonParser.ExprContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitAtom(PythonParser.AtomContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDictorsetmaker(PythonParser.DictorsetmakerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTestlist_comp(PythonParser.Testlist_compContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTestlist(PythonParser.TestlistContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitDotted_name(PythonParser.Dotted_nameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitName(PythonParser.NameContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitNumber(PythonParser.NumberContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitInteger(PythonParser.IntegerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitYield_expr(PythonParser.Yield_exprContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitYield_arg(PythonParser.Yield_argContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitTrailer(PythonParser.TrailerContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArray_acess(PythonParser.Array_acessContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArguments(PythonParser.ArgumentsContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhile_signature(PythonParser.While_signatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitExcept_signature(PythonParser.Except_signatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable(PythonParser.VariableContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunc_signature(PythonParser.Func_signatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitClass_signature(PythonParser.Class_signatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFinally_signature(PythonParser.Finally_signatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_signature(PythonParser.For_signatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitIf_signature(PythonParser.If_signatureContext ctx) {
        process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArglist(PythonParser.ArglistContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArgument(PythonParser.ArgumentContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSubscriptlist(PythonParser.SubscriptlistContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSubscript(PythonParser.SubscriptContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSliceop(PythonParser.SliceopContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitComp_for(PythonParser.Comp_forContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitComp_iter(PythonParser.Comp_iterContext ctx) {
        //process(ctx);
        return visitChildren(ctx);
    }

}
