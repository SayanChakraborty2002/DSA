/**
 * triangle
 */
public class triangle {

    static void sameIntegerTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void triangleNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void starTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void reverseStarTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void reverseIntgerTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void middleTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            System.out.println();
        }

    }

    static void reversePyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * n) - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void borfi(int n) {
        pyramid(n);
        reversePyramid(n);
    }

    static void leftTriangle(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print('*');
                }
                System.out.println();
            } else {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print('*');
                }
                System.out.println();
            }

        }
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static void triangle01(int n) {
        for (int i = 1; i <= n; i++) {
            if (!isEven(i)) {
                for (int j = 1; j <= i; j++) {
                    if (!isEven(j))
                        System.out.print('1' + " ");
                    else
                        System.out.print('0' + " ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (isEven(j))
                        System.out.print("1" + " ");
                    else
                        System.out.print('0' + " ");
                }
            }
            System.out.println();
        }
    }

    static void triangle01Approach2(int n) {
        int start;
        for (int i = 1; i <= n; i++) {
            if (!isEven(i))
                start = 1;
            else
                start = 0;

            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void mirrorTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            for (int j = i + 1; j <= 2 * n - i; j++)
                System.out.print(" ");
            for (int j = i; j >= 1; j--)
                System.out.print(j);
            System.out.println();
        }
    }

    static void seqTriangle(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }

    static void alphabetTrianle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(((char) (65 + j)) + " ");
            }
            System.out.println();
        }
    }

    static void revAlphabetTrianle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(((char) (65 + j)) + " ");
            }
            System.out.println();
        }
    }

    static void continuedArticles(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(((char) (65 + i)) + " ");
            }
            System.out.println();
        }
    }

    static void articlePyramid(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < n - 1 - i; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j <= breakpoint) {
                    System.out.print(ch);
                    ch++;
                } else {
                    ch--;
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }

    static void lastAlphabetTriangle(int n) {
        // for (int i = 0; i < n; i++) {
        // char ch = (char) (65 + n - i-1);
        // for (int j = 0; j <= i; j++) {
        // System.out.print(ch++);
        // }
        // System.out.println();
        // }

        // approach-2
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + n - 1 - i); ch <= (char) ('A' + n - 1); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void starMirrorTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print('*');
            for (int j = i + 1; j < 2 * n - i; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    static void revStarMirrorTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print('*');
            for (int j = 0; j <= 2 * i; j++)
                System.out.print(' ');
            for (int j = 0; j < n - i; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    static void leftRightTriangle(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                for (int j = 1; j <= 2 * n - 2 * i; j++)
                    System.out.print(" ");
                for (int j = 1; j <= i; j++)
                    System.out.print('*');
            } else {
                for (int j = 1; j <= 2 * n - i; j++)
                    System.out.print('*');
                for (int j = 1; j <= 2*(i - n); j++)
                    System.out.print(' ');
                for (int j = 1; j <= 2 * n - i; j++)
                    System.out.print('*');
            }
            System.out.println();

        }
    }

   static void voidSquare(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 ||i==n || j==n) System.out.print('*');
                else System.out.print(' ');
            }System.out.println();
        }
   }
   
   static void spiralPattern(int n ){
    // Looping from 1 to 2*n-1
    for(int i = 0; i < 2*n-1; i++){
        for(int j = 0; j < 2*n-1; j++){
            // Distances must be 0 at the extreme edges
            int top = i;               
            int left = j;             
            int bottom = (2*n - 2) - i;
            int right = (2*n - 2) - j;
            
            int min = Math.min(Math.min(top, left), Math.min(right, bottom));
            System.out.print(n - min + " "); 
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int n = 5;
        spiralPattern(n);
    }
}