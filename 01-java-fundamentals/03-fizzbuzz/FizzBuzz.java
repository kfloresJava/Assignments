public class FizzBuzz {
    public String fizzbuzz(int yourNumber)
    {
        String resp="";
        if(yourNumber%3==0)
        {
            resp="FIZZ";
        }
        if(yourNumber%5==0)
        {
            resp=resp+"BUZZ";
        }
        return resp;
    }

    public void testit()
    {
        
        for (int i = 1; i <= 50; i++) {
            String res= fizzbuzz(i);
            System.out.println("The number "+i+" "+res);
        }
    }
}
