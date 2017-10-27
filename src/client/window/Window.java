package client.window;

import client.login.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Window {

    ////////////////////////////////////index//////////////////////////////////////
    private int[] totaalindexboard = new int[9];
    private int[] totalCirboard = new int[5];
    private int[] totalXboard = new int[5];

    /////////////////////////////////////total all//////////////////////////////////////
    private int square;

    private int totaalindexboardCounter = 0;
    private int totalCirboardCounter = 0;
    private int totalXboardCounter = 0;

    ///////////////////////////////////declarFxml//////////////////////////////////////////
    @FXML
    private Circle CircleOne;

    @FXML
    private Circle CircleTwo;

    @FXML
    private Circle CircleThree;

    @FXML
    private Circle CircleFour;

    @FXML
    private Circle CircleFive;

    @FXML
    private Circle CircleSix;

    @FXML
    private Circle CircleSeven;

    @FXML
    private Circle CircleEight;

    @FXML
    private Circle CircleNine;

    @FXML
    private Label XOne;

    @FXML
    private Label XTwo;

    @FXML
    private Label XThree;

    @FXML
    private Label XFour;

    @FXML
    private Label XFive;

    @FXML
    private Label XSix;

    @FXML
    private Label XSeven;

    @FXML
    private Label XEight;

    @FXML
    private Label XNine;
    @FXML
    Rectangle bord1;
    @FXML
    Rectangle bord2;
    @FXML
    Rectangle bord3;
    @FXML
    Rectangle bord4;
    @FXML
    Rectangle bord5;
    @FXML
    Rectangle bord6;
    @FXML
    Rectangle bord7;
    @FXML
    Rectangle bord8;
    @FXML
    Rectangle bord9;
    @FXML
    private Label lblMessages;

    /////////////////////////////////////Winner Team////////////////////////////////////////////////////
    private char winningTeam;

    final private int[][] winningPositions = {{1, 5, 9}, {3, 5, 7}, {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}
    };

    private boolean allowMoves = true;
    private boolean checkPlayer = true;

    private boolean tie = false;

    /////////////////////////////ClickMountEvent////////////////////////////////////////////////////
    private String firstPlayer = "";
    @FXML
    private Label status;





    @FXML
    public void handleSquareOneClick(MouseEvent event) {
        int square = 1;
        if ("".equals(firstPlayer) && checkPlayer) {
            this.status.setText("Second Player");
            firstPlayer = "firstPlayer";
            CircleOne.setVisible(true);
            checkPlayer = false;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalCirboard[this.totalCirboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalCirboardCounter++;
        } else if ("firstPlayer".equals(firstPlayer) && !checkPlayer) {
            this.status.setText( "First Player");
            XOne.setVisible(true);
            firstPlayer = "";
            checkPlayer = true;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalXboard[this.totalXboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalXboardCounter++;
        }
        if (this.checkVictory()) {
            this.endGame();
        } else if (this.totaalindexboardCounter >= 9) {
            this.tie = true;

            this.endGame();
        } else {

        }

    }

    @FXML
    public void handleSquareTwoClick(MouseEvent event) {
        int square = 2;

        if ("".equals(firstPlayer) && checkPlayer) {
            this.status.setText("Second Player");

            firstPlayer = "firstPlayer";
            CircleTwo.setVisible(true);
            checkPlayer = false;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalCirboard[this.totalCirboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalCirboardCounter++;
        } else if ("firstPlayer".equals(firstPlayer) && !checkPlayer) {
            this.status.setText( "First Player");

            XTwo.setVisible(true);
            firstPlayer = "";
            checkPlayer = true;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalXboard[this.totalXboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalXboardCounter++;
        }
        if (this.checkVictory()) {
            this.endGame();
        } else if (this.totaalindexboardCounter >= 9) {
            this.endGame();
            this.tie = true;

        } else {

        }

    }


    @FXML
    public void handleSquareThreeClick(MouseEvent event) {
        int square = 3;
        if ("".equals(firstPlayer) && checkPlayer) {
            this.status.setText("Second Player");

            firstPlayer = "firstPlayer";
            CircleThree.setVisible(true);
            checkPlayer = false;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalCirboard[this.totalCirboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalCirboardCounter++;
        } else if ("firstPlayer".equals(firstPlayer) && !checkPlayer) {
            this.status.setText( "First Player");

            XThree.setVisible(true);
            firstPlayer = "";
            checkPlayer = true;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalXboard[this.totalXboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalXboardCounter++;
        }
        if (this.checkVictory()) {
            this.endGame();
        } else if (this.totaalindexboardCounter >= 9) {
            this.endGame();
            this.tie = true;

        } else {

        }
    }

    @FXML
    public void handleSquareFourClick(MouseEvent event) {
        int square = 4;
        if ("".equals(firstPlayer) && checkPlayer) {
            this.status.setText("Second Player");

            firstPlayer = "firstPlayer";
            CircleFour.setVisible(true);
            checkPlayer = false;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalCirboard[this.totalCirboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalCirboardCounter++;
        } else if ("firstPlayer".equals(firstPlayer) && !checkPlayer) {
            this.status.setText( "First Player");

            XFour.setVisible(true);
            firstPlayer = "";
            checkPlayer = true;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalXboard[this.totalXboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalXboardCounter++;
        }
        if (this.checkVictory()) {
            this.endGame();
        } else if (this.totaalindexboardCounter >= 9) {
            this.endGame();
            this.tie = true;

        } else {

        }

    }


    @FXML
    public void handleSquareFiveClick(MouseEvent event) {
        int square = 5;
        if ("".equals(firstPlayer) && checkPlayer) {
            this.status.setText("Second Player");

            firstPlayer = "firstPlayer";
            CircleFive.setVisible(true);
            checkPlayer = false;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalCirboard[this.totalCirboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalCirboardCounter++;
        } else if ("firstPlayer".equals(firstPlayer) && !checkPlayer) {
            this.status.setText( "First Player");

            XFive.setVisible(true);
            firstPlayer = "";
            checkPlayer = true;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalXboard[this.totalXboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalXboardCounter++;
        }
        if (this.checkVictory()) {
            this.endGame();
        } else if (this.totaalindexboardCounter >= 9) {
            this.endGame();
            this.tie = true;

        } else {

        }
    }

    @FXML
    public void handleSquareSixClick(MouseEvent event) {
        int square = 6;
        if ("".equals(firstPlayer) && checkPlayer) {
            this.status.setText("Second Player");

            firstPlayer = "firstPlayer";
            CircleSix.setVisible(true);
            checkPlayer = false;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalCirboard[this.totalCirboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalCirboardCounter++;
        } else if ("firstPlayer".equals(firstPlayer) && !checkPlayer) {
            this.status.setText( "First Player");

            XSix.setVisible(true);
            firstPlayer = "";
            checkPlayer = true;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalXboard[this.totalXboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalXboardCounter++;
        }
        if (this.checkVictory()) {
            this.endGame();
        } else if (this.totaalindexboardCounter >= 9) {
            this.endGame();
            this.tie = true;

        } else {

        }
    }

    @FXML
    public void handleSquareSevenClick(MouseEvent event) {
        int square = 7;
        if ("".equals(firstPlayer) && checkPlayer) {
            this.status.setText("Second Player");

            firstPlayer = "firstPlayer";
            CircleSeven.setVisible(true);
            checkPlayer = false;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalCirboard[this.totalCirboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalCirboardCounter++;
        } else if ("firstPlayer".equals(firstPlayer) && !checkPlayer) {
            this.status.setText( "First Player");

            XSeven.setVisible(true);
            firstPlayer = "";
            checkPlayer = true;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalXboard[this.totalXboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalXboardCounter++;
        }
        if (this.checkVictory()) {
            this.endGame();
        } else if (this.totaalindexboardCounter >= 9) {
            this.endGame();
            this.tie = true;

        } else {

        }
    }

    @FXML
    public void handleSquareEightClick(MouseEvent event) {
        int square = 8;

//        this.handleSquareClick(8);
        if ("".equals(firstPlayer) && checkPlayer) {
            this.status.setText("Second Player");

            firstPlayer = "firstPlayer";
            CircleEight.setVisible(true);
            checkPlayer = false;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalCirboard[this.totalCirboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalCirboardCounter++;
        } else if ("firstPlayer".equals(firstPlayer) && !checkPlayer) {
            this.status.setText( "First Player");

            XEight.setVisible(true);
            firstPlayer = "";
            checkPlayer = true;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalXboard[this.totalXboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalXboardCounter++;
        }
        if (this.checkVictory()) {
            this.endGame();
        } else if (this.totaalindexboardCounter >= 9) {
            this.endGame();
            this.tie = true;

        } else {

        }
    }

    @FXML
    public void handleSquareNineClick(MouseEvent event) {
        int square = 9;

//        this.handleSquareClick(9);
        if ("".equals(firstPlayer) && checkPlayer) {
            this.status.setText("Second Player");

            firstPlayer = "firstPlayer";
            CircleNine.setVisible(true);
            checkPlayer = false;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalCirboard[this.totalCirboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalCirboardCounter++;
        } else if ("firstPlayer".equals(firstPlayer) && !checkPlayer) {
            this.status.setText( "First Player");

            XNine.setVisible(true);
            firstPlayer = "";
            checkPlayer = true;
            this.totaalindexboard[this.totaalindexboardCounter] = square;
            this.totalXboard[this.totalXboardCounter] = square;
            this.totaalindexboardCounter++;
            this.totalXboardCounter++;
        }
        if (this.checkVictory()) {
            this.endGame();
        } else if (this.totaalindexboardCounter >= 9) {
            this.endGame();
            this.tie = true;

        } else {
        }
    }



/////////////////////////////////////////checkVictory////////////////////////////////////////////////////

    public boolean checkVictory() {
        if (this.totalCirboardCounter < 3 && this.totalXboardCounter < 3) {
            return false;
        }

        for (int[] filled : this.winningPositions) {
            int slotCounter = 0;

            for (int singleFilled : filled) {
                if (this.isOccupiedByCircle(singleFilled)) {
                    slotCounter++;
                }
            }

            if (slotCounter == 3) {
                this.winningTeam = 'O';
                this.allowMoves = false;
                return true;
            }

            slotCounter = 0;

            for (int singleFilled : filled) {
                if (this.isOccupiedByX(singleFilled)) {
                    slotCounter++;
                }
            }

            if (slotCounter == 3) {
                this.winningTeam = 'X';
                this.allowMoves = false;
                return true;
            }
        }

        return false;
    }


    ///////////////////////////////CheckPositionPointter////////////////
    public boolean isOccupiedByCircle(int circlePosition) {
        boolean found = false;

        for (int filledCircle : this.totalCirboard) {
            if (filledCircle == circlePosition) {
                found = true;
            }
        }

        return found == true;
    }

    public boolean isOccupiedByX(int xPosition) {
        boolean found = false;

        for (int filled : this.totalXboard) {
            if (filled == xPosition) {
                found = true;
            }
        }

        return found == true;
    }

    ////////////////////////////////////////EndGame///////////////////////////
    public void endGame() {
        this.allowMoves = false;

        if (this.tie == true) {
            this.lblMessages.setText("It was a tie!");
        } else if (String.valueOf(this.winningTeam).equals("O")) {
            this.lblMessages.setText("First Player is Winner !!");
        } else if (String.valueOf(this.winningTeam).equals("X")) {
            this.lblMessages.setText("Second Player is Winner !!");
        }
    }

    //////////////////////////////////////////////////SetButton///////////////////////////////////
    @FXML
    Button btnReset;

    @FXML
    public void handleResetButton(ActionEvent event) {
        ;

        this.CircleOne.setVisible(false);
        this.CircleTwo.setVisible(false);
        this.CircleThree.setVisible(false);
        this.CircleFour.setVisible(false);
        this.CircleFive.setVisible(false);
        this.CircleSix.setVisible(false);
        this.CircleSeven.setVisible(false);
        this.CircleEight.setVisible(false);
        this.CircleNine.setVisible(false);

        this.XOne.setVisible(false);
        this.XTwo.setVisible(false);
        this.XThree.setVisible(false);
        this.XFour.setVisible(false);
        this.XFive.setVisible(false);
        this.XSix.setVisible(false);
        this.XSeven.setVisible(false);
        this.XEight.setVisible(false);
        this.XNine.setVisible(false);

        this.winningTeam = 0;

        this.allowMoves = true;
        this.tie = false;

        this.lblMessages.setText("");

        this.totaalindexboard = new int[9];
        this.totalCirboard = new int[5];
        this.totalXboard = new int[5];

        this.totaalindexboardCounter = 0;
        this.totalCirboardCounter = 0;
        this.totalXboardCounter = 0;
    }



}




