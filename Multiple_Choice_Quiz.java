// NBA Multiple Choice Quiz
// By Ved Patel
// April 24, 2021
// Grade 10 Computer Tech, Mr.Burke's class

import java.util.Scanner;

public class Multiple_Choice_Quiz
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);                                                                                  // Making a scanner to get input from a user
        int score = 0, startQ = 0, check, a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0, a10 = 0;      // "score" keeps track of how many questions user got correct, "startQ" acts as an activation to start whatever number question it is, "check" is used for user to confirm their answer, "a1 - a10" represent answers to each question
        String Start;                                                                                                           // "Start" keeps track of the intro question

        System.out.println("Welcome to my NBA quiz. To answer a question, type '1', '2', '3', or '4'. To start, type 'Begin'.");// Intro
        Start = scan.nextLine();                                                                                                // Scans for input and sets it to "Start"

        while (!Start.equals(""))                                                                                               // This entire while loop checks to see if "Start" is what I want  it to be
            if (Start.equalsIgnoreCase("Begin"))                                                                                // If Start is begin (ignoring caps lock), startQ becomes 1 and the while loop is stopped
            {
                startQ = 1;
                break;
            }
            else                                                                                                                // if Start is not begin, it asks again. This will happen until the user types in begin
            {
                System.out.println("To start, type 'Begin'.");
                Start = scan.nextLine();
            }

        if (startQ == 1)                                                                                                        // startQ equals 1 since the user typed in begin, so question 1 will start
        {
            System.out.println("Q1. Which NBA team has won the most amount of championships? \n " +                             // asks the question, \n means next line, this helps format text better
            "1. Golden State Warriors \n 2. Philadelphia 76ers\n 3. Los Angeles Lakers\n 4. Boston Celtics\n");
            a1 = scan.nextInt();                                                                                                // scans input and sets it to a1

            while (a1 != 0)                                                                                                     // while answer to question 1 is not nothing (something),
            {
                if ((a1 == 1) || (a1 == 2) || (a1 == 3) || (a1 == 4))                                                           // if answer is one of the acceptable options (1, 2, 3, or 4), it will make sure it is what the user wants and award a point if correct
                {
                    if (a1 == 1)                                                                                                                  // if user answers 1
                    {
                        System.out.println("Are you sure that you would like to choose 1. Golden State Warriors? (Type 1 for yes, 0 for no)");    // asks user if they are sure,
                        check = scan.nextInt();                                                                                                   // sets 'check' to 1 (yes) or 0 (no)
                        if (check == 1)
                        {
                            System.out.println("Incorrect! The correct answer was 3. or 4. The Los Angeles Lakers and the Boston Celtics for the most championships with 17 each.");   // If user confirms answer, program says user is wrong, states correct answer, and adds 0 to score
                            startQ = 2;                                                                                                           // sets startQ to 2 so question 2 will begin
                            break;                                                                                                                // break cancels while loop
                        }
                        if (check == 0)
                        {
                            System.out.println("Q1. Which NBA team has won the most amount of championships? (Type '1', '2', '3', or '4'.)\n " +  // since user entered 0 (no) on whether they wanted to confirm their answer, program restates that question and options
                                    "1. Golden State Warriors \n 2. Philadelphia 76ers\n 3. Los Angeles Lakers\n 4. Boston Celtics\n");
                            a1 = scan.nextInt();                                                                                                  // scans input and sets it to a1 again
                        }
                    }

                    if (a1 == 2)                                                                                                                  // does the same thing as if they answered 1 but instead this time it is with 2
                    {
                        System.out.println("Are you sure that you would like to choose 2. Philadelphia 76ers? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! The correct answer was 3. or 4. The Los Angeles Lakers and the Boston Celtics for the most championships with 17 each.");
                            startQ = 2;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q1. Which NBA team has won the most amount of championships? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Golden State Warriors \n 2. Philadelphia 76ers\n 3. Los Angeles Lakers\n 4. Boston Celtics\n");
                            a1 = scan.nextInt();
                        }
                    }

                    if (a1 == 3)
                    {
                        System.out.println("Are you sure that you would like to choose 3. Los Angeles Lakers? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! The Los Angeles Lakers and the Boston Celtics for the most championships with 17 each so 3. and 4. are both correct answers.");
                            score += 1;                                                                                                         // since this is one of the correct answers, it adds 1 to your score if you chose it
                            startQ = 2;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q1. Which NBA team has won the most amount of championships? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Golden State Warriors \n 2. Philadelphia 76ers\n 3. Los Angeles Lakers\n 4. Boston Celtics\n");
                            a1 = scan.nextInt();
                        }
                    }

                    if (a1 == 4)
                    {
                        System.out.println("Are you sure that you would like to choose 4. Boston Celtics? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! The Los Angeles Lakers and the Boston Celtics for the most championships with 17 each so 3. and 4. are both correct answers.");
                            score += 1;                                                                                                         // option 4 also adds 1 to score because 3 and 4 are both correct answers for this specific question
                            startQ = 2;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q1. Which NBA team has won the most amount of championships? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Golden State Warriors \n 2. Philadelphia 76ers\n 3. Los Angeles Lakers\n 4. Boston Celtics\n");
                            a1 = scan.nextInt();
                        }
                    }
                }
                else                                                                                                                            // if answer is not 1, 2, 3, or 4
                    {
                        System.out.println("1. Which NBA team has won the most amount of championships? (Type '1', '2', '3', or '4' to choose an answer.)\n " +     // restate the question
                                "1. Golden State Warriors \n 2. Philadelphia 76ers\n 3. Los Angeles Lakers\n 4. Boston Celtics\n");
                        a1 = scan.nextInt();                                                                                                                        // set ai to user's input
                    }
            }
        }

        if (startQ == 2)                                                                                                                        // question 2 will only start when question 1 is complete. This is because startQ becomes equal to 2 when the user confirms their answer for question 1
        {
            System.out.println("Q2. Which NBA team won the NBA championship in the 2019-2020 season? \n " +
                    "1. Los Angeles Lakers \n 2. Miami Heat\n 3. Los Angeles Clippers\n 4. Milwaukee Bucks\n");
            a2 = scan.nextInt();

            while (a2 != 0)
            {
                if ((a2 == 1) || (a2 == 2) || (a2 == 3) || (a2 == 4))
                {
                    if (a2 == 1)
                    {
                        System.out.println("Are you sure that you would like to choose 1. Los Angeles Lakers? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! The Los Angeles Lakers defeated the Miami Heat in six games to win the championship in the 2020-2021 season.");
                            score += 1;
                            startQ = 3;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q2. Which NBA team won the NBA championship in the 2019-2020 season? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Los Angeles Lakers \n 2. Miami Heat\n 3. Los Angeles Clippers\n 4. Milwaukee Bucks\n");
                            a2 = scan.nextInt();
                        }
                    }

                    if (a2 == 2)
                    {
                        System.out.println("Are you sure that you would like to choose 2. Miami Heat? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! The correct answer was 1. The Los Angeles Lakers defeated the Miami Heat in six games to win the championship in the 2020-2021 season.");
                            startQ = 3;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q2. Which NBA team won the NBA championship in the 2019-2020 season? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Los Angeles Lakers  \n 2. Miami Heat\n 3. Los Angeles Clippers \n 4. Milwaukee Bucks\n");
                            a2 = scan.nextInt();
                        }
                    }

                    if (a2 == 3)
                    {
                        System.out.println("Are you sure that you would like to choose 3. Los Angeles Clippers? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! The correct answer was 1. The Los Angeles Lakers defeated the Miami Heat in six games to win the championship in the 2020-2021 season.");
                            startQ = 3;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q2. Which NBA team won the NBA championship in the 2019-2020 season? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Los Angeles Lakers  \n 2. Miami Heat\n 3. Los Angeles Clippers \n 4. Milwaukee Bucks\n");
                            a2 = scan.nextInt();
                        }
                    }

                    if (a2 == 4)
                    {
                        System.out.println("Are you sure that you would like to choose 4. Milwaukee Bucks? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! The correct answer was 1. The Los Angeles Lakers defeated the Miami Heat in six games to win the championship in the 2020-2021 season.");
                            startQ = 3;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q2. Which NBA team won the NBA championship in the 2019-2020 season? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Los Angeles Lakers  \n 2. Miami Heat\n 3. Los Angeles Clippers \n 4. Milwaukee Bucks\n");
                            a2 = scan.nextInt();
                        }
                    }
                }
                else
                {
                    System.out.println("Q2. Which NBA team won the NBA championship in the 2019-2020 season? (Type '1', '2', '3', or '4' to choose an answer.)\n " +
                            "1. Los Angeles Lakers  \n 2. Miami Heat\n 3. Los Angeles Clippers \n 4. Milwaukee Bucks\n");
                    a2 = scan.nextInt();
                }
            }
        }

        if (startQ == 3)
        {
            System.out.println("Q3. How many teams are there in the NBA? \n " +
                    "1. 32 \n 2. 34\n 3. 30\n 4. 31\n");
            a3 = scan.nextInt();

            while (a3 != 0)
            {
                if ((a3 == 1) || (a3 == 2) || (a3 == 3) || (a3 == 4))
                {
                    if (a3 == 1)
                    {
                        System.out.println("Are you sure that you would like to choose 1. 32? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! There are 30 teams in the NBA.");
                            startQ = 4;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q3. How many teams are there in the NBA? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. 32 \n 2. 34\n 3. 30\n 4. 31\n");
                            a3 = scan.nextInt();
                        }
                    }

                    if (a3 == 2)
                    {
                        System.out.println("Are you sure that you would like to choose 2. 34? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! There are 30 teams in the NBA.");
                            startQ = 4;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q3. How many teams are there in the NBA? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. 32 \n 2. 34\n 3. 30\n 4. 31\n");
                            a3 = scan.nextInt();
                        }
                    }

                    if (a3 == 3)
                    {
                        System.out.println("Are you sure that you would like to choose 3. 30? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! There are 30 teams in the NBA.");
                            score += 1;
                            startQ = 4;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q3. How many teams are there in the NBA? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. 32 \n 2. 34\n 3. 30\n 4. 31\n");
                            a3 = scan.nextInt();
                        }
                    }

                    if (a3 == 4)
                    {
                        System.out.println("Are you sure that you would like to choose 4. 31? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! There are 30 teams in the NBA.");
                            startQ = 4;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q3. How many teams are there in the NBA? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. 32 \n 2. 34\n 3. 30\n 4. 31\n");
                            a3 = scan.nextInt();
                        }
                    }
                }
                else
                {
                    System.out.println("Q3. How many teams are there in the NBA? (Type '1', '2', '3', or '4' to choose an answer.)\n " +
                            "1. 32 \n 2. 34\n 3. 30\n 4. 31\n");
                    a3 = scan.nextInt();
                }
            }
        }

        if (startQ == 4)
        {
            System.out.println("Q4. Which player has scored the most points of all-time? \n " +
                    "1. Michael Jordan \n 2. LeBron James\n 3. Shaquille O’Neal\n 4. Kareem Abdul-Jabbar\n");
            a4 = scan.nextInt();

            while (a4 != 0)
            {
                if ((a4 == 1) || (a4 == 2) || (a4 == 3) || (a4 == 4))
                {
                    if (a4 == 1)
                    {
                        System.out.println("Are you sure that you would like to choose 1. Michael Jordan? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Kareem Abdul-Jabbar scored the most points of all-time with 38,387.");
                            startQ = 5;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q4. Which player has scored the most points of all-time? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Michael Jordan \n 2. LeBron James\n 3. Shaquille O’Neal\n 4. Kareem Abdul-Jabbar\n");
                            a4 = scan.nextInt();
                        }
                    }

                    if (a4 == 2)
                    {
                        System.out.println("Are you sure that you would like to choose 2. LeBron James? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Kareem Abdul-Jabbar scored the most points of all-time with 38,387.");
                            startQ = 5;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q4. Which player has scored the most points of all-time? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Michael Jordan \n 2. LeBron James\n 3. Shaquille O’Neal\n 4. Kareem Abdul-Jabbar\n");
                            a4 = scan.nextInt();
                        }
                    }

                    if (a4 == 3)
                    {
                        System.out.println("Are you sure that you would like to choose 3. Shaquille O'Neal? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Kareem Abdul-Jabbar scored the most points of all-time with 38,387.");
                            startQ = 5;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q4. Which player has scored the most points of all-time? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Michael Jordan \n 2. LeBron James\n 3. Shaquille O’Neal\n 4. Kareem Abdul-Jabbar\n");
                            a4 = scan.nextInt();
                        }
                    }

                    if (a4 == 4)
                    {
                        System.out.println("Are you sure that you would like to choose 4. Kareem Abdul-Jabbar? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! Kareem Abdul-Jabbar scored the most points of all-time with 38,387.");
                            score += 1;
                            startQ = 5;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q4. Which player has scored the most points of all-time? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Michael Jordan \n 2. LeBron James\n 3. Shaquille O’Neal\n 4. Kareem Abdul-Jabbar\n");
                            a4 = scan.nextInt();
                        }
                    }
                }
                else
                {
                    System.out.println("Q4. Which player has scored the most points of all-time? (Type '1', '2', '3', or '4' to choose an answer.)\n " +
                            "1. Michael Jordan \n 2. LeBron James\n 3. Shaquille O’Neal\n 4. Kareem Abdul-Jabbar\n");
                    a4 = scan.nextInt();
                }
            }
        }

        if (startQ == 5)
        {
            System.out.println("Q5. Which NBA player has scored the most points in a single game? \n " +
                    "1. LeBron James \n 2. Wilt Chamberlain\n 3. Michael Jordan\n 4. Kobe Bryant\n");
            a5 = scan.nextInt();

            while (a5 != 0)
            {
                if ((a5 == 1) || (a5 == 2) || (a5 == 3) || (a5 == 4))
                {
                    if (a5 == 1)
                    {
                        System.out.println("Are you sure that you would like to choose 1. LeBron James? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Wilt Chamberlain scored 100 points on March 2nd, 1962, a record which still stands to this day.");
                            startQ = 6;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q5. Which NBA player has scored the most points in a single game? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. LeBron James \n 2. Wilt Chamberlain\n 3. Michael Jordan\n 4. Kobe Bryant\n");
                            a5 = scan.nextInt();
                        }
                    }

                    if (a5 == 2)
                    {
                        System.out.println("Are you sure that you would like to choose 2. Wilt Chamberlain? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! Wilt Chamberlain scored 100 points on March 2nd, 1962, a record which still stands to this day.");
                            score += 1;
                            startQ = 6;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q5. Which NBA player has scored the most points in a single game? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. LeBron James \n 2. Wilt Chamberlain\n 3. Michael Jordan\n 4. Kobe Bryant\n");
                            a5 = scan.nextInt();
                        }
                    }

                    if (a5 == 3)
                    {
                        System.out.println("Are you sure that you would like to choose 3. Michael Jordan? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Wilt Chamberlain scored 100 points on March 2nd, 1962, a record which still stands to this day.");
                            startQ = 6;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q5. Which NBA player has scored the most points in a single game? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. LeBron James \n 2. Wilt Chamberlain\n 3. Michael Jordan\n 4. Kobe Bryant\n");
                            a5 = scan.nextInt();
                        }
                    }

                    if (a5 == 4)
                    {
                        System.out.println("Are you sure that you would like to choose 4. Kobe Bryant? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Wilt Chamberlain scored 100 points on March 2nd, 1962, a record which still stands to this day.");
                            startQ = 6;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q5. Which NBA player has scored the most points in a single game? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. LeBron James \n 2. Wilt Chamberlain\n 3. Michael Jordan\n 4. Kobe Bryant\n");
                            a5 = scan.nextInt();
                        }
                    }
                }
                else
                {
                    System.out.println("Q5. Which NBA player has scored the most points in a single game? (Type '1', '2', '3', or '4' to choose an answer.)\n " +
                            "1. LeBron James \n 2. Wilt Chamberlain\n 3. Michael Jordan\n 4. Kobe Bryant\n");
                    a5 = scan.nextInt();
                }
            }
        }

        if (startQ == 6)
        {
            System.out.println("Q6. Which NBA team has the longest winning streak of all-time? \n " +
                    "1. Los Angeles Lakers \n 2. Toronto Raptors\n 3. Boston Celtics\n 4. New York Knicks\n");
            a6 = scan.nextInt();

            while (a6 != 0)
            {
                if ((a6 == 1) || (a6 == 2) || (a6 == 3) || (a6 == 4))
                {
                    if (a6 == 1)
                    {
                        System.out.println("Are you sure that you would like to choose 1. Los Angeles Lakers? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! The Los Angeles Lakers won 33 straight games in the 1971-72 season, a record which still stands to this day.");
                            score += 1;
                            startQ = 7;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q6. Which NBA team has the longest winning streak of all-time? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Los Angeles Lakers \n 2. Toronto Raptors\n 3. Boston Celtics\n 4. New York Knicks\n");
                            a6 = scan.nextInt();
                        }
                    }

                    if (a6 == 2)
                    {
                        System.out.println("Are you sure that you would like to choose 2. Toronto Raptors? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! The Los Angeles Lakers won 33 straight games in the 1971-72 season, a record which still stands to this day.");
                            startQ = 7;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q6. Which NBA team has the longest winning streak of all-time? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Los Angeles Lakers \n 2. Toronto Raptors\n 3. Boston Celtics\n 4. New York Knicks\n");
                            a6 = scan.nextInt();
                        }
                    }

                    if (a6 == 3)
                    {
                        System.out.println("Are you sure that you would like to choose 3. Boston Celtics? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! The Los Angeles Lakers won 33 straight games in the 1971-72 season, a record which still stands to this day.");
                            startQ = 7;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q6. Which NBA team has the longest winning streak of all-time? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Los Angeles Lakers \n 2. Toronto Raptors\n 3. Boston Celtics\n 4. New York Knicks\n");
                            a6 = scan.nextInt();
                        }
                    }

                    if (a6 == 4)
                    {
                        System.out.println("Are you sure that you would like to choose 4. New York Knicks? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! The Los Angeles Lakers won 33 straight games in the 1971-72 season, a record which still stands to this day.");
                            startQ = 7;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q6. Which NBA team has the longest winning streak of all-time? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Los Angeles Lakers \n 2. Toronto Raptors\n 3. Boston Celtics\n 4. New York Knicks\n");
                            a6 = scan.nextInt();
                        }
                    }
                }
                else
                {
                    System.out.println("Q6. Which NBA team has the longest winning streak of all-time? (Type '1', '2', '3', or '4' to choose an answer.)\n " +
                            "1. Los Angeles Lakers \n 2. Toronto Raptors\n 3. Boston Celtics\n 4. New York Knicks\n");
                    a6 = scan.nextInt();
                }
            }
        }

        if (startQ == 7)
        {
            System.out.println("Q7. Which NBA team does Stephen Curry play for? \n " +
                    "1. Denver Nuggets \n 2. Brooklyn Nets\n 3. Philadelphia 76ers\n 4. Golden State Warriors\n");
            a7 = scan.nextInt();

            while (a7 != 0)
            {
                if ((a7 == 1) || (a7 == 2) || (a7 == 3) || (a7 == 4))
                {
                    if (a7 == 1)
                    {
                        System.out.println("Are you sure that you would like to choose 1. Denver Nuggets? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Steph Curry plays for the Golden State Warriors.");
                            startQ = 8;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q7. Which NBA team does Stephen Curry play for? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Denver Nuggets \n 2. Brooklyn Nets\n 3. Philadelphia 76ers\n 4. Golden State Warriors\n");
                            a7 = scan.nextInt();
                        }
                    }

                    if (a7 == 2)
                    {
                        System.out.println("Are you sure that you would like to choose 2. Brooklyn Nets? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Steph Curry plays for the Golden State Warriors.");
                            startQ = 8;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q7. Which NBA team does Stephen Curry play for? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Denver Nuggets \n 2. Brooklyn Nets\n 3. Philadelphia 76ers\n 4. Golden State Warriors\n");
                            a7 = scan.nextInt();
                        }
                    }

                    if (a7 == 3)
                    {
                        System.out.println("Are you sure that you would like to choose 3. Philadelphia 76ers? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Steph Curry plays for the Golden State Warriors.");
                            startQ = 8;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q7. Which NBA team does Stephen Curry play for? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Denver Nuggets \n 2. Brooklyn Nets\n 3. Philadelphia 76ers\n 4. Golden State Warriors\n");
                            a7 = scan.nextInt();
                        }
                    }

                    if (a7 == 4)
                    {
                        System.out.println("Are you sure that you would like to choose 4. Golden State Warriors? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! Steph Curry plays for the Golden State Warriors.");
                            score += 1;
                            startQ = 8;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q7. Which NBA team does Stephen Curry play for? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Denver Nuggets \n 2. Brooklyn Nets\n 3. Philadelphia 76ers\n 4. Golden State Warriors\n");
                            a7 = scan.nextInt();
                        }
                    }
                }
                else
                {
                    System.out.println("Q7. Which NBA team does Stephen Curry play for? (Type '1', '2', '3', or '4' to choose an answer.)\n " +
                            "1. Denver Nuggets \n 2. Brooklyn Nets\n 3. Philadelphia 76ers\n 4. Golden State Warriors\n");
                    a7 = scan.nextInt();
                }
            }
        }

        if (startQ == 8)
        {
            System.out.println("Q8. Which NBA player has won the most amount of MVP awards? \n " +
                    "1. Michael Jordan \n 2. Magic Johnson\n 3. Kareem Adbul-Jabbar\n 4. LeBron James\n");
            a8 = scan.nextInt();

            while (a8 != 0)
            {
                if ((a8 == 1) || (a8 == 2) || (a8 == 3) || (a8 == 4))
                {
                    if (a8 == 1)
                    {
                        System.out.println("Are you sure that you would like to choose 1. Michael Jordan? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Kareem Abdul-Jabbar has won the most amount of MVP's with 6.");
                            startQ = 9;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q8. Which NBA player has won the most amount of MVP awards? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Michael Jordan \n 2. Magic Johnson\n 3. Kareem Adbul-Jabbar\n 4. LeBron James\n");
                            a8 = scan.nextInt();
                        }
                    }

                    if (a8 == 2)
                    {
                        System.out.println("Are you sure that you would like to choose 2. Magic Johnson? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Kareem Abdul-Jabbar has won the most amount of MVP's with 6.");
                            startQ = 9;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q8. Which NBA player has won the most amount of MVP awards? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Michael Jordan \n 2. Magic Johnson\n 3. Kareem Adbul-Jabbar\n 4. LeBron James\n");
                            a8 = scan.nextInt();
                        }
                    }

                    if (a8 == 3)
                    {
                        System.out.println("Are you sure that you would like to choose 3. Kareem Abdul-Jabbar? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! Kareem Abdul-Jabbar has won the most amount of MVP's with 6.");
                            score += 1;
                            startQ = 9;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q8. Which NBA player has won the most amount of MVP awards? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Michael Jordan \n 2. Magic Johnson\n 3. Kareem Adbul-Jabbar\n 4. LeBron James\n");
                            a8 = scan.nextInt();
                        }
                    }

                    if (a8 == 4)
                    {
                        System.out.println("Are you sure that you would like to choose 4. LeBron James? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Kareem Abdul-Jabbar has won the most amount of MVP's with 6.");
                            startQ = 9;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q8. Which NBA player has won the most amount of MVP awards? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Michael Jordan \n 2. Magic Johnson\n 3. Kareem Adbul-Jabbar\n 4. LeBron James\n");
                            a8 = scan.nextInt();
                        }
                    }
                }
                else
                {
                    System.out.println("Q8. Which NBA player has won the most amount of MVP awards? (Type '1', '2', '3', or '4' to choose an answer.)\n " +
                            "1. Michael Jordan \n 2. Magic Johnson\n 3. Kareem Adbul-Jabbar\n 4. LeBron James\n");
                    a8 = scan.nextInt();
                }
            }
        }

        if (startQ == 9)
        {
            System.out.println("Q9. Which NBA player won the MVP award in the 2019-2020 season? \n " +
                    "1. Giannis Antetokounmpo \n 2. James Harden\n 3. LeBron James\n 4. Kevin Durant\n");
            a9 = scan.nextInt();

            while (a9 != 0)
            {
                if ((a9 == 1) || (a9 == 2) || (a9 == 3) || (a9 == 4))
                {
                    if (a9 == 1)
                    {
                        System.out.println("Are you sure that you would like to choose 1. Giannis Antetokounmpo? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! Giannis Antetokounmpo of the Milwaukee Bucks won the 2019-20 MVP.");
                            score += 1;
                            startQ = 10;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q9. Which NBA player won the MVP award in the 2019-2020 season? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Giannis Antetokounmpo \n 2. James Harden\n 3. LeBron James\n 4. Kevin Durant\n");
                            a9 = scan.nextInt();
                        }
                    }

                    if (a9 == 2)
                    {
                        System.out.println("Are you sure that you would like to choose 2. James Harden? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Giannis Antetokounmpo of the Milwaukee Bucks won the 2019-20 MVP.");
                            startQ = 10;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q9. Which NBA player won the MVP award in the 2019-2020 season? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Giannis Antetokounmpo \n 2. James Harden\n 3. LeBron James\n 4. Kevin Durant\n");
                            a9 = scan.nextInt();
                        }
                    }

                    if (a9 == 3)
                    {
                        System.out.println("Are you sure that you would like to choose 3. LeBron James? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Giannis Antetokounmpo of the Milwaukee Bucks won the 2019-20 MVP.");
                            startQ = 10;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q9. Which NBA player won the MVP award in the 2019-2020 season? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Giannis Antetokounmpo \n 2. James Harden\n 3. LeBron James\n 4. Kevin Durant\n");
                            a9 = scan.nextInt();
                        }
                    }

                    if (a9 == 4)
                    {
                        System.out.println("Are you sure that you would like to choose 4. Kevin Durant? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Giannis Antetokounmpo of the Milwaukee Bucks won the 2019-20 MVP.");
                            startQ = 10;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q9. Which NBA player won the MVP award in the 2019-2020 season? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Giannis Antetokounmpo \n 2. James Harden\n 3. LeBron James\n 4. Kevin Durant\n");
                            a9 = scan.nextInt();
                        }
                    }
                }
                else
                {
                    System.out.println("Q9. Which NBA player won the MVP award in the 2019-2020 season? (Type '1', '2', '3', or '4' to choose an answer.)\n " +
                            "1. Giannis Antetokounmpo \n 2. James Harden\n 3. LeBron James\n 4. Kevin Durant\n");
                    a9 = scan.nextInt();
                }
            }
        }

        if (startQ == 10)
        {
            System.out.println("Q10. Which NBA player has won the most championships? \n " +
                    "1. Kareem Adbul-Jabbar \n 2. Michael Jordan\n 3. Kobe Bryant\n 4. Bill Russell\n");
            a10 = scan.nextInt();

            while (a10 != 0)
            {
                if ((a10 == 1) || (a10 == 2) || (a10 == 3) || (a10 == 4))
                {
                    if (a10 == 1)
                    {
                        System.out.println("Are you sure that you would like to choose 1. Kareem Abdul-Jabbar? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Bill Russell won 11 NBA championships which is the most ever by a single player.");
                            startQ = 11;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q10. Which NBA player has won the most championships? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Kareem Adbul-Jabbar \n 2. Michael Jordan\n 3. Kobe Bryant\n 4. Bill Russell \n");
                            a10 = scan.nextInt();
                        }
                    }

                    if (a10 == 2)
                    {
                        System.out.println("Are you sure that you would like to choose 2. Michael Jordan? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Bill Russell won 11 NBA championships which is the most ever by a single player.");
                            startQ = 11;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q10. Which NBA player has won the most championships? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Kareem Adbul-Jabbar \n 2. Michael Jordan\n 3. Kobe Bryant\n 4. Bill Russell\n");
                            a10 = scan.nextInt();
                        }
                    }

                    if (a10 == 3)
                    {
                        System.out.println("Are you sure that you would like to choose 3. Kobe Bryant? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Incorrect! Bill Russell won 11 NBA championships which is the most ever by a single player.");
                            startQ = 11;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q10. Which NBA player has won the most championships? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Kareem Adbul-Jabbar \n 2. Michael Jordan\n 3. Kobe Bryant\n 4. Bill Russell\n");
                            a10 = scan.nextInt();
                        }
                    }

                    if (a10 == 4)
                    {
                        System.out.println("Are you sure that you would like to choose 4. Bill Russell? (Type 1 for yes, 0 for no)");
                        check = scan.nextInt();
                        if (check == 1)
                        {
                            System.out.println("Correct! Bill Russell won 11 NBA championships which is the most ever by a single player.");
                            score += 1;
                            startQ = 11;
                            break;
                        }
                        if (check == 0)
                        {
                            System.out.println("Q10. Which NBA player has won the most championships? (Type '1', '2', '3', or '4'.)\n " +
                                    "1. Kareem Adbul-Jabbar \n 2. Michael Jordan\n 3. Kobe Bryant\n 4. Bill Russell\n");
                            a10 = scan.nextInt();
                        }
                    }
                }
                else
                {
                    System.out.println("Q10. Which NBA player has won the most championships? (Type '1', '2', '3', or '4' to choose an answer.)\n " +
                            "1. Kareem Adbul-Jabbar \n 2. Michael Jordan\n 3. Kobe Bryant\n 4. Bill Russell\n");
                    a10 = scan.nextInt();
                }
            }
        }

        if (startQ == 11)
        {
            System.out.println("You got a score of " + score + " / 10 \nThank you for playing my quiz!");                       // programs states score out of ten using the score variable that keeps track of correct answers
        }
    }
}