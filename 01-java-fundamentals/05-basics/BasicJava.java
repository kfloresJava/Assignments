public class BasicJava {
    public void printNumbers()
    {
        for(int i=1;i<=255;i++)
        {
            System.out.println(i);
        }
    }
    public void printOddNumbers()
    {
        for(int i=1;i<=255;i++)
        {
            if(i%2!=0)
            {
            System.out.println(i);
            }
        }
    }
    public int printSigma()
    {
        int numx=0;
        for(int i=1;i<=255;i++)
        {
           numx+=i;
        }
        return numx;
    }

    public void printArray()
    {
        int arrvals[] ={1,3,5,7,9,13};
        for(int i=0;i<=arrvals.length-1;i++)
        {
            System.out.println(arrvals[i]);
        }
    }
    public void showArray(long valx[])
    {
        
        for(int i=0;i<=valx.length-1;i++)
        {
            System.out.println(valx[i]);
        }
    }

    public long largestVal(long valx[])
    {
        long max=0;
        for(int i=0;i<=valx.length-1;i++)
        {
            if(max<valx[i])
            {
                max=valx[i];
            }
        }
        return max;
    }

    public long[] oddNumbers()
    {   int n=0;

        long valnew[]=new long[128];
        for(int i=0;i<=255;i++)
        {
            if(i%2!=0)
            {
                valnew[n]=i;
                n++;
            }
        }

        return valnew;
    }

    public long getAverage(long[] nums)
    {   
        long mtotal=0;
        for(int i=0;i<=nums.length-1;i++)
        {
           mtotal+=nums[i];
        }

        long average=mtotal/nums.length;
        return average;
    }

    public long greaterThan(long[] nums,int y)
    {   
        long count=0;
        for(int i=0;i<=nums.length-1;i++)
        {
           if(nums[i]>y)
           {
               count++;
           }
        }

        return count;
    }

    public long[] squareVal(long[] nums)
    {   
        long valnew[]=new long[nums.length];
        for(int i=0;i<=nums.length-1;i++)
        {
          valnew[i]=nums[i]*nums[i];
        }

        return valnew;
    }

    public long[] removeNegatives(long[] nums)
    {   

        for(int i=0;i<=nums.length-1;i++)
        {
           if(nums[i]<0)
           {
               nums[i]=0;
           }
         
        }
        return nums;
    }

    public long[] maxMinAve(long[] nums)
    {   

        
        long max=0,min=0,ave=0;
       //max
        for(int i=0;i<=nums.length-1;i++)
        {
           if(max<nums[i])
            {
               max=nums[i];
            }
            if(min>nums[i])
            {
                min=nums[i];
            }
             ave=ave+nums[i];
         
        }
        ave=ave/nums.length;
        long ans[]={max,min,ave};

        return ans;
    }

    public long[] shiftingArrays(long[] nums)
    {   
       //max
        for(int i=0;i<nums.length-1;i++)
        {  
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=0;

        return nums;
    }
}
