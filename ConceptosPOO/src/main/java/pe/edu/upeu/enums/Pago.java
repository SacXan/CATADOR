package pe.edu.upeu.enums;

enum  TIPO_PAGO{Efectivo, Credito, Tranferencia, Yape};

enum MES{Enero, Febrero};

public class Pago {

    TIPO_PAGO tipo;
    MES mes;
    double monto;
    String cuenta;
    double impuessto;

    public static void main(String[] args) {
        Pago p = new Pago();
        p.tipo = TIPO_PAGO.Efectivo;
        p.mes = MES.Enero;
        p.monto= 100;
        p.cuenta="1234 1234 1234 1234";
        p.impuessto= 10;

        System.out.println("Tipo de pago: "+ p.tipo);
        System.out.println("Mes de pago: "+ p.mes);
        System.out.println("Monto de pago: "+ p.monto);
        System.out.println("Cuenta de pago: "+ p.cuenta);
        System.out.println("Impuessto: "+ p.impuessto);

        for (TIPO_PAGO t : TIPO_PAGO.values()){
            System.out.println("Tipo de pago: "+t);
        }


    }

}
