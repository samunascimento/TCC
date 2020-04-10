package br.ufjf.dcc.gmr.core.jasome.model;


/**
 *
 * @author antonio henrique
 */
public class MethodMetrics {
    Metric ci;
    Metric di;
    Metric fin;
    Metric fout;
    Metric iovars;
    Metric mclc;
    Metric nbd;
    Metric ncomp;
    Metric nop;
    Metric nvar;
    Metric si;
    Metric tloc;
    Metric vg;
    
    private int id;
    private String constructor;
    private String lineEnd;
    private String lineStart;
    private String name; 

    public Metric getCi() {
        return ci;
    }

    public void setCi(Metric ci) {
        this.ci = ci;
    }

    public Metric getDi() {
        return di;
    }

    public void setDi(Metric di) {
        this.di = di;
    }

    public Metric getFin() {
        return fin;
    }

    public void setFin(Metric fin) {
        this.fin = fin;
    }

    public Metric getFout() {
        return fout;
    }

    public void setFout(Metric fout) {
        this.fout = fout;
    }

    public Metric getIovars() {
        return iovars;
    }

    public void setIovars(Metric iovars) {
        this.iovars = iovars;
    }

    public Metric getMclc() {
        return mclc;
    }

    public void setMclc(Metric mclc) {
        this.mclc = mclc;
    }

    public Metric getNbd() {
        return nbd;
    }

    public void setNbd(Metric nbd) {
        this.nbd = nbd;
    }

    public Metric getNcomp() {
        return ncomp;
    }

    public void setNcomp(Metric ncomp) {
        this.ncomp = ncomp;
    }

    public Metric getNop() {
        return nop;
    }

    public void setNop(Metric nop) {
        this.nop = nop;
    }

    public Metric getNvar() {
        return nvar;
    }

    public void setNvar(Metric nvar) {
        this.nvar = nvar;
    }

    public Metric getSi() {
        return si;
    }

    public void setSi(Metric si) {
        this.si = si;
    }

    public Metric getTloc() {
        return tloc;
    }

    public void setTloc(Metric tloc) {
        this.tloc = tloc;
    }

    public Metric getVg() {
        return vg;
    }

    public void setVg(Metric vg) {
        this.vg = vg;
    }
    
        
    public String getLineEnd() {
        return lineEnd;
    }

    public void setLineEnd(String lineEnd) {
        this.lineEnd = lineEnd;
    }

    public String getLineStart() {
        return lineStart;
    }

    public void setLineStart(String lineStart) {
        this.lineStart = lineStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
