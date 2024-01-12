class Armstrong_num{

public static void main(String[] args){
int sum=0;
int  a=124;
int a1=a;
int a2=a;
int count=0;
while(a1>0)
{
count++;
a1/=10;
}
while(a2>0)
{
int rem=a2%10;
int result=1;
for(int i=1;i<=count;i++)
{
result=result*rem;
}
sum=sum+result;
a2=a2/10;
}
if(sum==a)
{
System.out.println("Armstrong number");
}

}}



