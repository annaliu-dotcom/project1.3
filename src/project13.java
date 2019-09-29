package project1.pkg3;

import java.util.Scanner;

/**
 *
 * @author aliu8350
 */
public class Project13 {

    public static void main(String[] args) {
        /*
        Text-based game inspired by Game of Life, but college edition. In which user has to go through the first decade post-college.
        */

        String Name = "Please enter your name:\n";
        Scanner Input = new Scanner(System.in);
        String NameHolder = "";
        System.out.print(Name);
        NameHolder=Input.nextLine();

        //set up variables

        //stats
        int col1 = 0;

        String Background = "Welcome to Project 1.3, " + NameHolder + "! In this game you will determine your future\n"
                + "by using past and present decisions to calculate where you will end up in ten years' time. For now\n"
                + "you are just a young, dumb and broke teenager who has almost finished high school. You have to earn your\n"
                + "place in life and avoid all the obstacles life will inevitably throw at you. Your goal is this: survive\n"
                + "until the end, and do not end up broke.\n";

        String Grade = "Please choose the overall GPA you have accumulated\n"
                + "throughout your time in high school.\n"
                + "1 for A+ (equal to or greater than 95)\n"
                + "2 for A (equal to or greater than 90)\n"
                + "3 for B (equal to or greater than 80)\n"
                + "4 for C (equal to or greater than 70)\n"
                + "5 for D (equal to or greater than 60)\n"
                + "6 for F (less than 60).\n";

        String SAT = "If you have taken the SAT, please select your score:\n"
                + "1 for > 1540\n"
                + "2 for > 1500, <1540\n"
                + "3 for > 1340, <1500\n"
                + "4 for > 1000, <1440\n"
                + "5 for < 1000\n"
                + "If you have not, press 6.\n";

        String ACT = "If you have taken the ACT, please select your score:\n"
                + "1 for > 34\n"
                + "2 for > 30, <34\n"
                + "3 for > 25, <30\n"
                + "4 for > 23, <25\n"
                + "5 for <= 23\n"
                + "If you have not, press 6.\n";

        String Error = "Error. You did not do  as the instructions asked. Redirecting....\n";

        String CollegesA = "I see you. You are an outstanding student that will most likely have a successful future\n"
                + "at Harvard, Cornell, Columbia, Princeton, Duke, Dartmouth, Brown, Yale, MIT, or Stanford :)\n"
                + "Which one of the elite schools listed above would you like to attend?\n"
                + "1) Harvard\n"
                + "2) Cornell\n"
                + "3) Columbia\n"
                + "4) Princeton\n"
                + "5) Duke\n"
                + "6) Darthmouth\n"
                + "7) Brown\n"
                + "8) Yale\n"
                + "9) MIT\n"
                + "10) Stanford\n"
                + "11) Tough critic, please show me my other options >:|\n";

        String CollegesB = "So you tried hard in high school. You will most likely have a fairly successful future at\n"
                + "Rice, Northwestern, UT Austin, Trinity, UCLA, UC Berkeley, Vanderbilt University, or  University of Michigan-Ann Arbor :)\n"
                + "Which one of the schools listed above would you like to attend?\n"
                + "1) Rice\n"
                + "2) Northwestern\n"
                + "3) Univeristy of Texas at Austin\n"
                + "4) Trinity\n"
                + "5) UCLA\n"
                + "6) UC Berkeley\n"
                + "7) Vanderbilt University\n"
                + "8) University of Michigan-Ann Arbor\n"
                + "9) Tough critic, please show me my other options. :/\n";

        String CollegesC = "Great! You will most likely have a somewhat successful future at\n"
                + "University of Texas at San Antonio, Texas Tech, University of Incarnate Word, St. Mary's University, Georgia Tech, or Texas State University :)\n"
                + "Which one of the schools listed above would you like to attend?\n"
                + "1) University of Texas at San Antonio\n"
                + "2) Texas Tech\n"
                + "3) University of Incarnate Word\n"
                + "4) St. Mary's University\n"
                + "5) Georgia Tech\n"
                + "6) Texas State University\n"
                + "7) Tough critic, please show me my other options. <:{\n";

        String CollegesD = "Congratulations. You might have a future at\n"
                + "San Antonio College, Our Lady Of the Lake University, , or Texas State University :)\n"
                + "Which one of the schools listed above would you like to attend?\n"
                + "1) San Antonio College\n"
                + "2) Texas Tech\n"
                + "3) University of Incarnate Word\n"
                + "4) St. Mary's University\n"
                + "5) If none of these colleges appeal to you, you're only option is to become a janitor. <:{\n";

        String Life = "Congratulations on your choice. Now that you have chosen\n"
                + "what college you want to attend, you have to choose what subject\n"
                + "you would like to major in. Your options are:\n"
                + "1)Math\n"
                + "2)Computer Science\n"
                + "3)English\n"
                + "4)Science\n"
                + "5)Classical Literature\n"
                + "6)History\n"
                + "7)Engineering\n"
                + "8)Language Other Than English\n";

        String LifeA = "Now that you have decided your major is math, you can graduate.\n"
                + "However, whether you graduate or not depends on your work ethic. Are you\n"
                + "1)A hard worker\n"
                + "2)Someone who procrastinates\n"
                + "3)A little bit of both\n";

        String LifeAA = "Because you are a hard worker, you have graduated with honors.\n"
                + "Now that what could possibly be the hardest part of your life is over, you can choose\n"
                + "what career you want to have. Is it\n"
                + "1)A mathematician\n"
                + "2)A math teacher\n"
                + "3)Accountant\n";

        String LifeAB = "Because you are someone who procrastinates, you have failed to graduate. Would you\n"
                + "1)Like to continue but pay 1/3 more of your total tuition\n"
                + "2)Fail and get a career (that may or may not be respectable)\n"
                + "3)Become homeless\n";

        String LifeAC = "Because you are someone who's personality is a combination\n"
                + "of a hard worker and a procrastinator, you have graduated, but without\n"
                + "honors. You can now become a\n"
                + "1)Math tutor\n"
                + "2)Math teacher's assistant\n"
                + "3)McDonald's employee\n";

        String LifeB = "Now that you have decided your major is Computer Science, you are\n"
                + "able to graduate. However, whether you graduate or not depends on your\n"
                + "work ethic. Are you\n"
                + "1)A hard worker\n"
                + "2)Someone who procrastinates\n"
                + "3)A little bit of both\n";

        String LifeBA = "Because you are a hard worker, you have graduated with honors. You can now\n"
                + "choose to become a\n"
                + "1)Google Software Engineer\n"
                + "2)Apple Data Scientist\n"
                + "3)Disney App Developer\n";

        String LifeBB = "Because you are someone who procrastinates, you have failed and cannot graduate. "
                + "Would you\n"
                + "1)Like to continue but pay 1 1/3 times your total tuition\n"
                + "2)Fail and get a career that could be respectable\n"
                + "3)Janitor who works at USAA\n";

        String LifeBC = "Because your personality is a combination of a hard worker\n"
                + "and a procrastinator, you have graduated without honors. You can\n"
                + "now choose to become a\n"
                + "1)USAA Software Engineer\n"
                + "2)Quora App Developer\n"
                + "3)Sporcle Web Developer\n";

        String LifeC = "Now that you have decided your major is English, you are\n"
                + "able to graduate. However, whether you graduate or not depends on your\n"
                + "work ethic. Are you\n"
                + "1)A hard worker\n"
                + "2)Someone who procrastinates\n"
                + "3)A little bit of both\n";

        String LifeCA = "CONGRATULATIONS! Graduating college with honors is a difficult feat\n"
                + "to accomplish. Now you can choose what career you want to have. You can either\n"
                + "be a/an\n"
                + "1)English professor\n"
                + "2)High school English teacher\n"
                + "3)Grammarly employee\n";

        String LifeCB = "Unfortunately, you have failed college. If you wish you may\n"
                + "1)Continue and pay 1 1/3 times your original tuition\n"
                + "2)Fail and hopefully earn a respectable career\n"
                + "3)Become homeless\n";

        String LifeCC = "Congratulations! You have graduated college, albeit without\n"
                + "honors. But lucky for you, the next step of your life is already\n"
                + "underway. Do you wish to\n"
                + "1)become an English tutor\n"
                + "2)become an English teacher's assistant\n"
                + "3)earn a Master's degree in another major\n";

        String LifeD = "Majoring in Science is an excellent choice. But whether or not\n"
                + "you graduate is up to your work ethic. Are you\n"
                + "1)a hard worker\n"
                + "2)a procrastinator\n"
                + "3)both, in different scenarios\n";

        String LifeDA = "Congratulations! You have graduated with honors. I don't know\n"
                + "about you, but I know about me. And what I know is that I would really\n"
                + "want a job. Do you want to be a\n"
                + "1)Biochemist\n"
                + "2)Botanist\n"
                + "3)Aeronautical Space Engineer\n";

        String LifeDB = "Unfortunately for you, you were not able to graduate. Would you like to\n"
                + "1)proceed but pay 1 1/3 times the original tuition\n"
                + "2)continue to fail and find a respecatable career (maybe)\n"
                + "3)Become a homeless person on the side of the road\n";

        String LifeDC = "Congratulations on making it through college. Unfortunately for you,\n"
                + "you did not graduate with honors. Your career options are\n"
                + "1)middle school science teacher\n"
                + "2)science tutor\n"
                + "3)Geologist\n";

        String LifeE = "You decided to major in Classical Literature. Good choice. In order\n"
                + "to cement your graduation, please select the work ethic you have:\n"
                + "1)strong work ethic\n"
                + "2)varying work ethic\n"
                + "3)weak work ethic\n";

        String LifeEA = "Congratulations! With the strong work ethic you possess, you have\n"
                + "graduated with honors. Not only are qualified for a career, the options you\n"
                + "have are top notch. Would you like to be a\n"
                + "1)Latin professor\n"
                + "2)Greek professor\n"
                + "3)High school Latin teacher\n";

        String LifeEB = ":( YIKES. With your poor work ethic, you have failed to graduate from\n"
                + "college. However, not all hope is lost.\n"
                + "1)Become a library janitor\n"
                + "2)Work at In-N-Out\n"
                + "3)Become a homeless person\n";

        String LifeEC = "OK, so you have a varying work ethic. This means that you do not suck all the time,\n"
                + "so you graduated. Not with honors, but now you own a diploma with your name on it.\n"
                + "But, there still remains the issue of getting a job. Because you majored in Classical Literature,\n"
                + "there are not that many jobs available for you to do. Probably regretting it now, huh?\n"
                + "Here are your options:\n"
                + "1)Librarian\n"
                + "2)Volunteer\n"
                + "3)Elementary school English teacher\n";

        String LifeF = "Alright, so now you've decided to major in History. Just sayin', there aren't that\n"
                + "many jobs where a major in History seems that appealing. But you can't back out now. Whether\n"
                + "you graduate with your major in History, however, is solely up to you and your work ethic.\n"
                + "1)strong work ethic\n"
                + "2)varying weak ethic\n"
                + "3)weak work ethic\n";

        String LifeFA = "Alright, alright, alright (in an auction announcer's voice). So you say that you're a hard\n"
                + "worker? Well, a hard worker deserves a worthy, prestrigious job. Which of these jobs would you most\n"
                + "like to have?\n"
                + "1)World-famous historian\n"
                + "2)Biographer\n"
                + "3)History professor\n";

        String LifeFB = "Oh no. You have a poor work ethic. Because of this, you cannot possibly hope to graduate. You do, however,\n"
                + "have a few options as to what you want to do next.\n"
                + "1)Fail and become a hobo\n"
                + "2)Continue and pay 1 1/3 times original tuition\n"
                + "3)Apply for a job as a Starbucks barista.\n";

        String LifeFC = "Welp. Your varying work ethic is just enough to help you graduate college. But you must improve in\n"
                + "order to maintain a job in life. Now that you've graduated college, you're free to make your first big decision.\n"
                + "Do you want to become a\n"
                + "1)Elementary school history teacher\n"
                + "2)History tutor\n"
                + "3)Author of educational children's books\n";

        String LifeG = "Engineering! Nice choice! The STEM field has always been challenging, and in order\n"
                + "to ensure that you can graduate, you must have a strong work ethic. What kind of work ethic\n"
                + "DO you have?\n"
                + "1)strong work ethic\n"
                + "2)varying work ethic\n"
                + "3)weak work ethic (I always procrastinate)\n";

        String LifeGA = "Nice! With your strong work ethic and choice to major in engineering, you\n"
                + "are an unstoppable force to be reckoned with. You've graduated with honors, and can now\n"
                + "move onto real life. There are a multitude of career options available for someone with a degree in Engineering.\n"
                + "Your options are:\n"
                + "1)electrical engineer\n"
                + "2)aerospace engineer\n"
                + "3)astronaut\n";

        String LifeGB = "Ok, so your work ethic varies. Well, that allows for a graduation ceremony I think.\n"
                + "No honors, but graduated! Now there's just one very important thing to do in the matter of\n"
                + "a year. Find a job! Which job would you most like to have?\n"
                + "1)SAWS employee\n"
                + "2)architect\n"
                + "3)electrical engineer\n";

        String LifeGC = "SMH. Your work ethic needs help. You were not able to graduate. Luck for you, your life\n"
                + "is not over yet. There are still a limited amount of options you have left.\n"
                + "1)Fail, and get kicked out of your parent's house\n"
                + "2)Become a beggar in the streets\n"
                + "3)Work at IKEA, everyday, helping customers with their items of decor.";

        String LifeH = "Congratulations on getting into college and choosing your major. Languages other than English\n"
                + "are a nice option. But whether you graduate with a degree is solely based on your work ethic. Do you\n"
                + "have a:\n"
                + "1)strong work ethic\n"
                + "2)varying work ethic\n"
                + "3)weak work ethic\n";

        String LifeHA = "Oh, snap! Did I hear that someone is a fresh graduate? Oh yeah, that someone is you. And with honors *inserts clapping noises*.\n"
                + "Impressive! Now that your success in college has become apparent, you need a job to match your talents and to support yourself.\n"
                + "Do you want to be a:\n"
                + "1)Language Professor\n"
                + "2)Dictionary author\n"
                + "3)Google translator\n";

        String LifeHB = "We can work with that. A varying work ethic is not a terrible thing. Because of your work ethic, you were able to graduate college without honors.\n"
                + "Not bad. But you can still improve. One step towards improvement is change, and you have to get a job now because you are a fully fledged adult, who has to\n"
                + "support yourself. Which job would you like to have?\n"
                + "1)Mobile translator\n"
                + "2)language specialist\n"
                + "3)Speech therapist\n";

        String LifeHC = "Oh, no! Did I hear that someone did not graduate? Oh yeah, that someone is you. *inserts sad background noises*.\n"
                + "But it's okay! Now that your failures in college have become apparent, you need to decide how you want to progress in life.\n"
                + "Do you want to:\n"
                + "1)fail and get a job at Walmart\n"
                + "2)continue butpay 1 1/3 times your original tuition\n"
                + "3)get kicked out and live as a beggar in the streets\n";

        String LifeAAA = "You are now a successful mathematician who is famous all over the world. In order to solidify your name, you have to"
                + "take a trip overseas to a mathematics convention. You can"
                + "1) refuse, and decline in popularity"
                + "2) accept, and travel in a ship to the convention"
                + "3) accept, and fly to the convention";

        String LifeAAB = "You are now a college math professor at Cambridge University, aka one of the most"
                + "prestigious universities in the entire world (especially in math). Did you know that Stephen"
                + "Hawking used to teach math at Cambridge? You are now successful, and have a lot of things to be"
                + "proud of. What you don't have is your own family. Do you wish to"
                + "1) stay single for life"
                + "2) stay single for now"
                + "3) meet someone and get married";

        String LifeAAC = "You are now an accountant who works a steady 9 to 5 everyday. You get a"
                + "steady salary and life is good. But unexpected things happen everyday. Unfortunately, you"
                + "lost your job because there was a sudden influx of accountants. What would you like to do next?"
                + "1) argue with your manager"
                + "2) find a new job"
                + "3) become a beggar";

        String LifeABA = "You are over $230,000 in debt. But luckily for you, you now have a degree"
                + "that will hopefuly earn you a job to pay all that money off. You can either be a"
                + "1) high school math teacher"
                + "2) middle school math teacher"
                + "3) elementary school math teacher";

        String LifeABB = "You are now working as a waiter/waitress at The Cheescake Factory. It's not ideal,"
                + "but there's not that many good jobs you can get anymore without a college degree."
                + "1)";

        String GoodLuck = "I hope you have a nice life.\n";

        //holder for choices
        int gradeHolder = 0;
        int SATHolder = 0;
        int ACTHolder = 0;
        int collegeHolder = 0;
        int lifeHolder = 0;


        //ASK GET SET
        System.out.print(Background);

        System.out.print(Grade);//ask
        gradeHolder = Input.nextInt();//get set
        System.out.print(SAT);//ask
        SATHolder = Input.nextInt();//get set
        System.out.print(ACT);//ask
        ACTHolder = Input.nextInt();//get sey

        int collegeDecision = gradeHolder + SATHolder + ACTHolder; //3-18

//LOGIC
        switch(collegeDecision)
        {
            case 3:
                System.out.println(CollegesA);
                break;
            case 4:
                System.out.println(CollegesA);
                break;
            case 5:
                System.out.println(CollegesA);
                break;
            case 6:
                System.out.println(CollegesB);
            case 7:
                System.out.println(CollegesB);
                break;
            case 8:
                System.out.println(CollegesB);
                break;
            case 9:
                System.out.println(CollegesB);
                break;
            case 10:
                System.out.println(CollegesC);
                break;
            case 11:
                System.out.println(CollegesC);
                break;
            case 12:
                System.out.println(CollegesC);
            case 13:
                System.out.println(CollegesC);
                break;
            case 14:
                System.out.println(CollegesD);
                break;
            case 15:
                System.out.println(CollegesD);
                break;
            case 16:
                System.out.println(CollegesD);
                break;
            case 17:
                System.out.println(CollegesD);
                break;
            case 18:
                System.out.println(CollegesD);
            default:
                System.out.println(CollegesD);

        }
        /*collegeDecision
            <5: collegesA
            5-9: collegesB
            10-: collegesC

        */

        //Store college decision
        collegeHolder = Input.nextInt();
        System.out.println(Life);
        lifeHolder = Input.nextInt();
        switch(lifeHolder) {
            case 1:
                System.out.println(LifeA);
                break;
            case 2:
                System.out.println(LifeB);
                break;
            case 3:
                System.out.println(LifeC);
                break;
            case 4:
                System.out.println(LifeD);
                break;
            case 5:
                System.out.println(LifeE);
                break;
            case 6:
                System.out.println(LifeF);
                break;
            case 7:
                System.out.println(LifeG);
                break;
            case 8:
                System.out.println(LifeH);
                break;
        }



    }

}
