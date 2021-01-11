import java.util.*;
class ttt
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    int a[][] = new int[3][3];
    int i,j,p1,p2,f=1,c=1,s,resp,flag=0;

    for(i=0;i<3;i++)
      for(j=0;j<3;j++)
        a[i][j] = -1;

    do
    {
     System.out.println("Player1 enter your Symbol. Choose either 1 or 2");
     p1 = sc.nextInt();

     if((p1 == 1)||(p1 == 2))
       break;
     else
     {
       System.out.println("Wrong symbol entered.Pleaase enter either 1 or 2");
       p1 = sc.nextInt();
     }
    }while(true);





    if(p1 == 1)
      p2 = 2;
    else
      p2 = 1;




    while(c<=9)
    {
      if(f == 1)
      {
       System.out.println("Player1 enter your box number");
      }
      else
      {
        System.out.println("Player2 enter your box number");
      }

      resp = sc.nextInt();
      switch(resp)
      {
        case 1: if(a[0][0] == -1)
                {
                  a[0][0] = f;
                  if(((a[0][1] == f)&&(a[0][2] == f))||((a[1][0] == f)&&(a[2][0] == f))||((a[1][1] == f)&&(a[2][2] == f)))
                  {
                    System.out.println("Player"+f+" won!");
                    flag = 4;
                  }
                  s = change(f);
                  f =s;
                }
                break;

       case 2 : if(a[0][1] == -1)
                {
                  a[0][1] = f;
                  if(((a[0][0] == f)&&(a[0][2] == f))||((a[1][1] == f)&&(a[2][1] == f)))
                      {
                        System.out.println("Player"+f+" won!");
                        flag = 4;
                      }
                  s = change(f);
                  f = s;
                }
                break;

      case 3: if(a[0][2] == -1)
              {
                a[0][2] = f;
                if(((a[0][0] == f)&&(a[0][1] == f))||((a[1][2] == f)&&(a[2][2] == f))||((a[1][1] == f)&&(a[2][0] == f)))
                {
                 System.out.println("Player"+f+" won!");
                 flag = 4;
                }
                s = change(f);
                f = s;
              }
              break;

      case 4: if(a[1][0] == -1)
              {
                a[1][0] = f;
                if(((a[0][0] == f)&&(a[2][0] == f))||((a[1][1] == f)&&(a[1][2] == f)))
                {
                  System.out.println("Player"+f+" won!");
                  flag = 4;
                }
                s = change(f);
                f = s;
              }
              break;

     case 5: if(a[1][1] == -1)
             {
               a[1][1] = f;
               if(((a[0][0] == f)&&(a[2][2] == f))||((a[0][1] == f)&&(a[2][1] == f))||((a[0][2] == f)&&(a[2][0] == f))||((a[1][0] == f)&&(a[1][2] == f)))
                   {
                     System.out.println("Player"+f+" won!");
                     flag =4;
                   }
              s = change(f);
              f = s;
             }
             break;

      case 6: if(a[1][2] == -1)
              {
               a[1][2] = f;
               if(((a[0][2] == f)&&(a[2][2] == f))||((a[1][0] == f)&& (a[1][1] == f)))
               {
                 System.out.println("Player"+f+" won!");
                 flag =4;
               }
               s = change(f);
               f = s;
              }
              break;

      case 7: if(a[2][0] == -1)
              {
                a[2][0] = f;
                if(((a[0][0] == f)&&(a[1][0] == f))||((a[1][1] == f)&& (a[0][2] == f))||((a[2][1] == f)&&(a[2][2] == f)))
                {
                 System.out.println("Player"+f+" won!");
                 flag =4;
                }
                s = change(f);
                f = s;
              }
              break;

      case 8: if(a[2][1] == -1)
              {
                a[2][1] = f;
                if(((a[0][1] == f)&&(a[1][1] == f))||((a[2][0] == f)&& (a[2][2] == f)))
                {
                 System.out.println("Player"+f+" won!");
                 flag =4;
                }
                s = change(f);
                f = s;
              }
              break;

     case 9: if(a[2][2] == -1)
             {
               a[2][2] = f;
               if(((a[0][2] == f)&&(a[1][2] == f))||((a[0][0] == f)&&(a[1][1] == f))||((a[2][0] == f)&&(a[2][1] == f)))
               {
                 System.out.println("Player"+f+" won!");
                 flag = 4;
               }
              s =  change(f);
              f = s;
             }
             break;

     default: System.out.println("Either incorrect box number selected or a filled box is selected.Please enter a proper response.");
              break;
      }//switch

      c++;

      if(flag == 4)
        break;
     }//while


    if(flag != 4)
      System.out.println("Its a draw");


    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
        System.out.print(a[i][j]+"  ");
      System.out.println();
    }
 }


    public static int change(int f)
    {
     if(f == 1)
       return 2;
     return 1;
    }

}
