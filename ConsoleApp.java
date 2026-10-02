import java.util.Scanner;

public class ConsoleApp {

    static Scanner sc = new Scanner(System.in);

    // --------------------------------------------------
    // BASIC FUNCTIONS
    // --------------------------------------------------

    static void pause() {
        System.out.println();
        System.out.print("Press ENTER to continue...");
        sc.nextLine();
    }

    static void line() {
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();
    }

    static void type(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);

            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
    }

    static void slow(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);

            try {
                Thread.sleep(35);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
    }

    static String ask() {
        return sc.nextLine().trim();
    }

    static void chapter(String number, String title) {

        line();

        System.out.println("                    CHAPTER " + number);
        System.out.println("                    " + title);

        line();
    }

    // --------------------------------------------------
    // MAIN
    // --------------------------------------------------

    public static void main(String[] args) {

        intro();

        firstGlance();
        howItStarted();
        theQuestion();
        theYes();
        difficultPhase();
        findingEachOtherAgain();
        sevenYearsLater();
        sevenThings();
        futureDream();
        memoryQuiz();
        secretLock();
        finalLetter();
        ending();

        sc.close();
    }

    // --------------------------------------------------
    // INTRO
    // --------------------------------------------------

    static void intro() {

        System.out.println();
        System.out.println("============================================================");
        System.out.println();
        System.out.println("                    C O N S O L E . A P P");
        System.out.println();
        System.out.println("                 A STORY OF TWO PEOPLE");
        System.out.println();
        System.out.println("                    HARSHIT + PRACHI");
        System.out.println();
        System.out.println("============================================================");

        System.out.println();
        System.out.println("                    03.10.2019");
        System.out.println("                         |");
        System.out.println("                    03.10.2026");
        System.out.println("                         |");
        System.out.println("                         INF");
        System.out.println();

        type("Loading memories...");
        System.out.println();

        for (int i = 0; i <= 20; i++) {

            System.out.print("\r[");

            for (int j = 0; j < 20; j++) {

                if (j < i) {
                    System.out.print("#");
                } else {
                    System.out.print("-");
                }
            }

            System.out.print("] " + (i * 5) + "%");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\n");

        type("MEMORIES FOUND : 7 YEARS");
        type("PEOPLE         : HARSHIT + PRACHI");
        type("STATUS         : STILL TOGETHER");
        type("ARCHIVE        : READY");

        System.out.println();

        slow("This isn't just a program.");
        slow("It is a little collection of memories.");
        slow("A story that started on 03 October 2019.");

        pause();
    }

    // --------------------------------------------------
    // CHAPTER 1
    // --------------------------------------------------

    static void firstGlance() {

        chapter("01", "THE FIRST GLANCE");

        type("It was around the end of May, 2019.");

        type("Harshit came to Prachi's school for admission.");

        type("The school belonged to her grandfather...");
        type("and their home was on the floor above the school.");

        pause();

        type("Prachi was upstairs, drying clothes.");

        type("And then she saw him entering the school gate.");

        System.out.println();

        slow("That was the first time Prachi saw Harshit.");

        System.out.println();

        type("He saw her too.");

        pause();

        type("Neither of them knew...");
        type("that this ordinary moment would become");
        type("the beginning of something so important.");

        pause();
    }

    // --------------------------------------------------
    // CHAPTER 2
    // --------------------------------------------------

    static void howItStarted() {

        chapter("02", "THE SECRET BEGINNING");

        type("They secretly liked each other.");

        type("But neither of them had actually said it.");

        pause();

        type("One day, one of Harshit's friends asked Prachi...");

        System.out.println();
        System.out.println("\"Why don't you say YES?\"");
        System.out.println();

        type("Prachi was confused.");

        type("So she replied...");

        System.out.println();

        slow("\"But he never asked me.\"");

        slow("\"What am I supposed to say YES to?\"");

        System.out.println();

        type("And then came the day...");

        slow("03 OCTOBER 2019.");

        pause();
    }

    // --------------------------------------------------
    // CHAPTER 3
    // --------------------------------------------------

    static void theQuestion() {

        chapter("03", "THE QUESTION");

        type("It was Navratri.");

        type("It was Yellow Day.");

        System.out.println();

        type("Prachi was wearing yellow.");

        type("Harshit was wearing a red shirt.");

        pause();

        type("Prachi was standing upstairs near the balcony/stairs.");

        type("Harshit was downstairs.");

        System.out.println();

        slow("And then he asked...");

        System.out.println();

        System.out.println("              \"Do you like me?\"");

        System.out.println();

        System.out.println("What happened next?");

        System.out.println();

        System.out.println("[1] Prachi immediately said YES");
        System.out.println("[2] Prachi ran away");
        System.out.println("[3] Prachi thought he might be joking");
        System.out.println("[4] Prachi pretended nothing happened");

        System.out.print("\nYour answer: ");

        String answer = ask();

        if (answer.equals("3")) {

            System.out.println();

            type("CORRECT.");

            type("Prachi thought he might be joking.");

            type("She was nervous and didn't answer immediately.");

        } else {

            System.out.println();

            type("Nice try.");

            type("But the actual answer is...");
            type("She thought Harshit might be joking.");

        }

        pause();

        type("Then Harshit said...");

        System.out.println();

        slow("\"Kal tak soch ke batao.\"");

        pause();
    }

    // --------------------------------------------------
    // CHAPTER 4
    // --------------------------------------------------

    static void theYes() {

        chapter("04", "THE YES");

        type("04 October 2019.");

        type("They met again at school.");

        pause();

        type("Harshit took Prachi's hand.");

        type("And asked her again.");

        System.out.println();

        slow("This time, there was no escaping the question.");

        System.out.println();

        type("Prachi joked that there wasn't even enough space to run.");

        pause();

        type("And finally...");

        slow("she said YES.");

        System.out.println();

        System.out.println("                    YES");

        System.out.println();

        pause();

        type("And that was also when Harshit hugged her");
        type("for the first time.");

        System.out.println();

        slow("A moment that Prachi will never forget.");

        pause();
    }

    // --------------------------------------------------
    // CHAPTER 5
    // --------------------------------------------------

    static void difficultPhase() {

        chapter("05", "THE HARD PART");

        type("But their story wasn't always easy.");

        pause();

        type("Many times, Prachi's parents caught her chatting with Harshit.");

        type("And then they couldn't talk for a long time.");

        System.out.println();

        type("They both worried about each other.");

        type("They both missed each other.");

        type("But sometimes they couldn't even know");
        type("how the other person was doing.");

        pause();

        type("Then came COVID lockdown.");

        pause();

        slow("Around one and a half years...");

        slow("Almost no contact.");

        slow("No meeting.");

        slow("So many unanswered thoughts.");

        System.out.println();

        type("But somehow...");
        type("the story wasn't finished.");

        pause();
    }

    // --------------------------------------------------
    // CHAPTER 6
    // --------------------------------------------------

    static void findingEachOtherAgain() {

        chapter("06", "FINDING EACH OTHER AGAIN");

        type("After lockdown opened...");

        type("Prachi got Harshit's number from a friend.");

        pause();

        type("And they started talking again.");

        System.out.println();

        slow("After so much silence...");

        slow("they found their way back to each other.");

        pause();

        type("And the story continued.");

        type("Not because everything was easy...");

        type("but because they still cared.");

        pause();
    }

    // --------------------------------------------------
    // CHAPTER 7
    // --------------------------------------------------

    static void sevenYearsLater() {

        chapter("07", "SEVEN YEARS LATER");

        type("03 October 2019");

        System.out.println("          |");

        type("03 October 2026");

        System.out.println();

        slow("SEVEN YEARS.");

        pause();

        type("Seven years of love.");

        type("Seven years of fights.");

        type("Seven years of missing each other.");

        type("Seven years of finding each other again.");

        type("Seven years of growing together.");

        System.out.println();

        slow("Seven years ago, Prachi loved Harshit.");

        System.out.println();

        slow("Today, she doesn't just love him...");

        slow("she feels that her life is incomplete without him.");

        pause();
    }

    // --------------------------------------------------
    // CHAPTER 8
    // --------------------------------------------------

    static void sevenThings() {

        chapter("08", "SEVEN THINGS PRACHI LOVES");

        String[] reasons = {

            "1. Harshit's smile.",

            "2. The way he always encourages Prachi.",

            "3. The way he motivates her when she feels low.",

            "4. The way he always stands by her.",

            "5. His kindness.",

            "6. The way he notices even the smallest things about her.",

            "7. And yes... his lips. They are just WOW."
        };

        for (String reason : reasons) {

            type(reason);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        pause();

        type("There is something else Prachi loves about Harshit.");

        System.out.println();

        type("Sometimes he can be strict.");

        type("Sometimes he can be soft.");

        type("Sometimes he gives advice like a father would.");

        type("And even when Prachi doesn't listen...");
        type("he still tries to guide her.");

        pause();
    }

    // --------------------------------------------------
    // CHAPTER 9
    // --------------------------------------------------

    static void futureDream() {

        chapter("09", "THE FUTURE");

        type("There is a dream for the future.");

        pause();

        System.out.println();

        System.out.println("                    THE FUTURE");
        System.out.println();

        System.out.println("                  HARSHIT + PRACHI");
        System.out.println();
        System.out.println("                         |");
        System.out.println("                 +-------+-------+");
        System.out.println("                 |               |");
        System.out.println("               CHILD 1        CHILD 2");
        System.out.println();
        System.out.println("              HARSHIT'S PARENTS");
        System.out.println("                       +");
        System.out.println("               PRACHI'S PARENTS");

        System.out.println();

        pause();

        type("A beautiful family.");

        type("A beautiful home.");

        type("A peaceful life.");

        type("Everyone together.");

        System.out.println();

        slow("That is the dream.");

        pause();

        type("Prachi has a feeling that the hurdles");
        type("from the past and the hurdles in the future");

        type("will never be stronger than everything");
        type("they have already been through together.");

        System.out.println();

        slow("Some stories survive because people keep choosing them.");

        pause();
    }

    // --------------------------------------------------
    // CHAPTER 10 - QUIZ
    // --------------------------------------------------

    static void memoryQuiz() {

        chapter("10", "HOW WELL DO YOU KNOW THIS STORY?");

        int score = 0;

        // Question 1

        System.out.println("QUESTION 1");
        System.out.println();

        System.out.println("When did the relationship officially begin?");

        System.out.println("[1] 03 October 2019");
        System.out.println("[2] 04 October 2019");
        System.out.println("[3] End of May 2019");

        System.out.print("\nAnswer: ");

        if (ask().equals("1")) {

            score++;

            System.out.println("Correct.");

        } else {

            System.out.println("Not quite.");
        }

        System.out.println();

        // Question 2

        System.out.println("QUESTION 2");
        System.out.println();

        System.out.println("What did Harshit ask Prachi?");

        System.out.println("[1] Will you marry me?");
        System.out.println("[2] Do you like me?");
        System.out.println("[3] Are you free tomorrow?");

        System.out.print("\nAnswer: ");

        if (ask().equals("2")) {

            score++;

            System.out.println("Correct.");

        } else {

            System.out.println("Nope. Think back to Chapter 3.");
        }

        System.out.println();

        // Question 3

        System.out.println("QUESTION 3");
        System.out.println();

        System.out.println("What was Harshit wearing on 03 October 2019?");

        System.out.println("[1] Black shirt");
        System.out.println("[2] Blue shirt");
        System.out.println("[3] Red shirt");

        System.out.print("\nAnswer: ");

        if (ask().equals("3")) {

            score++;

            System.out.println("Correct.");

        } else {

            System.out.println("Wrong.");
        }

        System.out.println();

        // Question 4

        System.out.println("QUESTION 4");
        System.out.println();

        System.out.println("What happened on 04 October 2019?");

        System.out.println("[1] Their first hug");
        System.out.println("[2] They went on a trip");
        System.out.println("[3] They first met");

        System.out.print("\nAnswer: ");

        if (ask().equals("1")) {

            score++;

            System.out.println("Correct.");

        } else {

            System.out.println("Nope. Their first hug was on this day.");
        }

        System.out.println();

        // Question 5

        System.out.println("QUESTION 5");
        System.out.println();

        System.out.println("What is the secret code?");

        System.out.println("[1] 786");
        System.out.println("[2] 816");
        System.out.println("[3] 143");

        System.out.print("\nAnswer: ");

        if (ask().equals("2")) {

            score++;

            System.out.println("Correct.");

        } else {

            System.out.println("Access denied.");
        }

        System.out.println();

        System.out.println("============================================================");
        System.out.println("                    SCORE : " + score + "/5");
        System.out.println("============================================================");

        System.out.println();

        if (score == 5) {

            type("PERFECT.");

        } else if (score >= 3) {

            type("Pretty good.");

        } else {

            type("Looks like the story needs one more reading.");
        }

        pause();
    }

    // --------------------------------------------------
    // SECRET CODE
    // --------------------------------------------------

    static void secretLock() {

        chapter("11", "THE SECRET CODE");

        System.out.println();

        System.out.println("                 FINAL ACCESS");
        System.out.println();

        type("There is one final secret.");

        System.out.println();

        type("The code is made from their initials.");

        System.out.println();

        System.out.println("                    8  = H");
        System.out.println("                   16  = P");

        System.out.println();

        type("H = Harshit");
        type("P = Prachi");

        System.out.println();

        slow("Therefore...");

        System.out.println();

        System.out.println("                    816");

        System.out.println();

        type("Enter the secret code to unlock the final message.");

        System.out.println();

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("CODE : ");

            String code = ask();

            if (code.equals("816")) {

                System.out.println();

                System.out.println("                 ACCESS GRANTED");

                System.out.println();

                slow("HARSHIT + PRACHI");

                slow("8 + 16 = 816");

                pause();

                return;

            } else {

                attempts--;

                if (attempts > 0) {

                    System.out.println();

                    type("Incorrect code.");

                    System.out.println("Attempts remaining: " + attempts);

                    System.out.println();

                }
            }
        }

        System.out.println();

        type("The code was 816.");

        type("Because some numbers mean much more");
        type("when two people give them a meaning.");

        pause();
    }

    // --------------------------------------------------
    // FINAL LETTER
    // --------------------------------------------------

    static void finalLetter() {

        chapter("12", "A MESSAGE FROM PRACHI");

        System.out.println();

        slow("Dear Harshit,");

        System.out.println();

        type("Seven years ago, Prachi only knew that she loved you.");

        type("Today, she knows that you have become");
        type("a very important part of her life.");

        System.out.println();

        type("We've seen so many ups and downs.");

        type("We've had times when we couldn't even talk.");

        type("We had distance.");

        type("We had silence.");

        type("We had moments where we didn't know");
        type("what would happen next.");

        pause();

        type("But somehow...");
        type("we always found our way back.");

        System.out.println();

        slow("And that means something.");

        pause();

        type("When I look at everything we've already survived,");

        type("I feel that the hurdles ahead won't matter.");

        type("I believe we'll make it through them too.");

        pause();

        type("One day, I want to look back at these seven years");

        type("from inside the beautiful life we once dreamed about.");

        System.out.println();

        type("You and me.");

        type("Our two children.");

        type("Your parents.");

        type("My parents.");

        type("Our home.");

        type("Our life.");

        pause();

        type("Thank you for encouraging me.");

        type("Thank you for motivating me.");

        type("Thank you for standing beside me.");

        type("Thank you for noticing the smallest things.");

        System.out.println();

        slow("And thank you for being there.");

        pause();

        System.out.println();

        System.out.println("============================================================");

        slow("                 HAPPY 7 YEARS, HARSHIT.");

        System.out.println("============================================================");

        System.out.println();

        slow("I love you.");

        slow("I need you.");

        slow("And I want you in my future.");

        System.out.println();

        slow("Always.");

        pause();
    }

    // --------------------------------------------------
    // ENDING
    // --------------------------------------------------

    static void ending() {

        System.out.println();

        System.out.println("============================================================");
        System.out.println();
        System.out.println("                    HARSHIT + PRACHI");
        System.out.println();
        System.out.println("                    03.10.2019");
        System.out.println("                         |");
        System.out.println("                    03.10.2026");
        System.out.println("                         |");
        System.out.println("                         INF");
        System.out.println();
        System.out.println("============================================================");

        System.out.println();

        type("MEMORY SAVED.");
        type("SEVEN YEARS COMPLETED.");
        type("STORY STATUS: CONTINUING...");

        System.out.println();

        slow("Happy 7 Years.");
        slow("Harshit + Prachi.");
        slow("816.");

        System.out.println();
        System.out.println("                    <3");
    }
}
