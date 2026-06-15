package Foundation;
class Arrayso{
    public static void main(String[] args){
        int[][] MyNumbers = { {2,4,8},{4,7,3}};
        System.out.println(MyNumbers[1][2]);
        for(int[] no : MyNumbers){
            for(int num : no){
            System.out.println(num);
            }
        }
    }
}