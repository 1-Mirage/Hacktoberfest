#include <bits/stdc++.h>
int main()
{
    int a[100],n,i,c=0;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    i=0;
    while(i<n-1)
    {
        if(a[i+2]==0)
        {i=i+2;
        c++;
        }
        else
        if(a[i+1]==0)
        {
            i=i+1;
            c++;
        }

    }
    printf("%d",c);
}
