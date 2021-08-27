import java.util.Random;
public class PuzzleJava {
    

    public int[] getTenRolls()
    {   
        Random randx= new Random();
        int rand[]=new int[10]; 
        for(int i=0;i<10;i++)
        {
            rand[i]=randx.nextInt(20)+1;
        }
        return rand;
    }
    public String generateLetter()
    {   
        String lets[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Random randx= new Random();
        int rand=randx.nextInt(25)+1;
        return lets[rand];
    }
    public String generatePassword()
    {
        String pass="";   
       for(int i=1;i<9;i++)
       {
           pass=pass+generateLetter();
       }
       return pass;
    }
    public String[] generatePasswordSet(int count)
    {
        String passSet[]= new String[count];
       for(int i=0;i<count;i++)
       {
          passSet[i]= generatePassword();
       }
       return passSet;
    }

    public void showArray(int valx[])
    {
        
        for(int i=0;i<=valx.length-1;i++)
        {
            System.out.print(valx[i]+" ");
        }
    }
    
    public void showArray(String valx[])
    {
        
        for(int i=0;i<=valx.length-1;i++)
        {
            System.out.print(valx[i]+" ");
        }
    }
    //Sensei
    public int[] shuffleArray(int valx[])
    {
        Random randx= new Random();
        int temp=0;
        for(int x=0;x<valx.length;x++)
        {
          
            int rand=randx.nextInt(valx.length-1)+1;
            temp=valx[rand];
            valx[rand]=valx[x];
            valx[x]=temp;
        }
        return valx;
    }


}
