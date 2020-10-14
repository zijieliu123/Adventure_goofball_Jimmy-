
// Jimmy Liu's adventure project
// I got help from StackOverflow :)

// Importing scanner 
import java.util.Scanner;

public class Adventure {
	// Using scanner as an instance variable, it is needed in everything.
	private Scanner input = new Scanner(System.in);
	// and introduction and to get the user's name.
	public void intro() {
		
		System.out.println("Welcome to Goofball, I am Ben. What's your name?");
		
		String answer = input.next();
		
		System.out.println("\nhi " + answer + " Not that your name matters but it's company policy. \n");
		
		first_choice();
	}
	// First choice that the player makes, ask an question and get and answer.
	public void first_choice() {
		
		System.out.println("Now we proceed to the goofball challenge, which one would you attempt first?");
		
		System.out.println("\na.weird pranks, \nb.get out of this weird place. ");
		
		String answer = input.next();
		
		// if input is "a" move to goof decision step.
		if (answer.equals("a"))
			goof_decision();
		
		// if answer is "b" move to getout step.
		else if (answer.equals("b"))
			getout_decision();
		
		// if they are dumb, give an error.
		else
			input_error();
			
		
		
	}
	// goof decision step, 
	public void goof_decision() {
		
		System.out.println("\nNow you have to prank the CEO. Dont question why it is COMPANY POLICY.");
		
		System.out.println("\na. slap him \nb. hide his lunch and dinner(both are sandwiches)");
		
		String answer = input.next();
		
		// if answer is 'a' move on to fired step.
		if (answer.equals("a"))
			youare_fired();
		
		// if answer is 'b' move on to navigate maze step.
		else if (answer.equals("b"))
			navigate_maze();
		
		// if they are dumb, give an error.
		else
			input_error();
			
		
	}
	// navigate maze step
	public void navigate_maze() {
		System.out.println("\nCongradulations, you passed the first test! Now you will have to naviagte a maze that is designed to test your limits.");
		
		System.out.println("The maze is dark, make your choice wisely.");
		
		System.out.println("\na. go in without carrying anyhting \nb. search your surroundings before you go in(you see a torch and a knife)");
		
		String answer = input.next();
		
		// if input 'a' move on to slipped death step.
		if (answer.equals("a"))
			oops_slipped();
		
		// if input 'b' move on to boss step.
		else if (answer.equals("b"))
			meet_boss();
		
		// if they are dumb, give an error.
		else
			input_error();
		
		
	}
	// meet boss step
	public void meet_boss() {
		
		System.out.println("\nYou hear footsteps in front of you, you pointed your torch forward and you see a dragon!");
		
		System.out.println("The dragon(water breathing), comes closer to you every second, what do you do? ");
		
		System.out.println("\na. kill the dragon with your knife!!! \nb. run away \nc. cut a rope that you see leads up to a huge weight");
		
		String answer = input.next();
		
		// if input 'a' move on to swallowed step.
		if (answer.equals("a"))
			swallowed_alive();
		
		// if input 'b' move on to coward step.
		else if (answer.equals("b"))
			coward_exe();
		
		// if input 'c' move on to third challenge step
		else if (answer.equals("c"))
			third_challenge();
		
		// if they are dumb, give an error.
		else 
			input_error();
			
	}
	// Third challenge step
	public void third_challenge() {
		
		System.out.println("\nAs you can see, the challenges are becoming harder and harder.");
		
		System.out.println("Congradulations on the last challenge, however the thrid challenge is, to send yourself into space wearing pajamas and land on moon");
		
		System.out.println("As to the rest don't ask me it is company policy :), have fun figuring out how to come back!");
		
		System.out.println("\nTimer is ticking, a cage appeared and trapped you. What do you do?");
		
		System.out.println("\na. punch cage and yell \nb. do nothing \nc. change into pajamas ");
		
		String answer = input.next();
		
		// if input 'a' move on to plasma death step.
		if (answer.equals("a"))
			plasma_death();
		
		// if input 'b' move on to thrown out step.
		else if (answer.equals("b"))
			thrownoutof_rocket();
		
		// if input 'c' move on to launch step.
		else if (answer.equals("c"))
			launch_phase();	
		
		// if they are dumb, give an error.
		else
			input_error();
		
	}
	// launch step
	public void launch_phase() {
		
		System.out.println("\nYou are being launched into space as you put on your pajamas");
		
		System.out.println("You see out of the window that you finally was able to leave the GOOFball factory");
		
		System.out.println("You are relieved, but also afraid of what is to come");
		
		System.out.println("Bang, an astroid clashed with your spacecraft, you panicked as the radio plays: astroid zone, watch out!");
		
		System.out.println("What do you do? \na. manually maneuver spacecraft \nb. continue to sit on automated driving \nc. click BaCkToEaRtH.EXE because you can't take it anymore");
		
		String answer = input.next();
		
		// if input 'a' move on to arrive on moon step.
		if (answer.equals("a"))
			arriveon_moon();
		
		// if input 'b' move on to crash landing step.
		else if (answer.equals("b"))
			crash_landing();
		
		// if input 'c' move on to explode step.
		else if (answer.equals("c"))
			spaceship_explode();
		
		// if they are dumb, give an error.
		else
			input_error();
		
	}
	// arrive on moon step
	public void arriveon_moon() {
		
		System.out.println("\nYou passed the astroid field! You can see the moon just infront of you as your spaceship goes closer");
		
		System.out.println("Now you have two choices: \na. pilot back to Earth without landing on the moon \nb. land on the moon \n what do you do?");
		
		String answer = input.next();
		
		// if input 'a' move on to goofball death step.
		if (answer.equals("a"))
			Goofball_death();
		
		// if input 'b' move on too moon boss step.
		else if (answer.equals("b"))
			moon_boss();
		
		// if they are dumb, give an error.
		else
			input_error();	
		
		
	}
	// moon boss step
	public void moon_boss() {
		
		System.out.println("\nWow, you finally landed on moon!");
		
		System.out.println("Strangely, your pajamas protected you from the hotile environment");
		
		System.out.println("You landed near some sort of ancient burial mound, suddenly the ground cracked and a lunar serpent appeared. What do you do?");
		
		System.out.println("\na. knife it, \nb. run");
		
		String answer = input.next();
		
		// if input 'a' move on to swallowed death step.
		if (answer.equals("a"))
			swallowed_death();
		
		// if input 'b' move on to back to earth step.
		else if (answer.equals("b"))
			backto_earth();
		
		// if they are dumb, give an error.
		else
			input_error();
		
		
		
	}
	// back to earth step
	public void backto_earth() {
		
		System.out.println("\nthe serpent chased you until you saw some sort of portal on the ground, you picked up a strange weapon on the way to deal with the serpent, you blew its head off.");
		
		System.out.println("you stepped into the portal and was teleported back to Earth");
		
		System.out.println("However, the goofball has taken over everything, you must stop him!!!");
		
		System.out.println("\na.do nothing \nb.go back to the goofball factory");
		
		String answer = input.next();
		
		// if input 'a' move on to clown death step
		if (answer.equals("a"))
			clown_death();
		
		// if input 'b' move on to grand finale step.
		else if (answer.equals("b"))
			grand_finale();
		
		// if they are dumb, give an error.
		else
			input_error();
			
	}
	// grand finale step
	public void grand_finale() {
		
		System.out.println("\nYou arrived at the factory, now it is ruled by the goofball tyrant.");
		
		System.out.println("You wentinside and demolished the goofball tyrant and freed everyone from slavery");
		
		System.out.println("You realized that the weapon you picked up is insanely powerful, what do you do now?");
		
		System.out.println("\na. sell the weapon \nb. rule the world \nc. go back to your life ");
		
		String answer = input.next();
		
		// if input 'a' move on to FBI arrest step.
		if (answer.equals("a"))
			FBI_arrest();
		
		// if input 'b' move on to overthrown death step.
		else if (answer.equals("b"))
			overthrown_death();
		
		// if input 'c' move on to happy ending step.
		else if (answer.equals("c"))
			happy_ending();
		
		// if they are dumb, give an error.
		else
			input_error();
		
	}
	
	
	
