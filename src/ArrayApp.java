public class ArrayApp {
    public static void main(String[] args) {
        System.out.println("Array App Working");


        int[] myarray=new int[5];

        myarray[0]=10;
        myarray[1]=11;
        myarray[2]=12;
        myarray[3]=13;
        myarray[4]=14;

        for(int values:myarray)
        {
            System.out.println(values);
        }

        System.out.println();

        int[] myarray1={1,2,3,4,5,6,7,8,9,10};
        for(int myvalues:myarray1)
        {
            System.out.println(myvalues);
        }

        System.out.println();



//        MultiDimensional Array

        int[][] twoDimensionalArray=new int[2][4];

        twoDimensionalArray[0][0]=10;
        twoDimensionalArray[0][1]=20;
        twoDimensionalArray[0][2]=30;
        twoDimensionalArray[0][3]=40;
        twoDimensionalArray[1][0]=50;
        twoDimensionalArray[1][1]=60;
        twoDimensionalArray[1][2]=70;
        twoDimensionalArray[1][3]=80;
        for(int i=0;i<twoDimensionalArray.length;i++){
            for (int j=0;j<twoDimensionalArray[i].length;j++){
                System.out.print(twoDimensionalArray[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] dummyArray={
                {1,2,3,4,5},
                {11,22,33,445,55},
                {51,21,232,423,51},
                {137,27,53,48,52}
        };

       for(int[] outer:dummyArray){
           for(int inner:outer)
           {
               System.out.print(inner+" ");
           }
           System.out.println();
       }



    }
}
