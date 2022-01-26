import java.util.Scanner;
import java.util.ArrayList;

public class main {
   private static ArrayList<Smartphones> smartphone;

   public static void main(String[] args) {

      Scanner num = new Scanner(System.in);
      String choise;
      // Se comienza el sistema para elegir que se desea hacer
      System.out.println("Sistema de registro de celulares y smartphones de December Labs");
      do {
         System.out.println("Que deseas hacer?");
         System.out.println("a- Ingresar un dispositivo");
         System.out.println("b- Visualizar smartphones almacenados");
         System.out.println("c- Cerrar programa");
         choise = num.nextLine();

         switch (choise) {
            case "a":
               // metodo de creacion de un dispositivo
               createCellphone();
               break;

            case "b":
               // metodo de listado de smartphones
               listSmartphones();
               break;

            case "c":
               // cerrar programa
               break;

            default:
               System.out.println("El numero que ingreso no corresponde a ninguna de la opciones. Ingrese nuevamente");
         }

      } while (!choise.equals("c"));

      System.out.println("Cerrando el programa...");

   }

   // metodo donde se crea celulares y smartphones
   public static void createCellphone() {
      Scanner ber = new Scanner(System.in);
      String brand, model, color, anotherdevice, operativeSyst, deviceChoise, memory;
      
      do {
         System.out.println("¡Que tipo de dispositvo desea registrar?");
         System.out.println("a- Celular");
         System.out.println("b- Smartphone");
         System.out.println("c- Volver atras");

         Boolean repeat = true;
         deviceChoise = ber.nextLine();

         switch (deviceChoise) {
            case "a":
               ArrayList<Cellphone> Celular = new ArrayList<Cellphone>();
               System.out.println("Registro de celulares");
               do {
                  System.out.println("Ingrese la marca:");
                  brand = ber.nextLine();
                  System.out.println("Ingrese el modelo:");
                  model = ber.nextLine();
                  System.out.println("Ingrese el color:");
                  color = ber.nextLine();

                  Cellphone Cel = new Cellphone(brand, model, color);
                  Celular.add(Cel);
                  System.out.println("Se ha ingresado un celular correctamente");

                  System.out.println("¿Desea ingresar otro dispositivo? Si (s) - No (n)");
                  anotherdevice = ber.nextLine();

                  if (anotherdevice == "n") {
                     repeat = false;
                  }
               } while (repeat);

               break;

            case "b":
               smartphone = new ArrayList<Smartphones>();
               
               do {
                  System.out.println("Registro de Smartphones");
                  System.out.println("Ingrese la marca:");
                  brand = ber.nextLine();
                  System.out.println("Ingrese el modelo:");
                  model = ber.nextLine();
                  System.out.println("Ingrese el color:");
                  color = ber.nextLine();
                  System.out.println("Ingrese el sistema operativo");
                  operativeSyst = ber.nextLine();
                  System.out.println("Ingrese cantidad de memoria");
                  memory = ber.nextLine();

                  Smartphones Sma = new Smartphones(brand, model, color, operativeSyst, memory);
                  smartphone.add(Sma);
                  System.out.println("Se ha ingresado un smartphone correctamente");

                  System.out.println("¿Desea ingresar otro dispositivo? Si (s) - No (n)");
                  anotherdevice = ber.nextLine();

                  if (anotherdevice.equals("n")) {
                     repeat = false;
                  }
               } while (repeat);
               break;

            case "c":
               // volver atras
               break;

            default:
               System.out.println("El numero que ingreso no corresponde a ninguna de la opciones. Ingrese nuevamente");
               break;

         }
      } while (!deviceChoise.equals("c"));
   }

   // metodo listado de smartphones
   public static void listSmartphones() {
      Scanner ins = new Scanner(System.in);
      System.out.println("Listado de smartphones ingresados");
      String choiseLS;
      do {
         System.out.println("a- Mostrar smartphones registrados");
         System.out.println("b- Volver atras");
         choiseLS = ins.nextLine();

         switch (choiseLS) {
            case "a":

               for (int i = 0; i < smartphone.size(); i++) {
                  System.out.println("Smartphone " + i + ":");
                  System.out.println(smartphone.get(i).infoSmartphone());

               }
               break;

            case "b":

               break;

            default:
               System.out.println("El numero que ingreso no corresponde a ninguna de la opciones. Ingrese nuevamente");
               break;
         }

      } while (!choiseLS.equals("b"));
   }
}
