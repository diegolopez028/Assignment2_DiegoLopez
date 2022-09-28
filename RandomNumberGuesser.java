import java.util.Scanner;
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: Random number generator and ask user to guess in 7 tries
 * Due: 09/28/2022
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Diego Lopez_____
*/


public class RandomNumberGuesser {

	

	public static void main(String[] args) 
	{
		System.out.println("This application generates a random integer between 1 and 100");
		System.out.println("and asks the user to guess repeadlty until they guess correctly");
		Scanner in = new Scanner(System.in);
		RNG g = new RNG();
		int guess;
		final int max1 = 100;
		final int min1 = 1;
		int min = 1;
		int max = 100;
		int count = 1;
		String loop;
		int n = g.rand();
		
		
		System.out.println("Enter your first guess: ");
		while(true)
		{
			guess = in.nextInt();
		
			if(count < 8)
			{
				if(guess > n)
					{
						if(guess >= min && guess <= max)
						{
							max = guess - 1;
							if(count == 7)
							{
								System.out.println("Your guess count is: " + count);
								System.out.println("You have exceeded the maximun number of guesses." );
								break;
							
						
							}
							System.out.println("Your guess is too high");
							System.out.println("Your guess count is: " + count);
					
				   
							System.out.println("Enter your next guess between " + min + " and "
									+ max);
							++count;
						}
						else if(guess > max)
						{
							if(count == 7)
							{
								g.inputValidation(guess, min, max);
								System.out.println("You have exceeded the maximun number of guesses." );
								break;
							
						
							}
							g.inputValidation(guess, min, max);
							System.out.println("Your guess count is " + count);
							System.out.println("Enter your next guess between " + min + " and "
									+ max);
							
						}
						else
						{
							if(guess == n)
							{
							
								System.out.println("Congratulations you guessed correctly");
								g.resetCount();
								n = g.rand();
								count = 1;
								max = 100;
								min = 1;
								System.out.println("Try again ? (yes or no)");
								Scanner newin = new Scanner(System.in);
								String loop1 = newin.nextLine();
								if(loop1.equalsIgnoreCase("yes"))
								{
									System.out.println("Enter your first guess: ");
									continue;
									 
									
								}
								else
								{

									System.out.println("Thanks for playing...");
									System.out.println("Programmer Name: Diego Lopez");
									
								}
							}
							
					
						}
					

					}
			
					else if(guess < n)
					{
						if(guess >= min && guess <= max)
						{
							min = guess + 1;
							if(count == 7)
							{
								System.out.println("Your guess count is: " + count);
								System.out.println("You have exceeded the maximun number of guesses." );
								break;
							
						
							}
							System.out.println("Your guess is too low.");
							System.out.println("Your guess count is: " + count);
							System.out.println("Enter your next guess between " + min + " and "
									+ max );
							++count;
							
							
							
				
						}
						else if(guess < min)
						{
							if(count == 7)
							{
								g.inputValidation(guess, min, max);
								System.out.println("You have exceeded the maximun number of guesses." );
								break;
						
							}
							g.inputValidation(guess, min, max);
							System.out.println("Your guess count is " + count);
							System.out.println("Enter your next guess between " + min + " and "
									+ max);
							++count;
							
						}
				
				
					}
			

						
					else 
					{
						if(guess == n)
						{
						
							System.out.println("Congratulations you guessed correctly");
							g.resetCount();
							n = g.rand();
							count = 1;
							max = 100;
							min = 1;
							System.out.println("Try again ? (yes or no)");
							Scanner newin = new Scanner(System.in);
							String loop1 = newin.nextLine();
							if(loop1.equalsIgnoreCase("yes"))
							{
								System.out.println("Enter your first guess: ");
								continue;
								 
								
							}
							else
							{

								System.out.println("Thanks for playing...");
								System.out.println("Programmer Name: Diego Lopez");
								
							}
						}
						
					}
			
				
				
				
	}
			
		
}
		




}		
		
		
}		
	

	
		

	


