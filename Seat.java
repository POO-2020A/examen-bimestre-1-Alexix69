/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismael
 */
public class Seat {

    private int row;
    private String col;
    private Passenger passenger;

    public Seat(int rowRequired, String colRequired) {
        this.row = rowRequired;
        this.col = colRequired;
        this.passenger = null;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Seat)) {
            return false;
        }

        Seat comparedSeat = (Seat) compared;
        if (this.row == comparedSeat.row
                && this.col.equals(comparedSeat.col)) {
            return true;
        }
        return false;
    }
    
    public int getRows(){
        return this.row;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    
    public String getCols(){
        return this.col;
    }

    @Override
    public String toString() {
        if (true) {
        }
        return ("Asiento: " + this.row + this.col + ", ");
    }
}
