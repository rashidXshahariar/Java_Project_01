/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MatrixInp {
     static int[][] MatrixCreate(int row,int coloumn){
        Scanner sc =  new Scanner(System.in);
        int[][] mat=new int[row][coloumn];
        for(int i=0;i<row;i++){
            for(int j=0;j<coloumn;j++){
                System.out.println("Input the matrix value: \n"+"Row: "+i+" Coloumn: "+j);
                mat[i][j]=sc.nextInt();
            }
        }
        return mat;
    }
    static void Print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
             System.out.println(Arrays.toString(matrix[i]));
        }

    }
    static void MultiplyMatrix(int[][] mat1,int[][] mat2){
        int row=mat1.length;
        int col_1= mat1[0].length;
        int col_2=mat2[0].length;
        int[][] result=new int[row][col_2];
        for(int i=0;i<row;i++){
            for (int j=0; j<col_2;j++){
                for (int k= 0; k<col_1;k++){
                    result[i][j] +=mat1[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println("Result of Multiply Matrix is: ");
        Print(result);
    }
    static void Transpose(int[][] matrix){
        int col= matrix.length;
        int row=matrix[0].length;
        int[][] transpose=new int[row][col];
        for (int i=0; i<row;i++){
            for (int j=0; j<col ;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        System.out.println("Transpose Matrix is: ");
        Print(transpose);
    }

    static void AddMatrix(int[][] mat1,int[][] mat2){
        if(mat1.length  ==  mat2.length && mat1[0].length == mat2[0].length){
            int[][] mat3= new int[mat1.length][mat1[0].length];
            int row=mat1.length;
            int coloumn=mat1[0].length;
            for(int i=0;i<row;i++){
                for(int j=0;j<coloumn;j++){
                    mat3[i][j]=mat1[i][j]+mat2[i][j];
                }
                
            }
            System.out.println("Result of adding Matrix is: ");
            Print(mat3);
        }
        else{
            System.out.println("Unable to add MATRIX");
        }
    }
    static void numMultiply(int[][] mat,int num){
        
        int row = mat.length;
        int coloumn =mat[0].length;
        for (int i= 0;i<row;i++){
            for (int j=0;j<coloumn;j++){
                mat[i][j] *= num;
            }
        }
        System.out.println("The matrix after multiply: ");
        Print(mat);
        
    }
        public static void main(String[] args){
          int[][] matrixA={{8,6,9},{5,7,9},{2,5,2},{4,5,6}};
          int[][] matrixB={{3,2,1},{5,8,9},{2,5,2}};
          AddMatrix(matrixA,matrixB);
          MultiplyMatrix(matrixA,matrixB);
          Transpose(matrixA);
          numMultiply(matrixA,4);
          Print(MatrixCreate(3,3));
        
        
    }
}
