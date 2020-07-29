
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ismael
 */
public class UserInterface {

    private Scanner scanner;    

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Ingrese la cantidad de filas:");
        int numRows = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese la cantidad de columnas:");
        int numCols = Integer.valueOf(scanner.nextLine());

        Plane plane = new Plane(numRows, numCols);
        while(true) {
            System.out.println(plane.toString());
            System.out.println("Que desea hacer?");
            System.out.println("1. Ingresar pasajero");
            System.out.println("2. Consultar asiento");
            System.out.println("3. Consultar pasajero");
            System.out.print("Ingrese la opcion: ");
            
            int opcion = Integer.valueOf(scanner.nextLine());
            Passenger newPassenger;
            Seat newSeat;
            String name;
            String lastName;
            int rowLocation;
            String colLocation;
            switch(opcion){
                case 1:{
                    System.out.println("Ingresar pasajero:");
                    System.out.print("Ingrese el nombre del pasajero: ");
                    name = scanner.nextLine();
                    System.out.print("Ingrese el apellido del pasajero: ");
                    lastName = scanner.nextLine();
                    System.out.print("Ingrese la fila del asiento: ");
                    rowLocation = Integer.valueOf(scanner.nextLine());
                    System.out.print("Ingrese la columna del asiento: ");
                    colLocation = scanner.nextLine();
                    newPassenger = new Passenger(name, lastName);
                    newSeat = new Seat(rowLocation, colLocation);
                    newSeat.setPassenger(newPassenger); 
                    newSeat.setCol("X");
                    
                }
            }
            
        }
        
    }
}
