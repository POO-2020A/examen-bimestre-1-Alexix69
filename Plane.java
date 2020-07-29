
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ismael
 */
public class Plane {

    private Seat seats;
    private int rows;
    private int cols;
    private ArrayList<Seat> plane = new ArrayList<>();

    public Plane(int rows, int cols) {
        if (rows <= 20) {
            this.rows = rows;
        } else {
            this.rows = 20;
        }
        if (cols <= 8) {
            this.cols = cols;
        } else {
            this.cols = 8;
        }

        String printLetters = "";
        for (int indexRows = 1; indexRows <= rows; indexRows++) {
            for (int j = 0; j < cols; j++) {
                switch (j) {
                    case 0:
                        printLetters = "A";
                        break;
                    case 1:
                        printLetters = "B";
                        break;
                    case 2:
                        printLetters = "C";
                        break;
                    case 3:
                        printLetters = "D";
                        break;
                    case 4:
                        printLetters = "E";
                        break;
                    case 5:
                        printLetters = "F";
                        break;
                    case 6:
                        printLetters = "G";
                        break;
                    case 7:
                        printLetters = "H";
                        break;
                    default:
                        break;
                }
                this.seats = new Seat(indexRows, printLetters);
                plane.add(seats);
            }

        }
    }

    public int getRows() {
        return this.rows;
    }

    public int getCols() {
        return this.cols;
    }

    public void setRows(int rowsPlane) {
        this.rows = rowsPlane;
    }

    public void setCols(int colsPlane) {
        this.cols = colsPlane;
    }

    @Override
    public String toString() {
        System.out.println("Este es el mapa del avion: ");
        char col = 0;
        for (int i = 0; i < this.cols; i++) {
            col = (char) ('A' + i);
        }

        String temp = "";
        for (Seat seat : plane) {
            if (seat.getCols().equals("A")) {
                temp += (seat.getRows() + " ");
            }
            if (seat.getCols().equals(col + "")) {
                temp += (seat.getCols() + "\n");
            } else {
                temp += (seat.getCols() + " ");
            }
        }
        return temp;
    }

}
