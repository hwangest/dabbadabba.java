public class dabbadabba {

public static final int n = 3;

    public static void dashes() {
        for (int i = 0; i < (n+1)*2+1; i++) {
            System.out.print("-");
        }
    }
    
    public static void drawFenceTop() {
        dashes();
        System.out.print("| %");
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        System.out.print("% |" );
        dashes();
        System.out.println();
    }

    public static void drawFenceMiddle() {
        drawFenceTop();
        for (int i = 0; i < n+1; i++) {
			System.out.print(" o");
		}
		System.out.print(" | %");
        for (int i = 0; i < 4; i++) {
			System.out.print(" ");
		}
        System.out.print("% | ");
        for (int i = 0; i < n+1; i++) {
			System.out.print("o ");
        }
        System.out.println();
        drawFenceTop();
    }

    public static void drawSteps() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n+1)-i; j++) {
                System.out.print("~^"); 
                }
            System.out.print("~/");
            for (int j = 0; j < 8+4*i; j++) { 
				System.out.print("-");
				}
            System.out.print("\\~");
            for (int j = 0; j < (n+1)-i; j++) {
                System.out.print("^~");
                }
            System.out.println();
            for (int j = 0; j < (n+1)-i; j++) {
                System.out.print("^~");
                }
                System.out.print("/");
            for (int j = 0; j < 10+4*i; j++) {
                System.out.print("-");
                }
            System.out.print("\\");
            for (int j = 0; j < (n+1)-i; j++) {
				System.out.print("~^");
				}
            System.out.println();
            for (int j = 0; j < (n+1)*2-(2*i); j++) {
				System.out.print(" ");
				}
            System.out.print("|");
            for (int j = 0; j < 10+4*i; j++) {
				System.out.print("=");
				}
            System.out.print("|");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (n+1)*2+(5-i); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < i; j++) {
                System.out.print("/\\");
            }
            System.out.println("\\");
        }
        drawFenceMiddle();
        drawSteps();
        System.out.print("   /");
        for (int i = 0; i < 12+4*(n-1); i++) {
                System.out.print(" ");
        }
        System.out.print("\\");
        System.out.println();
        System.out.print("  /  ");
        for (int i = 0; i < 10+4*(n-1); i++) {
                System.out.print("=");
        }
        System.out.print("  \\");
        System.out.println();
        System.out.print(" /  / ");
        for (int i = 0; i < 8+4*(n-1); i++) {
            System.out.print("\"");
        }
        System.out.print(" \\  \\");
        System.out.println();
        System.out.print("|  | ");
        for (int i = 0; i < 10+4*(n-1); i++) {
            System.out.print("\"");
        }
        System.out.print(" |  |");
        System.out.println();
        System.out.print(" \\  \\ ");
        for (int i = 0; i < 8+4*(n-1); i++) {
            System.out.print("\"");
        }
        System.out.print(" /  /");
        System.out.println();
        System.out.print("  \\  ");
        for (int i = 0; i < 10+4*(n-1); i++) {
            System.out.print("=");
        }
        System.out.print("  /");
        System.out.println();
        System.out.print("   \\");
        for (int i = 0; i < 12+4*(n-1); i++) {
            System.out.print("_");
        }
        System.out.println("/");
    }
}
