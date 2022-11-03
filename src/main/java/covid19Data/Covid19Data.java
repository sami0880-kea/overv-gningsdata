package covid19Data;

public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int tilfælde;
    private int død;
    private int indlagteIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int tilfælde, int død, int indlagteIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.tilfælde = tilfælde;
        this.død = død;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    @Override
    public String toString() {
        return "\n[Region: " + region + " - Aldersgruppe: " + aldersgruppe + " - Tilfælde: " + tilfælde + " - Død: " + død + " - Indlagte Intensiv: " + indlagteIntensiv + " - Indlagte: " + indlagte + " - Dato: " + dato + "]";
    }
}
