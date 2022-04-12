import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {/*
    /*
    y x---
    -
    -
    -
    dK
     -
      -
       -

       dNy
      -
     -
    -
    */
    public static void main(String[] args) {
        String[] matrixRow1 = new String[] {"82", "02", "09", "27", "48", "46", "57", "77", "51", "42", "51", "94", "03", "70", "20", "93", "73", "45", "84", "26", "16", "33", "21", "16", "86"};
        String[] matrixRow2 = new String[] {"16", "97", "30", "39", "45", "44", "07", "05", "33", "07", "32", "36", "42", "52", "47", "66", "34", "56", "04", "68", "37", "19", "47", "87", "01"};
        String[] matrixRow3 = new String[] {"86", "35", "35", "45", "04", "01", "79", "42", "19", "67", "46", "08", "13", "33", "92", "29", "33", "20", "73", "42", "57", "43", "95", "64", "20"};
        String[] matrixRow4 = new String[] {"90", "02", "96", "98", "69", "12", "29", "52", "80", "04", "81", "92", "44", "73", "64", "87", "54", "74", "76", "21", "41", "35", "07", "62", "58"};
        String[] matrixRow5 = new String[] {"12", "68", "55", "66", "72", "07", "33", "16", "80", "34", "59", "26", "87", "41", "68", "84", "71", "81", "76", "84", "26", "71", "62", "79", "18"};
        String[] matrixRow6 = new String[] {"74", "65", "63", "03", "37", "36", "81", "26", "03", "02", "74", "90", "48", "86", "61", "59", "86", "51", "67", "68", "64", "20", "30", "19", "03"};
        String[] matrixRow7 = new String[] {"36", "25", "62", "98", "24", "85", "69", "20", "68", "02", "73", "27", "77", "14", "54", "51", "24", "96", "71", "29", "25", "14", "63", "92", "55"};
        String[] matrixRow8 = new String[] {"20", "23", "06", "43", "20", "11", "73", "39", "31", "54", "06", "90", "82", "75", "56", "96", "80", "52", "49", "50", "37", "49", "04", "74", "89"};
        String[] matrixRow9 = new String[] {"69", "41", "06", "52", "60", "29", "54", "62", "53", "08", "52", "05", "08", "05", "75", "07", "78", "99", "26", "78", "24", "33", "89", "78", "27"};
        String[] matrixRow10 = new String[] {"40", "05", "10", "44", "99", "68", "74", "42", "71", "27", "97", "85", "07", "63", "80", "08", "28", "05", "85", "06", "29", "03", "58", "80", "33"};
        String[] matrixRow11 = new String[] {"27", "48", "94", "93", "15", "10", "95", "42", "44", "55", "45", "27", "88", "83", "02", "31", "73", "31", "11", "61", "43", "07", "31", "98", "07"};
        String[] matrixRow12 = new String[] {"59", "20", "60", "37", "11", "27", "36", "44", "97", "78", "28", "13", "83", "97", "12", "44", "56", "95", "03", "83", "84", "72", "69", "38", "55"};
        String[] matrixRow13 = new String[] {"56", "96", "56", "41", "98", "61", "93", "37", "53", "17", "12", "83", "88", "25", "31", "13", "22", "85", "92", "95", "85", "05", "58", "89", "90"};
        String[] matrixRow14 = new String[] {"23", "35", "19", "16", "36", "06", "04", "85", "62", "38", "84", "86", "59", "42", "89", "20", "12", "96", "91", "55", "45", "59", "30", "11", "14"};
        String[] matrixRow15 = new String[] {"49", "58", "53", "21", "36", "80", "27", "74", "45", "84", "71", "45", "12", "28", "06", "38", "86", "29", "87", "12", "53", "41", "42", "06", "27"};
        String[] matrixRow16 = new String[] {"80", "16", "45", "39", "40", "92", "92", "36", "20", "26", "89", "23", "23", "92", "31", "52", "37", "50", "41", "05", "31", "61", "42", "50", "28"};
        String[] matrixRow17 = new String[] {"69", "87", "50", "99", "14", "61", "82", "37", "41", "06", "18", "26", "04", "02", "82", "03", "04", "74", "32", "79", "45", "14", "66", "20", "08"};
        String[] matrixRow18 = new String[] {"24", "56", "93", "50", "86", "01", "56", "67", "98", "65", "45", "06", "68", "96", "22", "34", "71", "32", "04", "19", "70", "27", "05", "77", "26"};
        String[] matrixRow19 = new String[] {"66", "35", "16", "20", "17", "96", "05", "10", "92", "03", "29", "48", "56", "06", "07", "64", "14", "97", "69", "48", "01", "10", "67", "50", "42"};
        String[] matrixRow20 = new String[] {"38", "18", "63", "22", "36", "15", "40", "91", "89", "02", "68", "01", "34", "64", "06", "52", "98", "26", "82", "86", "19", "68", "66", "62", "85"};
        String[] matrixRow21 = new String[] {"51", "40", "75", "61", "81", "02", "62", "20", "06", "76", "31", "50", "97", "62", "91", "09", "13", "54", "32", "54", "06", "92", "03", "06", "25"};
        String[] matrixRow22 = new String[] {"94", "54", "86", "68", "37", "13", "02", "85", "38", "06", "31", "79", "72", "54", "53", "24", "67", "41", "88", "08", "36", "46", "38", "23", "43"};
        String[] matrixRow23 = new String[] {"92", "74", "81", "58", "38", "08", "88", "20", "57", "77", "95", "51", "68", "65", "75", "31", "05", "14", "79", "29", "48", "46", "27", "64", "85"};
        String[] matrixRow24 = new String[] {"86", "83", "93", "17", "35", "10", "13", "61", "03", "30", "04", "79", "01", "87", "24", "70", "99", "39", "33", "09", "53", "81", "38", "85", "28"};
        String[] matrixRow25 = new String[] {"12", "43", "86", "67", "82", "71", "45", "64", "04", "32", "19", "84", "79", "38", "17", "42", "56", "34", "81", "43", "75", "46", "88", "49", "40"};
        int[][] valueMatrix= new int[25][25];
        for (int y = 0; y < 25; y++) {      //x
            for (int x = 0; x < 25; x++) {  //y
                int parse=0;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow1[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow2[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow3[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow4[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow5[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow6[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow7[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow8[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow9[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow10[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow11[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow12[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow13[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow14[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow15[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow16[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow17[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow18[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow19[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow20[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow21[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow22[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow23[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow24[x]); parse++;
                if(y==parse)  valueMatrix[x][y] = Integer.parseInt(matrixRow25[x]);  //:)
        }}
        int bestOsszeg=0;
            int bestStartX=0;
            int bestStartY=0;
            String type="none";

            //ROW
        for (int y = 0; y < 25; y++) {
            for (int x = 0; x < (25-3); x++) {
                int szorzat =(valueMatrix[x][y]* valueMatrix[x+1][y]*valueMatrix[x+2][y]*valueMatrix[x+3][y]);
                if (bestOsszeg<szorzat){
                    bestStartX=x;
                    bestStartY=y;
                    bestOsszeg=szorzat;
                    type="row";
                }
            }
        }
        //COLOUMN
        for (int x = 0; x < (25-3); x++) {
            for (int y = 0; y < 25; y++) {
                int szorzat =(valueMatrix[x][y]* valueMatrix[x][y+1]*valueMatrix[x][y+2]*valueMatrix[x][y+3]);
                if (bestOsszeg<szorzat){
                    bestStartX=x;
                    bestStartY=y;
                    bestOsszeg=szorzat;
                    type="col";
                }
            }
        }
        //DIAGONAL DownRight
        for (int x = 0; x < (25-3); x++) {
            for (int y = 0; y < (25-3); y++) {
                int szorzat =(valueMatrix[x][y]* valueMatrix[x+1][y+1]*valueMatrix[x+2][y+2]*valueMatrix[x+3][y+3]);
                if (bestOsszeg<szorzat){
                    bestStartX=x;
                    bestStartY=y;
                    bestOsszeg=szorzat;
                    type="DKe";//dny
                }
            }
        }

        //DIAGONAL DownLeft
        for (int x = 3; x < 25; x++) {
            for (int y = 0; y < (25-3); y++) {
                int szorzat =(valueMatrix[x][y]* valueMatrix[x+1][y+1]*valueMatrix[x+2][y+2]*valueMatrix[x+3][y+3]);
                if (bestOsszeg<szorzat){
                    bestStartX=x;
                    bestStartY=y;
                    bestOsszeg=szorzat;
                    type="DNy";
                }
            }
        }
        int xElteres=0;
        int yElteres=0;
        if (type=="row") xElteres=1;
        if (type=="col") yElteres=1;
        if (type=="DKe") {xElteres= 1; yElteres= 1;}
        if (type=="DNy") {xElteres=-1; yElteres=-1;}

        System.out.println("a legjobb szorzat " + bestOsszeg +".");
        System.out.println("Igeny szerint a megfelelo szamok"+
                valueMatrix[bestStartX+xElteres*0][bestStartY+yElteres*0]+", "+
                valueMatrix[bestStartX+xElteres*1][bestStartY+yElteres*1]+", "+
                valueMatrix[bestStartX+xElteres*2][bestStartY+yElteres*2]+", "+
                valueMatrix[bestStartX+xElteres*3][bestStartY+yElteres*3]+".");
        System.out.println("pretty pls.");
    }
}


