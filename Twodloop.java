package Foundation;

public class Twodloop {
    public static void main(String[] args){
        int[][] MyNumbers = {{3,7,3},{7,3,5}};
        for(int row = 0; row < MyNumbers.length; row ++){
            for(int col=0; col < MyNumbers[row].length; col ++){
                System.out.println("Row: [ "+ row +" ] and column: [ "+ col +" ] Value: "+ 
                    MyNumbers[row][col]);
            }
        }
    }
}
