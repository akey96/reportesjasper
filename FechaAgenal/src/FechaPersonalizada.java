//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Calendar;
import java.util.Date;

public class FechaPersonalizada {
    public FechaPersonalizada() {
    }

    public static String fechaCadena(Date date) {
        String mes = "";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int month = 0;

        try {
            month = calendar.get(2);
        } catch (Exception var6) {
        }

        switch(month) {
        case 0:
            mes = "ENERO";
            break;
        case 1:
            mes = "FEBRERO";
            break;
        case 2:
            mes = "MARZO";
            break;
        case 3:
            mes = "ABRIL";
            break;
        case 4:
            mes = "MAYO";
            break;
        case 5:
            mes = "JUNIO";
            break;
        case 6:
            mes = "JULIO";
            break;
        case 7:
            mes = "AGOSTO";
            break;
        case 8:
            mes = "SEPTIEMBRE";
            break;
        case 9:
            mes = "OCTUBRE";
            break;
        case 10:
            mes = "NOVIEMBRE";
            break;
        case 11:
            mes = "DICIEMBRE";
            break;
        default:
            mes = "ERROR";
        }

        String dia = calendar.get(5) < 10 ? "0" + calendar.get(5) : calendar.get(5) + "";
        String anio = calendar.get(1) + "";
        return dia + " DE " + mes + " DE " + anio;
    }

    public static String contenidoNotaCredito(String deposit_type, String deposit_bank_origin, String voucher_number, String number_cheque) {
        String salida = "";
        if (!deposit_type.equals("EFECTIVO")) {
            if (deposit_type.equals("ABONO EN CUENTA")) {
                salida = salida + String.format("%30s", "Voucher: ") + voucher_number;
            } else if (deposit_type.equals("CHEQUE")) {
                salida = String.format("%30s", "Cuenta origen: ") + deposit_bank_origin + "\n\n";
                salida = salida + String.format("%30s", "Nro Cheque: ") + number_cheque;
            }
        }

        return salida;
    }

    public static void main(String[] args) {
        System.out.println(contenidoNotaCredito("ABONO EN CUENTA", (String)null, "vocucher", (String)null));
    }
}
