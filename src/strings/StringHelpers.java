package strings;

public class StringHelpers {
    String stringUnderTest;
    StringHelpers(String s)
    {
        stringUnderTest=s;
    }
    boolean palindrome()
    {
        int n=stringUnderTest.length();
        for(int i=0;i<n/2;i++)
            if(stringUnderTest.charAt(i)!=stringUnderTest.charAt(n-i-1))
                return false;
        return true;
    }
    int numberOfa()
    {
        int x=0;
        for(int i=0;i<stringUnderTest.length();i++)
        {
            if(stringUnderTest.charAt(i)=='a')
                x++;
        }
        return x;
    }
    boolean containsPercentSign(){
        for (int i = 0; i < stringUnderTest.length(); i++) {
            if(stringUnderTest.charAt(i)=='%')
            return true;
        }
        return false;
    }
    boolean lengthIsBiggerThan5()
    {
        return stringUnderTest.length()>=5;
    }
}
