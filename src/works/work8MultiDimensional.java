package src.works;

public class work8MultiDimensional {
    public static void main(String[] args) {
        String[][] citys = {{"Miami" , "Los Angels" , "Washington"},
                            {"Berlin" , "Nurnberg" , "Leipzig"},
                            {"Toronto" , "Vancouver" , "Montreal"}};
        
        for(int i = 0; i < citys.length; i++){
            for(int j = 0; j < citys.length; j++){
                System.out.print(" " + citys[i][j]);
            }
            System.out.println();
        }
    }
}
