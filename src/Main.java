import Models.*;
import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gson gson = new Gson();
        Clientes objeto = gson.fromJson(Cliente(), Clientes.class);
        System.out.println(objeto.clientes.toString());
//        for (int i = 0;i<objeto.getClienteList().size();i++){
//            System.out.println(objeto.clientes.get(i).formato());
//            for (int j= 0;j<objeto.getClienteList().get(i).getCuentas().size();j++){
//                System.out.println(objeto.clientes.get(i).getCuentas().get(j).formatoCuentas());
//            }
//        }

    }

    public static void Clientes(Clientes clientes){
//        for (int i = 0;i<clientes.getClienteList().size();i++){
//            System.out.println("Lista de Clientes");
//            System.out.println("Nombre: " + clientes.getClienteList().get(i).);
//            System.out.println("Número de tarjeta: " + tarjetas.getNumero_tarjeta());
//            System.out.println("CVV: " + tarjetas.getCvv());
//            System.out.println("Fecha de vencimiento: " + tarjetas.getFecha_vencimiento());
//            System.out.println("Número de cuenta: " + tarjetas.getNumero_cuenta());
//            System.out.println("Arreglo de numeros: " + tarjetas.getNumerosArreglo());
//        }
//
//        System.out.println();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el nombre del cliente");
//        String nombre = scanner.nextLine();
//        for (int i = 0)
    }

    public static String Cliente() {
        return "{\n" +
                "\t\"clientes\":[\n" +
                "\t\t{\n" +
                "\t\t\t\"nombreCliente\":\"Gianni\",\n" +
                "\t\t\t\"apellidoCliente\":\"De Leon\",\n" +
                "\t\t\t\"Cuentas\":[\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"numeroCuenta\":\"12345678\",\n" +
                "\t\t\t\t\t\"nombreCuenta\":\"Chiqui Ahorro\",\n" +
                "\t\t\t\t\t\"beneficiarios\":[\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\"nombreBeneficiario\":\"Kimberly Hernandez\",\n" +
                "\t\t\t\t\t\t\t\"DPIBeneficiario\":\"0912833123332\",\n" +
                "\t\t\t\t\t\t\t\"direccionBeneficiario\":\"Ciudad\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t],\n" +
                "\t\t\t\t\t\"tarjetas\":[\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\"numeroTarjeta\":\"12390812137128\",\n" +
                "\t\t\t\t\t\t\t\"nombreTarjeta\":\"Gianni De Leon\",\n" +
                "\t\t\t\t\t\t\t\"cvv\":123,\n" +
                "\t\t\t\t\t\t\t\"fechaVencimiento\":\"12/02/2023\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t]\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"nombreCliente\":\"Kimberly\",\n" +
                "\t\t\t\"apellidoCliente\":\"Hernandez\",\n" +
                "\t\t\t\"Cuentas\":[\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"numeroCuenta\":\"22212121\",\n" +
                "\t\t\t\t\t\"nombreCuenta\":\"Ahorro con sorteo\",\n" +
                "\t\t\t\t\t\"beneficiarios\":[\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\"nombreBeneficiario\":\"Gianni De Leon\",\n" +
                "\t\t\t\t\t\t\t\"DPIBeneficiario\":\"2221212121\",\n" +
                "\t\t\t\t\t\t\t\"direccionBeneficiario\":\"Mixco\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t],\n" +
                "\t\t\t\t\t\"tarjetas\":[\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\"numeroTarjeta\":\"22222121989898\",\n" +
                "\t\t\t\t\t\t\t\"nombreTarjeta\":\"Kimberly Hernandez\",\n" +
                "\t\t\t\t\t\t\t\"cvv\":221,\n" +
                "\t\t\t\t\t\t\t\"fechaVencimiento\":\"02/02/2023\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t]\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"numeroCuenta\":\"2221322222\",\n" +
                "\t\t\t\t\t\"nombreCuenta\":\"Ahorro con intereses\",\n" +
                "\t\t\t\t\t\"beneficiarios\":[\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\"nombreBeneficiario\":\"Gianni De Leon\",\n" +
                "\t\t\t\t\t\t\t\"DPIBeneficiario\":\"2221212121\",\n" +
                "\t\t\t\t\t\t\t\"direccionBeneficiario\":\"Mixco\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\"nombreBeneficiario\":\"Julio Alexander\",\n" +
                "\t\t\t\t\t\t\t\"DPIBeneficiario\":\"32321223233232\",\n" +
                "\t\t\t\t\t\t\t\"direccionBeneficiario\":\"Villa Nueva\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t],\n" +
                "\t\t\t\t\t\"tarjetas\":[\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\"numeroTarjeta\":\"32332323222318\",\n" +
                "\t\t\t\t\t\t\t\"nombreTarjeta\":\"Kimberly Hernandez\",\n" +
                "\t\t\t\t\t\t\t\"cvv\":332,\n" +
                "\t\t\t\t\t\t\t\"fechaVencimiento\":\"03/03/2024\"\n" +
                "\t\t\t\t\t\t},\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\"numeroTarjeta\":\"43443232345\",\n" +
                "\t\t\t\t\t\t\"nombreTarjeta\":\"Gianni De Leon\",\n" +
                "\t\t\t\t\t\t\t\"cvv\":334,\n" +
                "\t\t\t\t\t\t\t\"fechaVencimiento\":\"04/04/2024\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t]\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";
    }
}