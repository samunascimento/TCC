package br.ufjf.dcc.gmr.core.jasome.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonio henrique
 */
public class ClassMetrics {
    Metric aa;
    Metric ad;
    Metric ai;
    Metric ait;
    Metric ao;
    Metric av;
    Metric clrci;
    Metric cltci;
    Metric dit;
    Metric hmd;
    Metric hmi;
    Metric mhf;
    Metric mif;
    Metric ma;
    Metric md;
    Metric mi;
    Metric mit;
    Metric mo;
    Metric nf;
    Metric nm;
    Metric nma;
    Metric nmi;
    Metric noa;
    Metric noch;
    Metric nod;
    Metric nol;
    Metric nopa;
    Metric norm;
    Metric npf;
    Metric npm;
    Metric nsf;
    Metric nsm;
    Metric pmr;
    Metric pmd;
    Metric pmi;
    Metric rtloc;
    Metric six;
    Metric tloc;
    Metric wmc;

    List<MethodMetrics> listMethodsMetrics = new ArrayList<>();
    
    private String lineEnd;
    private String lineStart;
    private String name;
    private String sourceFile;
    
    private boolean error = false;

    public ClassMetrics() {
        this.listMethodsMetrics = new ArrayList<>();
    }

    public List<MethodMetrics> getListMethodsMetrics() {
        return listMethodsMetrics;
    }

    public void setListMethodsMetrics(List<MethodMetrics> listMethodsMetrics) {
        this.listMethodsMetrics = listMethodsMetrics;
    }

    public Metric getAa() {
        return aa;
    }

    public void setAa(Metric aa) {
        this.aa = aa;
    }

    public Metric getAd() {
        return ad;
    }

    public void setAd(Metric ad) {
        this.ad = ad;
    }

    public Metric getAi() {
        return ai;
    }

    public void setAi(Metric ai) {
        this.ai = ai;
    }

    public Metric getAit() {
        return ait;
    }

    public void setAit(Metric ait) {
        this.ait = ait;
    }

    public Metric getAo() {
        return ao;
    }

    public void setAo(Metric ao) {
        this.ao = ao;
    }

    public Metric getAv() {
        return av;
    }

    public void setAv(Metric av) {
        this.av = av;
    }

    public Metric getClrci() {
        return clrci;
    }

    public void setClrci(Metric clrci) {
        this.clrci = clrci;
    }

    public Metric getCltci() {
        return cltci;
    }

    public void setCltci(Metric cltci) {
        this.cltci = cltci;
    }

    public Metric getDit() {
        return dit;
    }

    public void setDit(Metric dit) {
        this.dit = dit;
    }

    public Metric getHmd() {
        return hmd;
    }

    public void setHmd(Metric hmd) {
        this.hmd = hmd;
    }

    public Metric getHmi() {
        return hmi;
    }

    public void setHmi(Metric hmi) {
        this.hmi = hmi;
    }

    public Metric getMhf() {
        return mhf;
    }

    public void setMhf(Metric mhf) {
        this.mhf = mhf;
    }

    public Metric getMif() {
        return mif;
    }

    public void setMif(Metric mif) {
        this.mif = mif;
    }

    public Metric getMa() {
        return ma;
    }

    public void setMa(Metric ma) {
        this.ma = ma;
    }

    public Metric getMd() {
        return md;
    }

    public void setMd(Metric md) {
        this.md = md;
    }

    public Metric getMi() {
        return mi;
    }

    public void setMi(Metric mi) {
        this.mi = mi;
    }

    public Metric getMit() {
        return mit;
    }

    public void setMit(Metric mit) {
        this.mit = mit;
    }

    public Metric getMo() {
        return mo;
    }

    public void setMo(Metric mo) {
        this.mo = mo;
    }

    public Metric getNf() {
        return nf;
    }

    public void setNf(Metric nf) {
        this.nf = nf;
    }

    public Metric getNm() {
        return nm;
    }

    public void setNm(Metric nm) {
        this.nm = nm;
    }

    public Metric getNma() {
        return nma;
    }

    public void setNma(Metric nma) {
        this.nma = nma;
    }

    public Metric getNmi() {
        return nmi;
    }

    public void setNmi(Metric nmi) {
        this.nmi = nmi;
    }

    public Metric getNoa() {
        return noa;
    }

    public void setNoa(Metric noa) {
        this.noa = noa;
    }

    public Metric getNoch() {
        return noch;
    }

    public void setNoch(Metric noch) {
        this.noch = noch;
    }

    public Metric getNod() {
        return nod;
    }

    public void setNod(Metric nod) {
        this.nod = nod;
    }

    public Metric getNol() {
        return nol;
    }

    public void setNol(Metric nol) {
        this.nol = nol;
    }

    public Metric getNopa() {
        return nopa;
    }

    public void setNopa(Metric nopa) {
        this.nopa = nopa;
    }

    public Metric getNorm() {
        return norm;
    }

    public void setNorm(Metric norm) {
        this.norm = norm;
    }

    public Metric getNpf() {
        return npf;
    }

    public void setNpf(Metric npf) {
        this.npf = npf;
    }

    public Metric getNpm() {
        return npm;
    }

    public void setNpm(Metric npm) {
        this.npm = npm;
    }

    public Metric getNsf() {
        return nsf;
    }

    public void setNsf(Metric nsf) {
        this.nsf = nsf;
    }

    public Metric getNsm() {
        return nsm;
    }

    public void setNsm(Metric nsm) {
        this.nsm = nsm;
    }

    public Metric getPmr() {
        return pmr;
    }

    public void setPmr(Metric pmr) {
        this.pmr = pmr;
    }

    public Metric getPmd() {
        return pmd;
    }

    public void setPmd(Metric pmd) {
        this.pmd = pmd;
    }

    public Metric getPmi() {
        return pmi;
    }

    public void setPmi(Metric pmi) {
        this.pmi = pmi;
    }

    public Metric getRtloc() {
        return rtloc;
    }

    public void setRtloc(Metric rtloc) {
        this.rtloc = rtloc;
    }

    public Metric getSix() {
        return six;
    }

    public void setSix(Metric six) {
        this.six = six;
    }

    public Metric getTloc() {
        return tloc;
    }

    public void setTloc(Metric tloc) {
        this.tloc = tloc;
    }

    public Metric getWmc() {
        return wmc;
    }

    public void setWmc(Metric wmc) {
        this.wmc = wmc;
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

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
