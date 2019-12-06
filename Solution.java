import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

/*
Sorting Array of Objects
*/

class Book
{
    private String name;
    private int price;

    public Book() {}
    public Book(String name, int price) 
    {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) { this.name = name; }
    public void setPrice(int price) { this.price = price; }

    public String getName() { return this.name; }
    public int getPrice() { return this.price; }

}

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        Vector<Book> vect = new Vector();

        for (int iTest = 0; iTest < testCases; iTest++)
        {
            String name = scan.next();
            int price = scan.nextInt();

            vect.addElement(new Book(name, price));
/*
Input:

4
Banana 100
Apple 100
Apple 50
Banana 50
*/
        }

        for (int iCount = 0; iCount < vect.size(); iCount++)
        {
            System.out.println(vect.elementAt(iCount).getName() + " " + vect.elementAt(iCount).getPrice());
        }

        Comparator<Book> comp = new Comparator<Book>()
        {
            public int compare(Book b1, Book b2)
            {
                if (b1.getName().compareTo(b2.getName()) > 0)
                {
                    return 1;
                }
                else if (b1.getName().compareTo(b2.getName()) < 0)
                {
                    return -1;
                }
                else
                {
                    if (b1.getPrice() > b2.getPrice())
                    {
                        return 1;
                    }
                    else if (b1.getPrice() < b2.getPrice()) 
                    {
                        return -1;
                    }
                    else 
                    {
                        return 0;
                    }
                }
            }
        };

        Collections.sort(vect, comp);
        System.out.println("\n\n");

        for (int iCount = 0; iCount < vect.size(); iCount++)
        {
            System.out.println(vect.elementAt(iCount).getName() + " " + vect.elementAt(iCount).getPrice());
        }
        scan.close();
    }
}
