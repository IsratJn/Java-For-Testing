package java_pkg;

public class Matrix {
 
	int row;
	  int column;
	  int[][] a;
	  public Matrix(int r, int c){
	    row = r;
	    column = c;
	    a = new int[row][column];
	  }

	  public int getRows(){
	    return row;
	  }
	  public int getColumns(){
	    return column;
	  }
	  public int getElement(int r, int c){
	    return a[r][c];
	  }
	  public void setElement(int r, int c, int element){
	    a[r][c] = element;
	  }
	  public static Matrix add(Matrix x, Matrix y){
	    if((x.row == y.row) && (x.column == y.column)){
	      Matrix m = new Matrix(x.row,x.column);
	      for(int i = 0;i<m.row;i++){
	        for(int j = 0;j<m.column;j++){
	          m.setElement(i,j,(x.getElement(i,j)+y.getElement(i,j)));
	        }
	      }
	      return m;
	    }
	    else{
	        System.out.println("Matrices can not be added");
	        return new Matrix(0,0);
	      }

	    }

	    public static Matrix product(Matrix x, Matrix y){
	        Matrix m = new Matrix(x.row,y.column);
	        
	        for(int j = 0;j<x.row;j++){
	          for(int i = 0;i<y.column;i++){
	            int sum = 0;
	            for(int k = 0;k<x.column;k++){
	              sum = sum+(x.getElement(j,k)*y.getElement(k,i));
	              
	            }
	            m.setElement(j,i,sum);
	          }
	        }

	        return m;
	      }

	    public void printMatrix(){
	      System.out.println("Matrix is :");
	      for(int i = 0;i<row;i++){
	          for(int j = 0;j<column;j++){
	            System.out.print(a[i][j]+"\t");
	          }
	          System.out.println("");
	        }
	    }
	  }
	
