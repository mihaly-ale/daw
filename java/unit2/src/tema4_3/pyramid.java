package tema4_3;

public class pyramid {
	
	public static int pyramid(int height) {
		
		for (int row = 1; row <= height; row++) { // 1,2,3,4,5
            int spaces = height - row; // 4, 3, 2, 1, 0
            int stars = row * 2 - 1; // 1, 3, 5 , 7, 9

            // left spaces
            for (int i = 0; i < spaces; i++) { // 0,1,2,3,
                System.out.print(" ");
            }

            // stars
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
		return height;
	}
	
public static int reversedPyramid(int height) {
		
		for (int row = height-1; row >= 1; row--) { // 5,4,3,2,1
            int spaces = height - row; // 0, 1, 2, 3, 4
            int stars = row * 2 - 1; // 9, 7,  ...

            // left spaces
            for (int i = 0; i < spaces; i++) { // 0,1,2,3,
                System.out.print(" ");
            }

            // stars
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
		return height;
	}
	
    public static void main(String[] args) {
        int height = 5;

        pyramid(height);
        reversedPyramid(height);
    }
}

