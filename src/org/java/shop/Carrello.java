package org.java.shop;


import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // chiediamo all'utente di inserire un prodotto
        System.out.println("INSERT NEW PRODUCT");

        boolean exit = false;
        while (!exit){
            System.out.println("Choose operation: 1-Smartphone 2-Televisore 3-Cuffie 4-Exit");
            String choice = scan.nextLine();
            switch (choice){
                case "1":
                    System.out.print("Name: ");
                    String nameInput = scan.nextLine();
                    System.out.print("Brand: ");
                    String brandInput = scan.nextLine();
                    System.out.print("Price: ");
                    BigDecimal priceInput = scan.nextBigDecimal();
                    System.out.print("Iva: ");
                    BigDecimal ivaInput = scan.nextBigDecimal();
                    System.out.print("Mode IMEI: ");
                    int codeIMEIInput = scan.nextInt();
                    System.out.print("Memory: ");
                    int memoryInput = scan.nextInt();

                    Smartphone smartphone = new Smartphone(nameInput,brandInput,priceInput,ivaInput,codeIMEIInput,memoryInput);
                    System.out.println(smartphone.toString());
                    break;

                case "2":
                    System.out.print("Name: ");
                    nameInput = scan.nextLine();
                    System.out.print("Brand: ");
                    brandInput = scan.nextLine();
                    System.out.print("Price: ");
                    priceInput = scan.nextBigDecimal();
                    System.out.print("Iva: ");
                    ivaInput = scan.nextBigDecimal();
                    System.out.print("Dimensioni: ");
                    int dimensioniInput = scan.nextInt();
                    System.out.print("Is Smart? (true/false): ");
                    Boolean smartInput = scan.nextBoolean();



                    Televisori televisori = new Televisori(nameInput,brandInput,priceInput,ivaInput,dimensioniInput,smartInput);
                    System.out.println(televisori.toString());
                    break;

                case "3":
                    System.out.print("Name: ");
                    nameInput = scan.nextLine();
                    System.out.print("Brand: ");
                    brandInput = scan.nextLine();
                    System.out.print("Price: ");
                    priceInput = scan.nextBigDecimal();
                    System.out.print("Iva: ");
                    ivaInput = scan.nextBigDecimal();
                    System.out.print("Color: ");
                    String colorInput = scan.nextLine();
                    System.out.println("Tipo di Cuffie: ");
                    System.out.print("1-wireless 2-cablate: ");
                    String tipoInput = scan.nextLine();
                    switch (tipoInput){
                        case "1":
                            tipoInput = "Wireless";
                            break;
                        case "2":
                            tipoInput = "Cablate: ";
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }

                    Cuffie cuffie = new Cuffie(nameInput,brandInput,priceInput,ivaInput,colorInput,tipoInput);
                    System.out.println(cuffie.toString());

                    break;

                case "4":
                    System.out.println("Exit");
                    // cambio il valore del flag exit
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }




        scan.close();
    }
}
