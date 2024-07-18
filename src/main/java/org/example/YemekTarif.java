package org.example;

public class YemekTarif {
    private String yemekAdi;
    private String malzemeler;
    private String yagCesidi;
    private String PisirmeAraci;

    private YemekTarif(YemekTarifBuilder builder) {
        this.yemekAdi = builder.yemekAdi;
        this.malzemeler = builder.malzemeler;
        this.yagCesidi = builder.yagCesidi;
        this.PisirmeAraci = builder.pisirmeAraci;
    }

    public String getYemekAdi() {
        return yemekAdi;
    }

    public String getMalzemeler() {
        return malzemeler;
    }

    public String getYagCesidi() {
        return yagCesidi;
    }

    public String getPisirmeAraci() {
        return PisirmeAraci;
    }

    public static class YemekTarifBuilder {
        private String yemekAdi;
        private String malzemeler;
        private String yagCesidi;
        private String pisirmeAraci;

        public YemekTarifBuilder() {
        }

        public static YemekTarifBuilder yemektarifimiz() {
            return new YemekTarifBuilder();
        }

        public YemekTarifBuilder yemekAdi(String yemekAdi) {
            this.yemekAdi = yemekAdi;
            return this;
        }

        public YemekTarifBuilder malzemeler(String malzemeler) {
            this.malzemeler = malzemeler;
            return this;
        }

        public YemekTarifBuilder yagCesidi(String yagCesidi) {
            this.yagCesidi = yagCesidi;
            return this;
        }

        public YemekTarifBuilder pisirmeAraci(String pisirmeAraci) {
            this.pisirmeAraci = pisirmeAraci;
            return this;
        }

        public YemekTarif build() {
            return new YemekTarif(this);
        }
    }


    @Override
    public String toString() {
        return "Yemek Tarifi{" +
                "yemekAdi='" + yemekAdi + '\'' +
                ", malzemeler='" + malzemeler + '\'' +
                ", yagCesidi='" + yagCesidi + '\'' +
                ", pisirmeAraci='" + PisirmeAraci + '\'' +
                '}';
    }
}


