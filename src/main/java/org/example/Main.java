package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SingletonDesign singletonDesign = SingletonDesign.getInstance();
        singletonDesign.SingletonMessage();

        YemekTarif yemekTarif = YemekTarif.YemekTarifBuilder.yemektarifimiz()
                .yemekAdi("Menemen")
                .malzemeler("biber, domates, sogan")
                .yagCesidi("zeytinyağ")
                .pisirmeAraci("Sahan")
                .build();
        System.out.println(yemekTarif.toString());


    }
    }
