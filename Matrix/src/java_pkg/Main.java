package java_pkg;

public class Main {

	public static void main(String[] args) {
		  Matrix m = new Matrix(3,3);
		    Matrix n = new Matrix(3,3);
		    int k = 1;
		    for(int i = 0;i<3;i++){
		      for(int j = 0;j < 3;j++){
		        m.setElement(i,j,k);
		        k++;
		        n.setElement(i,j,k);
		        k++;
		      }
		    }

		    m.printMatrix();
		    n.printMatrix();

		    Matrix o = Matrix.add(m,n);
		    o.printMatrix();

		    Matrix p = Matrix.product(m,n);
		    p.printMatrix();
		  }
		
		
	}

