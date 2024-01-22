package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer idDeudor;
        String tipoDocumento;
        String documento;
        String nombres;
        String apellidos;
        String telefonoFijo;
        String telefonoMovil;
        String direccion;
        Integer idFiador;
        String nombresFiador;
        String documentoFiador;
        double valorBrutoMoto;
        Double valortotalMoto;
        String tipoCompra;
        Boolean tieneLicenciaElConductor;

        Scanner leer = new Scanner(System.in);

        //PROCESO

        System.out.println("********************");
        System.out.println("MUNDO YAMAHA SAN JUAN");
        System.out.println("**********************");

        System.out.println("Apreciado cliente, ¿Cuenta usted con licencia de conduccion?");
        tieneLicenciaElConductor = leer.nextBoolean();

        //CONDICION 1

        if (tieneLicenciaElConductor == true) {
            //SI TIENE LICENCIA
            System.out.print("Nombres del cliente: ");
            nombres= leer.nextLine();


            System.out.print("Apellidos del Cliente: ");
            apellidos= leer.nextLine();


            System.out.print("Tipo documento: ");
            tipoDocumento=leer.nextLine();

            System.out.print("Numero Documento: ");
            documento= leer.nextLine();

            System.out.print("Telefono celular");
            telefonoMovil= leer.nextLine();

            System.out.print("Telefono fijo");
            telefonoFijo=leer.nextLine();

            System.out.print("Direccion: ");
            direccion= leer.nextLine();

            System.out.println("Documento Fiador: ");
            documentoFiador= leer.nextLine();

            System.out.println("Nombres fiador: ");
            nombresFiador=leer.nextLine();

            System.out.println("Nuestras motocicletas: ");
            System.out.println("1. Yamaha SZR-150--$9500000");
            System.out.println("2. Yamaha CRYPTON-FI--$8400000");
            System.out.println("3. Yamaha XTZ-125--$10500000");
            System.out.println("4. Yamaha MT10--$72000000");
            System.out.println("5. Yamaha NMAX-300--$34000000");

            Integer motoSeleccionada;
            System.out.println("Digite la motocicleta deseada: ");
            motoSeleccionada=leer.nextInt();
            Double valorMoto=0.0;
            if (motoSeleccionada==1){
                valorMoto=9500000.0;
            } else if (motoSeleccionada==2) {
                valorMoto=8400000.0;
            } else if (motoSeleccionada==3) {
                valorMoto=10500000.0;

            } else if (motoSeleccionada==4) {
                valorMoto=72000000.0;

            } else if (motoSeleccionada==5) {
                valorMoto=34000000.0;

            }else{
                System.out.println("Moto invalida");
            }

            //PREGUNTA 2 : LO QUIERE A CREDITO?
            System.out.println("Usuario, digite /Credito o / Contado para continuar su compra:");
            leer.nextLine();
            tipoCompra = leer.nextLine().toLowerCase();

            if (tipoCompra.equals("Credito")) {
                //Le pregunto por porcentaje a financiar
                double porcentajeCredito;
                System.out.println("Ingrese porcentaje a financiar: ");
                porcentajeCredito= leer.nextDouble();

                if (porcentajeCredito==1.0){

                     Double valorIntereses=0.25;
                     valorMoto=valorMoto+(valorMoto*valorIntereses);

                } else if (porcentajeCredito==0.7) {
                      Double valotIntereses=0.15;
                } else if (porcentajeCredito==0.5) {

                    Double valorIntereses=0.07;

                } else {
                    System.out.println("Opcion invalida");

                }


            } else {
                System.out.println("Excelente, te daremos descuento del 10%");
            }

        }else{
                //NO TIENE LICENCIA
                System.out.println("Apreciaod usuario no podemos continuar la transaccion");
                System.out.println("Lo invitamso a tramitar su licencia vuelva pronto");
            }


        }
    }
