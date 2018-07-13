Project: Guess The Movie
Link : https://classroom.udacity.com/courses/ud283/lessons/fbea4b4b-485d-4eb6-b010-c01241944726/concepts/3b5d67c0-4010-44ae-a164-448854171e06

The rules are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of. Your goal is to try to figure out the movie by guessing one letter at a time.

If a letter is indeed in the title the computer will reveal its correct position in the word, if not, you lose a point. If you lose 10 points, game over!

BUT the more correct letters you guess the more obvious the movie becomes and at a certain point you should be able to figure it out.

The program will randomly pick a movie title from a text file that contains a large list of movies.

Once the computer picks a random title, it will display underscores "_" in place of the real letters, thereby only giving away the number of letters in the movie title.

Then it will wait for the player to enter their first letter guess.

If the letter was indeed in the word, the underscores "_" that match that letter will be replaced with the correct letter revealing how many letters have matched their guess and where they are.

If their guess isn't in the movie title, then the output will display the same output as the previous step as well as any letters that have been previously guessed wrong.

Eventually, if the player manages to guess all the letters in the movie title correctly before they lost 10 points, they win

