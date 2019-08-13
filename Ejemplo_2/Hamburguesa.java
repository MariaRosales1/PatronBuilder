
public class Hamburguesa {
    private String Pan= "";
    private String Coberturas[]={} ;
    private String TipoCarne="";
    
    public Hamburguesa(){}
    public String getPan(){
        return this.Pan;
    }
    public String[] getCoberturas(){
        return this.Coberturas;
    }
    public String getTipoCarne(){
        return this.TipoCarne;
    }
    public void setPan(String Pan){
        this.Pan=Pan;
    }
    public void setCoberturas(String[] Coberturas){
        this.Coberturas=Coberturas;
    }
     public void setTipoCarne(String TipoCarne){
        this.TipoCarne=TipoCarne;
    }
}
