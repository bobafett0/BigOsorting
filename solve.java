import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class solve {


	PrintWriter writer;
	ArrayList<String> col;
	public solve () {
//		System.out.println(true);
		try {
			writer = new PrintWriter("super.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		col = new ArrayList<String>();
	}

	public int factorial(int x)
	{
		int u = 1;
		for(int i = 1; i <= x; i++)
		{
			u = u*i;
		}
		return u;

	}

	public String makeA()
	{
		String a = "";
		for(int i = 0; i < 9; i++)
		{
			if(i%2 == 0 && i%3 == 0)
			{
				a = a + "c";
			}
			else if(i%3 == 0)
			{
				a = a + "b";
			}
			else if(i%2 == 0)
			{
				a = a + "a";
			}
			else
				a = a + "d";
		}
		return a;
	}

	public String makeB()
	{
		String a = "";
		for(int i = 0; i < 9; i++)
		{
			if(i%2 == 0 && i%3 == 0)
			{
				a = a + "a";
			}
			else if(i%3 == 0)
			{
				a = a + "b";
			}
			else if(i%2 == 0)
			{
				a = a + "c";
			}
			else
				a = a + "d";
		}
		return a;
	}

	// Removes elements in the second string

	public boolean isAlandromeN2over2(String a, String b)
	{
		if (a.length() != b.length())
			return false;

		for(int i = 0; i < a.length(); i++)
		{
			if (b.length() == a.length()-i)
			{
			for(int u = 0; u < b.length(); u++)
			{
				if (a.substring(i,i+1).equals(b.substring(u, u+1)))
				{
					b = b.substring(0,u)+b.substring(u+1, b.length());
					break;
				}
			}
			}
			else
				return false;
		}

		if (b.length() == 0)
			return true;
		else 
			return false;
	}


	// Allocates two arrays then takes frequency counts



	// Sorts the strings then checks each elements

	public boolean isAlandromeN2(String a, String b)
	{
		if(a.length() != b.length())
			return false;

		char[] first =  a.toCharArray();
		char[] second = b.toCharArray();

		for(int i = 0; i < first.length; i++)
			for(int u = i; u < first.length; u++)
			{
				if((int)first[i] > (int)first[u] )
				{
					char temp = first[i];
					first[i] = first[u];
					first[u] = temp;
				}
				if((int)second[i] > (int)second[u] )
				{
					char temp = second[i];
					second[i] = second[u];
					second[u] = temp;
				}
			}

		for(int i = 0; i < first.length; i++)
		{
			//System.out.print(first[i] + " " + second[i] +"\n");
			if(first[i] != second[i])
				return false;
		}
		return true;

	}
	public static int count = 0;

	public boolean permutation(String prefix,String a,String g)
	{
		if( a.length() == 0 )
		{
			if (prefix.equals(g))
			return true;
			else
			return false;
		}
		else
		{
			for(int i = 0; i < a.length(); i++)
			{
				if (permutation(prefix+a.charAt(i),a.substring(0, i)+a.substring(i+1,a.length()),g ))
					return true;
			}
		}
		return false;
	}

	public boolean isAlandromeN(String a, String b)
	{
		int[] first = new int[26];

		if(a.length() != b.length())
			return false;

		for(int i = 0; i < a.length(); i++)
		{
			first[(int)a.charAt(i) - (int)'a']++;
		}
		for(int i = 0; i < a.length(); i++)
		{
			first[(int)b.charAt(i)- (int)'a']--;
		}

		for(int i = 0; i < 26; i++)
		{
			if(first[i] != 0)
				return false;
		}
		return true;
	}

	public boolean isAlandromeLog(String a, String b)
	{
		char[] first = a.toCharArray();
		mergeSort(first);
		char[] second = b.toCharArray();
		mergeSort(second);
		for(int i = 0; i < first.length; i++)
		{
			if(first[i] != second[i])
				return false;
		}
		return true;
	}

	static void mergeSort(char[] A) {
        if (A.length > 1) {
            int q = A.length/2;
            char[] leftArray = Arrays.copyOfRange(A, 0, q);
            char[] rightArray = Arrays.copyOfRange(A,q,A.length);
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(A,leftArray,rightArray);
        }
    }

    static void merge(char[] a,char[] l, char[] r) {
        int totElem = l.length + r.length;
        //char[] a = new char[totElem];
        
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
       // return a;

    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve a = new solve();
		long startTime, endTime;
		String c = "rat";
		String b = "atr";
		b = b+c+b+c+b;
		c = c+c+c+c+c;
		b = b+c+b+c+b;
		c = c+c+c+c+c;
		b = b+c+b+c+b;
		c = c+c+c+c+c;
		b = b+c+b+c+b;
		c = c+c+c+c+c;
		b = b+c+b+c+b;
		c = c+c+c+c+c;
		b = b+c+b+c+b;
		c = c+c+c+c+c;
		b = b+c+b+c+b;
		c = c+c+c+c+c;
//		b = b+c+b+c+b;
//		c = c+c+c+c+c;
//		b = b+c;
//		c = c+c;
		System.out.println(c.length());
		System.out.println(b.length());

		startTime = System.nanoTime();
		a.isAlandromeN(b,c);
		endTime = System.nanoTime();

		System.out.println(endTime - startTime);

		startTime = System.nanoTime();
		a.isAlandromeLog(c,b);
		endTime = System.nanoTime();

		System.out.println(endTime - startTime);
		
		// sorts 
		startTime = System.nanoTime();
		a.isAlandromeN2(c,b);
		endTime = System.nanoTime();

		System.out.println(endTime - startTime);
		
		startTime = System.nanoTime();
		a.isAlandromeN2over2(c, b);
		endTime = System.nanoTime();

		System.out.println(endTime - startTime);

		startTime = System.nanoTime();
		a.permutation("","at", "ta");
		endTime = System.nanoTime();

		System.out.println(endTime - startTime);

//		startTime = System.nanoTime();
//		System.out.println(a.logAnadrome(b, c));
//		endTime = System.nanoTime();
//		
//		System.out.println(endTime - startTime);


	}

}