	// a possible end of game step
	public void getout_decision() {
		
		System.out.println("The goofball burned you to ashes when you tried to run out.");
		
	}
	
	// a possible end of game step
	public void youare_fired() {
		
		System.out.println("YOU ARE FIRED, literally, the goofball tyrant burned you to ashes");
	}
	
	// a possible end of game step
	public void oops_slipped() {
		
		System.out.println("Because you did not bring a flashlight, you fell down a crack in the floor and got impaled by spikes. RIP");
		
	}
	
	// a possible end of game step
	public void swallowed_alive() {
		
		System.out.println("yuk, skull, stomach acid, darkness, now you are part of the collection inside the dragon's belly.");
		
	}
	
	// a possible end of game step
	public void coward_exe() {
		
		System.out.println("goofball installed virus on you, when you run away you were killed by coward.exe, lol");
			
	}
	
	// a possible end of game step
	public void plasma_death() {
		
		System.out.println("The cage burned you to ashes, not a great idea.");
		
	}
	
	// a possible end of game step
	public void thrownoutof_rocket() {
		
		System.out.println("in the middle of the ascent you were thrown out of rocket, should have wore that pajamas :)");
		
	}
	
	// a possible end of game step
	public void crash_landing() {
		
		System.out.println("OOOOOOF your spacehsip landed, but not on the moon, now you are trapped for life on a small metoeor.");
		
	}
	
	// a possible end of game step
	public void spaceship_explode() {
		
		System.out.println("Sit and do nothing? BOOOOM!");
		
	}
	
	// a possible end of game step
	public void Goofball_death() {
		
		System.out.println("You piloted manually back home, you left your rocket in the backyard and went back to your life, until you heard knocks on your door.");
		System.out.println("\nYou opened the door... GOOFBALL. You were never seen again. ");
		
		
	}
	
	// a possible end of game step
	public void swallowed_death() {
		
		System.out.println("you were melted in the serpent's stomach acid. RIP");
		
	}
	
	// a possible end of game step
	public void clown_death() {
		
		System.out.println("You were turned into a clown by goofball, you worked to your death");
	
	}
	
	// a possible end of game step
	public void FBI_arrest() {
		
		System.out.println("Your weapon was solf for 10 trillion, you are rich for life!");
		System.out.println("\nThat is unti.... FBI OPEN UP!");
	
	}
	
	// a possible end of game step
	public void overthrown_death() {
		
		System.out.println("You became a tyrant after you killed goofball, but were overthrown. LOL ");
	}
	
	// a possible end of game step
	public void happy_ending() {
		
		System.out.println("NEVER BE GREEDY! You went back to your old life, became a trillionaire and lived happily ever after");
		System.out.println("THE END");
	}
	// dumb people control
	public void input_error() {
		System.out.println("not a valid input");
	}
	
	// main method to get the game started
	public static void main(String[] args) {
		
		Adventure tester = new Adventure();
		// only need intro running, rest is linked.
		tester.intro();
		
	}
}
