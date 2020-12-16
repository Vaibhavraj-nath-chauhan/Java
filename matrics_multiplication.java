public class matrics_multiplication {
    public static void main(String args[])  //creating main function which will perfrom all task
    {
        //creating an empty array
        int[][] c = new int[3][3];
        //creating a arary
        int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print("Matric A-->\n");
        //printing
        for(int i=0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.print("\n");
        }
        //creating b array 
        System.out.println("\nMatric B-->");
        int B[][] = {{3,2,1},{6,5,4},{9,8,7}};
        //printing
        for(int i=0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.print("\n");
        }
        //formula of matrics multiplication
        for(int i =0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        //printing multiplied matcis
        System.out.println("\nMultiplication of A and B-->");
        for(int i =0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }  
}