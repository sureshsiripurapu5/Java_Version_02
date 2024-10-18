void  main()
      {
	char colour[8];  // string

	clrscr();
	printf("Enter your favourite colour?");
	scanf("%s",colour);
	printf("%s",colour);
	switch(colour)
	{
	  case "black":
		    printf("too selfish");
		    break;
	  case "blue":
		   printf("too foodie");
		   break;

	 }
       getch();
      }
