#include <stdio.h>
#include <math.h>
#include <string.h>
char toABC(int num)
{
    char str;
    switch (num)
    {
    case 10:
        str = 'A';
        return str;
        break;

    case 11:
        str = 'C';
        return str;
        break;

    case 12:
        str = 'C';
        return str;
        break;

    case 13:
        str = 'D';
        return str;
        break;

    case 14:
        str = 'E';
        return str;
        break;

    case 15:
        str = 'F';
        return str;
        break;
    }
}
void main()
{
    printf("Enter any decimal number : \n");
    int dec;
    scanf("%d", &dec);

    char hex[10] = "";
    char hexFinal[10] = "";
    char num_str[10];
    int i = 0;
    while (dec > 0)
    {
        int rem = dec % 16;
        if (rem > 9)
        {
            // printf("%c ", toABC(rem));
            hex[i] = toABC(rem);
        }
        else
        {
            // printf("%d ", rem);
            sprintf(num_str, "%d", rem);
            strcat(hex, num_str);
            // hex[i] = rem;
        }
        i++;
        dec = dec / 16;
    }
    printf("Hex value is: %s\n", hex);

    printf("Hex value is: %s\n", strrev(hex));
}