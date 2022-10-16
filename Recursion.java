//Lab6 - tjudge
//This was a basic assignment for understanding recursion. 
//Add some flair to the assignment 'cuz it needed some fun
public class Recursion {
    public static void main(String[] args) {
        {
            Recursion recursion = new Recursion();
            System.out.println("The Count Says!");//The Sesame Street Count
            System.out.println("Function that adds up the numbers from n to 1:");
            System.out.println(recursion.sum(8));
            System.out.println("Function that gives the factorial of n:");
            System.out.println(recursion.factorial(7));
            System.out.println("Function that calculates 10^n:");
            System.out.println(recursion.powerOf10(6));
            System.out.println("Function that calculates x^p:");
            System.out.println(recursion.powerOfN(5,4));
            System.out.println("Function that calculates number of bunny ears for n bunnies");
            System.out.println(recursion.bunnyEars(3));
            System.out.println("Ah Ah Ah");
        }
    }
    int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }
    int factorial(int n)
    {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    int powerOf10(int n)
    {
        if (n == 0)
            return 1;
        else
            return 10 * powerOf10(n - 1);
    }
    int powerOfN(int x, int p)
    {
        if (p == 0) {
            return 1;
        } else {
            return x * powerOfN(x, p - 1);
        }
    }
    int bunnyEars(int n)
    {
        if (n == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(n - 1);
        }
    }
}
